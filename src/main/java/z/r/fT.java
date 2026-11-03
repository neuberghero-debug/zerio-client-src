/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents
 *  net.minecraft.class_310
 *  net.minecraft.class_4184
 */
package z.r;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import z.r.aZ;
import z.r.cV;
import z.r.eN;
import z.r.gj;
import z.r.hJ;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class fT {
    private static final /* synthetic */ String a;
    private static boolean a;

    private fT() {
    }

    public static void register() {
        if (a) {
            return;
        }
        a = true;
        WorldRenderEvents.END_MAIN.register(fT::render);
    }

    public static void render(WorldRenderContext worldRenderContext) {
        class_310 class_3102 = class_310.method_1551();
        if (!hJ.ok() || class_3102.field_1724 == null || class_3102.field_1687 == null || !aZ.isActive()) {
            return;
        }
        class_4184 class_41842 = class_3102.field_1773.method_19418();
        if (!class_41842.method_19332()) {
            return;
        }
        long l2 = eN.begin();
        aZ.renderSkyOverlay(class_41842);
        eN.end(a, cV.i, l2);
    }

    static {
        a = gj.decode("jggyilRLG95wA+WL", -539708192);
    }
}

