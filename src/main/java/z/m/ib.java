/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.BlockRenderer
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.DefaultMaterials
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.Material
 *  net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1087
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.BlockRenderer;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.DefaultMaterials;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.Material;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1087;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.et;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
@Mixin(value={BlockRenderer.class}, remap=false)
public abstract class ib {
    private static final int a = 0xF000F0;
    @Unique
    private boolean a = false;
    @Unique
    private int b = -1;

    @Inject(method={"renderModel"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$onRenderModel(class_1087 class_10872, class_2680 class_26802, class_2338 class_23382, class_2338 class_23383, CallbackInfo callbackInfo) {
        et et2 = et.get();
        if (et2 == null || !et2.isEnabled()) {
            this.b = -1;
            this.a = false;
            return;
        }
        this.a = et2.isWhitelisted(class_26802.method_26204());
        this.b = et2.getAlphaForBlock(class_26802.method_26204());
        if (this.b == 0) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"bufferQuad"}, at={@At(value="HEAD")})
    private void zerio$onBufferQuad(MutableQuadViewImpl mutableQuadViewImpl, float[] fArray, Material material, CallbackInfo callbackInfo) {
        int n2;
        if (this.b != -1) {
            for (n2 = 0; n2 < 4; ++n2) {
                int n3 = mutableQuadViewImpl.baseColor(n2);
                mutableQuadViewImpl.setColor(n2, (this.b & 0xFF) << 24 | n3 & 0xFFFFFF);
            }
        }
        if (this.a) {
            for (n2 = 0; n2 < 4; ++n2) {
                fArray[n2] = 0.8f;
                mutableQuadViewImpl.setLight(n2, 0xF000F0);
            }
        }
    }

    @ModifyArg(method={"processQuad"}, at=@At(value="INVOKE", target="Lnet/caffeinemc/mods/sodium/client/render/chunk/compile/pipeline/BlockRenderer;bufferQuad(Lnet/caffeinemc/mods/sodium/client/render/model/MutableQuadViewImpl;[FLnet/caffeinemc/mods/sodium/client/render/chunk/terrain/material/Material;)V"), index=2)
    private Material zerio$modifyMaterial(Material material) {
        if (this.b != -1) {
            return DefaultMaterials.TRANSLUCENT;
        }
        return material;
    }

    public boolean zerio$isBlockWhitelisted() {
        return this.a;
    }
}

