/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 *  net.minecraft.class_304
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import z.r.ak;
import z.r.gj;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class gm {
    private boolean a;
    private boolean b;
    private int a;
    private static final double a;
    private static final double b;
    private static final double c;
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private boolean c;
    private final ak a;
    private boolean d;
    private boolean e;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private boolean f;
    private class_243 a;
    private boolean g;
    private boolean h;
    private static final int b;
    private int c;
    private class_2338 a;
    private static final int[] a;
    public static final int g;
    private boolean i;
    private int d;
    private boolean j;
    private static final /* synthetic */ String e;
    private static final int e;
    private boolean k;
    private static final double d;
    private static final int f;
    private boolean l;

    /*
     * Enabled aggressive block sorting
     */
    public gm(ak ak2) {
        int n2 = -232158625;
        int n3 = g & 0xF2298A5F ^ 0x9E9DAB5D;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x479D1911;
        n5 ^= 0xC8B94470;
        n4 = (n3 | n2) ^ 0x49B3185D;
        block6: while (true) {
            switch (n4) {
                default: {
                    continue block6;
                }
                case 1738230863: {
                    this.a = ak2;
                    n4 = (n3 | n2) ^ 0xEE7C7924;
                    continue block6;
                }
                case -1516536122: {
                    return;
                }
                case -1223773438: {
                    n5 ^= n4 ^ 0xA3F5498B;
                    n4 = (n3 | n2) ^ 0x9926E710;
                    continue block6;
                }
                case 281137787: 
            }
            n5 ^= n4 ^ 0x22BF0B33;
            n4 = (n3 | n2) ^ 0x5B26D599;
        }
    }

    /*
     * Exception decompiling
     */
    public Boolean rewriteKey(class_304 var1_1, boolean var2_2) {
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

    private static int QQ(int n2, int n3) {
        int n4 = -2024016349;
        int n5 = -2046546918;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x1AE185F8)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0x875F812F;
        n6 += (n5 | n4) ^ 0x875FD9C8;
        n6 += (n5 | n4) ^ 0x875F9BBE;
        n6 ^= (n5 | n4) ^ 0x875FB130;
        n6 += (n5 | n4) ^ 0x875F412E;
        n6 -= (n5 | n4) ^ 0x875F0483;
        n6 += (n5 | n4) ^ 0x875F6FD3;
        return n6 -= (n5 | n4) ^ 0x875FA6E6;
    }

    /*
     * Unable to fully structure code
     */
    public boolean owningKeys() {
        var1_1 = gm.g & 1485369694 ^ -1844968739;
        var3_2 = 0;
        if (true) ** GOTO lbl19
        block5: while (true) {
            var3_2 = (var1_1 | 1485369694) ^ -245661338;
lbl6:
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
                    case -1265521829: {
                        break block5;
                    }
                    case 827715305: {
                        var2_3 ^= var3_2 ^ -212817205;
                        continue block5;
                    }
lbl16:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | 1485369694) ^ 1847154820;
                        ** continue;
                        break;
                    }
lbl19:
                    // 1 sources

                    var2_3 = (var1_1 | 1485369694) ^ 253179983;
                    ** continue;
                    case 735277753: {
                        return this.k;
                    }
                }
                break;
            }
            break;
        }
        var3_2 = (var1_1 | 1485369694) ^ -337830602;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public void take() {
        block14: {
            block13: {
                block12: {
                    var4_1 = -1238172416;
                    var1_2 = gm.g & -1238172416 ^ -565317682;
                    var3_3 = 0;
                    ** GOTO lbl32
lbl5:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -2125207594;
                        break block12;
                        break;
                    }
lbl8:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 2103382669;
                        break block13;
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ -1250998385;
            }
lbl14:
            // 3 sources

            block9: while (true) {
                switch (var3_3) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block9;
                        }
                        break;
                    }
                    case 1116036042: {
                        ** continue;
                    }
lbl21:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1124424700;
                        ** continue;
                        break;
                    }
                    case -265288090: {
                        ** continue;
                    }
                    case 1259386945: {
                        this.k = true;
                        break block9;
                    }
                    case -469286370: {
                        var2_4 ^= var3_3 ^ -901615880;
                        ** continue;
                    }
lbl32:
                    // 1 sources

                    var2_4 = (var1_2 | var4_1) ^ -2001236668;
                    break block14;
                    case -2094994109: {
                        return;
                    }
                }
                break;
            }
            var3_3 = (var1_2 | var4_1) ^ 444120528;
            ** GOTO lbl14
        }
        var3_3 = (var1_2 | var4_1) ^ 240122280;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block11: {
            break block11;
lbl1:
            // 1 sources

            while (true) {
                var0_2 ^= 1031957906;
                var0_2 ^= -694416288;
                var0_2 ^= -2141221090;
                var0_2 ^= 421226003;
                var0_2 ^= -940389063;
                var0_2 ^= -749964967;
                v0 = ((var0_2 ^= 360886346) | var2) ^ -1990647121 ^ gm.g;
                var0_2 ^= 1134349599;
                gm.a[v1] = ((v2[v3] & 255) << 24 | ((v2[v3 + 1] & 255) << 16 | ((v2[v3 + 2] & 255) << 8 | v2[v3 + 3] & 255))) ^ v0;
                v1 = v1 + 1;
                v4 = v3 + 4;
                v2 = v2;
                v3 = v4;
                var0_2 ^= 821709258;
                if (v4 < v2.length) continue;
                gm.f = gm.QQ(((var0_2 ^= 1854701793) | var2) ^ 1799722074, var2 ^ ((var0_2 | var2) ^ 1840694267));
                gm.d = 0.22;
                gm.e = gm.QQ((var0_2 | var2) ^ 1799722069, var2 ^ ((var0_2 | var2) ^ -1128997582));
                gm.b = gm.QQ((var0_2 | var2) ^ 1799722068, var2 ^ ((var0_2 | var2) ^ -927761407));
                gm.c = 0.2;
                gm.b = 0.45;
                gm.a = 0.12;
                gm.a = gj.decode("RXr64s7RNKs=", gm.QQ((var0_2 | var2) ^ 1799722071, var2 ^ ((var0_2 | var2) ^ 690774379)));
                gm.d = gj.decode("PURKPHdk9g==", gm.QQ((var0_2 | var2) ^ 1799722070, var2 ^ ((var0_2 | var2) ^ -1022444069)));
                gm.e = gj.decode("fl8nFAM=", gm.QQ((var0_2 | var2) ^ 1799722065, var2 ^ ((var0_2 | var2) ^ 1382952995)));
                gm.c = gj.decode("bXC1rTtm", gm.QQ((var0_2 | var2) ^ 1799722064, var2 ^ ((var0_2 | var2) ^ 8233077)));
                gm.b = gj.decode("yloslqU=", gm.QQ((var0_2 | var2) ^ 1799722067, var2 ^ ((var0_2 | var2) ^ -996741250)));
                return;
            }
        }
        var2 = -1306891366;
        gm.g = mK.a(MethodHandles.lookup().lookupClass(), 1083234584);
        var1_1 = 0;
        var0_2 = -1550902266;
        var1_1 = var2 ^ 1017680669;
        block10: while (true) {
            switch (var1_1) {
                default: {
                    continue block10;
                }
                case 1173644133: {
                    var0_2 ^= var1_1 ^ 1404026707;
                    var1_1 = var2 ^ 1177247561;
                    continue block10;
                }
                case -1900873593: {
                    var1_1 = var2 ^ -1214900351;
                    continue block10;
                }
                case 1324243219: {
                    gm.a = new int[(var0_2 | var1_1 ^ -51105143) ^ (var1_1 ^ -254762297)];
                    var1_1 = var2 ^ -135395073;
                    continue block10;
                }
                case 1692356995: {
                    var0_2 ^= var1_1 ^ 2009854654;
                    var1_1 = var2 ^ -51105143;
                    continue block10;
                }
                case -198101805: {
                    v1 = 0;
                    v3 = 0;
                    v2 = "-\u00b6\u00ba\u0017\u00e3.\u0012\u001a\u00d5\u0098\u001a\u0096\u00e3\u008c\u00aa\u00b2\u00b1\u00d9\u0013\u00c6\u00a0\u00e7ny\u008fP\u000e\u00f0+\u00ad\u00f7{\u00fa\u00af\u00e9\u00a6\u008e\u00a8H\u00af\u00af\u00c1B\u0002\u00a6$1@=\u00c0a\u00fa{Y?h\u00e1\u00127$".getBytes("ISO-8859-1");
                    ** continue;
                }
                case 93092891: {
                    var0_2 ^= var1_1 ^ 723729001;
                    var1_1 = var2 ^ -2023665928;
                    continue block10;
                }
                case 897262946: 
            }
            var1_1 = var2 ^ -691717607;
        }
    }

    /*
     * Exception decompiling
     */
    public void release() {
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
    private void QR() {
        int n2 = 1384727114;
        int n3 = g & 0x5289424A ^ 0x6073F43B;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xB826B3F;
        n4 = (n3 | n2) ^ 0x3B215F1C;
        block19: while (true) {
            switch (n4) {
                default: {
                    continue block19;
                }
                case 235584372: {
                    n5 ^= n4 ^ 0x7DBC4C44;
                    n4 = (n3 | n2) ^ 0xC02A3F86;
                    continue block19;
                }
                case 1909731833: {
                    return;
                }
                case -1294874115: {
                    this.b = false;
                    n4 = (n3 | n2) ^ 0x6A5C04C0;
                    continue block19;
                }
                case -195644310: {
                    n5 ^= n4 ^ 0x4A9D6639;
                    n4 = (n3 | n2) ^ 0x915E6E88;
                    continue block19;
                }
                case 1080945143: {
                    n5 ^= n4 ^ 0x1E49ECD3;
                    n4 = (n3 | n2) ^ 0x2B6B568A;
                    continue block19;
                }
                case 908522897: {
                    this.d = false;
                    n4 = (n3 | n2) ^ 0xCF37DAE8;
                    continue block19;
                }
                case 1719610945: {
                    this.a = false;
                    n4 = (n3 | n2) ^ 0x32961F8C;
                    continue block19;
                }
                case 1502650609: {
                    this.e = false;
                    n4 = (n3 | n2) ^ 0x7CF14D0F;
                    continue block19;
                }
                case 206126786: {
                    this.l = false;
                    n4 = (n3 | n2) ^ 0xBBFFBF7E;
                    continue block19;
                }
                case -922466043: {
                    n5 ^= n4 ^ 0x8CA0DEC5;
                    n4 = (n3 | n2) ^ 0x32FC782;
                    continue block19;
                }
                case 1747185196: {
                    this.h = false;
                    n4 = (n3 | n2) ^ 0x86AD4211;
                    continue block19;
                }
                case 1065206956: {
                    n5 ^= n4 ^ 0xC560B011;
                    n4 = (n3 | n2) ^ 0x44DD03EA;
                    continue block19;
                }
                case 1239066983: {
                    n4 = (n3 | n2) ^ 0x4D8632D7;
                    continue block19;
                }
                case -1110692717: {
                    n5 ^= n4 ^ 0x8176E7BB;
                    n4 = (n3 | n2) ^ 0x1484D83A;
                    continue block19;
                }
                case 1398096372: {
                    n5 ^= n4 ^ 0x3617FF71;
                    n4 = (n3 | n2) ^ 0x7EB2C8B9;
                    continue block19;
                }
                case -475686669: {
                    this.i = false;
                    n4 = (n3 | n2) ^ 0x21AEB78F;
                    continue block19;
                }
                case 413659835: 
            }
            n5 ^= n4 ^ 0x53D47DCA;
            n4 = (n3 | n2) ^ 0x1AD81857;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void holdStill() {
        var4_1 = 1306127062;
        var1_2 = gm.g & 1306127062 ^ 920816726;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 1994393347;
        var3_3 = (var1_2 | var4_1) ^ -1284824819;
        if (true) ** GOTO lbl15
        block24: while (true) {
            var3_3 = (var1_2 | var4_1) ^ -655263677;
            if (true) ** GOTO lbl15
            block25: while (true) {
                var3_3 = (var1_2 | var4_1) ^ 1263732229;
                if (true) ** GOTO lbl15
                block26: while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 394577517;
lbl15:
                    // 4 sources

                    block27: while (true) {
                        block29: {
                            block28: {
                                switch (var3_3) {
                                    case -756272121: {
                                        return;
                                    }
                                    case 2053702771: {
                                        var2_4 ^= var3_3 ^ -951027167;
                                        break block28;
                                    }
                                    case 883484883: {
                                        this.a = null;
                                        var3_3 = (var1_2 | var4_1) ^ -1505912077;
                                        continue block27;
                                    }
                                    case 1728571547: {
                                        ** break;
                                    }
                                    case -862924837: {
                                        break block29;
                                    }
                                    case -640346410: {
                                        this.c = 0;
                                        var3_3 = (var1_2 | var4_1) ^ -1191580230;
                                        continue block27;
                                    }
                                    case -641305563: {
                                        var2_4 ^= var3_3 ^ -1802641901;
                                        ** GOTO lbl72
                                    }
                                    case -1342659804: {
                                        var2_4 ^= var3_3 ^ 991525501;
                                        ** GOTO lbl79
                                    }
                                    case 1922855239: {
                                        this.take();
                                        var3_3 = (var1_2 | var4_1) ^ -1127321324;
                                        continue block27;
                                    }
lbl44:
                                    // 1 sources

                                    switch (var2_4) {
                                        case 738276729: {
                                            var3_3 = (var1_2 | var4_1) ^ 980886186;
                                            break;
                                        }
                                        case 1753163963: {
                                            break block28;
                                        }
                                        case -516198989: {
                                            var3_3 = (var1_2 | var4_1) ^ 947967535;
                                            continue block27;
                                        }
                                        case -956169364: {
                                            var2_4 ^= var3_3 ^ -442466204;
                                            ** GOTO lbl77
                                        }
                                        case -1162961139: {
                                            this.QR();
                                            continue block26;
                                        }
                                        case -1492478315: {
                                            var2_4 ^= var3_3 ^ -1317700234;
                                            continue block25;
                                        }
                                        default: {
                                            var3_3 = (var1_2 | var4_1) ^ 93514405;
                                            break;
                                        }
                                        case 1628619424: {
                                            var3_3 = (var1_2 | var4_1) ^ -805089806;
                                            break;
                                        }
                                    }
                                    ** GOTO lbl84
                                    case 1199257849: {
                                        this.a = 0;
                                        continue block24;
                                    }
lbl72:
                                    // 1 sources

                                    var3_3 = (var1_2 | var4_1) ^ -1506871296;
                                    ** GOTO lbl84
                                    case 1166855292: {
                                        var2_4 ^= var3_3 ^ -1989080644;
                                        ** GOTO lbl79
                                    }
lbl77:
                                    // 1 sources

                                    var3_3 = (var1_2 | var4_1) ^ -1390945583;
                                    ** GOTO lbl84
lbl79:
                                    // 2 sources

                                    var3_3 = (var1_2 | var4_1) ^ -1631550619;
                                    ** GOTO lbl84
                                    case -1019895870: {
                                        var2_4 ^= var3_3 ^ 321163023;
                                        var3_3 = (var1_2 | var4_1) ^ -984256037;
                                    }
lbl84:
                                    // 6 sources

                                    default: {
                                        continue block27;
                                    }
                                    case -1494999381: 
                                }
                                var2_4 ^= var3_3 ^ 1408225994;
                                ** break;
lbl89:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ 224894865;
                                continue;
                            }
                            var3_3 = (var1_2 | var4_1) ^ 419169869;
                            continue;
                        }
                        var3_3 = (var1_2 | var4_1) ^ -652218243;
                    }
                    break;
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void maintain() {
        block26: {
            block27: {
                block21: {
                    block25: {
                        block23: {
                            block24: {
                                block22: {
                                    var4_1 = 97753238;
                                    var1_2 = gm.g & 97753238 ^ 354070010;
                                    var3_3 = 0;
                                    ** GOTO lbl15
lbl5:
                                    // 8 sources

                                    block13: while (true) {
                                        switch (var3_3) lbl-1000:
                                        // 4 sources

                                        {
                                            while (true) {
                                                default: {
                                                    continue block13;
                                                }
                                                break;
                                            }
                                            case -1282650292: {
                                                break;
                                            }
                                            case 1473668990: {
                                                this.take();
                                                break block21;
                                            }
lbl15:
                                            // 1 sources

                                            var2_4 = (var1_2 | var4_1) ^ 503206398;
                                            var3_3 = (var1_2 | var4_1) ^ -1504185678;
                                            ** GOTO lbl-1000
lbl18:
                                            // 1 sources

                                            while (true) {
                                                var3_3 = (var1_2 | var4_1) ^ 201219415;
                                                ** GOTO lbl-1000
                                                break;
                                            }
lbl21:
                                            // 2 sources

                                            while (true) {
                                                var2_4 ^= 1468189311;
                                                break block22;
                                                break;
                                            }
                                            case -518670465: {
                                                var2_4 ^= var3_3 ^ 1344423089;
                                                break;
                                            }
lbl27:
                                            // 1 sources

                                            while (true) {
                                                var3_3 = (var1_2 | var4_1) ^ 1934266378;
                                                ** continue;
                                                break;
                                            }
lbl30:
                                            // 1 sources

                                            while (true) {
                                                var2_4 ^= 1269819781;
                                                ** GOTO lbl45
                                                break;
                                            }
                                            case 505798825: {
                                                --this.d;
                                                ** continue;
                                            }
                                            case -1786432871: {
                                                if (this.d <= 0) break block13;
                                                ** continue;
                                            }
                                            case 1720790516: {
                                                var2_4 ^= var3_3 ^ -1566731712;
                                                break block23;
                                            }
                                            case 218075211: {
                                                var2_4 ^= var3_3 ^ -2113064354;
                                                break block24;
                                            }
lbl45:
                                            // 1 sources

                                            v0 = true;
                                            ** GOTO lbl21
                                        }
                                        break;
                                    }
                                    var2_4 ^= 1269819781;
                                    break block25;
                                }
                                this.h = v0;
                                break block26;
                            }
                            var3_3 = (var1_2 | var4_1) ^ 1448307957;
                            ** GOTO lbl5
lbl55:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -405833279;
                                ** GOTO lbl5
                                break;
                            }
                        }
                        var3_3 = (var1_2 | var4_1) ^ -2141286553;
                        ** GOTO lbl5
                    }
                    v0 = false;
                    ** while (true)
                    {
                        case 1133039883: {
                            return;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1108204160;
                    ** GOTO lbl5
                }
                var3_3 = (var1_2 | var4_1) ^ 1209191355;
                ** GOTO lbl5
                {
                    case 1573484101: {
                        var2_4 ^= var3_3 ^ 1062031827;
                        break block27;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ -187823487;
                ** GOTO lbl5
            }
            var3_3 = (var1_2 | var4_1) ^ -1275203531;
            ** GOTO lbl5
            {
                case -233520065: {
                    var2_4 ^= var3_3 ^ 708139121;
                    ** continue;
                }
            }
        }
lbl83:
        // 2 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 421801397;
            ** continue;
            break;
        }
        {
            ** case -1507439157:
        }
lbl87:
        // 1 sources

        ** while (this.d <= 0)
lbl88:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public void setDestination(class_2338 var1_1) {
        block31: {
            block33: {
                block30: {
                    block32: {
                        var5_2 = 1498000374;
                        var2_3 = gm.g & 1498000374 ^ -2130544415;
                        var4_4 = 0;
                        var3_5 = (var2_3 | var5_2) ^ -1301777692;
                        ** GOTO lbl55
lbl6:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 870820377;
                            ** GOTO lbl15
                            break;
                        }
lbl9:
                        // 2 sources

                        block20: while (true) {
                            block34: {
                                var4_4 = (var2_3 | var5_2) ^ -1249922846;
                                break block34;
lbl12:
                                // 1 sources

                                while (true) {
                                    this.a = null;
                                    ** GOTO lbl50
                                    break;
                                }
                            }
lbl16:
                            // 11 sources

                            block22: while (true) {
                                switch (var4_4) lbl-1000:
                                // 6 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block22;
                                        }
                                        break;
                                    }
                                    case -513738082: {
                                        break block20;
                                    }
                                    case -2081656686: {
                                        ** continue;
                                    }
                                    case -1898467756: {
                                        this.a = null;
                                        break block30;
                                    }
lbl28:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ 167555714;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case 1110629714: {
                                        var3_5 ^= var4_4 ^ 2017612082;
                                        break;
                                    }
                                    case -1196516207: {
                                        if (var1_1 == null) {
                                            break;
                                        }
                                        break block31;
                                    }
                                    case -793294475: {
                                        var3_5 ^= var4_4 ^ -1611858763;
                                        break block32;
                                    }
                                    case 1815366421: {
                                        var3_5 ^= var4_4 ^ -1063239284;
                                        ** continue;
                                    }
lbl44:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ 372748894;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl47:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ 1520929637;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl50:
                                    // 1 sources

                                    var4_4 = (var2_3 | var5_2) ^ -1686559067;
                                    ** GOTO lbl-1000
                                    case -60703678: {
                                        var3_5 ^= var4_4 ^ -177168913;
                                        break block33;
                                    }
lbl55:
                                    // 1 sources

                                    var4_4 = (var2_3 | var5_2) ^ 942342505;
                                    ** continue;
                                    case -845676977: {
                                        return;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        var4_4 = (var2_3 | var5_2) ^ 623527861;
                        ** GOTO lbl16
                    }
                    var4_4 = (var2_3 | var5_2) ^ -266640743;
                    ** GOTO lbl16
                    {
                        case -162295230: {
                            var3_5 ^= var4_4 ^ -1341170847;
                            break;
                        }
                    }
                    var4_4 = (var2_3 | var5_2) ^ -1720181792;
                    ** GOTO lbl16
                    {
                        case -813938263: {
                            var3_5 ^= var4_4 ^ -1168674807;
                            ** continue;
                        }
                    }
lbl72:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 349963704;
                        ** GOTO lbl16
                        break;
                    }
lbl75:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -503466134;
                        ** GOTO lbl16
                        break;
                    }
                    {
                        case -357805586: {
                            return;
                        }
                    }
                    var4_4 = (var2_3 | var5_2) ^ 790129077;
                    ** GOTO lbl16
                    {
                        case 951471261: {
                            if (var1_1.equals((Object)this.a)) ** GOTO lbl9
                            ** continue;
                        }
                        case -1511566395: {
                            var3_5 ^= var4_4 ^ 1018815269;
                            ** continue;
                        }
                    }
                    var4_4 = (var2_3 | var5_2) ^ 1469863331;
                    ** GOTO lbl16
                }
                var4_4 = (var2_3 | var5_2) ^ 2091690034;
                ** GOTO lbl16
                {
                    case 1253551595: {
                        var3_5 ^= var4_4 ^ -563803746;
                        ** continue;
                    }
                    case 693148014: {
                        this.a = var1_1.method_10062();
                        ** continue;
                    }
                    ** case 1077141527:
                }
lbl100:
                // 1 sources

                this.c = 0;
                ** while (true)
            }
            var4_4 = (var2_3 | var5_2) ^ 1642424166;
            ** GOTO lbl16
        }
        var4_4 = (var2_3 | var5_2) ^ -1812179428;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public void setAllowJump(boolean var1_1) {
        var5_2 = -1077105248;
        var2_3 = gm.g & -1077105248 ^ 2139433583;
        var4_4 = 0;
        ** GOTO lbl26
lbl5:
        // 1 sources

        return;
lbl7:
        // 1 sources

        while (true) {
            this.g = var1_1;
            ** GOTO lbl24
            break;
        }
lbl10:
        // 1 sources

        block9: while (true) {
            switch (var4_4) lbl-1000:
            // 5 sources

            {
                while (true) {
                    default: {
                        continue block9;
                    }
                    break;
                }
                case -1585008008: {
                    ** continue;
                }
                case 717333486: {
                    break block9;
                }
                case -1738017639: {
                    ** continue;
                }
lbl21:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ 1739217782;
                    ** GOTO lbl-1000
                    break;
                }
lbl24:
                // 1 sources

                var4_4 = (var2_3 | var5_2) ^ -1944419952;
                ** GOTO lbl-1000
lbl26:
                // 1 sources

                var3_5 = (var2_3 | var5_2) ^ 1444791382;
                var4_4 = (var2_3 | var5_2) ^ -720630783;
                ** GOTO lbl-1000
lbl29:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ 1581981079;
                    ** continue;
                    break;
                }
            }
            break;
        }
        var4_4 = (var2_3 | var5_2) ^ 1465818991;
        ** while (true)
        {
            case 1943481983: {
                var3_5 ^= var4_4 ^ -1845230346;
                ** continue;
            }
            ** case -1466748800:
        }
lbl38:
        // 1 sources

        var3_5 ^= var4_4 ^ -874882326;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public void setSneak(boolean var1_1) {
        block13: {
            block12: {
                var5_2 = 962869455;
                var2_3 = gm.g & 962869455 ^ 1386937422;
                var4_4 = 0;
                ** GOTO lbl20
lbl5:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_4 ^ 1657545942;
                    break block12;
                    break;
                }
lbl8:
                // 2 sources

                block8: while (true) {
                    switch (var4_4) lbl-1000:
                    // 4 sources

                    {
                        while (true) {
                            default: {
                                continue block8;
                            }
                            break;
                        }
                        case 1752630571: {
                            ** continue;
                        }
lbl15:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -538244765;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -1543113300: {
                            break block13;
                        }
lbl20:
                        // 1 sources

                        var3_5 = (var2_3 | var5_2) ^ 1105416545;
                        ** continue;
                        case -1914364428: {
                            var3_5 ^= var4_4 ^ -2030518948;
                            ** GOTO lbl28
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -166993605;
                            ** GOTO lbl-1000
                            break;
                        }
lbl28:
                        // 1 sources

                        var4_4 = (var2_3 | var5_2) ^ -452222792;
                        ** continue;
                        case -1629135753: {
                            return;
                        }
                        case 1938282605: {
                            this.c = var1_1;
                            break block8;
                        }
                    }
                    break;
                }
                ** while (true)
            }
            var4_4 = (var2_3 | var5_2) ^ 141108386;
            ** GOTO lbl8
        }
        var4_4 = (var2_3 | var5_2) ^ 328858084;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public void setSprintWanted(boolean var1_1) {
        block11: {
            var5_2 = 1677625868;
            var2_3 = gm.g & 1677625868 ^ 855691231;
            var4_4 = 0;
            ** GOTO lbl21
lbl5:
            // 2 sources

            block7: while (true) {
                switch (var4_4) lbl-1000:
                // 4 sources

                {
                    while (true) {
                        default: {
                            continue block7;
                        }
                        break;
                    }
                    case -1578122974: {
                        break block11;
                    }
lbl12:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 414269840;
                        ** GOTO lbl-1000
                        break;
                    }
lbl15:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -1590779311;
                        ** GOTO lbl-1000
                        break;
                    }
                    case -758092402: {
                        var3_5 ^= var4_4 ^ -1619603343;
                        break block7;
                    }
lbl21:
                    // 1 sources

                    var3_5 = (var2_3 | var5_2) ^ -756476549;
                    var4_4 = (var2_3 | var5_2) ^ -770633987;
                    ** continue;
                    case -1645062705: {
                        return;
                    }
                }
                break;
            }
            var4_4 = (var2_3 | var5_2) ^ -301164016;
            ** GOTO lbl5
        }
        var4_4 = (var2_3 | var5_2) ^ -862308705;
        ** while (true)
        {
            case -1083901632: {
                var3_5 ^= var4_4 ^ 1777088604;
                ** continue;
            }
            ** case 1800375887:
        }
lbl35:
        // 1 sources

        this.f = var1_1;
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void setExcavating(boolean bl2) {
        int n2 = -1965261447;
        int n3 = g & 0x8ADC7D79 ^ 0x9B41A23E;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x80228072;
        n4 = (n3 | n2) ^ 0x8875FF2B;
        boolean bl3 = true;
        block7: while (true) {
            if (!bl3 || (bl3 = false) || !true) {
                n4 = (n3 | n2) ^ 0x23099997;
            }
            block8: while (true) {
                switch (n4) {
                    default: {
                        continue block8;
                    }
                    case -13378236: {
                        n5 ^= n4 ^ 0xB1EFCD72;
                        n4 = (n3 | n2) ^ 0xB0087AB;
                        continue block8;
                    }
                    case -1194039576: {
                        this.j = bl2;
                        n4 = (n3 | n2) ^ 0x64EE223B;
                        continue block8;
                    }
                    case -1322880877: {
                        n5 ^= n4 ^ 0x3D4D5E27;
                        continue block7;
                    }
                    case 329777236: {
                        n4 = (n3 | n2) ^ 0x2AFB8FEC;
                        continue block8;
                    }
                    case -1864533804: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public class_2338 destination() {
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
    public void tick(class_310 var1_1) {
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
    static double along(double d2, double d3, float f2) {
        int n2 = g & 0x74D5A016 ^ 0xDE11562F;
        int n3 = 0;
        int n4 = (n2 | 0x74D5A016) ^ 0xDCC5912A;
        n3 = (n2 | 0x74D5A016) ^ 0xAC464166;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1421294816: {
                    double d4 = Math.toRadians(f2);
                    n4 ^= 0x895C8496;
                    return d3 * Math.cos(d4) - d2 * Math.sin(d4);
                }
                case 1385412441: {
                    n3 = (n2 | 0x74D5A016) ^ 0xB58F7518;
                    continue block5;
                }
                case 1264223015: 
            }
            n4 ^= n3 ^ 0xCB362AD2;
            n3 = (n2 | 0x74D5A016) ^ 0x559D351F;
        }
    }

    /*
     * Unable to fully structure code
     */
    static double lateral(double var0, double var2_2, float var4_1) {
        var7_3 = gm.g & 1328204709 ^ 807701412;
        var9_4 = 0;
        var8_5 = (var7_3 | 1328204709) ^ -1167797546;
        if (true) ** GOTO lbl12
        block5: while (true) {
            switch (var9_4) lbl-1000:
            // 4 sources

            {
                default: {
                    continue block5;
                }
                case -1260605762: {
                    var9_4 = (var7_3 | 1328204709) ^ 324317451;
                    ** GOTO lbl-1000
                }
lbl12:
                // 1 sources

                var9_4 = (var7_3 | 1328204709) ^ -873306853;
                ** GOTO lbl-1000
                case 204236472: {
                    var5_6 = Math.toRadians(var4_1);
                    break block5;
                }
lbl17:
                // 1 sources

                return var0 * Math.cos(var5_6) + var2_2 * Math.sin(var5_6);
                case 1819966126: {
                    var8_5 ^= var9_4 ^ 474538302;
                    var9_4 = (var7_3 | 1328204709) ^ 1929555229;
                    ** GOTO lbl-1000
                }
            }
            break;
        }
        var8_5 ^= 1446552168;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    void updateForward(double var1_1) {
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
    void updateStrafe(double var1_1) {
        block71: {
            block66: {
                block76: {
                    block78: {
                        block77: {
                            block73: {
                                block75: {
                                    block65: {
                                        block80: {
                                            block79: {
                                                block74: {
                                                    block72: {
                                                        block68: {
                                                            block67: {
                                                                block69: {
                                                                    block70: {
                                                                        break block79;
lbl1:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var7_4 = (var5_3 | var8_2) ^ -930092749;
                                                                            break block65;
                                                                            break;
                                                                        }
lbl4:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            var6_6 ^= -1347194689;
                                                                            break block66;
                                                                            break;
                                                                        }
lbl7:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            v0 = false;
                                                                            break block67;
                                                                            break;
                                                                        }
lbl10:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            if (this.e) break block68;
                                                                            break block69;
                                                                            break;
                                                                        }
lbl13:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var7_4 = (var5_3 | var8_2) ^ 1384585423;
                                                                            break block65;
lbl16:
                                                                            // 1 sources

                                                                            return;
lbl18:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                continue;
                                                                                break;
                                                                            }
lbl20:
                                                                            // 1 sources

                                                                            while (var1_1 < 0.0) {
                                                                                break block70;
                                                                            }
                                                                            break block71;
lbl23:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var6_6 ^= var7_4 ^ -1405915398;
                                                                                ** GOTO lbl143
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
lbl26:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
lbl28:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            v1 = true;
                                                                            ** GOTO lbl4
                                                                            break;
                                                                        }
lbl31:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var7_4 = (var5_3 | var8_2) ^ -361893061;
                                                                            break block65;
                                                                            while (true) {
                                                                                var7_4 = (var5_3 | var8_2) ^ 438447032;
                                                                                break block65;
lbl37:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var7_4 = (var5_3 | var8_2) ^ 1966949826;
                                                                                    break block65;
                                                                                    break;
                                                                                }
                                                                                while (true) {
                                                                                    var6_6 ^= -1537619789;
                                                                                    ** continue;
                                                                                    break;
                                                                                }
lbl43:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (this.b) break block68;
                                                                                    break block72;
                                                                                    break;
                                                                                }
lbl46:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var6_6 ^= var7_4 ^ 139803526;
                                                                                    break block73;
                                                                                    break;
                                                                                }
lbl49:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var6_6 ^= var7_4 ^ 801041872;
                                                                                    break block74;
                                                                                    break;
                                                                                }
lbl52:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    v0 = true;
                                                                                    break block67;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                    }
                                                                    var6_6 ^= -233640692;
                                                                    ** while (true)
                                                                }
                                                                var7_4 = (var5_3 | var8_2) ^ 650773726;
                                                                break block65;
                                                            }
                                                            var6_6 ^= -1897691306;
                                                            break block80;
lbl64:
                                                            // 1 sources

                                                            while (true) {
                                                                var6_6 ^= var7_4 ^ 54931537;
                                                                ** GOTO lbl168
                                                                break;
                                                            }
                                                        }
                                                        while (true) {
                                                            var7_4 = (var5_3 | var8_2) ^ 44837222;
                                                            break block65;
                                                            break;
                                                        }
                                                    }
                                                    var7_4 = (var5_3 | var8_2) ^ 119807516;
                                                    break block65;
lbl74:
                                                    // 1 sources

                                                    while (true) {
                                                        var7_4 = (var5_3 | var8_2) ^ -2147162658;
                                                        break block75;
                                                        break;
                                                    }
                                                    this.b = false;
                                                    var7_4 = (var5_3 | var8_2) ^ -817222304;
                                                    break block65;
                                                    var3_5 = Math.abs(var1_1);
                                                    var7_4 = (var5_3 | var8_2) ^ -1097453752;
                                                    break block65;
lbl83:
                                                    // 1 sources

                                                    while (true) {
                                                        this.e = false;
                                                        ** GOTO lbl154
                                                        break;
                                                    }
lbl86:
                                                    // 1 sources

                                                    while (true) {
                                                        var6_6 ^= var7_4 ^ -97142052;
                                                        break block76;
                                                        break;
                                                    }
                                                }
                                                var7_4 = (var5_3 | var8_2) ^ -891208073;
                                                break block65;
                                            }
                                            var8_2 = -1030712790;
                                            var5_3 = gm.g & -1030712790 ^ 2005612733;
                                            var7_4 = 0;
                                            var6_6 = (var5_3 | var8_2) ^ -56030289;
                                            ** GOTO lbl176
lbl98:
                                            // 1 sources

                                            return;
                                        }
                                        this.e = v0;
                                        ** while (true)
lbl103:
                                        // 1 sources

                                        while (true) {
                                            var6_6 ^= var7_4 ^ 37225956;
                                            ** continue;
                                            break;
                                        }
lbl106:
                                        // 1 sources

                                        while (true) {
                                            var6_6 ^= var7_4 ^ 2006652238;
                                            ** continue;
                                            break;
                                        }
                                    }
lbl110:
                                    // 6 sources

                                    block56: while (true) {
                                        switch (var7_4) lbl-1000:
                                        // 7 sources

                                        {
                                            while (true) {
                                                default: {
                                                    continue block56;
                                                }
                                                break;
                                            }
                                            case 1015368228: {
                                                ** continue;
                                            }
                                            case -61064597: {
                                                ** continue;
                                            }
                                            case 1031439560: {
                                                ** continue;
                                            }
                                            case -599313458: {
                                                ** GOTO lbl20
                                            }
                                            case 953259999: {
                                                ** continue;
                                            }
                                            case -130937314: {
                                                ** continue;
                                            }
                                            case 502679940: {
                                                ** continue;
                                            }
                                            case 1004111344: {
                                                ** continue;
                                            }
                                            case 1539906584: {
                                                ** continue;
                                            }
                                            case -783171999: {
                                                break block77;
                                            }
                                            case -805149700: {
                                                ** continue;
                                            }
                                            case 1058296716: {
                                                ** continue;
                                            }
                                            case -1630128884: {
                                                ** continue;
                                            }
                                            case -255875933: {
                                                ** continue;
                                            }
lbl143:
                                            // 1 sources

                                            var7_4 = (var5_3 | var8_2) ^ 197624020;
                                            ** GOTO lbl-1000
                                            case -180907047: {
                                                var6_6 ^= var7_4 ^ 2004833915;
                                                break block56;
                                            }
lbl148:
                                            // 1 sources

                                            while (true) {
                                                var7_4 = (var5_3 | var8_2) ^ -1130623811;
                                                ** GOTO lbl-1000
                                                break;
                                            }
lbl151:
                                            // 1 sources

                                            while (true) {
                                                var6_6 ^= -1537619789;
                                                ** continue;
                                                break;
                                            }
lbl154:
                                            // 1 sources

                                            var7_4 = (var5_3 | var8_2) ^ -868073649;
                                            ** GOTO lbl-1000
lbl156:
                                            // 1 sources

                                            while (true) {
                                                var7_4 = (var5_3 | var8_2) ^ -1403869529;
                                                ** GOTO lbl-1000
                                                break;
                                            }
                                            case -1660903110: {
                                                if (!(var1_1 > 0.0)) ** continue;
                                                ** continue;
                                            }
                                            case 1225627127: {
                                                var6_6 ^= var7_4 ^ 267936944;
                                                ** continue;
                                            }
lbl165:
                                            // 1 sources

                                            while (true) {
                                                var7_4 = (var5_3 | var8_2) ^ -181335713;
                                                ** GOTO lbl-1000
                                                break;
                                            }
lbl168:
                                            // 1 sources

                                            var7_4 = (var5_3 | var8_2) ^ 1766690739;
                                            ** continue;
                                            case -1524850064: {
                                                if (!(var3_5 < 0.2)) ** continue;
                                                ** continue;
                                            }
                                            case 44741600: {
                                                if (!(var3_5 < 0.45)) ** continue;
                                                ** continue;
                                            }
lbl176:
                                            // 1 sources

                                            var7_4 = (var5_3 | var8_2) ^ 488821786;
                                            break block75;
                                        }
                                        break;
                                    }
                                    var7_4 = (var5_3 | var8_2) ^ 1788550021;
                                    ** GOTO lbl110
lbl180:
                                    // 1 sources

                                    while (true) {
                                        v1 = false;
                                        ** continue;
                                        break;
                                    }
                                }
lbl184:
                                // 2 sources

                                block63: while (true) {
                                    switch (var7_4) {
                                        default: {
                                            continue block63;
                                        }
                                        case 2006933345: {
                                            ** continue;
                                        }
                                        case -356946267: {
                                            break block78;
                                        }
                                        case -1591701851: {
                                            break;
                                        }
                                    }
                                    ** continue;
                                    break;
                                }
                            }
                            var7_4 = (var5_3 | var8_2) ^ 664394051;
                            ** GOTO lbl110
lbl198:
                            // 1 sources

                            while (true) {
                                var7_4 = (var5_3 | var8_2) ^ -887164773;
                                ** GOTO lbl110
                                break;
                            }
                        }
                        var7_4 = (var5_3 | var8_2) ^ 262780065;
                        ** GOTO lbl110
                    }
                    var7_4 = (var5_3 | var8_2) ^ 1455109146;
                    ** while (true)
                }
                var7_4 = (var5_3 | var8_2) ^ 735873393;
                ** while (true)
            }
            this.b = v1;
            ** while (true)
            {
                case -306605817: {
                    var6_6 ^= var7_4 ^ 1809033175;
                    ** continue;
                }
            }
        }
        var6_6 ^= -233640692;
        ** while (true)
        {
            case -2102984835: {
                return;
            }
            ** case 1258796546:
        }
lbl222:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private void QS(class_310 var1_1, class_243 var2_2) {
        block53: {
            block46: {
                block48: {
                    block55: {
                        block51: {
                            block54: {
                                block50: {
                                    block49: {
                                        block52: {
                                            block47: {
                                                break block54;
lbl1:
                                                // 1 sources

                                                while (true) {
                                                    var5_6 ^= var6_5 ^ -1337777348;
                                                    ** GOTO lbl45
                                                    break;
                                                }
lbl4:
                                                // 11 sources

                                                block30: while (true) {
                                                    switch (var6_5) lbl-1000:
                                                    // 8 sources

                                                    {
                                                        default: {
                                                            continue block30;
                                                        }
lbl8:
                                                        // 2 sources

                                                        while (true) {
                                                            var6_5 = (var4_4 | var7_3) ^ -833874326;
                                                            ** GOTO lbl-1000
                                                            break;
                                                        }
                                                        case -2033062498: {
                                                            break block46;
                                                        }
lbl13:
                                                        // 1 sources

                                                        while (true) {
                                                            var6_5 = (var4_4 | var7_3) ^ -1960138934;
                                                            ** GOTO lbl-1000
                                                            break;
                                                        }
lbl16:
                                                        // 1 sources

                                                        while (true) {
                                                            if (this.a.method_10264() <= class_3532.method_15357((double)var2_2.field_1351)) break block47;
                                                            break block48;
                                                            break;
                                                        }
lbl19:
                                                        // 1 sources

                                                        while (true) {
                                                            var6_5 = (var4_4 | var7_3) ^ -290499351;
                                                            ** GOTO lbl-1000
                                                            break;
                                                        }
                                                        case 551709741: {
                                                            if (!this.g) break;
                                                            break block49;
                                                        }
                                                        case 169935439: {
                                                            var5_6 ^= var6_5 ^ 457554297;
                                                            ** GOTO lbl31
                                                        }
lbl28:
                                                        // 1 sources

                                                        while (true) {
                                                            var6_5 = (var4_4 | var7_3) ^ 1309533198;
                                                            ** GOTO lbl-1000
                                                            break;
                                                        }
lbl31:
                                                        // 1 sources

                                                        var6_5 = (var4_4 | var7_3) ^ 1218237786;
                                                        ** GOTO lbl-1000
                                                        case -1506627811: {
                                                            var5_6 ^= var6_5 ^ 1528283918;
                                                            break block50;
                                                        }
lbl36:
                                                        // 1 sources

                                                        while (true) {
                                                            var6_5 = (var4_4 | var7_3) ^ -558444582;
                                                            break block51;
                                                            break;
                                                        }
                                                        case -1572843375: {
                                                            if (!var1_1.field_1724.method_24828()) break;
                                                            ** continue;
                                                        }
                                                        case 461096597: {
                                                            this.h = false;
                                                            ** GOTO lbl8
                                                        }
lbl45:
                                                        // 1 sources

                                                        var6_5 = (var4_4 | var7_3) ^ -1796029642;
                                                        break block51;
                                                        case 1984103814: {
                                                            return;
                                                        }
                                                        case -1156614669: {
                                                            break block30;
                                                        }
lbl51:
                                                        // 1 sources

                                                        while (true) {
                                                            var6_5 = (var4_4 | var7_3) ^ 601421327;
                                                            ** GOTO lbl-1000
                                                            break;
                                                        }
lbl54:
                                                        // 1 sources

                                                        while (true) {
                                                            var6_5 = (var4_4 | var7_3) ^ -1812175999;
                                                            break block51;
                                                            break;
                                                        }
                                                        case 40194619: {
                                                            var5_6 ^= var6_5 ^ -56866273;
                                                            break block52;
                                                        }
                                                    }
                                                    break;
                                                }
                                                var6_5 = (var4_4 | var7_3) ^ -1970630087;
                                                ** GOTO lbl4
                                                {
                                                    case 645094777: {
                                                        this.d = 3;
                                                        break;
                                                    }
                                                }
lbl65:
                                                // 1 sources

                                                while (true) {
                                                    v0 = true;
                                                    break block53;
                                                    break;
                                                }
lbl68:
                                                // 1 sources

                                                while (true) {
                                                    var5_6 ^= var6_5 ^ -1387052502;
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            var6_5 = (var4_4 | var7_3) ^ 1830444077;
                                            break block51;
                                        }
                                        var6_5 = (var4_4 | var7_3) ^ -1336224271;
                                        ** GOTO lbl4
                                    }
                                    var6_5 = (var4_4 | var7_3) ^ -747516796;
                                    ** GOTO lbl4
                                    {
                                        case -1838442743: {
                                            if (this.d <= 0) break;
                                            ** continue;
                                        }
                                    }
                                    while (true) {
                                        var6_5 = (var4_4 | var7_3) ^ -2077446610;
                                        ** GOTO lbl4
                                        break;
                                    }
                                }
                                var6_5 = (var4_4 | var7_3) ^ 507362545;
                                ** GOTO lbl4
                                {
                                    case -487314610: {
                                        if (!var3_7) ** continue;
                                        ** continue;
                                    }
                                    case 1269190520: {
                                        var5_6 ^= var6_5 ^ 1318533715;
                                        break;
                                    }
                                }
lbl95:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var7_3 = 1618909271;
                            var4_4 = gm.g & 1618909271 ^ 136198448;
                            var6_5 = 0;
                            break block55;
                        }
lbl103:
                        // 4 sources

                        block44: while (true) {
                            block20 : switch (var6_5) {
                                default: {
                                    continue block44;
                                }
                                case 2126127419: {
                                    ** continue;
                                }
                                case -57902527: {
                                    ** continue;
                                }
                                case 98976551: {
                                    break block44;
                                }
                                case -1228376403: {
                                    ** continue;
                                }
                                case 90498394: {
                                    ** continue;
                                }
                                {
                                    case -330164391: {
                                        var5_6 ^= var6_5 ^ -1396202274;
                                        break block20;
                                    }
                                }
                            }
                            break;
                        }
                        var6_5 = (var4_4 | var7_3) ^ 381982796;
                        ** GOTO lbl103
                        {
                            case -75310346: {
                                v0 = false;
                                break block53;
                            }
                        }
                        var6_5 = (var4_4 | var7_3) ^ -99275138;
                        ** GOTO lbl4
                    }
                    var5_6 = (var4_4 | var7_3) ^ 269076999;
                    var6_5 = (var4_4 | var7_3) ^ 1838742096;
                    ** GOTO lbl103
                }
                var6_5 = (var4_4 | var7_3) ^ -1028973001;
                ** while (true)
lbl134:
                // 1 sources

                while (true) {
                    var6_5 = (var4_4 | var7_3) ^ 1780214604;
                    ** GOTO lbl4
                    break;
                }
            }
            var6_5 = (var4_4 | var7_3) ^ -901846554;
            ** GOTO lbl4
            {
                case 1045216962: {
                    var5_6 ^= var6_5 ^ -981150771;
                    var6_5 = (var4_4 | var7_3) ^ 1929740258;
                    ** GOTO lbl-1000
                }
            }
            var6_5 = (var4_4 | var7_3) ^ 1446119349;
            ** GOTO lbl4
            {
                case -481026499: {
                    ** continue;
                }
            }
        }
        var5_6 ^= 171641171;
        ** while (true)
        var3_7 = v0;
        var6_5 = (var4_4 | var7_3) ^ 1650441016;
        ** GOTO lbl4
        {
            ** case -1428838592:
        }
lbl155:
        // 1 sources

        var5_6 ^= var6_5 ^ 48365616;
        ** while (true)
        {
            case 513618347: {
                this.h = true;
                ** continue;
            }
        }
        var6_5 = (var4_4 | var7_3) ^ 1994623196;
        ** while (true)
        {
            ** case -668701562:
        }
lbl163:
        // 1 sources

        --this.d;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void QT(class_310 var1_1, double var2_2) {
        var8_3 = -1211677481;
        var5_4 = gm.g & -1211677481 ^ 2035329902;
        var7_5 = 0;
        var6_6 = (var5_4 | var8_3) ^ 680332001;
        var7_5 = (var5_4 | var8_3) ^ 1739880715;
        ** GOTO lbl111
lbl7:
        // 1 sources

        while (true) {
            var7_5 = (var5_4 | var8_3) ^ -136703952;
            ** GOTO lbl111
            while (true) {
                var7_5 = (var5_4 | var8_3) ^ 1968109110;
                ** GOTO lbl32
                break;
            }
lbl13:
            // 1 sources

            while (true) {
                var7_5 = (var5_4 | var8_3) ^ -1539179399;
                ** GOTO lbl111
lbl16:
                // 10 sources

                while (true) {
                    var7_5 = (var5_4 | var8_3) ^ 1966223509;
                    ** GOTO lbl111
lbl19:
                    // 2 sources

                    while (true) {
                        var6_6 ^= 529472062;
                        var4_7 = v0;
                        var7_5 = (var5_4 | var8_3) ^ -1467882851;
                        if (true) ** GOTO lbl32
                        break;
                    }
                    break;
                }
                break;
            }
            break;
        }
lbl24:
        // 1 sources

        while (true) {
            var7_5 = (var5_4 | var8_3) ^ 1336716043;
            ** GOTO lbl111
lbl27:
            // 1 sources

            while (true) {
                var7_5 = (var5_4 | var8_3) ^ -668004163;
                if (true) ** GOTO lbl111
                break;
            }
            break;
        }
        block54: while (true) {
            var7_5 = (var5_4 | var8_3) ^ 1805888668;
lbl32:
            // 3 sources

            block55: while (true) {
                switch (var7_5) {
                    case 1730861969: {
                        var6_6 ^= var7_5 ^ 73940531;
                        ** break;
                    }
                    case -1804319901: {
                        var6_6 ^= var7_5 ^ 588619151;
                        var7_5 = (var5_4 | var8_3) ^ -1913958861;
                        continue block55;
                    }
                    case -1775486333: {
                        this.a = 0;
                        var7_5 = (var5_4 | var8_3) ^ 1117600829;
                        continue block55;
                    }
                    case -1969677879: {
                        var6_6 ^= var7_5 ^ -1398029493;
                        var7_5 = (var5_4 | var8_3) ^ -704535316;
                        continue block55;
                    }
                    case -2028134790: {
                        if (++this.a < gm.QQ((var6_6 | var7_5 ^ 819616429) ^ (var7_5 ^ -445334706), (var5_4 | var7_5 ^ 819616429) ^ ((var6_6 | var7_5 ^ 819616429) ^ (var7_5 ^ -1471076890)))) continue block54;
                        var7_5 = (var5_4 | var8_3) ^ 1454040211;
                        continue block55;
                    }
                    case 1976694185: {
                        var6_6 ^= var7_5 ^ 440886137;
                        var7_5 = (var5_4 | var8_3) ^ 1778111868;
                        continue block55;
                    }
                    case -1119169598: {
                        var6_6 ^= var7_5 ^ -954044961;
                        ** GOTO lbl90
                    }
                    case -1232314733: {
                        this.l = true;
                        continue block54;
                    }
                    case -1681801666: {
                        var6_6 ^= var7_5 ^ -736831391;
                        var7_5 = (var5_4 | var8_3) ^ -447670854;
                        continue block55;
                    }
                    case -246546969: {
                        var6_6 ^= var7_5 ^ -642030882;
                        ** GOTO lbl86
                    }
                    case 1734966292: {
                        this.l = false;
                        ** GOTO lbl84
                    }
                    case 1848580530: {
                        if (var4_7) ** continue;
                        ** GOTO lbl88
                    }
                    case 701909779: {
                        if (this.l) {
                            var7_5 = (var5_4 | var8_3) ^ -1728236434;
                            continue block55;
                        }
                        var7_5 = (var5_4 | var8_3) ^ 244978200;
                        ** GOTO lbl91
                    }
lbl82:
                    // 1 sources

                    var7_5 = (var5_4 | var8_3) ^ -443151115;
                    ** GOTO lbl91
lbl84:
                    // 1 sources

                    var7_5 = (var5_4 | var8_3) ^ 1679184321;
                    ** GOTO lbl91
lbl86:
                    // 1 sources

                    var7_5 = (var5_4 | var8_3) ^ 2026566021;
                    ** GOTO lbl91
lbl88:
                    // 1 sources

                    var7_5 = (var5_4 | var8_3) ^ -1979311530;
                    ** GOTO lbl91
lbl90:
                    // 1 sources

                    var7_5 = (var5_4 | var8_3) ^ -1732340757;
lbl91:
                    // 7 sources

                    default: {
                        continue block55;
                    }
                    case 1465257314: {
                        var6_6 ^= var7_5 ^ -218252928;
                        var7_5 = (var5_4 | var8_3) ^ -1845954995;
                        continue block55;
                    }
                    case -1451422868: {
                        var7_5 = (var5_4 | var8_3) ^ 1230745964;
                        continue block55;
                    }
                    case 1916576204: {
                        return;
                    }
                    case 440525578: {
                        return;
                    }
                    case 445053509: 
                }
                break;
            }
            break;
        }
        return;
        block56: while (true) {
            var7_5 = (var5_4 | var8_3) ^ -826929465;
            if (true) ** GOTO lbl111
            block57: while (true) {
                var7_5 = (var5_4 | var8_3) ^ -1971385810;
lbl111:
                // 8 sources

                block58: while (true) {
                    block60: {
                        switch (var7_5) {
                            case -2064784154: {
                                if (this.h) ** GOTO lbl16
                                var7_5 = (var5_4 | var8_3) ^ -957707243;
                                continue block58;
                            }
                            case 516033850: {
                                if (!this.f) ** GOTO lbl16
                                var7_5 = (var5_4 | var8_3) ^ 1612004140;
                                continue block58;
                            }
                            case 1166732549: {
                                v0 = false;
                                ** GOTO lbl19
                            }
                            case -377813148: {
                                if (var1_1.field_1724.field_5976) ** GOTO lbl16
                                var7_5 = (var5_4 | var8_3) ^ -388103411;
                                continue block58;
                            }
                            case -1614621485: {
                                var6_6 ^= var7_5 ^ 1306552086;
                                ** break;
                            }
                            case -288064290: {
                                var6_6 ^= var7_5 ^ 1207348449;
                                var7_5 = (var5_4 | var8_3) ^ -283718813;
                                continue block58;
                            }
                            case 960324586: {
                                var7_5 = (var5_4 | var8_3) ^ -1626219581;
                                continue block58;
                            }
                            case 1623602236: {
                                if (this.j) ** GOTO lbl16
                                continue block57;
                            }
                            case -1813818355: {
                                if (this.i) ** GOTO lbl16
                                continue block56;
                            }
                            case 1974003153: {
                                var6_6 ^= var7_5 ^ 359275563;
                                var7_5 = (var5_4 | var8_3) ^ 1053049095;
                                continue block58;
                            }
                            case -666963825: {
                                var6_6 ^= -769477691;
                                if (!this.a.allowSprinting()) ** GOTO lbl16
                                ** continue;
                            }
                            case 135135183: {
                                var7_5 = (var5_4 | var8_3) ^ 380430491;
                                continue block58;
                            }
                            case -1738303756: {
                                var7_5 = (var5_4 | var8_3) ^ -1943607625;
                                continue block58;
                            }
                            case -1334098700: {
                                var7_5 = (var5_4 | var8_3) ^ 1815395314;
                                continue block58;
                            }
                            case -372012031: {
                                if (!this.d) ** GOTO lbl16
                                ** GOTO lbl183
                            }
                            case -1964646550: {
                                var6_6 ^= var7_5 ^ 1456944635;
                                var7_5 = (var5_4 | var8_3) ^ -1168309510;
                                continue block58;
                            }
                            case 1945176392: {
                                var6_6 ^= var7_5 ^ 32274369;
                                var7_5 = (var5_4 | var8_3) ^ -518659387;
                                continue block58;
                            }
                            case 386526450: {
                                var6_6 ^= var7_5 ^ -885324189;
                                ** continue;
                            }
                            case -1055674632: {
                                var6_6 ^= 1623390714;
                                ** GOTO lbl190
                            }
                            case 828498232: {
                                var7_5 = (var5_4 | var8_3) ^ 2067401497;
                                continue block58;
                            }
lbl181:
                            // 1 sources

                            var7_5 = (var5_4 | var8_3) ^ 669589360;
                            ** GOTO lbl184
lbl183:
                            // 1 sources

                            var7_5 = (var5_4 | var8_3) ^ 717908025;
lbl184:
                            // 3 sources

                            default: {
                                continue block58;
                            }
                            case 281093276: {
                                var6_6 ^= -1457336257;
                                if (var1_1.field_1724.method_5799()) ** GOTO lbl16
                                ** continue;
                            }
lbl190:
                            // 1 sources

                            if (!(Math.abs(var2_2) < 0.45)) ** GOTO lbl16
                            break block60;
                            case 1536562054: {
                                var7_5 = (var5_4 | var8_3) ^ 369386494;
                                continue block58;
                            }
                            case -1314243584: {
                                if (!this.a) ** break;
                                ** continue;
                                ** continue;
                            }
                            case -719484986: {
                                var7_5 = (var5_4 | var8_3) ^ 1316869119;
                                continue block58;
                            }
                            case 670629698: 
                        }
                        v0 = true;
                        ** continue;
                    }
                    var7_5 = (var5_4 | var8_3) ^ 285446945;
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void QU(class_243 var1_1) {
        var7_2 = 2140630990;
        var4_3 = gm.g & 2140630990 ^ 44450729;
        var6_4 = 0;
        var5_5 = (var4_3 | var7_2) ^ 1580115973;
        var6_4 = (var4_3 | var7_2) ^ -1149740833;
        if (true) ** GOTO lbl66
        block45: while (true) {
            var6_4 = (var4_3 | var7_2) ^ -644667774;
            ** GOTO lbl66
lbl10:
            // 1 sources

            while (true) {
                var6_4 = (var4_3 | var7_2) ^ 2054834467;
                ** GOTO lbl66
lbl13:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ -1358461697;
                    if (true) ** GOTO lbl66
                    break;
                }
                break;
            }
            block48: while (true) {
                var6_4 = (var4_3 | var7_2) ^ 416104664;
                ** GOTO lbl66
lbl19:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 1583283275;
                    ** GOTO lbl66
                    break;
                }
lbl22:
                // 1 sources

                block50: while (true) {
                    switch (var6_4) {
                        case -1081050363: {
                            var5_5 ^= var6_4 ^ 1824821675;
                            ** break;
                        }
                        case 654369246: {
                            if (!(var2_6 >= 0.22)) ** GOTO lbl52
                            ** GOTO lbl44
                        }
lbl30:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ 29473686;
                        ** GOTO lbl42
                        case -134145114: {
                            var5_5 ^= var6_4 ^ 727052552;
                            ** GOTO lbl46
                        }
                        case 2121716857: {
                            this.a = var1_1;
                            var6_4 = (var4_3 | var7_2) ^ -2018085815;
                            ** GOTO lbl42
                        }
                        case -262849632: {
                            var5_5 ^= var6_4 ^ -1396402948;
                            var6_4 = (var4_3 | var7_2) ^ 1488424497;
                        }
lbl42:
                        // 4 sources

                        default: {
                            continue block50;
                        }
lbl44:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ -1071180566;
                        continue block50;
lbl46:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ -717181829;
                        continue block50;
                        case 1722780607: {
                            return;
                        }
                        case -1426603116: {
                            this.c = 0;
lbl52:
                            // 2 sources

                            var6_4 = (var4_3 | var7_2) ^ 2071905450;
                            continue block50;
                        }
                        case 80325445: 
                    }
                    var5_5 ^= var6_4 ^ -387099057;
                    var6_4 = (var4_3 | var7_2) ^ 421061712;
                    continue;
                    break;
                }
                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 2118581561;
                    if (true) ** GOTO lbl66
                    break;
                }
                block52: while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 18969136;
                    if (true) ** GOTO lbl66
                    block53: while (true) {
                        var6_4 = (var4_3 | var7_2) ^ -1681623751;
lbl66:
                        // 9 sources

                        block54: while (true) {
                            switch (var6_4) {
                                case -793711856: {
                                    this.a = null;
                                    var6_4 = (var4_3 | var7_2) ^ 2040643683;
                                    continue block54;
                                }
                                case -325736474: {
                                    return;
                                }
                                case -903434661: {
                                    if (this.a != null) ** continue;
                                    var6_4 = (var4_3 | var7_2) ^ 246425733;
                                    continue block54;
                                }
                                case 832857268: {
                                    if (this.c < gm.QQ((var5_5 | var6_4 ^ 1311968122) ^ (var6_4 ^ -741482344), (var4_3 | var6_4 ^ 1311968122) ^ ((var5_5 | var6_4 ^ 1311968122) ^ (var6_4 ^ -804235763)))) {
                                        var6_4 = (var4_3 | var7_2) ^ -2001984889;
                                        continue block54;
                                    }
                                    ** GOTO lbl161
                                }
                                case 2130435573: {
                                    var5_5 ^= -603496868;
                                    ** GOTO lbl158
                                }
                                case -622407347: {
                                    ++this.c;
                                    ** GOTO lbl148
                                }
                                case -1507571347: {
                                    if (this.j) continue block53;
                                    var6_4 = (var4_3 | var7_2) ^ 1555549432;
                                    continue block54;
                                }
                                case -1853774783: {
                                    if (!this.b) {
                                        continue block53;
                                    }
                                    ** GOTO lbl133
                                }
                                case -611010348: {
                                    if (!this.d) {
                                        var6_4 = (var4_3 | var7_2) ^ -684143496;
                                        continue block54;
                                    }
                                    ** GOTO lbl133
                                }
                                case -117722689: {
                                    this.c = 0;
                                    ** break;
                                }
                                case -462218538: {
                                    var5_5 ^= var6_4 ^ 709364855;
                                    ** continue;
                                }
                                case -1807067792: {
                                    if (!this.a) {
                                        ** continue;
                                    }
                                    ** GOTO lbl133
                                }
                                case 32608982: {
                                    var5_5 ^= var6_4 ^ 1985881148;
                                    ** GOTO lbl156
                                }
                                case -1651707371: {
                                    var5_5 ^= var6_4 ^ -1813490663;
                                    var6_4 = (var4_3 | var7_2) ^ -2025005488;
                                    ** GOTO lbl134
                                }
                                case -1544062646: {
                                    var5_5 ^= var6_4 ^ 1931985831;
                                    ** continue;
                                }
                                case 769272799: {
                                    var5_5 ^= var6_4 ^ -958200953;
                                    ** GOTO lbl141
                                }
lbl125:
                                // 1 sources

                                var6_4 = (var4_3 | var7_2) ^ -966736503;
                                ** GOTO lbl134
                                case 2073345091: {
                                    var5_5 ^= var6_4 ^ 1495962907;
                                    var6_4 = (var4_3 | var7_2) ^ 21803546;
                                    ** GOTO lbl134
                                }
                                case -722272552: {
                                    if (!this.e) continue block52;
lbl133:
                                    // 4 sources

                                    var6_4 = (var4_3 | var7_2) ^ 1382892592;
                                }
lbl134:
                                // 5 sources

                                default: {
                                    continue block54;
                                }
                                case -993052880: {
                                    ** GOTO lbl154
                                }
                                case -149205656: {
                                    var5_5 ^= var6_4 ^ -1715867402;
                                    ** GOTO lbl146
                                }
lbl141:
                                // 1 sources

                                var6_4 = (var4_3 | var7_2) ^ -1248738892;
                                continue block54;
                                case 1736060727: {
                                    this.c = 0;
                                    ** GOTO lbl193
                                }
lbl146:
                                // 1 sources

                                var6_4 = (var4_3 | var7_2) ^ -1826437111;
                                continue block54;
lbl148:
                                // 1 sources

                                var6_4 = (var4_3 | var7_2) ^ -1433834807;
                                continue block54;
                                case -1177048474: {
                                    var5_5 ^= var6_4 ^ -2016272112;
                                    var6_4 = (var4_3 | var7_2) ^ 557183410;
                                    continue block54;
                                }
lbl154:
                                // 1 sources

                                var6_4 = (var4_3 | var7_2) ^ -150174829;
                                continue block54;
lbl156:
                                // 1 sources

                                var6_4 = (var4_3 | var7_2) ^ -1521369438;
                                continue block54;
lbl158:
                                // 1 sources

                                var2_6 = Math.hypot(var1_1.field_1352 - this.a.field_1352, var1_1.field_1350 - this.a.field_1350) + Math.abs(var1_1.field_1351 - this.a.field_1351);
                                var6_4 = (var4_3 | var7_2) ^ -1880992689;
                                ** continue;
lbl161:
                                // 1 sources

                                var6_4 = (var4_3 | var7_2) ^ 69456812;
                                continue block54;
                                case 1320086422: {
                                    this.a = var1_1;
                                    var6_4 = (var4_3 | var7_2) ^ -499409414;
                                    continue block54;
                                }
                                case 1896302442: {
                                    var5_5 ^= var6_4 ^ -1047643469;
                                    var6_4 = (var4_3 | var7_2) ^ 823755897;
                                    continue block54;
                                }
                                case 587244311: {
                                    var6_4 = (var4_3 | var7_2) ^ -1541155013;
                                    continue block54;
                                }
                                case -1466981481: {
                                    var6_4 = (var4_3 | var7_2) ^ -335725921;
                                    continue block54;
                                }
                                case 1585618525: {
                                    return;
                                }
                                case 102150028: {
                                    var5_5 ^= var6_4 ^ -1924657870;
                                    continue block48;
                                }
                                case -2000950148: {
                                    var5_5 ^= var6_4 ^ 660092836;
                                    continue block45;
                                }
                                case 568955812: {
                                    return;
                                }
                                case 2123767263: {
                                    var6_4 = (var4_3 | var7_2) ^ -298398802;
                                    continue block54;
                                }
                                case 97330892: {
                                    var6_4 = (var4_3 | var7_2) ^ -1421504201;
                                    continue block54;
                                }
lbl193:
                                // 1 sources

                                var6_4 = (var4_3 | var7_2) ^ -599779675;
                                continue block54;
                                case -717355738: 
                            }
                            var5_5 ^= var6_4 ^ -519605620;
                            var6_4 = (var4_3 | var7_2) ^ 1309870939;
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean stuck() {
        block38: {
            block37: {
                block35: {
                    block36: {
                        var4_1 = 1910176633;
                        var1_2 = gm.g & 1910176633 ^ -286444985;
                        var3_3 = 0;
                        ** GOTO lbl42
                        block21: while (!this.e) {
                            ** GOTO lbl28
lbl7:
                            // 10 sources

                            block22: while (true) {
                                switch (var3_3) lbl-1000:
                                // 10 sources

                                {
                                    default: {
                                        continue block22;
                                    }
                                    case 321294781: {
                                        continue block21;
                                    }
                                    case -1627920630: {
                                        if (this.a) break block35;
                                        ** break;
                                    }
lbl16:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -825219513;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case 1638531700: {
                                        v0 = false;
                                        break block36;
                                    }
lbl22:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -321295678;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl25:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -613021019;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl28:
                                    // 1 sources

                                    var3_3 = (var1_2 | var4_1) ^ -2109031939;
                                    ** GOTO lbl-1000
lbl30:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -1638532853;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case 613020122: {
                                        if (!this.b) break;
                                        break block35;
                                    }
                                    case -1026990863: {
                                        var2_4 ^= var3_3 ^ 1193953941;
                                        ** continue;
                                    }
                                    case -2093823105: {
                                        if (this.c < gm.QQ((var2_4 | var3_3 ^ -219664378) ^ (var3_3 ^ -378318909), (var1_2 | var3_3 ^ -219664378) ^ ((var2_4 | var3_3 ^ -219664378) ^ (var3_3 ^ 1548772682)))) break;
                                        break;
                                    }
lbl42:
                                    // 1 sources

                                    var2_4 = (var1_2 | var4_1) ^ -2014085614;
                                    var3_3 = (var1_2 | var4_1) ^ -1213619996;
                                    ** GOTO lbl-1000
lbl45:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -1090989293;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case -536738798: {
                                        ** continue;
                                    }
lbl50:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 254469679;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case 825220408: {
                                        var3_3 = (var1_2 | var4_1) ^ 1627921525;
                                        ** GOTO lbl-1000
                                    }
                                }
                                break;
                            }
                        }
                        break block35;
lbl57:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ 1886128661;
                        ** GOTO lbl7
                        {
                            case -254468784: {
                                break;
                            }
                        }
lbl61:
                        // 4 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1026992014;
                            ** GOTO lbl7
                            break;
                        }
                        {
                            case 1090988140: {
                                if (this.d) break block35;
                                ** continue;
                            }
                        }
lbl67:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1853643903;
                            ** GOTO lbl7
                            break;
                        }
                    }
lbl71:
                    // 2 sources

                    while (true) {
                        var2_4 ^= 1239754212;
                        break block37;
                        break;
                    }
                    {
                        case 1213619099: {
                            break;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ 536739693;
                    ** GOTO lbl7
                }
                var3_3 = (var1_2 | var4_1) ^ 1348581614;
                ** GOTO lbl7
                {
                    case -1853643008: {
                        if (!this.k) break;
                        ** continue;
                    }
                    case 1864118877: {
                        v0 = true;
                        ** continue;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 915272055;
                ** GOTO lbl7
lbl89:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1648346935;
                    ** GOTO lbl7
                    break;
                }
lbl92:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1864120030;
                    ** GOTO lbl7
                    break;
                }
                {
                    case 2109031042: {
                        ** continue;
                    }
                    case -1886129814: {
                        ** continue;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 1943810791;
                ** GOTO lbl7
                {
                    case -1648346040: {
                        break block38;
                    }
                    case -1943811688: {
                        if (!this.j) ** break;
                        ** continue;
                        ** continue;
                    }
                    case -1348582511: {
                        var2_4 ^= var3_3 ^ 712857077;
                        ** continue;
                    }
                    ** case -915273208:
                }
lbl111:
                // 1 sources

                var2_4 ^= var3_3 ^ 1988346129;
                ** while (true)
            }
            return v0;
        }
        var3_3 = (var1_2 | var4_1) ^ 2093821952;
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void clearStuck() {
        int n2 = 544344490;
        int n3 = g & 0x207209AA ^ 0xCFF0C5F6;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x5AA60B4D;
        n4 = (n3 | n2) ^ 0xA9AED48C;
        boolean bl2 = true;
        block9: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = (n3 | n2) ^ 0x237F1ED6;
            }
            block10: while (true) {
                switch (n4) {
                    default: {
                        continue block10;
                    }
                    case -218517970: {
                        n5 ^= n4 ^ 0xB264ACD5;
                        n4 = (n3 | n2) ^ 0x737C3E91;
                        continue block10;
                    }
                    case -863120600: {
                        n5 ^= n4 ^ 0x34C35984;
                        n4 = (n3 | n2) ^ 0x158D632C;
                        continue block10;
                    }
                    case 102245683: {
                        n5 ^= n4 ^ 0xA921605D;
                        n4 = (n3 | n2) ^ 0xDEB51D6B;
                        continue block10;
                    }
                    case 826790037: {
                        this.a = null;
                        n4 = (n3 | n2) ^ 0x1D0B63D0;
                        continue block10;
                    }
                    case -1668353169: {
                        this.c = 0;
                        continue block9;
                    }
                    case 1180440946: {
                        n4 = (n3 | n2) ^ 0xE9EAE8CD;
                        continue block10;
                    }
                    case -92295470: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean sprinting() {
        var1_1 = gm.g & -1277357815 ^ -289603071;
        var3_2 = 0;
        var2_3 = (var1_1 | -1277357815) ^ -256934048;
        var3_2 = (var1_1 | -1277357815) ^ -1238110669;
        if (true) ** GOTO lbl8
        block5: while (true) {
            var3_2 = (var1_1 | -1277357815) ^ 1301941077;
lbl8:
            // 2 sources

            block6: while (true) {
                switch (var3_2) {
                    default: {
                        continue block6;
                    }
                    case 1238302010: {
                        ** break;
                    }
                    case -1092196520: {
                        var2_3 ^= var3_2 ^ -1789984891;
                        continue block5;
                    }
lbl17:
                    // 1 sources

                    var3_2 = (var1_1 | -1277357815) ^ 1092318289;
                    continue block6;
                    case -1301866404: 
                }
                break;
            }
            break;
        }
        return this.l;
    }

    /*
     * Enabled aggressive block sorting
     */
    boolean forwardHeld() {
        int n2 = g & 0x7BF9F270 ^ 0x8CAF6CE4;
        int n3 = 0;
        int n4 = (n2 | 0x7BF9F270) ^ 0x5E99B182;
        n3 = (n2 | 0x7BF9F270) ^ 0x613DA9AC;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 286082647: {
                    return this.d;
                }
                case 397149837: {
                    n4 ^= n3 ^ 0x77076819;
                    n3 = (n2 | 0x7BF9F270) ^ 0xEEF2B8A3;
                    continue block5;
                }
                case -1631430824: 
            }
            n3 = (n2 | 0x7BF9F270) ^ 0xE853F879;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    boolean backHeld() {
        int n2 = g & 0xEA887CC2 ^ 0x3198383B;
        int n3 = 0;
        int n4 = (n2 | 0xEA887CC2) ^ 0xAB8DC951;
        n3 = (n2 | 0xEA887CC2) ^ 0xD1DDA108;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1628156332: {
                    n4 ^= n3 ^ 0xE1E669C5;
                    n3 = (n2 | 0xEA887CC2) ^ 0xFAF318AC;
                    continue block5;
                }
                case 709221875: {
                    n3 = (n2 | 0xEA887CC2) ^ 0x9A93CD57;
                    continue block5;
                }
                case 23815255: 
            }
            break;
        }
        return this.a;
    }

    /*
     * Exception decompiling
     */
    int strafeDirection() {
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
    static double strafeEngageThreshold() {
        int n2 = g & 0x91D78744 ^ 0xDE2BEEC2;
        int n3 = 0;
        int n4 = (n2 | 0x91D78744) ^ 0xA1B0F7BA;
        n3 = (n2 | 0x91D78744) ^ 0xFCACA858;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1629550184: {
                    n4 ^= n3 ^ 0xB36398F2;
                    n3 = (n2 | 0x91D78744) ^ 0x6936B029;
                    continue block5;
                }
                case -1228316689: {
                    return 0.45;
                }
                case 592660382: 
            }
            n3 = (n2 | 0x91D78744) ^ 0x4120E65E;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static double strafeReleaseThreshold() {
        int n2 = g & 0x9A858C3D ^ 0x2C955F42;
        int n3 = 0;
        int n4 = (n2 | 0x9A858C3D) ^ 0xF554DCDA;
        n3 = (n2 | 0x9A858C3D) ^ 0x50E7D4CE;
        while (true) {
            switch (n3) {
                case 369760200: {
                    n4 ^= n3 ^ 0x84209016;
                    n3 = (n2 | 0x9A858C3D) ^ 0xB59B6D6D;
                    break;
                }
                case 185512466: {
                    return 0.2;
                }
                case -294515791: {
                    n3 = (n2 | 0x9A858C3D) ^ 0xA89FC8B7;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static double forwardReleaseThreshold() {
        int n2 = g & 0xD77E31DC ^ 0x21C804D8;
        int n3 = 0;
        int n4 = (n2 | 0xD77E31DC) ^ 0x70E943D1;
        n3 = (n2 | 0xD77E31DC) ^ 0x47DB2AF0;
        block5: while (true) {
            switch (n3) {
                case -1339744468: {
                    n3 = (n2 | 0xD77E31DC) ^ 0xEA290AC3;
                    continue block5;
                }
                case 500645663: {
                    n4 ^= n3 ^ 0x8ACA35BD;
                    n3 = (n2 | 0xD77E31DC) ^ 0x6E0AC72E;
                }
                default: {
                    continue block5;
                }
                case -1712000270: 
            }
            break;
        }
        return 0.12;
    }

    /*
     * Exception decompiling
     */
    public String describe() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [55[UNCONDITIONALDOLOOP]], but top level block is 104[SIMPLE_IF_TAKEN]
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
}

