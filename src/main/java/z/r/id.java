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
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import z.r.aE;
import z.r.ao;
import z.r.bM;
import z.r.gP;
import z.r.gj;
import z.r.he;
import z.r.ix;
import z.r.ke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class id
extends bM {
    private final ke a;
    private static final /* synthetic */ String a;
    private final ke b;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private static final int[] a;
    private static final /* synthetic */ String d;
    private final aE a;
    public static final int a;
    private static id a;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private final gP a;
    private static final /* synthetic */ String h;

    /*
     * Enabled aggressive block sorting
     */
    public id() {
        int n2 = -1430303183;
        int n3 = a & 0xAABF4E31 ^ 0x292AEE7D;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x6F651C1;
        n5 ^= 0x212D1010;
        super(k, s);
        n4 = (n3 | n2) ^ 0x252FCC12;
        block16: while (true) {
            switch (n4) {
                default: {
                    continue block16;
                }
                case 1702764075: {
                    this.a = this.addSetting(new ke(f, true));
                    n4 = (n3 | n2) ^ 0x742359FE;
                    continue block16;
                }
                case -1578740265: {
                    n5 ^= 0x2DA39D8F;
                    this.a = this.addSetting(new aE(e, c, d, c));
                    n4 = (n3 | n2) ^ 0x14C2E013;
                    continue block16;
                }
                case 146947931: {
                    this.b = this.addSetting(new ke(g, true));
                    n4 = (n3 | n2) ^ 0xC3107AA8;
                    continue block16;
                }
                case 1442159005: {
                    n5 ^= n4 ^ 0xB7B518D8;
                    n4 = (n3 | n2) ^ 0xA59BBAA;
                    continue block16;
                }
                case -2002927454: {
                    he.setHitboxExpander(id::pickRadiusExtra);
                    n4 = (n3 | n2) ^ 0x56470E32;
                    continue block16;
                }
                case -34021297: {
                    n5 ^= n4 ^ 0x5E0989B5;
                    n4 = (n3 | n2) ^ 0x2A508C7D;
                    continue block16;
                }
                case 797584012: {
                    n5 ^= 0x10C30305;
                    this.a = this.addSetting(new gP(a, 0.05f, 0.0f, 0.5f, 0.01f, b).description(h));
                    n4 = (n3 | n2) ^ 0xFE4A77E0;
                    continue block16;
                }
                case 1498556132: {
                    n5 ^= n4 ^ 0x3B56C62C;
                    n4 = (n3 | n2) ^ 0x23222EDF;
                    continue block16;
                }
                case 1756337365: {
                    n5 ^= n4 ^ 0x88B337B7;
                    n4 = (n3 | n2) ^ 0xCEC1F056;
                    continue block16;
                }
                case -543377533: {
                    n5 ^= n4 ^ 0xD74D270D;
                    n4 = (n3 | n2) ^ 0xF4C8D6AF;
                    continue block16;
                }
                case -2115018240: {
                    return;
                }
                case 1601648850: {
                    a = this;
                    n4 = (n3 | n2) ^ 0xF2EDC899;
                    continue block16;
                }
                case -1082323346: {
                    n5 ^= n4 ^ 0x57791ABF;
                    n4 = (n3 | n2) ^ 0xA37DD126;
                    continue block16;
                }
                case -1903156625: 
            }
            n5 ^= n4 ^ 0xA3769122;
            n4 = (n3 | n2) ^ 0x8435C4F1;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static id instance() {
        var0 = id.a & -1475757006 ^ 1526180807;
        var2_1 = 0;
        if (true) ** GOTO lbl13
        block5: while (true) {
            var2_1 = (var0 | -1475757006) ^ -81770968;
lbl6:
            // 2 sources

            block6: while (true) {
                switch (var2_1) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block6;
                        }
                        break;
                    }
                    case -630036581: {
                        break block5;
                    }
lbl13:
                    // 1 sources

                    var1_2 = (var0 | -1475757006) ^ 514942979;
                    var2_1 = (var0 | -1475757006) ^ 546166892;
                    ** continue;
                    case -1381985889: {
                        var1_2 ^= var2_1 ^ 2003258829;
                        continue block5;
                    }
                }
                break;
            }
            break;
        }
        var2_1 = (var0 | -1475757006) ^ 1465855592;
        ** while (true)
        {
            ** case 31455711:
        }
lbl22:
        // 1 sources

        return id.a;
    }

    private static int LN(int n2, int n3) {
        int n4 = -1318029058;
        int n5 = -49544448;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x639C8800)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xFD7C794C;
        n6 -= (n5 | n4) ^ 0xFD7C4003;
        n6 -= (n5 | n4) ^ 0xFD7CBFB6;
        n6 ^= (n5 | n4) ^ 0xFD7C41F8;
        n6 -= (n5 | n4) ^ 0xFD7CA8F0;
        n6 ^= (n5 | n4) ^ 0xFD7C3C54;
        n6 -= (n5 | n4) ^ 0xFD7CFDAA;
        return n6 += (n5 | n4) ^ 0xFD7CD01C;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onCombatTick() {
        block8: {
            break block8;
            {
                var3_2 = (var1_1 | -1268922720) ^ 8689510;
lbl2:
                // 2 sources

                block6: while (true) {
                    switch (var3_2) {
                        default: {
                            continue block6;
                        }
                        case 1351000650: {
                            break;
                        }
                        case -10915371: {
                            return;
                        }
                        case -1959537386: {
                            var2_3 ^= var3_2 ^ -1861124862;
                            continue block5;
                        }
                    }
                    var3_2 = (var1_1 | -1268922720) ^ 1961767845;
                    continue;
                    break;
                }
            }
lbl15:
            // 1 sources

            while (true) {
                var3_2 = (var1_1 | -1268922720) ^ -1352973063;
                ** continue;
                break;
            }
        }
        var1_1 = id.a & -1268922720 ^ 1874863123;
        var3_2 = 0;
        var2_3 = (var1_1 | -1268922720) ^ -1481450530;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static float pickRadiusExtra(class_1297 var0) {
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
    float effectiveExpansion() {
        block30: {
            block33: {
                block28: {
                    block32: {
                        block31: {
                            block29: {
                                break block33;
lbl1:
                                // 1 sources

                                while (true) {
                                    if (!((Boolean)this.a.getValue()).booleanValue()) break block28;
                                    break block29;
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
                                    continue;
                                    break;
                                }
                            }
                            var6_3 = (var4_2 | var7_1) ^ 326732790;
                            break block30;
lbl11:
                            // 1 sources

                            while (true) {
                                var1_4 = (float)Math.min((double)var1_4, var2_5);
                                break block28;
                                break;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                var6_3 = (var4_2 | var7_1) ^ -88708609;
                                break block30;
                                break;
                            }
lbl17:
                            // 1 sources

                            while (true) {
                                var5_6 ^= var6_3 ^ -1205751212;
                                break block31;
                                break;
                            }
                            var1_4 = ((Float)this.a.getValue()).floatValue();
                            var6_3 = (var4_2 | var7_1) ^ -415805942;
                            break block30;
lbl23:
                            // 1 sources

                            while (true) {
                                var5_6 ^= var6_3 ^ -61620910;
                                break block32;
                                break;
                            }
lbl26:
                            // 1 sources

                            while (true) {
                                var6_3 = (var4_2 | var7_1) ^ 1683906297;
                                if (true) ** GOTO lbl36
                                break;
                            }
lbl29:
                            // 1 sources

                            return var1_4;
lbl31:
                            // 1 sources

                            while (true) {
                                var5_6 ^= var6_3 ^ -1233787983;
                                ** continue;
                                break;
                            }
                            block23: while (true) {
                                var6_3 = (var4_2 | var7_1) ^ 2061542568;
lbl36:
                                // 3 sources

                                block24: while (true) {
                                    switch (var6_3) {
                                        default: {
                                            continue block24;
                                        }
                                        case 1427219409: {
                                            ** continue;
                                        }
                                        case -83574521: {
                                            continue block23;
                                        }
                                        ** case -440779946:
lbl45:
                                        // 1 sources

                                        ** continue;
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                        var6_3 = (var4_2 | var7_1) ^ -1902062467;
                        break block30;
                        var2_5 = Math.max(0.0, 0.0 - ao.grimBudgetUsed());
                        var5_6 ^= 978778041;
                        ** while (true)
lbl52:
                        // 1 sources

                        while (true) {
                            var6_3 = (var4_2 | var7_1) ^ -1605468746;
                            break block30;
                            break;
                        }
lbl55:
                        // 1 sources

                        while (true) {
                            var5_6 ^= var6_3 ^ 1448932084;
                            ** continue;
                            break;
                        }
                    }
                    var6_3 = (var4_2 | var7_1) ^ -901039057;
                    ** while (true)
                }
                var6_3 = (var4_2 | var7_1) ^ 239771901;
                break block30;
            }
            var7_1 = -1692756288;
            var4_2 = id.a & -1692756288 ^ 239603134;
            var6_3 = 0;
            var5_6 = (var4_2 | var7_1) ^ -425595886;
            ** while (true)
        }
        block27: while (true) {
            switch (var6_3) {
                default: {
                    continue block27;
                }
                case 301616003: {
                    ** continue;
                }
                case 1710028289: {
                    ** continue;
                }
                case 2020463092: {
                    ** continue;
                }
                case 1058333256: {
                    ** continue;
                }
                case -1943858168: {
                    ** continue;
                }
                ** case -1861206269:
lbl86:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var2 = -668846711;
        id.a = mK.a(MethodHandles.lookup().lookupClass(), -1124848539);
        var1_1 = 0;
        var0_2 = 2016399950;
        var1_1 = var2 ^ 462814393;
        ** GOTO lbl67
lbl7:
        // 1 sources

        while (true) {
            var1_1 = var2 ^ 182004766;
            if (true) ** GOTO lbl67
            break;
        }
        while (true) {
            id.k = gj.decode("jLSvwYl3J76bjbxuOA==", id.LN(((var0_2 ^= 2141630553) | var2) ^ 1662242343, var2 ^ ((var0_2 | var2) ^ -309393380)));
            id.s = gj.decode("89mNhb2v7WaEf+qHaHpiEK7nX2Zt/NYizjDkJT7bQYda0E+RwtoV28a0fy8cQ4Y=", id.LN((var0_2 | var2) ^ 1662242342, var2 ^ ((var0_2 | var2) ^ 636443854)));
            id.a = gj.decode("frSOTgFMyUMV", id.LN((var0_2 | var2) ^ 1662242341, var2 ^ ((var0_2 | var2) ^ -1392067636)));
            id.b = gj.decode("iAXWNA==", id.LN((var0_2 | var2) ^ 1662242340, var2 ^ ((var0_2 | var2) ^ -282493959)));
            id.h = gj.decode("J2uiKfpPWSgjO2pqvtc074I9qNSduTJsvp7P2Y6zGVO6RtoCwtnvbGUVOo/B02SlUuDblPp2L+k6", id.LN((var0_2 | var2) ^ 1662242339, var2 ^ ((var0_2 | var2) ^ -1840862650)));
            id.e = gj.decode("iVfnZZXeMg==", id.LN((var0_2 | var2) ^ 1662242338, var2 ^ ((var0_2 | var2) ^ -1854529711)));
            id.c = gj.decode("x6kmLAlCokDQ5g==", id.LN((var0_2 | var2) ^ 1662242337, var2 ^ ((var0_2 | var2) ^ 1471468610)));
            id.d = gj.decode("CwG4UiZrgg==", id.LN((var0_2 | var2) ^ 1662242336, var2 ^ ((var0_2 | var2) ^ 2106819992)));
            id.g = gj.decode("xl6atCL6ImyoC5H30Qk=", id.LN((var0_2 | var2) ^ 1662242351, var2 ^ ((var0_2 | var2) ^ -2031035778)));
            id.f = gj.decode("qMBgMayp4tBHHk57PA==", id.LN((var0_2 | var2) ^ 1662242350, var2 ^ ((var0_2 | var2) ^ -66102627)));
            return;
        }
        {
            v0 = (v1[v2] & 255) << 24;
            block16: while (true) {
                switch (var0_2) {
                    case 1459173466: {
                        var0_2 ^= -2098686823;
                        break block16;
                    }
                    case -1308146974: {
                        var0_2 ^= 1150049911;
                        continue block16;
                    }
                    default: {
                        var0_2 ^= -328512277;
                    }
                }
                break;
            }
            var0_2 ^= 161919695;
            var0_2 ^= -1429981522;
            var0_2 ^= -324140426;
            v3 = var0_2 ^= 914389764;
            var0_2 ^= -1095101625;
            id.a[v4] = (v0 | ((v1[v2 + 1] & 255) << 16 | ((v1[v2 + 2] & 255) << 8 | v1[v2 + 3] & 255))) ^ ((v3 | var2) ^ 1790301012 ^ id.a);
            v4 = v4 + 1;
            v1 = v1;
            v2 = v2 + 4;
            var0_2 ^= -776934754;
            if (v2 + 4 >= v1.length) ** continue;
lbl61:
            // 2 sources

            while (true) {
                var0_2 ^= -282940612;
                var0_2 ^= 2072787823;
                continue block15;
                break;
            }
        }
        block18: while (true) {
            var1_1 = var2 ^ -392268049;
lbl67:
            // 3 sources

            block19: while (true) {
                switch (var1_1) {
                    case 1736330552: {
                        var0_2 ^= var1_1 ^ -293801074;
                        continue block18;
                    }
                    case -755295849: {
                        var0_2 ^= var1_1 ^ 599837864;
                        ** break;
                    }
                    case -339219704: {
                        var0_2 ^= var1_1 ^ 696711878;
                        var1_1 = var2 ^ -407716788;
                        continue block19;
                    }
                    case 817644390: {
                        var1_1 = var2 ^ 870702721;
                        ** GOTO lbl83
                    }
lbl82:
                    // 1 sources

                    var1_1 = var2 ^ -1847787779;
lbl83:
                    // 3 sources

                    default: {
                        continue block19;
                    }
                    case 1066437061: {
                        id.a = new int[(var0_2 | var1_1 ^ -407716788) ^ (var1_1 ^ -989924240)];
                        ** continue;
                    }
                    case 1241434996: {
                        v4 = 0;
                        v2 = 0;
                        v1 = "45ohT\u0014\u008dp\u00a2\u0007\u00b51\u00baPB\u00deFhbJ\u00bd\u00e7\u00ab\u00e5\u00c4\u00eb3f0y \u00c4\u008f\u007f-;\u0004\u0013\u00dcV".getBytes("ISO-8859-1");
                        ** continue;
                    }
                    case -1011365584: 
                }
                var1_1 = var2 ^ -1084458831;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static boolean LO(class_1297 var0) {
        block27: {
            var6_1 = 1399746497;
            var3_2 = id.a & 1399746497 ^ -154357172;
            var5_3 = 0;
            var4_6 = (var3_2 | var6_1) ^ 119021197;
            var5_3 = (var3_2 | var6_1) ^ 437718585;
            if (true) ** GOTO lbl18
            while (true) {
                var5_3 = (var3_2 | var6_1) ^ 216994587;
                break block27;
lbl10:
                // 1 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ -1708984491;
                    break block27;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5_3 = (var3_2 | var6_1) ^ -1132155835;
                    break block27;
                    break;
                }
                break;
            }
            block22: while (true) {
                var5_3 = (var3_2 | var6_1) ^ 417666475;
lbl18:
                // 2 sources

                while (true) {
                    block29: {
                        block28: {
                            switch (var5_3) {
                                case 1878214750: {
                                    if (!(var0 instanceof class_1657)) ** GOTO lbl32
                                    break block28;
                                }
                                case -284431770: {
                                    return false;
                                }
                                case 1876407812: {
                                    var4_6 ^= var5_3 ^ 817631344;
                                    continue block22;
                                }
                                case -214273649: {
                                    var1_4 = (class_1657)var0;
                                    var4_6 ^= 928990065;
                                    break block22;
                                }
lbl32:
                                // 1 sources

                                var5_3 = (var3_2 | var6_1) ^ -1741076023;
                                break;
                                case 1384265126: {
                                    var4_6 ^= var5_3 ^ 827537899;
                                    var5_3 = (var3_2 | var6_1) ^ -1742882925;
                                    break;
                                }
                                case -1013296518: {
                                    var4_6 ^= var5_3 ^ -1639452980;
                                    break block29;
                                }
                                case -302386700: {
                                    var5_3 = (var3_2 | var6_1) ^ -1519596949;
                                }
                            }
                            continue;
                        }
                        var5_3 = (var3_2 | var6_1) ^ 880061879;
                        continue;
                    }
                    var5_3 = (var3_2 | var6_1) ^ 81038914;
                }
                break;
            }
            var2_5 = ix.get();
            var5_3 = (var3_2 | var6_1) ^ 48835965;
        }
        block24: while (true) {
            switch (var5_3) {
                case -1228544062: {
                    v0 = false;
                    ** GOTO lbl80
                }
                case -281433524: {
                    if (var2_5.isFriend(var1_4.method_7334().name())) {
                        ** continue;
                    }
                    ** GOTO lbl70
                }
                case 1265259400: {
                    v0 = true;
                    ** GOTO lbl80
                }
                case 1842088088: {
                    var4_6 ^= var5_3 ^ -885125038;
                    ** continue;
                }
                case -1582341986: {
                    if (var2_5 != null) ** continue;
lbl70:
                    // 2 sources

                    var5_3 = (var3_2 | var6_1) ^ 1325351298;
                }
lbl71:
                // 3 sources

                default: {
                    continue block24;
                }
                case -83759914: {
                    var5_3 = (var3_2 | var6_1) ^ 416765313;
                    continue block24;
                }
                case -184036688: {
                    var4_6 ^= var5_3 ^ -134589176;
                    var5_3 = (var3_2 | var6_1) ^ 1447141203;
                    ** GOTO lbl71
                }
lbl80:
                // 2 sources

                var4_6 ^= -740208932;
                return v0;
                case -1190019505: 
            }
            var4_6 ^= var5_3 ^ 535012997;
            var5_3 = (var3_2 | var6_1) ^ 1093343247;
        }
    }
}

