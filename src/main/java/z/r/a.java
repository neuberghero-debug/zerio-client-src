/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1041
 *  net.minecraft.class_1297
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_3675
 *  net.minecraft.class_5498
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1041;
import net.minecraft.class_1297;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3675;
import net.minecraft.class_5498;
import z.r.aE;
import z.r.gF;
import z.r.gP;
import z.r.gj;
import z.r.kM;
import z.r.ke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class a
extends gF {
    private static final /* synthetic */ String a;
    private static final int[] a;
    private final gP a;
    private boolean a;
    private class_5498 a;
    private boolean b;
    private float a;
    private static final /* synthetic */ String k;
    private boolean c;
    private static final /* synthetic */ String b;
    private boolean d;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String d;
    private float b;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private float c;
    private boolean e;
    private final gP b;
    private static final /* synthetic */ String g;
    private float d;
    private float e;
    private static final /* synthetic */ String h;
    public static final int a;
    private final ke a;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private final aE a;
    private final ke b;
    private static final /* synthetic */ String l;
    private boolean f;
    private final gP c;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private long a;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private static final float f;
    private final ke c;

    /*
     * Exception decompiling
     */
    public a() {
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
        var5_1 = 418019313;
        var2_2 = z.r.a.a & 418019313 ^ -1217117820;
        var4_3 = 0;
        var3_5 = (var2_2 | var5_1) ^ -1959015609;
        var4_3 = (var2_2 | var5_1) ^ 960880326;
        ** GOTO lbl102
lbl7:
        // 1 sources

        while (true) {
            var4_3 = (var2_2 | var5_1) ^ 1383725794;
            if (true) ** GOTO lbl27
            break;
        }
        block37: while (true) {
            var4_3 = (var2_2 | var5_1) ^ 68734512;
            ** GOTO lbl102
lbl13:
            // 1 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ -1714518483;
                ** GOTO lbl27
                break;
            }
lbl16:
            // 2 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 1005214801;
                ** GOTO lbl102
                break;
            }
lbl19:
            // 2 sources

            while (true) {
                var4_3 = (var2_2 | var5_1) ^ 1914739082;
                if (true) ** GOTO lbl27
                break;
            }
            block41: while (true) {
                var4_3 = (var2_2 | var5_1) ^ -663960875;
                if (true) ** GOTO lbl27
                block42: while (true) {
                    var4_3 = (var2_2 | var5_1) ^ -901620748;
lbl27:
                    // 5 sources

                    block43: while (true) {
                        switch (var4_3) {
                            case -394896422: {
                                this.b = false;
                                var4_3 = (var2_2 | var5_1) ^ 531387449;
                                continue block43;
                            }
                            case -309883625: {
                                var3_5 ^= var4_3 ^ -1084712459;
                                var4_3 = (var2_2 | var5_1) ^ -896870649;
                                continue block43;
                            }
                            case 1628861907: {
                                if (!var1_4.isFreecamActive()) ** GOTO lbl19
                                var4_3 = (var2_2 | var5_1) ^ -1188405181;
                                continue block43;
                            }
                            case 142799107: {
                                this.ak(class_310.method_1551());
                                var4_3 = (var2_2 | var5_1) ^ -1042865731;
                                continue block43;
                            }
                            case 1011314514: {
                                var3_5 ^= var4_3 ^ -1929322458;
                                var4_3 = (var2_2 | var5_1) ^ 553316561;
                                continue block43;
                            }
                            case -1711744886: {
                                var4_3 = (var2_2 | var5_1) ^ -555220442;
                                continue block43;
                            }
                            case 114562998: {
                                var3_5 ^= var4_3 ^ 757427125;
                                ** GOTO lbl86
                            }
                            case 1970577650: {
                                this.c = true;
                                var4_3 = (var2_2 | var5_1) ^ -1894725689;
                                continue block43;
                            }
                            case -1579316864: {
                                if (var1_4 != null) ** break;
                                ** continue;
                                var4_3 = (var2_2 | var5_1) ^ 637972351;
                                continue block43;
                            }
                            case 1221426795: {
                                var3_5 ^= var4_3 ^ -243299799;
                                ** break;
                            }
                            case 1975266305: {
                                var3_5 ^= var4_3 ^ -2039816027;
                                var4_3 = (var2_2 | var5_1) ^ -210718079;
                                continue block43;
                            }
                            case 820949042: {
                                var3_5 ^= var4_3 ^ 410604407;
                                var4_3 = (var2_2 | var5_1) ^ 1468541999;
                                continue block43;
                            }
                            case 1935299116: {
                                this.toast(z.r.a.b);
                                continue block42;
                            }
                            case 2116638280: {
                                var3_5 ^= var4_3 ^ -778486773;
                                ** continue;
                            }
lbl81:
                            // 1 sources

                            var4_3 = (var2_2 | var5_1) ^ 505675381;
                            ** GOTO lbl94
                            case -841027969: {
                                var3_5 ^= var4_3 ^ -1981816799;
                                continue block41;
                            }
lbl86:
                            // 1 sources

                            var4_3 = (var2_2 | var5_1) ^ -861657639;
                            ** GOTO lbl94
                            case 1737667872: {
                                this.e = false;
                                ** continue;
                            }
                            case -1605229620: {
                                var3_5 ^= var4_3 ^ 578522378;
                                var4_3 = (var2_2 | var5_1) ^ -1216575754;
                            }
lbl94:
                            // 4 sources

                            default: {
                                continue block43;
                            }
                            case 1284425076: {
                                this.setEnabled(false);
                                var4_3 = (var2_2 | var5_1) ^ -2085021529;
                                continue block43;
                            }
                            case -1627093212: {
                                return;
                            }
lbl102:
                            // 3 sources

                            block44: while (true) {
                                switch (var4_3) {
                                    default: {
                                        continue block44;
                                    }
                                    case -2034521805: {
                                        var4_3 = (var2_2 | var5_1) ^ -1382259541;
                                        continue block44;
                                    }
                                    case 990536262: {
                                        var3_5 ^= var4_3 ^ -1609881454;
                                        continue block37;
                                    }
                                    case 308417374: {
                                        ** GOTO lbl16
                                    }
                                    case -1142507067: {
                                        var4_3 = (var2_2 | var5_1) ^ 1533382399;
                                        continue block44;
                                    }
                                    case 776535663: {
                                        var3_5 ^= var4_3 ^ -1734620467;
                                        ** continue;
                                    }
                                    case -459540214: {
                                        var1_4 = kM.get();
                                        var4_3 = (var2_2 | var5_1) ^ -147650146;
                                        continue block43;
                                    }
                                    case -498879400: {
                                        var3_5 ^= var4_3 ^ 1733673918;
                                        continue block37;
                                    }
                                    case -2079052892: 
                                }
                                switch (var3_5) {
                                    case 1017824635: {
                                        var4_3 = (var2_2 | var5_1) ^ -1850308198;
                                        continue block44;
                                    }
                                    default: {
                                        var4_3 = (var2_2 | var5_1) ^ 1572717485;
                                        continue block44;
                                    }
                                    case 885374130: 
                                }
                                var4_3 = (var2_2 | var5_1) ^ -2064378445;
                            }
                            case 640741848: 
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

    private static int aj(int n2, int n3) {
        int n4 = -778046991;
        int n5 = -519459274;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x7D68E261)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xF19F2E41;
        n6 += (n5 | n4) ^ 0xF19F8728;
        n6 -= (n5 | n4) ^ 0xF19F1C03;
        n6 ^= (n5 | n4) ^ 0xF19FFB10;
        n6 ^= (n5 | n4) ^ 0xF19F5C3F;
        n6 -= (n5 | n4) ^ 0xF19F1DCA;
        n6 ^= (n5 | n4) ^ 0xF19F4628;
        return n6 += (n5 | n4) ^ 0xF19F025D;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void onDisable() {
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
    private void ak(class_310 var1_1) {
        block86: {
            block81: {
                block76: {
                    block80: {
                        block85: {
                            block82: {
                                block79: {
                                    block78: {
                                        block84: {
                                            block83: {
                                                block77: {
                                                    block75: {
                                                        var5_2 = 395419994;
                                                        var2_3 = z.r.a.a & 395419994 ^ 805486267;
                                                        var4_4 = 0;
                                                        ** GOTO lbl26
lbl5:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_4 = (var2_3 | var5_2) ^ -1028480041;
                                                            ** GOTO lbl13
lbl8:
                                                            // 1 sources

                                                            while (true) {
                                                                var4_4 = (var2_3 | var5_2) ^ 1169875200;
                                                                ** GOTO lbl13
                                                                break;
                                                            }
                                                            break;
                                                        }
lbl11:
                                                        // 1 sources

                                                        block47: while (true) {
                                                            var4_4 = (var2_3 | var5_2) ^ 1089176611;
lbl13:
                                                            // 40 sources

                                                            block48: while (true) {
                                                                switch (var4_4) lbl-1000:
                                                                // 4 sources

                                                                {
                                                                    default: {
                                                                        continue block48;
                                                                    }
lbl17:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var4_4 = (var2_3 | var5_2) ^ -1851695353;
                                                                        ** GOTO lbl-1000
                                                                        break;
                                                                    }
                                                                    case -920882377: {
                                                                        if (!this.a) break block75;
                                                                        break block76;
                                                                    }
                                                                    case -2109738877: {
                                                                        var3_5 ^= var4_4 ^ 1019514321;
                                                                        break block47;
                                                                    }
lbl26:
                                                                    // 1 sources

                                                                    var3_5 = (var2_3 | var5_2) ^ -1125156817;
                                                                    break block77;
                                                                    case 692281621: {
                                                                        var3_5 ^= var4_4 ^ 1396035394;
                                                                        break;
                                                                    }
                                                                    case 2004368344: {
                                                                        if (!this.isEnabled()) break;
                                                                        break block78;
                                                                    }
lbl34:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var4_4 = (var2_3 | var5_2) ^ -1436704090;
                                                                        ** GOTO lbl-1000
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        var4_4 = (var2_3 | var5_2) ^ 943691380;
                                                        ** GOTO lbl13
                                                        {
                                                            case -1911601286: {
                                                                this.c = false;
                                                                ** continue;
                                                            }
                                                            case 1414108252: {
                                                                var3_5 ^= var4_4 ^ 153530472;
                                                                break;
                                                            }
                                                        }
lbl45:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_4 = (var2_3 | var5_2) ^ 582969868;
                                                            ** GOTO lbl13
                                                            break;
                                                        }
lbl48:
                                                        // 1 sources

                                                        while (true) {
                                                            this.c = v0;
                                                            ** continue;
                                                            break;
                                                        }
                                                        {
                                                            case -728365018: {
                                                                this.a = true;
                                                                break block81;
                                                            }
                                                        }
lbl54:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_4 = (var2_3 | var5_2) ^ -259133208;
                                                            ** GOTO lbl13
                                                            break;
                                                        }
                                                        {
                                                            case -393620969: {
                                                                this.b = this.c;
                                                                break;
                                                            }
                                                        }
                                                        while (true) {
                                                            var4_4 = (var2_3 | var5_2) ^ 655495546;
                                                            ** GOTO lbl13
                                                            break;
                                                        }
                                                        {
                                                            case -1647436451: {
                                                                var3_5 ^= var4_4 ^ 1662300483;
                                                                break block82;
                                                            }
                                                        }
lbl66:
                                                        // 2 sources

                                                        while (true) {
                                                            var4_4 = (var2_3 | var5_2) ^ 2059524445;
                                                            ** GOTO lbl13
                                                            break;
                                                        }
                                                        {
                                                            case 1194752187: {
                                                                this.a = 0L;
                                                                var4_4 = (var2_3 | var5_2) ^ 752532260;
                                                                ** GOTO lbl-1000
                                                            }
                                                        }
lbl73:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_4 = (var2_3 | var5_2) ^ -322876116;
                                                            ** GOTO lbl13
                                                            break;
                                                        }
lbl76:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_4 = (var2_3 | var5_2) ^ -551916052;
                                                            ** GOTO lbl13
                                                            break;
                                                        }
                                                        {
                                                            case 276934273: {
                                                                var3_5 ^= var4_4 ^ 598401313;
                                                                break block83;
                                                            }
                                                        }
lbl82:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_4 = (var2_3 | var5_2) ^ 1885261533;
                                                            ** GOTO lbl13
                                                            break;
                                                        }
lbl85:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_4 = (var2_3 | var5_2) ^ 1709308510;
                                                            ** GOTO lbl13
                                                            break;
                                                        }
                                                        {
                                                            case 807990419: {
                                                                ** continue;
                                                            }
                                                            case 112651530: {
                                                                this.e = var1_1.field_1724.method_36455();
                                                                break;
                                                            }
                                                            case 355259895: {
                                                                var3_5 ^= var4_4 ^ 1311954034;
                                                                ** continue;
                                                            }
                                                        }
lbl96:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_4 = (var2_3 | var5_2) ^ -459007455;
                                                            ** GOTO lbl13
                                                            break;
                                                        }
                                                        {
                                                            case 262941071: {
                                                                return;
                                                            }
                                                        }
                                                        var4_4 = (var2_3 | var5_2) ^ 946442329;
                                                        ** GOTO lbl13
                                                        {
                                                            case -1826550862: {
                                                                break;
                                                            }
                                                        }
lbl105:
                                                        // 2 sources

                                                        while (true) {
                                                            var4_4 = (var2_3 | var5_2) ^ -1246998664;
                                                            ** GOTO lbl13
                                                            break;
                                                        }
lbl108:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_4 = (var2_3 | var5_2) ^ 129715048;
                                                            ** GOTO lbl13
                                                            break;
                                                        }
                                                        {
                                                            case 790792930: {
                                                                this.e = class_3532.method_16439((float)this.b, (float)var1_1.field_1724.method_36455(), (float)this.e);
                                                                break block81;
                                                            }
                                                        }
lbl114:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_4 = (var2_3 | var5_2) ^ 414266649;
                                                            ** GOTO lbl13
                                                            break;
                                                        }
                                                        {
                                                            case -615320873: {
                                                                if (var1_1.field_1687 != null) ** continue;
                                                                break;
                                                            }
                                                            case 302622125: {
                                                                var3_5 ^= var4_4 ^ 323221898;
                                                                ** continue;
                                                            }
                                                        }
                                                        var4_4 = (var2_3 | var5_2) ^ 1675242407;
                                                        ** GOTO lbl13
                                                        {
                                                            case -751327782: {
                                                                var3_5 ^= var4_4 ^ -1841035589;
                                                                break;
                                                            }
                                                        }
lbl128:
                                                        // 1 sources

                                                        while (true) {
                                                            var3_5 ^= 379974949;
                                                            break block79;
                                                            break;
                                                        }
                                                    }
                                                    var4_4 = (var2_3 | var5_2) ^ -379777357;
                                                    ** GOTO lbl13
                                                    {
                                                        case -556879544: {
                                                            var3_5 ^= var4_4 ^ -390243083;
                                                            break block84;
                                                        }
                                                    }
lbl137:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_4 = (var2_3 | var5_2) ^ -24130356;
                                                        ** GOTO lbl13
                                                        break;
                                                    }
                                                    {
                                                        case 1297245862: {
                                                            var3_5 ^= var4_4 ^ 1194703282;
                                                            ** continue;
                                                        }
                                                    }
                                                    var4_4 = (var2_3 | var5_2) ^ 1005998657;
                                                    ** GOTO lbl13
                                                }
                                                var4_4 = (var2_3 | var5_2) ^ 1165694046;
                                                ** GOTO lbl13
                                                {
                                                    case -1882467241: {
                                                        var3_5 ^= var4_4 ^ 374001560;
                                                        break;
                                                    }
                                                }
lbl151:
                                                // 1 sources

                                                while (true) {
                                                    var4_4 = (var2_3 | var5_2) ^ 292375368;
                                                    ** GOTO lbl13
                                                    break;
                                                }
                                            }
                                            var4_4 = (var2_3 | var5_2) ^ -1180895103;
                                            ** GOTO lbl13
                                            {
                                                case -1887806945: {
                                                    var3_5 ^= var4_4 ^ -789981349;
                                                    ** continue;
                                                }
                                                case 1204646182: {
                                                    var3_5 ^= var4_4 ^ 1004668964;
                                                    ** continue;
                                                }
                                            }
                                            var4_4 = (var2_3 | var5_2) ^ -706617700;
                                            ** GOTO lbl13
                                            {
                                                case -132661491: {
                                                    var3_5 ^= var4_4 ^ 1359431998;
                                                    ** continue;
                                                }
                                            }
lbl168:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = (var2_3 | var5_2) ^ -2032519559;
                                                ** GOTO lbl13
                                                break;
                                            }
                                            {
                                                case 1580665647: {
                                                    var1_1.field_1690.method_31043(class_5498.field_26665);
                                                    ** continue;
                                                }
                                            }
                                            var4_4 = (var2_3 | var5_2) ^ -60857376;
                                            ** GOTO lbl13
                                            {
                                                case 1148141087: {
                                                    var3_5 ^= var4_4 ^ 104429283;
                                                    ** continue;
                                                }
                                                case 1915313915: {
                                                    this.b = true;
                                                    break;
                                                }
                                            }
lbl182:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = (var2_3 | var5_2) ^ -1202164820;
                                                ** GOTO lbl13
                                                break;
                                            }
                                            {
                                                case 0xFFA2FA2: {
                                                    this.a = ((Float)this.c.getValue()).floatValue();
                                                    ** continue;
                                                }
                                                case -182379476: {
                                                    this.d = class_3532.method_17821((float)this.b, (float)var1_1.field_1724.method_36454(), (float)this.d);
                                                    ** continue;
                                                }
                                            }
lbl191:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = (var2_3 | var5_2) ^ 517005038;
                                                ** GOTO lbl13
                                                break;
                                            }
                                        }
                                        var4_4 = (var2_3 | var5_2) ^ -2034576621;
                                        ** GOTO lbl13
                                    }
                                    var4_4 = (var2_3 | var5_2) ^ -1531792311;
                                    ** GOTO lbl13
                                    {
                                        case -954314989: {
                                            if (var1_1.field_1724 != null) ** break;
                                            ** continue;
                                            ** continue;
                                        }
                                    }
lbl204:
                                    // 1 sources

                                    while (true) {
                                        v0 = 1.0f;
                                        break block80;
                                        break;
                                    }
                                    {
                                        case -1322685208: {
                                            this.d = var1_1.field_1724.method_36454();
                                            ** continue;
                                        }
                                        case 654242995: {
                                            return;
                                        }
                                    }
lbl212:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ -198059315;
                                        ** GOTO lbl13
                                        break;
                                    }
                                }
                                v0 = 0.0f;
                                break block80;
                                {
                                    case 1383220645: {
                                        return;
                                    }
                                    case -1320580734: {
                                        this.a = var1_1.field_1690.method_31044();
                                        ** continue;
                                    }
                                    case 1927850917: {
                                        ** continue;
                                    }
                                    case -875766757: {
                                        var3_5 ^= var4_4 ^ 735050538;
                                        break block85;
                                    }
                                }
                                var4_4 = (var2_3 | var5_2) ^ 824529649;
                                ** GOTO lbl13
                            }
                            var4_4 = (var2_3 | var5_2) ^ -486164515;
                            ** GOTO lbl13
                        }
                        var4_4 = (var2_3 | var5_2) ^ 1889912640;
                        ** GOTO lbl13
                    }
                    var3_5 ^= -19440017;
                    ** while (true)
                    {
                        case -495820441: {
                            if (((Boolean)this.a.getValue()).booleanValue()) {
                                ** continue;
                            }
                            break block86;
                        }
                    }
                    var4_4 = (var2_3 | var5_2) ^ 1772401876;
                    ** GOTO lbl13
                }
                var4_4 = (var2_3 | var5_2) ^ -1192630812;
                ** GOTO lbl13
                {
                    case -1012767434: {
                        var3_5 ^= var4_4 ^ -1183822003;
                        ** continue;
                    }
                }
                var4_4 = (var2_3 | var5_2) ^ 1945928164;
                ** GOTO lbl13
            }
            var4_4 = (var2_3 | var5_2) ^ 630856278;
            ** GOTO lbl13
            {
                case -1506615044: {
                    var3_5 ^= var4_4 ^ -1472872395;
                    ** continue;
                }
                case 457770207: {
                    var3_5 ^= var4_4 ^ 1557663241;
                    ** continue;
                }
            }
lbl262:
            // 1 sources

            while (true) {
                var4_4 = (var2_3 | var5_2) ^ -813432586;
                ** continue;
                break;
            }
        }
        var3_5 ^= 379974949;
        ** while (true)
        {
            ** case 208006586:
        }
lbl269:
        // 1 sources

        ** while (this.c)
lbl270:
        // 1 sources

        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void onTick(class_310 var1_1) {
        var6_2 = -323093787;
        var3_3 = z.r.a.a & -323093787 ^ 1419734796;
        var5_4 = 0;
        var4_6 = (var3_3 | var6_2) ^ -1288864744;
        var5_4 = (var3_3 | var6_2) ^ -1886925079;
        ** GOTO lbl27
lbl7:
        // 1 sources

        while (true) {
            var5_4 = (var3_3 | var6_2) ^ -362716050;
            ** GOTO lbl167
lbl10:
            // 1 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ -540368451;
                ** GOTO lbl167
                break;
            }
            break;
        }
        while (true) {
            var5_4 = (var3_3 | var6_2) ^ 1501201310;
            ** GOTO lbl27
lbl16:
            // 1 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ -965247177;
                ** GOTO lbl27
                break;
            }
lbl19:
            // 1 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ 1895662993;
                ** GOTO lbl27
                break;
            }
            break;
        }
lbl22:
        // 1 sources

        while (true) {
            var5_4 = (var3_3 | var6_2) ^ 943532479;
            if (true) ** GOTO lbl167
            break;
        }
        block54: while (true) {
            var5_4 = (var3_3 | var6_2) ^ -331695345;
lbl27:
            // 5 sources

            block55: while (true) {
                switch (var5_4) {
                    case -444147681: {
                        if (!this.isEnabled()) {
                            var5_4 = (var3_3 | var6_2) ^ 1064915465;
                            continue block55;
                        }
                        ** GOTO lbl57
                    }
                    case -592085135: {
                        var4_6 ^= var5_4 ^ -1930219373;
                        ** GOTO lbl93
                    }
                    case -908180524: {
                        var4_6 ^= var5_4 ^ -1831472710;
                        ** GOTO lbl123
                    }
                    case -2058037596: {
                        var4_6 ^= var5_4 ^ 2012610097;
                        ** GOTO lbl85
                    }
                    case -1513784205: {
                        ** GOTO lbl123
                    }
                    case -948434642: {
                        var4_6 ^= var5_4 ^ 1653232133;
                        ** GOTO lbl89
                    }
                    case 1981679879: {
                        ** GOTO lbl79
                    }
                    case 1855390175: {
                        var4_6 ^= var5_4 ^ 989379949;
                        var5_4 = (var3_3 | var6_2) ^ -76714995;
                        continue block55;
                    }
                    case 549562491: {
                        var1_1.field_1690.method_31043(class_5498.field_26665);
                        ** GOTO lbl91
                    }
lbl57:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ -1027306967;
                    ** GOTO lbl141
                    case -471388965: {
                        if (var1_1.field_1690.method_31044() != class_5498.field_26665) {
                            ** continue;
                        }
                        ** GOTO lbl91
                    }
                    case 621207029: {
                        ** GOTO lbl108
                    }
                    case 908918111: {
                        var4_6 ^= var5_4 ^ 1569048667;
                        ** continue;
                    }
                    case -256972017: {
                        ** GOTO lbl149
                    }
                    case 986218714: {
                        ** GOTO lbl83
                    }
                    case 1048278468: {
                        var4_6 ^= var5_4 ^ -556750017;
                        var5_4 = (var3_3 | var6_2) ^ -1176445549;
                        ** GOTO lbl141
                    }
                    case -113959617: {
                        if (!this.b) ** GOTO lbl97
                        ** GOTO lbl135
                    }
lbl79:
                    // 1 sources

                    switch (var4_6) {
                        default: {
                            var5_4 = (var3_3 | var6_2) ^ 1002960579;
                            break;
                        }
lbl83:
                        // 1 sources

                        var5_4 = (var3_3 | var6_2) ^ -595699818;
                        break;
lbl85:
                        // 1 sources

                        var5_4 = (var3_3 | var6_2) ^ 525914934;
                        break;
                        case 257138361: {
                            var4_6 ^= var5_4 ^ -1366898688;
lbl89:
                            // 2 sources

                            var5_4 = (var3_3 | var6_2) ^ -170017392;
                            break;
                        }
lbl91:
                        // 2 sources

                        var5_4 = (var3_3 | var6_2) ^ -1842807246;
                        break;
lbl93:
                        // 1 sources

                        var5_4 = (var3_3 | var6_2) ^ -817809792;
                        break;
                        case -809349368: {
                            if (var1_1.field_1724 != null) ** continue;
lbl97:
                            // 2 sources

                            var5_4 = (var3_3 | var6_2) ^ -896335182;
                            break;
                        }
                        case -146540327: {
                            var4_6 ^= var5_4 ^ 1196210771;
                            var5_4 = (var3_3 | var6_2) ^ 423176178;
                            break;
                        }
                        case 157434493: {
                            ** GOTO lbl153
                        }
                        case 420274022: {
                            if (this.getKeyBind() == -1) ** GOTO lbl162
                            ** GOTO lbl145
                        }
lbl108:
                        // 1 sources

                        var5_4 = (var3_3 | var6_2) ^ -441245557;
                        break;
                        case -1582331058: {
                            var4_6 ^= var5_4 ^ 900463812;
                            var5_4 = (var3_3 | var6_2) ^ 92988114;
                            break;
                        }
                        case -451469243: {
                            var5_4 = (var3_3 | var6_2) ^ -202612396;
                            break;
                        }
                        case -1010389532: {
                            var4_6 ^= var5_4 ^ 2129279614;
                            continue block54;
                        }
                        case 872335725: {
                            var2_5 = class_3675.method_15987((class_1041)var1_1.method_22683(), (int)this.getKeyBind());
                            ** GOTO lbl147
                        }
lbl123:
                        // 2 sources

                        var5_4 = (var3_3 | var6_2) ^ -1969096982;
                        break;
                        case -1412322335: {
                            var5_4 = (var3_3 | var6_2) ^ 895597625;
                            break;
                        }
                    }
                    ** GOTO lbl141
                    case 1933062404: {
                        var5_4 = (var3_3 | var6_2) ^ 201066292;
                        continue block55;
                    }
                    case 1163862654: {
                        this.ak(var1_1);
                        ** GOTO lbl151
                    }
lbl135:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ 202446050;
                    ** GOTO lbl141
                    case -791247884: {
                        if (!this.a.is(z.r.a.o)) ** GOTO lbl162
                        ** break;
lbl140:
                        // 1 sources

                        var5_4 = (var3_3 | var6_2) ^ -642178536;
                    }
lbl141:
                    // 7 sources

                    while (true) {
                        default: {
                            continue block55;
                        }
                        break;
                    }
                    {
                    }
lbl145:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ 537559196;
                    continue block55;
lbl147:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ -1851416053;
                    ** GOTO lbl167
lbl149:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ 863875301;
                    continue block55;
lbl151:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ 1561359523;
                    continue block55;
lbl153:
                    // 1 sources

                    var5_4 = (var3_3 | var6_2) ^ 745110553;
                    continue block55;
                    case 131240928: {
                        return;
                    }
                    case 277169378: {
                        return;
                    }
                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ 1318924244;
                        if (true) ** GOTO lbl167
                        break;
                    }
lbl162:
                    // 4 sources

                    while (true) {
                        var5_4 = (var3_3 | var6_2) ^ 2045454665;
                        ** continue;
                        break;
                    }
                    block59: while (true) {
                        var5_4 = (var3_3 | var6_2) ^ 1834792079;
lbl167:
                        // 6 sources

                        block60: while (true) {
                            switch (var5_4) {
                                case 594894416: {
                                    var4_6 ^= var5_4 ^ -1181024340;
                                    var5_4 = (var3_3 | var6_2) ^ -1040044040;
                                    continue block60;
                                }
                                case -1614847735: {
                                    this.toggle();
                                    ** continue;
                                }
                                case -998058414: {
                                    if (!var2_5) ** continue;
                                    ** continue;
                                }
                                case 383687555: {
                                    var4_6 ^= var5_4 ^ -2072777990;
                                    var5_4 = (var3_3 | var6_2) ^ 367212155;
                                    ** break;
                                }
                                case 1830444518: {
                                    var4_6 ^= var5_4 ^ -1343134851;
                                    ** continue;
                                }
                                case -379795050: {
                                    this.e = true;
                                    ** GOTO lbl162
                                }
                                case 172473812: {
                                    var4_6 ^= var5_4 ^ 1715501321;
                                    var5_4 = (var3_3 | var6_2) ^ 1660985060;
                                    ** break;
                                }
                                case -1306341319: {
                                    var4_6 ^= var5_4 ^ 546283840;
                                    continue block59;
                                }
                                case -1847375006: {
                                    if (this.e) ** break;
                                    ** continue;
                                    var5_4 = (var3_3 | var6_2) ^ -151502279;
                                }
lbl200:
                                // 4 sources

                                default: {
                                    continue block60;
                                }
                                case 1052626965: 
                            }
                            break;
                        }
                        break;
                    }
                    return;
                    case -1941800324: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public void tickCamera(class_310 var1_1) {
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
    public void onCameraFrame(class_310 var1_1) {
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
    private void al(class_310 var1_1) {
        var5_2 = 1404720474;
        var2_3 = z.r.a.a & 1404720474 ^ -1735600521;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ 520845063;
        var4_4 = (var2_3 | var5_2) ^ 913232912;
        ** GOTO lbl15
lbl7:
        // 1 sources

        while (true) {
            var4_4 = (var2_3 | var5_2) ^ 1939110336;
            if (true) ** GOTO lbl15
            break;
        }
        block24: while (true) {
            var4_4 = (var2_3 | var5_2) ^ -167409024;
            if (true) ** GOTO lbl15
            block25: while (true) {
                var4_4 = (var2_3 | var5_2) ^ 983787576;
lbl15:
                // 4 sources

                block26: while (true) {
                    block28: {
                        switch (var4_4) {
                            case 1541329868: {
                                var3_5 ^= var4_4 ^ 821531295;
                                var4_4 = (var2_3 | var5_2) ^ -1552363811;
                                continue block26;
                            }
                            case 1069358708: {
                                var3_5 ^= var4_4 ^ -507985552;
                                ** GOTO lbl66
                            }
                            case 1975448293: {
                                var3_5 ^= var4_4 ^ 1647375211;
                                ** break;
                            }
                            case 1736849816: {
                                var3_5 ^= var4_4 ^ -211677796;
                                var4_4 = (var2_3 | var5_2) ^ -308608246;
                                continue block26;
                            }
                            case 2026248610: {
                                if (!this.a) {
                                    var4_4 = (var2_3 | var5_2) ^ -1375722086;
                                    continue block26;
                                }
                                ** GOTO lbl58
                            }
                            case 1083749968: {
                                var3_5 ^= var4_4 ^ -1692761445;
                                var4_4 = (var2_3 | var5_2) ^ -1492791197;
                                continue block26;
                            }
                            case 767254015: {
                                var3_5 ^= var4_4 ^ -205618437;
                                continue block25;
                            }
                            case -731602971: {
                                this.c = 0.0f;
                                ** GOTO lbl82
                            }
                            case 1514714180: {
                                var3_5 ^= var4_4 ^ 2028792901;
                                ** continue;
                            }
lbl49:
                            // 1 sources

                            var4_4 = (var2_3 | var5_2) ^ -986715155;
                            break;
                            case 152456600: {
                                var3_5 ^= var4_4 ^ 304502156;
                                var4_4 = (var2_3 | var5_2) ^ -701226162;
                                break;
                            }
                            case -892672997: {
                                var3_5 ^= var4_4 ^ 1035441139;
                                ** GOTO lbl94
                            }
lbl58:
                            // 1 sources

                            var4_4 = (var2_3 | var5_2) ^ -760702233;
                            break;
                            case -1400572960: {
                                this.b = 0.0f;
                                ** break;
                            }
                            case -305134737: {
                                var4_4 = (var2_3 | var5_2) ^ -2141190989;
                                continue block26;
                            }
lbl66:
                            // 1 sources

                            var4_4 = (var2_3 | var5_2) ^ -1891704918;
                            break;
                            case 908448885: {
                                this.am(var1_1);
                                var4_4 = (var2_3 | var5_2) ^ -1691983569;
                                break;
                            }
                            case 2092631836: {
                                if (this.a == null) ** GOTO lbl96
                                ** GOTO lbl84
                            }
lbl75:
                            // 1 sources

                            var4_4 = (var2_3 | var5_2) ^ -1137119513;
                            continue block26;
                            case -813803681: {
                                var3_5 ^= var4_4 ^ -1359864082;
                                break block28;
                            }
                            case -1473597761: {
                                return;
                            }
lbl82:
                            // 1 sources

                            var4_4 = (var2_3 | var5_2) ^ 292828004;
                            continue block26;
lbl84:
                            // 1 sources

                            var4_4 = (var2_3 | var5_2) ^ -469513973;
                            continue block26;
                            case 1417677013: {
                                var1_1.field_1690.method_31043(this.a);
                                continue block24;
                            }
                            case -518144185: {
                                this.a = null;
                                ** GOTO lbl96
                            }
                            case 512834706: {
                                return;
                            }
lbl94:
                            // 1 sources

                            var4_4 = (var2_3 | var5_2) ^ 2000299167;
                            continue block26;
lbl96:
                            // 2 sources

                            var4_4 = (var2_3 | var5_2) ^ -2114559173;
                            continue block26;
                            case 227210289: {
                                this.a = false;
                                var4_4 = (var2_3 | var5_2) ^ 348160032;
                            }
                        }
                        continue;
                    }
                    var4_4 = (var2_3 | var5_2) ^ 265963674;
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    private void am(class_310 var1_1) {
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
    public boolean isCameraEngaged() {
        block47: {
            block42: {
                block41: {
                    block46: {
                        block45: {
                            block44: {
                                block43: {
                                    block48: {
                                        break block48;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            var4_3 = (var2_2 | var5_1) ^ 928120572;
                                            break block41;
                                            break;
                                        }
lbl4:
                                        // 1 sources

                                        while (true) {
                                            var3_4 ^= var4_3 ^ -195259467;
                                            break block42;
                                            break;
                                        }
lbl7:
                                        // 1 sources

                                        while (true) {
                                            var4_3 = (var2_2 | var5_1) ^ -937879166;
                                            break block41;
                                            break;
                                        }
lbl10:
                                        // 1 sources

                                        while (true) {
                                            var3_4 ^= var4_3 ^ 1919385623;
                                            break block43;
                                            break;
                                        }
lbl13:
                                        // 1 sources

                                        return false;
lbl15:
                                        // 1 sources

                                        while (true) {
                                            var4_3 = (var2_2 | var5_1) ^ 361419490;
                                            break block41;
                                            break;
                                        }
                                    }
                                    var5_1 = -1342302022;
                                    var2_2 = z.r.a.a & -1342302022 ^ 751193029;
                                    var4_3 = 0;
                                    var3_4 = (var2_2 | var5_1) ^ 1555467032;
                                    ** GOTO lbl81
lbl24:
                                    // 1 sources

                                    while (true) {
                                        v0 = false;
                                        ** GOTO lbl88
                                        break;
                                    }
lbl27:
                                    // 1 sources

                                    return v0;
lbl29:
                                    // 1 sources

                                    while (true) {
                                        if (var1_5.field_1724 == null) break block44;
                                        break block45;
                                        break;
                                    }
lbl32:
                                    // 1 sources

                                    while (true) {
                                        var4_3 = (var2_2 | var5_1) ^ 2134825571;
                                        break block46;
                                        break;
                                    }
                                }
                                var4_3 = (var2_2 | var5_1) ^ 1271493520;
                                break block46;
                            }
lbl39:
                            // 2 sources

                            while (true) {
                                var4_3 = (var2_2 | var5_1) ^ -117061183;
                                break block46;
lbl42:
                                // 1 sources

                                while (true) {
                                    var3_4 ^= var4_3 ^ -1157151357;
                                    ** GOTO lbl86
                                    break;
                                }
                                break;
                            }
                        }
                        var4_3 = (var2_2 | var5_1) ^ 699665971;
                        break block46;
lbl48:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl50:
                        // 1 sources

                        while (true) {
                            var4_3 = (var2_2 | var5_1) ^ -1295850532;
                            break block41;
                            break;
                        }
                    }
lbl54:
                    // 4 sources

                    block33: while (true) {
                        switch (var4_3) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block33;
                                }
                                break;
                            }
                            case -792690276: {
                                ** continue;
                            }
                            case 1459327550: {
                                ** continue;
                            }
                            case -466147217: {
                                ** continue;
                            }
                            case 983307229: {
                                ** continue;
                            }
                            case -2041948724: {
                                break block33;
                            }
                            case -854807466: {
                                ** continue;
                            }
lbl71:
                            // 1 sources

                            while (true) {
                                var3_4 ^= var4_3 ^ -1012085173;
                                break block47;
                                break;
                            }
                            case -1027055889: {
                                v0 = true;
                                ** GOTO lbl88
                            }
lbl77:
                            // 1 sources

                            while (true) {
                                if (!this.a) {
                                    ** continue;
                                }
                                ** GOTO lbl90
                                break;
                            }
lbl81:
                            // 1 sources

                            var4_3 = (var2_2 | var5_1) ^ -789953103;
                            break block41;
lbl83:
                            // 1 sources

                            while (true) {
                                var3_4 ^= var4_3 ^ 1376286583;
                                ** continue;
                                break;
                            }
lbl86:
                            // 1 sources

                            var4_3 = (var2_2 | var5_1) ^ -1788721118;
                            ** continue;
lbl88:
                            // 2 sources

                            var3_4 ^= -507775739;
                            ** continue;
lbl90:
                            // 1 sources

                            var4_3 = (var2_2 | var5_1) ^ -1889604485;
                            break block41;
                        }
                        break;
                    }
                    var4_3 = (var2_2 | var5_1) ^ 696999053;
                    ** GOTO lbl54
                    var1_5 = class_310.method_1551();
                    var4_3 = (var2_2 | var5_1) ^ 1660090281;
                    ** GOTO lbl54
lbl97:
                    // 1 sources

                    while (true) {
                        var3_4 ^= var4_3 ^ -94129627;
                        ** continue;
                        break;
                    }
                }
lbl101:
                // 2 sources

                block39: while (true) {
                    switch (var4_3) {
                        default: {
                            continue block39;
                        }
                        case 2132024910: {
                            ** continue;
                        }
                        case 490518563: {
                            ** continue;
                        }
                        case 1743209085: {
                            ** continue;
                        }
                        case -1733319421: {
                            ** continue;
                        }
                        case 1235857420: {
                            ** continue;
                        }
                        case 547403652: {
                            ** continue;
                        }
                        ** case -1166767843:
lbl118:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
            var4_3 = (var2_2 | var5_1) ^ 1832256784;
            ** while (true)
        }
        var4_3 = (var2_2 | var5_1) ^ -430445581;
        ** while (true)
        {
            ** case -2039150734:
        }
lbl126:
        // 1 sources

        ** while (var1_5.method_1560() != var1_5.field_1724)
lbl127:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public float cameraYaw(class_1297 var1_1, float var2_2) {
        block21: {
            block19: {
                block20: {
                    block22: {
                        break block22;
                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ 1143224920;
                            break block19;
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var4_6 ^= var5_5 ^ 1128085296;
                            break block20;
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var4_6 ^= var5_5 ^ -1154198621;
                            break block21;
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            if (!(this.b >= 1.0f)) ** continue;
                            ** GOTO lbl49
                            break;
                        }
lbl13:
                        // 1 sources

                        return class_3532.method_17821((float)this.b, (float)var1_1.method_5705(var2_2), (float)this.d);
lbl15:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ -1304146339;
                            break block19;
                            break;
                        }
lbl18:
                        // 1 sources

                        return this.d;
                    }
                    var6_3 = 1238896576;
                    var3_4 = z.r.a.a & 1238896576 ^ -481363831;
                    var5_5 = 0;
                    var4_6 = (var3_4 | var6_3) ^ 1511373973;
                    ** while (true)
                }
                var5_5 = (var3_4 | var6_3) ^ -1902553303;
            }
lbl29:
            // 3 sources

            block16: while (true) {
                switch (var5_5) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block16;
                        }
                        break;
                    }
                    case -2050819622: {
                        ** continue;
                    }
                    case -634010448: {
                        ** continue;
                    }
                    case -886438025: {
                        ** continue;
                    }
                    case 993344804: {
                        ** continue;
                    }
                    case 1503310228: {
                        break block16;
                    }
                    case 1699195104: {
                        ** continue;
                    }
lbl46:
                    // 1 sources

                    while (true) {
                        var5_5 = (var3_4 | var6_3) ^ -789855507;
                        ** GOTO lbl-1000
                        break;
                    }
lbl49:
                    // 1 sources

                    var5_5 = (var3_4 | var6_3) ^ 1847330323;
                    ** continue;
                }
                break;
            }
            var5_5 = (var3_4 | var6_3) ^ 837499769;
            ** GOTO lbl29
        }
        var5_5 = (var3_4 | var6_3) ^ 552925374;
        ** while (true)
        {
            ** case -1342519919:
        }
lbl57:
        // 1 sources

        var4_6 ^= var5_5 ^ 786936973;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public float cameraPitch(class_1297 var1_1, float var2_2) {
        block19: {
            block17: {
                block16: {
                    var6_3 = -1235989498;
                    var3_4 = z.r.a.a & -1235989498 ^ 1959150201;
                    var5_5 = 0;
                    if (true) ** GOTO lbl19
                    block9: while (true) {
                        block18: {
                            var5_5 = (var3_4 | var6_3) ^ 1425093847;
                            break block18;
lbl8:
                            // 1 sources

                            while (true) {
                                var4_6 ^= var5_5 ^ -1067751032;
                                break block16;
                                break;
                            }
                        }
lbl12:
                        // 5 sources

                        block11: while (true) {
                            switch (var5_5) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    default: {
                                        continue block11;
                                    }
                                    break;
                                }
                                case -1990839448: {
                                    ** continue;
                                }
lbl19:
                                // 1 sources

                                var4_6 = (var3_4 | var6_3) ^ -1883717278;
                                break block17;
                                case -76412879: {
                                    var4_6 ^= var5_5 ^ -1358277365;
                                    continue block9;
                                }
lbl24:
                                // 1 sources

                                while (true) {
                                    var5_5 = (var3_4 | var6_3) ^ 2139127063;
                                    ** GOTO lbl-1000
                                    break;
                                }
lbl27:
                                // 1 sources

                                while (true) {
                                    var5_5 = (var3_4 | var6_3) ^ 1169996642;
                                    ** continue;
                                    break;
                                }
                                case -1521966913: {
                                    break block9;
                                }
                                case -1602811762: {
                                    var4_6 ^= var5_5 ^ 1172705283;
                                    ** continue;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    var5_5 = (var3_4 | var6_3) ^ 228869710;
                    ** GOTO lbl12
                }
                var5_5 = (var3_4 | var6_3) ^ 1014693835;
                ** GOTO lbl12
                {
                    case -894651980: {
                        return this.e;
                    }
                    case -1574471000: {
                        if (this.b >= 1.0f) {
                            ** continue;
                        }
                        break block19;
                    }
                    ** case -1284836067:
                }
lbl47:
                // 1 sources

                return class_3532.method_16439((float)this.b, (float)var1_1.method_5695(var2_2), (float)this.e);
            }
            var5_5 = (var3_4 | var6_3) ^ 1402924736;
            ** GOTO lbl12
        }
        var5_5 = (var3_4 | var6_3) ^ 1453410033;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public float cameraDistance() {
        int n2 = a & 0xC4B33858 ^ 0x7CBF5C62;
        int n3 = 0;
        int n4 = (n2 | 0xC4B33858) ^ 0xB805357E;
        n3 = (n2 | 0xC4B33858) ^ 0xCA598CAF;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -376525893: {
                    n4 ^= n3 ^ 0x5DF68E79;
                    n3 = (n2 | 0xC4B33858) ^ 0xCB024315;
                    continue block5;
                }
                case 935149423: {
                    return this.b * this.a;
                }
                case 921104597: 
            }
            n3 = (n2 | 0xC4B33858) ^ 0x1531D7C1;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public float blendProgress() {
        int n2 = a & 0x1E3DD42D ^ 0xD120021B;
        int n3 = 0;
        int n4 = (n2 | 0x1E3DD42D) ^ 0xD4D9A6F1;
        n3 = (n2 | 0x1E3DD42D) ^ 0xC37313EC;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 462534868: {
                    return this.b;
                }
                case 474924499: {
                    n3 = (n2 | 0x1E3DD42D) ^ 0x1D24722;
                    continue block5;
                }
                case -554725091: 
            }
            n4 ^= n3 ^ 0x9C915FA0;
            n3 = (n2 | 0x1E3DD42D) ^ 0xC4AC6EEB;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean isThroughWalls() {
        int n2 = a & 0xF445CF13 ^ 0xD5160074;
        int n3 = 0;
        int n4 = (n2 | 0xF445CF13) ^ 0x4DB713A7;
        n3 = (n2 | 0xF445CF13) ^ 0x9D99BD16;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1022910467: {
                    n4 ^= n3 ^ 0xA0CA6268;
                    n3 = (n2 | 0xF445CF13) ^ 0x4096A490;
                    continue block5;
                }
                case 1758360161: {
                    n3 = (n2 | 0xF445CF13) ^ 0xC9AFAF74;
                    continue block5;
                }
                case -1245615129: 
            }
            break;
        }
        return (Boolean)this.b.getValue();
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean shouldCaptureMouse() {
        block25: {
            block27: {
                block26: {
                    break block26;
lbl1:
                    // 5 sources

                    block13: while (true) {
                        switch (var3_3) lbl-1000:
                        // 7 sources

                        {
                            default: {
                                continue block13;
                            }
lbl5:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -460759831;
                                ** GOTO lbl-1000
                                break;
                            }
                            case 1193430198: {
                                v0 = true;
                                break block25;
                            }
lbl11:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 871460821;
                                ** GOTO lbl-1000
                                break;
                            }
                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1759899718;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -1616977033: {
                                v0 = false;
                                break block25;
                            }
                            case 1971941831: {
                                break block13;
                            }
lbl22:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -55745975;
                                ** GOTO lbl-1000
                                break;
                            }
lbl25:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 605146504;
                                ** GOTO lbl-1000
                                break;
                            }
                            case 115113499: {
                                var2_4 ^= var3_3 ^ -448047297;
                                break;
                            }
                        }
                        break;
                    }
                    var3_3 = (var1_2 | var4_1) ^ -1118613276;
                    ** GOTO lbl1
                    {
                        case 159324459: {
                            var2_4 ^= var3_3 ^ -1179449920;
                            ** continue;
                        }
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1292879916;
                        ** GOTO lbl1
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1960680271;
                        ** GOTO lbl1
                        break;
                    }
                    {
                        case 747970885: {
                            ** continue;
                        }
                        case 1594257942: {
                            if (this.a) {
                                ** continue;
                            }
                            ** GOTO lbl70
                        }
                    }
                }
                var4_1 = -2147013452;
                var1_2 = z.r.a.a & -2147013452 ^ 998967899;
                var3_3 = 0;
                break block27;
                {
                    case -816663120: {
                        ** continue;
                    }
                }
            }
            var2_4 = (var1_2 | var4_1) ^ 922927551;
            var3_3 = (var1_2 | var4_1) ^ -838443208;
            ** GOTO lbl1
        }
        var2_4 ^= -682031631;
        return v0;
        {
            case 1929359538: {
                if (this.isEnabled()) {
                    ** continue;
                }
                ** GOTO lbl70
            }
        }
        var3_3 = (var1_2 | var4_1) ^ -915366323;
        ** while (true)
        {
            case -2004991702: {
                if (this.b) ** continue;
lbl70:
                // 3 sources

                var3_3 = (var1_2 | var4_1) ^ -1362745727;
                ** GOTO lbl-1000
            }
            ** case 357107838:
        }
lbl73:
        // 1 sources

        var2_4 ^= var3_3 ^ -1518005099;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public void rotateCamera(float f2, float f3) {
        int n2 = 532606599;
        int n3 = a & 0x1FBEEE87 ^ 0xB9E39C6F;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xE30454CD;
        n4 = (n3 | n2) ^ 0xE10C1F6F;
        block9: while (true) {
            switch (n4) {
                default: {
                    continue block9;
                }
                case -169598897: {
                    n5 ^= n4 ^ 0x6E8DC686;
                    n4 = (n3 | n2) ^ 0x4EFEB6C3;
                    continue block9;
                }
                case -227854023: {
                    this.e = class_3532.method_15363((float)(this.e + f3), (float)-90.0f, (float)90.0f);
                    n4 = (n3 | n2) ^ 0x4A1BDEA0;
                    continue block9;
                }
                case 2099278388: {
                    n5 ^= n4 ^ 0xEE8B4EA3;
                    n4 = (n3 | n2) ^ 0x47B2005B;
                    continue block9;
                }
                case 1593041280: {
                    n4 = (n3 | n2) ^ 0xC2DF8CDB;
                    continue block9;
                }
                case -129106252: {
                    this.d += f2;
                    n4 = (n3 | n2) ^ 0x65A7A7CD;
                    continue block9;
                }
                case -251574228: {
                    return;
                }
                case -631744222: 
            }
            n5 ^= n4 ^ 0xE86F4AC6;
            n4 = (n3 | n2) ^ 0x4D94C7D6;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public float getLookSensitivity() {
        int n2 = a & 0x8681513C ^ 0xFACA9937;
        int n3 = 0;
        int n4 = (n2 | 0x8681513C) ^ 0x66462A4C;
        n3 = (n2 | 0x8681513C) ^ 0x2B6C2C25;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 665825852: {
                    n4 ^= n3 ^ 0x6502E678;
                    n3 = (n2 | 0x8681513C) ^ 0xD85DEA7C;
                    continue block5;
                }
                case 647377731: {
                    return ((Float)this.b.getValue()).floatValue();
                }
                case -710413030: 
            }
            n3 = (n2 | 0x8681513C) ^ 0xD9646B03;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean onMouseScroll(double var1_1) {
        var9_2 = 1212279000;
        var6_3 = z.r.a.a & 1212279000 ^ -301617206;
        var8_4 = 0;
        var7_7 = (var6_3 | var9_2) ^ -71177255;
        var8_4 = (var6_3 | var9_2) ^ 214395019;
        ** GOTO lbl85
lbl7:
        // 1 sources

        while (true) {
            var8_4 = (var6_3 | var9_2) ^ -1974237211;
            if (true) ** GOTO lbl85
            break;
        }
        block32: while (true) {
            var8_4 = (var6_3 | var9_2) ^ 182137024;
            ** GOTO lbl85
lbl13:
            // 1 sources

            block33: while (true) {
                block43: {
                    block44: {
                        block42: {
                            switch (var8_4) {
                                case -1044285337: {
                                    if (var5_8.field_1724 == null) break;
                                    break block42;
                                }
                                case 791920402: {
                                    var7_7 ^= var8_4 ^ 1007920404;
                                    break block43;
                                }
                                case 275743333: {
                                    break block44;
                                }
                                case -683861802: {
                                    var7_7 ^= var8_4 ^ -297341179;
                                    var8_4 = (var6_3 | var9_2) ^ 797218749;
                                }
                                default: {
                                    continue block33;
                                }
                                case -535668000: {
                                    return true;
                                }
                                case -1566801939: {
                                    var5_8.field_1724.method_7353((class_2561)class_2561.method_43470((String)("Free Look distance " + this.c.getDisplayValue())), true);
                                    break;
                                }
                            }
                            var8_4 = (var6_3 | var9_2) ^ -1049210680;
                            continue;
                        }
                        var8_4 = (var6_3 | var9_2) ^ -30773825;
                        continue;
                    }
                    var8_4 = (var6_3 | var9_2) ^ 1289326647;
                    continue;
                }
                var8_4 = (var6_3 | var9_2) ^ 240629050;
                continue;
                break;
            }
lbl-1000:
            // 4 sources

            {
                switch (var8_4) {
                    case 595297542: {
                        if (Math.abs(var4_6 - var3_5) < this.c.getStep()) {
                            var8_4 = (var6_3 | var9_2) ^ -893528427;
                            continue block34;
                        }
                        ** GOTO lbl69
                    }
                    case -311053105: {
                        var5_8 = class_310.method_1551();
                        ** GOTO lbl73
                    }
                    case -1019415363: {
                        var7_7 ^= var8_4 ^ 1812862042;
                        var8_4 = (var6_3 | var9_2) ^ -851547428;
                        break;
                    }
                    case -2078024495: {
                        var7_7 ^= var8_4 ^ -1042343369;
                        var8_4 = (var6_3 | var9_2) ^ 53500693;
                        break;
                    }
                    case -2004034537: {
                        var7_7 ^= var8_4 ^ 1232395769;
                        var8_4 = (var6_3 | var9_2) ^ -1289985090;
                        break;
                    }
                    case 620247375: {
                        ** break;
                    }
                    case 170337786: {
                        var4_6 = var3_5 - (float)Math.signum(var1_1) * this.c.getStep();
lbl69:
                        // 2 sources

                        var8_4 = (var6_3 | var9_2) ^ 1724462029;
                        break;
                    }
lbl71:
                    // 1 sources

                    var8_4 = (var6_3 | var9_2) ^ -463287776;
                    continue block34;
lbl73:
                    // 1 sources

                    var8_4 = (var6_3 | var9_2) ^ 964228876;
                    ** continue;
                    case 1566149732: {
                        this.c.setValue(Float.valueOf(var4_6));
                        var8_4 = (var6_3 | var9_2) ^ 1785082635;
                        continue block34;
                    }
                }
lbl79:
                // 6 sources

                ** while (true)
            }
lbl80:
            // 1 sources

            while (true) {
                var8_4 = (var6_3 | var9_2) ^ -2088777387;
                if (true) ** GOTO lbl85
                break;
            }
            block37: while (true) {
                var8_4 = (var6_3 | var9_2) ^ -514031741;
lbl85:
                // 5 sources

                block38: while (true) {
                    block46: {
                        block45: {
                            switch (var8_4) {
                                case -1394293173: {
                                    var7_7 ^= var8_4 ^ 964353732;
                                    ** continue;
                                }
                                case -459350246: {
                                    ** break;
                                }
                                case -1168906555: {
                                    if (var1_1 != 0.0) continue block37;
                                    break block45;
                                }
                                case 253333593: {
                                    var7_7 ^= var8_4 ^ 1457891929;
                                    ** break;
                                }
                                case -494762159: {
                                    break block46;
                                }
                                case 1135699735: {
                                    var7_7 ^= var8_4 ^ 520302071;
                                    ** continue;
                                }
                                case -2091446398: {
                                    var3_5 = ((Float)this.c.getValue()).floatValue();
                                    var7_7 ^= -1888974893;
                                    var4_6 = var3_5 * (float)Math.pow(1.12, -var1_1);
                                    ** GOTO lbl114
                                }
lbl108:
                                // 1 sources

                                var8_4 = (var6_3 | var9_2) ^ 1829953624;
                                continue block38;
                                case 1832527503: {
                                    return false;
                                }
lbl112:
                                // 1 sources

                                var8_4 = (var6_3 | var9_2) ^ 1410730271;
                                continue block38;
lbl114:
                                // 1 sources

                                var8_4 = (var6_3 | var9_2) ^ 762911591;
                                ** GOTO lbl79
                                case 857057512: {
                                    if (((Boolean)this.c.getValue()).booleanValue()) {
                                        continue block32;
                                    }
                                    break block45;
                                }
                                case -904938154: {
                                    var8_4 = (var6_3 | var9_2) ^ -581941454;
                                }
                                default: {
                                    continue block38;
                                }
                                case 1679190079: 
                            }
                            if (this.shouldCaptureMouse()) {
                                var8_4 = (var6_3 | var9_2) ^ 608850572;
                                continue;
                            }
                        }
                        var8_4 = (var6_3 | var9_2) ^ 1117858193;
                        continue;
                    }
                    var8_4 = (var6_3 | var9_2) ^ -1376483123;
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
    static {
        block7: {
            break block7;
lbl1:
            // 1 sources

            while (true) {
                var0_2 ^= 140724631;
                var0_2 ^= 1906323894;
                var0_2 ^= -54262777;
                var0_2 ^= -1138097762;
                var0_2 ^= -192073017;
                var0_2 ^= -1440279955;
                v0 = ((var0_2 ^= -1325313755) | var2) ^ 214921063 ^ z.r.a.a;
                var0_2 ^= -134110290;
                z.r.a.a[v1] = ((v2[v3] & 255) << 24 | ((v2[v3 + 1] & 255) << 16 | ((v2[v3 + 2] & 255) << 8 | v2[v3 + 3] & 255))) ^ v0;
                v1 = v1 + 1;
                v4 = v3 + 4;
                v2 = v2;
                v3 = v4;
                var0_2 ^= 780644249;
                if (v4 < v2.length) continue;
                z.r.a.f = 14.0f;
                z.r.a.k = gj.decode("TMQOM0HhLV4=", z.r.a.aj(((var0_2 ^= 1250024047) | var2) ^ -266737799, var2 ^ ((var0_2 | var2) ^ 769001830)));
                z.r.a.s = gj.decode("pLHzFdVLqHsdRvLFvV091Vtg19sJZa0YcHPKYdrWHEtpHOIspk5jl9NgBIMjw/4IyA==", z.r.a.aj((var0_2 | var2) ^ -266737800, var2 ^ ((var0_2 | var2) ^ -1353183311)));
                z.r.a.i = gj.decode("E/LrI2ZWc0oTGA==", z.r.a.aj((var0_2 | var2) ^ -266737797, var2 ^ ((var0_2 | var2) ^ 1258787482)));
                z.r.a.o = gj.decode("g1HNMA==", z.r.a.aj((var0_2 | var2) ^ -266737798, var2 ^ ((var0_2 | var2) ^ -2005521998)));
                z.r.a.f = gj.decode("AE2ii/oE", z.r.a.aj((var0_2 | var2) ^ -266737795, var2 ^ ((var0_2 | var2) ^ 97917861)));
                z.r.a.h = gj.decode("bYieyQ9nBccM9Nqgo460a34=", z.r.a.aj((var0_2 | var2) ^ -266737796, var2 ^ ((var0_2 | var2) ^ -1186207387)));
                z.r.a.g = gj.decode("0Licc2LFiNfaicL44nWP", z.r.a.aj((var0_2 | var2) ^ -266737793, var2 ^ ((var0_2 | var2) ^ -1180552307)));
                z.r.a.a = gj.decode("yHHbTYo=", z.r.a.aj((var0_2 | var2) ^ -266737794, var2 ^ ((var0_2 | var2) ^ -1081425464)));
                z.r.a.m = gj.decode("Ulg9xpk7f4LCIntHCMCrPjzuUV1ep11ofMKcR+0iXibESxLToRtR4h6r1ONS", z.r.a.aj((var0_2 | var2) ^ -266737807, var2 ^ ((var0_2 | var2) ^ 1530547792)));
                z.r.a.q = gj.decode("vQyxLALxooU=", z.r.a.aj((var0_2 | var2) ^ -266737808, var2 ^ ((var0_2 | var2) ^ 1583946039)));
                z.r.a.j = gj.decode("XR+BxQ==", z.r.a.aj((var0_2 | var2) ^ -266737805, var2 ^ ((var0_2 | var2) ^ -1364259862)));
                z.r.a.e = gj.decode("7M36BydPo5KyK2QKatKvDyjT321/l4YV2Q3iHJ5117j9islngyl6c042", z.r.a.aj((var0_2 | var2) ^ -266737806, var2 ^ ((var0_2 | var2) ^ 1613993602)));
                z.r.a.p = gj.decode("PQuthsAKvyICGPHkTmE=", z.r.a.aj((var0_2 | var2) ^ -266737803, var2 ^ ((var0_2 | var2) ^ -37101996)));
                z.r.a.c = gj.decode("fzd94cpaEL+0Z5JRZg==", z.r.a.aj((var0_2 | var2) ^ -266737804, var2 ^ ((var0_2 | var2) ^ -1724435518)));
                z.r.a.l = gj.decode("oUcw2cqsFc6jLeqwpOOw7A==", z.r.a.aj((var0_2 | var2) ^ -266737801, var2 ^ ((var0_2 | var2) ^ 1988646788)));
                z.r.a.n = gj.decode("TuuGDw==", z.r.a.aj((var0_2 | var2) ^ -266737802, var2 ^ ((var0_2 | var2) ^ 1723883775)));
                z.r.a.d = gj.decode("A2530IPrCEvXJ00a6PMpKKoI8ehAjHCfDbQu7Ai3BQ6Xc6pTCGTkUg8=", z.r.a.aj((var0_2 | var2) ^ -266737815, var2 ^ ((var0_2 | var2) ^ 2019822000)));
                z.r.a.b = gj.decode("BEYpWZ2Wsytt0JJHkTd5tETSBtYPdmadBMv1C9O2DDcgW0jBMA==", z.r.a.aj((var0_2 | var2) ^ -266737816, var2 ^ ((var0_2 | var2) ^ -629583745)));
                return;
            }
        }
        var2 = 485415594;
        z.r.a.a = mK.a(MethodHandles.lookup().lookupClass(), -1287761848);
        var1_1 = 0;
        var0_2 = 2129017192;
        var1_1 = var2 ^ -303688759;
        block6: while (true) {
            switch (var1_1) {
                default: {
                    continue block6;
                }
                case 1676685960: {
                    v1 = 0;
                    z.r.a.a = new int[((var0_2 ^= -1883212292) | var2) ^ 486530985];
                    var0_2 ^= 586446131;
                    v3 = 0;
                    v2 = "k8\u000e\u0084-\u00ef\u0002J\u007fS\u00d1\u00f5\u000e2r\u008e\u00bbf\u008d>\u00bb\u00c3\fg\u00e17\u0085j\u009bG\u0087\u00ef8\u009b3\u0002\u0080\u0097L\u00f5[*\u0084\u0005\u00d8)\u0000\u00ab\u00ca9!\n-K\u0011Y\u00d2\u00f9\u00ad\u0087\u00ba{\u0001\u0081y\u00e1\u000e\u00b4\u00bd59\u0010".getBytes("ISO-8859-1");
                    ** continue;
                }
                case -251082397: {
                    var1_1 = var2 ^ 91479942;
                    continue block6;
                }
                case 429720876: 
            }
            var0_2 ^= var1_1 ^ -469367127;
            var1_1 = var2 ^ 2132731938;
        }
    }

    /*
     * Exception decompiling
     */
    public static a get() {
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

