/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.dm;
import z.r.eC;
import z.r.kd;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class al
extends eC<String> {
    private static final int[] a;
    public static final int b;
    private final int a;
    private static final /* synthetic */ String a;

    /*
     * Exception decompiling
     */
    public al(String var1_1, String var2_2, int var3_3) {
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
    public int getMaxLength() {
        int n2 = b & 0x458E28B1 ^ 0x7EEF1BE2;
        int n3 = 0;
        int n4 = (n2 | 0x458E28B1) ^ 0x86167C06;
        n3 = (n2 | 0x458E28B1) ^ 0x6D668459;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 311017386: {
                    n3 = (n2 | 0x458E28B1) ^ 0x234DCF07;
                    continue block5;
                }
                case 993890886: {
                    return this.a;
                }
                case 1554183412: 
            }
            n4 ^= n3 ^ 0xE9CA8812;
            n3 = (n2 | 0x458E28B1) ^ 0x44D2A9B5;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void setValue(String var1_1) {
        block22: {
            var6_2 = 264839740;
            var3_3 = al.b & 264839740 ^ 3915774;
            var5_4 = 0;
            var4_5 = (var3_3 | var6_2) ^ 1540057491;
            var5_4 = (var3_3 | var6_2) ^ -388754515;
            if (true) ** GOTO lbl-1000
            while (true) {
                var4_5 ^= 1048108344;
                v0 = var2_6;
                ** GOTO lbl13
                break;
            }
lbl11:
            // 1 sources

            while (true) {
                v0 = var2_6.substring(0, this.a);
lbl13:
                // 2 sources

                var4_5 ^= 621539616;
                super.setValue(v0);
                var5_4 = (var3_3 | var6_2) ^ 2056658971;
                break block22;
                break;
            }
            block19: while (true) lbl-1000:
            // 5 sources

            {
                block23: {
                    switch (var5_4) {
                        case -416306093: {
                            var5_4 = (var3_3 | var6_2) ^ 1729440862;
                            continue block19;
                        }
                        case 342204799: {
                            v1 = "";
                            ** GOTO lbl40
                        }
                        case -510330472: {
                            if (var1_1 == null) {
                                var5_4 = (var3_3 | var6_2) ^ 1602859323;
                                break;
                            }
                            break block23;
                        }
                        case 1760465824: {
                            var4_5 ^= var5_4 ^ 2038943457;
                            var5_4 = (var3_3 | var6_2) ^ -294697370;
                            break;
                        }
                        case -341590623: {
                            var4_5 ^= var5_4 ^ -361275727;
                            var5_4 = (var3_3 | var6_2) ^ -2101347576;
                            break;
                        }
                        case -1924905738: {
                            v1 = var1_1;
lbl40:
                            // 2 sources

                            var4_5 ^= -553043207;
                            break block19;
                        }
                        case 1349652165: {
                            var4_5 ^= var5_4 ^ 1369894357;
                            ** break;
lbl45:
                            // 1 sources

                            var5_4 = (var3_3 | var6_2) ^ 463347329;
                        }
                    }
                    continue;
                }
                var5_4 = (var3_3 | var6_2) ^ -463994273;
            }
            var2_6 = v1;
            var5_4 = (var3_3 | var6_2) ^ 1677600453;
        }
        block20: while (true) {
            switch (var5_4) {
                default: {
                    continue block20;
                }
                case 1893402550: {
                    if (var2_6.length() <= this.a) ** continue;
                    ** break;
                }
                case 1970118629: {
                    var4_5 ^= var5_4 ^ 374344811;
                    var5_4 = (var3_3 | var6_2) ^ 126050546;
                    continue block20;
                }
                case 142139148: {
                    dm.requestSave();
                    var5_4 = (var3_3 | var6_2) ^ -10750631;
                    continue block20;
                }
                case -257930585: {
                    var4_5 ^= var5_4 ^ -766759372;
                    var5_4 = (var3_3 | var6_2) ^ -1501638796;
                    continue block20;
                }
lbl72:
                // 1 sources

                var4_5 ^= 1048108344;
                ** continue;
                case 1812306235: {
                    var4_5 ^= var5_4 ^ -1949646371;
                    var5_4 = (var3_3 | var6_2) ^ 2132850760;
                    continue block20;
                }
                case -1450872694: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void append(char var1_1) {
        var5_2 = -781818881;
        var2_3 = al.b & -781818881 ^ 236876473;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ -1142047070;
        var4_4 = (var2_3 | var5_2) ^ -989529029;
        if (true) ** GOTO lbl9
        block17: while (true) {
            var4_4 = (var2_3 | var5_2) ^ -143958405;
lbl9:
            // 2 sources

            block18: while (true) {
                switch (var4_4) {
                    case -1677074272: {
                        return;
                    }
                    case -441117758: {
                        var3_5 ^= var4_4 ^ 497578898;
                        ** break;
                    }
                    case -500914429: {
                        this.a = (int[])((String)this.a + var1_1);
                        ** break;
                    }
lbl19:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 1131909983;
                    continue block18;
                    case 444239812: {
                        ** GOTO lbl50
                    }
lbl23:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 986406973;
                    continue block18;
                    case 672476548: {
                        if (Character.isISOControl(var1_1)) {
                            var4_4 = (var2_3 | var5_2) ^ -151401268;
                            continue block18;
                        }
                        ** GOTO lbl46
                    }
                    case 38554275: {
                        var3_5 ^= var4_4 ^ -11353421;
                        var4_4 = (var2_3 | var5_2) ^ 1029362940;
                        continue block18;
                    }
                    case 432611760: {
                        var3_5 ^= var4_4 ^ -1517930470;
                        var4_4 = (var2_3 | var5_2) ^ 569608850;
                        ** GOTO lbl58
                    }
                    case 2136301877: {
                        var3_5 ^= var4_4 ^ -1747054888;
                        var4_4 = (var2_3 | var5_2) ^ -2141335816;
                        continue block18;
                    }
                    case -24250003: {
                        return;
                    }
                    case 737506610: {
                        if (var1_1 != al.sG((var3_5 | var4_4 ^ -91023667) ^ (var4_4 ^ -375440425), (var2_3 | var4_4 ^ -91023667) ^ ((var3_5 | var4_4 ^ -91023667) ^ (var4_4 ^ 152968366)))) ** GOTO lbl62
lbl46:
                        // 2 sources

                        var4_4 = (var2_3 | var5_2) ^ -1607789878;
                        ** GOTO lbl58
                    }
                    case -2081816181: {
                        return;
                    }
lbl50:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -328134216;
                    continue block18;
                    case 856646215: {
                        var3_5 ^= var4_4 ^ -818935078;
                        continue block17;
                    }
                    case 1596177671: {
                        if (((String)this.a).length() >= this.a) ** GOTO lbl60
                        var4_4 = (var2_3 | var5_2) ^ -583911076;
                    }
lbl58:
                    // 4 sources

                    default: {
                        continue block18;
                    }
lbl60:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 1726830212;
                    continue block18;
lbl62:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -961064369;
                    continue block18;
                    case 696762163: {
                        var4_4 = (var2_3 | var5_2) ^ -192215347;
                        continue block18;
                    }
                    case -1181538949: 
                }
                var3_5 ^= var4_4 ^ -1397042278;
                var4_4 = (var2_3 | var5_2) ^ 1553232500;
            }
            break;
        }
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
    public void backspace() {
        var4_1 = -2126827162;
        var1_2 = al.b & -2126827162 ^ 1338624678;
        var3_3 = 0;
        if (true) ** GOTO lbl32
        block9: while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1719464488;
lbl7:
            // 2 sources

            block10: while (true) {
                switch (var3_3) lbl-1000:
                // 6 sources

                {
                    while (true) {
                        default: {
                            continue block10;
                        }
                        break;
                    }
                    case -1257443255: {
                        var2_4 ^= var3_3 ^ 214727415;
                        var3_3 = (var1_2 | var4_1) ^ 705693497;
                        ** GOTO lbl-1000
                    }
lbl16:
                    // 2 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1914797070;
                        ** GOTO lbl-1000
                        break;
                    }
lbl19:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -616481570;
                        ** GOTO lbl-1000
                        break;
                    }
                    case 1083285797: {
                        this.a = (int[])((String)this.a).substring(0, ((String)this.a).length() - 1);
                        ** GOTO lbl16
                    }
                    case -437519137: {
                        if (!((String)this.a).isEmpty()) ** break;
                        ** continue;
                        continue block9;
                    }
                    case 416189012: {
                        var3_3 = (var1_2 | var4_1) ^ 2063010735;
                        ** GOTO lbl-1000
                    }
lbl32:
                    // 1 sources

                    var2_4 = (var1_2 | var4_1) ^ 311998580;
                    break block9;
lbl34:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -1888855357;
                        ** continue;
                        break;
                    }
                    case 347785016: {
                        return;
                    }
                    case 1109751828: {
                        var2_4 ^= var3_3 ^ 697624968;
                        ** continue;
                    }
                    case 1450767934: {
                        ** continue;
                    }
                }
                break;
            }
            break;
        }
        var3_3 = (var1_2 | var4_1) ^ -684363342;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public void clear() {
        block29: {
            block28: {
                var4_1 = -993742477;
                var1_2 = al.b & -993742477 ^ -1037328531;
                var3_3 = 0;
                ** GOTO lbl49
lbl5:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -815064849;
                    ** GOTO lbl28
lbl8:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ 1384351816;
                        break block28;
                        break;
                    }
                    break;
                }
lbl11:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 2116074274;
                    ** GOTO lbl28
lbl14:
                    // 1 sources

                    return;
                }
lbl16:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1991770315;
                    ** GOTO lbl28
lbl19:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1818603790;
                        if (true) ** GOTO lbl28
                        break;
                    }
                    break;
                }
                block22: while (true) {
                    block30: {
                        var3_3 = (var1_2 | var4_1) ^ 2046590068;
                        break block30;
lbl25:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ -1506744163;
                            ** GOTO lbl51
                            break;
                        }
                    }
lbl29:
                    // 4 sources

                    block24: while (true) {
                        switch (var3_3) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                default: {
                                    continue block24;
                                }
                                break;
                            }
                            case 621972354: {
                                ** continue;
                            }
                            case 159688592: {
                                ** continue;
                            }
                            case -1433792911: {
                                break block22;
                            }
                            case -713996515: {
                                ** continue;
                            }
                            case -1089223925: {
                                ** continue;
                            }
                            case -1194392483: {
                                ** continue;
                            }
lbl46:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ -1161883065;
                                ** GOTO lbl-1000
                                break;
                            }
lbl49:
                            // 1 sources

                            var2_4 = (var1_2 | var4_1) ^ 946912348;
                            continue block22;
lbl51:
                            // 1 sources

                            var3_3 = (var1_2 | var4_1) ^ -1683467378;
                            ** continue;
                            case -1336426572: {
                                var2_4 ^= var3_3 ^ 989134491;
                                break block29;
                            }
                            case 2085662008: {
                                var2_4 ^= var3_3 ^ 485642038;
                                break block29;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ -1299378746;
            ** GOTO lbl29
        }
        var3_3 = (var1_2 | var4_1) ^ 329185378;
        ** GOTO lbl29
        {
            case 1564994801: {
                this.a = (int[])"";
                ** continue;
            }
        }
lbl68:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -469945091;
            ** continue;
            break;
        }
        {
            ** case 1952625337:
        }
lbl72:
        // 1 sources

        switch (var2_4) {
            case 1239204693: {
                ** continue;
            }
            case -530518045: {
                ** continue;
            }
            ** default:
lbl78:
            // 1 sources

            ** continue;
        }
    }

    private static int sG(int n2, int n3) {
        int n4 = 247522900;
        int n5 = -225674144;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xE548576F)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xFECC81BD;
        n6 ^= (n5 | n4) ^ 0xFECC0DEE;
        n6 -= (n5 | n4) ^ 0xFECC231C;
        n6 += (n5 | n4) ^ 0xFECC84AC;
        n6 ^= (n5 | n4) ^ 0xFECCD649;
        n6 ^= (n5 | n4) ^ 0xFECCE133;
        return n6 -= (n5 | n4) ^ 0xFECC3823;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public String getDisplayValue() {
        block24: {
            block23: {
                block25: {
                    block22: {
                        block26: {
                            block21: {
                                break block26;
lbl1:
                                // 1 sources

                                while (true) {
                                    if (!((String)this.a).isEmpty()) break block21;
                                    break block22;
                                    break;
                                }
lbl4:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -2109101197;
                                    break block23;
                                    break;
                                }
lbl7:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -231292795;
                                    break block23;
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ -2018982173;
                                    break block23;
                                    break;
                                }
                            }
                            var3_3 = (var1_2 | var4_1) ^ 1824503431;
                            break block23;
lbl16:
                            // 1 sources

                            while (true) {
                                var2_4 ^= var3_3 ^ 601547589;
                                ** continue;
                                break;
                            }
                        }
                        var4_1 = 915687692;
                        var1_2 = al.b & 915687692 ^ 1279932161;
                        var3_3 = 0;
                        var2_4 = (var1_2 | var4_1) ^ 287921213;
                        ** while (true)
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1899782482;
                    break block23;
lbl28:
                    // 1 sources

                    return v0;
lbl30:
                    // 1 sources

                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ 1609281343;
                        break block23;
lbl33:
                        // 1 sources

                        while (true) {
                            v0 = al.a;
                            break block24;
                            break;
                        }
lbl36:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ -678321274;
                            break block25;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        v0 = (String)this.a;
                        break block24;
                        break;
                    }
lbl42:
                    // 1 sources

                    while (true) {
                        var2_4 ^= var3_3 ^ -904760237;
                        ** continue;
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ -1431611200;
            }
            block20: while (true) {
                switch (var3_3) {
                    default: {
                        continue block20;
                    }
                    case -57158530: {
                        ** continue;
                    }
                    case 557174834: {
                        ** continue;
                    }
                    case -109659666: {
                        ** continue;
                    }
                    case 308398474: {
                        ** continue;
                    }
                    case -1930903672: {
                        ** continue;
                    }
                    case -730519603: {
                        ** continue;
                    }
                    ** case 266477151:
lbl65:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        var2_4 ^= 2076726894;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public kd getType() {
        int n2 = b & 0xDA16A787 ^ 0xF890E20D;
        int n3 = 0;
        int n4 = (n2 | 0xDA16A787) ^ 0xAE596084;
        n3 = (n2 | 0xDA16A787) ^ 0xBA157D52;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1082366685: {
                    n3 = (n2 | 0xDA16A787) ^ 0xE1FFA2E1;
                    continue block5;
                }
                case 459883886: {
                    n4 ^= n3 ^ 0x7AA049B7;
                    n3 = (n2 | 0xDA16A787) ^ 0x10519CA8;
                    continue block5;
                }
                case -356025561: 
            }
            break;
        }
        return kd.g;
    }
}

