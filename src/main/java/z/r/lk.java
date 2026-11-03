/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.net.http.HttpRequest;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.ll;

@Environment(value=EnvType.CLIENT)
public final class lk {
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), -287154955);

    /*
     * Enabled aggressive block sorting
     */
    private lk() {
        int n2 = a & 0xFFA96CA8 ^ 0x47CA0B3E;
        int n3 = (n2 | 0xFFA96CA8) ^ 0xDC892C1C;
        n3 ^= 0x7CC11BE1;
        n3 ^= 0x6E4969FA;
    }

    /*
     * Unable to fully structure code
     */
    static void apply(HttpRequest.Builder var0) {
        block14: {
            block13: {
                break block14;
lbl1:
                // 1 sources

                return;
                {
                    var3_3 = (var1_2 | var4_1) ^ 2061406977;
                    if (true) ** GOTO lbl7
                    block9: while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -594869459;
lbl7:
                        // 4 sources

                        block10: while (true) {
                            switch (var3_3) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    default: {
                                        continue block10;
                                    }
                                    break;
                                }
                                case 1772586244: {
                                    ** continue;
                                }
                                case -1254331160: {
                                    break block8;
                                }
                                case -2027688899: {
                                    var2_4 ^= var3_3 ^ 1719642595;
                                    break block13;
                                }
lbl19:
                                // 1 sources

                                while (true) {
                                    var3_3 = (var1_2 | var4_1) ^ 1220613076;
                                    ** continue;
                                    break;
                                }
                                case 1469964908: {
                                    var2_4 ^= var3_3 ^ -1783358587;
                                    continue block9;
                                }
                                case 561413137: {
                                    ll.authorize(var0);
                                    continue block8;
                                }
                            }
                            break;
                        }
                        break;
                    }
                }
                var3_3 = (var1_2 | var4_1) ^ -1436508848;
                ** GOTO lbl7
            }
            var3_3 = (var1_2 | var4_1) ^ -1805977032;
            ** while (true)
        }
        var4_1 = -729002456;
        var1_2 = lk.a & -729002456 ^ -1384549612;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -2059919356;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    static void apply(HttpRequest.Builder var0, byte[] var1_1) {
        block13: {
            block15: {
                block14: {
                    block12: {
                        var5_2 = -1289940250;
                        var2_3 = lk.a & -1289940250 ^ -1630781811;
                        var4_4 = 0;
                        break block14;
lbl5:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ -1281407228;
                            break block12;
                            break;
                        }
lbl8:
                        // 1 sources

                        while (true) {
                            var3_5 ^= var4_4 ^ 1705152250;
                            break block13;
                            break;
                        }
                    }
                    var4_4 = (var2_3 | var5_2) ^ -538151295;
                    break block15;
                }
                var3_5 = (var2_3 | var5_2) ^ 636032833;
                var4_4 = (var2_3 | var5_2) ^ 665265310;
            }
lbl18:
            // 3 sources

            block9: while (true) {
                switch (var4_4) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block9;
                        }
                        break;
                    }
                    case -1736828303: {
                        break block9;
                    }
                    case 1819748024: {
                        ** continue;
                    }
                    case -1602250500: {
                        ** continue;
                    }
lbl29:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -743827369;
                        ** continue;
                        break;
                    }
                }
                break;
            }
            var4_4 = (var2_3 | var5_2) ^ 530753043;
            ** GOTO lbl18
            {
                case 1613842542: {
                    return;
                }
            }
        }
        var4_4 = (var2_3 | var5_2) ^ 1537229662;
        ** while (true)
        {
            ** case -461537871:
        }
lbl40:
        // 1 sources

        ll.authorize(var0, var1_1);
        ** while (true)
    }
}

