/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.minecraft.class_12249
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_4597$class_4598
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_12249;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import z.r.ak;
import z.r.cL;
import z.r.cy;
import z.r.gJ;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class aw {
    public static final int c;
    private static final int[] a;
    private final List<Boolean> a;
    private final List<class_243> b;
    private int a;
    private final ak a;
    private int b;
    private final List<cL> c;
    private long a;
    private static final float a;
    private static final double a;
    private static final float b;
    private long b;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public aw(ak var1_1) {
        var5_2 = -893744331;
        var2_3 = aw.c & -893744331 ^ -1668138551;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ 304474780;
        var3_5 ^= -563168662;
        super();
        var4_4 = (var2_3 | var5_2) ^ -1491859769;
        if (true) ** GOTO lbl11
        block20: while (true) {
            var4_4 = (var2_3 | var5_2) ^ 1546887680;
lbl11:
            // 2 sources

            block21: while (true) {
                switch (var4_4) {
                    case 152686799: {
                        this.a = -1;
                        var4_4 = (var2_3 | var5_2) ^ -33607747;
                        continue block21;
                    }
                    case -1758017111: {
                        this.b = new ArrayList<class_243>();
                        ** break;
                    }
                    case -1194834243: {
                        this.b = -5616707432843742631L << (var4_4 ^ -1194834275) >>> (var4_4 ^ -1194834275) ^ (long)var3_5 & 0xFFFFFFFFL | (-5616707432843742631L >>> (var4_4 ^ -1194834275) ^ (long)var3_5 & 0xFFFFFFFFL) << (var4_4 ^ -1194834275);
                        ** GOTO lbl46
                    }
                    case 1076442182: {
                        var3_5 ^= var4_4 ^ 1701641263;
                        ** break;
                    }
lbl27:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 1293309966;
                    continue block21;
                    case 710659574: {
                        this.b = aw.ra((var3_5 | var4_4 ^ -522107197) ^ (var4_4 ^ -214998671), (var2_3 | var4_4 ^ -522107197) ^ ((var3_5 | var4_4 ^ -522107197) ^ (var4_4 ^ 1406668309)));
                        ** GOTO lbl69
                    }
                    case 591762496: {
                        var3_5 ^= var4_4 ^ -682706404;
                        ** GOTO lbl85
                    }
lbl35:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -186550773;
                    continue block21;
                    case 2079957476: {
                        this.a = (int[])new ArrayList<E>();
                        var4_4 = (var2_3 | var5_2) ^ -1634496581;
                        continue block21;
                    }
                    case -2104944131: {
                        return;
                    }
                    case -396957936: {
                        var3_5 ^= var4_4 ^ 1486427743;
                        ** GOTO lbl63
                    }
lbl46:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 921459949;
                    continue block21;
                    case -1616440757: {
                        this.a = var1_1;
                        var4_4 = (var2_3 | var5_2) ^ 369172627;
                        continue block21;
                    }
                    case -954904433: {
                        var3_5 ^= var4_4 ^ 1360549007;
                        var4_4 = (var2_3 | var5_2) ^ -1186688426;
                        continue block21;
                    }
                    case 2041494842: {
                        var3_5 ^= var4_4 ^ 1019860974;
                        var4_4 = (var2_3 | var5_2) ^ 616526903;
                        ** GOTO lbl79
                    }
                    case -1817385997: {
                        var3_5 ^= var4_4 ^ 287481466;
                        ** GOTO lbl71
                    }
lbl63:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 1092463030;
                    continue block21;
                    case -100282422: {
                        this.c = (int)new ArrayList<E>();
                        var4_4 = (var2_3 | var5_2) ^ 430959474;
                        continue block21;
                    }
lbl69:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 892715890;
                    continue block21;
lbl71:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -1522329063;
                    continue block21;
                    case -927229074: {
                        var3_5 ^= var4_4 ^ 591642817;
                        continue block20;
                    }
                    case -453549921: {
                        var3_5 ^= var4_4 ^ 1953350387;
                        var4_4 = (var2_3 | var5_2) ^ 1233941076;
                    }
lbl79:
                    // 3 sources

                    default: {
                        continue block21;
                    }
                    case -342919025: {
                        var3_5 ^= var4_4 ^ -616319271;
                        var4_4 = (var2_3 | var5_2) ^ -677156046;
                        continue block21;
                    }
lbl85:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 1718811968;
                    continue block21;
                    case 1744710059: 
                }
                this.a = 4727519429927863775L << (var4_4 ^ 1744710027) >>> (var4_4 ^ 1744710027) ^ (long)var3_5 & 0xFFFFFFFFL | (4727519429927863775L >>> (var4_4 ^ 1744710027) ^ (long)var3_5 & 0xFFFFFFFFL) << (var4_4 ^ 1744710027);
                var4_4 = (var2_3 | var5_2) ^ 978180962;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void invalidate() {
        block28: {
            block30: {
                var4_1 = -887848599;
                var1_2 = aw.c & -887848599 ^ -1336802067;
                var3_3 = 0;
                ** GOTO lbl60
lbl5:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 205086251;
                    ** GOTO lbl21
lbl8:
                    // 1 sources

                    return;
lbl10:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -51927298;
                        ** GOTO lbl50
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                    break;
                }
lbl15:
                // 1 sources

                block21: while (true) {
                    block29: {
                        var3_3 = (var1_2 | var4_1) ^ -1741878852;
                        break block29;
lbl18:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 894472352;
                            ** GOTO lbl55
                            break;
                        }
                    }
lbl22:
                    // 7 sources

                    block23: while (true) {
                        switch (var3_3) lbl-1000:
                        // 8 sources

                        {
                            default: {
                                continue block23;
                            }
                            case 900467387: {
                                ** continue;
                            }
                            case -1983465509: {
                                ** continue;
                            }
                            case 503524186: {
                                ** continue;
                            }
                            case 1017624200: {
                                ** continue;
                            }
                            case -445997814: {
                                this.a = 5990454335977447034L << (var3_3 ^ -445997782) >>> (var3_3 ^ -445997782) ^ (long)var2_4 & 0xFFFFFFFFL | (5990454335977447034L >>> (var3_3 ^ -445997782) ^ (long)var2_4 & 0xFFFFFFFFL) << (var3_3 ^ -445997782);
                                ** continue;
                            }
lbl38:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1844233008;
                                ** GOTO lbl-1000
                                break;
                            }
                            case 484640364: {
                                this.c.clear();
                                break block28;
                            }
lbl44:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1873570492;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -1856058963: {
                                this.a.clear();
                                break block21;
                            }
lbl50:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -822440106;
                            ** GOTO lbl-1000
                            case 1669041233: {
                                var2_4 ^= var3_3 ^ 2104966624;
                                break;
                            }
lbl55:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ 1778928704;
                            ** GOTO lbl-1000
lbl57:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1934644560;
                                ** GOTO lbl-1000
                                break;
                            }
lbl60:
                            // 1 sources

                            var2_4 = (var1_2 | var4_1) ^ 913861158;
                            var3_3 = (var1_2 | var4_1) ^ -678260926;
                            ** GOTO lbl-1000
                        }
                        break;
                    }
                    break;
                }
                var3_3 = (var1_2 | var4_1) ^ 1922052662;
                ** GOTO lbl22
                {
                    case 1795494057: {
                        var2_4 ^= var3_3 ^ -113291791;
                        break block30;
                    }
                    case -2012819267: {
                        this.b = aw.ra((var2_4 | var3_3 ^ 1125274068) ^ (var3_3 ^ 1947489953), (var1_2 | var3_3 ^ 1125274068) ^ ((var2_4 | var3_3 ^ 1125274068) ^ (var3_3 ^ 363162252)));
                        ** continue;
                    }
                }
                this.b.clear();
                var3_3 = (var1_2 | var4_1) ^ -940493979;
                ** GOTO lbl22
                {
                    case -306589329: {
                        this.b = -3184075493837118411L << (var3_3 ^ -306589361) >>> (var3_3 ^ -306589361) ^ (long)var2_4 & 0xFFFFFFFFL | (-3184075493837118411L >>> (var3_3 ^ -306589361) ^ (long)var2_4 & 0xFFFFFFFFL) << (var3_3 ^ -306589361);
                        ** continue;
                    }
                    case 1543160494: {
                        var2_4 ^= var3_3 ^ 539962829;
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 507255015;
                ** GOTO lbl22
                {
                    case 751045295: {
                        ** continue;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ -447369545;
                ** GOTO lbl22
            }
            var3_3 = (var1_2 | var4_1) ^ -407534719;
            ** GOTO lbl22
            {
                case 1766177085: {
                    var2_4 ^= var3_3 ^ -1592332892;
                    var3_3 = (var1_2 | var4_1) ^ 384783490;
                    ** GOTO lbl-1000
                }
                ** case -143664186:
            }
lbl95:
            // 1 sources

            var2_4 ^= var3_3 ^ -1076808432;
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ -1599322301;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var2 = 2082700405;
        aw.c = mK.a(MethodHandles.lookup().lookupClass(), 1514056238);
        var1_1 = 0;
        var0_2 = 1319044793;
        var1_1 = var2 ^ 1488844644;
        if (true) ** GOTO lbl-1000
lbl7:
        // 1 sources

        while (true) {
            var0_2 ^= 1881920018;
            v0 = var0_2 ^= 320052924;
            var0_2 ^= 2077338581;
            aw.a[v1] = ((v2[v3] & 255) << 24 | ((v2[v3 + 1] & 255) << 16 | ((v2[v3 + 2] & 255) << 8 | v2[v3 + 3] & 255))) ^ ((v0 | var2) ^ 1702465062 ^ aw.c);
            v1 = v1 + 1;
            v4 = v3 + 4;
            v2 = v2;
            v3 = v4;
            var0_2 ^= -1389211905;
            if (v4 < v2.length) ** GOTO lbl51
            var0_2 ^= 386974525;
            aw.b = 0.02f;
            aw.a = 96.0;
            aw.a = 0.08f;
            return;
        }
lbl36:
        // 1 sources

        while (true) {
            var0_2 ^= 62181067;
            var0_2 ^= -892147715;
            ** continue;
            break;
        }
lbl41:
        // 1 sources

        while (true) {
            var0_2 ^= 1925832177;
            var0_2 ^= -592667079;
            ** continue;
            break;
        }
lbl47:
        // 1 sources

        while (true) {
            aw.a = new int[((var0_2 ^= -243192193) | var2) ^ 2109177680];
            var0_2 ^= 1879227721;
            v2 = "\u00c2\u00b7t=&\u001d\u0019d\u00e5+(\u00c3,\u000fx;#\u00e7@\u00f7\u0080-DXy\u0097y\u00dc\u00b7_>b\u00ad\u00e6\u00b3f\bZi\u00fb\u00b5\u00a6\u00c8\u00bf\u00c3lq1B\u00da}\u00bb\u00eb\u00be\u00e0\u00de\u001b\u00ab.\u00f8F\u009a/\u00e7\u008a\u00c9\u0083@T\u0014\u0014k\u00a3r \u00d8k\u00bc\u00e2\tv\u007f\u008d\u00d7\u00c7;*\u00da\u001c7\u00baf\u00a1vJ\u0015\u00faX\u0094\u00bf\b\u008a\u00d2$\u00c8ch\u001f\u00cb\u00cfT\u00907y\u0090oLZ\u001f\u009f\u001bwr\u008b\u0096q\u00b0f\u008c7\u00d0\u00c5qPV\u00c8 \u00bc\u00b0\u0013\u0080\u008b<\u008cFV]\u00a2".getBytes("ISO-8859-1");
lbl51:
            // 2 sources

            var0_2 ^= -757546118;
            ** continue;
            break;
        }
        block9: while (true) {
            block10: {
                switch (var1_1) lbl-1000:
                // 2 sources

                {
                    default: {
                        continue block9;
                    }
                    case 614370065: {
                        break block10;
                    }
                    case 1673357130: {
                        var0_2 ^= var1_1 ^ -516544307;
                        break;
                    }
                    case 1777505000: {
                        v1 = 0;
                        v3 = 0;
                        ** break;
lbl66:
                        // 1 sources

                        ** continue;
                    }
                }
                var1_1 = var2 ^ 366079645;
                continue;
            }
            var1_1 = var2 ^ 530455359;
        }
    }

    /*
     * Unable to fully structure code
     */
    public int plateCount() {
        block9: {
            block8: {
                var1_1 = aw.c & 572308999 ^ -167033467;
                var3_2 = 0;
                ** GOTO lbl12
lbl4:
                // 2 sources

                block5: while (true) {
                    switch (var3_2) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block5;
                            }
                            break;
                        }
lbl9:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | 572308999) ^ -2139358015;
                            ** continue;
                            break;
                        }
lbl12:
                        // 1 sources

                        var2_3 = (var1_1 | 572308999) ^ 1861213519;
                        break block8;
                        case 1986265926: {
                            var2_3 ^= var3_2 ^ -1927901969;
                            break block9;
                        }
                        case 972050004: {
                            return this.c.size();
                        }
                        case -642320173: {
                            break block5;
                        }
                    }
                    break;
                }
                ** while (true)
            }
            var3_2 = (var1_1 | 572308999) ^ 799606612;
            ** GOTO lbl4
        }
        var3_2 = (var1_1 | 572308999) ^ -806374957;
        ** while (true)
    }

    private static int ra(int n2, int n3) {
        int n4 = -347602985;
        int n5 = 664363212;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xC851C82F)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xEFDF692F;
        n6 -= (n5 | n4) ^ 0xEFDF5823;
        n6 -= (n5 | n4) ^ 0xEFDF6EBE;
        n6 -= (n5 | n4) ^ 0xEFDF0C16;
        n6 -= (n5 | n4) ^ 0xEFDF2132;
        n6 ^= (n5 | n4) ^ 0xEFDF555F;
        return n6 -= (n5 | n4) ^ 0xEFDF336F;
    }

    /*
     * Exception decompiling
     */
    public void render(WorldRenderContext var1_1, class_310 var2_2, cy var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [164[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
     * Exception decompiling
     */
    private void rb(cy var1_1) {
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
    static long pack(int n2, int n3) {
        int n4 = c & 0xC2C204E3 ^ 0x7A208E99;
        int n5 = 0;
        int n6 = (n4 | 0xC2C204E3) ^ 0xA49B5157;
        n5 = (n4 | 0xC2C204E3) ^ 0x1E9354E5;
        block5: while (true) {
            switch (n5) {
                case -462300642: {
                    n5 = (n4 | 0xC2C204E3) ^ 0x83093A22;
                    continue block5;
                }
                case 2045490393: {
                    n6 ^= n5 ^ 0xDD2505F2;
                    n5 = (n4 | 0xC2C204E3) ^ 0x3724B780;
                }
                default: {
                    continue block5;
                }
                case -842647173: 
            }
            break;
        }
        return (long)n2 << aw.ra((n6 | n5 ^ 0xF043D98) ^ (n5 ^ 0x10BF6068), (n4 | n5 ^ 0xF043D98) ^ ((n6 | n5 ^ 0xF043D98) ^ (n5 ^ 0xF5400EE0))) ^ (long)n3 & (-380714117301235336L << (n5 ^ 0xCDC6395B) >>> (n5 ^ 0xCDC6395B) ^ (long)n6 & 0xFFFFFFFFL | (-380714117301235336L >>> (n5 ^ 0xCDC6395B) ^ (long)n6 & 0xFFFFFFFFL) << (n5 ^ 0xCDC6395B));
    }

    /*
     * Unable to fully structure code
     */
    private static int rc(long var0) {
        var2_1 = aw.c & 185501706 ^ 2055605780;
        var4_2 = 0;
        if (true) ** GOTO lbl13
        block5: while (true) {
            var4_2 = (var2_1 | 185501706) ^ -165880382;
lbl6:
            // 2 sources

            block6: while (true) {
                switch (var4_2) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block6;
                        }
                        break;
                    }
                    case -1919790116: {
                        return (int)(var0 >> aw.ra((var3_3 | var4_2 ^ -2036540458) ^ (var4_2 ^ -2059207146), (var2_1 | var4_2 ^ -2036540458) ^ ((var3_3 | var4_2 ^ -2036540458) ^ (var4_2 ^ 1109103828))));
                    }
lbl13:
                    // 1 sources

                    var3_3 = (var2_1 | 185501706) ^ -1563821305;
                    var4_2 = (var2_1 | 185501706) ^ 637691885;
                    ** continue;
                    case -1281415230: {
                        var3_3 ^= var4_2 ^ 1300414694;
                        continue block5;
                    }
                    case 1569516019: 
                }
                break;
            }
            break;
        }
        var4_2 = (var2_1 | 185501706) ^ -938366500;
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static int rd(long l2) {
        int n2 = c & 0x69FBE599 ^ 0x34F4003E;
        int n3 = 0;
        int n4 = (n2 | 0x69FBE599) ^ 0xEF413123;
        n3 = (n2 | 0x69FBE599) ^ 0xAA48BB46;
        boolean bl2 = true;
        block5: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n3 = (n2 | 0x69FBE599) ^ 0x3E7E2900;
            }
            block6: while (true) {
                switch (n3) {
                    default: {
                        continue block6;
                    }
                    case -84047012: {
                        n4 ^= n3 ^ 0x210AB08F;
                        continue block5;
                    }
                    case -675848455: {
                        n3 = (n2 | 0x69FBE599) ^ 0x87026EE3;
                        continue block6;
                    }
                    case 1132580031: 
                }
                break;
            }
            break;
        }
        return (int)l2;
    }

    /*
     * Exception decompiling
     */
    static void mergeRectangles(Map<Long, gJ> var0, int var1_1, List<cL> var2_2) {
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
    private static boolean re(Map<Long, gJ> var0, Set<Long> var1_1, int var2_2, int var3_3, gJ var4_4) {
        block22: {
            var10_5 = 295293910;
            var7_6 = aw.c & 295293910 ^ -984318248;
            var9_7 = 0;
            var8_9 = (var7_6 | var10_5) ^ 1837642515;
            var9_7 = (var7_6 | var10_5) ^ 430668040;
            if (true) ** GOTO lbl9
            block15: while (true) {
                var9_7 = (var7_6 | var10_5) ^ -2112380617;
lbl9:
                // 2 sources

                block16: while (true) {
                    switch (var9_7) {
                        default: {
                            continue block16;
                        }
                        case -864647466: {
                            var9_7 = (var7_6 | var10_5) ^ 563863887;
                            continue block16;
                        }
                        case -196731247: {
                            var8_9 ^= var9_7 ^ 308715473;
                            continue block15;
                        }
                        case 1472880361: 
                    }
                    break;
                }
                break;
            }
            var5_8 = aw.pack(var2_2, var3_3);
            var9_7 = (var7_6 | var10_5) ^ -898267964;
            break block22;
lbl23:
            // 1 sources

            while (true) {
                var9_7 = (var7_6 | var10_5) ^ 332720168;
                break block22;
                break;
            }
lbl26:
            // 1 sources

            while (true) {
                var9_7 = (var7_6 | var10_5) ^ 872882296;
                break block22;
                break;
            }
lbl29:
            // 2 sources

            while (true) {
                var9_7 = (var7_6 | var10_5) ^ 344078762;
                break block22;
                break;
            }
lbl32:
            // 2 sources

            while (true) {
                var8_9 ^= 1733032682;
                return v0;
            }
        }
        block21: while (true) {
            switch (var9_7) {
                default: {
                    continue block21;
                }
                case -1050687884: {
                    var8_9 ^= var9_7 ^ -367640534;
                    ** continue;
                }
                case 531135258: {
                    var8_9 ^= var9_7 ^ -1065194749;
                    var9_7 = (var7_6 | var10_5) ^ -977697385;
                    continue block21;
                }
                case 1594286848: {
                    var8_9 ^= var9_7 ^ 1951360350;
                    ** continue;
                }
                case -1109905408: {
                    var9_7 = (var7_6 | var10_5) ^ -1094089883;
                    continue block21;
                }
                case 1796504763: {
                    if (var0.get(var5_8) != var4_4) ** GOTO lbl29
                    var9_7 = (var7_6 | var10_5) ^ -1965351714;
                    continue block21;
                }
                case 275020361: {
                    if (!var1_1.contains(var5_8)) ** break;
                    ** continue;
                    var9_7 = (var7_6 | var10_5) ^ 1745211358;
                    continue block21;
                }
                case -972482570: {
                    v0 = false;
                    ** GOTO lbl32
                }
                case -505749594: 
            }
            break;
        }
        v0 = true;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void rf(class_4597 var1_1, Matrix4f var2_2, class_243 var3_3) {
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
    private void rg(class_4597 var1_1, Matrix4f var2_2, class_243 var3_3) {
        block51: {
            block52: {
                block53: {
                    break block53;
lbl1:
                    // 1 sources

                    while (true) {
                        var14_7 ^= -2024582606;
                        var11_15 = (float)var6_10.planeY() + 0.02f;
                        var12_16 = aw.ra(((var14_7 ^= -1362490156) | var16_4) ^ -1661632445, (var13_5 | var16_4) ^ ((var14_7 | var16_4) ^ -726855186));
                        var15_6 = (var13_5 | var16_4) ^ -901662731;
                        break block51;
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        var15_6 = (var13_5 | var16_4) ^ 1078365251;
                        ** GOTO lbl145
lbl10:
                        // 3 sources

                        while (true) {
                            var15_6 = (var13_5 | var16_4) ^ 1892134436;
                            break block52;
lbl13:
                            // 1 sources

                            while (true) {
                                var15_6 = (var13_5 | var16_4) ^ 498223551;
                                break block52;
                                break;
                            }
lbl16:
                            // 1 sources

                            while (true) {
                                var5_9.method_22994(class_12249.method_76015());
                                ** GOTO lbl95
                                break;
                            }
                            break;
                        }
                        break;
                    }
                }
                var16_4 = -1167871741;
                var13_5 = aw.c & -1167871741 ^ -328584673;
                var15_6 = 0;
                var14_7 = (var13_5 | var16_4) ^ 120004770;
                var15_6 = (var13_5 | var16_4) ^ 922810286;
                block40: while (true) {
                    switch (var15_6) {
                        default: {
                            continue block40;
                        }
                        case -706746788: {
                            var14_7 ^= var15_6 ^ 223314753;
                            var15_6 = (var13_5 | var16_4) ^ 1750711548;
                            continue block40;
                        }
                        case -1775104029: {
                            var4_8 = var1_1.method_73477(class_12249.method_76015());
                            break block40;
                        }
                        case -915716943: {
                            var15_6 = (var13_5 | var16_4) ^ 733238595;
                            continue block40;
                        }
                    }
                    break;
                }
                var14_7 ^= -1769935953;
                var5_9 = this.c.iterator();
                ** GOTO lbl10
lbl42:
                // 1 sources

                while (true) {
                    var15_6 = (var13_5 | var16_4) ^ 1513131292;
                    ** GOTO lbl145
lbl45:
                    // 1 sources

                    while (true) {
                        var9_13 = var7_11 >> aw.ra(((var14_7 ^= 188009225) | var16_4) ^ -1661089766, (var13_5 | var16_4) ^ ((var14_7 | var16_4) ^ -1244513417)) & aw.ra((var14_7 | var16_4) ^ -1661089767, (var13_5 | var16_4) ^ ((var14_7 | var16_4) ^ 1170732123));
                        var10_14 = var7_11 & aw.ra(((var14_7 ^= 28542625) | var16_4) ^ -1653748040, (var13_5 | var16_4) ^ ((var14_7 | var16_4) ^ 426177509));
                        ** continue;
                        break;
                    }
lbl49:
                    // 1 sources

                    while (true) {
                        var8_12 = var7_11 >> aw.ra(((var14_7 ^= 1456698640) | var16_4) ^ -1645641196, (var13_5 | var16_4) ^ ((var14_7 | var16_4) ^ -1676353394)) & aw.ra((var14_7 | var16_4) ^ -1645641197, (var13_5 | var16_4) ^ ((var14_7 | var16_4) ^ 497216786));
                        ** continue;
                        break;
                    }
                    break;
                }
lbl52:
                // 1 sources

                while (true) {
                    var15_6 = (var13_5 | var16_4) ^ 293665925;
                    break block51;
                    break;
                }
lbl55:
                // 1 sources

                while (true) {
                    var15_6 = (var13_5 | var16_4) ^ 1168618255;
                    break block51;
                    break;
                }
            }
            block46: while (true) {
                block54: {
                    switch (var15_6) {
                        case -751234664: {
                            if (!(var1_1 instanceof class_4597.class_4598)) break;
                            var15_6 = (var13_5 | var16_4) ^ -1935485938;
                            continue block46;
                        }
                        case 993624819: {
                            var14_7 ^= var15_6 ^ -1023236531;
                            var15_6 = (var13_5 | var16_4) ^ 760390279;
                            continue block46;
                        }
                        case 488600833: {
                            var14_7 ^= var15_6 ^ 1398320188;
                            var15_6 = (var13_5 | var16_4) ^ -1249319259;
                            continue block46;
                        }
                        case -472253792: {
                            if (var5_9.hasNext()) {
                                var15_6 = (var13_5 | var16_4) ^ -478886370;
                                continue block46;
                            }
                            var15_6 = (var13_5 | var16_4) ^ -984469012;
                        }
                        default: {
                            continue block46;
                        }
                        case 1925801745: {
                            var14_7 ^= var15_6 ^ -948458279;
                            break block54;
                        }
                        case -1901322949: {
                            var14_7 ^= var15_6 ^ -2071468816;
                            ** continue;
                        }
                        case 431813640: {
                            var5_9 = (class_4597.class_4598)var1_1;
                            var14_7 ^= -1245787192;
                            ** continue;
                        }
                        case 1273189818: {
                            var6_10 = (cL)var5_9.next();
                            ** break;
lbl93:
                            // 1 sources

                            var15_6 = (var13_5 | var16_4) ^ -750613700;
                            if (true) ** GOTO lbl145
                        }
                    }
lbl95:
                    // 2 sources

                    var14_7 ^= 2029647956;
                    return;
                }
                var15_6 = (var13_5 | var16_4) ^ -405321961;
            }
        }
        block47: while (true) {
            block55: {
                switch (var15_6) {
                    case -1629398196: {
                        var14_7 ^= var15_6 ^ 1513089453;
                        ** break;
                    }
                    case 875169002: {
                        var14_7 ^= var15_6 ^ 2072383362;
                        var15_6 = (var13_5 | var16_4) ^ 923648328;
                        continue block47;
                    }
                    case -1280188666: {
                        aw.line(var4_8, var2_2, var6_10.x2(), var11_15, var6_10.z1(), var6_10.x2(), var11_15, var6_10.z2(), var8_12, var9_13, var10_14, var12_16, 1.5f);
                        var15_6 = (var13_5 | var16_4) ^ 1619716179;
                        continue block47;
                    }
                    case -1144258544: {
                        var14_7 ^= var15_6 ^ -2137112418;
                        var15_6 = (var13_5 | var16_4) ^ -55848460;
                        continue block47;
                    }
                    case -916032937: {
                        aw.line(var4_8, var2_2, var6_10.x1(), var11_15, var6_10.z1(), var6_10.x2(), var11_15, var6_10.z1(), var8_12, var9_13, var10_14, var12_16, 1.5f);
                        var15_6 = (var13_5 | var16_4) ^ 302298751;
                        continue block47;
                    }
                    case 46162667: {
                        ** GOTO lbl10
                    }
                    case 1102341042: {
                        var14_7 ^= var15_6 ^ 935885124;
                        ** continue;
                    }
                    case -1147260110: {
                        aw.line(var4_8, var2_2, var6_10.x2(), var11_15, var6_10.z2(), var6_10.x1(), var11_15, var6_10.z2(), var8_12, var9_13, var10_14, var12_16, 1.5f);
                        var15_6 = (var13_5 | var16_4) ^ -1075851091;
                        ** GOTO lbl132
                    }
lbl131:
                    // 1 sources

                    var15_6 = (var13_5 | var16_4) ^ 1173717037;
lbl132:
                    // 3 sources

                    default: {
                        continue block47;
                    }
                    case -328268448: {
                        var14_7 ^= var15_6 ^ 1011272765;
                        break block55;
                    }
                    case -269791334: 
                }
                aw.line(var4_8, var2_2, var6_10.x1(), var11_15, var6_10.z2(), var6_10.x1(), var11_15, var6_10.z1(), var8_12, var9_13, var10_14, var12_16, 1.5f);
                ** continue;
            }
            var15_6 = (var13_5 | var16_4) ^ 1306160153;
        }
        block48: while (true) {
            var15_6 = (var13_5 | var16_4) ^ 1567214730;
lbl145:
            // 4 sources

            block49: while (true) {
                switch (var15_6) {
                    default: {
                        continue block49;
                    }
                    case -1537524221: {
                        var14_7 ^= var15_6 ^ 859900464;
                        var15_6 = (var13_5 | var16_4) ^ 1445372202;
                        continue block49;
                    }
                    case -1471344075: {
                        ** continue;
                    }
                    case 757676067: {
                        var14_7 ^= var15_6 ^ -27317018;
                        break;
                    }
                    case -1104330916: {
                        var7_11 = this.rh(var6_10.type());
                        ** continue;
                    }
                    case -1560117355: {
                        var14_7 ^= var15_6 ^ 1471154004;
                        ** continue;
                    }
                    case -1315819528: {
                        if (!aw.ri(var6_10, var3_3)) continue block48;
                        ** continue;
                    }
                }
                var15_6 = (var13_5 | var16_4) ^ 1341758695;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private int rh(gJ var1_1) {
        var5_2 = 1118152164;
        var2_3 = aw.c & 1118152164 ^ 1220442318;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ -1834868888;
        var4_4 = (var2_3 | var5_2) ^ -1928578510;
        block9: while (true) {
            block12: {
                block11: {
                    switch (var4_4) {
                        case -944519204: {
                            break block11;
                        }
                        case 283495277: {
                            var3_5 ^= var4_4 ^ 1333831391;
                            var4_4 = (var2_3 | var5_2) ^ -930948812;
                            continue block9;
                        }
                        case 1042862546: {
                            if (!this.a.colourByHazardType()) {
                                var4_4 = (var2_3 | var5_2) ^ -786872930;
                                continue block9;
                            }
                            ** GOTO lbl25
                        }
                        case -244254877: {
                            return this.a.dangerPlateColour() & aw.ra((var3_5 | var4_4 ^ -1277865337) ^ (var4_4 ^ 207318382), (var2_3 | var4_4 ^ -1277865337) ^ ((var3_5 | var4_4 ^ -1277865337) ^ (var4_4 ^ 789193806)));
                        }
                        case -1714776428: {
                            var3_5 ^= var4_4 ^ 1392520070;
                            var4_4 = (var2_3 | var5_2) ^ 1956064316;
                            continue block9;
                        }
lbl25:
                        // 1 sources

                        var4_4 = (var2_3 | var5_2) ^ 1515861635;
                        default: {
                            continue block9;
                        }
                        case -2109922086: {
                            return var1_1.defaultRgb();
                        }
                        case -1683572624: 
                    }
                    var3_5 ^= var4_4 ^ 299133608;
                    break block12;
                }
                var4_4 = (var2_3 | var5_2) ^ -747279494;
                continue;
            }
            var4_4 = (var2_3 | var5_2) ^ -1144059251;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static boolean ri(cL var0, class_243 var1_1) {
        block30: {
            block28: {
                block29: {
                    break block30;
lbl1:
                    // 1 sources

                    while (true) {
                        v0 = false;
                        ** GOTO lbl65
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl6:
                    // 1 sources

                    while (true) {
                        var11_5 ^= var12_4 ^ 259572475;
                        break block28;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var11_5 ^= var12_4 ^ -452836572;
                        ** GOTO lbl61
                        break;
                    }
lbl12:
                    // 3 sources

                    block17: while (true) {
                        switch (var12_4) {
                            default: {
                                continue block17;
                            }
                            case 1631081753: {
                                ** continue;
                            }
                            case -860173770: {
                                ** continue;
                            }
                            case -1657470140: {
                                ** GOTO lbl74
                            }
                        }
                        break;
                    }
                    while (true) {
                        var12_4 = (var10_3 | var13_2) ^ -1755273973;
                        ** GOTO lbl47
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        var6_8 = var2_6 - var1_1.field_1352;
                        ** GOTO lbl69
                        break;
                    }
lbl30:
                    // 1 sources

                    while (true) {
                        if (!(var6_8 * var6_8 + var8_9 * var8_9 > 9216.0)) ** continue;
                        break block29;
                        break;
                    }
lbl33:
                    // 1 sources

                    while (true) {
                        var4_7 = (double)(var0.z1() + var0.z2()) * 0.5;
                        ** GOTO lbl67
                        break;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        var12_4 = (var10_3 | var13_2) ^ 1424631977;
                        ** GOTO lbl12
                        break;
                    }
                    var2_6 = (double)(var0.x1() + var0.x2()) * 0.5;
                    var11_5 ^= 693144446;
                    ** while (true)
                    var8_9 = var4_7 - var1_1.field_1350;
                    var12_4 = (var10_3 | var13_2) ^ 1439570187;
                    if (true) ** GOTO lbl47
                    block24: while (true) {
                        var12_4 = (var10_3 | var13_2) ^ -1336639545;
lbl47:
                        // 4 sources

                        block25: while (true) {
                            switch (var12_4) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    default: {
                                        continue block25;
                                    }
                                    break;
                                }
                                case 2039174186: {
                                    ** continue;
                                }
                                case 406286413: {
                                    ** continue;
                                }
                                case 990977911: {
                                    ** continue;
                                }
lbl58:
                                // 1 sources

                                while (true) {
                                    var12_4 = (var10_3 | var13_2) ^ -221367142;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl61:
                                // 1 sources

                                var12_4 = (var10_3 | var13_2) ^ -1647950564;
                                ** continue;
                                case 1410952945: {
                                    v0 = true;
lbl65:
                                    // 2 sources

                                    var11_5 ^= -731776426;
                                    break block24;
                                }
lbl67:
                                // 1 sources

                                var11_5 ^= -1347686416;
                                ** continue;
lbl69:
                                // 1 sources

                                var11_5 ^= -1437791615;
                                ** continue;
                                case 1589612262: {
                                    var11_5 ^= var12_4 ^ -1551188593;
                                    continue block24;
                                }
lbl74:
                                // 1 sources

                                var12_4 = (var10_3 | var13_2) ^ 90563035;
                                ** GOTO lbl12
                            }
                            break;
                        }
                        break;
                    }
                    return v0;
                    {
                        ** case -1676594458:
                    }
lbl78:
                    // 1 sources

                    var11_5 ^= var12_4 ^ 1364592159;
                    ** while (true)
                }
                var12_4 = (var10_3 | var13_2) ^ -773301344;
                ** while (true)
            }
            var12_4 = (var10_3 | var13_2) ^ -1461223692;
            ** while (true)
        }
        var13_2 = -918157011;
        var10_3 = aw.c & -918157011 ^ 1100554952;
        var12_4 = 0;
        var11_5 = (var10_3 | var13_2) ^ -1183499169;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void rj(cy var1_1) {
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
    private void rk(class_4597 var1_1, Matrix4f var2_2, class_243 var3_3, class_310 var4_4) {
        block89: {
            block88: {
                block90: {
                    break block90;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl3:
                    // 1 sources

                    while (true) {
                        var11_16.method_22994(class_12249.method_76015());
                        ** GOTO lbl256
                        break;
                    }
lbl6:
                    // 1 sources

                    block62: while (true) lbl-1000:
                    // 5 sources

                    {
                        switch (var18_7) {
                            case -1562418571: {
                                var14_19 = (Boolean)this.a.get(var11_14 + 1);
                                ** break;
                            }
                            case 256783961: {
                                var17_21 ^= var18_7 ^ -852514620;
                                var18_7 = (var16_6 | var19_5) ^ -802650990;
                                break;
                            }
                            case -1695412182: {
                                ** break;
                            }
                            case 257767835: {
                                if (var12_17.method_1025(var3_3) > 9216.0) {
                                    var18_7 = (var16_6 | var19_5) ^ 1197789555;
                                    break;
                                }
                                var18_7 = (var16_6 | var19_5) ^ 2109329598;
                                break;
                            }
                            case -793626788: {
                                var17_21 ^= var18_7 ^ 1885874046;
                                ** GOTO lbl31
                            }
lbl26:
                            // 1 sources

                            var18_7 = (var16_6 | var19_5) ^ 1161057613;
                            ** GOTO lbl207
                            case -169964201: {
                                var17_21 ^= var18_7 ^ -1136716420;
                                ** GOTO lbl33
                            }
lbl31:
                            // 1 sources

                            var18_7 = (var16_6 | var19_5) ^ 2108350332;
                            continue block62;
lbl33:
                            // 1 sources

                            var18_7 = (var16_6 | var19_5) ^ 872671422;
                            continue block62;
                            case 1190399577: {
                                ++var11_14;
                                ** GOTO lbl104
                            }
                            case 898840468: {
                                var17_21 ^= var18_7 ^ 510858493;
                                var18_7 = (var16_6 | var19_5) ^ -402262323;
                            }
                        }
                        continue;
                        break;
                    }
lbl42:
                    // 1 sources

                    while (true) {
                        var18_7 = (var16_6 | var19_5) ^ -646554078;
                        if (true) ** GOTO lbl196
                        break;
                    }
lbl45:
                    // 1 sources

                    while (true) {
                        var6_9 = var5_8 >> aw.ra(((var17_21 ^= -1941404734) | var19_5) ^ -260718068, (var16_6 | var19_5) ^ ((var17_21 | var19_5) ^ -708549034)) & aw.ra((var17_21 | var19_5) ^ -260718069, (var16_6 | var19_5) ^ ((var17_21 | var19_5) ^ -939063138));
                        var7_10 = var5_8 >> aw.ra(((var17_21 ^= 521277954) | var19_5) ^ -42610678, (var16_6 | var19_5) ^ ((var17_21 | var19_5) ^ 1950596251)) & aw.ra((var17_21 | var19_5) ^ -42610679, (var16_6 | var19_5) ^ ((var17_21 | var19_5) ^ -1353765587));
                        var8_11 = var5_8 & aw.ra(((var17_21 ^= 798813071) | var19_5) ^ -797353215, (var16_6 | var19_5) ^ ((var17_21 | var19_5) ^ 1057117782));
                        var17_21 ^= 496956600;
                        var9_12 = this.a.routeLineWidth();
                        var17_21 ^= -2120489383;
                        var10_13 = var1_1.method_73477(class_12249.method_76015());
                        var18_7 = (var16_6 | var19_5) ^ -1323409908;
                        ** GOTO lbl120
                        break;
                    }
                    while (true) {
                        v0 = aw.ra(((var17_21 ^= 2089348724) | var19_5) ^ 1366901254, (var16_6 | var19_5) ^ ((var17_21 | var19_5) ^ 402577343));
                        ** GOTO lbl76
                        break;
                    }
lbl58:
                    // 1 sources

                    while (true) {
                        var18_7 = (var16_6 | var19_5) ^ -1651784499;
                        break block88;
                        break;
                    }
lbl61:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl63:
                    // 1 sources

                    while (true) {
                        var17_21 ^= -98601859;
                        aw.line(var10_13, var2_2, (float)var12_17.field_1352, (float)var12_17.field_1351, (float)var12_17.field_1350, (float)var13_18.field_1352, (float)var13_18.field_1351, (float)var13_18.field_1350, var6_9, var7_10, var8_11, var15_20, var9_12);
lbl66:
                        // 2 sources

                        var18_7 = (var16_6 | var19_5) ^ -2027328592;
                        ** continue;
                        break;
                    }
                    while (true) {
                        var18_7 = (var16_6 | var19_5) ^ 1926515675;
                        break block88;
                        break;
                    }
lbl71:
                    // 1 sources

                    while (true) {
                        var18_7 = (var16_6 | var19_5) ^ -1572482629;
                        ** GOTO lbl-1000
                        break;
                    }
lbl74:
                    // 1 sources

                    while (true) {
                        v0 = aw.ra(((var17_21 ^= 2089348724) | var19_5) ^ 1366901255, (var16_6 | var19_5) ^ ((var17_21 | var19_5) ^ -450063983));
lbl76:
                        // 2 sources

                        var17_21 ^= 1686294551;
                        var17_21 ^= -1245251832;
                        aw.line(var10_13, var2_2, v1, v2, v3, v4, v5, v6, var6_9, var7_10, var8_11, v0, var9_12);
                        ** GOTO lbl106
                        var18_7 = (var16_6 | var19_5) ^ -1028012281;
                        block73: while (true) {
                            switch (var18_7) {
                                case -1337056800: {
                                    var17_21 ^= var18_7 ^ 1805221122;
                                    ** GOTO lbl112
                                }
                                case -442289367: {
                                    var11_15 = var4_4.field_1724.method_73189();
                                    ** break;
                                }
                                case 1007187246: {
                                    if (var4_4.field_1724 != null) {
                                        ** continue;
                                    }
                                    ** GOTO lbl106
                                }
                                case -1008092949: {
                                    var17_21 ^= var18_7 ^ 229159964;
                                    ** break;
                                }
                                case -1289863114: {
                                    var11_14 = 0;
                                    ** GOTO lbl104
                                }
lbl99:
                                // 1 sources

                                var17_21 ^= 206327317;
                                var12_17 = new class_243(var11_15.field_1352, Math.floor(var11_15.field_1351) + 0.07999999821186066, var11_15.field_1350);
                                ** continue;
lbl102:
                                // 1 sources

                                var18_7 = (var16_6 | var19_5) ^ 1325372361;
                                continue block73;
lbl104:
                                // 2 sources

                                var18_7 = (var16_6 | var19_5) ^ -1048517944;
                                break block88;
lbl106:
                                // 2 sources

                                var18_7 = (var16_6 | var19_5) ^ 765722519;
                                continue block73;
                                case 1599347056: {
                                    var17_21 ^= var18_7 ^ 1626304336;
                                    var18_7 = (var16_6 | var19_5) ^ -1041652015;
                                    break;
                                }
lbl112:
                                // 1 sources

                                var18_7 = (var16_6 | var19_5) ^ -1756047922;
                                continue block73;
                                case 1924001939: {
                                    var17_21 ^= var18_7 ^ -715826110;
                                    var18_7 = (var16_6 | var19_5) ^ 1791325789;
                                    break;
                                }
                                case 405967034: {
                                    return;
                                }
                            }
lbl120:
                            // 5 sources

                        }
                        break;
                    }
lbl121:
                    // 1 sources

                    while (true) {
                        var18_7 = (var16_6 | var19_5) ^ -2063220526;
                        break block88;
                        break;
                    }
                }
                var19_5 = 1391682790;
                var16_6 = aw.c & 1391682790 ^ 841474663;
                var18_7 = 0;
                var17_21 = (var16_6 | var19_5) ^ -1507956495;
                var18_7 = (var16_6 | var19_5) ^ -2012855918;
                block76: while (true) {
                    switch (var18_7) {
                        default: {
                            continue block76;
                        }
                        case -84826251: {
                            var18_7 = (var16_6 | var19_5) ^ 333835105;
                            continue block76;
                        }
                        case -1269699590: {
                            var5_8 = this.a.routeLineColour() & aw.ra((var17_21 | var18_7 ^ -425554148) ^ (var18_7 ^ -936596745), (var16_6 | var18_7 ^ -425554148) ^ ((var17_21 | var18_7 ^ -425554148) ^ (var18_7 ^ 609471597)));
                            ** continue;
                        }
                        case 1628573062: 
                    }
                    var17_21 ^= var18_7 ^ -291917479;
                    var18_7 = (var16_6 | var19_5) ^ -962196195;
                }
                var18_7 = (var16_6 | var19_5) ^ -1242219927;
                block77: while (true) {
                    switch (var18_7) {
                        case 847948204: {
                            var17_21 ^= var18_7 ^ -102540009;
                            break;
                        }
                        case -239970338: {
                            var13_18 = this.b.get(0);
                            ** GOTO lbl177
                        }
                        case -522801668: {
                            ** break;
                        }
                        case 280536697: {
                            var17_21 ^= var18_7 ^ 1015577662;
                            ** break;
                        }
                        case -156860054: {
                            var17_21 ^= var18_7 ^ -1067276484;
                            ** break;
lbl161:
                            // 2 sources

                            var18_7 = (var16_6 | var19_5) ^ -1843311845;
                            continue block77;
                        }
lbl163:
                        // 1 sources

                        var18_7 = (var16_6 | var19_5) ^ -2092584647;
                        continue block77;
                        case 147894773: {
                            switch (var17_21) {
                                default: {
                                    var18_7 = (var16_6 | var19_5) ^ 1649361054;
                                    break;
                                }
                                case 1652245607: {
                                    var18_7 = (var16_6 | var19_5) ^ -2075039859;
                                    continue block77;
                                }
                                case -2105559158: {
                                    var18_7 = (var16_6 | var19_5) ^ 1081954123;
                                }
                            }
                        }
                        default: {
                            continue block77;
                        }
lbl177:
                        // 1 sources

                        var17_21 ^= 1897541180;
                        v1 = (float)var12_17.field_1352;
                        v2 = (float)var12_17.field_1351;
                        v3 = (float)var12_17.field_1350;
                        v4 = (float)var13_18.field_1352;
                        v5 = (float)var13_18.field_1351;
                        v6 = (float)var13_18.field_1350;
                        break block89;
                        case -956113778: 
                    }
                    var18_7 = (var16_6 | var19_5) ^ 2049398546;
                }
lbl188:
                // 2 sources

                while (true) {
                    if (!((Boolean)this.a.get(0)).booleanValue()) ** continue;
                    ** continue;
                    break;
                }
lbl191:
                // 1 sources

                while (true) {
                    var18_7 = (var16_6 | var19_5) ^ -1569313874;
                    break block88;
                    break;
                }
                while (true) {
                    var18_7 = (var16_6 | var19_5) ^ -2049372935;
lbl196:
                    // 2 sources

                    block81: while (true) {
                        switch (var18_7) {
                            case -147920354: {
                                v7 = aw.ra((var17_21 | var18_7 ^ -1512206600) ^ (var18_7 ^ -1436566758), (var16_6 | var18_7 ^ -1512206600) ^ ((var17_21 | var18_7 ^ -1512206600) ^ (var18_7 ^ 741446700)));
                                ** GOTO lbl211
                            }
                            case -257551781: {
                                var17_21 ^= var18_7 ^ 264635856;
                                var18_7 = (var16_6 | var19_5) ^ -960467732;
                                continue block81;
                            }
                            case -1417561915: {
                                var18_7 = var14_19 != false ? (var16_6 | var19_5) ^ 156778524 : (var16_6 | var19_5) ^ -2108558148;
                            }
lbl207:
                            // 3 sources

                            default: {
                                continue block81;
                            }
                            case -1271428597: {
                                v7 = aw.ra((var17_21 | var18_7 ^ -423301395) ^ (var18_7 ^ -381232370), (var16_6 | var18_7 ^ -423301395) ^ ((var17_21 | var18_7 ^ -423301395) ^ (var18_7 ^ 1820641283)));
lbl211:
                                // 2 sources

                                var17_21 ^= 324594382;
                                var15_20 = v7;
                                ** continue;
                            }
                            case 935572394: {
                                var17_21 ^= var18_7 ^ -932870298;
                                ** continue;
                            }
                            case 2075109115: 
                        }
                        break;
                    }
                    var17_21 ^= var18_7 ^ -2066763408;
                }
lbl220:
                // 1 sources

                while (true) {
                    var13_18 = this.b.get(var11_14 + 1);
                    ** continue;
                    break;
                }
lbl223:
                // 1 sources

                while (true) {
                    var17_21 ^= 1375578015;
                    ** continue;
                    break;
                }
            }
            block84: while (true) {
                block93: {
                    block91: {
                        block92: {
                            switch (var18_7) {
                                default: {
                                    continue block84;
                                }
                                case -1284045777: {
                                    var17_21 ^= var18_7 ^ 1285836512;
                                    ** continue;
                                }
                                case 2338108: {
                                    var17_21 ^= var18_7 ^ -502287205;
                                    break block91;
                                }
                                case -1520757159: {
                                    var11_16 = (class_4597.class_4598)var1_1;
                                    ** continue;
                                }
                                case -277077462: {
                                    var12_17 = this.b.get(var11_14);
                                    break block92;
                                }
                                case -135125451: {
                                    var17_21 ^= var18_7 ^ -1100695903;
                                    ** continue;
                                }
                                case 1603520546: {
                                    var17_21 ^= var18_7 ^ 242118589;
                                    break block93;
                                }
                                case 1858735262: {
                                    if (!(var1_1 instanceof class_4597.class_4598)) break;
                                    var18_7 = (var16_6 | var19_5) ^ 761540293;
                                    continue block84;
                                }
                                case -796799671: {
                                    if (var11_14 + 1 >= this.b.size()) ** continue;
                                    ** continue;
                                }
                            }
lbl256:
                            // 2 sources

                            var18_7 = (var16_6 | var19_5) ^ 5903988;
                            ** GOTO lbl120
                        }
                        var17_21 ^= 1956540731;
                        ** continue;
                    }
                    var18_7 = (var16_6 | var19_5) ^ 473819769;
                    continue;
                }
                var18_7 = (var16_6 | var19_5) ^ -676532034;
            }
        }
        block85: while (true) {
            switch (var17_21) {
                case -1671110786: {
                    var17_21 ^= 510617501;
                    continue block85;
                }
                case 631589901: {
                    var17_21 ^= 1032442870;
                    ** GOTO lbl188
                }
            }
            break;
        }
        var17_21 ^= 242673616;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void rl(class_4597 var1_1, Matrix4f var2_2, class_243 var3_3, cy var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[SWITCH], 38[UNCONDITIONALDOLOOP]], but top level block is 8[SWITCH]
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
     * Exception decompiling
     */
    private void rm(class_4597 var1_1, Matrix4f var2_2, class_243 var3_3, cy var4_4) {
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
    private static void rn(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, int var7_7, int var8_8, int var9_9, int var10_10) {
        block37: {
            block39: {
                block36: {
                    break block37;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl3:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl5:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        var13_13 = (var11_12 | var14_11) ^ 705069644;
                        ** GOTO lbl19
lbl10:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                        break;
                    }
lbl12:
                    // 1 sources

                    while (true) {
                        block35: {
                            block38: {
                                var13_13 = (var11_12 | var14_11) ^ 561589853;
                                break block38;
lbl15:
                                // 1 sources

                                while (true) {
                                    var0.method_22918((Matrix4fc)var1_1, var4_4, var6_6, var5_5).method_1336(var7_7, var8_8, var9_9, var10_10);
                                    ** GOTO lbl44
                                    break;
                                }
                            }
lbl20:
                            // 13 sources

                            block28: while (true) {
                                switch (var13_13) lbl-1000:
                                // 6 sources

                                {
                                    default: {
                                        continue block28;
                                    }
                                    case 550253783: {
                                        ** continue;
                                    }
                                    case -1311577563: {
                                        ** continue;
                                    }
                                    case 351012924: {
                                        ** continue;
                                    }
                                    case 236298807: {
                                        ** continue;
                                    }
                                    case 1619259524: {
                                        break block35;
                                    }
                                    case -745605803: {
                                        ** continue;
                                    }
                                    case 110475376: {
                                        var12_14 ^= var13_13 ^ -539879222;
                                        break block28;
                                    }
lbl39:
                                    // 1 sources

                                    while (true) {
                                        var13_13 = (var11_12 | var14_11) ^ 108661434;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case -1984302546: {
                                        return;
                                    }
lbl44:
                                    // 1 sources

                                    var13_13 = (var11_12 | var14_11) ^ -127665066;
                                    ** GOTO lbl-1000
lbl46:
                                    // 1 sources

                                    while (true) {
                                        var13_13 = (var11_12 | var14_11) ^ -2076369782;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case 1372185445: {
                                        var12_14 ^= var13_13 ^ -1891756246;
                                        break block36;
                                    }
                                    case -1252077504: {
                                        var0.method_22918((Matrix4fc)var1_1, var2_2, var6_6, var3_3).method_1336(var7_7, var8_8, var9_9, var10_10);
                                        break;
                                    }
lbl56:
                                    // 1 sources

                                    while (true) {
                                        var13_13 = (var11_12 | var14_11) ^ -180827336;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                }
                                break;
                            }
                            var13_13 = (var11_12 | var14_11) ^ 1621766063;
                            ** GOTO lbl20
                            {
                                case -67732797: {
                                    var12_14 ^= var13_13 ^ -251067437;
                                    var13_13 = (var11_12 | var14_11) ^ -1660055408;
                                    ** GOTO lbl-1000
                                }
                            }
                            var13_13 = (var11_12 | var14_11) ^ 1429485526;
                            ** GOTO lbl20
                        }
                        var13_13 = (var11_12 | var14_11) ^ 553962076;
                        ** GOTO lbl20
                        {
                            case 668968115: {
                                var12_14 ^= var13_13 ^ -663411409;
                                ** continue;
                            }
                        }
lbl73:
                        // 1 sources

                        while (true) {
                            var13_13 = (var11_12 | var14_11) ^ 1680217546;
                            ** GOTO lbl20
                            break;
                        }
                        {
                            case -2134849479: {
                                var12_14 ^= var13_13 ^ -456916527;
                                break;
                            }
                            case -192032334: {
                                var12_14 ^= var13_13 ^ 235618517;
                                ** continue;
                            }
                            case 764871609: {
                                var12_14 ^= var13_13 ^ 1865508303;
                                ** continue;
                            }
                            case 1568067221: {
                                var12_14 ^= var13_13 ^ 90798394;
                                ** continue;
                            }
                        }
                        break;
                    }
                    var0.method_22918((Matrix4fc)var1_1, var4_4, var6_6, var3_3).method_1336(var7_7, var8_8, var9_9, var10_10);
                    var13_13 = (var11_12 | var14_11) ^ -2004733574;
                    ** GOTO lbl20
                }
                var13_13 = (var11_12 | var14_11) ^ -1055328301;
                ** GOTO lbl20
lbl95:
                // 1 sources

                while (true) {
                    var13_13 = (var11_12 | var14_11) ^ -1250488469;
                    ** GOTO lbl20
                    break;
                }
                {
                    case 1224306559: {
                        var0.method_22918((Matrix4fc)var1_1, var4_4, var6_6, var3_3).method_1336(var7_7, var8_8, var9_9, var10_10);
                        ** continue;
                    }
                }
                var13_13 = (var11_12 | var14_11) ^ 1548553665;
                ** GOTO lbl20
                {
                    case -885341: {
                        var0.method_22918((Matrix4fc)var1_1, var2_2, var6_6, var5_5).method_1336(var7_7, var8_8, var9_9, var10_10);
                        ** continue;
                    }
                    ** case -185584205:
                }
lbl109:
                // 1 sources

                var12_14 ^= var13_13 ^ 1826753180;
                break block39;
                var0.method_22918((Matrix4fc)var1_1, var2_2, var6_6, var3_3).method_1336(var7_7, var8_8, var9_9, var10_10);
                var13_13 = (var11_12 | var14_11) ^ -232039588;
                ** GOTO lbl20
                var0.method_22918((Matrix4fc)var1_1, var4_4, var6_6, var5_5).method_1336(var7_7, var8_8, var9_9, var10_10);
                var13_13 = (var11_12 | var14_11) ^ 771917100;
                ** GOTO lbl20
                var0.method_22918((Matrix4fc)var1_1, var2_2, var6_6, var5_5).method_1336(var7_7, var8_8, var9_9, var10_10);
                var13_13 = (var11_12 | var14_11) ^ -748599393;
                ** GOTO lbl20
            }
            var13_13 = (var11_12 | var14_11) ^ -605987368;
            ** while (true)
        }
        var14_11 = -988496146;
        var11_12 = aw.c & -988496146 ^ 1373961987;
        var13_13 = 0;
        var12_14 = (var11_12 | var14_11) ^ 1100245866;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void line(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, int var10_10, int var11_11, float var12_12) {
        block54: {
            block55: {
                var25_13 = 1940905420;
                var22_14 = aw.c & 1940905420 ^ -595538517;
                var24_15 = 0;
                var23_24 = (var22_14 | var25_13) ^ -1609893754;
                var24_15 = (var22_14 | var25_13) ^ -1320643466;
                break block55;
lbl7:
                // 1 sources

                while (true) {
                    var16_19 = Math.sqrt(var13_16 * var13_16 + var14_17 * var14_17 + var15_18 * var15_18);
                    var24_15 = (var22_14 | var25_13) ^ -816917283;
                    if (true) ** GOTO lbl15
                    break;
                }
lbl11:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
                block40: while (true) {
                    var24_15 = (var22_14 | var25_13) ^ -779140849;
lbl15:
                    // 2 sources

                    block41: while (true) {
                        switch (var24_15) {
                            case -611340302: {
                                var23_24 ^= var24_15 ^ -855842228;
                                continue block40;
                            }
                            case 1645609328: {
                                var18_20 = 0.0f;
                                var23_24 ^= 1005950094;
                                ** GOTO lbl44
                            }
                            case 433056909: {
                                switch (var23_24) {
                                    case 1540648638: {
                                        var24_15 = (var22_14 | var25_13) ^ 84500119;
                                        continue block41;
                                    }
                                    case -1606781368: {
                                        var24_15 = (var22_14 | var25_13) ^ 606106141;
                                        continue block41;
                                    }
                                }
                                var24_15 = (var22_14 | var25_13) ^ 1230006390;
                                ** GOTO lbl39
                            }
                            case -1224755815: {
                                var23_24 ^= var24_15 ^ 1023710642;
                                ** GOTO lbl-1000
                            }
                            case 820054322: lbl-1000:
                            // 2 sources

                            {
                                var24_15 = (var22_14 | var25_13) ^ -429903518;
                            }
lbl39:
                            // 3 sources

                            default: {
                                continue block41;
                            }
                            case 773889248: {
                                var24_15 = (var22_14 | var25_13) ^ -1648763745;
                                continue block41;
                            }
lbl44:
                            // 1 sources

                            var19_21 = 1.0f;
                            var23_24 ^= -1402826195;
                            var20_22 = 0.0f;
                            var24_15 = (var22_14 | var25_13) ^ 298792049;
                            break block54;
                            case -89750664: 
                        }
                        break;
                    }
                    var23_24 ^= var24_15 ^ -1701281678;
                }
lbl52:
                // 1 sources

                while (true) {
                    var23_24 ^= -1676163217;
                    ** continue;
                    break;
                }
lbl55:
                // 1 sources

                while (true) {
                    var24_15 = (var22_14 | var25_13) ^ 1940631164;
                    break block54;
                    break;
                }
lbl58:
                // 1 sources

                while (true) {
                    var23_24 ^= 1881142672;
                    var15_18 = var7_7 - var4_4;
                    ** continue;
                    break;
                }
lbl62:
                // 2 sources

                while (true) {
                    var24_15 = (var22_14 | var25_13) ^ -844406233;
                    break block54;
                    break;
                }
lbl65:
                // 1 sources

                while (true) {
                    var23_24 ^= -1142191182;
                    var14_17 = var6_6 - var3_3;
                    ** continue;
                    break;
                }
lbl69:
                // 1 sources

                while (true) {
                    var24_15 = (var22_14 | var25_13) ^ -1802866613;
                    break block54;
                    break;
                }
lbl72:
                // 1 sources

                while (true) {
                    var24_15 = (var22_14 | var25_13) ^ 1701022962;
                    break block55;
                    break;
                }
                var24_15 = (var22_14 | var25_13) ^ 1946854638;
                block49: while (true) {
                    switch (var24_15) {
                        case -1305980140: {
                            var19_21 = var14_17 * var21_23;
                            var24_15 = (var22_14 | var25_13) ^ -1526256551;
                            continue block49;
                        }
                        case -1952089855: {
                            var23_24 ^= var24_15 ^ 2087055220;
                            var24_15 = (var22_14 | var25_13) ^ 1300729595;
                            continue block49;
                        }
                        case 1521021366: {
                            var23_24 ^= var24_15 ^ 1363416506;
                            break;
                        }
                        case -1227597678: {
                            var23_24 ^= var24_15 ^ 573570585;
                            var24_15 = (var22_14 | var25_13) ^ -441701414;
                            continue block49;
                        }
                        case 436467253: {
                            var18_20 = var13_16 * var21_23;
                            ** continue;
                        }
                        case -82168810: {
                            var20_22 = var15_18 * var21_23;
                            ** GOTO lbl62
                        }
                    }
                    var24_15 = (var22_14 | var25_13) ^ 79030777;
lbl101:
                    // 2 sources

                }
            }
            block51: while (true) {
                switch (var24_15) {
                    default: {
                        continue block51;
                    }
                    case -798184410: {
                        var23_24 ^= var24_15 ^ 2014332490;
                        ** continue;
                    }
                    case 1323780505: {
                        var24_15 = (var22_14 | var25_13) ^ 801337801;
                        continue block51;
                    }
                    case -1697885923: 
                }
                break;
            }
            var13_16 = var5_5 - var2_2;
            ** while (true)
lbl116:
            // 1 sources

            while (true) {
                var24_15 = (var22_14 | var25_13) ^ 1232831869;
                ** GOTO lbl101
                break;
            }
        }
        block53: while (true) {
            switch (var24_15) {
                default: {
                    continue block53;
                }
                case -1939800836: {
                    var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var4_4).method_1336(var8_8, var9_9, var10_10, var11_11).method_22914(var18_20, var19_21, var20_22).method_75298(var12_12);
                    var24_15 = (var22_14 | var25_13) ^ -20823916;
                    continue block53;
                }
                case 839172040: {
                    var23_24 ^= var24_15 ^ 1465726496;
                    var24_15 = (var22_14 | var25_13) ^ 1942954259;
                    continue block53;
                }
                case 1797631396: {
                    var23_24 ^= var24_15 ^ 66222422;
                    ** break;
                }
                case 1129899710: {
                    var23_24 ^= var24_15 ^ -1981857835;
                    var24_15 = (var22_14 | var25_13) ^ -373903452;
                    continue block53;
                }
                case -1945865325: {
                    var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var7_7).method_1336(var8_8, var9_9, var10_10, var11_11).method_22914(var18_20, var19_21, var20_22).method_75298(var12_12);
                    var24_15 = (var22_14 | var25_13) ^ -1124648111;
                    continue block53;
                }
                case -1518948707: {
                    if (var16_19 > 1.0E-5) ** break;
                    ** continue;
                    ** continue;
                }
                case 23960955: {
                    var23_24 ^= var24_15 ^ -1066228696;
                    ** continue;
                }
                case -881052529: {
                    var21_23 = (float)(1.0 / var16_19);
                    ** continue;
                }
                case -295638626: {
                    var23_24 ^= var24_15 ^ -630214851;
                    var24_15 = (var22_14 | var25_13) ^ 1524200306;
                    continue block53;
                }
lbl159:
                // 1 sources

                var24_15 = (var22_14 | var25_13) ^ 886303072;
                continue block53;
                case 370766411: 
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static void ro(class_4588 var0, Matrix4f var1_1, class_2338 var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
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
    private static void rp(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, int var7_7, int var8_8, int var9_9, int var10_10) {
        block38: {
            block32: {
                block39: {
                    block33: {
                        block37: {
                            block34: {
                                break block34;
lbl1:
                                // 8 sources

                                block21: while (true) {
                                    block35: {
                                        block36: {
                                            switch (var13_13) lbl-1000:
                                            // 6 sources

                                            {
                                                default: {
                                                    continue block21;
                                                }
                                                case -1557206132: {
                                                    var12_14 ^= var13_13 ^ 528977934;
                                                    break block35;
                                                }
lbl8:
                                                // 1 sources

                                                while (true) {
                                                    var13_13 = (var11_12 | var14_11) ^ 68674604;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
                                                case -761099232: {
                                                    var12_14 ^= var13_13 ^ -408505738;
                                                    break block32;
                                                }
lbl14:
                                                // 1 sources

                                                while (true) {
                                                    var13_13 = (var11_12 | var14_11) ^ -1135421910;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
lbl17:
                                                // 1 sources

                                                while (true) {
                                                    var13_13 = (var11_12 | var14_11) ^ 2052146545;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
                                                case 2144208984: {
                                                    var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var4_4).method_1336(var7_7, var8_8, var9_9, var10_10);
                                                    break;
                                                }
                                                case -518010530: {
                                                    var0.method_22918((Matrix4fc)var1_1, var5_5, var3_3, var4_4).method_1336(var7_7, var8_8, var9_9, var10_10);
                                                    break;
                                                }
lbl28:
                                                // 1 sources

                                                while (true) {
                                                    var13_13 = (var11_12 | var14_11) ^ 1626408264;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
                                            }
                                            var13_13 = (var11_12 | var14_11) ^ -598268565;
                                            continue;
                                            {
                                                case -580367663: {
                                                    var12_14 ^= var13_13 ^ 1039848937;
                                                    break block33;
                                                }
                                                case -1919200258: {
                                                    var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var4_4).method_1336(var7_7, var8_8, var9_9, var10_10);
                                                    ** continue;
                                                }
                                                case 1448582330: {
                                                    var12_14 ^= var13_13 ^ 1783208959;
                                                    break block36;
                                                }
                                            }
lbl43:
                                            // 1 sources

                                            while (true) {
                                                var13_13 = (var11_12 | var14_11) ^ 945842083;
                                                continue block21;
                                                break;
                                            }
                                        }
                                        var13_13 = (var11_12 | var14_11) ^ -305296025;
                                        continue;
                                    }
                                    var13_13 = (var11_12 | var14_11) ^ 291835792;
                                    continue;
lbl52:
                                    // 1 sources

                                    while (true) {
                                        var13_13 = (var11_12 | var14_11) ^ 581126885;
                                        continue block21;
                                        break;
                                    }
                                    {
                                        case -1055684206: {
                                            var12_14 ^= var13_13 ^ 1237480051;
                                            ** continue;
                                        }
                                    }
lbl58:
                                    // 1 sources

                                    while (true) {
                                        var13_13 = (var11_12 | var14_11) ^ 1424293123;
                                        continue block21;
                                        break;
                                    }
                                    {
                                        case -69409768: {
                                            var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var4_4).method_1336(var7_7, var8_8, var9_9, var10_10);
                                            ** continue;
                                        }
                                    }
                                    break;
                                }
lbl65:
                                // 1 sources

                                while (true) {
                                    var13_13 = (var11_12 | var14_11) ^ -1606083698;
                                    ** GOTO lbl1
                                    break;
                                }
                                {
                                    case 2033890675: {
                                        break block37;
                                    }
                                }
lbl70:
                                // 1 sources

                                while (true) {
                                    var13_13 = (var11_12 | var14_11) ^ -369503142;
                                    ** GOTO lbl1
                                    break;
                                }
                                {
                                    case -648312451: {
                                        var12_14 ^= var13_13 ^ 1689140783;
                                        var13_13 = (var11_12 | var14_11) ^ -1498306907;
                                        ** GOTO lbl-1000
                                    }
                                }
                            }
                            var14_11 = -648141788;
                            var11_12 = aw.c & -648141788 ^ -1724937479;
                            var13_13 = 0;
                            var12_14 = (var11_12 | var14_11) ^ 570462874;
                            ** while (true)
                        }
                        var13_13 = (var11_12 | var14_11) ^ -1893191097;
                        ** GOTO lbl1
                        {
                            case -1181832267: {
                                var0.method_22918((Matrix4fc)var1_1, var2_2, var6_6, var4_4).method_1336(var7_7, var8_8, var9_9, var10_10);
                                break block38;
                            }
                            case -937778835: {
                                var0.method_22918((Matrix4fc)var1_1, var5_5, var3_3, var4_4).method_1336(var7_7, var8_8, var9_9, var10_10);
                                break block39;
                            }
                        }
                        var13_13 = (var11_12 | var14_11) ^ 409741167;
                        ** GOTO lbl1
                    }
                    var13_13 = (var11_12 | var14_11) ^ 362528272;
                    ** GOTO lbl1
                }
                var13_13 = (var11_12 | var14_11) ^ 2369408;
                ** GOTO lbl1
            }
            var13_13 = (var11_12 | var14_11) ^ 2043380771;
            ** GOTO lbl1
            {
                case 884089754: {
                    var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var4_4).method_1336(var7_7, var8_8, var9_9, var10_10);
                    ** continue;
                }
                case 1697478871: {
                    var12_14 ^= var13_13 ^ -1688876992;
                    ** continue;
                }
                case -1598805282: {
                    var0.method_22918((Matrix4fc)var1_1, var2_2, var6_6, var4_4).method_1336(var7_7, var8_8, var9_9, var10_10);
                    ** continue;
                }
                case 814119591: {
                    var12_14 ^= var13_13 ^ 1758741990;
                    ** continue;
                }
                case 86543254: {
                    var12_14 ^= var13_13 ^ 1435722359;
                    ** continue;
                }
                ** case -857468691:
            }
lbl123:
            // 1 sources

            return;
        }
        var13_13 = (var11_12 | var14_11) ^ 0xBDD22DD;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void rq(class_4588 class_45882, Matrix4f matrix4f, float f2, float f3, float f4, float f5, float f6, int n2, int n3, int n4, int n5) {
        int n6 = 1214075717;
        int n7 = c & 0x485D5345 ^ 0xCB8EB6F5;
        int n8 = 0;
        int n9 = (n7 | n6) ^ 0x930C95B;
        n8 = (n7 | n6) ^ 0x2B3DF2F;
        block21: while (true) {
            switch (n8) {
                default: {
                    continue block21;
                }
                case -1950597131: {
                    class_45882.method_22918((Matrix4fc)matrix4f, f2, f3, f6).method_1336(n2, n3, n4, n5);
                    n8 = (n7 | n6) ^ 0x810313B9;
                    continue block21;
                }
                case -1226472059: {
                    class_45882.method_22918((Matrix4fc)matrix4f, f2, f5, f6).method_1336(n2, n3, n4, n5);
                    n8 = (n7 | n6) ^ 0x3200CF9C;
                    continue block21;
                }
                case 1255990348: {
                    n9 ^= n8 ^ 0x441343E0;
                    n8 = (n7 | n6) ^ 0xD1C5B88;
                    continue block21;
                }
                case 350178245: {
                    n9 ^= n8 ^ 0x19470BB;
                    n8 = (n7 | n6) ^ 0x9DE5201E;
                    continue block21;
                }
                case 1873711528: {
                    n9 ^= n8 ^ 0x84D32151;
                    n8 = (n7 | n6) ^ 0x4063C800;
                    continue block21;
                }
                case 810811362: {
                    class_45882.method_22918((Matrix4fc)matrix4f, f2, f3, f6).method_1336(n2, n3, n4, n5);
                    n8 = (n7 | n6) ^ 0x89AE7B0B;
                    continue block21;
                }
                case 1446696939: {
                    class_45882.method_22918((Matrix4fc)matrix4f, f2, f5, f4).method_1336(n2, n3, n4, n5);
                    n8 = (n7 | n6) ^ 0x80EF2AEE;
                    continue block21;
                }
                case -401897013: {
                    return;
                }
                case -1475944968: {
                    n9 ^= n8 ^ 0x6236B5A7;
                    n8 = (n7 | n6) ^ 0x7D3A7270;
                    continue block21;
                }
                case 480625290: {
                    n9 ^= n8 ^ 0xE22B22DF;
                    n8 = (n7 | n6) ^ 0xC1DCFA47;
                    continue block21;
                }
                case -944533472: {
                    n9 ^= n8 ^ 0x3E8C625C;
                    n8 = (n7 | n6) ^ 0x23D47E3E;
                    continue block21;
                }
                case 1114737918: {
                    n9 ^= n8 ^ 0xE8ACA7F;
                    n8 = (n7 | n6) ^ 0x2EE50C98;
                    continue block21;
                }
                case -102811543: {
                    n9 ^= n8 ^ 0x76EFDF15;
                    n8 = (n7 | n6) ^ 0xFB8C0817;
                    continue block21;
                }
                case 167972274: {
                    class_45882.method_22918((Matrix4fc)matrix4f, f2, f3, f4).method_1336(n2, n3, n4, n5);
                    n8 = (n7 | n6) ^ 0xA471665D;
                    continue block21;
                }
                case -960254851: {
                    class_45882.method_22918((Matrix4fc)matrix4f, f2, f5, f6).method_1336(n2, n3, n4, n5);
                    n8 = (n7 | n6) ^ 0xDF00BC30;
                    continue block21;
                }
                case -915658534: {
                    n8 = (n7 | n6) ^ 0xD77A357F;
                    continue block21;
                }
                case 1651476109: {
                    class_45882.method_22918((Matrix4fc)matrix4f, f2, f5, f4).method_1336(n2, n3, n4, n5);
                    n8 = (n7 | n6) ^ 0x63D92A0D;
                    continue block21;
                }
                case -449119379: {
                    class_45882.method_22918((Matrix4fc)matrix4f, f2, f3, f4).method_1336(n2, n3, n4, n5);
                    n8 = (n7 | n6) ^ 0xC6C67D5;
                    continue block21;
                }
                case 1261493531: 
            }
            n9 ^= n8 ^ 0x9848FD89;
            n8 = (n7 | n6) ^ 0xA9B07178;
        }
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ int rr(Long var0, Long var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
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
    private static /* synthetic */ Map rs(Long l2) {
        int n2 = c & 0x2D2D6CD3 ^ 0x8D728354;
        int n3 = 0;
        int n4 = (n2 | 0x2D2D6CD3) ^ 0xD438369C;
        n3 = (n2 | 0x2D2D6CD3) ^ 0x14DCA27B;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 496100224: {
                    n4 ^= n3 ^ 0x4CCB8C61;
                    n3 = (n2 | 0x2D2D6CD3) ^ 0x92937E0;
                    continue block5;
                }
                case -1537812425: {
                    return new HashMap();
                }
                case -1180480084: 
            }
            n3 = (n2 | 0x2D2D6CD3) ^ 0xB0EE0C57;
        }
    }
}

