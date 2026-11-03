/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_310
 *  net.minecraft.class_4184
 *  org.joml.Vector4f
 */
package z.r;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import org.joml.Vector4f;
import z.r.K;
import z.r.az;
import z.r.dA;
import z.r.gF;
import z.r.gP;
import z.r.gj;
import z.r.ke;
import z.r.mw;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public class aZ
extends gF {
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private final az a;
    private final ke a;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private final ke b;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String k;
    private final gP a;
    private static final /* synthetic */ String h;
    private static aZ a;
    private static final /* synthetic */ String i;
    private final gP b;
    private final gP c;
    private static final /* synthetic */ String j;
    private final ke c;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private final gP d;
    private static final /* synthetic */ String o;
    private final ke d;
    private static final /* synthetic */ String p;
    private Double a = this.addSetting(new az(a, -9753089));
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String s;
    private final ke e;

    public aZ() {
        super(k, s, dA.l);
        this.b = this.addSetting(new gP(l, 35.0f, 0.0f, 100.0f, 5.0f, p).description(d));
        this.c = this.addSetting(new gP(i, 70.0f, 0.0f, 100.0f, 5.0f, p).description(n));
        this.a = this.addSetting(new gP(g, 85.0f, 20.0f, 150.0f, 5.0f, p).description(q));
        this.d = this.addSetting(new gP(c, 100.0f, 0.0f, 150.0f, 5.0f, p).description(j));
        this.b = this.addSetting(new ke(b, true));
        this.e = this.addSetting(new ke(f, true));
        this.d = this.addSetting(new ke(e, true));
        this.c = this.addSetting(new ke(h, true));
        this.a = this.addSetting(new ke(o, true));
        a = this;
    }

    public static aZ get() {
        return a;
    }

    public static boolean isActive() {
        return a != null && a.isEnabled();
    }

    public static void applyFogTint(Vector4f vector4f) {
        aZ aZ2 = aZ.get();
        if (aZ2 == null || vector4f == null) {
            return;
        }
        float f2 = ((Float)aZ2.c.getValue()).floatValue() / 100.0f;
        if (f2 <= 0.0f) {
            return;
        }
        int n2 = (Integer)aZ2.a.getValue();
        float f3 = (float)(n2 >> 16 & 0xFF) / 255.0f * 0.55f;
        float f4 = (float)(n2 >> 8 & 0xFF) / 255.0f * 0.55f;
        float f5 = (float)(n2 & 0xFF) / 255.0f * 0.55f;
        float f6 = f3 * 0.08f;
        float f7 = f4 * 0.06f;
        float f8 = f5 * 0.12f;
        float f9 = vector4f.x() + (f3 - vector4f.x()) * f2;
        float f10 = vector4f.y() + (f4 - vector4f.y()) * f2;
        float f11 = vector4f.z() + (f5 - vector4f.z()) * f2;
        f9 = f9 * (1.0f - f2 * 0.35f) + f6 * f2;
        f10 = f10 * (1.0f - f2 * 0.35f) + f7 * f2;
        f11 = f11 * (1.0f - f2 * 0.35f) + f8 * f2;
        vector4f.set(f9, f10, f11, vector4f.w());
    }

    public static void renderSkyOverlay(class_4184 class_41842) {
        aZ aZ2 = aZ.get();
        if (aZ2 == null || class_41842 == null) {
            return;
        }
        int n2 = (Integer)aZ2.a.getValue();
        float f2 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n2 & 0xFF) / 255.0f;
        K.render(class_41842, f2, f3, f4, ((Float)aZ2.a.getValue()).floatValue() / 100.0f, ((Float)aZ2.d.getValue()).floatValue() / 100.0f, (Boolean)aZ2.b.getValue(), (Boolean)aZ2.e.getValue(), (Boolean)aZ2.a.getValue(), (Boolean)aZ2.d.getValue(), (Boolean)aZ2.c.getValue());
    }

    private static float tu(float f2) {
        float f3 = 1.0f - f2 / 100.0f;
        return 0.55f + 0.45f * f3;
    }

    private boolean tv() {
        gF gF2 = mw.getInstance().getModuleByName(m);
        return gF2 != null && gF2.isEnabled();
    }

    private void tw(class_310 class_3102) {
        if (class_3102.field_1690 == null || this.tv()) {
            return;
        }
        class_3102.field_1690.method_42473().method_41748((Object)aZ.tu(((Float)this.b.getValue()).floatValue()));
    }

    @Override
    public void onEnable() {
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1690 != null) {
            this.a = (Double)class_3102.field_1690.method_42473().method_41753();
            this.tw(class_3102);
        }
    }

    @Override
    public void onDisable() {
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1690 != null && this.a != null) {
            class_3102.field_1690.method_42473().method_41748((Object)this.a);
        }
        this.a = null;
        K.shutdown();
    }

    @Override
    public void onTick(class_310 class_3102) {
        this.tw(class_3102);
    }

    static {
        k = gj.decode("lvaPKah3rtafBVAx", 636800096);
        s = gj.decode("WHhsypn9G5ls/r3f7MRMFk6pFGe/jR2iWW4HrQf04jUO9YfVAoeQHHtaJxJvivKh0BmtvSMZtg==", -555160146);
        a = gj.decode("u6dCbXax6YumIC/5", 977229571);
        l = gj.decode("YThF", -1501034130);
        p = gj.decode("7L7UPtoI", 590773650);
        d = gj.decode("Olwu8XQ3NZOodT7UnDj3It3yMJj4GfcDMr8x0ArgJAZn", 1696749595);
        i = gj.decode("ErHr6Z9rWVYMzIer", 855312366);
        n = gj.decode("dp8Zg61EBWLlyhUH5J/QBSah7TAaOuTCraM=", -844750472);
        g = gj.decode("JtGeIUCPWaDu7df64o8=", -1355400968);
        q = gj.decode("YaRYQFlXIEWBtaiepPdyee/wdbEVkp5YhbTNAn8++O+aLVqDvfb9", -224021735);
        c = gj.decode("pkgfH4GJtiXAgYcJ", -1137512093);
        j = gj.decode("Nt13w3AOQ/WrIplJpzAAFgCJzvCqhVe8", -974706198);
        b = gj.decode("WRwewdKOvA==", 160608468);
        f = gj.decode("qGbaIL335saczqtg2Lc=", 1931378162);
        e = gj.decode("Mn7/k0BqD0CMrQ==", -1259115861);
        h = gj.decode("/BQ7WqA=", 2067809000);
        o = gj.decode("kt3L6UGiBF4VDAi3lij5djbyeA==", 1915924249);
        m = gj.decode("yR349rKB07C2FQ==", 1832868463);
    }
}

