/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.minecraft.class_1684
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_4588
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package z.r;

import java.util.Set;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_1684;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_4588;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import z.r.aE;
import z.r.az;
import z.r.gF;
import z.r.gP;
import z.r.gr;
import z.r.ke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class de
extends gF {
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private final az a;
    private static final /* synthetic */ String d;
    private final gP a;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private final Set<UUID> a;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private final gP b;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String j;
    private static final int[] a;
    private static final /* synthetic */ String l;
    private final gP c;
    public static final int a;
    private final gP d;
    private final ke a;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String k;
    private final ke b;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;
    private static final /* synthetic */ String t;
    private static final /* synthetic */ String u;
    private final gP e;
    private static final /* synthetic */ String v;
    private static final /* synthetic */ String w;
    private final aE a;

    private static int iT(int n2, int n3) {
        int n4 = 1376886955;
        int n5 = 1073364434;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xF0311911)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0x7FFBEEA1;
        n6 -= (n5 | n4) ^ 0x7FFBD559;
        n6 += (n5 | n4) ^ 0x7FFB51C1;
        n6 += (n5 | n4) ^ 0x7FFB108A;
        n6 ^= (n5 | n4) ^ 0x7FFB7069;
        n6 += (n5 | n4) ^ 0x7FFB6E5C;
        n6 += (n5 | n4) ^ 0x7FFB017E;
        n6 -= (n5 | n4) ^ 0x7FFB8AD5;
        n6 ^= (n5 | n4) ^ 0x7FFB7D16;
        return n6 ^= (n5 | n4) ^ 0x7FFBD512;
    }

    /*
     * Exception decompiling
     */
    public de() {
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
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public void onEnable() {
        int n2 = a & 0x25A0D2AE ^ 0xDB05614C;
        int n3 = 0;
        int n4 = (n2 | 0x25A0D2AE) ^ 0x317C95A4;
        n3 = (n2 | 0x25A0D2AE) ^ 0x6D56A9C9;
        boolean bl2 = true;
        block5: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n3 = (n2 | 0x25A0D2AE) ^ 0xFCAD3DC9;
            }
            block6: while (true) {
                switch (n3) {
                    default: {
                        continue block6;
                    }
                    case -1654044964: {
                        n4 ^= n3 ^ 0x5C6B1914;
                        continue block5;
                    }
                    case -1829545433: {
                        n3 = (n2 | 0x25A0D2AE) ^ 0x62CCB532;
                        continue block6;
                    }
                    case 50908711: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public void onDisable() {
        int n2 = -1378024751;
        int n3 = a & 0xADDD02D1 ^ 0xCB274C8E;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x3D1BF46A;
        n4 = (n3 | n2) ^ 0xBDEF8F5;
        boolean bl2 = true;
        block7: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = (n3 | n2) ^ 0x81FE0E92;
            }
            block8: while (true) {
                switch (n4) {
                    case -651964304: {
                        n5 ^= n4 ^ 0xB4ADB3DE;
                        n4 = (n3 | n2) ^ 0x6F4C30AD;
                        continue block8;
                    }
                    case -2135720334: {
                        this.a.clear();
                        n4 = (n3 | n2) ^ 0x9E1BAE1;
                        continue block8;
                    }
                    case -434179010: {
                        n5 ^= n4 ^ 0x6C15B030;
                        continue block7;
                    }
                    case -467552726: {
                        n4 = (n3 | n2) ^ 0x36DC9EAF;
                    }
                    default: {
                        continue block8;
                    }
                    case 1845575757: 
                }
                break;
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
    private void iU(class_310 var1_1, class_1684 var2_2) {
        block39: {
            block38: {
                var10_3 = 53241590;
                var7_4 = de.a & 53241590 ^ -1252604882;
                var9_5 = 0;
                var8_7 = (var7_4 | var10_3) ^ 1167879098;
                var9_5 = (var7_4 | var10_3) ^ 1451926709;
                ** GOTO lbl46
lbl7:
                // 1 sources

                while (true) {
                    var9_5 = (var7_4 | var10_3) ^ 1719944395;
                    ** GOTO lbl75
                    break;
                }
                while (true) {
                    var9_5 = (var7_4 | var10_3) ^ -848042281;
                    break block38;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var8_7 ^= -1831595422;
                    gr.send(var1_1, (class_2561)gr.body(de.n).method_10852((class_2561)gr.coords(var4_8, var5_9, var6_10)));
                    var9_5 = (var7_4 | var10_3) ^ 529099693;
                    break block39;
                    break;
                }
lbl18:
                // 2 sources

                while (true) {
                    var9_5 = (var7_4 | var10_3) ^ -684559889;
                    break block38;
                    break;
                }
                while (true) {
                    var9_5 = (var7_4 | var10_3) ^ -1496933504;
                    ** GOTO lbl75
                    break;
                }
            }
            block32: while (true) {
                switch (var9_5) {
                    case 1175055112: {
                        var8_7 ^= var9_5 ^ -811553226;
                        ** break;
                    }
                    case 2006544360: {
                        ** GOTO lbl48
                    }
                    case -1276681939: {
                        if (!((Boolean)this.b.getValue()).booleanValue()) ** GOTO lbl18
                        ** GOTO lbl45
                    }
                    case 2047672361: {
                        var8_7 ^= var9_5 ^ 1683436445;
                        ** GOTO lbl56
                    }
                    case 1615632145: {
                        var8_7 ^= var9_5 ^ -873221296;
                        ** GOTO lbl43
                    }
lbl41:
                    // 1 sources

                    var9_5 = (var7_4 | var10_3) ^ 77170643;
                    ** GOTO lbl46
lbl43:
                    // 1 sources

                    var9_5 = (var7_4 | var10_3) ^ 2121381300;
                    ** GOTO lbl46
lbl45:
                    // 1 sources

                    var9_5 = (var7_4 | var10_3) ^ -1058567914;
lbl46:
                    // 5 sources

                    default: {
                        continue block32;
                    }
lbl48:
                    // 1 sources

                    var9_5 = (var7_4 | var10_3) ^ 1858111138;
                    continue block32;
                    case -421166294: {
                        var3_6 = var2_2.method_5667();
                        var9_5 = (var7_4 | var10_3) ^ -1880980260;
                        ** GOTO lbl75
                    }
                    case -504085941: {
                        ** GOTO lbl61
                    }
lbl56:
                    // 1 sources

                    var9_5 = (var7_4 | var10_3) ^ 1369138644;
                    continue block32;
                    case -641834916: {
                        if (var1_1.field_1724 != null) ** continue;
                        ** continue;
                    }
lbl61:
                    // 1 sources

                    var9_5 = (var7_4 | var10_3) ^ -243855882;
                    continue block32;
                    case -921742518: 
                }
                break;
            }
            return;
lbl65:
            // 1 sources

            while (true) {
                var8_7 ^= -1384134320;
                var6_10 = (int)Math.floor(var2_2.method_23321());
                var9_5 = (var7_4 | var10_3) ^ -1469237841;
                break block39;
                break;
            }
lbl70:
            // 1 sources

            while (true) {
                var9_5 = (var7_4 | var10_3) ^ -575459728;
                if (true) ** GOTO lbl75
                break;
            }
            block35: while (true) {
                var9_5 = (var7_4 | var10_3) ^ 1372461302;
lbl75:
                // 5 sources

                block36: while (true) {
                    switch (var9_5) {
                        default: {
                            continue block36;
                        }
                        case -1980610003: {
                            if (!this.a.contains(var3_6)) ** continue;
                            ** continue;
                        }
                        case -772103627: {
                            this.a.add(var3_6);
                            continue block35;
                        }
                        case 1791871118: {
                            var8_7 ^= var9_5 ^ -1434530017;
                            var9_5 = (var7_4 | var10_3) ^ -723872444;
                            continue block36;
                        }
                        case 949772834: {
                            var8_7 ^= var9_5 ^ -1599199539;
                            var9_5 = (var7_4 | var10_3) ^ 1049406675;
                            continue block36;
                        }
                        case -424608248: {
                            var8_7 ^= var9_5 ^ -1685491428;
                            var9_5 = (var7_4 | var10_3) ^ 690215959;
                            continue block36;
                        }
                        case 297303422: {
                            var8_7 ^= var9_5 ^ -130959604;
                            ** continue;
                        }
                        case -1638057239: {
                            var4_8 = (int)Math.floor(var2_2.method_23317());
                            var8_7 ^= 1718320771;
                            var5_9 = (int)Math.floor(var2_2.method_23318());
                            ** continue;
                        }
                        case 1671721914: 
                    }
                    break;
                }
                break;
            }
            return;
        }
        block37: while (true) {
            switch (var9_5) {
                default: {
                    continue block37;
                }
                case -1460171437: {
                    var8_7 ^= var9_5 ^ 838139316;
                    var9_5 = (var7_4 | var10_3) ^ 2049928994;
                    continue block37;
                }
                case 521392977: {
                    var8_7 ^= var9_5 ^ 1517024619;
                    ** break;
                }
                case 1512786312: {
                    var8_7 ^= -1823991614;
                    ** continue;
                }
lbl123:
                // 1 sources

                var9_5 = (var7_4 | var10_3) ^ -313151626;
                continue block37;
                case -850294308: 
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public void renderWorld(WorldRenderContext var1_1, class_310 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [270[UNCONDITIONALDOLOOP], 263[UNCONDITIONALDOLOOP]], but top level block is 271[UNCONDITIONALDOLOOP]
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
    private double iV(class_1684 var1_1, class_243 var2_2) {
        var12_3 = -1214875231;
        var9_4 = de.a & -1214875231 ^ 1333838378;
        var11_5 = 0;
        var10_6 = (var9_4 | var12_3) ^ -1899505932;
        var11_5 = (var9_4 | var12_3) ^ 1919829612;
        if (true) ** GOTO lbl67
        block21: while (true) {
            var11_5 = (var9_4 | var12_3) ^ -1927996151;
            if (true) ** GOTO lbl12
            block22: while (true) {
                var11_5 = (var9_4 | var12_3) ^ 1546391388;
lbl12:
                // 2 sources

                block23: while (true) {
                    switch (var11_5) {
                        case 1921246882: {
                            var10_6 ^= var11_5 ^ -1270886179;
                            var11_5 = (var9_4 | var12_3) ^ 1791098822;
                            continue block23;
                        }
                        case 1930411123: {
                            var7_9 = var3_7 / var5_8;
                            ** break;
                        }
                        case -1789459347: {
                            if (!(var3_7 < var5_8)) continue block22;
                            var11_5 = (var9_4 | var12_3) ^ 780453348;
                            ** break;
                        }
                        case -787333553: {
                            var10_6 ^= var11_5 ^ -505771083;
                            ** GOTO lbl35
                        }
lbl28:
                        // 1 sources

                        var11_5 = (var9_4 | var12_3) ^ 2053027451;
                        if (true) ** GOTO lbl53
                        case -1548028681: {
                            var10_6 ^= var11_5 ^ 1082960367;
                            var11_5 = (var9_4 | var12_3) ^ -380041246;
                        }
lbl33:
                        // 3 sources

                        default: {
                            continue block23;
                        }
lbl35:
                        // 1 sources

                        var11_5 = (var9_4 | var12_3) ^ -1936111656;
                        continue block23;
                        case 382729289: 
                    }
                    break;
                }
                break;
            }
            return 1.0;
            block24: while (true) {
                switch (var11_5) {
                    case 1900273949: {
                        var10_6 ^= var11_5 ^ -97376470;
                        var11_5 = (var9_4 | var12_3) ^ 1268971656;
                        continue block24;
                    }
                    case -1184390725: {
                        if (!(var7_9 < 0.075)) ** GOTO lbl52
                        ** GOTO lbl59
                    }
                    case -94915763: {
                        var10_6 ^= var11_5 ^ 163333384;
                        var11_5 = (var9_4 | var12_3) ^ 1369641015;
                        ** GOTO lbl53
                    }
lbl52:
                    // 1 sources

                    var11_5 = (var9_4 | var12_3) ^ 96553190;
lbl53:
                    // 5 sources

                    default: {
                        continue block24;
                    }
                    case -2050470448: {
                        var10_6 ^= var11_5 ^ 3147054;
                        var11_5 = (var9_4 | var12_3) ^ 1190222352;
                        ** GOTO lbl53
                    }
lbl59:
                    // 1 sources

                    var11_5 = (var9_4 | var12_3) ^ -1898636618;
                    continue block24;
                    case -1372197988: {
                        return var7_9;
                    }
lbl63:
                    // 1 sources

                    while (true) {
                        var5_8 = Math.max(0.05, (double)((Float)this.e.getValue()).floatValue());
                        continue block21;
                        break;
                    }
lbl-1000:
                    // 1 sources

                    {
                        var11_5 = (var9_4 | var12_3) ^ -257458213;
lbl67:
                        // 2 sources

                        block28: while (true) {
                            switch (var11_5) {
                                default: {
                                    continue block28;
                                }
                                case 254903408: {
                                    var3_7 = Math.sqrt(var1_1.method_5707(var2_2));
                                    var10_6 ^= -1989555825;
                                    ** continue;
                                }
                                case -1913078329: {
                                    var11_5 = (var9_4 | var12_3) ^ -1758070520;
                                    continue block28;
                                }
                                case 1755513507: 
                            }
                            break;
                        }
                        var10_6 ^= var11_5 ^ 871131606;
                        ** while (true)
                    }
                    case -1271659741: 
                }
                break;
            }
            break;
        }
        return 0.0;
    }

    /*
     * Unable to fully structure code
     */
    private static class_238 iW(class_1684 var0, float var1_1) {
        block13: {
            block17: {
                block15: {
                    block14: {
                        block16: {
                            var10_2 = de.a & 670001918 ^ -776030167;
                            var12_3 = 0;
                            break block16;
lbl4:
                            // 1 sources

                            while (true) {
                                var12_3 = (var10_2 | 670001918) ^ -1725270065;
                                break block13;
                                break;
                            }
lbl7:
                            // 1 sources

                            while (true) {
                                var11_4 ^= 481979537;
                                break block14;
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
                                var11_4 ^= var12_3 ^ -1046460966;
                                ** continue;
                                break;
                            }
                        }
                        var11_4 = (var10_2 | 670001918) ^ 1552124292;
                        var12_3 = (var10_2 | 670001918) ^ 1735868374;
                        break block13;
lbl19:
                        // 1 sources

                        return var3_6.method_989(var4_7, var6_8, var8_9);
lbl21:
                        // 1 sources

                        while (true) {
                            var11_4 ^= 2136595263;
                            break block15;
lbl24:
                            // 1 sources

                            while (true) {
                                var11_4 ^= -271479235;
                                ** continue;
                                break;
                            }
                            break;
                        }
                    }
                    var3_6 = var0.method_5829();
                    var11_4 ^= 37765880;
                    break block17;
                }
                var6_8 = var2_5.field_1351 - var0.method_23318();
                ** while (true)
            }
            var4_7 = var2_5.field_1352 - var0.method_23317();
            ** while (true)
        }
        block12: while (true) {
            switch (var12_3) {
                default: {
                    continue block12;
                }
                case -1870084823: {
                    break;
                }
                case -1219155681: {
                    ** continue;
                }
            }
            var12_3 = (var10_2 | 670001918) ^ 1084937184;
        }
        var8_9 = var2_5.field_1350 - var0.method_23321();
        var11_4 ^= 1258536221;
        ** while (true)
        {
            ** case 1859489072:
        }
lbl52:
        // 1 sources

        var2_5 = var0.method_30950(var1_1);
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
    private static void iX(class_4588 var0, Matrix4f var1_2, double var2_4, double var4_5, double var6_6, double var8_7, double var10_8, double var12_9, int var14_10, int var15_11, int var16_1, int var17_3) {
        block67: {
            block66: {
                block63: {
                    block65: {
                        block64: {
                            block68: {
                                break block68;
lbl1:
                                // 1 sources

                                while (true) {
                                    var26_14 = (var24_13 | var27_12) ^ 2049752796;
                                    ** GOTO lbl62
lbl4:
                                    // 1 sources

                                    while (true) {
                                        var25_21 ^= var26_14 ^ 1393309603;
                                        ** GOTO lbl119
                                        break;
                                    }
lbl7:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    break;
                                }
                            }
                            var27_12 = -1139471603;
                            var24_13 = de.a & -1139471603 ^ -1418806952;
                            var26_14 = 0;
                            var25_21 = (var24_13 | var27_12) ^ -1796850669;
                            ** GOTO lbl84
lbl15:
                            // 1 sources

                            while (true) {
                                var26_14 = (var24_13 | var27_12) ^ -386885456;
                                ** GOTO lbl62
lbl18:
                                // 1 sources

                                while (true) {
                                    var26_14 = (var24_13 | var27_12) ^ 460528976;
                                    ** GOTO lbl62
lbl21:
                                    // 1 sources

                                    while (true) {
                                        var26_14 = (var24_13 | var27_12) ^ 63404830;
                                        ** GOTO lbl62
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
lbl24:
                            // 2 sources

                            block39: while (true) {
                                switch (var26_14) lbl-1000:
                                // 2 sources

                                {
                                    default: {
                                        continue block39;
                                    }
lbl28:
                                    // 1 sources

                                    while (true) {
                                        var26_14 = (var24_13 | var27_12) ^ 1715217458;
                                        ** GOTO lbl62
                                        break;
                                    }
lbl31:
                                    // 1 sources

                                    while (true) {
                                        var25_21 ^= var26_14 ^ 1697397655;
                                        break block63;
                                        break;
                                    }
lbl34:
                                    // 1 sources

                                    while (true) {
                                        var26_14 = (var24_13 | var27_12) ^ -2019913309;
                                        ** GOTO lbl62
lbl37:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                        break;
                                    }
lbl39:
                                    // 1 sources

                                    block45: while (true) {
                                        var26_14 = (var24_13 | var27_12) ^ -708709412;
                                        ** GOTO lbl62
lbl42:
                                        // 1 sources

                                        while (true) {
                                            var26_14 = (var24_13 | var27_12) ^ 1894638981;
                                            ** GOTO lbl62
lbl45:
                                            // 1 sources

                                            while (true) {
                                                var25_21 ^= var26_14 ^ -1997668711;
                                                ** continue;
                                                break;
                                            }
lbl48:
                                            // 1 sources

                                            while (true) {
                                                var26_14 = (var24_13 | var27_12) ^ 994897815;
                                                ** GOTO lbl62
lbl51:
                                                // 1 sources

                                                while (true) {
                                                    var25_21 ^= var26_14 ^ 1577007435;
                                                    ** continue;
                                                    break;
                                                }
lbl54:
                                                // 1 sources

                                                while (true) {
                                                    var25_21 ^= var26_14 ^ -2101322833;
                                                    break block64;
                                                    break;
                                                }
lbl57:
                                                // 1 sources

                                                while (true) {
                                                    var26_14 = (var24_13 | var27_12) ^ -1695099952;
                                                    ** GOTO lbl62
lbl60:
                                                    // 1 sources

                                                    while (true) {
                                                        var26_14 = (var24_13 | var27_12) ^ -1634784748;
lbl62:
                                                        // 22 sources

                                                        block53: while (true) {
                                                            switch (var26_14) lbl-1000:
                                                            // 5 sources

                                                            {
                                                                while (true) {
                                                                    default: {
                                                                        continue block53;
                                                                    }
                                                                    break;
                                                                }
                                                                case 589435920: {
                                                                    ** continue;
                                                                }
                                                                case -1649623813: {
                                                                    ** continue;
                                                                }
                                                                case -1047133369: {
                                                                    ** continue;
                                                                }
                                                                case -1979093077: {
                                                                    ** continue;
                                                                }
                                                                case 1149816939: {
                                                                    ** continue;
                                                                }
                                                                case 624475344: {
                                                                    ** continue;
                                                                }
                                                                case 1790855297: {
                                                                    ** continue;
                                                                }
                                                                case 569413961: {
                                                                    var25_21 ^= var26_14 ^ -311654454;
                                                                    break block45;
                                                                }
lbl84:
                                                                // 1 sources

                                                                var26_14 = (var24_13 | var27_12) ^ 1050218660;
                                                                ** GOTO lbl-1000
lbl86:
                                                                // 1 sources

                                                                while (true) {
                                                                    var26_14 = (var24_13 | var27_12) ^ 266154920;
                                                                    ** GOTO lbl-1000
                                                                    break;
                                                                }
                                                                case -649879697: {
                                                                    de.iY(var0, var1_2, var21_18, var19_16, var23_20, var18_15, var19_16, var23_20, var14_10, var15_11, var16_1, var17_3, 1.0f);
                                                                    ** continue;
                                                                }
                                                                case -1038617491: {
                                                                    var25_21 ^= var26_14 ^ 1096165691;
                                                                    break block65;
                                                                }
lbl95:
                                                                // 1 sources

                                                                while (true) {
                                                                    var26_14 = (var24_13 | var27_12) ^ 2129246234;
                                                                    ** GOTO lbl-1000
                                                                    break;
                                                                }
                                                                case 629762189: {
                                                                    de.iY(var0, var1_2, var21_18, var19_16, var23_20, var21_18, var22_19, var23_20, var14_10, var15_11, var16_1, var17_3, 1.0f);
                                                                    ** GOTO lbl114
                                                                }
                                                                case -2115589127: {
                                                                    break block66;
                                                                }
lbl103:
                                                                // 1 sources

                                                                while (true) {
                                                                    var26_14 = (var24_13 | var27_12) ^ -762677893;
                                                                    ** GOTO lbl-1000
                                                                    break;
                                                                }
lbl106:
                                                                // 1 sources

                                                                while (true) {
                                                                    var26_14 = (var24_13 | var27_12) ^ -1671581875;
                                                                    ** continue;
                                                                    break;
                                                                }
                                                                case 1941853652: {
                                                                    de.iY(var0, var1_2, var21_18, var19_16, var20_17, var21_18, var22_19, var20_17, var14_10, var15_11, var16_1, var17_3, 1.0f);
                                                                    ** continue;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    var26_14 = (var24_13 | var27_12) ^ 1981741697;
                                    ** GOTO lbl62
lbl114:
                                    // 1 sources

                                    var26_14 = (var24_13 | var27_12) ^ -271930006;
                                    ** GOTO lbl62
lbl116:
                                    // 1 sources

                                    while (true) {
                                        var26_14 = (var24_13 | var27_12) ^ -1706621043;
                                        ** GOTO lbl62
                                        break;
                                    }
lbl119:
                                    // 1 sources

                                    var26_14 = (var24_13 | var27_12) ^ 780118957;
                                    ** GOTO lbl62
                                    {
                                        case -812491048: {
                                            var25_21 ^= var26_14 ^ 2052739138;
                                            ** continue;
                                        }
                                        case 1147386072: {
                                            var25_21 ^= var26_14 ^ 888751983;
                                            ** continue;
                                        }
                                    }
lbl127:
                                    // 1 sources

                                    while (true) {
                                        var26_14 = (var24_13 | var27_12) ^ -1288004720;
                                        ** GOTO lbl62
                                        break;
                                    }
                                    {
                                        case -1542674931: {
                                            return;
                                        }
                                        case -916373028: {
                                            de.iY(var0, var1_2, var21_18, var22_19, var20_17, var21_18, var22_19, var23_20, var14_10, var15_11, var16_1, var17_3, 1.0f);
                                            ** continue;
                                        }
                                        case -1128742845: {
                                            de.iY(var0, var1_2, var21_18, var19_16, var20_17, var21_18, var19_16, var23_20, var14_10, var15_11, var16_1, var17_3, 1.0f);
                                            ** continue;
                                        }
                                        case 1354044983: {
                                            var25_21 ^= var26_14 ^ 621041214;
                                            ** continue;
                                        }
                                        case -984414847: {
                                            de.iY(var0, var1_2, var18_15, var22_19, var20_17, var21_18, var22_19, var20_17, var14_10, var15_11, var16_1, var17_3, 1.0f);
                                            ** continue;
                                        }
                                        case -2077010742: {
                                            var25_21 ^= var26_14 ^ 530973741;
                                            ** continue;
                                        }
                                    }
                                    de.iY(var0, var1_2, var18_15, var19_16, var20_17, var21_18, var19_16, var20_17, var14_10, var15_11, var16_1, var17_3, 1.0f);
                                    var26_14 = (var24_13 | var27_12) ^ -67671242;
                                    ** GOTO lbl62
                                    {
                                        case 954542846: {
                                            var25_21 ^= var26_14 ^ 97665213;
                                            break;
                                        }
                                    }
lbl153:
                                    // 1 sources

                                    while (true) {
                                        var25_21 ^= 2049594796;
                                        break block67;
                                        break;
                                    }
                                    {
                                        case 1844825638: {
                                            var25_21 ^= var26_14 ^ -1792328287;
                                            ** continue;
                                        }
                                        case -1019604838: {
                                            de.iY(var0, var1_2, var21_18, var22_19, var23_20, var18_15, var22_19, var23_20, var14_10, var15_11, var16_1, var17_3, 1.0f);
                                            ** continue;
                                        }
                                    }
                                    case 220345357: {
                                        var18_15 = (float)var2_4;
                                        var19_16 = (float)var4_5;
                                        var20_17 = (float)var6_6;
                                        break block39;
                                    }
                                }
                                break;
                            }
                            ** while (true)
                        }
                        var26_14 = (var24_13 | var27_12) ^ 896980214;
                        ** GOTO lbl62
lbl171:
                        // 1 sources

                        while (true) {
                            var26_14 = (var24_13 | var27_12) ^ 584255398;
                            ** GOTO lbl62
                            break;
                        }
                    }
                    var26_14 = (var24_13 | var27_12) ^ -1302491312;
                    ** GOTO lbl24
                }
                var26_14 = (var24_13 | var27_12) ^ -859705719;
                ** GOTO lbl62
                {
                    case 205856973: {
                        de.iY(var0, var1_2, var18_15, var22_19, var23_20, var18_15, var22_19, var20_17, var14_10, var15_11, var16_1, var17_3, 1.0f);
                        ** continue;
                    }
                    case -1862266640: {
                        de.iY(var0, var1_2, var18_15, var19_16, var20_17, var18_15, var22_19, var20_17, var14_10, var15_11, var16_1, var17_3, 1.0f);
                        ** continue;
                    }
                }
                var26_14 = (var24_13 | var27_12) ^ 2084940743;
                ** GOTO lbl62
            }
            var26_14 = (var24_13 | var27_12) ^ 2103988016;
            ** while (true)
            {
                case 1468998637: {
                    de.iY(var0, var1_2, var18_15, var19_16, var23_20, var18_15, var22_19, var23_20, var14_10, var15_11, var16_1, var17_3, 1.0f);
                    ** continue;
                }
            }
        }
        var21_18 = (float)var8_7;
        var22_19 = (float)var10_8;
        var23_20 = (float)var12_9;
        ** while (true)
        de.iY(var0, var1_2, var18_15, var19_16, var23_20, var18_15, var19_16, var20_17, var14_10, var15_11, var16_1, var17_3, 1.0f);
        var26_14 = (var24_13 | var27_12) ^ -82050171;
        ** while (true)
        {
            ** case -1331525387:
        }
lbl203:
        // 1 sources

        var25_21 ^= var26_14 ^ -1261362254;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void iY(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, int var10_10, int var11_11, float var12_12) {
        var25_13 = -1114134531;
        var22_14 = de.a & -1114134531 ^ -1854963647;
        var24_15 = 0;
        var23_16 = (var22_14 | var25_13) ^ 1842613012;
        var24_15 = (var22_14 | var25_13) ^ -1048795037;
        if (true) ** GOTO lbl9
        block25: while (true) {
            var24_15 = (var22_14 | var25_13) ^ 1587628907;
lbl9:
            // 2 sources

            block26: while (true) {
                block32: {
                    switch (var24_15) {
                        default: {
                            continue block26;
                        }
                        case -1156304830: {
                            var23_16 ^= var24_15 ^ -445735419;
                            continue block25;
                        }
                        case -480318314: {
                            var13_17 = var5_5 - var2_2;
                            var14_18 = var6_6 - var3_3;
                            var15_19 = var7_7 - var4_4;
                            break;
                        }
                        case 2088963998: {
                            break block32;
                        }
                    }
                    var23_16 ^= 927410805;
                    var16_20 = Math.sqrt(var13_17 * var13_17 + var14_18 * var14_18 + var15_19 * var15_19);
                    var23_16 ^= -905383348;
                    var18_21 = 0.0f;
                    var19_22 = 1.0f;
                    var20_23 = 0.0f;
                    var24_15 = (var22_14 | var25_13) ^ -206713546;
                    ** GOTO lbl109
                }
                var24_15 = (var22_14 | var25_13) ^ 116103103;
            }
            break;
        }
lbl34:
        // 1 sources

        while (true) {
            var24_15 = (var22_14 | var25_13) ^ -1173145221;
            if (true) ** GOTO lbl72
            break;
        }
        block28: while (true) {
            block33: {
                switch (var24_15) {
                    case -2004194641: {
                        var23_16 ^= var24_15 ^ 1905066554;
                        var24_15 = (var22_14 | var25_13) ^ 1765809095;
                        continue block28;
                    }
                    case -891828678: {
                        var23_16 ^= var24_15 ^ -483033331;
                        ** GOTO lbl59
                    }
                    case 914779536: {
                        var18_21 = var13_17 * var21_24;
                        ** break;
                    }
                    case 1881356217: {
                        var20_23 = var15_19 * var21_24;
                        break block33;
                    }
                    case 1285168691: {
                        var23_16 ^= var24_15 ^ -542962507;
                        var24_15 = (var22_14 | var25_13) ^ -841183164;
                    }
                    default: {
                        continue block28;
                    }
lbl57:
                    // 1 sources

                    var24_15 = (var22_14 | var25_13) ^ 896912722;
                    continue block28;
lbl59:
                    // 1 sources

                    var24_15 = (var22_14 | var25_13) ^ -1954952595;
                    continue block28;
                    case -725631942: 
                }
                var19_22 = var14_18 * var21_24;
                var24_15 = (var22_14 | var25_13) ^ -244991538;
                continue;
            }
            while (true) {
                var24_15 = (var22_14 | var25_13) ^ -1553701400;
                ** break;
                break;
            }
lbl69:
            // 1 sources

            while (true) {
                var24_15 = (var22_14 | var25_13) ^ -1213554413;
                ** break;
                break;
            }
lbl72:
            // 1 sources

            block31: while (true) {
                block34: {
                    switch (var24_15) {
                        case -1164078760: {
                            var23_16 ^= var24_15 ^ -1676320919;
                            ** GOTO lbl96
                        }
                        case 132947590: {
                            var23_16 ^= var24_15 ^ 1144020386;
                            var24_15 = (var22_14 | var25_13) ^ -148502209;
                            continue block31;
                        }
                        case -1931342080: {
                            var23_16 ^= var24_15 ^ 1952673260;
                            ** continue;
                        }
                        case -2113955528: {
                            var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var4_4).method_1336(var8_8, var9_9, var10_10, var11_11).method_22914(var18_21, var19_22, var20_23).method_75298(var12_12);
                            ** break;
                        }
                        case 1314024139: {
                            var23_16 ^= var24_15 ^ 75356358;
                            ** GOTO lbl108
                        }
                        case 1717172613: {
                            if (!(var16_20 > 1.0E-5)) ** continue;
                            ** continue;
                        }
lbl94:
                        // 1 sources

                        var24_15 = (var22_14 | var25_13) ^ 123877029;
                        ** GOTO lbl109
lbl96:
                        // 1 sources

                        var24_15 = (var22_14 | var25_13) ^ -1798642689;
                        ** GOTO lbl109
                        case 513524245: {
                            var23_16 ^= var24_15 ^ 1424658317;
                            break block34;
                        }
                        case 173344494: {
                            return;
                        }
                        case 691356674: {
                            var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var7_7).method_1336(var8_8, var9_9, var10_10, var11_11).method_22914(var18_21, var19_22, var20_23).method_75298(var12_12);
                            var24_15 = (var22_14 | var25_13) ^ 824027389;
                            ** GOTO lbl109
                        }
lbl108:
                        // 1 sources

                        var24_15 = (var22_14 | var25_13) ^ -609853832;
lbl109:
                        // 6 sources

                        default: lbl-1000:
                        // 3 sources

                        {
                            continue block31;
                        }
                        case 1255780034: 
                    }
                    var21_24 = (float)(1.0 / var16_20);
                    ** break;
lbl114:
                    // 1 sources

                    var24_15 = (var22_14 | var25_13) ^ 1999135175;
                    continue block28;
                }
                var24_15 = (var22_14 | var25_13) ^ 1006649029;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private static void iZ(class_4588 var0, Matrix4f var1_1, class_238 var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
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
    private static void ja(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8, int var9_9, int var10_10, int var11_11, boolean var12_12) {
        block51: {
            block46: {
                block49: {
                    block44: {
                        block43: {
                            block40: {
                                block48: {
                                    block47: {
                                        block41: {
                                            break block49;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl3:
                                            // 1 sources

                                            while (true) {
                                                var14_16 ^= var15_15 ^ 849428628;
                                                break block40;
                                                break;
                                            }
lbl6:
                                            // 1 sources

                                            return;
lbl8:
                                            // 1 sources

                                            while (true) {
                                                block45: {
                                                    block42: {
                                                        var15_15 = (var13_14 | var16_13) ^ 788500718;
                                                        break block45;
lbl11:
                                                        // 1 sources

                                                        while (true) {
                                                            var14_16 ^= var15_15 ^ 1533877122;
                                                            break block41;
                                                            break;
                                                        }
lbl14:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
lbl16:
                                                        // 1 sources

                                                        while (true) {
                                                            var14_16 ^= var15_15 ^ 703810403;
                                                            break block42;
                                                            break;
                                                        }
lbl19:
                                                        // 1 sources

                                                        while (var12_12) {
                                                            break block43;
lbl21:
                                                            // 1 sources

                                                            while (true) {
                                                                var14_16 ^= var15_15 ^ -410378898;
                                                                break block44;
                                                                break;
                                                            }
lbl24:
                                                            // 1 sources

                                                            while (true) {
                                                                var15_15 = (var13_14 | var16_13) ^ 1906414447;
                                                                break block45;
                                                                break;
                                                            }
                                                        }
                                                        break block46;
                                                    }
                                                    var15_15 = (var13_14 | var16_13) ^ -442426399;
                                                }
lbl31:
                                                // 13 sources

                                                block33: while (true) {
                                                    block50: {
                                                        switch (var15_15) lbl-1000:
                                                        // 4 sources

                                                        {
                                                            while (true) {
                                                                default: {
                                                                    continue block33;
                                                                }
                                                                break;
                                                            }
                                                            case -1379482017: {
                                                                ** continue;
                                                            }
                                                            case 661575205: {
                                                                ** continue;
                                                            }
                                                            case -2090821319: {
                                                                ** continue;
                                                            }
                                                            case -592308807: {
                                                                ** continue;
                                                            }
                                                            case 611624517: {
                                                                ** continue;
                                                            }
                                                            case -1524915266: {
                                                                ** continue;
                                                            }
                                                            case 742292662: {
                                                                ** GOTO lbl19
                                                            }
                                                            case -778777516: {
                                                                ** continue;
                                                            }
                                                            case 2009735524: {
                                                                var14_16 ^= var15_15 ^ -912200046;
                                                                break;
                                                            }
lbl55:
                                                            // 1 sources

                                                            while (true) {
                                                                var15_15 = (var13_14 | var16_13) ^ 939139047;
                                                                ** GOTO lbl-1000
                                                                break;
                                                            }
lbl58:
                                                            // 2 sources

                                                            while (true) {
                                                                var15_15 = (var13_14 | var16_13) ^ -2127693216;
                                                                ** GOTO lbl-1000
                                                                break;
                                                            }
                                                            case -673779642: {
                                                                var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var7_7).method_1336(var8_8, var9_9, var10_10, var11_11);
                                                                ** GOTO lbl58
                                                            }
lbl65:
                                                            // 1 sources

                                                            while (true) {
                                                                var15_15 = (var13_14 | var16_13) ^ -359350909;
                                                                ** continue;
                                                                break;
                                                            }
                                                            case -1223994790: {
                                                                var14_16 ^= var15_15 ^ -535332467;
                                                                ** continue;
                                                            }
                                                        }
                                                        var15_15 = (var13_14 | var16_13) ^ -1974919265;
                                                        continue;
                                                        {
                                                            case 1587842479: {
                                                                var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var7_7).method_1336(var8_8, var9_9, var10_10, var11_11);
                                                                break block50;
                                                            }
                                                            case -1174971350: {
                                                                break block47;
                                                            }
                                                        }
lbl79:
                                                        // 1 sources

                                                        while (true) {
                                                            var15_15 = (var13_14 | var16_13) ^ 2062629372;
                                                            continue block33;
                                                            break;
                                                        }
                                                    }
                                                    var15_15 = (var13_14 | var16_13) ^ 710266557;
                                                    continue;
                                                    {
                                                        case 1178288094: {
                                                            var14_16 ^= var15_15 ^ -148352673;
                                                            break block48;
                                                        }
                                                    }
                                                    break;
                                                }
                                                break;
                                            }
                                            var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var4_4).method_1336(var8_8, var9_9, var10_10, var11_11);
                                            var15_15 = (var13_14 | var16_13) ^ -1945427059;
                                            ** GOTO lbl31
lbl92:
                                            // 1 sources

                                            while (true) {
                                                var15_15 = (var13_14 | var16_13) ^ 2045462940;
                                                ** GOTO lbl31
                                                break;
                                            }
                                        }
                                        var15_15 = (var13_14 | var16_13) ^ -553683232;
                                        ** GOTO lbl31
                                    }
                                    var15_15 = (var13_14 | var16_13) ^ 197687511;
                                    ** GOTO lbl31
                                }
                                var15_15 = (var13_14 | var16_13) ^ 544015751;
                                ** GOTO lbl31
                                {
                                    case 1448580878: {
                                        var14_16 ^= var15_15 ^ 1396519009;
                                        ** continue;
                                    }
                                }
                            }
                            var15_15 = (var13_14 | var16_13) ^ -262592122;
                            ** GOTO lbl31
                            {
                                case 1935703863: {
                                    var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var4_4).method_1336(var8_8, var9_9, var10_10, var11_11);
                                    ** continue;
                                }
                                case 2113071710: {
                                    var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var4_4).method_1336(var8_8, var9_9, var10_10, var11_11);
                                    ** continue;
                                }
                            }
                            var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var4_4).method_1336(var8_8, var9_9, var10_10, var11_11);
                            var15_15 = (var13_14 | var16_13) ^ -125547417;
                            ** GOTO lbl31
                            {
                                case -1203833800: {
                                    var0.method_22918((Matrix4fc)var1_1, var2_2, var3_3, var7_7).method_1336(var8_8, var9_9, var10_10, var11_11);
                                    ** continue;
                                }
                                case 1785065534: {
                                    var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var7_7).method_1336(var8_8, var9_9, var10_10, var11_11);
                                    break;
                                }
                            }
                        }
                        var15_15 = (var13_14 | var16_13) ^ 463785991;
                        ** GOTO lbl31
                    }
                    var15_15 = (var13_14 | var16_13) ^ 54223478;
                    ** GOTO lbl31
                }
                var16_13 = 1292848577;
                var13_14 = de.a & 1292848577 ^ 1351655961;
                var15_15 = 0;
                break block51;
                {
                    case -360286495: {
                        var14_16 ^= var15_15 ^ 298849034;
                        ** continue;
                    }
                }
                var15_15 = (var13_14 | var16_13) ^ -1872463344;
                ** GOTO lbl31
                {
                    ** case -839150135:
                }
lbl147:
                // 1 sources

                var14_16 ^= var15_15 ^ -1041115692;
                ** while (true)
            }
            var15_15 = (var13_14 | var16_13) ^ -1223059144;
            ** GOTO lbl31
        }
        var14_16 = (var13_14 | var16_13) ^ 1174984789;
        var15_15 = (var13_14 | var16_13) ^ -462900237;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static void jb(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, int var7_7, int var8_8, int var9_9, int var10_10, boolean var11_11) {
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
    private static void jc(class_4588 var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, int var7_7, int var8_8, int var9_9, int var10_10, boolean var11_11) {
        block52: {
            block61: {
                block60: {
                    block58: {
                        block59: {
                            block56: {
                                block55: {
                                    block57: {
                                        block53: {
                                            block62: {
                                                block54: {
                                                    var15_12 = 1862698871;
                                                    var12_13 = de.a & 1862698871 ^ -1806375649;
                                                    var14_14 = 0;
                                                    break block62;
lbl5:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl7:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl9:
                                                    // 1 sources

                                                    while (true) {
                                                        var14_14 = (var12_13 | var15_12) ^ -1185707224;
                                                        break block52;
                                                        break;
                                                    }
lbl12:
                                                    // 1 sources

                                                    while (true) {
                                                        var0.method_22918((Matrix4fc)var1_1, var3_3, var6_6, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                                                        ** continue;
                                                        break;
                                                    }
lbl16:
                                                    // 1 sources

                                                    while (true) {
                                                        var13_15 ^= var14_14 ^ -1615220780;
                                                        break block53;
                                                        break;
                                                    }
                                                    var0.method_22918((Matrix4fc)var1_1, var3_3, var4_4, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                                                    var14_14 = (var12_13 | var15_12) ^ 210549840;
                                                    break block52;
lbl23:
                                                    // 1 sources

                                                    while (true) {
                                                        var13_15 ^= var14_14 ^ 893795184;
                                                        break block54;
                                                        break;
                                                    }
lbl26:
                                                    // 1 sources

                                                    while (true) {
                                                        var14_14 = (var12_13 | var15_12) ^ 1907733280;
                                                        break block52;
                                                        break;
                                                    }
lbl29:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl31:
                                                    // 1 sources

                                                    return;
lbl33:
                                                    // 1 sources

                                                    while (true) {
                                                        var13_15 ^= var14_14 ^ -2001209235;
                                                        break block55;
                                                        break;
                                                    }
                                                    var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                                                    var14_14 = (var12_13 | var15_12) ^ -192104159;
                                                    break block52;
lbl40:
                                                    // 1 sources

                                                    while (true) {
                                                        var14_14 = (var12_13 | var15_12) ^ -66767928;
                                                        break block52;
                                                        break;
                                                    }
lbl43:
                                                    // 1 sources

                                                    while (true) {
                                                        var14_14 = (var12_13 | var15_12) ^ 1550735415;
                                                        break block52;
                                                        break;
                                                    }
                                                }
                                                var14_14 = (var12_13 | var15_12) ^ 1305068736;
                                                break block52;
                                            }
                                            var13_15 = (var12_13 | var15_12) ^ 1910576910;
                                            var14_14 = (var12_13 | var15_12) ^ 602158191;
                                            break block52;
lbl53:
                                            // 1 sources

                                            while (true) {
                                                var14_14 = (var12_13 | var15_12) ^ 1443570779;
                                                break block52;
lbl56:
                                                // 1 sources

                                                while (true) {
                                                    var14_14 = (var12_13 | var15_12) ^ -258134114;
                                                    break block52;
                                                    break;
                                                }
lbl59:
                                                // 1 sources

                                                while (true) {
                                                    var13_15 ^= var14_14 ^ -876987700;
                                                    ** continue;
                                                    break;
                                                }
lbl62:
                                                // 1 sources

                                                while (true) {
                                                    var14_14 = (var12_13 | var15_12) ^ 1668230428;
                                                    break block52;
                                                    break;
                                                }
                                                break;
                                            }
                                            var0.method_22918((Matrix4fc)var1_1, var5_5, var6_6, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                                            var14_14 = (var12_13 | var15_12) ^ -695056892;
                                            break block52;
lbl69:
                                            // 1 sources

                                            while (true) {
                                                var13_15 ^= var14_14 ^ -1599071645;
                                                break block56;
                                                break;
                                            }
lbl72:
                                            // 1 sources

                                            while (true) {
                                                var14_14 = (var12_13 | var15_12) ^ 191185103;
                                                break block52;
                                                break;
                                            }
lbl75:
                                            // 1 sources

                                            while (true) {
                                                var13_15 ^= var14_14 ^ -985287100;
                                                break block57;
                                                break;
                                            }
lbl78:
                                            // 1 sources

                                            while (true) {
                                                var0.method_22918((Matrix4fc)var1_1, var3_3, var4_4, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                                                ** continue;
                                                break;
                                            }
                                        }
                                        var14_14 = (var12_13 | var15_12) ^ 2035491333;
                                        break block52;
lbl85:
                                        // 1 sources

                                        while (true) {
                                            var0.method_22918((Matrix4fc)var1_1, var5_5, var4_4, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                                            break block58;
                                            break;
                                        }
                                    }
                                    var14_14 = (var12_13 | var15_12) ^ 1247144488;
                                    break block52;
lbl92:
                                    // 1 sources

                                    while (true) {
                                        var0.method_22918((Matrix4fc)var1_1, var5_5, var4_4, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                                        ** continue;
                                        break;
                                    }
lbl96:
                                    // 1 sources

                                    while (true) {
                                        if (!var11_11) break block59;
                                        break block60;
                                        break;
                                    }
                                }
                                var14_14 = (var12_13 | var15_12) ^ -1303658162;
                                break block52;
                            }
                            var14_14 = (var12_13 | var15_12) ^ -983496369;
                            break block52;
lbl105:
                            // 1 sources

                            while (true) {
                                var13_15 ^= var14_14 ^ 85849882;
                                ** continue;
                                break;
                            }
lbl108:
                            // 1 sources

                            while (true) {
                                var13_15 ^= var14_14 ^ 972307829;
                                ** continue;
                                break;
                            }
                        }
                        var14_14 = (var12_13 | var15_12) ^ -1039069505;
                        break block52;
                    }
lbl115:
                    // 2 sources

                    while (true) {
                        var14_14 = (var12_13 | var15_12) ^ 1134844970;
                        break block52;
                        break;
                    }
                }
                var14_14 = (var12_13 | var15_12) ^ -1237518253;
                break block52;
lbl121:
                // 1 sources

                while (true) {
                    var13_15 ^= var14_14 ^ -1455499477;
                    break block61;
                    break;
                }
lbl124:
                // 1 sources

                while (true) {
                    var0.method_22918((Matrix4fc)var1_1, var3_3, var6_6, var2_2).method_1336(var7_7, var8_8, var9_9, var10_10);
                    ** continue;
                    break;
                }
            }
            var14_14 = (var12_13 | var15_12) ^ -510698303;
        }
        block51: while (true) {
            switch (var14_14) {
                default: {
                    continue block51;
                }
                case 55825591: {
                    ** continue;
                }
                case -592260336: {
                    ** continue;
                }
                case -1298193473: {
                    ** continue;
                }
                case -1258091177: {
                    ** continue;
                }
                case 700752251: {
                    ** continue;
                }
                case 265013473: {
                    ** continue;
                }
                case -197941328: {
                    ** continue;
                }
                case 976743984: {
                    ** continue;
                }
                case 198860382: {
                    ** continue;
                }
                case -203793617: {
                    ** continue;
                }
                case -1124943019: {
                    ** continue;
                }
                case -1897704353: {
                    ** continue;
                }
                case -1453472988: {
                    ** continue;
                }
                case 1293755953: {
                    ** continue;
                }
                case -1556562104: {
                    ** continue;
                }
                case 517585854: {
                    ** continue;
                }
                case 1231691564: {
                    ** continue;
                }
                case 1174760535: {
                    ** continue;
                }
                case -1673934237: {
                    ** continue;
                }
                case -2046442118: {
                    ** continue;
                }
                case 1028123072: 
            }
            break;
        }
        var13_15 ^= var14_14 ^ 1922730017;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean jd(class_1684 class_16842) {
        int n2 = a & 0xEA87FE89 ^ 0xB8C9CCE5;
        int n3 = 0;
        int n4 = (n2 | 0xEA87FE89) ^ 0x84401AAA;
        n3 = (n2 | 0xEA87FE89) ^ 0x5AC2229C;
        block5: while (true) {
            switch (n3) {
                case -1993619707: {
                    return true;
                }
                case -2138972270: {
                    n4 ^= n3 ^ 0x629074B3;
                    n3 = (n2 | 0xEA87FE89) ^ 0x73E439E8;
                }
                default: {
                    continue block5;
                }
                case -1609704335: 
            }
            n3 = (n2 | 0xEA87FE89) ^ 0x7A4E217F;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean je(class_1684 class_16842) {
        int n2 = a & 0xE16D0232 ^ 0x4A9DB3DD;
        int n3 = 0;
        int n4 = (n2 | 0xE16D0232) ^ 0xD1B197BD;
        n3 = (n2 | 0xE16D0232) ^ 0xA8D6576D;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1126950034: {
                    break;
                }
                case 1609724131: {
                    n4 ^= n3 ^ 0x1CB921F9;
                    n3 = (n2 | 0xE16D0232) ^ 0x75FF0E4;
                    continue block5;
                }
                case -324910309: {
                    return true;
                }
            }
            n3 = (n2 | 0xE16D0232) ^ 0xB40FC31C;
        }
    }
}

