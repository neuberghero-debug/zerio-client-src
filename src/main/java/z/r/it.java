/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1297
 *  net.minecraft.class_310
 *  net.minecraft.class_638
 *  net.minecraft.class_742
 */
package z.r;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_742;
import z.r.aE;
import z.r.al;
import z.r.gF;
import z.r.ix;
import z.r.ke;
import z.r.mh;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class it
extends gF {
    private final Map<UUID, mh> a;
    private final ke a;
    private static final /* synthetic */ String a;
    private final aE a;
    private final ke b;
    private static final /* synthetic */ String b;
    private final ke c;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private final al a;
    private class_638 a;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private final al b;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ String j;
    private boolean a;
    private final ke d;
    private static final /* synthetic */ String l;
    private static final long a;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    public static final int a;
    private static final /* synthetic */ String o;
    private static final int[] a;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;
    private final ke e;
    private final ke f;

    private static int JR(int n2, int n3) {
        int n4 = -234125892;
        int n5 = -1946259071;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x50DADDAD)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xFBFF744A;
        n6 -= (n5 | n4) ^ 0xFBFF3878;
        n6 += (n5 | n4) ^ 0xFBFFB28A;
        n6 += (n5 | n4) ^ 0xFBFFC269;
        n6 -= (n5 | n4) ^ 0xFBFF809C;
        n6 += (n5 | n4) ^ 0xFBFF3DBA;
        n6 += (n5 | n4) ^ 0xFBFF2F45;
        n6 -= (n5 | n4) ^ 0xFBFFFF32;
        return n6 -= (n5 | n4) ^ 0xFBFF7009;
    }

    /*
     * Exception decompiling
     */
    public it() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[SWITCH]], but top level block is 4[SWITCH]
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
    @Override
    public void onEnable() {
        block21: {
            block23: {
                block20: {
                    block22: {
                        break block22;
lbl1:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ 272606106;
                            break block20;
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var2_4 ^= var3_3 ^ -368812667;
                            ** GOTO lbl40
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 60319039;
                            break block21;
                            break;
                        }
                    }
                    var4_1 = 1441485305;
                    var1_2 = it.a & 1441485305 ^ -1609830057;
                    var3_3 = 0;
                    break block23;
                }
                var3_3 = (var1_2 | var4_1) ^ 548297352;
                break block21;
lbl18:
                // 1 sources

                return;
lbl20:
                // 1 sources

                while (true) {
                    this.a = null;
                    ** GOTO lbl45
                    break;
                }
            }
            var2_4 = (var1_2 | var4_1) ^ -1154460418;
            var3_3 = (var1_2 | var4_1) ^ 1084353472;
        }
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
                case 1317454451: {
                    ** continue;
                }
                case -1184106469: {
                    ** continue;
                }
                case 1363665063: {
                    ** continue;
                }
                case 1720285739: {
                    ** continue;
                }
lbl40:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -1822258220;
                ** GOTO lbl-1000
                case -716854409: {
                    this.a = true;
                    ** GOTO lbl47
                }
lbl45:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -1150471284;
                ** GOTO lbl-1000
lbl47:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 1904634486;
                ** GOTO lbl-1000
lbl49:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 1283459556;
                    ** GOTO lbl-1000
                    break;
                }
                case -1253434817: {
                    ** continue;
                }
                case -160197440: {
                    var2_4 ^= var3_3 ^ -648807415;
                    ** GOTO lbl60
                }
lbl57:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1532227240;
                    ** GOTO lbl-1000
                    break;
                }
lbl60:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -102937859;
                ** continue;
                case -2073191543: {
                    var2_4 ^= var3_3 ^ -1287764120;
                    ** continue;
                }
                case 204913410: 
            }
            break;
        }
        this.a.clear();
        ** while (true)
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
    @Override
    public void onDisable() {
        var4_1 = 1986227706;
        var1_2 = it.a & 1986227706 ^ -1846771183;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 1783253698;
        var3_3 = (var1_2 | var4_1) ^ 1220407110;
        ** GOTO lbl30
lbl7:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ 1650583704;
            if (true) ** GOTO lbl12
            break;
        }
        block10: while (true) {
            var3_3 = (var1_2 | var4_1) ^ 725275830;
lbl12:
            // 2 sources

            block11: while (true) {
                switch (var3_3) {
                    case -482416439: {
                        var2_4 ^= var3_3 ^ 795856937;
                        var3_3 = (var1_2 | var4_1) ^ -207399641;
                        continue block11;
                    }
                    case -1085144899: {
                        var3_3 = (var1_2 | var4_1) ^ -552338670;
                        continue block11;
                    }
                    case -590005427: {
                        var2_4 ^= var3_3 ^ 344644337;
                        ** continue;
                    }
                    case 72137436: {
                        this.a = null;
                        continue block10;
                    }
                    case 1009556419: {
                        this.a.clear();
                        var3_3 = (var1_2 | var4_1) ^ 349243186;
                    }
lbl30:
                    // 3 sources

                    default: {
                        continue block11;
                    }
                    case 687609065: {
                        var2_4 ^= var3_3 ^ -765636726;
                        var3_3 = (var1_2 | var4_1) ^ -876383176;
                        continue block11;
                    }
                    case -1785854109: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void onTick(class_310 var1_1) {
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
    private void JS(class_310 var1_1, mh var2_2) {
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
    private void JT(class_310 var1_1, mh var2_2) {
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
     * Unable to fully structure code
     */
    private void JU(mh var1_1, class_742 var2_2, class_310 var3_3) {
        block15: {
            block16: {
                break block16;
lbl1:
                // 1 sources

                while (true) {
                    var6_6 = (var4_5 | var7_4) ^ -1152903254;
                    break block15;
                    break;
                }
            }
            var7_4 = -1820845106;
            var4_5 = it.a & -1820845106 ^ 165803725;
            var6_6 = 0;
            var5_7 = (var4_5 | var7_4) ^ 1506596283;
            ** GOTO lbl36
        }
lbl11:
        // 2 sources

        block10: while (true) {
            switch (var6_6) lbl-1000:
            // 6 sources

            {
                while (true) {
                    default: {
                        continue block10;
                    }
                    break;
                }
                case 1898103179: {
                    return;
                }
                case -12763707: {
                    break block10;
                }
lbl20:
                // 1 sources

                while (true) {
                    var6_6 = (var4_5 | var7_4) ^ -1444397976;
                    ** GOTO lbl-1000
                    break;
                }
                case 548530277: {
                    var5_7 ^= var6_6 ^ -1618194743;
                    var6_6 = (var4_5 | var7_4) ^ -354730428;
                    ** GOTO lbl-1000
                }
                case -706269834: {
                    var1_1.a = Math.round(var2_2.method_5739((class_1297)var3_3.field_1724));
                    ** continue;
                }
lbl30:
                // 1 sources

                while (true) {
                    var6_6 = (var4_5 | var7_4) ^ -640993554;
                    ** GOTO lbl-1000
                    break;
                }
                case 1110624545: {
                    var1_1.a = var2_2.method_24515();
                    ** continue;
                }
lbl36:
                // 1 sources

                var6_6 = (var4_5 | var7_4) ^ 1690616330;
                ** GOTO lbl-1000
lbl38:
                // 1 sources

                while (true) {
                    var6_6 = (var4_5 | var7_4) ^ 1310642873;
                    ** continue;
                    break;
                }
                case 840024999: {
                    var5_7 ^= var6_6 ^ -600252356;
                    ** continue;
                }
            }
            break;
        }
        var6_6 = (var4_5 | var7_4) ^ 2007060553;
        ** while (true)
        {
            ** case -329732218:
        }
lbl47:
        // 1 sources

        var5_7 ^= var6_6 ^ 272799489;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private boolean JV() {
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
    private boolean JW() {
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
    private static boolean JX(String var0) {
        block19: {
            block20: {
                break block20;
                {
                    var4_3 = (var2_2 | var5_1) ^ -1363398972;
                    block16: while (true) {
                        switch (var4_3) {
                            case -1741662226: {
                                var3_4 ^= var4_3 ^ -634924031;
                                ** break;
                            }
                            case -1823052268: {
                                if (var1_5 == null) continue block15;
                                ** GOTO lbl27
                            }
                            case 755925315: {
                                if (!var1_5.isFriend(var0)) ** break;
                                ** GOTO lbl29
                            }
                            case 1836510354: {
                                v0 = true;
                                break block19;
                            }
                            case -1384655106: {
                                var4_3 = (var2_2 | var5_1) ^ -966718812;
                                ** GOTO lbl25
                            }
                            case -947984755: {
                                var3_4 ^= var4_3 ^ 892383879;
                                ** GOTO lbl24
                            }
lbl22:
                            // 1 sources

                            var4_3 = (var2_2 | var5_1) ^ -2045155467;
                            ** GOTO lbl25
lbl24:
                            // 1 sources

                            var4_3 = (var2_2 | var5_1) ^ 2017060339;
lbl25:
                            // 5 sources

                            default: {
                                continue block16;
                            }
lbl27:
                            // 1 sources

                            var4_3 = (var2_2 | var5_1) ^ 1176001817;
                            continue block16;
lbl29:
                            // 1 sources

                            var4_3 = (var2_2 | var5_1) ^ 1935662089;
                            continue block16;
                            case -315972592: {
                                v0 = false;
                                break block19;
                            }
                            case 1171498275: 
                        }
                        var3_4 ^= var4_3 ^ 130295500;
                        var4_3 = (var2_2 | var5_1) ^ 105197559;
                    }
                }
            }
            var5_1 = 727813059;
            var2_2 = it.a & 727813059 ^ -1072790811;
            var4_3 = 0;
            var3_4 = (var2_2 | var5_1) ^ 1218903485;
            var4_3 = (var2_2 | var5_1) ^ -1396942312;
            block18: while (true) {
                switch (var4_3) {
                    default: {
                        continue block18;
                    }
                    case 1205064191: {
                        var4_3 = (var2_2 | var5_1) ^ -859415662;
                        continue block18;
                    }
                    case -1556947432: {
                        var1_5 = ix.get();
                        var4_3 = (var2_2 | var5_1) ^ 739339626;
                        ** GOTO lbl25
                    }
                    case 665440373: 
                }
                var3_4 ^= var4_3 ^ 1932192648;
                var4_3 = (var2_2 | var5_1) ^ 1214076415;
            }
        }
        var3_4 ^= -1449772088;
        return v0;
    }

    /*
     * Exception decompiling
     */
    private static boolean JY(class_310 var0, class_742 var1_1) {
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
    private void JZ(String var1_1) {
        block78: {
            block75: {
                block79: {
                    block77: {
                        block76: {
                            var9_2 = -1409956705;
                            var6_3 = it.a & -1409956705 ^ 273056959;
                            var8_4 = 0;
                            var7_5 = (var6_3 | var9_2) ^ -1978479885;
                            var8_4 = (var6_3 | var9_2) ^ 937740388;
                            break block75;
lbl7:
                            // 1 sources

                            while (true) {
                                var8_4 = (var6_3 | var9_2) ^ -1717811589;
                                break block75;
                                break;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                var7_5 ^= var8_4 ^ -1373521572;
                                var8_4 = (var6_3 | var9_2) ^ 587430392;
                                break block75;
                                break;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                if (!((Boolean)this.a.getValue()).booleanValue()) ** GOTO lbl23
                                var8_4 = (var6_3 | var9_2) ^ -1535904721;
                                break block75;
                                break;
                            }
lbl18:
                            // 1 sources

                            while (true) {
                                var8_4 = (var6_3 | var9_2) ^ -1744001050;
                                break block75;
                                break;
                            }
lbl21:
                            // 1 sources

                            while (true) {
                                if (!((String)this.b.getValue()).isEmpty()) break block76;
lbl23:
                                // 2 sources

                                var8_4 = (var6_3 | var9_2) ^ -22113781;
                                break block75;
                                break;
                            }
lbl25:
                            // 1 sources

                            while (true) {
                                var7_5 ^= var8_4 ^ -1386514890;
                                var8_4 = (var6_3 | var9_2) ^ 100954852;
                                break block75;
                                break;
                            }
lbl29:
                            // 1 sources

                            return;
                        }
                        var8_4 = (var6_3 | var9_2) ^ -2009826322;
                        break block75;
lbl34:
                        // 1 sources

                        while (true) {
                            var7_5 ^= var8_4 ^ 2040776267;
                            var8_4 = (var6_3 | var9_2) ^ 1116693165;
                            break block75;
                            break;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            if (!((Boolean)this.f.getValue()).booleanValue()) break block77;
                            var8_4 = (var6_3 | var9_2) ^ -252209643;
                            break block75;
                            break;
                        }
lbl42:
                        // 1 sources

                        while (true) {
                            var8_4 = (var6_3 | var9_2) ^ 1197973808;
                            break block75;
                            break;
                        }
lbl45:
                        // 1 sources

                        while (true) {
                            if (((String)this.a.getValue()).isEmpty()) break block77;
                            var8_4 = (var6_3 | var9_2) ^ -246054016;
                            break block75;
                            break;
                        }
lbl49:
                        // 2 sources

                        while (true) {
                            var8_4 = (var6_3 | var9_2) ^ 1429401319;
                            break block75;
                            break;
                        }
lbl52:
                        // 1 sources

                        block57: while (true) {
                            switch (var7_5) {
                                case 1512331525: {
                                    var8_4 = (var6_3 | var9_2) ^ 1722108688;
                                    break block57;
                                }
lbl57:
                                // 1 sources

                                while (true) {
                                    var7_5 ^= var8_4 ^ -580984438;
                                    ** GOTO lbl49
                                    break;
                                }
                                default: {
                                    var8_4 = (var6_3 | var9_2) ^ 1846362897;
                                    break block57;
                                }
lbl63:
                                // 1 sources

                                while (true) {
                                    var7_5 ^= var8_4 ^ -153793512;
                                    ** GOTO lbl72
                                    break;
                                }
                                case 1600948838: {
                                    var8_4 = (var6_3 | var9_2) ^ -1907712158;
                                    break block57;
                                }
                            }
                            break;
                        }
                        break block75;
lbl70:
                        // 1 sources

                        while (true) {
                            var7_5 ^= var8_4 ^ 1082368416;
lbl72:
                            // 2 sources

                            var8_4 = (var6_3 | var9_2) ^ -1737223880;
                            break block75;
                            break;
                        }
lbl74:
                        // 1 sources

                        while (true) {
                            var8_4 = (var6_3 | var9_2) ^ -355195570;
                            break block75;
                            break;
                        }
lbl77:
                        // 1 sources

                        while (true) {
                            v0 = "<@" + (String)this.a.getValue() + "> ";
                            ** GOTO lbl89
                            break;
                        }
                    }
                    var8_4 = (var6_3 | var9_2) ^ -1239338563;
                    break block75;
lbl83:
                    // 1 sources

                    while (true) {
                        var7_5 ^= var8_4 ^ 788086452;
                        var8_4 = (var6_3 | var9_2) ^ 640381277;
                        break block75;
                        break;
                    }
lbl87:
                    // 1 sources

                    while (true) {
                        v0 = "";
lbl89:
                        // 2 sources

                        var7_5 ^= -1065311432;
                        var2_6 = v0;
                        var7_5 ^= 90324904;
                        var3_7 = "{\"content\":\"" + (String)var2_6 + var1_1.replace(it.b, it.p) + "\"}";
                        try {
                            var7_5 ^= -1773711878;
                            var4_8 = HttpClient.newHttpClient();
                            var7_5 ^= 928354269;
                            var7_5 ^= -900684128;
                            var7_5 ^= 710800462;
                            v1 = HttpRequest.newBuilder().uri(URI.create((String)this.b.getValue())).header(it.c, it.g);
                            block65: while (true) {
                                switch (var7_5) {
                                    default: {
                                        var7_5 ^= 1568604569;
                                        break block65;
                                    }
                                    case 1344113441: {
                                        var7_5 ^= 1482528932;
                                        break block65;
                                    }
                                    case 1556954555: {
                                        var7_5 ^= -117575508;
                                        continue block65;
                                    }
                                }
                                break;
                            }
                            var7_5 ^= -1256041759;
                            var5_9 = v1.POST(HttpRequest.BodyPublishers.ofString(var3_7)).build();
                            var7_5 ^= 1385174416;
                            HttpResponse.BodyHandlers.ofString();
                            CompletableFuture.failedFuture(new IllegalStateException());
                            var7_5 ^= 1606137154;
                        }
                        catch (Exception v2) {
                            var7_5 = (var6_3 | var9_2) ^ 197010697;
                            var4_8 = v2;
                        }
                        var8_4 = (var6_3 | var9_2) ^ 1766737743;
                        break block78;
                        break;
                    }
lbl127:
                    // 2 sources

                    while (true) {
                        var8_4 = (var6_3 | var9_2) ^ -1324695953;
                        break block78;
                        break;
                    }
lbl130:
                    // 1 sources

                    block67: while (true) {
                        switch (var7_5) {
                            case -1337335370: {
                                var8_4 = (var6_3 | var9_2) ^ -1912215054;
                                break block67;
                            }
lbl135:
                            // 1 sources

                            while (true) {
                                var7_5 ^= var8_4 ^ 1230890481;
                                break block79;
                                break;
                            }
                            default: {
                                var8_4 = (var6_3 | var9_2) ^ -287382464;
                                break block67;
                            }
lbl141:
                            // 1 sources

                            while (true) {
                                var7_5 ^= var8_4 ^ 1584349324;
                                break block79;
                                break;
                            }
                            case -45489969: {
                                var8_4 = (var6_3 | var9_2) ^ 1477924638;
                                break block67;
                            }
                        }
                        break;
                    }
                    break block78;
lbl148:
                    // 1 sources

                    while (true) {
                        var7_5 ^= var8_4 ^ 1808231313;
                        ** GOTO lbl127
                        break;
                    }
                }
                var8_4 = (var6_3 | var9_2) ^ 834761553;
                break block78;
lbl154:
                // 1 sources

                while (true) {
                    var8_4 = (var6_3 | var9_2) ^ 1767869275;
                    break block78;
                    break;
                }
lbl157:
                // 1 sources

                return;
            }
            block73: while (true) {
                switch (var8_4) {
                    default: {
                        continue block73;
                    }
                    case -1944908581: {
                        ** continue;
                    }
                    case 577471172: {
                        ** continue;
                    }
                    case -1728791225: {
                        ** continue;
                    }
                    case 528756880: {
                        ** continue;
                    }
                    case 603677529: {
                        ** continue;
                    }
                    case 1163482804: {
                        ** continue;
                    }
                    case -1108101541: {
                        ** continue;
                    }
                    case 868466513: {
                        ** continue;
                    }
                    case -109533678: {
                        ** continue;
                    }
                    case 1258312362: {
                        ** continue;
                    }
                    case -57645681: {
                        ** continue;
                    }
                    case 1252149055: {
                        ** continue;
                    }
                    case -289068456: {
                        ** continue;
                    }
                    case -581791825: {
                        ** continue;
                    }
                    case -705001554: {
                        ** continue;
                    }
                    case 901602269: {
                        ** continue;
                    }
                    case 595842439: {
                        ** continue;
                    }
                    case 1361306097: {
                        ** continue;
                    }
                    case 232191234: {
                        ** continue;
                    }
                    ** case -1646479902:
lbl203:
                    // 1 sources

                    ** continue;
                }
                break;
            }
        }
        block74: while (true) {
            switch (var8_4) {
                default: {
                    continue block74;
                }
                case -759594000: {
                    ** continue;
                }
                case 184384208: {
                    ** continue;
                }
                case 905063757: {
                    ** continue;
                }
                case 1428758783: {
                    ** continue;
                }
                case -471821407: {
                    ** continue;
                }
                case -1976125458: {
                    ** continue;
                }
                ** case -760721436:
lbl222:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ String Ka(mh var0) {
        var1_1 = it.a & -461381373 ^ -866109369;
        var3_2 = 0;
        if (true) ** GOTO lbl18
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
lbl9:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | -461381373) ^ 942287309;
                    ** GOTO lbl-1000
                    break;
                }
lbl12:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | -461381373) ^ 1178576238;
                    ** GOTO lbl-1000
                    break;
                }
                case -2060434759: {
                    var2_3 ^= var3_2 ^ -905771322;
                    ** continue;
                }
lbl18:
                // 1 sources

                var2_3 = (var1_1 | -461381373) ^ -1601149974;
                ** continue;
lbl20:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | -461381373) ^ 1766833150;
                    ** continue;
                    break;
                }
                case -732573558: {
                    return var0.a;
                }
                case -1438622679: 
            }
            break;
        }
        ** while (true)
    }
}

