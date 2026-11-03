/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.Q;
import z.r.bF;
import z.r.gj;
import z.r.hg;
import z.r.ij;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class jq
extends Record {
    private final bF a;
    private static final /* synthetic */ String a;
    private final String b;
    private final hg a;
    private final boolean a;
    private final String c;
    private final boolean b;
    private static final int[] a;
    private final Q a;
    public static final int a;
    private final long a;

    /*
     * Enabled aggressive block sorting
     */
    public jq(String string, long l2, Q q2, String string2, hg hg2, bF bF2, boolean bl2, boolean bl3) {
        int n2 = a & 0x52D33812 ^ 0x7A652D73;
        int n3 = (n2 | 0x52D33812) ^ 0xAFC68884;
        n3 ^= 0x7A080073;
        this.b = string;
        this.a = l2;
        this.a = q2;
        this.c = string2;
        this.a = hg2;
        this.a = bF2;
        this.a = bl2;
        this.b = bl3;
    }

    /*
     * Unable to fully structure code
     */
    public boolean isSystem() {
        block21: {
            block20: {
                block19: {
                    block18: {
                        block17: {
                            block23: {
                                block16: {
                                    block22: {
                                        break block22;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            var3_3 = (var1_2 | var4_1) ^ -782400036;
                                            break block16;
lbl4:
                                            // 1 sources

                                            while (true) {
                                                v0 = false;
                                                break block17;
                                                break;
                                            }
lbl7:
                                            // 1 sources

                                            while (this.a == bF.c) {
                                                break block18;
                                            }
                                            break block19;
                                            break;
                                        }
                                    }
                                    var4_1 = -129740572;
                                    var1_2 = jq.a & -129740572 ^ -1733766290;
                                    var3_3 = 0;
                                    break block23;
lbl15:
                                    // 1 sources

                                    while (true) {
                                        var3_3 = (var1_2 | var4_1) ^ -583414900;
                                        break block16;
                                        break;
                                    }
lbl18:
                                    // 1 sources

                                    while (true) {
                                        var2_4 ^= var3_3 ^ -1966127103;
                                        ** continue;
                                        break;
                                    }
                                }
lbl22:
                                // 5 sources

                                block14: while (true) {
                                    switch (var3_3) {
                                        default: {
                                            continue block14;
                                        }
                                        case 699487794: {
                                            ** continue;
                                        }
                                        case 813801674: {
                                            break;
                                        }
                                        case 634722402: {
                                            ** GOTO lbl7
                                        }
                                        case 2074631961: {
                                            ** continue;
                                        }
                                        case -1431522170: {
                                            var2_4 ^= var3_3 ^ 601892049;
                                            break block20;
                                        }
                                    }
                                    var3_3 = (var1_2 | var4_1) ^ -2092659465;
                                    continue;
                                    break;
                                }
                            }
                            var2_4 = (var1_2 | var4_1) ^ 756313672;
                            var3_3 = (var1_2 | var4_1) ^ -932351196;
                            ** GOTO lbl22
                        }
lbl44:
                        // 2 sources

                        while (true) {
                            var2_4 ^= -292842332;
                            break block21;
                            break;
                        }
                        {
                            case -579989945: {
                                var2_4 ^= var3_3 ^ 1411554832;
                                ** continue;
                            }
                        }
                    }
                    var3_3 = (var1_2 | var4_1) ^ 1379952488;
                    ** GOTO lbl22
                }
                var3_3 = (var1_2 | var4_1) ^ 629333417;
                ** GOTO lbl22
                {
                    ** case 2122340134:
                }
lbl57:
                // 1 sources

                v0 = true;
                ** while (true)
            }
            var3_3 = (var1_2 | var4_1) ^ -2039708472;
            ** while (true)
        }
        return v0;
    }

    /*
     * Unable to fully structure code
     */
    public String authorName() {
        block20: {
            var4_1 = -407734348;
            var1_2 = jq.a & -407734348 ^ 1194545332;
            var3_3 = 0;
            ** GOTO lbl43
lbl5:
            // 1 sources

            return v0;
            while (true) {
                var3_3 = (var1_2 | var4_1) ^ 551010380;
                ** GOTO lbl21
lbl10:
                // 1 sources

                while (true) {
                    v0 = jq.a;
                    break block20;
                    break;
                }
                break;
            }
lbl13:
            // 1 sources

            while (true) {
                var3_3 = (var1_2 | var4_1) ^ -1753852588;
                if (true) ** GOTO lbl21
                break;
            }
            block13: while (true) {
                var3_3 = (var1_2 | var4_1) ^ 1331868372;
                if (true) ** GOTO lbl21
                block14: while (true) {
                    var3_3 = (var1_2 | var4_1) ^ -643744808;
lbl21:
                    // 4 sources

                    block15: while (true) {
                        switch (var3_3) lbl-1000:
                        // 4 sources

                        {
                            while (true) {
                                default: {
                                    continue block15;
                                }
                                break;
                            }
                            case 1041386604: {
                                ** continue;
                            }
                            case -904793255: {
                                v0 = this.a.name();
                                break block13;
                            }
                            case -2060929510: {
                                var2_4 ^= var3_3 ^ 494960135;
                                continue block14;
                            }
lbl34:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 765625581;
                                ** GOTO lbl-1000
                                break;
                            }
                            case -949700616: {
                                var2_4 ^= var3_3 ^ 1607237605;
                                ** continue;
                            }
lbl40:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1654374830;
                                ** GOTO lbl-1000
                                break;
                            }
lbl43:
                            // 1 sources

                            var2_4 = (var1_2 | var4_1) ^ -1603009526;
                            continue block13;
                            case -1518273546: {
                                if (this.a != null) ** continue;
                                ** continue;
                            }
lbl48:
                            // 1 sources

                            while (true) {
                                var3_3 = (var1_2 | var4_1) ^ 1110674498;
                                ** continue;
                                break;
                            }
                            case 1891967712: {
                                var2_4 ^= var3_3 ^ 1198905690;
                                ** continue;
                            }
                        }
                        break;
                    }
                    break;
                }
                break;
            }
        }
        var2_4 ^= -996081331;
        ** while (true)
        {
            ** case -1462647456:
        }
lbl58:
        // 1 sources

        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public ij role() {
        block16: {
            var4_1 = -211778894;
            var1_2 = jq.a & -211778894 ^ 1171496683;
            var3_3 = 0;
            var2_4 = (var1_2 | var4_1) ^ -942257862;
            var3_3 = (var1_2 | var4_1) ^ -692119573;
            ** GOTO lbl43
lbl7:
            // 2 sources

            block13: while (true) {
                switch (var2_4) {
                    case 1755420064: {
                        var2_4 ^= 775059785;
                        ** break;
lbl12:
                        // 1 sources

                        continue block13;
                    }
                    case -1081238952: {
                        var2_4 ^= 684412605;
                        return v0;
                    }
                    while (true) {
                        var3_3 = (var1_2 | var4_1) ^ -589084262;
                        break block16;
                        break;
                    }
                }
                break;
            }
            var2_4 ^= -1201060093;
            return v0;
        }
        block15: while (true) {
            block17: {
                switch (var3_3) {
                    case 1189923800: {
                        v0 = ij.a;
                        ** GOTO lbl7
                    }
                    case 678833999: {
                        var2_4 ^= var3_3 ^ 297132809;
                        ** break;
                    }
                    case -212130074: {
                        if (this.a != null) ** continue;
                        var3_3 = (var1_2 | var4_1) ^ -544886348;
                        continue block15;
                    }
                    case 944444867: {
                        v0 = this.a.role();
                        ** continue;
                    }
                    case 722524001: {
                        var2_4 ^= var3_3 ^ 315824935;
                        ** GOTO lbl42
                    }
lbl40:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -1323346653;
                    ** GOTO lbl43
lbl42:
                    // 1 sources

                    var3_3 = (var1_2 | var4_1) ^ -809989320;
lbl43:
                    // 4 sources

                    default: {
                        continue block15;
                    }
                    case 754836679: {
                        var2_4 ^= var3_3 ^ -1701419752;
                        break block17;
                    }
                    case 558663952: 
                }
                ** break;
lbl50:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -619808196;
                continue;
            }
            var3_3 = (var1_2 | var4_1) ^ 78166045;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block27: {
            var2 = 1464428890;
            jq.a = mK.a(MethodHandles.lookup().lookupClass(), 242384658);
            var1_1 = 0;
            var0_2 = -140741254;
            var1_1 = var2 ^ 805533982;
            block17: while (true) {
                switch (var1_1) {
                    default: {
                        continue block17;
                    }
                    case -596388989: {
                        v0 = 0;
                        v1 = 0;
                        v2 = "rDK\u00b8".getBytes("ISO-8859-1");
                        var0_2 ^= -892016583;
                        jq.a = new int[1];
                        ** break;
                    }
                    case 1732907076: {
                        var1_1 = var2 ^ 1507709736;
                        continue block17;
                    }
lbl20:
                    // 1 sources

                    var0_2 ^= -1260502380;
                    ** GOTO lbl32
                    case 244628082: 
                }
                var0_2 ^= var1_1 ^ 1141684400;
                var1_1 = var2 ^ -1959085351;
            }
lbl26:
            // 1 sources

            while (true) {
                continue;
                break;
            }
lbl28:
            // 1 sources

            while (true) {
                if (v1 + 4 >= v2.length) {
                    jq.a = gj.decode("DkGzir0=", jq.FV(((var0_2 ^= 189836113) | var2) ^ 133750661, var2 ^ ((var0_2 | var2) ^ -1910277325)));
                    return;
                }
lbl32:
                // 3 sources

                var0_2 ^= 1392265423;
                var0_2 ^= 910125009;
                break block27;
                break;
            }
lbl35:
            // 1 sources

            while (true) {
                var0_2 ^= -2112133435;
                jq.a[v0] = v3 ^ v4;
                v0 = v0 + 1;
                v2 = v2;
                v1 = v1 + 4;
                var0_2 ^= 364102983;
                ** continue;
                break;
            }
lbl45:
            // 1 sources

            block21: while (true) {
                switch (var0_2) {
                    case 1173437704: {
                        var0_2 ^= 295142942;
                        break;
                    }
                    case 564212184: {
                        var0_2 ^= 1022930777;
                        continue block21;
                    }
                    default: {
                        var0_2 ^= 635844271;
                    }
                }
                var0_2 ^= -1526402648;
                ** continue;
                break;
            }
lbl58:
            // 2 sources

            while (true) {
                v4 = (var0_2 | var2) ^ -1488864345 ^ jq.a;
                ** continue;
                break;
            }
lbl61:
            // 2 sources

            while (true) {
                v5 = (v2[v1 + 1] & 255) << 16;
                var0_2 ^= 2103494340;
                v6 = (v2[v1 + 2] & 255) << 8;
                ** continue;
                break;
            }
        }
        v7 = (v2[v1] & 255) << 24;
        block24: while (true) {
            switch (var0_2) {
                default: {
                    var0_2 ^= 1555620307;
                    ** GOTO lbl61
                }
                case 24427943: {
                    var0_2 ^= -1584665882;
                    continue block24;
                }
                case -1984646088: 
            }
            break;
        }
        var0_2 ^= -1821484143;
        ** while (true)
        v3 = v7 | (v5 | (v6 | v2[v1 + 3] & 255));
        block25: while (true) {
            switch (var0_2) {
                case 786081941: {
                    var0_2 ^= -1149242094;
                    continue block25;
                }
                default: {
                    var0_2 ^= 830379352;
                    ** GOTO lbl58
                }
                case 116855323: 
            }
            break;
        }
        var0_2 ^= 1381067916;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static jq system(String var0) {
        var1_1 = jq.a & -1674840391 ^ 320037831;
        var3_2 = 0;
        var2_3 = (var1_1 | -1674840391) ^ -1966425477;
        if (true) ** GOTO lbl14
        block5: while (true) {
            var3_2 = (var1_1 | -1674840391) ^ 664494269;
            block6: while (true) {
                switch (var3_2) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block6;
                        }
                        break;
                    }
                    case -361250114: {
                        continue block5;
                    }
lbl14:
                    // 1 sources

                    var3_2 = (var1_1 | -1674840391) ^ 1967928641;
                    ** GOTO lbl-1000
lbl16:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | -1674840391) ^ -620670409;
                        ** continue;
                        break;
                    }
                    case 1144694216: {
                        return new jq("local-" + System.nanoTime(), System.currentTimeMillis(), null, var0, null, bF.c, false, false);
                    }
                    case -1197435070: 
                }
                break;
            }
            break;
        }
        var2_3 ^= var3_2 ^ 1114371948;
        ** while (true)
    }

    private static int FV(int n2, int n3) {
        int n4 = 2083882752;
        int n5 = 2138652372;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xA7DA1F0F)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0x7F7D02BF;
        n6 += (n5 | n4) ^ 0x7F7DB7A8;
        n6 -= (n5 | n4) ^ 0x7F7D84A4;
        n6 ^= (n5 | n4) ^ 0x7F7D9726;
        n6 -= (n5 | n4) ^ 0x7F7D7B2B;
        return n6 -= (n5 | n4) ^ 0x7F7DFA9A;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final String toString() {
        int n2 = a & 0xB2D4B7C ^ 0x7FFC2D22;
        int n3 = 0;
        int n4 = (n2 | 0xB2D4B7C) ^ 0xA36D6301;
        n3 = (n2 | 0xB2D4B7C) ^ 0x85B266D1;
        block5: while (true) {
            switch (n3) {
                case -2099608698: {
                    return ObjectMethods.bootstrap("toString", new MethodHandle[]{jq.class, "id;timestamp;author;text;attachment;kind;self;mention", "b", "a", "a", "c", "a", "a", "a", "b"}, this);
                }
                case -95483473: {
                    n3 = (n2 | 0xB2D4B7C) ^ 0xBE7D3F4A;
                    continue block5;
                }
                case -1048555468: {
                    n4 ^= n3 ^ 0x79BC84A4;
                    n3 = (n2 | 0xB2D4B7C) ^ 0xFD27ECF8;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final int hashCode() {
        int n2 = a & 0x291ECFB7 ^ 0x7E91DC93;
        int n3 = 0;
        int n4 = (n2 | 0x291ECFB7) ^ 0x34E24135;
        n3 = (n2 | 0x291ECFB7) ^ 0xC1DE1FAF;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -306326226: {
                    return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{jq.class, "id;timestamp;author;text;attachment;kind;self;mention", "b", "a", "a", "c", "a", "a", "a", "b"}, this);
                }
                case 1569871497: {
                    n4 ^= n3 ^ 0xAFDA3AAE;
                    n3 = (n2 | 0x291ECFB7) ^ 0x92220A99;
                    continue block5;
                }
                case -1102987240: 
            }
            n3 = (n2 | 0x291ECFB7) ^ 0x220D893E;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean equals(Object object) {
        int n2 = a & 0x6E1B904A ^ 0x23911E8;
        int n3 = 0;
        int n4 = (n2 | 0x6E1B904A) ^ 0xE92BF84A;
        n3 = (n2 | 0x6E1B904A) ^ 0x769C10AF;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1270637620: {
                    n4 ^= n3 ^ 0x2746247B;
                    n3 = (n2 | 0x6E1B904A) ^ 0xA57EA76A;
                    continue block5;
                }
                case 413630789: {
                    break;
                }
                case -884656512: {
                    return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{jq.class, "id;timestamp;author;text;attachment;kind;self;mention", "b", "a", "a", "c", "a", "a", "a", "b"}, this, object);
                }
            }
            n3 = (n2 | 0x6E1B904A) ^ 0xDA780A26;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public String id() {
        int n2 = a & 0x35F36278 ^ 0xA87A4CAD;
        int n3 = 0;
        int n4 = (n2 | 0x35F36278) ^ 0x428A2E2E;
        n3 = (n2 | 0x35F36278) ^ 0x2BE311AF;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -513481624: {
                    n4 ^= n3 ^ 0x1EE98FE0;
                    n3 = (n2 | 0x35F36278) ^ 0x38CBA653;
                    continue block5;
                }
                case -1776779438: {
                    break;
                }
                case -2060400466: {
                    return this.b;
                }
            }
            n3 = (n2 | 0x35F36278) ^ 0x5C9F8A95;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public long timestamp() {
        int n2 = a & 0x68914B49 ^ 0x73D5704;
        int n3 = 0;
        int n4 = (n2 | 0x68914B49) ^ 0x94F5CEBA;
        n3 = (n2 | 0x68914B49) ^ 0x87BE32FF;
        block5: while (true) {
            switch (n3) {
                case -402428494: {
                    n3 = (n2 | 0x68914B49) ^ 0xABD5A187;
                }
                default: {
                    continue block5;
                }
                case 1493005717: {
                    return this.a;
                }
                case -999751990: 
            }
            n4 ^= n3 ^ 0x88311DEF;
            n3 = (n2 | 0x68914B49) ^ 0x37402AD8;
        }
    }

    /*
     * Unable to fully structure code
     */
    public Q author() {
        block10: {
            block9: {
                block11: {
                    break block11;
lbl1:
                    // 1 sources

                    while (true) {
                        var2_3 ^= var3_2 ^ 268956608;
                        break block9;
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        var3_2 = (var1_1 | 1569135928) ^ -2051161681;
                        break block10;
                        break;
                    }
                }
                var1_1 = jq.a & 1569135928 ^ -1349217079;
                var3_2 = 0;
                var2_3 = (var1_1 | 1569135928) ^ 2107413140;
                ** GOTO lbl22
            }
            var3_2 = (var1_1 | 1569135928) ^ -53280072;
        }
        block7: while (true) {
            switch (var3_2) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block7;
                    }
                    break;
                }
                case 2049596502: {
                    ** continue;
                }
lbl22:
                // 1 sources

                var3_2 = (var1_1 | 1569135928) ^ -1298268883;
                ** continue;
                case 54828865: {
                    return this.a;
                }
                case 1292525780: {
                    ** continue;
                }
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public String text() {
        var1_1 = jq.a & 1349021007 ^ 2059192664;
        var3_2 = 0;
        var2_3 = (var1_1 | 1349021007) ^ 77886749;
        var3_2 = (var1_1 | 1349021007) ^ -1042372176;
        block5: while (true) {
            switch (var3_2) {
                case -1155382033: {
                    var3_2 = (var1_1 | 1349021007) ^ -902321698;
                    ** break;
                }
                case -1328855935: {
                    var2_3 ^= var3_2 ^ -1832028282;
                    var3_2 = (var1_1 | 1349021007) ^ 1590143751;
                }
lbl13:
                // 3 sources

                default: {
                    continue block5;
                }
                case 607864408: 
            }
            break;
        }
        return this.c;
    }

    /*
     * Unable to fully structure code
     */
    public hg attachment() {
        var1_1 = jq.a & -542575737 ^ 430588744;
        var3_2 = 0;
        ** GOTO lbl16
lbl4:
        // 1 sources

        while (true) {
            var2_3 ^= var3_2 ^ -562223247;
            ** GOTO lbl14
            break;
        }
lbl7:
        // 1 sources

        block6: while (true) {
            switch (var3_2) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block6;
                    }
                    break;
                }
                case 1073169802: {
                    ** continue;
                }
lbl14:
                // 1 sources

                var3_2 = (var1_1 | -542575737) ^ -595356851;
                ** GOTO lbl-1000
lbl16:
                // 1 sources

                var2_3 = (var1_1 | -542575737) ^ -243465821;
                var3_2 = (var1_1 | -542575737) ^ 1270155571;
                ** continue;
                case -1809843460: {
                    break block6;
                }
                case 53043330: {
                    return this.a;
                }
            }
            break;
        }
        var3_2 = (var1_1 | -542575737) ^ -530729403;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public bF kind() {
        var1_1 = jq.a & 750998788 ^ 294789997;
        var3_2 = 0;
        ** GOTO lbl18
lbl4:
        // 1 sources

        return this.a;
        {
            switch (var3_2) lbl-1000:
            // 4 sources

            {
                while (true) {
                    default: {
                        continue block6;
                    }
                    break;
                }
                case -1489822133: {
                    ** continue;
                }
lbl12:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | 750998788) ^ 1873433741;
                    ** GOTO lbl-1000
                    break;
                }
lbl15:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | 750998788) ^ 1987779011;
                    ** GOTO lbl-1000
                    break;
                }
lbl18:
                // 1 sources

                var2_3 = (var1_1 | 750998788) ^ -1309144243;
                ** continue;
lbl20:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | 750998788) ^ -1696569050;
                    ** continue;
                    break;
                }
                case 1383670752: {
                    ** continue;
                }
                case 1269329582: 
            }
        }
        var2_3 ^= var3_2 ^ -1616643183;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public boolean self() {
        var1_1 = jq.a & 81671115 ^ 886757210;
        var3_2 = 0;
        if (true) ** GOTO lbl20
        block5: while (true) {
            var3_2 = (var1_1 | 81671115) ^ 841471412;
            if (true) ** GOTO lbl9
            block6: while (true) {
                var3_2 = (var1_1 | 81671115) ^ 1091382564;
lbl9:
                // 2 sources

                block7: while (true) {
                    switch (var3_2) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block7;
                            }
                            break;
                        }
                        case 116990575: {
                            var2_3 ^= var3_2 ^ 379892118;
                            continue block6;
                        }
lbl17:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | 81671115) ^ -500539316;
                            ** continue;
                            break;
                        }
lbl20:
                        // 1 sources

                        var2_3 = (var1_1 | 81671115) ^ 1774951562;
                        ** continue;
                        case -688613481: {
                            continue block5;
                        }
                        case 1976818431: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        return this.a;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public boolean mention() {
        int n2 = a & 0x8DF54501 ^ 0xA757DF46;
        int n3 = 0;
        int n4 = (n2 | 0x8DF54501) ^ 0xCA1D93A5;
        n3 = (n2 | 0x8DF54501) ^ 0xB36F7A36;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 479765873: {
                    n3 = (n2 | 0x8DF54501) ^ 0x863D8CAE;
                    continue block5;
                }
                case 701125609: {
                    n4 ^= n3 ^ 0x2E717F2A;
                    n3 = (n2 | 0x8DF54501) ^ 0x3A4ABD7E;
                    continue block5;
                }
                case -1782750663: 
            }
            break;
        }
        return this.b;
    }
}

