/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.minecraft.class_1074
 *  net.minecraft.class_1802
 *  net.minecraft.class_1923
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 *  net.minecraft.class_2818
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_4588
 *  net.minecraft.class_638
 *  net.minecraft.class_7923
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package z.r;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_1074;
import net.minecraft.class_1802;
import net.minecraft.class_1923;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4588;
import net.minecraft.class_638;
import net.minecraft.class_7923;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import z.r.D;
import z.r.aE;
import z.r.az;
import z.r.cp;
import z.r.dA;
import z.r.gF;
import z.r.gP;
import z.r.gR;
import z.r.hL;
import z.r.hU;
import z.r.ke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class gb
extends gF
implements D {
    private static final int a;
    private final gP a;
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String s;
    private static final double a;
    private static final int b;
    private final LongOpenHashSet a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    public static final int i;
    private static volatile gb a;
    private static final /* synthetic */ String k;
    private final Long2ObjectOpenHashMap<Long2ObjectOpenHashMap<class_2248>> a;
    private static final /* synthetic */ String e;
    private final ArrayList<cp> a;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final float a;
    private final HashMap<class_2248, hU> a;
    private static final /* synthetic */ String h;
    private final hL a;
    private final aE a;
    private static final int c;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private final ArrayDeque<Long> a;
    private final gP b;
    private static final /* synthetic */ String l;
    private static final double b;
    private static final int[] a;
    private static final /* synthetic */ String m;
    private static final long a;
    private static final /* synthetic */ String n;
    private final ke a;
    private final gP c;
    private static final int d;
    private final HashSet<class_2960> a;
    private static final /* synthetic */ String o;
    private static final int e;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private int f;
    private static final /* synthetic */ String r;
    private static final int g;

    private static int Ve(int n2, int n3) {
        int n4 = 1821240307;
        int n5 = 1408685250;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xFB0316B6)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0x7FFF882A;
        n6 -= (n5 | n4) ^ 0x7FFFC307;
        n6 ^= (n5 | n4) ^ 0x7FFFEAD2;
        n6 += (n5 | n4) ^ 0x7FFF620F;
        n6 += (n5 | n4) ^ 0x7FFF289A;
        n6 ^= (n5 | n4) ^ 0x7FFF1D15;
        n6 -= (n5 | n4) ^ 0x7FFFF320;
        n6 ^= (n5 | n4) ^ 0x7FFF6943;
        n6 -= (n5 | n4) ^ 0x7FFF263F;
        return n6 += (n5 | n4) ^ 0x7FFF5F0F;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static gb getInstanceStatic() {
        int n2 = i & 0xDC5EE394 ^ 0x12036586;
        int n3 = 0;
        int n4 = (n2 | 0xDC5EE394) ^ 0x41C23877;
        n3 = (n2 | 0xDC5EE394) ^ 0x406430E3;
        block5: while (true) {
            switch (n3) {
                case -1303029566: {
                    return a;
                }
                case 209115530: {
                    n4 ^= n3 ^ 0xF573FBFE;
                    n3 = (n2 | 0xDC5EE394) ^ 0x6C0ABF54;
                }
                default: {
                    continue block5;
                }
                case -1640245387: 
            }
            n3 = (n2 | 0xDC5EE394) ^ 0xD2293E1C;
        }
    }

    /*
     * Exception decompiling
     */
    public void onClientChunkBlockEdited(class_2818 var1_1, class_2338 var2_2, class_2680 var3_3, class_2680 var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [91[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private boolean Vf(class_2818 var1_1) {
        block31: {
            block30: {
                block32: {
                    block29: {
                        break block32;
lbl1:
                        // 1 sources

                        block15: while (true) {
                            var5_4 = (var3_3 | var6_2) ^ -2106282520;
lbl3:
                            // 3 sources

                            block16: while (true) {
                                switch (var5_4) lbl-1000:
                                // 6 sources

                                {
                                    default: {
                                        continue block16;
                                    }
                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ -1247025689;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl10:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ -1976790933;
                                        break block29;
                                        break;
                                    }
lbl13:
                                    // 1 sources

                                    while (true) {
                                        var4_6 ^= var5_4 ^ -1127311646;
                                        var5_4 = (var3_3 | var6_2) ^ -1231321994;
                                        break block29;
                                        break;
                                    }
lbl17:
                                    // 2 sources

                                    while (true) {
                                        var4_6 ^= -965206762;
                                        break block30;
                                        break;
                                    }
lbl20:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ -1986889823;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case -509869112: {
                                        break block31;
                                    }
lbl25:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ 1435340941;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case 1701682190: {
                                        var4_6 ^= var5_4 ^ 1955198932;
                                        ** continue;
                                    }
lbl31:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ 713696870;
                                        break block29;
                                        break;
                                    }
                                    case 1854621255: {
                                        v0 = false;
                                        ** GOTO lbl17
                                    }
lbl37:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ 224651367;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case -1183679710: {
                                        if (var2_5.field_1687 != var1_1.method_12200()) break block15;
                                        ** continue;
                                    }
                                    case -1123497243: {
                                        v0 = true;
                                        ** continue;
                                    }
lbl46:
                                    // 1 sources

                                    while (true) {
                                        var2_5 = class_310.method_1551();
                                        ** continue;
                                        break;
                                    }
                                }
                                break;
                            }
                            break;
                        }
lbl49:
                        // 2 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ -689127678;
                            ** GOTO lbl3
                            break;
                        }
                    }
                    block28: while (true) {
                        switch (var5_4) {
                            default: {
                                continue block28;
                            }
                            case -965358135: {
                                ** continue;
                            }
                            case 1725135812: {
                                ** continue;
                            }
                            ** case 1516531673:
lbl62:
                            // 1 sources

                            ** continue;
                        }
                        break;
                    }
                    {
                        case 974345389: {
                            var4_6 ^= var5_4 ^ -608019102;
                            var5_4 = (var3_3 | var6_2) ^ 1375150410;
                            ** GOTO lbl-1000
                        }
                        case 1187995347: {
                            if (var1_1.method_12200() instanceof class_638) ** continue;
                            ** continue;
                        }
                        ** case 1498680904:
                    }
lbl71:
                    // 1 sources

                    var4_6 ^= var5_4 ^ -1199241337;
                    ** while (true)
                }
                var6_2 = -1996904017;
                var3_3 = gb.i & -1996904017 ^ 1819722242;
                var5_4 = 0;
                var4_6 = (var3_3 | var6_2) ^ 951307535;
                ** while (true)
            }
            return v0;
        }
        var5_4 = (var3_3 | var6_2) ^ -1439648388;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public gb() {
        block98: {
            block94: {
                block97: {
                    block96: {
                        block95: {
                            block93: {
                                block92: {
                                    break block98;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 488767270;
                                        ** GOTO lbl135
lbl4:
                                        // 1 sources

                                        while (true) {
                                            var2_4 ^= var3_3 ^ 1902373243;
                                            break block92;
                                            break;
                                        }
                                        break;
                                    }
lbl7:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -1088834397;
                                        ** GOTO lbl135
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
                                        var3_3 = (var1_2 | var4_1) ^ -205140944;
                                        ** GOTO lbl135
lbl15:
                                        // 1 sources

                                        while (true) {
                                            var2_4 ^= var3_3 ^ -1729551980;
                                            break block93;
                                            break;
                                        }
lbl18:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ 591825501;
                                            ** GOTO lbl135
                                            break;
                                        }
lbl21:
                                        // 2 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ -1511121255;
                                            ** GOTO lbl135
                                            break;
                                        }
                                        break;
                                    }
lbl24:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= 330745986;
                                        break block94;
                                        break;
                                    }
lbl27:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -746253131;
                                        ** GOTO lbl135
lbl30:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ 1128675924;
                                            ** GOTO lbl135
                                            break;
                                        }
                                        break;
                                    }
                                }
                                var3_3 = (var1_2 | var4_1) ^ -55839665;
                                ** GOTO lbl135
lbl36:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 1328296082;
                                    ** GOTO lbl135
                                    break;
                                }
lbl39:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ -2030385908;
                                    ** continue;
                                    break;
                                }
lbl42:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_3 ^ -1629373184;
                                    break block95;
                                    break;
                                }
lbl45:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 585406716;
                                    ** GOTO lbl135
                                    break;
                                }
                            }
                            var3_3 = (var1_2 | var4_1) ^ 40663487;
                            ** GOTO lbl135
lbl51:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -2135646322;
                                ** GOTO lbl135
lbl54:
                                // 1 sources

                                while (true) {
                                    this.a = this.addSetting(new ke(gb.e, false));
                                    ** continue;
                                    break;
                                }
lbl57:
                                // 2 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -168044029;
                                    ** GOTO lbl135
lbl60:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ 743198441;
                                        ** GOTO lbl135
                                        break;
                                    }
lbl63:
                                    // 1 sources

                                    while (true) {
                                        this.a = this.addSetting(new aE(gb.h, gb.m, new String[]{gb.m, gb.i}));
                                        ** GOTO lbl195
                                        break;
                                    }
lbl66:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ 658309130;
                                        break block96;
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
lbl69:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1109132520;
                                ** GOTO lbl135
lbl72:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                                break;
                            }
                        }
                        var3_3 = (var1_2 | var4_1) ^ -533557855;
                        ** GOTO lbl135
lbl77:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1399798041;
                            ** GOTO lbl135
lbl80:
                            // 1 sources

                            while (true) {
                                this.a = (int)new HashMap<K, V>();
                                ** GOTO lbl188
                                break;
                            }
                            break;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ -1781920819;
                    ** GOTO lbl135
lbl86:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl88:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ 2094435929;
                        break block97;
                        break;
                    }
lbl91:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -411063683;
                        ** GOTO lbl21
                        break;
                    }
lbl94:
                    // 1 sources

                    return;
lbl96:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1098731033;
                        ** GOTO lbl135
                        break;
                    }
lbl99:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ 1116336070;
                        ** GOTO lbl57
                        break;
                    }
lbl102:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -385343717;
                        ** GOTO lbl193
                        break;
                    }
lbl105:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1857231795;
                        ** GOTO lbl135
                        break;
                    }
lbl108:
                    // 1 sources

                    while (true) {
                        this.c = this.addSetting(new gP(gb.l, 128.0f, 16.0f, 512.0f, 8.0f, gb.o).description(gb.b));
                        ** continue;
                        break;
                    }
lbl111:
                    // 1 sources

                    while (true) {
                        this.b = this.addSetting(new gP(gb.n, 1.0f, 0.0f, 4.0f, 1.0f, gb.o).description(gb.c));
                        ** continue;
                        break;
                    }
lbl114:
                    // 1 sources

                    while (true) {
                        this.a = (int)new HashSet<E>();
                        ** continue;
                        break;
                    }
lbl117:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 197953621;
                        ** GOTO lbl135
                        break;
                    }
lbl120:
                    // 1 sources

                    block80: while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1361051927;
                        if (true) ** GOTO lbl135
lbl123:
                        // 1 sources

                        while (true) {
                            this.a = new LongOpenHashSet();
                            ** continue;
                            break;
                        }
lbl126:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ -559563768;
                            ** continue;
                            break;
                        }
lbl129:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 408171009;
                            ** continue;
                            break;
                        }
                        block84: while (true) {
                            var2_4 ^= var3_3 ^ -247627831;
                            var3_3 = (var1_2 | var4_1) ^ 957853896;
lbl135:
                            // 34 sources

                            block85: while (true) {
                                switch (var3_3) lbl-1000:
                                // 4 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block85;
                                        }
                                        break;
                                    }
                                    case -1704976203: {
                                        break block80;
                                    }
                                    case -538169066: {
                                        ** continue;
                                    }
                                    case -19456261: {
                                        ** continue;
                                    }
                                    case 1339216372: {
                                        ** continue;
                                    }
                                    case -796766699: {
                                        ** continue;
                                    }
                                    case 1022673839: {
                                        ** continue;
                                    }
                                    case 1052507041: {
                                        ** continue;
                                    }
                                    case -83271120: {
                                        ** continue;
                                    }
                                    case 1260587307: {
                                        ** continue;
                                    }
                                    case 1452034686: {
                                        ** continue;
                                    }
                                    case -1138823677: {
                                        ** continue;
                                    }
                                    case -1825566983: {
                                        ** continue;
                                    }
                                    case 752730338: {
                                        ** continue;
                                    }
                                    case 763887198: {
                                        ** continue;
                                    }
                                    case 1924793744: {
                                        ** continue;
                                    }
                                    case -1671547258: {
                                        ** continue;
                                    }
                                    case 1300193866: {
                                        ** continue;
                                    }
                                    case 133863610: {
                                        ** continue;
                                    }
                                    case -1207926405: {
                                        ** continue;
                                    }
                                    case -95293061: {
                                        ** continue;
                                    }
                                    case -1884719337: {
                                        ** continue;
                                    }
                                    case 548915748: {
                                        ** continue;
                                    }
                                    case -282106568: {
                                        ** continue;
                                    }
                                    case 1138209887: {
                                        continue block84;
                                    }
lbl188:
                                    // 1 sources

                                    var3_3 = (var1_2 | var4_1) ^ 616100765;
                                    ** GOTO lbl-1000
                                    case -1716559251: {
                                        var2_4 ^= var3_3 ^ -536831820;
                                        ** continue;
                                    }
lbl193:
                                    // 1 sources

                                    var3_3 = (var1_2 | var4_1) ^ 1751212556;
                                    ** GOTO lbl-1000
lbl195:
                                    // 1 sources

                                    var3_3 = (var1_2 | var4_1) ^ 762460941;
                                    ** continue;
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    var3_3 = (var1_2 | var4_1) ^ -677676083;
                    ** GOTO lbl135
lbl199:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -73045549;
                        ** GOTO lbl135
                        break;
                    }
lbl202:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1802332026;
                        ** GOTO lbl135
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ -1727123993;
                ** GOTO lbl135
                {
                    case -1807838363: {
                        var2_4 ^= var3_3 ^ -505172488;
                        ** continue;
                    }
                    case 1844937481: {
                        this.Vg();
                        ** continue;
                    }
                }
                this.a = this.addSetting(new hL(gb.p));
                var3_3 = (var1_2 | var4_1) ^ 541666114;
                ** GOTO lbl135
            }
            super(gb.k, gb.s, dA.q);
            var3_3 = (var1_2 | var4_1) ^ 708886376;
            ** GOTO lbl135
            {
                case 1122615739: {
                    ** continue;
                }
            }
            this.Vi();
            var3_3 = (var1_2 | var4_1) ^ -164325157;
            ** GOTO lbl135
        }
        var4_1 = 1828975286;
        var1_2 = gb.i & 1828975286 ^ 261622320;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -700278163;
        ** while (true)
        {
            case 278993628: {
                var2_4 ^= var3_3 ^ -1835148775;
                ** continue;
            }
            case -786871471: {
                var2_4 ^= var3_3 ^ 469457514;
                ** continue;
            }
            case -12942102: {
                var2_4 ^= var3_3 ^ -1078438871;
                ** continue;
            }
            case -1236943348: {
                this.a = (int)new ArrayList<E>(gb.Ve((var2_4 | var3_3 ^ -616149830) ^ (var3_3 ^ 1563863551), (var1_2 | var3_3 ^ -616149830) ^ ((var2_4 | var3_3 ^ -616149830) ^ (var3_3 ^ -288881877))));
                ** continue;
            }
            case 1289580779: {
                this.a = (int)new ArrayDeque<E>();
                ** continue;
            }
        }
        gb.a = this;
        var3_3 = (var1_2 | var4_1) ^ -1334326368;
        ** GOTO lbl135
lbl250:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -639744838;
            ** GOTO lbl135
            break;
        }
        {
            case 1683452643: {
                this.a = (int)new Long2ObjectOpenHashMap();
                ** continue;
            }
        }
lbl256:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1868464548;
            ** GOTO lbl135
            break;
        }
        {
            case -157952175: {
                this.a = this.addSetting(new gP(gb.g, 255.0f, 0.0f, 255.0f, 1.0f, gb.o).description(gb.j));
                ** continue;
            }
        }
lbl262:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 2134564970;
            ** continue;
            break;
        }
        {
            case -898243537: {
                switch (var2_4) {
                    default: {
                        ** continue;
                    }
                    case -1914096488: {
                        ** continue;
                    }
                    ** case 1851048644:
lbl272:
                    // 1 sources

                    ** continue;
                }
            }
            ** case 1171998174:
        }
lbl274:
        // 1 sources

        var2_4 ^= var3_3 ^ -1069857881;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public hL getTargetsGroup() {
        block8: {
            block10: {
                block7: {
                    block9: {
                        break block9;
lbl1:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | -1661065544) ^ -932792105;
                            break block7;
                            break;
                        }
                    }
                    var1_1 = gb.i & -1661065544 ^ -304585674;
                    var3_2 = 0;
                    break block10;
                }
lbl9:
                // 3 sources

                block6: while (true) {
                    switch (var3_2) {
                        default: {
                            continue block6;
                        }
                        case -479204246: {
                            break block8;
                        }
                        case 899210857: {
                            return this.a;
                        }
                        case 1368470371: {
                            var2_3 ^= var3_2 ^ 365981269;
                            break;
                        }
                    }
                    ** continue;
                    break;
                }
            }
            var2_3 = (var1_1 | -1661065544) ^ -1879108298;
            var3_2 = (var1_1 | -1661065544) ^ 512854740;
            ** GOTO lbl9
        }
        var3_2 = (var1_1 | -1661065544) ^ -1401989667;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public JsonArray targetsToJson() {
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
    public void clearTargets() {
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
    public void removeTarget(gR var1_1) {
        block32: {
            break block32;
lbl1:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 1483819314;
                ** GOTO lbl61
                break;
            }
lbl4:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 1764505178;
                ** GOTO lbl61
                break;
            }
lbl7:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 1011204461;
                ** GOTO lbl61
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 2128875317;
                ** GOTO lbl61
                break;
            }
lbl13:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 2006554426;
                ** GOTO lbl61
                break;
            }
lbl16:
            // 1 sources

            return;
lbl18:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 589683151;
                ** GOTO lbl61
lbl21:
                // 1 sources

                while (true) {
                    this.a.remove(var1_1.getTargetBlockId());
                    ** continue;
                    break;
                }
lbl25:
                // 2 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -792950127;
                    ** GOTO lbl61
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ 2124023948;
                    ** GOTO lbl61
                    break;
                }
                break;
            }
lbl31:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 1833098871;
                ** GOTO lbl61
                break;
            }
lbl34:
            // 1 sources

            while (true) {
                this.Vi();
                ** continue;
                break;
            }
lbl37:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ -733426992;
                if (true) ** GOTO lbl61
                break;
            }
        }
        var5_2 = 1051776847;
        var2_3 = gb.i & 1051776847 ^ 1858524540;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ 316021691;
        ** while (true)
        block26: while (true) {
            block33: {
                var4_4 = (var2_3 | var5_2) ^ 444372632;
                break block33;
lbl49:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_4 ^ 94138108;
                    ** continue;
                    break;
                }
lbl52:
                // 1 sources

                while (true) {
                    if (!this.a.removeChild(var1_1)) ** GOTO lbl25
                    ** continue;
                    break;
                }
lbl55:
                // 1 sources

                while (true) {
                    this.Vj();
                    ** continue;
                    break;
                }
lbl58:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_4 ^ 759883174;
                    ** continue;
                    break;
                }
            }
            block31: while (true) {
                switch (var4_4) {
                    default: {
                        continue block31;
                    }
                    case 7135219: {
                        ** continue;
                    }
                    case 1235018: {
                        ** continue;
                    }
                    case 1686782439: {
                        ** continue;
                    }
                    case 330565896: {
                        ** continue;
                    }
                    case -1430381137: {
                        ** continue;
                    }
                    case 1119032850: {
                        ** continue;
                    }
                    case 1574112944: {
                        ** continue;
                    }
                    case 400220453: {
                        ** continue;
                    }
                    case -1370858002: {
                        var3_5 ^= var4_4 ^ -2138356017;
                        ** continue;
                    }
                    case 646422093: {
                        var3_5 ^= var4_4 ^ -343251091;
                        continue block26;
                    }
                    case 158285893: 
                }
                break;
            }
            break;
        }
        var3_5 ^= var4_4 ^ -17646106;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public void applyTargetsJson(JsonArray var1_1) {
        block119: {
            var12_2 = -1140962495;
            var9_3 = gb.i & -1140962495 ^ -1142573845;
            var11_4 = 0;
            var10_5 = (var9_3 | var12_2) ^ 1564277778;
            var11_4 = (var9_3 | var12_2) ^ 1493947717;
            break block119;
lbl7:
            // 1 sources

            while (true) {
                var11_4 = (var9_3 | var12_2) ^ -411972779;
                break block119;
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var10_5 ^= var11_4 ^ 1864276020;
                var11_4 = (var9_3 | var12_2) ^ -1271439632;
                break block119;
                break;
            }
lbl14:
            // 1 sources

            while (true) {
                this.clearTargets();
                var11_4 = (var9_3 | var12_2) ^ 1937685850;
                break block119;
                break;
            }
lbl18:
            // 1 sources

            while (true) {
                var10_5 ^= var11_4 ^ 675769727;
                var11_4 = (var9_3 | var12_2) ^ -1271167096;
                break block119;
                break;
            }
lbl22:
            // 1 sources

            while (true) {
                block126: {
                    block122: {
                        block124: {
                            block120: {
                                block128: {
                                    block121: {
                                        var2_6 = var1_1.iterator();
lbl24:
                                        // 5 sources

                                        block70: while (true) {
                                            block127: {
                                                block123: {
                                                    var11_4 = (var9_3 | var12_2) ^ 1947229546;
                                                    break block120;
lbl27:
                                                    // 1 sources

                                                    while (true) {
                                                        var10_5 ^= var11_4 ^ -807327332;
                                                        var11_4 = (var9_3 | var12_2) ^ -1128049026;
                                                        break block120;
                                                        break;
                                                    }
lbl31:
                                                    // 1 sources

                                                    while (true) {
                                                        if (!var2_6.hasNext()) break block121;
                                                        var11_4 = (var9_3 | var12_2) ^ -1136670393;
                                                        break block120;
                                                        break;
                                                    }
lbl35:
                                                    // 1 sources

                                                    while (true) {
                                                        var10_5 ^= var11_4 ^ -411829338;
                                                        var11_4 = (var9_3 | var12_2) ^ -734466491;
                                                        break block120;
                                                        break;
                                                    }
lbl39:
                                                    // 1 sources

                                                    while (true) {
                                                        var3_7 = (JsonElement)var2_6.next();
                                                        var11_4 = (var9_3 | var12_2) ^ 1609718784;
                                                        break block122;
                                                        break;
                                                    }
lbl43:
                                                    // 1 sources

                                                    while (true) {
                                                        var10_5 ^= var11_4 ^ -1561439442;
                                                        var11_4 = (var9_3 | var12_2) ^ -1191993158;
                                                        break block122;
                                                        break;
                                                    }
lbl47:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var3_7.isJsonObject()) break block123;
                                                        var11_4 = (var9_3 | var12_2) ^ 672503054;
                                                        break block122;
                                                        break;
                                                    }
lbl51:
                                                    // 1 sources

                                                    while (true) {
                                                        var10_5 ^= var11_4 ^ 901045303;
                                                        var11_4 = (var9_3 | var12_2) ^ -39723631;
                                                        break block122;
                                                        break;
                                                    }
                                                }
                                                var11_4 = (var9_3 | var12_2) ^ -559674985;
                                                break block122;
lbl58:
                                                // 1 sources

                                                while (true) {
                                                    var10_5 ^= var11_4 ^ 54489186;
                                                    var11_4 = (var9_3 | var12_2) ^ -204199705;
                                                    break block122;
                                                    break;
                                                }
lbl62:
                                                // 1 sources

                                                while (true) {
                                                    block125: {
                                                        var4_8 = var3_7.getAsJsonObject();
                                                        var11_4 = (var9_3 | var12_2) ^ 943499252;
                                                        break block124;
lbl66:
                                                        // 1 sources

                                                        while (true) {
                                                            var10_5 ^= var11_4 ^ 271450852;
                                                            var11_4 = (var9_3 | var12_2) ^ 588742416;
                                                            break block124;
                                                            break;
                                                        }
lbl70:
                                                        // 1 sources

                                                        while (true) {
                                                            if (var4_8.has(gb.r)) break block125;
                                                            var11_4 = (var9_3 | var12_2) ^ 47157686;
                                                            break block124;
                                                            break;
                                                        }
lbl74:
                                                        // 1 sources

                                                        while (true) {
                                                            var10_5 ^= var11_4 ^ -353958806;
                                                            var11_4 = (var9_3 | var12_2) ^ 2059385291;
                                                            break block124;
                                                            break;
                                                        }
                                                    }
                                                    try {
                                                        var11_4 = (var9_3 | var12_2) ^ 1433194577;
                                                        break block124;
lbl82:
                                                        // 1 sources

                                                        while (true) {
                                                            var10_5 ^= var11_4 ^ -125141219;
                                                            var11_4 = (var9_3 | var12_2) ^ -1800924311;
                                                            break block124;
                                                            break;
                                                        }
lbl86:
                                                        // 1 sources

                                                        while (true) {
                                                            var5_9 = class_2960.method_60654((String)var4_8.get(gb.r).getAsString());
                                                            var10_5 ^= -567460317;
                                                            break;
                                                        }
                                                    }
                                                    catch (Exception v0) {
                                                        var10_5 = (var9_3 | var12_2) ^ -237901027;
                                                        var6_10 = v0;
                                                        var10_5 ^= 2142999627;
                                                        continue block70;
                                                    }
                                                    var10_5 ^= 1185495331;
                                                    var6_10 = (class_2248)class_7923.field_41175.method_63535(var5_9);
                                                    var11_4 = (var9_3 | var12_2) ^ -1343988521;
                                                    break block126;
                                                    break;
                                                }
lbl99:
                                                // 1 sources

                                                while (true) {
                                                    var10_5 ^= var11_4 ^ -917397844;
                                                    var11_4 = (var9_3 | var12_2) ^ -337423726;
                                                    break block126;
                                                    break;
                                                }
lbl103:
                                                // 1 sources

                                                while (true) {
                                                    if (var6_10 == null) continue block70;
                                                    var11_4 = (var9_3 | var12_2) ^ -1001300950;
                                                    break block126;
                                                    break;
                                                }
lbl107:
                                                // 1 sources

                                                while (true) {
                                                    var11_4 = (var9_3 | var12_2) ^ 2043801186;
                                                    break block126;
                                                    break;
                                                }
lbl110:
                                                // 1 sources

                                                while (true) {
                                                    if (var6_10 == class_2246.field_10124) continue block70;
                                                    var11_4 = (var9_3 | var12_2) ^ 385087781;
                                                    break block126;
                                                    break;
                                                }
lbl114:
                                                // 1 sources

                                                while (true) {
                                                    var11_4 = (var9_3 | var12_2) ^ 1938887465;
                                                    break block126;
                                                    break;
                                                }
lbl117:
                                                // 1 sources

                                                while (true) {
                                                    if (var6_10 == class_2246.field_10543) continue block70;
                                                    var11_4 = (var9_3 | var12_2) ^ -379049024;
                                                    break block126;
                                                    break;
                                                }
lbl121:
                                                // 1 sources

                                                while (true) {
                                                    var10_5 ^= var11_4 ^ -1150162695;
                                                    var11_4 = (var9_3 | var12_2) ^ 468597805;
                                                    break block126;
                                                    break;
                                                }
lbl125:
                                                // 1 sources

                                                while (true) {
                                                    if (var6_10 != class_2246.field_10243) break block127;
                                                    var11_4 = (var9_3 | var12_2) ^ 344791546;
                                                    break block126;
                                                    break;
                                                }
lbl129:
                                                // 1 sources

                                                while (true) {
                                                    var10_5 ^= var11_4 ^ 1184160451;
                                                    var11_4 = (var9_3 | var12_2) ^ 1420036635;
                                                    break block126;
                                                    break;
                                                }
                                            }
                                            var11_4 = (var9_3 | var12_2) ^ 1215026247;
                                            break block126;
                                            break;
                                        }
lbl136:
                                        // 1 sources

                                        while (true) {
                                            var10_5 ^= var11_4 ^ -932871420;
                                            var11_4 = (var9_3 | var12_2) ^ 55763037;
                                            break block126;
                                            break;
                                        }
lbl140:
                                        // 1 sources

                                        while (true) {
                                            var7_11 = true;
                                            var8_12 = gb.Ve(((var10_5 ^= -599404002) | var12_2) ^ 1057171101, (var9_3 | var12_2) ^ ((var10_5 | var12_2) ^ -1542447028));
                                            var11_4 = (var9_3 | var12_2) ^ 833563355;
                                            break block128;
lbl145:
                                            // 1 sources

                                            while (true) {
                                                var10_5 ^= var11_4 ^ 18260428;
                                                var11_4 = (var9_3 | var12_2) ^ 573168447;
                                                break block128;
                                                break;
                                            }
lbl149:
                                            // 1 sources

                                            while (true) {
                                                if (!var4_8.has(gb.d)) ** GOTO lbl158
                                                var11_4 = (var9_3 | var12_2) ^ 770918825;
                                                break block128;
                                                break;
                                            }
lbl153:
                                            // 1 sources

                                            while (true) {
                                                var11_4 = (var9_3 | var12_2) ^ -1213560547;
                                                break block128;
                                                break;
                                            }
lbl156:
                                            // 1 sources

                                            while (true) {
                                                var7_11 = var4_8.get(gb.d).getAsBoolean();
lbl158:
                                                // 2 sources

                                                var11_4 = (var9_3 | var12_2) ^ -647950985;
                                                break block128;
                                                break;
                                            }
lbl160:
                                            // 1 sources

                                            while (true) {
                                                var10_5 ^= var11_4 ^ 148095338;
                                                var11_4 = (var9_3 | var12_2) ^ -720356050;
                                                break block128;
                                                break;
                                            }
lbl164:
                                            // 1 sources

                                            while (true) {
                                                if (!var4_8.has(gb.a)) ** GOTO lbl173
                                                var11_4 = (var9_3 | var12_2) ^ 955585521;
                                                break block128;
                                                break;
                                            }
lbl168:
                                            // 1 sources

                                            while (true) {
                                                var11_4 = (var9_3 | var12_2) ^ 597618579;
                                                break block128;
                                                break;
                                            }
lbl171:
                                            // 1 sources

                                            while (true) {
                                                var8_12 = var4_8.get(gb.a).getAsInt();
lbl173:
                                                // 2 sources

                                                var11_4 = (var9_3 | var12_2) ^ 1205554711;
                                                break block128;
                                                break;
                                            }
lbl175:
                                            // 1 sources

                                            while (true) {
                                                var10_5 ^= var11_4 ^ 1249397014;
                                                var11_4 = (var9_3 | var12_2) ^ -1267405651;
                                                break block128;
                                                break;
                                            }
lbl179:
                                            // 1 sources

                                            while (true) {
                                                this.Vh((class_2248)var6_10, var5_9, var7_11, var8_12);
                                                var11_4 = (var9_3 | var12_2) ^ 1501646069;
                                                break block128;
                                                break;
                                            }
lbl183:
                                            // 1 sources

                                            while (true) {
                                                var10_5 ^= var11_4 ^ -1149547878;
                                                var11_4 = (var9_3 | var12_2) ^ -577365694;
                                                break block128;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    var11_4 = (var9_3 | var12_2) ^ -1562030701;
                                    break block120;
lbl190:
                                    // 1 sources

                                    while (true) {
                                        var10_5 ^= var11_4 ^ -2839910;
                                        var11_4 = (var9_3 | var12_2) ^ 707700086;
                                        break block120;
                                        break;
                                    }
lbl194:
                                    // 1 sources

                                    while (true) {
                                        this.Vi();
                                        var11_4 = (var9_3 | var12_2) ^ -280859559;
                                        break block120;
                                        break;
                                    }
lbl198:
                                    // 1 sources

                                    while (true) {
                                        var10_5 ^= var11_4 ^ 1299761138;
                                        var11_4 = (var9_3 | var12_2) ^ 1508498374;
                                        break block120;
                                        break;
                                    }
lbl202:
                                    // 1 sources

                                    while (true) {
                                        this.Vj();
                                        var11_4 = (var9_3 | var12_2) ^ -1934886491;
                                        break block120;
                                        break;
                                    }
lbl206:
                                    // 1 sources

                                    while (true) {
                                        var10_5 ^= var11_4 ^ -211873360;
                                        var11_4 = (var9_3 | var12_2) ^ -652027915;
                                        break block120;
                                        break;
                                    }
lbl210:
                                    // 1 sources

                                    return;
                                }
                                block113: while (true) {
                                    switch (var11_4) {
                                        default: {
                                            continue block113;
                                        }
                                        case -1974414032: {
                                            ** continue;
                                        }
                                        case -1714019116: {
                                            ** continue;
                                        }
                                        case -1777551806: {
                                            ** continue;
                                        }
                                        case 206927606: {
                                            ** continue;
                                        }
                                        case 1654583964: {
                                            ** continue;
                                        }
                                        case 1861206725: {
                                            ** continue;
                                        }
                                        case -2096436198: {
                                            ** continue;
                                        }
                                        case -1738469256: {
                                            ** continue;
                                        }
                                        case -64704004: {
                                            ** continue;
                                        }
                                        case 260772678: {
                                            ** continue;
                                        }
                                        case -495013090: {
                                            ** continue;
                                        }
                                        ** case 1718216361:
lbl240:
                                        // 1 sources

                                        ** GOTO lbl24
                                    }
                                    break;
                                }
                            }
                            block114: while (true) {
                                switch (var11_4) {
                                    default: {
                                        continue block114;
                                    }
                                    case -806378879: {
                                        ** continue;
                                    }
                                    case 121416085: {
                                        ** continue;
                                    }
                                    case 130037420: {
                                        ** continue;
                                    }
                                    case 1875317166: {
                                        ** continue;
                                    }
                                    case 421180024: {
                                        ** continue;
                                    }
                                    case -1848550755: {
                                        ** continue;
                                    }
                                    case 1421710258: {
                                        ** continue;
                                    }
                                    case -501865427: {
                                        ** continue;
                                    }
                                    case 928253518: {
                                        ** continue;
                                    }
                                    ** case 1658660894:
lbl265:
                                    // 1 sources

                                    ** continue;
                                }
                                break;
                            }
                        }
                        block115: while (true) {
                            switch (var11_4) {
                                default: {
                                    continue block115;
                                }
                                case -2084349921: {
                                    ** continue;
                                }
                                case -1729593093: {
                                    ** continue;
                                }
                                case -1188008355: {
                                    ** continue;
                                }
                                case -1052752352: {
                                    ** GOTO lbl24
                                }
                                {
                                    case -292343878: {
                                        ** continue;
                                    }
                                    ** case 794291330:
lbl282:
                                    // 1 sources

                                    ** continue;
                                }
                            }
                            break;
                        }
                    }
                    block116: while (true) {
                        switch (var11_4) {
                            default: {
                                continue block116;
                            }
                            case -468868117: {
                                ** continue;
                            }
                            case 51142481: {
                                ** continue;
                            }
                            case -1813353755: {
                                ** continue;
                            }
                            case 1180574330: {
                                ** GOTO lbl24
                            }
                            case 1700525692: {
                                ** continue;
                            }
                            ** case 1210832652:
lbl299:
                            // 1 sources

                            ** continue;
                        }
                        break;
                    }
                }
                block117: while (true) {
                    switch (var11_4) {
                        default: {
                            continue block117;
                        }
                        case 337355580: {
                            ** continue;
                        }
                        case 1344056697: {
                            ** continue;
                        }
                        case 2142151617: {
                            ** continue;
                        }
                        case -1037168247: {
                            ** continue;
                        }
                        case -1391720754: {
                            ** continue;
                        }
                        case -932254526: {
                            ** continue;
                        }
                        case 1385681963: {
                            ** continue;
                        }
                        case -1609448506: {
                            ** continue;
                        }
                        case -1351424495: {
                            ** continue;
                        }
                        case -279185936: {
                            ** continue;
                        }
                        case -208393300: {
                            ** continue;
                        }
                        ** case -1196613706:
lbl328:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
                break;
            }
        }
        block118: while (true) {
            switch (var11_4) {
                default: {
                    continue block118;
                }
                case -487314770: {
                    ** continue;
                }
                case 1552823486: {
                    ** continue;
                }
                case 264806683: {
                    ** continue;
                }
                case -931052879: {
                    ** continue;
                }
                ** case 264534115:
lbl343:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private void Vg() {
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
    public void addTarget(class_2248 var1_1) {
        block11: {
            block13: {
                block12: {
                    break block12;
lbl1:
                    // 1 sources

                    while (true) {
                        this.addTarget(var1_1, gb.Ve((var3_5 | var4_4 ^ 918151427) ^ (var4_4 ^ -2008765095), (var2_3 | var4_4 ^ 918151427) ^ ((var3_5 | var4_4 ^ 918151427) ^ (var4_4 ^ -1619900755))));
                        ** GOTO lbl28
                        break;
                    }
                }
                var5_2 = 1167986691;
                var2_3 = gb.i & 1167986691 ^ 1932167404;
                var4_4 = 0;
                break block13;
lbl9:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_4 ^ -1289785413;
                    ** GOTO lbl26
                    break;
                }
            }
            var3_5 = (var2_3 | var5_2) ^ 795958114;
            var4_4 = (var2_3 | var5_2) ^ 911529939;
lbl15:
            // 3 sources

            block9: while (true) {
                switch (var4_4) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block9;
                        }
                        break;
                    }
                    case 1931997440: {
                        ** continue;
                    }
                    case -1781593794: {
                        ** continue;
                    }
                    case 1105874748: {
                        break block9;
                    }
lbl26:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 77162991;
                    ** GOTO lbl-1000
lbl28:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 1527145535;
                    ** continue;
                    case 750320848: {
                        var3_5 ^= var4_4 ^ -1059497061;
                        break block11;
                    }
                    case 1915424469: {
                        return;
                    }
                }
                break;
            }
            var4_4 = (var2_3 | var5_2) ^ -495873583;
            ** GOTO lbl15
        }
        var4_4 = (var2_3 | var5_2) ^ 93689402;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void addTarget(class_2248 var1_1, int var2_2) {
        block52: {
            var7_3 = 427689080;
            var4_4 = gb.i & 427689080 ^ 210726024;
            var6_5 = 0;
            var5_7 = (var4_4 | var7_3) ^ 594002754;
            var6_5 = (var4_4 | var7_3) ^ 1742044623;
            break block52;
lbl7:
            // 1 sources

            while (true) {
                var6_5 = (var4_4 | var7_3) ^ -717182661;
                ** GOTO lbl21
                break;
            }
lbl10:
            // 2 sources

            while (true) {
                var6_5 = (var4_4 | var7_3) ^ 11628222;
                break block52;
                break;
            }
            while (true) {
                var6_5 = (var4_4 | var7_3) ^ -1383488653;
                if (true) ** GOTO lbl21
                break;
            }
            block46: while (true) {
                var6_5 = (var4_4 | var7_3) ^ 674083288;
                if (true) ** GOTO lbl21
                block47: while (true) {
                    var6_5 = (var4_4 | var7_3) ^ -540692701;
lbl21:
                    // 4 sources

                    block48: while (true) {
                        switch (var6_5) {
                            default: {
                                continue block48;
                            }
                            case -623324354: {
                                this.Vj();
                                var6_5 = (var4_4 | var7_3) ^ 1158954316;
                                continue block48;
                            }
                            case -1840173729: {
                                var5_7 ^= var6_5 ^ 2016667019;
                                var6_5 = (var4_4 | var7_3) ^ -1708239543;
                                continue block48;
                            }
                            case -789737072: {
                                if (!this.a.contains(var3_6)) ** continue;
                                var6_5 = (var4_4 | var7_3) ^ -1884405337;
                                continue block48;
                            }
                            case 1903653659: {
                                var5_7 ^= var6_5 ^ -1904919768;
                                ** GOTO lbl58
                            }
                            case -1097785620: {
                                var5_7 ^= var6_5 ^ 1244638233;
                                ** GOTO lbl80
                            }
                            case -1671593350: {
                                var5_7 ^= var6_5 ^ 186499305;
                                ** break;
                            }
                            case -926956093: {
                                ** break;
                            }
                            case -1036336165: {
                                return;
                            }
lbl50:
                            // 2 sources

                            var6_5 = (var4_4 | var7_3) ^ -2101985576;
                            continue block48;
                            case -1338229098: {
                                var5_7 ^= var6_5 ^ -1354870408;
                                ** GOTO lbl80
                            }
                            case 1491816884: {
                                var5_7 ^= var6_5 ^ 77254654;
                                continue block47;
                            }
lbl58:
                            // 1 sources

                            var6_5 = (var4_4 | var7_3) ^ -953696314;
                            continue block48;
                            case -1622584800: {
                                switch (var5_7) {
                                    case -639301851: {
                                        var6_5 = (var4_4 | var7_3) ^ -1553042924;
                                        continue block48;
                                    }
                                    default: {
                                        var6_5 = (var4_4 | var7_3) ^ -2120028542;
                                        continue block48;
                                    }
                                    case -813947213: 
                                }
                                var6_5 = (var4_4 | var7_3) ^ -1379708306;
                                continue block48;
                            }
                            case -2016331343: {
                                return;
                            }
                            case -156099797: {
                                var5_7 ^= var6_5 ^ 744748246;
                                continue block46;
                            }
                            case -1334390901: {
                                var5_7 ^= var6_5 ^ -1116719117;
                                var6_5 = (var4_4 | var7_3) ^ 2115187696;
                                continue block48;
                            }
lbl80:
                            // 2 sources

                            var6_5 = (var4_4 | var7_3) ^ -854055513;
                            continue block48;
                            case 903011616: {
                                this.Vi();
                                var6_5 = (var4_4 | var7_3) ^ 1820860387;
                                continue block48;
                            }
                            case 1676435208: {
                                this.Vh(var1_1, var3_6, true, var2_2);
                                var6_5 = (var4_4 | var7_3) ^ -347244589;
                                continue block48;
                            }
                            case -790148769: 
                        }
                        var6_5 = (var4_4 | var7_3) ^ -854393496;
                    }
                    break;
                }
                break;
            }
        }
        block49: while (true) {
            switch (var6_5) {
                case 1911840948: {
                    if (var1_1 != null) {
                        var6_5 = (var4_4 | var7_3) ^ 100665089;
                        continue block49;
                    }
                    ** GOTO lbl147
                }
                case -964004808: {
                    var5_7 ^= var6_5 ^ 1934409007;
                    ** GOTO lbl10
                }
                case -1220315347: {
                    return;
                }
                case 1696988345: {
                    ** continue;
                }
                case -772802314: {
                    var5_7 ^= var6_5 ^ -620054404;
                    ** break;
                }
                case -1932684964: {
                    var5_7 ^= var6_5 ^ -2109706350;
                    ** GOTO lbl140
                }
                case 2049577271: {
                    var6_5 = (var4_4 | var7_3) ^ 2027589697;
                    continue block49;
                }
                case 1936734731: {
                    var5_7 ^= var6_5 ^ 826877141;
                    ** break;
                }
                case -1312768082: {
                    var5_7 ^= var6_5 ^ 1254192685;
                    var6_5 = (var4_4 | var7_3) ^ -437804783;
                }
lbl123:
                // 7 sources

                default: {
                    continue block49;
                }
lbl125:
                // 2 sources

                var6_5 = (var4_4 | var7_3) ^ 1985625687;
                continue block49;
                case 491651654: {
                    switch (var5_7) {
                        case -1687231570: {
                            var6_5 = (var4_4 | var7_3) ^ 1854887667;
                            continue block49;
                        }
                        case -959012116: {
                            var6_5 = (var4_4 | var7_3) ^ -613082944;
                            continue block49;
                        }
                    }
                    var6_5 = (var4_4 | var7_3) ^ -871328754;
                    ** GOTO lbl123
                }
                case 469724153: {
                    var6_5 = (var4_4 | var7_3) ^ -23740265;
                    ** GOTO lbl123
                }
lbl140:
                // 1 sources

                var6_5 = (var4_4 | var7_3) ^ -1430512683;
                continue block49;
                case -132592151: {
                    var3_6 = class_7923.field_41175.method_10221((Object)var1_1);
                    ** continue;
                }
                case -479548305: {
                    if (var1_1 != class_2246.field_10124) ** GOTO lbl149
lbl147:
                    // 2 sources

                    var6_5 = (var4_4 | var7_3) ^ -1858929244;
                    ** GOTO lbl123
lbl149:
                    // 1 sources

                    var6_5 = (var4_4 | var7_3) ^ -1405103274;
                    ** GOTO lbl123
                }
                case 1805996719: 
            }
            break;
        }
        var6_5 = (var4_4 | var7_3) ^ 1812663372;
        ** GOTO lbl123
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public boolean removeTargetById(class_2960 var1_1) {
        var8_2 = -1460159401;
        var5_3 = gb.i & -1460159401 ^ -509389652;
        var7_4 = 0;
        var6_5 = (var5_3 | var8_2) ^ 1438709819;
        var7_4 = (var5_3 | var8_2) ^ 1858251269;
        block27: while (true) {
            switch (var7_4) {
                default: {
                    continue block27;
                }
                case 488074782: {
                    var2_6 = this.a.getChildren().iterator();
                    ** break;
                }
                case 1475739886: {
                    var6_5 ^= var7_4 ^ 508513091;
                    break;
                }
                case -2026547462: {
                    var7_4 = (var5_3 | var8_2) ^ -1107166191;
                    continue block27;
                }
            }
            var7_4 = (var5_3 | var8_2) ^ -186608927;
        }
lbl21:
        // 1 sources

        while (true) {
            var7_4 = (var5_3 | var8_2) ^ -807476388;
            ** GOTO lbl84
            break;
        }
lbl24:
        // 1 sources

        block29: while (true) {
            switch (var7_4) {
                case 1658765396: {
                    var6_5 ^= var7_4 ^ 2001552245;
                    var7_4 = (var5_3 | var8_2) ^ -92651312;
                    continue block29;
                }
                case 260748364: {
                    return true;
                }
                case 328055855: {
                    this.removeTarget(var4_8);
                    break;
                }
                case 1513012651: {
                    var6_5 ^= var7_4 ^ 1085840215;
                    ** break;
lbl38:
                    // 1 sources

                    var7_4 = (var5_3 | var8_2) ^ -427997005;
                }
                default: {
                    continue block29;
                }
            }
            var7_4 = (var5_3 | var8_2) ^ -1277607596;
            continue;
            break;
        }
lbl43:
        // 1 sources

        while (true) {
            var7_4 = (var5_3 | var8_2) ^ -1352572380;
            ** GOTO lbl52
            break;
        }
        while (true) {
            var7_4 = (var5_3 | var8_2) ^ -1504765123;
            if (true) ** GOTO lbl52
            break;
        }
        block32: while (true) {
            var7_4 = (var5_3 | var8_2) ^ 422767760;
            if (true) ** GOTO lbl84
lbl52:
            // 2 sources

            block33: while (true) {
                switch (var7_4) {
                    case 1953458019: {
                        return false;
                    }
                    case -791735887: {
                        var6_5 ^= var7_4 ^ 1057832053;
                        ** continue;
                    }
                    case 1176304316: {
                        var6_5 ^= var7_4 ^ -2128397113;
                        ** break;
                    }
                    case -1265482186: {
                        if (!var2_6.hasNext()) ** continue;
                        var7_4 = (var5_3 | var8_2) ^ 960032078;
                        break;
                    }
lbl66:
                    // 1 sources

                    var7_4 = (var5_3 | var8_2) ^ 1566948041;
                    continue block33;
                    case 1184276187: {
                        var3_7 = var2_6.next();
                        ** continue;
                    }
                    case 1337518018: {
                        var6_5 ^= var7_4 ^ -462587263;
                        var7_4 = (var5_3 | var8_2) ^ -1650943076;
                        continue block33;
                    }
                }
lbl75:
                // 3 sources

            }
lbl76:
            // 2 sources

            while (true) {
                var7_4 = (var5_3 | var8_2) ^ -1343551933;
                ** GOTO lbl75
                break;
            }
lbl79:
            // 1 sources

            while (true) {
                var7_4 = (var5_3 | var8_2) ^ -1960231765;
                ** continue;
                break;
            }
            block37: while (true) {
                var7_4 = (var5_3 | var8_2) ^ 1546416833;
lbl84:
                // 3 sources

                block38: while (true) {
                    block39: {
                        switch (var7_4) {
                            default: {
                                continue block38;
                            }
                            case -1243902402: {
                                var6_5 ^= var7_4 ^ -1428841571;
                                break;
                            }
                            case 1287717489: {
                                ** continue;
                            }
                            case -1817236100: {
                                var4_8 = (gR)var3_7;
                                if (!var4_8.getTargetBlockId().equals((Object)var1_1)) continue block37;
                                ** continue;
                            }
                            case 640229283: {
                                var6_5 ^= var7_4 ^ 299557311;
                                var7_4 = (var5_3 | var8_2) ^ -618200777;
                                continue block38;
                            }
                            case 852557256: {
                                if (var3_7 instanceof gR) ** break;
                                continue block37;
                                continue block32;
                            }
                            case -255520657: {
                                break block39;
                            }
                        }
                        var7_4 = (var5_3 | var8_2) ^ -1523122546;
                        continue;
                    }
                    var7_4 = (var5_3 | var8_2) ^ 2052641155;
                }
                break;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void Vh(class_2248 var1_1, class_2960 var2_2, boolean var3_3, int var4_4) {
        var12_5 = 1568232592;
        var9_6 = gb.i & 1568232592 ^ 574821328;
        var11_7 = 0;
        var10_10 = (var9_6 | var12_5) ^ -555289785;
        var11_7 = (var9_6 | var12_5) ^ -274736847;
        if (true) ** GOTO lbl18
lbl7:
        // 2 sources

        while (true) {
            var11_7 = (var9_6 | var12_5) ^ -945173660;
            ** GOTO lbl141
            break;
        }
        block38: while (true) {
            var11_7 = (var9_6 | var12_5) ^ 202207810;
            ** GOTO lbl18
lbl13:
            // 1 sources

            while (true) {
                var11_7 = (var9_6 | var12_5) ^ 961648261;
                if (true) ** GOTO lbl18
                break;
            }
            block40: while (true) {
                var11_7 = (var9_6 | var12_5) ^ -1753548732;
lbl18:
                // 4 sources

                block41: while (true) {
                    switch (var11_7) {
                        case -1864069407: {
                            ** break;
                        }
                        case 1937122706: {
                            var10_10 ^= var11_7 ^ -176025915;
                            ** continue;
                        }
                        case -1008824244: {
                            if (var2_2 == null) continue block40;
                            continue block38;
                        }
                        case 1177207125: {
                            v0 = var2_2;
                            break block38;
                        }
lbl31:
                        // 1 sources

                        var11_7 = (var9_6 | var12_5) ^ 1107252167;
                        continue block41;
                        case -402542700: {
                            var10_10 ^= var11_7 ^ 1861584067;
                            var11_7 = (var9_6 | var12_5) ^ -173263159;
                        }
                        default: {
                            continue block41;
                        }
                        case 1048839191: {
                            var10_10 ^= var11_7 ^ -1603975559;
                            var11_7 = (var9_6 | var12_5) ^ -1129986148;
                            continue block41;
                        }
                        case -1965596391: {
                            v0 = Objects.requireNonNull(class_7923.field_41175.method_10221((Object)var1_1));
                        }
                    }
                    break;
                }
                break;
            }
            break;
        }
        var10_10 ^= 1326772538;
        var5_8 = v0;
        var11_7 = (var9_6 | var12_5) ^ 1313813759;
        ** GOTO lbl106
lbl48:
        // 1 sources

        while (true) {
            var11_7 = (var9_6 | var12_5) ^ -1231514084;
            if (true) ** GOTO lbl56
            break;
        }
lbl51:
        // 1 sources

        while (true) {
            var11_7 = (var9_6 | var12_5) ^ -1210542035;
            ** GOTO lbl141
            break;
        }
        block44: while (true) {
            var11_7 = (var9_6 | var12_5) ^ -1822038850;
lbl56:
            // 2 sources

            block45: while (true) {
                switch (var11_7) {
                    case -333532306: {
                        var10_10 ^= var11_7 ^ -450992111;
                        ** break;
                    }
                    case 502789701: {
                        var8_12.add(new az(gb.q, var4_4));
                        continue block44;
                    }
                    case -585460141: {
                        var10_10 ^= var11_7 ^ -1594325664;
                        ** GOTO lbl80
                    }
                    case -1035629890: {
                        var8_12.add(new ke(gb.f, var3_3));
                        ** GOTO lbl86
                    }
                    case 1159890072: {
                        var10_10 ^= var11_7 ^ 1690608438;
                        ** GOTO lbl101
                    }
                    case -907820596: {
                        var10_10 ^= var11_7 ^ 1459957970;
                        ** break;
                    }
lbl78:
                    // 1 sources

                    var11_7 = (var9_6 | var12_5) ^ -965271053;
                    ** GOTO lbl94
lbl80:
                    // 1 sources

                    var11_7 = (var9_6 | var12_5) ^ -1023785935;
                    ** GOTO lbl94
                    case -1123608485: {
                        var10_10 ^= var11_7 ^ -1003494696;
                        var11_7 = (var9_6 | var12_5) ^ 1653383573;
                        ** GOTO lbl94
                    }
lbl86:
                    // 1 sources

                    var11_7 = (var9_6 | var12_5) ^ -1032040565;
                    ** GOTO lbl94
lbl88:
                    // 1 sources

                    var11_7 = (var9_6 | var12_5) ^ -1119953554;
                    continue block45;
                    case -1115614239: {
                        this.a.add(var5_8);
                        var11_7 = (var9_6 | var12_5) ^ 978965320;
                    }
lbl94:
                    // 6 sources

                    default: {
                        continue block45;
                    }
                    case -1190365661: {
                        this.a.add(var8_12);
                        var11_7 = (var9_6 | var12_5) ^ -1570651773;
                        continue block45;
                    }
lbl101:
                    // 1 sources

                    var11_7 = (var9_6 | var12_5) ^ 337266850;
                    continue block45;
lbl103:
                    // 1 sources

                    while (true) {
                        var11_7 = (var9_6 | var12_5) ^ 1782580319;
                        ** GOTO lbl141
                        break;
                    }
lbl106:
                    // 1 sources

                    block47: while (true) {
                        switch (var11_7) {
                            case -307921527: {
                                var6_9 = var1_1.method_8389();
                                ** GOTO lbl129
                            }
                            case 1474472897: {
                                var10_10 ^= var11_7 ^ 460288633;
                                ** break;
                            }
                            case 825516847: {
                                var10_10 ^= var11_7 ^ 625755532;
                                ** GOTO lbl133
                            }
                            case -1106446291: {
                                if (this.a.contains(var5_8)) ** GOTO lbl131
                                var11_7 = (var9_6 | var12_5) ^ 681180177;
                                ** GOTO lbl127
                            }
lbl121:
                            // 1 sources

                            var11_7 = (var9_6 | var12_5) ^ -1830933927;
                            ** GOTO lbl127
                            case -136689221: {
                                var10_10 ^= var11_7 ^ 572240535;
                                ** break;
lbl126:
                                // 1 sources

                                var11_7 = (var9_6 | var12_5) ^ -427216725;
                            }
lbl127:
                            // 4 sources

                            default: {
                                continue block47;
                            }
lbl129:
                            // 1 sources

                            var11_7 = (var9_6 | var12_5) ^ -1120312958;
                            if (true) ** GOTO lbl141
lbl131:
                            // 1 sources

                            var11_7 = (var9_6 | var12_5) ^ -2002706837;
                            continue block47;
lbl133:
                            // 1 sources

                            var11_7 = (var9_6 | var12_5) ^ -1049120771;
                            continue block47;
                            case -1712167045: 
                        }
                        break;
                    }
                    return;
                    case 1801527154: 
                }
                break;
            }
            break;
        }
        return;
        while (true) {
            var11_7 = (var9_6 | var12_5) ^ 1360540964;
lbl141:
            // 5 sources

            block49: while (true) {
                switch (var11_7) {
                    default: {
                        continue block49;
                    }
                    case 778265332: {
                        var7_11 = class_1074.method_4662((String)var1_1.method_63499(), (Object[])new Object[0]);
                        var10_10 ^= -990634860;
                        var8_12 = new gR(var7_11, var6_9, var5_8);
                        ** continue;
                    }
                    case -928788483: {
                        var11_7 = (var9_6 | var12_5) ^ -232970147;
                        continue block49;
                    }
                    case -1922662515: {
                        var6_9 = class_1802.field_8077;
                        ** GOTO lbl7
                    }
                    case 356209551: {
                        if (var6_9 == class_1802.field_8162) ** break;
                        ** continue;
                        ** continue;
                    }
                    case -1035848110: {
                        var10_10 ^= var11_7 ^ -1253622729;
                        ** continue;
                    }
                    case -1194156876: 
                }
                break;
            }
            var10_10 ^= var11_7 ^ 253786006;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean hasTargetId(class_2960 class_29602) {
        int n2 = i & 0xAB541F84 ^ 0xB9BC2CD2;
        int n3 = 0;
        int n4 = (n2 | 0xAB541F84) ^ 0x37E57E59;
        n3 = (n2 | 0xAB541F84) ^ 0x5D1113EF;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1258680867: {
                    n4 ^= n3 ^ 0x63692A3B;
                    n3 = (n2 | 0xAB541F84) ^ 0xB67DBDE7;
                    continue block5;
                }
                case -420664263: {
                    n3 = (n2 | 0xAB541F84) ^ 0xF06320B;
                    continue block5;
                }
                case 226591281: 
            }
            break;
        }
        return this.a.contains(class_29602);
    }

    /*
     * Exception decompiling
     */
    @Override
    public az getTargetColor(class_2960 var1_1) {
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
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public Set<class_2960> getTrackedBlockIds() {
        int n2 = i & 0x9FAC7029 ^ 0x9D1C17C;
        int n3 = 0;
        int n4 = (n2 | 0x9FAC7029) ^ 0x72DA96AE;
        n3 = (n2 | 0x9FAC7029) ^ 0xEC55D920;
        boolean bl2 = true;
        block5: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n3 = (n2 | 0x9FAC7029) ^ 0x2F378A51;
            }
            block6: while (true) {
                switch (n3) {
                    default: {
                        continue block6;
                    }
                    case -547868116: {
                        n4 ^= n3 ^ 0x77240969;
                        continue block5;
                    }
                    case 1940400221: {
                        n3 = (n2 | 0x9FAC7029) ^ 0x40A5C351;
                        continue block6;
                    }
                    case -1328907476: 
                }
                break;
            }
            break;
        }
        return Set.copyOf(this.a);
    }

    /*
     * Exception decompiling
     */
    private void Vi() {
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
    private void Vj() {
        var5_1 = 1378545058;
        var2_2 = gb.i & 1378545058 ^ -1896335963;
        var4_3 = 0;
        var3_5 = (var2_2 | var5_1) ^ 946233561;
        var4_3 = (var2_2 | var5_1) ^ 1421771246;
        ** GOTO lbl18
        while (true) {
            var4_3 = (var2_2 | var5_1) ^ 1751852567;
            if (true) ** GOTO lbl18
            break;
        }
lbl10:
        // 2 sources

        while (true) {
            var4_3 = (var2_2 | var5_1) ^ -1604542182;
            ** GOTO lbl47
            break;
        }
        block32: while (true) {
            var4_3 = (var2_2 | var5_1) ^ 318698854;
            if (true) ** GOTO lbl18
            block33: while (true) {
                var4_3 = (var2_2 | var5_1) ^ -1479536684;
lbl18:
                // 4 sources

                block34: while (true) {
                    switch (var4_3) {
                        default: {
                            continue block34;
                        }
                        case -1975223223: {
                            var4_3 = (var2_2 | var5_1) ^ -1340314169;
                            continue block34;
                        }
                        case -657343595: {
                            var1_4 = class_310.method_1551();
                            var4_3 = (var2_2 | var5_1) ^ 484592945;
                            if (true) ** GOTO lbl47
                        }
                        case -1231955024: {
                            var3_5 ^= var4_3 ^ -1441399735;
                            var4_3 = (var2_2 | var5_1) ^ 103499314;
                            continue block34;
                        }
                        case 1860604000: {
                            var3_5 ^= var4_3 ^ -1899267371;
                            continue block33;
                        }
                        case 2032857715: {
                            if (this.isEnabled()) ** continue;
                            continue block32;
                        }
                        case -872150847: {
                            var3_5 ^= var4_3 ^ -513376179;
                            var4_3 = (var2_2 | var5_1) ^ -1042255567;
                            continue block34;
                        }
                        case 521833622: {
                            return;
                        }
                    }
                    break;
                }
                break;
            }
            break;
        }
        block35: while (true) {
            var4_3 = (var2_2 | var5_1) ^ -1304396684;
lbl47:
            // 3 sources

            block36: while (true) {
                switch (var4_3) {
                    case 2016565912: {
                        var3_5 ^= var4_3 ^ -643854434;
                        ** GOTO lbl94
                    }
                    case -211416739: {
                        var3_5 ^= var4_3 ^ 1340893525;
                        ** GOTO lbl10
                    }
                    case 583211745: {
                        this.Vk();
                        var4_3 = (var2_2 | var5_1) ^ 625029902;
                        continue block36;
                    }
                    case -1238120141: {
                        if (var1_4.field_1687 == null) continue block35;
                        var4_3 = (var2_2 | var5_1) ^ 176946221;
                        continue block36;
                    }
                    case -543412679: {
                        this.Vp(var1_4);
                        continue block35;
                    }
                    case -490239635: {
                        ** GOTO lbl96
                    }
                    case -71577943: {
                        ** GOTO lbl94
                    }
                    case -1605792102: {
                        if (var1_4.field_1724 != null) ** break;
                        continue block35;
                        var4_3 = (var2_2 | var5_1) ^ 1010660554;
                        continue block36;
                    }
                    case 1824162259: {
                        var3_5 ^= var4_3 ^ 1192757874;
                        ** break;
                    }
                    case -730791542: {
                        var4_3 = (var2_2 | var5_1) ^ 2125689661;
                        continue block36;
                    }
                    case 6145093: {
                        var3_5 ^= var4_3 ^ 2144234444;
                        ** continue;
                    }
                    case -1038569322: {
                        var3_5 ^= var4_3 ^ 419407348;
                        var4_3 = (var2_2 | var5_1) ^ -63314106;
                        continue block36;
                    }
                    case 2124831933: {
                        var4_3 = (var2_2 | var5_1) ^ 1758016660;
                        continue block36;
                    }
lbl91:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ 68130226;
lbl92:
                    // 3 sources

                    default: {
                        continue block36;
                    }
lbl94:
                    // 2 sources

                    var4_3 = (var2_2 | var5_1) ^ 82495310;
                    continue block36;
lbl96:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ 23516062;
                    continue block36;
                    case -636470551: {
                        switch (var3_5) {
                            case -1060629487: {
                                var4_3 = (var2_2 | var5_1) ^ -1496799425;
                                continue block36;
                            }
                            case -1059961520: {
                                var4_3 = (var2_2 | var5_1) ^ -559466014;
                                continue block36;
                            }
                        }
                        var4_3 = (var2_2 | var5_1) ^ 765261050;
                        ** GOTO lbl92
                    }
                    case -621451243: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private void Vk() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [51[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
     * Enabled aggressive block sorting
     */
    @Override
    public void onEnable() {
        block23: {
            var5_1 = -552525054;
            var2_2 = gb.i & -552525054 ^ -933318032;
            var4_3 = 0;
            var3_5 = (var2_2 | var5_1) ^ -1258346169;
            var4_3 = (var2_2 | var5_1) ^ 818151274;
            if (true) ** GOTO lbl12
lbl7:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ -266427585;
                break block23;
                break;
            }
            block20: while (true) {
                var4_3 = (var2_2 | var5_1) ^ -1205466438;
lbl12:
                // 2 sources

                block21: while (true) {
                    switch (var4_3) {
                        default: {
                            continue block21;
                        }
                        case 243379938: {
                            var3_5 ^= var4_3 ^ 1499134481;
                            var4_3 = (var2_2 | var5_1) ^ 1807507667;
                            continue block21;
                        }
                        case 2045868842: {
                            var3_5 ^= var4_3 ^ 979001043;
                            var4_3 = (var2_2 | var5_1) ^ 1922856167;
                            continue block21;
                        }
                        case -274969576: {
                            ** break;
                        }
                        case 1736030664: {
                            this.Vk();
                            var4_3 = (var2_2 | var5_1) ^ -1498494888;
                            continue block21;
                        }
                        case -1260137567: {
                            var1_4 = class_310.method_1551();
                            var4_3 = (var2_2 | var5_1) ^ 838829120;
                            break block20;
                        }
lbl34:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ 553302631;
                        continue block21;
                        case -5961451: {
                            var3_5 ^= var4_3 ^ -26887951;
                            continue block20;
                        }
                        case -1379678315: 
                    }
                    this.Vi();
                    var4_3 = (var2_2 | var5_1) ^ -773972592;
                }
                break;
            }
        }
        block22: while (true) {
            switch (var4_3) {
                default: {
                    continue block22;
                }
                case 792793165: {
                    var4_3 = (var2_2 | var5_1) ^ 1128676130;
                    continue block22;
                }
                case 1587895236: {
                    this.Vp(var1_4);
                    break;
                }
                case -291489998: {
                    var3_5 ^= var4_3 ^ 901964069;
                    var4_3 = (var2_2 | var5_1) ^ -1542366522;
                    continue block22;
                }
                case 311812191: {
                    var3_5 ^= var4_3 ^ 448640502;
                    var4_3 = (var2_2 | var5_1) ^ -2051477804;
                    continue block22;
                }
                case 1525112230: {
                    return;
                }
                case 255882405: {
                    var4_3 = (var2_2 | var5_1) ^ -2114262858;
                    continue block22;
                }
                case 2068769204: {
                    if (var1_4.field_1687 == null) break;
                    ** continue;
                }
                case -1676048304: {
                    if (var1_4.field_1724 == null) break;
                    var4_3 = (var2_2 | var5_1) ^ -803223593;
                    continue block22;
                }
            }
            var4_3 = (var2_2 | var5_1) ^ -842378451;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onDisable() {
        block12: {
            block11: {
                block13: {
                    break block13;
lbl1:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -242095546;
                        if (true) ** GOTO lbl10
lbl4:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ -1593298243;
                            break block11;
                            break;
                        }
                        block9: while (true) {
                            var2_4 ^= var3_3 ^ -364183083;
                            var3_3 = (var1_2 | var4_1) ^ -1630272853;
lbl10:
                            // 4 sources

                            block10: while (true) {
                                switch (var3_3) {
                                    default: {
                                        continue block10;
                                    }
                                    case -569075251: {
                                        ** continue;
                                    }
                                    case -281960210: {
                                        continue block9;
                                    }
                                    case -1369737296: {
                                        break;
                                    }
                                    case -1054957731: {
                                        this.Vk();
                                        break block12;
                                    }
                                }
                                var3_3 = (var1_2 | var4_1) ^ -1325712104;
                                continue;
                                break;
                            }
                            break;
                        }
                        break;
                    }
                }
                var4_1 = 1565134064;
                var1_2 = gb.i & 1565134064 ^ 1535283494;
                var3_3 = 0;
                var2_4 = (var1_2 | var4_1) ^ -1136472684;
                ** while (true)
            }
            var3_3 = (var1_2 | var4_1) ^ -429513960;
            ** GOTO lbl10
        }
        var3_3 = (var1_2 | var4_1) ^ -2116156357;
        ** while (true)
        {
            ** case -1179861266:
        }
lbl38:
        // 1 sources

    }

    /*
     * Exception decompiling
     */
    @Override
    public void onTick(class_310 var1_1) {
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
    private void Vl(class_310 var1_1, int var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [185[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private void Vm(class_310 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [30[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
     * Enabled aggressive block sorting
     */
    private void Vn(long var1_1) {
        block42: {
            var12_2 = 230562915;
            var9_3 = gb.i & 230562915 ^ -1049249645;
            var11_4 = 0;
            var10_5 = (var9_3 | var12_2) ^ -1346205197;
            var11_4 = (var9_3 | var12_2) ^ -40524293;
            break block42;
lbl7:
            // 1 sources

            while (true) {
                var11_4 = (var9_3 | var12_2) ^ -227302810;
                break block42;
                break;
            }
lbl10:
            // 2 sources

            while (true) {
                var11_4 = (var9_3 | var12_2) ^ 22158225;
                ** GOTO lbl48
                break;
            }
        }
        block33: while (true) {
            switch (var11_4) {
                case 812259592: {
                    ** break;
                }
                case -1900047264: {
                    if (!this.isEnabled()) {
                        ** break;
                    }
                    ** GOTO lbl30
                }
                case 1066147477: {
                    var3_6 = class_310.method_1551();
                    var11_4 = (var9_3 | var12_2) ^ -1309566931;
                    if (true) ** GOTO lbl48
                }
lbl26:
                // 1 sources

                var11_4 = (var9_3 | var12_2) ^ 1281371100;
                continue block33;
lbl28:
                // 1 sources

                var11_4 = (var9_3 | var12_2) ^ -1409258119;
                continue block33;
lbl30:
                // 1 sources

                var11_4 = (var9_3 | var12_2) ^ 1754927631;
                continue block33;
                case 1404878333: {
                    return;
                }
                case 1644155274: {
                    var10_5 ^= var11_4 ^ 1635596053;
                    var11_4 = (var9_3 | var12_2) ^ -1639775986;
                }
                default: {
                    continue block33;
                }
                case -1520062724: {
                    var10_5 ^= var11_4 ^ -1177042678;
                    ** continue;
                }
                case -2120247505: 
            }
            var10_5 ^= var11_4 ^ -1705693937;
            var11_4 = (var9_3 | var12_2) ^ 1128278163;
        }
        block34: while (true) {
            var11_4 = (var9_3 | var12_2) ^ 1938497979;
lbl48:
            // 3 sources

            block35: while (true) {
                block45: {
                    block43: {
                        block44: {
                            switch (var11_4) {
                                case -1600272741: {
                                    if (var3_6.field_1724 == null) ** GOTO lbl10
                                    continue block34;
                                }
                                case 2081301726: {
                                    var10_5 ^= var11_4 ^ -1853872583;
                                    var11_4 = (var9_3 | var12_2) ^ 1835170408;
                                    continue block35;
                                }
                                case -861034654: {
                                    var10_5 ^= var11_4 ^ -771627122;
                                    ** break;
                                }
                                case 523778456: {
                                    var10_5 ^= var11_4 ^ 1214708574;
                                    ** GOTO lbl74
                                }
                                case -2057898384: {
                                    var4_7 = class_1923.method_8325((long)var1_1);
                                    var10_5 ^= -516720794;
                                    break block43;
                                }
lbl67:
                                // 1 sources

                                var11_4 = (var9_3 | var12_2) ^ 1049652886;
                                default: {
                                    continue block35;
                                }
                                case -1099653816: {
                                    break block44;
                                }
                                case -210775451: {
                                    return;
                                }
lbl74:
                                // 1 sources

                                var11_4 = (var9_3 | var12_2) ^ 1219054211;
                                continue block35;
                                case 1260658787: 
                            }
                            if (var3_6.field_1687 == null) {
                                ** continue;
                            }
                            break block45;
                        }
                        var11_4 = (var9_3 | var12_2) ^ -2032427888;
                        continue;
                    }
                    var5_8 = class_1923.method_8332((long)var1_1);
                    var10_5 ^= 1614326441;
                    var6_9 = var3_6.field_1724.method_31476();
                    var7_10 = gb.Ve(((var10_5 ^= -2069265284) | var12_2) ^ 1531155516, (var9_3 | var12_2) ^ ((var10_5 | var12_2) ^ 1233866699)) + ((Float)this.b.getValue()).intValue();
                    var10_5 ^= 667544728;
                    var8_11 = (Integer)var3_6.field_1690.method_42503().method_41753() + var7_10;
                    var11_4 = (var9_3 | var12_2) ^ -648569117;
                    ** GOTO lbl103
                }
                var11_4 = (var9_3 | var12_2) ^ -758676117;
            }
            break;
        }
        while (true) {
            var11_4 = (var9_3 | var12_2) ^ -647343455;
            ** GOTO lbl103
lbl98:
            // 1 sources

            while (true) {
                var11_4 = (var9_3 | var12_2) ^ -1797991922;
                if (true) ** GOTO lbl103
                break;
            }
            break;
        }
        block38: while (true) {
            var11_4 = (var9_3 | var12_2) ^ 61998540;
lbl103:
            // 4 sources

            block39: while (true) {
                block46: {
                    switch (var11_4) {
                        default: {
                            continue block39;
                        }
                        case -2036518589: {
                            var11_4 = (var9_3 | var12_2) ^ 322737373;
                            continue block39;
                        }
                        case 346563088: {
                            var10_5 ^= var11_4 ^ -1548250190;
                            ** continue;
                        }
                        case -833767105: {
                            var10_5 ^= var11_4 ^ 69371915;
                            break;
                        }
                        case -1261644780: {
                            var10_5 ^= var11_4 ^ 1906121676;
                            break block46;
                        }
                        case 1913964793: {
                            return;
                        }
                        case -1835066139: {
                            return;
                        }
                        case -557635538: {
                            if (Math.abs(var5_8 - var6_9.field_9180) <= var8_11) ** continue;
                            continue block38;
                        }
                        case 1352451109: {
                            this.Vo(var1_1, true);
                            var11_4 = (var9_3 | var12_2) ^ 2033412327;
                            continue block39;
                        }
                        case 345370194: {
                            var10_5 ^= var11_4 ^ 1315394209;
                            var11_4 = (var9_3 | var12_2) ^ -1654425386;
                            continue block39;
                        }
                        case 1496018685: {
                            if (Math.abs(var4_7 - var6_9.field_9181) <= var8_11) ** break;
                            continue block38;
                            var11_4 = (var9_3 | var12_2) ^ 1264750000;
                            continue block39;
                        }
                    }
                    var11_4 = (var9_3 | var12_2) ^ -1075088374;
                    continue;
                }
                var11_4 = (var9_3 | var12_2) ^ 1600167958;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private void Vo(long var1_1, boolean var3_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [56[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private void Vp(class_310 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [67[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private void Vq(class_638 var1_1, int var2_2, int var3_3) {
        block18: {
            block17: {
                var7_4 = 1589144530;
                var4_5 = gb.i & 1589144530 ^ -1658987539;
                var6_6 = 0;
                ** GOTO lbl37
lbl5:
                // 1 sources

                while (true) {
                    var6_6 = (var4_5 | var7_4) ^ -460129501;
                    if (true) ** GOTO lbl17
                    break;
                }
lbl8:
                // 1 sources

                while (true) {
                    this.Vo(class_1923.method_8331((int)var2_2, (int)var3_3), false);
                    break block17;
                    break;
                }
                block11: while (true) {
                    block19: {
                        var6_6 = (var4_5 | var7_4) ^ -1216942656;
                        break block19;
lbl14:
                        // 1 sources

                        while (true) {
                            var5_7 ^= var6_6 ^ -3594396;
                            ** continue;
                            break;
                        }
                    }
lbl18:
                    // 4 sources

                    block13: while (true) {
                        switch (var6_6) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                default: {
                                    continue block13;
                                }
                                break;
                            }
                            case -1743835554: {
                                ** continue;
                            }
                            case -234661403: {
                                ** continue;
                            }
                            case 1719795279: {
                                if (var1_1.method_2935().method_21730(var2_2, var3_3) != null) {
                                    continue block11;
                                }
                                break block17;
                            }
                            case -1625290281: {
                                var5_7 ^= var6_6 ^ 487429217;
                                break block18;
                            }
                            case 1758139967: {
                                var6_6 = (var4_5 | var7_4) ^ 1202902433;
                                ** GOTO lbl-1000
                            }
lbl37:
                            // 1 sources

                            var5_7 = (var4_5 | var7_4) ^ 680173779;
                            break block11;
lbl39:
                            // 1 sources

                            while (true) {
                                var6_6 = (var4_5 | var7_4) ^ 1084092968;
                                ** continue;
                                break;
                            }
                            case -1961082058: {
                                ** continue;
                            }
                            case 992936156: {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
                var6_6 = (var4_5 | var7_4) ^ 1419884745;
                ** GOTO lbl18
            }
            var6_6 = (var4_5 | var7_4) ^ 767468058;
            ** GOTO lbl18
        }
        var6_6 = (var4_5 | var7_4) ^ -1187248720;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void Vr(class_310 var1_1, int var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 139[UNCONDITIONALDOLOOP]
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
    private static boolean Vs(class_2248 var0) {
        block22: {
            var4_1 = 458774175;
            var1_2 = gb.i & 458774175 ^ 608190221;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -155502605;
            ** GOTO lbl59
lbl6:
            // 2 sources

            while (true) {
                var2_4 ^= -384436175;
                ** GOTO lbl61
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var2_4 ^= var3_3 ^ 110793797;
                break block22;
                break;
            }
            {
                block24: {
                    block23: {
                        var3_3 = (var1_2 | var4_1) ^ -420269616;
                        break block24;
lbl14:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 374968124;
                            break block23;
                            break;
                        }
lbl17:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 1476808322;
                            ** GOTO lbl45
                            break;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1654047519;
                }
lbl23:
                // 2 sources

                block16: while (true) {
                    switch (var3_3) lbl-1000:
                    // 7 sources

                    {
                        while (true) {
                            default: {
                                continue block16;
                            }
                            break;
                        }
                        case -643084721: {
                            ** continue;
                        }
                        case -1653363594: {
                            ** continue;
                        }
                        case -752063032: {
                            ** continue;
                        }
lbl34:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -624901062;
                            ** GOTO lbl-1000
                            break;
                        }
lbl37:
                        // 2 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -327937449;
                            ** GOTO lbl-1000
                            break;
                        }
                        case 1981144109: {
                            v0 = true;
                            ** GOTO lbl6
                        }
                        case 272753133: {
                            continue block13;
                        }
lbl45:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ 1229824946;
                        ** GOTO lbl-1000
lbl47:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -509326430;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -1012609848: {
                            if (var0 == class_2246.field_10382) ** GOTO lbl37
                            ** continue;
                        }
                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1574186007;
                            ** GOTO lbl-1000
                            break;
                        }
                        case 1573829760: {
                            v0 = false;
                            ** continue;
                        }
lbl59:
                        // 1 sources

                        var3_3 = (var1_2 | var4_1) ^ 790208114;
                        ** continue;
lbl61:
                        // 1 sources

                        return v0;
                        case -553896899: {
                            ** continue;
                        }
                        case -442975323: {
                            if (var0 != class_2246.field_10164) ** continue;
                        }
                    }
                    break;
                }
            }
        }
        var3_3 = (var1_2 | var4_1) ^ -50547881;
        ** while (true)
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void Vt(class_2818 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [264[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private boolean Vu(class_2248 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [28[UNCONDITIONALDOLOOP], 40[UNCONDITIONALDOLOOP], 29[UNCONDITIONALDOLOOP], 24[UNCONDITIONALDOLOOP], 0[SWITCH]], but top level block is 4[SWITCH]
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
    private boolean Vv(class_2680 var1_1) {
        block7: {
            var2_2 = gb.i & 2108151425 ^ 981125538;
            var4_3 = 0;
            ** GOTO lbl14
lbl4:
            // 2 sources

            block5: while (true) {
                switch (var4_3) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block5;
                        }
                        break;
                    }
                    case -1859813788: {
                        var3_4 ^= var4_3 ^ 845564087;
                        break block5;
                    }
                    case -405415800: {
                        break block7;
                    }
lbl14:
                    // 1 sources

                    var3_4 = (var2_2 | 2108151425) ^ 773234031;
                    var4_3 = (var2_2 | 2108151425) ^ -1742076117;
                    ** continue;
                    case 1768883096: {
                        return this.Vu(var1_1.method_26204());
                    }
                }
                break;
            }
            var4_3 = (var2_2 | 2108151425) ^ 378592315;
            ** GOTO lbl4
        }
        var4_3 = (var2_2 | 2108151425) ^ -287661625;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private hU Vw(class_2248 class_22482) {
        int n2 = i & 0xA2CAEBA6 ^ 0x2D3E17BE;
        int n3 = 0;
        int n4 = (n2 | 0xA2CAEBA6) ^ 0x6CC802A0;
        n3 = (n2 | 0xA2CAEBA6) ^ 0x312F5FC3;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1630429059: {
                    break;
                }
                case 1223356495: {
                    n4 ^= n3 ^ 0xD61CB9B4;
                    n3 = (n2 | 0xA2CAEBA6) ^ 0x91EC84F3;
                    continue block5;
                }
                case 1041398605: {
                    return (hU)this.a.get(class_22482);
                }
            }
            n3 = (n2 | 0xA2CAEBA6) ^ 0xE7140FF1;
        }
    }

    /*
     * Exception decompiling
     */
    public void render(WorldRenderContext var1_1, class_310 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [345[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private static void Vx(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, int var10_10, int var11_11) {
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
    private static void Vy(class_4588 class_45882, Matrix4f matrix4f, float f2, float f3, float f4, float f5, float f6, float f7, int n2, int n3, int n4, int n5) {
        int n6 = 1045944270;
        int n7 = i & 0x3E57D7CE ^ 0xDCEE356E;
        int n8 = 0;
        int n9 = (n7 | n6) ^ 0x43127BB9;
        n8 = (n7 | n6) ^ 0x3820546;
        block7: while (true) {
            switch (n8) {
                default: {
                    continue block7;
                }
                case -42077528: {
                    break;
                }
                case 1383293925: {
                    n9 ^= n8 ^ 0xF075AC71;
                    n8 = (n7 | n6) ^ 0x6A5E6D85;
                    continue block7;
                }
                case -1801348501: {
                    gb.Vz(class_45882, matrix4f, f2, f3, f4, f5, f6, f7, n2, n3, n4, n5, 1.0f);
                    n8 = (n7 | n6) ^ 0x59EC4FA5;
                    continue block7;
                }
                case -1491879861: {
                    n9 ^= n8 ^ 0x7B9D74A9;
                    n8 = (n7 | n6) ^ 0x475D6025;
                    continue block7;
                }
                case -1180526645: {
                    return;
                }
            }
            n8 = (n7 | n6) ^ 0xAC8C940B;
        }
    }

    /*
     * Exception decompiling
     */
    private static void Vz(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, int var10_10, int var11_11, float var12_12) {
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
    private static void VA(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, int var10_10, int var11_11) {
        block36: {
            block33: {
                block35: {
                    block34: {
                        block32: {
                            block31: {
                                break block34;
lbl1:
                                // 1 sources

                                while (true) {
                                    var13_15 ^= var14_14 ^ 1595719565;
                                    ** GOTO lbl65
                                    break;
                                }
lbl4:
                                // 1 sources

                                while (true) {
                                    var13_15 ^= var14_14 ^ 763255062;
                                    break block31;
                                    break;
                                }
lbl7:
                                // 1 sources

                                while (true) {
                                    var14_14 = (var12_13 | var15_12) ^ 1217130927;
                                    break block32;
lbl10:
                                    // 1 sources

                                    while (true) {
                                        gb.VB(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var3_3, var7_7, var8_8, var9_9, var10_10, var11_11, false);
                                        ** GOTO lbl53
                                        break;
                                    }
lbl13:
                                    // 1 sources

                                    return;
lbl15:
                                    // 1 sources

                                    while (true) {
                                        var13_15 ^= var14_14 ^ 606635173;
                                        ** GOTO lbl63
                                        break;
                                    }
lbl18:
                                    // 1 sources

                                    while (true) {
                                        gb.VC(var0, var1_1, var5_5, var3_3, var4_4, var6_6, var7_7, var8_8, var9_9, var10_10, var11_11, true);
                                        ** GOTO lbl58
                                        break;
                                    }
                                    break;
                                }
                            }
                            var14_14 = (var12_13 | var15_12) ^ 1082877777;
                            break block32;
lbl24:
                            // 1 sources

                            while (true) {
                                var13_15 ^= var14_14 ^ 1154261858;
                                break block33;
                                break;
                            }
                        }
lbl28:
                        // 8 sources

                        block25: while (true) {
                            switch (var14_14) lbl-1000:
                            // 7 sources

                            {
                                while (true) {
                                    default: {
                                        continue block25;
                                    }
                                    break;
                                }
                                case -1086310848: {
                                    ** continue;
                                }
                                case -1483261934: {
                                    ** continue;
                                }
                                case 1064343794: {
                                    ** continue;
                                }
                                case -982080249: {
                                    ** continue;
                                }
                                case -378462371: {
                                    ** continue;
                                }
                                case 930090508: {
                                    ** continue;
                                }
                                case -2055733534: {
                                    ** continue;
                                }
                                case 994574146: {
                                    gb.VC(var0, var1_1, var2_2, var3_3, var4_4, var6_6, var7_7, var8_8, var9_9, var10_10, var11_11, false);
                                    break block25;
                                }
                                case 688702573: {
                                    gb.VD(var0, var1_1, var7_7, var2_2, var3_3, var5_5, var6_6, var8_8, var9_9, var10_10, var11_11, true);
                                    break;
                                }
lbl53:
                                // 1 sources

                                var14_14 = (var12_13 | var15_12) ^ 2062318525;
                                ** GOTO lbl-1000
lbl55:
                                // 1 sources

                                while (true) {
                                    var14_14 = (var12_13 | var15_12) ^ 1050237451;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl58:
                                // 1 sources

                                var14_14 = (var12_13 | var15_12) ^ -91487935;
                                ** GOTO lbl-1000
lbl60:
                                // 1 sources

                                while (true) {
                                    var14_14 = (var12_13 | var15_12) ^ -1769283330;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl63:
                                // 1 sources

                                var14_14 = (var12_13 | var15_12) ^ 1459043278;
                                ** GOTO lbl-1000
lbl65:
                                // 1 sources

                                var14_14 = (var12_13 | var15_12) ^ -1165141340;
                                ** continue;
                            }
                            break;
                        }
                        var14_14 = (var12_13 | var15_12) ^ -1777818140;
                        ** GOTO lbl28
                        {
                            case -222903027: {
                                break block35;
                            }
                            case -287817638: {
                                gb.VB(var0, var1_1, var2_2, var6_6, var4_4, var5_5, var6_6, var7_7, var8_8, var9_9, var10_10, var11_11, true);
                                ** continue;
                            }
                        }
lbl74:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ -1924318546;
                            ** GOTO lbl28
                            break;
                        }
lbl77:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ 1153171681;
                            ** GOTO lbl28
                            break;
                        }
                    }
                    var15_12 = 1037777827;
                    var12_13 = gb.i & 1037777827 ^ 1714998818;
                    var14_14 = 0;
                    var13_15 = (var12_13 | var15_12) ^ 187976442;
                    ** while (true)
                }
                var14_14 = (var12_13 | var15_12) ^ -663959631;
                ** GOTO lbl28
            }
            var14_14 = (var12_13 | var15_12) ^ -789225041;
            ** GOTO lbl28
            {
                case -1357996532: {
                    gb.VD(var0, var1_1, var4_4, var2_2, var3_3, var5_5, var6_6, var8_8, var9_9, var10_10, var11_11, false);
                    ** continue;
                }
                case 85427230: {
                    var13_15 ^= var14_14 ^ -745225866;
                    break block36;
                }
                case 1096983976: {
                    var13_15 ^= var14_14 ^ -1845659059;
                    ** continue;
                }
            }
            var14_14 = (var12_13 | var15_12) ^ -1061434909;
            ** GOTO lbl28
        }
        var14_14 = (var12_13 | var15_12) ^ -1859928071;
        ** while (true)
        {
            ** case -369927609:
        }
lbl107:
        // 1 sources

        var13_15 ^= var14_14 ^ -1672753093;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static void VB(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, int var10_10, int var11_11, boolean var12_12) {
        block80: {
            block74: {
                block78: {
                    block77: {
                        block76: {
                            block79: {
                                break block79;
lbl1:
                                // 1 sources

                                while (true) {
                                    var15_15 = (var13_14 | var16_13) ^ 1606754882;
                                    ** GOTO lbl97
lbl4:
                                    // 1 sources

                                    while (true) {
                                        var14_16 ^= var15_15 ^ 700120070;
                                        ** GOTO lbl34
                                        break;
                                    }
lbl7:
                                    // 1 sources

                                    while (true) {
                                        var15_15 = (var13_14 | var16_13) ^ 712511974;
                                        ** GOTO lbl97
lbl10:
                                        // 1 sources

                                        while (true) {
                                            var14_16 ^= var15_15 ^ 1587645817;
                                            break block74;
                                            break;
                                        }
                                        break;
                                    }
lbl13:
                                    // 1 sources

                                    while (true) {
                                        block75: {
                                            var15_15 = (var13_14 | var16_13) ^ 1993309168;
                                            ** GOTO lbl97
lbl16:
                                            // 1 sources

                                            while (true) {
                                                var14_16 ^= var15_15 ^ 189480585;
                                                break block75;
                                                break;
                                            }
lbl19:
                                            // 2 sources

                                            while (true) {
                                                var15_15 = (var13_14 | var16_13) ^ 794849768;
                                                ** GOTO lbl97
lbl22:
                                                // 1 sources

                                                while (true) {
                                                    var15_15 = (var13_14 | var16_13) ^ 669173378;
                                                    ** GOTO lbl97
lbl25:
                                                    // 1 sources

                                                    while (true) {
                                                        var14_16 ^= var15_15 ^ -324597609;
                                                        ** GOTO lbl154
                                                        break;
                                                    }
lbl28:
                                                    // 1 sources

                                                    while (true) {
                                                        var14_16 ^= var15_15 ^ -1243665921;
                                                        break block76;
                                                        break;
                                                    }
lbl31:
                                                    // 1 sources

                                                    while (true) {
                                                        var15_15 = (var13_14 | var16_13) ^ 1324161715;
                                                        ** GOTO lbl97
                                                        break;
                                                    }
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                        var15_15 = (var13_14 | var16_13) ^ 2144365016;
                                        ** GOTO lbl97
lbl37:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl39:
                                        // 1 sources

                                        while (true) {
                                            var14_16 ^= var15_15 ^ 1986853263;
                                            ** GOTO lbl44
                                            break;
                                        }
lbl42:
                                        // 1 sources

                                        while (var12_12) {
                                            break block77;
lbl44:
                                            // 2 sources

                                            while (true) {
                                                var15_15 = (var13_14 | var16_13) ^ -1078508837;
                                                ** GOTO lbl97
                                                break;
                                            }
lbl47:
                                            // 1 sources

                                            while (true) {
                                                var15_15 = (var13_14 | var16_13) ^ -499295931;
                                                ** GOTO lbl97
                                                break;
                                            }
                                        }
                                        ** GOTO lbl148
                                        break;
                                    }
                                    break;
                                }
lbl51:
                                // 1 sources

                                while (true) {
                                    var15_15 = (var13_14 | var16_13) ^ -1341416311;
                                    ** GOTO lbl97
                                    break;
                                }
lbl54:
                                // 1 sources

                                while (true) {
                                    var14_16 ^= var15_15 ^ 1282411776;
                                    ** GOTO lbl19
                                    break;
                                }
lbl57:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl59:
                                // 1 sources

                                while (true) {
                                    var15_15 = (var13_14 | var16_13) ^ 1415203650;
                                    ** GOTO lbl97
                                    break;
                                }
                                var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var7_7).method_1336(var8_8, var9_9, var10_10, var11_11);
                                var15_15 = (var13_14 | var16_13) ^ 56627600;
                                ** GOTO lbl97
lbl66:
                                // 1 sources

                                while (true) {
                                    var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var4_4).method_1336(var8_8, var9_9, var10_10, var11_11);
                                    break block78;
                                    break;
                                }
lbl70:
                                // 1 sources

                                while (true) {
                                    var15_15 = (var13_14 | var16_13) ^ -534681601;
                                    ** GOTO lbl97
                                    break;
                                }
                            }
                            var16_13 = -2088833990;
                            var13_14 = gb.i & -2088833990 ^ 1366528708;
                            var15_15 = 0;
                            var14_16 = (var13_14 | var16_13) ^ 47043060;
                            ** while (true)
                        }
                        var15_15 = (var13_14 | var16_13) ^ 137453083;
                        ** GOTO lbl97
lbl82:
                        // 1 sources

                        while (true) {
                            var14_16 ^= var15_15 ^ 741051641;
                            ** GOTO lbl146
                            break;
                        }
lbl85:
                        // 1 sources

                        while (true) {
                            var14_16 ^= var15_15 ^ -347001036;
                            var15_15 = (var13_14 | var16_13) ^ -702103668;
                            ** GOTO lbl97
                            break;
                        }
lbl89:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var15_15 = (var13_14 | var16_13) ^ 1889067084;
                    ** GOTO lbl97
                }
lbl95:
                // 2 sources

                block66: while (true) {
                    var15_15 = (var13_14 | var16_13) ^ -739461123;
lbl97:
                    // 28 sources

                    block67: while (true) {
                        switch (var15_15) lbl-1000:
                        // 4 sources

                        {
                            while (true) {
                                default: {
                                    continue block67;
                                }
                                break;
                            }
                            case -1933910852: {
                                ** continue;
                            }
                            case 826451899: {
                                ** continue;
                            }
                            case 1290126657: {
                                ** continue;
                            }
                            case -2027571780: {
                                ** continue;
                            }
                            case -1545134414: {
                                ** continue;
                            }
                            case 626488692: {
                                ** continue;
                            }
                            case -505813764: {
                                ** continue;
                            }
                            case 1162356936: {
                                ** GOTO lbl42
                            }
                            case 861837569: {
                                ** continue;
                            }
                            case -1119326553: {
                                ** continue;
                            }
                            case 1968979247: {
                                ** continue;
                            }
                            case -1515158258: {
                                ** continue;
                            }
                            case -1397778650: {
                                ** continue;
                            }
                            case 1888665186: {
                                ** continue;
                            }
                            case -803213458: {
                                ** continue;
                            }
                            case -1651317683: {
                                ** continue;
                            }
                            case -615603995: {
                                var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var4_4).method_1336(var8_8, var9_9, var10_10, var11_11);
                                ** continue;
                            }
                            case 1184576586: {
                                var14_16 ^= var15_15 ^ -373724519;
                                break;
                            }
                            case -191022980: {
                                var14_16 ^= var15_15 ^ 1968083212;
                                ** continue;
                            }
                            case 1668571767: {
                                break block66;
                            }
lbl146:
                            // 1 sources

                            var15_15 = (var13_14 | var16_13) ^ -1507605551;
                            ** GOTO lbl-1000
lbl148:
                            // 1 sources

                            var15_15 = (var13_14 | var16_13) ^ 1644413171;
                            ** GOTO lbl-1000
                            case 34502867: {
                                var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var4_4).method_1336(var8_8, var9_9, var10_10, var11_11);
                                break;
                            }
lbl154:
                            // 2 sources

                            while (true) {
                                var15_15 = (var13_14 | var16_13) ^ -1482712011;
                                ** continue;
                                break;
                            }
                        }
                        break;
                    }
                    break;
                }
                var15_15 = (var13_14 | var16_13) ^ 1849135193;
                ** GOTO lbl97
                {
                    case -1186367158: {
                        var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var4_4).method_1336(var8_8, var9_9, var10_10, var11_11);
                        ** continue;
                    }
                    case -427234301: {
                        var14_16 ^= var15_15 ^ -1418700325;
                        ** continue;
                    }
                }
            }
            var15_15 = (var13_14 | var16_13) ^ -781089235;
            ** GOTO lbl97
            var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var7_7).method_1336(var8_8, var9_9, var10_10, var11_11);
            var15_15 = (var13_14 | var16_13) ^ -1780168012;
            ** GOTO lbl97
lbl173:
            // 1 sources

            while (true) {
                var15_15 = (var13_14 | var16_13) ^ -1617282113;
                ** GOTO lbl97
                break;
            }
            {
                case 9652483: {
                    ** continue;
                }
            }
            var15_15 = (var13_14 | var16_13) ^ -165114998;
            ** GOTO lbl97
lbl180:
            // 1 sources

            while (true) {
                var15_15 = (var13_14 | var16_13) ^ 849746434;
                ** GOTO lbl97
                break;
            }
            {
                case 89735538: {
                    var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var7_7).method_1336(var8_8, var9_9, var10_10, var11_11);
                    ** continue;
                }
            }
            var15_15 = (var13_14 | var16_13) ^ -1544732516;
            ** GOTO lbl97
            {
                case 1960862411: {
                    switch (var14_16) {
                        case -396581787: {
                            ** continue;
                        }
                        default: {
                            ** continue;
                        }
                        ** case -1330621371:
lbl196:
                        // 1 sources

                        ** continue;
                    }
                }
            }
            var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var7_7).method_1336(var8_8, var9_9, var10_10, var11_11);
            var15_15 = (var13_14 | var16_13) ^ 905384701;
            ** GOTO lbl97
lbl201:
            // 1 sources

            while (true) {
                var15_15 = (var13_14 | var16_13) ^ -1774725578;
                ** GOTO lbl97
                break;
            }
lbl204:
            // 1 sources

            while (true) {
                var15_15 = (var13_14 | var16_13) ^ 1196505199;
                ** GOTO lbl97
                break;
            }
            {
                case -1808873839: {
                    var14_16 ^= var15_15 ^ -163278261;
                    ** continue;
                }
                case -1317257715: {
                    var14_16 ^= var15_15 ^ -866544840;
                    break block80;
                }
                case -65040618: {
                    ** continue;
                }
                case -116920552: {
                    return;
                }
                ** case 1825094693:
            }
lbl218:
            // 1 sources

            switch (var14_16) {
                case -776851702: {
                    ** continue;
                }
                case -707253104: {
                    ** continue;
                }
                ** default:
lbl224:
                // 1 sources

                ** continue;
            }
        }
        var15_15 = (var13_14 | var16_13) ^ 1781958580;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static void VC(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, int var7_7, int var8_8, int var9_9, int var10_10, boolean var11_11) {
        block74: {
            block75: {
                var15_12 = -1862682668;
                var12_13 = gb.i & -1862682668 ^ 731926837;
                var14_14 = 0;
                ** GOTO lbl115
lbl5:
                // 1 sources

                while (true) {
                    var14_14 = (var12_13 | var15_12) ^ -642169032;
                    break block74;
                    break;
                }
lbl8:
                // 1 sources

                while (true) {
                    var14_14 = (var12_13 | var15_12) ^ -233561231;
                    break block74;
                    break;
                }
lbl11:
                // 1 sources

                while (true) {
                    var14_14 = (var12_13 | var15_12) ^ -70330237;
                    break block74;
lbl14:
                    // 1 sources

                    while (true) {
                        var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var4_4).method_1336(var7_7, var8_8, var9_9, var10_10);
                        ** GOTO lbl58
                        break;
                    }
                    break;
                }
lbl18:
                // 1 sources

                while (true) {
                    var14_14 = (var12_13 | var15_12) ^ -1461828968;
                    break block74;
                    break;
                }
lbl21:
                // 1 sources

                while (true) {
                    var14_14 = (var12_13 | var15_12) ^ 1961572382;
                    break block74;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var14_14 = (var12_13 | var15_12) ^ -1274766966;
                    break block74;
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    var0.method_22918((Matrix4fc)var1_1, var2_2, var5_5, var4_4).method_1336(var7_7, var8_8, var9_9, var10_10);
                    ** continue;
                    break;
                }
lbl31:
                // 1 sources

                while (true) {
                    var14_14 = (var12_13 | var15_12) ^ -1501863858;
                    break block74;
                    break;
                }
lbl34:
                // 1 sources

                while (true) {
                    var14_14 = (var12_13 | var15_12) ^ -666001476;
                    break block74;
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    var14_14 = (var12_13 | var15_12) ^ 1594366445;
                    break block74;
                    break;
                }
lbl40:
                // 1 sources

                block43: while (true) {
                    switch (var13_15) {
                        default: {
                            var14_14 = (var12_13 | var15_12) ^ -2022378402;
                            break block43;
                        }
lbl45:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ 960445610;
                            break block43;
                            break;
                        }
lbl48:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ -770867447;
                            ** GOTO lbl118
                            break;
                        }
lbl51:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ 1661902130;
                            ** GOTO lbl120
                            break;
                        }
lbl54:
                        // 1 sources

                        while (true) {
                            var0.method_22918((Matrix4fc)var1_1, var2_2, var5_5, var6_6).method_1336(var7_7, var8_8, var9_9, var10_10);
                            ** continue;
                            break;
                        }
lbl58:
                        // 1 sources

                        var14_14 = (var12_13 | var15_12) ^ 576497240;
                        break block43;
lbl60:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ -1976975900;
                            break block43;
                            break;
                        }
lbl65:
                        // 1 sources

                        while (true) {
                            var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var6_6).method_1336(var7_7, var8_8, var9_9, var10_10);
                            ** continue;
                            break;
                        }
lbl69:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ -1455306331;
                            break block75;
                            break;
                        }
lbl72:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ -510994938;
                            ** continue;
                            break;
                        }
lbl75:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ -868440555;
                            ** continue;
                            break;
                        }
lbl78:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ 1015610420;
                            ** continue;
                            break;
                        }
                        case 768363361: {
                            var14_14 = (var12_13 | var15_12) ^ 351128770;
                            break block43;
                        }
lbl84:
                        // 2 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ 1553735752;
                            break block43;
                            break;
                        }
lbl87:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ 624594553;
                            ** continue;
                            break;
                        }
lbl90:
                        // 1 sources

                        return;
lbl92:
                        // 1 sources

                        while (true) {
                            var0.method_22918((Matrix4fc)var1_1, var2_2, var5_5, var4_4).method_1336(var7_7, var8_8, var9_9, var10_10);
                            ** GOTO lbl84
                            break;
                        }
lbl96:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ 2079176878;
                            ** continue;
                            break;
                        }
lbl99:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ -1394711186;
                            ** GOTO lbl118
                            break;
                        }
                        var0.method_22918((Matrix4fc)var1_1, var2_2, var5_5, var6_6).method_1336(var7_7, var8_8, var9_9, var10_10);
                        var14_14 = (var12_13 | var15_12) ^ -819808132;
                        break block43;
lbl106:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ 1058741552;
                            break block43;
                            break;
                        }
lbl109:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ -1057751028;
                            break block43;
                            break;
                        }
lbl112:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ 1935457255;
                            break block43;
                            break;
                        }
lbl115:
                        // 1 sources

                        var13_15 = (var12_13 | var15_12) ^ 1841472647;
                        var14_14 = (var12_13 | var15_12) ^ 235833827;
                        break block43;
lbl118:
                        // 2 sources

                        var14_14 = (var12_13 | var15_12) ^ 1369990764;
                        break block43;
lbl120:
                        // 1 sources

                        var14_14 = (var12_13 | var15_12) ^ -1501054754;
                        break block43;
lbl122:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ 1285103922;
                            break block43;
                            break;
                        }
lbl125:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ -737339800;
                            ** continue;
                            break;
                        }
lbl128:
                        // 1 sources

                        while (true) {
                            var13_15 ^= var14_14 ^ 837364329;
                            ** continue;
                            break;
                        }
lbl131:
                        // 1 sources

                        while (true) {
                            var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var6_6).method_1336(var7_7, var8_8, var9_9, var10_10);
                            ** continue;
                            break;
                        }
lbl135:
                        // 1 sources

                        while (true) {
                            var14_14 = (var12_13 | var15_12) ^ 1473554702;
                            break block43;
                            break;
                        }
lbl138:
                        // 1 sources

                        while (true) {
                            var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var4_4).method_1336(var7_7, var8_8, var9_9, var10_10);
                            ** continue;
                            break;
                        }
                        case -14954573: {
                            var14_14 = (var12_13 | var15_12) ^ 1288500008;
                            break block43;
                        }
                    }
                    break;
                }
                break block74;
            }
lbl147:
            // 2 sources

            while (true) {
                var14_14 = (var12_13 | var15_12) ^ 227893829;
                break block74;
                break;
            }
lbl150:
            // 1 sources

            while (true) {
                var13_15 ^= var14_14 ^ -1268869192;
                ** continue;
                break;
            }
lbl153:
            // 1 sources

            while (true) {
                if (!var11_11) ** continue;
                ** continue;
                break;
            }
        }
        block73: while (true) {
            switch (var14_14) {
                default: {
                    continue block73;
                }
                case -453906920: {
                    ** continue;
                }
                case 495097787: {
                    ** continue;
                }
                case -1234397776: {
                    ** continue;
                }
                case -1357628617: {
                    ** continue;
                }
                case -412756035: {
                    ** continue;
                }
                case 1240323204: {
                    ** continue;
                }
                case -2065503547: {
                    ** continue;
                }
                case 1077358454: {
                    ** continue;
                }
                case -1242071530: {
                    ** continue;
                }
                case -1717218899: {
                    ** continue;
                }
                case -147520291: {
                    ** continue;
                }
                case -144648505: {
                    ** continue;
                }
                case 835734033: {
                    ** continue;
                }
                case -332570885: {
                    ** continue;
                }
                case -928691182: {
                    ** continue;
                }
                case 494817067: {
                    ** continue;
                }
                case 321369453: {
                    ** continue;
                }
                case 1672767561: {
                    ** continue;
                }
                case 1015874475: {
                    ** continue;
                }
                case 1960529801: {
                    ** continue;
                }
                case 1648406733: {
                    ** continue;
                }
                case 2064513017: {
                    ** continue;
                }
                case -363753063: {
                    ** continue;
                }
                case -2100901025: {
                    ** continue;
                }
                case 268267135: {
                    ** continue;
                }
                ** case -820850709:
lbl212:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void VD(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, int var7_7, int var8_8, int var9_9, int var10_10, boolean var11_11) {
        var15_12 = 1460797981;
        var12_13 = gb.i & 1460797981 ^ -1217711846;
        var14_14 = 0;
        var13_15 = (var12_13 | var15_12) ^ -284193395;
        var14_14 = (var12_13 | var15_12) ^ 1901214562;
        if (true) ** GOTO lbl24
        block32: while (true) {
            var14_14 = (var12_13 | var15_12) ^ 876622824;
            ** GOTO lbl24
lbl10:
            // 1 sources

            while (true) {
                var14_14 = (var12_13 | var15_12) ^ -72296067;
                if (true) ** GOTO lbl24
                break;
            }
            block34: while (true) {
                var14_14 = (var12_13 | var15_12) ^ 80005766;
                ** GOTO lbl24
lbl16:
                // 1 sources

                while (true) {
                    var14_14 = (var12_13 | var15_12) ^ 1811144706;
                    ** GOTO lbl24
lbl19:
                    // 2 sources

                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ 448050109;
                        if (true) ** GOTO lbl24
                        break;
                    }
                    break;
                }
                block37: while (true) {
                    var14_14 = (var12_13 | var15_12) ^ -1926337308;
lbl24:
                    // 7 sources

                    block38: while (true) {
                        switch (var14_14) {
                            case -1350452337: {
                                var13_15 ^= var14_14 ^ 1367818664;
                                ** GOTO lbl19
                            }
                            case -1550697971: {
                                var13_15 ^= var14_14 ^ 1209320674;
                                var14_14 = (var12_13 | var15_12) ^ -1326592014;
                                continue block38;
                            }
                            case -2044131203: {
                                ** GOTO lbl133
                            }
                            case -1019543305: {
                                var0.method_22918((Matrix4fc)var1_1, var3_3, var4_4, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                                var14_14 = (var12_13 | var15_12) ^ -1595614001;
                                continue block38;
                            }
                            case 399131420: {
                                if (var11_11) {
                                    var14_14 = (var12_13 | var15_12) ^ 1663809368;
                                    continue block38;
                                }
                                ** GOTO lbl139
                            }
                            case -1713250283: {
                                var0.method_22918((Matrix4fc)var1_1, var5_5, var4_4, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                                ** GOTO lbl80
                            }
                            case 1205481567: {
                                var13_15 ^= var14_14 ^ 305712523;
                                ** continue;
                            }
                            case 2052415483: {
                                ** GOTO lbl91
                            }
                            case -305168222: {
                                ** break;
                            }
                            case 1201077485: {
                                var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                                ** break;
                            }
                            case -1718528811: {
                                var13_15 ^= var14_14 ^ 1893172755;
                                ** GOTO lbl102
                            }
                            case 1244879853: {
                                var0.method_22918((Matrix4fc)var1_1, var3_3, var6_6, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                                ** GOTO lbl100
                            }
lbl67:
                            // 1 sources

                            var14_14 = (var12_13 | var15_12) ^ -1622076056;
                            continue block38;
                            case -1987757091: {
                                var13_15 ^= var14_14 ^ -1082826424;
                                ** GOTO lbl104
                            }
                            case 564415843: {
                                var13_15 ^= var14_14 ^ -1116962991;
                                ** continue;
                            }
lbl75:
                            // 1 sources

                            var14_14 = (var12_13 | var15_12) ^ 2130577602;
                            continue block38;
                            case -1668754659: {
                                var0.method_22918((Matrix4fc)var1_1, var3_3, var6_6, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
lbl80:
                                // 2 sources

                                var14_14 = (var12_13 | var15_12) ^ -2130815703;
                                continue block38;
                            }
                            case 1809592677: {
                                continue block37;
                            }
                            case -205522535: {
                                var13_15 ^= var14_14 ^ 956598502;
                                ** continue;
                            }
                            case 5056746: {
                                var0.method_22918((Matrix4fc)var1_1, var5_5, var4_4, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                                continue block34;
                            }
lbl91:
                            // 1 sources

                            switch (var13_15) {
                                case 1760104007: {
                                    var14_14 = (var12_13 | var15_12) ^ 1492813968;
                                    continue block38;
                                }
                                case 214690402: {
                                    var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                                    var14_14 = (var12_13 | var15_12) ^ -689996164;
                                    ** GOTO lbl121
                                }
lbl100:
                                // 1 sources

                                var14_14 = (var12_13 | var15_12) ^ 1424558354;
                                continue block38;
lbl102:
                                // 1 sources

                                var14_14 = (var12_13 | var15_12) ^ -1119328014;
                                continue block38;
lbl104:
                                // 1 sources

                                var14_14 = (var12_13 | var15_12) ^ 1855640330;
                                continue block38;
                                case 1198175891: {
                                    var13_15 ^= var14_14 ^ -741797845;
                                    ** GOTO lbl123
                                }
                                default: {
                                    var14_14 = (var12_13 | var15_12) ^ -1331625152;
                                    continue block38;
                                }
                                case -1615090311: {
                                    var13_15 ^= var14_14 ^ -1021973811;
                                    continue block37;
                                }
                                case 472831077: 
                            }
                            var14_14 = (var12_13 | var15_12) ^ 1757453926;
                            continue block38;
                            case 1470099408: {
                                var13_15 ^= var14_14 ^ -2077953819;
                                var14_14 = (var12_13 | var15_12) ^ -147448843;
                            }
lbl121:
                            // 4 sources

                            default: {
                                continue block38;
                            }
lbl123:
                            // 1 sources

                            var14_14 = (var12_13 | var15_12) ^ -525242365;
                            continue block38;
                            case -1806662585: {
                                var13_15 ^= var14_14 ^ 1883919191;
                                continue block32;
                            }
                            case 1747592823: {
                                var0.method_22918((Matrix4fc)var1_1, var3_3, var4_4, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                                var14_14 = (var12_13 | var15_12) ^ 1860855754;
                                continue block38;
                            }
lbl133:
                            // 1 sources

                            var14_14 = (var12_13 | var15_12) ^ -1341028980;
                            continue block38;
                            case 2005231158: {
                                var13_15 ^= var14_14 ^ 158329324;
                                var14_14 = (var12_13 | var15_12) ^ -288287619;
                                ** GOTO lbl121
                            }
lbl139:
                            // 1 sources

                            var14_14 = (var12_13 | var15_12) ^ -1666776454;
                            continue block38;
                            case 430581602: 
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
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    private static /* synthetic */ void VE(class_638 var0, class_2818 var1_1) {
        block43: {
            block42: {
                block44: {
                    var8_2 = -726377514;
                    var5_3 = gb.i & -726377514 ^ -1765393700;
                    var7_4 = 0;
                    var6_5 = (var5_3 | var8_2) ^ -399290694;
                    var7_4 = (var5_3 | var8_2) ^ 437991289;
                    break block42;
lbl7:
                    // 1 sources

                    while (true) {
                        var7_4 = (var5_3 | var8_2) ^ 522594448;
                        break block42;
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var6_5 ^= var7_4 ^ -432748242;
                        var7_4 = (var5_3 | var8_2) ^ -555969084;
                        break block42;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var2_6 = gb.a;
                        var7_4 = (var5_3 | var8_2) ^ -1174909664;
                        break block43;
                        break;
                    }
lbl18:
                    // 1 sources

                    while (true) {
                        var6_5 ^= var7_4 ^ 592191202;
                        var7_4 = (var5_3 | var8_2) ^ 690160358;
                        break block43;
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        if (var2_6 != null) break block44;
                        var7_4 = (var5_3 | var8_2) ^ -1441064084;
                        break block43;
                        break;
                    }
lbl26:
                    // 1 sources

                    while (true) {
                        var6_5 ^= var7_4 ^ 796620605;
                        var7_4 = (var5_3 | var8_2) ^ -601271460;
                        break block43;
                        break;
                    }
lbl30:
                    // 1 sources

                    return;
                }
                var7_4 = (var5_3 | var8_2) ^ 2029044273;
                break block43;
lbl35:
                // 1 sources

                while (true) {
                    var6_5 ^= var7_4 ^ -1785212101;
                    var7_4 = (var5_3 | var8_2) ^ 252054339;
                    break block43;
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var3_7 = var2_6.a;
                    synchronized (var3_7) {
                        try {
                            var7_4 = (var5_3 | var8_2) ^ -2122778249;
                            ** break block45
lbl45:
                            // 1 sources

                            while (true) {
                                var6_5 ^= var7_4 ^ -563619041;
                                var7_4 = (var5_3 | var8_2) ^ 1072908915;
                                ** break block45
                                break;
                            }
lbl49:
                            // 1 sources

                            while (true) {
                                var2_6.a.remove(var1_1.method_12004().method_8324());
                                var7_4 = (var5_3 | var8_2) ^ 1235668982;
                                ** break block45
                                break;
                            }
lbl54:
                            // 1 sources

                            while (true) {
                                var6_5 ^= var7_4 ^ 404975192;
                                var7_4 = (var5_3 | var8_2) ^ -1974387134;
                                ** break block45
                                break;
                            }
lbl58:
                            // 1 sources

                            while (true) {
                                // MONITOREXIT @DISABLED, blocks:[32, 0, 1, 36] lbl58 : MonitorExitStatement: MONITOREXIT : var3_7
                                var6_5 ^= -551272085;
                                break;
                            }
                        }
                        catch (Throwable v0) {
                            var6_5 = (var5_3 | var8_2) ^ -1968857785;
                            var4_8 = v0;
                            // MONITOREXIT @DISABLED, blocks:[32, 1, 23] lbl64 : MonitorExitStatement: MONITOREXIT : var3_7
                            var6_5 ^= -1456027497;
                            throw var4_8;
                        }
                    }
                    var7_4 = (var5_3 | var8_2) ^ 2122091277;
                    ** break block45
lbl-1000:
                    // 1 sources

                    {
                        while (true) {
                            var6_5 ^= var7_4 ^ 476159592;
                            var7_4 = (var5_3 | var8_2) ^ -960870152;
                            ** break block45
                            break;
                        }
lbl74:
                        // 1 sources

                        return;
                    }
                    break;
                }
            }
            block39: while (true) {
                switch (var7_4) {
                    default: {
                        continue block39;
                    }
                    case -856863577: {
                        ** continue;
                    }
                    case -909094066: {
                        ** continue;
                    }
                    ** case 137031194:
lbl86:
                    // 1 sources

                    ** continue;
                }
                break;
            }
lbl-1000:
            // 6 sources

            {
                block40: while (true) {
                    switch (var7_4) {
                        default: {
                            continue block40;
                        }
                        {
                            case 1468957353: {
                                ** continue;
                            }
                            case -385535571: {
                                ** continue;
                            }
                            case -1622100952: {
                                ** continue;
                            }
                            case 1554466204: {
                                ** continue;
                            }
                        }
                        case -1467289389: {
                            ** continue;
                        }
                        ** case 273429286:
lbl103:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
        }
        block41: while (true) {
            switch (var7_4) {
                default: {
                    continue block41;
                }
                case 1863202558: {
                    ** continue;
                }
                case -2787016: {
                    ** continue;
                }
                case 2095931570: {
                    ** continue;
                }
                case 182397058: {
                    ** continue;
                }
                case -1375290897: {
                    ** continue;
                }
                ** case -638553955:
lbl120:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void VF(class_638 var0, class_2818 var1_1) {
        block28: {
            var6_2 = -520347864;
            var3_3 = gb.i & -520347864 ^ -1102697025;
            var5_4 = 0;
            var4_6 = (var3_3 | var6_2) ^ 1943645179;
            var5_4 = (var3_3 | var6_2) ^ 889379305;
            break block28;
lbl7:
            // 1 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ -671589376;
                break block28;
                break;
            }
            while (true) {
                var5_4 = (var3_3 | var6_2) ^ -554877308;
                ** GOTO lbl36
                break;
            }
        }
        block21: while (true) {
            switch (var5_4) {
                default: {
                    continue block21;
                }
                case -872618410: {
                    var5_4 = (var3_3 | var6_2) ^ 2124668705;
                    continue block21;
                }
                case -2141331298: {
                    var4_6 ^= var5_4 ^ -671161673;
                    ** continue;
                }
                case 688284607: 
            }
            break;
        }
        var2_5 = gb.a;
        var5_4 = (var3_3 | var6_2) ^ -395192124;
        ** GOTO lbl36
lbl28:
        // 1 sources

        while (true) {
            var5_4 = (var3_3 | var6_2) ^ -18443924;
            ** GOTO lbl36
            break;
        }
lbl31:
        // 1 sources

        while (true) {
            var5_4 = (var3_3 | var6_2) ^ -664280377;
            if (true) ** GOTO lbl36
            break;
        }
        block24: while (true) {
            var5_4 = (var3_3 | var6_2) ^ 1741740800;
lbl36:
            // 5 sources

            block25: while (true) {
                switch (var5_4) {
                    default: {
                        continue block25;
                    }
                    case -1724980033: {
                        var5_4 = (var3_3 | var6_2) ^ 1149580057;
                        continue block25;
                    }
                    case 1617619: {
                        var4_6 ^= var5_4 ^ -192907332;
                        var5_4 = (var3_3 | var6_2) ^ 971152923;
                        continue block25;
                    }
                    case 378529659: {
                        var4_6 ^= var5_4 ^ 2133993727;
                        var5_4 = (var3_3 | var6_2) ^ -1896521890;
                        continue block25;
                    }
                    case -888228828: {
                        ** break;
                    }
                    case -790278418: {
                        var2_5.Vn(var1_1.method_12004().method_8324());
                        ** continue;
                    }
                    case 1597657126: {
                        var4_6 ^= var5_4 ^ 464290291;
                        ** continue;
                    }
                    case -1166340954: {
                        if (var0 instanceof class_638) ** continue;
                        ** GOTO lbl77
                    }
                    case 1168248553: {
                        if (var2_5.isEnabled()) {
                            continue block24;
                        }
                        ** GOTO lbl77
                    }
                    case 538116411: {
                        var4_6 ^= var5_4 ^ 236078792;
                        ** GOTO lbl71
                    }
lbl69:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ -1151585962;
                    continue block25;
lbl71:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ 773550417;
                    continue block25;
                    case 1879793889: {
                        if (var2_5 != null) {
                            var5_4 = (var3_3 | var6_2) ^ 904956827;
                            continue block25;
                        }
lbl77:
                        // 4 sources

                        var5_4 = (var3_3 | var6_2) ^ -1580961895;
                        continue block25;
                    }
                    case 647617912: {
                        return;
                    }
                    case -954424924: 
                }
                break;
            }
            break;
        }
    }
}

