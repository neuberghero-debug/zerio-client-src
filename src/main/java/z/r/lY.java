/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonObject
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import dev.jnic.KERseB.JNICLoader;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.ms;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
@Environment(value=EnvType.CLIENT)
public final class lY {
    private static int a;
    public static int c;
    private static int[] a;
    private static Object[] a;
    private static Gson a;
    private static int b;
    private static String[] a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private lY() {
        int n2 = c & 0xDAC041 ^ 0xDC10F9FA;
        int n3 = (n2 | 0xDAC041) ^ 0xED04A1BC;
        n3 ^= 0xFC57BA32;
        n3 ^= 0x4DBB6416;
    }

    static native String readToken(String var0);

    static synchronized native ms read(String var0);

    static synchronized native void write(ms var0, String var1) throws Exception;

    private static native void writeProtected(JsonObject var0, String var1) throws Exception;

    /*
     * Exception decompiling
     */
    static /* synthetic */ void $jnicClinit() {
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
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
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
    private static String a(int var0, int var1_1) {
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

    private static native byte[] protect(byte[] var0, byte[] var1);

    private static native byte[] unprotect(byte[] var0, byte[] var1);

    private static native byte[] entropy(String var0) throws Exception;

    private static int a(int n2, int n3) {
        int n4 = -2060786812;
        int n5 = -1975746439;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x9DF8D8DD)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0x8F3E0A92;
        n6 -= (n5 | n4) ^ 0x8F3ED4F7;
        n6 += (n5 | n4) ^ 0x8F3EEECA;
        n6 ^= (n5 | n4) ^ 0x8F3E4A0E;
        n6 += (n5 | n4) ^ 0x8F3E8019;
        n6 += (n5 | n4) ^ 0x8F3E7E1C;
        return n6 += (n5 | n4) ^ 0x8F3EB451;
    }

    private static native JsonObject parseJson(byte[] var0);

    private static native char firstNonWhitespace(byte[] var0);

    private static native void requireWindows();

    static native void clear();

    public static native /* synthetic */ void $jnicLoader();

    static {
        JNICLoader.init();
        lY.$jnicLoader();
        lY.$jnicClinit();
    }
}

