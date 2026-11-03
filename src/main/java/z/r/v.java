/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.loader.api.FabricLoader
 *  org.objectweb.asm.tree.ClassNode
 *  org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin
 *  org.spongepowered.asm.mixin.extensibility.IMixinInfo
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import z.r.gj;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class v
implements IMixinConfigPlugin {
    public static final int a;
    private static final boolean a;
    private static final int[] a;
    private static final /* synthetic */ String a;

    /*
     * Enabled aggressive block sorting
     */
    public v() {
        int n2 = a & 0x47B642C6 ^ 0x1B7CA7D9;
        int n3 = (n2 | 0x47B642C6) ^ 0x474CC031;
        n3 ^= 0x110A28F4;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void onLoad(String string) {
        int n2 = a & 0x65593DB1 ^ 0x459CDD83;
        int n3 = 0;
        int n4 = (n2 | 0x65593DB1) ^ 0x235CE4A4;
        n3 = (n2 | 0x65593DB1) ^ 0xA53425C4;
        boolean bl2 = true;
        block5: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n3 = (n2 | 0x65593DB1) ^ 0xBA834E86;
            }
            block6: while (true) {
                switch (n3) {
                    default: {
                        continue block6;
                    }
                    case -1058416521: {
                        n3 = (n2 | 0x65593DB1) ^ 0x395AAEBB;
                        continue block6;
                    }
                    case 1552372488: {
                        n4 ^= n3 ^ 0xB3A08B1;
                        continue block5;
                    }
                    case -547441867: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public String getRefMapperConfig() {
        int n2 = a & 0x5DBAC707 ^ 0x93013D9;
        int n3 = 0;
        int n4 = (n2 | 0x5DBAC707) ^ 0x305B8E88;
        n3 = (n2 | 0x5DBAC707) ^ 0x88C6B541;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 303604803: {
                    n4 ^= n3 ^ 0x64AEB605;
                    n3 = (n2 | 0x5DBAC707) ^ 0xD8F11FC7;
                    continue block5;
                }
                case -2058631144: {
                    return null;
                }
                case -713268578: 
            }
            n3 = (n2 | 0x5DBAC707) ^ 0x4FA2739C;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean shouldApplyMixin(String string, String string2) {
        int n2 = a & 0x16E9E698 ^ 0xB6DBBF76;
        int n3 = 0;
        int n4 = (n2 | 0x16E9E698) ^ 0x80DE54E0;
        n3 = (n2 | 0x16E9E698) ^ 0x15660157;
        boolean bl2 = true;
        block5: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n3 = (n2 | 0x16E9E698) ^ 0xA120377D;
            }
            block6: while (true) {
                switch (n3) {
                    case 1300046234: {
                        n4 ^= n3 ^ 0x7AEC7581;
                        continue block5;
                    }
                    case -1549926743: {
                        n3 = (n2 | 0x16E9E698) ^ 0xFB86DE64;
                    }
                    default: {
                        continue block6;
                    }
                    case 400279683: 
                }
                break;
            }
            break;
        }
        return a;
    }

    /*
     * Unable to fully structure code
     */
    public void acceptTargets(Set<String> var1_1, Set<String> var2_2) {
        var3_3 = v.a & 1426619494 ^ 465781158;
        var5_4 = 0;
        ** GOTO lbl11
lbl4:
        // 1 sources

        block5: while (true) {
            switch (var5_4) lbl-1000:
            // 3 sources

            {
                default: {
                    continue block5;
                }
                case -1647333419: {
                    var5_4 = (var3_3 | 1426619494) ^ 1313611182;
                    ** GOTO lbl-1000
                }
lbl11:
                // 1 sources

                var4_5 = (var3_3 | 1426619494) ^ -549653835;
                break block5;
                case 294084680: {
                    var4_5 ^= var5_4 ^ 187545573;
                    var5_4 = (var3_3 | 1426619494) ^ -77126593;
                    ** GOTO lbl-1000
                }
                case -1532208679: {
                    return;
                }
            }
            break;
        }
        var5_4 = (var3_3 | 1426619494) ^ -1039871437;
        ** while (true)
    }

    private static int a(int n2, int n3) {
        int n4 = -251487531;
        int n5 = -436774674;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0xBBC3D505)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0xF5F7F034;
        n6 -= (n5 | n4) ^ 0xF5F7EB3A;
        n6 += (n5 | n4) ^ 0xF5F76DD7;
        n6 += (n5 | n4) ^ 0xF5F79520;
        n6 ^= (n5 | n4) ^ 0xF5F7DBA8;
        n6 -= (n5 | n4) ^ 0xF5F72942;
        n6 += (n5 | n4) ^ 0xF5F74E18;
        n6 -= (n5 | n4) ^ 0xF5F75730;
        n6 += (n5 | n4) ^ 0xF5F79947;
        return n6 ^= (n5 | n4) ^ 0xF5F741CA;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block46: {
            block49: {
                block48: {
                    block43: {
                        block42: {
                            block44: {
                                block47: {
                                    block45: {
                                        block41: {
                                            break block47;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl3:
                                            // 1 sources

                                            while (true) {
                                                var0_2 ^= -387068412;
                                                ** GOTO lbl73
                                                break;
                                            }
lbl6:
                                            // 1 sources

                                            while (true) {
                                                var0_2 ^= 2124510046;
                                                ** GOTO lbl15
                                                break;
                                            }
lbl9:
                                            // 1 sources

                                            while (true) {
                                                v0 = (v1[v2] & 255) << 24;
                                                ** GOTO lbl79
lbl13:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl15:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl17:
                                                // 1 sources

                                                while (true) {
                                                    var0_2 ^= 379529679;
                                                    ** GOTO lbl61
                                                    break;
                                                }
                                                break;
                                            }
lbl20:
                                            // 1 sources

                                            while (true) {
                                                var0_2 ^= var1_1 ^ 582374491;
                                                break block41;
                                                break;
                                            }
lbl23:
                                            // 1 sources

                                            while (true) {
                                                v2 = 0;
                                                v1 = "O\u0006Wb".getBytes("ISO-8859-1");
                                                break block42;
                                                break;
                                            }
lbl27:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl29:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl31:
                                            // 1 sources

                                            while (true) {
                                                {
                                                    v.a[v3] = (v0 | (v4 | (v5 | v1[v2 + 3] & 255))) ^ v6;
                                                }
                                                v3 = v3 + 1;
                                                v7 = v2 + 4;
                                                v1 = v1;
                                                v2 = v7;
                                                ** GOTO lbl62
                                                break;
                                            }
lbl40:
                                            // 1 sources

                                            return;
lbl42:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                            v.a = new int[1];
                                            var0_2 ^= -1002048444;
                                            ** while (true)
lbl47:
                                            // 1 sources

                                            while (true) {
                                                var0_2 ^= var1_1 ^ 394828461;
                                                ** GOTO lbl68
                                                break;
                                            }
                                            v6 = ((var0_2 ^= -905232262) | var2) ^ -556159753 ^ v.a;
                                            var0_2 ^= 1640742182;
                                            ** while (true)
lbl53:
                                            // 1 sources

                                            while (true) {
                                                ** continue;
                                                break;
                                            }
                                            v5 = (v1[v2 + 2] & 255) << 8;
                                            block33: while (true) {
                                                switch (var0_2) {
                                                    case -1636396399: {
                                                        ** continue;
                                                    }
lbl61:
                                                    // 1 sources

                                                    ** continue;
lbl62:
                                                    // 1 sources

                                                    var0_2 ^= 1504158486;
                                                    ** GOTO lbl81
lbl64:
                                                    // 1 sources

                                                    while (true) {
                                                        v4 = (v1[v2 + 1] & 255) << 16;
                                                        break block43;
                                                        break;
                                                    }
lbl68:
                                                    // 1 sources

                                                    var1_1 = var2 ^ 1250029018;
                                                    break block44;
lbl70:
                                                    // 1 sources

                                                    while (true) {
                                                        var0_2 ^= var1_1 ^ -1576947914;
                                                        break block45;
                                                        break;
                                                    }
lbl73:
                                                    // 2 sources

                                                    while (true) {
                                                        ** continue;
                                                        break;
                                                    }
lbl76:
                                                    // 1 sources

                                                    while (true) {
                                                        var0_2 ^= 549075815;
                                                        ** continue;
                                                        break;
                                                    }
lbl79:
                                                    // 1 sources

                                                    var0_2 ^= 1652760063;
                                                    ** continue;
lbl81:
                                                    // 1 sources

                                                    if (v7 < v1.length) break block42;
                                                    break block46;
lbl83:
                                                    // 1 sources

                                                    while (true) {
                                                        var1_1 = var2 ^ 352062680;
                                                        break block44;
                                                        break;
                                                    }
                                                    case 1568405275: {
                                                        var0_2 ^= -777298331;
                                                        continue block33;
                                                    }
                                                }
                                                break;
                                            }
                                            var0_2 ^= 797368718;
                                            ** while (true)
                                        }
                                        var1_1 = var2 ^ 1062350556;
                                        break block44;
                                        v.a = FabricLoader.getInstance().isModLoaded(v.a);
                                        var1_1 = var2 ^ -1387844219;
                                        break block44;
                                        v.a = gj.decode("fkvqyD0wYwRBGw==", v.a(((var0_2 ^= 243601153) | var2) ^ -1277955563, var2 ^ ((var0_2 | var2) ^ -350022374)));
                                        var1_1 = var2 ^ 2042233175;
                                        break block44;
                                    }
                                    var1_1 = var2 ^ -213509334;
                                    break block44;
lbl103:
                                    // 1 sources

                                    while (true) {
                                        var0_2 ^= -1203856381;
                                        break block43;
                                        break;
                                    }
                                }
                                var2 = 1575236968;
                                v.a = mK.a(MethodHandles.lookup().lookupClass(), 1925198664);
                                var1_1 = 0;
                                break block48;
                            }
lbl112:
                            // 2 sources

                            block40: while (true) {
                                switch (var1_1) {
                                    default: {
                                        continue block40;
                                    }
                                    case -1365103038: {
                                        ** continue;
                                    }
                                    case -257746707: {
                                        ** continue;
                                    }
                                    case 1656101812: {
                                        ** continue;
                                    }
                                    case 392550578: {
                                        ** continue;
                                    }
                                    case 1226324400: {
                                        ** continue;
                                    }
                                    case 610153535: {
                                        ** continue;
                                    }
                                    case 1985496921: {
                                        ** continue;
                                    }
                                }
                                break;
                            }
                        }
                        var0_2 ^= -1166510391;
                        break block49;
                    }
                    switch (var0_2) {
                        case 196674195: {
                            ** continue;
                        }
                        case -665709309: {
                            ** continue;
                        }
                        ** default:
lbl140:
                        // 1 sources

                        ** continue;
                    }
                }
                var0_2 = 1451344580;
                var1_1 = var2 ^ 733770289;
                ** while (true)
            }
            var0_2 ^= 1831112291;
            ** while (true)
        }
        ** while (true)
        v3 = 0;
        var0_2 ^= 1915908699;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public List<String> getMixins() {
        int n2 = a & 0x5863E90F ^ 0x50EDA69E;
        int n3 = 0;
        int n4 = (n2 | 0x5863E90F) ^ 0x9C716F38;
        n3 = (n2 | 0x5863E90F) ^ 0xD5B40F4C;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1923358509: {
                    n3 = (n2 | 0x5863E90F) ^ 0x642EA1BF;
                    continue block5;
                }
                case -399054159: {
                    return null;
                }
                case 1019301408: 
            }
            n4 ^= n3 ^ 0x24D91DB;
            n3 = (n2 | 0x5863E90F) ^ 0xB0D9052E;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void preApply(String var1_1, ClassNode var2_2, String var3_3, IMixinInfo var4_4) {
        var5_5 = v.a & 898465506 ^ -241814267;
        var7_6 = 0;
        if (true) ** GOTO lbl18
        block5: while (true) {
            var7_6 = (var5_5 | 898465506) ^ 1915795427;
            block6: while (true) {
                switch (var7_6) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block6;
                        }
                        break;
                    }
                    case 1358088330: {
                        ** GOTO lbl16
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var7_6 = (var5_5 | 898465506) ^ -1519536275;
                        ** GOTO lbl-1000
                        break;
                    }
lbl16:
                    // 1 sources

                    var7_6 = (var5_5 | 898465506) ^ -784126002;
                    ** continue;
lbl18:
                    // 1 sources

                    var6_7 = (var5_5 | 898465506) ^ -42501993;
                    ** continue;
                    case 618418217: {
                        var6_7 ^= var7_6 ^ 1341852508;
                        continue block5;
                    }
                    case -2018523132: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void postApply(String string, ClassNode classNode, String string2, IMixinInfo iMixinInfo) {
        int n2 = a & 0x9DBCB765 ^ 0x9B30E01B;
        int n3 = 0;
        int n4 = (n2 | 0x9DBCB765) ^ 0xF70C56CF;
        n3 = (n2 | 0x9DBCB765) ^ 0x7FC1B59;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1001394099: {
                    return;
                }
                case -130109050: {
                    n4 ^= n3 ^ 0xA3C43219;
                    n3 = (n2 | 0x9DBCB765) ^ 0xA40CF8CC;
                    continue block5;
                }
                case -1740575706: 
            }
            n3 = (n2 | 0x9DBCB765) ^ 0x678246F9;
        }
    }
}

