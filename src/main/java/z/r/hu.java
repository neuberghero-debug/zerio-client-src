/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_238
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_3965
 *  net.minecraft.class_742
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_742;
import z.r.aE;
import z.r.bM;
import z.r.cO;
import z.r.eA;
import z.r.gP;
import z.r.gj;
import z.r.ix;
import z.r.jy;
import z.r.ke;
import z.r.ko;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class hu
extends bM
implements jy {
    private static final float a;
    private static final double a;
    public static final int e;
    private static final /* synthetic */ String a;
    private static final float b;
    private static final /* synthetic */ String b;
    private int a;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private final gP a;
    private final gP b;
    private final ke a;
    private final aE a;
    private final ke b;
    private static final int b;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private class_1657 a;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String s;
    private static final int c;
    private final gP c;
    private long a;
    private static hu a;
    private static final /* synthetic */ String l;
    private static final int[] a;
    private final ke c;
    private static final /* synthetic */ String m;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public hu() {
        var4_1 = -59949324;
        var1_2 = hu.e & -59949324 ^ 76468565;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 1806069209;
        var2_4 ^= -166144466;
        super(hu.k, hu.s);
        var3_3 = (var1_2 | var4_1) ^ -2137046453;
        if (true) ** GOTO lbl11
        block20: while (true) {
            var3_3 = (var1_2 | var4_1) ^ 513324268;
lbl11:
            // 2 sources

            block21: while (true) {
                switch (var3_3) {
                    case -1329128538: {
                        var2_4 ^= -1210641442;
                        this.a = this.addSetting(new gP(hu.m, 900.0f, 300.0f, 1800.0f, 25.0f, hu.j));
                        var3_3 = (var1_2 | var4_1) ^ -786465109;
                        continue block21;
                    }
                    case -495498471: {
                        var2_4 ^= var3_3 ^ -1461735069;
                        var3_3 = (var1_2 | var4_1) ^ 2133282814;
                        continue block21;
                    }
                    case 1354568550: {
                        this.c = this.addSetting(new ke(hu.a, true));
                        ** GOTO lbl74
                    }
                    case -1571181074: {
                        var2_4 ^= var3_3 ^ -540057046;
                        var3_3 = (var1_2 | var4_1) ^ 1723075709;
                        continue block21;
                    }
                    case 1527832820: {
                        var2_4 ^= var3_3 ^ -1371305529;
                        ** break;
                    }
                    case 1761648203: {
                        var2_4 ^= var3_3 ^ -1074905540;
                        var3_3 = (var1_2 | var4_1) ^ -1532554962;
                        continue block21;
                    }
                    case -1705249912: {
                        this.b = this.addSetting(new ke(hu.d, true));
                        var3_3 = (var1_2 | var4_1) ^ -1779473986;
                        continue block21;
                    }
                    case 770736478: {
                        var2_4 ^= var3_3 ^ 43435633;
                        var3_3 = (var1_2 | var4_1) ^ -1003806887;
                        continue block21;
                    }
                    case -780821751: {
                        var2_4 ^= var3_3 ^ -1679778116;
                        var3_3 = (var1_2 | var4_1) ^ 1277748307;
                        continue block21;
                    }
                    case 574039452: {
                        var2_4 ^= var3_3 ^ -1153576897;
                        var3_3 = (var1_2 | var4_1) ^ -573316618;
                        continue block21;
                    }
                    case 952426668: {
                        this.a = this.addSetting(new ke(hu.b, false));
                        var3_3 = (var1_2 | var4_1) ^ 41997922;
                        continue block21;
                    }
                    case 1481174747: {
                        hu.a = this;
                        var3_3 = (var1_2 | var4_1) ^ -556213655;
                        continue block21;
                    }
                    case -26269289: {
                        var2_4 ^= var3_3 ^ 1536282860;
                        var3_3 = (var1_2 | var4_1) ^ -1403851629;
                        continue block21;
                    }
                    case -2083999733: {
                        this.a = this.addSetting(new aE(hu.f, hu.e, new String[]{hu.e, hu.i, hu.h, hu.g}));
                        var3_3 = (var1_2 | var4_1) ^ 765093116;
                        continue block21;
                    }
                    case 2087763390: {
                        var2_4 ^= var3_3 ^ 223687396;
                        var3_3 = (var1_2 | var4_1) ^ -685806855;
                        continue block21;
                    }
lbl72:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -219456495;
                    ** GOTO lbl75
lbl74:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ 1589006875;
lbl75:
                    // 3 sources

                    default: {
                        continue block21;
                    }
                    case 235185124: {
                        this.b = this.addSetting(new gP(hu.c, 120.0f, 20.0f, 180.0f, 5.0f, hu.j));
                        continue block20;
                    }
                    case 737187084: {
                        this.c = this.addSetting(new gP(hu.l, 3.0f, 2.0f, 3.0f, 0.05f));
                        var3_3 = (var1_2 | var4_1) ^ -1476452607;
                        continue block21;
                    }
                    case 557587971: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public static class_1657 getCurrentTarget() {
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
    public boolean routeManualItemUse() {
        int n2 = e & 0x67D82E1E ^ 0xB7401D37;
        int n3 = 0;
        int n4 = (n2 | 0x67D82E1E) ^ 0xD72EC811;
        n3 = (n2 | 0x67D82E1E) ^ 0x2433B656;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -739538583: {
                    n3 = (n2 | 0x67D82E1E) ^ 0x1C6C8BD0;
                    continue block5;
                }
                case -1278995048: {
                    return true;
                }
                case -340478737: 
            }
            n4 ^= n3 ^ 0x76878AAE;
            n3 = (n2 | 0x67D82E1E) ^ 0x441C2AA7;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean guardManualInteractions() {
        block22: {
            block21: {
                block23: {
                    break block23;
lbl1:
                    // 2 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -526946008;
                        break block21;
                        break;
                    }
                }
                var4_1 = 1336572431;
                var1_2 = hu.e & 1336572431 ^ -2022525802;
                var3_3 = 0;
                var2_4 = (var1_2 | var4_1) ^ -955333918;
                var3_3 = (var1_2 | var4_1) ^ -1396991593;
            }
lbl11:
            // 4 sources

            block15: while (true) {
                switch (var3_3) lbl-1000:
                // 3 sources

                {
                    default: {
                        continue block15;
                    }
                    case 623119587: {
                        ** GOTO lbl1
                    }
                    case -1872499353: {
                        var2_4 ^= var3_3 ^ -1427768910;
                        break;
                    }
                    case 1665230600: {
                        break block22;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -845752245;
                        ** GOTO lbl-1000
                        break;
                    }
                }
lbl25:
                // 2 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1909918811;
                    continue block15;
                    break;
                }
                {
                    case 237254058: {
                        var2_4 ^= var3_3 ^ 289947407;
                        ** continue;
                    }
                    case 1104284986: {
                        ** continue;
                    }
                }
                break;
            }
lbl33:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 964975660;
                ** GOTO lbl11
                break;
            }
        }
        var3_3 = (var1_2 | var4_1) ^ -354487684;
        ** GOTO lbl11
lbl39:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1042363595;
            ** continue;
            break;
        }
        {
            case 795709367: {
                switch (var2_4) {
                    case -1092368028: {
                        ** continue;
                    }
                    case -1659873113: {
                        ** continue;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ 1603867640;
                ** GOTO lbl-1000
            }
            case -159472973: {
                var2_4 ^= var3_3 ^ 1573819130;
                ** continue;
            }
            ** case 40642260:
        }
lbl54:
        // 1 sources

        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean renderSilentBody() {
        int n2 = e & 0xA8AF0AA9 ^ 0xABC33730;
        int n3 = 0;
        int n4 = (n2 | 0xA8AF0AA9) ^ 0x1FD66E4A;
        n3 = (n2 | 0xA8AF0AA9) ^ 0xEEBE01A3;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -837887463: {
                    return true;
                }
                case 1162952218: {
                    break;
                }
                case 1177290756: {
                    n4 ^= n3 ^ 0x11907F11;
                    n3 = (n2 | 0xA8AF0AA9) ^ 0x65E1E5A0;
                    continue block5;
                }
            }
            n3 = (n2 | 0xA8AF0AA9) ^ 0xEDC337BD;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static boolean consumeManualWorldInteraction() {
        block47: {
            block48: {
                block46: {
                    block49: {
                        var4 = -1526252255;
                        var1_1 = hu.e & -1526252255 ^ -28245132;
                        var3_2 = 0;
                        break block49;
lbl5:
                        // 1 sources

                        while (true) {
                            if (ko.drivenBy(var0_3)) ** GOTO lbl33
                            ** GOTO lbl89
                            break;
                        }
lbl8:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | var4) ^ -1537130925;
                            break block46;
                            break;
                        }
lbl11:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | var4) ^ -2011357626;
                            break block46;
lbl14:
                            // 1 sources

                            while (true) {
                                var3_2 = (var1_1 | var4) ^ 1751959511;
                                break block46;
lbl17:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_2 ^ 876295631;
                                    ** GOTO lbl122
                                    break;
                                }
lbl20:
                                // 1 sources

                                return false;
                            }
lbl22:
                            // 1 sources

                            while (true) {
                                var3_2 = (var1_1 | var4) ^ -192173188;
                                break block46;
lbl25:
                                // 1 sources

                                return false;
lbl27:
                                // 1 sources

                                while (true) {
                                    var2_4 ^= var3_2 ^ -2053457962;
                                    ** continue;
                                    break;
                                }
lbl30:
                                // 1 sources

                                while (true) {
                                    var3_2 = (var1_1 | var4) ^ 340338826;
                                    break block46;
                                    break;
                                }
lbl33:
                                // 2 sources

                                while (true) {
                                    var3_2 = (var1_1 | var4) ^ -25903866;
                                    break block46;
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                    }
                    var2_4 = (var1_1 | var4) ^ 1035465145;
                    ** GOTO lbl94
lbl39:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | var4) ^ 1860514298;
                        break block46;
                        break;
                    }
lbl42:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_2 ^ 437650754;
                        break block47;
                        break;
                    }
lbl45:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_2 ^ -1108593742;
                        ** GOTO lbl76
                        break;
                    }
lbl48:
                    // 1 sources

                    while (true) {
                        var0_3.Oc();
                        ** GOTO lbl112
                        break;
                    }
                }
lbl52:
                // 4 sources

                block38: while (true) {
                    switch (var3_2) lbl-1000:
                    // 7 sources

                    {
                        while (true) {
                            default: {
                                continue block38;
                            }
                            break;
                        }
                        case -1067259601: {
                            ** continue;
                        }
                        case -586562390: {
                            ** continue;
                        }
                        case 199005193: {
                            ** continue;
                        }
                        case -930532849: {
                            ** continue;
                        }
                        case 2001346867: {
                            ** continue;
                        }
                        case 1081897674: {
                            ** continue;
                        }
                        case -299889599: {
                            ** continue;
                        }
                        case -350349313: {
                            ** continue;
                        }
lbl73:
                        // 2 sources

                        while (true) {
                            var3_2 = (var1_1 | var4) ^ 819922468;
                            ** GOTO lbl-1000
                            break;
                        }
lbl76:
                        // 1 sources

                        var3_2 = (var1_1 | var4) ^ 1329079256;
                        ** GOTO lbl106
                        case 1530265894: {
                            if (var0_3 == null) ** GOTO lbl73
                            break block38;
                        }
                        case -1252326809: {
                            return true;
                        }
lbl83:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | var4) ^ -1087681089;
                            ** GOTO lbl-1000
                            break;
                        }
lbl86:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | var4) ^ 1962211972;
                            ** GOTO lbl-1000
                            break;
                        }
lbl89:
                        // 1 sources

                        var3_2 = (var1_1 | var4) ^ 937299322;
                        ** GOTO lbl-1000
lbl91:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | var4) ^ 750082516;
                            ** GOTO lbl106
                            break;
                        }
lbl94:
                        // 1 sources

                        var3_2 = (var1_1 | var4) ^ 567870083;
                        ** GOTO lbl106
                        case 19104371: {
                            var2_4 ^= var3_2 ^ -824694324;
                            ** continue;
                        }
                        case -1952201231: {
                            if (!var0_3.isEnabled()) {
                                ** continue;
                            }
                            break block48;
                        }
                        case -1850601841: {
                            if (var0_3.a != null) ** continue;
                            ** continue;
                        }
lbl106:
                        // 3 sources

                        block44: while (true) {
                            switch (var3_2) {
                                default: {
                                    continue block44;
                                }
                                case -740137311: {
                                    ** continue;
                                }
lbl112:
                                // 1 sources

                                var3_2 = (var1_1 | var4) ^ 293024564;
                                ** GOTO lbl-1000
                                case -1334895443: {
                                    var0_3 = hu.a;
                                    ** continue;
                                }
                                case -561103370: {
                                    ** continue;
                                }
                            }
                            break;
                        }
                        case -1757677406: {
                            var2_4 ^= var3_2 ^ 2018359268;
                            ** continue;
                        }
lbl122:
                        // 1 sources

                        var3_2 = (var1_1 | var4) ^ 1060492890;
                        ** continue;
                    }
                    break;
                }
                var3_2 = (var1_1 | var4) ^ -2068713074;
                ** GOTO lbl52
            }
            var3_2 = (var1_1 | var4) ^ 576650207;
            ** GOTO lbl52
        }
        var3_2 = (var1_1 | var4) ^ 1242316050;
        ** while (true)
        {
            case 2078723835: {
                ** continue;
            }
            ** case -813156015:
        }
lbl135:
        // 1 sources

        var2_4 ^= var3_2 ^ -762458653;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static boolean blocksManualBlockBreaking() {
        block61: {
            block62: {
                block57: {
                    block55: {
                        block60: {
                            block56: {
                                block53: {
                                    block58: {
                                        block59: {
                                            block52: {
                                                block54: {
                                                    var4 = -1617533308;
                                                    var1_1 = hu.e & -1617533308 ^ -1909751473;
                                                    var3_2 = 0;
                                                    ** GOTO lbl36
lbl5:
                                                    // 1 sources

                                                    while (true) {
                                                        var3_2 = (var1_1 | var4) ^ -1037107807;
                                                        ** GOTO lbl38
                                                        break;
                                                    }
lbl8:
                                                    // 1 sources

                                                    while (true) {
                                                        var3_2 = (var1_1 | var4) ^ 745493578;
                                                        ** GOTO lbl38
lbl11:
                                                        // 1 sources

                                                        while (ko.drivenBy(var0_3)) {
                                                            break block52;
                                                        }
                                                        break block53;
                                                        break;
                                                    }
lbl14:
                                                    // 1 sources

                                                    while (true) {
                                                        var3_2 = (var1_1 | var4) ^ 1071727449;
                                                        if (true) ** GOTO lbl24
                                                        break;
                                                    }
lbl17:
                                                    // 1 sources

                                                    while (true) {
                                                        var2_4 ^= var3_2 ^ 1176124811;
                                                        break block54;
                                                        break;
                                                    }
lbl20:
                                                    // 1 sources

                                                    return true;
                                                    block35: while (true) {
                                                        var3_2 = (var1_1 | var4) ^ -580011367;
lbl24:
                                                        // 3 sources

                                                        block36: while (true) {
                                                            switch (var3_2) {
                                                                default: {
                                                                    continue block36;
                                                                }
                                                                case 1121082710: {
                                                                    break block55;
                                                                }
lbl30:
                                                                // 2 sources

                                                                while (true) {
                                                                    var3_2 = (var1_1 | var4) ^ -1100791229;
                                                                    ** GOTO lbl38
lbl33:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var3_2 = (var1_1 | var4) ^ 571425257;
                                                                        ** GOTO lbl38
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
lbl36:
                                                                // 1 sources

                                                                var2_4 = (var1_1 | var4) ^ 2039441189;
                                                                continue block35;
lbl38:
                                                                // 19 sources

                                                                block39: while (true) {
                                                                    switch (var3_2) lbl-1000:
                                                                    // 2 sources

                                                                    {
                                                                        while (true) {
                                                                            default: {
                                                                                continue block39;
                                                                            }
                                                                            break;
                                                                        }
                                                                        case -1112496602: {
                                                                            ** GOTO lbl11
                                                                        }
                                                                        case 1026280255: {
                                                                            ** continue;
                                                                        }
                                                                        case -1523602747: {
                                                                            ** continue;
                                                                        }
                                                                        case -534374252: {
                                                                            break;
                                                                        }
lbl51:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var3_2 = (var1_1 | var4) ^ 2140798811;
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                        case 2119308745: {
                                                                            if (var0_3.a.method_5805()) {
                                                                                break block56;
                                                                            }
                                                                            ** GOTO lbl72
                                                                        }
                                                                    }
                                                                    var3_2 = (var1_1 | var4) ^ -526681463;
                                                                    continue;
lbl60:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var3_2 = (var1_1 | var4) ^ -1002567152;
                                                                        continue block39;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                                case -1217190489: {
                                                                    var2_4 ^= var3_2 ^ -1826476173;
                                                                    ** continue;
                                                                }
lbl66:
                                                                // 1 sources

                                                                while (true) {
                                                                    var3_2 = (var1_1 | var4) ^ 215322275;
                                                                    ** GOTO lbl38
                                                                    break;
                                                                }
lbl69:
                                                                // 1 sources

                                                                while (true) {
                                                                    var3_2 = (var1_1 | var4) ^ 1999486796;
                                                                    ** GOTO lbl38
                                                                    break;
                                                                }
lbl72:
                                                                // 2 sources

                                                                while (true) {
                                                                    var3_2 = (var1_1 | var4) ^ -1793058134;
                                                                    ** GOTO lbl38
                                                                    break;
                                                                }
                                                                {
                                                                    case -1290490737: {
                                                                        if (System.currentTimeMillis() < var0_3.a) {
                                                                            ** continue;
                                                                        }
                                                                        break block57;
                                                                    }
                                                                }
                                                                case -1604410218: {
                                                                    var0_3 = hu.a;
                                                                    break block35;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    break block59;
                                                }
                                                var3_2 = (var1_1 | var4) ^ 749423424;
                                                ** GOTO lbl38
lbl86:
                                                // 1 sources

                                                while (true) {
                                                    var3_2 = (var1_1 | var4) ^ 982535434;
                                                    ** GOTO lbl38
                                                    break;
                                                }
                                            }
                                            var3_2 = (var1_1 | var4) ^ -8088622;
                                            ** GOTO lbl38
                                            {
                                                case 434148095: {
                                                    var2_4 ^= var3_2 ^ 979095519;
                                                    ** continue;
                                                }
                                                case 178257253: {
                                                    var2_4 ^= var3_2 ^ 572273145;
                                                    ** continue;
                                                }
                                            }
lbl98:
                                            // 1 sources

                                            while (true) {
                                                var3_2 = (var1_1 | var4) ^ -513459992;
                                                ** GOTO lbl38
                                                break;
                                            }
                                        }
                                        var3_2 = (var1_1 | var4) ^ 1257612392;
                                        ** GOTO lbl38
                                        {
                                            case -318912867: {
                                                var2_4 ^= var3_2 ^ -998372863;
                                                break block60;
                                            }
                                            case -1278168187: {
                                                break block61;
                                            }
                                        }
lbl109:
                                        // 2 sources

                                        while (true) {
                                            var2_4 ^= -1799763563;
                                            break block58;
                                            break;
                                        }
                                        {
                                            case 1614509085: {
                                                var2_4 ^= var3_2 ^ 628916290;
                                                ** continue;
                                            }
                                            case 1535241695: {
                                                return false;
                                            }
                                        }
                                    }
                                    return v0;
                                }
                                var3_2 = (var1_1 | var4) ^ -968547318;
                                ** GOTO lbl38
                            }
                            var3_2 = (var1_1 | var4) ^ 1933713746;
                            ** GOTO lbl38
                            {
                                case -689780014: {
                                    v0 = true;
                                    break;
                                }
                                case -1821742740: {
                                    if (var0_3.a == null) ** continue;
                                    ** continue;
                                }
                                case 2128273191: {
                                    return true;
                                }
                            }
                            while (true) {
                                var3_2 = (var1_1 | var4) ^ -1567347472;
                                ** GOTO lbl38
                                break;
                            }
                            {
                                case 568108428: {
                                    var2_4 ^= var3_2 ^ -291922863;
                                    ** continue;
                                }
                                case 1569790574: {
                                    v0 = false;
                                    ** continue;
                                }
                                case 1509606341: {
                                    var2_4 ^= var3_2 ^ -1057184246;
                                    ** continue;
                                }
                                case -393062269: {
                                    var2_4 ^= var3_2 ^ 2002450393;
                                    ** continue;
                                }
                                case 2133105990: {
                                    if (var0_3.isEnabled()) ** continue;
                                    ** GOTO lbl30
                                }
                                case 524117134: {
                                    if (var0_3 != null) ** break;
                                    ** continue;
                                    ** continue;
                                }
                                ** case -716553305:
                            }
lbl156:
                            // 1 sources

                            var2_4 ^= var3_2 ^ -1426860007;
                            break block62;
                        }
                        var3_2 = (var1_1 | var4) ^ 1230843165;
                        ** GOTO lbl38
                    }
                    var3_2 = (var1_1 | var4) ^ 684507752;
                    ** while (true)
                }
                var3_2 = (var1_1 | var4) ^ -2040564432;
                ** GOTO lbl38
            }
            var3_2 = (var1_1 | var4) ^ -2138930367;
            ** GOTO lbl38
        }
        var3_2 = (var1_1 | var4) ^ -504499706;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private void Oc() {
        block18: {
            block17: {
                break block17;
lbl1:
                // 4 sources

                block11: while (true) {
                    switch (var3_3) lbl-1000:
                    // 5 sources

                    {
                        while (true) {
                            default: {
                                continue block11;
                            }
                            break;
                        }
                        case 1755581843: {
                            var2_4 ^= var3_3 ^ -47868931;
                            break;
                        }
lbl9:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1831411746;
                            ** GOTO lbl-1000
                            break;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 1089351354;
                            ** GOTO lbl-1000
                            break;
                        }
lbl15:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 2136625032;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -1077677244: {
                            return;
                        }
lbl20:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -936775258;
                            ** continue;
                            break;
                        }
                        case 923020376: {
                            var2_4 ^= var3_3 ^ -50623726;
                            ** continue;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ -622836493;
                    continue;
                    {
                        case -332178239: {
                            break;
                        }
                    }
                    break;
                }
            }
            var4_1 = -654043782;
            var1_2 = hu.e & -654043782 ^ -416687900;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -143846396;
            var3_3 = (var1_2 | var4_1) ^ 320766271;
            ** GOTO lbl1
            {
                case -994990745: {
                    this.a = System.currentTimeMillis() + (-8081604985104081021L << (var3_3 ^ -994990777) >>> (var3_3 ^ -994990777) ^ (long)var2_4 & 0xFFFFFFFFL | (-8081604985104081021L >>> (var3_3 ^ -994990777) ^ (long)var2_4 & 0xFFFFFFFFL) << (var3_3 ^ -994990777));
                    ** continue;
                }
                case -2139647370: {
                    var2_4 ^= var3_3 ^ 133371570;
                    ** continue;
                }
                case -1695597180: {
                    var2_4 ^= var3_3 ^ 494381931;
                    break;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ 1707270266;
            ** GOTO lbl1
            {
                case 1845166624: {
                    ko.resetOwner(this);
                    break block18;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ 1000110233;
            ** GOTO lbl1
            {
                ** case 634231053:
            }
lbl55:
            // 1 sources

            this.Oo();
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ -1752575891;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private void Od() {
        block16: {
            block20: {
                block17: {
                    block19: {
                        block18: {
                            break block19;
lbl1:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ -1674669505;
                                break block16;
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                if (!this.isEnabled()) break block17;
                                break block18;
                                break;
                            }
lbl7:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -404777032;
                                ** GOTO lbl26
                                break;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 171620605;
                                ** GOTO lbl26
lbl13:
                                // 1 sources

                                return;
                            }
                        }
                        var3_3 = (var1_2 | var4_1) ^ -11367833;
                        ** GOTO lbl26
                    }
                    var4_1 = 1484547427;
                    var1_2 = hu.e & 1484547427 ^ 939443507;
                    var3_3 = 0;
                    break block20;
                }
lbl24:
                // 2 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1485496772;
lbl26:
                    // 6 sources

                    block15: while (true) {
                        switch (var3_3) {
                            default: {
                                continue block15;
                            }
                            case -364360905: {
                                ** continue;
                            }
                            case 1477733582: {
                                ** continue;
                            }
                            case 443123497: {
                                break;
                            }
                            case -2136183020: {
                                ** continue;
                            }
                            case 1975803278: {
                                ** continue;
                            }
                        }
                        var3_3 = (var1_2 | var4_1) ^ -1783189948;
                        continue;
                        {
                            case -661914801: {
                                var2_4 ^= var3_3 ^ 409565632;
                                ** continue;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
            var2_4 = (var1_2 | var4_1) ^ -2006902828;
            var3_3 = (var1_2 | var4_1) ^ 1704419930;
            ** GOTO lbl26
        }
        var3_3 = (var1_2 | var4_1) ^ 669682109;
        ** while (true)
        {
            ** case -1742638389:
        }
lbl53:
        // 1 sources

        this.Oc();
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onEnable() {
        int n2 = -681944788;
        int n3 = e & 0xD75A592C ^ 0xC1704596;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xE276345E;
        n4 = (n3 | n2) ^ 0x4706312D;
        block9: while (true) {
            switch (n4) {
                default: {
                    continue block9;
                }
                case -851809510: {
                    n5 ^= n4 ^ 0x4911FD6D;
                    n4 = (n3 | n2) ^ 0xB2D766D;
                    continue block9;
                }
                case 1643886471: {
                    n5 ^= n4 ^ 0x7833EFB0;
                    n4 = (n3 | n2) ^ 0x1E1230A0;
                    continue block9;
                }
                case 986248485: {
                    n5 ^= n4 ^ 0x620BEF34;
                    n4 = (n3 | n2) ^ 0x9FF9E58E;
                    continue block9;
                }
                case -1870893933: {
                    n4 = (n3 | n2) ^ 0xEDB2A89B;
                    continue block9;
                }
                case -915903202: {
                    this.clear();
                    n4 = (n3 | n2) ^ 0x1A4036A4;
                    continue block9;
                }
                case -598266925: {
                    return;
                }
                case 1216591920: 
            }
            this.a = 0L;
            n4 = (n3 | n2) ^ 0xB681EA39;
        }
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
     * Exception decompiling
     */
    @Override
    public void onCombatTick() {
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
    private class_1657 Oe(double var1_1) {
        block47: {
            var9_2 = 1203200594;
            var6_3 = hu.e & 1203200594 ^ 1196504612;
            var8_4 = 0;
            var7_5 = (var6_3 | var9_2) ^ -378451857;
            var8_4 = (var6_3 | var9_2) ^ 1948157308;
            break block47;
lbl7:
            // 1 sources

            while (true) {
                var7_5 ^= -983531575;
                var7_5 ^= 211380291;
                var7_5 ^= 442726598;
                var7_5 ^= 1165722155;
                return hu.a.field_1687.method_18456().stream().filter((Predicate<class_742>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, Op(double net.minecraft.class_742 ), (Lnet/minecraft/class_742;)Z)((hu)this, (double)var1_1)).min(var3_8).orElse(null);
            }
lbl13:
            // 1 sources

            while (true) {
                var8_4 = (var6_3 | var9_2) ^ -1883651815;
                break block47;
                break;
            }
lbl16:
            // 5 sources

            while (true) {
                var8_4 = (var6_3 | var9_2) ^ -1885788132;
                ** GOTO lbl70
                break;
            }
        }
        block40: while (true) {
            switch (var8_4) {
                case 1387274205: {
                    var7_5 ^= var8_4 ^ -239367184;
                    var8_4 = (var6_3 | var9_2) ^ -1277650771;
                    continue block40;
                }
                case 1769959758: {
                    var7_5 ^= var8_4 ^ -1000135367;
                    ** break;
                }
                case -789077367: {
                    var7_5 ^= var8_4 ^ -1549900999;
                    var8_4 = (var6_3 | var9_2) ^ 164993068;
                    continue block40;
                }
                case -198185253: {
                    if (this.a.is(hu.g)) {
                        ** continue;
                    }
                    ** GOTO lbl56
                }
lbl37:
                // 1 sources

                var8_4 = (var6_3 | var9_2) ^ 456177602;
                ** GOTO lbl57
                case 1310912090: {
                    return this.a;
                }
                case 1556595124: {
                    var4_6 = (String)this.a.getValue();
                    var5_7 = -1;
                    switch (var4_6.hashCode()) {
                        default: {
                            ** GOTO lbl16
                        }
                        case 63408307: {
                            var8_4 = (var6_3 | var9_2) ^ 324448089;
                            if (true) ** GOTO lbl70
                        }
                        case -2137395588: {
                            var8_4 = (var6_3 | var9_2) ^ -1442724976;
                            break;
                        }
                    }
                    ** GOTO lbl-1000
                }
                case 651920657: {
                    if (this.Of(this.a, var1_1, false)) ** GOTO lbl63
lbl56:
                    // 2 sources

                    var8_4 = (var6_3 | var9_2) ^ 780666680;
                }
lbl57:
                // 3 sources

                default: {
                    continue block40;
                }
                {
                }
                case 870970122: {
                    var8_4 = (var6_3 | var9_2) ^ 357001643;
                    continue block40;
                }
lbl63:
                // 1 sources

                var8_4 = (var6_3 | var9_2) ^ -1761553153;
                continue block40;
                case -934365329: 
            }
            var8_4 = (var6_3 | var9_2) ^ 1630335847;
        }
        block41: while (true) {
            var8_4 = (var6_3 | var9_2) ^ -507347257;
lbl70:
            // 3 sources

            block42: while (true) lbl-1000:
            // 10 sources

            {
                block48: {
                    switch (var8_4) {
                        case -932290966: {
                            var7_5 ^= var8_4 ^ -1663344948;
                            ** GOTO lbl102
                        }
                        case -1022543979: {
                            v0 = Comparator.comparingDouble((ToDoubleFunction<class_1657>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, Oq(net.minecraft.class_1657 ), (Lnet/minecraft/class_1657;)D)());
                            ** GOTO lbl109
                        }
                        case 316156836: {
                            var7_5 ^= var8_4 ^ 1615690443;
                            var8_4 = (var6_3 | var9_2) ^ 87254289;
                            continue block42;
                        }
                        case -1596167899: {
                            if (!var4_6.equals(hu.h)) ** GOTO lbl16
                            ** break;
                        }
                        case -302598682: {
                            ** GOTO lbl121
                        }
                        case -1040649954: {
                            var5_7 = 1;
                            ** GOTO lbl16
                        }
                        case -1506473807: {
                            ** GOTO lbl119
                        }
                        case 514610632: {
                            v0 = Comparator.comparingDouble((ToDoubleFunction<class_1657>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, Oh(net.minecraft.class_1657 ), (Lnet/minecraft/class_1657;)D)((hu)this));
                            ** GOTO lbl109
                        }
                        case -1647352824: {
                            var5_7 = 0;
                            ** GOTO lbl16
                        }
                        case 1419893039: {
                            break block48;
                        }
lbl100:
                        // 1 sources

                        var8_4 = (var6_3 | var9_2) ^ -1775853370;
                        break;
lbl102:
                        // 1 sources

                        var8_4 = (var6_3 | var9_2) ^ 1618647194;
                        break;
                        case 1559684839: {
                            var7_5 ^= var8_4 ^ 778286984;
                            ** break;
                        }
                        case 1120146279: {
                            v0 = Comparator.comparingDouble((ToDoubleFunction<class_1657>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, method_6032(), (Lnet/minecraft/class_1657;)D)());
lbl109:
                            // 3 sources

                            var7_5 ^= 0x70077717;
                            var3_8 = v0;
                            var7_5 ^= -2075445274;
                            ** continue;
                        }
                        case -991572070: {
                            if (var4_6.equals(hu.i)) ** break;
                            ** continue;
                            continue block41;
                        }
lbl117:
                        // 1 sources

                        var8_4 = (var6_3 | var9_2) ^ 1499145150;
                        continue block42;
lbl119:
                        // 1 sources

                        var8_4 = (var6_3 | var9_2) ^ -633859458;
                        continue block42;
lbl121:
                        // 1 sources

                        var8_4 = (var6_3 | var9_2) ^ -416604333;
                        continue block42;
                        case -774777168: {
                            var8_4 = (var6_3 | var9_2) ^ -2045802648;
                            continue block42;
                        }
                        case 663613164: {
                            switch (var5_7) {
                                case 1: {
                                    var8_4 = (var6_3 | var9_2) ^ 1429167570;
                                    continue block42;
                                }
                                case 0: {
                                    var8_4 = (var6_3 | var9_2) ^ 453087377;
                                    break;
                                }
                                default: {
                                    var8_4 = (var6_3 | var9_2) ^ 1956082735;
                                    break;
                                }
                            }
                            break;
                        }
                        case 861930073: {
                            var7_5 ^= var8_4 ^ 1106596662;
                            var8_4 = (var6_3 | var9_2) ^ -2063973917;
                        }
                    }
                    continue;
                }
                var8_4 = (var6_3 | var9_2) ^ -2095924756;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private boolean Of(class_1657 var1_1, double var2_2, boolean var4_3) {
        block81: {
            block86: {
                block88: {
                    block90: {
                        block84: {
                            block79: {
                                block89: {
                                    block83: {
                                        block82: {
                                            block80: {
                                                block87: {
                                                    block85: {
                                                        block78: {
                                                            break block84;
lbl1:
                                                            // 1 sources

                                                            return false;
lbl3:
                                                            // 1 sources

                                                            while (true) {
                                                                var8_6 = (var6_5 | var9_4) ^ 2078465939;
                                                                break block78;
                                                                break;
                                                            }
lbl6:
                                                            // 1 sources

                                                            while (true) {
                                                                var8_6 = (var6_5 | var9_4) ^ -919198777;
                                                                ** GOTO lbl204
                                                                break;
                                                            }
lbl9:
                                                            // 1 sources

                                                            while (true) {
                                                                var8_6 = (var6_5 | var9_4) ^ 1993375097;
                                                                break block78;
lbl12:
                                                                // 1 sources

                                                                while (true) {
                                                                    var7_8 ^= var8_6 ^ -1062860465;
                                                                    break block79;
                                                                    break;
                                                                }
                                                                break;
                                                            }
lbl15:
                                                            // 1 sources

                                                            while (true) {
                                                                var8_6 = (var6_5 | var9_4) ^ 1446897425;
                                                                ** GOTO lbl204
                                                                break;
                                                            }
                                                        }
lbl19:
                                                        // 18 sources

                                                        block47: while (true) {
                                                            switch (var8_6) lbl-1000:
                                                            // 4 sources

                                                            {
                                                                while (true) {
                                                                    default: {
                                                                        continue block47;
                                                                    }
                                                                    break;
                                                                }
                                                                case 1122482239: {
                                                                    ** continue;
                                                                }
                                                                case -1269681056: {
                                                                    if (!(hu.Ok(hu.a.field_1724.method_33571(), var1_1.method_5829()) > var2_2)) ** GOTO lbl32
                                                                    break block80;
                                                                }
lbl29:
                                                                // 1 sources

                                                                while (true) {
                                                                    var8_6 = (var6_5 | var9_4) ^ 271563193;
                                                                    ** GOTO lbl-1000
                                                                    break;
                                                                }
lbl32:
                                                                // 1 sources

                                                                var8_6 = (var6_5 | var9_4) ^ -1498110774;
                                                                ** GOTO lbl-1000
                                                                case 1822040924: {
                                                                    if (!(this.Oh(var1_1) <= (double)((Float)this.b.getValue()).floatValue())) break block81;
                                                                    break block47;
                                                                }
lbl37:
                                                                // 1 sources

                                                                while (true) {
                                                                    var8_6 = (var6_5 | var9_4) ^ 1259785204;
                                                                    ** GOTO lbl204
                                                                    break;
                                                                }
lbl40:
                                                                // 1 sources

                                                                while (true) {
                                                                    var8_6 = (var6_5 | var9_4) ^ -2114192050;
                                                                    ** GOTO lbl204
                                                                    break;
                                                                }
lbl43:
                                                                // 1 sources

                                                                while (true) {
                                                                    var8_6 = (var6_5 | var9_4) ^ 768862521;
                                                                    ** continue;
                                                                    break;
                                                                }
                                                                case 1309863289: {
                                                                    return false;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        while (true) {
                                                            var8_6 = (var6_5 | var9_4) ^ 1027327968;
                                                            ** GOTO lbl19
                                                            break;
                                                        }
                                                        {
                                                            case 1878247014: {
                                                                break;
                                                            }
                                                        }
lbl53:
                                                        // 1 sources

                                                        return v0;
lbl55:
                                                        // 1 sources

                                                        while (true) {
                                                            var8_6 = (var6_5 | var9_4) ^ -653463259;
                                                            ** GOTO lbl204
                                                            break;
                                                        }
                                                        {
                                                            case 151782054: {
                                                                if (!var5_7.isFriend(var1_1.method_7334().name())) break block85;
                                                                break block86;
                                                            }
                                                        }
                                                        while (true) {
                                                            var8_6 = (var6_5 | var9_4) ^ -496683963;
                                                            ** GOTO lbl19
                                                            break;
                                                        }
lbl64:
                                                        // 1 sources

                                                        while (true) {
                                                            var8_6 = (var6_5 | var9_4) ^ -1629635407;
                                                            ** GOTO lbl204
                                                            break;
                                                        }
                                                        {
                                                            case -1100990648: {
                                                                return false;
                                                            }
                                                        }
                                                        while (true) {
                                                            var8_6 = (var6_5 | var9_4) ^ -398931680;
                                                            ** GOTO lbl204
                                                            break;
                                                        }
lbl72:
                                                        // 1 sources

                                                        while (true) {
                                                            if (!var1_1.method_5805()) break block82;
                                                            ** continue;
                                                            break;
                                                        }
lbl75:
                                                        // 1 sources

                                                        while (true) {
                                                            var8_6 = (var6_5 | var9_4) ^ -1424991966;
                                                            ** GOTO lbl204
                                                            break;
                                                        }
                                                    }
                                                    while (true) {
                                                        var8_6 = (var6_5 | var9_4) ^ 1112459004;
                                                        ** GOTO lbl19
                                                        break;
                                                    }
                                                    {
                                                        case -1648800870: {
                                                            var7_8 ^= var8_6 ^ -1665256853;
                                                            break block87;
                                                        }
                                                    }
lbl85:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var1_1 != null) {
                                                            ** continue;
                                                        }
                                                        break block82;
                                                        break;
                                                    }
                                                    {
                                                        case -647439595: {
                                                            var7_8 ^= var8_6 ^ 108560380;
                                                            break block88;
                                                        }
                                                    }
lbl92:
                                                    // 1 sources

                                                    while (true) {
                                                        var8_6 = (var6_5 | var9_4) ^ -146740080;
                                                        ** GOTO lbl19
                                                        break;
                                                    }
                                                }
                                                var8_6 = (var6_5 | var9_4) ^ -1653878043;
                                                ** GOTO lbl19
                                            }
                                            var8_6 = (var6_5 | var9_4) ^ -13580922;
                                            ** GOTO lbl19
lbl101:
                                            // 1 sources

                                            while (true) {
                                                var8_6 = (var6_5 | var9_4) ^ -879866945;
                                                ** GOTO lbl19
                                                break;
                                            }
lbl104:
                                            // 1 sources

                                            while (true) {
                                                var8_6 = (var6_5 | var9_4) ^ -1834779917;
                                                ** GOTO lbl19
                                                break;
                                            }
lbl107:
                                            // 1 sources

                                            while (true) {
                                                var7_8 ^= var8_6 ^ -609653989;
                                                break block83;
                                                break;
                                            }
                                            {
                                                case 1073425100: {
                                                    v0 = true;
                                                    break;
                                                }
                                                case 1376753382: {
                                                    ** continue;
                                                }
                                                case -2131969447: {
                                                    var7_8 ^= var8_6 ^ 1962942547;
                                                    ** continue;
                                                }
                                                case 1033025827: {
                                                    var7_8 ^= var8_6 ^ -537672273;
                                                    ** continue;
                                                }
                                            }
                                            var8_6 = (var6_5 | var9_4) ^ 323378307;
                                            ** GOTO lbl19
                                        }
lbl124:
                                        // 4 sources

                                        while (true) {
                                            var8_6 = (var6_5 | var9_4) ^ -466739586;
                                            ** GOTO lbl204
                                            break;
                                        }
                                    }
                                    var8_6 = (var6_5 | var9_4) ^ -2016030733;
                                    ** GOTO lbl204
                                    {
                                        case -2011825918: {
                                            var7_8 ^= var8_6 ^ -667263973;
                                            break block89;
                                        }
                                    }
lbl133:
                                    // 1 sources

                                    while (true) {
                                        var8_6 = (var6_5 | var9_4) ^ 800935939;
                                        ** GOTO lbl204
                                        break;
                                    }
                                }
                                var8_6 = (var6_5 | var9_4) ^ -1044625257;
                                ** GOTO lbl19
lbl139:
                                // 1 sources

                                while (true) {
                                    if (!var1_1.method_7325()) ** continue;
                                    ** GOTO lbl124
                                    break;
                                }
                            }
                            var8_6 = (var6_5 | var9_4) ^ 1076319507;
                            ** GOTO lbl19
                        }
                        var9_4 = 534527135;
                        var6_5 = hu.e & 534527135 ^ 1687445335;
                        var8_6 = 0;
                        break block90;
                        {
                            case -491279046: {
                                if (!var4_3) ** continue;
                                ** continue;
                            }
                            case -2003004593: {
                                return false;
                            }
                            case 71213132: {
                                var7_8 ^= var8_6 ^ -1278710430;
                                break;
                            }
                            case 1395367762: {
                                var7_8 ^= var8_6 ^ -781570526;
                                ** continue;
                            }
                        }
                    }
                    var7_8 = (var6_5 | var9_4) ^ 51562115;
                    var8_6 = (var6_5 | var9_4) ^ -1420414868;
                    ** GOTO lbl204
lbl165:
                    // 1 sources

                    while (true) {
                        var7_8 ^= var8_6 ^ 129930273;
                        ** continue;
                        break;
                    }
                }
                var8_6 = (var6_5 | var9_4) ^ 1250538476;
                ** GOTO lbl19
                {
                    case -310442708: {
                        v0 = false;
                        break;
                    }
                }
                var8_6 = (var6_5 | var9_4) ^ -153643887;
                ** GOTO lbl19
lbl176:
                // 1 sources

                while (true) {
                    var8_6 = (var6_5 | var9_4) ^ -1327691532;
                    ** GOTO lbl19
                    break;
                }
            }
            var8_6 = (var6_5 | var9_4) ^ -137787683;
            ** GOTO lbl19
lbl182:
            // 1 sources

            while (true) {
                var8_6 = (var6_5 | var9_4) ^ 951406885;
                ** GOTO lbl204
                break;
            }
            {
                case -821987541: {
                    var7_8 ^= var8_6 ^ 1739975913;
                    ** GOTO lbl232
                }
            }
            var7_8 ^= -1787554993;
            ** while (true)
            {
                case 0x3555CC33: {
                    if (cO.hasLineOfSight((class_1297)var1_1)) ** continue;
                    ** continue;
                }
            }
lbl193:
            // 1 sources

            while (true) {
                var8_6 = (var6_5 | var9_4) ^ 722954324;
                if (true) ** GOTO lbl204
                break;
            }
        }
        var8_6 = (var6_5 | var9_4) ^ 754442381;
        ** GOTO lbl19
lbl199:
        // 1 sources

        while (true) {
            if (var1_1.method_31481()) ** GOTO lbl124
            ** continue;
            break;
        }
        block75: while (true) {
            var8_6 = (var6_5 | var9_4) ^ 832475349;
lbl204:
            // 15 sources

            block76: while (true) {
                switch (var8_6) {
                    default: {
                        continue block76;
                    }
                    case -133582804: {
                        ** continue;
                    }
                    case -1226154984: {
                        ** continue;
                    }
                    case 1348546524: {
                        continue block75;
                    }
                    case 1313009418: {
                        ** continue;
                    }
                    case 702650574: {
                        ** continue;
                    }
                    case -1496281350: {
                        ** continue;
                    }
                    case -1678614111: {
                        ** continue;
                    }
                    case -724818179: {
                        ** continue;
                    }
                    case -1746618625: {
                        ** continue;
                    }
                    case -729133133: {
                        ** continue;
                    }
                    case -519978130: {
                        ** continue;
                    }
                    case -30965103: {
                        ** continue;
                    }
lbl232:
                    // 1 sources

                    var8_6 = (var6_5 | var9_4) ^ 835621542;
                    ** continue;
                    case 1422595979: {
                        if (var1_1 != hu.a.field_1724) ** break;
                        ** continue;
                        ** continue;
                    }
                    {
                        ** case -1995707570:
                    }
lbl239:
                    // 1 sources

                    if (var5_7 == null) ** continue;
                    ** continue;
                    case 1198075642: {
                        var7_8 ^= var8_6 ^ -250731274;
                        ** continue;
                    }
                    case 885699627: 
                }
                break;
            }
            break;
        }
        var5_7 = ix.get();
        ** while (true)
    }

    private static int Og(int n2, int n3) {
        int n4 = -1177467217;
        int n5 = -362720070;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x7F2160B1)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xFBF13BCA;
        n6 -= (n5 | n4) ^ 0xFBF1F8D6;
        n6 += (n5 | n4) ^ 0xFBF131B7;
        n6 += (n5 | n4) ^ 0xFBF10167;
        n6 -= (n5 | n4) ^ 0xFBF1EAC5;
        n6 -= (n5 | n4) ^ 0xFBF1F3EB;
        n6 -= (n5 | n4) ^ 0xFBF1A6A3;
        return n6 -= (n5 | n4) ^ 0xFBF14E80;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var2 = 306262902;
        hu.e = mK.a(MethodHandles.lookup().lookupClass(), 1081884849);
        var1_1 = 0;
        var0_2 = 1211642566;
        var1_1 = var2 ^ -261869083;
        block5: while (true) {
            switch (var1_1) {
                case -959706941: {
                    v0 = 0;
                    v1 = 0;
                    v2 = "\u0084\u00bbD\u00bf\u0019\u0085\u00ac\u0012m\u0083\u00d8\u00c3\u00d9T\u001aA\u00f2\r\u00abGSS$\u00d3\u00e3\u00c1\r\u00aa<6\u00b6\u00b5\u00cc.\u00da\u0085X\u00923%\u00ba\u001cy\u0006\u00b5\u0014)\u0003\u00d1\u009dX\u00e3\u0016\u00ac\u00f3\u00ea3|\u00e6\u0004\u009a\u00d3y\u00bf\u001ads\u00d1".getBytes("ISO-8859-1");
                    ** break;
                }
                case -771288491: {
                    var0_2 ^= var1_1 ^ -1227460651;
                    var1_1 = var2 ^ -728941643;
                }
                default: {
                    continue block5;
                }
lbl18:
                // 1 sources

                hu.a = new int[((var0_2 ^= 377730330) | var2) ^ 980155247];
                var0_2 ^= -2006626133;
                if (true) ** GOTO lbl48
                case -500890989: 
            }
            var1_1 = var2 ^ -1069145821;
        }
        while (true) {
            var0_2 ^= 397910566;
            v3 = var0_2 ^= 1979485688;
            var0_2 ^= -617162116;
            hu.a[v0] = ((v2[v1] & 255) << 24 | ((v2[v1 + 1] & 255) << 16 | ((v2[v1 + 2] & 255) << 8 | v2[v1 + 3] & 255))) ^ ((v3 | var2) ^ -2101993430 ^ hu.e);
            v0 = v0 + 1;
            v4 = v1 + 4;
            v2 = v2;
            v1 = v4;
            var0_2 ^= -1763406660;
            if (v4 >= v2.length) break;
lbl48:
            // 2 sources

            var0_2 ^= 1030510893;
            var0_2 ^= 1435550956;
            var0_2 ^= -1556202645;
            var0_2 ^= -1094123486;
            var0_2 ^= 1519574934;
        }
        hu.c = hu.Og(((var0_2 ^= -120110474) | var2) ^ -569782792, var2 ^ ((var0_2 | var2) ^ -2078729574));
        hu.b = hu.Og((var0_2 | var2) ^ -569782789, var2 ^ ((var0_2 | var2) ^ -266375647));
        hu.b = 0.9f;
        hu.a = 3.0;
        hu.a = 4.0f;
        hu.k = gj.decode("A9frS+YUksA2LiE=", hu.Og((var0_2 | var2) ^ -569782790, var2 ^ ((var0_2 | var2) ^ 1949710644)));
        hu.s = gj.decode("PEmrbLjRGEIpzYsquD88ZKliR0yzKHA3dOIqCdTsE5Cvge7JnCyF8w==", hu.Og((var0_2 | var2) ^ -569782787, var2 ^ ((var0_2 | var2) ^ -1167362939)));
        hu.l = gj.decode("tPeI+TM=", hu.Og((var0_2 | var2) ^ -569782788, var2 ^ ((var0_2 | var2) ^ 1473395061)));
        hu.c = gj.decode("rOoU", hu.Og((var0_2 | var2) ^ -569782785, var2 ^ ((var0_2 | var2) ^ -289172594)));
        hu.j = gj.decode("MCRRZw==", hu.Og((var0_2 | var2) ^ -569782786, var2 ^ ((var0_2 | var2) ^ -1403406583)));
        hu.f = gj.decode("yzMKq4caO4A=", hu.Og((var0_2 | var2) ^ -569782799, var2 ^ ((var0_2 | var2) ^ 953629240)));
        hu.e = gj.decode("CqgMtlGLOQM=", hu.Og((var0_2 | var2) ^ -569782800, var2 ^ ((var0_2 | var2) ^ 1223024959)));
        hu.i = gj.decode("RgdEKhs=", hu.Og((var0_2 | var2) ^ -569782797, var2 ^ ((var0_2 | var2) ^ -202184902)));
        hu.h = gj.decode("afrj+z6E", hu.Og((var0_2 | var2) ^ -569782798, var2 ^ ((var0_2 | var2) ^ 445478190)));
        hu.g = gj.decode("kzzNwcs=", hu.Og((var0_2 | var2) ^ -569782795, var2 ^ ((var0_2 | var2) ^ -118376838)));
        hu.m = gj.decode("VZ5GB6ylrkrYMkqy", hu.Og((var0_2 | var2) ^ -569782796, var2 ^ ((var0_2 | var2) ^ 2141485985)));
        hu.b = gj.decode("maL+KrnAuCvw9xVtHDGQoHBLJA==", hu.Og((var0_2 | var2) ^ -569782793, var2 ^ ((var0_2 | var2) ^ 206689150)));
        hu.a = gj.decode("pnmOTBad+PDaWIS/FadnpYk=", hu.Og((var0_2 | var2) ^ -569782794, var2 ^ ((var0_2 | var2) ^ 116136759)));
        hu.d = gj.decode("9Ye11NJ2A+Oh", hu.Og((var0_2 | var2) ^ -569782807, var2 ^ ((var0_2 | var2) ^ -1667973505)));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private double Oh(class_1657 class_16572) {
        int n2 = e & 0xB4FA3F29 ^ 0x7D089C9B;
        int n3 = 0;
        int n4 = (n2 | 0xB4FA3F29) ^ 0x82924F35;
        n3 = (n2 | 0xB4FA3F29) ^ 0x4B836BAE;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1385149443: {
                    class_243 class_2432 = hu.a.field_1724.method_33571();
                    n4 ^= 0x4A956341;
                    float[] fArray = eA.getRotationsTo(class_2432, hu.Oj(class_2432, class_16572.method_5829()));
                    n4 ^= 0x15C55F3B;
                    return Math.hypot(class_3532.method_15393((float)(fArray[0] - hu.a.field_1724.method_36454())), fArray[1] - hu.a.field_1724.method_36455());
                }
                case -1233529835: {
                    n3 = (n2 | 0xB4FA3F29) ^ 0x87ABCFE3;
                    continue block5;
                }
                case 2052157528: 
            }
            n4 ^= n3 ^ 0xFEE28901;
            n3 = (n2 | 0xB4FA3F29) ^ 0x508AF446;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private double Oi() {
        int n2 = e & 0x7ADAFD4 ^ 0x127ACB06;
        int n3 = 0;
        int n4 = (n2 | 0x7ADAFD4) ^ 0x713434C9;
        n3 = (n2 | 0x7ADAFD4) ^ 0xFBD3289C;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -332609718: {
                    n3 = (n2 | 0x7ADAFD4) ^ 0x5B090711;
                    continue block5;
                }
                case 1291249863: {
                    n4 ^= n3 ^ 0x469EA6C5;
                    n3 = (n2 | 0x7ADAFD4) ^ 0x23C861E8;
                    continue block5;
                }
                case 876056126: 
            }
            break;
        }
        return Math.min(Math.min((double)((Float)this.c.getValue()).floatValue(), hu.a.field_1724.method_55755()), 3.0);
    }

    /*
     * Unable to fully structure code
     */
    private static class_243 Oj(class_243 var0, class_238 var1_1) {
        block15: {
            block13: {
                block16: {
                    block14: {
                        block17: {
                            block12: {
                                block11: {
                                    var6_2 = hu.e & -341473390 ^ 1672494674;
                                    var8_3 = 0;
                                    ** GOTO lbl32
lbl4:
                                    // 1 sources

                                    while (true) {
                                        break block11;
                                        break;
                                    }
lbl6:
                                    // 1 sources

                                    while (true) {
                                        var8_3 = (var6_2 | -341473390) ^ 1200412148;
                                        break block12;
                                        break;
                                    }
                                }
                                var7_4 ^= 501870002;
                                ** GOTO lbl30
lbl12:
                                // 1 sources

                                while (true) {
                                    var4_6 = var1_1.field_1322 + (var1_1.field_1325 - var1_1.field_1322) * 0.85;
                                    ** GOTO lbl26
                                    break;
                                }
                            }
lbl16:
                            // 3 sources

                            block8: while (true) {
                                switch (var8_3) {
                                    default: {
                                        continue block8;
                                    }
lbl20:
                                    // 1 sources

                                    while (true) {
                                        var7_4 ^= 16577117;
                                        break block13;
                                        break;
                                    }
                                    case -893327790: {
                                        var2_5 = var1_1.field_1322 + (var1_1.field_1325 - var1_1.field_1322) * 0.35;
                                        break block14;
                                    }
lbl26:
                                    // 1 sources

                                    var7_4 ^= 1230528857;
                                    ** continue;
                                    case -1405523418: {
                                        break block15;
                                    }
lbl30:
                                    // 1 sources

                                    var7_4 ^= 967954084;
                                    break block16;
lbl32:
                                    // 1 sources

                                    var7_4 = (var6_2 | -341473390) ^ -363913708;
                                    ** continue;
                                    case -1077442527: {
                                        var7_4 ^= var8_3 ^ 483718267;
                                        break block8;
                                    }
                                }
                                break;
                            }
                            break block17;
lbl38:
                            // 1 sources

                            while (true) {
                                ** continue;
                                break;
                            }
                        }
                        var8_3 = (var6_2 | -341473390) ^ 561338752;
                        ** GOTO lbl16
                    }
                    var7_4 ^= -1259110195;
                    ** while (true)
                }
                var7_4 ^= -1323602128;
                ** while (true)
            }
            return new class_243(class_3532.method_15350((double)var0.field_1352, (double)var1_1.field_1323, (double)var1_1.field_1320), class_3532.method_15350((double)var0.field_1351, (double)var2_5, (double)var4_6), class_3532.method_15350((double)var0.field_1350, (double)var1_1.field_1321, (double)var1_1.field_1324));
        }
        var8_3 = (var6_2 | -341473390) ^ 1416771571;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static double Ok(class_243 class_2432, class_238 class_2383) {
        int n2 = e & 0xB338B0E0 ^ 0x7BABB798;
        int n3 = 0;
        int n4 = (n2 | 0xB338B0E0) ^ 0x4A2550E9;
        n3 = (n2 | 0xB338B0E0) ^ 0x9C503D8A;
        block5: while (true) {
            block6: {
                double d2;
                switch (n3) {
                    case 1908486952: {
                        d2 = Math.max(Math.max(class_2383.field_1323 - class_2432.field_1352, 0.0), class_2432.field_1352 - class_2383.field_1320);
                        break;
                    }
                    case 1662277571: {
                        n4 ^= n3 ^ 0xCB48715F;
                        break block6;
                    }
                    case 1743489650: {
                        n3 = (n2 | 0xB338B0E0) ^ 0x98AFE03B;
                    }
                    default: {
                        continue block5;
                    }
                }
                n4 ^= 0x6A47CF0;
                double d3 = Math.max(Math.max(class_2383.field_1322 - class_2432.field_1351, 0.0), class_2432.field_1351 - class_2383.field_1325);
                n4 ^= 0xBEE8BFDE;
                double d4 = Math.max(Math.max(class_2383.field_1321 - class_2432.field_1350, 0.0), class_2432.field_1350 - class_2383.field_1324);
                n4 ^= 0xF6015C82;
                return Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
            }
            n3 = (n2 | 0xB338B0E0) ^ 0x8A7A84D0;
        }
    }

    /*
     * Unable to fully structure code
     */
    private boolean Ol() {
        block43: {
            block42: {
                block38: {
                    block41: {
                        block37: {
                            block40: {
                                block39: {
                                    block44: {
                                        break block44;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ -1034351978;
                                            break block37;
                                            break;
                                        }
lbl4:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ -202662035;
                                            break block37;
lbl7:
                                            // 1 sources

                                            while (true) {
                                                var3_3 = (var1_2 | var4_1) ^ -1831457157;
                                                break block37;
lbl10:
                                                // 1 sources

                                                while (hu.a.field_1724.method_5799()) lbl-1000:
                                                // 5 sources

                                                {
                                                    while (true) {
                                                        var3_3 = (var1_2 | var4_1) ^ -912774753;
                                                        break block37;
                                                        break;
                                                    }
                                                }
                                                break block38;
                                                break;
                                            }
lbl-1000:
                                            // 1 sources

                                            {
                                                return v0;
lbl17:
                                                // 1 sources

                                                while (true) {
                                                    if (hu.a.field_1724.method_6128()) ** GOTO lbl-1000
                                                    break block39;
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
lbl21:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ 1391608624;
                                            break block37;
                                            break;
                                        }
lbl24:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ 2001888951;
                                            break block37;
lbl27:
                                            // 1 sources

                                            while (true) {
                                                var3_3 = (var1_2 | var4_1) ^ 679075774;
                                                break block37;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    var4_1 = 319003998;
                                    var1_2 = hu.e & 319003998 ^ 156568813;
                                    var3_3 = 0;
                                    var2_4 = (var1_2 | var4_1) ^ 1486276707;
                                    ** while (true)
lbl36:
                                    // 1 sources

                                    while (true) {
                                        if (hu.a.field_1724.method_6101()) ** GOTO lbl-1000
                                        ** GOTO lbl89
                                        break;
                                    }
                                }
                                var3_3 = (var1_2 | var4_1) ^ -1121362655;
                                break block37;
lbl42:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 1691750858;
                                    break block37;
lbl45:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ -1321450569;
                                        break block40;
                                        break;
                                    }
                                    break;
                                }
lbl48:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -1514321361;
                                    break block37;
lbl51:
                                    // 1 sources

                                    while (true) {
                                        v0 = false;
                                        break block41;
                                        break;
                                    }
                                    break;
                                }
                            }
                            var3_3 = (var1_2 | var4_1) ^ 1811138148;
                            break block37;
lbl57:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ -972451915;
                                break block42;
                                break;
                            }
                        }
lbl61:
                        // 4 sources

                        block33: while (true) {
                            switch (var3_3) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    default: {
                                        continue block33;
                                    }
                                    break;
                                }
                                case 2139196469: {
                                    ** GOTO lbl10
                                }
                                case -1091905584: {
                                    ** continue;
                                }
                                case 1889819547: {
                                    break block33;
                                }
                                case 858669633: {
                                    ** continue;
                                }
                                case 1235607247: {
                                    ** continue;
                                }
                                case -43648550: {
                                    break block43;
                                }
                                case -390331758: {
                                    ** continue;
                                }
                                case -856604132: {
                                    ** continue;
                                }
                                case 1812331336: {
                                    ** continue;
                                }
                                case -1501642530: {
                                    ** continue;
                                }
lbl86:
                                // 1 sources

                                while (true) {
                                    if (hu.a.field_1724.method_5765()) ** GOTO lbl-1000
                                    ** continue;
                                    break;
                                }
lbl89:
                                // 1 sources

                                var3_3 = (var1_2 | var4_1) ^ -676929565;
                                ** continue;
                                case -653355159: {
                                    var2_4 ^= var3_3 ^ -916916452;
                                    ** continue;
                                }
                            }
                            break;
                        }
                        var2_4 ^= 1501577509;
                        ** while (true)
                    }
lbl97:
                    // 2 sources

                    while (true) {
                        var2_4 ^= -2062755013;
                        ** continue;
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ -432905179;
                ** GOTO lbl61
                {
                    case -1477399370: {
                        v0 = true;
                        ** continue;
                    }
                    case -1534766550: {
                        if (!hu.a.field_1724.method_5771()) ** break;
                        ** continue;
                        ** continue;
                    }
                    case -1987988604: {
                        ** continue;
                    }
                }
            }
            var3_3 = (var1_2 | var4_1) ^ -1129893559;
            ** GOTO lbl61
        }
        var3_3 = (var1_2 | var4_1) ^ -1076703275;
        ** while (true)
        {
            ** case -758139808:
        }
lbl119:
        // 1 sources

        var2_4 ^= var3_3 ^ -1296499957;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private boolean Om() {
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
    private boolean On() {
        block20: {
            var6_1 = -724834962;
            var3_2 = hu.e & -724834962 ^ -1383003612;
            var5_3 = 0;
            var4_6 = (var3_2 | var6_1) ^ -1435507337;
            var5_3 = (var3_2 | var6_1) ^ -1849455960;
            ** GOTO lbl12
lbl7:
            // 1 sources

            while (true) {
                var5_3 = (var3_2 | var6_1) ^ 1143418877;
                if (true) ** GOTO lbl12
                break;
            }
            block14: while (true) {
                var5_3 = (var3_2 | var6_1) ^ -514856987;
lbl12:
                // 3 sources

                block15: while (true) {
                    block21: {
                        switch (var5_3) {
                            default: {
                                continue block15;
                            }
                            case 249063342: {
                                var2_5 = hu.a.field_1765;
                                if (var2_5 instanceof class_3965) {
                                    ** break;
                                }
                                break block21;
                            }
                            case -668330996: {
                                v0 = false;
                                break block20;
                            }
lbl24:
                            // 1 sources

                            var4_6 ^= -916642264;
                            var1_4 = (class_3965)var2_5;
                            var4_6 ^= -916642264;
                            if (var1_4.method_17783() == class_239.class_240.field_1332) {
                                break block14;
                            }
                            break block21;
                            case -1174617965: {
                                var5_3 = (var3_2 | var6_1) ^ -217872192;
                                continue block15;
                            }
                            case 479463563: {
                                var4_6 ^= 1319948789;
                                if (hu.a.field_1690.field_1886.method_1434()) {
                                    ** continue;
                                }
                                break block21;
                            }
                            case -1050437386: {
                                var4_6 ^= var5_3 ^ -954308885;
                                continue block14;
                            }
                            case -1616803133: {
                                var4_6 ^= var5_3 ^ -2128705726;
                                var5_3 = (var3_2 | var6_1) ^ 636615522;
                                continue block15;
                            }
                            case 1813538246: 
                        }
                        var5_3 = (var3_2 | var6_1) ^ 1018722200;
                        continue;
                    }
                    var5_3 = (var3_2 | var6_1) ^ 1652188589;
                }
                break;
            }
            var4_6 ^= 515837313;
            v0 = true;
        }
        block16: while (true) {
            switch (var4_6) {
                case -906449225: {
                    var4_6 ^= 1551195987;
                    return v0;
                }
                default: {
                    var4_6 ^= 1840791508;
                    continue block16;
                }
                case 31074416: 
            }
            break;
        }
        var4_6 ^= 298860166;
        return v0;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void Oo() {
        int n2 = -714402857;
        int n3 = e & 0xD56B13D7 ^ 0x2576A28B;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x56E4B20E;
        n4 = (n3 | n2) ^ 0x7A457D45;
        boolean bl2 = true;
        block9: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = (n3 | n2) ^ 0xB080CCAE;
            }
            block10: while (true) {
                switch (n4) {
                    default: {
                        continue block10;
                    }
                    case -1891971430: {
                        n4 = (n3 | n2) ^ 0xA880760B;
                        continue block10;
                    }
                    case 1577043412: {
                        n5 ^= n4 ^ 0x5D7F1188;
                        n4 = (n3 | n2) ^ 0xB9409A6;
                        continue block10;
                    }
                    case 1339226146: {
                        n5 ^= n4 ^ 0x2C3712CA;
                        n4 = (n3 | n2) ^ 0x551584BE;
                        continue block10;
                    }
                    case -18105735: {
                        this.a = null;
                        n4 = (n3 | n2) ^ 0x3E261BE5;
                        continue block10;
                    }
                    case -883316678: {
                        n5 ^= n4 ^ 0xECF8E6A9;
                        continue block9;
                    }
                    case 1174372209: {
                        this.a = 0;
                        n4 = (n3 | n2) ^ 0xBAAD4BFD;
                        continue block10;
                    }
                    case -1603651743: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void clear() {
        block16: {
            var4_1 = 954090157;
            var1_2 = hu.e & 954090157 ^ 148758218;
            var3_3 = 0;
            if (true) ** GOTO lbl37
            block9: while (true) {
                var3_3 = (var1_2 | var4_1) ^ 38316662;
                ** GOTO lbl18
lbl8:
                // 1 sources

                while (true) {
                    ko.release(this);
                    var3_3 = (var1_2 | var4_1) ^ 184836006;
                    if (true) ** GOTO lbl18
                    break;
                }
                block11: while (true) {
                    block17: {
                        var3_3 = (var1_2 | var4_1) ^ -308095274;
                        break block17;
lbl15:
                        // 1 sources

                        while (true) {
                            this.Oo();
                            ** GOTO lbl27
                            break;
                        }
                    }
lbl19:
                    // 2 sources

                    block13: while (true) {
                        switch (var3_3) lbl-1000:
                        // 4 sources

                        {
                            default: {
                                continue block13;
                            }
                            case 983004313: {
                                ** continue;
                            }
                            case -713226183: {
                                ** continue;
                            }
lbl27:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ 511408926;
                            ** GOTO lbl-1000
                            case -1456413085: {
                                var2_4 ^= var3_3 ^ 972393539;
                                continue block11;
                            }
lbl32:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1846593396;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -868499289: {
                                return;
                            }
lbl37:
                            // 1 sources

                            var2_4 = (var1_2 | var4_1) ^ 743037830;
                            break block16;
                            case 870023497: {
                                var2_4 ^= var3_3 ^ -5285977;
                                var3_3 = (var1_2 | var4_1) ^ -186376632;
                                ** GOTO lbl-1000
                            }
                            case 648324593: {
                                var2_4 ^= var3_3 ^ 91112115;
                                continue block9;
                            }
                            case -1550422988: 
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ -1689668901;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ boolean Op(double var1_1, class_742 var3_2) {
        block8: {
            var4_3 = hu.e & 2112954219 ^ 648026701;
            var6_4 = 0;
            ** GOTO lbl14
lbl4:
            // 2 sources

            block5: while (true) {
                switch (var6_4) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block5;
                        }
                        break;
                    }
                    case 766980124: {
                        break block5;
                    }
lbl11:
                    // 1 sources

                    while (true) {
                        var6_4 = (var4_3 | 2112954219) ^ 1380331379;
                        ** continue;
                        break;
                    }
lbl14:
                    // 1 sources

                    var5_5 = (var4_3 | 2112954219) ^ 699111380;
                    ** continue;
                    case 1003775548: {
                        return this.Of((class_1657)var3_2, var1_1, true);
                    }
                    case 1024507139: {
                        var5_5 ^= var6_4 ^ 1518930629;
                        break block8;
                    }
                }
                break;
            }
            var6_4 = (var4_3 | 2112954219) ^ 1122083436;
            ** GOTO lbl4
        }
        var6_4 = (var4_3 | 2112954219) ^ 1143306579;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ double Oq(class_1657 class_16572) {
        int n2 = e & 0x75F64E59 ^ 0xBAAD6340;
        int n3 = 0;
        int n4 = (n2 | 0x75F64E59) ^ 0x71D6B191;
        n3 = (n2 | 0x75F64E59) ^ 0x7012C6E8;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1880249935: {
                    n3 = (n2 | 0x75F64E59) ^ 0xA9015C88;
                    continue block5;
                }
                case 1978097131: {
                    return hu.Ok(hu.a.field_1724.method_33571(), class_16572.method_5829());
                }
                case 1459499985: 
            }
            n4 ^= n3 ^ 0xC20EF34E;
            n3 = (n2 | 0x75F64E59) ^ 0x8A1832B2;
        }
    }
}

