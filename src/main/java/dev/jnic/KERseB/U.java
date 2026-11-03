/*
 * Decompiled with CFR 0.152.
 */
package dev.jnic.KERseB;

import dev.jnic.KERseB.V;
import java.util.Arrays;

abstract class U {
    final int v;
    final int[] w = new int[4];
    final V x = new V();
    final short[][] y = new short[12][16];
    final short[] z = new short[12];
    final short[] A = new short[12];
    final short[] B = new short[12];
    final short[] C = new short[12];
    final short[][] D = new short[12][16];
    final short[][] E = new short[4][64];
    final short[][] F = new short[][]{new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};
    final short[] G = new short[16];

    U(int n2) {
        this.v = (1 << n2) - 1;
    }

    void c() {
        int n2;
        this.w[0] = 0;
        this.w[1] = 0;
        this.w[2] = 0;
        this.w[3] = 0;
        this.x.S = 0;
        for (n2 = 0; n2 < this.y.length; ++n2) {
            Arrays.fill(this.y[n2], (short)1024);
        }
        Arrays.fill(this.z, (short)1024);
        Arrays.fill(this.A, (short)1024);
        Arrays.fill(this.B, (short)1024);
        Arrays.fill(this.C, (short)1024);
        for (n2 = 0; n2 < this.D.length; ++n2) {
            Arrays.fill(this.D[n2], (short)1024);
        }
        for (n2 = 0; n2 < this.E.length; ++n2) {
            Arrays.fill(this.E[n2], (short)1024);
        }
        for (n2 = 0; n2 < this.F.length; ++n2) {
            Arrays.fill(this.F[n2], (short)1024);
        }
        Arrays.fill(this.G, (short)1024);
    }
}

