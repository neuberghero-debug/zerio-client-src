/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import z.r.ko;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
@Mixin(value={class_746.class})
public abstract class gs {
    @Unique
    private boolean a;
    @Unique
    private float a;
    @Unique
    private float b;

    @Inject(method={"method_3136"}, at={@At(value="HEAD")})
    private void zerio$wireRotationIn(CallbackInfo callbackInfo) {
        class_746 class_7462 = (class_746)this;
        if (!ko.active()) {
            return;
        }
        this.a = class_7462.method_36454();
        this.b = class_7462.method_36455();
        class_7462.method_36456(ko.wireYaw());
        class_7462.method_36457(ko.wirePitch());
        this.a = true;
    }

    @Inject(method={"method_3136"}, at={@At(value="RETURN")})
    private void zerio$wireRotationOut(CallbackInfo callbackInfo) {
        if (!this.a) {
            return;
        }
        class_746 class_7462 = (class_746)this;
        class_7462.method_36456(this.a);
        class_7462.method_36457(this.b);
        this.a = false;
    }
}

