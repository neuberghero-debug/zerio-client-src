/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_10055
 *  net.minecraft.class_1007
 *  net.minecraft.class_10426
 *  net.minecraft.class_10442
 *  net.minecraft.class_11659
 *  net.minecraft.class_11890
 *  net.minecraft.class_12075
 *  net.minecraft.class_1306
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package z.m;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_10426;
import net.minecraft.class_10442;
import net.minecraft.class_11659;
import net.minecraft.class_11890;
import net.minecraft.class_12075;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import z.m.bf;
import z.m.eW;
import z.m.f;
import z.m.gA;
import z.m.jD;
import z.m.jG;
import z.r.M;
import z.r.aR;
import z.r.cR;
import z.r.gF;
import z.r.gU;
import z.r.gj;
import z.r.kM;
import z.r.kl;
import z.r.ko;
import z.r.mw;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_1007.class})
public abstract class eO {
    private static final /* synthetic */ String a;

    @Inject(method={"method_62604"}, at={@At(value="TAIL")}, order=12000)
    private void zerio$silentAuraBody(class_11890 class_118902, class_10055 class_100552, float f2, CallbackInfo callbackInfo) {
        class_310 class_3102 = class_310.method_1551();
        if (class_118902 != class_3102.field_1724 || !ko.renderSilentBody()) {
            return;
        }
        class_100552.field_53446 = ko.renderYaw(f2);
        class_100552.field_53447 = 0.0f;
        class_100552.field_53448 = ko.renderPitch(f2);
    }

    @Inject(method={"method_62604"}, at={@At(value="TAIL")})
    private void zerio$nameProtectAfterPlayerRenderState(class_11890 class_118902, class_10055 class_100552, float f2, CallbackInfo callbackInfo) {
        if (!(class_118902 instanceof class_1657)) {
            return;
        }
        class_1657 class_16572 = (class_1657)class_118902;
        kl kl2 = kl.getInstance();
        if (kl2 == null || !kl2.coversArea(aR.e)) {
            return;
        }
        class_310 class_3102 = class_310.method_1551();
        String string = class_16572.method_7334().name();
        if (!kl2.protectsProfileName(string, class_3102, aR.e)) {
            return;
        }
        if (class_100552.field_53525 != null) {
            class_100552.field_53525 = gU.applyForKnownPlayer(class_100552.field_53525, string, class_16572.method_5667(), kl2, aR.e);
        }
    }

    @Inject(method={"method_62604"}, at={@At(value="TAIL")}, order=11000)
    private void zerio$freecamShowLocalBody(class_11890 class_118902, class_10055 class_100552, float f2, CallbackInfo callbackInfo) {
        eO.zerio$applyFreecamLocalBodyVisibility(class_118902, class_100552);
        eO.zerio$syncFreecamHeldItemAnimations(class_118902, class_100552, f2);
    }

    @Inject(method={"method_62604"}, at={@At(value="TAIL")})
    private void zerio$uprightFlightPose(class_11890 class_118902, class_10055 class_100552, float f2, CallbackInfo callbackInfo) {
        if (!(class_118902 instanceof class_1657)) {
            return;
        }
        class_1657 class_16572 = (class_1657)class_118902;
        if (!class_100552.field_53411) {
            return;
        }
        M m2 = M.get();
        if (m2 == null || !m2.shouldPose(class_16572)) {
            return;
        }
        class_100552.field_53411 = false;
        class_100552.field_53403 = 0.0f;
        class_100552.field_53459 = false;
        class_100552.field_53405 = 1.0f;
        class_100552.field_53450 = m2.limbProgress(class_16572.method_5667(), f2);
        class_100552.field_53451 = m2.limbAmplitude(class_16572.method_5667());
        if (m2.hidesArmor()) {
            class_100552.field_55309 = class_1799.field_8037;
            class_100552.field_53418 = class_1799.field_8037;
            class_100552.field_53419 = class_1799.field_8037;
            class_100552.field_53420 = class_1799.field_8037;
        }
        if (class_100552.field_53338 != null) {
            float f3 = Math.max(0.0f, 1.8f - class_100552.field_53330);
            class_100552.field_53338 = class_100552.field_53338.method_1031(0.0, (double)f3, 0.0);
        }
    }

    @Inject(method={"method_62607"}, at={@At(value="TAIL")}, order=11000)
    private void zerio$freecamShowLocalBodyAfterGliding(class_11890 class_118902, class_10055 class_100552, float f2, CallbackInfo callbackInfo) {
        eO.zerio$applyFreecamLocalBodyVisibility(class_118902, class_100552);
        eO.zerio$syncFreecamHeldItemAnimations(class_118902, class_100552, f2);
    }

    @Inject(method={"method_62606"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$freecamRenderHeldItemFeatures(class_10055 class_100552, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        kM kM2;
        kM kM3;
        gF gF2 = mw.getInstance().getModuleByName(a);
        kM kM4 = kM3 = gF2 instanceof kM ? (kM2 = (kM)gF2) : null;
        if (kM3 == null || !kM3.isFreecamActive() || !kM3.isShowPlayerModel()) {
            return;
        }
        kM2 = class_310.method_1551();
        if (((class_310)kM2).field_1724 == null || class_100552.field_53528 != ((class_310)kM2).field_1724.method_5628()) {
            return;
        }
        callbackInfoReturnable.setReturnValue((Object)true);
    }

    private static void zerio$applyFreecamLocalBodyVisibility(class_11890 class_118902, class_10055 class_100552) {
        kM kM2;
        kM kM3;
        gF gF2 = mw.getInstance().getModuleByName(a);
        kM kM4 = kM3 = gF2 instanceof kM ? (kM2 = (kM)gF2) : null;
        if (kM3 == null || !kM3.isFreecamActive() || !kM3.isShowPlayerModel()) {
            return;
        }
        kM2 = class_310.method_1551();
        if (((class_310)kM2).field_1724 == null || class_118902 != ((class_310)kM2).field_1724) {
            return;
        }
        ((eW)class_100552).zerio$setInvisible(false);
        ((f)class_100552).zerio$setInvisibleToPlayer(false);
        ((gA)class_100552).zerio$setSpectator(false);
        if (kM3.wasHoldingSneak()) {
            ((jD)class_100552).zerio$setInSneakingPose(true);
        }
    }

    private static void zerio$syncFreecamHeldItemAnimations(class_11890 class_118902, class_10055 class_100552, float f2) {
        kM kM2;
        kM kM3;
        gF gF2 = mw.getInstance().getModuleByName(a);
        kM kM4 = kM3 = gF2 instanceof kM ? (kM2 = (kM)gF2) : null;
        if (kM3 == null || !kM3.isFreecamActive() || !kM3.isShowPlayerModel()) {
            return;
        }
        kM2 = class_310.method_1551();
        if (((class_310)kM2).field_1724 == null || class_118902 != ((class_310)kM2).field_1724 || !(class_118902 instanceof class_1309)) {
            return;
        }
        gF2 = class_118902;
        class_10426 class_104262 = (class_10426)class_100552;
        class_10426.method_65577((class_1309)gF2, (class_10426)class_104262, (class_10442)kM2.method_65386(), (float)f2);
        jD jD2 = (jD)class_100552;
        jD2.zerio$setIsUsingItem(gF2.method_6115());
        jD2.zerio$setActiveHand(gF2.method_6058());
        float f3 = gF2.method_75120(f2);
        jD2.zerio$setItemUseTime(f3);
        f f4 = (f)class_100552;
        f4.zerio$setHeadItemAnimationProgress(gF2.method_6115() ? f3 : 0.0f);
        jG jG2 = (jG)class_100552;
        jG2.zerio$setHandSwingProgress(gF2.method_6055(f2));
        jG2.zerio$setRightArmPose(bf.zerio$getArmPose(class_118902, class_1306.field_6183));
        jG2.zerio$setLeftArmPose(bf.zerio$getArmPose(class_118902, class_1306.field_6182));
    }

    @Inject(method={"method_4213"}, at={@At(value="HEAD")}, cancellable=true)
    private void zerio$hideVanillaLabel(class_10055 class_100552, class_4587 class_45872, class_11659 class_116592, class_12075 class_120752, CallbackInfo callbackInfo) {
        cR cR2 = cR.get();
        if (cR2 != null && cR2.claimsPlayerLabels()) {
            callbackInfo.cancel();
        }
    }

    static {
        a = gj.decode("F/wD7CAgnA==", 1512578982);
    }
}

