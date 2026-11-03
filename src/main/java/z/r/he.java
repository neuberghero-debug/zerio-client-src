/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import z.r.am;
import z.r.cE;
import z.r.iC;
import z.r.kB;
import z.r.ko;
import z.r.mj;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class he {
    private static final List<BooleanSupplier> a;
    private static kB a;
    private static iC a;
    public static final int a;
    private static am a;
    private static final List<BooleanSupplier> b;
    private static final List<cE> c;

    /*
     * Enabled aggressive block sorting
     */
    private he() {
        int n2 = a & 0x133F02D9 ^ 0x3E8CD99D;
        int n3 = (n2 | 0x133F02D9) ^ 0x91C8008F;
        n3 ^= 0x82652DA6;
        n3 ^= 0x4C3A96C0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void setRangeExtender(kB kB2) {
        int n2 = 1923243781;
        int n3 = a & 0x72A25F05 ^ 0x44E6FDD4;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xA6BA8B70;
        n4 = (n3 | n2) ^ 0xC1B54670;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case -1219249755: {
                    n4 = (n3 | n2) ^ 0x510BE4E9;
                    continue block7;
                }
                case -541034053: {
                    a = kB2;
                    n4 = (n3 | n2) ^ 0xE8D022DD;
                    continue block7;
                }
                case -943030245: {
                    return;
                }
                case 669850428: {
                    n5 ^= n4 ^ 0x198FC268;
                    n4 = (n3 | n2) ^ 0xA926866E;
                    continue block7;
                }
                case -1640571640: 
            }
            n5 ^= n4 ^ 0x19F85A1F;
            n4 = (n3 | n2) ^ 0xB12C7FCE;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static double entityRange(class_1657 var0, double var1_1) {
        var6_2 = 682851929;
        var3_3 = he.a & 682851929 ^ -2021849504;
        var5_4 = 0;
        var4_5 = (var3_3 | var6_2) ^ 729160720;
        var5_4 = (var3_3 | var6_2) ^ -161262247;
        if (true) ** GOTO lbl24
        block9: while (true) {
            block12: {
                block11: {
                    switch (var5_4) {
                        case 1367727359: {
                            if (he.a != null) {
                                var5_4 = (var3_3 | var6_2) ^ 1250601937;
                                ** break;
                            }
                            var5_4 = (var3_3 | var6_2) ^ 608198089;
                            ** break;
                        }
                        case -1950407760: {
                            var4_5 ^= var5_4 ^ 641317696;
                            var5_4 = (var3_3 | var6_2) ^ -1138298359;
                            ** break;
                        }
                        case -524204992: {
                            v0 = he.a.entityRange(var0, var1_1);
                            break block11;
                        }
                        case 1503406880: {
                            var5_4 = (var3_3 | var6_2) ^ 238571790;
                        }
lbl24:
                        // 6 sources

                        default: {
                            continue block9;
                        }
                        case -445262424: {
                            var4_5 ^= var5_4 ^ 1223904600;
                            break block12;
                        }
                        case -1580781705: {
                            var4_5 ^= var5_4 ^ 270867551;
                            ** break;
                        }
                        case 333024368: 
                    }
                    v0 = var1_1;
                }
                var4_5 ^= 1741792084;
                return v0;
lbl37:
                // 1 sources

                var5_4 = (var3_3 | var6_2) ^ -25517434;
                continue;
            }
            var5_4 = (var3_3 | var6_2) ^ 1329478201;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static double blockRange(class_1657 var0, double var1_1) {
        block22: {
            block26: {
                block24: {
                    block23: {
                        block21: {
                            block20: {
                                block25: {
                                    break block25;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        if (he.a != null) break block20;
                                        break block21;
                                        break;
                                    }
lbl4:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ 1308338996;
                                        break block22;
                                        break;
                                    }
lbl7:
                                    // 2 sources

                                    while (true) {
                                        var4_5 ^= 1538867676;
                                        break block23;
                                        break;
                                    }
lbl10:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = (var3_3 | var6_2) ^ 1822642107;
                                        break block22;
lbl13:
                                        // 1 sources

                                        while (true) {
                                            v0 = var1_1;
                                            ** GOTO lbl7
                                            break;
                                        }
                                        break;
                                    }
                                }
                                var6_2 = 2011298718;
                                var3_3 = he.a & 2011298718 ^ -76673407;
                                var5_4 = 0;
                                break block26;
lbl21:
                                // 1 sources

                                while (true) {
                                    var5_4 = (var3_3 | var6_2) ^ 894475701;
                                    break block22;
                                    break;
                                }
                            }
                            var5_4 = (var3_3 | var6_2) ^ -142971781;
                            break block22;
lbl27:
                            // 1 sources

                            while (true) {
                                var4_5 ^= var5_4 ^ 1415211252;
                                break block24;
                                break;
                            }
                        }
                        var5_4 = (var3_3 | var6_2) ^ -887381990;
                        break block22;
                    }
                    return v0;
lbl35:
                    // 1 sources

                    while (true) {
                        v0 = he.a.blockRange(var0, var1_1);
                        ** continue;
                        break;
                    }
                }
                var5_4 = (var3_3 | var6_2) ^ -819276308;
                break block22;
            }
            var4_5 = (var3_3 | var6_2) ^ 1557893300;
            var5_4 = (var3_3 | var6_2) ^ -1690738719;
            break block22;
lbl45:
            // 1 sources

            while (true) {
                var4_5 ^= var5_4 ^ 923882385;
                ** continue;
                break;
            }
lbl48:
            // 1 sources

            while (true) {
                var4_5 ^= var5_4 ^ 191930352;
                ** continue;
                break;
            }
        }
        block19: while (true) {
            switch (var5_4) {
                default: {
                    continue block19;
                }
                case 818227827: {
                    ** continue;
                }
                case -893427158: {
                    ** continue;
                }
                case 1691787390: {
                    ** continue;
                }
                case -1823690716: {
                    ** continue;
                }
                case -1307290453: {
                    ** continue;
                }
                case 888430469: {
                    ** continue;
                }
                ** case 144020452:
lbl69:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void setHitboxExpander(am var0) {
        block13: {
            block14: {
                break block14;
lbl1:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -62496694;
                    break block13;
                    break;
                }
lbl4:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1283263085;
                    break block13;
                    break;
                }
lbl7:
                // 1 sources

                return;
lbl9:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1138027164;
                    break block13;
                    break;
                }
            }
            var4_1 = 1801999434;
            var1_2 = he.a & 1801999434 ^ -2122321751;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -633204124;
            ** while (true)
lbl18:
            // 1 sources

            while (true) {
                he.a = var0;
                ** continue;
                break;
            }
        }
        block12: while (true) {
            switch (var3_3) {
                default: {
                    continue block12;
                }
                case -1465180553: {
                    ** continue;
                }
                case 1230466087: {
                    ** continue;
                }
                case 389649569: {
                    break;
                }
                case 1492975992: {
                    var2_4 ^= var3_3 ^ 2110665957;
                    ** continue;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ -238008389;
            continue;
            {
                ** case 447722320:
            }
lbl38:
            // 1 sources

            var2_4 ^= var3_3 ^ -465831620;
            var3_3 = (var1_2 | var4_1) ^ -1574397748;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static float hitboxExtra(class_1297 var0) {
        block18: {
            block19: {
                break block19;
lbl1:
                // 1 sources

                return v0;
            }
            var4_1 = 1007110701;
            var1_2 = he.a & 1007110701 ^ -1178201797;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -1367603981;
            ** GOTO lbl30
            while (true) {
                var3_3 = (var1_2 | var4_1) ^ -2107061329;
                ** GOTO lbl20
                break;
            }
lbl12:
            // 1 sources

            block11: while (true) {
                var3_3 = (var1_2 | var4_1) ^ -2092169388;
                if (true) ** GOTO lbl20
lbl15:
                // 1 sources

                while (true) {
                    v0 = he.a.extra(var0);
                    break block11;
                    break;
                }
                block13: while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -269295227;
lbl20:
                    // 5 sources

                    block14: while (true) {
                        switch (var3_3) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                default: {
                                    continue block14;
                                }
                                break;
                            }
                            case -1723049726: {
                                ** continue;
                            }
                            case 1049320555: {
                                v0 = 0.0f;
                                break block11;
                            }
lbl30:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -314324187;
                            ** GOTO lbl-1000
lbl32:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -2059849453;
                                ** continue;
                                break;
                            }
                            case 1379252922: {
                                var2_4 ^= var3_3 ^ 1620240679;
                                break block18;
                            }
                            case 1350864922: {
                                continue block13;
                            }
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            var2_4 ^= -676149093;
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ -1087690242;
        ** GOTO lbl20
lbl45:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 613089853;
            ** continue;
            break;
        }
        {
            case 1068470416: {
                var2_4 ^= var3_3 ^ -286580719;
                ** continue;
            }
            case 49050305: {
                if (he.a != null) ** continue;
                ** continue;
            }
            ** case 956197420:
        }
lbl55:
        // 1 sources

        var2_4 ^= var3_3 ^ -373630291;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void addUseSuppressor(cE cE2) {
        int n2 = 200697280;
        int n3 = a & 0xBF665C0 ^ 0x4C347B7D;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x31B9AF06;
        n4 = (n3 | n2) ^ 0x1BF8AE86;
        block7: while (true) {
            block8: {
                switch (n4) {
                    case -1640787285: {
                        return;
                    }
                    case -1198539576: {
                        c.add(cE2);
                        break;
                    }
                    case 1659970069: {
                        n5 ^= n4 ^ 0x5AA8F361;
                        n4 = (n3 | n2) ^ 0xF779C335;
                    }
                    default: {
                        continue block7;
                    }
                    case 1410257275: {
                        n4 = (n3 | n2) ^ 0x2D075DE8;
                        continue block7;
                    }
                    case -829485655: {
                        n5 ^= n4 ^ 0x479D499F;
                        break block8;
                    }
                }
                n4 = (n3 | n2) ^ 0x81797254;
                continue;
            }
            n4 = (n3 | n2) ^ 0xD1C5ED56;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean suppressVanillaUse() {
        block28: {
            block29: {
                block30: {
                    var5 = -1006567848;
                    var2_1 = he.a & -1006567848 ^ -1041135328;
                    var4_2 = 0;
                    var3_3 = (var2_1 | var5) ^ 2107640308;
                    var4_2 = (var2_1 | var5) ^ -709878770;
                    break block30;
                    while (true) {
                        var4_2 = (var2_1 | var5) ^ -312024285;
                        break block28;
lbl10:
                        // 1 sources

                        while (true) {
                            var4_2 = (var2_1 | var5) ^ 1987423448;
                            break block29;
                            break;
                        }
                        while (true) {
                            var4_2 = (var2_1 | var5) ^ -1260556022;
                            break block29;
                            break;
                        }
lbl16:
                        // 2 sources

                        while (true) {
                            var4_2 = (var2_1 | var5) ^ 1726366157;
                            break block29;
                            break;
                        }
                        break;
                    }
                }
                block25: while (true) {
                    switch (var4_2) {
                        default: {
                            continue block25;
                        }
                        case 272753526: {
                            var4_2 = (var2_1 | var5) ^ 1088621895;
                            continue block25;
                        }
                        case -2062355905: {
                            var3_3 ^= var4_2 ^ 152124814;
                            var4_2 = (var2_1 | var5) ^ -101547079;
                            continue block25;
                        }
                        case 1006861505: 
                    }
                    break;
                }
                var0_4 = he.c.iterator();
                ** GOTO lbl16
            }
            block26: while (true) {
                switch (var4_2) {
                    default: {
                        continue block26;
                    }
                    case 1446765621: {
                        var1_5 = var0_4.next();
                        var4_2 = (var2_1 | var5) ^ 1792898231;
                        break block26;
                    }
                    case -1558724939: {
                        var3_3 ^= var4_2 ^ -668908104;
                        var4_2 = (var2_1 | var5) ^ 905762151;
                        continue block26;
                    }
                    case 1205527568: {
                        var3_3 ^= var4_2 ^ 1637826248;
                        var4_2 = (var2_1 | var5) ^ -1815471283;
                        continue block26;
                    }
                    case 1898745458: {
                        var3_3 ^= var4_2 ^ 1449235427;
                        ** continue;
                    }
                    case -267572705: {
                        if (!var0_4.hasNext()) ** continue;
                        var4_2 = (var2_1 | var5) ^ -2111104152;
                        continue block26;
                    }
                    case -1283173472: {
                        return false;
                    }
                }
                break;
            }
        }
        block27: while (true) {
            switch (var4_2) {
                default: {
                    continue block27;
                }
                case 680991835: {
                    var3_3 ^= var4_2 ^ 1420748810;
                    var4_2 = (var2_1 | var5) ^ 1781900600;
                    continue block27;
                }
                case -1346086336: {
                    ** continue;
                }
                case -1356035121: {
                    var3_3 ^= var4_2 ^ -1905893813;
                    var4_2 = (var2_1 | var5) ^ 1422425706;
                    continue block27;
                }
                case -1260084575: {
                    var3_3 ^= var4_2 ^ -1718348842;
                    var4_2 = (var2_1 | var5) ^ -1983230562;
                    continue block27;
                }
                case -1858502382: {
                    if (!var1_5.suppressVanillaUse()) ** continue;
                    var4_2 = (var2_1 | var5) ^ 1897225689;
                    continue block27;
                }
                case 1278980838: 
            }
            break;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public static void addAutomationSuppressor(BooleanSupplier var0) {
        block14: {
            block15: {
                break block15;
lbl1:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1241869640;
                    break block14;
                    break;
                }
lbl4:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1074339149;
                    break block14;
                    break;
                }
lbl7:
                // 1 sources

                return;
lbl9:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -732469652;
                    break block14;
lbl12:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -159717319;
                    break block14;
                    break;
                }
                he.a.add(var0);
                var3_3 = (var1_2 | var4_1) ^ -1073373143;
                break block14;
            }
            var4_1 = 474255006;
            var1_2 = he.a & 474255006 ^ -1385251869;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -1745010344;
            ** while (true)
        }
        block13: while (true) {
            switch (var3_3) {
                default: {
                    continue block13;
                }
                case 1259624390: {
                    ** continue;
                }
                case 1765398931: {
                    ** continue;
                }
                case 143928647: {
                    var2_4 ^= var3_3 ^ 1690112965;
                    ** continue;
                }
                case 2104172502: {
                    var2_4 ^= var3_3 ^ 1719265828;
                    ** continue;
                }
                case 43539788: 
            }
            break;
        }
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static boolean suppressAutomation() {
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
    public static boolean suppressAutomationExcept(BooleanSupplier var0) {
        block44: {
            block47: {
                block46: {
                    block50: {
                        block48: {
                            block42: {
                                block49: {
                                    block45: {
                                        block43: {
                                            var6_1 = -1528583129;
                                            var3_2 = he.a & -1528583129 ^ 598332038;
                                            var5_3 = 0;
                                            ** GOTO lbl43
lbl5:
                                            // 1 sources

                                            while (true) {
                                                var5_3 = (var3_2 | var6_1) ^ -26516176;
                                                break block42;
                                                break;
                                            }
lbl8:
                                            // 1 sources

                                            while (true) {
                                                var5_3 = (var3_2 | var6_1) ^ -598314927;
                                                if (true) ** GOTO lbl65
                                                break;
                                            }
                                            while (true) {
                                                var5_3 = (var3_2 | var6_1) ^ 752870444;
                                                break block43;
                                                break;
                                            }
lbl14:
                                            // 1 sources

                                            while (true) {
                                                var5_3 = (var3_2 | var6_1) ^ 1467181473;
                                                break block42;
                                                break;
                                            }
lbl17:
                                            // 1 sources

                                            while (true) {
                                                var4_6 ^= var5_3 ^ 929921777;
                                                break block44;
                                                break;
                                            }
lbl20:
                                            // 1 sources

                                            while (true) {
                                                var5_3 = (var3_2 | var6_1) ^ 1048138164;
                                                break block42;
                                                break;
                                            }
lbl23:
                                            // 1 sources

                                            while (true) {
                                                var4_6 ^= var5_3 ^ -1159556874;
                                                ** continue;
                                                break;
                                            }
lbl26:
                                            // 1 sources

                                            return false;
lbl28:
                                            // 2 sources

                                            while (true) {
                                                var5_3 = (var3_2 | var6_1) ^ -876372507;
                                                break block42;
                                                break;
                                            }
                                        }
lbl32:
                                        // 6 sources

                                        block32: while (true) {
                                            switch (var5_3) {
                                                default: {
                                                    continue block32;
                                                }
                                                case 346083644: {
                                                    ** continue;
                                                }
                                                case -1798884041: {
                                                    ** continue;
                                                }
lbl40:
                                                // 1 sources

                                                while (true) {
                                                    var4_6 ^= var5_3 ^ -2078993260;
                                                    ** continue;
                                                    break;
                                                }
lbl43:
                                                // 1 sources

                                                var4_6 = (var3_2 | var6_1) ^ 1501367621;
                                                break block45;
                                                case 37324130: {
                                                    if (!var1_4.hasNext()) ** continue;
                                                    break block32;
                                                }
lbl48:
                                                // 1 sources

                                                while (true) {
                                                    var1_4 = he.a.iterator();
                                                    break block46;
                                                    break;
                                                }
lbl51:
                                                // 1 sources

                                                while (true) {
                                                    var5_3 = (var3_2 | var6_1) ^ 1492999602;
                                                    break block42;
                                                    break;
                                                }
                                                case 1521583289: {
                                                    var2_5 = var1_4.next();
                                                    break block47;
                                                }
lbl57:
                                                // 1 sources

                                                while (true) {
                                                    var4_6 ^= var5_3 ^ 634703914;
                                                    ** GOTO lbl107
                                                    break;
                                                }
                                                case -1959519605: {
                                                    var4_6 ^= var5_3 ^ 2045729418;
                                                    break block48;
                                                }
                                                block37: while (true) {
                                                    var5_3 = (var3_2 | var6_1) ^ 910142655;
lbl65:
                                                    // 3 sources

                                                    block38: while (true) {
                                                        switch (var5_3) {
                                                            default: {
                                                                continue block38;
                                                            }
                                                            case -1848356328: {
                                                                ** continue;
                                                            }
                                                            case 1257980011: {
                                                                continue block37;
                                                            }
                                                            ** case 2076020470:
lbl74:
                                                            // 1 sources

                                                            ** continue;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case -1437742406: {
                                                    var4_6 ^= var5_3 ^ -171250603;
                                                    break block49;
                                                }
                                            }
                                            break;
                                        }
                                        var5_3 = (var3_2 | var6_1) ^ -1286918245;
                                        ** GOTO lbl32
                                    }
                                    var5_3 = (var3_2 | var6_1) ^ -317669684;
                                    ** while (true)
lbl83:
                                    // 1 sources

                                    return true;
                                }
                                var5_3 = (var3_2 | var6_1) ^ -1512932411;
                                ** GOTO lbl32
                            }
lbl89:
                            // 3 sources

                            block40: while (true) {
                                switch (var5_3) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block40;
                                        }
                                        break;
                                    }
                                    case -15293675: {
                                        ** continue;
                                    }
                                    case 1501600663: {
                                        break block46;
                                    }
                                    case 1814586178: {
                                        ** continue;
                                    }
                                    case -1314706722: {
                                        ** continue;
                                    }
                                    case -1718440173: {
                                        ** continue;
                                    }
                                    case -1373878865: {
                                        if (var2_5 == var0) ** GOTO lbl28
                                        ** continue;
                                    }
lbl107:
                                    // 1 sources

                                    var5_3 = (var3_2 | var6_1) ^ 167230216;
                                    ** continue;
                                    case -1908848484: {
                                        var4_6 ^= var5_3 ^ 670001691;
                                        ** continue;
                                    }
                                    case -258435322: {
                                        if (var2_5.getAsBoolean()) ** break;
                                        ** continue;
                                        break block40;
                                    }
                                }
                                break;
                            }
                            break block50;
                        }
                        var5_3 = (var3_2 | var6_1) ^ 858573712;
                        ** GOTO lbl32
                    }
                    var5_3 = (var3_2 | var6_1) ^ 701675067;
                    ** GOTO lbl89
                }
                var5_3 = (var3_2 | var6_1) ^ 228996125;
                ** GOTO lbl32
            }
            var5_3 = (var3_2 | var6_1) ^ 373871737;
            ** while (true)
        }
        var5_3 = (var3_2 | var6_1) ^ -44402146;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void addVanillaBreakOwner(BooleanSupplier booleanSupplier) {
        int n2 = -1762808687;
        int n3 = a & 0x96EDAC91 ^ 0x3B4EDDC5;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xEBB5541;
        n4 = (n3 | n2) ^ 0x5D43FB05;
        block7: while (true) {
            switch (n4) {
                case 2015545749: {
                    return;
                }
                case -975451084: {
                    n5 ^= n4 ^ 0x83A55D13;
                    n4 = (n3 | n2) ^ 0x59DE0C9A;
                    continue block7;
                }
                case -1053813109: {
                    n5 ^= n4 ^ 0x699E4DEA;
                    n4 = (n3 | n2) ^ 0xC7CD3440;
                    continue block7;
                }
                case -492042544: {
                    n4 = (n3 | n2) ^ 0x7A3431E1;
                }
                default: {
                    continue block7;
                }
                case -432934577: 
            }
            b.add(booleanSupplier);
            n4 = (n3 | n2) ^ 0x7EDFEB5E;
        }
    }

    /*
     * Exception decompiling
     */
    public static boolean allowVanillaBlockBreaking() {
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
    public static void setClickRedirect(iC iC2) {
        int n2 = 201782452;
        int n3 = a & 0xC06F4B4 ^ 0x957C721E;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x48FF8F8;
        n4 = (n3 | n2) ^ 0xC13EC674;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case -1715353006: {
                    a = iC2;
                    n4 = (n3 | n2) ^ 0xB504EE8F;
                    continue block7;
                }
                case 679090225: {
                    n5 ^= n4 ^ 0xB5567060;
                    n4 = (n3 | n2) ^ 0x23D4D865;
                    continue block7;
                }
                case 1547710666: {
                    n4 = (n3 | n2) ^ 0x578F0891;
                    continue block7;
                }
                case -890110417: {
                    n5 ^= n4 ^ 0x8861324F;
                    n4 = (n3 | n2) ^ 0x4BF3CEC;
                    continue block7;
                }
                case -1096143141: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static class_1297 silentClickTarget() {
        var3 = -11925444;
        var0_1 = he.a & -11925444 ^ -1484965363;
        var2_2 = 0;
        ** GOTO lbl30
lbl5:
        // 4 sources

        block9: while (true) {
            switch (var2_2) lbl-1000:
            // 4 sources

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
lbl12:
                // 2 sources

                while (true) {
                    var1_3 ^= -1937930102;
                    ** continue;
                    break;
                }
                while (true) {
                    var2_2 = (var0_1 | var3) ^ -2134433771;
                    ** GOTO lbl-1000
                    break;
                }
                case 2142771752: {
                    var1_3 ^= var2_2 ^ -635844668;
                    break block9;
                }
lbl21:
                // 1 sources

                while (true) {
                    var2_2 = (var0_1 | var3) ^ 553838994;
                    ** GOTO lbl-1000
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var2_2 = (var0_1 | var3) ^ 480052529;
                    ** continue;
                    break;
                }
                case 465472717: {
                    var1_3 ^= var2_2 ^ 112501685;
                    ** continue;
                }
lbl30:
                // 1 sources

                var1_3 = (var0_1 | var3) ^ 371156712;
                break;
            }
            break;
        }
        var2_2 = (var0_1 | var3) ^ -76358627;
        ** GOTO lbl5
lbl34:
        // 1 sources

        while (true) {
            var2_2 = (var0_1 | var3) ^ -1160234981;
            ** GOTO lbl5
            break;
        }
lbl37:
        // 1 sources

        while (true) {
            var2_2 = (var0_1 | var3) ^ -457066768;
            ** GOTO lbl5
            break;
        }
        {
            case -562179153: {
                var1_3 ^= var2_2 ^ 2078019139;
                ** continue;
            }
            case 68019744: {
                v0 = he.a.silentClickTarget();
                ** GOTO lbl12
            }
            case 1168572966: {
                v0 = null;
                ** continue;
            }
            case -471711988: {
                if (he.a != null) ** continue;
                ** continue;
            }
        }
        var2_2 = (var0_1 | var3) ^ 897778228;
        ** while (true)
        {
            ** case -889440247:
        }
lbl55:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static void fireWorldReset() {
        block21: {
            block20: {
                block18: {
                    block19: {
                        var3 = -1018742029;
                        var0_1 = he.a & -1018742029 ^ -1922370248;
                        var2_2 = 0;
                        ** GOTO lbl48
lbl5:
                        // 1 sources

                        while (true) {
                            var2_2 = (var0_1 | var3) ^ -2062355196;
                            break block18;
                            break;
                        }
lbl8:
                        // 1 sources

                        while (true) {
                            var1_3 ^= var2_2 ^ -1193722816;
                            break block19;
                            break;
                        }
lbl11:
                        // 1 sources

                        while (true) {
                            var1_3 ^= var2_2 ^ -1414166190;
                            break block20;
                            break;
                        }
lbl14:
                        // 1 sources

                        return;
lbl16:
                        // 1 sources

                        while (true) {
                            ko.reset();
                            ** continue;
                            break;
                        }
                    }
                    var2_2 = (var0_1 | var3) ^ 1046622466;
                }
lbl22:
                // 3 sources

                block14: while (true) {
                    switch (var2_2) lbl-1000:
                    // 4 sources

                    {
                        while (true) {
                            default: {
                                continue block14;
                            }
                            break;
                        }
                        case -1752437094: {
                            ** continue;
                        }
                        case -1931597550: {
                            ** continue;
                        }
                        case -1612167255: {
                            ** continue;
                        }
                        case -904545639: {
                            ** continue;
                        }
lbl35:
                        // 1 sources

                        while (true) {
                            var2_2 = (var0_1 | var3) ^ -448829589;
                            ** GOTO lbl-1000
                            break;
                        }
                        case 709925008: {
                            ** GOTO lbl43
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var2_2 = (var0_1 | var3) ^ 1351071826;
                            ** GOTO lbl-1000
                            break;
                        }
lbl43:
                        // 1 sources

                        var2_2 = (var0_1 | var3) ^ 1491341665;
                        ** continue;
                        case -250753287: {
                            mj.forget();
                            break block21;
                        }
lbl48:
                        // 1 sources

                        var1_3 = (var0_1 | var3) ^ -1857626788;
                        ** continue;
                        case 1249708799: {
                            var1_3 ^= var2_2 ^ -1851555006;
                            break block14;
                        }
                    }
                    break;
                }
                ** while (true)
            }
            var2_2 = (var0_1 | var3) ^ 91899234;
            ** GOTO lbl22
        }
        var2_2 = (var0_1 | var3) ^ 1135728361;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var2 = -1417987165;
        he.a = mK.a(MethodHandles.lookup().lookupClass(), 1828867509);
        var1_1 = 0;
        var0_2 = 138283654;
        var1_1 = var2 ^ 142662930;
        block9: while (true) {
            switch (var1_1) {
                case 1900958605: {
                    he.a = new ArrayList<BooleanSupplier>();
                    var1_1 = var2 ^ -339957950;
                    continue block9;
                }
                case 619851485: {
                    var0_2 ^= var1_1 ^ 591483375;
                    var1_1 = var2 ^ -634034130;
                    continue block9;
                }
                case 1949785794: {
                    var0_2 ^= var1_1 ^ 1976922760;
                    ** break;
                }
                case 1086823649: {
                    var0_2 ^= var1_1 ^ 822605471;
                    var1_1 = var2 ^ -443365806;
                    continue block9;
                }
lbl23:
                // 1 sources

                var1_1 = var2 ^ 633232305;
                default: {
                    continue block9;
                }
                case -1543772495: {
                    var1_1 = var2 ^ -548641439;
                    continue block9;
                }
                case -1899667438: {
                    he.c = new ArrayList<cE>();
                    var1_1 = var2 ^ -1886841474;
                    continue block9;
                }
                case 1323957745: 
            }
            break;
        }
        he.b = new ArrayList<BooleanSupplier>();
    }
}

