/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1309
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_746
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_746;
import z.r.cm;
import z.r.ep;
import z.r.ki;
import z.r.lI;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class kU
extends lI {
    private ep a;
    private float t;
    private class_243 a;
    private boolean o;
    private double h;
    private int h;
    private Float a;
    private boolean p;
    private static final ep b;
    public static final int m;
    private int i;
    private float u;
    private boolean q;
    private boolean r;
    private float v;
    private static final int[] b;
    private class_1309 b;

    /*
     * Enabled aggressive block sorting
     */
    public kU() {
        int n2 = -1651195879;
        int n3 = m & 0x9D94C019 ^ 0x6BB0F8D4;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x1AF701B7;
        n5 ^= 0xC3D3D294;
        super(ki.a.getManagedYaw(), ki.a.getManagedPitch());
        n4 = (n3 | n2) ^ 0x5606CE00;
        block16: while (true) {
            switch (n4) {
                default: {
                    continue block16;
                }
                case 788102405: {
                    n5 ^= n4 ^ 0x2B2825B3;
                    n4 = (n3 | n2) ^ 0xAA3F20DC;
                    continue block16;
                }
                case 1435228161: {
                    this.i = kU.b((n5 | n4 ^ 0xC81F1818) ^ (n4 ^ 0xC7787E99), (n3 | n4 ^ 0xC81F1818) ^ ((n5 | n4 ^ 0xC81F1818) ^ (n4 ^ 0x43EA5A8A)));
                    n4 = (n3 | n2) ^ 0x7119AEF9;
                    continue block16;
                }
                case -1447938339: {
                    n5 ^= n4 ^ 0xE05056AD;
                    n4 = (n3 | n2) ^ 0x540BB22C;
                    continue block16;
                }
                case 361513836: {
                    return;
                }
                case -1901242844: {
                    n5 ^= n4 ^ 0xCFA54C61;
                    n4 = (n3 | n2) ^ 0x110B6ED4;
                    continue block16;
                }
                case 141841010: {
                    this.t = this.i;
                    n4 = (n3 | n2) ^ 0x417AC3F0;
                    continue block16;
                }
                case -289434103: {
                    this.u = this.g;
                    n4 = (n3 | n2) ^ 0x9FAE52CE;
                    continue block16;
                }
                case 351016230: {
                    n5 ^= n4 ^ 0xD02ECBE4;
                    n4 = (n3 | n2) ^ 0x29A41BEA;
                    continue block16;
                }
                case -703536329: {
                    this.h = kU.b((n5 | n4 ^ 0x4B84232E) ^ (n4 ^ 0x44A25D08), (n3 | n4 ^ 0x4B84232E) ^ ((n5 | n4 ^ 0x4B84232E) ^ (n4 ^ 0x89292173)));
                    n4 = (n3 | n2) ^ 0xD14D85D8;
                    continue block16;
                }
                case 1892175454: {
                    n5 ^= n4 ^ 0xDD1B190E;
                    n4 = (n3 | n2) ^ 0x4F530199;
                    continue block16;
                }
                case 1612360211: {
                    n5 ^= n4 ^ 0x8D631FD8;
                    n4 = (n3 | n2) ^ 0xF7C0AAAF;
                    continue block16;
                }
                case -1413526799: {
                    this.p = true;
                    n4 = (n3 | n2) ^ 0x8F7CB683;
                    continue block16;
                }
                case -1326974652: {
                    this.h = 3.0;
                    n4 = (n3 | n2) ^ 0xEB58EDFB;
                    continue block16;
                }
                case -1093780691: 
            }
            n5 ^= n4 ^ 0x6AD7477C;
            n4 = (n3 | n2) ^ 0xEA38BBB1;
        }
    }

    /*
     * Exception decompiling
     */
    public kU(float var1_1, float var2_2) {
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
    public boolean isRelativeMode() {
        int n2 = m & 0xFF9FA4D5 ^ 0x16D2CDFB;
        int n3 = 0;
        int n4 = (n2 | 0xFF9FA4D5) ^ 0xEE06C088;
        n3 = (n2 | 0xFF9FA4D5) ^ 0x8F3BA49B;
        boolean bl2 = true;
        block5: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n3 = (n2 | 0xFF9FA4D5) ^ 0xA511F992;
            }
            block6: while (true) {
                switch (n3) {
                    case 1894009188: {
                        n3 = (n2 | 0xFF9FA4D5) ^ 0xA0807C88;
                    }
                    default: {
                        continue block6;
                    }
                    case 1600098679: {
                        n4 ^= n3 ^ 0x46D47E4E;
                        continue block5;
                    }
                    case 1523455085: 
                }
                break;
            }
            break;
        }
        return this.r;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean isSilentAim() {
        int n2 = m & 0xD7C04D51 ^ 0xE8E5136;
        int n3 = 0;
        int n4 = (n2 | 0xD7C04D51) ^ 0x66144F85;
        n3 = (n2 | 0xD7C04D51) ^ 0xBAC3BCEF;
        block5: while (true) {
            switch (n3) {
                case -684558943: {
                    n4 ^= n3 ^ 0xD1A7E227;
                    n3 = (n2 | 0xD7C04D51) ^ 0x533B9509;
                }
                default: {
                    continue block5;
                }
                case -1930049410: {
                    return true;
                }
                case 1695408536: 
            }
            n3 = (n2 | 0xD7C04D51) ^ 0x8FC28D6;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void setBlockWhenScreenOpen(boolean var1_1) {
        block13: {
            block14: {
                break block14;
lbl1:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ 1120620458;
                    break block13;
                    break;
                }
lbl4:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_4 ^ 557352770;
                    ** continue;
                    break;
                }
lbl7:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -1373119410;
                    break block13;
                    break;
                }
            }
            var5_2 = -922954977;
            var2_3 = kU.m & -922954977 ^ 1395620693;
            var4_4 = 0;
            var3_5 = (var2_3 | var5_2) ^ -1085820413;
            var4_4 = (var2_3 | var5_2) ^ -1075218283;
        }
        block10: while (true) {
            switch (var4_4) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block10;
                    }
                    break;
                }
                case -1122351358: {
                    ** continue;
                }
                case 1679197130: {
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -1724747664;
                    ** continue;
                    break;
                }
                case -1724599051: {
                    this.q = var1_1;
                    ** continue;
                }
                case 1120766767: {
                    var3_5 ^= var4_4 ^ 1554037506;
                    ** continue;
                }
            }
            var4_4 = (var2_3 | var5_2) ^ 1726331997;
        }
        {
            ** case 1977100049:
        }
lbl38:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     */
    public boolean blocksWhenScreenOpen() {
        block23: {
            block25: {
                block24: {
                    break block25;
lbl1:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1127195131;
                        break block23;
lbl4:
                        // 1 sources

                        block15: while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1933908563;
                            break block23;
lbl7:
                            // 1 sources

                            while (true) {
                                switch (var2_4) {
                                    case 881535375: {
                                        var3_3 = (var1_2 | var4_1) ^ 1086844288;
                                        break;
                                    }
                                    default: {
                                        var3_3 = (var1_2 | var4_1) ^ 2112360449;
                                        break;
                                    }
                                    case -1836554975: {
                                        var3_3 = (var1_2 | var4_1) ^ -1035985552;
                                        break;
                                    }
                                }
                                break block23;
                                break;
                            }
lbl19:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ 2118825753;
                                continue block15;
                                break;
                            }
lbl22:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ 526489484;
                                break block24;
                                break;
                            }
                            break;
                        }
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1733207343;
                        break block23;
                        break;
                    }
                }
lbl29:
                // 2 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1983518867;
                    break block23;
lbl32:
                    // 1 sources

                    return this.q;
                }
            }
            var4_1 = 84316710;
            var1_2 = kU.m & 84316710 ^ -612904493;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -1994707294;
            ** while (true)
        }
        block22: while (true) {
            switch (var3_3) {
                default: {
                    continue block22;
                }
                case 1454519450: {
                    ** continue;
                }
                case 490196615: {
                    ** continue;
                }
                case -1615839625: {
                    ** continue;
                }
                case -1204193576: {
                    break;
                }
                case 1405957722: {
                    ** continue;
                }
                case 1671925234: {
                    ** continue;
                }
                case 1468443854: {
                    ** continue;
                }
                case -1566587914: {
                    var2_4 ^= var3_3 ^ 1916525869;
                    ** continue;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ -1997439175;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setNormalizeTargetYaw(boolean bl2) {
        int n2 = 1957138371;
        int n3 = m & 0x74A78FC3 ^ 0x9A41D86;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x51064947;
        n4 = (n3 | n2) ^ 0x6FF08B73;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case -253026684: {
                    n5 ^= n4 ^ 0x196992D9;
                    n4 = (n3 | n2) ^ 0x151D565D;
                    continue block7;
                }
                case 425558036: {
                    n5 ^= n4 ^ 0xE75B1765;
                    n4 = (n3 | n2) ^ 0xCDC620E4;
                    continue block7;
                }
                case 1757071770: {
                    this.p = bl2;
                    n4 = (n3 | n2) ^ 0x64FA1FD3;
                    continue block7;
                }
                case 307696820: {
                    n4 = (n3 | n2) ^ 0x8D4C8143;
                    continue block7;
                }
                case -1335771357: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean isNormalizeTargetYaw() {
        block9: {
            break block9;
lbl1:
            // 1 sources

            while (true) {
                var2_3 ^= var3_2 ^ 2075436593;
                ** GOTO lbl16
                break;
            }
lbl4:
            // 1 sources

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
                    case 372422728: {
                        ** continue;
                    }
lbl11:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | 1863374336) ^ 337681830;
                        ** GOTO lbl-1000
                        break;
                    }
                    case 1800555100: {
                        break block6;
                    }
lbl16:
                    // 1 sources

                    var3_2 = (var1_1 | 1863374336) ^ -1737926734;
                    ** continue;
                    case -417628088: {
                        return this.p;
                    }
                }
                break;
            }
            var3_2 = (var1_1 | 1863374336) ^ 1765830578;
            ** while (true)
        }
        var1_1 = kU.m & 1863374336 ^ 1567769594;
        var3_2 = 0;
        var2_3 = (var1_1 | 1863374336) ^ -1803082296;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public void setYawOffset(float var1_1) {
        block12: {
            break block12;
lbl1:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 1722236521;
                ** GOTO lbl12
lbl4:
                // 1 sources

                while (true) {
                    var4_4 = (var2_3 | var5_2) ^ -2006441201;
                    ** GOTO lbl12
                    break;
                }
                break;
            }
lbl7:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 446671064;
                if (true) ** GOTO lbl12
                block10: while (true) {
                    var4_4 = (var2_3 | var5_2) ^ 1077332837;
lbl12:
                    // 4 sources

                    block11: while (true) {
                        switch (var4_4) {
                            default: {
                                continue block11;
                            }
                            case -320465609: {
                                ** continue;
                            }
                            case 2115084000: {
                                var3_5 ^= var4_4 ^ 1250330995;
                                break;
                            }
                            case -1864465530: {
                                var3_5 ^= var4_4 ^ -1978727846;
                                continue block10;
                            }
                            case 1115491944: {
                                this.v = var1_1;
                                ** continue;
                            }
                        }
                        var4_4 = (var2_3 | var5_2) ^ -1274760313;
                    }
                    break;
                }
                break;
            }
        }
        var5_2 = 1982962731;
        var2_3 = kU.m & 1982962731 ^ -428295698;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ 188252777;
        ** while (true)
        {
            ** case -1236306294:
        }
lbl36:
        // 1 sources

    }

    /*
     * Enabled aggressive block sorting
     */
    public float getYawOffset() {
        int n2 = m & 0x38EC9E03 ^ 0x9F8B457D;
        int n3 = 0;
        int n4 = (n2 | 0x38EC9E03) ^ 0xDC6DBE62;
        n3 = (n2 | 0x38EC9E03) ^ 0x1ED3B8A1;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 953484552: {
                    n4 ^= n3 ^ 0x6E10118C;
                    n3 = (n2 | 0x38EC9E03) ^ 0x6CB5790;
                    continue block5;
                }
                case -1188787985: {
                    return this.v;
                }
                case -1589876770: 
            }
            n3 = (n2 | 0x38EC9E03) ^ 0x873ADA77;
        }
    }

    private static int b(int n2, int n3) {
        int n4 = -1165949989;
        int n5 = -926754363;
        int n6 = b[n2 ^ ((n5 | n4) ^ 0xF786A7FD)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xFAC3B0AE;
        n6 -= (n5 | n4) ^ 0xFAC3BDCB;
        n6 += (n5 | n4) ^ 0xFAC3F162;
        n6 += (n5 | n4) ^ 0xFAC3EB85;
        n6 += (n5 | n4) ^ 0xFAC39435;
        return n6 += (n5 | n4) ^ 0xFAC3981B;
    }

    /*
     * Unable to fully structure code
     */
    public void setRenderLineWidth(double var1_1) {
        block14: {
            block15: {
                block13: {
                    var6_2 = 2031552966;
                    var3_3 = kU.m & 2031552966 ^ 227955387;
                    var5_4 = 0;
                    break block15;
lbl5:
                    // 1 sources

                    while (true) {
                        var4_5 ^= var5_4 ^ -1483745066;
                        var5_4 = (var3_3 | var6_2) ^ -1028728583;
                        break block13;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ -1664706789;
                        break block13;
                        break;
                    }
lbl12:
                    // 1 sources

                    while (true) {
                        var4_5 ^= var5_4 ^ -812204373;
                        ** continue;
                        break;
                    }
                }
lbl16:
                // 3 sources

                block10: while (true) {
                    switch (var5_4) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block10;
                            }
                            break;
                        }
                        case 743673246: {
                            ** continue;
                        }
                        case 364652678: {
                            ** continue;
                        }
                        case -514732828: {
                            return;
                        }
                        case 1499920006: {
                            break block14;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ 1747678073;
                            ** continue;
                            break;
                        }
                        case -1086749946: {
                            this.h = var1_1;
                            break;
                        }
                    }
                    ** continue;
                    break;
                }
            }
            var4_5 = (var3_3 | var6_2) ^ 362384977;
            var5_4 = (var3_3 | var6_2) ^ 619818361;
            ** GOTO lbl16
        }
        var5_4 = (var3_3 | var6_2) ^ 1371854433;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public double getRenderLineWidth() {
        int n2 = m & 0x7EB9089E ^ 0x988F120E;
        int n3 = 0;
        int n4 = (n2 | 0x7EB9089E) ^ 0xD47D8CC9;
        n3 = (n2 | 0x7EB9089E) ^ 0x5E4CD336;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1679150519: {
                    n4 ^= n3 ^ 0x2D107197;
                    n3 = (n2 | 0x7EB9089E) ^ 0xE29BFE74;
                    continue block5;
                }
                case 472179946: {
                    return this.h;
                }
                case -1594635864: 
            }
            n3 = (n2 | 0x7EB9089E) ^ 0x655528D7;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setReferenceEntity(class_1309 class_13092) {
        int n2 = -887830713;
        int n3 = m & 0xCB14C747 ^ 0x15446BE3;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xF6C9A32E;
        n4 = (n3 | n2) ^ 0x3A7D130E;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case -1773134824: {
                    n5 ^= n4 ^ 0x772BCB80;
                    n4 = (n3 | n2) ^ 0x45E2B080;
                    continue block7;
                }
                case 377437586: {
                    return;
                }
                case -597099956: {
                    n5 ^= n4 ^ 0x772DAFC8;
                    n4 = (n3 | n2) ^ 0xC92BD275;
                    continue block7;
                }
                case -450233111: {
                    n4 = (n3 | n2) ^ 0x4904F3FF;
                    continue block7;
                }
                case -1699324057: 
            }
            this.b = class_13092;
            n4 = (n3 | n2) ^ 0x33C15AB;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void setReferenceYawOverride(Float var1_1) {
        var5_2 = 1436489375;
        var2_3 = kU.m & 1436489375 ^ -556217634;
        var4_4 = 0;
        ** GOTO lbl36
lbl5:
        // 1 sources

        return;
lbl7:
        // 1 sources

        while (true) {
            var4_4 = (var2_3 | var5_2) ^ 268793791;
            ** GOTO lbl22
lbl10:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 2001839933;
                ** GOTO lbl22
                break;
            }
            break;
        }
lbl13:
        // 1 sources

        block10: while (true) {
            block15: {
                var4_4 = (var2_3 | var5_2) ^ 430425478;
                break block15;
lbl16:
                // 1 sources

                while (true) {
                    this.a = var1_1;
                    ** continue;
                    break;
                }
lbl19:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_4 ^ -159890778;
                    ** GOTO lbl38
                    break;
                }
            }
lbl23:
            // 2 sources

            block13: while (true) {
                switch (var4_4) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block13;
                        }
                        break;
                    }
                    case -965207207: {
                        ** continue;
                    }
                    case -1476950554: {
                        ** continue;
                    }
                    case -807753376: {
                        break block10;
                    }
                    case 1742373258: {
                        ** continue;
                    }
lbl36:
                    // 1 sources

                    var3_5 = (var2_3 | var5_2) ^ 1018347147;
                    ** continue;
lbl38:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 2015910713;
                    ** continue;
                }
                break;
            }
            break;
        }
        var4_4 = (var2_3 | var5_2) ^ -1207607467;
        ** while (true)
        {
            ** case -1467057694:
        }
lbl43:
        // 1 sources

        var3_5 ^= var4_4 ^ -2111887219;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setPrimaryColor(int n2) {
        int n3 = 848926211;
        int n4 = m & 0x32999603 ^ 0x205B9381;
        int n5 = 0;
        int n6 = (n4 | n3) ^ 0x84771371;
        n5 = (n4 | n3) ^ 0x99E69197;
        block7: while (true) {
            switch (n5) {
                default: {
                    continue block7;
                }
                case -422710453: {
                    n6 ^= n5 ^ 0xA8C2828A;
                    n5 = (n4 | n3) ^ 0xF352D81C;
                    continue block7;
                }
                case -1422064108: {
                    n5 = (n4 | n3) ^ 0x443F696;
                    continue block7;
                }
                case -1047965793: {
                    return;
                }
                case -2079951209: {
                    this.h = n2;
                    n5 = (n4 | n3) ^ 0xD41664C8;
                    continue block7;
                }
                case 915955989: 
            }
            n6 ^= n5 ^ 0xEC80CCCB;
            n5 = (n4 | n3) ^ 0xB6DDE114;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public int getPrimaryColor() {
        int n2 = m & 0x50049B74 ^ 0x5DA5D3BD;
        int n3 = 0;
        int n4 = (n2 | 0x50049B74) ^ 0x31F1E621;
        n3 = (n2 | 0x50049B74) ^ 0x10EA9ED5;
        block5: while (true) {
            switch (n3) {
                case 1297040680: {
                    n3 = (n2 | 0x50049B74) ^ 0xFA914891;
                    continue block5;
                }
                case -1489726612: {
                    n4 ^= n3 ^ 0xD144A666;
                    n3 = (n2 | 0x50049B74) ^ 0xCB2785F6;
                }
                default: {
                    continue block5;
                }
                case -1769841141: 
            }
            break;
        }
        return this.h;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setSecondaryColor(int n2) {
        int n3 = 1868009816;
        int n4 = m & 0x6F579158 ^ 0xD1BD69CE;
        int n5 = 0;
        int n6 = (n4 | n3) ^ 0x9DBD885;
        n5 = (n4 | n3) ^ 0x41F15C50;
        block7: while (true) {
            switch (n5) {
                default: {
                    continue block7;
                }
                case -1686904903: {
                    return;
                }
                case 1729440966: {
                    n6 ^= n5 ^ 0xFCD0B843;
                    n5 = (n4 | n3) ^ 0x648C2667;
                    continue block7;
                }
                case 731095702: {
                    this.i = n2;
                    n5 = (n4 | n3) ^ 0x98EAD518;
                    continue block7;
                }
                case -200253183: {
                    n6 ^= n5 ^ 0xC21DEF72;
                    n5 = (n4 | n3) ^ 0xD46C5B48;
                    continue block7;
                }
                case -1106336370: 
            }
            n5 = (n4 | n3) ^ 0xBEF98DF;
        }
    }

    /*
     * Unable to fully structure code
     */
    public int getSecondaryColor() {
        block9: {
            break block9;
lbl1:
            // 1 sources

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
                    case -796088017: {
                        break;
                    }
lbl8:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | -147364799) ^ 790676556;
                        ** continue;
                        break;
                    }
                    case -1680512477: {
                        var2_3 ^= var3_2 ^ -2055365385;
                        ** continue;
                    }
                }
                var3_2 = (var1_1 | -147364799) ^ 1692571248;
                continue;
                break;
            }
lbl16:
            // 1 sources

            while (true) {
                var3_2 = (var1_1 | -147364799) ^ 800806268;
                ** continue;
                break;
            }
            {
                ** case -803784673:
            }
lbl20:
            // 1 sources

            return this.i;
        }
        var1_1 = kU.m & -147364799 ^ -584861678;
        var3_2 = 0;
        var2_3 = (var1_1 | -147364799) ^ -1078862209;
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void setUseSecondaryColor(boolean bl2) {
        int n2 = 92351472;
        int n3 = m & 0x5812BF0 ^ 0xE14F50DF;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xFF127A1B;
        n4 = (n3 | n2) ^ 0x12A40962;
        boolean bl3 = true;
        block7: while (true) {
            if (!bl3 || (bl3 = false) || !true) {
                n4 = (n3 | n2) ^ 0x42E8F7F9;
            }
            block8: while (true) {
                switch (n4) {
                    case -835411732: {
                        n5 ^= n4 ^ 0xA194341F;
                        n4 = (n3 | n2) ^ 0x63F117CA;
                        continue block8;
                    }
                    case -2042729419: {
                        this.o = bl2;
                        continue block7;
                    }
                    case -143953251: {
                        n4 = (n3 | n2) ^ 0x2BFBDB13;
                        continue block8;
                    }
                    case -1490580474: {
                        n5 ^= n4 ^ 0x4FC0362C;
                        n4 = (n3 | n2) ^ 0x87443C1F;
                    }
                    default: {
                        continue block8;
                    }
                    case 1653295072: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean usesSecondaryColor() {
        block9: {
            break block9;
            {
                var3_2 = (var1_1 | 837600702) ^ 1706840856;
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
                        case 1601221888: {
                            ** GOTO lbl12
                        }
lbl9:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | 837600702) ^ -1366333185;
                            ** GOTO lbl-1000
                            break;
                        }
lbl12:
                        // 1 sources

                        var3_2 = (var1_1 | 837600702) ^ -1135869132;
                        ** continue;
                        case 1303633611: {
                            var2_3 ^= var3_2 ^ 1945207058;
                            continue block5;
                        }
                        case -1807511833: {
                            return this.o;
                        }
                    }
                    break;
                }
            }
        }
        var1_1 = kU.m & 837600702 ^ -237789753;
        var3_2 = 0;
        var2_3 = (var1_1 | 837600702) ^ 384774321;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setCurrentYaw(float f2) {
        int n2 = -648733331;
        int n3 = m & 0xD9551D6D ^ 0xFF2EFE66;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xFE7A35F2;
        n4 = (n3 | n2) ^ 0xA05FC96A;
        block7: while (true) {
            block8: {
                switch (n4) {
                    case 1595946501: {
                        n4 = (n3 | n2) ^ 0x83DD175;
                        continue block7;
                    }
                    case -1900796785: {
                        return;
                    }
                    case 1579312601: {
                        this.u = f2;
                        break block8;
                    }
                    case -146657766: {
                        n5 ^= n4 ^ 0x9B8838D1;
                        n4 = (n3 | n2) ^ 0xA15D9AB6;
                        break;
                    }
                    case 2093877562: {
                        n5 ^= n4 ^ 0x4394A3BB;
                        n4 = (n3 | n2) ^ 0x71CBDBE0;
                    }
                }
                continue;
            }
            n4 = (n3 | n2) ^ 0x83B1F655;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void setCurrentPitch(float var1_1) {
        var5_2 = 393236369;
        var2_3 = kU.m & 393236369 ^ -68015692;
        var4_4 = 0;
        if (true) ** GOTO lbl27
        block7: while (true) {
            var4_4 = (var2_3 | var5_2) ^ -357311881;
lbl7:
            // 2 sources

            block8: while (true) {
                switch (var4_4) lbl-1000:
                // 4 sources

                {
                    while (true) {
                        default: {
                            continue block8;
                        }
                        break;
                    }
                    case 1535497033: {
                        var3_5 ^= var4_4 ^ -622203648;
                        break block7;
                    }
lbl15:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -1535656708;
                        ** GOTO lbl-1000
                        break;
                    }
                    case 1601172328: {
                        this.t = var1_1;
                        continue block7;
                    }
                    case -1508597272: {
                        ** continue;
                    }
                    case 356627906: {
                        var3_5 ^= var4_4 ^ 741639191;
                        var4_4 = (var2_3 | var5_2) ^ 1988135553;
                        ** GOTO lbl-1000
                    }
lbl27:
                    // 1 sources

                    var3_5 = (var2_3 | var5_2) ^ 64295855;
                    var4_4 = (var2_3 | var5_2) ^ 1508298333;
                    ** continue;
                }
                break;
            }
            break;
        }
        var4_4 = (var2_3 | var5_2) ^ -1600283427;
        ** while (true)
        {
            ** case -1988958924:
        }
lbl33:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     */
    public void setTarget(class_243 var1_1) {
        block16: {
            break block16;
lbl1:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ -1740733536;
lbl3:
                // 4 sources

                block10: while (true) {
                    block17: {
                        switch (var4_4) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block10;
                                }
                                break;
                            }
                            case 599858773: {
                                break;
                            }
                            case 454752196: {
                                var3_5 ^= var4_4 ^ 777959011;
                                break block17;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ -1431561126;
                                ** continue;
                                break;
                            }
                        }
                        var4_4 = (var2_3 | var5_2) ^ 1352188360;
                        continue;
                    }
                    var4_4 = (var2_3 | var5_2) ^ -1588679979;
                    continue;
                    {
                        case 447821600: {
                            this.a = var1_1;
                            ** continue;
                        }
                    }
                    break;
                }
                break;
            }
lbl24:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ -1167864337;
                ** GOTO lbl3
                break;
            }
lbl27:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ -1595577807;
                ** GOTO lbl3
                break;
            }
            {
                case 27021338: {
                    this.a = null;
                    ** continue;
                }
            }
lbl33:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ 880558037;
                ** continue;
                break;
            }
        }
        var5_2 = -1191409195;
        var2_3 = kU.m & -1191409195 ^ 465772020;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ -747784764;
        ** while (true)
        {
            case 290685359: {
                var3_5 ^= var4_4 ^ 1135746481;
                ** continue;
            }
            case -345547715: {
                var3_5 ^= var4_4 ^ 21444419;
                ** continue;
            }
            ** case -1887198688:
        }
lbl49:
        // 1 sources

    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void setTarget(double d2, double d3, double d4) {
        int n2 = -1538999529;
        int n3 = m & 0xA444BB17 ^ 0x8EBEBF65;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xF4D5FB44;
        n4 = (n3 | n2) ^ 0x70DF738C;
        boolean bl2 = true;
        block7: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = (n3 | n2) ^ 0x234E21E6;
            }
            block8: while (true) {
                switch (n4) {
                    case -1631709641: {
                        this.setTarget(new class_243(d2, d3, d4));
                        n4 = (n3 | n2) ^ 0x11476AA3;
                        continue block8;
                    }
                    case -97230597: {
                        n5 ^= n4 ^ 0xFE729F53;
                        n4 = (n3 | n2) ^ 0x3040A940;
                        continue block8;
                    }
                    case -1078340140: {
                        n5 ^= n4 ^ 0xB258FAE9;
                        continue block7;
                    }
                    case -568210181: {
                        n4 = (n3 | n2) ^ 0x54CADF8C;
                    }
                    default: {
                        continue block8;
                    }
                    case -1917804911: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public class_243 getTarget() {
        int n2 = m & 0x8400C81D ^ 0x3AB5BC0C;
        int n3 = 0;
        int n4 = (n2 | 0x8400C81D) ^ 0x6813ABE4;
        n3 = (n2 | 0x8400C81D) ^ 0x74F7D6B1;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1317721170: {
                    return this.a;
                }
                case 91725266: {
                    n4 ^= n3 ^ 0x607B9F0C;
                    n3 = (n2 | 0x8400C81D) ^ 0xF03F284F;
                    continue block5;
                }
                case -901633364: 
            }
            n3 = (n2 | 0x8400C81D) ^ 0xBBC261CF;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private class_1309 FX() {
        var6_1 = -155791281;
        var3_2 = kU.m & -155791281 ^ -660091369;
        var5_3 = 0;
        var4_5 = (var3_2 | var6_1) ^ -905678989;
        var5_3 = (var3_2 | var6_1) ^ -1792146402;
        ** GOTO lbl38
lbl7:
        // 1 sources

        while (true) {
            var5_3 = (var3_2 | var6_1) ^ 1860758729;
            ** GOTO lbl18
            break;
        }
lbl10:
        // 1 sources

        while (true) {
            var5_3 = (var3_2 | var6_1) ^ 157100947;
            ** GOTO lbl38
            break;
        }
        while (true) {
            var5_3 = (var3_2 | var6_1) ^ 1061187536;
            if (true) ** GOTO lbl18
            break;
        }
        block16: while (true) {
            var5_3 = (var3_2 | var6_1) ^ -1486750668;
lbl18:
            // 3 sources

            block17: while (true) {
                switch (var5_3) {
                    case 1610205105: {
                        if (var1_4 == null) ** continue;
                        continue block16;
                    }
                    case 1507205739: {
                        var4_5 ^= var5_3 ^ 1830607232;
                        var5_3 = (var3_2 | var6_1) ^ 1913353313;
                        ** break;
                    }
                    case -1040731761: {
                        var4_5 ^= var5_3 ^ -31880164;
                        var5_3 = (var3_2 | var6_1) ^ -1829478858;
                        ** break;
                    }
                    case -1872809322: {
                        var4_5 ^= var5_3 ^ 978291194;
                        var5_3 = (var3_2 | var6_1) ^ -1588717074;
                    }
lbl34:
                    // 4 sources

                    default: {
                        continue block17;
                    }
                    case -1933792706: {
                        return var1_4;
                    }
lbl38:
                    // 2 sources

                    block18: while (true) {
                        switch (var5_3) {
                            default: {
                                continue block18;
                            }
                            case 1805244993: {
                                break;
                            }
                            case -135596596: {
                                var1_4 = this.b;
                                ** continue;
                            }
                            case 551225056: {
                                ** break;
lbl49:
                                // 1 sources

                                var4_5 ^= var5_3 ^ -497779485;
                                ** continue;
                            }
                        }
                        var5_3 = (var3_2 | var6_1) ^ -563291969;
                    }
                    case 1816363113: 
                }
                break;
            }
            break;
        }
        var2_6 = class_310.method_1551();
        var4_5 ^= -779912349;
        return var2_6.field_1724;
    }

    /*
     * Unable to fully structure code
     */
    public float getReferenceYaw() {
        block36: {
            var5_1 = 241718707;
            var2_2 = kU.m & 241718707 ^ 454837518;
            var4_3 = 0;
            ** GOTO lbl90
lbl5:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 1999549426;
                ** GOTO lbl72
                break;
            }
lbl8:
            // 1 sources

            while (true) {
                continue;
lbl10:
                // 1 sources

                return v0;
                var1_5 = this.FX();
                var4_3 = (var2_2 | var5_1) ^ 1115581636;
                break block36;
lbl15:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 2033409624;
                    break block36;
                    break;
                }
                break;
            }
lbl18:
            // 1 sources

            return this.a.floatValue();
        }
        block22: while (true) {
            switch (var4_3) lbl-1000:
            // 5 sources

            {
                while (true) {
                    default: {
                        continue block22;
                    }
                    break;
                }
                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -657594354;
                    ** GOTO lbl-1000
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -477478223;
                    ** GOTO lbl72
                    break;
                }
                case -1265009692: {
                    var3_4 ^= var4_3 ^ -488327543;
                    ** continue;
                }
lbl35:
                // 1 sources

                while (true) {
                    if (this.a == null) ** GOTO lbl64
                    ** continue;
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    var3_4 ^= var4_3 ^ 1908764701;
                    ** continue;
                    break;
                }
lbl41:
                // 1 sources

                while (true) {
                    var3_4 ^= var4_3 ^ -244313235;
                    ** GOTO lbl53
lbl44:
                    // 1 sources

                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -1330330578;
                        ** GOTO lbl72
                        break;
                    }
                    break;
                }
lbl47:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 641181386;
                    ** GOTO lbl72
                    break;
                }
lbl50:
                // 2 sources

                while (true) {
                    var3_4 ^= 1865019979;
                    ** continue;
                    break;
                }
lbl53:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ 947751968;
                ** GOTO lbl72
lbl55:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ 1871729938;
                    ** GOTO lbl-1000
                    break;
                }
lbl58:
                // 1 sources

                while (true) {
                    var3_4 ^= var4_3 ^ -395507494;
                    ** continue;
                    break;
                }
                case 1716456423: {
                    v0 = 0.0f;
                    ** GOTO lbl50
                }
lbl64:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ -1604596187;
                ** GOTO lbl72
                case -1979256761: {
                    if (var1_5 != null) ** continue;
                    ** GOTO lbl93
                }
lbl69:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -1787124232;
                    ** GOTO lbl-1000
                    break;
                }
lbl72:
                // 7 sources

                block35: while (true) {
                    switch (var4_3) {
                        default: {
                            continue block35;
                        }
                        case -341220050: {
                            ** continue;
                        }
                        case -50981106: {
                            ** continue;
                        }
                        case 654432671: {
                            ** continue;
                        }
                        case 961278837: {
                            ** continue;
                        }
                        case -1087923302: {
                            ** continue;
                        }
                        case 1750263373: {
                            ** continue;
                        }
                        ** case -1345810031:
lbl89:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
lbl90:
                // 1 sources

                var3_4 = (var2_2 | var5_1) ^ -2056985436;
                var4_3 = (var2_2 | var5_1) ^ -187354991;
                ** continue;
lbl93:
                // 1 sources

                var4_3 = (var2_2 | var5_1) ^ -1411043749;
                ** continue;
                case -944652879: {
                    var3_4 ^= var4_3 ^ -1848872740;
                    ** continue;
                }
                case 1894514861: {
                    v0 = var1_5.method_36454();
                    ** continue;
                }
                case 1560426875: 
            }
            break;
        }
        var3_4 ^= var4_3 ^ 1381610173;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var8 = 938950294;
        kU.m = mK.a(MethodHandles.lookup().lookupClass(), 844841962);
        var7_1 = 0;
        var6_3 = -135667198;
        var7_1 = var8 ^ -124539099;
        if (true) ** GOTO lbl44
lbl7:
        // 2 sources

        while (true) {
            var5_8 = (var0_4[var3_6] & (((var6_3 ^= 475043376) | var8) ^ -541119)) << ((var6_3 | var8) ^ -541018) | (var0_4[var3_6 + 1] & ((var6_3 | var8) ^ -541119)) << ((var6_3 | var8) ^ -541010) | (var0_4[var3_6 + 2] & ((var6_3 | var8) ^ -541119)) << ((var6_3 | var8) ^ -541002) | var0_4[var3_6 + 3] & ((var6_3 | var8) ^ -541119);
            var7_1 = var8 ^ -105404794;
            ** GOTO lbl60
            break;
        }
lbl11:
        // 1 sources

        while (true) {
            var6_3 ^= -1540349046;
            var0_4 = "\u00f8\u00caTW\u00b1\u00d2\u00bd\u00f3j\u00ff7\\#\u0094(d".getBytes("ISO-8859-1");
            var6_3 ^= 559526087;
            var1_5 = var0_4.length / 4;
            var7_1 = var8 ^ -742117710;
            if (true) ** GOTO lbl30
            block21: while (true) {
                switch (var7_1) {
                    case -998102592: {
                        var6_3 ^= var7_1 ^ 996172979;
                        var7_1 = var8 ^ 1317471480;
                        ** break;
                    }
                    case 2037398126: {
                        var3_6 = 0;
                        ** GOTO lbl32
                    }
                    case -466415580: {
                        var6_3 ^= var7_1 ^ 1043025608;
                        var7_1 = var8 ^ 111392610;
                    }
lbl30:
                    // 4 sources

                    default: {
                        continue block21;
                    }
lbl32:
                    // 1 sources

                    var6_3 ^= -2078350427;
                    var4_7 = 0;
                    ** GOTO lbl7
                    case 827623924: 
                }
                kU.b = new int[var1_5];
                var7_1 = var8 ^ -210430122;
            }
            break;
        }
        block22: while (true) {
            switch (var7_1) {
                case -1475721618: {
                    var6_3 ^= var7_1 ^ -1965178109;
                    var7_1 = var8 ^ -2019155760;
                }
lbl44:
                // 3 sources

                default: {
                    continue block22;
                }
                case -1336861114: {
                    var2_2 = (var6_3 | var7_1 ^ -2019155760) ^ (var7_1 ^ 982854376) ^ kU.m;
                    ** continue;
                }
                case -815492685: 
            }
            var7_1 = var8 ^ -1610778376;
        }
lbl52:
        // 1 sources

        while (true) {
            var7_1 = var8 ^ 1590228420;
            ** GOTO lbl60
            break;
        }
lbl55:
        // 1 sources

        while (true) {
            var7_1 = var8 ^ -450907016;
            if (true) ** GOTO lbl60
            break;
        }
        block25: while (true) {
            var7_1 = var8 ^ 882025532;
lbl60:
            // 4 sources

            block26: while (true) {
                switch (var7_1) {
                    default: {
                        continue block26;
                    }
                    case 1395029512: {
                        var6_3 ^= var7_1 ^ 1525252881;
                        ** continue;
                    }
                    case 655911099: {
                        var6_3 ^= var7_1 ^ -1093408231;
                        ** continue;
                    }
                    case 56990378: {
                        kU.b[var4_7] = var5_8 ^= var2_2;
                        var7_1 = var8 ^ 284120621;
                        continue block26;
                    }
                    case -834627568: {
                        var6_3 ^= var7_1 ^ 1272679554;
                        continue block25;
                    }
                    case 1765788498: {
                        kU.b = new ep(0.0f, 0.0f);
                        return;
                    }
                    case -756512018: 
                }
                var3_6 += 4;
                if (++var4_7 >= var1_5) ** break;
                ** continue;
                var7_1 = var8 ^ 1691437214;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public float getCurrentYaw() {
        var1_1 = kU.m & 1623844449 ^ -1908199141;
        var3_2 = 0;
        if (true) ** GOTO lbl17
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
                case -767658070: {
                    return this.u;
                }
lbl11:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | 1623844449) ^ -867492814;
                    ** GOTO lbl-1000
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | 1623844449) ^ 1022722257;
                    ** GOTO lbl-1000
                    break;
                }
lbl17:
                // 1 sources

                var2_3 = (var1_1 | 1623844449) ^ 871101890;
                var3_2 = (var1_1 | 1623844449) ^ -1959569551;
                ** continue;
                case 578874185: {
                    var2_3 ^= var3_2 ^ -1481632879;
                    ** continue;
                }
                case 1710792714: 
            }
            break;
        }
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public float getCurrentPitch() {
        var1_1 = kU.m & 722507882 ^ -1702629203;
        var3_2 = 0;
        var2_3 = (var1_1 | 722507882) ^ -1241378807;
        ** GOTO lbl17
lbl5:
        // 1 sources

        while (true) {
            var3_2 = (var1_1 | 722507882) ^ 294264771;
            ** GOTO lbl10
            break;
        }
lbl8:
        // 1 sources

        while (true) {
            var3_2 = (var1_1 | 722507882) ^ -2068305654;
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
                    case -1441142996: {
                        return this.t;
                    }
lbl17:
                    // 1 sources

                    var3_2 = (var1_1 | 722507882) ^ -624948557;
                    ** continue;
                    case 1059836389: {
                        var2_3 ^= var3_2 ^ 1544719863;
                        ** continue;
                    }
                    case 1632891484: 
                }
                break;
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
    public float getRenderedYaw() {
        block24: {
            var5_1 = 873351243;
            var2_2 = kU.m & 873351243 ^ 611324921;
            var4_3 = 0;
            var3_5 = (var2_2 | var5_1) ^ -657826166;
            var4_3 = (var2_2 | var5_1) ^ 2044020056;
            break block24;
            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 864879112;
                ** GOTO lbl37
                break;
            }
        }
        block18: while (true) {
            switch (var4_3) {
                case 203129855: {
                    var3_5 ^= var4_3 ^ -1077886190;
                    var4_3 = (var2_2 | var5_1) ^ -1418710745;
                }
                default: {
                    continue block18;
                }
                case 1303060131: {
                    var4_3 = (var2_2 | var5_1) ^ 946198532;
                    continue block18;
                }
                case -1626445092: 
            }
            break;
        }
        var1_4 = this.FX();
        var4_3 = (var2_2 | var5_1) ^ 170080607;
        ** GOTO lbl37
        while (true) {
            var4_3 = (var2_2 | var5_1) ^ -475698810;
            ** GOTO lbl37
lbl28:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 286639291;
                if (true) ** GOTO lbl37
                break;
            }
            break;
        }
        block21: while (true) {
            block25: {
                var4_3 = (var2_2 | var5_1) ^ -171634958;
                break block25;
lbl34:
                // 2 sources

                while (true) {
                    var3_5 ^= 397791240;
                    return v0 + this.u;
                }
            }
            block23: while (true) {
                switch (var4_3) {
                    default: {
                        continue block23;
                    }
                    case 1046307492: {
                        var3_5 ^= var4_3 ^ 770673257;
                        ** continue;
                    }
                    case -713112646: {
                        var3_5 ^= var4_3 ^ 1095716135;
                        var4_3 = (var2_2 | var5_1) ^ -710032517;
                        continue block23;
                    }
                    case 1412989335: {
                        var3_5 ^= var4_3 ^ 1474591591;
                        var4_3 = (var2_2 | var5_1) ^ -580303588;
                        continue block23;
                    }
                    case -384360729: {
                        if (var1_4 != null) ** continue;
                        var4_3 = (var2_2 | var5_1) ^ -520054719;
                        continue block23;
                    }
                    case -673500547: {
                        var3_5 ^= var4_3 ^ 683816023;
                        var4_3 = (var2_2 | var5_1) ^ 2045195258;
                        continue block23;
                    }
                    case -1044687607: {
                        v0 = var1_4.method_36454();
                        ** GOTO lbl34
                    }
                    case 627810112: {
                        if (!this.r) ** continue;
                        var4_3 = (var2_2 | var5_1) ^ 1615256172;
                        continue block23;
                    }
                    case 133388787: {
                        var3_5 ^= var4_3 ^ -1815947410;
                        continue block21;
                    }
                    case -506226560: {
                        v0 = 0.0f;
                        ** continue;
                    }
                    case 1301899265: 
                }
                break;
            }
            break;
        }
        return this.u;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public float getRenderedPitch() {
        var6_1 = -310824579;
        var3_2 = kU.m & -310824579 ^ 610612449;
        var5_3 = 0;
        var4_5 = (var3_2 | var6_1) ^ 505538643;
        var5_3 = (var3_2 | var6_1) ^ -1474511472;
        if (true) ** GOTO lbl77
lbl7:
        // 1 sources

        while (true) {
            block23: {
                var5_3 = (var3_2 | var6_1) ^ 329065187;
                break block23;
                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ -378129224;
                    break block23;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
            }
            block20: while (true) {
                block24: {
                    switch (var5_3) {
                        case -548275022: {
                            var4_5 ^= var5_3 ^ 669670763;
                            ** break;
                        }
                        case 67830085: {
                            var4_5 ^= var5_3 ^ 1685980408;
                            ** GOTO lbl32
                        }
                        case 1673913377: {
                            v0 = this.t;
                            ** GOTO lbl55
                        }
                        case 2015947294: {
                            var4_5 ^= var5_3 ^ 408809379;
                            ** GOTO lbl37
                        }
lbl30:
                        // 1 sources

                        var5_3 = (var3_2 | var6_1) ^ -1900490276;
                        break;
lbl32:
                        // 1 sources

                        var5_3 = (var3_2 | var6_1) ^ 1594548526;
                        break;
                        case -1279524956: {
                            var4_5 ^= var5_3 ^ 898984962;
                            ** break;
                        }
lbl37:
                        // 1 sources

                        var5_3 = (var3_2 | var6_1) ^ -705910937;
                        break;
                        case 1362725601: {
                            if (var1_4 != null) ** continue;
                            var5_3 = (var3_2 | var6_1) ^ -1789534237;
                            break;
                        }
                        case 950355877: {
                            if (this.r) {
                                var5_3 = (var3_2 | var6_1) ^ 1590086233;
                                break;
                            }
                            break block24;
                        }
                        case -1300769581: {
                            v1 = var1_4.method_36455();
                            ** GOTO lbl53
                        }
                        case 949064346: {
                            v1 = 0.0f;
lbl53:
                            // 2 sources

                            var4_5 ^= 518010818;
                            v0 = v1 + this.t;
lbl55:
                            // 2 sources

                            var4_5 ^= 584896628;
                            ** continue;
                        }
lbl57:
                        // 1 sources

                        var5_3 = (var3_2 | var6_1) ^ -1136345316;
                        continue block20;
                        case -18868450: {
                            var4_5 ^= var5_3 ^ 1008617403;
                            var5_3 = (var3_2 | var6_1) ^ -707235240;
                        }
                    }
                    continue;
                }
                var5_3 = (var3_2 | var6_1) ^ 841795919;
            }
            break;
        }
        block21: while (true) {
            switch (var5_3) {
                case -709765203: {
                    var1_4 = this.FX();
                    ** continue;
                }
                case 1164019821: {
                    var5_3 = (var3_2 | var6_1) ^ -1713065207;
                    continue block21;
                }
                case 1956218612: {
                    var4_5 ^= var5_3 ^ 555964377;
                    var5_3 = (var3_2 | var6_1) ^ 952951376;
                }
            }
lbl77:
            // 3 sources

        }
        var2_6 = v0;
        var4_5 ^= 697527106;
        return cm.clamp(var2_6, -90.0f, 90.0f);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void applyMouseDelta(float var1_1, float var2_2) {
        block23: {
            block21: {
                block20: {
                    block22: {
                        block19: {
                            block18: {
                                var6_3 = -1619061185;
                                var3_4 = kU.m & -1619061185 ^ -1463081722;
                                var5_5 = 0;
                                ** GOTO lbl45
lbl5:
                                // 1 sources

                                while (true) {
                                    var4_6 ^= var5_5 ^ 1931732605;
                                    ** GOTO lbl33
                                    break;
                                }
lbl8:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var4_6 ^= var5_5 ^ 893126246;
                                    break block18;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var5_5 = (var3_4 | var6_3) ^ -548722794;
                                    break block19;
                                    break;
                                }
                            }
                            var5_5 = (var3_4 | var6_3) ^ -2124944950;
                        }
lbl19:
                        // 6 sources

                        block15: while (true) {
                            switch (var5_5) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    default: {
                                        continue block15;
                                    }
                                    break;
                                }
                                case 1324975958: {
                                    ** continue;
                                }
                                case -161189043: {
                                    ** continue;
                                }
                                case 1333424323: {
                                    ** continue;
                                }
                                case -1850993221: {
                                    var4_6 ^= var5_5 ^ 1350168344;
                                    break block20;
                                }
lbl33:
                                // 1 sources

                                var5_5 = (var3_4 | var6_3) ^ 172898577;
                                ** GOTO lbl-1000
lbl35:
                                // 1 sources

                                while (true) {
                                    var5_5 = (var3_4 | var6_3) ^ -259700740;
                                    ** continue;
                                    break;
                                }
                                case 1863117249: {
                                    this.t = (float)((double)this.t - (double)var2_2 * 0.15);
                                    break block21;
                                }
                                case -1246687698: {
                                    return;
                                }
                                case 1622413481: {
                                    ** continue;
                                }
lbl45:
                                // 1 sources

                                var4_6 = (var3_4 | var6_3) ^ 736054594;
                                ** continue;
                                case 1511410233: {
                                    var4_6 ^= var5_5 ^ 1471596712;
                                    break block22;
                                }
                                case 1051254517: {
                                    this.u = (float)((double)this.u + (double)var1_1 * 0.15);
                                    break block15;
                                }
                            }
                            break;
                        }
                        break block23;
                        this.t = cm.clamp(this.t, -90.0f, 90.0f);
                        var5_5 = (var3_4 | var6_3) ^ -251219863;
                        ** GOTO lbl19
                    }
                    var5_5 = (var3_4 | var6_3) ^ -789324034;
                    ** GOTO lbl19
                }
                var5_5 = (var3_4 | var6_3) ^ 1234912370;
                ** GOTO lbl19
            }
            var5_5 = (var3_4 | var6_3) ^ 777200260;
            ** GOTO lbl19
        }
        var5_5 = (var3_4 | var6_3) ^ -437682938;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public ep calculateRotation(class_243 var1_1) {
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
    private static double FY(class_1309 var0) {
        var5_1 = 1079698477;
        var2_2 = kU.m & 1079698477 ^ -278303785;
        var4_3 = 0;
        ** GOTO lbl45
lbl5:
        // 1 sources

        while (true) {
            var4_3 = (var2_2 | var5_1) ^ 180285835;
            if (true) ** GOTO lbl17
            break;
        }
        block10: while (true) {
            block19: {
                var4_3 = (var2_2 | var5_1) ^ 1643276739;
                break block19;
lbl11:
                // 1 sources

                while (true) {
                    var3_4 ^= var4_3 ^ -2016330121;
                    ** GOTO lbl47
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var3_4 ^= var4_3 ^ -1159200151;
                    ** GOTO lbl37
                    break;
                }
            }
lbl18:
            // 2 sources

            block13: while (true) {
                block0 : switch (var4_3) lbl-1000:
                // 5 sources

                {
                    default: {
                        continue block13;
                    }
                    case 1390817564: {
                        ** continue;
                    }
                    case 1655212342: {
                        ** continue;
                    }
                    case -440066444: {
                        var3_4 ^= var4_3 ^ 821170463;
                        break block10;
                    }
                    while (true) {
                        var4_3 = (var2_2 | var5_1) ^ -1113727261;
                        ** GOTO lbl-1000
                        break;
                    }
lbl32:
                    // 2 sources

                    while (true) {
                        var3_4 ^= -387425580;
                        break block0;
lbl35:
                        // 1 sources

                        return var0.field_6014 + (var0.method_23317() - var0.field_6014) * (double)var1_5;
                    }
lbl37:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ 1226469743;
                    ** GOTO lbl-1000
lbl39:
                    // 1 sources

                    while (true) {
                        var3_4 ^= -584757564;
                        ** continue;
                        break;
                    }
                    case -1503551856: {
                        if (class_310.method_1551().method_61966() != null) ** continue;
                        ** continue;
                    }
lbl45:
                    // 1 sources

                    var3_4 = (var2_2 | var5_1) ^ 1637725382;
                    continue block10;
lbl47:
                    // 1 sources

                    var4_3 = (var2_2 | var5_1) ^ -50655216;
                    ** GOTO lbl-1000
                }
                break;
            }
            break;
        }
        var4_3 = (var2_2 | var5_1) ^ 779132866;
        ** while (true)
        {
            case -1903589828: {
                var4_3 = (var2_2 | var5_1) ^ -1915525431;
                ** GOTO lbl-1000
            }
            case 327221231: {
                v0 = class_310.method_1551().method_61966().method_60637(true);
                ** GOTO lbl32
            }
        }
        var1_5 = v0;
        ** while (true)
        {
            ** case -1056214979:
        }
lbl60:
        // 1 sources

        v0 = 1.0f;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static double FZ(class_1309 var0) {
        block18: {
            block17: {
                break block17;
lbl1:
                // 1 sources

                while (true) {
                    v0 = 1.0f;
                    ** GOTO lbl19
                    break;
                }
lbl4:
                // 3 sources

                block10: while (true) {
                    switch (var4_3) lbl-1000:
                    // 4 sources

                    {
                        while (true) {
                            default: {
                                continue block10;
                            }
                            break;
                        }
                        case 342775087: {
                            ** continue;
                        }
lbl11:
                        // 1 sources

                        return var0.field_6036 + (var0.method_23318() - var0.field_6036) * (double)var1_5;
                        case -1982969445: {
                            var3_4 ^= var4_3 ^ 2107297864;
                            break;
                        }
                        case 1964271725: {
                            var4_3 = (var2_2 | var5_1) ^ -1105726803;
                            ** GOTO lbl-1000
                        }
lbl19:
                        // 2 sources

                        while (true) {
                            var3_4 ^= -560195149;
                            ** GOTO lbl28
                            break;
                        }
lbl22:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ 519501582;
                            ** GOTO lbl-1000
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ -1192826925;
                            ** continue;
                            break;
                        }
lbl28:
                        // 1 sources

                        var1_5 = v0;
                        var3_4 ^= 244904593;
                        ** continue;
                        case -1891672859: {
                            var3_4 ^= var4_3 ^ -1119964449;
                            break;
                        }
                    }
                    var4_3 = (var2_2 | var5_1) ^ 266672293;
                    continue;
                    break;
                }
            }
            var5_1 = 366055734;
            var2_2 = kU.m & 366055734 ^ 668478004;
            var4_3 = 0;
            var3_4 = (var2_2 | var5_1) ^ 1120101400;
            var4_3 = (var2_2 | var5_1) ^ 1120785243;
            ** GOTO lbl4
            {
                case 690965560: {
                    v0 = class_310.method_1551().method_61966().method_60637(true);
                    ** continue;
                }
                case 943498131: {
                    if (class_310.method_1551().method_61966() == null) {
                        ** continue;
                    }
                    break block18;
                }
            }
            var4_3 = (var2_2 | var5_1) ^ 599256601;
            ** GOTO lbl4
            {
                ** case -1263561610:
            }
lbl53:
            // 1 sources

            var3_4 ^= var4_3 ^ -2035385780;
            ** while (true)
        }
        var4_3 = (var2_2 | var5_1) ^ -2089406656;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static double Ga(class_1309 var0) {
        block25: {
            block24: {
                block27: {
                    block26: {
                        block28: {
                            block23: {
                                break block28;
lbl1:
                                // 1 sources

                                while (true) {
                                    var3_4 ^= var4_3 ^ -795769688;
                                    break block23;
                                    break;
                                }
lbl4:
                                // 2 sources

                                while (true) {
                                    var3_4 ^= 1169874469;
                                    break block24;
                                    break;
                                }
lbl7:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ -1862910935;
                                    break block25;
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var3_4 ^= 224281350;
                                    break block26;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    v0 = 1.0f;
                                    ** GOTO lbl4
                                    break;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ 1073315441;
                                    break block25;
                                    break;
                                }
lbl19:
                                // 1 sources

                                while (true) {
                                    v0 = class_310.method_1551().method_61966().method_60637(true);
                                    ** continue;
                                    break;
                                }
                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ 4491204;
                                    break block25;
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    var3_4 ^= var4_3 ^ -2000015628;
                                    break block27;
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ 2064447988;
                                    break block25;
                                    break;
                                }
lbl31:
                                // 1 sources

                                while (true) {
                                    var4_3 = (var2_2 | var5_1) ^ 1578926632;
                                    break block25;
                                    break;
                                }
                            }
                            var4_3 = (var2_2 | var5_1) ^ 2071449141;
                            break block25;
lbl37:
                            // 1 sources

                            while (true) {
                                if (class_310.method_1551().method_61966() != null) ** continue;
                                ** continue;
                                break;
                            }
                        }
                        var5_1 = -769825930;
                        var2_2 = kU.m & -769825930 ^ -767456116;
                        var4_3 = 0;
                        var3_4 = (var2_2 | var5_1) ^ 1619830081;
                        ** while (true)
lbl46:
                        // 1 sources

                        while (true) {
                            var3_4 ^= var4_3 ^ -1216882879;
                            ** continue;
                            break;
                        }
                    }
                    return var0.field_5969 + (var0.method_23321() - var0.field_5969) * (double)var1_5;
                }
                var4_3 = (var2_2 | var5_1) ^ -1408351950;
                break block25;
            }
            var1_5 = v0;
            ** while (true)
        }
        block22: while (true) {
            switch (var4_3) {
                default: {
                    continue block22;
                }
                case 1118557143: {
                    ** continue;
                }
                case -1941869098: {
                    ** continue;
                }
                case -1454303734: {
                    ** continue;
                }
                case 2119413452: {
                    ** continue;
                }
                case -770086854: {
                    ** continue;
                }
                case -1456856629: {
                    ** continue;
                }
                ** case -307981937:
lbl75:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public void refreshTargetRotation() {
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
    public void setTargetRotation(float f2, float f3) {
        int n2 = 793248501;
        int n3 = m & 0x2F4802F5 ^ 0xA9A25A3A;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x5956C74C;
        n4 = (n3 | n2) ^ 0xFCEA5BB6;
        block9: while (true) {
            switch (n4) {
                default: {
                    continue block9;
                }
                case -1708247644: {
                    super.setTargetRotation(f2, f3);
                    n4 = (n3 | n2) ^ 0x1853C497;
                    continue block9;
                }
                case 1392509257: {
                    n4 = (n3 | n2) ^ 0x7483A25C;
                    continue block9;
                }
                case 1941957819: {
                    this.a = null;
                    n4 = (n3 | n2) ^ 0x435C76AC;
                    continue block9;
                }
                case -1212572056: {
                    n5 ^= n4 ^ 0x28E45858;
                    n4 = (n3 | n2) ^ 0x17B57674;
                    continue block9;
                }
                case -613812061: {
                    n5 ^= n4 ^ 0x2518E6D6;
                    n4 = (n3 | n2) ^ 0xDC55B644;
                    continue block9;
                }
                case -1201722229: {
                    return;
                }
                case -323605421: 
            }
            n5 ^= n4 ^ 0x38592E44;
            n4 = (n3 | n2) ^ 0x35C46F5B;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean shouldRetainAfterCompletion() {
        block17: {
            block18: {
                block16: {
                    break block18;
lbl1:
                    // 2 sources

                    block9: while (true) {
                        switch (var3_3) lbl-1000:
                        // 6 sources

                        {
                            default: {
                                continue block9;
                            }
lbl5:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 154950458;
                                ** GOTO lbl-1000
                                break;
                            }
                            case 1011051694: {
                                v0 = false;
                                break block9;
                            }
lbl11:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1021187264;
                                ** GOTO lbl-1000
                                break;
                            }
                            case 66623807: {
                                var2_4 ^= var3_3 ^ 398566263;
                                break block16;
                            }
                            case 408945815: {
                                ** continue;
                            }
                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -842107199;
                                ** GOTO lbl-1000
                                break;
                            }
lbl22:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 142656831;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -494661728: {
                                if (this.r) ** continue;
                                ** continue;
                            }
                        }
                        break;
                    }
lbl28:
                    // 2 sources

                    while (true) {
                        var2_4 ^= -1976924155;
                        break block17;
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ -227179696;
                ** GOTO lbl1
                {
                    case -955599676: {
                        var2_4 ^= var3_3 ^ 1722219499;
                        var3_3 = (var1_2 | var4_1) ^ 749920350;
                        ** GOTO lbl-1000
                    }
                }
            }
            var4_1 = -2043220268;
            var1_2 = kU.m & -2043220268 ^ 1275078506;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ 1121738723;
            var3_3 = (var1_2 | var4_1) ^ -698946711;
            ** while (true)
            {
                case -961140031: {
                    v0 = true;
                    ** continue;
                }
            }
        }
        return v0;
        {
            ** case 219612350:
        }
lbl51:
        // 1 sources

        var2_4 ^= var3_3 ^ 422461174;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void update(class_746 var1_1, boolean var2_2) {
        block98: {
            block92: {
                block91: {
                    block96: {
                        block97: {
                            block100: {
                                block99: {
                                    block94: {
                                        block101: {
                                            block93: {
                                                block95: {
                                                    block90: {
                                                        break block101;
lbl1:
                                                        // 2 sources

                                                        while (true) {
                                                            var8_5 = (var6_4 | var9_3) ^ -1249911214;
                                                            ** GOTO lbl135
                                                            break;
                                                        }
lbl4:
                                                        // 1 sources

                                                        while (true) {
                                                            var8_5 = (var6_4 | var9_3) ^ -2060763693;
                                                            break block90;
                                                            break;
                                                        }
lbl7:
                                                        // 1 sources

                                                        while (true) {
                                                            var7_9 ^= var8_5 ^ 450810824;
                                                            break block91;
                                                            break;
                                                        }
lbl10:
                                                        // 1 sources

                                                        while (true) {
                                                            var8_5 = (var6_4 | var9_3) ^ 498600017;
                                                            break block92;
                                                            break;
                                                        }
lbl13:
                                                        // 1 sources

                                                        while (true) {
                                                            var8_5 = (var6_4 | var9_3) ^ -692959839;
                                                            break block90;
                                                            break;
                                                        }
lbl16:
                                                        // 1 sources

                                                        while (true) {
                                                            var8_5 = (var6_4 | var9_3) ^ 360249933;
                                                            ** GOTO lbl135
                                                            break;
                                                        }
lbl19:
                                                        // 1 sources

                                                        while (true) {
                                                            var8_5 = (var6_4 | var9_3) ^ -1967013053;
                                                            break block92;
                                                            break;
                                                        }
lbl22:
                                                        // 1 sources

                                                        while (true) {
                                                            this.setComplete(var5_8);
                                                            ** GOTO lbl1
                                                            break;
                                                        }
lbl25:
                                                        // 1 sources

                                                        while (true) {
                                                            var8_5 = (var6_4 | var9_3) ^ 631473774;
                                                            break block90;
                                                            break;
                                                        }
lbl28:
                                                        // 1 sources

                                                        while (true) {
                                                            var8_5 = (var6_4 | var9_3) ^ 959376215;
                                                            break block92;
lbl31:
                                                            // 1 sources

                                                            while (true) {
                                                                if (!var3_6) ** GOTO lbl106
                                                                break block93;
                                                                break;
                                                            }
lbl34:
                                                            // 1 sources

                                                            while (!this.r) {
                                                                break block94;
lbl36:
                                                                // 1 sources

                                                                while (true) {
                                                                    var7_9 ^= var8_5 ^ 637310173;
                                                                    ** GOTO lbl125
                                                                    break;
                                                                }
lbl39:
                                                                // 1 sources

                                                                while (true) {
                                                                    var7_9 ^= var8_5 ^ -87048707;
                                                                    break block95;
                                                                    break;
                                                                }
                                                            }
                                                            break block96;
                                                            break;
                                                        }
                                                    }
lbl44:
                                                    // 5 sources

                                                    block57: while (true) {
                                                        block0 : switch (var8_5) lbl-1000:
                                                        // 7 sources

                                                        {
                                                            while (true) {
                                                                default: {
                                                                    continue block57;
                                                                }
                                                                break;
                                                            }
                                                            case 1220551516: {
                                                                ** continue;
                                                            }
                                                            case -326470079: {
                                                                break block97;
                                                            }
lbl53:
                                                            // 1 sources

                                                            while (true) {
                                                                var8_5 = (var6_4 | var9_3) ^ 841516302;
                                                                ** GOTO lbl135
                                                                break;
                                                            }
lbl56:
                                                            // 1 sources

                                                            while (Math.abs((float)this.m) < 1.0f) {
                                                                ** continue;
lbl58:
                                                                // 1 sources

                                                                ** GOTO lbl10
                                                            }
                                                            ** GOTO lbl106
                                                            while (true) {
                                                                var8_5 = (var6_4 | var9_3) ^ 392659372;
                                                                ** GOTO lbl-1000
                                                                break;
                                                            }
lbl63:
                                                            // 1 sources

                                                            while (true) {
                                                                var7_9 ^= 661581172;
                                                                ** GOTO lbl100
                                                                break;
                                                            }
lbl66:
                                                            // 1 sources

                                                            while (true) {
                                                                var8_5 = (var6_4 | var9_3) ^ 494703393;
                                                                break block92;
                                                                break;
                                                            }
lbl69:
                                                            // 1 sources

                                                            while (true) {
                                                                var8_5 = (var6_4 | var9_3) ^ 1712005109;
                                                                ** GOTO lbl135
lbl72:
                                                                // 1 sources

                                                                return;
                                                            }
lbl74:
                                                            // 1 sources

                                                            while (true) {
                                                                var7_9 ^= var8_5 ^ 1012890781;
                                                                var8_5 = (var6_4 | var9_3) ^ -2050625424;
                                                                break block92;
                                                                break;
                                                            }
lbl78:
                                                            // 1 sources

                                                            while (true) {
                                                                var7_9 ^= -380623274;
                                                                ** GOTO lbl87
                                                                break;
                                                            }
lbl81:
                                                            // 1 sources

                                                            while (true) {
                                                                var7_9 ^= 712208720;
                                                                ** GOTO lbl56
                                                                break;
                                                            }
lbl84:
                                                            // 1 sources

                                                            while (true) {
                                                                var7_9 ^= var8_5 ^ -1699819664;
                                                                ** continue;
                                                                break;
                                                            }
lbl87:
                                                            // 1 sources

                                                            if (!(Math.abs(this.n) < 1.0f)) ** GOTO lbl106
                                                            ** GOTO lbl162
lbl89:
                                                            // 1 sources

                                                            while (!this.shouldRetainAfterCompletion()) {
                                                                ** GOTO lbl187
                                                            }
                                                            break;
                                                            case 172757799: {
                                                                if (this.q) ** continue;
                                                                while (true) {
                                                                    var8_5 = (var6_4 | var9_3) ^ 96291013;
                                                                    ** GOTO lbl-1000
                                                                    break;
                                                                }
                                                            }
                                                            case -565284477: {
                                                                var7_9 ^= var8_5 ^ -1182822260;
                                                                break block98;
                                                            }
lbl100:
                                                            // 1 sources

                                                            var4_7 = this.updatePitch();
                                                            var8_5 = (var6_4 | var9_3) ^ 1958333144;
                                                            break block92;
lbl103:
                                                            // 1 sources

                                                            while (true) {
                                                                var8_5 = (var6_4 | var9_3) ^ 1209174132;
                                                                ** GOTO lbl135
                                                                break;
                                                            }
lbl106:
                                                            // 4 sources

                                                            while (true) {
                                                                var8_5 = (var6_4 | var9_3) ^ 1963686794;
                                                                break block92;
                                                                break;
                                                            }
lbl109:
                                                            // 1 sources

                                                            while (true) {
                                                                var8_5 = (var6_4 | var9_3) ^ -1070805767;
                                                                ** GOTO lbl135
                                                                break;
                                                            }
                                                            case 2050704458: {
                                                                return;
                                                            }
lbl114:
                                                            // 2 sources

                                                            while (true) {
                                                                var8_5 = (var6_4 | var9_3) ^ -1811100473;
                                                                ** GOTO lbl-1000
                                                                break;
                                                            }
                                                            case 1877031722: {
                                                                var7_9 ^= var8_5 ^ -1356209637;
                                                                break block57;
                                                            }
lbl120:
                                                            // 1 sources

                                                            while (true) {
                                                                continue;
lbl122:
                                                                // 1 sources

                                                                while (true) {
                                                                    this.setRelativeMode(true);
                                                                    ** continue;
                                                                    break;
                                                                }
                                                                break;
                                                            }
lbl125:
                                                            // 1 sources

                                                            var8_5 = (var6_4 | var9_3) ^ 2137249687;
                                                            ** GOTO lbl135
lbl127:
                                                            // 1 sources

                                                            while (true) {
                                                                var8_5 = (var6_4 | var9_3) ^ -1288842063;
                                                                ** GOTO lbl-1000
                                                                break;
                                                            }
lbl130:
                                                            // 1 sources

                                                            while (true) {
                                                                var8_5 = (var6_4 | var9_3) ^ -241048374;
                                                                ** GOTO lbl-1000
                                                                break;
                                                            }
                                                            var5_8 = v0;
                                                            var8_5 = (var6_4 | var9_3) ^ 908796982;
lbl135:
                                                            // 12 sources

                                                            block80: while (true) {
                                                                switch (var8_5) {
                                                                    default: {
                                                                        continue block80;
                                                                    }
                                                                    case -909806877: {
                                                                        ** continue;
                                                                    }
                                                                    case 323990232: {
                                                                        ** GOTO lbl34
                                                                    }
                                                                    case 1083668366: {
                                                                        ** continue;
                                                                    }
                                                                    case -842607653: {
                                                                        ** continue;
                                                                    }
                                                                    case -1645811688: {
                                                                        ** continue;
                                                                    }
                                                                    case -3855325: {
                                                                        ** continue;
                                                                    }
                                                                    case -1275101287: {
                                                                        ** GOTO lbl89
                                                                    }
                                                                    case 1635356878: {
                                                                        ** continue;
                                                                    }
                                                                    case -2071060358: {
                                                                        ** continue;
                                                                    }
                                                                    case 1002519316: {
                                                                        ** continue;
                                                                    }
                                                                    case -1096976212: {
                                                                        if (var1_1 == null) ** GOTO lbl114
                                                                        ** continue;
                                                                    }
lbl162:
                                                                    // 1 sources

                                                                    var8_5 = (var6_4 | var9_3) ^ 1794915242;
                                                                    break block92;
lbl164:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var8_5 = (var6_4 | var9_3) ^ -174695895;
                                                                        break block92;
lbl167:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            if (!var4_7) ** continue;
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case -947962670: {
                                                                        var3_6 = this.updateYaw();
                                                                        ** continue;
                                                                    }
                                                                    case 1318201791: {
                                                                        var7_9 ^= var8_5 ^ 1430940120;
                                                                        ** continue;
                                                                    }
                                                                    case -292221536: {
                                                                        if (!var5_8) break block0;
                                                                    }
                                                                }
                                                                break;
                                                            }
lbl178:
                                                            // 1 sources

                                                            while (true) {
                                                                var8_5 = (var6_4 | var9_3) ^ 723034808;
                                                                ** continue;
                                                                break;
                                                            }
                                                            case 302289749: {
                                                                if (!var2_2) ** continue;
                                                                ** continue;
                                                            }
lbl184:
                                                            // 1 sources

                                                            while (true) {
                                                                var7_9 ^= var8_5 ^ 86610920;
                                                                ** continue;
                                                                break;
                                                            }
lbl187:
                                                            // 1 sources

                                                            var8_5 = (var6_4 | var9_3) ^ -1149599645;
                                                            ** GOTO lbl135
lbl189:
                                                            // 1 sources

                                                            while (true) {
                                                                v0 = true;
                                                                break block99;
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    var8_5 = (var6_4 | var9_3) ^ -2116635737;
                                                    ** GOTO lbl44
                                                    {
                                                        case 2126957118: {
                                                            this.refreshTargetRotation();
                                                            ** continue;
                                                        }
                                                    }
lbl197:
                                                    // 1 sources

                                                    while (true) {
                                                        var7_9 ^= var8_5 ^ -857598564;
                                                        break block100;
                                                        break;
                                                    }
                                                    ** while (true)
                                                }
                                                var8_5 = (var6_4 | var9_3) ^ -392018635;
                                                ** GOTO lbl135
                                            }
                                            var8_5 = (var6_4 | var9_3) ^ 1926560695;
                                            break block92;
                                            {
                                                case -28262616: {
                                                    var7_9 ^= var8_5 ^ 838516375;
                                                    ** continue;
                                                }
                                            }
                                        }
                                        var9_3 = -615672467;
                                        var6_4 = kU.m & -615672467 ^ 1625678573;
                                        var8_5 = 0;
                                        var7_9 = (var6_4 | var9_3) ^ -1464930433;
                                        ** while (true)
lbl216:
                                        // 1 sources

                                        while (true) {
                                            v0 = false;
                                            break block99;
                                            break;
                                        }
                                    }
                                    var8_5 = (var6_4 | var9_3) ^ -1701550301;
                                    ** GOTO lbl135
                                }
                                var7_9 ^= 1223295143;
                                ** while (true)
                            }
                            var8_5 = (var6_4 | var9_3) ^ -1969254517;
                            break block92;
                        }
                        var8_5 = (var6_4 | var9_3) ^ -370580296;
                        ** GOTO lbl44
                        {
                            case 761246284: {
                                ** continue;
                            }
                        }
                    }
                    var8_5 = (var6_4 | var9_3) ^ 69786574;
                    ** while (true)
lbl236:
                    // 1 sources

                    while (true) {
                        var8_5 = (var6_4 | var9_3) ^ 1016253247;
                        ** GOTO lbl44
                        break;
                    }
                    {
                        ** case -789228203:
                    }
lbl240:
                    // 1 sources

                    var7_9 ^= var8_5 ^ -1415876108;
                    ** while (true)
                }
                var8_5 = (var6_4 | var9_3) ^ -519529182;
            }
            block89: while (true) {
                switch (var8_5) {
                    default: {
                        continue block89;
                    }
                    case -1897493401: {
                        ** continue;
                    }
                    case 2116552605: {
                        ** continue;
                    }
                    case -1890304715: {
                        ** continue;
                    }
                    case -1027400518: {
                        ** continue;
                    }
                    case 242986436: {
                        ** continue;
                    }
                    case -1861104569: {
                        ** continue;
                    }
                    case 1898722478: {
                        ** continue;
                    }
                    case 1903327334: {
                        ** continue;
                    }
                    case -426679092: {
                        ** continue;
                    }
                    case -1992749990: {
                        ** continue;
                    }
                    case 451242703: {
                        ** continue;
                    }
                    case -430571588: 
                }
                break;
            }
            var7_9 ^= var8_5 ^ 252041706;
            ** while (true)
        }
        var8_5 = (var6_4 | var9_3) ^ 1165004609;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public void setRelativeMode(boolean var1_1) {
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
}

