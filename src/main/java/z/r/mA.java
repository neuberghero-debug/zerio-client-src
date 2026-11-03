/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import z.r.aq;
import z.r.el;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class mA {
    private static final List<aq> a;
    public static final int a;
    private static final Object a;
    private static final Queue<Object> a;

    /*
     * Enabled aggressive block sorting
     */
    private mA() {
        int n2 = a & 0xCBC891DC ^ 0x2C781C30;
        int n3 = (n2 | 0xCBC891DC) ^ 0xB789A756;
        n3 ^= 0x4BB3A6FE;
        n3 ^= 0x33CB2634;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void addListener(el el2, int n2) {
        int n3 = -1445436900;
        int n4 = a & 0xA9D8621C ^ 0x9413585D;
        int n5 = 0;
        int n6 = (n4 | n3) ^ 0xDED0C338;
        n5 = (n4 | n3) ^ 0x24DA3EF0;
        block9: while (true) {
            switch (n5) {
                default: {
                    continue block9;
                }
                case 1794349081: {
                    a.sort(Comparator.comparingInt(aq::priority).reversed());
                    n5 = (n4 | n3) ^ 0x5AAE0413;
                    continue block9;
                }
                case 339640206: {
                    n6 ^= n5 ^ 0xEFAF21CF;
                    n5 = (n4 | n3) ^ 0x5802B3ED;
                    continue block9;
                }
                case -438711888: {
                    a.add(new aq(el2, n2));
                    n5 = (n4 | n3) ^ 0x8E9529CD;
                    continue block9;
                }
                case 1052634990: {
                    return;
                }
                case 860771216: {
                    n6 ^= n5 ^ 0x46C5D86C;
                    n5 = (n4 | n3) ^ 0xD728E244;
                    continue block9;
                }
                case -1727970131: {
                    n5 = (n4 | n3) ^ 0xA9E505D3;
                    continue block9;
                }
                case -411730354: 
            }
            n6 ^= n5 ^ 0x515DC3EE;
            n5 = (n4 | n3) ^ 0x83669533;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void releaseAttackKey() {
        block32: {
            break block32;
lbl1:
            // 1 sources

            while (true) {
                var3_2 = (var1_1 | var4) ^ -739209832;
                ** GOTO lbl32
                break;
            }
lbl4:
            // 1 sources

            while (true) {
                var2_4 ^= var3_2 ^ -721909801;
                ** GOTO lbl71
                break;
            }
lbl7:
            // 1 sources

            while (true) {
                var3_2 = (var1_1 | var4) ^ 2115010549;
                ** GOTO lbl32
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var2_4 ^= var3_2 ^ 575265838;
                ** continue;
                break;
            }
lbl13:
            // 1 sources

            while (true) {
                var2_4 ^= var3_2 ^ -8938461;
                ** continue;
                break;
            }
            {
                switch (var3_2) lbl-1000:
                // 4 sources

                {
                    while (true) {
                        default: {
                            continue block20;
                        }
                        break;
                    }
                    case 2037037659: {
                        ** continue;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | var4) ^ -1198906687;
                        if (true) ** GOTO lbl32
lbl25:
                        // 1 sources

                        return;
                    }
                    block24: while (true) {
                        var3_2 = (var1_1 | var4) ^ -279215908;
                        ** GOTO lbl32
lbl30:
                        // 1 sources

                        return;
lbl32:
                        // 6 sources

                        block26: while (true) {
                            switch (var3_2) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    default: {
                                        continue block26;
                                    }
                                    break;
                                }
                                case 1568069490: {
                                    ** continue;
                                }
                                case 413423405: {
                                    ** continue;
                                }
                                case 1333130544: {
                                    ** continue;
                                }
                                case 604985961: {
                                    ** continue;
                                }
lbl45:
                                // 1 sources

                                while (true) {
                                    var3_2 = (var1_1 | var4) ^ 1303177498;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl48:
                                // 1 sources

                                while (true) {
                                    var3_2 = (var1_1 | var4) ^ -1902809686;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl51:
                                // 1 sources

                                while (true) {
                                    var3_2 = (var1_1 | var4) ^ -2128779941;
                                    ** GOTO lbl-1000
                                    break;
                                }
                                while (true) {
                                    var3_2 = (var1_1 | var4) ^ -1433862013;
                                    ** continue;
                                    break;
                                }
                                case 1876891521: {
                                    var2_4 ^= var3_2 ^ 1225498937;
                                    ** continue;
                                }
                                case 1088218705: {
                                    var2_4 ^= var3_2 ^ -1981505959;
                                    ** continue;
                                }
                                case -1980782588: {
                                    mA.Bx((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, By(net.minecraft.class_310 ), ()V)((class_310)var0_3));
                                    continue block24;
                                }
                                case 1994568362: {
                                    if (var0_3.field_1690 != null) ** continue;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    case -119471655: {
                        var0_3 = class_310.method_1551();
                        break block20;
                    }
lbl71:
                    // 1 sources

                    var3_2 = (var1_1 | var4) ^ 253679144;
                    ** continue;
                    case -1168949525: {
                        ** continue;
                    }
                }
            }
            var3_2 = (var1_1 | var4) ^ -1742684048;
            ** GOTO lbl32
        }
        var4 = -1744857119;
        var1_1 = mA.a & -1744857119 ^ 2010337776;
        var3_2 = 0;
        var2_4 = (var1_1 | var4) ^ 1083086081;
        ** while (true)
        var3_2 = (var1_1 | var4) ^ -1222430304;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static boolean isAttackButtonDown() {
        block35: {
            block37: {
                block36: {
                    block38: {
                        block33: {
                            block34: {
                                break block38;
                                {
                                    var3_2 = (var1_1 | var4) ^ -528049827;
lbl2:
                                    // 2 sources

                                    block16: while (true) {
                                        switch (var3_2) lbl-1000:
                                        // 2 sources

                                        {
                                            default: {
                                                continue block16;
                                            }
                                            case -8849964: {
                                                var2_3 ^= var3_2 ^ -2102244838;
                                                var3_2 = (var1_1 | var4) ^ 1455248586;
                                                ** GOTO lbl-1000
                                            }
lbl10:
                                            // 1 sources

                                            while (true) {
                                                if (var0_4.field_1690 == null) break block33;
                                                break block34;
                                                break;
                                            }
lbl13:
                                            // 1 sources

                                            while (true) {
                                                var3_2 = (var1_1 | var4) ^ -648192164;
                                                break block35;
                                                break;
                                            }
lbl16:
                                            // 1 sources

                                            while (true) {
                                                var2_3 ^= var3_2 ^ 358266258;
                                                var3_2 = (var1_1 | var4) ^ 865263144;
                                                break block35;
                                                break;
                                            }
lbl20:
                                            // 1 sources

                                            return v0;
lbl22:
                                            // 2 sources

                                            while (true) {
                                                var2_3 ^= 1789603077;
                                                ** continue;
                                                break;
                                            }
lbl25:
                                            // 1 sources

                                            while (true) {
                                                var3_2 = (var1_1 | var4) ^ 248289501;
                                                break block35;
                                                break;
                                            }
                                            case 1229142083: {
                                                var0_4 = class_310.method_1551();
                                                ** continue;
                                            }
                                            case -847745907: {
                                                continue block15;
                                            }
                                        }
                                        break;
                                    }
                                }
lbl33:
                                // 1 sources

                                while (true) {
                                    var3_2 = (var1_1 | var4) ^ -762970108;
                                    ** continue;
                                    break;
                                }
                            }
                            var3_2 = (var1_1 | var4) ^ -147338815;
                            break block35;
lbl39:
                            // 1 sources

                            while (true) {
                                v0 = true;
                                ** GOTO lbl22
                                break;
                            }
                        }
                        while (true) {
                            var3_2 = (var1_1 | var4) ^ 1670989649;
                            break block35;
                            break;
                        }
lbl46:
                        // 1 sources

                        while (true) {
                            var2_3 ^= var3_2 ^ 1134085995;
                            break block36;
                            break;
                        }
lbl49:
                        // 1 sources

                        while (true) {
                            v0 = false;
                            ** continue;
                            break;
                        }
lbl52:
                        // 1 sources

                        while (true) {
                            var2_3 ^= var3_2 ^ 1097788191;
                            ** continue;
                            break;
                        }
lbl55:
                        // 1 sources

                        while (true) {
                            if (!var0_4.field_1690.field_1886.method_1434()) ** continue;
                            break block37;
                            break;
                        }
                    }
                    var4 = 241060873;
                    var1_1 = mA.a & 241060873 ^ 368846976;
                    var3_2 = 0;
                    var2_3 = (var1_1 | var4) ^ 1788390829;
                    ** while (true)
lbl64:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | var4) ^ 371016612;
                        break block35;
                        break;
                    }
                }
                var3_2 = (var1_1 | var4) ^ 450335430;
                break block35;
            }
            var3_2 = (var1_1 | var4) ^ 934091228;
        }
        block32: while (true) {
            switch (var3_2) {
                default: {
                    continue block32;
                }
                case 86638159: {
                    ** continue;
                }
                case 676558165: {
                    ** continue;
                }
                case 745321121: {
                    ** continue;
                }
                case 288552020: {
                    ** continue;
                }
                case -389438136: {
                    ** continue;
                }
                case -962382891: {
                    ** continue;
                }
                case 2087136216: {
                    ** continue;
                }
                ** case 165883693:
lbl92:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public static boolean requestSyntheticAttack(Object var0) {
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
    public static void drainPendingAttacks() {
        block21: {
            break block21;
lbl-1000:
            // 4 sources

            {
                switch (var3_2) {
                    case -338411623: {
                        var2_4 ^= var3_2 ^ -1593234772;
                        ** GOTO lbl28
                    }
                    case 1796945342: {
                        if (var0_3 == mA.a) {
                            var3_2 = (var1_1 | var4) ^ 1588307503;
                            break;
                        }
                        ** GOTO lbl20
                    }
                    case -528389772: {
                        var2_4 ^= var3_2 ^ -1436779455;
                        var3_2 = (var1_1 | var4) ^ -1699647630;
                        break;
                    }
                    case 802092740: {
                        v0 = var0_3;
                        ** GOTO lbl24
                    }
                    case -1182935828: {
                        var2_4 ^= var3_2 ^ -746366100;
                        ** GOTO lbl34
                    }
lbl20:
                    // 1 sources

                    var3_2 = (var1_1 | var4) ^ 1442771138;
                    continue block15;
                    case -738592125: {
                        v0 = null;
lbl24:
                        // 2 sources

                        var2_4 ^= -197880559;
                        mA.Bu(v0);
                        ** GOTO lbl61
                    }
lbl28:
                    // 1 sources

                    var3_2 = (var1_1 | var4) ^ 1720083253;
                    continue block15;
                    case -1519457139: {
                        var2_4 ^= var3_2 ^ -1253811492;
                        var3_2 = (var1_1 | var4) ^ -1040355775;
                        break;
                    }
lbl34:
                    // 1 sources

                    var3_2 = (var1_1 | var4) ^ -563827704;
                    continue block15;
                    case 1954740215: {
                        return;
                    }
                }
lbl38:
                // 6 sources

                ** while (true)
            }
lbl39:
            // 1 sources

            while (true) {
                var3_2 = (var1_1 | var4) ^ 269579579;
                ** GOTO lbl38
                break;
            }
lbl42:
            // 1 sources

            while (true) {
                var3_2 = (var1_1 | var4) ^ 201477466;
                ** GOTO lbl38
                break;
            }
        }
        var4 = -1254157914;
        var1_1 = mA.a & -1254157914 ^ -2140108652;
        var3_2 = 0;
        var2_4 = (var1_1 | var4) ^ -209047848;
        var3_2 = (var1_1 | var4) ^ -926914767;
        block19: while (true) {
            switch (var3_2) {
                default: {
                    continue block19;
                }
                case 2109734535: {
                    ** break;
                }
                case 2117624477: {
                    var2_4 ^= var3_2 ^ -1439732423;
                    var3_2 = (var1_1 | var4) ^ -1280282536;
                    continue block19;
                }
lbl61:
                // 2 sources

                var3_2 = (var1_1 | var4) ^ -884475093;
                continue block19;
                case 114289134: 
            }
            break;
        }
        ** while ((var0_3 = mA.a.poll()) == null)
lbl65:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static boolean Bu(Object var0) {
        block21: {
            var4_1 = 639212046;
            var1_2 = mA.a & 639212046 ^ 373261934;
            var3_3 = 0;
            if (true) ** GOTO lbl53
            block11: while (true) {
                var3_3 = (var1_2 | var4_1) ^ -1611076606;
                if (true) ** GOTO lbl19
lbl8:
                // 1 sources

                while (true) {
                    var2_4 ^= var3_3 ^ 1646440978;
                    break block21;
                    break;
                }
                block13: while (true) {
                    block22: {
                        var3_3 = (var1_2 | var4_1) ^ 21872296;
                        break block22;
lbl14:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 625459442;
                            ** GOTO lbl37
                            break;
                        }
lbl17:
                        // 1 sources

                        return true;
                    }
lbl20:
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
                            case -808007737: {
                                ** continue;
                            }
                            case -1460121718: {
                                ** continue;
                            }
                            case 412633993: {
                                ** continue;
                            }
lbl31:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1271705604;
                                ** GOTO lbl-1000
                                break;
                            }
lbl34:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -102147671;
                                ** GOTO lbl-1000
                                break;
                            }
lbl37:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ 782751207;
                            ** GOTO lbl-1000
                            case -1446546836: {
                                var2_4 ^= var3_3 ^ -2109803332;
                            }
                            var3_3 = (var1_2 | var4_1) ^ -467987237;
                            ** GOTO lbl-1000
                            case 1267146043: {
                                continue block13;
                            }
                            case 2113089130: {
                                if (!mA.Bv(var0, true)) continue block11;
                                ** continue;
                            }
lbl48:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1631071772;
                                ** GOTO lbl-1000
                                break;
                            }
                            case 1417044004: {
                                return false;
                            }
lbl53:
                            // 1 sources

                            var2_4 = (var1_2 | var4_1) ^ 592177938;
                            var3_3 = (var1_2 | var4_1) ^ 2109244245;
                            ** continue;
                            case -769357131: {
                                mA.Bw();
                                ** continue;
                            }
                            case 930226374: 
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            var2_4 ^= var3_3 ^ -1410758700;
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ 1649016394;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean onManualAttackClick() {
        int n2 = a & 0x1AEB861E ^ 0xE0D19424;
        int n3 = 0;
        int n4 = (n2 | 0x1AEB861E) ^ 0x1CEAA056;
        n3 = (n2 | 0x1AEB861E) ^ 0x7279915;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 745468968: {
                    n4 ^= n3 ^ 0x1EFC1939;
                    n3 = (n2 | 0x1AEB861E) ^ 0x624DCF24;
                    continue block5;
                }
                case -35909845: {
                    n3 = (n2 | 0x1AEB861E) ^ 0xD6956216;
                    continue block5;
                }
                case -1732880102: 
            }
            break;
        }
        return mA.Bv(null, false);
    }

    /*
     * Exception decompiling
     */
    private static boolean Bv(Object var0, boolean var1_1) {
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
     * Exception decompiling
     */
    private static void Bw() {
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
    private static void Bx(Runnable var0) {
        var5_1 = 2010790895;
        var2_2 = mA.a & 2010790895 ^ 2111989308;
        var4_3 = 0;
        var3_5 = (var2_2 | var5_1) ^ 928526588;
        var4_3 = (var2_2 | var5_1) ^ -343832861;
        if (true) ** GOTO lbl51
lbl7:
        // 1 sources

        while (true) {
            var4_3 = (var2_2 | var5_1) ^ 2020023501;
            if (true) ** GOTO lbl18
            block16: while (true) {
                var4_3 = (var2_2 | var5_1) ^ -2046746788;
                ** GOTO lbl18
                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 78214823;
                    if (true) ** GOTO lbl18
                    break;
                }
                block18: while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -1001300718;
lbl18:
                    // 4 sources

                    block19: while (true) {
                        switch (var4_3) {
                            case 684964129: {
                                if (!var1_4.method_18854()) ** continue;
                                ** break;
                            }
                            case -705175490: {
                                var1_4.execute(var0);
                                continue block18;
                            }
                            case 127755058: {
                                var3_5 ^= var4_3 ^ 1895626668;
                                var4_3 = (var2_2 | var5_1) ^ 1462355678;
                                continue block19;
                            }
                            case 2069039448: {
                                var3_5 ^= var4_3 ^ 252151759;
                                var4_3 = (var2_2 | var5_1) ^ -1441947711;
                            }
                            default: {
                                continue block19;
                            }
                            case -1146412307: {
                                var3_5 ^= var4_3 ^ -662767261;
                                continue block16;
                            }
                            case 959440655: {
                                var0.run();
                                continue block18;
                            }
lbl41:
                            // 1 sources

                            var4_3 = (var2_2 | var5_1) ^ 2103887628;
                            continue block19;
                            case 43825395: {
                                var3_5 ^= var4_3 ^ 1992832612;
                                var4_3 = (var2_2 | var5_1) ^ 1188403440;
                                continue block19;
                            }
                            case -100966237: 
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            return;
        }
        block20: while (true) {
            var4_3 = (var2_2 | var5_1) ^ 1505592866;
lbl51:
            // 2 sources

            block21: while (true) {
                switch (var4_3) {
                    default: {
                        continue block21;
                    }
                    case -941638830: {
                        var3_5 ^= var4_3 ^ -2075850466;
                        continue block20;
                    }
                    case 642251229: {
                        var1_4 = class_310.method_1551();
                        ** continue;
                    }
                    case -1803814628: 
                }
                var4_3 = (var2_2 | var5_1) ^ -1205484371;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ void By(class_310 var0) {
        block16: {
            block15: {
                break block15;
lbl1:
                // 5 sources

                block9: while (true) {
                    switch (var3_3) lbl-1000:
                    // 3 sources

                    {
                        default: {
                            continue block9;
                        }
                        case 70244123: {
                            ** GOTO lbl-1000
                        }
                        case 409169222: lbl-1000:
                        // 2 sources

                        {
                            var3_3 = (var1_2 | var4_1) ^ -1349118907;
                            ** GOTO lbl-1000
                        }
                    }
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1558674514;
                    ** GOTO lbl1
                    break;
                }
                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 139013940;
                    ** GOTO lbl1
                    break;
                }
                {
                    case -603089954: {
                        if (!var0.field_1690.field_1886.method_1436()) ** continue;
                        var3_3 = (var1_2 | var4_1) ^ -281474273;
                        ** GOTO lbl-1000
                    }
                    case 351140525: {
                        var2_4 ^= var3_3 ^ 497728521;
                        break block16;
                    }
                }
lbl23:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1084999181;
                    ** GOTO lbl1
                    break;
                }
                {
                    case 1275174174: {
                        return;
                    }
                    case 1413670391: {
                        var2_4 ^= var3_3 ^ 1560650579;
                        ** continue;
                    }
                }
lbl31:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -142969866;
                    ** GOTO lbl1
                    break;
                }
            }
            var4_1 = -1152365888;
            var1_2 = mA.a & -1152365888 ^ 695985256;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ 1218350168;
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ 1735818550;
        ** while (true)
        {
            ** case -1288519204:
        }
lbl44:
        // 1 sources

        var2_4 ^= var3_3 ^ -796944936;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            break block16;
lbl1:
            // 1 sources

            while (true) {
                mA.a = new ConcurrentLinkedQueue<E>();
                ** GOTO lbl25
                break;
            }
lbl4:
            // 2 sources

            block10: while (true) {
                switch (var1_1) lbl-1000:
                // 6 sources

                {
                    while (true) {
                        default: {
                            continue block10;
                        }
                        break;
                    }
                    case 768497968: {
                        ** continue;
                    }
lbl11:
                    // 1 sources

                    while (true) {
                        var1_1 = var2 ^ -1372641931;
                        ** GOTO lbl-1000
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var1_1 = var2 ^ 2021540919;
                        ** GOTO lbl-1000
                        break;
                    }
                    case -691783195: {
                        mA.a = new ArrayList<aq>();
                        ** continue;
                    }
                    case 1766636427: {
                        var0_2 ^= var1_1 ^ -237050151;
                        break;
                    }
                    case 1594969768: {
                        break block10;
                    }
lbl25:
                    // 1 sources

                    var1_1 = var2 ^ -874010589;
                    ** GOTO lbl-1000
lbl27:
                    // 1 sources

                    while (true) {
                        var1_1 = var2 ^ -940128679;
                        ** GOTO lbl-1000
                        break;
                    }
lbl30:
                    // 1 sources

                    while (true) {
                        var1_1 = var2 ^ 1310961940;
                        ** continue;
                        break;
                    }
                    case -623552609: {
                        var0_2 ^= var1_1 ^ 2000769105;
                        ** continue;
                    }
                }
                break;
            }
            var1_1 = var2 ^ -1463953481;
            ** GOTO lbl4
            {
                case -1088562487: {
                    mA.a = new Object();
                    return;
                }
            }
            var1_1 = var2 ^ 1023190668;
            ** while (true)
            {
                ** case -1181800437:
            }
lbl44:
            // 1 sources

            var0_2 ^= var1_1 ^ 150508786;
            ** while (true)
        }
        var2 = 288554940;
        mA.a = mK.a(MethodHandles.lookup().lookupClass(), -824137882);
        var1_1 = 0;
        var0_2 = 603470218;
        ** while (true)
    }
}

