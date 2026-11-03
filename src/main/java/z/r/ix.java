/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import com.google.gson.JsonArray;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.ac;
import z.r.dA;
import z.r.gF;
import z.r.jn;
import z.r.mi;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class ix
extends gF {
    public static final int a;
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String s;
    private static final int[] a;
    private final List<jn> a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;

    /*
     * Enabled aggressive block sorting
     */
    public ix() {
        int n2 = -1361220798;
        int n3 = a & 0xAEDD6B42 ^ 0x2EE48949;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x281B7FA4;
        n5 ^= 0x2045167F;
        super(k, s, dA.O);
        n4 = (n3 | n2) ^ 0x27A1F292;
        block6: while (true) {
            switch (n4) {
                default: {
                    continue block6;
                }
                case -1990452775: {
                    n5 ^= n4 ^ 0x980CC954;
                    n4 = (n3 | n2) ^ 0x7D3A854F;
                    continue block6;
                }
                case -943493298: {
                    n5 ^= n4 ^ 0x2EC06FBA;
                    n4 = (n3 | n2) ^ 0x33B3A4ED;
                    continue block6;
                }
                case -1655812186: {
                    return;
                }
                case -741904892: 
            }
            this.a = (int)new ArrayList();
            n4 = (n3 | n2) ^ 0x693E8405;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onEnable() {
        int n2 = a & 0xAAB3E158 ^ 0x324E52CF;
        int n3 = 0;
        int n4 = (n2 | 0xAAB3E158) ^ 0x68FBDB50;
        n3 = (n2 | 0xAAB3E158) ^ 0xC3C0E91E;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1374241677: {
                    n4 ^= n3 ^ 0xF97E46A8;
                    n3 = (n2 | 0xAAB3E158) ^ 0xE10B2534;
                    continue block5;
                }
                case 1542772459: {
                    return;
                }
                case 2034178753: 
            }
            n3 = (n2 | 0xAAB3E158) ^ 0x14E94FAC;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onDisable() {
        block7: {
            var1_1 = ix.a & 1070093426 ^ 1685727300;
            var3_2 = 0;
            ** GOTO lbl8
lbl4:
            // 2 sources

            block5: while (true) {
                switch (var3_2) lbl-1000:
                // 2 sources

                {
                    default: {
                        continue block5;
                    }
lbl8:
                    // 1 sources

                    var2_3 = (var1_1 | 1070093426) ^ -146138805;
                    break block5;
                    case 374654307: {
                        var2_3 ^= var3_2 ^ -2104546956;
                        break block7;
                    }
                    case -904190367: {
                        var3_2 = (var1_1 | 1070093426) ^ 1773058325;
                        ** GOTO lbl-1000
                    }
                    case 1548655892: {
                        return;
                    }
                }
                break;
            }
            var3_2 = (var1_1 | 1070093426) ^ -1243522537;
            ** GOTO lbl4
        }
        var3_2 = (var1_1 | 1070093426) ^ 599056738;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static ix get() {
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
    public boolean isFriend(String var1_1) {
        block9: {
            block10: {
                break block10;
lbl1:
                // 1 sources

                block5: while (true) {
                    var4_3 = (var2_2 | 886601636) ^ -48643804;
lbl3:
                    // 2 sources

                    block6: while (true) {
                        switch (var4_3) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                default: {
                                    continue block6;
                                }
                                break;
                            }
                            case -1952603813: {
                                return this.HL(var1_1, mi.i);
                            }
                            case -1060913520: {
                                var3_4 ^= var4_3 ^ -673567396;
                                break block9;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var4_3 = (var2_2 | 886601636) ^ 1940772020;
                                ** continue;
                                break;
                            }
                            case 1316465408: {
                                break block5;
                            }
                        }
                        break;
                    }
                    break;
                }
                ** while (true)
            }
            var2_2 = ix.a & 886601636 ^ 423757840;
            var4_3 = 0;
            var3_4 = (var2_2 | 886601636) ^ 236344804;
            ** while (true)
        }
        var4_3 = (var2_2 | 886601636) ^ -1236803857;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean isZerioFriend(String string) {
        int n2 = a & 0xC38017E0 ^ 0xDF447150;
        int n3 = 0;
        int n4 = (n2 | 0xC38017E0) ^ 0x374B7758;
        n3 = (n2 | 0xC38017E0) ^ 0xDED35C83;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1600136249: {
                    n4 ^= n3 ^ 0xDF037C3D;
                    n3 = (n2 | 0xC38017E0) ^ 0x17A43B7E;
                    continue block5;
                }
                case -933213042: {
                    return this.HL(string, mi.f);
                }
                case 18295667: 
            }
            n3 = (n2 | 0xC38017E0) ^ 0x80A453C9;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean HL(String var1_1, mi var2_2) {
        var6_3 = -253247044;
        var3_4 = ix.a & -253247044 ^ 199027820;
        var5_5 = 0;
        var4_6 = (var3_4 | var6_3) ^ 1681788262;
        var5_5 = (var3_4 | var6_3) ^ 1058632609;
        if (true) ** GOTO lbl12
        block11: while (true) {
            var5_5 = (var3_4 | var6_3) ^ 731261419;
            if (true) ** GOTO lbl12
            do {
                var5_5 = (var3_4 | var6_3) ^ 1914895429;
lbl12:
                // 3 sources

                block13: while (true) {
                    switch (var5_5) {
                        default: {
                            continue block13;
                        }
                        case 528130065: {
                            if (var1_1 == null) continue block11;
                            var5_5 = (var3_4 | var6_3) ^ 1283829496;
                            continue block13;
                        }
                        case -798374889: {
                            var4_6 ^= var5_5 ^ 1667979658;
                            var5_5 = (var3_4 | var6_3) ^ -1473833200;
                            continue block13;
                        }
                        case 1406728940: {
                            return false;
                        }
                        case -991519139: {
                            var5_5 = (var3_4 | var6_3) ^ 1349436300;
                            continue block13;
                        }
                        case -1982000711: {
                            var4_6 ^= var5_5 ^ 369788209;
                            var5_5 = (var3_4 | var6_3) ^ 758397816;
                            continue block13;
                        }
                        case -1216724220: {
                            var5_5 = (var3_4 | var6_3) ^ -145173916;
                            continue block13;
                        }
                        case -691284348: {
                            return this.a.stream().anyMatch((Predicate<jn>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, HP(z.r.mi java.lang.String z.r.jn ), (Lz/r/jn;)Z)((mi)var2_2, (String)var1_1));
                        }
                        case -1416548752: {
                            var4_6 ^= var5_5 ^ 1526840440;
                            var5_5 = (var3_4 | var6_3) ^ -461025811;
                            continue block13;
                        }
                        case 212287384: 
                    }
                    break;
                }
            } while (!var1_1.isBlank());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public List<String> getFriends() {
        int n2 = a & 0xEC034FD3 ^ 0x79E9269B;
        int n3 = 0;
        int n4 = (n2 | 0xEC034FD3) ^ 0x99C92A17;
        n3 = (n2 | 0xEC034FD3) ^ 0x9ECD16C;
        block5: while (true) {
            switch (n3) {
                case -959475365: {
                    n4 ^= n3 ^ 0xC6134922;
                    n3 = (n2 | 0xEC034FD3) ^ 0xC858E602;
                }
                default: {
                    continue block5;
                }
                case -200819017: {
                    n3 = (n2 | 0xEC034FD3) ^ 0x3B24FE80;
                    continue block5;
                }
                case 900958681: 
            }
            break;
        }
        n4 ^= 0x415451EC;
        n4 ^= 0x237D9DDE;
        n4 ^= 0x6B6DF71;
        n4 ^= 0xB752C7E3;
        return this.a.stream().filter(var0 -> {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [18[DOLOOP]], but top level block is 19[UNCONDITIONALDOLOOP]
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }).map(jn::name).toList();
    }

    /*
     * Unable to fully structure code
     */
    public List<jn> getEntries() {
        block9: {
            break block9;
lbl1:
            // 1 sources

            return Collections.unmodifiableList(this.a);
        }
        var1_1 = ix.a & -1166619296 ^ -2003631285;
        var3_2 = 0;
        var2_3 = (var1_1 | -1166619296) ^ -1161363706;
        if (true) ** GOTO lbl19
        block6: while (true) {
            var3_2 = (var1_1 | -1166619296) ^ 339203739;
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
                    case -1363142160: {
                        ** continue;
                    }
                    case -1534765502: {
                        break block6;
                    }
lbl19:
                    // 1 sources

                    var3_2 = (var1_1 | -1166619296) ^ 510826793;
                    ** continue;
                    case 1719014163: {
                        var2_3 ^= var3_2 ^ -182027419;
                        continue block6;
                    }
                }
                break;
            }
            break;
        }
        var3_2 = (var1_1 | -1166619296) ^ -595469192;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public Set<String> getFriendSet() {
        block28: {
            block27: {
                block29: {
                    break block29;
lbl1:
                    // 2 sources

                    while (true) {
                        var6_3 = (var4_2 | var7_1) ^ 1683252888;
                        break block27;
                        while (true) {
                            var6_3 = (var4_2 | var7_1) ^ -440335303;
                            break block27;
                            break;
                        }
lbl7:
                        // 2 sources

                        while (true) {
                            var6_3 = (var4_2 | var7_1) ^ 1444530326;
                            break block28;
                            break;
                        }
                        break;
                    }
                }
                var7_1 = -1431653934;
                var4_2 = ix.a & -1431653934 ^ 2059849317;
                var6_3 = 0;
                var5_7 = (var4_2 | var7_1) ^ 1885001176;
                var6_3 = (var4_2 | var7_1) ^ 119506138;
                block24: while (true) {
                    switch (var6_3) {
                        default: {
                            continue block24;
                        }
                        case -295616132: {
                            var1_4 = new HashSet<String>();
                            var5_7 ^= 1698952437;
                            var2_5 = this.a.iterator();
                            ** GOTO lbl1
                        }
                        case -34505939: {
                            var6_3 = (var4_2 | var7_1) ^ -1340318290;
                            continue block24;
                        }
                        case 1257415257: 
                    }
                    var5_7 ^= var6_3 ^ 1725376833;
                    var6_3 = (var4_2 | var7_1) ^ 344964747;
                }
            }
            block25: while (true) {
                switch (var6_3) {
                    default: {
                        continue block25;
                    }
                    case -1433354658: {
                        var5_7 ^= var6_3 ^ -740800915;
                        var6_3 = (var4_2 | var7_1) ^ -875901965;
                        continue block25;
                    }
                    case 1565579715: {
                        if (!var2_5.hasNext()) ** continue;
                        var6_3 = (var4_2 | var7_1) ^ 1350451625;
                        continue block25;
                    }
                    case 523238350: {
                        var5_7 ^= var6_3 ^ 77685736;
                        var6_3 = (var4_2 | var7_1) ^ 329450801;
                        continue block25;
                    }
                    case -1631938193: {
                        var5_7 ^= var6_3 ^ -389733764;
                        var6_3 = (var4_2 | var7_1) ^ -1480710604;
                        continue block25;
                    }
                    case 824456196: {
                        var3_6 = (jn)var2_5.next();
                        var6_3 = (var4_2 | var7_1) ^ 1956235405;
                        break block25;
                    }
                    case -380765498: {
                        return var1_4;
                    }
                }
                break;
            }
        }
        block26: while (true) {
            switch (var6_3) {
                default: {
                    continue block26;
                }
                case -1393084575: {
                    var5_7 ^= var6_3 ^ -1921637288;
                    var6_3 = (var4_2 | var7_1) ^ 240236248;
                    continue block26;
                }
                case -1904789638: {
                    var5_7 ^= var6_3 ^ -1597937821;
                    var6_3 = (var4_2 | var7_1) ^ 567973654;
                    continue block26;
                }
                case 1641258725: {
                    var6_3 = (var4_2 | var7_1) ^ -2020245929;
                    continue block26;
                }
                case -617322271: {
                    if (var3_6.type() != mi.i) ** GOTO lbl7
                    var6_3 = (var4_2 | var7_1) ^ -1690476270;
                    continue block26;
                }
                case -188790481: {
                    ** continue;
                }
                case 2105246112: 
            }
            break;
        }
        var1_4.add(var3_6.name().toLowerCase(Locale.ROOT));
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void addFriend(String var1_1) {
        var5_2 = -1024229913;
        var2_3 = ix.a & -1024229913 ^ 1022747700;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ 1524233667;
        var4_4 = (var2_3 | var5_2) ^ -1359637417;
        if (true) ** GOTO lbl9
        block7: while (true) {
            var4_4 = (var2_3 | var5_2) ^ 1808101907;
lbl9:
            // 2 sources

            block8: while (true) {
                switch (var4_4) {
                    default: {
                        continue block8;
                    }
                    case 481757208: {
                        this.addFriend(var1_1, mi.i);
                        var4_4 = (var2_3 | var5_2) ^ -1779197174;
                        continue block8;
                    }
                    case 1342335392: {
                        var4_4 = (var2_3 | var5_2) ^ 1861571181;
                        continue block8;
                    }
                    case 1795450621: {
                        var3_5 ^= var4_4 ^ 1007745688;
                        continue block7;
                    }
                    case -1878872166: {
                        var3_5 ^= var4_4 ^ -378685194;
                        var4_4 = (var2_3 | var5_2) ^ -499059217;
                        continue block8;
                    }
                    case -1791848476: 
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
    public boolean addFriend(String var1_1, mi var2_2) {
        var7_3 = 1678437645;
        var4_4 = ix.a & 1678437645 ^ -840521797;
        var6_5 = 0;
        var5_6 = (var4_4 | var7_3) ^ 1101698021;
        var6_5 = (var4_4 | var7_3) ^ -1904529212;
        if (true) ** GOTO lbl69
        {
            var6_5 = (var4_4 | var7_3) ^ -1605378515;
lbl8:
            // 2 sources

            block30: while (true) {
                switch (var6_5) {
                    case -28963170: {
                        var6_5 = (var4_4 | var7_3) ^ 728308514;
                        continue block30;
                    }
                    case -2146289796: {
                        return false;
                    }
                    case 1945953716: {
                        var5_6 ^= var6_5 ^ 1401481138;
                        ** GOTO lbl27
                    }
                    case -1521912259: {
                        this.a.add(new jn(var3_7, var2_2));
                        ** break;
                    }
                    case -1107206824: {
                        if (var2_2 != mi.i) ** GOTO lbl34
                        ** GOTO lbl39
                    }
lbl25:
                    // 1 sources

                    var6_5 = (var4_4 | var7_3) ^ -2147327537;
                    break;
lbl27:
                    // 1 sources

                    var6_5 = (var4_4 | var7_3) ^ 1845287107;
                    break;
                    case 838895709: {
                        this.HN();
                        continue block29;
                    }
                    case -964168547: {
                        ac.prefetch(List.of(var3_7));
lbl34:
                        // 2 sources

                        var6_5 = (var4_4 | var7_3) ^ -293968497;
                        break;
                    }
                    case 1302409618: {
                        var5_6 ^= var6_5 ^ -1717027217;
                        ** break;
                    }
lbl39:
                    // 1 sources

                    var6_5 = (var4_4 | var7_3) ^ 329834785;
                    break;
                    case 1919333119: {
                        return true;
                    }
                    case -15800935: {
                        var5_6 ^= var6_5 ^ -193625628;
                        var6_5 = (var4_4 | var7_3) ^ 1959494391;
                        break;
                    }
                    case 1346858440: {
                        var5_6 ^= var6_5 ^ 594154769;
                        var6_5 = (var4_4 | var7_3) ^ 1218943362;
                        break;
                    }
                    case 1844219504: {
                        var5_6 ^= var6_5 ^ -108958185;
                        var6_5 = (var4_4 | var7_3) ^ 1408217831;
                        break;
                    }
                    case 60066352: {
                        var5_6 ^= var6_5 ^ 1358817023;
                        var6_5 = (var4_4 | var7_3) ^ -538023966;
                        break;
                    }
lbl59:
                    // 1 sources

                    var6_5 = (var4_4 | var7_3) ^ -1618453184;
                    continue block30;
                    case -1725600440: {
                        if (this.HL(var3_7, var2_2)) {
                            var6_5 = (var4_4 | var7_3) ^ -1642984949;
                            continue block30;
                        }
                        var6_5 = (var4_4 | var7_3) ^ -1112964489;
                    }
                }
                continue;
                break;
            }
        }
        block31: while (true) {
            var6_5 = (var4_4 | var7_3) ^ 1740392520;
lbl69:
            // 2 sources

            block32: while (true) {
                block38: {
                    switch (var6_5) {
                        case -507314448: {
                            var5_6 ^= var6_5 ^ 1365194024;
                            var6_5 = (var4_4 | var7_3) ^ 1936818329;
                            continue block32;
                        }
                        case -2115069467: {
                            return false;
                        }
                        case 979703301: {
                            var5_6 ^= var6_5 ^ -1479925098;
                            ** GOTO lbl99
                        }
                        case -2110777450: {
                            var3_7 = var1_1.trim();
                            var6_5 = (var4_4 | var7_3) ^ 316672550;
                            ** continue;
                        }
                        case 1570881661: {
                            ** GOTO lbl101
                        }
                        case 903129345: {
                            ** break;
                        }
                        case 1367001078: {
                            if (var2_2 != null) continue block31;
                            break block38;
                        }
                        case -1633718490: {
                            if (var1_1 == null) break block38;
                            var6_5 = (var4_4 | var7_3) ^ -1336987710;
                        }
lbl94:
                        // 3 sources

                        default: {
                            continue block32;
                        }
                        {
                        }
lbl97:
                        // 1 sources

                        var6_5 = (var4_4 | var7_3) ^ -1131141047;
                        continue block32;
lbl99:
                        // 1 sources

                        var6_5 = (var4_4 | var7_3) ^ 1811969626;
                        continue block32;
lbl101:
                        // 1 sources

                        var6_5 = (var4_4 | var7_3) ^ 1468509393;
                        continue block32;
                        case 1670766459: {
                            var6_5 = (var4_4 | var7_3) ^ 204214607;
                            continue block32;
                        }
                        case -1974294537: {
                            var5_6 ^= var6_5 ^ -1872874387;
                            var6_5 = (var4_4 | var7_3) ^ 1876883497;
                            ** GOTO lbl94
                        }
                        case -1167506578: 
                    }
                    if (!var1_1.trim().isEmpty()) {
                        var6_5 = (var4_4 | var7_3) ^ -667269442;
                        continue;
                    }
                }
                var6_5 = (var4_4 | var7_3) ^ -678692422;
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void removeFriend(int var1_1) {
        var5_2 = 1357181862;
        var2_3 = ix.a & 1357181862 ^ -1202665952;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ 75692314;
        var4_4 = (var2_3 | var5_2) ^ -1524077164;
        if (true) ** GOTO lbl9
        block13: while (true) {
            var4_4 = (var2_3 | var5_2) ^ 1505633268;
lbl9:
            // 2 sources

            block14: while (true) {
                switch (var4_4) {
                    case -1542720701: {
                        var3_5 ^= var4_4 ^ -882365491;
                        var4_4 = (var2_3 | var5_2) ^ 138193139;
                        continue block14;
                    }
                    case 1179108406: {
                        this.a.remove(var1_1);
                        var4_4 = (var2_3 | var5_2) ^ 1583468474;
                        continue block14;
                    }
                    case 309148622: {
                        this.HN();
                        ** GOTO lbl37
                    }
                    case -1588931502: {
                        var3_5 ^= var4_4 ^ -927389913;
                        var4_4 = (var2_3 | var5_2) ^ -1095552112;
                        continue block14;
                    }
                    case 218559133: {
                        var3_5 ^= var4_4 ^ 905977545;
                        ** GOTO lbl42
                    }
                    case -255303851: {
                        if (var1_1 >= 0) {
                            var4_4 = (var2_3 | var5_2) ^ -544773765;
                            continue block14;
                        }
                        ** GOTO lbl37
                    }
                    case -991832969: {
                        if (var1_1 < this.a.size()) continue block13;
lbl37:
                        // 3 sources

                        var4_4 = (var2_3 | var5_2) ^ -168688325;
                        ** GOTO lbl46
                    }
                    case 1574738482: {
                        var4_4 = (var2_3 | var5_2) ^ 1560216805;
                        ** GOTO lbl46
                    }
lbl42:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 1035928405;
                    ** GOTO lbl46
                    case 661888733: {
                        var4_4 = (var2_3 | var5_2) ^ 1008018385;
                    }
lbl46:
                    // 5 sources

                    default: {
                        continue block14;
                    }
                    case -1500170212: {
                        var3_5 ^= var4_4 ^ -815346839;
                        var4_4 = (var2_3 | var5_2) ^ -359019416;
                        continue block14;
                    }
                    case -984877837: 
                }
                break;
            }
            break;
        }
    }

    private static int HM(int n2, int n3) {
        int n4 = 1014752149;
        int n5 = 1615771839;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x7C8C1DB0)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0x7C7FB214;
        n6 += (n5 | n4) ^ 0x7C7F8019;
        n6 -= (n5 | n4) ^ 0x7C7F833B;
        n6 -= (n5 | n4) ^ 0x7C7F6014;
        n6 += (n5 | n4) ^ 0x7C7FDA3F;
        n6 += (n5 | n4) ^ 0x7C7F06A3;
        n6 += (n5 | n4) ^ 0x7C7F3CB4;
        n6 -= (n5 | n4) ^ 0x7C7F60ED;
        return n6 ^= (n5 | n4) ^ 0x7C7F82C1;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public int getFriendCount() {
        int n2 = a & 0x382FEEC8 ^ 0x479A3EDE;
        int n3 = 0;
        int n4 = (n2 | 0x382FEEC8) ^ 0x386B87DB;
        n3 = (n2 | 0x382FEEC8) ^ 0x31EE6379;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1313971623: {
                    n3 = (n2 | 0x382FEEC8) ^ 0xB8C5C07B;
                    continue block5;
                }
                case -948289883: {
                    n4 ^= n3 ^ 0x865A574F;
                    n3 = (n2 | 0x382FEEC8) ^ 0xECF0754C;
                    continue block5;
                }
                case -1823503470: 
            }
            break;
        }
        return this.a.size();
    }

    /*
     * Exception decompiling
     */
    public JsonArray friendsToJson() {
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
    public void applyFriendsJson(JsonArray var1_1) {
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
    public void loadSocials(JsonArray var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [33[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private void HN() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [54[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private static /* synthetic */ boolean HP(mi var0, String var1_1, jn var2_2) {
        block27: {
            block30: {
                block26: {
                    block29: {
                        block28: {
                            block25: {
                                block24: {
                                    break block29;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        if (var2_2.type() != var0) break block24;
                                        break block25;
                                        break;
                                    }
lbl4:
                                    // 1 sources

                                    while (true) {
                                        if (!var2_2.name().equalsIgnoreCase(var1_1.trim())) break block24;
                                        break block26;
                                        break;
                                    }
lbl7:
                                    // 1 sources

                                    while (true) {
                                        var5_5 = (var3_4 | var6_3) ^ 1922607616;
                                        break block27;
                                        break;
                                    }
lbl10:
                                    // 1 sources

                                    while (true) {
                                        v0 = true;
lbl12:
                                        // 2 sources

                                        while (true) {
                                            var4_6 ^= 1850788207;
                                            break block28;
                                            break;
                                        }
                                        break;
                                    }
lbl15:
                                    // 1 sources

                                    while (true) {
                                        var5_5 = (var3_4 | var6_3) ^ 1447992789;
                                        break block27;
                                        break;
                                    }
                                }
                                var5_5 = (var3_4 | var6_3) ^ 758118841;
                                break block27;
lbl21:
                                // 1 sources

                                while (true) {
                                    var5_5 = (var3_4 | var6_3) ^ 0x55EE9999;
                                    break block27;
                                    break;
                                }
lbl24:
                                // 1 sources

                                while (true) {
                                    var4_6 ^= var5_5 ^ 774202698;
                                    ** continue;
                                    break;
                                }
                            }
                            var5_5 = (var3_4 | var6_3) ^ 1406393485;
                            break block27;
lbl30:
                            // 1 sources

                            while (true) {
                                var4_6 ^= var5_5 ^ 675140707;
                                ** continue;
                                break;
                            }
lbl33:
                            // 1 sources

                            while (true) {
                                var5_5 = (var3_4 | var6_3) ^ -2080026539;
                                break block27;
                                break;
                            }
                        }
                        return v0;
                    }
                    var6_3 = -837909862;
                    var3_4 = ix.a & -837909862 ^ -1778487433;
                    var5_5 = 0;
                    break block30;
                }
                var5_5 = (var3_4 | var6_3) ^ 725043344;
                break block27;
lbl46:
                // 1 sources

                while (true) {
                    var5_5 = (var3_4 | var6_3) ^ -1690565662;
                    break block27;
                    break;
                }
lbl49:
                // 1 sources

                while (true) {
                    var4_6 ^= var5_5 ^ -905178880;
                    ** continue;
                    break;
                }
            }
            var4_6 = (var3_4 | var6_3) ^ -48942403;
            var5_5 = (var3_4 | var6_3) ^ 1065771701;
        }
        block23: while (true) {
            switch (var5_5) {
                default: {
                    continue block23;
                }
                case -1978632602: {
                    ** continue;
                }
                case 1153625117: {
                    ** continue;
                }
                case -1984925142: {
                    ** continue;
                }
                case -1943194766: {
                    ** continue;
                }
                case -188110993: {
                    ** continue;
                }
                case -528970422: {
                    ** continue;
                }
                case -221178298: {
                    ** continue;
                }
                case 1543225258: {
                    ** continue;
                }
                case -1385806337: 
            }
            break;
        }
        v0 = false;
        ** while (true)
    }
}

