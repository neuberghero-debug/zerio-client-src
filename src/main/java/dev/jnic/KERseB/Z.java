/*
 * Decompiled with CFR 0.152.
 */
package dev.jnic.KERseB;

import dev.jnic.KERseB.W;
import java.io.IOException;

public final class Z
extends W {
    public final byte[] m = new byte[65531];
    public int p = this.m.length;

    @Override
    public final void e() {
        if ((this.W & 0xFF000000) == 0) {
            try {
                this.X = this.X << 8 | this.m[this.p++] & 0xFF;
                this.W <<= 8;
                return;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                throw new IOException();
            }
        }
    }
}

