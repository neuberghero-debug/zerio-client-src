/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1657
 *  net.minecraft.class_310
 *  net.minecraft.class_636
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.r.ko;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
@Mixin(value={class_636.class})
public abstract class bX {
    @Unique
    private float a;
    @Unique
    private boolean a;
    @Unique
    private float b;

    @Inject(method={"method_2919"}, at={@At(value="HEAD")})
    private void zerio$wireUseIn(class_1657 class_16572, class_1268 class_12682, CallbackInfoReturnable<class_1269> callbackInfoReturnable) {
        if (!ko.routeManualItemUse() || class_16572 != class_310.method_1551().field_1724) {
            return;
        }
        this.a = class_16572.method_36454();
        this.b = class_16572.method_36455();
        class_16572.method_36456(ko.wireYaw());
        class_16572.method_36457(ko.wirePitch());
        this.a = true;
    }

    @Inject(method={"method_2919"}, at={@At(value="RETURN")})
    private void zerio$wireUseOut(class_1657 class_16572, class_1268 class_12682, CallbackInfoReturnable<class_1269> callbackInfoReturnable) {
        if (!this.a) {
            return;
        }
        class_16572.method_36456(this.a);
        class_16572.method_36457(this.b);
        this.a = false;
    }
}

