/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1297
 *  net.minecraft.class_2338
 *  net.minecraft.class_2346
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3486
 *  net.minecraft.class_638
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_2346;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3486;
import net.minecraft.class_638;
import z.r.eP;
import z.r.gJ;
import z.r.gQ;
import z.r.jU;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class jR {
    private int a;
    private static final int b;
    private long a;
    private final List<Long> a;
    private static final int[] a;
    private long b;
    private static final int c;
    private String a;
    private final Map<Long, eP> a;
    public static final int e;
    private static final int d;

    private static int IC(int n2, int n3) {
        int n4 = -196168305;
        int n5 = 1836651485;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xF541621)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xFD7F3037;
        n6 -= (n5 | n4) ^ 0xFD7FFECF;
        n6 -= (n5 | n4) ^ 0xFD7F71B8;
        n6 += (n5 | n4) ^ 0xFD7F805C;
        n6 -= (n5 | n4) ^ 0xFD7F7121;
        n6 += (n5 | n4) ^ 0xFD7F0E8F;
        return n6 ^= (n5 | n4) ^ 0xFD7FB0AB;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public jR() {
        var4_1 = 2144825601;
        var1_2 = jR.e & 2144825601 ^ -752810314;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 520117494;
        var2_4 ^= 347058987;
        super();
        var3_3 = (var1_2 | var4_1) ^ -610226924;
        if (true) ** GOTO lbl11
        block8: while (true) {
            var3_3 = (var1_2 | var4_1) ^ -1206147772;
lbl11:
            // 2 sources

            block9: while (true) {
                switch (var3_3) {
                    default: {
                        continue block9;
                    }
                    case 609737379: {
                        var2_4 ^= var3_3 ^ -1621321280;
                        var3_3 = (var1_2 | var4_1) ^ 409065846;
                        continue block9;
                    }
                    case 1139243842: {
                        this.a = "";
                        return;
                    }
                    case -1468836612: {
                        var2_4 ^= var3_3 ^ -1848608122;
                        var3_3 = (var1_2 | var4_1) ^ -1139798795;
                        continue block9;
                    }
                    case 1883268648: {
                        this.a = (int)new ArrayList<E>();
                        var3_3 = (var1_2 | var4_1) ^ 1468277579;
                        continue block9;
                    }
                    case -409555263: {
                        this.a = (int)new gQ(this, jR.IC((var2_4 | var3_3 ^ -1740513344) ^ (var3_3 ^ 1785394230), (var1_2 | var3_3 ^ -1740513344) ^ ((var2_4 | var3_3 ^ -1740513344) ^ (var3_3 ^ -812385755))), 0.75f, false);
                        continue block8;
                    }
                    case 1206702835: 
                }
                var2_4 ^= var3_3 ^ -2007468973;
                var3_3 = (var1_2 | var4_1) ^ -1883827809;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void resetForWorld(String var1_1) {
        block27: {
            block26: {
                block28: {
                    break block28;
lbl1:
                    // 2 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -1361880724;
                        break block26;
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 549226491;
                        break block26;
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        this.a = var1_1;
                        ** GOTO lbl1
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 328622229;
                        break block26;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        if (!this.a.equals(var1_1)) ** break;
                        ** continue;
                        break block27;
                        break;
                    }
lbl17:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -1955965274;
                        break block26;
                        break;
                    }
lbl20:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 591110812;
                        break block26;
lbl25:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ -690333338;
                            ** continue;
                            break;
                        }
                        break;
                    }
                    this.clear();
                    var4_4 = (var2_3 | var5_2) ^ 1236074757;
                    break block26;
lbl31:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 1601087146;
                        break block26;
                        break;
                    }
lbl34:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_4 ^ -1569743544;
                        ** continue;
                        break;
                    }
lbl37:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -1496101170;
                        break block26;
                        break;
                    }
lbl40:
                    // 1 sources

                    return;
                }
                var5_2 = -1484618880;
                var2_3 = jR.e & -1484618880 ^ -2072238829;
                var4_4 = 0;
                var3_5 = (var2_3 | var5_2) ^ -395348708;
                ** while (true)
lbl48:
                // 1 sources

                while (true) {
                    var3_5 ^= var4_4 ^ 687671805;
                    ** continue;
                    break;
                }
            }
lbl52:
            // 2 sources

            block25: while (true) {
                switch (var4_4) {
                    default: {
                        continue block25;
                    }
                    case -124780231: {
                        ** continue;
                    }
                    case -1268201722: {
                        ** continue;
                    }
                    case -2025709464: {
                        ** continue;
                    }
                    case -2067462897: {
                        ** continue;
                    }
                    case 154009343: {
                        ** continue;
                    }
                    case 19786077: {
                        ** continue;
                    }
                    case 747958581: {
                        ** continue;
                    }
                    case -296507754: {
                        ** continue;
                    }
                    case 1149321282: 
                }
                var3_5 ^= var4_4 ^ -2110787799;
                ** continue;
                break;
            }
        }
        var4_4 = (var2_3 | var5_2) ^ -478156847;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public void clear() {
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
     * Enabled aggressive block sorting
     */
    public long version() {
        int n2 = e & 0x68C93573 ^ 0x2125DE66;
        int n3 = 0;
        int n4 = (n2 | 0x68C93573) ^ 0x3CEE41C;
        n3 = (n2 | 0x68C93573) ^ 0xE480BF6;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1738929281: {
                    n3 = (n2 | 0x68C93573) ^ 0x7379EC62;
                    continue block5;
                }
                case 445911829: {
                    n4 ^= n3 ^ 0xA408EF51;
                    n3 = (n2 | 0x68C93573) ^ 0xE56A2B5A;
                    continue block5;
                }
                case -1937255379: 
            }
            break;
        }
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int markedCount() {
        int n2 = e & 0xD4BEFA94 ^ 0xEB88AAA9;
        int n3 = 0;
        int n4 = (n2 | 0xD4BEFA94) ^ 0xC7BE292;
        n3 = (n2 | 0xD4BEFA94) ^ 0xB002D764;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -983322002: {
                    n4 ^= n3 ^ 0x2443BE27;
                    n3 = (n2 | 0xD4BEFA94) ^ 0x888DED2E;
                    continue block5;
                }
                case 1999837075: {
                    return this.a.size();
                }
                case 1337732569: 
            }
            n3 = (n2 | 0xD4BEFA94) ^ 0x3ADD48D3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public Collection<eP> marked() {
        int n2 = e & 0xAFBC199A ^ 0xF46662AC;
        int n3 = 0;
        int n4 = (n2 | 0xAFBC199A) ^ 0xD84BBD22;
        n3 = (n2 | 0xAFBC199A) ^ 0x4825B78C;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1813706500: {
                    return this.a.values();
                }
                case 1209801551: {
                    n4 ^= n3 ^ 0x5E8AA11A;
                    n3 = (n2 | 0xAFBC199A) ^ 0x93E48CBA;
                    continue block5;
                }
                case -1210332110: 
            }
            n3 = (n2 | 0xAFBC199A) ^ 0xB7E260F1;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void mark(class_2338 var1_1, gJ var2_2, int var3_3) {
        block69: {
            block73: {
                block74: {
                    block67: {
                        block70: {
                            block72: {
                                block68: {
                                    block71: {
                                        var10_4 = 637067184;
                                        var7_5 = jR.e & 637067184 ^ 868052962;
                                        var9_6 = 0;
                                        ** GOTO lbl125
lbl5:
                                        // 10 sources

                                        block36: while (true) {
                                            switch (var9_6) lbl-1000:
                                            // 5 sources

                                            {
                                                while (true) {
                                                    default: {
                                                        continue block36;
                                                    }
                                                    break;
                                                }
                                                case 1992226376: {
                                                    ** GOTO lbl150
                                                }
lbl12:
                                                // 3 sources

                                                while (true) {
                                                    var9_6 = (var7_5 | var10_4) ^ 1250075457;
                                                    break block67;
                                                    break;
                                                }
lbl15:
                                                // 1 sources

                                                while (true) {
                                                    var9_6 = (var7_5 | var10_4) ^ -1593546281;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
lbl18:
                                                // 1 sources

                                                while (true) {
                                                    var9_6 = (var7_5 | var10_4) ^ 1209881332;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
                                                case -763977606: {
                                                    if (!var2_2.dangerous()) {
                                                        break block36;
                                                    }
                                                    break block68;
                                                }
                                                case 196533863: {
                                                    var4_8 = var1_1.method_10063();
                                                    break block69;
                                                }
lbl28:
                                                // 1 sources

                                                while (true) {
                                                    var9_6 = (var7_5 | var10_4) ^ -2085179323;
                                                    break block67;
                                                    break;
                                                }
                                                case -2069625504: {
                                                    break block70;
                                                }
lbl33:
                                                // 1 sources

                                                return;
lbl35:
                                                // 1 sources

                                                while (true) {
                                                    var8_7 ^= var9_6 ^ 315648444;
                                                    ** continue;
                                                    break;
                                                }
lbl38:
                                                // 1 sources

                                                while (true) {
                                                    var9_6 = (var7_5 | var10_4) ^ -2038317839;
                                                    ** GOTO lbl-1000
                                                    break;
                                                }
lbl41:
                                                // 2 sources

                                                while (true) {
                                                    var9_6 = (var7_5 | var10_4) ^ 1322627061;
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        var9_6 = (var7_5 | var10_4) ^ -1285948782;
                                        ** GOTO lbl5
lbl46:
                                        // 1 sources

                                        while (true) {
                                            var9_6 = (var7_5 | var10_4) ^ 626979980;
                                            break block67;
                                            break;
                                        }
lbl49:
                                        // 1 sources

                                        while (true) {
                                            var9_6 = (var7_5 | var10_4) ^ 1011556757;
                                            ** GOTO lbl5
                                            break;
                                        }
lbl52:
                                        // 1 sources

                                        while (true) {
                                            var8_7 ^= var9_6 ^ -895772214;
                                            break block71;
                                            break;
                                        }
lbl55:
                                        // 1 sources

                                        while (true) {
                                            if (var6_9 == null) ** GOTO lbl12
                                            break block72;
                                            break;
                                        }
                                    }
                                    var9_6 = (var7_5 | var10_4) ^ -1122211077;
                                    break block67;
lbl61:
                                    // 1 sources

                                    while (true) {
                                        var9_6 = (var7_5 | var10_4) ^ 1552461532;
                                        break block67;
                                        break;
                                    }
lbl64:
                                    // 1 sources

                                    while (true) {
                                        var9_6 = (var7_5 | var10_4) ^ 1948652027;
                                        ** GOTO lbl5
                                        break;
                                    }
                                    {
                                        case -1317256445: {
                                            ** GOTO lbl130
                                        }
                                    }
lbl69:
                                    // 1 sources

                                    while (true) {
                                        var9_6 = (var7_5 | var10_4) ^ -629153109;
                                        break block67;
                                        break;
                                    }
                                }
                                while (true) {
                                    var9_6 = (var7_5 | var10_4) ^ 1094912442;
                                    ** GOTO lbl5
                                    break;
                                }
lbl76:
                                // 1 sources

                                while (true) {
                                    var9_6 = (var7_5 | var10_4) ^ 1089100217;
                                    ** GOTO lbl5
                                    break;
                                }
                                {
                                    case -1679023340: {
                                        if (var2_2.severity() == jU.e) ** continue;
                                        ** continue;
                                    }
                                }
                            }
                            var9_6 = (var7_5 | var10_4) ^ -1271426782;
                            break block67;
lbl85:
                            // 1 sources

                            while (true) {
                                var9_6 = (var7_5 | var10_4) ^ 1996937401;
                                ** GOTO lbl5
                                break;
                            }
                        }
                        var9_6 = (var7_5 | var10_4) ^ -1408115482;
                        ** GOTO lbl5
lbl91:
                        // 1 sources

                        return;
lbl93:
                        // 1 sources

                        while (true) {
                            if (var6_9.type() != var2_2) ** GOTO lbl12
                            ** GOTO lbl132
                            break;
                        }
lbl96:
                        // 1 sources

                        while (true) {
                            var6_9 = (eP)this.a.get(var4_8);
                            ** continue;
                            break;
                        }
                    }
lbl100:
                    // 4 sources

                    block59: while (true) {
                        switch (var9_6) lbl-1000:
                        // 5 sources

                        {
                            while (true) {
                                default: {
                                    continue block59;
                                }
                                break;
                            }
                            case -2083885360: {
                                break block73;
                            }
                            case 849117836: {
                                ** continue;
                            }
                            case 1605957027: {
                                ** continue;
                            }
                            case -301818544: {
                                ** continue;
                            }
                            case -1446477142: {
                                ** continue;
                            }
                            case -1270132809: {
                                ** continue;
                            }
                            case -1054863526: {
                                ** continue;
                            }
                            case 2105498803: {
                                var8_7 ^= var9_6 ^ -1494788856;
                                ** continue;
                            }
lbl122:
                            // 1 sources

                            while (true) {
                                var9_6 = (var7_5 | var10_4) ^ -1640661672;
                                ** GOTO lbl-1000
                                break;
                            }
lbl125:
                            // 1 sources

                            var8_7 = (var7_5 | var10_4) ^ -1873662128;
                            ** continue;
lbl127:
                            // 1 sources

                            while (true) {
                                var9_6 = (var7_5 | var10_4) ^ -443850872;
                                ** GOTO lbl5
                                break;
                            }
lbl130:
                            // 1 sources

                            var9_6 = (var7_5 | var10_4) ^ -1166485024;
                            ** GOTO lbl5
lbl132:
                            // 1 sources

                            var9_6 = (var7_5 | var10_4) ^ 1887046297;
                            ** GOTO lbl-1000
                            {
                                case 1998038603: {
                                    var8_7 ^= var9_6 ^ -1633987076;
                                    ** GOTO lbl41
                                }
                            }
lbl137:
                            // 1 sources

                            while (true) {
                                var9_6 = (var7_5 | var10_4) ^ 1749355089;
                                ** GOTO lbl-1000
                                break;
                            }
                            {
                                case -1920653806: {
                                    var8_7 ^= var9_6 ^ -1166079225;
                                    ** continue;
                                }
                            }
                            case 312675198: {
                                var8_7 ^= var9_6 ^ 6516476;
                                break block74;
                            }
                            case 1802850606: {
                                this.a.put(var4_8, new eP(var1_1.method_10062(), var2_2, var3_3, ++this.b));
                                break block59;
                            }
lbl150:
                            // 2 sources

                            while (true) {
                                var9_6 = (var7_5 | var10_4) ^ 1882011236;
                                ** continue;
                                break;
                            }
                            case -310239911: {
                                var8_7 ^= var9_6 ^ -379442016;
                                ** continue;
                            }
                            {
                                case 1204865430: {
                                    switch (var8_7) {
                                        case -1873412681: {
                                            ** continue;
                                        }
                                        case 1920918104: {
                                            ** continue;
                                        }
                                        ** default:
lbl163:
                                        // 1 sources

                                        ** continue;
                                    }
                                }
                            }
lbl164:
                            // 1 sources

                            while (true) {
                                var9_6 = (var7_5 | var10_4) ^ -539761471;
                                ** continue;
                                break;
                            }
                            {
                                case 1090201419: {
                                    var8_7 ^= var9_6 ^ -1130441743;
                                    ** continue;
                                }
                            }
                            case -399631565: {
                                if (var6_9.planeY() == var3_3) ** break;
                                ** continue;
                                ** continue;
                            }
                        }
                        break;
                    }
                    var9_6 = (var7_5 | var10_4) ^ -637574494;
                    ** GOTO lbl100
                    {
                        case -1762027995: {
                            var8_7 ^= var9_6 ^ 55165519;
                            ** continue;
                        }
                    }
                    {
                        case -1964927735: {
                            ++this.a;
                            ** continue;
                        }
                    }
                    {
                        case 2145430790: {
                            return;
                        }
                    }
                }
                var9_6 = (var7_5 | var10_4) ^ 90275198;
                ** GOTO lbl100
                {
                    ** case 1200092523:
                }
lbl188:
                // 1 sources

                ** while (true)
            }
            var9_6 = (var7_5 | var10_4) ^ -153227096;
            ** while (true)
        }
        var8_7 ^= 2116136723;
        ** while (true)
        {
            case 2032685063: {
                ** continue;
            }
            ** case 1138486793:
        }
lbl198:
        // 1 sources

        var8_7 ^= var9_6 ^ -1489436787;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public void unmark(class_2338 var1_1) {
        block16: {
            block15: {
                block17: {
                    break block17;
lbl1:
                    // 2 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -1266438375;
                        break block15;
lbl4:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -2134943007;
                            break block15;
                            break;
                        }
                        break;
                    }
                }
                var5_2 = -357998034;
                var2_3 = jR.e & -357998034 ^ -1446862152;
                var4_4 = 0;
                var3_5 = (var2_3 | var5_2) ^ 683269421;
                ** GOTO lbl23
            }
lbl14:
            // 3 sources

            block11: while (true) {
                switch (var4_4) lbl-1000:
                // 4 sources

                {
                    while (true) {
                        default: {
                            continue block11;
                        }
                        break;
                    }
                    case 2044108383: {
                        break block11;
                    }
                    case 1800714335: {
                        break block16;
                    }
lbl23:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -1841464095;
                    ** GOTO lbl-1000
lbl25:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 495029088;
                        ** GOTO lbl-1000
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 1876730716;
                        ** continue;
                        break;
                    }
                    case -1861473791: {
                        var3_5 ^= var4_4 ^ -266792355;
                        ** continue;
                    }
                    case -160798242: {
                        if (this.a.remove(var1_1.method_10063()) == null) ** GOTO lbl1
                        ** continue;
                    }
                    case -2076753438: {
                        return;
                    }
                    case 1600671143: {
                        var3_5 ^= var4_4 ^ 1972393790;
                        ** continue;
                    }
                    case 1299382205: {
                        ++this.a;
                        ** continue;
                    }
                }
                break;
            }
            var4_4 = (var2_3 | var5_2) ^ 2062010559;
            ** GOTO lbl14
        }
        var4_4 = (var2_3 | var5_2) ^ -1499915005;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public gJ markedAt(class_2338 var1_1) {
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
    public void revalidate(class_638 var1_1) {
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
    public static boolean isLoaded(class_638 var0, class_2338 var1_1) {
        var5_2 = -857242376;
        var2_3 = jR.e & -857242376 ^ -1129674948;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ 1762823624;
        var4_4 = (var2_3 | var5_2) ^ -97343518;
        if (true) ** GOTO lbl-1000
        block13: while (true) {
            var4_4 = (var2_3 | var5_2) ^ 1624235121;
            if (true) ** GOTO lbl15
            block14: while (true) {
                var4_4 = (var2_3 | var5_2) ^ 1104225463;
                if (true) ** GOTO lbl15
                block15: while (true) {
                    var4_4 = (var2_3 | var5_2) ^ 230158850;
lbl15:
                    // 3 sources

                    block16: while (true) {
                        switch (var4_4) lbl-1000:
                        // 2 sources

                        {
                            default: {
                                continue block16;
                            }
                            case 1255760787: {
                                var3_5 ^= 1274144483;
                                if (var0.method_31606(var1_1)) continue block15;
                                ** GOTO lbl57
                            }
                            case 2111397653: {
                                v0 = true;
                                ** GOTO lbl44
                            }
                            case -1675601011: {
                                if (var0 == null) continue block15;
                                var4_4 = (var2_3 | var5_2) ^ -351712570;
                                continue block16;
                            }
                            case -1119968437: {
                                var3_5 ^= var4_4 ^ 209082240;
                                var4_4 = (var2_3 | var5_2) ^ -2127111959;
                                continue block16;
                            }
                            case 1581576945: {
                                var3_5 ^= var4_4 ^ 275014149;
                                var4_4 = (var2_3 | var5_2) ^ -677738748;
                                continue block16;
                            }
                            case -245860866: {
                                var3_5 ^= var4_4 ^ 1074823477;
                                var4_4 = (var2_3 | var5_2) ^ -602551527;
                                continue block16;
                            }
                            case 553274597: {
                                v0 = false;
lbl44:
                                // 2 sources

                                var3_5 ^= 1205827172;
                                return v0;
                            }
                            case 115154974: {
                                var4_4 = (var2_3 | var5_2) ^ -266032436;
                                continue block16;
                            }
                            case 729088248: {
                                var3_5 ^= 1310757108;
                                if (var0.method_8393(var1_1.method_10263() >> 4, var1_1.method_10260() >> 4)) ** break;
                                continue block15;
                                continue block14;
                            }
                            case 214641968: {
                                var3_5 ^= var4_4 ^ 518331371;
                                continue block13;
                            }
lbl57:
                            // 1 sources

                            var4_4 = (var2_3 | var5_2) ^ -1565821683;
                            continue block16;
                            case 401001786: 
                        }
                        var3_5 ^= var4_4 ^ 1545022425;
                        var4_4 = (var2_3 | var5_2) ^ -1237916561;
                    }
                    break;
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public gJ classify(class_638 var1_1, class_2338 var2_2) {
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
    static {
        block7: {
            break block7;
lbl1:
            // 1 sources

            while (true) {
                var0_2 ^= -547653895;
                var0_2 ^= -925266554;
                var0_2 ^= -366330936;
                var0_2 ^= 675944158;
                var0_2 ^= -1225257316;
                var0_2 ^= 182647916;
                v0 = var0_2 ^= 1050178566;
                var0_2 ^= 1120076844;
                jR.a[v1] = ((v2[v3] & 255) << 24 | ((v2[v3 + 1] & 255) << 16 | ((v2[v3 + 2] & 255) << 8 | v2[v3 + 3] & 255))) ^ ((v0 | var2) ^ 1399373467 ^ jR.e);
                v1 = v1 + 1;
                v4 = v3 + 4;
                v2 = v2;
                v3 = v4;
                var0_2 ^= 363025587;
                if (v4 < v2.length) continue;
                jR.d = jR.IC(((var0_2 ^= -1089837888) | var2) ^ 1503010487, var2 ^ ((var0_2 | var2) ^ 1664914266));
                jR.c = jR.IC((var0_2 | var2) ^ 1503010486, var2 ^ ((var0_2 | var2) ^ 1502036266));
                jR.b = jR.IC((var0_2 | var2) ^ 1503010489, var2 ^ ((var0_2 | var2) ^ -1014407746));
                return;
            }
        }
        var2 = 704756553;
        jR.e = mK.a(MethodHandles.lookup().lookupClass(), -1133273157);
        var1_1 = 0;
        var0_2 = -1559587618;
        var1_1 = var2 ^ 1903208514;
        block6: while (true) {
            switch (var1_1) {
                default: {
                    continue block6;
                }
                case 1534137099: {
                    var1_1 = var2 ^ 1866633625;
                    continue block6;
                }
                case 1162029776: {
                    var0_2 ^= var1_1 ^ -2015638828;
                    var1_1 = var2 ^ -110357661;
                    continue block6;
                }
                case -747788246: 
            }
            break;
        }
        v1 = 0;
        v3 = 0;
        jR.a = new int[((var0_2 ^= 363211417) | var2) ^ 2117467970];
        var0_2 ^= 1216513157;
        v2 = "0\u00e2\r\u0098\u00cfxH\u00de\u0086\u00d9]5\u008fD\u00c6\u00f1)\u00e4'\u0005\u008b$\u0095\\zGC\u0090@\u00fc\u0081\u00e9\u00da\u00f2\u008dz".getBytes("ISO-8859-1");
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public gJ forExcavation(class_638 var1_1, class_2338 var2_2) {
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
    public int fallingColumnHeight(class_638 var1_1, class_2338 var2_2, int var3_3) {
        var10_4 = 1808883135;
        var7_5 = jR.e & 1808883135 ^ 670775745;
        var9_6 = 0;
        var8_10 = (var7_5 | var10_4) ^ -489496676;
        var9_6 = (var7_5 | var10_4) ^ -1102799541;
        ** GOTO lbl105
lbl7:
        // 1 sources

        while (true) {
            var9_6 = (var7_5 | var10_4) ^ -711755000;
            if (true) ** GOTO lbl16
            break;
        }
        while (true) {
            block36: {
                var9_6 = (var7_5 | var10_4) ^ 1280414295;
                break block36;
lbl13:
                // 1 sources

                while (true) {
                    var5_8 = 1;
                    ** GOTO lbl59
                    break;
                }
lbl16:
                // 2 sources

                block30: while (true) {
                    switch (var9_6) {
                        case -1506156042: {
                            var8_10 ^= var9_6 ^ -2062066035;
                            ** break;
                        }
                        case -1158027363: {
                            if (var1_1.method_8320(var6_9).method_26204() instanceof class_2346) ** GOTO lbl34
                            ** GOTO lbl32
                        }
                        case 1264987985: {
                            var8_10 ^= var9_6 ^ 1263532889;
                            ** GOTO lbl53
                        }
                        case 1772633058: {
                            var8_10 ^= var9_6 ^ 649600437;
                            ** break;
                        }
lbl30:
                        // 1 sources

                        var9_6 = (var7_5 | var10_4) ^ 934223992;
                        ** GOTO lbl49
lbl32:
                        // 1 sources

                        var9_6 = (var7_5 | var10_4) ^ 106120733;
                        ** GOTO lbl49
lbl34:
                        // 1 sources

                        var9_6 = (var7_5 | var10_4) ^ -1451881336;
                        ** GOTO lbl49
                        case 772739027: {
                            var8_10 ^= var9_6 ^ -1678147562;
                            ** GOTO lbl41
                        }
lbl39:
                        // 1 sources

                        var9_6 = (var7_5 | var10_4) ^ 649186245;
                        continue block30;
lbl41:
                        // 1 sources

                        var9_6 = (var7_5 | var10_4) ^ -721249694;
                        continue block30;
                        case 939588417: {
                            var8_10 ^= var9_6 ^ -327264334;
                            ** continue;
                        }
                        case 365140348: {
                            if (!jR.isLoaded(var1_1, var6_9)) ** GOTO lbl51
                            var9_6 = (var7_5 | var10_4) ^ 1106539052;
                        }
lbl49:
                        // 5 sources

                        default: {
                            continue block30;
                        }
lbl51:
                        // 1 sources

                        var9_6 = (var7_5 | var10_4) ^ 1476101822;
                        continue block30;
lbl53:
                        // 1 sources

                        var9_6 = (var7_5 | var10_4) ^ 2050548867;
                        continue block30;
                        case 1229633082: {
                            return var4_7;
                        }
                        case 1481923975: {
                            ++var5_8;
lbl59:
                            // 2 sources

                            var9_6 = (var7_5 | var10_4) ^ 470451906;
                            ** GOTO lbl99
                        }
                        case -1167587593: {
                            return var4_7;
                        }
                        case 187213585: {
                            ++var4_7;
                            var9_6 = (var7_5 | var10_4) ^ -909992951;
                            continue block30;
                        }
                        case -963808905: 
                    }
                    var8_10 ^= var9_6 ^ 670130017;
                    var9_6 = (var7_5 | var10_4) ^ 1691605742;
                    continue;
                    while (true) {
                        var9_6 = (var7_5 | var10_4) ^ -2064470914;
                        if (true) ** GOTO lbl79
                        break;
                    }
                    break;
                }
lbl74:
                // 1 sources

                while (true) {
                    var8_10 ^= 574697222;
                    ** continue;
                    break;
                }
                block33: while (true) {
                    var9_6 = (var7_5 | var10_4) ^ -1473448694;
lbl79:
                    // 2 sources

                    block34: while (true) {
                        switch (var9_6) {
                            case -351678079: {
                                var8_10 ^= var9_6 ^ 2118275753;
                                continue block33;
                            }
                            case -649637771: {
                                var8_10 ^= var9_6 ^ 95746714;
                                ** GOTO lbl94
                            }
                            case -1005943084: {
                                if (var5_8 > var3_3) ** continue;
                                ** break;
                            }
                            case -942176011: {
                                return var4_7;
                            }
lbl92:
                            // 1 sources

                            var9_6 = (var7_5 | var10_4) ^ -1229181558;
                            ** GOTO lbl99
lbl94:
                            // 1 sources

                            var9_6 = (var7_5 | var10_4) ^ -1819005601;
                            ** GOTO lbl99
                            case 1945238333: {
                                var8_10 ^= var9_6 ^ -661677198;
                                var9_6 = (var7_5 | var10_4) ^ -1410204885;
                            }
lbl99:
                            // 5 sources

                            default: {
                                continue block34;
                            }
                            case -59813728: 
                        }
                        break;
                    }
                    break;
                }
                var6_9 = var2_2.method_10086(var5_8);
                var9_6 = (var7_5 | var10_4) ^ 614290094;
                ** continue;
            }
            block35: while (true) {
                switch (var9_6) {
                    default: {
                        continue block35;
                    }
                    case 598405032: {
                        var4_7 = 0;
                        ** continue;
                    }
                    case -775954252: {
                        var9_6 = (var7_5 | var10_4) ^ 1859509034;
                        continue block35;
                    }
                    case 19834581: 
                }
                break;
            }
            var8_10 ^= var9_6 ^ -454945077;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public int dropDepth(class_638 var1_1, class_2338 var2_2) {
        block61: {
            block62: {
                var9_3 = -917828440;
                var6_4 = jR.e & -917828440 ^ -857885378;
                var8_5 = 0;
                var7_9 = (var6_4 | var9_3) ^ 1076438795;
                var8_5 = (var6_4 | var9_3) ^ 1990145918;
                break block62;
lbl7:
                // 1 sources

                while (true) {
                    var8_5 = (var6_4 | var9_3) ^ -538425137;
                    break block61;
lbl10:
                    // 1 sources

                    while (true) {
                        var8_5 = (var6_4 | var9_3) ^ 479508750;
                        break block61;
                        while (true) {
                            var8_5 = (var6_4 | var9_3) ^ 2126351094;
                            break block61;
                            break;
                        }
                        break;
                    }
lbl16:
                    // 1 sources

                    while (true) {
                        var8_5 = (var6_4 | var9_3) ^ 1184625686;
                        ** GOTO lbl68
                        break;
                    }
lbl19:
                    // 1 sources

                    while (true) {
                        var8_5 = (var6_4 | var9_3) ^ 439800631;
                        break block61;
lbl-1000:
                        // 6 sources

                        {
                            switch (var8_5) {
                                case -1142626528: {
                                    if (!jR.isLoaded(var1_1, var4_7)) {
                                        ** break;
                                    }
                                    ** GOTO lbl35
                                }
                                case -1257730067: {
                                    var5_8 = var1_1.method_8320(var4_7);
                                    ** GOTO lbl42
                                }
lbl30:
                                // 1 sources

                                var8_5 = (var6_4 | var9_3) ^ 359800259;
                                continue block42;
                                case -1331433294: {
                                    var7_9 ^= var8_5 ^ -1271251319;
                                    ** GOTO lbl37
                                }
lbl35:
                                // 1 sources

                                var8_5 = (var6_4 | var9_3) ^ 190305468;
                                continue block42;
lbl37:
                                // 1 sources

                                var8_5 = (var6_4 | var9_3) ^ 1983601310;
                                continue block42;
                                case -964138750: {
                                    var7_9 ^= var8_5 ^ 204363845;
                                    ** GOTO lbl48
                                }
lbl42:
                                // 1 sources

                                var8_5 = (var6_4 | var9_3) ^ -924642328;
                                break block61;
                                case -659709827: {
                                    var7_9 ^= var8_5 ^ 192863185;
                                    var8_5 = (var6_4 | var9_3) ^ 1779137233;
                                    continue block42;
                                }
lbl48:
                                // 1 sources

                                var8_5 = (var6_4 | var9_3) ^ 2027369043;
                                continue block42;
                                case -1479227537: {
                                    return jR.IC((var7_9 | var8_5 ^ 1855966151) ^ (var8_5 ^ -1174353607), (var6_4 | var8_5 ^ 1855966151) ^ ((var7_9 | var8_5 ^ 1855966151) ^ (var8_5 ^ 309851169)));
                                }
                            }
lbl52:
                            // 2 sources

                            ** while (true)
                        }
                        break;
                    }
lbl53:
                    // 1 sources

                    while (true) {
                        var8_5 = (var6_4 | var9_3) ^ 1170328242;
                        break block61;
                        break;
                    }
lbl56:
                    // 1 sources

                    while (true) {
                        var8_5 = (var6_4 | var9_3) ^ 1782159613;
                        break block61;
                        while (true) {
                            var8_5 = (var6_4 | var9_3) ^ -100743599;
                            ** GOTO lbl68
lbl62:
                            // 1 sources

                            while (true) {
                                var8_5 = (var6_4 | var9_3) ^ 2105298188;
                                ** GOTO lbl52
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
lbl65:
                // 1 sources

                while (true) {
                    var8_5 = (var6_4 | var9_3) ^ 1532234290;
                    break block61;
lbl68:
                    // 2 sources

                    block49: while (true) {
                        switch (var8_5) {
                            case 874609647: {
                                var7_9 ^= var8_5 ^ -264072479;
                                ** break;
                            }
                            case 586701293: {
                                var7_9 ^= var8_5 ^ -1652842315;
                                ** GOTO lbl78
                            }
lbl76:
                            // 1 sources

                            var8_5 = (var6_4 | var9_3) ^ 1980163490;
                            ** GOTO lbl89
lbl78:
                            // 1 sources

                            var8_5 = (var6_4 | var9_3) ^ 1954233019;
                            ** GOTO lbl89
                            case 342336602: {
                                var7_9 ^= var8_5 ^ 1352791350;
                                ** continue;
                            }
                            case -1143384036: {
                                var4_7 = var2_2.method_10087(var3_6);
                                ** continue;
                            }
                            case -1180399867: {
                                if (var3_6 <= jR.IC((var7_9 | var8_5 ^ 1894747053) ^ (var8_5 ^ -1236215485), (var6_4 | var8_5 ^ 1894747053) ^ ((var7_9 | var8_5 ^ 1894747053) ^ (var8_5 ^ -1749398276)))) ** continue;
                                var8_5 = (var6_4 | var9_3) ^ -642246172;
                            }
lbl89:
                            // 5 sources

                            default: {
                                continue block49;
                            }
lbl91:
                            // 1 sources

                            while (true) {
                                var8_5 = (var6_4 | var9_3) ^ 889187173;
                                break block62;
                                break;
                            }
                            while (true) {
                                var8_5 = (var6_4 | var9_3) ^ -305295750;
                                break block61;
                                break;
                            }
                            case -1958458968: 
                        }
                        break;
                    }
                    break;
                }
                return jR.IC((var7_9 | var8_5 ^ 1108296960) ^ (var8_5 ^ -2144057683), (var6_4 | var8_5 ^ 1108296960) ^ ((var7_9 | var8_5 ^ 1108296960) ^ (var8_5 ^ 740501528)));
lbl99:
                // 2 sources

                while (true) {
                    var8_5 = (var6_4 | var9_3) ^ -282598317;
                    ** GOTO lbl89
                    break;
                }
lbl102:
                // 1 sources

                while (true) {
                    var8_5 = (var6_4 | var9_3) ^ 984820613;
                    break block61;
                    break;
                }
            }
            block55: while (true) {
                switch (var8_5) {
                    default: {
                        continue block55;
                    }
                    case -115321125: {
                        var3_6 = 1;
                        ** GOTO lbl99
                    }
                    case 1187189922: {
                        var7_9 ^= var8_5 ^ 157387997;
                        ** continue;
                    }
                    case -1153398080: 
                }
                var8_5 = (var6_4 | var9_3) ^ -1961055972;
            }
lbl119:
            // 1 sources

            while (true) {
                var8_5 = (var6_4 | var9_3) ^ 1220148983;
                break block61;
                break;
            }
lbl122:
            // 2 sources

            while (true) {
                var7_9 ^= 1939257437;
                return v0;
            }
        }
        block58: while (true) {
            switch (var8_5) {
                default: {
                    continue block58;
                }
                case -1478089405: {
                    if (!var5_8.method_26227().method_15767(class_3486.field_15518)) ** continue;
                    ** continue;
                }
                case -143878597: {
                    var7_9 ^= var8_5 ^ -207273203;
                    ** continue;
                }
                case 1669130830: {
                    if (var5_8.method_51366()) {
                        ** continue;
                    }
                    ** GOTO lbl169
                }
                case -672567671: {
                    ++var3_6;
                    ** continue;
                }
                case 305657201: {
                    v0 = var3_6 - 1;
                    ** GOTO lbl122
                }
                case 538063812: {
                    var7_9 ^= var8_5 ^ 1167875565;
                    var8_5 = (var6_4 | var9_3) ^ -1365026832;
                    continue block58;
                }
                case -827176427: {
                    var7_9 ^= var8_5 ^ 1130606809;
                    ** continue;
                }
                case -2011269364: {
                    if (var5_8.method_26227().method_15769()) ** continue;
                    var8_5 = (var6_4 | var9_3) ^ -55683744;
                    continue block58;
                }
                case 87862870: {
                    var7_9 ^= var8_5 ^ 1488770457;
                    ** continue;
                }
                case -2056895671: {
                    v0 = jR.IC((var7_9 | var8_5 ^ 1278037985) ^ (var8_5 ^ -1440571880), (var6_4 | var8_5 ^ 1278037985) ^ ((var7_9 | var8_5 ^ 1278037985) ^ (var8_5 ^ -1527430412)));
                    ** continue;
                }
                case 829548766: {
                    var7_9 ^= var8_5 ^ -2086674452;
                    ** continue;
                }
                case -1285408952: {
                    var7_9 ^= var8_5 ^ -1213472130;
                    ** continue;
                }
lbl169:
                // 1 sources

                var8_5 = (var6_4 | var9_3) ^ 57538475;
                continue block58;
                case -783612752: {
                    var7_9 ^= var8_5 ^ 1895024641;
                    ** continue;
                }
                case -1769228404: 
            }
            break;
        }
        return var3_6 - 1;
    }

    /*
     * Unable to fully structure code
     */
    public boolean hasWalkingSurface(class_638 var1_1, class_2338 var2_2) {
        block47: {
            block46: {
                block45: {
                    var8_3 = -1765018188;
                    var5_4 = jR.e & -1765018188 ^ -213760551;
                    var7_5 = 0;
                    ** GOTO lbl26
lbl5:
                    // 1 sources

                    while (true) {
                        var6_7 ^= var7_5 ^ -763925168;
                        ** GOTO lbl81
                        break;
                    }
lbl8:
                    // 1 sources

                    while (true) {
                        v0 = true;
                        ** GOTO lbl70
                        break;
                    }
lbl11:
                    // 1 sources

                    while (true) {
                        var6_7 ^= var7_5 ^ -1792790048;
                        ** GOTO lbl86
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var7_5 = (var5_4 | var8_3) ^ 1087060340;
                        ** GOTO lbl40
                        break;
                    }
lbl17:
                    // 3 sources

                    block27: while (true) {
                        switch (var7_5) lbl-1000:
                        // 6 sources

                        {
                            while (true) {
                                default: {
                                    continue block27;
                                }
                                break;
                            }
                            case 1678745709: {
                                ** continue;
                            }
                            case 1938325193: {
                                ** continue;
                            }
lbl26:
                            // 1 sources

                            var6_7 = (var5_4 | var8_3) ^ -246493841;
                            ** continue;
                            case -241392090: {
                                var6_7 ^= var7_5 ^ 1736796882;
                                break block45;
                            }
lbl31:
                            // 1 sources

                            while (!jR.isLoaded(var1_1, var3_6)) {
                                ** GOTO lbl76
                            }
                            ** GOTO lbl114
lbl34:
                            // 1 sources

                            while (true) {
                                var7_5 = (var5_4 | var8_3) ^ 385143304;
                                ** GOTO lbl-1000
                                break;
                            }
lbl37:
                            // 1 sources

                            while (true) {
                                var7_5 = (var5_4 | var8_3) ^ 178353084;
                                ** GOTO lbl89
                                break;
                            }
lbl40:
                            // 2 sources

                            block32: while (true) {
                                switch (var7_5) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block32;
                                        }
                                        break;
                                    }
                                    case -1224684407: {
                                        break block32;
                                    }
lbl47:
                                    // 1 sources

                                    while (true) {
                                        var7_5 = (var5_4 | var8_3) ^ 1242900372;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl50:
                                    // 1 sources

                                    return false;
lbl52:
                                    // 1 sources

                                    while (true) {
                                        var6_7 ^= var7_5 ^ -1453145567;
                                        ** continue;
                                        break;
                                    }
lbl55:
                                    // 1 sources

                                    while (true) {
                                        var7_5 = (var5_4 | var8_3) ^ -1938454276;
                                        ** continue;
                                        break;
                                    }
                                    case 555026529: {
                                        var6_7 ^= var7_5 ^ -1669084369;
                                        ** continue;
                                    }
                                    case -515954699: {
                                        if (var4_8.method_26227().method_15769()) {
                                            ** continue;
                                        }
                                        break block46;
                                    }
                                }
                                break;
                            }
                            var7_5 = (var5_4 | var8_3) ^ -690029156;
                            ** continue;
                            case -1109470615: {
                                var6_7 ^= var7_5 ^ 1534238016;
                                break block27;
                            }
lbl70:
                            // 2 sources

                            while (true) {
                                var6_7 ^= 195609645;
                                break block47;
                                break;
                            }
lbl73:
                            // 1 sources

                            while (true) {
                                var6_7 ^= var7_5 ^ 245327707;
                                ** GOTO lbl88
                                break;
                            }
lbl76:
                            // 1 sources

                            var7_5 = (var5_4 | var8_3) ^ -1380058980;
                            ** GOTO lbl89
lbl78:
                            // 1 sources

                            while (true) {
                                var7_5 = (var5_4 | var8_3) ^ 492260586;
                                ** GOTO lbl-1000
                                break;
                            }
lbl81:
                            // 1 sources

                            var7_5 = (var5_4 | var8_3) ^ -1718317045;
                            ** GOTO lbl89
lbl83:
                            // 1 sources

                            while (true) {
                                var7_5 = (var5_4 | var8_3) ^ -1000209849;
                                ** GOTO lbl89
                                break;
                            }
lbl86:
                            // 1 sources

                            var7_5 = (var5_4 | var8_3) ^ -1661520709;
                            ** GOTO lbl-1000
lbl88:
                            // 1 sources

                            var7_5 = (var5_4 | var8_3) ^ 1891318137;
lbl89:
                            // 6 sources

                            block42: while (true) {
                                switch (var7_5) {
                                    default: {
                                        continue block42;
                                    }
                                    case 866777018: {
                                        ** continue;
                                    }
                                    case 1851745782: {
                                        ** GOTO lbl31
                                    }
                                    case -2022650748: {
                                        ** continue;
                                    }
                                    case 1219499843: {
                                        ** continue;
                                    }
                                    case 1517686113: {
                                        ** continue;
                                    }
                                    case -43350463: 
                                }
                                ** GOTO lbl107
                                break;
                            }
                            case -358827753: {
                                ** continue;
                            }
lbl107:
                            // 1 sources

                            var4_8 = var1_1.method_8320(var3_6);
                            var7_5 = (var5_4 | var8_3) ^ 106386395;
                            ** continue;
                            case 614933334: {
                                if (var4_8.method_51366()) {
                                    ** continue;
                                }
                                break block46;
                            }
lbl114:
                            // 1 sources

                            var7_5 = (var5_4 | var8_3) ^ -1082400066;
                            ** continue;
                        }
                        break;
                    }
                    var7_5 = (var5_4 | var8_3) ^ -1815849584;
                    ** GOTO lbl17
                }
                var7_5 = (var5_4 | var8_3) ^ -747841877;
                ** GOTO lbl17
            }
            var7_5 = (var5_4 | var8_3) ^ -2075948236;
            ** while (true)
            {
                ** case 1799143750:
            }
lbl125:
            // 1 sources

            v0 = false;
            ** while (true)
        }
        return v0;
        {
            ** case 2076081409:
        }
lbl130:
        // 1 sources

        var3_6 = var2_2.method_10074();
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean playerFits(class_638 var1_1, class_2338 var2_2) {
        var13_3 = -1731129577;
        var10_4 = jR.e & -1731129577 ^ 467577293;
        var12_5 = 0;
        var11_7 = (var10_4 | var13_3) ^ 449850062;
        var12_5 = (var10_4 | var13_3) ^ -1486424331;
        ** GOTO lbl118
        {
            var12_5 = (var10_4 | var13_3) ^ -1647184524;
            if (true) ** GOTO lbl28
            block30: while (true) {
                var12_5 = (var10_4 | var13_3) ^ -1931226604;
                if (true) ** GOTO lbl28
lbl12:
                // 1 sources

                while (true) {
                    var11_7 ^= -280391734;
                    var6_12 = (double)var4_10 / 2.0 - 0.001;
                    var11_7 ^= -722925108;
                    var8_13 = new class_243((double)var2_2.method_10263() + 0.5, (double)var2_2.method_10264() + 0.001, (double)var2_2.method_10260() + 0.5);
                    var11_7 ^= 1022819213;
                    var9_8 = new class_238(var8_13.field_1352 - var6_12, var8_13.field_1351, var8_13.field_1350 - var6_12, var8_13.field_1352 + var6_12, var8_13.field_1351 + (double)var5_11, var8_13.field_1350 + var6_12);
                    var11_7 ^= -1308951401;
                    return var1_1.method_8587((class_1297)var3_6.field_1724, var9_8);
                }
                block32: while (true) {
                    block40: {
                        var12_5 = (var10_4 | var13_3) ^ 926122573;
                        break block40;
lbl24:
                        // 1 sources

                        while (true) {
                            var11_7 ^= -1671239239;
                            var5_11 = var3_6.field_1724.method_17682();
                            ** continue;
                            break;
                        }
                    }
                    block34: while (true) {
                        switch (var12_5) {
                            case 389840331: {
                                var11_7 ^= var12_5 ^ 2108529628;
                                ** break;
                            }
                            case -1686804127: {
                                var11_7 ^= var12_5 ^ 175611016;
                                ** GOTO lbl46
                            }
                            case 101604011: {
                                var11_7 ^= var12_5 ^ -1831816455;
                                ** GOTO lbl62
                            }
lbl40:
                            // 1 sources

                            var12_5 = (var10_4 | var13_3) ^ 616982866;
                            ** GOTO lbl69
                            case 873836620: {
                                if (jR.isLoaded(var1_1, var2_2.method_10086(var4_9))) ** GOTO lbl64
                                var12_5 = (var10_4 | var13_3) ^ 1840969704;
                                ** GOTO lbl69
                            }
lbl46:
                            // 1 sources

                            var12_5 = (var10_4 | var13_3) ^ -1638308620;
                            ** GOTO lbl69
                            case -161130441: {
                                var11_7 ^= var12_5 ^ 1437173262;
                                ** break;
                            }
                            case -1088829811: {
                                var4_10 = var3_6.field_1724.method_17681();
                                ** continue;
                            }
lbl54:
                            // 1 sources

                            var12_5 = (var10_4 | var13_3) ^ -1815640237;
                            continue block34;
                            case -1235593702: {
                                var11_7 ^= var12_5 ^ -1283044447;
                                continue block32;
                            }
                            case -1393807982: {
                                if (var4_9 >= 2) continue block30;
                                continue block29;
                            }
lbl62:
                            // 1 sources

                            var12_5 = (var10_4 | var13_3) ^ -1345708141;
                            continue block34;
lbl64:
                            // 1 sources

                            var12_5 = (var10_4 | var13_3) ^ 11191998;
                            continue block34;
                            case 92719915: {
                                ++var4_9;
                                if (true) ** GOTO lbl85
                            }
lbl69:
                            // 5 sources

                            default: {
                                continue block34;
                            }
                            case 135800972: 
                        }
                        break;
                    }
                    break;
                }
                break;
            }
        }
        return false;
        block36: while (true) {
            switch (var12_5) {
                case 191365433: {
                    var11_7 ^= var12_5 ^ 86503019;
                    ** GOTO lbl101
                }
                case -1558542969: {
                    ** GOTO lbl103
                }
                case -547823188: {
                    var11_7 ^= var12_5 ^ 1196553845;
                    ** break;
                }
                case -763979317: {
                    var4_9 = 0;
lbl85:
                    // 2 sources

                    var12_5 = (var10_4 | var13_3) ^ 763754949;
                    ** GOTO lbl69
                }
                case 1811615739: {
                    var11_7 ^= var12_5 ^ 160615189;
                    ** GOTO lbl99
                }
                case -1405918139: {
                    var12_5 = (var10_4 | var13_3) ^ -1593642442;
                    continue block36;
                }
lbl93:
                // 1 sources

                var12_5 = (var10_4 | var13_3) ^ -2005719339;
                default: {
                    continue block36;
                }
                case 330074378: {
                    if (var3_6 == null) ** GOTO lbl116
                    ** GOTO lbl105
                }
lbl99:
                // 1 sources

                var12_5 = (var10_4 | var13_3) ^ 1235826196;
                continue block36;
lbl101:
                // 1 sources

                var12_5 = (var10_4 | var13_3) ^ 142671125;
                continue block36;
lbl103:
                // 1 sources

                var12_5 = (var10_4 | var13_3) ^ -778721263;
                continue block36;
lbl105:
                // 1 sources

                var12_5 = (var10_4 | var13_3) ^ 938265498;
                continue block36;
                case 1246365646: {
                    if (var1_1 != null) {
                        var12_5 = (var10_4 | var13_3) ^ -266035164;
                        continue block36;
                    }
                    ** GOTO lbl116
                }
                case 987586025: {
                    if (var3_6.field_1724 != null) {
                        var12_5 = (var10_4 | var13_3) ^ 952445528;
                        continue block36;
                    }
lbl116:
                    // 4 sources

                    var12_5 = (var10_4 | var13_3) ^ -1867010330;
                    continue block36;
                }
lbl118:
                // 1 sources

                block37: while (true) {
                    switch (var12_5) {
                        default: {
                            continue block37;
                        }
                        case 1018779946: {
                            var12_5 = (var10_4 | var13_3) ^ -1983347146;
                            continue block37;
                        }
                        case -1819198056: {
                            var3_6 = class_310.method_1551();
                            var12_5 = (var10_4 | var13_3) ^ 1149718131;
                            continue block36;
                        }
                        case 303507945: 
                    }
                    var11_7 ^= var12_5 ^ 931913524;
                    var12_5 = (var10_4 | var13_3) ^ 139366983;
                }
                case -1822469430: 
            }
            break;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean isClear(class_638 var1_1, class_2338 var2_2) {
        var7_3 = 1830521286;
        var4_4 = jR.e & 1830521286 ^ -554673676;
        var6_5 = 0;
        var5_6 = (var4_4 | var7_3) ^ 1393280540;
        var6_5 = (var4_4 | var7_3) ^ 528773841;
        ** GOTO lbl74
lbl7:
        // 1 sources

        while (true) {
            var6_5 = (var4_4 | var7_3) ^ 1908748460;
            ** GOTO lbl74
            {
                var6_5 = (var4_4 | var7_3) ^ -2101488336;
                block23: while (true) {
                    switch (var6_5) {
                        case -1348244055: {
                            var5_6 ^= var6_5 ^ -128679062;
                            var6_5 = (var4_4 | var7_3) ^ 1359781003;
                            continue block23;
                        }
                        case -2004976509: {
                            var5_6 ^= var6_5 ^ -544632256;
                            ** GOTO lbl37
                        }
                        case -1207077762: {
                            var5_6 ^= var6_5 ^ -897033801;
                            ** GOTO lbl51
                        }
                        case -1801876700: {
                            if (!var3_7.method_51366()) {
                                ** break;
                            }
                            ** GOTO lbl45
                        }
                        case 2101742790: {
                            if (!var3_7.method_26227().method_15769()) {
                                var6_5 = (var4_4 | var7_3) ^ 856496472;
                                continue block23;
                            }
                            ** GOTO lbl49
                        }
                        case -1359526531: {
                            v0 = false;
                            ** GOTO lbl54
                        }
lbl35:
                        // 1 sources

                        var6_5 = (var4_4 | var7_3) ^ 2005247349;
                        ** GOTO lbl52
lbl37:
                        // 1 sources

                        var6_5 = (var4_4 | var7_3) ^ 1485838284;
                        ** GOTO lbl52
                        case 635828925: {
                            var5_6 ^= var6_5 ^ -1912835986;
                            continue block22;
                        }
                        case -1486107078: {
                            v0 = true;
                            ** GOTO lbl54
                        }
lbl45:
                        // 1 sources

                        var6_5 = (var4_4 | var7_3) ^ 1347990623;
                        ** GOTO lbl52
                        case 189567604: {
                            return false;
                        }
lbl49:
                        // 1 sources

                        var6_5 = (var4_4 | var7_3) ^ 1207348616;
                        ** GOTO lbl52
lbl51:
                        // 1 sources

                        var6_5 = (var4_4 | var7_3) ^ 1801605842;
lbl52:
                        // 7 sources

                        default: {
                            continue block23;
                        }
lbl54:
                        // 2 sources

                        var5_6 ^= 638697529;
                        return v0;
                        case -856244050: 
                    }
                    var5_6 ^= var6_5 ^ 1608740269;
                    var6_5 = (var4_4 | var7_3) ^ -189314174;
                }
            }
lbl60:
            // 1 sources

            while (true) {
                var6_5 = (var4_4 | var7_3) ^ 1707859445;
                ** GOTO lbl74
lbl63:
                // 1 sources

                while (true) {
                    var6_5 = (var4_4 | var7_3) ^ -635559093;
                    ** GOTO lbl52
                    break;
                }
                while (true) {
                    var6_5 = (var4_4 | var7_3) ^ -659960622;
                    ** GOTO lbl74
lbl69:
                    // 1 sources

                    while (true) {
                        var6_5 = (var4_4 | var7_3) ^ -1190629664;
                        if (true) ** GOTO lbl74
                        break;
                    }
                    break;
                }
                break;
            }
            break;
        }
        while (true) {
            var6_5 = (var4_4 | var7_3) ^ 189081521;
lbl74:
            // 6 sources

            block30: while (true) {
                switch (var6_5) {
                    default: {
                        continue block30;
                    }
                    case 659690788: {
                        var5_6 ^= var6_5 ^ -1593873923;
                        ** continue;
                    }
                    case 1190377238: {
                        var3_7 = var1_1.method_8320(var2_2);
                        ** continue;
                    }
                    case -188809657: {
                        if (jR.isLoaded(var1_1, var2_2)) ** continue;
                        ** continue;
                    }
                    case -528504025: {
                        var6_5 = (var4_4 | var7_3) ^ -32340223;
                        continue block30;
                    }
                    case -1908479654: {
                        return false;
                    }
                    case -1708129277: {
                        var5_6 ^= var6_5 ^ -785175606;
                        ** continue;
                    }
                    case 32071415: 
                }
                break;
            }
            var5_6 ^= var6_5 ^ 1311456599;
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean needsMining(class_638 var1_1, class_2338 var2_2) {
        block46: {
            block54: {
                block49: {
                    block47: {
                        block53: {
                            block52: {
                                block51: {
                                    block45: {
                                        block48: {
                                            block50: {
                                                break block53;
lbl1:
                                                // 1 sources

                                                while (true) {
                                                    if (var3_6.method_51366()) break block45;
                                                    break block46;
                                                    break;
                                                }
lbl4:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl6:
                                                // 1 sources

                                                while (true) {
                                                    var6_5 = (var4_4 | var7_3) ^ 630025982;
                                                    break block47;
                                                    break;
                                                }
lbl9:
                                                // 1 sources

                                                while (!jR.isLoaded(var1_1, var2_2)) {
                                                    break block48;
                                                }
                                                break block54;
lbl12:
                                                // 1 sources

                                                while (true) {
                                                    var6_5 = (var4_4 | var7_3) ^ 695088311;
                                                    break block49;
                                                    break;
                                                }
lbl15:
                                                // 1 sources

                                                while (true) {
                                                    var5_7 ^= var6_5 ^ -883718222;
                                                    break block50;
                                                    break;
                                                }
lbl18:
                                                // 1 sources

                                                return v0;
                                            }
                                            var6_5 = (var4_4 | var7_3) ^ 1709489535;
                                            break block49;
lbl23:
                                            // 1 sources

                                            while (true) {
                                                var5_7 ^= var6_5 ^ -2123576855;
                                                ** continue;
                                                break;
                                            }
lbl26:
                                            // 1 sources

                                            while (true) {
                                                var5_7 ^= var6_5 ^ 15350582;
                                                break block51;
                                                break;
                                            }
lbl29:
                                            // 1 sources

                                            while (true) {
                                                var6_5 = (var4_4 | var7_3) ^ 739085717;
                                                break block47;
                                                break;
                                            }
                                        }
                                        var6_5 = (var4_4 | var7_3) ^ 640552485;
                                        break block47;
                                    }
lbl36:
                                    // 2 sources

                                    while (true) {
                                        var6_5 = (var4_4 | var7_3) ^ -1279183202;
                                        break block49;
                                        break;
                                    }
lbl39:
                                    // 1 sources

                                    while (true) {
                                        if (var3_6.method_26227().method_15769()) break block52;
                                        ** continue;
                                        break;
                                    }
lbl42:
                                    // 1 sources

                                    while (true) {
                                        var5_7 ^= var6_5 ^ 1306297952;
                                        ** GOTO lbl99
                                        break;
                                    }
                                }
                                var6_5 = (var4_4 | var7_3) ^ 405507463;
                                break block47;
                            }
                            while (true) {
                                var6_5 = (var4_4 | var7_3) ^ 2138142999;
                                break block49;
lbl52:
                                // 1 sources

                                while (true) {
                                    v0 = false;
lbl54:
                                    // 2 sources

                                    while (true) {
                                        var5_7 ^= -1117931780;
                                        ** continue;
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
lbl57:
                            // 1 sources

                            while (true) {
                                var5_7 ^= var6_5 ^ -1845397135;
                                ** continue;
                                break;
                            }
lbl60:
                            // 1 sources

                            while (true) {
                                var6_5 = (var4_4 | var7_3) ^ 2015873551;
                                break block47;
                                break;
                            }
                        }
                        var7_3 = -911981653;
                        var4_4 = jR.e & -911981653 ^ 2011584572;
                        var6_5 = 0;
                        var5_7 = (var4_4 | var7_3) ^ -1487830724;
                        ** GOTO lbl97
                        var3_6 = var1_1.method_8320(var2_2);
                        var6_5 = (var4_4 | var7_3) ^ -1014928109;
                        break block49;
lbl72:
                        // 1 sources

                        while (true) {
                            v0 = true;
                            ** continue;
                            break;
                        }
lbl75:
                        // 1 sources

                        while (true) {
                            var6_5 = (var4_4 | var7_3) ^ -2137651273;
                            break block49;
lbl78:
                            // 1 sources

                            while (true) {
                                var6_5 = (var4_4 | var7_3) ^ -2059642526;
                                break block49;
                                break;
                            }
                            break;
                        }
                    }
lbl82:
                    // 2 sources

                    block42: while (true) {
                        switch (var6_5) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block42;
                                }
                                break;
                            }
                            case -2017357392: {
                                ** continue;
                            }
                            case -630508223: {
                                ** GOTO lbl9
                            }
                            case -641182310: {
                                ** continue;
                            }
                            case -231122641: {
                                ** continue;
                            }
                            case -739518934: {
                                ** continue;
                            }
lbl97:
                            // 1 sources

                            var6_5 = (var4_4 | var7_3) ^ 232718992;
                            ** continue;
lbl99:
                            // 1 sources

                            var6_5 = (var4_4 | var7_3) ^ 2031646638;
                            break block49;
                            case -405940680: {
                                return false;
                            }
                            case 1172095780: 
                        }
                        break;
                    }
                    var5_7 ^= var6_5 ^ 713679357;
                    ** while (true)
                }
lbl107:
                // 3 sources

                block44: while (true) {
                    switch (var6_5) {
                        default: {
                            continue block44;
                        }
                        case 2061107933: {
                            ** continue;
                        }
                        case 1013397164: {
                            ** continue;
                        }
                        case -2137578840: {
                            ** continue;
                        }
                        case 835041917: {
                            ** continue;
                        }
                        case 2138070024: {
                            ** continue;
                        }
                        case 1277652257: {
                            ** continue;
                        }
                        case -695701752: {
                            ** continue;
                        }
                        case -2030162927: {
                            ** continue;
                        }
                        case 1226781514: {
                            ** continue;
                        }
                        case -1711085888: {
                            if (var3_6.method_26215()) ** continue;
                        }
                    }
                    break;
                }
            }
            var6_5 = (var4_4 | var7_3) ^ -1170564965;
            ** while (true)
            var6_5 = (var4_4 | var7_3) ^ -836509246;
            ** GOTO lbl107
        }
        var6_5 = (var4_4 | var7_3) ^ -1225168651;
        ** while (true)
    }
}

