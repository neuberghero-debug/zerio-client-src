/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2558
 *  net.minecraft.class_2558$class_10606
 *  net.minecraft.class_2561
 *  net.minecraft.class_2568
 *  net.minecraft.class_2568$class_10613
 *  net.minecraft.class_2583
 *  net.minecraft.class_310
 *  net.minecraft.class_5250
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.function.UnaryOperator;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2558;
import net.minecraft.class_2561;
import net.minecraft.class_2568;
import net.minecraft.class_2583;
import net.minecraft.class_310;
import net.minecraft.class_5250;
import z.r.dm;
import z.r.gj;
import z.r.kk;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class gr {
    public static final int d;
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final int[] a;
    private static final /* synthetic */ String c;
    private static final int a;
    private static final int b;
    private static final int c;

    /*
     * Enabled aggressive block sorting
     */
    private gr() {
        int n2 = d & 0x1EB0C9FE ^ 0xA79719D9;
        int n3 = (n2 | 0x1EB0C9FE) ^ 0xC7DEF392;
        n3 ^= 0x329BAF9B;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static class_5250 prefix() {
        int n2 = d & 0x2B348773 ^ 0xA59CB3F1;
        int n3 = 0;
        int n4 = (n2 | 0x2B348773) ^ 0xB058D30F;
        n3 = (n2 | 0x2B348773) ^ 0xBA0BED3E;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 364337869: {
                    n3 = (n2 | 0x2B348773) ^ 0x58DDDCDA;
                    continue block5;
                }
                case -144610519: {
                    n4 ^= n3 ^ 0xCBCE237B;
                    n3 = (n2 | 0x2B348773) ^ 0x671D4771;
                    continue block5;
                }
                case -928911230: 
            }
            break;
        }
        int n5 = dm.getAccentColor() & gr.RL((n4 | n3 ^ 0xE39577F1) ^ (n3 ^ 0x2BB8C1FD), (n2 | n3 ^ 0xE39577F1) ^ ((n4 | n3 ^ 0xE39577F1) ^ (n3 ^ 0x8C76C51A)));
        n4 ^= 0x4CA324DA;
        n4 ^= 0x99EDFFBC;
        n4 ^= 0x3B708C0F;
        n4 ^= 0x6F24019A;
        return class_2561.method_43473().method_10852((class_2561)kk.txt(b).method_27694(class_25832 -> {
            int n3 = d & 0x6AFBCFB5 ^ 0x2FF4F942;
            int n4 = 0;
            int n5 = (n3 | 0x6AFBCFB5) ^ 0x964D877A;
            n4 = (n3 | 0x6AFBCFB5) ^ 0x6264E321;
            block5: while (true) {
                switch (n4) {
                    case -985214787: {
                        return class_25832.method_36139(n5).method_10982(Boolean.valueOf(true));
                    }
                    case -615812589: {
                        n5 ^= n4 ^ 0x92B0E3C0;
                        n4 = (n3 | 0x6AFBCFB5) ^ 0xAAB92F4A;
                    }
                    default: {
                        continue block5;
                    }
                    case 228269270: 
                }
                n4 = (n3 | 0x6AFBCFB5) ^ 0xB4B48DE4;
            }
        })).method_10852((class_2561)kk.txt(c).method_27694(class_25832 -> {
            int n2 = d & 0xB27A9A3E ^ 0x6C4BCEDF;
            int n3 = 0;
            int n4 = (n2 | 0xB27A9A3E) ^ 0x6E3A578B;
            n3 = (n2 | 0xB27A9A3E) ^ 0x222DB2FC;
            block5: while (true) {
                switch (n3) {
                    case 1065239473: {
                        n4 ^= n3 ^ 0x5D99DF16;
                        n3 = (n2 | 0xB27A9A3E) ^ 0x3CE1B750;
                    }
                    default: {
                        continue block5;
                    }
                    case -1030067793: {
                        return class_25832.method_36139(gr.RL((n4 | n3 ^ 0x70E0F391) ^ (n3 ^ 0xF80268D6), (n2 | n3 ^ 0x70E0F391) ^ ((n4 | n3 ^ 0x70E0F391) ^ (n3 ^ 0x7A355F9C))));
                    }
                    case -598316029: 
                }
                n3 = (n2 | 0xB27A9A3E) ^ 0xC1059D4E;
            }
        }));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static class_5250 message(String string) {
        int n2 = d & 0x715E368F ^ 0xE58CF7EB;
        int n3 = 0;
        int n4 = (n2 | 0x715E368F) ^ 0xC4F98C14;
        n3 = (n2 | 0x715E368F) ^ 0xDC841E9D;
        block5: while (true) {
            switch (n3) {
                case 693823858: {
                    n3 = (n2 | 0x715E368F) ^ 0xFBF53022;
                }
                default: {
                    continue block5;
                }
                case 237750221: {
                    n4 ^= n3 ^ 0xEDDCA437;
                    n3 = (n2 | 0x715E368F) ^ 0xED4ABC33;
                    continue block5;
                }
                case 412371932: 
            }
            break;
        }
        return gr.prefix().method_10852((class_2561)kk.txt(string).method_27694(class_25832 -> {
            int n2 = d & 0x7B93289F ^ 0xE8F6D8C;
            int n3 = 0;
            int n4 = (n2 | 0x7B93289F) ^ 0x26801FF8;
            n3 = (n2 | 0x7B93289F) ^ 0x12CF30F;
            block5: while (true) {
                switch (n3) {
                    default: {
                        continue block5;
                    }
                    case -609288676: {
                        n4 ^= n3 ^ 0x9B795117;
                        n3 = (n2 | 0x7B93289F) ^ 0xBE9F62A2;
                        continue block5;
                    }
                    case 2125700752: {
                        n3 = (n2 | 0x7B93289F) ^ 0xA4319383;
                        continue block5;
                    }
                    case -1056960707: 
                }
                break;
            }
            return class_25832.method_36139(gr.RL((n4 | n3 ^ 0xBA9327A2) ^ (n3 ^ 0x72BD6C47), (n2 | n3 ^ 0xBA9327A2) ^ ((n4 | n3 ^ 0xBA9327A2) ^ (n3 ^ 0x937B0BC0))));
        }));
    }

    /*
     * Exception decompiling
     */
    public static class_5250 message(class_2561 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
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
     * Enabled aggressive block sorting
     */
    public static void send(class_310 var0, String var1_1) {
        var5_2 = 2027805164;
        var2_3 = gr.d & 2027805164 ^ 484165967;
        var4_4 = 0;
        var3_5 = (var2_3 | var5_2) ^ 801917698;
        var4_4 = (var2_3 | var5_2) ^ 426837329;
        block11: while (true) {
            block13: {
                switch (var4_4) {
                    case -1992732210: {
                        ** GOTO lbl29
                    }
                    case 1759606218: {
                        var3_5 ^= var4_4 ^ 468662908;
                        var4_4 = (var2_3 | var5_2) ^ 183789556;
                        ** GOTO lbl33
                    }
                    case -646331905: {
                        if (var0.field_1724 != null) {
                            ** break;
                        }
                        break block13;
                    }
                    case 1425355070: {
                        var3_5 ^= var4_4 ^ 551182554;
                        ** GOTO lbl39
                    }
                    case 1976464477: {
                        var4_4 = (var2_3 | var5_2) ^ -1515841520;
                        ** GOTO lbl33
                    }
                    case -1126106368: {
                        if (var0 == null) break block13;
                        ** GOTO lbl35
                    }
lbl27:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -169441247;
                    continue block11;
lbl29:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 1633666191;
                    continue block11;
                    case 1705958590: {
                        var4_4 = (var2_3 | var5_2) ^ 673900753;
                    }
lbl33:
                    // 4 sources

                    default: {
                        continue block11;
                    }
lbl35:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ 152153522;
                    continue block11;
                    case 1982578203: {
                        return;
                    }
lbl39:
                    // 1 sources

                    var4_4 = (var2_3 | var5_2) ^ -1069604113;
                    continue block11;
                    case 494935392: 
                }
                var0.field_1724.method_7353((class_2561)gr.message(var1_1), false);
            }
            var4_4 = (var2_3 | var5_2) ^ 339651621;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void send(class_310 var0, class_2561 var1_1) {
        block21: {
            block22: {
                block19: {
                    block20: {
                        block23: {
                            break block23;
lbl1:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 1764600615;
                                break block19;
lbl4:
                                // 1 sources

                                while (true) {
                                    var3_5 ^= var4_4 ^ -528728630;
                                    var4_4 = (var2_3 | var5_2) ^ 477303734;
                                    break block19;
                                    break;
                                }
lbl8:
                                // 1 sources

                                while (true) {
                                    var3_5 ^= var4_4 ^ -1403307803;
                                    break block20;
                                    break;
                                }
lbl11:
                                // 3 sources

                                while (true) {
                                    var4_4 = (var2_3 | var5_2) ^ 1680360146;
                                    break block19;
                                    break;
                                }
                                break;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                var4_4 = (var2_3 | var5_2) ^ 1546973180;
                                break block19;
                                break;
                            }
                        }
                        var5_2 = 1677678186;
                        var2_3 = gr.d & 1677678186 ^ 250585654;
                        var4_4 = 0;
                        var3_5 = (var2_3 | var5_2) ^ 1746315003;
                        ** while (true)
                    }
                    var4_4 = (var2_3 | var5_2) ^ -1562849511;
                }
lbl26:
                // 4 sources

                block16: while (true) {
                    switch (var4_4) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            default: {
                                continue block16;
                            }
                            break;
                        }
                        case -1607364578: {
                            ** continue;
                        }
                        case 198685868: {
                            ** continue;
                        }
                        case 868948354: {
                            break block16;
                        }
                        case 1938613704: {
                            if (var0 == null) ** GOTO lbl11
                            break block21;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var4_4 = (var2_3 | var5_2) ^ -228933869;
                            ** continue;
                            break;
                        }
                        case -33574369: {
                            break block22;
                        }
                    }
                    break;
                }
                var4_4 = (var2_3 | var5_2) ^ -808556960;
                ** GOTO lbl26
            }
            var4_4 = (var2_3 | var5_2) ^ -501758164;
            ** GOTO lbl26
        }
        var4_4 = (var2_3 | var5_2) ^ -1845476255;
        ** while (true)
        {
            case -1914162862: {
                if (var0.field_1724 == null) ** GOTO lbl11
                ** continue;
            }
            case -853067417: {
                return;
            }
            case 114449753: {
                var0.field_1724.method_7353((class_2561)gr.message(var1_1), false);
                ** continue;
            }
            ** case -1650112147:
        }
lbl62:
        // 1 sources

        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static class_5250 body(String string) {
        int n2 = d & 0xCDEB9702 ^ 0x63901904;
        int n3 = 0;
        int n4 = (n2 | 0xCDEB9702) ^ 0xC191CD10;
        n3 = (n2 | 0xCDEB9702) ^ 0x8EB51258;
        boolean bl2 = true;
        block5: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                n3 = (n2 | 0xCDEB9702) ^ 0x8C90795C;
            }
            block6: while (true) {
                switch (n3) {
                    case 1294077815: {
                        n4 ^= n3 ^ 0x76481D9D;
                        continue block5;
                    }
                    case 1632537950: {
                        n3 = (n2 | 0xCDEB9702) ^ 0xA2D99071;
                    }
                    default: {
                        continue block6;
                    }
                    case 1668015706: 
                }
                break;
            }
            break;
        }
        return kk.txt(string).method_27694(class_25832 -> {
            int n2 = d & 0xF0BE7D0B ^ 0x690D956F;
            int n3 = 0;
            int n4 = (n2 | 0xF0BE7D0B) ^ 0x72189231;
            n3 = (n2 | 0xF0BE7D0B) ^ 0x6C9E16A0;
            block5: while (true) {
                switch (n3) {
                    default: {
                        continue block5;
                    }
                    case -1792939057: {
                        break;
                    }
                    case 782874150: {
                        n4 ^= n3 ^ 0x9158469D;
                        n3 = (n2 | 0xF0BE7D0B) ^ 0x7499735E;
                        continue block5;
                    }
                    case -1926853071: {
                        return class_25832.method_36139(gr.RL((n4 | n3 ^ 0x7D98F33A) ^ (n3 ^ 0xB1BEEF5A), (n2 | n3 ^ 0x7D98F33A) ^ ((n4 | n3 ^ 0x7D98F33A) ^ (n3 ^ 0xD40398C0))));
                    }
                }
                n3 = (n2 | 0xF0BE7D0B) ^ 0xD7164B49;
            }
        });
    }

    /*
     * Unable to fully structure code
     */
    public static class_5250 muted(String var0) {
        var1_1 = gr.d & 605302001 ^ -2088552205;
        var3_2 = 0;
        if (true) ** GOTO lbl15
        block5: while (true) {
            switch (var3_2) lbl-1000:
            // 4 sources

            {
                while (true) {
                    default: {
                        continue block5;
                    }
                    break;
                }
lbl9:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | 605302001) ^ 676213242;
                    ** GOTO lbl-1000
                    break;
                }
                case 1523440209: {
                    var2_3 ^= var3_2 ^ 709697810;
                    ** GOTO lbl20
                }
lbl15:
                // 1 sources

                var2_3 = (var1_1 | 605302001) ^ 1906717872;
                ** continue;
lbl17:
                // 1 sources

                while (true) {
                    var3_2 = (var1_1 | 605302001) ^ -44374366;
                    ** GOTO lbl-1000
                    break;
                }
lbl20:
                // 1 sources

                var3_2 = (var1_1 | 605302001) ^ -2015464276;
                ** continue;
                case 541673567: {
                    return kk.txt(var0).method_27694((UnaryOperator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, RK(net.minecraft.class_2583 ), (Lnet/minecraft/class_2583;)Lnet/minecraft/class_2583;)());
                }
                case -1881600759: {
                    ** continue;
                }
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static class_5250 coords(int n2, int n3, int n4) {
        int n5 = d & 0x62C610BE ^ 0x5477CC02;
        int n6 = 0;
        int n7 = (n5 | 0x62C610BE) ^ 0x8D966D45;
        n6 = (n5 | 0x62C610BE) ^ 0x8785F25B;
        block5: while (true) {
            switch (n6) {
                default: {
                    continue block5;
                }
                case -244175131: {
                    n6 = (n5 | 0x62C610BE) ^ 0xC056B131;
                    continue block5;
                }
                case -1230934641: {
                    n7 ^= n6 ^ 0x62100F45;
                    n6 = (n5 | 0x62C610BE) ^ 0x3D0D9788;
                    continue block5;
                }
                case 1274694454: 
            }
            break;
        }
        return gr.RG(n2 + ", " + n3 + ", " + n4, n2 + " " + n3 + " " + n4);
    }

    /*
     * Unable to fully structure code
     */
    public static class_5250 coordsXZ(int var0, int var1_1) {
        var2_2 = gr.d & -1947977649 ^ 974472060;
        var4_3 = 0;
        ** GOTO lbl17
lbl4:
        // 1 sources

        block5: while (true) {
            switch (var4_3) lbl-1000:
            // 3 sources

            {
                while (true) {
                    default: {
                        continue block5;
                    }
                    break;
                }
                case -1585831440: {
                    break block5;
                }
lbl11:
                // 1 sources

                while (true) {
                    var4_3 = (var2_2 | -1947977649) ^ -1323426896;
                    ** GOTO lbl-1000
                    break;
                }
                case -1541388948: {
                    var3_4 ^= var4_3 ^ 796170781;
                    ** continue;
                }
lbl17:
                // 1 sources

                var3_4 = (var2_2 | -1947977649) ^ 1565121533;
                var4_3 = (var2_2 | -1947977649) ^ 445602447;
                ** continue;
                case 183197903: {
                    return gr.RG("X " + var0 + ", Z " + var1_1, var0 + " " + var1_1);
                }
            }
            break;
        }
        var4_3 = (var2_2 | -1947977649) ^ 534068755;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static class_5250 RG(String var0, String var1_1) {
        block14: {
            block13: {
                block17: {
                    block15: {
                        block12: {
                            block16: {
                                block11: {
                                    break block15;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl3:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl5:
                                    // 1 sources

                                    while (true) {
                                        var5_4 ^= -487849630;
                                        break block11;
                                        break;
                                    }
lbl8:
                                    // 1 sources

                                    while (true) {
                                        var6_3 = (var4_2 | 226159164) ^ -725199867;
                                        break block12;
                                        break;
                                    }
                                    var3_6 = kk.txt(var0).method_27694((UnaryOperator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, RJ(int net.minecraft.class_2583 ), (Lnet/minecraft/class_2583;)Lnet/minecraft/class_2583;)((int)var2_5)).method_10852((class_2561)kk.txt(gr.a).method_27694((UnaryOperator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, RI(net.minecraft.class_2583 ), (Lnet/minecraft/class_2583;)Lnet/minecraft/class_2583;)()));
                                    var5_4 ^= 1653281314;
                                    break block16;
lbl14:
                                    // 1 sources

                                    while (true) {
                                        var5_4 ^= var6_3 ^ 15761002;
                                        break block13;
                                        break;
                                    }
                                }
                                var5_4 ^= -292573311;
                                ** while (true)
                            }
                            return kk.txt("[" + var0 + "]").method_27694((UnaryOperator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, RH(int net.minecraft.class_5250 java.lang.String net.minecraft.class_2583 ), (Lnet/minecraft/class_2583;)Lnet/minecraft/class_2583;)((int)var2_5, (class_5250)var3_6, (String)var1_1));
                        }
lbl23:
                        // 3 sources

                        block10: while (true) {
                            switch (var6_3) {
                                default: {
                                    continue block10;
                                }
                                case -1671971252: {
                                    ** continue;
                                }
                                case 2042408888: {
                                    break block14;
                                }
                                case 858822566: {
                                    break;
                                }
                            }
                            ** continue;
                            break;
                        }
                        var2_5 = dm.getAccentColor() & gr.RL((var5_4 | var6_3 ^ -1859300240) ^ (var6_3 ^ -112472335), (var4_2 | var6_3 ^ -1859300240) ^ ((var5_4 | var6_3 ^ -1859300240) ^ (var6_3 ^ -934770413)));
                        var5_4 ^= -1128874821;
                        break block17;
                    }
                    var4_2 = gr.d & 226159164 ^ -1542958203;
                    var6_3 = 0;
                    var5_4 = (var4_2 | 226159164) ^ 933944437;
                    ** while (true)
                }
                var5_4 ^= -137652932;
                ** while (true)
            }
            var6_3 = (var4_2 | 226159164) ^ 825050609;
            ** GOTO lbl23
        }
        var6_3 = (var4_2 | 226159164) ^ -1639289829;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ class_2583 RH(int n2, class_5250 class_52502, String string, class_2583 class_25832) {
        int n3 = d & 0x82058AE2 ^ 0x451B77DD;
        int n4 = 0;
        int n5 = (n3 | 0x82058AE2) ^ 0x8B8D8779;
        n4 = (n3 | 0x82058AE2) ^ 0x2C4B767E;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case -346781311: {
                    n4 = (n3 | 0x82058AE2) ^ 0xB3BF6886;
                    continue block5;
                }
                case 1956681593: {
                    n5 ^= n4 ^ 0xADB8ABE4;
                    n4 = (n3 | 0x82058AE2) ^ 0x8E7F93F7;
                    continue block5;
                }
                case 1231055880: 
            }
            break;
        }
        n5 ^= 0xD38E1256;
        n5 ^= 0x7E1A0DEB;
        n5 ^= 0xD19321F0;
        n5 ^= 0x594FD06A;
        return class_25832.method_36139(n2).method_10949((class_2568)new class_2568.class_10613((class_2561)class_52502)).method_10958((class_2558)new class_2558.class_10606(string));
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ class_2583 RI(class_2583 var0) {
        block9: {
            break block9;
            {
                var3_2 = (var1_1 | -1314708232) ^ 526338531;
                block6: while (true) {
                    switch (var3_2) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            default: {
                                continue block6;
                            }
                            break;
                        }
                        ** case -703689665:
lbl8:
                        // 1 sources

                        var3_2 = (var1_1 | -1314708232) ^ -1183559282;
                        ** GOTO lbl-1000
lbl10:
                        // 1 sources

                        while (true) {
                            var3_2 = (var1_1 | -1314708232) ^ 1710564290;
                            ** continue;
                            break;
                        }
                        case 177208947: {
                            var2_3 ^= var3_2 ^ 1780676254;
                            continue block5;
                        }
                        case -1398479330: 
                    }
                    break;
                }
            }
            return var0.method_36139(gr.RL((var2_3 | var3_2 ^ 487047910) ^ (var3_2 ^ -1859271326), (var1_1 | var3_2 ^ 487047910) ^ ((var2_3 | var3_2 ^ 487047910) ^ (var3_2 ^ -1423844792))));
        }
        var1_1 = gr.d & -1314708232 ^ 595176237;
        var3_2 = 0;
        var2_3 = (var1_1 | -1314708232) ^ 907557422;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ class_2583 RJ(int n2, class_2583 class_25832) {
        int n3 = d & 0xE4FF187A ^ 0xBA1BD468;
        int n4 = 0;
        int n5 = (n3 | 0xE4FF187A) ^ 0x76236763;
        n4 = (n3 | 0xE4FF187A) ^ 0xC8945EA1;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case -1533849836: {
                    return class_25832.method_36139(n2);
                }
                case 1599734693: {
                    n5 ^= n4 ^ 0xBEF1CE5A;
                    n4 = (n3 | 0xE4FF187A) ^ 0x5A6C936E;
                    continue block5;
                }
                case 913015515: 
            }
            n4 = (n3 | 0xE4FF187A) ^ 0xA1A5DFDF;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ class_2583 RK(class_2583 var0) {
        var1_1 = gr.d & 1290897678 ^ -503278296;
        var3_2 = 0;
        if (true) ** GOTO lbl22
        block5: while (true) {
            block9: {
                var3_2 = (var1_1 | 1290897678) ^ -1550667283;
                break block9;
lbl7:
                // 1 sources

                while (true) {
                    var2_3 ^= var3_2 ^ -50824544;
                    ** GOTO lbl20
                    break;
                }
            }
lbl11:
            // 2 sources

            block7: while (true) {
                switch (var3_2) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        default: {
                            continue block7;
                        }
                        break;
                    }
                    case 1358203258: {
                        ** continue;
                    }
                    case 1298345155: {
                        break block5;
                    }
lbl20:
                    // 1 sources

                    var3_2 = (var1_1 | 1290897678) ^ -281175495;
                    ** continue;
lbl22:
                    // 1 sources

                    var2_3 = (var1_1 | 1290897678) ^ 1465357378;
                    continue block5;
                    case 30148375: {
                        return var0.method_36139(gr.RL((var2_3 | var3_2 ^ 1295879705) ^ (var3_2 ^ -1806605782), (var1_1 | var3_2 ^ 1295879705) ^ ((var2_3 | var3_2 ^ 1295879705) ^ (var3_2 ^ 370337048))));
                    }
                }
                break;
            }
            break;
        }
        var3_2 = (var1_1 | 1290897678) ^ -1106963372;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    static {
        block46: {
            block50: {
                block45: {
                    block49: {
                        block44: {
                            block48: {
                                block47: {
                                    block43: {
                                        break block50;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            var6_6 ^= var7_2 ^ -2132768319;
                                            break block43;
                                            break;
                                        }
lbl4:
                                        // 1 sources

                                        while (true) {
                                            var6_6 ^= -861945429;
                                            break block44;
                                            break;
                                        }
lbl7:
                                        // 1 sources

                                        while (true) {
                                            var7_2 = var8_1 ^ -1674829580;
                                            break block45;
lbl10:
                                            // 1 sources

                                            while (true) {
                                                var6_6 ^= var7_2 ^ -764154586;
                                                ** GOTO lbl87
                                                break;
                                            }
                                            break;
                                        }
lbl13:
                                        // 1 sources

                                        while (true) {
                                            gr.c = gr.RL((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ -2096174983), var7_2 ^ var9 ^ ((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ -1332563813)));
                                            gr.b = gr.RL((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ -2096174986), var7_2 ^ var9 ^ ((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ -1739323636)));
                                            gr.a = gr.RL((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ -2096174985), var7_2 ^ var9 ^ ((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ -963960953)));
                                            gr.b = gj.decode("hMvm1lc=", gr.RL((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ -2096174988), var7_2 ^ var9 ^ ((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ 1048563925))));
                                            gr.c = gj.decode("mHi3dA==", gr.RL((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ -2096174987), var7_2 ^ var9 ^ ((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ 2120493790))));
                                            gr.a = gj.decode("MPeD/U88BaTzaZGQHR6/L/vFkc5lfa8gjj4=", gr.RL((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ -2096174990), var7_2 ^ var9 ^ ((var6_6 | var7_2 ^ var9) ^ (var7_2 ^ -712546565))));
                                            return;
                                        }
lbl21:
                                        // 1 sources

                                        while (true) {
                                            var7_2 = var8_1 ^ 1092403242;
                                            break block45;
                                            break;
                                        }
lbl24:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl26:
                                        // 1 sources

                                        while (true) {
                                            var7_2 = var8_1 ^ var9;
                                            break block46;
                                            break;
                                        }
                                    }
                                    var7_2 = var8_1 ^ 602198052;
                                    break block49;
lbl32:
                                    // 1 sources

                                    while (true) {
                                        var6_6 ^= 1356046182;
                                        break block47;
                                        break;
                                    }
lbl35:
                                    // 1 sources

                                    while (true) {
                                        var7_2 = var8_1 ^ -855435712;
                                        break block46;
                                        break;
                                    }
lbl38:
                                    // 1 sources

                                    while (true) {
                                        var6_6 ^= var7_2 ^ -1741300103;
                                        break block48;
                                        break;
                                    }
lbl41:
                                    // 1 sources

                                    while (true) {
                                        var7_2 = var8_1 ^ -737484232;
                                        break block49;
                                        break;
                                    }
                                }
                                var0_3 = "\u009b&\u0011\u00b5\u000f-\u001e\u00fe\u001b\u001a.\u008b\u00fe_\u0084@\u000e\u00a5\u00d3[\f\u00feS\u00b6\u00eeN\u00eb\u0087O}\u00f2\u00beg\u001e\u001e\u00ba9\u008b\u00c1\u00c2\u0099\u0088\"m\u00a1*\u00caH\u00a2Mo\u0017".getBytes("ISO-8859-1");
                                ** while (true)
                            }
                            var7_2 = var8_1 ^ -1366638507;
                            break block46;
lbl50:
                            // 1 sources

                            while (true) {
                                var7_2 = var8_1 ^ -2114697956;
                                break block49;
                                break;
                            }
lbl53:
                            // 1 sources

                            while (true) {
                                var7_2 = var8_1 ^ -1173117655;
                                break block46;
                                break;
                            }
                        }
                        var1_4 = var0_3.length / 4;
                        ** while (true)
lbl59:
                        // 1 sources

                        while (true) {
                            gr.a[var4_8] = var5_9 ^= var2_5;
                            ** GOTO lbl93
                            break;
                        }
                        var5_9 = (var0_3[var3_7] & (((var6_6 ^= 786329186) | var8_1) ^ -17827455)) << ((var6_6 | var8_1) ^ -17827482) | (var0_3[var3_7 + 1] & ((var6_6 | var8_1) ^ -17827455)) << ((var6_6 | var8_1) ^ -17827474) | (var0_3[var3_7 + 2] & ((var6_6 | var8_1) ^ -17827455)) << ((var6_6 | var8_1) ^ -17827466) | var0_3[var3_7 + 3] & ((var6_6 | var8_1) ^ -17827455);
                        var7_2 = var8_1 ^ -2063048714;
                        break block46;
lbl65:
                        // 1 sources

                        while (true) {
                            var6_6 ^= var7_2 ^ -1958000919;
                            ** continue;
                            break;
                        }
                    }
lbl69:
                    // 2 sources

                    block35: while (true) {
                        switch (var7_2) {
                            default: {
                                continue block35;
                            }
                            case -2112677582: {
                                ** continue;
                            }
lbl75:
                            // 1 sources

                            while (true) {
                                var6_6 ^= 1258739831;
                                ** GOTO lbl91
                                break;
                            }
                            case 988367446: {
                                gr.a = new int[var1_4];
                                break block35;
                            }
                            case -855148470: {
                                var3_7 = 0;
                                ** continue;
                            }
lbl84:
                            // 1 sources

                            while (true) {
                                var2_5 = (var6_6 | var7_2 ^ -2083635418) ^ (var7_2 ^ -1689015816) ^ gr.d;
                                ** continue;
                                break;
                            }
lbl87:
                            // 1 sources

                            var7_2 = var8_1 ^ -2083635418;
                            break block45;
lbl89:
                            // 2 sources

                            while (true) {
                                ** continue;
                                break;
                            }
lbl91:
                            // 1 sources

                            var4_8 = 0;
                            ** GOTO lbl89
lbl93:
                            // 1 sources

                            var7_2 = var8_1 ^ 203816094;
                            break block46;
                        }
                        break;
                    }
                    var7_2 = var8_1 ^ 1827713372;
                    ** while (true)
lbl97:
                    // 1 sources

                    while (true) {
                        var3_7 += 4;
                        if (++var4_8 >= var1_4) ** break;
                        ** continue;
                        ** continue;
                        break;
                    }
lbl102:
                    // 1 sources

                    while (true) {
                        var6_6 ^= var7_2 ^ 1069945715;
                        ** continue;
                        break;
                    }
                    {
                        ** case 1863839090:
                    }
lbl106:
                    // 1 sources

                    var6_6 ^= var7_2 ^ 828560422;
                    ** while (true)
                }
                block41: while (true) {
                    switch (var7_2) {
                        default: {
                            continue block41;
                        }
                        case -1342216124: {
                            ** continue;
                        }
                        case 1926203546: {
                            ** continue;
                        }
                        ** case 1831704392:
lbl118:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
            var9 = 1534079343;
            var8_1 = -287070098;
            gr.d = mK.a(MethodHandles.lookup().lookupClass(), 805115082);
            var7_2 = 0;
            var6_6 = -1932477073;
            ** while (true)
        }
        block42: while (true) {
            switch (var7_2) {
                default: {
                    continue block42;
                }
                case -1248618239: {
                    ** continue;
                }
                case -490318608: {
                    ** continue;
                }
                case 1425018183: {
                    ** continue;
                }
                case 601931310: {
                    ** continue;
                }
                case 1080649787: {
                    ** continue;
                }
                ** case 1810626456:
lbl142:
                // 1 sources

                ** continue;
            }
            break;
        }
    }

    private static int RL(int n2, int n3) {
        int n4 = -970176883;
        int n5 = 1490864424;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x169A512D)] ^ n3 ^ n2;
        n6 -= (n5 | n4) ^ 0xDEFC57E7;
        n6 += (n5 | n4) ^ 0xDEFCE426;
        n6 -= (n5 | n4) ^ 0xDEFC9BAC;
        n6 ^= (n5 | n4) ^ 0xDEFCA742;
        n6 ^= (n5 | n4) ^ 0xDEFC6652;
        n6 ^= (n5 | n4) ^ 0xDEFC388D;
        n6 -= (n5 | n4) ^ 0xDEFC731A;
        n6 += (n5 | n4) ^ 0xDEFC47F7;
        n6 ^= (n5 | n4) ^ 0xDEFC6FA0;
        return n6 ^= (n5 | n4) ^ 0xDEFC1DA3;
    }
}

