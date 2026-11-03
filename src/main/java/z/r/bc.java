/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.r;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.gj;
import z.r.js;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class bc {
    private static final /* synthetic */ String a;
    private static final /* synthetic */ String b;
    private static final Pattern a;
    private static final /* synthetic */ String c;
    public static final int a;
    private static final /* synthetic */ String d;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String f;
    private static final int[] a;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String h;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ String l;
    private final List<js> a;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String p;
    private static final Pattern b;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ String r;
    private static final /* synthetic */ String s;
    private static final float a;
    private static final float b;
    private static final /* synthetic */ String t;
    private static final /* synthetic */ String u;
    private static final /* synthetic */ String v;
    private static final /* synthetic */ String w;
    private static final /* synthetic */ String x;
    private static final /* synthetic */ String y;
    private static final /* synthetic */ String z;
    private static final /* synthetic */ String A;

    /*
     * Enabled aggressive block sorting
     */
    private bc(List<js> list) {
        int n2 = -1681477220;
        int n3 = a & 0x9BC6B19C ^ 0x56C380EC;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0xCF3CFE76;
        n5 ^= 0x3B292F8;
        n4 = (n3 | n2) ^ 0x8BBFC35;
        block6: while (true) {
            switch (n4) {
                default: {
                    continue block6;
                }
                case 726161256: {
                    this.a = list;
                    n4 = (n3 | n2) ^ 0xEAFC2CE1;
                    continue block6;
                }
                case 893099293: {
                    n5 ^= n4 ^ 0x3666B4D0;
                    n4 = (n3 | n2) ^ 0xAFF223E8;
                    continue block6;
                }
                case -679719479: {
                    n5 ^= n4 ^ 0xAF15EC23;
                    n4 = (n3 | n2) ^ 0xF48FE694;
                    continue block6;
                }
                case 1882558996: 
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public static bc load(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [170[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n2 = 235952738;
        a = mK.a(MethodHandles.lookup().lookupClass(), 1729018702);
        int n3 = 0;
        int n4 = -143429362;
        n3 = n2 ^ 0xFB20F83A;
        boolean bl2 = true;
        block9: while (true) {
            int n5;
            int n6;
            byte[] byArray;
            if (!bl2 || (bl2 = false) || !true) {
                n4 ^= 0x7CE49F63;
                n4 ^= 0x60B2D7D2;
                n4 ^= 0x694EB059;
                n4 ^= 0xDF9E75C;
                n4 ^= 0x50FC72C8;
                n4 ^= 0x6C6EFB8B;
                int n7 = n4 ^= 0x7E5ED9C7;
                n4 ^= 0x8CF174FF;
                bc.a[n5] = ((byArray[n6] & 0xFF) << 24 | ((byArray[n6 + 1] & 0xFF) << 16 | ((byArray[n6 + 2] & 0xFF) << 8 | byArray[n6 + 3] & 0xFF))) ^ ((n7 | n2) ^ 0x8F24BF89 ^ a);
                n5 = n5 + 1;
                int n8 = n6 + 4;
                byArray = byArray;
                n6 = n8;
                n4 ^= 0xB6DC3BCF;
                if (n8 < byArray.length) continue;
                b = 1.5f;
                a = 24.0f;
                k = gj.decode("Ay2f6w==", bc.qu(((n4 ^= 0xEE66B203) | n2) ^ 0x85FCC0AA, n2 ^ ((n4 | n2) ^ 0xC9A831DF)));
                f = gj.decode("oXVMJA==", bc.qu((n4 | n2) ^ 0x85FCC0AB, n2 ^ ((n4 | n2) ^ 0x80CFD11)));
                A = gj.decode("YpByEA==", bc.qu((n4 | n2) ^ 0x85FCC0A8, n2 ^ ((n4 | n2) ^ 0x2E5491E)));
                r = gj.decode("uLp9YbUA", bc.qu((n4 | n2) ^ 0x85FCC0A9, n2 ^ ((n4 | n2) ^ 0x1BC3FF2F)));
                i = gj.decode("2sikHV/lug==", bc.qu((n4 | n2) ^ 0x85FCC0B6, n2 ^ ((n4 | n2) ^ 0x47CF7AB4)));
                t = gj.decode("Nz4imA==", bc.qu((n4 | n2) ^ 0x85FCC0B7, n2 ^ ((n4 | n2) ^ 0x71B2D249)));
                s = gj.decode("LHP+Nw==", bc.qu((n4 | n2) ^ 0x85FCC0B4, n2 ^ ((n4 | n2) ^ 0x3A4C4395)));
                j = gj.decode("zvd+l44AvPk=", bc.qu((n4 | n2) ^ 0x85FCC0B5, n2 ^ ((n4 | n2) ^ 0x588FAC50)));
                w = gj.decode("bNTxVhU+sA==", bc.qu((n4 | n2) ^ 0x85FCC0B2, n2 ^ ((n4 | n2) ^ 0x1DBD5C03)));
                h = gj.decode("3A==", bc.qu((n4 | n2) ^ 0x85FCC0B3, n2 ^ ((n4 | n2) ^ 0x36BF00D1)));
                c = gj.decode("uHw=", bc.qu((n4 | n2) ^ 0x85FCC0B0, n2 ^ ((n4 | n2) ^ 0x9281C45F)));
                b = gj.decode("daY=", bc.qu((n4 | n2) ^ 0x85FCC0B1, n2 ^ ((n4 | n2) ^ 0x165E8A23)));
                o = gj.decode("0g==", bc.qu((n4 | n2) ^ 0x85FCC0BE, n2 ^ ((n4 | n2) ^ 0xD7D04C03)));
                d = gj.decode("tUw=", bc.qu((n4 | n2) ^ 0x85FCC0BF, n2 ^ ((n4 | n2) ^ 0x4B6CCBC)));
                e = gj.decode("1AQ=", bc.qu((n4 | n2) ^ 0x85FCC0BC, n2 ^ ((n4 | n2) ^ 0xBA10F9E9)));
                y = gj.decode("fw==", bc.qu((n4 | n2) ^ 0x85FCC0BD, n2 ^ ((n4 | n2) ^ 0xDA69288B)));
                n = gj.decode("lw==", bc.qu((n4 | n2) ^ 0x85FCC0BA, n2 ^ ((n4 | n2) ^ 0x3C933B74)));
                u = gj.decode("lt89er8=", bc.qu((n4 | n2) ^ 0x85FCC0BB, n2 ^ ((n4 | n2) ^ 0xFEF65085)));
                l = gj.decode("8JdPKoWA", bc.qu((n4 | n2) ^ 0x85FCC0B8, n2 ^ ((n4 | n2) ^ 0x1F1C09CC)));
                z = gj.decode("a1o=", bc.qu((n4 | n2) ^ 0x85FCC0B9, n2 ^ ((n4 | n2) ^ 0x5C980AEA)));
                q = gj.decode("NHA=", bc.qu((n4 | n2) ^ 0x85FCC086, n2 ^ ((n4 | n2) ^ 0xD140FF6E)));
                p = gj.decode("fuA=", bc.qu((n4 | n2) ^ 0x85FCC087, n2 ^ ((n4 | n2) ^ 0xB3F8B218)));
                g = gj.decode("pQQ=", bc.qu((n4 | n2) ^ 0x85FCC084, n2 ^ ((n4 | n2) ^ 0xA336687D)));
                m = gj.decode("on/8muHN", bc.qu((n4 | n2) ^ 0x85FCC085, n2 ^ ((n4 | n2) ^ 0x56F270DC)));
                x = gj.decode("xDgIx+Sq", bc.qu((n4 | n2) ^ 0x85FCC082, n2 ^ ((n4 | n2) ^ 0x56D3905A)));
                a = gj.decode("/u4xeEtCnjLf9CHM4MerDCccMzJG1K1NFhh+9aGi4aT3drq08BGQl/3RnvqyX7SuS0wM8HIIi60DR2ix2n8=", bc.qu((n4 | n2) ^ 0x85FCC083, n2 ^ ((n4 | n2) ^ 0x5137118A)));
                v = gj.decode("/pcDXQoAu1DolXGV+sn4PKyS", bc.qu((n4 | n2) ^ 0x85FCC080, n2 ^ ((n4 | n2) ^ 0xE616D4CC)));
                n3 = n2 ^ 0x1189CCD2;
            }
            block10: while (true) {
                switch (n3) {
                    default: {
                        continue block10;
                    }
                    case 530159280: {
                        n4 ^= n3 ^ 0xFADFA752;
                        n3 = n2 ^ 0x5F21DAD9;
                        continue block10;
                    }
                    case 1275095046: {
                        n5 = 0;
                        n6 = 0;
                        a = new int[((n4 ^= 0x530F3B43) | n2) ^ 0x2E7EFA19];
                        n4 ^= 0x21D2C663;
                        byArray = "\u00da\u0097o\u00f1\u00abU\u00aeH\f#@\u0007g\u00ff\u00f7D9\u00da:\u00a0\u00a9OK)\u00b3\u0092\u0081\u0097\u0097!\u00c6\u00f6\u00b0>f\u00b6\u001cJB\u00ed\u0090- \u0094z8\u001d\u00b7F\u00e9\u00a1\u0014\t\u0098\u00b5\u0082\u0091\u00806\u00f4\u00e1dg\u00ce\u009b\u00a2\u00d3\u0096\u00ff\u00c6P\u0096\u00f9\"`\u00c8\u00e6i\"\u0089#\u00e2\r`\u00cdW\u00f4\u00c6\u00eb\u00bel\u00c4e\u00d8\u00a9u\u0088\u0003y-3\u001f\u0006\u001f~r\u007fk\u00ad\u0010\u00a3\u00e4\u0081!ql\u00b3\u00a7\u00f9\u00cd\u0094\u00f9*\u00de\u00ef\u00e5/\u009a\u00ff\u00a2Qt\u00b3n\u0006\u00bf\u00ba-\u00da\u00bcp\u00af\u0005d\u00da\u00d5\u0086\u000e0\u001c3\u009cw\u00e1\f\u00ce\u008cP\u008c\u00c9\u0005|\u0081\u00a8\u0092R+l\u008e\u0086|;\u0002\u0090\u00e5sSZ\u00c6\u00c3#\u0012&X-]\u000b\u00ff\u00a1\u0014\u00fb\u00bd\u0082\u00ce\t\u009f\u0016oS\u009a\u00d7\u00e6\u00e2\u001b\">\u00b4\f\u0086i\u00e5@B\u008e/\r\u00c1\u00db\u00d5\u008f\u00ea\u008f:\u00fe^y9\u00ccu4H\u00e9\u00d2\u00b9\u0098r\u00e2A\u008a/\u00bd9\u00f5\u00b0\u00e1\u0001r%\u0010\u00d7\u0080_\u00d2\u00a8[,\u001a0,+\u0095~\u0087\u001e\u00b6\u00f8\u0011e\u0004\u0082\t\u00a7\u00f2\u00ac\u00cc\u000f\u00ee\u00a7\u00dc^%d\u00f7\u00ac.\u0005D\u00a4i\u0090\u00f4\u00d4\u0080\u00aeb\u00b9\u00f6\u00d4\u000e\u00f7$\u00ac\u00c7\u00ac\u0081\u00dcm\\N\u009c\u00031\u0082<y;5\u00b4f\u00dd\u0093\u0019_\u00f2Z\u00f3\u00e1\u00a1p\u001a\u00dc\u00a1u\u0012\u0089\u00e2.u\u00d1\u0001B(\u00c2\u00db\u00c5F\u00a4B\u00d7\u00a7\u009fu\u0010\u00c6\u0018y\b\u00061\u00bc\u0082rr\u00a6\u00b3\u0085TMK\u00ec\u00f43|9\u001b\u00bb\u009d\u00ad\u0001\u00157\u009e\u001c\u00f7j\u00ae&\u00d2\u00e0\u00cc\u00f5\u0004\u00f2\u00d7\u00e1\u0014hC\u00d7E\u001d\u00db4X=\u00d0}\u0016U\u00f3\u00dc\u00e6".getBytes("ISO-8859-1");
                        continue block9;
                    }
                    case 1920895794: {
                        n4 ^= n3 ^ 0x992676E3;
                        n3 = n2 ^ 0x1ED694FF;
                        continue block10;
                    }
                    case -1972943708: {
                        n4 ^= n3 ^ 0x65FED5;
                        n3 = n2 ^ 0x42103264;
                        continue block10;
                    }
                    case 281464477: {
                        b = Pattern.compile(v);
                        return;
                    }
                    case 1362198715: {
                        a = Pattern.compile(a);
                        n3 = n2 ^ 0x7C6ED150;
                        continue block10;
                    }
                    case -181362088: 
                }
                n3 = n2 ^ 0x84771EC6;
            }
            break;
        }
    }

    private static int qu(int n2, int n3) {
        int n4 = 1502406668;
        int n5 = 364991715;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x37EBE277)] ^ n3 ^ n2;
        n6 ^= (n5 | n4) ^ 0x5DCDBC52;
        n6 -= (n5 | n4) ^ 0x5DCDDFCC;
        n6 -= (n5 | n4) ^ 0x5DCD0DC4;
        n6 ^= (n5 | n4) ^ 0x5DCD0309;
        n6 += (n5 | n4) ^ 0x5DCD3725;
        n6 -= (n5 | n4) ^ 0x5DCD3B5D;
        n6 ^= (n5 | n4) ^ 0x5DCDEF75;
        n6 ^= (n5 | n4) ^ 0x5DCD92CD;
        return n6 += (n5 | n4) ^ 0x5DCD4601;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static float qv(Map<String, String> var0, String var1_1) {
        block21: {
            break block21;
lbl-1000:
            // 1 sources

            {
                while (true) {
                    block20: {
                        var6_4 = (var4_3 | var7_2) ^ 1717317811;
                        break block20;
                        while (true) {
                            var6_4 = (var4_3 | var7_2) ^ 2027924058;
                            break block20;
                            break;
                        }
lbl7:
                        // 2 sources

                        while (true) {
                            var5_5 ^= 1495090414;
                            return v0;
                        }
                    }
                    block18: while (true) {
                        switch (var6_4) {
                            default: {
                                continue block18;
                            }
                            case -1616147644: {
                                var5_5 ^= var6_4 ^ -1101113902;
                                var6_4 = (var4_3 | var7_2) ^ -630617359;
                                continue block18;
                            }
                            case 597569798: {
                                if (var2_6 == null) ** continue;
                                var6_4 = (var4_3 | var7_2) ^ 861847514;
                                continue block18;
                            }
                            case -894893011: {
                                var5_5 ^= var6_4 ^ -162803987;
                                var6_4 = (var4_3 | var7_2) ^ -680042993;
                                continue block18;
                            }
                            case 780199416: {
                                v0 = Float.parseFloat(var2_6);
                                ** GOTO lbl7
                            }
                            case -2128080467: {
                                var5_5 ^= var6_4 ^ -1110779027;
                                var6_4 = (var4_3 | var7_2) ^ 2011131525;
                                continue block18;
                            }
                            case -1909926542: 
                        }
                        break;
                    }
                    v0 = 0.0f;
                    ** continue;
                    break;
                }
            }
        }
        var7_2 = -906517515;
        var4_3 = bc.a & -906517515 ^ 2040707255;
        var6_4 = 0;
        var5_5 = (var4_3 | var7_2) ^ -1114405698;
        var6_4 = (var4_3 | var7_2) ^ 1818254284;
        block19: while (true) {
            switch (var6_4) {
                default: {
                    continue block19;
                }
                case -1785208773: {
                    var6_4 = (var4_3 | var7_2) ^ -1547547154;
                    continue block19;
                }
                case 1513485849: {
                    var5_5 ^= var6_4 ^ 612447145;
                    var6_4 = (var4_3 | var7_2) ^ -920793275;
                    continue block19;
                }
                case 820671666: 
            }
            break;
        }
        var2_6 = var0.get(var1_1);
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private static float[] qw(float f2, float f3, float f4, float f5) {
        int n2 = -670361975;
        int n3 = a & 0xD80B1689 ^ 0x2A79B4FE;
        int n4 = 0;
        int n5 = (n3 | n2) ^ 0x24EE1DD9;
        n4 = (n3 | n2) ^ 0x68873D30;
        block5: while (true) {
            switch (n4) {
                default: {
                    continue block5;
                }
                case -1828942897: {
                    n4 = (n3 | n2) ^ 0x9D4BA4FB;
                    continue block5;
                }
                case 1731203588: {
                    n5 ^= n4 ^ 0x2B66E425;
                    n4 = (n3 | n2) ^ 0xF94121F0;
                    continue block5;
                }
                case 54171407: 
            }
            break;
        }
        float f6 = 0.5522847f;
        n5 ^= 0xEE95D952;
        float f7 = f4 * f6;
        float f8 = f5 * f6;
        float[] fArray = new float[bc.qu(((n5 ^= 0xFEBD059C) | n2) ^ 0xB0CD8953, (n3 | n2) ^ ((n5 | n2) ^ 0xBC2DEE22))];
        fArray[0] = 0.0f;
        fArray[1] = f2 + f4;
        fArray[2] = f3;
        fArray[3] = 2.0f;
        fArray[4] = f2 + f4;
        fArray[5] = f3 + f8;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD8952), (int)((n3 | n2) ^ ((n5 | n2) ^ 0xD7F1593E)))] = f2 + f7;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD8955), (int)((n3 | n2) ^ ((n5 | n2) ^ 0x89D494DC)))] = f3 + f5;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD8954), (int)((n3 | n2) ^ ((n5 | n2) ^ 0x1941E553)))] = f2;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD8957), (int)((n3 | n2) ^ ((n5 | n2) ^ 0x39C2FEF)))] = f3 + f5;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD8956), (int)((n3 | n2) ^ ((n5 | n2) ^ 0x272F688C)))] = 2.0f;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD8959), (int)((n3 | n2) ^ ((n5 | n2) ^ 0x30C8C2)))] = f2 - f7;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD8958), (int)((n3 | n2) ^ ((n5 | n2) ^ 0xAC44EC97)))] = f3 + f5;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD895B), (int)((n3 | n2) ^ ((n5 | n2) ^ 0x20238EEC)))] = f2 - f4;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD895A), (int)((n3 | n2) ^ ((n5 | n2) ^ 0xCA36B3CD)))] = f3 + f8;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD895D), (int)((n3 | n2) ^ ((n5 | n2) ^ 0xF6E70F68)))] = f2 - f4;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD895C), (int)((n3 | n2) ^ ((n5 | n2) ^ 0xB9961BF8)))] = f3;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD895F), (int)((n3 | n2) ^ ((n5 | n2) ^ 0x218E988C)))] = 2.0f;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD895E), (int)((n3 | n2) ^ ((n5 | n2) ^ 0x516AC9B4)))] = f2 - f4;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD8941), (int)((n3 | n2) ^ ((n5 | n2) ^ 0x2BAC7DF2)))] = f3 - f8;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD8940), (int)((n3 | n2) ^ ((n5 | n2) ^ 0x4FC8FEEC)))] = f2 - f7;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD8943), (int)((n3 | n2) ^ ((n5 | n2) ^ 0x492CCEB0)))] = f3 - f5;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD8942), (int)((n3 | n2) ^ ((n5 | n2) ^ 0x56678CB3)))] = f2;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD8945), (int)((n3 | n2) ^ ((n5 | n2) ^ 0x93ECA35C)))] = f3 - f5;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD8944), (int)((n3 | n2) ^ ((n5 | n2) ^ 0x7D595AFC)))] = 2.0f;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD8947), (int)((n3 | n2) ^ ((n5 | n2) ^ 0x5BB0C2FC)))] = f2 + f7;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD8946), (int)((n3 | n2) ^ ((n5 | n2) ^ 0xD5D6074F)))] = f3 - f5;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD8949), (int)((n3 | n2) ^ ((n5 | n2) ^ 0x380DD719)))] = f2 + f4;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD8948), (int)((n3 | n2) ^ ((n5 | n2) ^ 0x8311A825)))] = f3 - f8;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD894B), (int)((n3 | n2) ^ ((n5 | n2) ^ 0xCE7CD153)))] = f2 + f4;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD894A), (int)((n3 | n2) ^ ((n5 | n2) ^ 0x1D1E0DDE)))] = f3;
        fArray[bc.qu((int)((n5 | n2) ^ 0xB0CD894D), (int)((n3 | n2) ^ ((n5 | n2) ^ 0x312FDF50)))] = 3.0f;
        return fArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static float[] qx(float f2, float f3, float f4, float f5, float f6) {
        int n2 = -1395924808;
        int n3 = -153274493;
        int n4 = a & 0xACCBE0B8 ^ 0x42174893;
        int n5 = 0;
        int n6 = (n4 | n2) ^ 0x1B2E3E76;
        n5 = (n4 | n2) ^ 0xD1484F16;
        block9: while (true) {
            switch (n5) {
                default: {
                    continue block9;
                }
                case -674084154: {
                    n6 ^= n5 ^ 0x29CC8BDC;
                    n5 = (n4 | n2) ^ 0xB1BB32ED;
                    continue block9;
                }
                case 1511446331: {
                    float[] fArray = new float[bc.qu((n6 | n5 ^ n3) ^ (n5 ^ 0x8ECF2900), (n4 | n5 ^ n3) ^ ((n6 | n5 ^ n3) ^ (n5 ^ 0x290FA9AA)))];
                    fArray[0] = 0.0f;
                    fArray[1] = f2;
                    fArray[2] = f3;
                    fArray[3] = 1.0f;
                    fArray[4] = f2 + f4;
                    fArray[5] = f3;
                    fArray[bc.qu((int)((n6 | n5 ^ n3) ^ (n5 ^ 0x8ECF2903)), (int)((n4 | n5 ^ n3) ^ ((n6 | n5 ^ n3) ^ (n5 ^ 0xE517AB1))))] = 1.0f;
                    fArray[bc.qu((int)((n6 | n5 ^ n3) ^ (n5 ^ 0x8ECF2902)), (int)((n4 | n5 ^ n3) ^ ((n6 | n5 ^ n3) ^ (n5 ^ 0x754D7FF5))))] = f2 + f4;
                    fArray[bc.qu((int)((n6 | n5 ^ n3) ^ (n5 ^ 0x8ECF293D)), (int)((n4 | n5 ^ n3) ^ ((n6 | n5 ^ n3) ^ (n5 ^ 0x650A0123))))] = f3 + f5;
                    fArray[bc.qu((int)((n6 | n5 ^ n3) ^ (n5 ^ 0x8ECF293C)), (int)((n4 | n5 ^ n3) ^ ((n6 | n5 ^ n3) ^ (n5 ^ 0x29C656E8))))] = 1.0f;
                    fArray[bc.qu((int)((n6 | n5 ^ n3) ^ (n5 ^ 0x8ECF293F)), (int)((n4 | n5 ^ n3) ^ ((n6 | n5 ^ n3) ^ (n5 ^ 0x20858AEB))))] = f2;
                    fArray[bc.qu((int)((n6 | n5 ^ n3) ^ (n5 ^ 0x8ECF293E)), (int)((n4 | n5 ^ n3) ^ ((n6 | n5 ^ n3) ^ (n5 ^ 0xEA075533))))] = f3 + f5;
                    fArray[bc.qu((int)((n6 | n5 ^ n3) ^ (n5 ^ 0x8ECF2939)), (int)((n4 | n5 ^ n3) ^ ((n6 | n5 ^ n3) ^ (n5 ^ 0x407DD651))))] = 3.0f;
                    return fArray;
                }
                case 1600445014: {
                    float f7 = 0.5522847f * f6;
                    float[] fArray = new float[bc.qu(((n6 ^= 0xBE650405) | n2) ^ 0x85DDF506, (n4 | n2) ^ ((n6 | n2) ^ 0xA1A6BF9C))];
                    fArray[0] = 0.0f;
                    fArray[1] = f2 + f6;
                    fArray[2] = f3;
                    fArray[3] = 1.0f;
                    fArray[4] = f2 + f4 - f6;
                    fArray[5] = f3;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF505), (int)((n4 | n2) ^ ((n6 | n2) ^ 0xE65B80A7)))] = 2.0f;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF504), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x1DEA00A0)))] = f2 + f4 - f6 + f7;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF50B), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x94C60DC9)))] = f3;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF50A), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x3E8A70D)))] = f2 + f4;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF509), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x1F3CF05A)))] = f3 + f6 - f7;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF508), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x932A6912)))] = f2 + f4;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF50F), (int)((n4 | n2) ^ ((n6 | n2) ^ 0xC2E04AAA)))] = f3 + f6;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF50E), (int)((n4 | n2) ^ ((n6 | n2) ^ 0xB2A8AA31)))] = 1.0f;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF50D), (int)((n4 | n2) ^ ((n6 | n2) ^ 0xBCE78796)))] = f2 + f4;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF50C), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x30AE77D4)))] = f3 + f5 - f6;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF513), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x137485EE)))] = 2.0f;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF512), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x87D5DFEB)))] = f2 + f4;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF511), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x465C6E6A)))] = f3 + f5 - f6 + f7;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF510), (int)((n4 | n2) ^ ((n6 | n2) ^ 0xB384387D)))] = f2 + f4 - f6 + f7;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF517), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x17D36929)))] = f3 + f5;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF516), (int)((n4 | n2) ^ ((n6 | n2) ^ 0xD334A364)))] = f2 + f4 - f6;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF515), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x506159A6)))] = f3 + f5;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF514), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x7B35B6D7)))] = 1.0f;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF51B), (int)((n4 | n2) ^ ((n6 | n2) ^ 0xCFC3B5ED)))] = f2 + f6;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF51A), (int)((n4 | n2) ^ ((n6 | n2) ^ 0xE48EC4C8)))] = f3 + f5;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF519), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x43031453)))] = 2.0f;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF518), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x73FB060E)))] = f2 + f6 - f7;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF51F), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x2C837999)))] = f3 + f5;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF51E), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x70BBFE0C)))] = f2;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF51D), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x816D0C76)))] = f3 + f5 - f6 + f7;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF51C), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x4312D705)))] = f2;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF563), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x8B8AA07A)))] = f3 + f5 - f6;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF562), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x4C40B4F)))] = 1.0f;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF561), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x27429D34)))] = f2;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF560), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x953885F6)))] = f3 + f6;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF567), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x63164066)))] = 2.0f;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF566), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x7F1D5037)))] = f2;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF565), (int)((n4 | n2) ^ ((n6 | n2) ^ 0xB4DE7BC5)))] = f3 + f6 - f7;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF564), (int)((n4 | n2) ^ ((n6 | n2) ^ 0xBFBFC8CD)))] = f2 + f6 - f7;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF56B), (int)((n4 | n2) ^ ((n6 | n2) ^ 0xF82A78B5)))] = f3;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF56A), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x1114EED8)))] = f2 + f6;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF569), (int)((n4 | n2) ^ ((n6 | n2) ^ 0x676E8296)))] = f3;
                    fArray[bc.qu((int)((n6 | n2) ^ 0x85DDF568), (int)((n4 | n2) ^ ((n6 | n2) ^ 0xB5164BCD)))] = 3.0f;
                    return fArray;
                }
                case -1441635211: {
                    n6 ^= n5 ^ 0x54691C24;
                    n5 = (n4 | n2) ^ 0xAA4FE103;
                    continue block9;
                }
                case 1150290360: {
                    if (!(f6 <= 0.0f)) break;
                    n5 = (n4 | n2) ^ 0xF5276D13;
                    continue block9;
                }
                case 469271976: {
                    n6 ^= n5 ^ 0xAA4E4B22;
                    n5 = (n4 | n2) ^ 0xB4C93F80;
                    continue block9;
                }
                case 1066903469: {
                    n5 = (n4 | n2) ^ 0x44CD8CCE;
                    continue block9;
                }
            }
            n5 = (n4 | n2) ^ 0x390DA27D;
        }
    }

    /*
     * Exception decompiling
     */
    private static float[] qy(String var0, boolean var1_1) {
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
     * Exception decompiling
     */
    public void render(long var1_1, float var3_2, float var4_3, float var5_4) {
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
}

