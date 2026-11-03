/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.lwjgl.opengl.GL11
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class jF {
    private int a;
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private static final int[] c;
    private int g;
    private boolean b;
    private int h;
    private int i;
    private int j;
    private boolean c;
    private int k;
    private boolean d;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    public static final int x;
    private boolean e;
    private int s;
    private int t;
    private final int[] a;
    private int u;
    private int v;
    private int w;
    private final int[] b;
    private boolean f;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private jF() {
        var4_1 = 2030631586;
        var1_2 = jF.x & 2030631586 ^ -1603996256;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -554976876;
        var2_4 ^= 1237045168;
        super();
        var3_3 = (var1_2 | var4_1) ^ 1301426169;
        if (true) ** GOTO lbl31
        block8: while (true) {
            switch (var3_3) {
                case 275223553: {
                    var2_4 ^= var3_3 ^ -1400097326;
                    ** break;
                }
                case -1851435020: {
                    var2_4 ^= var3_3 ^ -1830196676;
                    var3_3 = (var1_2 | var4_1) ^ -548562151;
                    continue block8;
                }
                case 639722683: {
                    this.b = new int[4];
                    var3_3 = (var1_2 | var4_1) ^ -385127517;
                    continue block8;
                }
lbl22:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -769256041;
                ** GOTO lbl31
                case -1595965933: {
                    this.a = new int[4];
                    var3_3 = (var1_2 | var4_1) ^ 1758046294;
                    ** GOTO lbl31
                }
                case -1258368933: {
                    var2_4 ^= var3_3 ^ -49217030;
                    var3_3 = (var1_2 | var4_1) ^ 1504936369;
                }
lbl31:
                // 5 sources

                default: {
                    continue block8;
                }
                case 726329909: 
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public static jF capture() {
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
    static {
        block46: {
            block41: {
                block48: {
                    block44: {
                        block50: {
                            block43: {
                                block47: {
                                    block45: {
                                        block42: {
                                            block49: {
                                                break block49;
lbl1:
                                                // 1 sources

                                                while (true) {
                                                    var7_1 = var8 ^ -1208536717;
                                                    break block41;
                                                    break;
                                                }
lbl4:
                                                // 1 sources

                                                while (true) {
                                                    var6_8 ^= -2038023220;
                                                    ** GOTO lbl49
                                                    break;
                                                }
lbl7:
                                                // 1 sources

                                                while (true) {
                                                    var7_1 = var8 ^ -976703166;
                                                    break block41;
                                                    break;
                                                }
lbl10:
                                                // 1 sources

                                                while (true) {
                                                    var5_7 = (var0_2[var3_5] & (((var6_8 ^= 1719160682) | var8) ^ -220277214)) << ((var6_8 | var8) ^ -220277051) | (var0_2[var3_5 + 1] & ((var6_8 | var8) ^ -220277214)) << ((var6_8 | var8) ^ -220277043) | (var0_2[var3_5 + 2] & ((var6_8 | var8) ^ -220277214)) << ((var6_8 | var8) ^ -220277035) | var0_2[var3_5 + 3] & ((var6_8 | var8) ^ -220277214);
                                                    ** continue;
                                                    break;
                                                }
lbl13:
                                                // 1 sources

                                                while (true) {
                                                    jF.c[var4_6] = var5_7 ^= var2_4;
                                                    ** GOTO lbl57
                                                    break;
                                                }
                                            }
                                            var8 = -757153063;
                                            jF.x = mK.a(MethodHandles.lookup().lookupClass(), -1517674196);
                                            var7_1 = 0;
                                            break block50;
lbl21:
                                            // 1 sources

                                            while (true) {
                                                var7_1 = var8 ^ 1972868583;
                                                break block42;
                                                break;
                                            }
lbl24:
                                            // 1 sources

                                            while (true) {
                                                var7_1 = var8 ^ -591521974;
                                                break block43;
                                                break;
                                            }
                                        }
lbl28:
                                        // 2 sources

                                        block26: while (true) {
                                            switch (var7_1) lbl-1000:
                                            // 3 sources

                                            {
                                                while (true) {
                                                    default: {
                                                        continue block26;
                                                    }
                                                    break;
                                                }
                                                case -1279120009: {
                                                    var3_5 = 0;
                                                    break block44;
                                                }
lbl36:
                                                // 1 sources

                                                while (true) {
                                                    var3_5 += 4;
                                                    if (++var4_6 < var1_3) break block45;
                                                    break block46;
                                                    break;
                                                }
lbl40:
                                                // 1 sources

                                                while (true) {
                                                    var4_6 = 0;
                                                    break block45;
                                                    break;
                                                }
lbl43:
                                                // 1 sources

                                                while (true) {
                                                    var6_8 ^= var7_1 ^ -661283535;
                                                    ** GOTO lbl73
                                                    break;
                                                }
lbl46:
                                                // 1 sources

                                                while (true) {
                                                    var6_8 ^= 1444645616;
                                                    ** GOTO lbl65
                                                    break;
                                                }
lbl49:
                                                // 1 sources

                                                var0_2 = "\u00f7N<\u00e5\"\u00e5S\u00d1\u00e2\u00e2T.\u00d9*u.s\u00fdTUy\u00ban\u001b\u001e\u000f\u00acM\u000f|\u0001\u0094\u00d7#\u00d2u\u00f34\u00fdO\u0082\r\u0097g\u00c6_\u00ebyF\u0016\u00e1\u00d2\u00f9\u0010\u00db\u00d9.-Z5j\u001f~\u000f\u00ff\u0011\u0010\u00fd\u00f9H\u00f8\u00ab\u00c9\u00d2[\u0086\u0012\u0019zE5\u0011\u00d7\u00b6\u00e7\u00cf\u00e5\u00b3M\u00e7\u00cb\u00ef\u00ba\u00bf\u00c0_\u0090?\u0087N*\u00b3%2\u00d0\u00c2h\u00e7\u0095\u00d0\u00c4\u00cf\u0011\u0084i\u009a\u00d5\u001e\u0087\u00cf\u00ac\u0013h!\\\u00b4\u00a6\u0087C\u00caC\u00c1J\u00023\u00f1\u0011\u00f5\u00fa7\u00a9\u00b0\u0083@|ih\\\u00ec\u00e2\u00cb\u0005\u008as\u00fb\u00aaA\u00e0\u001d]=.L(P\u00e40\u00a2\u009e\u0088\u00f4\u008c\u001e([\u0093".getBytes("ISO-8859-1");
                                                ** continue;
lbl51:
                                                // 1 sources

                                                while (true) {
                                                    var7_1 = var8 ^ 1629286318;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
                                                case 143058684: {
                                                    var6_8 ^= var7_1 ^ 1475727712;
                                                    ** continue;
                                                }
lbl57:
                                                // 1 sources

                                                var7_1 = var8 ^ 1134649241;
                                                break block41;
                                                case -1488365762: {
                                                    jF.c = new int[var1_3];
                                                    break block47;
                                                }
lbl62:
                                                // 1 sources

                                                while (true) {
                                                    var7_1 = var8 ^ 949258567;
                                                    break block41;
                                                    break;
                                                }
lbl65:
                                                // 1 sources

                                                var1_3 = var0_2.length / 4;
                                                var7_1 = var8 ^ -870209329;
                                                ** continue;
lbl68:
                                                // 1 sources

                                                while (true) {
                                                    var6_8 ^= var7_1 ^ 1253817521;
                                                    ** continue;
                                                    break;
                                                }
lbl71:
                                                // 1 sources

                                                return;
lbl73:
                                                // 1 sources

                                                var7_1 = var8 ^ -672175140;
                                                break block41;
                                                case 520055318: {
                                                    var6_8 ^= var7_1 ^ 1873006831;
                                                    break block26;
                                                }
                                            }
                                            break;
                                        }
                                        ** while (true)
lbl79:
                                        // 1 sources

                                        while (true) {
                                            var6_8 ^= var7_1 ^ 1447640726;
                                            break block48;
                                            break;
                                        }
lbl82:
                                        // 1 sources

                                        while (true) {
                                            var6_8 ^= var7_1 ^ 1782304485;
                                            ** continue;
                                            break;
                                        }
                                    }
                                    ** while (true)
                                }
                                var7_1 = var8 ^ -631757787;
                                ** while (true)
lbl90:
                                // 1 sources

                                while (true) {
                                    var2_4 = (var6_8 | var7_1 ^ 328798533) ^ (var7_1 ^ -1235802511) ^ jF.x;
                                    ** continue;
                                    break;
                                }
                            }
lbl94:
                            // 3 sources

                            block39: while (true) {
                                switch (var7_1) {
                                    default: {
                                        continue block39;
                                    }
                                    case 241227155: {
                                        ** continue;
                                    }
                                    case -1052257380: {
                                        ** continue;
                                    }
                                    case 836307923: 
                                }
                                ** continue;
                                break;
                            }
                        }
                        var6_8 = 1571991792;
                        var7_1 = var8 ^ -486029046;
                        ** GOTO lbl94
                    }
                    var6_8 ^= 756661387;
                    ** while (true)
                }
                var7_1 = var8 ^ 328798533;
                ** while (true)
            }
lbl115:
            // 2 sources

            block40: while (true) {
                switch (var7_1) {
                    default: {
                        continue block40;
                    }
                    case 387347355: {
                        ** continue;
                    }
                    case 87140613: {
                        ** continue;
                    }
                    case -1853907648: {
                        ** continue;
                    }
                    case 1697248170: {
                        ** continue;
                    }
                    case -364229730: {
                        ** continue;
                    }
                    ** case 1720994474:
lbl130:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        var7_1 = var8 ^ -1270183821;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public void restore() {
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

    private static int Lz(int n2, int n3) {
        int n4 = -927268997;
        int n5 = -1977468517;
        int n6 = c[n2 ^ ((n5 | n4) ^ 0xB4C76966)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xCABABA69;
        n6 -= (n5 | n4) ^ 0xCABA8E87;
        n6 -= (n5 | n4) ^ 0xCABA32D9;
        n6 ^= (n5 | n4) ^ 0xCABAC25C;
        n6 -= (n5 | n4) ^ 0xCABA09D5;
        return n6 ^= (n5 | n4) ^ 0xCABA33CB;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void LA(int var0, boolean var1_1) {
        var5_2 = 979128062;
        var2_3 = jF.x & 979128062 ^ 2060614021;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ -1766408658;
        var4_4 = (var2_3 | var5_2) ^ -1596580908;
        if (true) ** GOTO lbl12
        block11: while (true) {
            var4_4 = (var2_3 | var5_2) ^ 1893695064;
            if (true) ** GOTO lbl12
            block12: while (true) {
                var4_4 = (var2_3 | var5_2) ^ 1404462066;
lbl12:
                // 3 sources

                block13: while (true) {
                    switch (var4_4) {
                        case 167838119: {
                            GL11.glDisable((int)var0);
                            continue block12;
                        }
                        case 694688781: {
                            var3_5 ^= var4_4 ^ -454491170;
                            var4_4 = (var2_3 | var5_2) ^ -1058985508;
                            continue block13;
                        }
                        case 1366589926: {
                            var3_5 ^= var4_4 ^ 933711232;
                            ** GOTO lbl38
                        }
                        case -100628806: {
                            var3_5 ^= var4_4 ^ 1400621202;
                            ** GOTO lbl40
                        }
                        case -636984277: {
                            ** GOTO lbl46
                        }
                        case -656691950: {
                            if (!var1_1) ** GOTO lbl36
                            var4_4 = (var2_3 | var5_2) ^ -2132870843;
                            ** GOTO lbl41
                        }
                        case -575982884: {
                            GL11.glEnable((int)var0);
                            continue block12;
                        }
lbl36:
                        // 1 sources

                        var4_4 = (var2_3 | var5_2) ^ 1247717082;
                        ** GOTO lbl41
lbl38:
                        // 1 sources

                        var4_4 = (var2_3 | var5_2) ^ -1576676627;
                        ** GOTO lbl41
lbl40:
                        // 1 sources

                        var4_4 = (var2_3 | var5_2) ^ -1485484765;
lbl41:
                        // 5 sources

                        default: {
                            continue block13;
                        }
                        case 813750565: {
                            var3_5 ^= var4_4 ^ -1711565043;
                            continue block11;
                        }
lbl46:
                        // 1 sources

                        var4_4 = (var2_3 | var5_2) ^ 732626457;
                        continue block13;
                        case -1170254301: 
                    }
                    break;
                }
                break;
            }
            break;
        }
    }
}

