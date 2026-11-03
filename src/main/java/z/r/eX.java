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
import z.r.dA;
import z.r.gF;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class eX
extends gF {
    private static final int[] a;
    private static final /* synthetic */ String s;
    public static boolean a;
    public static final int a;
    private static final /* synthetic */ String k;

    /*
     * Enabled aggressive block sorting
     */
    public eX() {
        int n2 = a & 0x92737EFF ^ 0x5E7497A1;
        int n3 = (n2 | 0x92737EFF) ^ 0x10704596;
        n3 ^= 0x5D1A4FB2;
        super(k, s, dA.u);
        n3 ^= 0x2997C846;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onEnable() {
        block10: {
            block11: {
                break block11;
lbl1:
                // 3 sources

                block7: while (true) {
                    switch (var3_3) {
                        default: {
                            continue block7;
                        }
                        case -909250431: {
                            eX.a = true;
                            break;
                        }
                        case 1765710818: {
                            var2_4 ^= var3_3 ^ 1439046874;
                            break;
                        }
                        case -1466764629: {
                            return;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1532333333;
                    continue;
                    {
                        case 1545787683: {
                            var2_4 ^= var3_3 ^ 1252244548;
                            break block10;
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ -1694899108;
                    continue;
                    break;
                }
lbl20:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ 657395075;
                    ** GOTO lbl1
                    break;
                }
lbl23:
                // 1 sources

                while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -1343904099;
                    ** GOTO lbl1
                    break;
                }
            }
            var4_1 = 1921453242;
            var1_2 = eX.a & 1921453242 ^ -1857848570;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -1348120799;
            ** while (true)
        }
        var3_3 = (var1_2 | var4_1) ^ 973770559;
        ** while (true)
        {
            ** case -722963907:
        }
lbl36:
        // 1 sources

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
     * Enabled aggressive block sorting
     */
    @Override
    public void onDisable() {
        int n2 = -152997656;
        int n3 = a & 0xF6E170E8 ^ 0xEA36E9D9;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xA35C1834;
        n4 = (n3 | n2) ^ 0xEBEA89AA;
        block7: while (true) {
            block8: {
                block9: {
                    switch (n4) {
                        case -519392932: {
                            a = false;
                            break block8;
                        }
                        case 828062689: {
                            n5 ^= n4 ^ 0x4BCDC98A;
                            n4 = (n3 | n2) ^ 0x1FFD48A5;
                        }
                        default: {
                            continue block7;
                        }
                        case 354250835: {
                            break;
                        }
                        case -761989227: {
                            return;
                        }
                        case -1245882649: {
                            n5 ^= n4 ^ 0xEB821F21;
                            break block9;
                        }
                    }
                    n4 = (n3 | n2) ^ 0xCFACC218;
                    continue;
                }
                n4 = (n3 | n2) ^ 0x2C630E6C;
                continue;
            }
            n4 = (n3 | n2) ^ 0x4B4AAF1E;
        }
    }

    private static int hr(int n2, int n3) {
        int n4 = -932769012;
        int n5 = 1326077576;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x46D70D51)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xCF6F7D18;
        n6 += (n5 | n4) ^ 0xCF6F643E;
        n6 ^= (n5 | n4) ^ 0xCF6F52DB;
        n6 -= (n5 | n4) ^ 0xCF6F2452;
        n6 += (n5 | n4) ^ 0xCF6F35FF;
        return n6 ^= (n5 | n4) ^ 0xCF6F03B6;
    }
}

