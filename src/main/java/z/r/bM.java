/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import z.r.dA;
import z.r.gF;

@Environment(value=EnvType.CLIENT)
public abstract class bM
extends gF {
    public static final int n;
    protected static final class_310 a;

    /*
     * Enabled aggressive block sorting
     */
    protected bM(String string, String string2) {
        int n2 = n & 0x443F5340 ^ 0xF3F42581;
        int n3 = (n2 | 0x443F5340) ^ 0xF3E929BD;
        n3 ^= 0x4A6F702A;
        super(string, string2, dA.C);
        n3 ^= 0x8078A8F9;
    }

    public abstract void onCombatTick();

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void onTick(class_310 class_3102) {
        int n2 = n & 0xD5AC7A55 ^ 0x27EE477F;
        int n3 = 0;
        int n4 = (n2 | 0xD5AC7A55) ^ 0xA6A2BCF6;
        n3 = (n2 | 0xD5AC7A55) ^ 0xBD401648;
        block5: while (true) {
            switch (n3) {
                case 244685803: {
                    n4 ^= n3 ^ 0xE4C31B68;
                    n3 = (n2 | 0xD5AC7A55) ^ 0x1BF8FE21;
                }
                default: {
                    continue block5;
                }
                case -334069410: {
                    return;
                }
                case 1252944183: 
            }
            n3 = (n2 | 0xD5AC7A55) ^ 0xF97BE494;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onEnable() {
        int n2 = n & 0x2650D40 ^ 0xBA6F3C8B;
        int n3 = 0;
        int n4 = (n2 | 0x2650D40) ^ 0xE322B8FF;
        n3 = (n2 | 0x2650D40) ^ 0xC3738E7C;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -157206789: {
                    n4 ^= n3 ^ 0xCCE5DE65;
                    n3 = (n2 | 0x2650D40) ^ 0xC11A42E5;
                    continue block5;
                }
                case 2071297838: {
                    return;
                }
                case 2031924151: 
            }
            n3 = (n2 | 0x2650D40) ^ 0x4CCE0B30;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    @Override
    public void onDisable() {
        int n2 = n & 0xE23CCC71 ^ 0xBC007D7E;
        int n3 = 0;
        int n4 = (n2 | 0xE23CCC71) ^ 0xE4626326;
        n3 = (n2 | 0xE23CCC71) ^ 0x56BA7C49;
        block5: while (true) {
            switch (n3) {
                case -1467580106: {
                    n3 = (n2 | 0xE23CCC71) ^ 0xBCCEEDF6;
                }
                default: {
                    continue block5;
                }
                case 1123160201: {
                    n4 ^= n3 ^ 0xAD559022;
                    n3 = (n2 | 0xE23CCC71) ^ 0xD25F9FC8;
                    continue block5;
                }
                case 744710839: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block11: {
                block10: {
                    break block11;
lbl1:
                    // 1 sources

                    while (true) {
                        var1 = -2019722535 ^ -228464176;
                        break block9;
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        var0_1 ^= var1 ^ 1733763262;
                        break block10;
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        bM.a = class_310.method_1551();
                        return;
                    }
                }
                var1 = -2019722535 ^ 1708392146;
                break block9;
            }
            bM.n = mK.a(MethodHandles.lookup().lookupClass(), -1008623006);
            var1 = 0;
            var0_1 = 473036191;
            ** while (true)
        }
        block8: while (true) {
            switch (var1) {
                default: {
                    continue block8;
                }
                case 1979486985: {
                    break;
                }
                case 253173626: {
                    ** continue;
                }
                case -498170869: {
                    ** continue;
                }
            }
            var1 = -2019722535 ^ -2004195933;
        }
    }
}

