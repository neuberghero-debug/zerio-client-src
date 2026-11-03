/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.W;
import z.r.ap;
import z.r.dj;
import z.r.fu;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public abstract class hT {
    public boolean d;
    public float e;
    protected final dj b;
    public float f;
    public float g;
    public static final int e;
    protected boolean e;
    protected boolean f;
    private static final int[] c;
    protected final dj c;
    public float h;
    public boolean g;

    private static int b(int n2, int n3) {
        int n4 = 716760926;
        int n5 = 2006130985;
        int n6 = c[n2 ^ ((n5 | n4) ^ 0x9BEED966)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0x7FBBC7D3;
        n6 -= (n5 | n4) ^ 0x7FBBEDDE;
        n6 += (n5 | n4) ^ 0x7FBB2C05;
        n6 += (n5 | n4) ^ 0x7FBBE740;
        n6 ^= (n5 | n4) ^ 0x7FBB9E53;
        n6 -= (n5 | n4) ^ 0x7FBB935C;
        n6 -= (n5 | n4) ^ 0x7FBBD3C0;
        n6 -= (n5 | n4) ^ 0x7FBB9E78;
        return n6 -= (n5 | n4) ^ 0x7FBB68B5;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block10: {
            break block10;
            {
                var0_1 ^= 413075104;
                var0_1 ^= 1622010211;
                var0_1 ^= -295702672;
                var0_1 ^= 1295778954;
                v0 = ((var0_1 ^= 159267237) | -1617871189) ^ 463041071 ^ hT.e;
                var0_1 ^= 1758562525;
                hT.c[v1] = ((v2[v3] & 255) << 24 | ((v2[v3 + 1] & 255) << 16 | ((v2[v3 + 2] & 255) << 8 | v2[v3 + 3] & 255))) ^ v0;
                v1 = v1 + 1;
                v4 = v3 + 4;
                v2 = v2;
                v3 = v4;
                var0_1 ^= -98284427;
                if (v4 >= v2.length) {
                    var0_1 ^= 468228710;
                    return;
                }
lbl32:
                // 3 sources

                while (true) {
                    var0_1 ^= -751104130;
                    var0_1 ^= -1813907894;
                    continue block5;
                    break;
                }
            }
lbl36:
            // 1 sources

            while (true) {
                var0_1 ^= -393799559;
                hT.c = new int[4];
                var0_1 ^= -1951504624;
                v2 = "\u00cd\u00a5\u009fL\u00aerhB\u00e3\u00d7\u00c5u\u00c5{ep".getBytes("ISO-8859-1");
                ** continue;
                break;
            }
        }
        hT.e = mK.a(MethodHandles.lookup().lookupClass(), -1017447313);
        var1 = 0;
        var0_1 = 1088807250;
        var1 = -1617871189 ^ 845129044;
        while (true) {
            switch (var1) {
                case -1378968577: {
                    var1 = -1617871189 ^ 729837625;
                    break;
                }
                case -509943343: {
                    v1 = 0;
                    v3 = 0;
                    ** continue;
                }
                case -1273934190: {
                    var0_1 ^= var1 ^ 966358546;
                    var1 = -1617871189 ^ 2114707322;
                }
            }
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public hT() {
        int n2 = 1583786848;
        int n3 = e & 0x5E66AB60 ^ 0xF4F854AB;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x3734250D;
        n5 ^= 0x38F84301;
        n4 = (n3 | n2) ^ 0x172B2612;
        block10: while (true) {
            switch (n4) {
                default: {
                    continue block10;
                }
                case 893442540: {
                    this.d = true;
                    n4 = (n3 | n2) ^ 0xCD1D4452;
                    continue block10;
                }
                case 1210021671: {
                    this.c = new dj(0.0f);
                    n4 = (n3 | n2) ^ 0x8FE4D6DA;
                    continue block10;
                }
                case -870244868: {
                    n5 ^= n4 ^ 0xAAC15809;
                    n4 = (n3 | n2) ^ 0xB6E188CC;
                    continue block10;
                }
                case 1897539889: {
                    n5 ^= n4 ^ 0x69448F60;
                    n4 = (n3 | n2) ^ 0xA170685C;
                    continue block10;
                }
                case -2119515704: {
                    this.g = true;
                    n4 = (n3 | n2) ^ 0x32DFE217;
                    continue block10;
                }
                case -371860999: {
                    n5 ^= n4 ^ 0xC02A4693;
                    n4 = (n3 | n2) ^ 0xCBBE2607;
                    continue block10;
                }
                case 870562745: {
                    n5 ^= n4 ^ 0xB263F3D2;
                    n4 = (n3 | n2) ^ 0x7F543E23;
                    continue block10;
                }
                case 1603180471: 
            }
            break;
        }
        this.b = new dj(0.0f);
    }

    /*
     * Exception decompiling
     */
    public void frame(float var1_1, float var2_2, float var3_3, float var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     */
    public boolean contains(double var1_1, double var3_2) {
        block36: {
            block37: {
                block34: {
                    block35: {
                        block33: {
                            var8_3 = -1580269204;
                            var5_4 = hT.e & -1580269204 ^ 1176262806;
                            var7_5 = 0;
                            ** GOTO lbl60
lbl5:
                            // 1 sources

                            while (true) {
                                var7_5 = (var5_4 | var8_3) ^ -814892045;
                                ** GOTO lbl25
lbl8:
                                // 1 sources

                                while (var3_2 < (double)(this.h + this.f)) {
                                    break block33;
lbl10:
                                    // 1 sources

                                    while (true) {
                                        var7_5 = (var5_4 | var8_3) ^ 399868790;
                                        ** GOTO lbl25
                                        break;
                                    }
                                }
                                break block34;
                                break;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                var7_5 = (var5_4 | var8_3) ^ -369199819;
                                ** GOTO lbl25
                                break;
                            }
                        }
                        var7_5 = (var5_4 | var8_3) ^ 1199647319;
                        ** GOTO lbl25
lbl20:
                        // 1 sources

                        while (true) {
                            v0 = false;
                            break block35;
                            break;
                        }
lbl23:
                        // 1 sources

                        block22: while (true) {
                            var7_5 = (var5_4 | var8_3) ^ 61898825;
lbl25:
                            // 11 sources

                            block23: while (true) {
                                switch (var7_5) lbl-1000:
                                // 5 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block23;
                                        }
                                        break;
                                    }
                                    case -597639112: {
                                        ** GOTO lbl8
                                    }
                                    case -1957854941: {
                                        ** continue;
                                    }
                                    case -830769032: {
                                        ** continue;
                                    }
                                    case -1240869929: {
                                        break;
                                    }
lbl38:
                                    // 1 sources

                                    while (true) {
                                        var7_5 = (var5_4 | var8_3) ^ 1002412486;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl41:
                                    // 1 sources

                                    return v0;
                                    case -1563683883: {
                                        ** continue;
                                    }
                                    case -1397219062: {
                                        if (!(var1_1 < (double)(this.e + this.g))) break block34;
                                        break block36;
                                    }
                                    case 58262184: {
                                        v0 = true;
                                        break block22;
                                    }
lbl51:
                                    // 1 sources

                                    while (true) {
                                        var7_5 = (var5_4 | var8_3) ^ -458859690;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case -462431817: {
                                        var6_6 ^= var7_5 ^ -1073245389;
                                        ** continue;
                                    }
lbl57:
                                    // 1 sources

                                    while (true) {
                                        var7_5 = (var5_4 | var8_3) ^ 698622342;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl60:
                                    // 1 sources

                                    var6_6 = (var5_4 | var8_3) ^ -877315291;
                                    ** continue;
lbl62:
                                    // 1 sources

                                    while (true) {
                                        var7_5 = (var5_4 | var8_3) ^ 926843375;
                                        ** continue;
                                        break;
                                    }
                                    case 682811917: {
                                        if (this.d) {
                                            ** continue;
                                        }
                                        break block34;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                    }
                    var6_6 ^= -1280443922;
                    ** while (true)
lbl72:
                    // 1 sources

                    while (true) {
                        var7_5 = (var5_4 | var8_3) ^ 1158892075;
                        ** GOTO lbl25
                        break;
                    }
                    {
                        case -1003449590: {
                            var6_6 ^= var7_5 ^ 101627236;
                            break;
                        }
                        case -790505455: {
                            break block37;
                        }
                    }
                    var7_5 = (var5_4 | var8_3) ^ 1821563101;
                    ** GOTO lbl25
                }
lbl83:
                // 3 sources

                while (true) {
                    var7_5 = (var5_4 | var8_3) ^ 602917620;
                    ** GOTO lbl25
                    break;
                }
            }
            var7_5 = (var5_4 | var8_3) ^ 1265072372;
            ** GOTO lbl25
            {
                case 237055179: {
                    ** continue;
                }
                case -1604422743: {
                    var6_6 ^= var7_5 ^ 1650480583;
                    ** continue;
                }
                case -267724152: {
                    if (!(var1_1 >= (double)this.e)) ** GOTO lbl83
                    ** continue;
                }
            }
            var7_5 = (var5_4 | var8_3) ^ 2017370198;
            ** GOTO lbl25
            {
                ** case -1612580440:
            }
lbl100:
            // 1 sources

            if (var3_2 >= (double)this.h) ** break;
            ** while (true)
            ** while (true)
        }
        var7_5 = (var5_4 | var8_3) ^ 1373014569;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public final void render(W var1_1) {
        block52: {
            var6_2 = -171340420;
            var3_3 = hT.e & -171340420 ^ -83832913;
            var5_4 = 0;
            var4_6 = (var3_3 | var6_2) ^ -353118202;
            var5_4 = (var3_3 | var6_2) ^ -2118966984;
            break block52;
lbl7:
            // 2 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ -905891167;
                break block52;
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ -1621637964;
                ** GOTO lbl124
                break;
            }
lbl13:
            // 2 sources

            while (true) {
                var4_6 ^= 1078297995;
                v0 = var2_5 == false ? hT.b(((var4_6 ^= 242710715) | var6_2) ^ 330989927, (var3_3 | var6_2) ^ ((var4_6 | var6_2) ^ 1931972751)) : hT.b(((var4_6 ^= 242710715) | var6_2) ^ 330989926, (var3_3 | var6_2) ^ ((var4_6 | var6_2) ^ 284189766));
                var4_6 ^= -713302054;
                this.c.to(v1, v0);
                ** continue;
                break;
            }
        }
        block40: while (true) {
            switch (var5_4) {
                case 1242977300: {
                    var4_6 ^= var5_4 ^ -1940226666;
                    var5_4 = (var3_3 | var6_2) ^ -608718276;
                    continue block40;
                }
                case 2121985735: {
                    var5_4 = (var3_3 | var6_2) ^ 1555750647;
                    continue block40;
                }
                case -276891003: {
                    ** GOTO lbl68
                }
                case 1062952493: {
                    v2 = true;
                    ** GOTO lbl64
                }
                case 1627237074: {
                    var4_6 ^= var5_4 ^ -1434006905;
                    var5_4 = (var3_3 | var6_2) ^ -459388227;
                    continue block40;
                }
                case 612269507: {
                    if (!this.isFocusable()) ** GOTO lbl7
                    ** break;
                }
                case -892176508: {
                    var4_6 ^= var5_4 ^ -787064442;
                    ** break;
                }
lbl45:
                // 1 sources

                var5_4 = (var3_3 | var6_2) ^ -1622420111;
                ** GOTO lbl77
                case 1343490299: {
                    var4_6 ^= var5_4 ^ 1271932665;
                    var5_4 = (var3_3 | var6_2) ^ 1826975197;
                    ** GOTO lbl77
                }
lbl51:
                // 1 sources

                var5_4 = (var3_3 | var6_2) ^ -1064136238;
                continue block40;
                case 742292427: {
                    if (!this.g) ** GOTO lbl83
                    ** GOTO lbl85
                }
                case -1378764677: {
                    var1_1.a.register(this);
                    ** continue;
                }
                case 1619139214: {
                    var5_4 = (var3_3 | var6_2) ^ 1377335172;
                    continue block40;
                }
                case -1825791454: {
                    v2 = false;
lbl64:
                    // 2 sources

                    var4_6 ^= -650766938;
                    var2_5 = v2;
                    var5_4 = (var3_3 | var6_2) ^ -1183025293;
                    ** GOTO lbl124
                }
lbl68:
                // 1 sources

                var5_4 = (var3_3 | var6_2) ^ -2025339789;
                continue block40;
                case -1552740088: {
                    var4_6 ^= var5_4 ^ -1179999395;
                    var5_4 = (var3_3 | var6_2) ^ -492734589;
                    continue block40;
                }
                case 493402236: {
                    if (!this.d) ** GOTO lbl79
                    var5_4 = (var3_3 | var6_2) ^ -1243636757;
                }
lbl77:
                // 5 sources

                default: {
                    continue block40;
                }
lbl79:
                // 1 sources

                var5_4 = (var3_3 | var6_2) ^ -1623956179;
                continue block40;
                case 2022574988: {
                    if (this.contains(var1_1.c, var1_1.d)) ** GOTO lbl87
lbl83:
                    // 2 sources

                    var5_4 = (var3_3 | var6_2) ^ -1344420092;
                    ** GOTO lbl77
                }
lbl85:
                // 1 sources

                var5_4 = (var3_3 | var6_2) ^ 280442234;
                continue block40;
lbl87:
                // 1 sources

                var5_4 = (var3_3 | var6_2) ^ 891009147;
                continue block40;
                case 902364510: {
                    var4_6 ^= var5_4 ^ 542597035;
                    var5_4 = (var3_3 | var6_2) ^ -738741196;
                    continue block40;
                }
                while (true) {
                    var4_6 ^= -1676685341;
                    v1 = 0.0f;
                    ** GOTO lbl13
                    break;
                }
lbl97:
                // 1 sources

                while (true) {
                    var5_4 = (var3_3 | var6_2) ^ -482022905;
                    if (true) ** GOTO lbl124
                    break;
                }
                case 458720578: 
            }
            break;
        }
        return;
        while (true) {
            var5_4 = (var3_3 | var6_2) ^ 1991321748;
            ** GOTO lbl124
lbl105:
            // 1 sources

            while (true) {
                var5_4 = (var3_3 | var6_2) ^ 775371635;
                if (true) ** GOTO lbl124
                break;
            }
            block46: while (true) {
                var5_4 = (var3_3 | var6_2) ^ -747640531;
                if (true) ** GOTO lbl124
                block47: while (true) {
                    block53: {
                        var5_4 = (var3_3 | var6_2) ^ 1453384672;
                        break block53;
lbl114:
                        // 4 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ 73105014;
                            break block53;
                            break;
                        }
lbl117:
                        // 1 sources

                        while (true) {
                            var5_4 = (var3_3 | var6_2) ^ 1088088764;
                            break block53;
                            break;
                        }
lbl120:
                        // 1 sources

                        while (true) {
                            var4_6 ^= -1676685341;
                            v1 = 1.0f;
                            ** continue;
                            break;
                        }
                    }
                    block51: while (true) {
                        switch (var5_4) {
                            default: {
                                continue block51;
                            }
                            case 749086418: {
                                if (var2_5 == this.e) ** GOTO lbl114
                                var5_4 = (var3_3 | var6_2) ^ 592403628;
                                continue block51;
                            }
                            case -328027972: {
                                var5_4 = (var3_3 | var6_2) ^ 406174678;
                                continue block51;
                            }
                            case -1452725217: {
                                if (!var2_5) ** GOTO lbl114
                                ** continue;
                            }
                            case -771820404: {
                                var5_4 = (var3_3 | var6_2) ^ -1030277254;
                                continue block51;
                            }
                            case -402885591: {
                                fu.play(ap.r);
                                ** GOTO lbl114
                            }
                            case 1029634181: {
                                if (this.playsHoverSound()) ** break;
                                ** continue;
                                var5_4 = (var3_3 | var6_2) ^ 331054915;
                                continue block51;
                            }
                            case 280137756: {
                                this.draw(var1_1);
                                ** continue;
                            }
                            case -595160237: {
                                var4_6 ^= var5_4 ^ -1380685725;
                                var5_4 = (var3_3 | var6_2) ^ -1566381845;
                                continue block51;
                            }
                            case -505687616: {
                                if (!var2_5) ** continue;
                                ** continue;
                            }
                            case 1620970315: {
                                var4_6 ^= var5_4 ^ -319866760;
                                continue block47;
                            }
                            case -74272375: {
                                var4_6 ^= var5_4 ^ -1599769268;
                                var5_4 = (var3_3 | var6_2) ^ -277127197;
                                continue block51;
                            }
                            case -1089264317: {
                                var4_6 ^= var5_4 ^ -181666895;
                                ** continue;
                            }
                            case 1186314380: {
                                var4_6 ^= var5_4 ^ 1117420033;
                                continue block46;
                            }
                            case -1988565141: {
                                var4_6 ^= var5_4 ^ 1937621601;
                                var5_4 = (var3_3 | var6_2) ^ 504503871;
                                continue block51;
                            }
                            case 479012344: {
                                return;
                            }
                            case 1567303444: 
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            this.e = var2_5;
        }
    }

    protected abstract void draw(W var1);

    /*
     * Enabled aggressive block sorting
     */
    public boolean isFocusable() {
        int n2 = e & 0x228EDC88 ^ 0x6FB814B7;
        int n3 = 0;
        int n4 = (n2 | 0x228EDC88) ^ 0x104F1C55;
        n3 = (n2 | 0x228EDC88) ^ 0x26B54184;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1656045734: {
                    return false;
                }
                case -1244894383: {
                    n4 ^= n3 ^ 0x9B09AD1;
                    n3 = (n2 | 0x228EDC88) ^ 0xF2F463E5;
                    continue block5;
                }
                case 1225497915: 
            }
            n3 = (n2 | 0x228EDC88) ^ 0xDA72B7EE;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onFocusChanged(boolean bl2) {
        int n2 = e & 0xBA13BD2C ^ 0xAB7672DB;
        int n3 = 0;
        int n4 = (n2 | 0xBA13BD2C) ^ 0xDFE4C6DE;
        n3 = (n2 | 0xBA13BD2C) ^ 0x21C649FE;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1699629567: {
                    n3 = (n2 | 0xBA13BD2C) ^ 0x3AED5389;
                    continue block5;
                }
                case 1099589021: {
                    return;
                }
                case -2120569738: 
            }
            n4 ^= n3 ^ 0x5F0A425E;
            n3 = (n2 | 0xBA13BD2C) ^ 0xFAFD9A62;
        }
    }

    /*
     * Unable to fully structure code
     */
    protected final void requestFocus(W var1_1) {
        block15: {
            block14: {
                block13: {
                    break block15;
lbl1:
                    // 1 sources

                    while (true) {
                        var3_5 ^= var4_4 ^ -1303345590;
                        break block13;
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ 1396824531;
                        break block14;
                        break;
                    }
                }
                var4_4 = (var2_3 | var5_2) ^ -1548671447;
            }
lbl10:
            // 2 sources

            block9: while (true) {
                switch (var4_4) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        default: {
                            continue block9;
                        }
                        break;
                    }
                    case 1700176063: {
                        break block9;
                    }
                    case -14755916: {
                        ** continue;
                    }
                    case 379744394: {
                        return;
                    }
lbl21:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -1602246019;
                        ** GOTO lbl-1000
                        break;
                    }
                    case -442760412: {
                        var3_5 ^= var4_4 ^ 1233093000;
                        ** continue;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        var4_4 = (var2_3 | var5_2) ^ -745833912;
                        ** continue;
                        break;
                    }
                }
                break;
            }
            var4_4 = (var2_3 | var5_2) ^ 1237519683;
            ** while (true)
            {
                ** case 359464158:
            }
lbl33:
            // 1 sources

            var1_1.a.focusFromPointer(this);
            ** while (true)
        }
        var5_2 = 916248677;
        var2_3 = hT.e & 916248677 ^ -2100755757;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ -1720731737;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    protected boolean playsHoverSound() {
        int n2 = e & 0xA2C78139 ^ 0xB2D4E2B0;
        int n3 = 0;
        int n4 = (n2 | 0xA2C78139) ^ 0x52359634;
        n3 = (n2 | 0xA2C78139) ^ 0x710FC5D3;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -261966839: {
                    n4 ^= n3 ^ 0xCC5A2C01;
                    n3 = (n2 | 0xA2C78139) ^ 0xD5A0FD6D;
                    continue block5;
                }
                case -1009244566: {
                    n3 = (n2 | 0xA2C78139) ^ 0x42B557B0;
                    continue block5;
                }
                case 1735859924: 
            }
            break;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    protected void setPressed(boolean var1_1) {
        block23: {
            block22: {
                block25: {
                    block21: {
                        block24: {
                            break block24;
lbl1:
                            // 2 sources

                            block9: while (true) {
                                switch (var4_4) lbl-1000:
                                // 5 sources

                                {
                                    while (true) {
                                        default: {
                                            continue block9;
                                        }
                                        break;
                                    }
                                    case -2021155996: {
                                        break;
                                    }
lbl8:
                                    // 1 sources

                                    while (true) {
                                        v0 = 1.0f;
                                        break block21;
                                        break;
                                    }
lbl11:
                                    // 1 sources

                                    while (true) {
                                        v1 = hT.b(((var3_5 ^= -149995150) | var5_2) ^ 984341862, (var2_3 | var5_2) ^ ((var3_5 | var5_2) ^ 413554720));
                                        ** GOTO lbl45
                                        break;
                                    }
lbl14:
                                    // 1 sources

                                    while (true) {
                                        v1 = hT.b(((var3_5 ^= -149995150) | var5_2) ^ 984341863, (var2_3 | var5_2) ^ ((var3_5 | var5_2) ^ 1040905704));
                                        ** GOTO lbl45
                                        break;
                                    }
lbl17:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ -1722758905;
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    case -921992102: {
                                        var3_5 ^= var4_4 ^ -1959029596;
                                        ** continue;
                                    }
lbl23:
                                    // 1 sources

                                    while (true) {
                                        var3_5 ^= 1006282214;
                                        ** GOTO lbl54
                                        break;
                                    }
                                    case 1772892921: {
                                        return;
                                    }
lbl28:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ 844813480;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl31:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = (var2_3 | var5_2) ^ -65243384;
                                        ** GOTO lbl-1000
                                        break;
                                    }
lbl34:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl36:
                                    // 1 sources

                                    while (true) {
                                        ** continue;
                                        break;
                                    }
                                    this.b.to(v0, v1);
                                    var4_4 = (var2_3 | var5_2) ^ 972521380;
                                    ** continue;
                                    case -1765674418: {
                                        this.f = var1_1;
                                        ** continue;
                                    }
lbl45:
                                    // 2 sources

                                    var3_5 ^= -1875918926;
                                    ** continue;
lbl47:
                                    // 1 sources

                                    while (var1_1) {
                                        ** continue;
lbl49:
                                        // 1 sources

                                        ** GOTO lbl36
                                    }
                                    break block22;
                                    case -1029296298: {
                                        var3_5 ^= var4_4 ^ 2109075246;
                                        ** continue;
                                    }
lbl54:
                                    // 1 sources

                                    v0 = 0.0f;
                                    break block21;
                                }
                                var4_4 = (var2_3 | var5_2) ^ 1106147062;
                                continue;
                                {
                                    case -1324184312: {
                                        var3_5 ^= var4_4 ^ -1991210487;
                                        break block23;
                                    }
                                }
                                break;
                            }
                        }
                        var5_2 = -793230568;
                        var2_3 = hT.e & -793230568 ^ -523437058;
                        var4_4 = 0;
                        break block25;
                        {
                            ** case 216042742:
                        }
lbl67:
                        // 1 sources

                        ** while (!var1_1)
lbl68:
                        // 1 sources

                        var3_5 ^= 1006282214;
                        ** while (true)
                    }
                    var3_5 ^= 1613274648;
                    ** GOTO lbl47
                }
                var3_5 = (var2_3 | var5_2) ^ 1161749862;
                var4_4 = (var2_3 | var5_2) ^ 2004574362;
                ** GOTO lbl1
            }
            ** while (true)
        }
        var4_4 = (var2_3 | var5_2) ^ 1715276208;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public boolean mouseDown(W var1_1, double var2_2, double var4_3, int var6_4) {
        block9: {
            var7_5 = hT.e & -189464661 ^ -1880634090;
            var9_6 = 0;
            var8_7 = (var7_5 | -189464661) ^ 2084153966;
            ** GOTO lbl20
lbl5:
            // 1 sources

            block5: while (true) {
                block10: {
                    var9_6 = (var7_5 | -189464661) ^ -2125024873;
                    break block10;
lbl8:
                    // 1 sources

                    return false;
                }
lbl11:
                // 2 sources

                block7: while (true) {
                    switch (var9_6) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block7;
                            }
                            break;
                        }
                        case -627271896: {
                            break block9;
                        }
                        case 2124500520: {
                            ** continue;
                        }
lbl20:
                        // 1 sources

                        var9_6 = (var7_5 | -189464661) ^ 627796119;
                        ** continue;
                        case -1894363009: {
                            var8_7 ^= var9_6 ^ -1205935208;
                            break block5;
                        }
                    }
                    break;
                }
                break;
            }
            ** while (true)
        }
        var9_6 = (var7_5 | -189464661) ^ 1893838784;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean mouseUp(W w2, double d2, double d3, int n2) {
        int n3 = e & 0xBB333816 ^ 0xE799813;
        int n4 = 0;
        int n5 = (n3 | 0xBB333816) ^ 0x7916F23C;
        n4 = (n3 | 0xBB333816) ^ 0x42DDE730;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case 439277718: {
                    n5 ^= n4 ^ 0x453FC991;
                    n4 = (n3 | 0xBB333816) ^ 0xFA609214;
                    continue block5;
                }
                case 1159408131: {
                    return false;
                }
                case -39428313: 
            }
            n4 = (n3 | 0xBB333816) ^ 0xA5556081;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean mouseDrag(W w2, double d2, double d3, int n2, double d4, double d5) {
        int n3 = e & 0x211CF736 ^ 0x19836F49;
        int n4 = 0;
        int n5 = (n3 | 0x211CF736) ^ 0x12EBA660;
        n4 = (n3 | 0x211CF736) ^ 0x1D367876;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case 615089929: {
                    n4 = (n3 | 0x211CF736) ^ 0x4CB0B607;
                    continue block5;
                }
                case -427819695: {
                    return false;
                }
                case 1966033272: 
            }
            n5 ^= n4 ^ 0x8ABE6486;
            n4 = (n3 | 0x211CF736) ^ 0xDFE0022E;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean scroll(W w2, double d2, double d3, double d4) {
        int n2 = e & 0xE7C486A ^ 0xF2A548F7;
        int n3 = 0;
        int n4 = (n2 | 0xE7C486A) ^ 0x8B42B986;
        n3 = (n2 | 0xE7C486A) ^ 0x121C8BDB;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 50569283: {
                    return false;
                }
                case 1855694882: {
                    n4 ^= n3 ^ 0xF3327BC1;
                    n3 = (n2 | 0xE7C486A) ^ 0xFDFEE8BC;
                    continue block5;
                }
                case -320748764: 
            }
            n3 = (n2 | 0xE7C486A) ^ 0x9066E0DD;
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean key(W var1_1, int var2_2, int var3_3) {
        block10: {
            break block10;
lbl1:
            // 1 sources

            while (true) {
                var6_5 = (var4_4 | -433449948) ^ 295301579;
                if (true) ** GOTO lbl6
                break;
            }
            block6: while (true) {
                var6_5 = (var4_4 | -433449948) ^ 624456767;
lbl6:
                // 2 sources

                block7: while (true) {
                    switch (var6_5) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block7;
                            }
                            break;
                        }
                        case -758767471: {
                            var5_6 ^= var6_5 ^ 1795015890;
                            ** continue;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var6_5 = (var4_4 | -433449948) ^ -305464860;
                            ** continue;
                            break;
                        }
                        case 439659850: {
                            continue block6;
                        }
                        case -429415067: 
                    }
                    break;
                }
                break;
            }
            return false;
        }
        var4_4 = hT.e & -433449948 ^ -201568086;
        var6_5 = 0;
        var5_6 = (var4_4 | -433449948) ^ -1154286947;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public boolean charTyped(W var1_1, char var2_2) {
        block24: {
            block26: {
                block25: {
                    break block25;
lbl1:
                    // 1 sources

                    while (true) {
                        var5_5 = (var3_4 | var6_3) ^ 169345171;
                        break block24;
                        break;
                    }
                }
                var6_3 = -618326671;
                var3_4 = hT.e & -618326671 ^ 1542392331;
                var5_5 = 0;
                break block26;
lbl9:
                // 1 sources

                while (true) {
                    var5_5 = (var3_4 | var6_3) ^ 1633963062;
                    break block24;
                    break;
                }
lbl12:
                // 1 sources

                while (true) {
                    var5_5 = (var3_4 | var6_3) ^ -384651806;
                    break block24;
lbl15:
                    // 1 sources

                    while (true) {
                        var4_6 ^= var5_5 ^ 201633328;
                        ** GOTO lbl21
                        break;
                    }
                    break;
                }
lbl18:
                // 1 sources

                while (true) {
                    var5_5 = (var3_4 | var6_3) ^ 57711509;
                    break block24;
lbl21:
                    // 2 sources

                    while (true) {
                        var5_5 = (var3_4 | var6_3) ^ 1330427549;
                        break block24;
                        break;
                    }
                    break;
                }
            }
            var4_6 = (var3_4 | var6_3) ^ 968923740;
            var5_5 = (var3_4 | var6_3) ^ 696110875;
            break block24;
lbl28:
            // 1 sources

            return false;
        }
lbl31:
        // 2 sources

        block21: while (true) {
            switch (var5_5) lbl-1000:
            // 2 sources

            {
                while (true) {
                    default: {
                        continue block21;
                    }
                    break;
                }
                case -225259424: {
                    break block21;
                }
                case -1622713489: {
                    ** continue;
                }
                case -772333592: {
                    ** continue;
                }
                case -1165274291: {
                    ** continue;
                }
                case -2054845555: {
                    ** continue;
                }
                case -1801213466: {
                    switch (var4_6) {
                        case 366880443: {
                            ** continue;
                        }
                        case -1985298512: {
                            ** continue;
                        }
                        ** default:
lbl53:
                        // 1 sources

                        ** continue;
                    }
                }
lbl54:
                // 2 sources

                while (true) {
                    var5_5 = (var3_4 | var6_3) ^ 1151878164;
                    ** continue;
                    break;
                }
            }
            break;
        }
        var5_5 = (var3_4 | var6_3) ^ 1584043254;
        ** while (true)
        {
            case 855487129: {
                var4_6 ^= var5_5 ^ -100070125;
                ** GOTO lbl54
            }
            ** case -660634386:
        }
lbl63:
        // 1 sources

        var4_6 ^= var5_5 ^ 1112938178;
        ** while (true)
    }
}

