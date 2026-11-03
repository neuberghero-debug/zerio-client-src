/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.dm;
import z.r.eC;
import z.r.kd;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class aE
extends eC<String> {
    private int a;
    public static final int b = mK.a(MethodHandles.lookup().lookupClass(), 755927500);
    private final List<String> a;

    /*
     * Exception decompiling
     */
    public aE(String var1_1, String var2_2, String ... var3_3) {
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
    public List<String> getModes() {
        int n2 = b & 0x5FA541D2 ^ 0x93BD9980;
        int n3 = 0;
        int n4 = (n2 | 0x5FA541D2) ^ 0xDD839CE9;
        n3 = (n2 | 0x5FA541D2) ^ 0x78BC85C6;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1815534748: {
                    return this.a;
                }
                case -1493083116: {
                    n3 = (n2 | 0x5FA541D2) ^ 0x3B53F7EB;
                    continue block5;
                }
                case -454152647: 
            }
            n4 ^= n3 ^ 0x5D11B1AD;
            n3 = (n2 | 0x5FA541D2) ^ 0xB38B054E;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void cycle() {
        block17: {
            var4_1 = -1050565182;
            var1_2 = aE.b & -1050565182 ^ -356293331;
            var3_3 = 0;
            ** GOTO lbl36
lbl5:
            // 1 sources

            block11: while (true) {
                var3_3 = (var1_2 | var4_1) ^ 1668523241;
lbl7:
                // 5 sources

                block12: while (true) {
                    switch (var3_3) lbl-1000:
                    // 5 sources

                    {
                        while (true) {
                            default: {
                                continue block12;
                            }
                            break;
                        }
                        case -2046727277: {
                            var2_4 ^= var3_3 ^ -64954691;
                            break;
                        }
                        case -2003812090: {
                            dm.requestSave();
                            break block17;
                        }
lbl18:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 696968123;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -507486906: {
                            var2_4 ^= var3_3 ^ -56917981;
                            ** continue;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ -1698854753;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -1000555268: {
                            var2_4 ^= var3_3 ^ 1971744050;
                            ** continue;
                        }
                        case -1033304492: {
                            this.a = (int)this.a.get(this.a);
                            break block11;
                        }
lbl33:
                        // 1 sources

                        while (true) {
                            var3_3 = (var1_2 | var4_1) ^ 170113193;
                            ** GOTO lbl-1000
                            break;
                        }
lbl36:
                        // 1 sources

                        var2_4 = (var1_2 | var4_1) ^ -659870942;
                        var3_3 = (var1_2 | var4_1) ^ -563338310;
                        ** continue;
                        case 1902013808: {
                            return;
                        }
                    }
                    break;
                }
                break;
            }
            var3_3 = (var1_2 | var4_1) ^ -491766838;
            ** GOTO lbl7
            {
                case 898614869: {
                    break;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ 1498323326;
            ** GOTO lbl7
            {
                case 156491301: {
                    var2_4 ^= var3_3 ^ 661640424;
                    ** continue;
                }
            }
            var3_3 = (var1_2 | var4_1) ^ 1843564156;
            ** GOTO lbl7
        }
        var3_3 = (var1_2 | var4_1) ^ 801069331;
        ** while (true)
        {
            ** case -1297253231:
        }
lbl56:
        // 1 sources

        this.a = (this.a + 1) % this.a.size();
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    @Override
    public void setValue(String var1_1) {
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
    public boolean is(String string) {
        int n2 = b & 0x58087F67 ^ 0x1065E075;
        int n3 = 0;
        int n4 = (n2 | 0x58087F67) ^ 0xD15EF97C;
        n3 = (n2 | 0x58087F67) ^ 0xB0DD7405;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -391083150: {
                    n3 = (n2 | 0x58087F67) ^ 0x9781CB53;
                    continue block5;
                }
                case -806603740: {
                    n4 ^= n3 ^ 0x8CD09F33;
                    break;
                }
                case 1250799664: {
                    return ((String)this.a).equalsIgnoreCase(string);
                }
            }
            n3 = (n2 | 0x58087F67) ^ 0x12E04F47;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String getDisplayValue() {
        int n2 = b & 0x28798A91 ^ 0x3C1D5B5E;
        int n3 = 0;
        int n4 = (n2 | 0x28798A91) ^ 0xDC93C796;
        n3 = (n2 | 0x28798A91) ^ 0xF62EDB12;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -900529971: {
                    n3 = (n2 | 0x28798A91) ^ 0xB055CD99;
                    continue block5;
                }
                case -1943529914: {
                    n4 ^= n3 ^ 0xBC5C7CF0;
                    n3 = (n2 | 0x28798A91) ^ 0xDD84E034;
                    continue block5;
                }
                case -503759893: 
            }
            break;
        }
        return (String)this.a;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public kd getType() {
        var1_1 = aE.b & -268444193 ^ 1335535120;
        var3_2 = 0;
        if (true) ** GOTO lbl14
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
                case -1044466732: {
                    ** GOTO lbl17
                }
lbl11:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | -268444193) ^ -1084834469;
                    ** GOTO lbl-1000
                    break;
                }
lbl14:
                // 1 sources

                var2_3 = (var1_1 | -268444193) ^ 1979503805;
                var3_2 = (var1_1 | -268444193) ^ 776031243;
                ** GOTO lbl-1000
lbl17:
                // 1 sources

                var3_2 = (var1_1 | -268444193) ^ 249629049;
                ** continue;
                case -518064474: {
                    var2_3 ^= var3_2 ^ 1308505108;
                    ** continue;
                }
                case 1353269892: 
            }
            break;
        }
        return kd.f;
    }
}

