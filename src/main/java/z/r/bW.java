/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.objectweb.asm.tree.ClassNode
 *  org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin
 *  org.spongepowered.asm.mixin.extensibility.IMixinInfo
 */
package z.r;

import java.util.List;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class bW
implements IMixinConfigPlugin {
    public static final int a;
    private static final int[] a;
    private static final /* synthetic */ String a;
    private static final boolean a;

    /*
     * Enabled aggressive block sorting
     */
    public bW() {
        int n2 = a & 0x257D3068 ^ 0x2901BBBF;
        int n3 = (n2 | 0x257D3068) ^ 0x4D8F5FD0;
        n3 ^= 0x11362808;
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
    public void onLoad(String var1_1) {
        block7: {
            var2_2 = bW.a & 1300067043 ^ 885595569;
            var4_3 = 0;
            var3_4 = (var2_2 | 1300067043) ^ -2061693130;
            ** GOTO lbl12
lbl5:
            // 2 sources

            block5: while (true) {
                switch (var4_3) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block5;
                        }
                        break;
                    }
                    case -1522008773: {
                        break block5;
                    }
lbl12:
                    // 1 sources

                    var4_3 = (var2_2 | 1300067043) ^ -658865464;
                    ** continue;
                    case -1355299617: {
                        var3_4 ^= var4_3 ^ -1380909468;
                        break block7;
                    }
                }
                break;
            }
            var4_3 = (var2_2 | 1300067043) ^ -758465748;
            ** GOTO lbl5
            {
                ** case -1457741501:
            }
lbl20:
            // 1 sources

            return;
        }
        var4_3 = (var2_2 | 1300067043) ^ -723394896;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public String getRefMapperConfig() {
        int n2 = a & 0x81364F8 ^ 0x743CCDDE;
        int n3 = 0;
        int n4 = (n2 | 0x81364F8) ^ 0xF9BE2F5C;
        n3 = (n2 | 0x81364F8) ^ 0x51860775;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -244500345: {
                    return null;
                }
                case 767158923: {
                    n3 = (n2 | 0x81364F8) ^ 0x6B60A19D;
                    continue block5;
                }
                case 392121443: 
            }
            n4 ^= n3 ^ 0xEA2D0978;
            n3 = (n2 | 0x81364F8) ^ 0x8D52D579;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean shouldApplyMixin(String string, String string2) {
        int n2 = a & 0xF0681487 ^ 0x3D6CA789;
        int n3 = 0;
        int n4 = (n2 | 0xF0681487) ^ 0x1FF734AD;
        n3 = (n2 | 0xF0681487) ^ 0x7606FC54;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 426285509: {
                    return a;
                }
                case 1024554365: {
                    n4 ^= n3 ^ 0xF42D286D;
                    n3 = (n2 | 0xF0681487) ^ 0xE4042E4A;
                    continue block5;
                }
                case -1955968037: 
            }
            n3 = (n2 | 0xF0681487) ^ 0xC07DC2F2;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void acceptTargets(Set<String> var1_1, Set<String> var2_2) {
        block8: {
            break block8;
lbl1:
            // 1 sources

            block5: while (true) {
                switch (var5_4) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block5;
                        }
                        break;
                    }
                    case -834228252: {
                        var4_5 ^= var5_4 ^ -929444831;
                        var5_4 = (var3_3 | 132217506) ^ -1586068251;
                        ** GOTO lbl-1000
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var5_4 = (var3_3 | 132217506) ^ -1314795190;
                        ** continue;
                        break;
                    }
                    case -1721012259: {
                        ** continue;
                    }
                    case -560858549: {
                        return;
                    }
                }
                break;
            }
        }
        var3_3 = bW.a & 132217506 ^ 2080773676;
        var5_4 = 0;
        var4_5 = (var3_3 | 132217506) ^ -1635184964;
        var5_4 = (var3_3 | 132217506) ^ -427028109;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public List<String> getMixins() {
        int n2 = a & 0x11568A19 ^ 0x9A9D18F4;
        int n3 = 0;
        int n4 = (n2 | 0x11568A19) ^ 0x1DF4417C;
        n3 = (n2 | 0x11568A19) ^ 0x6EFA57CE;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1222426671: {
                    return null;
                }
                case -1863281866: {
                    n4 ^= n3 ^ 0x254190EC;
                    n3 = (n2 | 0x11568A19) ^ 0x2CFCA52C;
                    continue block5;
                }
                case -182072013: 
            }
            n3 = (n2 | 0x11568A19) ^ 0xB2F09CB;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void preApply(String string, ClassNode classNode, String string2, IMixinInfo iMixinInfo) {
        int n2 = a & 0x88369CAD ^ 0xA0663C4C;
        int n3 = 0;
        int n4 = (n2 | 0x88369CAD) ^ 0xCC95145B;
        n3 = (n2 | 0x88369CAD) ^ 0xE612E4A3;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -740280011: {
                    n4 ^= n3 ^ 0xF38167EB;
                    n3 = (n2 | 0x88369CAD) ^ 0x2F19809C;
                    continue block5;
                }
                case 1315199054: {
                    n3 = (n2 | 0x88369CAD) ^ 0x7B9685D8;
                    continue block5;
                }
                case -2022753167: 
            }
            break;
        }
    }

    private static int a(int n2, int n3) {
        int n4 = -822341050;
        int n5 = 2090513162;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xA4AB5B62)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xFEFE17C7;
        n6 += (n5 | n4) ^ 0xFEFE4786;
        n6 += (n5 | n4) ^ 0xFEFE9B2C;
        n6 -= (n5 | n4) ^ 0xFEFE4A15;
        n6 -= (n5 | n4) ^ 0xFEFE8475;
        n6 += (n5 | n4) ^ 0xFEFE01EA;
        n6 += (n5 | n4) ^ 0xFEFE563E;
        n6 ^= (n5 | n4) ^ 0xFEFE1234;
        n6 ^= (n5 | n4) ^ 0xFEFEE34D;
        return n6 ^= (n5 | n4) ^ 0xFEFE06F1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void postApply(String string, ClassNode classNode, String string2, IMixinInfo iMixinInfo) {
        int n2 = a & 0x116FEBCF ^ 0x3172AA05;
        int n3 = 0;
        int n4 = (n2 | 0x116FEBCF) ^ 0x50C5956A;
        n3 = (n2 | 0x116FEBCF) ^ 0x9968C123;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1474876692: {
                    n3 = (n2 | 0x116FEBCF) ^ 0x3E11A8BB;
                    continue block5;
                }
                case 258884468: {
                    n4 ^= n3 ^ 0xF47912F4;
                    n3 = (n2 | 0x116FEBCF) ^ 0xF2DDA886;
                    continue block5;
                }
                case -1012776119: 
            }
            break;
        }
    }
}

