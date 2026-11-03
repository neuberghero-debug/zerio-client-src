/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.dA;
import z.r.gF;
import z.r.gj;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class eZ
extends gF {
    private static final int[] a;
    private static final /* synthetic */ String k;
    public static boolean a;
    public static final int a;
    private static final /* synthetic */ String s;

    /*
     * Enabled aggressive block sorting
     */
    public eZ() {
        int n2 = a & 0xB1AA4AC2 ^ 0xA0E4AB2E;
        int n3 = (n2 | 0xB1AA4AC2) ^ 0xAE70A3A8;
        n3 ^= 0x74F0C59A;
        super(k, s, dA.q);
        n3 ^= 0x54255EE1;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block18: {
            var2 = 588966985;
            eZ.a = mK.a(MethodHandles.lookup().lookupClass(), 1059546848);
            var1_1 = 0;
            var0_2 = 2121682563;
            var1_1 = var2 ^ -1649333275;
            ** GOTO lbl64
lbl7:
            // 1 sources

            while (true) {
                var0_2 ^= -1054317468;
                eZ.a[v0] = ((v1[v2] & 255) << 24 | ((v1[v2 + 1] & 255) << 16 | ((v1[v2 + 2] & 255) << 8 | v1[v2 + 3] & 255))) ^ v3;
                v0 = v0 + 1;
                v1 = v1;
                v2 = v2 + 4;
                var0_2 ^= -280089122;
                if (v2 + 4 < v1.length) ** GOTO lbl60
                break block18;
                break;
            }
lbl18:
            // 1 sources

            while (true) {
                var0_2 ^= -1601176367;
                var0_2 ^= -444226662;
                var0_2 ^= 231561546;
                var0_2 ^= -523641689;
                var0_2 ^= 188015190;
                v3 = ((var0_2 ^= 1423056458) | var2) ^ -893542951 ^ eZ.a;
                ** continue;
                break;
            }
            {
                var1_1 = var2 ^ 1605406650;
                block14: while (true) {
                    switch (var1_1) {
                        case 1578093268: {
                            var0_2 ^= var1_1 ^ -609747435;
                            var1_1 = var2 ^ 1903526876;
                            continue block14;
                        }
                        case -1096038484: {
                            ** break;
                        }
                        case -1321691096: {
                            var0_2 ^= var1_1 ^ 347972059;
                            continue block13;
                        }
                        case 2091541491: {
                            v0 = 0;
                            v2 = 0;
                            var0_2 ^= -280452693;
                            eZ.a = new int[2];
                            var0_2 ^= -240058686;
                            v1 = "+[\u00ad%\u00e4 \u00dc\u00f2".getBytes("ISO-8859-1");
lbl60:
                            // 2 sources

                            var0_2 ^= -644976896;
                            ** continue;
                        }
lbl62:
                        // 1 sources

                        var1_1 = var2 ^ -1843235743;
                        continue block14;
lbl64:
                        // 3 sources

                        while (true) {
                            default: {
                                continue block14;
                            }
                            break;
                        }
lbl67:
                        // 2 sources

                        while (true) {
                            eZ.k = gj.decode("jh6WeW1Tq8uc", eZ.hl((var0_2 | var2) ^ 1993545786, var2 ^ ((var0_2 | var2) ^ 544741854)));
                            eZ.s = gj.decode("BAfqr60RRzgTGd9A+mUA9W4FMb8OMTGsVx2DW4QCKUOj0Q==", eZ.hl((var0_2 | var2) ^ 1993545787, var2 ^ ((var0_2 | var2) ^ 1462691893)));
                            var1_1 = var2 ^ 2098538141;
                            ** continue;
                            break;
                        }
                        case 1383034773: 
                    }
                    break;
                }
            }
            eZ.a = false;
            return;
        }
        while (true) {
            switch (var0_2) {
                case 2077834155: {
                    var0_2 ^= -455190697;
                    ** GOTO lbl67
                }
                case -989124583: {
                    var0_2 ^= 159873337;
                    ** continue;
                }
            }
            var0_2 ^= -1862340496;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public void onEnable() {
        int n2 = -991466048;
        int n3 = a & 0xC4E76DC0 ^ 0x85FAA59C;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x44295429;
        n4 = (n3 | n2) ^ 0x6A3A7CF1;
        boolean bl2 = true;
        block7: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = (n3 | n2) ^ 0x5F853F31;
            }
            block8: while (true) {
                switch (n4) {
                    default: {
                        continue block8;
                    }
                    case -1703226643: {
                        a = true;
                        n4 = (n3 | n2) ^ 0x737CE0D5;
                        continue block8;
                    }
                    case -1232925431: {
                        n5 ^= n4 ^ 0x68AC5371;
                        n4 = (n3 | n2) ^ 0x52E803C2;
                        continue block8;
                    }
                    case -401582826: {
                        n5 ^= n4 ^ 0x4B366D99;
                        continue block7;
                    }
                    case -1346006739: {
                        n4 = (n3 | n2) ^ 0x2DEFB8CA;
                        continue block8;
                    }
                    case -1760039394: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    @Override
    public void onDisable() {
        int n2 = 343784758;
        int n3 = a & 0x147DBD36 ^ 0x4A36528A;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x6278C985;
        n4 = (n3 | n2) ^ 0x606E7E27;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case -918244867: {
                    a = false;
                    n4 = (n3 | n2) ^ 0x720FCFF0;
                    continue block7;
                }
                case 967768148: {
                    n5 ^= n4 ^ 0x5E6C6A84;
                    n4 = (n3 | n2) ^ 0x973B4E43;
                    continue block7;
                }
                case 1041334681: {
                    n4 = (n3 | n2) ^ 0x67D107EA;
                    continue block7;
                }
                case 745549902: {
                    n5 ^= n4 ^ 0xFE7D6AEF;
                    n4 = (n3 | n2) ^ 0x5AFBCE10;
                    continue block7;
                }
                case 75772334: 
            }
            break;
        }
    }

    private static int hl(int n2, int n3) {
        int n4 = -1841134508;
        int n5 = 1753089809;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x63336206)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xFA7EC2EB;
        n6 ^= (n5 | n4) ^ 0xFA7EAF5B;
        n6 += (n5 | n4) ^ 0xFA7EBA96;
        n6 += (n5 | n4) ^ 0xFA7E2B18;
        n6 += (n5 | n4) ^ 0xFA7EBA2D;
        return n6 += (n5 | n4) ^ 0xFA7E8C0B;
    }
}

