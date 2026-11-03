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
import z.r.fN;

@Environment(value=EnvType.CLIENT)
public final class ll {
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), 1017776666);

    /*
     * Enabled aggressive block sorting
     */
    private ll() {
        int n2 = a & 0xFBBAE4C8 ^ 0x214D4381;
        int n3 = (n2 | 0xFBBAE4C8) ^ 0xACB1897D;
        n3 ^= 0x373B42D5;
        n3 ^= 0x49BA77A4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean active() {
        int n2 = a & 0x2F1C5C95 ^ 0xCD97CF24;
        int n3 = 0;
        int n4 = (n2 | 0x2F1C5C95) ^ 0x586E2CD6;
        n3 = (n2 | 0x2F1C5C95) ^ 0xF9E11108;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -2116586734: {
                    return fN.isReady();
                }
                case 377409213: {
                    n3 = (n2 | 0x2F1C5C95) ^ 0x30C8E61A;
                    continue block5;
                }
                case -547931729: 
            }
            n4 ^= n3 ^ 0x4D920E7B;
            n3 = (n2 | 0x2F1C5C95) ^ 0x6E48ACA7;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean licensed() {
        int n2 = a & 0x61AEBD31 ^ 0x42848379;
        int n3 = 0;
        int n4 = (n2 | 0x61AEBD31) ^ 0xE15EA53;
        n3 = (n2 | 0x61AEBD31) ^ 0xE4E60A6C;
        block5: while (true) {
            switch (n3) {
                case 239337940: {
                    return fN.isLicensed();
                }
                case -2025278187: {
                    n3 = (n2 | 0x61AEBD31) ^ 0x26E2D267;
                }
                default: {
                    continue block5;
                }
                case 1162636574: 
            }
            n4 ^= n3 ^ 0x1B2A8AEC;
            n3 = (n2 | 0x61AEBD31) ^ 0x6DEABEAD;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String error() {
        int n2 = a & 0x68305A49 ^ 0xBFF85352;
        int n3 = 0;
        int n4 = (n2 | 0x68305A49) ^ 0x6A9E51FF;
        n3 = (n2 | 0x68305A49) ^ 0x36FE3033;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1561303405: {
                    return fN.error();
                }
                case -922326168: {
                    n3 = (n2 | 0x68305A49) ^ 0xDBF75A1A;
                    continue block5;
                }
                case 604963137: 
            }
            n4 ^= n3 ^ 0xCF24EBE9;
            n3 = (n2 | 0x68305A49) ^ 0xA2F7C236;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static String payloadProof() {
        block9: {
            break block9;
            {
                var2_1 = (var0 | 1153498900) ^ 176652909;
lbl2:
                // 2 sources

                block6: while (true) {
                    switch (var2_1) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block6;
                            }
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var2_1 = (var0 | 1153498900) ^ 264860895;
                            ** continue;
                            break;
                        }
                        case -311263781: {
                            return fN.payloadProof();
                        }
                        case -1050107133: {
                            var1_2 ^= var2_1 ^ 1953619212;
                            continue block5;
                        }
                        case -398685335: 
                    }
                    break;
                }
            }
            var2_1 = (var0 | 1153498900) ^ 647847093;
            ** while (true)
        }
        var0 = ll.a & 1153498900 ^ -474643802;
        var2_1 = 0;
        var1_2 = (var0 | 1153498900) ^ 1242306742;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String payloadDevice() {
        int n2 = a & 0xAFD14D8C ^ 0x71951BBD;
        int n3 = 0;
        int n4 = (n2 | 0xAFD14D8C) ^ 0xB2C53DFB;
        n3 = (n2 | 0xAFD14D8C) ^ 0x829F82D8;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1611400036: {
                    n4 ^= n3 ^ 0x11C27D68;
                    n3 = (n2 | 0xAFD14D8C) ^ 0x4D7034B4;
                    continue block5;
                }
                case -1297782007: {
                    return fN.payloadDevice();
                }
                case 2102058341: 
            }
            n3 = (n2 | 0xAFD14D8C) ^ 0x9FD95CD9;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void authorize(HttpRequest.Builder var0) {
        var4_1 = -317370172;
        var1_2 = ll.a & -317370172 ^ 717070477;
        var3_3 = 0;
        if (true) ** GOTO lbl26
        block7: while (true) {
            var3_3 = (var1_2 | var4_1) ^ -70614125;
            if (true) ** GOTO lbl10
            block8: while (true) {
                var3_3 = (var1_2 | var4_1) ^ 55193588;
lbl10:
                // 3 sources

                block9: while (true) {
                    switch (var3_3) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            default: {
                                continue block9;
                            }
                            break;
                        }
                        case 343372638: {
                            var2_4 ^= var3_3 ^ -1738172571;
                            continue block8;
                        }
                        case -1765069944: {
                            var3_3 = (var1_2 | var4_1) ^ 1010019330;
                            ** GOTO lbl-1000
                        }
                        case -319299783: {
                            return;
                        }
                        case -745644849: {
                            var2_4 ^= var3_3 ^ -1956623269;
                            break block7;
                        }
lbl26:
                        // 1 sources

                        var2_4 = (var1_2 | var4_1) ^ 484649692;
                        var3_3 = (var1_2 | var4_1) ^ 2037832517;
                        ** continue;
                        case 342083027: {
                            fN.authorize(var0);
                            continue block7;
                        }
                    }
                    break;
                }
                break;
            }
            break;
        }
        var3_3 = (var1_2 | var4_1) ^ -69323490;
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static void authorize(HttpRequest.Builder builder, byte[] byArray) {
        int n2 = 133564071;
        int n3 = a & 0x7F606A7 ^ 0x35BE2B4;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x1C514D18;
        n4 = (n3 | n2) ^ 0x66BDF900;
        boolean bl2 = true;
        block7: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = (n3 | n2) ^ 0xB9CCED6F;
            }
            block8: while (true) {
                switch (n4) {
                    default: {
                        continue block8;
                    }
                    case -324795015: {
                        n5 ^= n4 ^ 0x26249284;
                        n4 = (n3 | n2) ^ 0x54F1494B;
                        continue block8;
                    }
                    case 1393471484: {
                        fN.authorize(builder, byArray);
                        n4 = (n3 | n2) ^ 0x790A309C;
                        continue block8;
                    }
                    case 2130040363: {
                        n5 ^= n4 ^ 0xAA9A65C7;
                        continue block7;
                    }
                    case 1631723447: {
                        n4 = (n3 | n2) ^ 0xEB5BE3CE;
                        continue block8;
                    }
                    case -1103950888: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String releaseId() {
        int n2 = a & 0x23319586 ^ 0xED5145D7;
        int n3 = 0;
        int n4 = (n2 | 0x23319586) ^ 0x8A09FAF2;
        n3 = (n2 | 0x23319586) ^ 0x60BA1A78;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 165597394: {
                    n4 ^= n3 ^ 0xBD3DE412;
                    n3 = (n2 | 0x23319586) ^ 0xBF260CD4;
                    continue block5;
                }
                case 1347934467: {
                    return fN.releaseId();
                }
                case -1882468433: 
            }
            n3 = (n2 | 0x23319586) ^ 0xE6AF0505;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String apiBase() {
        int n2 = a & 0xFF6A573E ^ 0x95A5F977;
        int n3 = 0;
        int n4 = (n2 | 0xFF6A573E) ^ 0x954BD6C7;
        n3 = (n2 | 0xFF6A573E) ^ 0xC19760D2;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1871780840: {
                    return fN.apiBase();
                }
                case 1048092589: {
                    n3 = (n2 | 0xFF6A573E) ^ 0x409D3F3C;
                    continue block5;
                }
                case -1082998717: 
            }
            n4 ^= n3 ^ 0x6D13430E;
            n3 = (n2 | 0xFF6A573E) ^ 0x907EE497;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static void logout() {
        int n2 = a & 0xA6C738DD ^ 0x9C8AA52E;
        int n3 = 0;
        int n4 = (n2 | 0xA6C738DD) ^ 0xF5FEE956;
        n3 = (n2 | 0xA6C738DD) ^ 0xC9B4B87;
        block5: while (true) {
            switch (n3) {
                case -1278378471: {
                    n4 ^= n3 ^ 0x4AFCA97A;
                    n3 = (n2 | 0xA6C738DD) ^ 0xE174034B;
                }
                default: {
                    continue block5;
                }
                case -1303054728: {
                    n3 = (n2 | 0xA6C738DD) ^ 0xD02C3E6;
                    continue block5;
                }
                case 1606139572: 
            }
            break;
        }
        fN.logout();
    }

    /*
     * Unable to fully structure code
     */
    public static void close() {
        block9: {
            break block9;
lbl1:
            // 1 sources

            block5: while (true) {
                switch (var2_1) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block5;
                        }
                        break;
                    }
lbl6:
                    // 1 sources

                    while (true) {
                        var2_1 = (var0 | -265195528) ^ -537385368;
                        ** GOTO lbl-1000
                        break;
                    }
                    case -1818268673: {
                        break block5;
                    }
                    case 1578936647: {
                        var1_2 ^= var2_1 ^ 86622937;
                        ** continue;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var2_1 = (var0 | -265195528) ^ 1667400706;
                        ** continue;
                        break;
                    }
                }
                break;
            }
            var2_1 = (var0 | -265195528) ^ -1360968006;
            ** while (true)
        }
        var0 = ll.a & -265195528 ^ -1059197443;
        var2_1 = 0;
        var1_2 = (var0 | -265195528) ^ 1901303743;
        ** while (true)
        {
            ** case 788908437:
        }
lbl25:
        // 1 sources

        fN.close();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void tick() {
        int n2 = -797645078;
        int n3 = a & 0xD074E6EA ^ 0x9620302B;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xB62F20E;
        n4 = (n3 | n2) ^ 0xE967DBD6;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case -410578453: {
                    n5 ^= n4 ^ 0x378D83EC;
                    n4 = (n3 | n2) ^ 0x41118E10;
                    continue block7;
                }
                case 1058221373: {
                    n4 = (n3 | n2) ^ 0xE31D8003;
                    continue block7;
                }
                case -1754957573: {
                    return;
                }
                case 896104168: {
                    n5 ^= n4 ^ 0x2D117866;
                    n4 = (n3 | n2) ^ 0x629A0ED6;
                    continue block7;
                }
                case -1259407299: 
            }
            fN.tick();
            n4 = (n3 | n2) ^ 0x31F3E700;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void reportInitFailure(String var0, Throwable var1_1) {
        var5_2 = 1273742199;
        var2_3 = ll.a & 1273742199 ^ 688048974;
        var4_4 = 0;
        ** GOTO lbl30
lbl5:
        // 1 sources

        while (true) {
            var4_4 = (var2_3 | var5_2) ^ 1728646668;
            if (true) ** GOTO lbl17
            break;
        }
lbl8:
        // 1 sources

        while (true) {
            var3_5 ^= var4_4 ^ -456883753;
            ** continue;
            break;
        }
        block9: while (true) {
            block14: {
                var4_4 = (var2_3 | var5_2) ^ 582742367;
                break block14;
lbl14:
                // 1 sources

                while (true) {
                    fN.reportInitFailure(var0, var1_1);
                    ** GOTO lbl33
                    break;
                }
            }
            block11: while (true) {
                switch (var4_4) lbl-1000:
                // 4 sources

                {
                    while (true) {
                        default: {
                            continue block11;
                        }
                        break;
                    }
                    case -796936538: {
                        ** continue;
                    }
                    case 1229994528: {
                        ** continue;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 48524043;
                        ** GOTO lbl-1000
                        break;
                    }
lbl30:
                    // 1 sources

                    var3_5 = (var2_3 | var5_2) ^ -1056554014;
                    var4_4 = (var2_3 | var5_2) ^ -843081426;
                    ** GOTO lbl-1000
lbl33:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -1147896359;
                    ** continue;
                    case 216188275: {
                        return;
                    }
                    case 1762631796: {
                        var3_5 ^= var4_4 ^ -1406878046;
                        continue block9;
                    }
                    case -1504423343: 
                }
                break;
            }
            break;
        }
        ** while (true)
    }
}

