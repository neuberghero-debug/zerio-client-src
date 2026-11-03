/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.minecraft.class_1747
 *  net.minecraft.class_1802
 *  net.minecraft.class_2248
 *  net.minecraft.class_2960
 *  net.minecraft.class_304
 *  net.minecraft.class_310
 *  net.minecraft.class_7923
 */
package z.r;

import com.google.gson.JsonArray;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BooleanSupplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_1747;
import net.minecraft.class_1802;
import net.minecraft.class_2248;
import net.minecraft.class_2960;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_7923;
import z.r.D;
import z.r.aw;
import z.r.az;
import z.r.cy;
import z.r.dL;
import z.r.gF;
import z.r.gP;
import z.r.gR;
import z.r.hL;
import z.r.hR;
import z.r.he;
import z.r.iG;
import z.r.ke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class ak
extends gF
implements D {
    private static final boolean a;
    private final Map<String, Long> a;
    private static final int a;
    private static final boolean b;
    private final BooleanSupplier a;
    private static final float a;
    private static final /* synthetic */ String a;
    private static final boolean c;
    private static final boolean d;
    private static final /* synthetic */ String b;
    private static final int b;
    private final Map<hR, ke> b;
    private static final /* synthetic */ String c;
    public static final int i;
    private final gP a;
    private static final int c;
    private static final boolean e;
    private final cy a;
    private static final /* synthetic */ String d;
    private static final boolean f;
    private static final int d;
    private static final /* synthetic */ String e;
    private static final boolean g;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final float b;
    private static final boolean h;
    private static final int e;
    private final iG a;
    private static final int f;
    private static final boolean i;
    private static final /* synthetic */ String h;
    private final dL a;
    private final gP b;
    private static final /* synthetic */ String i;
    private static final float c;
    private static final boolean j;
    private static final boolean k;
    private static final boolean l;
    private final ke a;
    private static final boolean m;
    private static final boolean n;
    private final aw a;
    private static final boolean o;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final boolean p;
    private final hL a;
    private static final float d;
    private static final float e;
    private static final double a;
    private static final String n;
    private static final boolean q;
    private final gP c;
    private static final float f;
    private static final boolean r;
    private final Set<class_2960> a;
    private static final /* synthetic */ String k;
    private static final int[] a;
    private static final boolean s;
    private static final boolean t;
    private static final boolean u;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String s;
    private static final long a;
    private static final /* synthetic */ String p;
    private static final boolean v;
    private static final int g;
    private static final boolean w;
    private static final boolean x;

    /*
     * Exception decompiling
     */
    public ak() {
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
    @Override
    public void onEnable() {
        var4_1 = -1162038475;
        var1_2 = ak.i & -1162038475 ^ 1598358069;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 1056843614;
        var3_3 = (var1_2 | var4_1) ^ -335908423;
        if (true) ** GOTO lbl45
        block13: while (true) {
            var3_3 = (var1_2 | var4_1) ^ 709043641;
            block14: while (true) {
                switch (var3_3) {
                    case -1521791148: {
                        var2_4 ^= var3_3 ^ -1190729166;
                        var3_3 = (var1_2 | var4_1) ^ 385755392;
                        continue block14;
                    }
                    case -1874232559: {
                        var2_4 ^= var3_3 ^ 794485441;
                        var3_3 = (var1_2 | var4_1) ^ -408000659;
                        continue block14;
                    }
                    case -1329825389: {
                        var2_4 ^= var3_3 ^ -1191067701;
                        ** break;
                    }
                    case -727785963: {
                        this.a.invalidate();
                        var3_3 = (var1_2 | var4_1) ^ 1521941601;
                        continue block14;
                    }
                    case -385639883: {
                        this.a.reset();
                        var3_3 = (var1_2 | var4_1) ^ -1308541713;
                        continue block14;
                    }
                    case 408147032: {
                        this.a.onEnable();
                        var3_3 = (var1_2 | var4_1) ^ 1329711782;
                        continue block14;
                    }
                    case -708929908: {
                        var2_4 ^= var3_3 ^ 494010193;
                        var3_3 = (var1_2 | var4_1) ^ 0x9E9B9B;
                        continue block14;
                    }
lbl38:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 727936288;
                    ** GOTO lbl45
                    case -1358790050: {
                        this.a.clear();
                        continue block13;
                    }
                    case 336052876: {
                        var3_3 = (var1_2 | var4_1) ^ 1874118692;
                    }
lbl45:
                    // 4 sources

                    default: {
                        continue block14;
                    }
                    case 1308397530: {
                        var2_4 ^= var3_3 ^ 0x9E9E9B;
                        var3_3 = (var1_2 | var4_1) ^ 1358901611;
                        continue block14;
                    }
                    case -10278738: 
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
    @Override
    public void onDisable() {
        block16: {
            break block16;
lbl1:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var5_1 = 1221131094;
        var2_2 = ak.i & 1221131094 ^ 163059995;
        var4_3 = 0;
        var3_5 = (var2_2 | var5_1) ^ -679859101;
        var4_3 = (var2_2 | var5_1) ^ 470927085;
        block14: while (true) {
            block17: {
                switch (var4_3) {
                    default: {
                        continue block14;
                    }
                    case -177105534: {
                        var3_5 ^= var4_3 ^ -203957939;
                        var4_3 = (var2_2 | var5_1) ^ -619691572;
                        continue block14;
                    }
                    case -1830241645: {
                        var1_4 = class_310.method_1551();
                        break;
                    }
                    case 1441349042: {
                        break block17;
                    }
                }
                var4_3 = (var2_2 | var5_1) ^ 1221810416;
                ** GOTO lbl47
            }
            var4_3 = (var2_2 | var5_1) ^ -1131843875;
        }
        var4_3 = (var2_2 | var5_1) ^ 786220496;
        block15: while (true) {
            switch (var4_3) {
                case -1388252312: {
                    var3_5 ^= var4_3 ^ 118185359;
                    ** break;
                }
                case 1730428559: {
                    var3_5 ^= var4_3 ^ -2052728176;
                    var4_3 = (var2_2 | var5_1) ^ 1039401803;
                    continue block15;
                }
                case -890004692: {
                    this.a.releaseEverything(var1_4);
                    ** GOTO lbl42
                }
lbl40:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ 243605031;
                ** GOTO lbl47
lbl42:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ -457701321;
                ** GOTO lbl47
                case 19637167: {
                    var3_5 ^= var4_3 ^ 1178768893;
                    var4_3 = (var2_2 | var5_1) ^ -2096406413;
                }
lbl47:
                // 5 sources

                default: {
                    continue block15;
                }
                case 1199433080: {
                    this.a.invalidate();
                    ** continue;
                }
                case 1947006996: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void onStartTick(class_310 var1_1) {
        block36: {
            block39: {
                block37: {
                    block38: {
                        break block38;
                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 649326214;
                            ** GOTO lbl54
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -1704366704;
                            ** GOTO lbl54
lbl7:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 559433457;
                                ** GOTO lbl54
                                break;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 1495016918;
                                ** GOTO lbl54
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -200761878;
                                ** GOTO lbl54
lbl16:
                                // 1 sources

                                while (true) {
                                    var3_5 ^= var4_4 ^ -659164224;
                                    ** GOTO lbl90
                                    break;
                                }
lbl19:
                                // 1 sources

                                while (true) {
                                    var3_5 ^= var4_4 ^ 1597241999;
                                    ** continue;
                                    break;
                                }
lbl22:
                                // 1 sources

                                return;
lbl24:
                                // 1 sources

                                return;
                            }
                            break;
                        }
                    }
                    var5_2 = 1938980621;
                    var2_3 = ak.i & 1938980621 ^ -216114979;
                    var4_4 = 0;
                    break block39;
lbl31:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 384026707;
                        if (true) ** GOTO lbl54
                        break;
                    }
lbl34:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_4 ^ 1212172868;
                        break block36;
                        break;
                    }
                    block28: while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 203782242;
                        ** GOTO lbl54
                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -864975827;
                            if (true) ** GOTO lbl54
                            break;
                        }
lbl43:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ -193910758;
                            ** continue;
                            break;
                        }
lbl46:
                        // 1 sources

                        while (true) {
                            if (!this.a.tick(var1_1)) ** continue;
                            ** GOTO lbl83
                            break;
                        }
lbl49:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ -887826237;
                            ** continue;
                            break;
                        }
                        block33: while (true) {
                            var4_4 = (var2_3 | var5_2) ^ 542135724;
lbl54:
                            // 13 sources

                            block34: while (true) {
                                switch (var4_4) lbl-1000:
                                // 3 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block34;
                                        }
                                        break;
                                    }
                                    case -1752327802: {
                                        ** continue;
                                    }
                                    case 127328823: {
                                        ** continue;
                                    }
                                    case -1434297845: {
                                        ** continue;
                                    }
                                    case 1940113660: {
                                        ** continue;
                                    }
                                    case -4520001: {
                                        ** continue;
                                    }
                                    case -718433957: {
                                        ** continue;
                                    }
                                    case -444745842: {
                                        ** continue;
                                    }
                                    case 1072692208: {
                                        ** continue;
                                    }
                                    case 1985846329: {
                                        break block28;
                                    }
                                    case -2130199945: {
                                        var3_5 ^= var4_4 ^ -817908291;
                                        break block37;
                                    }
                                    case -1919825456: {
                                        this.a.releaseEverything(var1_1);
                                        continue block33;
                                    }
lbl83:
                                    // 1 sources

                                    var4_4 = (var2_3 | var5_2) ^ 1679025755;
                                    ** GOTO lbl-1000
                                    case 1777799757: {
                                        return;
                                    }
                                    case -758761172: {
                                        this.a.onStartTick(var1_1);
                                        continue block28;
                                    }
lbl90:
                                    // 1 sources

                                    var4_4 = (var2_3 | var5_2) ^ 2114958861;
                                    ** continue;
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    var4_4 = (var2_3 | var5_2) ^ 1922680234;
                    ** GOTO lbl54
                }
                var4_4 = (var2_3 | var5_2) ^ 1606434346;
                ** GOTO lbl54
                {
                    case -1403108873: {
                        if (this.isEnabled()) ** continue;
                        ** continue;
                    }
                }
            }
            var3_5 = (var2_3 | var5_2) ^ -1663808573;
            var4_4 = (var2_3 | var5_2) ^ -2050759708;
            ** GOTO lbl54
        }
        var4_4 = (var2_3 | var5_2) ^ -2143439071;
        ** while (true)
        {
            ** case -741463439:
        }
lbl108:
        // 1 sources

        var3_5 ^= var4_4 ^ -2094687518;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onTick(class_310 var1_1) {
        block28: {
            break block28;
lbl1:
            // 1 sources

            while (true) {
                var3_5 ^= var4_4 ^ -780162422;
                ** GOTO lbl54
                break;
            }
lbl4:
            // 1 sources

            while (true) {
                var3_5 ^= var4_4 ^ 185099264;
                ** GOTO lbl65
                break;
            }
lbl7:
            // 1 sources

            while (true) {
                var3_5 ^= var4_4 ^ 1933867160;
                ** GOTO lbl65
                break;
            }
        }
        var5_2 = -628927583;
        var2_3 = ak.i & -628927583 ^ 638114353;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ 776232312;
        if (true) ** GOTO lbl46
lbl16:
        // 1 sources

        return;
        block20: while (true) {
            var4_4 = (var2_3 | var5_2) ^ -817955157;
            block21: while (true) {
                switch (var4_4) lbl-1000:
                // 10 sources

                {
                    while (true) {
                        default: {
                            continue block21;
                        }
                        break;
                    }
                    case 59513834: {
                        ** continue;
                    }
                    case -760792440: {
                        ** continue;
                    }
                    case 833955098: {
                        ** continue;
                    }
                    case 2044382037: {
                        ** continue;
                    }
lbl33:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -2024730396;
                        ** GOTO lbl-1000
                        break;
                    }
                    case 501085078: {
                        var4_4 = (var2_3 | var5_2) ^ 577597962;
                        ** GOTO lbl-1000
                    }
                    case -588863045: {
                        this.a.onEndTick(var1_1);
                        var4_4 = (var2_3 | var5_2) ^ -53906110;
                        ** GOTO lbl-1000
                    }
lbl43:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -321824753;
                        ** GOTO lbl-1000
                        break;
                    }
lbl46:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 1699614605;
                    ** GOTO lbl-1000
lbl48:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 741138745;
                        ** GOTO lbl-1000
                        break;
                    }
lbl51:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -49823653;
                        ** GOTO lbl-1000
                        break;
                    }
lbl54:
                    // 2 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -1220464988;
                        ** GOTO lbl-1000
                        break;
                    }
                    case 1238037781: {
                        switch (var3_5) {
                            case -1170634883: {
                                continue block20;
                            }
                            case -791705911: {
                                ** continue;
                            }
                            ** default:
lbl64:
                            // 1 sources

                            ** continue;
                        }
                    }
lbl65:
                    // 2 sources

                    var4_4 = (var2_3 | var5_2) ^ -480892889;
                    ** continue;
                    case 37924595: {
                        var3_5 ^= var4_4 ^ 1979354809;
                        ** continue;
                    }
                    case -1681533892: {
                        ** continue;
                    }
                    case 307921854: 
                }
                break;
            }
            break;
        }
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public void render(WorldRenderContext var1_1, class_310 var2_2) {
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
    private boolean sB() {
        block30: {
            block29: {
                block31: {
                    break block31;
lbl1:
                    // 2 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1856990767;
                        break block29;
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -191325306;
                        break block29;
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1960250827;
                        break block29;
lbl10:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -750869054;
                            break block29;
                            break;
                        }
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1342540673;
                        break block29;
                        break;
                    }
lbl16:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1500081531;
                        break block29;
                        break;
                    }
lbl19:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ 1656003082;
                        ** continue;
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -1225069606;
                        ** continue;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1325171463;
                        break block29;
                        break;
                    }
lbl28:
                    // 1 sources

                    return v0;
lbl30:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -559066881;
                        break block29;
                        break;
                    }
lbl33:
                    // 1 sources

                    while (true) {
                        v0 = true;
                        break block30;
                        break;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        if (!this.a.owningAutomationLease()) ** GOTO lbl1
                        ** continue;
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        if (this.isEnabled()) ** break;
                        ** continue;
                        ** continue;
                        break;
                    }
                }
                var4_1 = 971761467;
                var1_2 = ak.i & 971761467 ^ 412422367;
                var3_3 = 0;
                var2_4 = (var1_2 | var4_1) ^ 1002818541;
                ** while (true)
lbl49:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1279861544;
                    break block29;
                    break;
                }
lbl52:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ -2126714738;
                    ** continue;
                    break;
                }
lbl55:
                // 1 sources

                while (true) {
                    v0 = false;
                    break block30;
                    break;
                }
            }
            block28: while (true) {
                switch (var3_3) {
                    default: {
                        continue block28;
                    }
                    case -1974916313: {
                        ** continue;
                    }
                    case -1464900050: {
                        ** continue;
                    }
                    case -414013696: {
                        ** continue;
                    }
                    case 1996715256: {
                        ** continue;
                    }
                    case -1294531126: {
                        ** continue;
                    }
                    case -848860039: {
                        ** continue;
                    }
                    case -1778023552: {
                        ** continue;
                    }
                    case -1620482694: {
                        ** continue;
                    }
                    ** case -356429251:
lbl80:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        var2_4 ^= -1109079354;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public boolean otherAutomationActive() {
        block9: {
            break block9;
            {
                var2_3 ^= var3_2 ^ 791053324;
                var3_2 = (var1_1 | -1739322024) ^ -1393508390;
lbl3:
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
                        case -1396388853: {
                            break block5;
                        }
                        case 1588319171: {
                            continue block5;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | -1739322024) ^ 1890648950;
                            ** continue;
                            break;
                        }
                    }
                    break;
                }
            }
            var3_2 = (var1_1 | -1739322024) ^ -2099372866;
            ** while (true)
            {
                ** case 1887793319:
            }
lbl18:
            // 1 sources

            return he.suppressAutomationExcept(this.a);
        }
        var1_1 = ak.i & -1739322024 ^ -600453259;
        var3_2 = 0;
        var2_3 = (var1_1 | -1739322024) ^ -115969774;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean sC() {
        var4_1 = -398167539;
        var1_2 = ak.i & -398167539 ^ 362746907;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 440789688;
        var3_3 = (var1_2 | var4_1) ^ 2092145963;
        if (true) ** GOTO lbl9
        block11: while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1113733974;
lbl9:
            // 2 sources

            block12: while (true) {
                switch (var3_3) {
                    default: {
                        continue block12;
                    }
                    case -1336900038: {
                        var2_4 ^= var3_3 ^ 1135255024;
                        var3_3 = (var1_2 | var4_1) ^ 987102750;
                        continue block12;
                    }
                    case -2068833544: {
                        v0 = false;
                        break block11;
                    }
                    case -1228473843: {
                        if (!this.a.owningUse()) continue block11;
                        var3_3 = (var1_2 | var4_1) ^ -766261761;
                        continue block12;
                    }
                    case -1129949446: {
                        var3_3 = (var1_2 | var4_1) ^ 1259965458;
                        continue block12;
                    }
                    case -955611135: {
                        if (this.isEnabled()) ** break;
                        continue block11;
                        var3_3 = (var1_2 | var4_1) ^ 1098457317;
                        continue block12;
                    }
                    case 797750240: {
                        var2_4 ^= var3_3 ^ 1872648202;
                        var3_3 = (var1_2 | var4_1) ^ -2052550425;
                        continue block12;
                    }
                    case -2123568332: {
                        var3_3 = (var1_2 | var4_1) ^ 1301278757;
                        continue block12;
                    }
                    case 1078112949: {
                        var2_4 ^= var3_3 ^ 5265759;
                        var3_3 = (var1_2 | var4_1) ^ 2037345511;
                        continue block12;
                    }
                    case 2021123832: {
                        v0 = true;
                    }
                }
                break;
            }
            break;
        }
        var2_4 ^= -1594116907;
        return v0;
    }

    /*
     * Exception decompiling
     */
    private Boolean sD(class_304 var1_1, boolean var2_2) {
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
    public cy controller() {
        int n2 = i & 0xE59CAD9 ^ 0x7DD73F45;
        int n3 = 0;
        int n4 = (n2 | 0xE59CAD9) ^ 0x122A8ACA;
        n3 = (n2 | 0xE59CAD9) ^ 0xEB01A010;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1611126412: {
                    n4 ^= n3 ^ 0xCDE9A8FA;
                    n3 = (n2 | 0xE59CAD9) ^ 0x60F964AF;
                    continue block5;
                }
                case 522623858: {
                    return this.a;
                }
                case -1797365811: 
            }
            n3 = (n2 | 0xE59CAD9) ^ 0xE027D6A9;
        }
    }

    /*
     * Exception decompiling
     */
    public void report(String var1_1) {
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
    public void reportDrill(String var1_1) {
        var5_2 = -1851698255;
        var2_3 = ak.i & -1851698255 ^ -1302856636;
        var4_4 = 0;
        if (true) ** GOTO lbl19
        block7: while (true) {
            var4_4 = (var2_3 | var5_2) ^ -1938295480;
lbl7:
            // 2 sources

            block8: while (true) {
                switch (var4_4) lbl-1000:
                // 4 sources

                {
                    default: {
                        continue block8;
                    }
                    case -865477831: {
                        continue block7;
                    }
                    case 82941996: {
                        var3_5 ^= var4_4 ^ 1053759664;
                        break block7;
                    }
lbl16:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 2141070540;
                        ** GOTO lbl-1000
                        break;
                    }
lbl19:
                    // 1 sources

                    var3_5 = (var2_3 | var5_2) ^ 1436054038;
                    ** continue;
lbl21:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 1470972578;
                        ** GOTO lbl-1000
                        break;
                    }
                    case -463815337: {
                        this.report(var1_1);
                        var4_4 = (var2_3 | var5_2) ^ -1224316967;
                        ** GOTO lbl-1000
                    }
                }
                break;
            }
            break;
        }
        var4_4 = (var2_3 | var5_2) ^ 1571299091;
        ** while (true)
        {
            case 1065355965: {
                var3_5 ^= var4_4 ^ -1247714536;
                ** continue;
            }
            ** case -295706394:
        }
lbl34:
        // 1 sources

    }

    /*
     * Enabled aggressive block sorting
     */
    public void reportMining(String string) {
        int n2 = -974489912;
        int n3 = i & 0xC5EA76C8 ^ 0xFE3134B5;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x77430721;
        n4 = (n3 | n2) ^ 0x502356BD;
        block7: while (true) {
            block8: {
                switch (n4) {
                    default: {
                        continue block7;
                    }
                    case 1160849038: {
                        this.report(string);
                        n4 = (n3 | n2) ^ 0x4B42888;
                        continue block7;
                    }
                    case -1344790464: {
                        break;
                    }
                    case -1147217334: {
                        return;
                    }
                    case -78684555: {
                        n5 ^= n4 ^ 0xD09833F9;
                        n4 = (n3 | n2) ^ 0x4465ACB7;
                        continue block7;
                    }
                    case 1139508457: {
                        n5 ^= n4 ^ 0xD2043EC3;
                        break block8;
                    }
                }
                n4 = (n3 | n2) ^ 0xBC10F214;
                continue;
            }
            n4 = (n3 | n2) ^ 0xBACA5073;
        }
    }

    /*
     * Exception decompiling
     */
    public long tick() {
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
     * Enabled aggressive block sorting
     */
    public int currentPlaneY() {
        int n2 = i & 0xD6EDFC2 ^ 0xB389705D;
        int n3 = 0;
        int n4 = (n2 | 0xD6EDFC2) ^ 0x39C79B24;
        n3 = (n2 | 0xD6EDFC2) ^ 0x3B92069A;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1053374011: {
                    n4 ^= n3 ^ 0xE6D5E48A;
                    n3 = (n2 | 0xD6EDFC2) ^ 0xB28CD5FD;
                    continue block5;
                }
                case 224602658: {
                    return this.a.currentPlaneY();
                }
                case -2072118971: 
            }
            n3 = (n2 | 0xD6EDFC2) ^ 0x7ED9361A;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Set<class_2960> getTrackedBlockIds() {
        int n2 = i & 0x33F787F4 ^ 0x8CF6B251;
        int n3 = 0;
        int n4 = (n2 | 0x33F787F4) ^ 0x1346F313;
        n3 = (n2 | 0x33F787F4) ^ 0x814779CA;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1051774527: {
                    n3 = (n2 | 0x33F787F4) ^ 0x9C06294B;
                    continue block5;
                }
                case -577447426: {
                    return new HashSet<class_2960>((Collection<class_2960>)this.a);
                }
                case 603037374: 
            }
            n4 ^= n3 ^ 0x8CDE1EEA;
            n3 = (n2 | 0x33F787F4) ^ 0x62636E0B;
        }
    }

    /*
     * Unable to fully structure code
     */
    public Set<class_2960> logOnBlockIds() {
        block9: {
            block8: {
                break block9;
lbl1:
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
                        case -602607713: {
                            break block5;
                        }
                        case -1103225495: {
                            return this.a;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | 749700528) ^ -235187610;
                            ** continue;
                            break;
                        }
                        case 1677205004: {
                            var2_3 ^= var3_2 ^ 548861305;
                            break block8;
                        }
                    }
                    break;
                }
                var3_2 = (var1_1 | 749700528) ^ 1310172149;
                ** GOTO lbl1
            }
            var3_2 = (var1_1 | 749700528) ^ -1814978416;
            ** while (true)
        }
        var1_1 = ak.i & 749700528 ^ 636206281;
        var3_2 = 0;
        var2_3 = (var1_1 | 749700528) ^ 1757660795;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void addTarget(class_2248 var1_1, int var2_2) {
        block49: {
            block50: {
                block46: {
                    block51: {
                        block47: {
                            block48: {
                                break block51;
lbl1:
                                // 1 sources

                                while (true) {
                                    var7_5 = (var5_4 | var8_3) ^ -531776155;
                                    break block46;
lbl4:
                                    // 1 sources

                                    while (true) {
                                        var6_7 ^= var7_5 ^ -1968307359;
                                        break block47;
                                        break;
                                    }
                                    break;
                                }
lbl7:
                                // 1 sources

                                while (true) {
                                    var3_6 = class_7923.field_41175.method_10221((Object)var1_1);
                                    ** GOTO lbl111
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var7_5 = (var5_4 | var8_3) ^ -304988038;
                                    ** GOTO lbl87
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    if (this.a.add(var3_6)) break block48;
                                    ** GOTO lbl103
                                    break;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    var7_5 = (var5_4 | var8_3) ^ -1303943721;
                                    break block46;
                                    break;
                                }
lbl19:
                                // 1 sources

                                while (true) {
                                    var6_7 ^= var7_5 ^ 2046648960;
                                    ** GOTO lbl118
                                    break;
                                }
                            }
                            var7_5 = (var5_4 | var8_3) ^ -1565844064;
                            break block46;
                            while (true) {
                                var7_5 = (var5_4 | var8_3) ^ -242556467;
                                break block46;
                                break;
                            }
                        }
                        var7_5 = (var5_4 | var8_3) ^ 1874969151;
                        break block46;
lbl31:
                        // 1 sources

                        while (true) {
                            var7_5 = (var5_4 | var8_3) ^ -1074309663;
                            break block46;
                            break;
                        }
lbl34:
                        // 1 sources

                        while (true) {
                            if (var1_1.method_8389() != class_1802.field_8162) ** continue;
                            ** continue;
                            break;
                        }
lbl37:
                        // 1 sources

                        while (true) {
                            var7_5 = (var5_4 | var8_3) ^ -16406103;
                            ** GOTO lbl97
lbl40:
                            // 1 sources

                            while (true) {
                                var7_5 = (var5_4 | var8_3) ^ 1287743586;
                                ** GOTO lbl97
                                break;
                            }
                            break;
                        }
lbl43:
                        // 1 sources

                        while (true) {
                            var7_5 = (var5_4 | var8_3) ^ -1219450259;
                            ** GOTO lbl87
                            break;
                        }
                    }
                    var8_3 = 267739769;
                    var5_4 = ak.i & 267739769 ^ -707463767;
                    var7_5 = 0;
                    var6_7 = (var5_4 | var8_3) ^ 448829177;
                    ** while (true)
lbl52:
                    // 1 sources

                    while (true) {
                        var6_7 ^= var7_5 ^ -1817445041;
                        break block49;
                        break;
                    }
lbl55:
                    // 1 sources

                    while (true) {
                        var6_7 ^= var7_5 ^ -798590635;
                        ** continue;
                        break;
                    }
lbl58:
                    // 1 sources

                    while (true) {
                        var4_8 = v0;
                        ** GOTO lbl76
                        break;
                    }
                }
lbl62:
                // 2 sources

                block39: while (true) {
                    switch (var7_5) lbl-1000:
                    // 4 sources

                    {
                        default: {
                            continue block39;
                        }
                        case 1734515578: {
                            ** continue;
                        }
                        case -1338755642: {
                            ** continue;
                        }
                        case 1069042332: {
                            ** continue;
                        }
                        case 780080692: {
                            ** continue;
                        }
                        case 1840419374: {
                            ** continue;
                        }
lbl76:
                        // 1 sources

                        var7_5 = (var5_4 | var8_3) ^ 653861803;
                        ** GOTO lbl97
lbl78:
                        // 1 sources

                        while (true) {
                            this.a.add(new gR(ak.sE(var1_1), var4_8, var3_6));
                            ** continue;
                            break;
                        }
                        case 1066497542: {
                            return;
                        }
lbl84:
                        // 2 sources

                        while (true) {
                            var6_7 ^= 1042913419;
                            ** continue;
                            break;
                        }
lbl87:
                        // 3 sources

                        block43: while (true) {
                            switch (var7_5) {
                                default: {
                                    continue block43;
                                }
                                case -692456964: {
                                    ** continue;
                                }
                                case 841463683: {
                                    ** continue;
                                }
                                ** case 1755667860:
lbl96:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
lbl97:
                        // 4 sources

                        block44: while (true) {
                            switch (var7_5) {
                                default: {
                                    continue block44;
                                }
                                case 552623696: {
                                    ** continue;
                                }
lbl103:
                                // 1 sources

                                var7_5 = (var5_4 | var8_3) ^ -229451091;
                                ** GOTO lbl-1000
lbl105:
                                // 1 sources

                                while (true) {
                                    var7_5 = (var5_4 | var8_3) ^ -530284033;
                                    ** GOTO lbl-1000
                                    break;
                                }
                                case 1610785304: {
                                    v0 = class_1802.field_20391;
                                    ** GOTO lbl84
                                }
lbl111:
                                // 1 sources

                                var7_5 = (var5_4 | var8_3) ^ -1198035837;
                                ** GOTO lbl-1000
                                case -1825267813: {
                                    var6_7 ^= var7_5 ^ -1866865956;
                                    break block50;
                                }
                                case -529448501: {
                                    return;
                                }
lbl118:
                                // 1 sources

                                var7_5 = (var5_4 | var8_3) ^ 155977221;
                                ** continue;
                                case -116599726: {
                                    var6_7 ^= var7_5 ^ -2109809919;
                                    break block44;
                                }
                            }
                            break;
                        }
                        ** continue;
                        case 765930836: {
                            var6_7 ^= var7_5 ^ 875013624;
                            ** continue;
                        }
                        case 1053012070: {
                            v0 = var1_1.method_8389();
                            ** continue;
                        }
                        case 2103372377: 
                    }
                    break;
                }
                var6_7 ^= var7_5 ^ -270191749;
                ** while (true)
            }
            var7_5 = (var5_4 | var8_3) ^ 1065662002;
            ** while (true)
        }
        var7_5 = (var5_4 | var8_3) ^ -516536417;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean removeTargetById(class_2960 var1_1) {
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
    @Override
    public az getTargetColor(class_2960 class_29602) {
        int n2 = i & 0x8137B5E9 ^ 0xEA7D849E;
        int n3 = 0;
        int n4 = (n2 | 0x8137B5E9) ^ 0x649F1218;
        n3 = (n2 | 0x8137B5E9) ^ 0x706CDC1F;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -2068053932: {
                    return null;
                }
                case 732657163: {
                    n4 ^= n3 ^ 0x5FE6CE02;
                    n3 = (n2 | 0x8137B5E9) ^ 0x6FC3B5AB;
                    continue block5;
                }
                case -1693226528: 
            }
            n3 = (n2 | 0x8137B5E9) ^ 0xC0D4C3F4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public hL getTargetsGroup() {
        int n2 = i & 0x8FBDE1E1 ^ 0x37972FB7;
        int n3 = 0;
        int n4 = (n2 | 0x8FBDE1E1) ^ 0xEC424324;
        n3 = (n2 | 0x8FBDE1E1) ^ 0x4D51F125;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1832998996: {
                    return this.a;
                }
                case -219275566: {
                    break;
                }
                case -1702631489: {
                    n4 ^= n3 ^ 0xEF1FAD2C;
                    n3 = (n2 | 0x8FBDE1E1) ^ 0xD2FEB7A3;
                    continue block5;
                }
            }
            n3 = (n2 | 0x8FBDE1E1) ^ 0x253C0848;
        }
    }

    /*
     * Unable to fully structure code
     */
    public JsonArray logBlocksToJson() {
        block43: {
            block40: {
                block38: {
                    block47: {
                        block41: {
                            block42: {
                                block44: {
                                    block46: {
                                        block45: {
                                            block39: {
                                                break block45;
lbl1:
                                                // 1 sources

                                                while (true) {
                                                    var5_7 ^= var6_3 ^ -966561724;
                                                    break block38;
                                                    break;
                                                }
lbl4:
                                                // 1 sources

                                                while (true) {
                                                    var5_7 ^= var6_3 ^ -2094485708;
                                                    break block39;
                                                    break;
                                                }
lbl7:
                                                // 1 sources

                                                while (true) {
                                                    var6_3 = (var4_2 | var7_1) ^ 1452326470;
                                                    break block40;
                                                    break;
                                                }
lbl10:
                                                // 1 sources

                                                while (true) {
                                                    var6_3 = (var4_2 | var7_1) ^ 1786678776;
                                                    break block40;
                                                    while (true) {
                                                        var6_3 = (var4_2 | var7_1) ^ -719624227;
                                                        break block41;
                                                        break;
                                                    }
                                                    break;
                                                }
                                            }
                                            var6_3 = (var4_2 | var7_1) ^ -1757714726;
                                            break block46;
lbl19:
                                            // 1 sources

                                            while (true) {
                                                var2_5 = this.a.iterator();
                                                break block42;
                                                break;
                                            }
lbl22:
                                            // 1 sources

                                            while (true) {
                                                var5_7 ^= var6_3 ^ -669882802;
                                                break block43;
                                                break;
                                            }
lbl25:
                                            // 1 sources

                                            while (true) {
                                                var5_7 ^= var6_3 ^ 1662946631;
                                                break block44;
                                                break;
                                            }
lbl28:
                                            // 1 sources

                                            return var1_4;
                                        }
                                        var7_1 = -1796507803;
                                        var4_2 = ak.i & -1796507803 ^ -1307070040;
                                        var6_3 = 0;
                                        break block47;
lbl35:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl37:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl39:
                                        // 1 sources

                                        while (true) {
                                            var6_3 = (var4_2 | var7_1) ^ 1435552942;
                                            break block41;
                                            break;
                                        }
lbl42:
                                        // 1 sources

                                        while (true) {
                                            if (!var2_5.hasNext()) ** continue;
                                            ** continue;
                                            break;
                                        }
                                    }
lbl46:
                                    // 4 sources

                                    block32: while (true) {
                                        switch (var6_3) {
                                            default: {
                                                continue block32;
                                            }
                                            case -1968822631: {
                                                ** continue;
                                            }
                                            case 566530359: {
                                                break block42;
                                            }
                                            case -412879497: {
                                                ** continue;
                                            }
                                            case -1858458069: {
                                                break;
                                            }
                                        }
                                        ** continue;
                                        break;
                                    }
                                }
                                var6_3 = (var4_2 | var7_1) ^ -873512352;
                                break block41;
                                var1_4 = new JsonArray();
                                var5_7 ^= -713846270;
                                ** while (true)
                            }
                            var6_3 = (var4_2 | var7_1) ^ 1795301026;
                            break block41;
lbl68:
                            // 1 sources

                            while (true) {
                                var5_7 ^= var6_3 ^ -837895972;
                                var6_3 = (var4_2 | var7_1) ^ -172332095;
                                break block41;
                                break;
                            }
lbl72:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
lbl75:
                        // 2 sources

                        block35: while (true) {
                            switch (var6_3) {
                                default: {
                                    continue block35;
                                }
                                case -479249597: {
                                    ** continue;
                                }
                                case 1675923504: {
                                    ** continue;
                                }
                                case 2098247053: {
                                    ** continue;
                                }
                                case 1128635436: {
                                    ** continue;
                                }
                                case -570562225: {
                                    ** continue;
                                }
                                ** case 1461566199:
lbl90:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
lbl91:
                        // 1 sources

                        while (true) {
                            var5_7 ^= var6_3 ^ 169687083;
                            ** continue;
                            break;
                        }
                    }
                    var5_7 = (var4_2 | var7_1) ^ -65245973;
                    var6_3 = (var4_2 | var7_1) ^ 573829063;
                    break block40;
                }
                var6_3 = (var4_2 | var7_1) ^ 667277766;
                ** GOTO lbl46
            }
            block37: while (true) {
                switch (var6_3) {
                    default: {
                        continue block37;
                    }
                    case -529577557: {
                        ** continue;
                    }
                    case -1798563798: {
                        ** continue;
                    }
                    ** case -595494379:
lbl111:
                    // 1 sources

                    ** continue;
                }
                break;
            }
            var3_6 = (class_2960)var2_5.next();
            var6_3 = (var4_2 | var7_1) ^ 1012519284;
            ** GOTO lbl46
        }
        var6_3 = (var4_2 | var7_1) ^ -505262822;
        ** while (true)
        var1_4.add(var3_6.toString());
        var6_3 = (var4_2 | var7_1) ^ 1369178778;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public void applyLogBlocksJson(JsonArray var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [35[UNCONDITIONALDOLOOP]], but top level block is 36[UNCONDITIONALDOLOOP]
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
    private static String sE(class_2248 var0) {
        block25: {
            block24: {
                block26: {
                    block23: {
                        var6_1 = 980532202;
                        var5_2 = 571854452;
                        var2_3 = ak.i & 980532202 ^ 2097798587;
                        var4_4 = 0;
                        if (true) ** GOTO lbl22
lbl6:
                        // 1 sources

                        while (true) {
                            var3_6 ^= var4_4 ^ -439987676;
                            break block23;
                            break;
                        }
                        block14: while (true) {
                            block27: {
                                var4_4 = (var2_3 | var6_1) ^ -1363543716;
                                break block27;
lbl12:
                                // 1 sources

                                while (true) {
                                    var1_5 = var0.method_8389();
                                    ** GOTO lbl50
                                    break;
                                }
                            }
lbl16:
                            // 2 sources

                            block16: while (true) {
                                switch (var4_4) lbl-1000:
                                // 2 sources

                                {
                                    default: {
                                        continue block16;
                                    }
                                    case 1183879802: {
                                        ** continue;
                                    }
lbl22:
                                    // 1 sources

                                    var3_6 = (var2_3 | var6_1) ^ -544327195;
                                    continue block14;
lbl24:
                                    // 1 sources

                                    while (true) {
                                        var3_6 ^= var4_4 ^ 475274123;
                                        ** GOTO lbl30
                                        break;
                                    }
lbl27:
                                    // 1 sources

                                    while (var1_5 instanceof class_1747) {
                                        break block24;
                                    }
                                    break block25;
lbl30:
                                    // 1 sources

                                    var4_4 = (var2_3 | var6_1) ^ 1729989221;
lbl31:
                                    // 5 sources

                                    block20: while (true) {
                                        switch (var4_4) lbl-1000:
                                        // 2 sources

                                        {
                                            while (true) {
                                                default: {
                                                    continue block20;
                                                }
                                                break;
                                            }
                                            case -494400049: {
                                                ** continue;
                                            }
                                            case -167105941: {
                                                ** continue;
                                            }
                                            case 342215005: {
                                                ** GOTO lbl27
                                            }
                                            case -766000705: {
                                                var3_6 ^= var4_4 ^ -321032304;
                                                break block14;
                                            }
lbl45:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = (var2_3 | var6_1) ^ 1716682128;
                                                ** GOTO lbl-1000
                                                break;
                                            }
                                            case 669208675: {
                                                return var1_5.method_63680().getString();
                                            }
lbl50:
                                            // 1 sources

                                            var4_4 = (var2_3 | var6_1) ^ -1389478332;
                                            ** continue;
                                            case 422281835: {
                                                var3_6 ^= var4_4 ^ -558834538;
                                                break block26;
                                            }
                                            case -775944537: {
                                                ** continue;
                                            }
                                        }
                                        break;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        var4_4 = (var2_3 | var6_1) ^ 1797011110;
                        ** GOTO lbl31
                        {
                            ** case 409236894:
                        }
lbl60:
                        // 1 sources

                        return class_7923.field_41175.method_10221((Object)var0).method_12832().replace((char)ak.sF((var3_6 | var4_4 ^ var5_2) ^ (var4_4 ^ -968070266), (var2_3 | var4_4 ^ var5_2) ^ ((var3_6 | var4_4 ^ var5_2) ^ (var4_4 ^ -1748631437))), (char)ak.sF((var3_6 | var4_4 ^ var5_2) ^ (var4_4 ^ -968070265), (var2_3 | var4_4 ^ var5_2) ^ ((var3_6 | var4_4 ^ var5_2) ^ (var4_4 ^ -1338874148))));
                    }
                    var4_4 = (var2_3 | var6_1) ^ 1486532504;
                    ** GOTO lbl31
                }
                var4_4 = (var2_3 | var6_1) ^ 971599233;
                ** while (true)
            }
            var4_4 = (var2_3 | var6_1) ^ -1645088204;
            ** GOTO lbl31
        }
        var4_4 = (var2_3 | var6_1) ^ -1988897392;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public int drillSlotSetting() {
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
     * Enabled aggressive block sorting
     */
    public int normalSlotSetting() {
        int n2 = i & 0x391E00A ^ 0x90E6996F;
        int n3 = 0;
        int n4 = (n2 | 0x391E00A) ^ 0xB551815F;
        n3 = (n2 | 0x391E00A) ^ 0x5A373D40;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1523447783: {
                    n4 ^= n3 ^ 0x548EA9E0;
                    n3 = (n2 | 0x391E00A) ^ 0x7D6A8211;
                    continue block5;
                }
                case -291669122: {
                    return Math.round(((Float)this.c.getValue()).floatValue());
                }
                case -910113745: 
            }
            n3 = (n2 | 0x391E00A) ^ 0xC93A0E88;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public int logOffStorageLimit() {
        int n2 = i & 0xA8DAF87A ^ 0x432F266E;
        int n3 = 0;
        int n4 = (n2 | 0xA8DAF87A) ^ 0x666DAF84;
        n3 = (n2 | 0xA8DAF87A) ^ 0x5953657B;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1313915815: {
                    return Math.round(((Float)this.b.getValue()).floatValue());
                }
                case -1297310971: {
                    n3 = (n2 | 0xA8DAF87A) ^ 0x8DD21FB1;
                    continue block5;
                }
                case 1714282959: 
            }
            n4 ^= n3 ^ 0xE0F831D1;
            n3 = (n2 | 0xA8DAF87A) ^ 0x5A50C227;
        }
    }

    /*
     * Exception decompiling
     */
    public Set<hR> countedStorageKinds() {
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
    public boolean logOnPlayer() {
        var1_1 = ak.i & 653919075 ^ 42512161;
        var3_2 = 0;
        if (true) ** GOTO lbl16
        block5: while (true) {
            switch (var3_2) lbl-1000:
            // 4 sources

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
                    var3_2 = (var1_1 | 653919075) ^ 422884066;
                    ** GOTO lbl-1000
                    break;
                }
                case 1070472577: {
                    var2_3 ^= var3_2 ^ -1826705161;
                }
                var3_2 = (var1_1 | 653919075) ^ -1287875036;
                ** GOTO lbl-1000
lbl16:
                // 1 sources

                var2_3 = (var1_1 | 653919075) ^ -1625786387;
                var3_2 = (var1_1 | 653919075) ^ -953685855;
                ** continue;
                case -505591870: {
                    ** continue;
                }
                case -1782171321: 
            }
            break;
        }
        return (Boolean)this.a.getValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean autoToolSelection() {
        int n2 = i & 0x69828607 ^ 0x4943ACE;
        int n3 = 0;
        int n4 = (n2 | 0x69828607) ^ 0xF6289420;
        n3 = (n2 | 0x69828607) ^ 0x4F52B2CB;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 583273476: {
                    break;
                }
                case -417644059: {
                    return true;
                }
                case 823582771: {
                    n4 ^= n3 ^ 0x44FD965;
                    n3 = (n2 | 0x69828607) ^ 0x8A8DFF2A;
                    continue block5;
                }
            }
            n3 = (n2 | 0x69828607) ^ 0x5C805EFC;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public float minToolDurability() {
        int n2 = i & 0x98125B92 ^ 0xC2DBEB54;
        int n3 = 0;
        int n4 = (n2 | 0x98125B92) ^ 0xE779620D;
        n3 = (n2 | 0x98125B92) ^ 0xAB71985B;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1906992013: {
                    n3 = (n2 | 0x98125B92) ^ 0xBBEC2166;
                    continue block5;
                }
                case 1631050416: {
                    n4 ^= n3 ^ 0x6F59D411;
                    n3 = (n2 | 0x98125B92) ^ 0x16168401;
                    continue block5;
                }
                case -858947625: 
            }
            break;
        }
        return 10.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean pauseWhenToolMissing() {
        int n2 = i & 0x9A206A99 ^ 0x2D6AC920;
        int n3 = 0;
        int n4 = (n2 | 0x9A206A99) ^ 0x5260DA8;
        n3 = (n2 | 0x9A206A99) ^ 0x74103F00;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -286036099: {
                    return true;
                }
                case -585131510: {
                    n4 ^= n3 ^ 0x75E2E47A;
                    n3 = (n2 | 0x9A206A99) ^ 0x519984C4;
                    continue block5;
                }
                case -881142599: 
            }
            n3 = (n2 | 0x9A206A99) ^ 0x627571B3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean enableDrill() {
        int n2 = i & 0xA52BEB8C ^ 0xB2208E51;
        int n3 = 0;
        int n4 = (n2 | 0xA52BEB8C) ^ 0xF2C43EE7;
        n3 = (n2 | 0xA52BEB8C) ^ 0xDC525BB5;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 797314512: {
                    n4 ^= n3 ^ 0x5A5430B3;
                    n3 = (n2 | 0xA52BEB8C) ^ 0x916BF031;
                    continue block5;
                }
                case 1803138152: {
                    n3 = (n2 | 0xA52BEB8C) ^ 0x98ADE20D;
                    continue block5;
                }
                case 641736684: 
            }
            break;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean safeDrillOnly() {
        int n2 = i & 0xED978144 ^ 0xF8FC0F80;
        int n3 = 0;
        int n4 = (n2 | 0xED978144) ^ 0x3C825BED;
        n3 = (n2 | 0xED978144) ^ 0xD8AB737F;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 9700009: {
                    return true;
                }
                case -1369863107: {
                    n4 ^= n3 ^ 0xE7809AD4;
                    n3 = (n2 | 0xED978144) ^ 0xFD6B8D6D;
                    continue block5;
                }
                case 626326715: 
            }
            n3 = (n2 | 0xED978144) ^ 0x53A603F9;
        }
    }

    /*
     * Unable to fully structure code
     */
    public float miningTimeoutSeconds() {
        block9: {
            break block9;
            {
                var3_2 = (var1_1 | 924676237) ^ -1684115972;
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
                        case -1400792991: {
                            var2_3 ^= var3_2 ^ 1560409904;
                            ** GOTO lbl13
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | 924676237) ^ 60857773;
                            ** GOTO lbl-1000
                            break;
                        }
lbl13:
                        // 1 sources

                        var3_2 = (var1_1 | 924676237) ^ -573384169;
                        ** continue;
                        case 884959280: {
                            continue block5;
                        }
                        case -355651702: {
                            return 8.0f;
                        }
                    }
                    break;
                }
            }
        }
        var1_1 = ak.i & 924676237 ^ 353813789;
        var3_2 = 0;
        var2_3 = (var1_1 | 924676237) ^ 1384711937;
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean excavationVerification() {
        int n2 = i & 0xB32B231A ^ 0x43662E92;
        int n3 = 0;
        int n4 = (n2 | 0xB32B231A) ^ 0x3F8966B5;
        n3 = (n2 | 0xB32B231A) ^ 0x146DCA98;
        boolean bl2 = true;
        block5: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n3 = (n2 | 0xB32B231A) ^ 0x6C8693C;
            }
            block6: while (true) {
                switch (n3) {
                    case 1867623383: {
                        n4 ^= n3 ^ 0x40595A51;
                        continue block5;
                    }
                    case -419240702: {
                        n3 = (n2 | 0xB32B231A) ^ 0x9C3E844D;
                    }
                    default: {
                        continue block6;
                    }
                    case -173586778: 
                }
                break;
            }
            break;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String startingHeightMode() {
        int n2 = i & 0x3599711D ^ 0x80417B7D;
        int n3 = 0;
        int n4 = (n2 | 0x3599711D) ^ 0x5842A15F;
        n3 = (n2 | 0x3599711D) ^ 0x63DBF31E;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -704477085: {
                    n3 = (n2 | 0x3599711D) ^ 0x360F912F;
                    continue block5;
                }
                case -2083067310: {
                    n4 ^= n3 ^ 0xD9173E9E;
                    n3 = (n2 | 0x3599711D) ^ 0x3D942A6E;
                    continue block5;
                }
                case -2008198893: 
            }
            break;
        }
        return k;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public int maxVerticalDeviation() {
        int n2 = i & 0x309388D8 ^ 0x4680F14E;
        int n3 = 0;
        int n4 = (n2 | 0x309388D8) ^ 0x5D441D27;
        n3 = (n2 | 0x309388D8) ^ 0x9A6343DF;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -319768063: {
                    n3 = (n2 | 0x309388D8) ^ 0xC474F21E;
                    continue block5;
                }
                case -1293481024: {
                    n4 ^= n3 ^ 0xEFCC95C4;
                    n3 = (n2 | 0x309388D8) ^ 0xEAC82AD;
                    continue block5;
                }
                case 2017426291: 
            }
            break;
        }
        return 4;
    }

    private static int sF(int n2, int n3) {
        int n4 = 801237463;
        int n5 = 98665547;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x4A304C2B)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0x2FE1C262;
        n6 ^= (n5 | n4) ^ 0x2FE1958E;
        n6 += (n5 | n4) ^ 0x2FE18C28;
        n6 += (n5 | n4) ^ 0x2FE1E091;
        n6 -= (n5 | n4) ^ 0x2FE1CCB3;
        n6 -= (n5 | n4) ^ 0x2FE1CA6F;
        return n6 ^= (n5 | n4) ^ 0x2FE1CC2C;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int maxDetourDistance() {
        int n2 = i & 0xDFD62587 ^ 0x7AF95029;
        int n3 = 0;
        int n4 = (n2 | 0xDFD62587) ^ 0xC72C77CF;
        n3 = (n2 | 0xDFD62587) ^ 0x266BB8F0;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -644559521: {
                    n3 = (n2 | 0xDFD62587) ^ 0xE401BA83;
                    continue block5;
                }
                case 469684012: {
                    n4 ^= n3 ^ 0x112BC2A1;
                    n3 = (n2 | 0xDFD62587) ^ 0xB55F95CF;
                    continue block5;
                }
                case 1252057184: 
            }
            break;
        }
        return ak.sF((n4 | n3 ^ 0x9576C5E7) ^ (n3 ^ 0xD0A76E7F), (n2 | n3 ^ 0x9576C5E7) ^ ((n4 | n3 ^ 0x9576C5E7) ^ (n3 ^ 0x169F16A8)));
    }

    /*
     * Enabled aggressive block sorting
     */
    public int planDistance() {
        int n2 = i & 0xA6B554EE ^ 0xB5A53468;
        int n3 = 0;
        int n4 = (n2 | 0xA6B554EE) ^ 0x2B193C97;
        n3 = (n2 | 0xA6B554EE) ^ 0x9355A9;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1390535839: {
                    n4 ^= n3 ^ 0xCC31761E;
                    n3 = (n2 | 0xA6B554EE) ^ 0xD7660999;
                    continue block5;
                }
                case -1222237881: {
                    n3 = (n2 | 0xA6B554EE) ^ 0x1AAB6F8F;
                    continue block5;
                }
                case 1624472951: 
            }
            break;
        }
        return ak.sF((n4 | n3 ^ 0xC6662999) ^ (n3 ^ 0xFAB5A968), (n2 | n3 ^ 0xC6662999) ^ ((n4 | n3 ^ 0xC6662999) ^ (n3 ^ 0x27EE164C)));
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean allowSmallDrops() {
        int n2 = i & 0xED4396C7 ^ 0x4895E8A4;
        int n3 = 0;
        int n4 = (n2 | 0xED4396C7) ^ 0xBD6E7D0C;
        n3 = (n2 | 0xED4396C7) ^ 0x5DB084BB;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1607909562: {
                    n4 ^= n3 ^ 0xCFF537AD;
                    n3 = (n2 | 0xED4396C7) ^ 0xD651FAF3;
                    continue block5;
                }
                case 998638612: {
                    return true;
                }
                case -1335395748: 
            }
            n3 = (n2 | 0xED4396C7) ^ 0xB2013E5D;
        }
    }

    /*
     * Unable to fully structure code
     */
    public int maxDropBlocks() {
        var1_1 = ak.i & 2005124398 ^ -1234767207;
        var3_2 = 0;
        if (true) ** GOTO lbl17
        block5: while (true) {
            var3_2 = (var1_1 | 2005124398) ^ -1989367741;
            if (true) ** GOTO lbl10
            block6: while (true) {
                var2_3 ^= var3_2 ^ 1062315384;
                var3_2 = (var1_1 | 2005124398) ^ -473888127;
lbl10:
                // 2 sources

                block7: while (true) {
                    switch (var3_2) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block7;
                            }
                            break;
                        }
                        case 2123063292: {
                            continue block6;
                        }
lbl17:
                        // 1 sources

                        var2_3 = (var1_1 | 2005124398) ^ 986562689;
                        var3_2 = (var1_1 | 2005124398) ^ 778750638;
                        ** continue;
                        case -645055215: {
                            continue block5;
                        }
                        case 338099518: {
                            return 2;
                        }
                    }
                    break;
                }
                break;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean allowClimbing() {
        int n2 = i & 0x90BC32E0 ^ 0xAE0528F6;
        int n3 = 0;
        int n4 = (n2 | 0x90BC32E0) ^ 0xEB9BC288;
        n3 = (n2 | 0x90BC32E0) ^ 0xEF24684C;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -943232086: {
                    n4 ^= n3 ^ 0x8374475D;
                    n3 = (n2 | 0x90BC32E0) ^ 0xE21724A0;
                    continue block5;
                }
                case 1369002682: {
                    n3 = (n2 | 0x90BC32E0) ^ 0x797A515C;
                    continue block5;
                }
                case 1554652758: 
            }
            break;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean allowBlockPlacement() {
        int n2 = i & 0xB4651720 ^ 0xBD6403C;
        int n3 = 0;
        int n4 = (n2 | 0xB4651720) ^ 0x5C2AA715;
        n3 = (n2 | 0xB4651720) ^ 0x8C883213;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1568330100: {
                    n4 ^= n3 ^ 0xEF748DE4;
                    n3 = (n2 | 0xB4651720) ^ 0x7F64FA9C;
                    continue block5;
                }
                case 863986991: {
                    n3 = (n2 | 0xB4651720) ^ 0xE28D8648;
                    continue block5;
                }
                case -1064063584: 
            }
            break;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public boolean allowSprinting() {
        var1_1 = ak.i & -847168045 ^ -2110079732;
        var3_2 = 0;
        if (true) ** GOTO lbl19
        block5: while (true) {
            switch (var3_2) lbl-1000:
            // 4 sources

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
                    var3_2 = (var1_1 | -847168045) ^ -1397795569;
                    ** GOTO lbl-1000
                    break;
                }
                case -614577214: {
                    ** GOTO lbl17
                }
lbl14:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | -847168045) ^ 350615069;
                    ** GOTO lbl-1000
                    break;
                }
lbl17:
                // 1 sources

                var3_2 = (var1_1 | -847168045) ^ 1979812320;
                ** continue;
lbl19:
                // 1 sources

                var2_3 = (var1_1 | -847168045) ^ -1783515836;
                ** continue;
                case 1662314704: {
                    return true;
                }
                case -1178979265: 
            }
            break;
        }
        var2_3 ^= var3_2 ^ 266334541;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean returnToOriginalHeight() {
        int n2 = i & 0xEE087557 ^ 0xF32E56B2;
        int n3 = 0;
        int n4 = (n2 | 0xEE087557) ^ 0x38814368;
        n3 = (n2 | 0xEE087557) ^ 0xA003C0FD;
        block5: while (true) {
            switch (n3) {
                case 947510402: {
                    return true;
                }
                case 378894591: {
                    n4 ^= n3 ^ 0x3D67CB68;
                    n3 = (n2 | 0xEE087557) ^ 0xC757AB75;
                }
                default: {
                    continue block5;
                }
                case 1596831498: 
            }
            n3 = (n2 | 0xEE087557) ^ 0xE9BB0F08;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public float pathVariation() {
        int n2 = i & 0x577A4AE4 ^ 0x4189274E;
        int n3 = 0;
        int n4 = (n2 | 0x577A4AE4) ^ 0xEADA4BBA;
        n3 = (n2 | 0x577A4AE4) ^ 0xEF0AF804;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1988091475: {
                    n4 ^= n3 ^ 0xA78FF4A9;
                    n3 = (n2 | 0x577A4AE4) ^ 0x587D6C53;
                    continue block5;
                }
                case 260441021: {
                    return 0.0f;
                }
                case -1192126486: 
            }
            n3 = (n2 | 0x577A4AE4) ^ 0x2184B1BD;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean avoidLava() {
        int n2 = i & 0x8BFEFEF9 ^ 0x60A60950;
        int n3 = 0;
        int n4 = (n2 | 0x8BFEFEF9) ^ 0x5B59ADA1;
        n3 = (n2 | 0x8BFEFEF9) ^ 0x3D6CF922;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1786061190: {
                    n4 ^= n3 ^ 0x3B0C9A23;
                    n3 = (n2 | 0x8BFEFEF9) ^ 0xD4532176;
                    continue block5;
                }
                case 1068359311: {
                    return true;
                }
                case -695073061: 
            }
            n3 = (n2 | 0x8BFEFEF9) ^ 0x7E742183;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean avoidFallingBlocks() {
        int n2 = i & 0xF8B6322E ^ 0x4CB74669;
        int n3 = 0;
        int n4 = (n2 | 0xF8B6322E) ^ 0x31A8C605;
        n3 = (n2 | 0xF8B6322E) ^ 0x870C70A1;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 2100637963: {
                    n4 ^= n3 ^ 0xDCD9442F;
                    n3 = (n2 | 0xF8B6322E) ^ 0x40C34A36;
                    continue block5;
                }
                case -1133233063: {
                    return true;
                }
                case 2075854542: 
            }
            n3 = (n2 | 0xF8B6322E) ^ 0x81824764;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean avoidDangerousDrops() {
        int n2 = i & 0x94D7231F ^ 0xFEC8B917;
        int n3 = 0;
        int n4 = (n2 | 0x94D7231F) ^ 0x7544778F;
        n3 = (n2 | 0x94D7231F) ^ 0xDDEDFEF5;
        block5: while (true) {
            switch (n3) {
                case -1892818123: {
                    n4 ^= n3 ^ 0x60BB95D9;
                    n3 = (n2 | 0x94D7231F) ^ 0x2A14B270;
                }
                default: {
                    continue block5;
                }
                case 590497258: {
                    break;
                }
                case -724891281: {
                    return true;
                }
            }
            n3 = (n2 | 0x94D7231F) ^ 0x71F2582A;
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean pauseOnUnknownTerrain() {
        block8: {
            var1_1 = ak.i & 673877799 ^ -2015691117;
            var3_2 = 0;
            ** GOTO lbl16
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
                    case -1646792454: {
                        break block5;
                    }
lbl11:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | 673877799) ^ -1345069647;
                        ** continue;
                        break;
                    }
                    case 2695686: {
                        return true;
                    }
lbl16:
                    // 1 sources

                    var2_3 = (var1_1 | 673877799) ^ -1034808095;
                    break block8;
                }
                break;
            }
            var3_2 = (var1_1 | 673877799) ^ -874137245;
            ** GOTO lbl4
            {
                ** case 1679771348:
            }
lbl21:
            // 1 sources

            var2_3 ^= var3_2 ^ 1356025642;
            ** while (true)
        }
        var3_2 = (var1_1 | 673877799) ^ 841813837;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public int maxRecoveryAttempts() {
        block10: {
            break block10;
lbl1:
            // 1 sources

            return 5;
        }
        var1_1 = ak.i & 1219742612 ^ 2022286654;
        var3_2 = 0;
        var2_3 = (var1_1 | 1219742612) ^ -148810012;
        if (true) ** GOTO lbl21
        block6: while (true) {
            switch (var3_2) lbl-1000:
            // 4 sources

            {
                while (true) {
                    default: {
                        continue block6;
                    }
                    break;
                }
                case 1471628054: {
                    ** continue;
                }
lbl15:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | 1219742612) ^ 789359784;
                    ** GOTO lbl-1000
                    break;
                }
lbl18:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | 1219742612) ^ -1791484330;
                    ** GOTO lbl-1000
                    break;
                }
lbl21:
                // 1 sources

                var3_2 = (var1_1 | 1219742612) ^ 725069874;
                ** continue;
                case -310119960: {
                    var2_3 ^= var3_2 ^ 1372570371;
                    ** continue;
                }
                case 1401708428: 
            }
            break;
        }
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean useRotationEngine() {
        int n2 = i & 0xF707EE74 ^ 0x35CCC588;
        int n3 = 0;
        int n4 = (n2 | 0xF707EE74) ^ 0x59E494C2;
        n3 = (n2 | 0xF707EE74) ^ 0xC3EE1906;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 496315359: {
                    return true;
                }
                case 1807337560: {
                    n4 ^= n3 ^ 0x6FBB30BA;
                    n3 = (n2 | 0xF707EE74) ^ 0xEA5AC423;
                    continue block5;
                }
                case 874641146: 
            }
            n3 = (n2 | 0xF707EE74) ^ 0x9C7627A4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public double rotationSpeed() {
        int n2 = i & 0xA7F678B3 ^ 0x3CE32A82;
        int n3 = 0;
        int n4 = (n2 | 0xA7F678B3) ^ 0x1C42A23B;
        n3 = (n2 | 0xA7F678B3) ^ 0x845BB1D6;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1282464051: {
                    n4 ^= n3 ^ 0xE629DCAA;
                    n3 = (n2 | 0xA7F678B3) ^ 0x878CA1C1;
                    continue block5;
                }
                case 1001180005: {
                    n3 = (n2 | 0xA7F678B3) ^ 0xF387A380;
                    continue block5;
                }
                case 947641202: 
            }
            break;
        }
        return 420.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public float aimVariation() {
        int n2 = i & 0x9CEE826 ^ 0xCDF21009;
        int n3 = 0;
        int n4 = (n2 | 0x9CEE826) ^ 0x24EC2248;
        n3 = (n2 | 0x9CEE826) ^ 0xA86319C3;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -260077452: {
                    return 0.02f;
                }
                case -1723966990: {
                    n4 ^= n3 ^ 0xFE5B4A2A;
                    n3 = (n2 | 0x9CEE826) ^ 0x3D81705B;
                    continue block5;
                }
                case 1704845804: 
            }
            n3 = (n2 | 0x9CEE826) ^ 0x54C0A1DD;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public int aimVariationInterval() {
        int n2 = i & 0xF39C2321 ^ 0xEBE18C74;
        int n3 = 0;
        int n4 = (n2 | 0xF39C2321) ^ 0xC507F946;
        n3 = (n2 | 0xF39C2321) ^ 0x4DC4135E;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1237730261: {
                    n3 = (n2 | 0xF39C2321) ^ 0xA2CD9B4;
                    continue block5;
                }
                case -237930815: {
                    n4 ^= n3 ^ 0xD3978BBC;
                    n3 = (n2 | 0xF39C2321) ^ 0x72782526;
                    continue block5;
                }
                case -1987737005: 
            }
            break;
        }
        return ak.sF((n4 | n3 ^ 0x7A19A972) ^ (n3 ^ 0x13E880CE), (n2 | n3 ^ 0x7A19A972) ^ ((n4 | n3 ^ 0x7A19A972) ^ (n3 ^ 0xE44E0D73)));
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lookAround() {
        int n2 = i & 0xC8843393 ^ 0x640CAA4A;
        int n3 = 0;
        int n4 = (n2 | 0xC8843393) ^ 0xBC657056;
        n3 = (n2 | 0xC8843393) ^ 0x793B3F0D;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1783135018: {
                    n3 = (n2 | 0xC8843393) ^ 0x15F396F8;
                    continue block5;
                }
                case -1927146353: {
                    return false;
                }
                case -109105885: 
            }
            n4 ^= n3 ^ 0x4D903CC9;
            n3 = (n2 | 0xC8843393) ^ 0x61AEAF54;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean renderDangerPlates() {
        int n2 = i & 0x51624A0A ^ 0x6F475EA4;
        int n3 = 0;
        int n4 = (n2 | 0x51624A0A) ^ 0x5759F91;
        n3 = (n2 | 0x51624A0A) ^ 0x9AADD7F0;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 2066617598: {
                    n4 ^= n3 ^ 0x8D98918F;
                    n3 = (n2 | 0x51624A0A) ^ 0x62C33CB7;
                    continue block5;
                }
                case 497312281: {
                    return true;
                }
                case -439711394: 
            }
            n3 = (n2 | 0x51624A0A) ^ 0x4494A50;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public int dangerPlateColour() {
        var4_1 = -1169620803;
        var1_2 = ak.i & -1169620803 ^ 931446739;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -895199012;
        var3_3 = (var1_2 | var4_1) ^ 1736834171;
        block14: while (true) {
            switch (var3_3) {
                default: {
                    continue block14;
                }
                case 1225622125: {
                    ** GOTO lbl21
                }
                case -666352764: {
                    ** GOTO lbl37
                }
                case 1491574635: {
                    ** GOTO lbl30
                }
                case 1570718532: {
                    var2_4 ^= var3_3 ^ 478977304;
                    ** GOTO lbl28
                }
                case 2106980839: {
                    var2_4 ^= var3_3 ^ 1322772555;
lbl21:
                    // 2 sources

                    var3_3 = (var1_2 | var4_1) ^ -416669548;
                    continue block14;
                }
                case -89686832: {
                    var3_3 = (var1_2 | var4_1) ^ -609831894;
                    continue block14;
                }
                case -1363829279: {
                    var2_4 ^= var3_3 ^ -1191052883;
lbl28:
                    // 2 sources

                    var3_3 = (var1_2 | var4_1) ^ 1164624687;
                    continue block14;
                }
lbl30:
                // 1 sources

                switch (var2_4) {
                    case 671089964: {
                        var3_3 = (var1_2 | var4_1) ^ -1034402280;
                        continue block14;
                    }
                    case 1969874723: {
                        var3_3 = (var1_2 | var4_1) ^ 293085726;
                        continue block14;
                    }
lbl37:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -155173486;
                    continue block14;
                }
                var3_3 = (var1_2 | var4_1) ^ -497877829;
                continue block14;
                case 1684736981: 
            }
            break;
        }
        return ak.sF((var2_4 | var3_3 ^ -568194200) ^ (var3_3 ^ -77125159), (var1_2 | var3_3 ^ -568194200) ^ ((var2_4 | var3_3 ^ -568194200) ^ (var3_3 ^ 1610320017)));
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
     * Enabled aggressive block sorting
     */
    public float dangerPlateOpacity() {
        int n2 = i & 0x5276F092 ^ 0xA93AB039;
        int n3 = 0;
        int n4 = (n2 | 0x5276F092) ^ 0x9B35752E;
        n3 = (n2 | 0x5276F092) ^ 0xCC3A8222;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -69290326: {
                    return 0.35f;
                }
                case 927232665: {
                    n3 = (n2 | 0x5276F092) ^ 0xD0AAC095;
                    continue block5;
                }
                case 735326254: 
            }
            n4 ^= n3 ^ 0xFFED8C9F;
            n3 = (n2 | 0x5276F092) ^ 0xA04611;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean colourByHazardType() {
        int n2 = i & 0x8801B2C5 ^ 0x834EE33D;
        int n3 = 0;
        int n4 = (n2 | 0x8801B2C5) ^ 0x15C5C06C;
        n3 = (n2 | 0x8801B2C5) ^ 0xE32C4F24;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1751366873: {
                    n3 = (n2 | 0x8801B2C5) ^ 0xD5E9C3A9;
                    continue block5;
                }
                case -465615382: {
                    return false;
                }
                case 1587949652: 
            }
            n4 ^= n3 ^ 0x3F9F823;
            n3 = (n2 | 0x8801B2C5) ^ 0x6F70B617;
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean renderUnknownTerrain() {
        var1_1 = ak.i & -1344060386 ^ 1857563755;
        var3_2 = 0;
        var2_3 = (var1_1 | -1344060386) ^ -385189441;
        ** GOTO lbl17
lbl5:
        // 1 sources

        block5: while (true) {
            var3_2 = (var1_1 | -1344060386) ^ 680698041;
lbl7:
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
                    case -949367610: {
                        var2_3 ^= var3_2 ^ -1502210347;
                        break block5;
                    }
                    case -2062034704: {
                        return true;
                    }
lbl17:
                    // 1 sources

                    var3_2 = (var1_1 | -1344060386) ^ -629531539;
                    ** continue;
                }
                break;
            }
            break;
        }
        var3_2 = (var1_1 | -1344060386) ^ 1793897615;
        ** while (true)
        {
            ** case 897675282:
        }
lbl22:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean renderPlannedRoute() {
        int n2 = i & 0x6DE861C0 ^ 0x75AA5CED;
        int n3 = 0;
        int n4 = (n2 | 0x6DE861C0) ^ 0xA87745C2;
        n3 = (n2 | 0x6DE861C0) ^ 0xA5BD44B9;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1254924160: {
                    n4 ^= n3 ^ 0x131BD5BE;
                    n3 = (n2 | 0x6DE861C0) ^ 0xEA49DE30;
                    continue block5;
                }
                case -1750883363: {
                    return true;
                }
                case -665372332: 
            }
            n3 = (n2 | 0x6DE861C0) ^ 0x3726E26D;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public int routeLineColour() {
        int n2 = i & 0x907E8D98 ^ 0xA0F1E97A;
        int n3 = 0;
        int n4 = (n2 | 0x907E8D98) ^ 0xBEF82901;
        n3 = (n2 | 0x907E8D98) ^ 0xC1395766;
        block5: while (true) {
            switch (n3) {
                case 1908849308: {
                    n3 = (n2 | 0x907E8D98) ^ 0x264D8A64;
                }
                default: {
                    continue block5;
                }
                case -1766692962: {
                    n4 ^= n3 ^ 0x53E905C2;
                    n3 = (n2 | 0x907E8D98) ^ 0x620BC225;
                    continue block5;
                }
                case -755748897: 
            }
            break;
        }
        return ak.sF((n4 | n3 ^ 0x428AA247) ^ (n3 ^ 0x6C5B219C), (n2 | n3 ^ 0x428AA247) ^ ((n4 | n3 ^ 0x428AA247) ^ (n3 ^ 0x12C3E958)));
    }

    /*
     * Exception decompiling
     */
    public float routeLineWidth() {
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean renderTentativeRoute() {
        var1_1 = ak.i & -1534167201 ^ 1327060816;
        var3_2 = 0;
        var2_3 = (var1_1 | -1534167201) ^ 1524440818;
        var3_2 = (var1_1 | -1534167201) ^ 1263125705;
        if (true) ** GOTO lbl-1000
        block5: while (true) {
            switch (var3_2) lbl-1000:
            // 2 sources

            {
                default: {
                    continue block5;
                }
                case -1529433194: {
                    var3_2 = (var1_1 | -1534167201) ^ -494487086;
                    continue block5;
                }
                case 219795085: {
                    var2_3 ^= var3_2 ^ 1451841105;
                    var3_2 = (var1_1 | -1534167201) ^ 556674738;
                    continue block5;
                }
                case -827237907: 
            }
            break;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public boolean renderCompletedRoute() {
        var1_1 = ak.i & -1757936036 ^ -1408010245;
        var3_2 = 0;
        if (true) ** GOTO lbl13
        block5: while (true) {
            switch (var3_2) lbl-1000:
            // 4 sources

            {
                while (true) {
                    default: {
                        continue block5;
                    }
                    break;
                }
                case 1624604849: {
                    var2_3 ^= var3_2 ^ -325430249;
                    var3_2 = (var1_1 | -1757936036) ^ 227068042;
                    ** GOTO lbl-1000
                }
lbl13:
                // 1 sources

                var2_3 = (var1_1 | -1757936036) ^ -18789349;
                var3_2 = (var1_1 | -1757936036) ^ 836287173;
                ** GOTO lbl-1000
lbl16:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | -1757936036) ^ -537987250;
                    ** continue;
                    break;
                }
                case -1897673414: {
                    ** continue;
                }
                case -1296842891: {
                    return false;
                }
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean renderMiningTarget() {
        var1_1 = ak.i & -1251858754 ^ -1607565125;
        var3_2 = 0;
        if (true) ** GOTO lbl13
        block5: while (true) {
            switch (var3_2) lbl-1000:
            // 4 sources

            {
                default: {
                    continue block5;
                }
                case 569042924: {
                    return true;
                }
lbl10:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | -1251858754) ^ -2015899248;
                    ** GOTO lbl-1000
                    break;
                }
lbl13:
                // 1 sources

                var2_3 = (var1_1 | -1251858754) ^ -1191219411;
                var3_2 = (var1_1 | -1251858754) ^ -2002822365;
                ** GOTO lbl-1000
                case 851015471: {
                    var2_3 ^= var3_2 ^ 1052328229;
                    var3_2 = (var1_1 | -1251858754) ^ -1803271853;
                    ** GOTO lbl-1000
                }
                case 1039269276: 
            }
            break;
        }
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public boolean renderTargetHeight() {
        block8: {
            break block8;
lbl1:
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
                    case 131611909: {
                        var2_3 ^= var3_2 ^ -1546056029;
                        break block5;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | 68842863) ^ 2004408628;
                        ** continue;
                        break;
                    }
                    case -143380826: {
                        return true;
                    }
                }
                break;
            }
            var3_2 = (var1_1 | 68842863) ^ 1793774537;
            ** GOTO lbl1
            {
                ** case -354016165:
            }
lbl17:
            // 1 sources

            var3_2 = (var1_1 | 68842863) ^ -1706639254;
            ** while (true)
        }
        var1_1 = ak.i & 68842863 ^ -1651709590;
        var3_2 = 0;
        var2_3 = (var1_1 | 68842863) ^ -1526162874;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public boolean debugMessages() {
        block9: {
            block8: {
                break block8;
lbl1:
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
                        case 1347816698: {
                            break block5;
                        }
                        case -1804395372: {
                            return false;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | 102464711) ^ -22449627;
                            ** continue;
                            break;
                        }
                    }
                    break;
                }
                var3_2 = (var1_1 | 102464711) ^ -551164658;
                ** GOTO lbl1
                {
                    ** case 1910152145:
                }
lbl16:
                // 1 sources

                var2_3 ^= var3_2 ^ 1781115584;
                break block9;
            }
            var1_1 = ak.i & 102464711 ^ -1360177637;
            var3_2 = 0;
            var2_3 = (var1_1 | 102464711) ^ -2043589134;
            ** while (true)
        }
        var3_2 = (var1_1 | 102464711) ^ 982278731;
        ** while (true)
    }
}

