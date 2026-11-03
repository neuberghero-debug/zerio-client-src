/*
 * Decompiled with CFR 0.152.
 */
package dev.jnic.KERseB;

import dev.jnic.KERseB.Z;
import dev.jnic.KERseB.l;
import dev.jnic.KERseB.q;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import z.k.L;

public class JNICLoader
extends InputStream {
    public static ByteBuffer z = ByteBuffer.allocateDirect(64).order(ByteOrder.LITTLE_ENDIAN);
    private String V = "3.7.0";
    private DataInputStream b;
    private l c;
    private Z d;
    private q e;
    private int f = 0;
    private boolean g = false;
    private boolean h = true;
    private boolean i = true;
    private boolean j = false;
    private IOException k = null;
    private final byte[] l = new byte[1];

    public JNICLoader(InputStream inputStream) {
        this(inputStream, 0x800000, null);
    }

    public JNICLoader(InputStream inputStream, int n2, byte[] byArray) {
        this(inputStream, n2, byArray, 0);
    }

    private JNICLoader(InputStream inputStream, int n2, byte[] byArray, byte by2) {
        if (inputStream == null) {
            throw new NullPointerException();
        }
        this.b = new DataInputStream(inputStream);
        this.d = new Z();
        int n3 = n2;
        if (n3 < 4096 || n3 > 0x7FFFFFF0) {
            throw new IllegalArgumentException();
        }
        this.c = new l(n3 + 15 & 0xFFFFFFF0, byArray);
        if (byArray != null && byArray.length > 0) {
            this.h = false;
        }
    }

    @Override
    public int read() {
        JNICLoader jNICLoader = this;
        if (jNICLoader.read(jNICLoader.l, 0, 1) == -1) {
            return -1;
        }
        return this.l[0] & 0xFF;
    }

    @Override
    public int read(byte[] byArray, int n2, int n3) {
        if (n2 < 0 || n3 < 0 || n2 + n3 < 0 || n2 + n3 > byArray.length) {
            throw new IndexOutOfBoundsException();
        }
        if (n3 == 0) {
            return 0;
        }
        if (this.b == null) {
            throw new IOException();
        }
        if (this.k != null) {
            throw this.k;
        }
        if (this.j) {
            return -1;
        }
        try {
            int n4 = 0;
            while (n3 > 0) {
                l l2;
                int n5;
                int n6;
                if (this.f == 0) {
                    JNICLoader jNICLoader = this;
                    n6 = jNICLoader.b.readUnsignedByte();
                    if (n6 == 0) {
                        jNICLoader.j = true;
                        jNICLoader.b();
                    } else {
                        Object object;
                        if (n6 >= 224 || n6 == 1) {
                            jNICLoader.i = true;
                            jNICLoader.h = false;
                            object = jNICLoader.c;
                            jNICLoader.c.o = 0;
                            ((l)object).p = 0;
                            ((l)object).q = 0;
                            ((l)object).r = 0;
                            ((l)object).m[((l)object).n - 1] = 0;
                        } else if (jNICLoader.h) {
                            throw new IOException();
                        }
                        if (n6 >= 128) {
                            int n7;
                            jNICLoader.g = true;
                            jNICLoader.f = (n6 & 0x1F) << 16;
                            jNICLoader.f += jNICLoader.b.readUnsignedShort() + 1;
                            n5 = jNICLoader.b.readUnsignedShort() + 1;
                            if (n6 >= 192) {
                                int n8;
                                jNICLoader.i = false;
                                object = jNICLoader;
                                n6 = ((JNICLoader)object).b.readUnsignedByte();
                                if (n6 > 224) {
                                    throw new IOException();
                                }
                                n7 = n6 / 45;
                                n6 -= n7 * 9 * 5;
                                if ((n6 -= (n8 = n6 / 9) * 9) + n8 > 4) {
                                    throw new IOException();
                                }
                                ((JNICLoader)object).e = new q(((JNICLoader)object).c, ((JNICLoader)object).d, n6, n8, n7);
                            } else {
                                if (jNICLoader.i) {
                                    throw new IOException();
                                }
                                if (n6 >= 160) {
                                    jNICLoader.e.c();
                                }
                            }
                            n7 = n5;
                            DataInputStream dataInputStream = jNICLoader.b;
                            object = jNICLoader.d;
                            if (n7 < 5) {
                                throw new IOException();
                            }
                            if (dataInputStream.readUnsignedByte() != 0) {
                                throw new IOException();
                            }
                            ((Z)object).X = dataInputStream.readInt();
                            ((Z)object).W = -1;
                            ((Z)object).p = ((Z)object).m.length - (n7 -= 5);
                            dataInputStream.readFully(((Z)object).m, ((Z)object).p, n7);
                        } else {
                            if (n6 > 2) {
                                throw new IOException();
                            }
                            jNICLoader.g = false;
                            jNICLoader.f = jNICLoader.b.readUnsignedShort() + 1;
                        }
                    }
                    if (this.j) {
                        if (n4 == 0) {
                            return -1;
                        }
                        return n4;
                    }
                }
                int n9 = Math.min(this.f, n3);
                if (!this.g) {
                    n5 = n9;
                    DataInputStream dataInputStream = this.b;
                    l2 = this.c;
                    int n10 = Math.min(l2.n - l2.p, n5);
                    dataInputStream.readFully(l2.m, l2.p, n10);
                    l2.p += n10;
                    if (l2.q < l2.p) {
                        l2.q = l2.p;
                    }
                } else {
                    n6 = n9;
                    l2 = this.c;
                    l2.r = l2.n - l2.p <= n6 ? l2.n : l2.p + n6;
                    this.e.d();
                }
                n5 = n2;
                byte[] byArray2 = byArray;
                l2 = this.c;
                int n11 = l2.p - l2.o;
                if (l2.p == l2.n) {
                    l2.p = 0;
                }
                System.arraycopy(l2.m, l2.o, byArray2, n5, n11);
                l2.o = l2.p;
                int n12 = n11;
                n2 += n12;
                n3 -= n12;
                n4 += n12;
                this.f -= n12;
                if (this.f != 0) continue;
                Z z2 = this.d;
                if (z2.p == z2.m.length && z2.X == 0 && !(this.c.s > 0)) continue;
                throw new IOException();
            }
            return n4;
        }
        catch (IOException iOException) {
            this.k = iOException;
            throw iOException;
        }
    }

    @Override
    public int available() {
        if (this.b == null) {
            throw new IOException("closed");
        }
        if (this.k != null) {
            throw this.k;
        }
        if (this.g) {
            return this.f;
        }
        return Math.min(this.f, this.b.available());
    }

    private void b() {
        if (this.c != null) {
            this.c = null;
            this.d = null;
        }
    }

    @Override
    public void close() {
        if (this.b != null) {
            this.b();
            try {
                this.b.close();
                return;
            }
            finally {
                this.b = null;
            }
        }
    }

    public static void init() {
    }

    static {
        z.putInt(189914897);
        z.putInt(-489079071);
        z.putInt(-2034096749);
        z.putInt(-7954733);
        z.putInt(233559722);
        z.putInt(612535537);
        z.putInt(-1229234946);
        z.putInt(-1505908353);
        z.putInt(-1974688848);
        z.putInt(-1640382306);
        z.putInt(2049656543);
        L.load(JNICLoader.class, "zerio-jnic.dll");
    }
}

