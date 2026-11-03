/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_238
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 */
package z.r;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import z.r.bM;
import z.r.ej;
import z.r.gP;
import z.r.ix;
import z.r.ke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class C
extends bM {
    private static final /* synthetic */ String a;
    private boolean a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private final gP a;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String d;
    private final ke a;
    private static final /* synthetic */ String e;
    private static final int[] a;
    private final ke b;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    public static final int a;
    private final ke c;
    private final gP b;
    private final gP c;
    private static C a;
    private final gP d;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private static final double a;
    private final ke d;
    private final ke e;
    private static final double b;
    private final ke f;
    private final ej a;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private final ke g;
    private final ke h;
    private boolean b;
    private static final double c;
    private static final double d;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String s;

    /*
     * Exception decompiling
     */
    public C() {
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
    public static C instance() {
        int n2 = a & 0x2B2A86BD ^ 0xC0910984;
        int n3 = 0;
        int n4 = (n2 | 0x2B2A86BD) ^ 0x5AC2B099;
        n3 = (n2 | 0x2B2A86BD) ^ 0x25EDE999;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1715745332: {
                    return a;
                }
                case 709064564: {
                    n4 ^= n3 ^ 0xA8E672F1;
                    n3 = (n2 | 0x2B2A86BD) ^ 0x8DFFBD89;
                    continue block5;
                }
                case -833198556: 
            }
            n3 = (n2 | 0x2B2A86BD) ^ 0xC1F8F8C9;
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean wantsRotation() {
        block27: {
            block26: {
                block28: {
                    block25: {
                        break block28;
lbl1:
                        // 1 sources

                        while (true) {
                            v0 = false;
                            break block25;
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            if (!this.a.active()) break block26;
                            ** GOTO lbl66
                            break;
                        }
                    }
lbl8:
                    // 2 sources

                    while (true) {
                        var2_4 ^= -1540764086;
                        ** GOTO lbl62
                        break;
                    }
lbl11:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 953545101;
                        ** GOTO lbl45
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -1209743799;
                        break block27;
                        break;
                    }
lbl17:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -1817238197;
                        ** continue;
                        break;
                    }
lbl20:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -236080548;
                        ** GOTO lbl45
                        break;
                    }
lbl23:
                    // 1 sources

                    while (true) {
                        if (this.isEnabled()) {
                            ** continue;
                        }
                        break block26;
                        break;
                    }
                }
                var4_1 = 130163611;
                var1_2 = C.a & 130163611 ^ 854582600;
                var3_3 = 0;
                var2_4 = (var1_2 | var4_1) ^ 752279418;
                var3_3 = (var1_2 | var4_1) ^ 1381129022;
                ** GOTO lbl45
            }
            var3_3 = (var1_2 | var4_1) ^ -54993541;
            ** GOTO lbl45
lbl37:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 551106487;
                ** GOTO lbl45
                break;
            }
        }
        var3_3 = (var1_2 | var4_1) ^ 1015425322;
        if (true) ** GOTO lbl45
        block20: while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1229687057;
lbl45:
            // 7 sources

            block21: while (true) {
                switch (var3_3) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block21;
                        }
                        break;
                    }
                    case 191483633: {
                        ** continue;
                    }
                    case -220412444: {
                        ** continue;
                    }
                    case -883475808: {
                        ** continue;
                    }
                    case -2124705484: {
                        ** continue;
                    }
                    case 255465046: {
                        ** continue;
                    }
                    case 1706933477: {
                        continue block20;
                    }
lbl62:
                    // 1 sources

                    return v0;
                    case 389468268: {
                        v0 = true;
                        ** continue;
                    }
lbl66:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 1775235400;
                    ** GOTO lbl-1000
lbl68:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -986504641;
                        ** continue;
                        break;
                    }
                    case 1579161235: {
                        var2_4 ^= var3_3 ^ 580119162;
                        ** continue;
                    }
                    case -972925561: 
                }
                break;
            }
            break;
        }
        ** while (true)
    }

    private static int V(int n2, int n3) {
        int n4 = 178478259;
        int n5 = -133583807;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x7376EC2C)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xFAAB6DD6;
        n6 ^= (n5 | n4) ^ 0xFAAB98A4;
        n6 ^= (n5 | n4) ^ 0xFAAB94A9;
        n6 ^= (n5 | n4) ^ 0xFAAB4B3E;
        n6 -= (n5 | n4) ^ 0xFAAB2BB3;
        n6 -= (n5 | n4) ^ 0xFAABD50D;
        n6 -= (n5 | n4) ^ 0xFAABEDE5;
        return n6 -= (n5 | n4) ^ 0xFAAB76D6;
    }

    /*
     * Enabled aggressive block sorting
     */
    public double[] computeAdjustment(double d2) {
        int n2 = a & 0x2B695F0A ^ 0xFD2888BC;
        int n3 = 0;
        int n4 = (n2 | 0x2B695F0A) ^ 0x381B42CF;
        n3 = (n2 | 0x2B695F0A) ^ 0xAA4499DF;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1429030497: {
                    n3 = (n2 | 0x2B695F0A) ^ 0xC81DD25C;
                    continue block5;
                }
                case -2064589893: {
                    return this.a.step(d2);
                }
                case 930352610: 
            }
            n4 ^= n3 ^ 0xF2B36B0A;
            n3 = (n2 | 0x2B695F0A) ^ 0x7B990405;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onDisable() {
        block17: {
            block16: {
                break block16;
lbl1:
                // 1 sources

                while (true) {
                    this.W();
                    ** GOTO lbl34
                    break;
                }
lbl4:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -902676332;
                    if (true) ** GOTO lbl24
                    break;
                }
                block11: while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 91451357;
lbl9:
                    // 3 sources

                    block12: while (true) {
                        switch (var3_3) lbl-1000:
                        // 5 sources

                        {
                            while (true) {
                                default: {
                                    continue block12;
                                }
                                break;
                            }
                            case 217343130: {
                                ** continue;
                            }
                            case -1163601606: {
                                ** continue;
                            }
                            case -1748286346: {
                                var2_4 ^= var3_3 ^ 1736178708;
                                break block11;
                            }
                            case -1230784576: {
                                this.a.release();
                                continue block11;
                            }
lbl24:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -1289497987;
                            ** GOTO lbl-1000
                            case 1698941303: {
                                return;
                            }
lbl28:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -627802224;
                                ** GOTO lbl-1000
                                break;
                            }
lbl31:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 615121369;
                                ** GOTO lbl-1000
                                break;
                            }
lbl34:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -1260819226;
                            ** continue;
                        }
                        break;
                    }
                    break;
                }
                var3_3 = (var1_2 | var4_1) ^ 158597415;
                ** GOTO lbl9
            }
            var4_1 = -1164593434;
            var1_2 = C.a & -1164593434 ^ -1211685789;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -1574284206;
            ** while (true)
            {
                case -1686259906: {
                    break block17;
                }
                ** case 185522689:
            }
lbl47:
            // 1 sources

            var2_4 ^= var3_3 ^ 693401352;
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ 672985745;
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
     * Exception decompiling
     */
    @Override
    public void onCombatTick() {
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
    private void idle() {
        int n2 = -89168479;
        int n3 = a & 0xFAAF65A1 ^ 0x29D60D8A;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xA2A87CD5;
        n4 = (n3 | n2) ^ 0x845906E;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case -63867965: {
                    return;
                }
                case -205849147: {
                    n4 = (n3 | n2) ^ 0xD74492D8;
                    continue block7;
                }
                case 646069573: {
                    this.a.release();
                    n4 = (n3 | n2) ^ 0x97C3B272;
                    continue block7;
                }
                case 750518131: {
                    n5 ^= n4 ^ 0x247F2A5E;
                    n4 = (n3 | n2) ^ 0xDD7D50EE;
                    continue block7;
                }
                case 1815928793: 
            }
            n5 ^= n4 ^ 0xEF9106C;
            n4 = (n3 | n2) ^ 0x7CE1E68;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void W() {
        int n2 = 1355103938;
        int n3 = a & 0x50C53EC2 ^ 0xF8D471B0;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xBDD0F910;
        n4 = (n3 | n2) ^ 0x4FBCBD6B;
        block9: while (true) {
            switch (n4) {
                default: {
                    continue block9;
                }
                case -1366928261: {
                    n5 ^= n4 ^ 0xD149EC4B;
                    n4 = (n3 | n2) ^ 0x5725FCB5;
                    continue block9;
                }
                case -1343192249: {
                    return;
                }
                case -1260484788: {
                    n5 ^= n4 ^ 0x6DA1205D;
                    n4 = (n3 | n2) ^ 0x74CA4B3A;
                    continue block9;
                }
                case -1944111928: {
                    this.b = false;
                    n4 = (n3 | n2) ^ 0xA32E770C;
                    continue block9;
                }
                case 1543178494: {
                    n5 ^= n4 ^ 0x7CCDE09C;
                    n4 = (n3 | n2) ^ 0x31E4FDE;
                    continue block9;
                }
                case -70569940: {
                    this.a = false;
                    n4 = (n3 | n2) ^ 0x56532B89;
                    continue block9;
                }
                case -1217805671: 
            }
            n4 = (n3 | n2) ^ 0x4C0BF8BE;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private double X() {
        block18: {
            break block18;
lbl-1000:
            // 5 sources

            {
                switch (var6_3) {
                    case -1496998350: {
                        var5_7 ^= var6_3 ^ -1970547293;
                        ** GOTO lbl24
                    }
                    case 391516416: {
                        if (var3_6.method_17783() != class_239.class_240.field_1333) {
                            var6_3 = (var4_2 | var7_1) ^ -1880246280;
                            break;
                        }
                        ** GOTO lbl16
                    }
                    case 1921140749: {
                        var5_7 ^= var6_3 ^ -1879613017;
                        ** GOTO lbl18
                    }
                    case -1273478892: {
                        v0 = 2.5;
                        ** GOTO lbl28
                    }
lbl16:
                    // 1 sources

                    var6_3 = (var4_2 | var7_1) ^ -1142230092;
                    continue block13;
lbl18:
                    // 1 sources

                    var6_3 = (var4_2 | var7_1) ^ -296815972;
                    continue block13;
                    case 1183124545: {
                        var5_7 ^= var6_3 ^ -1141889557;
                        var6_3 = (var4_2 | var7_1) ^ 1232584417;
                        continue block13;
                    }
lbl24:
                    // 1 sources

                    var6_3 = (var4_2 | var7_1) ^ -365302027;
                    continue block13;
                    case 320933225: {
                        v0 = var3_6.method_17784().method_1022(var1_4);
lbl28:
                        // 2 sources

                        var5_7 ^= -285337844;
                        return v0;
                    }
                }
lbl30:
                // 3 sources

                ** while (true)
            }
lbl31:
            // 1 sources

            while (true) {
                var5_7 ^= -823154626;
                var3_6 = C.a.field_1687.method_17742(new class_3959(var1_4, var2_5, class_3959.class_3960.field_17558, class_3959.class_242.field_1347, (class_1297)C.a.field_1724));
                var6_3 = (var4_2 | var7_1) ^ 1537892807;
                ** GOTO lbl30
                break;
            }
        }
        var7_1 = -1255676047;
        var4_2 = C.a & -1255676047 ^ 1766489589;
        var6_3 = 0;
        var5_7 = (var4_2 | var7_1) ^ -1118017194;
        var6_3 = (var4_2 | var7_1) ^ 586070643;
        block16: while (true) {
            switch (var6_3) {
                default: {
                    continue block16;
                }
                case 1319354680: {
                    var5_7 ^= var6_3 ^ 166728586;
                    var6_3 = (var4_2 | var7_1) ^ 116777257;
                    continue block16;
                }
                case -545176186: {
                    var6_3 = (var4_2 | var7_1) ^ -1278460211;
                    continue block16;
                }
                case -73785636: 
            }
            break;
        }
        var1_4 = C.a.field_1724.method_73189();
        var5_7 ^= -1671615531;
        var2_5 = var1_4.method_1031(0.0, -2.5, 0.0);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private boolean Y(double var1_1) {
        block38: {
            block39: {
                block40: {
                    block33: {
                        block37: {
                            block34: {
                                block36: {
                                    block35: {
                                        break block39;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            var8_4 = (var6_3 | var9_2) ^ 315272083;
                                            break block33;
                                            break;
                                        }
lbl4:
                                        // 1 sources

                                        while (true) {
                                            var8_4 = (var6_3 | var9_2) ^ 852068152;
                                            break block33;
                                            break;
                                        }
lbl7:
                                        // 1 sources

                                        while (true) {
                                            var7_8 ^= var8_4 ^ 1116082889;
                                            break block34;
                                            break;
                                        }
lbl10:
                                        // 1 sources

                                        while (true) {
                                            v0 = false;
                                            break block35;
                                            break;
                                        }
lbl13:
                                        // 1 sources

                                        while (true) {
                                            var7_8 ^= var8_4 ^ -532664514;
                                            break block36;
                                            break;
                                        }
                                    }
lbl17:
                                    // 2 sources

                                    while (true) {
                                        var7_8 ^= 2055302541;
                                        break block37;
                                        break;
                                    }
lbl20:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                var8_4 = (var6_3 | var9_2) ^ 161816668;
                                break block38;
lbl25:
                                // 1 sources

                                while (true) {
                                    var7_8 ^= -536932495;
                                    ** continue;
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var8_4 = (var6_3 | var9_2) ^ 21502739;
                                    break block33;
                                    break;
                                }
                            }
                            var8_4 = (var6_3 | var9_2) ^ 739612944;
                            break block33;
lbl34:
                            // 1 sources

                            while (true) {
                                v0 = true;
                                ** continue;
                                break;
                            }
lbl37:
                            // 1 sources

                            while (var5_7.method_17783() != class_239.class_240.field_1333) {
                                ** continue;
lbl39:
                                // 1 sources

                                ** GOTO lbl28
                            }
                            break block40;
lbl41:
                            // 1 sources

                            while (true) {
                                var4_6 = var3_5.method_1031(0.0, var1_1 - 0.05, 0.0);
                                ** continue;
                                break;
                            }
                        }
                        return v0;
lbl46:
                        // 1 sources

                        while (true) {
                            var7_8 ^= var8_4 ^ 816725360;
                            ** continue;
                            break;
                        }
lbl49:
                        // 1 sources

                        while (true) {
                            var7_8 ^= var8_4 ^ -803331192;
                            ** continue;
                            break;
                        }
                    }
lbl53:
                    // 3 sources

                    block27: while (true) {
                        switch (var8_4) {
                            default: {
                                continue block27;
                            }
                            case -297803281: {
                                ** continue;
                            }
                            case -37924497: {
                                ** continue;
                            }
                            case -1016962068: {
                                ** continue;
                            }
                            case -574718524: {
                                ** GOTO lbl37
                            }
                            case -1676161450: {
                                ** continue;
                            }
                            ** case 1220350150:
lbl68:
                            // 1 sources

                            ** continue;
                        }
                        break;
                    }
lbl69:
                    // 1 sources

                    while (true) {
                        var7_8 ^= 1784044865;
                        ** continue;
                        break;
                    }
lbl72:
                    // 1 sources

                    while (true) {
                        var8_4 = (var6_3 | var9_2) ^ 87159034;
                        break block38;
                        break;
                    }
lbl75:
                    // 1 sources

                    while (true) {
                        var8_4 = (var6_3 | var9_2) ^ 866660888;
                        break block38;
                        break;
                    }
lbl78:
                    // 1 sources

                    while (true) {
                        var3_5 = C.a.field_1724.method_73189();
                        ** continue;
                        break;
                    }
                }
                var8_4 = (var6_3 | var9_2) ^ 1935684778;
                ** GOTO lbl53
            }
            var9_2 = 1630927476;
            var6_3 = C.a & 1630927476 ^ -1891192632;
            var8_4 = 0;
            var7_8 = (var6_3 | var9_2) ^ 1208686495;
            ** while (true)
        }
        block32: while (true) {
            switch (var8_4) {
                default: {
                    continue block32;
                }
                case -364508666: {
                    ** continue;
                }
                case -589313820: {
                    ** continue;
                }
                ** case -422389088:
lbl100:
                // 1 sources

                ** continue;
            }
            break;
        }
        var5_7 = C.a.field_1687.method_17742(new class_3959(var3_5, var4_6, class_3959.class_3960.field_17558, class_3959.class_242.field_1347, (class_1297)C.a.field_1724));
        var8_4 = (var6_3 | var9_2) ^ -1479873990;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static class_243 Z(class_243 var0, class_238 var1_1) {
        block18: {
            break block18;
lbl1:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_2 = C.a & 1205187045 ^ 777744748;
        var4_3 = 0;
        var3_4 = (var2_2 | 1205187045) ^ -613191069;
        var4_3 = (var2_2 | 1205187045) ^ 674550146;
        block14: while (true) {
            switch (var4_3) {
                default: {
                    continue block14;
                }
                case 2140528418: {
                    var3_4 ^= var4_3 ^ 564067472;
                    var4_3 = (var2_2 | 1205187045) ^ 1514902521;
                    continue block14;
                }
                case 898916884: {
                    var3_4 ^= -2036294652;
                    v0 = class_3532.method_15350((double)var0.field_1352, (double)var1_1.field_1323, (double)var1_1.field_1320);
                    v1 = var0.field_1351;
                    v2 = var1_1.field_1322;
                    v3 = var1_1.field_1325;
                    break block14;
                }
                case 1206591599: {
                    var4_3 = (var2_2 | 1205187045) ^ 273297103;
                    continue block14;
                }
            }
            break;
        }
        block15: while (true) {
            switch (var3_4) {
                default: {
                    var3_4 ^= 1906064872;
                    continue block15;
                }
                case 1812413496: {
                    var3_4 ^= -2040458214;
                    ** GOTO lbl1
                }
                case 345471800: 
            }
            break;
        }
        var3_4 ^= 649653953;
        ** while (true)
lbl37:
        // 2 sources

        while (true) {
            v4(v0, v5, class_3532.method_15350((double)v6, (double)v7, (double)v8));
            var3_4 ^= 1319526439;
            return v4;
        }
        v5 = class_3532.method_15350((double)v1, (double)v2, (double)v3);
        v6 = var0.field_1350;
        v7 = var1_1.field_1321;
        v8 = var1_1.field_1324;
        block17: while (true) {
            switch (var3_4) {
                case 1498232311: {
                    var3_4 ^= -886545650;
                    ** GOTO lbl37
                }
                case -1562706581: {
                    var3_4 ^= -809299693;
                    continue block17;
                }
            }
            break;
        }
        var3_4 ^= 1184718451;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static class_243 aa(class_243 var0, class_243 var1_1, class_238 var2_2, class_243 var3_3) {
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
    private static class_243 ab(class_1309 class_13092) {
        int n2 = a & 0xBE10B7B2 ^ 0x6C8AB890;
        int n3 = 0;
        int n4 = (n2 | 0xBE10B7B2) ^ 0x84F5229A;
        n3 = (n2 | 0xBE10B7B2) ^ 0x60265DBD;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -2127000970: {
                    n4 ^= n3 ^ 0xA6851214;
                    n3 = (n2 | 0xBE10B7B2) ^ 0x989B50D0;
                    continue block5;
                }
                case 1711402850: {
                    n4 ^= 0xB82B635E;
                    n4 ^= 0x43B6069C;
                    n4 ^= 0xAA48CBDC;
                    return new class_243(class_13092.method_23317() - class_13092.field_6014, class_13092.method_23318() - class_13092.field_6036, class_13092.method_23321() - class_13092.field_5969);
                }
                case -1631788529: 
            }
            n3 = (n2 | 0xBE10B7B2) ^ 0x7FA235C4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static double ac(class_243 class_2432, class_238 class_2383) {
        double d2;
        int n2 = a & 0x195653CF ^ 0x73C671E8;
        int n3 = 0;
        int n4 = (n2 | 0x195653CF) ^ 0xFC41169A;
        n3 = (n2 | 0x195653CF) ^ 0x5844C3CC;
        block5: while (true) {
            switch (n3) {
                case 1549924260: {
                    n4 ^= n3 ^ 0xF46A5F7B;
                    n3 = (n2 | 0x195653CF) ^ 0xBD2EBD6E;
                }
                default: {
                    continue block5;
                }
                case -956772735: {
                    d2 = Math.max(Math.max(class_2383.field_1323 - class_2432.field_1352, 0.0), class_2432.field_1352 - class_2383.field_1320);
                    n4 ^= 0x62211B24;
                    break block5;
                }
                case 596815907: {
                    n3 = (n2 | 0x195653CF) ^ 0x27B7844B;
                    continue block5;
                }
            }
            break;
        }
        double d3 = Math.max(Math.max(class_2383.field_1322 - class_2432.field_1351, 0.0), class_2432.field_1351 - class_2383.field_1325);
        n4 ^= 0x34E260D;
        double d4 = Math.max(Math.max(class_2383.field_1321 - class_2432.field_1350, 0.0), class_2432.field_1350 - class_2383.field_1324);
        n4 ^= 0x36C461D3;
        return Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
    }

    /*
     * Exception decompiling
     */
    private class_1309 ad(double var1_1) {
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
    private boolean ae(class_1297 var1_1, class_243 var2_2, class_243 var3_3) {
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
    private boolean af(class_1297 var1_1, class_243 var2_2, class_243 var3_3) {
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
    private boolean ag(class_1657 var1_1) {
        block31: {
            block32: {
                block30: {
                    break block32;
                    {
                        var5_4 = (var3_3 | var6_2) ^ 269693009;
lbl2:
                        // 4 sources

                        block16: while (true) {
                            switch (var5_4) lbl-1000:
                            // 5 sources

                            {
                                while (true) {
                                    default: {
                                        continue block16;
                                    }
                                    break;
                                }
lbl7:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ -660084111;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ -570304397;
                                    ** GOTO lbl-1000
                                    break;
                                }
                                case -1405664356: {
                                    var4_6 ^= var5_4 ^ -33500897;
                                    ** continue;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 1484502296;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl19:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ -1513779310;
                                    if (true) ** GOTO lbl47
                                    break;
                                }
                                case 781338432: {
                                    var4_6 ^= var5_4 ^ 1932930772;
                                    continue block15;
                                }
                                case 932236342: {
                                    var4_6 ^= var5_4 ^ 1705467573;
                                    ** continue;
                                }
                                case -1550942697: {
                                    if (var2_5.equals(var1_1.method_5781())) {
                                        break block15;
                                    }
                                    break block30;
                                }
                                case 636752764: {
                                    v0 = true;
                                    break;
                                }
lbl35:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 133911278;
                                    ** continue;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    var5_4 = (var3_3 | var6_2) ^ -865794247;
                    ** GOTO lbl2
lbl40:
                    // 1 sources

                    return v0;
lbl42:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                    block25: while (true) {
                        var4_6 ^= var5_4 ^ -137672124;
                        var5_4 = (var3_3 | var6_2) ^ -1712664771;
lbl47:
                        // 3 sources

                        block26: while (true) {
                            switch (var5_4) {
                                default: {
                                    continue block26;
                                }
                                case 1580221597: {
                                    break block31;
                                }
                                case 1646199858: {
                                    ** continue;
                                }
                                case -2037124574: {
                                    break;
                                }
                            }
                            continue block25;
                            break;
                        }
                        break;
                    }
                    var2_5 = C.a.field_1724.method_5781();
                    var5_4 = (var3_3 | var6_2) ^ -714634161;
                    ** GOTO lbl2
                }
                while (true) {
                    var5_4 = (var3_3 | var6_2) ^ 1472366739;
                    ** continue;
                    break;
                }
                {
                    case -337183906: {
                        if (var2_5 == null) ** continue;
                        ** continue;
                    }
                }
lbl68:
                // 2 sources

                while (true) {
                    var4_6 ^= 1567802878;
                    ** continue;
                    break;
                }
            }
            var6_2 = -219053553;
            var3_3 = C.a & -219053553 ^ -1178252544;
            var5_4 = 0;
            var4_6 = (var3_3 | var6_2) ^ -758074331;
            ** while (true)
            {
                case 592585086: {
                    v0 = false;
                    ** continue;
                }
                ** case -66151967:
            }
lbl81:
            // 1 sources

            ** while (true)
        }
        var5_4 = (var3_3 | var6_2) ^ 2103851309;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static boolean ah(class_1297 var0) {
        block26: {
            break block26;
lbl1:
            // 1 sources

            while (true) {
                var5_3 = (var3_2 | var6_1) ^ 833687412;
                ** GOTO lbl12
lbl4:
                // 2 sources

                while (true) {
                    var4_6 ^= 1300152404;
                    return v0;
                }
                break;
            }
lbl7:
            // 1 sources

            while (true) {
                var5_3 = (var3_2 | var6_1) ^ 866606654;
                if (true) ** GOTO lbl12
                block22: while (true) {
                    var5_3 = (var3_2 | var6_1) ^ 491674505;
lbl12:
                    // 3 sources

                    block23: while (true) {
                        switch (var5_3) {
                            case -1867016076: {
                                var5_3 = (var3_2 | var6_1) ^ -57540592;
                                continue block23;
                            }
                            case -1932742118: {
                                v0 = false;
                                ** GOTO lbl4
                            }
                            case -2066638207: {
                                v0 = true;
                                ** continue;
                            }
                            case -1898257584: {
                                var4_6 ^= var5_3 ^ 1949656030;
                                var5_3 = (var3_2 | var6_1) ^ 1292914344;
                                continue block23;
                            }
                            case 110080578: {
                                var4_6 ^= var5_3 ^ 1667622369;
                                var5_3 = (var3_2 | var6_1) ^ 967583727;
                                continue block23;
                            }
                            case -1607211289: {
                                var4_6 ^= var5_3 ^ -975589052;
                                ** continue;
                            }
                            case -261229626: {
                                if (var2_5 == null) continue block22;
                                var5_3 = (var3_2 | var6_1) ^ 768222490;
                            }
                            default: {
                                continue block23;
                            }
                            case 1106230654: 
                        }
                        if (!var2_5.isFriend(var1_4.method_7334().name())) ** break;
                        var5_3 = (var3_2 | var6_1) ^ -1141764308;
                    }
                    break;
                }
                break;
            }
lbl43:
            // 1 sources

            while (true) {
                var4_6 ^= 1701833756;
                var2_5 = ix.get();
                ** continue;
                break;
            }
        }
        var6_1 = 746392616;
        var3_2 = C.a & 746392616 ^ -1321421498;
        var5_3 = 0;
        var4_6 = (var3_2 | var6_1) ^ -1891841692;
        var5_3 = (var3_2 | var6_1) ^ 1503774196;
        block25: while (true) {
            switch (var5_3) {
                default: {
                    continue block25;
                }
                case -1372177766: {
                    var4_6 ^= var5_3 ^ 1056177609;
                    var5_3 = (var3_2 | var6_1) ^ 1127490584;
                    continue block25;
                }
                case -2136937831: {
                    var4_6 ^= var5_3 ^ -69333694;
                    var5_3 = (var3_2 | var6_1) ^ -1834009364;
                    continue block25;
                }
                case -1047215286: {
                    if (!(var0 instanceof class_1657)) break;
                    var5_3 = (var3_2 | var6_1) ^ 1037916151;
                    continue block25;
                }
                case -339920120: {
                    var4_6 ^= var5_3 ^ -2038921859;
                    var5_3 = (var3_2 | var6_1) ^ 2095676964;
                    continue block25;
                }
                case 802324866: {
                    var1_4 = (class_1657)var0;
                    ** continue;
                }
                case -455313254: {
                    var5_3 = (var3_2 | var6_1) ^ 1455457894;
                    continue block25;
                }
                case -28731018: {
                    return false;
                }
            }
            var5_3 = (var3_2 | var6_1) ^ 323717108;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean ai(class_1309 class_13092) {
        int n2 = a & 0xF532A49D ^ 0xEDB2A1B3;
        int n3 = 0;
        int n4 = (n2 | 0xF532A49D) ^ 0xD70D9D41;
        n3 = (n2 | 0xF532A49D) ^ 0xBDCD932C;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1082078867: {
                    break;
                }
                case 2085345470: {
                    n4 ^= n3 ^ 0x86BA7F02;
                    n3 = (n2 | 0xF532A49D) ^ 0xF647A66D;
                    continue block5;
                }
                case 200606674: {
                    return true;
                }
            }
            n3 = (n2 | 0xF532A49D) ^ 0x81F97D01;
        }
    }
}

