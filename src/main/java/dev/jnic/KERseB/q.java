/*
 * Decompiled with CFR 0.152.
 */
package dev.jnic.KERseB;

import dev.jnic.KERseB.J;
import dev.jnic.KERseB.U;
import dev.jnic.KERseB.V;
import dev.jnic.KERseB.W;
import dev.jnic.KERseB.f;
import dev.jnic.KERseB.h;
import dev.jnic.KERseB.l;
import dev.jnic.KERseB.v;

public final class q
extends U {
    private l c;
    final W O;
    private final J P;
    private final v Q = new v(this, 0);
    private final v R = new v(this, 0);

    public q(l l2, W w2, int n2, int n3, int n4) {
        super(n4);
        this.c = l2;
        this.O = w2;
        this.P = new J(this, n2, n3);
        this.c();
    }

    @Override
    public final void c() {
        super.c();
        this.P.c();
        this.Q.c();
        this.R.c();
    }

    public final void d() {
        l l2 = this.c;
        if (l2.s > 0) {
            l l3 = l2;
            l3.a(l3.t, l2.s);
        }
        while (true) {
            int n2;
            block20: {
                q q2;
                int n3;
                block22: {
                    int n4;
                    block21: {
                        int n5;
                        block19: {
                            int n6;
                            int n7;
                            l2 = this.c;
                            if (!(l2.p < l2.r)) break;
                            n5 = this.c.p & this.v;
                            if (this.O.a(this.y[this.x.S], n5) == 0) {
                                J j2 = this.P;
                                int n8 = j2.T.c.p;
                                int n9 = j2.T.c.b(0);
                                Object object = j2;
                                int n10 = n9 >> 8 - ((f)object).L;
                                n7 = (n8 & ((f)object).M) << ((f)object).L;
                                n9 = n10 + n7;
                                object = j2.U[n9];
                                n9 = 1;
                                if (((h)object).V.T.x.S < 7) {
                                    while ((n9 = n9 << 1 | ((h)object).V.T.O.a(((h)object).N, n9)) < 256) {
                                    }
                                } else {
                                    n8 = ((h)object).V.T.c.b(((h)object).V.T.w[0]);
                                    n10 = 256;
                                    do {
                                        n7 = (n8 <<= 1) & n10;
                                        n6 = ((h)object).V.T.O.a(((h)object).N, n10 + n7 + n9);
                                        n9 = n9 << 1 | n6;
                                        n10 &= 0 - n6 ^ ~n7;
                                    } while (n9 < 256);
                                }
                                byte by2 = (byte)n9;
                                l l4 = ((h)object).V.T.c;
                                l4.m[l4.p++] = by2;
                                if (l4.q < l4.p) {
                                    l4.q = l4.p;
                                }
                                V v2 = ((h)object).V.T.x;
                                if (v2.S <= 3) {
                                    v2.S = 0;
                                    continue;
                                }
                                if (v2.S <= 9) {
                                    v2.S -= 3;
                                    continue;
                                }
                                v2.S -= 6;
                                continue;
                            }
                            if (this.O.a(this.z, this.x.S) != 0) break block19;
                            n3 = n5;
                            q q3 = this;
                            q3.x.S = q3.x.S < 7 ? 7 : 10;
                            q3.w[3] = q3.w[2];
                            q3.w[2] = q3.w[1];
                            q3.w[1] = q3.w[0];
                            int n11 = q3.Q.c(n3);
                            int n12 = n11;
                            if ((n3 = q3.O.a(q3.E[n12 < 6 ? n12 - 2 : 3])) < 4) {
                                q3.w[0] = n3;
                            } else {
                                int n13 = (n3 >> 1) - 1;
                                q3.w[0] = (2 | n3 & 1) << n13;
                                if (n3 < 14) {
                                    q3.w[0] = q3.w[0] | q3.O.b(q3.F[n3 - 4]);
                                } else {
                                    int n14 = q3.w[0];
                                    n7 = n13 - 4;
                                    W w2 = q3.O;
                                    n6 = 0;
                                    do {
                                        w2.e();
                                        w2.W >>>= 1;
                                        n3 = w2.X - w2.W >>> 31;
                                        w2.X -= w2.W & n3 - 1;
                                        n6 = n6 << 1 | 1 - n3;
                                    } while (--n7 != 0);
                                    q3.w[0] = n14 | n6 << 4;
                                    q3.w[0] = q3.w[0] | q3.O.b(q3.G);
                                }
                            }
                            n2 = n11;
                            break block20;
                        }
                        n3 = n5;
                        q2 = this;
                        if (q2.O.a(q2.A, q2.x.S) != 0) break block21;
                        if (q2.O.a(q2.D[q2.x.S], n3) != 0) break block22;
                        q2.x.S = q2.x.S < 7 ? 9 : 11;
                        n2 = 1;
                        break block20;
                    }
                    if (q2.O.a(q2.B, q2.x.S) == 0) {
                        n4 = q2.w[1];
                    } else {
                        if (q2.O.a(q2.C, q2.x.S) == 0) {
                            n4 = q2.w[2];
                        } else {
                            n4 = q2.w[3];
                            q2.w[3] = q2.w[2];
                        }
                        q2.w[2] = q2.w[1];
                    }
                    q2.w[1] = q2.w[0];
                    q2.w[0] = n4;
                }
                q2.x.S = q2.x.S < 7 ? 8 : 11;
                n2 = q2.R.c(n3);
            }
            int n15 = n2;
            this.c.a(this.w[0], n15);
        }
        this.O.e();
    }
}

