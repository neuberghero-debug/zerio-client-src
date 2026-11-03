/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1309
 *  net.minecraft.class_310
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import z.r.kR;
import z.r.kU;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class fw
extends kU {
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), 1946116011);
    private final kR a;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public fw(kR var1_1) {
        var5_2 = 1004929817;
        var2_3 = fw.a & 1004929817 ^ -693213446;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ 785838886;
        var3_5 ^= -1021663384;
        super();
        var4_4 = (var2_3 | var5_2) ^ -1910757624;
        block6: while (true) {
            switch (var4_4) {
                case -1176017869: {
                    var3_5 ^= var4_4 ^ -1321367681;
                    var4_4 = (var2_3 | var5_2) ^ 717140128;
                    ** break;
                }
                case -540503213: {
                    this.a = var1_1;
                    var4_4 = (var2_3 | var5_2) ^ 1174995912;
                    ** break;
                }
                case 1911701747: {
                    var3_5 ^= var4_4 ^ 625937508;
                    var4_4 = (var2_3 | var5_2) ^ 539423912;
                }
lbl21:
                // 4 sources

                default: {
                    continue block6;
                }
                case -716122277: 
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public float getSpeed() {
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
    private static double VJ(class_310 var0, class_1309 var1_1) {
        var11_2 = -1975877425;
        var8_3 = fw.a & -1975877425 ^ -2085620084;
        var10_4 = 0;
        var9_5 = (var8_3 | var11_2) ^ -552017105;
        var10_4 = (var8_3 | var11_2) ^ -1669310217;
        if (true) ** GOTO lbl-1000
        block18: while (true) {
            var10_4 = (var8_3 | var11_2) ^ 718464468;
            block19: while (true) {
                switch (var10_4) lbl-1000:
                // 2 sources

                {
                    default: {
                        continue block19;
                    }
                    case 1762803009: {
                        var9_5 ^= var10_4 ^ 1427652718;
                        continue block18;
                    }
                    case 390049336: {
                        var10_4 = (var8_3 | var11_2) ^ -491926642;
                        continue block19;
                    }
                    case -1586687205: 
                }
                break;
            }
            break;
        }
        var2_6 = var0.field_1724.method_23317() - var1_1.method_23317();
        var9_5 ^= -941694257;
        var4_7 = var0.field_1724.method_23318() - var1_1.method_23318();
        var9_5 ^= -753952386;
        var6_8 = var0.field_1724.method_23321() - var1_1.method_23321();
        var10_4 = (var8_3 | var11_2) ^ -329423737;
        if (true) ** GOTO lbl29
        block20: while (true) {
            var10_4 = (var8_3 | var11_2) ^ -1186647773;
lbl29:
            // 2 sources

            block21: while (true) {
                switch (var10_4) {
                    case -847600168: {
                        ** break;
                    }
                    case 1742901832: {
                        ** GOTO lbl58
                    }
                    case 855295980: {
                        ** break;
                    }
                    case -651798644: {
                        var9_5 ^= var10_4 ^ -633452698;
                        continue block20;
                    }
                    case -1756373828: {
                        var9_5 ^= var10_4 ^ -911350183;
                        continue block20;
                    }
lbl43:
                    // 1 sources

                    switch (var9_5) {
                        case 2088506238: {
                            var10_4 = (var8_3 | var11_2) ^ 1385800003;
                            break;
                        }
lbl47:
                        // 1 sources

                        var10_4 = (var8_3 | var11_2) ^ -681826060;
                        break;
                        default: {
                            var10_4 = (var8_3 | var11_2) ^ 485501555;
                            break;
                        }
                        case 2034584945: {
                            var10_4 = (var8_3 | var11_2) ^ 817157179;
                            break;
                        }
                    }
                    ** GOTO lbl59
                    case -1156898060: {
                        var9_5 ^= var10_4 ^ 1445453147;
lbl58:
                        // 2 sources

                        var10_4 = (var8_3 | var11_2) ^ 1187336983;
                    }
lbl59:
                    // 3 sources

                    default: {
                        continue block21;
                    }
                    case 1558437435: 
                }
                break;
            }
            break;
        }
        return Math.sqrt(var2_6 * var2_6 + var4_7 * var4_7 + var6_8 * var6_8);
    }
}

