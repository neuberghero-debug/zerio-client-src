/*
 * Decompiled with CFR 0.152.
 */
package dev.jnic.KERseB;

import dev.jnic.KERseB.q;
import dev.jnic.KERseB.s;

final class v
extends s {
    private /* synthetic */ q T;

    private v(q q2) {
        this.T = q2;
    }

    final int c(int n2) {
        if (this.T.O.a(this.H, 0) == 0) {
            return this.T.O.a(this.I[n2]) + 2;
        }
        if (this.T.O.a(this.H, 1) == 0) {
            return this.T.O.a(this.J[n2]) + 2 + 8;
        }
        return this.T.O.a(this.K) + 2 + 8 + 8;
    }

    /* synthetic */ v(q q2, byte by2) {
        this(q2);
    }
}

