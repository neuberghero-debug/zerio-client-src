/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import dev.jnic.KERseB.JNICLoader;
import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class gX {
    private static volatile String a;
    public static int a;
    private static volatile boolean a;
    private static volatile long a;

    /*
     * Enabled aggressive block sorting
     */
    private gX() {
        int n2 = a & 0xC54089F8 ^ 0xF4BF43CA;
        int n3 = (n2 | 0xC54089F8) ^ 0x61F22910;
        n3 ^= 0xB37407D3;
        n3 ^= 0x385C71AF;
    }

    public static synchronized native void activate(String var0, String var1, String var2);

    public static native boolean ok();

    public static native String watermark();

    /*
     * Unable to fully structure code
     */
    static /* synthetic */ void $jnicClinit() {
        block9: {
            break block9;
lbl1:
            // 1 sources

            while (true) {
                gX.a = "";
                return;
            }
lbl4:
            // 1 sources

            while (true) {
                var1 = -1135176972 ^ 60513448;
                ** GOTO lbl9
                break;
            }
lbl7:
            // 1 sources

            while (true) {
                var1 = -1135176972 ^ -583618956;
lbl9:
                // 2 sources

                block8: while (true) {
                    switch (var1) {
                        default: {
                            continue block8;
                        }
                        case -1077031332: {
                            ** continue;
                        }
                        case 1633696896: {
                            break;
                        }
                        case -1462125189: {
                            var0_1 ^= var1 ^ 1253724466;
                            ** continue;
                        }
                    }
                    var1 = -1135176972 ^ 344928143;
                }
                break;
            }
        }
        gX.a = mK.a(MethodHandles.lookup().lookupClass(), 241968487);
        var1 = 0;
        var0_1 = 889189779;
        ** while (true)
    }

    public static native /* synthetic */ void $jnicLoader();

    static {
        JNICLoader.init();
        gX.$jnicLoader();
        gX.$jnicClinit();
    }
}

