/*
 * Decompiled with CFR 0.152.
 */
package dev.jnic.KERseB;

import dev.jnic.KERseB.f;
import dev.jnic.KERseB.h;
import dev.jnic.KERseB.q;

final class J
extends f {
    final h[] U;
    final /* synthetic */ q T;

    J(q q2, int n2, int n3) {
        this.T = q2;
        super(n2, n3);
        this.U = new h[1 << n2 + n3];
        for (int i2 = 0; i2 < this.U.length; ++i2) {
            this.U[i2] = new h(this, 0);
        }
    }

    final void c() {
        for (int i2 = 0; i2 < this.U.length; ++i2) {
            this.U[i2].c();
        }
    }
}

