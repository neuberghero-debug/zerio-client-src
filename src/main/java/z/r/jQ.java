/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1799
 *  net.minecraft.class_2338
 *  net.minecraft.class_310
 */
package z.r;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_310;
import z.r.ak;
import z.r.eI;
import z.r.hq;
import z.r.kY;
import z.r.mD;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class jQ {
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private int a;
    private boolean a;
    private static final /* synthetic */ String c;
    private int b;
    private static final /* synthetic */ String d;
    private int c;
    private static final /* synthetic */ String e;
    private static final int[] a;
    private hq a;
    public static final int d;
    private final ak a;

    /*
     * Exception decompiling
     */
    public jQ(ak var1_1) {
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
    public void reset() {
        int n2 = -1561723296;
        int n3 = d & 0xA2E9FE60 ^ 0x444C69D7;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x1C192BE6;
        n4 = (n3 | n2) ^ 0x3DC11136;
        boolean bl2 = true;
        block13: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = (n3 | n2) ^ 0x4FCA79A1;
            }
            block14: while (true) {
                switch (n4) {
                    default: {
                        continue block14;
                    }
                    case -880106865: {
                        n5 ^= n4 ^ 0x128F8190;
                        n4 = (n3 | n2) ^ 0x254C0144;
                        continue block14;
                    }
                    case -797971060: {
                        this.a = -1;
                        n4 = (n3 | n2) ^ 0xFF7A562F;
                        continue block14;
                    }
                    case -1012793677: {
                        this.c = -1;
                        n4 = (n3 | n2) ^ 0xF1133882;
                        continue block14;
                    }
                    case -1457027498: {
                        this.a = false;
                        n4 = (n3 | n2) ^ 0x3C7296F3;
                        continue block14;
                    }
                    case -5514485: {
                        this.b = 0;
                        n4 = (n3 | n2) ^ 0x448D7A46;
                        continue block14;
                    }
                    case -627087100: {
                        n5 ^= n4 ^ 0xC0166E77;
                        n4 = (n3 | n2) ^ 0xD8E5E293;
                        continue block14;
                    }
                    case -617812287: {
                        n4 = (n3 | n2) ^ 0x2D675D78;
                        continue block14;
                    }
                    case 402573173: {
                        n5 ^= n4 ^ 0x7A881935;
                        n4 = (n3 | n2) ^ 0x3682127B;
                        continue block14;
                    }
                    case 429369816: {
                        n5 ^= n4 ^ 0x3966896B;
                        n4 = (n3 | n2) ^ 0x194624FC;
                        continue block14;
                    }
                    case -1570732623: {
                        n5 ^= n4 ^ 0xCE5555F7;
                        continue block13;
                    }
                    case 1040719204: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public int resolve(hq var1_1) {
        block20: {
            block19: {
                break block20;
lbl1:
                // 1 sources

                while (true) {
                    var4_5 ^= var5_4 ^ 370457361;
                    ** GOTO lbl31
                    break;
                }
lbl4:
                // 1 sources

                while (true) {
                    var5_4 = (var3_3 | var6_2) ^ -1311244468;
                    ** GOTO lbl14
                    break;
                }
lbl7:
                // 1 sources

                block11: while (true) {
                    var5_4 = (var3_3 | var6_2) ^ 1192470727;
                    if (true) ** GOTO lbl14
lbl10:
                    // 1 sources

                    return Math.max(0, Math.min(jQ.IR(((var4_5 ^= -1176352981) | var6_2) ^ 1903016833, (var3_3 | var6_2) ^ ((var4_5 | var6_2) ^ 1651943657)), var2_6 - 1));
                    block13: while (true) {
                        var5_4 = (var3_3 | var6_2) ^ -921019218;
lbl14:
                        // 5 sources

                        block14: while (true) {
                            block0 : switch (var5_4) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    default: {
                                        continue block14;
                                    }
                                    break;
                                }
                                case 1628088830: {
                                    ** continue;
                                }
                                case -1511368781: {
                                    break block11;
                                }
                                case 1395523640: {
                                    var4_5 ^= var5_4 ^ -1797630177;
                                    break block19;
                                }
                                case 736338906: {
                                    v0 = this.a.normalSlotSetting();
lbl28:
                                    // 2 sources

                                    while (true) {
                                        var4_5 ^= 436686614;
                                        break block0;
                                        break;
                                    }
                                }
lbl31:
                                // 1 sources

                                var5_4 = (var3_3 | var6_2) ^ -1302691706;
                                ** GOTO lbl-1000
lbl33:
                                // 1 sources

                                while (true) {
                                    ** continue;
                                    break;
                                }
                                case 945817983: {
                                    var4_5 ^= var5_4 ^ -7053736;
                                    continue block13;
                                }
                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ -627444213;
                                    ** continue;
                                    break;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                var5_4 = (var3_3 | var6_2) ^ -2081204598;
                ** GOTO lbl14
            }
            var5_4 = (var3_3 | var6_2) ^ 1048118214;
            ** while (true)
            {
                case 1352892402: {
                    if (var1_1 != hq.e) ** continue;
                    ** continue;
                }
            }
            var2_6 = v0;
            ** while (true)
        }
        var6_2 = -1032224940;
        var3_3 = jQ.d & -1032224940 ^ -526331616;
        var5_4 = 0;
        var4_5 = (var3_3 | var6_2) ^ -372492353;
        ** while (true)
        {
            ** case -595526478:
        }
lbl58:
        // 1 sources

        v0 = this.a.drillSlotSetting();
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean slotsValid() {
        block13: {
            var4_1 = 785056882;
            var1_2 = jQ.d & 785056882 ^ -1089320775;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ 1247540850;
            var3_3 = (var1_2 | var4_1) ^ 96644689;
            if (true) ** GOTO lbl12
            block9: while (true) {
                var3_3 = (var1_2 | var4_1) ^ -1193182027;
                if (true) ** GOTO lbl12
                block10: while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 137084462;
lbl12:
                    // 3 sources

                    block11: while (true) {
                        switch (var3_3) {
                            case -1172708694: {
                                ** GOTO lbl33
                            }
                            case 121253966: {
                                if (this.resolve(hq.e) != this.resolve(hq.b)) {
                                    var3_3 = (var1_2 | var4_1) ^ 775946254;
                                    continue block11;
                                }
                                ** GOTO lbl27
                            }
                            case -1852093195: {
                                var2_4 ^= var3_3 ^ -1557641599;
                                continue block10;
                            }
                            case -325211850: {
                                v0 = false;
                                break block13;
                            }
lbl27:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -419133765;
                            default: {
                                continue block11;
                            }
                            case 1491061312: {
                                var2_4 ^= var3_3 ^ 1785511988;
                                ** GOTO lbl35
                            }
lbl33:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ 933480860;
                            continue block11;
lbl35:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ 1397155277;
                            continue block11;
                            case -2005367449: {
                                var2_4 ^= var3_3 ^ 661752313;
                                continue block9;
                            }
                            case -1208945963: 
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            v0 = true;
        }
        var2_4 ^= -1073312258;
        return v0;
    }

    /*
     * Unable to fully structure code
     */
    public class_1799 stack(hq var1_1) {
        block28: {
            block31: {
                block29: {
                    block32: {
                        block30: {
                            block26: {
                                block27: {
                                    break block31;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ -440582490;
                                        break block26;
                                        break;
                                    }
lbl4:
                                    // 1 sources

                                    while (true) {
                                        var4_6 ^= var5_4 ^ -924986489;
                                        break block27;
                                        break;
                                    }
lbl7:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ -2008240935;
                                        break block28;
                                        break;
                                    }
lbl10:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ -1950809351;
                                        break block26;
                                        break;
                                    }
                                }
                                var5_4 = (var3_3 | var6_2) ^ 1139597911;
                                break block26;
lbl16:
                                // 1 sources

                                while (true) {
                                    var4_6 ^= var5_4 ^ -316385539;
                                    break block29;
                                    break;
                                }
lbl19:
                                // 1 sources

                                while (true) {
                                    var4_6 ^= var5_4 ^ -1144699731;
                                    ** continue;
                                    break;
                                }
lbl22:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 1780973253;
                                    break block28;
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 113258838;
                                    break block28;
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (var2_5.field_1724 == null) {
                                    break block30;
                                }
                                break block32;
lbl31:
                                // 1 sources

                                while (true) {
                                    var2_5 = class_310.method_1551();
                                    ** continue;
                                    break;
                                }
                            }
lbl35:
                            // 4 sources

                            block23: while (true) {
                                switch (var5_4) {
                                    default: {
                                        continue block23;
                                    }
                                    case -791304609: {
                                        ** continue;
                                    }
                                    case 1900480206: {
                                        ** continue;
                                    }
                                    case 205671243: {
                                        ** continue;
                                    }
                                    case 1648785172: {
                                        ** GOTO lbl28
                                    }
                                    case -1441556550: {
                                        return class_1799.field_8037;
                                    }
                                    case -1965106947: {
                                        return var2_5.field_1724.method_31548().method_5438(this.resolve(var1_1));
                                    }
                                }
                                break;
                            }
                        }
                        var5_4 = (var3_3 | var6_2) ^ 959108018;
                        ** GOTO lbl35
                    }
                    var5_4 = (var3_3 | var6_2) ^ -1732742365;
                    ** GOTO lbl35
                }
                var5_4 = (var3_3 | var6_2) ^ 1663151376;
                ** while (true)
lbl60:
                // 1 sources

                while (true) {
                    var4_6 ^= var5_4 ^ 25459144;
                    ** continue;
                    break;
                }
            }
            var6_2 = -1448124211;
            var3_3 = jQ.d & -1448124211 ^ 1224480108;
            var5_4 = 0;
            var4_6 = (var3_3 | var6_2) ^ -76856008;
            ** while (true)
        }
        block25: while (true) {
            switch (var5_4) {
                default: {
                    continue block25;
                }
                case 1639176500: {
                    ** continue;
                }
                case -281066309: {
                    ** continue;
                }
                ** case -2082993368:
lbl79:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public mD problem(hq var1_1) {
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
    public boolean usable(hq var1_1) {
        block18: {
            block19: {
                var5_2 = -1973001750;
                var2_3 = jQ.d & -1973001750 ^ 0x6659659;
                var4_4 = 0;
                ** GOTO lbl30
lbl5:
                // 1 sources

                while (true) {
                    v0 = false;
                    break block18;
                    break;
                }
lbl8:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_4 ^ 1818380829;
                    ** GOTO lbl25
                    break;
                }
lbl11:
                // 1 sources

                return v0;
lbl13:
                // 1 sources

                block12: while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -816429181;
lbl15:
                    // 4 sources

                    block13: while (true) {
                        switch (var4_4) lbl-1000:
                        // 4 sources

                        {
                            default: {
                                continue block13;
                            }
                            case 1093775480: {
                                ** continue;
                            }
                            case -579802692: {
                                break block12;
                            }
                            case -1797841709: {
                                ** continue;
                            }
lbl25:
                            // 1 sources

                            var4_4 = (var2_3 | var5_2) ^ 1886760717;
                            ** GOTO lbl-1000
                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -1582397393;
                                ** GOTO lbl-1000
                                break;
                            }
lbl30:
                            // 1 sources

                            var3_5 = (var2_3 | var5_2) ^ -2010177677;
                            break block19;
                            case 666835401: {
                                if (this.problem(var1_1) != mD.a) ** continue;
                                var4_4 = (var2_3 | var5_2) ^ 447802152;
                                ** GOTO lbl-1000
                            }
                        }
                        break;
                    }
                    break;
                }
                var4_4 = (var2_3 | var5_2) ^ 504660112;
                ** GOTO lbl15
lbl38:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -1445401038;
                    ** GOTO lbl15
                    break;
                }
            }
            var4_4 = (var2_3 | var5_2) ^ 1394024007;
            ** while (true)
            {
                case -1871480981: {
                    var3_5 ^= var4_4 ^ -253932620;
                    ** continue;
                }
                case 801734612: {
                    var3_5 ^= var4_4 ^ -679728870;
                    ** continue;
                }
            }
        }
lbl51:
        // 2 sources

        while (true) {
            var3_5 ^= -350407736;
            ** continue;
            break;
        }
        {
            ** case -32352010:
        }
lbl55:
        // 1 sources

        v0 = true;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public int durabilityPercent(hq var1_1) {
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
    private boolean IQ(class_1799 var1_1) {
        block42: {
            block43: {
                block44: {
                    block41: {
                        block40: {
                            var8_2 = -1990095110;
                            var5_3 = jQ.d & -1990095110 ^ 261282568;
                            var7_4 = 0;
                            ** GOTO lbl59
lbl5:
                            // 1 sources

                            while (true) {
                                var7_4 = (var5_3 | var8_2) ^ -1837556886;
                                ** GOTO lbl36
                                break;
                            }
lbl8:
                            // 1 sources

                            while (true) {
                                var6_7 ^= -771462566;
                                ** GOTO lbl93
                                break;
                            }
                            while (true) {
                                var7_4 = (var5_3 | var8_2) ^ 655926109;
                                ** GOTO lbl36
                                break;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                var7_4 = (var5_3 | var8_2) ^ -1849845764;
                                ** GOTO lbl64
                                break;
                            }
lbl17:
                            // 1 sources

                            while (true) {
                                if (!(var3_6 < (double)this.a.minToolDurability())) ** continue;
                                ** GOTO lbl100
                                break;
                            }
                            while (true) {
                                var7_4 = (var5_3 | var8_2) ^ -439165523;
                                ** GOTO lbl64
lbl23:
                                // 1 sources

                                while (true) {
                                    var6_7 ^= var7_4 ^ 1413952521;
                                    ** GOTO lbl83
                                    break;
                                }
                                break;
                            }
lbl26:
                            // 1 sources

                            return v0;
lbl28:
                            // 1 sources

                            while (true) {
                                v0 = false;
                                break block40;
                                break;
                            }
lbl31:
                            // 1 sources

                            while (true) {
                                var7_4 = (var5_3 | var8_2) ^ 1751415658;
                                ** GOTO lbl64
                                break;
                            }
lbl34:
                            // 1 sources

                            block29: while (true) {
                                var7_4 = (var5_3 | var8_2) ^ -1735045656;
lbl36:
                                // 4 sources

                                block30: while (true) {
                                    switch (var7_4) lbl-1000:
                                    // 3 sources

                                    {
                                        while (true) {
                                            default: {
                                                continue block30;
                                            }
                                            break;
                                        }
                                        case 392598034: {
                                            ** continue;
                                        }
                                        case 1776722108: {
                                            ** continue;
                                        }
lbl45:
                                        // 1 sources

                                        while (true) {
                                            var7_4 = (var5_3 | var8_2) ^ -434798778;
                                            ** GOTO lbl-1000
                                            break;
                                        }
lbl48:
                                        // 1 sources

                                        while (true) {
                                            var2_5 = var1_1.method_7936() - var1_1.method_7919();
                                            ** continue;
                                            break;
                                        }
                                        case 524476079: {
                                            v0 = true;
                                            break block29;
                                        }
lbl54:
                                        // 1 sources

                                        while (var1_1.method_7963()) {
                                            break block41;
lbl56:
                                            // 1 sources

                                            return false;
                                        }
                                        break block42;
lbl59:
                                        // 1 sources

                                        var6_7 = (var5_3 | var8_2) ^ -1111884908;
                                        break block43;
lbl61:
                                        // 1 sources

                                        while (true) {
                                            var6_7 ^= var7_4 ^ -788873601;
                                            ** GOTO lbl102
                                            break;
                                        }
lbl64:
                                        // 8 sources

                                        block37: while (true) {
                                            switch (var7_4) lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    default: {
                                                        continue block37;
                                                    }
                                                    break;
                                                }
                                                case 1149205576: {
                                                    ** continue;
                                                }
                                                case 1737309904: {
                                                    ** continue;
                                                }
                                                case -1027292475: {
                                                    ** continue;
                                                }
                                                case 886858829: {
                                                    ** continue;
                                                }
                                                case 281632946: {
                                                    ** GOTO lbl54
                                                }
                                                case 986825906: {
                                                    ** continue;
                                                }
                                                case 508446726: {
                                                    ** continue;
                                                }
lbl83:
                                                // 1 sources

                                                var7_4 = (var5_3 | var8_2) ^ -1256055992;
                                                ** continue;
                                                case -1812761218: {
                                                    var6_7 ^= var7_4 ^ 1897023613;
                                                    break block44;
                                                }
                                                case 1780548183: {
                                                    var6_7 ^= var7_4 ^ -922900841;
                                                    ** GOTO lbl95
                                                }
                                                case -409492336: {
                                                    if (var1_1.method_7936() > 0) ** continue;
                                                }
                                            }
                                            break;
                                        }
lbl93:
                                        // 1 sources

                                        var3_6 = (double)var2_5 * 100.0 / (double)var1_1.method_7936();
                                        ** continue;
lbl95:
                                        // 1 sources

                                        var7_4 = (var5_3 | var8_2) ^ -1154499657;
                                        ** GOTO lbl64
                                        case -1460962137: {
                                            var6_7 ^= var7_4 ^ 1242186148;
                                            ** continue;
                                        }
lbl100:
                                        // 1 sources

                                        var7_4 = (var5_3 | var8_2) ^ 469805700;
                                        ** continue;
lbl102:
                                        // 1 sources

                                        var7_4 = (var5_3 | var8_2) ^ -1623539896;
                                        ** GOTO lbl64
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                        var6_7 ^= -655397073;
                        ** while (true)
                    }
                    var7_4 = (var5_3 | var8_2) ^ 1295457599;
                    ** GOTO lbl64
                }
                var7_4 = (var5_3 | var8_2) ^ -1867447979;
                ** while (true)
                {
                    ** case 495633552:
                }
lbl114:
                // 1 sources

                var6_7 ^= var7_4 ^ -2027298364;
                ** while (true)
            }
            var7_4 = (var5_3 | var8_2) ^ -394338006;
            ** GOTO lbl64
        }
lbl120:
        // 2 sources

        while (true) {
            var7_4 = (var5_3 | var8_2) ^ -879975502;
            ** continue;
            break;
        }
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public String describe(hq var1_1, mD var2_2) {
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
    public boolean request(hq var1_1) {
        block50: {
            block49: {
                block51: {
                    break block51;
lbl1:
                    // 1 sources

                    while (true) {
                        var6_4 = (var4_3 | var7_2) ^ -1997035153;
                        break block49;
lbl4:
                        // 1 sources

                        while (true) {
                            var6_4 = (var4_3 | var7_2) ^ -479418930;
                            break block49;
                            break;
                        }
                        break;
                    }
lbl7:
                    // 2 sources

                    while (true) {
                        var6_4 = (var4_3 | var7_2) ^ 1026483058;
                        break block50;
                        break;
                    }
                }
                var7_2 = 718624698;
                var4_3 = jQ.d & 718624698 ^ -2094499716;
                var6_4 = 0;
                var5_7 = (var4_3 | var7_2) ^ -2070136320;
                var6_4 = (var4_3 | var7_2) ^ -2932758;
                block38: while (true) {
                    block52: {
                        switch (var6_4) {
                            default: {
                                continue block38;
                            }
                            case -42775125: {
                                var5_7 ^= var6_4 ^ 1736939432;
                                break;
                            }
                            case 1412317204: {
                                break block52;
                            }
                            case 858225098: {
                                var2_5 = class_310.method_1551();
                                ** break;
lbl28:
                                // 1 sources

                                var6_4 = (var4_3 | var7_2) ^ -1464772129;
                                ** GOTO lbl-1000
                            }
                        }
                        var6_4 = (var4_3 | var7_2) ^ -1730542028;
                        continue;
                    }
                    var6_4 = (var4_3 | var7_2) ^ 1452159573;
                }
lbl35:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 637148983;
                    break block49;
                    break;
                }
                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 1539030596;
                    break block49;
                    break;
                }
lbl41:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 877120295;
                    break block49;
                    break;
                }
lbl44:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 673882430;
                    break block50;
                    break;
                }
lbl47:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 1880209669;
                    break block49;
                    break;
                }
lbl50:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 950845952;
                    break block49;
                    break;
                }
lbl53:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 2084075668;
                    break block49;
                    break;
                }
lbl56:
                // 1 sources

                while (true) {
                    var6_4 = (var4_3 | var7_2) ^ 801353608;
                    break block50;
                    break;
                }
            }
            block47: while (true) {
                block53: {
                    switch (var6_4) {
                        case -1823359490: {
                            this.a = var3_6;
                            ** continue;
                        }
                        case -91801657: {
                            var5_7 ^= var6_4 ^ -436812953;
                            ** continue;
                        }
                        case 132518635: {
                            return true;
                        }
                        case -1615153959: {
                            var5_7 ^= var6_4 ^ 1323627354;
                            var6_4 = (var4_3 | var7_2) ^ -1095082875;
                            continue block47;
                        }
                        case 1217518128: {
                            return false;
                        }
                        case -263798342: {
                            var5_7 ^= var6_4 ^ 1033554793;
                            var6_4 = (var4_3 | var7_2) ^ 1876987500;
                            break;
                        }
                        case 394831457: {
                            var5_7 ^= var6_4 ^ -955419440;
                            ** continue;
                        }
                        case 179246201: {
                            if (var2_5.field_1724.method_31548().field_7545 != var3_6) ** continue;
                            var6_4 = (var4_3 | var7_2) ^ -1133127265;
                            break;
                        }
                        case -674953366: {
                            var5_7 ^= var6_4 ^ 1413337645;
                            ** break;
                        }
                        case 356983675: {
                            this.a = var3_6;
                            break block53;
                        }
                        case -1004670574: {
                            this.c = var3_6;
                            ** continue;
                        }
                        case 587912849: {
                            var5_7 ^= var6_4 ^ 1539014799;
                            ** continue;
                        }
                        case 2097882389: {
                            var5_7 ^= var6_4 ^ -1525725079;
                            var6_4 = (var4_3 | var7_2) ^ -1407488747;
                            break;
                        }
                        case 1512339108: {
                            this.b = 0;
                            var6_4 = (var4_3 | var7_2) ^ 1366968377;
                            break;
                        }
lbl107:
                        // 1 sources

                        var6_4 = (var4_3 | var7_2) ^ -1588434041;
                        continue block47;
                        case -605239557: {
                            this.c = -1;
                            ** continue;
                        }
                        case -1912119095: {
                            var5_7 ^= var6_4 ^ -322857965;
                            var6_4 = (var4_3 | var7_2) ^ -237434534;
                        }
                    }
                    continue;
                }
                var6_4 = (var4_3 | var7_2) ^ -688497941;
            }
        }
        block48: while (true) {
            switch (var6_4) lbl-1000:
            // 2 sources

            {
                default: {
                    continue block48;
                }
                case 838810058: {
                    this.a = var1_1;
                    ** continue;
                }
                case 217556725: {
                    return false;
                }
                case 609331177: {
                    if (var2_5.field_1724 == null) ** GOTO lbl7
                    var6_4 = (var4_3 | var7_2) ^ -1954932477;
                    continue block48;
                }
                case -2083004736: {
                    var5_7 ^= var6_4 ^ 1184411627;
                    ** GOTO lbl155
                }
                case 55322145: {
                    var5_7 ^= var6_4 ^ 793079446;
                    var6_4 = (var4_3 | var7_2) ^ -1884497897;
                    continue block48;
                }
                case -1764516724: {
                    var5_7 ^= var6_4 ^ 1688261885;
                    var6_4 = (var4_3 | var7_2) ^ -1492461301;
                    continue block48;
                }
                case -329104458: {
                    var3_6 = this.resolve(var1_1);
                    ** continue;
                }
                case -2076258186: {
                    var5_7 ^= var6_4 ^ 869770494;
                    ** break;
                }
                case 545744637: {
                    var6_4 = (var4_3 | var7_2) ^ -648209101;
                    continue block48;
                }
lbl153:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ -1711126988;
                continue block48;
lbl155:
                // 1 sources

                var6_4 = (var4_3 | var7_2) ^ 1201617992;
                continue block48;
                case 1923113677: 
            }
            break;
        }
        ** while (this.usable((hq)var1_1))
lbl159:
        // 1 sources

        ** while (true)
    }

    private static int IR(int n2, int n3) {
        int n4 = 1214511525;
        int n5 = 1480376130;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xF369BB18)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0x587FD9BF;
        n6 += (n5 | n4) ^ 0x587F7274;
        n6 += (n5 | n4) ^ 0x587F041C;
        n6 -= (n5 | n4) ^ 0x587F3E78;
        n6 -= (n5 | n4) ^ 0x587FB039;
        n6 += (n5 | n4) ^ 0x587F0B02;
        n6 ^= (n5 | n4) ^ 0x587F1231;
        n6 ^= (n5 | n4) ^ 0x587FD525;
        return n6 += (n5 | n4) ^ 0x587FACD1;
    }

    /*
     * Unable to fully structure code
     */
    public boolean requestRawSlot(int var1_1) {
        block53: {
            block57: {
                block55: {
                    block52: {
                        block54: {
                            block56: {
                                var6_2 = 2029172824;
                                var3_3 = jQ.d & 2029172824 ^ 1452268644;
                                var5_4 = 0;
                                break block56;
lbl5:
                                // 1 sources

                                block31: while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 1130963049;
lbl7:
                                    // 13 sources

                                    block32: while (true) {
                                        block0 : switch (var5_4) lbl-1000:
                                        // 12 sources

                                        {
                                            default: {
                                                continue block32;
                                            }
lbl11:
                                            // 1 sources

                                            while (true) {
                                                var5_4 = (var3_3 | var6_2) ^ 1105193439;
                                                ** GOTO lbl-1000
                                                break;
                                            }
lbl14:
                                            // 1 sources

                                            while (true) {
                                                var5_4 = (var3_3 | var6_2) ^ 1766043845;
                                                ** GOTO lbl-1000
                                                break;
                                            }
lbl17:
                                            // 1 sources

                                            while (true) {
                                                var5_4 = (var3_3 | var6_2) ^ -618690023;
                                                ** GOTO lbl-1000
                                                break;
                                            }
                                            case -955668715: {
                                                this.a = var1_1;
                                                break block52;
                                            }
lbl23:
                                            // 1 sources

                                            while (true) {
                                                var5_4 = (var3_3 | var6_2) ^ 905092233;
                                                ** GOTO lbl44
                                                break;
                                            }
                                            case 1255192233: {
                                                var4_5 ^= var5_4 ^ -1741140000;
                                                break block53;
                                            }
                                            case -257244683: {
                                                this.c = var1_1;
                                                break block54;
                                            }
lbl32:
                                            // 1 sources

                                            while (true) {
                                                var5_4 = (var3_3 | var6_2) ^ -1938462791;
                                                ** GOTO lbl-1000
                                                break;
                                            }
                                            case -267355794: {
                                                if (var1_1 <= jQ.IR((var4_5 | var5_4 ^ -1998405322) ^ (var5_4 ^ 553419756), (var3_3 | var5_4 ^ -1998405322) ^ ((var4_5 | var5_4 ^ -1998405322) ^ (var5_4 ^ 2075568869)))) break block31;
                                                break;
                                            }
lbl38:
                                            // 1 sources

                                            while (true) {
                                                var5_4 = (var3_3 | var6_2) ^ 1460341270;
                                                ** GOTO lbl-1000
                                                break;
                                            }
lbl41:
                                            // 1 sources

                                            while (true) {
                                                var5_4 = (var3_3 | var6_2) ^ -1264268082;
                                                ** GOTO lbl-1000
                                                break;
                                            }
lbl44:
                                            // 2 sources

                                            block41: while (true) {
                                                switch (var5_4) lbl-1000:
                                                // 2 sources

                                                {
                                                    while (true) {
                                                        default: {
                                                            continue block41;
                                                        }
                                                        break;
                                                    }
lbl49:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ 1051328840;
                                                        ** continue;
                                                        break;
                                                    }
lbl52:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ -1598240969;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
lbl55:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ 179584688;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
                                                    case 1951122124: {
                                                        return false;
                                                    }
                                                    case -566019253: {
                                                        if (var1_1 < 0) break block0;
                                                        ** continue;
                                                    }
                                                    case 1079377204: {
                                                        var2_6 = class_310.method_1551();
                                                        break block41;
                                                    }
                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ 1137864769;
                                                        ** GOTO lbl-1000
                                                        break;
                                                    }
                                                    case 398216377: {
                                                        break block55;
                                                    }
                                                    case 1259167989: {
                                                        var4_5 ^= var5_4 ^ 1957526033;
                                                        ** continue;
                                                    }
                                                    case 1234813669: {
                                                        var4_5 ^= var5_4 ^ -1161249808;
                                                        ** continue;
                                                    }
                                                    case 703919722: {
                                                        this.b = 0;
                                                        ** continue;
                                                    }
                                                    case -1512016283: {
                                                        this.a = var1_1;
                                                        ** continue;
                                                    }
                                                }
                                                break;
                                            }
                                            var5_4 = (var3_3 | var6_2) ^ -964989365;
                                            ** GOTO lbl-1000
                                            case 927431082: {
                                                var4_5 ^= var5_4 ^ 73769353;
                                                ** continue;
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                }
                                var5_4 = (var3_3 | var6_2) ^ 875514581;
                                ** GOTO lbl7
lbl90:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ -1907016311;
                                    ** GOTO lbl7
                                    break;
                                }
                            }
                            var4_5 = (var3_3 | var6_2) ^ -337358078;
                            var5_4 = (var3_3 | var6_2) ^ 659960380;
                            ** while (true)
                            {
                                case 1059067299: {
                                    var4_5 ^= var5_4 ^ -765642653;
                                    ** continue;
                                }
                            }
lbl100:
                            // 1 sources

                            while (true) {
                                var5_4 = (var3_3 | var6_2) ^ 1206456414;
                                ** GOTO lbl7
                                break;
                            }
                        }
                        var5_4 = (var3_3 | var6_2) ^ 1496610262;
                        ** GOTO lbl7
                        {
                            ** case 1504300608:
                        }
lbl107:
                        // 1 sources

                        ** while (true)
                    }
                    var5_4 = (var3_3 | var6_2) ^ 28513293;
                    ** GOTO lbl7
                    {
                        case -1828802538: {
                            if (var2_6.field_1724 == null) break;
                            break block57;
                        }
                        case -225797179: {
                            this.c = -1;
                            var5_4 = (var3_3 | var6_2) ^ 1236829654;
                            ** GOTO lbl-1000
                        }
                        case 1026395197: {
                            var4_5 ^= var5_4 ^ -1308266045;
                            ** continue;
                        }
                    }
                    var5_4 = (var3_3 | var6_2) ^ 929447577;
                    ** GOTO lbl7
                    {
                        case 2135746673: {
                            var4_5 ^= var5_4 ^ 1338926803;
                            ** continue;
                        }
                        case -495335138: {
                            if (var2_6.field_1724.method_31548().field_7545 != var1_1) ** continue;
                            ** continue;
                        }
                    }
lbl129:
                    // 1 sources

                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ -1175037079;
                        ** GOTO lbl7
                        break;
                    }
                    {
                        case 667650474: {
                            var4_5 ^= var5_4 ^ 1334355078;
                            ** continue;
                        }
                    }
lbl135:
                    // 1 sources

                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ -950162696;
                        ** GOTO lbl7
                        break;
                    }
                    {
                        case 957803554: {
                            var4_5 ^= var5_4 ^ 338759320;
                            ** continue;
                        }
                        case -1180543356: {
                            return true;
                        }
                        case -899993422: {
                            var4_5 ^= var5_4 ^ -402062828;
                            ** continue;
                        }
                    }
lbl146:
                    // 1 sources

                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ -335459222;
                        ** GOTO lbl7
                        break;
                    }
                }
                var5_4 = (var3_3 | var6_2) ^ -1896905454;
                ** GOTO lbl7
                {
                    case 1033296917: {
                        return false;
                    }
                    case -1199271369: {
                        var4_5 ^= var5_4 ^ 158802315;
                        ** continue;
                    }
                    ** case -2030413268:
                }
lbl158:
                // 1 sources

                ** while (true)
            }
            var5_4 = (var3_3 | var6_2) ^ -133847472;
            ** GOTO lbl7
        }
        var5_4 = (var3_3 | var6_2) ^ -1668926110;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean readyRawSlot(int var1_1) {
        block23: {
            break block23;
lbl1:
            // 2 sources

            while (true) {
                var4_6 ^= -677846160;
                return v0;
            }
            {
                var5_4 = (var3_3 | var6_2) ^ 821122190;
lbl5:
                // 2 sources

                block21: while (true) {
                    block25: {
                        block24: {
                            switch (var5_4) {
                                case -1279489550: {
                                    v0 = true;
                                    ** GOTO lbl1
                                }
                                case -399649485: {
                                    var4_6 ^= var5_4 ^ -322202887;
                                    ** GOTO lbl40
                                }
                                case -1370797212: {
                                    var4_6 ^= 983618451;
                                    ** break;
                                }
                                case 414919817: {
                                    var5_4 = (var3_3 | var6_2) ^ 692963774;
                                    continue block21;
                                }
                                case 1071654161: {
                                    if (var2_5.field_1724 == null) continue block20;
                                    ** GOTO lbl38
                                }
                                case 219024251: {
                                    var4_6 ^= var5_4 ^ 1731732632;
                                    var5_4 = (var3_3 | var6_2) ^ -875985964;
                                    continue block21;
                                }
                                case 1184327185: {
                                    var4_6 ^= var5_4 ^ 2084025730;
                                    ** GOTO lbl46
                                }
                                case 1618196532: {
                                    var4_6 ^= var5_4 ^ 172333015;
                                    var5_4 = (var3_3 | var6_2) ^ -1908156921;
                                    continue block21;
                                }
                                case -164176863: {
                                    v0 = false;
                                    ** continue;
                                }
lbl36:
                                // 1 sources

                                if (var2_5.field_1724.method_31548().field_7545 != var1_1) continue block20;
                                break block24;
lbl38:
                                // 1 sources

                                var5_4 = (var3_3 | var6_2) ^ 625243004;
                                ** GOTO lbl47
lbl40:
                                // 1 sources

                                var5_4 = (var3_3 | var6_2) ^ 35617508;
                                ** GOTO lbl47
                                case -517476165: {
                                    if (this.b < 1) continue block20;
                                    var5_4 = (var3_3 | var6_2) ^ 1569515457;
                                    ** GOTO lbl47
                                }
lbl46:
                                // 1 sources

                                var5_4 = (var3_3 | var6_2) ^ -1816914799;
lbl47:
                                // 5 sources

                                default: {
                                    continue block21;
                                }
                                case -1900782426: {
                                    var5_4 = (var3_3 | var6_2) ^ -589779122;
                                    continue block21;
                                }
                                case 347248203: 
                            }
                            if (this.c >= 0) ** break;
                            break block25;
                        }
                        var5_4 = (var3_3 | var6_2) ^ -1286929581;
                        continue;
                    }
                    var5_4 = (var3_3 | var6_2) ^ 2070428132;
                    continue;
                    break;
                }
            }
        }
        var6_2 = 973035873;
        var3_3 = jQ.d & 973035873 ^ 1017841621;
        var5_4 = 0;
        var4_6 = (var3_3 | var6_2) ^ 1725197691;
        var5_4 = (var3_3 | var6_2) ^ -1837818202;
        block22: while (true) {
            switch (var5_4) {
                default: {
                    continue block22;
                }
                case -1447438864: {
                    var4_6 ^= var5_4 ^ 2089316416;
                    var5_4 = (var3_3 | var6_2) ^ -1709128845;
                    continue block22;
                }
                case -1478517626: {
                    var2_5 = class_310.method_1551();
                    var5_4 = (var3_3 | var6_2) ^ -707622202;
                    ** continue;
                }
                case -1349893805: 
            }
            var5_4 = (var3_3 | var6_2) ^ -1807316475;
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean ready(hq var1_1) {
        block63: {
            block58: {
                block68: {
                    block62: {
                        block66: {
                            block64: {
                                block59: {
                                    block65: {
                                        block67: {
                                            block57: {
                                                block60: {
                                                    block56: {
                                                        block61: {
                                                            block55: {
                                                                break block65;
lbl1:
                                                                // 1 sources

                                                                while (true) {
                                                                    var5_4 = (var3_3 | var6_2) ^ -413734349;
                                                                    break block55;
                                                                    break;
                                                                }
lbl4:
                                                                // 1 sources

                                                                while (true) {
                                                                    var5_4 = (var3_3 | var6_2) ^ -1147201559;
                                                                    break block55;
lbl7:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var5_4 = (var3_3 | var6_2) ^ -1738605802;
                                                                        break block55;
lbl10:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var4_6 ^= var5_4 ^ 661603528;
                                                                            ** GOTO lbl61
                                                                            break;
                                                                        }
lbl13:
                                                                        // 1 sources

                                                                        while (this.c < 0) {
                                                                            break block56;
                                                                        }
                                                                        break block57;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
lbl16:
                                                                // 1 sources

                                                                while (true) {
                                                                    var4_6 ^= var5_4 ^ 629385268;
                                                                    break block58;
                                                                    break;
                                                                }
lbl19:
                                                                // 1 sources

                                                                while (true) {
                                                                    var4_6 ^= var5_4 ^ 691667794;
                                                                    break block59;
                                                                    break;
                                                                }
lbl22:
                                                                // 1 sources

                                                                while (true) {
                                                                    var5_4 = (var3_3 | var6_2) ^ -516615527;
                                                                    break block55;
lbl25:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        v0 = true;
                                                                        ** GOTO lbl69
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
lbl28:
                                                                // 1 sources

                                                                while (var2_5.field_1724.method_31548().field_7545 == this.resolve(var1_1)) {
                                                                    break block60;
lbl30:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var4_6 ^= var5_4 ^ -781283575;
                                                                        break block61;
                                                                        break;
                                                                    }
                                                                }
                                                                break block57;
lbl34:
                                                                // 1 sources

                                                                return v0;
                                                            }
lbl37:
                                                            // 12 sources

                                                            block42: while (true) {
                                                                switch (var5_4) lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    while (true) {
                                                                        default: {
                                                                            continue block42;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 217482009: {
                                                                        break;
                                                                    }
                                                                    case -1495976682: {
                                                                        break block62;
                                                                    }
                                                                    case -1398655307: {
                                                                        ** continue;
                                                                    }
                                                                    case 1544393134: {
                                                                        ** GOTO lbl13
                                                                    }
                                                                    case 1660565187: {
                                                                        break block63;
                                                                    }
                                                                    case 1154019350: {
                                                                        ** continue;
                                                                    }
                                                                    case 402722252: {
                                                                        ** continue;
                                                                    }
                                                                    case 96287275: {
                                                                        ** continue;
                                                                    }
lbl58:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var5_4 = (var3_3 | var6_2) ^ 380960713;
                                                                        ** continue;
                                                                        break;
                                                                    }
                                                                }
lbl61:
                                                                // 2 sources

                                                                var5_4 = (var3_3 | var6_2) ^ -2075532460;
                                                                continue;
lbl63:
                                                                // 1 sources

                                                                while (true) {
                                                                    var4_6 ^= 932275914;
                                                                    ** GOTO lbl28
                                                                    break;
                                                                }
                                                                while (true) {
                                                                    var5_4 = (var3_3 | var6_2) ^ -85271084;
                                                                    continue block42;
                                                                    break;
                                                                }
lbl69:
                                                                // 2 sources

                                                                while (true) {
                                                                    var4_6 ^= -1653750712;
                                                                    ** continue;
                                                                    break;
                                                                }
lbl72:
                                                                // 1 sources

                                                                while (true) {
                                                                    var5_4 = (var3_3 | var6_2) ^ -746930956;
                                                                    continue block42;
                                                                    break;
                                                                }
                                                                break;
                                                            }
lbl75:
                                                            // 1 sources

                                                            while (true) {
                                                                var2_5 = class_310.method_1551();
                                                                ** continue;
                                                                break;
                                                            }
                                                            {
                                                                case 741169931: {
                                                                    ** continue;
                                                                }
                                                                case 1947168836: {
                                                                    if (this.b < 1) break block57;
                                                                    break block66;
                                                                }
                                                            }
                                                        }
                                                        var5_4 = (var3_3 | var6_2) ^ -1554352559;
                                                        ** GOTO lbl37
                                                        {
                                                            case 509801830: {
                                                                var4_6 ^= var5_4 ^ -1031390915;
                                                                break block67;
                                                            }
                                                        }
                                                    }
                                                    var5_4 = (var3_3 | var6_2) ^ -106349372;
                                                    ** GOTO lbl37
lbl92:
                                                    // 1 sources

                                                    while (true) {
                                                        var5_4 = (var3_3 | var6_2) ^ 1408618826;
                                                        ** GOTO lbl37
                                                        break;
                                                    }
                                                }
                                                var5_4 = (var3_3 | var6_2) ^ -1649553092;
                                                ** GOTO lbl37
                                            }
                                            var5_4 = (var3_3 | var6_2) ^ -207526682;
                                            ** GOTO lbl37
lbl101:
                                            // 1 sources

                                            while (true) {
                                                var5_4 = (var3_3 | var6_2) ^ -890570236;
                                                break block64;
                                                break;
                                            }
                                        }
                                        var5_4 = (var3_3 | var6_2) ^ -1252524321;
                                        ** GOTO lbl37
                                    }
                                    var6_2 = -12081250;
                                    var3_3 = jQ.d & -12081250 ^ 2048287719;
                                    var5_4 = 0;
                                    break block68;
                                    {
                                        case 1241520416: {
                                            if (var2_5.field_1724 != null) ** continue;
                                            ** continue;
                                        }
                                    }
lbl115:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ -308630819;
                                        ** GOTO lbl37
                                        break;
                                    }
                                    {
                                        case -370993098: {
                                            var4_6 ^= var5_4 ^ 992354876;
                                            ** continue;
                                        }
                                    }
                                }
lbl122:
                                // 2 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 1501745897;
                                    ** GOTO lbl37
                                    break;
                                }
                                {
                                    case 117365563: {
                                        var4_6 ^= var5_4 ^ 829406705;
                                        ** continue;
                                    }
                                }
                            }
lbl129:
                            // 3 sources

                            block54: while (true) {
                                switch (var5_4) {
                                    default: {
                                        continue block54;
                                    }
                                    case 901586427: {
                                        ** continue;
                                    }
                                    case -594392365: {
                                        ** continue;
                                    }
                                    ** case -1631886861:
lbl138:
                                    // 1 sources

                                    ** continue;
                                }
                                break;
                            }
                            {
                                case 278420195: {
                                    var4_6 ^= var5_4 ^ 2104142247;
                                    ** continue;
                                }
                                case 1728650473: {
                                    return false;
                                }
                                case 315444514: {
                                    var4_6 ^= var5_4 ^ 2037075773;
                                    ** continue;
                                }
                                case 1191324522: {
                                    v0 = false;
                                    ** continue;
                                }
                                ** case 2065564843:
                            }
lbl151:
                            // 1 sources

                            switch (var4_6) {
                                case -390216583: {
                                    ** continue;
                                }
                                case -1133678635: {
                                    ** continue;
                                }
                                ** default:
lbl157:
                                // 1 sources

                                ** continue;
                            }
                        }
                        var5_4 = (var3_3 | var6_2) ^ -271598308;
                        ** GOTO lbl37
                    }
                    var5_4 = (var3_3 | var6_2) ^ -1202336619;
                    ** GOTO lbl37
                }
                var4_6 = (var3_3 | var6_2) ^ 266596144;
                var5_4 = (var3_3 | var6_2) ^ 1642890764;
                ** GOTO lbl129
            }
            var5_4 = (var3_3 | var6_2) ^ 600157484;
            ** while (true)
        }
        var5_4 = (var3_3 | var6_2) ^ -1957128261;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public hq currentTool() {
        int n2 = d & 0x961048F3 ^ 0xDF78DB16;
        int n3 = 0;
        int n4 = (n2 | 0x961048F3) ^ 0xE2875037;
        n3 = (n2 | 0x961048F3) ^ 0x9363F803;
        block5: while (true) {
            switch (n3) {
                case 1021633400: {
                    return this.a;
                }
                case 1276847092: {
                    n3 = (n2 | 0x961048F3) ^ 0x608E6D58;
                }
                default: {
                    continue block5;
                }
                case -1074350417: 
            }
            n4 ^= n3 ^ 0x4ECA4411;
            n3 = (n2 | 0x961048F3) ^ 0xE39C388F;
        }
    }

    /*
     * Exception decompiling
     */
    static {
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
     * Enabled aggressive block sorting
     */
    public int requestedSlot() {
        int n2 = d & 0x77D25CA4 ^ 0x2BA3E57A;
        int n3 = 0;
        int n4 = (n2 | 0x77D25CA4) ^ 0x4491D3A;
        n3 = (n2 | 0x77D25CA4) ^ 0xF130A59C;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1638188613: {
                    n4 ^= n3 ^ 0x3D69DC16;
                    n3 = (n2 | 0x77D25CA4) ^ 0x2D873AD7;
                    continue block5;
                }
                case -1899800478: {
                    break;
                }
                case 1383384873: {
                    return this.a;
                }
            }
            n3 = (n2 | 0x77D25CA4) ^ 0x1E573BBB;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean applyPending() {
        var5_1 = 178621288;
        var2_2 = jQ.d & 178621288 ^ 573382115;
        var4_3 = 0;
        var3_4 = (var2_2 | var5_1) ^ -657293940;
        var4_3 = (var2_2 | var5_1) ^ 1155038058;
        if (true) ** GOTO lbl48
        block23: while (true) {
            var4_3 = (var2_2 | var5_1) ^ 693973725;
            if (true) ** GOTO lbl48
            block24: while (true) {
                var4_3 = (var2_2 | var5_1) ^ 560393254;
                block25: while (true) {
                    switch (var4_3) {
                        case -641084730: {
                            this.b = 0;
                            continue block24;
                        }
                        case -356673272: {
                            var3_4 ^= var4_3 ^ -1033857625;
                            var4_3 = (var2_2 | var5_1) ^ -1880543759;
                            ** GOTO lbl42
                        }
                        case 197882829: {
                            var3_4 ^= var4_3 ^ 2113437861;
                            ** break;
                        }
                        case -770933178: {
                            this.c = -1;
                            ** break;
                        }
lbl27:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ -1590452129;
                        continue block25;
                        case 1611079456: {
                            var3_4 ^= var4_3 ^ 1132843640;
                            var4_3 = (var2_2 | var5_1) ^ -123608659;
                            ** GOTO lbl42
                        }
                        case -2053467305: {
                            var3_4 ^= var4_3 ^ 277814540;
                            var4_3 = (var2_2 | var5_1) ^ -211530451;
                            ** GOTO lbl42
                        }
lbl37:
                        // 1 sources

                        var4_3 = (var2_2 | var5_1) ^ -1355346756;
                        continue block25;
                        case -1952563276: {
                            kY.selectHotbarSlot(var1_5);
                            var4_3 = (var2_2 | var5_1) ^ -1072691485;
                        }
lbl42:
                        // 6 sources

                        default: {
                            continue block25;
                        }
                        {
                            var4_3 = (var2_2 | var5_1) ^ 8510897;
                            if (true) ** GOTO lbl48
                            block28: while (true) {
                                var4_3 = (var2_2 | var5_1) ^ -881005010;
lbl48:
                                // 4 sources

                                block29: while (true) {
                                    switch (var4_3) {
                                        case 1121032299: {
                                            var3_4 ^= var4_3 ^ -1535822435;
                                            ** GOTO lbl79
                                        }
                                        case 707543642: {
                                            var3_4 ^= var4_3 ^ 1849228775;
                                            ** GOTO lbl81
                                        }
                                        case 1853219969: {
                                            var4_3 = (var2_2 | var5_1) ^ -658023711;
                                            continue block29;
                                        }
                                        case 66104630: {
                                            var1_5 = this.c;
                                            var4_3 = (var2_2 | var5_1) ^ 1252688075;
                                            ** GOTO lbl42
                                        }
                                        case -1687444194: {
                                            var3_4 ^= var4_3 ^ 646889001;
                                            continue block23;
                                        }
                                        case 1484297051: {
                                            if (this.b >= 2) continue block27;
                                            var4_3 = (var2_2 | var5_1) ^ -1511882863;
                                            continue block29;
                                        }
                                        case -506367547: {
                                            if (this.c < 0) {
                                                var4_3 = (var2_2 | var5_1) ^ 1752958848;
                                                continue block29;
                                            }
                                            ** GOTO lbl77
                                        }
                                        case -1890590598: {
                                            ** GOTO lbl83
                                        }
lbl77:
                                        // 1 sources

                                        var4_3 = (var2_2 | var5_1) ^ -1312408843;
                                        ** GOTO lbl84
lbl79:
                                        // 1 sources

                                        var4_3 = (var2_2 | var5_1) ^ 1926565040;
                                        ** GOTO lbl84
lbl81:
                                        // 1 sources

                                        var4_3 = (var2_2 | var5_1) ^ 1708633710;
                                        ** GOTO lbl84
lbl83:
                                        // 1 sources

                                        var4_3 = (var2_2 | var5_1) ^ 272779871;
lbl84:
                                        // 5 sources

                                        default: {
                                            continue block29;
                                        }
                                        case -227883766: {
                                            var3_4 ^= var4_3 ^ 903930993;
                                            continue block28;
                                        }
                                        case 988796340: {
                                            ++this.b;
                                            continue block27;
                                        }
                                        case 1333408133: 
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                        return false;
                        case -1522224614: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean manualSlotChange() {
        var5_1 = -1901083793;
        var2_2 = jQ.d & -1901083793 ^ 1423082787;
        var4_3 = 0;
        var3_5 = (var2_2 | var5_1) ^ 460348715;
        var4_3 = (var2_2 | var5_1) ^ -965086305;
        if (true) ** GOTO lbl72
        block21: while (true) {
            block32: {
                var4_3 = (var2_2 | var5_1) ^ -351585660;
                break block32;
                {
                    var4_3 = (var2_2 | var5_1) ^ 2122582677;
                    if (true) ** GOTO lbl17
                    block23: while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -508923655;
                        if (true) ** GOTO lbl17
                        block24: while (true) {
                            var4_3 = (var2_2 | var5_1) ^ 923998919;
lbl17:
                            // 4 sources

                            block25: while (true) {
                                switch (var4_3) {
                                    case -1602499078: {
                                        var3_5 ^= var4_3 ^ -1818845613;
                                        var4_3 = (var2_2 | var5_1) ^ -1396919171;
                                        continue block25;
                                    }
                                    case -336925338: {
                                        var3_5 ^= var4_3 ^ -1079744032;
                                        var4_3 = (var2_2 | var5_1) ^ -1443773424;
                                        continue block25;
                                    }
                                    case 455150167: {
                                        v0 = false;
                                        ** GOTO lbl66
                                    }
                                    case 1473090376: {
                                        ** break;
                                    }
                                    case 1997407103: {
                                        if (var1_4.field_1724 != null) {
                                            var4_3 = (var2_2 | var5_1) ^ -1993190361;
                                            continue block25;
                                        }
                                        ** GOTO lbl56
                                    }
                                    case -1869370893: {
                                        if (this.c < 0) continue block24;
                                        ** GOTO lbl56
                                    }
                                    case 1469186149: {
                                        return false;
                                    }
                                    case -370352728: {
                                        var3_5 ^= var4_3 ^ -1050167119;
                                        var4_3 = (var2_2 | var5_1) ^ 902045027;
                                        break;
                                    }
lbl46:
                                    // 1 sources

                                    var4_3 = (var2_2 | var5_1) ^ -1252103242;
                                    continue block25;
                                    case -920475040: {
                                        var4_3 = (var2_2 | var5_1) ^ 1315729052;
                                        continue block25;
                                    }
                                    case -348399092: {
                                        if (var1_4.field_1724.method_31548().field_7545 == this.a) continue block23;
                                        continue block22;
                                    }
                                    case 1805757657: {
                                        if (this.a >= 0) ** GOTO lbl58
lbl56:
                                        // 3 sources

                                        var4_3 = (var2_2 | var5_1) ^ 1766411657;
                                        continue block25;
lbl58:
                                        // 1 sources

                                        var4_3 = (var2_2 | var5_1) ^ 400387343;
                                        continue block25;
                                    }
                                    case 1062582166: {
                                        var3_5 ^= var4_3 ^ 213443647;
                                        var4_3 = (var2_2 | var5_1) ^ -975254216;
                                        break;
                                    }
                                    case 1917022994: {
                                        v0 = true;
lbl66:
                                        // 2 sources

                                        var3_5 ^= 1146348481;
                                        return v0;
                                    }
                                    case -1212773658: {
                                        var3_5 ^= var4_3 ^ -270350931;
                                        var4_3 = (var2_2 | var5_1) ^ -1989294326;
                                    }
                                }
                                continue;
                                break;
                            }
                            break;
                        }
                        break;
                    }
                }
            }
            block26: while (true) {
                switch (var4_3) {
                    default: {
                        continue block26;
                    }
                    case 905248235: {
                        var1_4 = class_310.method_1551();
                        var4_3 = (var2_2 | var5_1) ^ 890579465;
                        ** continue;
                    }
                    case -1549306910: {
                        var3_5 ^= var4_3 ^ -910648263;
                        continue block21;
                    }
                    case 411448560: 
                }
                var4_3 = (var2_2 | var5_1) ^ 2102965389;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public hq choose(eI var1_1, boolean var2_2, boolean var3_3, boolean var4_4, boolean var5_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [54[UNCONDITIONALDOLOOP]], but top level block is 0[SWITCH]
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
    public String describeSelection(class_2338 var1_1, hq var2_2) {
        block26: {
            block29: {
                block23: {
                    block27: {
                        block24: {
                            block28: {
                                block22: {
                                    block25: {
                                        block21: {
                                            break block28;
                                            while (true) {
                                                var5_5 = (var3_4 | var6_3) ^ 1243901291;
                                                break block21;
                                                break;
                                            }
lbl4:
                                            // 1 sources

                                            return v0 + " on " + v1;
lbl6:
                                            // 1 sources

                                            while (true) {
                                                v0 = jQ.d;
                                                break block22;
                                                break;
                                            }
lbl9:
                                            // 1 sources

                                            while (true) {
                                                var4_6 ^= 300523959;
                                                ** continue;
                                                break;
                                            }
                                        }
lbl13:
                                        // 5 sources

                                        block13: while (true) {
                                            switch (var5_5) lbl-1000:
                                            // 3 sources

                                            {
                                                while (true) {
                                                    default: {
                                                        continue block13;
                                                    }
                                                    break;
                                                }
                                                case 416785144: {
                                                    break block23;
                                                }
                                                case 420131872: {
                                                    ** continue;
                                                }
lbl22:
                                                // 1 sources

                                                while (true) {
                                                    var4_6 ^= 1120397564;
                                                    break block24;
                                                    break;
                                                }
                                                case 887398406: {
                                                    var4_6 ^= var5_5 ^ -489557769;
                                                    break block25;
                                                }
lbl28:
                                                // 1 sources

                                                while (true) {
                                                    var5_5 = (var3_4 | var6_3) ^ 666419424;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
                                                case 1654105626: {
                                                    var4_6 ^= var5_5 ^ -543557526;
                                                    break block26;
                                                }
                                                case -670990465: {
                                                    v0 = jQ.e;
                                                    break block22;
                                                }
                                                case -8966335: {
                                                    if (var2_2 != hq.e) ** continue;
                                                    break block27;
                                                }
lbl40:
                                                // 1 sources

                                                while (true) {
                                                    var5_5 = (var3_4 | var6_3) ^ -412213913;
                                                    ** continue;
                                                    break;
                                                }
                                                case -1247948044: {
                                                    var4_6 ^= var5_5 ^ 143887492;
                                                    break block13;
                                                }
                                            }
                                            break;
                                        }
                                        ** while (true)
lbl47:
                                        // 1 sources

                                        while (true) {
                                            v1 = jQ.a;
lbl49:
                                            // 2 sources

                                            while (true) {
                                                var4_6 ^= -2031072371;
                                                ** continue;
                                                break;
                                            }
                                            break;
                                        }
lbl52:
                                        // 1 sources

                                        while (true) {
                                            var4_6 ^= 1120397564;
                                            ** continue;
                                            break;
                                        }
                                    }
                                    var5_5 = (var3_4 | var6_3) ^ 13537502;
                                    ** GOTO lbl13
                                }
                                var4_6 ^= 1951309221;
                                break block29;
                            }
                            var6_3 = 1798377884;
                            var3_4 = jQ.d & 1798377884 ^ -6766969;
                            var5_5 = 0;
                            var4_6 = (var3_4 | var6_3) ^ 229758864;
                            ** while (true)
                        }
                        v1 = var1_1.method_23854();
                        ** while (true)
                    }
                    var5_5 = (var3_4 | var6_3) ^ -1657923195;
                    ** GOTO lbl13
                }
                var5_5 = (var3_4 | var6_3) ^ -883089511;
                ** GOTO lbl13
            }
            ** while (var1_1 != null)
lbl78:
            // 1 sources

            ** while (true)
        }
        var5_5 = (var3_4 | var6_3) ^ -424473665;
        ** while (true)
    }
}

