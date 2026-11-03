/*
 * Decompiled with CFR 0.152.
 */
package dev.jnic.KERseB;

import java.util.Arrays;

abstract class s {
    final short[] H = new short[2];
    final short[][] I = new short[16][8];
    final short[][] J = new short[16][8];
    final short[] K = new short[256];

    s() {
    }

    final void c() {
        int n2;
        Arrays.fill(this.H, (short)1024);
        for (n2 = 0; n2 < this.I.length; ++n2) {
            Arrays.fill(this.I[n2], (short)1024);
        }
        for (n2 = 0; n2 < this.I.length; ++n2) {
            Arrays.fill(this.J[n2], (short)1024);
        }
        Arrays.fill(this.K, (short)1024);
    }
}

