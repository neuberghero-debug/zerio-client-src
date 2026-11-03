/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.net.http.HttpResponse;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.bx;

@Environment(value=EnvType.CLIENT)
public final class bE {
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), 1027938949);

    /*
     * Enabled aggressive block sorting
     */
    private bE() {
        int n2 = a & 0x5ACA1200 ^ 0xA85B1E4A;
        int n3 = (n2 | 0x5ACA1200) ^ 0x4798C4A2;
        n3 ^= 0xF7193955;
    }

    /*
     * Enabled aggressive block sorting
     */
    static HttpResponse.BodyHandler<byte[]> bounded(int n2) {
        int n3 = a & 0x95FC3A46 ^ 0x821E4B07;
        int n4 = 0;
        int n5 = (n3 | 0x95FC3A46) ^ 0x128AAB73;
        n4 = (n3 | 0x95FC3A46) ^ 0x74A058D2;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case -1394970486: {
                    return responseInfo -> {
                        int n3 = a & 0xD6785EEB ^ 0x9065C6CB;
                        int n4 = 0;
                        int n5 = (n3 | 0xD6785EEB) ^ 0x21BC7239;
                        n4 = (n3 | 0xD6785EEB) ^ 0x987D85C6;
                        block5: while (true) {
                            switch (n4) {
                                default: {
                                    continue block5;
                                }
                                case 1308646189: {
                                    n4 = (n3 | 0xD6785EEB) ^ 0xF6DC2B16;
                                    continue block5;
                                }
                                case 123865208: {
                                    return new bx(n2);
                                }
                                case 547485181: 
                            }
                            n5 ^= n4 ^ 0xFE703B12;
                            n4 = (n3 | 0xD6785EEB) ^ 0xD11FD693;
                        }
                    };
                }
                case 2033272714: {
                    n5 ^= n4 ^ 0xB8279726;
                    n4 = (n3 | 0x95FC3A46) ^ 0x3B240BCD;
                    continue block5;
                }
                case -480369771: 
            }
            n4 = (n3 | 0x95FC3A46) ^ 0xEECF3CCD;
        }
    }
}

