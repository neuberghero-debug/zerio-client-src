/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 *  net.minecraft.class_3419
 *  org.lwjgl.openal.AL10
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.EnumMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_3419;
import org.lwjgl.openal.AL10;
import z.r.ap;
import z.r.gj;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class fu {
    private static final long a;
    private static long b;
    private static boolean a;
    private static final /* synthetic */ String a;
    private static final Map<ap, Integer> a;
    private static boolean b;
    public static final int b;
    private static int[] a;
    private static final int[] b;
    private static final Map<ap, Long> b;
    private static final int a;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n2 = 1356107426;
        b = mK.a(MethodHandles.lookup().lookupClass(), 1003747960);
        int n3 = 0;
        int n4 = -1896738344;
        n3 = n2 ^ 0x96DE8400;
        boolean bl2 = true;
        block9: while (true) {
            int n5;
            int n6;
            byte[] byArray;
            if (!bl2 || (bl2 = false) || !true) {
                n4 ^= 0x2874D93E;
                n4 ^= 0xDED4D8D6;
                n4 ^= 0x1F4905D1;
                n4 ^= 0xE050A0F9;
                n4 ^= 0x7CB1673;
                n4 ^= 0x8EB661BE;
                int n7 = ((n4 ^= 0x48F4A17B) | n2) ^ 0x1FBDDDA2 ^ b;
                n4 ^= 0x10D8604D;
                fu.b[n5] = ((byArray[n6] & 0xFF) << 24 | ((byArray[n6 + 1] & 0xFF) << 16 | ((byArray[n6 + 2] & 0xFF) << 8 | byArray[n6 + 3] & 0xFF))) ^ n7;
                n5 = n5 + 1;
                int n8 = n6 + 4;
                byArray = byArray;
                n6 = n8;
                n4 ^= 0xD8E8123B;
                if (n8 < byArray.length) continue;
                a = fu.VV(((n4 ^= 0x1299A9D) | n2) ^ 0x8880CDBC, n2 ^ ((n4 | n2) ^ 0x6488271));
                a = -5189082108441875108L << 32 >>> 32 ^ (long)n4 & 0xFFFFFFFFL | (-5189082108441875108L >>> 32 ^ (long)n4 & 0xFFFFFFFFL) << 32;
                a = gj.decode("POyfBY7F7v4ORPXxGfzGBeibltpergRMd3ERyjybwXPbO0F0T+mXUA==", fu.VV((n4 | n2) ^ 0x8880CDBB, n2 ^ ((n4 | n2) ^ 0xF3CFEF32)));
                n3 = n2 ^ 0xD84B75C4;
            }
            block10: while (true) {
                switch (n3) {
                    default: {
                        continue block10;
                    }
                    case -972420446: {
                        n3 = n2 ^ 0x4702C3EA;
                        continue block10;
                    }
                    case 671162603: {
                        n5 = 0;
                        n6 = 0;
                        byArray = "\u00ae\u00a7\u00b1\u00e5\u00a8\u00ce\u0087\u001fQ\u00d8\u00c9\u00a7\u009f\u0017\u00af\u000f\u00a7}R\n\u00c1$iBm]\u00af\u0016 ;\u001c<\u00e0\u00d1\u00125_mQ\u00fd\u009f\b\u0011\u0099\u00cd\u00ec\u00d3\u001a\u0098\u001a\u00cf\u001d".getBytes("ISO-8859-1");
                        b = new int[((n4 ^= 0x68BB1E2D) | n2) ^ 0x50FE8EA6];
                        n4 ^= 0xA6ABB946;
                        continue block9;
                    }
                    case 399920456: {
                        n4 ^= n3 ^ 0xE1E1CC36;
                        n3 = n2 ^ 0x78D5AE49;
                        continue block10;
                    }
                    case 1783538881: {
                        a = (long)new EnumMap(ap.class);
                        n3 = n2 ^ 0x1F5385DC;
                        continue block10;
                    }
                    case 553338106: {
                        b = (long)new EnumMap(ap.class);
                        return;
                    }
                    case -2002781338: {
                        n4 ^= n3 ^ 0x7B77ED85;
                        n3 = n2 ^ 0x3A9A2A63;
                        continue block10;
                    }
                    case 1334250366: 
                }
                n4 ^= n3 ^ 0x1FCD19CC;
                n3 = n2 ^ 0x702FCA58;
            }
            break;
        }
    }

    private static int VV(int n2, int n3) {
        int n4 = -15752470;
        int n5 = -2086021416;
        int n6 = b[n2 ^ ((n5 | n4) ^ 0x80D394BF)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xFFAF566F;
        n6 ^= (n5 | n4) ^ 0xFFAFF7AD;
        n6 += (n5 | n4) ^ 0xFFAF6D86;
        n6 ^= (n5 | n4) ^ 0xFFAFA423;
        n6 -= (n5 | n4) ^ 0xFFAF886A;
        n6 -= (n5 | n4) ^ 0xFFAF2A4D;
        return n6 += (n5 | n4) ^ 0xFFAF6F00;
    }

    /*
     * Exception decompiling
     */
    private fu() {
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
    public static void play(ap var0) {
        block13: {
            block12: {
                var4_1 = -583777454;
                var1_2 = fu.b & -583777454 ^ 107221288;
                var3_3 = 0;
                var2_4 = (var1_2 | var4_1) ^ 1864935592;
                ** GOTO lbl25
lbl6:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -2017867729;
                    var3_3 = (var1_2 | var4_1) ^ 959260684;
                    break block12;
                    break;
                }
lbl10:
                // 1 sources

                return;
            }
lbl13:
            // 3 sources

            block9: while (true) {
                switch (var3_3) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block9;
                        }
                        break;
                    }
                    case -294395304: {
                        ** continue;
                    }
                    case -430343306: {
                        ** continue;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1969338831;
                        ** GOTO lbl-1000
                        break;
                    }
lbl25:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 1486303306;
                    ** continue;
                    case -1441404235: {
                        var2_4 ^= var3_3 ^ -966707261;
                        break block9;
                    }
                    case -1107952268: {
                        fu.play(var0, 1.0f);
                        break block13;
                    }
                }
                break;
            }
            var3_3 = (var1_2 | var4_1) ^ 1652665870;
            ** GOTO lbl13
        }
        var3_3 = (var1_2 | var4_1) ^ 822587682;
        ** while (true)
        {
            ** case -2015141072:
        }
lbl39:
        // 1 sources

        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static void play(ap var0, float var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 112[UNCONDITIONALDOLOOP]
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
    private static float VW() {
        block31: {
            block30: {
                block32: {
                    var5 = 1156612484;
                    var2_1 = fu.b & 1156612484 ^ 2008919698;
                    var4_2 = 0;
                    var3_3 = (var2_1 | var5) ^ -1025512484;
                    var4_2 = (var2_1 | var5) ^ 220299373;
                    break block30;
lbl7:
                    // 1 sources

                    while (true) {
                        var4_2 = (var2_1 | var5) ^ -2055379284;
                        break block30;
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var3_3 ^= var4_2 ^ -1799358607;
                        var4_2 = (var2_1 | var5) ^ -1497840906;
                        break block30;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var0_4 = class_310.method_1551();
                        var4_2 = (var2_1 | var5) ^ -1738708617;
                        break block31;
                        break;
                    }
lbl18:
                    // 1 sources

                    while (true) {
                        var3_3 ^= var4_2 ^ -557728893;
                        var4_2 = (var2_1 | var5) ^ -1769958567;
                        break block31;
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        if (var0_4 == null) ** GOTO lbl31
                        var4_2 = (var2_1 | var5) ^ 1565641620;
                        break block31;
                        break;
                    }
lbl26:
                    // 1 sources

                    while (true) {
                        var4_2 = (var2_1 | var5) ^ 1125303003;
                        break block31;
                        break;
                    }
lbl29:
                    // 1 sources

                    while (true) {
                        if (var0_4.field_1690 != null) break block32;
lbl31:
                        // 2 sources

                        var4_2 = (var2_1 | var5) ^ 10139758;
                        break block31;
                        break;
                    }
lbl33:
                    // 1 sources

                    while (true) {
                        var3_3 ^= var4_2 ^ -438319430;
                        var4_2 = (var2_1 | var5) ^ 817741126;
                        break block31;
                        break;
                    }
lbl37:
                    // 1 sources

                    return 1.0f;
                }
                try {
                    var4_2 = (var2_1 | var5) ^ 323136186;
                    break block31;
lbl43:
                    // 1 sources

                    while (true) {
                        var3_3 ^= var4_2 ^ 96126866;
                        var4_2 = (var2_1 | var5) ^ 203844790;
                        break block31;
                        break;
                    }
lbl47:
                    // 1 sources

                    while (true) {
                        var3_3 ^= 927553115;
                        return var0_4.field_1690.method_71978(class_3419.field_15250);
                    }
                }
                catch (Throwable v0) {
                    var3_3 = (var2_1 | var5) ^ -704370568;
                    var1_5 = v0;
                    var3_3 ^= 1918874932;
                    return 1.0f;
                }
            }
            block28: while (true) {
                switch (var4_2) {
                    default: {
                        continue block28;
                    }
                    case 2061250555: {
                        ** continue;
                    }
                    case -226440902: {
                        ** continue;
                    }
                    ** case -783979168:
lbl65:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        block29: while (true) {
            switch (var4_2) {
                default: {
                    continue block29;
                }
                case -274675999: {
                    ** continue;
                }
                case -511886129: {
                    ** continue;
                }
                case 715940866: {
                    ** continue;
                }
                case 888106317: {
                    ** continue;
                }
                case 2003245048: {
                    ** continue;
                }
                case 1195381456: {
                    ** continue;
                }
                {
                    case 1690240300: {
                        ** continue;
                    }
                    ** case 2077999904:
lbl86:
                    // 1 sources

                    ** continue;
                }
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static void VX() {
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
    private static void VY(ap var0, short[] var1_1) {
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
    private static int VZ() {
        block39: {
            var8 = -1543081605;
            var7_1 = 974568766;
            var4_2 = fu.b & -1543081605 ^ 384938193;
            var6_3 = 0;
            ** GOTO lbl88
lbl6:
            // 1 sources

            while (true) {
                var6_3 = (var4_2 | var8) ^ 891174417;
                break block39;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var6_3 = (var4_2 | var8) ^ -1702244677;
                ** GOTO lbl45
lbl12:
                // 1 sources

                while (true) {
                    var6_3 = (var4_2 | var8) ^ -611599441;
                    ** GOTO lbl45
                    break;
                }
                break;
            }
lbl15:
            // 1 sources

            while (true) {
                var6_3 = (var4_2 | var8) ^ -1766365896;
                break block39;
                break;
            }
lbl18:
            // 1 sources

            while (true) {
                var5_8 ^= var6_3 ^ 1430520983;
                ** continue;
                break;
            }
lbl21:
            // 1 sources

            while (true) {
                var5_8 ^= var6_3 ^ 1469860550;
                ** continue;
                break;
            }
lbl24:
            // 1 sources

            while (true) {
                var5_8 ^= var6_3 ^ -2145500668;
                ** continue;
                break;
            }
        }
lbl28:
        // 2 sources

        block28: while (true) {
            switch (var6_3) lbl-1000:
            // 4 sources

            {
                while (true) {
                    default: {
                        continue block28;
                    }
                    break;
                }
                case 56829202: {
                    ** continue;
                }
                case 1835714768: {
                    ** continue;
                }
lbl37:
                // 1 sources

                while (true) {
                    var6_3 = (var4_2 | var8) ^ -1775728587;
                    ** GOTO lbl90
lbl40:
                    // 1 sources

                    while (true) {
                        var0_4 = fu.a;
                        var1_5 = var0_4.length;
                        var2_6 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl45:
                // 4 sources

                block32: while (true) {
                    switch (var6_3) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            default: {
                                continue block32;
                            }
                            break;
                        }
                        case -2051556201: {
                            ** continue;
                        }
                        case -2081828886: {
                            var3_7 = var0_4[var2_6];
                            ** GOTO lbl70
                        }
lbl55:
                        // 1 sources

                        while (true) {
                            var6_3 = (var4_2 | var8) ^ -1636065705;
                            ** GOTO lbl-1000
                            break;
                        }
lbl58:
                        // 1 sources

                        while (true) {
                            var6_3 = (var4_2 | var8) ^ -1248537367;
                            ** GOTO lbl-1000
                            break;
                        }
                        while (true) {
                            var6_3 = (var4_2 | var8) ^ 1647132315;
                            ** GOTO lbl-1000
                            break;
                        }
                        case 680292268: {
                            var5_8 ^= var6_3 ^ 658208414;
                            ** continue;
                        }
                        case 1836862036: {
                            ++var2_6;
                            break block28;
                        }
lbl70:
                        // 1 sources

                        var6_3 = (var4_2 | var8) ^ -1454556797;
                        ** continue;
                        case -1643066299: {
                            if (AL10.alGetSourcei((int)var3_7, (int)fu.VV((var5_8 | var6_3 ^ var7_1) ^ (var6_3 ^ 1323455862), (var4_2 | var6_3 ^ var7_1) ^ ((var5_8 | var6_3 ^ var7_1) ^ (var6_3 ^ -1266092163)))) == fu.VV((var5_8 | var6_3 ^ var7_1) ^ (var6_3 ^ 1323455861), (var4_2 | var6_3 ^ var7_1) ^ ((var5_8 | var6_3 ^ var7_1) ^ (var6_3 ^ 1961735960)))) break block32;
                            ** continue;
                        }
lbl75:
                        // 1 sources

                        while (true) {
                            var6_3 = (var4_2 | var8) ^ -1155827617;
                            ** GOTO lbl90
                            break;
                        }
                        case 532334712: {
                            var5_8 ^= var6_3 ^ 1992463736;
                            ** GOTO lbl101
                        }
                        case 746471232: {
                            return var3_7;
                        }
                    }
                    break;
                }
                var6_3 = (var4_2 | var8) ^ 859852140;
                ** GOTO lbl45
                case -723857568: {
                    var5_8 ^= var6_3 ^ 1636765996;
                    ** GOTO lbl103
                }
lbl88:
                // 1 sources

                var5_8 = (var4_2 | var8) ^ -989079110;
                var6_3 = (var4_2 | var8) ^ 711490476;
lbl90:
                // 3 sources

                block38: while (true) {
                    switch (var6_3) {
                        default: {
                            continue block38;
                        }
                        case 233605540: {
                            ** continue;
                        }
                        case 551516622: {
                            var5_8 ^= var6_3 ^ 780295627;
                            ** continue;
                        }
                        case -1667265961: {
                            ** continue;
                        }
                    }
                    break;
                }
lbl101:
                // 1 sources

                var6_3 = (var4_2 | var8) ^ 686243262;
                ** continue;
lbl103:
                // 1 sources

                var6_3 = (var4_2 | var8) ^ 18223269;
                ** continue;
                case 541103299: {
                    if (var2_6 >= var1_5) ** continue;
                    ** continue;
                }
                case -1209933474: {
                    return 0;
                }
            }
            break;
        }
        var6_3 = (var4_2 | var8) ^ -610453205;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static void invalidate() {
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
    public static void shutdown() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [64[UNCONDITIONALDOLOOP], 51[UNCONDITIONALDOLOOP]], but top level block is 65[UNCONDITIONALDOLOOP]
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

