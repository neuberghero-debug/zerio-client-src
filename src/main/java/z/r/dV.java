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
import z.r.bM;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class dV
extends bM {
    public static final int a;
    private static final /* synthetic */ String s;
    private static final int[] a;
    private static final /* synthetic */ String k;

    /*
     * Exception decompiling
     */
    static {
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
     * Enabled aggressive block sorting
     */
    public dV() {
        int n2 = a & 0x5D652FE3 ^ 0x1B97AE8F;
        int n3 = (n2 | 0x5D652FE3) ^ 0x847C4DA1;
        n3 ^= 0x8F08EB20;
        super(k, s);
        n3 ^= 0xEC725D37;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onCombatTick() {
        int n2 = a & 0x743B5E24 ^ 0xE29B8CD;
        int n3 = 0;
        int n4 = (n2 | 0x743B5E24) ^ 0x45938129;
        n3 = (n2 | 0x743B5E24) ^ 0x6B612E05;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 358273256: {
                    break;
                }
                case 386582467: {
                    n4 ^= n3 ^ 0x43688CB0;
                    n3 = (n2 | 0x743B5E24) ^ 0x41F74AB9;
                    continue block5;
                }
                case 1070380116: {
                    return;
                }
            }
            n3 = (n2 | 0x743B5E24) ^ 0x6931392E;
        }
    }

    private static int mt(int n2, int n3) {
        int n4 = 2068924201;
        int n5 = 1957074186;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x7DDB5C5C)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0x7FF7361B;
        n6 += (n5 | n4) ^ 0x7FF70A5F;
        n6 += (n5 | n4) ^ 0x7FF773D1;
        n6 += (n5 | n4) ^ 0x7FF7691E;
        n6 ^= (n5 | n4) ^ 0x7FF7D7A2;
        n6 ^= (n5 | n4) ^ 0x7FF7E8FC;
        n6 += (n5 | n4) ^ 0x7FF7506B;
        n6 ^= (n5 | n4) ^ 0x7FF701D8;
        n6 += (n5 | n4) ^ 0x7FF79772;
        return n6 -= (n5 | n4) ^ 0x7FF71C59;
    }
}

