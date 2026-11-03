/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.minecraft.class_1923
 *  net.minecraft.class_2680
 *  net.minecraft.class_2818
 *  net.minecraft.class_310
 *  net.minecraft.class_408
 *  net.minecraft.class_4588
 *  net.minecraft.class_638
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package z.r;

import java.util.List;
import java.util.Map;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_1923;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_310;
import net.minecraft.class_408;
import net.minecraft.class_4588;
import net.minecraft.class_638;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import z.r.W;
import z.r.fW;
import z.r.gF;
import z.r.gP;
import z.r.iW;
import z.r.ig;
import z.r.kC;
import z.r.ke;
import z.r.kn;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class dp
extends gF {
    private static final int a;
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private final gP a;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String s;
    private volatile String e;
    private static final /* synthetic */ String f;
    private final ke a;
    private static final int[] b;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static final int b;
    private static volatile dp a;
    private final gP b;
    private static final int[] a;
    private final ke b;
    private final Map<Long, fW> a;
    private static final int c;
    private final ke c;
    private static final int d;
    private static final byte a;
    private static final /* synthetic */ String i;
    private static final int e;
    private static final /* synthetic */ String j;
    private final gP c;
    private final ke d;
    private static final /* synthetic */ String l;
    private static final int f;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private final ke e;
    private int g;
    public static final int l;
    private static final int h;
    private static final /* synthetic */ String o;
    private static final int i;
    private final gP d;
    private static final int j;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String t;
    private static final byte b;
    private static final /* synthetic */ String u;
    private int k;
    private final Set<Long> a;
    private final Map<Long, Integer> b;
    private static final /* synthetic */ String v;

    /*
     * Enabled aggressive block sorting
     */
    public static dp getInstance() {
        int n2 = l & 0x8AF5FB27 ^ 0x9A3EFB86;
        int n3 = 0;
        int n4 = (n2 | 0x8AF5FB27) ^ 0x3517B715;
        n3 = (n2 | 0x8AF5FB27) ^ 0x5B96338;
        while (true) {
            switch (n3) {
                case 1027060762: {
                    return a;
                }
                case -1622763361: {
                    n3 = (n2 | 0x8AF5FB27) ^ 0x4DA63D0D;
                    break;
                }
                case -681982294: {
                    n4 ^= n3 ^ 0x2DEF9787;
                    n3 = (n2 | 0x8AF5FB27) ^ 0xA7C84FBD;
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    public dp() {
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
    public void onEnable() {
        block13: {
            block14: {
                break block14;
lbl1:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
lbl3:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -849870058;
                    ** GOTO lbl20
                    break;
                }
                this.hV();
                var3_3 = (var1_2 | var4_1) ^ 729709465;
                ** GOTO lbl20
            }
            var4_1 = -1269738204;
            var1_2 = dp.l & -1269738204 ^ 1690792206;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ 363160565;
            if (true) ** GOTO lbl29
lbl15:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ -605452381;
                break block13;
                break;
            }
            block10: while (true) {
                var3_3 = (var1_2 | var4_1) ^ -669068077;
lbl20:
                // 4 sources

                block11: while (true) {
                    switch (var3_3) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block11;
                            }
                            break;
                        }
                        case 751411709: {
                            ** continue;
                        }
                        case -542568777: {
                            ** continue;
                        }
lbl29:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ 1417109486;
                        ** continue;
                        case -455707603: {
                            return;
                        }
                        case 965703224: {
                            var2_4 ^= var3_3 ^ -1569725248;
                            continue block10;
                        }
                        case -1600116032: 
                    }
                    break;
                }
                break;
            }
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ 0x10010103;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onDisable() {
        var4_1 = 921751811;
        var1_2 = dp.l & 921751811 ^ 556853957;
        var3_3 = 0;
        ** GOTO lbl20
lbl5:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 676869121;
            ** GOTO lbl13
            break;
        }
lbl8:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1481664284;
            if (true) ** GOTO lbl13
            break;
        }
        block9: while (true) {
            var3_3 = (var1_2 | var4_1) ^ 692278081;
lbl13:
            // 3 sources

            block10: while (true) {
                switch (var3_3) lbl-1000:
                // 3 sources

                {
                    default: {
                        continue block10;
                    }
lbl17:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 320432768;
                        ** GOTO lbl-1000
                        break;
                    }
lbl20:
                    // 1 sources

                    var2_4 = (var1_2 | var4_1) ^ 1406094312;
                    ** continue;
                    case 531156934: {
                        this.hV();
                        ** continue;
                    }
                    case -1872796893: {
                        continue block9;
                    }
                    case -1948090835: {
                        return;
                    }
                    case 619286855: {
                        var2_4 ^= var3_3 ^ -1374056701;
                        var3_3 = (var1_2 | var4_1) ^ -1139636758;
                        ** GOTO lbl-1000
                    }
                    case 515090566: 
                }
                break;
            }
            break;
        }
        var2_4 ^= var3_3 ^ -729954567;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private void hV() {
        block38: {
            block34: {
                block35: {
                    block33: {
                        block36: {
                            block37: {
                                break block38;
lbl1:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 1338628839;
                                    ** GOTO lbl39
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

                                return;
lbl8:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ 1600818117;
                                    break block33;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl15:
                                // 1 sources

                                while (true) {
                                    this.k = 0;
                                    ** GOTO lbl69
                                    break;
                                }
lbl18:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ -964798129;
                                    break block34;
                                    break;
                                }
lbl21:
                                // 1 sources

                                while (true) {
                                    this.g = 0;
                                    ** continue;
                                    break;
                                }
                                this.b.clear();
                                var3_3 = (var1_2 | var4_1) ^ -1646645992;
                                if (true) ** GOTO lbl39
                                block26: while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -1763247663;
                                    ** GOTO lbl39
lbl30:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 352713688;
                                        if (true) ** GOTO lbl39
                                        break;
                                    }
                                    block28: while (true) {
                                        block39: {
                                            var3_3 = (var1_2 | var4_1) ^ 506427090;
                                            break block39;
lbl36:
                                            // 1 sources

                                            while (true) {
                                                var2_4 ^= var3_3 ^ 4796665;
                                                break block35;
                                                break;
                                            }
                                        }
lbl40:
                                        // 10 sources

                                        block30: while (true) {
                                            switch (var3_3) lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    default: {
                                                        continue block30;
                                                    }
                                                    break;
                                                }
                                                case 228554233: {
                                                    ** continue;
                                                }
                                                case 709738373: {
                                                    ** continue;
                                                }
                                                case -103642711: {
                                                    ** continue;
                                                }
                                                case 945827200: {
                                                    ** continue;
                                                }
                                                case -1728221562: {
                                                    ** continue;
                                                }
                                                case 925376405: {
                                                    ** continue;
                                                }
                                                case -218626909: {
                                                    ** continue;
                                                }
                                                case 215791362: {
                                                    ** continue;
                                                }
                                                case 915857775: {
                                                    ** continue;
                                                }
                                                case 1336881916: {
                                                    var2_4 ^= var3_3 ^ 1550928447;
                                                    break block26;
                                                }
                                                case 1897596586: {
                                                    this.a.clear();
                                                    ** continue;
                                                }
lbl69:
                                                // 1 sources

                                                var3_3 = (var1_2 | var4_1) ^ -781509100;
                                                ** continue;
                                                case -1227954263: {
                                                    break block36;
                                                }
                                                case 586317779: {
                                                    var2_4 ^= var3_3 ^ 754077062;
                                                    continue block28;
                                                }
                                                case 2049430115: {
                                                    var2_4 ^= var3_3 ^ -449070516;
                                                    continue block26;
                                                }
                                                case -1472977508: {
                                                    var2_4 ^= var3_3 ^ 2129700204;
                                                    break block37;
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                var3_3 = (var1_2 | var4_1) ^ -350140295;
                                ** GOTO lbl40
lbl84:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 1362303186;
                                    ** GOTO lbl40
                                    break;
                                }
                                this.e = "";
                                var3_3 = (var1_2 | var4_1) ^ -1470968441;
                                ** GOTO lbl40
                                this.a.clear();
                                var3_3 = (var1_2 | var4_1) ^ -988839768;
                                ** GOTO lbl40
                            }
                            var3_3 = (var1_2 | var4_1) ^ -791289618;
                            ** GOTO lbl40
                        }
                        var3_3 = (var1_2 | var4_1) ^ -543304965;
                        ** GOTO lbl40
                    }
                    var3_3 = (var1_2 | var4_1) ^ -362640766;
                    ** GOTO lbl40
                }
                var3_3 = (var1_2 | var4_1) ^ -844087042;
                ** GOTO lbl40
            }
            var3_3 = (var1_2 | var4_1) ^ 2130743805;
            ** while (true)
        }
        var4_1 = 1706164059;
        var1_2 = dp.l & 1706164059 ^ -402882272;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 1107840703;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private void hW(long l2) {
        int n2 = 656616261;
        int n3 = l & 0x27232B45 ^ 0x13195F4C;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x9368D23F;
        n4 = (n3 | n2) ^ 0xD3F4E780;
        block11: while (true) {
            switch (n4) {
                default: {
                    continue block11;
                }
                case 276136031: {
                    this.b.remove(l2);
                    n4 = (n3 | n2) ^ 0x700E4331;
                    continue block11;
                }
                case -456156979: {
                    n4 = (n3 | n2) ^ 0xC1390D8C;
                    continue block11;
                }
                case 1194671228: {
                    n5 ^= n4 ^ 0x6815CE0A;
                    n4 = (n3 | n2) ^ 0x652213AC;
                    continue block11;
                }
                case 1182926772: {
                    this.a.remove(l2);
                    n4 = (n3 | n2) ^ 0x71996EE2;
                    continue block11;
                }
                case 1185026479: {
                    n5 ^= n4 ^ 0x242AF9DE;
                    n4 = (n3 | n2) ^ 0x274EFF12;
                    continue block11;
                }
                case -167611711: {
                    n5 ^= n4 ^ 0x8D6B916A;
                    n4 = (n3 | n2) ^ 0x71B978F9;
                    continue block11;
                }
                case 1399674194: {
                    n5 ^= n4 ^ 0x5CFCFEE5;
                    n4 = (n3 | n2) ^ 0x372684D6;
                    continue block11;
                }
                case 1377397985: {
                    this.a.remove(l2);
                    n4 = (n3 | n2) ^ 0x64562A1F;
                    continue block11;
                }
                case 1964955: 
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void onTick(class_310 var1_1) {
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
    private static iW hX(class_2818 var0) {
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
    private static boolean hY(class_2680 class_26802) {
        int n2 = l & 0x2E1F9C7E ^ 0x28BB5835;
        int n3 = 0;
        int n4 = (n2 | 0x2E1F9C7E) ^ 0x29AF2E65;
        n3 = (n2 | 0x2E1F9C7E) ^ 0xBB560078;
        block5: while (true) {
            switch (n3) {
                case -1692852525: {
                    n4 ^= n3 ^ 0x54B0D71;
                    break;
                }
                case -1779835897: {
                    n3 = (n2 | 0x2E1F9C7E) ^ 0xB5A6C2AC;
                }
                default: {
                    continue block5;
                }
                case -592939360: {
                    return kC.isAnchorBlock(class_26802);
                }
            }
            n3 = (n2 | 0x2E1F9C7E) ^ 0xF217AADF;
        }
    }

    /*
     * Exception decompiling
     */
    private void hZ(class_638 var1_1, long var2_2, int var4_3, int var5_4, iW var6_5) {
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
    private static void ia(List<kn> var0, int var1_1, int var2_2, int var3_3, byte var4_4) {
        block25: {
            block30: {
                block28: {
                    block29: {
                        block27: {
                            block24: {
                                block26: {
                                    break block29;
lbl1:
                                    // 1 sources

                                    return;
lbl3:
                                    // 1 sources

                                    while (true) {
                                        var6_8 ^= var7_7 ^ 40579597;
                                        break block24;
                                        break;
                                    }
lbl6:
                                    // 1 sources

                                    return;
lbl8:
                                    // 1 sources

                                    while (true) {
                                        var7_7 = (var5_6 | var8_5) ^ 1395816914;
                                        break block25;
                                        break;
                                    }
lbl11:
                                    // 1 sources

                                    while (true) {
                                        var7_7 = (var5_6 | var8_5) ^ -379220015;
                                        break block25;
                                        break;
                                    }
lbl14:
                                    // 1 sources

                                    while (true) {
                                        var7_7 = (var5_6 | var8_5) ^ -520750470;
                                        break block25;
                                        break;
                                    }
lbl17:
                                    // 1 sources

                                    while (true) {
                                        if (var0.size() < dp.id((var6_8 | var7_7 ^ -121857518) ^ (var7_7 ^ -1945997168), (var5_6 | var7_7 ^ -121857518) ^ ((var6_8 | var7_7 ^ -121857518) ^ (var7_7 ^ -1503964921)))) break block26;
                                        ** continue;
                                        break;
                                    }
lbl20:
                                    // 1 sources

                                    while (true) {
                                        var6_8 ^= var7_7 ^ -1996851174;
                                        break block27;
                                        break;
                                    }
lbl23:
                                    // 1 sources

                                    while (true) {
                                        var6_8 ^= var7_7 ^ 1278075321;
                                        break block28;
                                        break;
                                    }
lbl26:
                                    // 1 sources

                                    while (true) {
                                        var0.add(new kn(var1_1, var2_2, var3_3, var4_4));
                                        ** continue;
                                        break;
                                    }
lbl30:
                                    // 1 sources

                                    while (true) {
                                        var6_8 ^= var7_7 ^ 2105836886;
                                        ** continue;
                                        break;
                                    }
                                }
                                var7_7 = (var5_6 | var8_5) ^ -10300263;
                                break block25;
                            }
                            var7_7 = (var5_6 | var8_5) ^ 1853097198;
                            break block25;
lbl39:
                            // 1 sources

                            while (true) {
                                var7_7 = (var5_6 | var8_5) ^ -1724655215;
                                break block25;
                                break;
                            }
                        }
                        var7_7 = (var5_6 | var8_5) ^ -846892255;
                        break block25;
                    }
                    var8_5 = 1738938241;
                    var5_6 = dp.l & 1738938241 ^ 1540055529;
                    var7_7 = 0;
                    break block30;
                }
                var7_7 = (var5_6 | var8_5) ^ -1876474343;
                break block25;
            }
            var6_8 = (var5_6 | var8_5) ^ 478871148;
            var7_7 = (var5_6 | var8_5) ^ -1822142533;
        }
        block23: while (true) {
            switch (var7_7) {
                default: {
                    continue block23;
                }
                case 295400199: {
                    ** continue;
                }
                case 752684603: {
                    ** continue;
                }
                case -272092688: {
                    ** continue;
                }
                case -1625649773: {
                    ** continue;
                }
                case -2138201232: {
                    ** continue;
                }
                case -1769277384: {
                    ** continue;
                }
                case -1301674808: {
                    ** continue;
                }
                case -421745032: {
                    ** continue;
                }
                ** case -326420398:
lbl78:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private static boolean ib(class_638 class_6382, int n2, int n3) {
        int n4 = -1411174146;
        int n5 = l & 0xABE330FE ^ 0xA4306A31;
        int n6 = 0;
        int n7 = (n5 | n4) ^ 0xFCA68B55;
        n6 = (n5 | n4) ^ 0xC3528B98;
        block9: while (true) {
            block11: {
                boolean bl2;
                switch (n6) {
                    default: {
                        continue block9;
                    }
                    case 743004122: {
                        n7 ^= n6 ^ 0xA5346223;
                        n6 = (n5 | n4) ^ 0x91A8FEC6;
                        continue block9;
                    }
                    case -1914778275: {
                        bl2 = true;
                        break;
                    }
                    case -1684742665: {
                        n7 ^= n6 ^ 0xDC2189EC;
                        n6 = (n5 | n4) ^ 0x4A836C1C;
                        continue block9;
                    }
                    case 1046185017: {
                        if (class_6382.method_2935().method_12126(n2, n3, false) != null) {
                            n6 = (n5 | n4) ^ 0xF437FD93;
                            continue block9;
                        }
                        break block11;
                    }
                    case -445638941: {
                        bl2 = false;
                        break;
                    }
                    case 1822552423: {
                        n6 = (n5 | n4) ^ 0x83BA2D25;
                        continue block9;
                    }
                    case 1539606380: {
                        n7 ^= n6 ^ 0x1C71D377;
                        n6 = (n5 | n4) ^ 0x222DB7A2;
                        continue block9;
                    }
                }
                n7 ^= 0x1B200D97;
                return bl2;
            }
            n6 = (n5 | n4) ^ 0x3467A708;
        }
    }

    /*
     * Exception decompiling
     */
    private void ic(class_1923 var1_1, int var2_2) {
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

    private static int id(int n2, int n3) {
        int n4 = 864595828;
        int n5 = -837809567;
        int n6 = b[n2 ^ ((n5 | n4) ^ 0x133FE5C5)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xFF9868AB;
        n6 ^= (n5 | n4) ^ 0xFF989F71;
        n6 -= (n5 | n4) ^ 0xFF986FC4;
        n6 ^= (n5 | n4) ^ 0xFF9828B1;
        n6 += (n5 | n4) ^ 0xFF98FD6B;
        return n6 ^= (n5 | n4) ^ 0xFF988218;
    }

    /*
     * Exception decompiling
     */
    private static boolean ie(long var0, class_1923 var2_1, int var3_2) {
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
    private boolean if(fW var1_1) {
        block17: {
            block19: {
                block18: {
                    var5_2 = 1303258785;
                    var2_3 = dp.l & 1303258785 ^ 1165294428;
                    var4_4 = 0;
                    ** GOTO lbl29
lbl5:
                    // 3 sources

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
lbl10:
                            // 1 sources

                            return v0;
                            case -2111596377: {
                                break block9;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 1308036785;
                                ** GOTO lbl-1000
                                break;
                            }
                            case 551038597: {
                                var3_5 ^= var4_4 ^ 343994689;
                                ** continue;
                            }
lbl20:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 1811415111;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -951434299: {
                                v0 = false;
                                break block17;
                            }
lbl26:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 1831260536;
                                ** GOTO lbl-1000
                                break;
                            }
lbl29:
                            // 1 sources

                            var3_5 = (var2_3 | var5_2) ^ 265761214;
                            break block18;
lbl31:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -1967866824;
                                ** continue;
                                break;
                            }
                        }
                        break;
                    }
                    var4_4 = (var2_3 | var5_2) ^ -51532980;
                    ** GOTO lbl5
                    {
                        case 637992890: {
                            if (var1_1.grown() >= ((Float)this.a.getValue()).intValue()) {
                                ** continue;
                            }
                            break block19;
                        }
                        case -2118684171: {
                            var3_5 ^= var4_4 ^ -1242583503;
                            ** continue;
                        }
                        case 651596: {
                            v0 = true;
                            break block17;
                        }
                        ** case -1324133199:
                    }
lbl47:
                    // 1 sources

                    var3_5 ^= var4_4 ^ -492739360;
                    ** while (true)
                }
                var4_4 = (var2_3 | var5_2) ^ -807573670;
                ** GOTO lbl5
            }
            var4_4 = (var2_3 | var5_2) ^ -867594744;
            ** while (true)
        }
        var3_5 ^= -499068103;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public void render(WorldRenderContext var1_1, class_310 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [216[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private static void cube(class_4588 var0, Matrix4f var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        block27: {
            var20_6 = -1038024296;
            var19_7 = 896015149;
            var16_8 = dp.l & 896015149 ^ 998603240;
            var18_9 = 0;
            var17_10 = (var16_8 | var19_7) ^ -79005522;
            var18_9 = (var16_8 | var19_7) ^ 1343612658;
            break block27;
lbl8:
            // 1 sources

            while (true) {
                var18_9 = (var16_8 | var19_7) ^ -928751272;
                break block27;
                break;
            }
lbl11:
            // 1 sources

            while (true) {
                var18_9 = (var16_8 | var19_7) ^ -528697848;
                ** GOTO lbl45
                break;
            }
        }
        block23: while (true) {
            switch (var18_9) {
                default: {
                    continue block23;
                }
                case -235044908: {
                    var17_10 ^= var18_9 ^ -613335545;
                    ** continue;
                }
                case 1878564127: {
                    var18_9 = (var16_8 | var19_7) ^ -837811143;
                    continue block23;
                }
                case -146203979: 
            }
            break;
        }
        var6_11 = var5_5 >>> dp.id((var17_10 | var18_9 ^ var20_6) ^ (var18_9 ^ -461042781), (var16_8 | var18_9 ^ var20_6) ^ ((var17_10 | var18_9 ^ var20_6) ^ (var18_9 ^ -1961986895))) & dp.id((var17_10 | var18_9 ^ var20_6) ^ (var18_9 ^ -461042780), (var16_8 | var18_9 ^ var20_6) ^ ((var17_10 | var18_9 ^ var20_6) ^ (var18_9 ^ -987566085)));
        var7_12 = var5_5 >> dp.id((var17_10 | var18_9 ^ var20_6) ^ (var18_9 ^ -461042779), (var16_8 | var18_9 ^ var20_6) ^ ((var17_10 | var18_9 ^ var20_6) ^ (var18_9 ^ 1871319691))) & dp.id((var17_10 | var18_9 ^ var20_6) ^ (var18_9 ^ -461042778), (var16_8 | var18_9 ^ var20_6) ^ ((var17_10 | var18_9 ^ var20_6) ^ (var18_9 ^ -1631532193)));
        var8_13 = var5_5 >> dp.id((var17_10 | var18_9 ^ var20_6) ^ (var18_9 ^ -461042777), (var16_8 | var18_9 ^ var20_6) ^ ((var17_10 | var18_9 ^ var20_6) ^ (var18_9 ^ 154076624))) & dp.id((var17_10 | var18_9 ^ var20_6) ^ (var18_9 ^ -461042792), (var16_8 | var18_9 ^ var20_6) ^ ((var17_10 | var18_9 ^ var20_6) ^ (var18_9 ^ 696982292)));
        var9_14 = var5_5 & dp.id((var17_10 | var18_9 ^ var20_6) ^ (var18_9 ^ -461042791), (var16_8 | var18_9 ^ var20_6) ^ ((var17_10 | var18_9 ^ var20_6) ^ (var18_9 ^ -1944670080)));
        var17_10 ^= 1385630217;
        var10_15 = (float)var2_2 + 0.18f;
        var11_16 = (float)var3_3 + 0.18f;
        var12_17 = (float)var4_4 + 0.18f;
        var17_10 ^= 854573307;
        var13_18 = (float)var2_2 + 0.82f;
        var14_19 = (float)var3_3 + 0.82f;
        var15_20 = (float)var4_4 + 0.82f;
        var18_9 = (var16_8 | var19_7) ^ -1342034550;
        if (true) ** GOTO lbl45
        block24: while (true) {
            var18_9 = (var16_8 | var19_7) ^ 1897351716;
            if (true) ** GOTO lbl45
            block25: while (true) {
                var18_9 = (var16_8 | var19_7) ^ 97709726;
lbl45:
                // 4 sources

                block26: while (true) {
                    switch (var18_9) {
                        case -550777586: {
                            dp.q(var0, var1_1, var10_15, var11_16, var15_20, var13_18, var11_16, var15_20, var13_18, var14_19, var15_20, var10_15, var14_19, var15_20, var7_12, var8_13, var9_14, var6_11);
                            var18_9 = (var16_8 | var19_7) ^ -891000940;
                            continue block26;
                        }
                        case -261681850: {
                            dp.q(var0, var1_1, var10_15, var11_16, var12_17, var13_18, var11_16, var12_17, var13_18, var11_16, var15_20, var10_15, var11_16, var15_20, var7_12, var8_13, var9_14, var6_11);
                            ** GOTO lbl83
                        }
                        case 1032631793: {
                            var17_10 ^= var18_9 ^ 1721251090;
                            ** GOTO lbl88
                        }
                        case 977245555: {
                            dp.q(var0, var1_1, var13_18, var11_16, var12_17, var13_18, var14_19, var12_17, var13_18, var14_19, var15_20, var13_18, var11_16, var15_20, var7_12, var8_13, var9_14, var6_11);
                            var18_9 = (var16_8 | var19_7) ^ 2104194939;
                            continue block26;
                        }
                        case -183952263: {
                            var17_10 ^= var18_9 ^ 949427291;
                            ** continue;
                        }
                        case 1325019593: {
                            var17_10 ^= var18_9 ^ -1184268110;
                            ** GOTO lbl90
                        }
                        case -1115155448: {
                            dp.q(var0, var1_1, var10_15, var11_16, var12_17, var10_15, var14_19, var12_17, var13_18, var14_19, var12_17, var13_18, var11_16, var12_17, var7_12, var8_13, var9_14, var6_11);
                            ** break;
                        }
                        case -544092699: {
                            dp.q(var0, var1_1, var10_15, var11_16, var12_17, var10_15, var11_16, var15_20, var10_15, var14_19, var15_20, var10_15, var14_19, var12_17, var7_12, var8_13, var9_14, var6_11);
                            var18_9 = (var16_8 | var19_7) ^ 270397216;
                        }
                        default: {
                            continue block26;
                        }
                        case 166592555: {
                            var17_10 ^= var18_9 ^ -1936105297;
                            ** GOTO lbl100
                        }
                        case 804295885: {
                            var17_10 ^= var18_9 ^ 973349072;
                            continue block25;
                        }
lbl81:
                        // 1 sources

                        var18_9 = (var16_8 | var19_7) ^ 906197958;
                        continue block26;
lbl83:
                        // 1 sources

                        var18_9 = (var16_8 | var19_7) ^ 39964188;
                        continue block26;
                        case 284022620: {
                            dp.q(var0, var1_1, var10_15, var14_19, var12_17, var10_15, var14_19, var15_20, var13_18, var14_19, var15_20, var13_18, var14_19, var12_17, var7_12, var8_13, var9_14, var6_11);
                            continue block24;
                        }
lbl88:
                        // 1 sources

                        var18_9 = (var16_8 | var19_7) ^ 788573361;
                        continue block26;
lbl90:
                        // 1 sources

                        var18_9 = (var16_8 | var19_7) ^ -2107281435;
                        continue block26;
                        case -1880140185: {
                            var17_10 ^= var18_9 ^ 1958668270;
                            var18_9 = (var16_8 | var19_7) ^ -813009237;
                            continue block26;
                        }
                        case 1116081302: {
                            var17_10 ^= var18_9 ^ -1210167934;
                            var18_9 = (var16_8 | var19_7) ^ 750020587;
                            continue block26;
                        }
lbl100:
                        // 1 sources

                        var18_9 = (var16_8 | var19_7) ^ -523847965;
                        continue block26;
                        case 324606982: 
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
    private static void q(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9, float var10_10, float var11_11, float var12_12, float var13_13, int var14_14, int var15_15, int var16_16, int var17_17) {
        block25: {
            block23: {
                block24: {
                    var21_18 = -153437654;
                    var18_19 = dp.l & -153437654 ^ -149346369;
                    var20_20 = 0;
                    ** GOTO lbl55
lbl5:
                    // 1 sources

                    return;
lbl7:
                    // 1 sources

                    while (true) {
                        var20_20 = (var18_19 | var21_18) ^ -491015465;
                        break block23;
lbl10:
                        // 1 sources

                        while (true) {
                            var19_21 ^= var20_20 ^ -516019834;
                            break block24;
                            break;
                        }
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var20_20 = (var18_19 | var21_18) ^ -1672574174;
                        break block23;
                        break;
                    }
                }
                var20_20 = (var18_19 | var21_18) ^ -1187336616;
            }
lbl19:
            // 4 sources

            block17: while (true) {
                switch (var20_20) lbl-1000:
                // 6 sources

                {
                    while (true) {
                        default: {
                            continue block17;
                        }
                        break;
                    }
                    case 20754726: {
                        ** continue;
                    }
                    case 175767905: {
                        ** continue;
                    }
                    case 1676751869: {
                        var19_21 ^= var20_20 ^ -631546038;
                        ** continue;
                    }
                    case -890000450: {
                        var19_21 ^= var20_20 ^ 105877748;
                        break;
                    }
lbl34:
                    // 1 sources

                    while (true) {
                        var20_20 = (var18_19 | var21_18) ^ -766211123;
                        ** GOTO lbl-1000
                        break;
                    }
                    case 1323373031: {
                        var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var7_7).method_1336(var14_14, var15_15, var16_16, var17_17);
                        break block25;
                    }
lbl41:
                    // 1 sources

                    while (true) {
                        var20_20 = (var18_19 | var21_18) ^ -1809150910;
                        ** GOTO lbl-1000
                        break;
                    }
lbl44:
                    // 1 sources

                    while (true) {
                        var20_20 = (var18_19 | var21_18) ^ -152629607;
                        ** GOTO lbl-1000
                        break;
                    }
                    case 1804940445: {
                        var19_21 ^= var20_20 ^ 1738634948;
                        break block17;
                    }
                    case -1398241809: {
                        ** continue;
                    }
lbl52:
                    // 1 sources

                    while (true) {
                        var20_20 = (var18_19 | var21_18) ^ -39731490;
                        ** GOTO lbl-1000
                        break;
                    }
lbl55:
                    // 1 sources

                    var19_21 = (var18_19 | var21_18) ^ 1882708806;
                    var20_20 = (var18_19 | var21_18) ^ 1534278224;
                    ** continue;
                }
                break;
            }
            var20_20 = (var18_19 | var21_18) ^ 308940186;
            ** GOTO lbl19
            {
                case 358616424: {
                    var0.method_22918((Matrix4fc)var1_1, var11_11, var12_12, var13_13).method_1336(var14_14, var15_15, var16_16, var17_17);
                    ** continue;
                }
            }
            var20_20 = (var18_19 | var21_18) ^ 1287708145;
            ** GOTO lbl19
        }
        var20_20 = (var18_19 | var21_18) ^ 1026036737;
        ** while (true)
        {
            case 630142066: {
                var19_21 ^= var20_20 ^ -1279379154;
                ** continue;
            }
            case -1155833266: {
                var0.method_22918((Matrix4fc)var1_1, var8_8, var9_9, var10_10).method_1336(var14_14, var15_15, var16_16, var17_17);
                ** continue;
            }
            ** case -441339355:
        }
lbl77:
        // 1 sources

        var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var4_4).method_1336(var14_14, var15_15, var16_16, var17_17);
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
     * Unable to fully structure code
     */
    private static void ig(class_4588 var0, Matrix4f var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        block79: {
            block84: {
                block85: {
                    block78: {
                        block77: {
                            block86: {
                                block82: {
                                    block83: {
                                        block76: {
                                            block87: {
                                                block81: {
                                                    block80: {
                                                        break block87;
lbl1:
                                                        // 1 sources

                                                        while (true) {
                                                            var17_20 ^= var18_9 ^ 192201936;
                                                            break block76;
                                                            break;
                                                        }
lbl4:
                                                        // 1 sources

                                                        while (true) {
                                                            var17_20 ^= var18_9 ^ 128222028;
                                                            break block77;
                                                            break;
                                                        }
lbl7:
                                                        // 1 sources

                                                        while (true) {
                                                            var17_20 ^= 1675025340;
                                                            break block78;
                                                            break;
                                                        }
lbl10:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
lbl12:
                                                        // 1 sources

                                                        while (true) {
                                                            var18_9 = (var16_8 | var19_7) ^ 640792974;
                                                            break block79;
                                                            break;
                                                        }
lbl15:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
lbl17:
                                                        // 1 sources

                                                        while (true) {
                                                            var17_20 ^= var18_9 ^ 974325892;
                                                            break block80;
                                                            break;
                                                        }
lbl20:
                                                        // 1 sources

                                                        while (true) {
                                                            var6_10 = var5_5 >>> dp.id((var17_20 | var18_9 ^ var20_6) ^ (var18_9 ^ 270069996), (var16_8 | var18_9 ^ var20_6) ^ ((var17_20 | var18_9 ^ var20_6) ^ (var18_9 ^ -1494014887))) & dp.id((var17_20 | var18_9 ^ var20_6) ^ (var18_9 ^ 270069997), (var16_8 | var18_9 ^ var20_6) ^ ((var17_20 | var18_9 ^ var20_6) ^ (var18_9 ^ -1294270692)));
                                                            var7_11 = var5_5 >> dp.id((var17_20 | var18_9 ^ var20_6) ^ (var18_9 ^ 270069994), (var16_8 | var18_9 ^ var20_6) ^ ((var17_20 | var18_9 ^ var20_6) ^ (var18_9 ^ 1452243524))) & dp.id((var17_20 | var18_9 ^ var20_6) ^ (var18_9 ^ 270069995), (var16_8 | var18_9 ^ var20_6) ^ ((var17_20 | var18_9 ^ var20_6) ^ (var18_9 ^ -1393763884)));
                                                            var8_12 = var5_5 >> dp.id((var17_20 | var18_9 ^ var20_6) ^ (var18_9 ^ 270069992), (var16_8 | var18_9 ^ var20_6) ^ ((var17_20 | var18_9 ^ var20_6) ^ (var18_9 ^ -1121690034))) & dp.id((var17_20 | var18_9 ^ var20_6) ^ (var18_9 ^ 270069993), (var16_8 | var18_9 ^ var20_6) ^ ((var17_20 | var18_9 ^ var20_6) ^ (var18_9 ^ 1217422282)));
                                                            var9_13 = var5_5 & dp.id((var17_20 | var18_9 ^ var20_6) ^ (var18_9 ^ 270069990), (var16_8 | var18_9 ^ var20_6) ^ ((var17_20 | var18_9 ^ var20_6) ^ (var18_9 ^ 2146599985)));
                                                            ** continue;
                                                            break;
                                                        }
lbl26:
                                                        // 1 sources

                                                        while (true) {
                                                            var17_20 ^= var18_9 ^ -793453641;
                                                            break block81;
                                                            break;
                                                        }
lbl29:
                                                        // 1 sources

                                                        while (true) {
                                                            var18_9 = (var16_8 | var19_7) ^ -1926750080;
                                                            break block79;
                                                            break;
                                                        }
                                                        dp.ih(var0, var1_1, var10_14, var11_15, var15_19, var10_14, var11_15, var12_16, var7_11, var8_12, var9_13, var6_10);
                                                        var18_9 = (var16_8 | var19_7) ^ 851601648;
                                                        break block79;
lbl35:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
lbl37:
                                                        // 1 sources

                                                        while (true) {
                                                            var18_9 = (var16_8 | var19_7) ^ 609455715;
                                                            break block79;
                                                            break;
                                                        }
                                                        dp.ih(var0, var1_1, var13_17, var11_15, var15_19, var13_17, var14_18, var15_19, var7_11, var8_12, var9_13, var6_10);
                                                        var18_9 = (var16_8 | var19_7) ^ -159092695;
                                                        break block79;
lbl43:
                                                        // 1 sources

                                                        while (true) {
                                                            var18_9 = (var16_8 | var19_7) ^ 1739381890;
                                                            break block79;
                                                            break;
                                                        }
lbl46:
                                                        // 1 sources

                                                        while (true) {
                                                            var17_20 ^= var18_9 ^ 1864494540;
                                                            break block82;
                                                            break;
                                                        }
lbl49:
                                                        // 1 sources

                                                        while (true) {
                                                            var17_20 ^= var18_9 ^ 1685638024;
                                                            break block83;
                                                            break;
                                                        }
                                                    }
                                                    var18_9 = (var16_8 | var19_7) ^ -1403243029;
                                                    break block79;
lbl55:
                                                    // 1 sources

                                                    while (true) {
                                                        var18_9 = (var16_8 | var19_7) ^ 1303442537;
                                                        break block79;
                                                        break;
                                                    }
lbl58:
                                                    // 1 sources

                                                    while (true) {
                                                        var18_9 = (var16_8 | var19_7) ^ -1278626689;
                                                        break block84;
                                                        break;
                                                    }
lbl61:
                                                    // 1 sources

                                                    while (true) {
                                                        dp.ih(var0, var1_1, var10_14, var11_15, var15_19, var10_14, var14_18, var15_19, var7_11, var8_12, var9_13, var6_10);
                                                        ** continue;
                                                        break;
                                                    }
lbl64:
                                                    // 1 sources

                                                    while (true) {
                                                        var18_9 = (var16_8 | var19_7) ^ 878155822;
                                                        break block79;
                                                        break;
                                                    }
lbl67:
                                                    // 1 sources

                                                    while (true) {
                                                        var18_9 = (var16_8 | var19_7) ^ -35307190;
                                                        break block79;
                                                        break;
                                                    }
lbl70:
                                                    // 1 sources

                                                    while (true) {
                                                        dp.ih(var0, var1_1, var10_14, var11_15, var12_16, var10_14, var14_18, var12_16, var7_11, var8_12, var9_13, var6_10);
                                                        ** continue;
                                                        break;
                                                    }
lbl73:
                                                    // 1 sources

                                                    while (true) {
                                                        var18_9 = (var16_8 | var19_7) ^ -639007073;
                                                        break block79;
                                                        break;
                                                    }
lbl76:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl78:
                                                    // 1 sources

                                                    while (true) {
                                                        var18_9 = (var16_8 | var19_7) ^ 788136732;
                                                        break block79;
                                                        break;
                                                    }
                                                }
                                                var18_9 = (var16_8 | var19_7) ^ -1430794633;
                                                break block79;
lbl84:
                                                // 1 sources

                                                while (true) {
                                                    var17_20 ^= var18_9 ^ 1402756416;
                                                    ** continue;
                                                    break;
                                                }
lbl87:
                                                // 1 sources

                                                while (true) {
                                                    dp.ih(var0, var1_1, var10_14, var11_15, var12_16, var13_17, var11_15, var12_16, var7_11, var8_12, var9_13, var6_10);
                                                    ** continue;
                                                    break;
                                                }
lbl90:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl92:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var20_6 = 2092907230;
                                            var19_7 = 2143171099;
                                            var16_8 = dp.l & 2143171099 ^ 1696490970;
                                            var18_9 = 0;
                                            var17_20 = (var16_8 | var19_7) ^ 417235061;
                                            ** while (true)
lbl101:
                                            // 1 sources

                                            while (true) {
                                                var18_9 = (var16_8 | var19_7) ^ 915387776;
                                                break block79;
                                                break;
                                            }
lbl104:
                                            // 1 sources

                                            while (true) {
                                                dp.ih(var0, var1_1, var13_17, var14_18, var15_19, var10_14, var14_18, var15_19, var7_11, var8_12, var9_13, var6_10);
                                                ** continue;
                                                break;
                                            }
                                        }
                                        var18_9 = (var16_8 | var19_7) ^ 583517757;
                                        break block79;
lbl110:
                                        // 1 sources

                                        while (true) {
                                            var17_20 ^= var18_9 ^ 187470634;
                                            ** continue;
                                            break;
                                        }
lbl113:
                                        // 1 sources

                                        while (true) {
                                            var18_9 = (var16_8 | var19_7) ^ 376809164;
                                            break block79;
                                            break;
                                        }
lbl116:
                                        // 1 sources

                                        while (true) {
                                            var17_20 ^= var18_9 ^ -1695236729;
                                            ** continue;
                                            break;
                                        }
lbl119:
                                        // 1 sources

                                        while (true) {
                                            var17_20 ^= var18_9 ^ 1299640848;
                                            break block85;
                                            break;
                                        }
                                    }
                                    var18_9 = (var16_8 | var19_7) ^ -827393914;
                                    break block79;
lbl125:
                                    // 1 sources

                                    while (true) {
                                        dp.ih(var0, var1_1, var13_17, var14_18, var12_16, var13_17, var14_18, var15_19, var7_11, var8_12, var9_13, var6_10);
                                        ** continue;
                                        break;
                                    }
                                }
                                var18_9 = (var16_8 | var19_7) ^ 2101504735;
                                break block79;
lbl131:
                                // 1 sources

                                while (true) {
                                    var17_20 ^= var18_9 ^ -1468424425;
                                    break block86;
                                    break;
                                }
lbl134:
                                // 1 sources

                                return;
                            }
                            var18_9 = (var16_8 | var19_7) ^ 2092924702;
                            break block84;
                            dp.ih(var0, var1_1, var13_17, var11_15, var12_16, var13_17, var11_15, var15_19, var7_11, var8_12, var9_13, var6_10);
                            var18_9 = (var16_8 | var19_7) ^ 1890968069;
                            break block79;
lbl142:
                            // 1 sources

                            while (true) {
                                var18_9 = (var16_8 | var19_7) ^ 429494219;
                                break block84;
                                break;
                            }
lbl145:
                            // 1 sources

                            while (true) {
                                var17_20 ^= var18_9 ^ 1548980816;
                                ** continue;
                                break;
                            }
                        }
                        var18_9 = (var16_8 | var19_7) ^ 1472508700;
                        break block79;
                    }
                    var10_14 = var2_2;
                    var11_15 = var3_3;
                    var12_16 = var4_4;
                    var13_17 = (float)var2_2 + 1.0f;
                    var14_18 = (float)var3_3 + 1.0f;
                    var15_19 = (float)var4_4 + 1.0f;
                    var18_9 = (var16_8 | var19_7) ^ -293874504;
                    break block79;
lbl160:
                    // 1 sources

                    while (true) {
                        var18_9 = (var16_8 | var19_7) ^ -598393295;
                        break block79;
                        break;
                    }
                }
                var18_9 = (var16_8 | var19_7) ^ -794931854;
                break block79;
lbl166:
                // 1 sources

                while (true) {
                    dp.ih(var0, var1_1, var10_14, var14_18, var15_19, var10_14, var14_18, var12_16, var7_11, var8_12, var9_13, var6_10);
                    ** continue;
                    break;
                }
            }
            block74: while (true) {
                switch (var18_9) {
                    default: {
                        continue block74;
                    }
                    case 50399429: {
                        ** continue;
                    }
                    case -864566364: {
                        ** continue;
                    }
                    ** case 1713895440:
lbl179:
                    // 1 sources

                    ** continue;
                }
                break;
            }
            dp.ih(var0, var1_1, var13_17, var11_15, var15_19, var10_14, var11_15, var15_19, var7_11, var8_12, var9_13, var6_10);
            var18_9 = (var16_8 | var19_7) ^ -1618775872;
            break block79;
            dp.ih(var0, var1_1, var13_17, var11_15, var12_16, var13_17, var14_18, var12_16, var7_11, var8_12, var9_13, var6_10);
            var18_9 = (var16_8 | var19_7) ^ -561850348;
        }
lbl186:
        // 2 sources

        block75: while (true) {
            switch (var18_9) {
                default: {
                    continue block75;
                }
                case -1589858353: {
                    ** continue;
                }
                case 1273622517: {
                    ** continue;
                }
                case 1542322616: {
                    ** continue;
                }
                case 1568256486: {
                    ** continue;
                }
                case -1992685582: {
                    ** continue;
                }
                case 252417502: {
                    ** continue;
                }
                case 679134407: {
                    ** continue;
                }
                case 643258644: {
                    ** continue;
                }
                case 1227997787: {
                    ** continue;
                }
                case -740146640: {
                    ** continue;
                }
                case 1774965015: {
                    ** continue;
                }
                case -1504186044: {
                    ** continue;
                }
                case -1849318557: {
                    ** continue;
                }
                case -225028261: {
                    ** continue;
                }
                case -720782932: {
                    ** continue;
                }
                case 1363440839: {
                    ** continue;
                }
                case -1324314787: {
                    ** continue;
                }
                case 839812018: {
                    ** continue;
                }
                case 403876697: {
                    ** continue;
                }
                case 1502596693: {
                    ** continue;
                }
                case 50076932: {
                    ** continue;
                }
                case -2107951471: {
                    ** continue;
                }
                case -1544861206: {
                    ** continue;
                }
                case -1356842327: {
                    ** continue;
                }
                case -532871397: {
                    var17_20 ^= var18_9 ^ -727167518;
                    ** continue;
                }
                case 1299980075: 
            }
            var17_20 ^= var18_9 ^ 1835790033;
            ** continue;
            break;
        }
        dp.ih(var0, var1_1, var10_14, var14_18, var12_16, var13_17, var14_18, var12_16, var7_11, var8_12, var9_13, var6_10);
        var18_9 = (var16_8 | var19_7) ^ 1508454095;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static void ih(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, int var10_10, int var11_11) {
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
    public static boolean overlayActive(class_310 var0) {
        block59: {
            block64: {
                block65: {
                    block58: {
                        block60: {
                            block63: {
                                block61: {
                                    block67: {
                                        block66: {
                                            block62: {
                                                break block66;
lbl1:
                                                // 1 sources

                                                while (true) {
                                                    var4_3 = (var2_2 | var5_1) ^ -1092124315;
                                                    break block58;
                                                    break;
                                                }
lbl4:
                                                // 1 sources

                                                while (true) {
                                                    var4_3 = (var2_2 | var5_1) ^ -1916339401;
                                                    break block59;
                                                    break;
                                                }
lbl7:
                                                // 1 sources

                                                while (true) {
                                                    v0 = true;
                                                    break block60;
                                                    break;
                                                }
lbl10:
                                                // 1 sources

                                                while (true) {
                                                    if (!(var0.field_1755 instanceof class_408)) break block61;
                                                    break block62;
                                                    break;
                                                }
lbl13:
                                                // 1 sources

                                                while (true) {
                                                    if (var0.field_1755 == null) break block62;
                                                    ** continue;
                                                    break;
                                                }
lbl16:
                                                // 1 sources

                                                while (true) {
                                                    var3_4 ^= var4_3 ^ -1886992929;
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            var4_3 = (var2_2 | var5_1) ^ -1578739883;
                                            break block59;
lbl22:
                                            // 1 sources

                                            while (true) {
                                                var3_4 ^= var4_3 ^ 1580178944;
                                                break block63;
                                                break;
                                            }
                                        }
                                        var5_1 = 1512366353;
                                        var2_2 = dp.l & 1512366353 ^ 544060935;
                                        var4_3 = 0;
                                        break block67;
lbl30:
                                        // 1 sources

                                        while (true) {
                                            var4_3 = (var2_2 | var5_1) ^ 1380796896;
                                            break block59;
lbl33:
                                            // 1 sources

                                            while (true) {
                                                var4_3 = (var2_2 | var5_1) ^ 2006773378;
                                                break block59;
lbl36:
                                                // 1 sources

                                                while (true) {
                                                    if (var0.field_1724 == null) break block61;
                                                    break block64;
                                                    break;
                                                }
lbl39:
                                                // 1 sources

                                                return v0;
lbl41:
                                                // 1 sources

                                                while (true) {
                                                    var4_3 = (var2_2 | var5_1) ^ 1322533928;
                                                    break block59;
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
lbl44:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var3_4 = (var2_2 | var5_1) ^ 776154532;
                                    var4_3 = (var2_2 | var5_1) ^ -668506325;
                                    break block58;
lbl50:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ 13471679;
                                        break block59;
                                        break;
                                    }
lbl53:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ -1187631794;
                                        break block58;
                                        break;
                                    }
                                }
lbl57:
                                // 5 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ -868395622;
                                    break block59;
                                    break;
                                }
                            }
                            var4_3 = (var2_2 | var5_1) ^ -2068939615;
                            break block59;
                        }
lbl64:
                        // 2 sources

                        while (true) {
                            var3_4 ^= 379964518;
                            ** continue;
                            break;
                        }
                    }
                    block42: while (true) {
                        switch (var4_3) {
                            default: {
                                continue block42;
                            }
                            case -1017390503: {
                                ** continue;
                            }
                            case -997558670: {
                                ** continue;
                            }
                            case -1572171716: 
                        }
                        break;
                    }
                    ** while (true)
lbl78:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -1517351874;
                        break block59;
                        break;
                    }
lbl81:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -1051704158;
                        break block59;
                        break;
                    }
lbl84:
                    // 1 sources

                    while (true) {
                        if (var1_5 == null) ** GOTO lbl57
                        ** continue;
                        break;
                    }
lbl87:
                    // 1 sources

                    while (true) {
                        if (!var1_5.isEnabled()) ** GOTO lbl57
                        ** continue;
                        break;
                    }
lbl90:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -445337824;
                        break block59;
                        break;
                    }
lbl93:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -1773445647;
                        break block59;
                        break;
                    }
lbl96:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ 1903182919;
                        break block59;
                        break;
                    }
                    var1_5 = dp.a;
                    var4_3 = (var2_2 | var5_1) ^ -1316279999;
                    break block59;
lbl102:
                    // 1 sources

                    while (true) {
                        if (var0.field_1687 == null) ** GOTO lbl57
                        break block65;
lbl105:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ -448176987;
                            break block59;
                            break;
                        }
                        break;
                    }
lbl108:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ 1581943508;
                        break block59;
                        break;
                    }
lbl111:
                    // 1 sources

                    while (true) {
                        var3_4 ^= var4_3 ^ -36914334;
                        ** continue;
                        break;
                    }
                }
                var4_3 = (var2_2 | var5_1) ^ -210725168;
                break block59;
lbl117:
                // 1 sources

                while (true) {
                    if (((Boolean)var1_5.b.getValue()).booleanValue()) ** break;
                    ** continue;
                    ** continue;
                    break;
                }
lbl121:
                // 1 sources

                while (true) {
                    v0 = false;
                    ** continue;
                    break;
                }
            }
            var4_3 = (var2_2 | var5_1) ^ 642158083;
            break block59;
lbl127:
            // 1 sources

            while (true) {
                var3_4 ^= var4_3 ^ -1877493331;
                ** continue;
                break;
            }
        }
        block57: while (true) {
            switch (var4_3) {
                default: {
                    continue block57;
                }
                case -538772695: {
                    ** continue;
                }
                case -333010202: {
                    ** continue;
                }
                case -139785184: {
                    ** continue;
                }
                case 673234679: {
                    ** continue;
                }
                case -874062250: {
                    ** continue;
                }
                case 1546352916: {
                    ** continue;
                }
                case 233904533: {
                    ** continue;
                }
                case -1153584203: {
                    ** continue;
                }
                case -20739146: {
                    ** continue;
                }
                case 884585279: {
                    ** continue;
                }
                case 186495824: {
                    ** continue;
                }
                case -611606462: {
                    ** continue;
                }
                case 2057337000: {
                    ** continue;
                }
                case -1624986702: {
                    ** continue;
                }
                case 606567875: {
                    ** continue;
                }
                case -1625728969: {
                    ** continue;
                }
                case -1236229491: {
                    ** continue;
                }
                case -1994563129: 
            }
            break;
        }
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void renderOverlay(W var1_1, class_310 var2_2) {
        block179: {
            block173: {
                block178: {
                    block174: {
                        block182: {
                            block181: {
                                block180: {
                                    block176: {
                                        block177: {
                                            block183: {
                                                block175: {
                                                    break block183;
lbl1:
                                                    // 1 sources

                                                    while (true) {
                                                        var30_5 = (var28_4 | var31_3) ^ 1336560713;
                                                        break block173;
                                                        break;
                                                    }
lbl4:
                                                    // 1 sources

                                                    while (true) {
                                                        var30_5 = (var28_4 | var31_3) ^ -209298379;
                                                        break block174;
                                                        break;
                                                    }
                                                    while (true) {
                                                        v0 = dp.id(((var29_30 ^= -1115742484) | var31_3) ^ 1641383853, (var28_4 | var31_3) ^ ((var29_30 | var31_3) ^ 978226476));
                                                        break block175;
                                                        break;
                                                    }
lbl-1000:
                                                    // 7 sources

                                                    {
                                                        block184: {
                                                            block185: {
                                                                switch (var30_5) {
                                                                    case -896091582: {
                                                                        var29_30 ^= var30_5 ^ 1787955602;
                                                                        var30_5 = (var28_4 | var31_3) ^ -376034585;
                                                                        break block184;
                                                                    }
                                                                    case -1728993721: {
                                                                        var29_30 ^= var30_5 ^ 1899238545;
                                                                        break;
                                                                    }
                                                                    case -1732395893: {
                                                                        var29_30 ^= var30_5 ^ -1668427440;
                                                                        break block185;
                                                                    }
                                                                    case 283624792: {
                                                                        if (!var18_20.hasNext()) ** GOTO lbl36
                                                                        ** GOTO lbl58
                                                                    }
                                                                    case -594830375: {
                                                                        if (!this.if(var17_17)) ** GOTO lbl50
                                                                        var30_5 = (var28_4 | var31_3) ^ 1935925975;
                                                                        break block184;
                                                                    }
                                                                    case -1186253849: {
                                                                        var29_30 ^= var30_5 ^ -937970270;
                                                                        var30_5 = (var28_4 | var31_3) ^ 1145852506;
                                                                        break block184;
                                                                    }
                                                                    case 709022069: {
                                                                        ++var4_7;
                                                                        var30_5 = (var28_4 | var31_3) ^ 1635797496;
                                                                        break block184;
                                                                    }
lbl36:
                                                                    // 1 sources

                                                                    var30_5 = (var28_4 | var31_3) ^ -1083605839;
                                                                    continue block119;
                                                                    case 214555716: {
                                                                        var18_21 = (double)var17_17.centerX() + 0.5 - var10_12;
                                                                        var20_24 = (double)var17_17.centerY() + 0.5 - var12_13;
                                                                        var22_26 = (double)var17_17.centerZ() + 0.5 - var14_14;
                                                                        var29_30 ^= 1968607050;
                                                                        var24_28 = var18_21 * var18_21 + var20_24 * var20_24 + var22_26 * var22_26;
                                                                        var30_5 = (var28_4 | var31_3) ^ -962443753;
                                                                        if (true) ** GOTO lbl400
                                                                    }
                                                                    case 1176015630: {
                                                                        var29_30 ^= var30_5 ^ -1492945473;
                                                                        var30_5 = (var28_4 | var31_3) ^ 637170790;
                                                                        break block184;
                                                                    }
lbl50:
                                                                    // 1 sources

                                                                    var30_5 = (var28_4 | var31_3) ^ 1077599320;
                                                                    continue block119;
                                                                    case -1978528408: {
                                                                        var29_30 ^= var30_5 ^ 1400588632;
                                                                        var30_5 = (var28_4 | var31_3) ^ -751616310;
                                                                        continue block119;
                                                                    }
                                                                    case -1120027163: {
                                                                        break block176;
                                                                    }
lbl58:
                                                                    // 1 sources

                                                                    var30_5 = (var28_4 | var31_3) ^ 1640780596;
                                                                    continue block119;
                                                                    case 1120058088: {
                                                                        var19_22 = var18_20.next();
                                                                        var30_5 = (var28_4 | var31_3) ^ -820917776;
                                                                        break block177;
                                                                    }
                                                                }
                                                                var30_5 = (var28_4 | var31_3) ^ -172477445;
                                                                continue;
                                                            }
                                                            var30_5 = (var28_4 | var31_3) ^ -1145875113;
                                                            continue;
                                                        }
lbl70:
                                                        // 2 sources

                                                        ** while (true)
                                                    }
                                                }
lbl72:
                                                // 2 sources

                                                while (true) {
                                                    var29_30 ^= -818166960;
                                                    var1_1.textRight(var27_35, v1, var26_34, v2, v0);
                                                    var30_5 = (var28_4 | var31_3) ^ -1646220570;
                                                    break block178;
                                                    break;
                                                }
lbl77:
                                                // 1 sources

                                                while (true) {
                                                    var23_32 = var1_1.s(88.0f);
                                                    var30_5 = (var28_4 | var31_3) ^ -1935805219;
                                                    break block179;
                                                    break;
                                                }
lbl81:
                                                // 1 sources

                                                while (true) {
                                                    var30_5 = (var28_4 | var31_3) ^ 318659312;
                                                    break block180;
lbl84:
                                                    // 1 sources

                                                    while (true) {
                                                        v3 = var1_1.s(10.0f);
                                                        if (var4_7 > 0) break block181;
                                                        v4 = dp.id(((var29_30 ^= -1314774651) | var31_3) ^ 2010289441, (var28_4 | var31_3) ^ ((var29_30 | var31_3) ^ 931502527));
                                                        ** GOTO lbl418
                                                        break;
                                                    }
                                                    break;
                                                }
lbl89:
                                                // 1 sources

                                                while (true) {
                                                    var4_7 = 0;
                                                    var5_8 = 0;
                                                    var6_9 = 0;
                                                    var29_30 ^= 1233981401;
                                                    var7_10 = null;
                                                    var29_30 ^= -175946540;
                                                    var8_11 = 1.7976931348623157E308;
                                                    var29_30 ^= 1667296835;
                                                    var10_12 = var2_2.field_1724.method_23317();
                                                    var12_13 = var2_2.field_1724.method_23318();
                                                    var14_14 = var2_2.field_1724.method_23321();
                                                    var29_30 ^= 1959107579;
                                                    var16_15 = this.a.values().iterator();
                                                    break block176;
                                                    break;
                                                }
lbl104:
                                                // 1 sources

                                                while (true) {
                                                    var30_5 = (var28_4 | var31_3) ^ 2017228749;
                                                    break block177;
                                                    break;
                                                }
lbl107:
                                                // 1 sources

                                                while (true) {
                                                    var21_31 = var1_1.s(var18_19 + (float)var19_23 * var17_18 + var16_16 * 2.0f);
                                                    var29_30 ^= -2027156583;
                                                    var22_27 = var1_1.f - var20_25 - var1_1.s(12.0f);
                                                    var29_30 ^= -1487670831;
                                                    ** continue;
                                                    break;
                                                }
lbl113:
                                                // 2 sources

                                                while (true) {
                                                    var30_5 = (var28_4 | var31_3) ^ 870798845;
                                                    ** GOTO lbl70
                                                    break;
                                                }
lbl116:
                                                // 1 sources

                                                while (true) {
                                                    var30_5 = (var28_4 | var31_3) ^ -1230293970;
                                                    break block180;
                                                    break;
                                                }
lbl119:
                                                // 1 sources

                                                block130: while (true) {
                                                    switch (var30_5) {
                                                        default: {
                                                            continue block130;
                                                        }
                                                        case -844077805: {
                                                            ** break;
                                                        }
                                                        case 871653014: {
                                                            var25_33 = var23_32 + var1_1.s(var16_16);
                                                            ** break;
                                                        }
                                                        case -486978510: {
                                                            var29_30 ^= var30_5 ^ -1679959492;
                                                            ** GOTO lbl140
                                                        }
lbl131:
                                                        // 1 sources

                                                        var30_5 = (var28_4 | var31_3) ^ 974579763;
                                                        ** GOTO lbl364
                                                        case 2044807355: {
                                                            var29_30 ^= var30_5 ^ 413476645;
                                                            ** break;
lbl136:
                                                            // 2 sources

                                                            var30_5 = (var28_4 | var31_3) ^ 1084385349;
                                                            continue block130;
                                                        }
                                                        case -2030848393: {
                                                            var29_30 ^= var30_5 ^ -1685225151;
lbl140:
                                                            // 2 sources

                                                            var30_5 = (var28_4 | var31_3) ^ 458871406;
                                                            continue block130;
                                                        }
                                                        case -500679215: {
                                                            var30_5 = (var28_4 | var31_3) ^ -897208023;
                                                            continue block130;
                                                        }
                                                        case -1177319430: 
                                                    }
                                                    switch (var29_30) {
                                                        case 2095605843: {
                                                            var30_5 = (var28_4 | var31_3) ^ 461939597;
                                                            continue block130;
                                                        }
                                                        case -1535094766: {
                                                            var30_5 = (var28_4 | var31_3) ^ 2139249096;
                                                            continue block130;
                                                        }
                                                    }
                                                    var30_5 = (var28_4 | var31_3) ^ -2138003708;
                                                    continue;
                                                    break;
                                                }
lbl155:
                                                // 1 sources

                                                while (true) {
                                                    var30_5 = (var28_4 | var31_3) ^ -740110060;
                                                    break block173;
                                                    break;
                                                }
                                            }
                                            var31_3 = -1989096145;
                                            var28_4 = dp.l & -1989096145 ^ 2016504469;
                                            var30_5 = 0;
                                            var29_30 = (var28_4 | var31_3) ^ -1650240178;
                                            var30_5 = (var28_4 | var31_3) ^ -1345431552;
                                            block132: while (true) {
                                                block186: {
                                                    switch (var30_5) {
                                                        case 870511868: {
                                                            var1_1.a = 1.0f;
                                                            ** break;
                                                        }
                                                        case 702303633: {
                                                            var1_1.b = ig.hudScale(var2_2);
                                                            break block186;
                                                        }
                                                        case -1275661833: {
                                                            var29_30 ^= var30_5 ^ -1751541175;
                                                            var30_5 = (var28_4 | var31_3) ^ -896328893;
                                                            ** break;
                                                        }
lbl176:
                                                        // 1 sources

                                                        var30_5 = (var28_4 | var31_3) ^ -1245300207;
                                                        continue block132;
                                                        case -902231122: {
                                                            var3_6 = this.a.size();
                                                            var29_30 ^= 1487699079;
                                                            ** continue;
                                                        }
                                                        case -759341551: {
                                                            var29_30 ^= var30_5 ^ 2022632161;
                                                            ** GOTO lbl190
                                                        }
                                                        case 1287116206: {
                                                            var29_30 ^= var30_5 ^ -2000490480;
                                                            var30_5 = (var28_4 | var31_3) ^ 860414993;
                                                        }
lbl188:
                                                        // 3 sources

                                                        default: {
                                                            continue block132;
                                                        }
lbl190:
                                                        // 1 sources

                                                        var30_5 = (var28_4 | var31_3) ^ -793927122;
                                                        continue block132;
                                                        case 1455404991: 
                                                    }
                                                    var30_5 = (var28_4 | var31_3) ^ 734835118;
                                                    continue;
                                                }
                                                var30_5 = (var28_4 | var31_3) ^ 1250369096;
                                            }
lbl198:
                                            // 1 sources

                                            while (true) {
                                                if (var7_10 != null) ** continue;
                                                break block182;
                                                break;
                                            }
lbl201:
                                            // 1 sources

                                            while (true) {
                                                var30_5 = (var28_4 | var31_3) ^ -1651652433;
                                                break block180;
                                                break;
                                            }
lbl204:
                                            // 1 sources

                                            while (true) {
                                                var30_5 = (var28_4 | var31_3) ^ -1690058843;
                                                break block174;
                                                break;
                                            }
lbl207:
                                            // 1 sources

                                            while (true) {
                                                var30_5 = (var28_4 | var31_3) ^ -950761784;
                                                break block174;
                                                break;
                                            }
lbl210:
                                            // 1 sources

                                            while (true) {
                                                var30_5 = (var28_4 | var31_3) ^ 702462953;
                                                break block179;
                                                break;
                                            }
lbl213:
                                            // 2 sources

                                            while (true) {
                                                var30_5 = (var28_4 | var31_3) ^ 1894076770;
                                                break block177;
                                                break;
                                            }
lbl216:
                                            // 1 sources

                                            while (true) {
                                                var30_5 = (var28_4 | var31_3) ^ -1196675609;
                                                break block174;
                                                break;
                                            }
lbl219:
                                            // 1 sources

                                            while (true) {
                                                var30_5 = (var28_4 | var31_3) ^ 1569782472;
                                                break block180;
                                                break;
                                            }
lbl222:
                                            // 1 sources

                                            while (true) {
                                                var30_5 = (var28_4 | var31_3) ^ -890628504;
                                                break block173;
                                                break;
                                            }
                                        }
                                        block142: while (true) {
                                            switch (var30_5) {
                                                case 1856195722: {
                                                    var29_30 ^= var30_5 ^ 2132343555;
                                                    ** break;
                                                }
                                                case 912270927: {
                                                    var29_30 ^= var30_5 ^ 584744086;
                                                    var30_5 = (var28_4 | var31_3) ^ -1323804967;
                                                    continue block142;
                                                }
lbl235:
                                                // 1 sources

                                                var30_5 = (var28_4 | var31_3) ^ -1715685396;
                                                default: {
                                                    continue block142;
                                                }
                                                case -2125621134: {
                                                    ** GOTO lbl113
                                                }
                                                case -2139571202: {
                                                    ++var5_8;
                                                    ** GOTO lbl213
                                                }
                                                case -1861616547: {
                                                    var29_30 ^= var30_5 ^ -2135798828;
                                                    ** GOTO lbl252
                                                }
                                                case 1624070227: {
                                                    ++var6_9;
                                                    ** continue;
                                                }
                                                case 1214888294: {
                                                    if (var19_22.kind() != 0) ** GOTO lbl256
                                                    ** GOTO lbl254
                                                }
lbl252:
                                                // 1 sources

                                                var30_5 = (var28_4 | var31_3) ^ 2030654529;
                                                continue block142;
lbl254:
                                                // 1 sources

                                                var30_5 = (var28_4 | var31_3) ^ 1752699874;
                                                continue block142;
lbl256:
                                                // 1 sources

                                                var30_5 = (var28_4 | var31_3) ^ -1747803339;
                                                continue block142;
                                                case -1986740515: 
                                            }
                                            break;
                                        }
                                        var29_30 ^= var30_5 ^ 681676166;
                                        ** while (true)
lbl261:
                                        // 2 sources

                                        while (true) {
                                            v0 = dp.id((var29_30 | var31_3) ^ 1641383854, (var28_4 | var31_3) ^ ((var29_30 | var31_3) ^ 1570737685));
                                            ** continue;
                                            break;
                                        }
lbl264:
                                        // 1 sources

                                        while (true) {
                                            var30_5 = (var28_4 | var31_3) ^ 2137294783;
                                            break block178;
                                            break;
                                        }
lbl267:
                                        // 1 sources

                                        while (true) {
                                            var19_23 = 3;
                                            var29_30 ^= -480131280;
                                            var20_25 = var1_1.s(214.0f);
                                            var29_30 ^= -1019421531;
                                            ** continue;
                                            break;
                                        }
lbl273:
                                        // 1 sources

                                        while (true) {
                                            var29_30 ^= 769413509;
                                            var17_18 = 20.0f;
                                            var29_30 ^= 1870346952;
                                            var18_19 = 34.0f;
                                            var29_30 ^= 62912458;
                                            ** continue;
                                            break;
                                        }
lbl280:
                                        // 1 sources

                                        while (true) {
                                            var30_5 = (var28_4 | var31_3) ^ 829274877;
                                            break block180;
                                            break;
                                        }
lbl283:
                                        // 1 sources

                                        while (true) {
                                            var30_5 = (var28_4 | var31_3) ^ 963057690;
                                            break block180;
                                            break;
                                        }
lbl286:
                                        // 1 sources

                                        while (true) {
                                            var30_5 = (var28_4 | var31_3) ^ 2013274153;
                                            break block174;
                                            break;
                                        }
                                    }
lbl290:
                                    // 2 sources

                                    while (true) {
                                        var30_5 = (var28_4 | var31_3) ^ -1180670150;
                                        break block173;
                                        break;
                                    }
                                    while (true) {
                                        var30_5 = (var28_4 | var31_3) ^ -1788744994;
                                        break block173;
                                        break;
                                    }
                                }
                                block152: while (true) {
                                    switch (var30_5) {
                                        case 1662508806: {
                                            var25_33 = this.ii(var1_1, var22_27, var20_25, var16_16, var25_33, var17_18, dp.d, var5_8, dp.a[0]);
                                            ** GOTO lbl357
                                        }
                                        case 1339743121: {
                                            var1_1.line(var24_29, var25_33, var22_27 + var20_25 - var1_1.s(var16_16), var25_33, var1_1.s(1.0f), dp.id((var29_30 | var30_5 ^ -961931586) ^ (var30_5 ^ 1485204657), (var28_4 | var30_5 ^ -961931586) ^ ((var29_30 | var30_5 ^ -961931586) ^ (var30_5 ^ 1482475103))));
                                            var30_5 = (var28_4 | var31_3) ^ 168100466;
                                            continue block152;
                                        }
                                        case 1936350754: {
                                            var26_34 = var25_33 + var1_1.s(var17_18 * 0.5f);
                                            ** continue;
                                        }
                                        case -342903473: {
                                            var29_30 ^= var30_5 ^ -1672121125;
                                            ** GOTO lbl355
                                        }
                                        case 528860958: {
                                            var29_30 ^= var30_5 ^ 1060169150;
                                            ** break;
                                        }
                                        case -1198744910: {
                                            var29_30 ^= var30_5 ^ -1581128722;
                                            ** continue;
                                        }
                                        case 383900507: {
                                            var29_30 ^= var30_5 ^ -1021559193;
                                            var30_5 = (var28_4 | var31_3) ^ 1089487183;
                                            continue block152;
                                        }
                                        case -756327630: {
                                            var25_33 += var1_1.s(var18_19 - var16_16);
                                            ** GOTO lbl353
                                        }
                                        case -1016658036: {
                                            var29_30 ^= var30_5 ^ -2106830470;
                                            ** GOTO lbl359
                                        }
                                        case -1528752777: {
                                            v5 = var4_7 + "/" + var3_6 + " geodes";
                                            v6 = var22_27 + var20_25 - var1_1.s(var16_16);
                                            v7 = var25_33 + var1_1.s(6.0f);
                                            var29_30 ^= 1196293958;
                                            ** continue;
                                        }
                                        case 1824605848: {
                                            var1_1.sectionLabel(dp.p, var24_29, var25_33 + var1_1.s(6.0f), var1_1.s(11.5f), dp.id((var29_30 | var30_5 ^ -441349193) ^ (var30_5 ^ 1301406123), (var28_4 | var30_5 ^ -441349193) ^ ((var29_30 | var30_5 ^ -441349193) ^ (var30_5 ^ -250634859))));
                                            ** continue;
                                        }
                                        case -1072236635: {
                                            var25_33 += var1_1.s(var17_18 * 0.5f);
                                            ** break;
                                        }
                                        case -210440755: {
                                            var29_30 ^= var30_5 ^ -280252920;
                                            ** continue;
                                        }
                                        case -937667262: {
                                            var29_30 ^= var30_5 ^ 1750169785;
                                            ** continue;
                                        }
                                        case -1182683408: {
                                            var25_33 = this.ii(var1_1, var22_27, var20_25, var16_16, var25_33, var17_18, dp.m, var6_9, dp.a[1]);
                                            ** continue;
                                        }
lbl349:
                                        // 1 sources

                                        var30_5 = (var28_4 | var31_3) ^ -420206431;
                                        continue block152;
lbl351:
                                        // 1 sources

                                        var30_5 = (var28_4 | var31_3) ^ -1704578887;
                                        continue block152;
lbl353:
                                        // 1 sources

                                        var30_5 = (var28_4 | var31_3) ^ 1107129613;
                                        continue block152;
lbl355:
                                        // 1 sources

                                        var30_5 = (var28_4 | var31_3) ^ -1977896547;
                                        continue block152;
lbl357:
                                        // 1 sources

                                        var30_5 = (var28_4 | var31_3) ^ -275761948;
                                        continue block152;
lbl359:
                                        // 1 sources

                                        var30_5 = (var28_4 | var31_3) ^ -1783584473;
                                        continue block152;
                                        case 1694246672: {
                                            var29_30 ^= var30_5 ^ -939652583;
                                            var30_5 = (var28_4 | var31_3) ^ 731559053;
                                        }
                                    }
lbl364:
                                    // 3 sources

                                }
lbl365:
                                // 1 sources

                                while (true) {
                                    var1_1.textRight(v5, v6, v7, v3, v4);
                                    ** continue;
                                    break;
                                }
                                block154: while (true) {
                                    switch (var30_5) {
                                        case -158020005: {
                                            var29_30 ^= var30_5 ^ -245401138;
                                            ** GOTO lbl393
                                        }
                                        case 1070836136: {
                                            var29_30 ^= var30_5 ^ -1906031585;
                                            ** break;
                                        }
                                        case -914328504: {
                                            var7_10 = var17_17;
                                            ** GOTO lbl395
                                        }
                                        case -1771368971: {
                                            var29_30 ^= var30_5 ^ 326770603;
                                            var30_5 = (var28_4 | var31_3) ^ 753237677;
                                            ** GOTO lbl400
                                        }
                                        case 1604155599: {
                                            var29_30 ^= var30_5 ^ 1482084186;
                                            ** break;
                                        }
                                        case 840664350: {
                                            if (!(var24_28 < var8_11)) ** GOTO lbl395
                                            ** GOTO lbl402
                                        }
lbl389:
                                        // 1 sources

                                        var30_5 = (var28_4 | var31_3) ^ 821140471;
                                        continue block154;
lbl391:
                                        // 1 sources

                                        var30_5 = (var28_4 | var31_3) ^ -882218335;
                                        continue block154;
lbl393:
                                        // 1 sources

                                        var30_5 = (var28_4 | var31_3) ^ -1269415718;
                                        continue block154;
lbl395:
                                        // 2 sources

                                        var30_5 = (var28_4 | var31_3) ^ 1864032842;
                                        continue block154;
                                        case 1294446437: {
                                            var8_11 = var24_28;
                                            var30_5 = (var28_4 | var31_3) ^ -1494444176;
                                        }
lbl400:
                                        // 4 sources

                                        default: {
                                            continue block154;
                                        }
lbl402:
                                        // 1 sources

                                        var30_5 = (var28_4 | var31_3) ^ 266674660;
                                        continue block154;
                                        case -711683822: 
                                    }
                                    break;
                                }
                                ** while (true)
lbl406:
                                // 1 sources

                                while (true) {
                                    var30_5 = (var28_4 | var31_3) ^ 816364049;
                                    break block179;
                                    break;
                                }
                            }
                            while (true) {
                                switch (var29_30) {
                                    case -1272033430: {
                                        var29_30 ^= 548093799;
                                        ** GOTO lbl417
                                    }
                                    case -1547208170: {
                                        var29_30 ^= -1314774651;
lbl417:
                                        // 2 sources

                                        v4 = dp.id((var29_30 | var31_3) ^ 2010289442, (var28_4 | var31_3) ^ ((var29_30 | var31_3) ^ -372728133));
lbl418:
                                        // 2 sources

                                        var29_30 ^= -742294914;
                                        ** continue;
                                    }
                                }
                                var29_30 ^= 84723246;
                            }
lbl422:
                            // 1 sources

                            while (true) {
                                var27_35 = v8;
                                ** continue;
                                break;
                            }
lbl425:
                            // 1 sources

                            while (true) {
                                var30_5 = (var28_4 | var31_3) ^ 234293406;
                                break block173;
                                break;
                            }
lbl428:
                            // 1 sources

                            while (true) {
                                var30_5 = (var28_4 | var31_3) ^ 54944413;
                                break block179;
                                break;
                            }
lbl431:
                            // 1 sources

                            while (true) {
                                var30_5 = (var28_4 | var31_3) ^ -1916014867;
                                break block174;
                                break;
                            }
                        }
                        block161: while (true) {
                            switch (var29_30) {
                                case -1333928987: {
                                    var29_30 ^= -1115742484;
                                    ** GOTO lbl261
                                }
                                case -1297124670: {
                                    var29_30 ^= -182815725;
                                    continue block161;
                                }
                            }
                            break;
                        }
                        var29_30 ^= 1494445085;
                        ** while (true)
                    }
                    block162: while (true) {
                        block187: {
                            block189: {
                                block188: {
                                    switch (var30_5) {
                                        case -1337692914: {
                                            ** GOTO lbl469
                                        }
                                        case 1105052248: {
                                            var29_30 ^= var30_5 ^ -1771081606;
                                            ** continue;
                                        }
                                        case 2049287719: {
                                            var29_30 ^= var30_5 ^ -1696136341;
                                            ** break;
                                        }
                                        case 1647464474: {
                                            if (var7_10 == null) {
                                                ** continue;
                                            }
                                            break block187;
                                        }
                                        case 184005514: {
                                            var29_30 ^= var30_5 ^ 1236929875;
                                            ** continue;
                                        }
                                        case -2123247722: {
                                            var1_1.text(dp.u, var22_27 + var1_1.s(var16_16), var26_34, var1_1.s(11.5f), dp.id((var29_30 | var30_5 ^ 134283961) ^ (var30_5 ^ -1028830535), (var28_4 | var30_5 ^ 134283961) ^ ((var29_30 | var30_5 ^ 134283961) ^ (var30_5 ^ 1786038249))));
                                            ** continue;
                                        }
lbl466:
                                        // 1 sources

                                        var30_5 = (var28_4 | var31_3) ^ 1228243633;
                                        default: {
                                            continue block162;
                                        }
lbl469:
                                        // 1 sources

                                        var29_30 ^= 2041667813;
                                        break block188;
                                        case 1958347090: {
                                            v8 = dp.i;
                                            break block189;
                                        }
                                        case 1042639223: 
                                    }
                                    var29_30 ^= var30_5 ^ -1792539246;
                                    ** continue;
                                }
                                var29_30 ^= 847161676;
                                v8 = var7_10.centerX() + " " + var7_10.centerY() + " " + var7_10.centerZ() + " \u00b7 " + (int)Math.sqrt(var8_11) + "m";
                            }
                            var29_30 ^= 179929944;
                            ** continue;
                        }
                        var30_5 = (var28_4 | var31_3) ^ -2091628136;
                    }
lbl486:
                    // 1 sources

                    while (true) {
                        var30_5 = (var28_4 | var31_3) ^ 130160029;
                        break block179;
                        break;
                    }
lbl489:
                    // 1 sources

                    while (true) {
                        var29_30 ^= -31155938;
                        ** continue;
                        break;
                    }
lbl492:
                    // 1 sources

                    while (true) {
                        var30_5 = (var28_4 | var31_3) ^ 1581591990;
                        break block179;
                        break;
                    }
lbl495:
                    // 1 sources

                    while (true) {
                        var30_5 = (var28_4 | var31_3) ^ -1205613912;
                        break block179;
                        break;
                    }
                }
                block167: while (true) {
                    switch (var30_5) {
                        default: {
                            continue block167;
                        }
                        case 1687242073: {
                            var29_30 ^= var30_5 ^ -27185962;
                            ** break;
                        }
                        case -2045417472: {
                            var29_30 ^= var30_5 ^ 406976968;
                            ** GOTO lbl511
                        }
lbl509:
                        // 1 sources

                        var30_5 = (var28_4 | var31_3) ^ 1164969720;
                        continue block167;
lbl511:
                        // 1 sources

                        var30_5 = (var28_4 | var31_3) ^ 1240964012;
                        continue block167;
                        case -1333365741: {
                            v1 = var22_27 + var20_25 - var1_1.s(var16_16);
                            v2 = var1_1.s(11.5f);
                            ** continue;
                        }
                        case -1140725433: 
                    }
                    break;
                }
                return;
lbl519:
                // 1 sources

                while (true) {
                    var30_5 = (var28_4 | var31_3) ^ 885099180;
                    ** continue;
                    break;
                }
lbl522:
                // 1 sources

                while (true) {
                    var29_30 ^= -2029322362;
                    var18_20 = var17_17.tells().iterator();
                    ** continue;
                    break;
                }
            }
            block170: while (true) {
                switch (var30_5) {
                    default: {
                        continue block170;
                    }
                    case -1227119626: {
                        if (!var16_15.hasNext()) ** continue;
                        ** continue;
                    }
                    case 1087473797: {
                        var29_30 ^= var30_5 ^ -1040582407;
                        ** continue;
                    }
                    case 714292907: {
                        var29_30 ^= var30_5 ^ 485646965;
                        ** continue;
                    }
                    case 1812989281: {
                        var29_30 ^= var30_5 ^ 136801849;
                        ** continue;
                    }
                    case 865860055: {
                        var16_16 = 16.0f;
                        ** continue;
                    }
                    case -192485599: 
                }
                break;
            }
            var17_17 = (fW)var16_15.next();
            ** while (true)
        }
        block171: while (true) {
            switch (var30_5) {
                default: {
                    continue block171;
                }
                case -21759454: {
                    var24_29 = var22_27 + var1_1.s(var16_16);
                    ** continue;
                }
                case -97022686: {
                    var1_1.strokeRoundedRect(var22_27, var23_32, var20_25, var21_31, var1_1.s(14.0f), var1_1.s(1.0f), dp.id((var29_30 | var30_5 ^ 1934049293) ^ (var30_5 ^ -68941802), (var28_4 | var30_5 ^ 1934049293) ^ ((var29_30 | var30_5 ^ 1934049293) ^ (var30_5 ^ -1242226625))));
                    ** continue;
                }
                case 1095902487: {
                    var1_1.roundedRect(var22_27, var23_32, var20_25, var21_31, var1_1.s(14.0f), dp.id((var29_30 | var30_5 ^ -937236424) ^ (var30_5 ^ 277712930), (var28_4 | var30_5 ^ -937236424) ^ ((var29_30 | var30_5 ^ -937236424) ^ (var30_5 ^ 383389454))));
                    ** continue;
                }
                case -1489714679: {
                    var29_30 ^= var30_5 ^ 1054370038;
                    ** continue;
                }
                case -908503634: {
                    var1_1.shadow(var22_27, var23_32, var20_25, var21_31, var1_1.s(14.0f), var1_1.s(18.0f), dp.id((var29_30 | var30_5 ^ 1084856449) ^ (var30_5 ^ -1098394984), (var28_4 | var30_5 ^ 1084856449) ^ ((var29_30 | var30_5 ^ 1084856449) ^ (var30_5 ^ -121888875))));
                    var30_5 = (var28_4 | var31_3) ^ 650014244;
                    continue block171;
                }
                case 1978407778: {
                    var29_30 ^= var30_5 ^ 515667853;
                    ** continue;
                }
                case -540048997: {
                    var29_30 ^= var30_5 ^ 2019442365;
                    ** continue;
                }
                case -793815978: 
            }
            break;
        }
        var29_30 ^= var30_5 ^ -2135744130;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private float ii(W var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, String var7_7, int var8_8, int var9_9) {
        block47: {
            break block47;
lbl1:
            // 1 sources

            while (true) {
                var16_12 = (var14_11 | var17_10) ^ -867449441;
                if (true) ** GOTO lbl108
                break;
            }
lbl4:
            // 1 sources

            while (true) {
                var1_1.circle(var13_17, var10_13, var12_16, v0);
                var16_12 = (var14_11 | var17_10) ^ 1496467703;
                ** GOTO lbl85
                break;
            }
lbl8:
            // 1 sources

            while (true) {
                v1 = dp.id(((var15_14 ^= 1489248230) | var17_10) ^ -1822656008, (var14_11 | var17_10) ^ ((var15_14 | var17_10) ^ -804393279));
                ** GOTO lbl16
                break;
            }
            while (true) {
                v0 = dp.id(((var15_14 ^= -3212136) | var17_10) ^ 1935455081, (var14_11 | var17_10) ^ ((var15_14 | var17_10) ^ 1165009805));
                ** GOTO lbl57
                break;
            }
            while (true) {
                v1 = dp.id(((var15_14 ^= 1489248230) | var17_10) ^ -1822656007, (var14_11 | var17_10) ^ ((var15_14 | var17_10) ^ -1030869500));
lbl16:
                // 2 sources

                var15_14 ^= 1662150738;
                var1_1.textRight(v2, v3, var10_13, v4, v1);
                var16_12 = (var14_11 | var17_10) ^ 2092382627;
                if (true) ** GOTO lbl85
                break;
            }
lbl20:
            // 1 sources

            while (true) {
                var15_14 ^= -718129761;
                if (!var11_15) ** continue;
                ** continue;
                break;
            }
            block38: while (true) {
                switch (var16_12) {
                    case 55502447: {
                        ** GOTO lbl69
                    }
                    case 1317203024: {
                        ** break;
                    }
                    case 306092161: {
                        var15_14 ^= var16_12 ^ 1261341657;
                        ** GOTO lbl59
                    }
                    case -1537398151: {
                        ** GOTO lbl61
                    }
                    case -1467859164: {
                        var15_14 ^= var16_12 ^ -197500143;
                        ** GOTO lbl69
                    }
                    case 968826140: {
                        v2 = String.valueOf(var8_8);
                        v3 = var13_17 - var1_1.s(8.0f);
                        v4 = var1_1.s(11.5f);
                        ** continue;
                    }
                    case -359061356: {
                        var15_14 ^= var16_12 ^ 1252390595;
                        ** GOTO lbl87
                    }
                    case 650876731: {
                        var15_14 ^= var16_12 ^ 2093034261;
                        ** GOTO lbl94
                    }
lbl49:
                    // 1 sources

                    switch (var15_14) {
                        case -1653791250: {
                            var16_12 = (var14_11 | var17_10) ^ -1285431997;
                            break;
                        }
                        case 347782648: {
                            if (!var11_15) ** continue;
                            var15_14 ^= -3212136;
                            v0 = var9_9;
lbl57:
                            // 2 sources

                            var15_14 ^= -313240703;
                            ** continue;
                        }
lbl59:
                        // 1 sources

                        var16_12 = (var14_11 | var17_10) ^ 1799578164;
                        break;
lbl61:
                        // 1 sources

                        var16_12 = (var14_11 | var17_10) ^ -453177053;
                        break;
                        case 1626990005: {
                            var16_12 = (var14_11 | var17_10) ^ -679747352;
                            break;
                        }
                        case -862453105: {
                            var15_14 ^= var16_12 ^ 964331111;
                            ** GOTO lbl87
                        }
lbl69:
                        // 2 sources

                        var16_12 = (var14_11 | var17_10) ^ 830157724;
                        break;
                        case -1673853783: {
                            v5 = var2_2 + var1_1.s(var4_4);
                            v6 = var1_1.s(11.5f);
                            if (var11_15) ** GOTO lbl89
                            v7 = dp.id(((var15_14 ^= -110976095) | var17_10) ^ 827916137, (var14_11 | var17_10) ^ ((var15_14 | var17_10) ^ -970854300));
                            ** GOTO lbl90
                        }
                        default: {
                            var16_12 = (var14_11 | var17_10) ^ -1788807336;
                            break;
                        }
                    }
                    ** GOTO lbl85
                    case -1136561789: {
                        var15_14 ^= var16_12 ^ 846912297;
                        ** break;
lbl84:
                        // 1 sources

                        var16_12 = (var14_11 | var17_10) ^ 1179042512;
                    }
lbl85:
                    // 7 sources

                    default: {
                        continue block38;
                    }
lbl87:
                    // 2 sources

                    var16_12 = (var14_11 | var17_10) ^ -609946187;
                    continue block38;
lbl89:
                    // 1 sources

                    v7 = dp.id(((var15_14 ^= -110976095) | var17_10) ^ 827916136, (var14_11 | var17_10) ^ ((var15_14 | var17_10) ^ -1203524537));
lbl90:
                    // 2 sources

                    var15_14 ^= -1259796991;
                    var1_1.text(var7_7, v5, var10_13, v6, v7);
                    var16_12 = (var14_11 | var17_10) ^ -1011306929;
                    ** GOTO lbl85
lbl94:
                    // 1 sources

                    var16_12 = (var14_11 | var17_10) ^ -473769115;
                    continue block38;
                    case -1694183697: 
                }
                break;
            }
            return var5_5 + var1_1.s(var6_6);
lbl98:
            // 1 sources

            while (true) {
                var11_15 = v8;
                var15_14 ^= -46069573;
                var12_16 = var1_1.s(3.4f);
                var15_14 ^= 633599847;
                var13_17 = var2_2 + var3_3 - var1_1.s(var4_4) - var12_16;
                var16_12 = (var14_11 | var17_10) ^ 1841776461;
                ** GOTO lbl85
                break;
            }
            block41: while (true) {
                var16_12 = (var14_11 | var17_10) ^ -178000783;
lbl108:
                // 2 sources

                block42: while (true) {
                    switch (var16_12) {
                        case -1969605699: {
                            if (var8_8 > 0) {
                                ** break;
                            }
                            ** GOTO lbl129
                        }
                        case 987546582: {
                            var15_14 ^= var16_12 ^ 1459204281;
                            ** continue;
                        }
                        case -1280173485: {
                            v8 = true;
                            ** break;
                        }
                        case 879797598: {
                            var15_14 ^= var16_12 ^ 1482020401;
                            var16_12 = (var14_11 | var17_10) ^ -1300982137;
                            break;
                        }
                        case 330100986: {
                            var15_14 ^= var16_12 ^ -1895781235;
                            continue block41;
                        }
lbl127:
                        // 1 sources

                        var16_12 = (var14_11 | var17_10) ^ 1160059930;
                        continue block42;
lbl129:
                        // 1 sources

                        var16_12 = (var14_11 | var17_10) ^ 1267301010;
                        continue block42;
                        case -846378677: {
                            v8 = false;
lbl133:
                            // 2 sources

                            var15_14 ^= -55706861;
                            ** continue;
                        }
                    }
lbl135:
                    // 3 sources

                }
                break;
            }
lbl136:
            // 1 sources

            while (true) {
                var16_12 = (var14_11 | var17_10) ^ 1817521974;
                ** GOTO lbl135
                break;
            }
        }
        var17_10 = 502792520;
        var14_11 = dp.l & 502792520 ^ 1667358596;
        var16_12 = 0;
        var15_14 = (var14_11 | var17_10) ^ 2108916104;
        var16_12 = (var14_11 | var17_10) ^ 1483245933;
        block45: while (true) {
            switch (var16_12) {
                default: {
                    continue block45;
                }
                case 925626012: {
                    var10_13 = var5_5 + var1_1.s(var6_6 * 0.5f);
                    ** continue;
                }
                case 427080695: {
                    var15_14 ^= var16_12 ^ -209856498;
                    break;
                }
                case 663836321: {
                    var16_12 = (var14_11 | var17_10) ^ 1720542267;
                    continue block45;
                }
            }
            var16_12 = (var14_11 | var17_10) ^ 1221734736;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean ij(class_1923 class_19232, int n2, Long l2) {
        int n3 = l & 0xD19D2255 ^ 0x11EE403A;
        int n4 = 0;
        int n5 = (n3 | 0xD19D2255) ^ 0xCB550BCD;
        n4 = (n3 | 0xD19D2255) ^ 0x54B3FCFC;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case -2058576253: {
                    n4 = (n3 | 0xD19D2255) ^ 0xA520B83E;
                    continue block5;
                }
                case 1960827457: {
                    n5 ^= n4 ^ 0xA60F015;
                    n4 = (n3 | 0xD19D2255) ^ 0x6B4EE9EB;
                    continue block5;
                }
                case -1162769516: 
            }
            break;
        }
        return dp.ie(l2, class_19232, n2);
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ boolean ik(class_1923 var0, int var1_1, Long var2_2) {
        block9: {
            block10: {
                break block10;
lbl1:
                // 1 sources

                while (true) {
                    var5_4 = (var3_3 | 1593357897) ^ -1770217391;
                    break block9;
                    break;
                }
lbl4:
                // 1 sources

                while (true) {
                    var5_4 = (var3_3 | 1593357897) ^ -1885685537;
                    break block9;
                    break;
                }
            }
            var3_3 = dp.l & 1593357897 ^ -934385138;
            var5_4 = 0;
            var4_5 = (var3_3 | 1593357897) ^ -244898721;
            ** GOTO lbl21
        }
        block7: while (true) {
            switch (var5_4) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block7;
                    }
                    break;
                }
                case 1365526160: {
                    var4_5 ^= var5_4 ^ 81630215;
                    ** continue;
                }
lbl21:
                // 1 sources

                var5_4 = (var3_3 | 1593357897) ^ 326419707;
                ** continue;
                case -846579020: {
                    ** continue;
                }
                case 1216503326: 
            }
            break;
        }
        return dp.ie(var2_2, var0, var1_1);
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ boolean il(class_1923 var0, int var1_1, Long var2_2) {
        var3_3 = dp.l & -484379467 ^ -792893186;
        var5_4 = 0;
        if (true) ** GOTO lbl13
        block5: while (true) {
            var5_4 = (var3_3 | -484379467) ^ -1570776376;
lbl6:
            // 2 sources

            block6: while (true) {
                switch (var5_4) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block6;
                        }
                        break;
                    }
                    case 1373775415: {
                        return dp.ie(var2_2, var0, var1_1);
                    }
lbl13:
                    // 1 sources

                    var4_5 = (var3_3 | -484379467) ^ 1527610380;
                    var5_4 = (var3_3 | -484379467) ^ -959866087;
                    ** continue;
                    case 159146212: {
                        var4_5 ^= var5_4 ^ 720598485;
                        continue block5;
                    }
                    case 896821222: 
                }
                break;
            }
            break;
        }
        var5_4 = (var3_3 | -484379467) ^ -87974885;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ void im(class_638 var0, class_2818 var1_1) {
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
}

