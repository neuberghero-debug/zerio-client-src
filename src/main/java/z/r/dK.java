/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_310
 */
package z.r;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import z.r.H;
import z.r.W;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class dK {
    public static final int a;
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final List<class_1297> a;
    private static final int[] a;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;

    /*
     * Enabled aggressive block sorting
     */
    private dK() {
        int n2 = a & 0x786A682F ^ 0x116758A1;
        int n3 = (n2 | 0x786A682F) ^ 0x636F813F;
        n3 ^= 0x85830A9E;
    }

    /*
     * Exception decompiling
     */
    static void render(W var0, class_310 var1_1, H var2_2, long var3_3) {
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
    private static /* synthetic */ double nG(class_1657 class_16572, class_1297 class_12972) {
        int n2 = a & 0x1C086830 ^ 0x6D477455;
        int n3 = 0;
        int n4 = (n2 | 0x1C086830) ^ 0xD52B7086;
        n3 = (n2 | 0x1C086830) ^ 0xC083573A;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1459452925: {
                    n4 ^= n3 ^ 0x76048BC6;
                    n3 = (n2 | 0x1C086830) ^ 0xFA9EC226;
                    continue block5;
                }
                case -2016297389: {
                    double d2 = class_12972.method_23317() - class_16572.method_23317();
                    n4 ^= 0xD691F6EC;
                    double d3 = class_12972.method_23321() - class_16572.method_23321();
                    n4 ^= 0x5D843D36;
                    return -(d2 * d2 + d3 * d3);
                }
                case -1110693041: 
            }
            n3 = (n2 | 0x1C086830) ^ 0x2BB20788;
        }
    }

    private static int nH(int n2, int n3) {
        int n4 = 1486115453;
        int n5 = -312760060;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x9BCC166E)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0xFDDFD1D9;
        n6 ^= (n5 | n4) ^ 0xFDDF3F75;
        n6 -= (n5 | n4) ^ 0xFDDF68FB;
        n6 -= (n5 | n4) ^ 0xFDDFFE52;
        n6 -= (n5 | n4) ^ 0xFDDFAE56;
        n6 += (n5 | n4) ^ 0xFDDF9EB0;
        n6 -= (n5 | n4) ^ 0xFDDF7826;
        n6 ^= (n5 | n4) ^ 0xFDDFF20D;
        n6 -= (n5 | n4) ^ 0xFDDFD00C;
        return n6 -= (n5 | n4) ^ 0xFDDF22C0;
    }
}

