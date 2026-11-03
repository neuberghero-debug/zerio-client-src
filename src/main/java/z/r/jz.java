/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1297
 *  net.minecraft.class_1937
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_746
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_746;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class jz {
    private boolean a;
    private final class_1937 a;
    private final class_1297 a;
    private double a;
    private double b;
    private double c;
    private final float a;
    private double d;
    private boolean b;
    private final double e;
    private class_238 a;
    private float b;
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), -932035875);
    private final float c;
    private double f;
    private double g;
    private boolean c;

    /*
     * Exception decompiling
     */
    private jz(class_746 var1_1, class_1937 var2_2) {
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
    public static jz of(class_746 var0, class_1937 var1_1) {
        var5_2 = 563644368;
        var2_3 = jz.a & 563644368 ^ 721872385;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ 1430142440;
        var4_4 = (var2_3 | var5_2) ^ -2068912841;
        if (true) ** GOTO lbl12
        block11: while (true) {
            var4_4 = (var2_3 | var5_2) ^ -534110919;
            if (true) ** GOTO lbl12
            block12: while (true) {
                var4_4 = (var2_3 | var5_2) ^ 873054597;
lbl12:
                // 3 sources

                block13: while (true) {
                    block14: {
                        switch (var4_4) {
                            case 796455503: {
                                return new jz(var0, var1_1);
                            }
                            case 1078609807: {
                                var4_4 = (var2_3 | var5_2) ^ -1353166547;
                                continue block13;
                            }
                            case -2034380402: {
                                var3_5 ^= var4_4 ^ -1954849978;
                                var4_4 = (var2_3 | var5_2) ^ 82187678;
                                continue block13;
                            }
                            case 1186120497: {
                                var3_5 ^= var4_4 ^ -182668206;
                                ** break;
                            }
                            case -2067351812: {
                                if (var1_1 == null) continue block12;
                                var4_4 = (var2_3 | var5_2) ^ -1390201249;
                                break;
                            }
lbl30:
                            // 1 sources

                            var4_4 = (var2_3 | var5_2) ^ 1808336813;
                            break;
                            case -877331736: {
                                return null;
                            }
                            case -1355808026: {
                                break block14;
                            }
                            case 529999444: {
                                var3_5 ^= var4_4 ^ -1420756436;
                                continue block11;
                            }
                            case 1079500924: {
                                if (var0 != null) ** break;
                                continue block12;
                                var4_4 = (var2_3 | var5_2) ^ 1809096798;
                            }
                        }
                        continue;
                    }
                    var4_4 = (var2_3 | var5_2) ^ 1831609568;
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public void setFallFlying(boolean var1_1) {
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
    public boolean isFallFlying() {
        int n2 = a & 0x202E72C3 ^ 0xA7C0E7B2;
        int n3 = 0;
        int n4 = (n2 | 0x202E72C3) ^ 0x4A3DE971;
        n3 = (n2 | 0x202E72C3) ^ 0xDFA2BCF5;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1036155940: {
                    n4 ^= n3 ^ 0x4C9B28F7;
                    n3 = (n2 | 0x202E72C3) ^ 0xFA1DE996;
                    continue block5;
                }
                case 2018265862: {
                    n3 = (n2 | 0x202E72C3) ^ 0x65D3742F;
                    continue block5;
                }
                case 1576214117: 
            }
            break;
        }
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean isOnGround() {
        int n2 = a & 0xB0316EAB ^ 0xFCD1A72C;
        int n3 = 0;
        int n4 = (n2 | 0xB0316EAB) ^ 0x4FA120AC;
        n3 = (n2 | 0xB0316EAB) ^ 0x9C7A6F91;
        block5: while (true) {
            switch (n3) {
                case -356073628: {
                    return this.b;
                }
                case 1619755070: {
                    n3 = (n2 | 0xB0316EAB) ^ 0xEBBE94C4;
                    continue block5;
                }
                case 391084907: {
                    n4 ^= n3 ^ 0xDE1DEFCE;
                    n3 = (n2 | 0xB0316EAB) ^ 0x163750CB;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public double getX() {
        int n2 = a & 0x8F3C174D ^ 0x8CC4C66;
        int n3 = 0;
        int n4 = (n2 | 0x8F3C174D) ^ 0x83E66865;
        n3 = (n2 | 0x8F3C174D) ^ 0xCD6180A0;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -190981632: {
                    n4 ^= n3 ^ 0x6597E363;
                    n3 = (n2 | 0x8F3C174D) ^ 0xCE858CB3;
                    continue block5;
                }
                case 1098503132: {
                    return this.g;
                }
                case 1117642703: 
            }
            n3 = (n2 | 0x8F3C174D) ^ 0x7B61856F;
        }
    }

    /*
     * Unable to fully structure code
     */
    public double getY() {
        var1_1 = jz.a & 1256282133 ^ 752695387;
        var3_2 = 0;
        ** GOTO lbl15
lbl4:
        // 1 sources

        block5: while (true) {
            switch (var3_2) lbl-1000:
            // 3 sources

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
                    var3_2 = (var1_1 | 1256282133) ^ 1245176569;
                    ** GOTO lbl-1000
                    break;
                }
                case 617257638: {
                    var2_3 ^= var3_2 ^ -1850115373;
                    break block5;
                }
lbl15:
                // 1 sources

                var2_3 = (var1_1 | 1256282133) ^ -1584327150;
                var3_2 = (var1_1 | 1256282133) ^ 1784050611;
                ** continue;
                case 872127038: {
                    return this.d;
                }
            }
            break;
        }
        var3_2 = (var1_1 | 1256282133) ^ 1560732257;
        ** while (true)
        {
            ** case 78318572:
        }
lbl23:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public double getZ() {
        int n2 = a & 0xDFD9585 ^ 0x5807BC24;
        int n3 = 0;
        int n4 = (n2 | 0xDFD9585) ^ 0x6324FDF6;
        n3 = (n2 | 0xDFD9585) ^ 0x6033D193;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -37075065: {
                    n4 ^= n3 ^ 0xCE5269AF;
                    n3 = (n2 | 0xDFD9585) ^ 0xDFB1ED6A;
                    continue block5;
                }
                case -2108796721: {
                    return this.f;
                }
                case 1036807222: 
            }
            n3 = (n2 | 0xDFD9585) ^ 0xA035FA22;
        }
    }

    /*
     * Unable to fully structure code
     */
    public double getVelocityY() {
        var1_1 = jz.a & -1917036688 ^ 481767174;
        var3_2 = 0;
        if (true) ** GOTO lbl18
lbl4:
        // 1 sources

        return this.c;
        block6: while (true) {
            var3_2 = (var1_1 | -1917036688) ^ -1428587546;
lbl8:
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
                    case -1880212193: {
                        ** continue;
                    }
lbl15:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | -1917036688) ^ 1969699571;
                        ** continue;
                        break;
                    }
lbl18:
                    // 1 sources

                    var2_3 = (var1_1 | -1917036688) ^ -1433022827;
                    ** continue;
                    case 929432720: {
                        var2_3 ^= var3_2 ^ -1782351233;
                        break block6;
                    }
                    case -388479611: {
                        continue block6;
                    }
                }
                break;
            }
            break;
        }
        var3_2 = (var1_1 | -1917036688) ^ 307315305;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public float getFallDistance() {
        block7: {
            break block7;
lbl1:
            // 1 sources

            block5: while (true) {
                switch (var3_2) lbl-1000:
                // 2 sources

                {
                    default: {
                        continue block5;
                    }
                    case 1008795606: {
                        var2_3 ^= var3_2 ^ -90943638;
                        break;
                    }
                    case -1836654391: {
                        var3_2 = (var1_1 | -282763144) ^ -740456662;
                        ** GOTO lbl-1000
                    }
                }
                var3_2 = (var1_1 | -282763144) ^ 444111380;
                continue;
                {
                    ** case -175775000:
                }
lbl14:
                // 1 sources

                return this.b;
            }
        }
        var1_1 = jz.a & -282763144 ^ 654080180;
        var3_2 = 0;
        var2_3 = (var1_1 | -282763144) ^ 92189163;
        var3_2 = (var1_1 | -282763144) ^ 2105251893;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setFallDistance(float f2) {
        int n2 = -36493953;
        int n3 = a & 0xFDD3257F ^ 0xA658C1F1;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x42FF5873;
        n4 = (n3 | n2) ^ 0xA7718402;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case -1878462300: {
                    this.b = f2;
                    n4 = (n3 | n2) ^ 0x3946EC80;
                    continue block7;
                }
                case -962786945: {
                    n5 ^= n4 ^ 0x2D007D76;
                    n4 = (n3 | n2) ^ 0x3C849B5A;
                    continue block7;
                }
                case 472427650: {
                    n5 ^= n4 ^ 0xBDD482A2;
                    n4 = (n3 | n2) ^ 0x6FD3155B;
                    continue block7;
                }
                case -1017151835: {
                    return;
                }
                case 1487561213: 
            }
            n4 = (n3 | n2) ^ 0xE3F3497D;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void simulateTick() {
        block56: {
            block58: {
                block55: {
                    block54: {
                        block53: {
                            block57: {
                                block51: {
                                    block52: {
                                        block59: {
                                            break block59;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                var7_3 = (var5_2 | var8_1) ^ -1796503787;
                                                ** GOTO lbl39
lbl4:
                                                // 3 sources

                                                while (true) {
                                                    var7_3 = (var5_2 | var8_1) ^ -1549047243;
                                                    ** GOTO lbl39
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                        var8_1 = -1261410254;
                                        var5_2 = jz.a & -1261410254 ^ 382578007;
                                        var7_3 = 0;
                                        var6_6 = (var5_2 | var8_1) ^ 1435065389;
                                        ** GOTO lbl67
lbl13:
                                        // 1 sources

                                        while (true) {
                                            var7_3 = (var5_2 | var8_1) ^ -1756374637;
                                            break block51;
                                            break;
                                        }
lbl16:
                                        // 1 sources

                                        while (true) {
                                            var6_6 ^= var7_3 ^ -1264239523;
                                            break block52;
                                            break;
                                        }
lbl19:
                                        // 1 sources

                                        while (true) {
                                            var7_3 = (var5_2 | var8_1) ^ 1069831627;
                                            if (true) ** GOTO lbl39
                                            break;
                                        }
lbl22:
                                        // 1 sources

                                        while (true) {
                                            var6_6 ^= var7_3 ^ 1306663595;
                                            ** GOTO lbl88
                                            break;
                                        }
                                    }
                                    var7_3 = (var5_2 | var8_1) ^ -498345513;
                                    break block57;
lbl28:
                                    // 1 sources

                                    while (true) {
                                        var7_3 = (var5_2 | var8_1) ^ -1499113264;
                                        break block51;
                                        break;
                                    }
                                    block34: while (true) {
                                        var7_3 = (var5_2 | var8_1) ^ 1984083382;
                                        ** GOTO lbl39
lbl34:
                                        // 1 sources

                                        while (true) {
                                            var7_3 = (var5_2 | var8_1) ^ -682065841;
                                            if (true) ** GOTO lbl39
                                            break;
                                        }
                                        block36: while (true) {
                                            var7_3 = (var5_2 | var8_1) ^ -1529511443;
lbl39:
                                            // 9 sources

                                            block37: while (true) {
                                                switch (var7_3) lbl-1000:
                                                // 2 sources

                                                {
                                                    while (true) {
                                                        default: {
                                                            continue block37;
                                                        }
                                                        break;
                                                    }
                                                    case -2086107423: {
                                                        break block53;
                                                    }
lbl46:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl48:
                                                    // 1 sources

                                                    while (true) {
                                                        var6_6 ^= var7_3 ^ -885088135;
                                                        ** GOTO lbl103
                                                        break;
                                                    }
                                                    case 573991522: {
                                                        var6_6 ^= var7_3 ^ 1839272479;
                                                        ** continue;
                                                    }
                                                    case 1636134200: {
                                                        this.b += (float)(-var3_5);
                                                        ** GOTO lbl4
                                                    }
                                                    case -1063298879: {
                                                        var6_6 ^= var7_3 ^ -2083285684;
                                                        ** continue;
                                                    }
lbl60:
                                                    // 1 sources

                                                    while (true) {
                                                        if (this.c) {
                                                            break block54;
                                                        }
                                                        ** GOTO lbl98
                                                        break;
                                                    }
                                                    case 360089410: {
                                                        var6_6 ^= var7_3 ^ -1436934896;
                                                        continue block36;
                                                    }
lbl67:
                                                    // 1 sources

                                                    var7_3 = (var5_2 | var8_1) ^ 245903920;
                                                    break block34;
                                                    case 1576937695: {
                                                        if (!this.b) ** GOTO lbl4
                                                        break block55;
                                                    }
lbl72:
                                                    // 1 sources

                                                    while (true) {
                                                        var3_5 = this.d - var1_4;
                                                        continue block34;
                                                        break;
                                                    }
lbl75:
                                                    // 1 sources

                                                    while (true) {
                                                        var6_6 ^= var7_3 ^ 761682431;
                                                        ** continue;
                                                        break;
                                                    }
lbl78:
                                                    // 1 sources

                                                    while (true) {
                                                        this.ES();
                                                        ** GOTO lbl108
                                                        break;
                                                    }
                                                    case -1994803012: {
                                                        if (var3_5 < 0.0) {
                                                            ** continue;
                                                        }
                                                        break block56;
                                                    }
                                                    case -283543632: {
                                                        var6_6 ^= var7_3 ^ -1601302579;
                                                        ** GOTO lbl96
                                                    }
lbl88:
                                                    // 1 sources

                                                    var7_3 = (var5_2 | var8_1) ^ 1744376858;
                                                    break block57;
lbl90:
                                                    // 1 sources

                                                    while (true) {
                                                        var6_6 ^= var7_3 ^ 593627447;
                                                        break block58;
                                                        break;
                                                    }
lbl93:
                                                    // 1 sources

                                                    while (true) {
                                                        this.ET();
                                                        ** GOTO lbl108
                                                        break;
                                                    }
lbl96:
                                                    // 1 sources

                                                    var7_3 = (var5_2 | var8_1) ^ -349977176;
                                                    ** continue;
lbl98:
                                                    // 1 sources

                                                    var7_3 = (var5_2 | var8_1) ^ -2123623814;
                                                    break block57;
                                                    var1_4 = this.d;
                                                    var7_3 = (var5_2 | var8_1) ^ -58953875;
                                                    break block57;
lbl103:
                                                    // 1 sources

                                                    var7_3 = (var5_2 | var8_1) ^ 299315871;
                                                    break block57;
                                                    case 272556408: {
                                                        this.b = 0.0f;
                                                        ** continue;
                                                    }
lbl108:
                                                    // 2 sources

                                                    var7_3 = (var5_2 | var8_1) ^ 1354206052;
                                                    break block57;
                                                    case 302541978: {
                                                        return;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                }
                                block47: while (true) {
                                    switch (var7_3) {
                                        default: {
                                            continue block47;
                                        }
                                        case 276346279: {
                                            ** continue;
                                        }
                                        case -1200234681: {
                                            ** continue;
                                        }
                                        ** case 563229924:
lbl122:
                                        // 1 sources

                                        ** continue;
                                    }
                                    break;
                                }
                            }
lbl124:
                            // 3 sources

                            block48: while (true) {
                                switch (var7_3) {
                                    default: {
                                        continue block48;
                                    }
                                    case 1210737449: {
                                        ** continue;
                                    }
                                    case 1252098586: {
                                        ** continue;
                                    }
                                    case 934412045: {
                                        ** continue;
                                    }
                                    case -786106003: {
                                        ** continue;
                                    }
                                    case -1247359204: {
                                        ** continue;
                                    }
                                    case -1492459544: {
                                        ** continue;
                                    }
                                    case -429234669: {
                                        ** continue;
                                    }
                                    ** case 1419130016:
lbl143:
                                    // 1 sources

                                    ** continue;
                                }
                                break;
                            }
                        }
                        var7_3 = (var5_2 | var8_1) ^ -1495069681;
                        ** GOTO lbl39
                    }
                    var7_3 = (var5_2 | var8_1) ^ -17330594;
                    ** GOTO lbl124
                }
                var7_3 = (var5_2 | var8_1) ^ 896887702;
                ** GOTO lbl39
            }
            var7_3 = (var5_2 | var8_1) ^ 58401387;
            ** while (true)
        }
        var7_3 = (var5_2 | var8_1) ^ 1506056903;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private void ES() {
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
    private void ET() {
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
    private class_243 EU() {
        block20: {
            block21: {
                block18: {
                    block17: {
                        block16: {
                            block15: {
                                block14: {
                                    block19: {
                                        break block19;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl3:
                                        // 1 sources

                                        while (true) {
                                            var8_5 ^= 1200540591;
                                            ** GOTO lbl40
                                            break;
                                        }
lbl6:
                                        // 1 sources

                                        while (true) {
                                            var8_5 ^= var9_2 ^ 1434263520;
                                            break block14;
                                            break;
                                        }
lbl9:
                                        // 1 sources

                                        while (true) {
                                            var9_2 = (var7_1 | -483250716) ^ 978004482;
                                            break block15;
                                            break;
                                        }
lbl12:
                                        // 1 sources

                                        while (true) {
                                            var8_5 ^= 1683961555;
                                            ** continue;
                                            break;
                                        }
lbl15:
                                        // 1 sources

                                        while (true) {
                                            var8_5 ^= -245341346;
                                            break block16;
                                            break;
                                        }
                                        var3_6 = (float)Math.cos(var2_4);
                                        var8_5 ^= -65882278;
                                        break block20;
                                    }
                                    var7_1 = jz.a & -483250716 ^ -1806011225;
                                    var9_2 = 0;
                                    var8_5 = (var7_1 | -483250716) ^ -611912924;
                                    ** while (true)
lbl26:
                                    // 1 sources

                                    while (true) {
                                        var8_5 ^= -1428672156;
                                        break block17;
                                        break;
                                    }
                                }
                                var9_2 = (var7_1 | -483250716) ^ -2117701977;
                            }
lbl32:
                            // 2 sources

                            block12: while (true) {
                                switch (var9_2) {
                                    default: {
                                        continue block12;
                                    }
                                    case -852404251: {
                                        break block18;
                                    }
                                    case -623854999: {
                                        ** continue;
                                    }
lbl40:
                                    // 1 sources

                                    return new class_243((double)(var4_7 * var5_8), (double)(-var6_9), (double)(var3_6 * var5_8));
                                    case 1992037184: {
                                        var1_3 = this.c * 0.017453292f;
                                        break block12;
                                    }
                                }
                                break;
                            }
                            break block21;
                        }
                        var6_9 = (float)Math.sin(var1_3);
                        ** while (true)
                    }
                    var5_8 = (float)Math.cos(var1_3);
                    ** while (true)
                }
                var9_2 = (var7_1 | -483250716) ^ 766166926;
                ** while (true)
lbl54:
                // 1 sources

                while (true) {
                    var2_4 = -this.a * 0.017453292f;
                    ** continue;
                    break;
                }
            }
            var8_5 ^= 1271710139;
            ** while (true)
        }
        var4_7 = (float)Math.sin(var2_4);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void EV(double var1_1, double var3_2, double var5_3) {
        block103: {
            block104: {
                break block104;
lbl1:
                // 1 sources

                while (true) {
                    var13_6 = (var11_5 | var14_4) ^ -1362285083;
                    ** GOTO lbl223
                    break;
                }
lbl4:
                // 1 sources

                while (true) {
                    var13_6 = (var11_5 | var14_4) ^ -1353057339;
                    ** GOTO lbl162
                    break;
                }
lbl7:
                // 1 sources

                while (true) {
                    var13_6 = (var11_5 | var14_4) ^ -806993018;
                    ** GOTO lbl162
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var13_6 = (var11_5 | var14_4) ^ 291118763;
                    ** GOTO lbl223
                    break;
                }
            }
            var14_4 = -1123681337;
            var11_5 = jz.a & -1123681337 ^ -736345394;
            var13_6 = 0;
            var12_11 = (var11_5 | var14_4) ^ 1064296312;
            var13_6 = (var11_5 | var14_4) ^ 422235534;
            block69: while (true) {
                switch (var13_6) {
                    case -8013515: {
                        var12_11 ^= var13_6 ^ 4154824;
                        var13_6 = (var11_5 | var14_4) ^ -764097975;
                        ** break;
                    }
                    case -466143679: {
                        var13_6 = (var11_5 | var14_4) ^ 43533050;
                    }
lbl27:
                    // 3 sources

                    default: {
                        continue block69;
                    }
                    case 795423110: 
                }
                break;
            }
            var7_7 = new class_243(var1_1, var3_2, var5_3);
            var12_11 ^= 1399292702;
            var12_11 ^= -684991095;
            var12_11 ^= -310779827;
            var8_8 = class_1297.method_20736((class_1297)this.a, (class_243)var7_7, (class_238)this.a, (class_1937)this.a, List.of());
            var13_6 = (var11_5 | var14_4) ^ 362873965;
            ** GOTO lbl162
lbl37:
            // 2 sources

            while (true) {
                var12_11 ^= -1830882101;
                var9_9 = v0;
                var13_6 = (var11_5 | var14_4) ^ -1468870443;
                if (true) ** GOTO lbl67
                break;
            }
lbl42:
            // 1 sources

            while (true) {
                var13_6 = (var11_5 | var14_4) ^ 781099174;
                ** GOTO lbl223
                break;
            }
lbl45:
            // 1 sources

            while (true) {
                var13_6 = (var11_5 | var14_4) ^ -1977371533;
                ** GOTO lbl223
lbl48:
                // 1 sources

                while (true) {
                    var13_6 = (var11_5 | var14_4) ^ 1317694514;
                    ** GOTO lbl223
                    break;
                }
                break;
            }
            block74: while (true) {
                switch (var13_6) {
                    case -2018769373: {
                        var12_11 ^= var13_6 ^ -397536147;
                        ** break;
                    }
                    case 788897399: {
                        var12_11 ^= var13_6 ^ 1088916537;
                        ** GOTO lbl69
                    }
                    case 1433348890: {
                        var12_11 ^= var13_6 ^ -317325732;
                        var13_6 = (var11_5 | var14_4) ^ 788777101;
                        ** GOTO lbl67
                    }
                    case -1488729625: {
                        v1 = false;
                        break block103;
                    }
lbl66:
                    // 1 sources

                    var13_6 = (var11_5 | var14_4) ^ 1516122664;
lbl67:
                    // 5 sources

                    default: {
                        continue block74;
                    }
lbl69:
                    // 1 sources

                    var13_6 = (var11_5 | var14_4) ^ 1244855118;
                    continue block74;
                    case -1221656447: {
                        v1 = true;
                        break block103;
                    }
                    case -769772734: 
                }
                if (var7_7.field_1351 == var8_8.field_1351) break;
                var13_6 = (var11_5 | var14_4) ^ -770153032;
            }
            var13_6 = (var11_5 | var14_4) ^ 2058485228;
            ** GOTO lbl67
        }
        var12_11 ^= 1295172690;
        var10_10 = v1;
        var13_6 = (var11_5 | var14_4) ^ -1155077229;
        ** GOTO lbl223
lbl85:
        // 1 sources

        while (true) {
            var13_6 = (var11_5 | var14_4) ^ -1712127910;
            ** GOTO lbl223
            break;
        }
lbl88:
        // 1 sources

        while (true) {
            var13_6 = (var11_5 | var14_4) ^ 2018851188;
            ** GOTO lbl223
            break;
        }
lbl91:
        // 2 sources

        while (true) {
            var12_11 ^= 1326111344;
            this.b = v2;
            var13_6 = (var11_5 | var14_4) ^ 59491347;
            ** GOTO lbl223
            break;
        }
lbl96:
        // 1 sources

        while (true) {
            var13_6 = (var11_5 | var14_4) ^ -442539208;
            ** GOTO lbl223
            break;
        }
lbl99:
        // 3 sources

        while (true) {
            var13_6 = (var11_5 | var14_4) ^ 2028698857;
            ** GOTO lbl223
lbl102:
            // 1 sources

            while (true) {
                var13_6 = (var11_5 | var14_4) ^ 1690265044;
                ** GOTO lbl223
lbl105:
                // 1 sources

                while (true) {
                    var13_6 = (var11_5 | var14_4) ^ -248550992;
                    ** GOTO lbl223
                    break;
                }
                break;
            }
lbl108:
            // 1 sources

            while (true) {
                var13_6 = (var11_5 | var14_4) ^ 878417659;
                ** GOTO lbl223
                break;
            }
            break;
        }
lbl111:
        // 1 sources

        while (true) {
            block105: {
                if (!(var7_7.field_1351 < 0.0)) break block105;
                var12_11 ^= 1487186292;
                v2 = true;
                ** GOTO lbl91
            }
            while (true) {
                var12_11 ^= 1487186292;
                v2 = false;
                ** continue;
                break;
            }
            break;
        }
lbl121:
        // 1 sources

        while (true) {
            var13_6 = (var11_5 | var14_4) ^ 1802153100;
            ** GOTO lbl223
            break;
        }
lbl124:
        // 1 sources

        while (true) {
            var13_6 = (var11_5 | var14_4) ^ 615470979;
            ** GOTO lbl162
            break;
        }
lbl127:
        // 2 sources

        while (true) {
            var13_6 = (var11_5 | var14_4) ^ -357657553;
            ** GOTO lbl223
            break;
        }
lbl130:
        // 1 sources

        while (true) {
            var13_6 = (var11_5 | var14_4) ^ 1054657928;
            ** GOTO lbl223
lbl133:
            // 1 sources

            while (true) {
                var13_6 = (var11_5 | var14_4) ^ 2014116325;
                ** GOTO lbl223
lbl136:
                // 1 sources

                while (true) {
                    var13_6 = (var11_5 | var14_4) ^ -1768175462;
                    ** GOTO lbl223
                    break;
                }
                break;
            }
            break;
        }
        while (true) {
            var13_6 = (var11_5 | var14_4) ^ -1561792096;
            ** GOTO lbl223
            break;
        }
lbl142:
        // 2 sources

        while (true) {
            var13_6 = (var11_5 | var14_4) ^ -247708696;
            ** GOTO lbl162
            break;
        }
lbl145:
        // 3 sources

        while (true) {
            var13_6 = (var11_5 | var14_4) ^ -1606839299;
            ** GOTO lbl223
            break;
        }
        while (true) {
            var13_6 = (var11_5 | var14_4) ^ 2048555490;
            if (true) ** GOTO lbl162
            break;
        }
lbl151:
        // 1 sources

        while (true) {
            var13_6 = (var11_5 | var14_4) ^ -1531963100;
            ** GOTO lbl223
lbl154:
            // 3 sources

            while (true) {
                var13_6 = (var11_5 | var14_4) ^ -1676766887;
                if (true) ** GOTO lbl223
                break;
            }
            break;
        }
        block98: while (true) {
            var13_6 = (var11_5 | var14_4) ^ -1684852622;
            if (true) ** GOTO lbl162
            block99: while (true) {
                var13_6 = (var11_5 | var14_4) ^ -1838493248;
lbl162:
                // 8 sources

                block100: while (true) {
                    switch (var13_6) {
                        default: {
                            continue block100;
                        }
                        case 484384825: {
                            this.d += var8_8.field_1351;
                            ** continue;
                        }
                        case 525330102: {
                            this.a = this.a.method_997(var8_8);
                            var13_6 = (var11_5 | var14_4) ^ 751269793;
                            continue block100;
                        }
                        case -642601908: {
                            if (var7_7.field_1352 != var8_8.field_1352) ** GOTO lbl142
                            var13_6 = (var11_5 | var14_4) ^ -1924950462;
                            continue block100;
                        }
                        case -11386994: {
                            if (var7_7.field_1350 == var8_8.field_1350) ** continue;
                            ** continue;
                        }
                        case 1380188170: {
                            var12_11 ^= var13_6 ^ -545943618;
                            var13_6 = (var11_5 | var14_4) ^ -861207709;
                            continue block100;
                        }
                        case -774206354: {
                            var12_11 ^= var13_6 ^ -557550167;
                            continue block99;
                        }
                        case 1720634301: {
                            var12_11 ^= var13_6 ^ -965525028;
                            var13_6 = (var11_5 | var14_4) ^ -507323402;
                            continue block100;
                        }
                        case 203536423: {
                            var12_11 ^= var13_6 ^ -1185308491;
                            var13_6 = (var11_5 | var14_4) ^ -1926392384;
                            continue block100;
                        }
                        case 855357513: {
                            var12_11 ^= var13_6 ^ -1304914437;
                            ** continue;
                        }
                        case -2029551059: {
                            var12_11 ^= var13_6 ^ 847223487;
                            var13_6 = (var11_5 | var14_4) ^ -1135410391;
                            continue block100;
                        }
                        case 1870080527: {
                            this.g += var8_8.field_1352;
                            continue block98;
                        }
                        case 834074796: {
                            this.f += var8_8.field_1350;
                            ** continue;
                        }
                        case 1885236621: {
                            var13_6 = (var11_5 | var14_4) ^ 38782017;
                            continue block100;
                        }
                        case 1882222095: {
                            v0 = true;
                            ** GOTO lbl37
                        }
                        case 1095694566: {
                            v0 = false;
                            ** continue;
                        }
                        case -390266974: 
                    }
                    var12_11 ^= var13_6 ^ -1250144994;
                    var13_6 = (var11_5 | var14_4) ^ -497934983;
                }
                break;
            }
            break;
        }
        block101: while (true) {
            var13_6 = (var11_5 | var14_4) ^ -491075731;
lbl223:
            // 24 sources

            block102: while (true) {
                switch (var13_6) {
                    default: {
                        continue block102;
                    }
                    case -330832540: {
                        var12_11 ^= var13_6 ^ 1878932704;
                        var13_6 = (var11_5 | var14_4) ^ -27695864;
                        continue block102;
                    }
                    case 397635552: {
                        var12_11 ^= var13_6 ^ -825491822;
                        ** continue;
                    }
                    case -552538898: {
                        if (!var9_9) ** GOTO lbl145
                        ** continue;
                    }
                    case 1693383573: {
                        var13_6 = (var11_5 | var14_4) ^ 571283233;
                        continue block102;
                    }
                    case -918131404: {
                        if (var7_7.field_1352 == var8_8.field_1352) ** GOTO lbl127
                        ** continue;
                    }
                    case -1010747833: {
                        if (!var10_10) ** GOTO lbl154
                        ** continue;
                    }
                    case 1628662422: {
                        var12_11 ^= var13_6 ^ 1161713002;
                        ** continue;
                    }
                    case 531053730: {
                        if (!this.a) ** GOTO lbl145
                        ** continue;
                    }
                    case 1803957077: {
                        var13_6 = (var11_5 | var14_4) ^ -1746494952;
                        continue block102;
                    }
                    case 411212023: {
                        if (var7_7.field_1350 == var8_8.field_1350) ** GOTO lbl99
                        ** continue;
                    }
                    case 1406195242: {
                        var12_11 ^= var13_6 ^ -1968683176;
                        ** continue;
                    }
                    case -2062482902: {
                        this.c = 0.0;
                        ** continue;
                    }
                    case 1504568043: {
                        if (!var9_9) ** GOTO lbl99
                        ** continue;
                    }
                    case -148105383: {
                        this.a = false;
                        ** continue;
                    }
                    case -2058829125: {
                        var13_6 = (var11_5 | var14_4) ^ -33908787;
                        continue block102;
                    }
                    case 1794859479: {
                        this.b = 0.0;
                        ** continue;
                    }
                    case -670274257: {
                        var12_11 ^= var13_6 ^ -1480771585;
                        ** continue;
                    }
                    case 1178275932: {
                        var12_11 ^= var13_6 ^ -1359692209;
                        ** continue;
                    }
                    case 1609894511: {
                        var12_11 ^= var13_6 ^ 470933947;
                        ** continue;
                    }
                    case -179859255: {
                        var12_11 ^= var13_6 ^ 1252784201;
                        ** continue;
                    }
                    case -2047441114: {
                        var12_11 ^= var13_6 ^ -2055664705;
                        continue block101;
                    }
                    case -1281910787: {
                        this.b = 0.0f;
                        ** GOTO lbl154
                    }
                    case -1304651544: {
                        this.c = 0.0;
                        ** continue;
                    }
                    case 54828743: {
                        this.c = false;
                        var13_6 = (var11_5 | var14_4) ^ 140143366;
                        continue block102;
                    }
                    case -1770563773: {
                        if (!this.b) ** continue;
                        var13_6 = (var11_5 | var14_4) ^ 621909728;
                        continue block102;
                    }
                    case 15166466: {
                        this.a = 0.0;
                        ** continue;
                    }
                    case -745317527: {
                        if (!var10_10) ** continue;
                        ** continue;
                    }
                    case -1717395941: {
                        var13_6 = (var11_5 | var14_4) ^ 1327588135;
                        continue block102;
                    }
                    case 1562667058: {
                        var12_11 ^= var13_6 ^ -573697271;
                        ** continue;
                    }
                    case 204640895: {
                        var13_6 = (var11_5 | var14_4) ^ 171043990;
                        continue block102;
                    }
                    case -23707684: {
                        var12_11 ^= var13_6 ^ -2081126187;
                        ** continue;
                    }
                    case 2000572348: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static class_1937 clientWorld() {
        block8: {
            block7: {
                break block7;
lbl1:
                // 1 sources

                block5: while (true) {
                    switch (var2_1) lbl-1000:
                    // 2 sources

                    {
                        default: {
                            continue block5;
                        }
                        case -455675737: {
                            break;
                        }
                        case 1199307433: {
                            var1_2 ^= var2_1 ^ -2030240841;
                            var2_1 = (var0 | -1136484396) ^ 801379253;
                            ** GOTO lbl-1000
                        }
                    }
                    var2_1 = (var0 | -1136484396) ^ -123648642;
                    continue;
                    break;
                }
            }
            var0 = jz.a & -1136484396 ^ -1344625721;
            var2_1 = 0;
            break block8;
            {
                ** case -1877037982:
            }
lbl18:
            // 1 sources

            return class_310.method_1551().field_1687;
        }
        var1_2 = (var0 | -1136484396) ^ -1856270031;
        var2_1 = (var0 | -1136484396) ^ 1527533424;
        ** while (true)
    }
}

