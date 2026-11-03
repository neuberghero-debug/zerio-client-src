/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_12202
 *  net.minecraft.class_12206
 *  net.minecraft.class_310
 *  net.minecraft.class_4184
 *  net.minecraft.class_638
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL15
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.system.MemoryStack
 */
package z.r;

import java.nio.FloatBuffer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_12202;
import net.minecraft.class_12206;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_638;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.MemoryStack;
import z.r.cZ;
import z.r.gj;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class K {
    private static final Matrix4f a;
    private static final /* synthetic */ String a;
    private static final Vector3f a;
    private static int a;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String c;
    private static int b;
    private static int c;
    private static final /* synthetic */ String d;
    private static int d;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static int e;
    private static final int f = 14;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static final long a;
    private static int k;
    private static final /* synthetic */ String i;
    private static int l;
    private static int m;
    private static final /* synthetic */ String j;
    private static int n;
    private static final String k;
    private static final Matrix4f b;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String m;
    private static int o;
    private static final Quaternionf a;
    private static boolean a;
    private static final Vector3f b;
    private static final /* synthetic */ String n;
    private static int p;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static int q;
    private static final String q;
    private static final /* synthetic */ String r;
    private static int r;
    private static final Matrix4f c;
    private static final /* synthetic */ String s;

    private K() {
    }

    public static void render(class_4184 class_41842, float f2, float f3, float f4, float f5, float f6, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        float f7;
        FloatBuffer floatBuffer;
        class_310 class_3102 = class_310.method_1551();
        if (class_3102 == null || class_3102.field_1773 == null || class_41842 == null || !class_41842.method_19332()) {
            return;
        }
        K.D();
        K.A(class_3102, a);
        a.set((Quaternionfc)class_41842.method_23767()).conjugate();
        c.rotation((Quaternionfc)a);
        a.mul((Matrix4fc)c, b);
        b.invert();
        K.y(class_3102, class_41842);
        int n2 = GL11.glGetInteger((int)35725);
        int n3 = GL11.glGetInteger((int)34229);
        int n4 = GL11.glGetInteger((int)34964);
        int n5 = GL11.glGetInteger((int)2932);
        boolean bl7 = GL11.glIsEnabled((int)2929);
        boolean bl8 = GL11.glIsEnabled((int)3042);
        boolean bl9 = GL11.glIsEnabled((int)2884);
        boolean bl10 = GL11.glGetBoolean((int)2930);
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            floatBuffer = memoryStack.mallocFloat(1);
            GL11.glGetFloatv((int)2931, (FloatBuffer)floatBuffer);
            f7 = floatBuffer.get(0);
        }
        GL20.glUseProgram((int)a);
        memoryStack = MemoryStack.stackPush();
        try {
            floatBuffer = memoryStack.mallocFloat(16);
            b.get(floatBuffer);
            GL20.glUniformMatrix4fv((int)r, (boolean)false, (FloatBuffer)floatBuffer);
        }
        finally {
            if (memoryStack != null) {
                memoryStack.close();
            }
        }
        GL20.glUniform3f((int)o, (float)f2, (float)f3, (float)f4);
        GL20.glUniform3f((int)i, (float)K.a.x, (float)K.a.y, (float)K.a.z);
        GL20.glUniform3f((int)d, (float)K.b.x, (float)K.b.y, (float)K.b.z);
        GL20.glUniform1f((int)j, (float)Math.max(0.05f, f5));
        GL20.glUniform1f((int)h, (float)((float)(System.nanoTime() - a) / 1.0E9f));
        GL20.glUniform1f((int)e, (float)Math.max(0.0f, f6));
        GL20.glUniform1f((int)b, (float)(bl2 ? 1.0f : 0.0f));
        GL20.glUniform1f((int)p, (float)(bl3 ? 1.0f : 0.0f));
        GL20.glUniform1f((int)g, (float)(bl4 ? 1.0f : 0.0f));
        GL20.glUniform1f((int)c, (float)(bl5 ? 1.0f : 0.0f));
        GL20.glUniform1f((int)m, (float)(bl6 ? 1.0f : 0.0f));
        boolean bl11 = f7 < 0.5f;
        GL20.glUniform1f((int)q, (float)(bl11 ? 1.0E-6f : 0.999999f));
        GL11.glDepthMask((boolean)false);
        GL11.glEnable((int)2929);
        GL11.glDepthFunc((int)(bl11 ? 518 : 515));
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2884);
        if (!a) {
            while (GL11.glGetError() != 0) {
            }
        }
        GL30.glBindVertexArray((int)n);
        GL11.glDrawArrays((int)4, (int)0, (int)3);
        GL30.glBindVertexArray((int)0);
        if (!a) {
            int n6 = GL11.glGetError();
            if (n6 != 0) {
                throw new IllegalStateException("Space sky OpenGL draw failed: 0x" + Integer.toHexString(n6));
            }
            a = true;
        }
        GL11.glDepthMask((boolean)bl10);
        GL11.glDepthFunc((int)n5);
        if (bl7) {
            GL11.glEnable((int)2929);
        } else {
            GL11.glDisable((int)2929);
        }
        if (bl8) {
            GL11.glEnable((int)3042);
        } else {
            GL11.glDisable((int)3042);
        }
        if (bl9) {
            GL11.glEnable((int)2884);
        } else {
            GL11.glDisable((int)2884);
        }
        GL30.glBindVertexArray((int)n3);
        GL15.glBindBuffer((int)34962, (int)n4);
        GL20.glUseProgram((int)n2);
    }

    private static void y(class_310 class_3102, class_4184 class_41842) {
        if (!(class_3102.field_1687 instanceof class_638)) {
            a.set(0.0f, 1.0f, 0.0f);
            b.set(0.0f, -1.0f, 0.0f);
            return;
        }
        float f2 = class_3102.method_61966().method_60637(false);
        class_12202 class_122022 = class_41842.method_75756();
        float f3 = ((Float)class_122022.method_75689(class_12206.field_64340, f2)).floatValue();
        float f4 = ((Float)class_122022.method_75689(class_12206.field_64341, f2)).floatValue();
        K.z((float)Math.toRadians(f3), a);
        K.z((float)Math.toRadians(f4), b);
    }

    private static void z(float f2, Vector3f vector3f) {
        a.rotationY((float)Math.toRadians(-90.0)).rotateX(f2);
        vector3f.set(0.0f, 0.0f, 1.0f);
        a.transform(vector3f);
        if (vector3f.lengthSquared() < 1.0E-12f) {
            vector3f.set(0.0f, 1.0f, 0.0f);
        } else {
            vector3f.normalize();
        }
    }

    private static void A(class_310 class_3102, Matrix4f matrix4f) {
        matrix4f.set((Matrix4fc)cZ.b);
        if (K.B(matrix4f)) {
            return;
        }
        float f2 = ((Integer)class_3102.field_1690.method_41808().method_41753()).floatValue();
        matrix4f.set((Matrix4fc)class_3102.field_1773.method_22973(f2));
    }

    private static boolean B(Matrix4f matrix4f) {
        return matrix4f.m00() != 0.0f || matrix4f.m11() != 0.0f || matrix4f.m22() != 0.0f || matrix4f.m33() != 0.0f;
    }

    public static void shutdown() {
        K.C();
        k = -1;
        a = false;
    }

    private static void C() {
        if (n >= 0) {
            GL30.glDeleteVertexArrays((int)n);
            n = -1;
        }
        if (l >= 0) {
            GL15.glDeleteBuffers((int)l);
            l = -1;
        }
        if (a >= 0) {
            GL20.glDeleteProgram((int)a);
            a = -1;
        }
    }

    private static void D() {
        if (a >= 0 && k == 14) {
            return;
        }
        K.C();
        int n2 = K.E(35633, p, m);
        int n3 = K.E(35632, g, f);
        a = GL20.glCreateProgram();
        GL20.glAttachShader((int)a, (int)n2);
        GL20.glAttachShader((int)a, (int)n3);
        GL20.glLinkProgram((int)a);
        GL20.glDeleteShader((int)n2);
        GL20.glDeleteShader((int)n3);
        if (GL20.glGetProgrami((int)a, (int)35714) == 0) {
            String string = GL20.glGetProgramInfoLog((int)a);
            throw new IllegalStateException("Space sky program link failed: " + string);
        }
        r = GL20.glGetUniformLocation((int)a, (CharSequence)j);
        q = GL20.glGetUniformLocation((int)a, (CharSequence)c);
        o = GL20.glGetUniformLocation((int)a, (CharSequence)r);
        i = GL20.glGetUniformLocation((int)a, (CharSequence)o);
        d = GL20.glGetUniformLocation((int)a, (CharSequence)d);
        j = GL20.glGetUniformLocation((int)a, (CharSequence)h);
        h = GL20.glGetUniformLocation((int)a, (CharSequence)i);
        e = GL20.glGetUniformLocation((int)a, (CharSequence)l);
        b = GL20.glGetUniformLocation((int)a, (CharSequence)s);
        p = GL20.glGetUniformLocation((int)a, (CharSequence)e);
        c = GL20.glGetUniformLocation((int)a, (CharSequence)n);
        m = GL20.glGetUniformLocation((int)a, (CharSequence)a);
        g = GL20.glGetUniformLocation((int)a, (CharSequence)b);
        K.F();
        float[] fArray = new float[]{-1.0f, -1.0f, 3.0f, -1.0f, -1.0f, 3.0f};
        n = GL30.glGenVertexArrays();
        l = GL15.glGenBuffers();
        GL30.glBindVertexArray((int)n);
        GL15.glBindBuffer((int)34962, (int)l);
        FloatBuffer floatBuffer = BufferUtils.createFloatBuffer((int)fArray.length);
        floatBuffer.put(fArray).flip();
        GL15.glBufferData((int)34962, (FloatBuffer)floatBuffer, (int)35044);
        GL20.glVertexAttribPointer((int)0, (int)2, (int)5126, (boolean)false, (int)8, (long)0L);
        GL20.glEnableVertexAttribArray((int)0);
        GL30.glBindVertexArray((int)0);
        k = 14;
    }

    private static int E(int n2, String string, String string2) {
        int n3 = GL20.glCreateShader((int)n2);
        GL20.glShaderSource((int)n3, (CharSequence)string);
        GL20.glCompileShader((int)n3);
        if (GL20.glGetShaderi((int)n3, (int)35713) == 0) {
            String string3 = GL20.glGetShaderInfoLog((int)n3);
            GL20.glDeleteShader((int)n3);
            throw new IllegalStateException("Space sky " + string2 + " shader compile failed: " + string3);
        }
        return n3;
    }

    private static void F() {
        K.G(r, j);
        K.G(q, c);
        K.G(o, r);
        K.G(i, o);
        K.G(d, d);
        K.G(j, h);
        K.G(h, i);
        K.G(e, l);
        K.G(b, s);
        K.G(p, e);
        K.G(c, n);
        K.G(m, a);
        K.G(g, b);
    }

    private static void G(int n2, String string) {
        if (n2 < 0) {
            throw new IllegalStateException("Space sky uniform is missing: " + string);
        }
    }

    static {
        p = gj.decode("rlArsNKDCKa7eij/BZMw9PjQGOu5LcIB3pUEd+CxWZw4yG9iaxVJIWOuGtCYiBqmu6vDtCc1g3FcoJ424uvjy0ItyMqOh6gQdjZUHfYiJiteMn4c2f1Bj60M1853RbYh1aZN+LLtyK4zUs+TcWFXq2ok6QsqhinS0VHLbyA2QDkli6X7B8SFjWJvaeXOkDGUR8Z8BU8eK/IkTdXsoxV0avXHvom6yYvvZXNVVg==", 2135082234);
        g = gj.decode("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", -1450049890);
        m = gj.decode("lvnuCAmx", -1756447806);
        f = gj.decode("aslpOoODXGE=", -1382027139);
        j = gj.decode("YLF/XxaMZnKDk7fsGHZPCPjXQ14aCnorOju0CLk=", 100745348);
        c = gj.decode("oaDrjuLFG2t5", -2002075111);
        r = gj.decode("uQFKkZM=", 1114326562);
        o = gj.decode("UuFigWJgxQ==", 47429609);
        d = gj.decode("VAotyblKxxQ=", 2087383599);
        h = gj.decode("ysBTg3tC1Q==", -173045710);
        i = gj.decode("QqZrXhw=", -1620123982);
        l = gj.decode("p54P+gC97dTv7c1D", -1847519688);
        s = gj.decode("HxwcTUDcX60=", 468202940);
        e = gj.decode("Al04uU421Rs=", -1360455585);
        n = gj.decode("xXiAPHidDTnc9A==", 1774242772);
        a = gj.decode("6xKtIcFf", -711142512);
        b = gj.decode("6wW9LRAd7NLo", -315771240);
        k = p;
        q = g;
        k = -1;
        a = -1;
        n = -1;
        l = -1;
        r = -1;
        q = -1;
        o = -1;
        i = -1;
        d = -1;
        j = -1;
        h = -1;
        e = -1;
        b = -1;
        p = -1;
        c = -1;
        m = -1;
        g = -1;
        a = new Matrix4f();
        c = new Matrix4f();
        b = new Matrix4f();
        a = new Quaternionf();
        a = new Vector3f();
        b = new Vector3f();
        a = System.nanoTime();
    }
}

