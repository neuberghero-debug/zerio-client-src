/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1792
 */
package z.r;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1792;
import z.r.eC;
import z.r.kd;

@Environment(value=EnvType.CLIENT)
public class iG
extends eC<List<eC<?>>> {
    public static final int b = mK.a(MethodHandles.lookup().lookupClass(), -2061994067);
    private final class_1792 a;

    /*
     * Unable to fully structure code
     */
    public iG(String var1_1, class_1792 var2_2) {
        block12: {
            break block12;
lbl1:
            // 1 sources

            block6: while (true) {
                var4_6 ^= 1235660351;
                ** GOTO lbl24
lbl4:
                // 1 sources

                block7: while (true) {
                    switch (var5_5) lbl-1000:
                    // 4 sources

                    {
                        while (true) {
                            default: {
                                continue block7;
                            }
                            break;
                        }
                        case 1002576210: {
                            var4_6 ^= var5_5 ^ 1756906726;
                            break block6;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ -985897051;
                            ** GOTO lbl-1000
                            break;
                        }
lbl15:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ 1235112439;
                            ** GOTO lbl-1000
                            break;
                        }
                        case -1396669534: {
                            var4_6 ^= var5_5 ^ -1061484242;
                            ** continue;
                        }
lbl21:
                        // 1 sources

                        while (true) {
                            var5_5 = (var3_4 | var6_3) ^ 1379859797;
                            ** continue;
                            break;
                        }
lbl24:
                        // 1 sources

                        super(var1_1, new ArrayList<E>());
                        ** continue;
                        case -1218433280: {
                            return;
                        }
                    }
                    break;
                }
                break;
            }
            var5_5 = (var3_4 | var6_3) ^ -1142705933;
            ** while (true)
        }
        var6_3 = -1761984841;
        var3_4 = iG.b & -1761984841 ^ -327915306;
        var5_5 = 0;
        var4_6 = (var3_4 | var6_3) ^ 748984869;
        ** while (true)
        {
            ** case 1159581188:
        }
lbl37:
        // 1 sources

        this.a = var2_2;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public iG(String var1_1) {
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
     * Enabled aggressive block sorting
     */
    public <T extends eC<?>> T add(T t2) {
        int n2 = -1781492457;
        int n3 = b & 0x95D09517 ^ 0xE0168E6B;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xE30AF68D;
        n4 = (n3 | n2) ^ 0x86890921;
        block7: while (true) {
            switch (n4) {
                default: {
                    continue block7;
                }
                case 512823064: {
                    return t2;
                }
                case -1954493700: {
                    ((List)this.a).add(t2);
                    n4 = (n3 | n2) ^ 0x8C1D22B2;
                    continue block7;
                }
                case 1935644254: {
                    n4 = (n3 | n2) ^ 0x63A34C43;
                    continue block7;
                }
                case 2043395533: {
                    n5 ^= n4 ^ 0x23F39EA5;
                    n4 = (n3 | n2) ^ 0xEB479067;
                    continue block7;
                }
                case -1770663108: 
            }
            n5 ^= n4 ^ 0xEE42BCE1;
            n4 = (n3 | n2) ^ 0x7E565583;
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean removeChild(eC<?> var1_1) {
        block6: {
            block7: {
                var2_2 = iG.b & -1859532878 ^ -439447570;
                var4_3 = 0;
                ** GOTO lbl10
lbl4:
                // 3 sources

                block5: while (true) {
                    switch (var4_3) {
                        default: {
                            continue block5;
                        }
                        case -530749113: {
                            break block5;
                        }
lbl10:
                        // 1 sources

                        var3_4 = (var2_2 | -1859532878) ^ -1939582045;
                        break block6;
                        case -552091498: {
                            var3_4 ^= var4_3 ^ 508082635;
                            break block7;
                        }
                    }
                    break;
                }
                var4_3 = (var2_2 | -1859532878) ^ 720899944;
                ** GOTO lbl4
            }
            var4_3 = (var2_2 | -1859532878) ^ 1250222595;
            ** GOTO lbl4
            {
                ** case -1083494915:
            }
lbl21:
            // 1 sources

            return ((List)this.a).remove(var1_1);
        }
        var4_3 = (var2_2 | -1859532878) ^ 364029625;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public void clearChildren() {
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
     * Enabled aggressive block sorting
     */
    public class_1792 getIcon() {
        int n2 = b & 0x7A8F34E9 ^ 0x2F8B3D3B;
        int n3 = 0;
        int n4 = (n2 | 0x7A8F34E9) ^ 0x8144C52F;
        n3 = (n2 | 0x7A8F34E9) ^ 0x6A478515;
        block5: while (true) {
            switch (n3) {
                case -840943561: {
                    n4 ^= n3 ^ 0x55A57692;
                    n3 = (n2 | 0x7A8F34E9) ^ 0x22C0B904;
                }
                default: {
                    continue block5;
                }
                case 1565492479: {
                    return this.a;
                }
                case 365476078: 
            }
            n3 = (n2 | 0x7A8F34E9) ^ 0xB26F05CC;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public List<eC<?>> getChildren() {
        int n2 = b & 0xC9F030D4 ^ 0x8CE3DFD2;
        int n3 = 0;
        int n4 = (n2 | 0xC9F030D4) ^ 0xCE3E1FFD;
        n3 = (n2 | 0xC9F030D4) ^ 0x34A12CD6;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -112012544: {
                    n3 = (n2 | 0xC9F030D4) ^ 0x2303074E;
                    continue block5;
                }
                case -286197608: {
                    n4 ^= n3 ^ 0xED291BFD;
                    n3 = (n2 | 0xC9F030D4) ^ 0x3C9BD1EB;
                    continue block5;
                }
                case -244830659: 
            }
            break;
        }
        return (List)this.a;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean hasIcon() {
        var4_1 = 194267457;
        var1_2 = iG.b & 194267457 ^ -675420281;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ -906110783;
        var3_3 = (var1_2 | var4_1) ^ -1700410442;
        ** GOTO lbl16
lbl7:
        // 1 sources

        while (true) {
            var3_3 = (var1_2 | var4_1) ^ -557099177;
            if (true) ** GOTO lbl16
            break;
        }
        block10: while (true) {
            block13: {
                var3_3 = (var1_2 | var4_1) ^ 237890726;
                break block13;
lbl13:
                // 2 sources

                while (true) {
                    var2_4 ^= -458756044;
                    return v0;
                }
            }
            block12: while (true) {
                switch (var3_3) {
                    case 780501296: {
                        var2_4 ^= var3_3 ^ 2089841824;
                        var3_3 = (var1_2 | var4_1) ^ 1313943546;
                        continue block12;
                    }
                    case -2085007740: {
                        v0 = false;
                        ** GOTO lbl13
                    }
                    case 24557712: {
                        v0 = true;
                        ** continue;
                    }
                    case 1159210097: {
                        var3_3 = (var1_2 | var4_1) ^ -247959817;
                        continue block12;
                    }
                    case -779091103: {
                        var2_4 ^= var3_3 ^ 129047301;
                        ** continue;
                    }
                    case -1846755267: {
                        if (this.a != null) continue block10;
                        var3_3 = (var1_2 | var4_1) ^ -1700926736;
                    }
                    default: {
                        continue block12;
                    }
                    case 1159726391: 
                }
                var2_4 ^= var3_3 ^ -1828643501;
                var3_3 = (var1_2 | var4_1) ^ 1543807299;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean isIconGrid() {
        var4_1 = -1484682002;
        var1_2 = iG.b & -1484682002 ^ 438944746;
        var3_3 = 0;
        var2_4 = (var1_2 | var4_1) ^ 446766127;
        var3_3 = (var1_2 | var4_1) ^ -615402605;
        block9: while (true) {
            switch (var3_3) {
                case 1748886889: {
                    var2_4 ^= var3_3 ^ 692902052;
                    var3_3 = (var1_2 | var4_1) ^ 1780620406;
                    continue block9;
                }
                case -297432429: {
                    return false;
                }
                case 503558447: {
                    if (((List)this.a).isEmpty()) {
                        ** break;
                    }
                    ** GOTO lbl27
                }
                case -471082660: {
                    var2_4 ^= var3_3 ^ -15758364;
                    var3_3 = (var1_2 | var4_1) ^ 1374438781;
                    continue block9;
                }
                case 1694006397: {
                    var3_3 = (var1_2 | var4_1) ^ 1279239164;
                    continue block9;
                }
lbl25:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ 1547835058;
                ** GOTO lbl32
lbl27:
                // 1 sources

                var3_3 = (var1_2 | var4_1) ^ -678155641;
                ** GOTO lbl32
                case -208245742: {
                    var2_4 ^= var3_3 ^ 1813714908;
                    var3_3 = (var1_2 | var4_1) ^ -1582661951;
                }
lbl32:
                // 4 sources

                default: {
                    continue block9;
                }
                case -712256616: 
            }
            break;
        }
        return ((List)this.a).stream().allMatch((Predicate<eC>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, OO(z.r.eC ), (Lz/r/eC;)Z)());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String getDisplayValue() {
        int n2 = b & 0xF1A31FBE ^ 0x3F75B9B3;
        int n3 = 0;
        int n4 = (n2 | 0xF1A31FBE) ^ 0x5352EC6B;
        n3 = (n2 | 0xF1A31FBE) ^ 0x1B12CB06;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case -1092132400: {
                    n4 ^= n3 ^ 0xBCCBC5EA;
                    n3 = (n2 | 0xF1A31FBE) ^ 0x38EC3D72;
                    continue block5;
                }
                case -954498355: {
                    return ((List)this.a).size() + " items";
                }
                case -454724423: 
            }
            n3 = (n2 | 0xF1A31FBE) ^ 0x4110DE6F;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    @Override
    public kd getType() {
        int n2 = b & 0x2D8CB181 ^ 0x53AF7345;
        int n3 = 0;
        int n4 = (n2 | 0x2D8CB181) ^ 0xD29D47DB;
        n3 = (n2 | 0x2D8CB181) ^ 0x22E52F14;
        block5: while (true) {
            switch (n3) {
                default: {
                    continue block5;
                }
                case 1565187281: {
                    n3 = (n2 | 0x2D8CB181) ^ 0xB7110F46;
                    continue block5;
                }
                case -927007613: {
                    n4 ^= n3 ^ 0xBC7C4796;
                    n3 = (n2 | 0x2D8CB181) ^ 0x69EF5EC1;
                    continue block5;
                }
                case 373337348: 
            }
            break;
        }
        return kd.i;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean OO(eC eC2) {
        boolean bl2;
        int n2 = 1252804870;
        int n3 = b & 0x4AAC4906 ^ 0xADDF9409;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x9E57525C;
        n4 = (n3 | n2) ^ 0xC0681EE1;
        block9: while (true) {
            block10: {
                block12: {
                    block11: {
                        switch (n4) {
                            case 689464901: {
                                n5 ^= n4 ^ 0xB162E437;
                                break block10;
                            }
                            case 1202367512: {
                                n4 = (n3 | n2) ^ 0xFB5F8AEE;
                                continue block9;
                            }
                            case 85938926: {
                                bl2 = false;
                                break block9;
                            }
                            case -1198387103: {
                                n5 ^= n4 ^ 0x52188D0A;
                                n4 = (n3 | n2) ^ 0xEAE08FE1;
                                break;
                            }
                            case 346052577: {
                                iG iG2 = (iG)eC2;
                                if (!iG2.hasIcon()) break block11;
                                break block12;
                            }
                            case 798475246: {
                                n4 = (n3 | n2) ^ 0xC6E7BB4A;
                                break;
                            }
                            case -1379830854: {
                                if (!(eC2 instanceof iG)) break block11;
                                n4 = (n3 | n2) ^ 0xA8557117;
                            }
                        }
                        continue;
                    }
                    n4 = (n3 | n2) ^ 0x576DCD6E;
                    continue;
                }
                n5 ^= 0xEA8A9D6B;
                bl2 = true;
                break;
            }
            n4 = (n3 | n2) ^ 0x423EAEB5;
        }
        n5 ^= 0xD20D33C;
        return bl2;
    }
}

