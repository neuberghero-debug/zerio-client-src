/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 */
package z.m;

import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import z.r.iT;

@Environment(value=EnvType.CLIENT)
@Mixin(targets={"net/uku3lig/tiertagger/TierCache"}, remap=false)
public class aA {
    @ModifyVariable(method={"getPlayerRankings"}, at=@At(value="HEAD"), argsOnly=true, remap=false)
    private static UUID zerio$useWornIdentity(UUID uUID) {
        return iT.forTierLookup(uUID);
    }
}

