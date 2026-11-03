/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_310;
import net.minecraft.class_332;
import z.r.dA;
import z.r.eC;
import z.r.gF;
import z.r.mp;

@Environment(value=EnvType.CLIENT)
public abstract class cS
extends gF
implements mp {
    public static final int m = mK.a(MethodHandles.lookup().lookupClass(), -1641319126);
    protected static final class_310 a;

    /*
     * Enabled aggressive block sorting
     */
    protected cS(String string, String string2, dA dA2) {
        int n2 = m & 0xFDF7825F ^ 0x55A92666;
        int n3 = (n2 | 0xFDF7825F) ^ 0x2E1241A9;
        n3 ^= 0x17DED3BA;
        super(string, string2, dA2);
        n3 ^= 0x31594C81;
    }

    public abstract void onPortTick();

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void onPortWorldRender(WorldRenderContext worldRenderContext) {
        int n2 = m & 0xA8A9182 ^ 0xEF57A267;
        int n3 = 0;
        int n4 = (n2 | 0xA8A9182) ^ 0x801830E0;
        n3 = (n2 | 0xA8A9182) ^ 0x7758B17F;
        boolean bl2 = true;
        block5: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n3 = (n2 | 0xA8A9182) ^ 0xE505EBA5;
            }
            block6: while (true) {
                switch (n3) {
                    case -344040485: {
                        n4 ^= n3 ^ 0x564DF543;
                        continue block5;
                    }
                    case -1735982440: {
                        n3 = (n2 | 0xA8A9182) ^ 0x4A1E83C;
                    }
                    default: {
                        continue block6;
                    }
                    case 182081602: 
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
    public void onPortHudRender(class_332 class_3322) {
        int n2 = m & 0x5A6699BC ^ 0x31A55251;
        int n3 = 0;
        int n4 = (n2 | 0x5A6699BC) ^ 0xFBE71D68;
        n3 = (n2 | 0x5A6699BC) ^ 0xD5FB2332;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1373833009: {
                    n3 = (n2 | 0x5A6699BC) ^ 0xE4B2D0BA;
                    continue block5;
                }
                case -1621816505: {
                    n4 ^= n3 ^ 0xDE260F40;
                    n3 = (n2 | 0x5A6699BC) ^ 0xCE01F495;
                    continue block5;
                }
                case -1243205784: 
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void onTick(class_310 class_3102) {
        int n2 = m & 0x1901EB00 ^ 0x7DDB8BC;
        int n3 = 0;
        int n4 = (n2 | 0x1901EB00) ^ 0xD97F1A60;
        n3 = (n2 | 0x1901EB00) ^ 0xB8FC4B31;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1490964339: {
                    n3 = (n2 | 0x1901EB00) ^ 0xC83A0EC5;
                    continue block5;
                }
                case -672664199: {
                    n4 ^= n3 ^ 0xF5D49C75;
                    n3 = (n2 | 0x1901EB00) ^ 0x5CC54998;
                    continue block5;
                }
                case 1125691940: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onEnable() {
        var1_1 = cS.m & -1821487350 ^ -632586583;
        var3_2 = 0;
        if (true) ** GOTO lbl13
        block5: while (true) {
            switch (var3_2) lbl-1000:
            // 4 sources

            {
                default: {
                    continue block5;
                }
lbl8:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | -1821487350) ^ -1047492684;
                    ** GOTO lbl-1000
                    break;
                }
                case 1989506116: {
                    return;
                }
lbl13:
                // 1 sources

                var2_3 = (var1_1 | -1821487350) ^ 288547752;
                var3_2 = (var1_1 | -1821487350) ^ 469553732;
                ** GOTO lbl-1000
                case 452982815: {
                    var2_3 ^= var3_2 ^ -34316988;
                    var3_2 = (var1_1 | -1821487350) ^ -1376121873;
                    ** GOTO lbl-1000
                }
                case -1064063505: 
            }
            break;
        }
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onDisable() {
        int n2 = m & 0x68C31305 ^ 0x82100489;
        int n3 = 0;
        int n4 = (n2 | 0x68C31305) ^ 0x9DC753EB;
        n3 = (n2 | 0x68C31305) ^ 0x73C7DF43;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1726691122: {
                    n3 = (n2 | 0x68C31305) ^ 0xBD6D14E8;
                    continue block5;
                }
                case 1472070501: {
                    n4 ^= n3 ^ 0xB99FDEAF;
                    n3 = (n2 | 0x68C31305) ^ 0xA476CD4C;
                    continue block5;
                }
                case 1319492289: 
            }
            break;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    @Override
    public <T extends eC<?>> T register(T t2) {
        int n2 = m & 0xF128123F ^ 0x836716CC;
        int n3 = 0;
        int n4 = (n2 | 0xF128123F) ^ 0xA198A030;
        n3 = (n2 | 0xF128123F) ^ 0xBF30B6DA;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1281335333: {
                    n3 = (n2 | 0xF128123F) ^ 0x14E89F4C;
                    continue block5;
                }
                case -410547789: {
                    n4 ^= n3 ^ 0xC03DAF55;
                    n3 = (n2 | 0xF128123F) ^ 0x8212C73;
                    continue block5;
                }
                case -78759284: 
            }
            break;
        }
        return this.addSetting(t2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n2 = 0;
        int n3 = -904257487;
        n2 = 0xD6E8C616 ^ 0x69B5C45E;
        block5: while (true) {
            switch (n2) {
                case -479392981: {
                    n3 ^= n2 ^ 0x42C9B103;
                    n2 = 0xD6E8C616 ^ 0x2FCDBB49;
                }
                default: {
                    continue block5;
                }
                case -114983585: {
                    a = class_310.method_1551();
                    return;
                }
                case -1084423608: 
            }
            n2 = 0xD6E8C616 ^ 0x3585CD3D;
        }
    }
}

