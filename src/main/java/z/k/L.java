/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package z.k;

import java.lang.invoke.MethodHandles;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class L {
    private static final int a;
    public static final int b;
    private static final int[] a;
    private static final Object[] a;
    private static final String a;
    private static final String b;
    private static final String[] a;

    private static int a(int n2, int n3) {
        int n4 = 1201871723;
        int n5 = 2007295756;
        int n6 = a[n2 ^ ((n5 | n4) ^ 0x14938180)] ^ n3 ^ n2;
        n6 += (n5 | n4) ^ 0x77A7C0AF;
        n6 ^= (n5 | n4) ^ 0x77A75EA9;
        n6 ^= (n5 | n4) ^ 0x77A73022;
        n6 ^= (n5 | n4) ^ 0x77A74089;
        n6 -= (n5 | n4) ^ 0x77A7BD50;
        n6 += (n5 | n4) ^ 0x77A7CA7F;
        n6 += (n5 | n4) ^ 0x77A7271B;
        n6 += (n5 | n4) ^ 0x77A70753;
        return n6 ^= (n5 | n4) ^ 0x77A71F40;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block44: {
            block45: {
                var12 = -1050460356;
                L.b = mK.a(MethodHandles.lookup().lookupClass(), 642334977);
                var11_1 = 0;
                var10_12 = -860475439;
                var11_1 = var12 ^ -1952758406;
                break block45;
lbl7:
                // 2 sources

                while (true) {
                    var10_12 ^= 426363773;
                    var6_8 = var0_2.charAt(var4_6);
                    var10_12 ^= 1876318565;
                    v0 = var4_6 + 1;
                    var10_12 ^= 829664514;
                    var8_10 = 0;
                    var10_12 ^= 348288342;
                    var7_9 = var0_2.substring(v0, v0 + var6_8).toCharArray();
                    ** GOTO lbl73
                    break;
                }
                while (true) {
                    var11_1 = var12 ^ 1888332779;
                    break block44;
lbl20:
                    // 2 sources

                    while (true) {
                        var11_1 = var12 ^ 77078676;
                        break block44;
                        {
                            switch (var10_12) {
                                case -1452839810: {
                                    var10_12 ^= -967856651;
                                    break;
                                }
                                case -243340316: {
                                    var10_12 ^= 770306090;
                                    continue block38;
                                }
                                default: {
                                    var10_12 ^= -376260409;
                                }
                            }
                            v1 = var10_12 ^= -813348092;
                            var10_12 ^= -199209360;
                            L.a[v2] = (v3 | (v4 | (v5 | v6))) ^ ((v1 | var12) ^ 1750768889 ^ L.b);
                            v2 = v2 + 1;
                            v7 = v8 + 4;
                            v9 = v9;
                            v8 = v7;
                            var10_12 ^= 161310766;
                            if (v7 >= v9.length) {
                                L.b = L.a(((var10_12 ^= 1236755347) | var12) ^ -1584276872, var12 ^ ((var10_12 | var12) ^ 52201224));
                                L.a = L.a((var10_12 | var12) ^ -1584276871, var12 ^ ((var10_12 | var12) ^ -99959726));
                                L.a = L.a((var10_12 | var12) ^ -1227652715, var12 ^ ((var10_12 | var12) ^ -1549205957));
                                return;
                            }
lbl58:
                            // 3 sources

                            while (true) {
                                var10_12 ^= 61190757;
                                var10_12 ^= 762958139;
                                v3 = (v9[v8] & 255) << 24;
                                var10_12 ^= 248197405;
                                v4 = (v9[v8 + 1] & 255) << 16;
                                var10_12 ^= -1824792659;
                                v5 = (v9[v8 + 2] & 255) << 8;
                                var10_12 ^= 1197165889;
                                v6 = v9[v8 + 3] & 255;
                                continue block38;
                                break;
                            }
                        }
lbl73:
                        // 2 sources

                        while (true) {
                            var10_12 ^= 759836102;
                            var9_11 = var7_9[var8_10];
                            var11_1 = var12 ^ -310959531;
                            break block44;
                            break;
                        }
                        break;
                    }
                    break;
                }
            }
            block41: while (true) {
                switch (var11_1) {
                    default: {
                        continue block41;
                    }
                    case 161745548: {
                        var3_5 = 0;
                        var2_4 = new String[(var10_12 | var11_1 ^ -926468688) ^ (var11_1 ^ -27789911)];
                        var5_7 = ((var10_12 ^= 932080994) | var12) ^ -1294360336 ^ L.b;
                        var1_3 = "\u001c\ub09e\ueb1e\ub1aa\u6b17\ub1ea\uab35\ub2c6\u6b00\ub31a\ueb15\ub302\u6b24\ub25a\u2b06\ub2b2\u2b2b\ub2da\uab3b\ub2c2\ueb14\ub29e\u6b1c\ub31e\u6b38\ub3e6\ueb27\ub0be\u2b1d!\u54c5\u555b\u55f1\ud552\u55b1\u1570\u569d\ud545\u5741\u5550\u5759\ud561\u5601\u9543\u56e9\u956e\u5681\u557e\u5685\u9557\u56c1\ud55c\u576d\u957c\u57a1\u5573\u5491\u554a\u54bd\u5550\u5409\ud571\u554d\u000e\u5f00\u85e5\u5e2c\u85ec\u5fa0\u85c9\u5d44\u05fd\u5d70\u45e6\u5c6c\u45d0\u5d04\u85f6\u000e\u6e21\ud6f0\u6f51\u56fb\u6e81\u96ca\u6c35\u56ec\u6c61\u96f5\u6d65\ud6c0\u6c0d\u16e6\u001d\ue71f\u3e6a\ue6b7\ube62\ue703\u3e44\ue5a7\ufe67\ue52f\u3e6c\ue597\ube5b\ue583\u3e6d\ue54f\ufe50\ue57f\u7e54\ue53b\u3e6f\ue443\u7e65\ue4cf\u7e42\ue41f\ufe5b\ue703\ube61\ue767\u0007\ufef1\u1ffd\ufea5\udff2\ufe3d\udfd2\ufc8d\u0007\u4822\u2490\u4876\u249c\u48a2\u64bc\u4a6a\u0007\ufe4e\u6ff6\uff7a\uaffd\ufeda\uafd9\ufc0a\u0005\ue46d\ude50\ue529\u9e4e\ue5cd\u0006\ubbb7\u7bbe\ubbdf\u3baf\uba7b\u3b95/\u6eec\uc6f4\u6f48\u86fa\u6fc8\u06d0\u6c7c\u06ec\u6c14\uc6f1\u6d28\u06c5\u6c4c\u46e7\u6ca4\u46ca\u6ccc\u46d9\u6cd4\u46f1\u6cb8\uc6fb\u6d18\u46dc\u6db4\uc6d4\u6ef4\uc6f9\u6fec\u06fe\u6f38\u86c4\u6e28\u06f2\u6e6c\u86f3\u6eec\u06dd\u6c78\u46eb\u6c6c\uc6f6\u6d28\u86c0\u6d10\u46f7\u6db8\u0004\ub040\ucb12\ub138\u4b19)\uf3c1\u9f21\uf225\udf2a\uf385\u9f0c\uf019\u9f3c\uf17d\udf25\uf15d\u9f14\uf12d\u5f25\uf1a1\udf1a\uf1bd\u5f0e\uf1c1\u9f25\uf189\u1f2b\uf069\u9f09\uf0e1\u9f12\uf3dd\u9f3f\uf231\u1f2d\uf225\u5f15\uf371\udf31\uf22d\u9f2a\uf3bd\u9f08\uf10d\u1f3b\uf079\u001c\u7ca6\u67dd\u7d92\ue7d4\u7dd2\u27f6\u7efe\ue7c3\u7f22\u67d6\u7f3a\ue7e7\u7e62\ua7c5\u7e8a\ua7e8\u7ee2\u27f8\u7efa\u67d7\u7ea6\ue7df\u7f26\ue7fb\u7fde\u67e4\u7c86\ua7de!\u11b8\u810c\u108c\u0105\u10cc\uc127\u13e0\u0112\u123c\u8107\u1224\u0136\u137c\u4114\u1394\u4139\u13fc\u8129\u13f8\u4100\u13bc\u010b\u1210\u412b\u12dc\u8124\u11ec\u811d\u11c0\u8107\u1174\u0126\u1030\u0013\u29df\uf281\u2877\uf28f\u29bb\u72a8\u2b23\uf28d\u2b8f\u3286\u2b37\ub2b1\u2b23\u3287\u2b47\ub2b1\u2b3f\ub2aa\u2ac3\u001c\uc2ff\ufc38\uc3cb\u7c31\uc38b\ubc13\uc0a7\u7c26\uc17b\ufc33\uc163\u7c02\uc03b\u3c20\uc0d3\u3c0d\uc0bb\ubc1d\uc0a3\ufc32\uc0ff\u7c3a\uc17f\u7c1e\uc187\ufc01\uc2df\u3c3b!\u5b4b\u75ae\u5abb\uf5a5\u5b6b\u7597\u59cf\u35b1\u59ff\ub5a9\u59ef\u359e\u58d7\uf5b8\u591b\ub595\u5963\u3591\u591f\u35ac\u597b\uf5b0\u58a7\ub580\u593f\u759e\u5b07\ub5a5\u5a7b\uf5a0\u5abb\u3598\u5a9b!\u3cb8\u83dc\u3d8c\u03d5\u3dcc\uc3f7\u3ee0\u03c2\u3f3c\u83d7\u3f24\u03e6\u3e7c\u43c4\u3e94\u43e9\u3efc\u83f9\u3ef8\u43d0\u3ebc\u03db\u3f10\u43fb\u3fdc\u83f4\u3cec\u83cd\u3cc0\u83d7\u3c74\u03f6\u3d30\u0013\u3614\u437d\u37bc\u4373\u3670\uc354\u34e8\u4371\u3444\u837a\u34fc\u034d\u34e8\u837b\u348c\u034d\u34f4\u0356\u3508\f\ub358\u0b2e\ub3d0\u4b27\ub200\u4b15\ub084\u4b3f\ub1d4\u0b3f\ub0f0\u4b19\u001e\uf504\u8f4c\uf4a8\ucf47\uf564\u0f65\uf7e4\u4f41\uf744\u8f4a\uf7fc\u0f7d\uf7e8\u8f4b\uf724\u4f76\uf714\ucf72\uf750\u8f49\uf628\u8f43\uf684\ucf67\uf618\u8f7c\uf534\u8f45\uf464\u0f51\u0017\u01da\u6001v\u200a\u01ba\ue028\u033a\ua00c\u039a\u6007\u0322\ue030\u0336\u6006\u0352\ue030\u032a\u602d\u039a\u6007\u039e\u600c\u0366\u0007\u7a69\u57b5\u7b71\u97a4\u7b19\u5782\u79a9&\u24cc\u0256\u253c\u825d\u24ec\u026f\u26e0\u0242\u2698\u8243\u2620\uc264\u2644\u0247\u2798\uc26d\u26fc\uc26d\u278c\uc253\u26a8\u825d\u2708\u027e\u26b8\u4260\u2484\u425b\u25fc\uc24a\u2534\u4262\u2420\u4256\u2560\u425b\u25b8\u026f\r\u01d4\u800f\u00a4\u0004\u0174\uc035\u03d0\uc010\u03e0\u4008\u03f0\uc03f\u02fc(\u3605\u537e\u378d\u1376\u366d\ud345\u34e5\u1360\u34d5\u5369\u34ad\u134e\u34f9\u1368\u3535\u9341\u344d\u5343\u3521\u1378\u3439\u9376\u35f9\u9356\u3525\u934c\u361d\ud372\u361d\u937e\u37bd\ud34f\u36ad\u537e\u36d9\u137c\u36cd\ud35e\u35b5\ud373".length();
                        var4_6 = 0;
                        var0_2 = "\u001c\ub09e\ueb1e\ub1aa\u6b17\ub1ea\uab35\ub2c6\u6b00\ub31a\ueb15\ub302\u6b24\ub25a\u2b06\ub2b2\u2b2b\ub2da\uab3b\ub2c2\ueb14\ub29e\u6b1c\ub31e\u6b38\ub3e6\ueb27\ub0be\u2b1d!\u54c5\u555b\u55f1\ud552\u55b1\u1570\u569d\ud545\u5741\u5550\u5759\ud561\u5601\u9543\u56e9\u956e\u5681\u557e\u5685\u9557\u56c1\ud55c\u576d\u957c\u57a1\u5573\u5491\u554a\u54bd\u5550\u5409\ud571\u554d\u000e\u5f00\u85e5\u5e2c\u85ec\u5fa0\u85c9\u5d44\u05fd\u5d70\u45e6\u5c6c\u45d0\u5d04\u85f6\u000e\u6e21\ud6f0\u6f51\u56fb\u6e81\u96ca\u6c35\u56ec\u6c61\u96f5\u6d65\ud6c0\u6c0d\u16e6\u001d\ue71f\u3e6a\ue6b7\ube62\ue703\u3e44\ue5a7\ufe67\ue52f\u3e6c\ue597\ube5b\ue583\u3e6d\ue54f\ufe50\ue57f\u7e54\ue53b\u3e6f\ue443\u7e65\ue4cf\u7e42\ue41f\ufe5b\ue703\ube61\ue767\u0007\ufef1\u1ffd\ufea5\udff2\ufe3d\udfd2\ufc8d\u0007\u4822\u2490\u4876\u249c\u48a2\u64bc\u4a6a\u0007\ufe4e\u6ff6\uff7a\uaffd\ufeda\uafd9\ufc0a\u0005\ue46d\ude50\ue529\u9e4e\ue5cd\u0006\ubbb7\u7bbe\ubbdf\u3baf\uba7b\u3b95/\u6eec\uc6f4\u6f48\u86fa\u6fc8\u06d0\u6c7c\u06ec\u6c14\uc6f1\u6d28\u06c5\u6c4c\u46e7\u6ca4\u46ca\u6ccc\u46d9\u6cd4\u46f1\u6cb8\uc6fb\u6d18\u46dc\u6db4\uc6d4\u6ef4\uc6f9\u6fec\u06fe\u6f38\u86c4\u6e28\u06f2\u6e6c\u86f3\u6eec\u06dd\u6c78\u46eb\u6c6c\uc6f6\u6d28\u86c0\u6d10\u46f7\u6db8\u0004\ub040\ucb12\ub138\u4b19)\uf3c1\u9f21\uf225\udf2a\uf385\u9f0c\uf019\u9f3c\uf17d\udf25\uf15d\u9f14\uf12d\u5f25\uf1a1\udf1a\uf1bd\u5f0e\uf1c1\u9f25\uf189\u1f2b\uf069\u9f09\uf0e1\u9f12\uf3dd\u9f3f\uf231\u1f2d\uf225\u5f15\uf371\udf31\uf22d\u9f2a\uf3bd\u9f08\uf10d\u1f3b\uf079\u001c\u7ca6\u67dd\u7d92\ue7d4\u7dd2\u27f6\u7efe\ue7c3\u7f22\u67d6\u7f3a\ue7e7\u7e62\ua7c5\u7e8a\ua7e8\u7ee2\u27f8\u7efa\u67d7\u7ea6\ue7df\u7f26\ue7fb\u7fde\u67e4\u7c86\ua7de!\u11b8\u810c\u108c\u0105\u10cc\uc127\u13e0\u0112\u123c\u8107\u1224\u0136\u137c\u4114\u1394\u4139\u13fc\u8129\u13f8\u4100\u13bc\u010b\u1210\u412b\u12dc\u8124\u11ec\u811d\u11c0\u8107\u1174\u0126\u1030\u0013\u29df\uf281\u2877\uf28f\u29bb\u72a8\u2b23\uf28d\u2b8f\u3286\u2b37\ub2b1\u2b23\u3287\u2b47\ub2b1\u2b3f\ub2aa\u2ac3\u001c\uc2ff\ufc38\uc3cb\u7c31\uc38b\ubc13\uc0a7\u7c26\uc17b\ufc33\uc163\u7c02\uc03b\u3c20\uc0d3\u3c0d\uc0bb\ubc1d\uc0a3\ufc32\uc0ff\u7c3a\uc17f\u7c1e\uc187\ufc01\uc2df\u3c3b!\u5b4b\u75ae\u5abb\uf5a5\u5b6b\u7597\u59cf\u35b1\u59ff\ub5a9\u59ef\u359e\u58d7\uf5b8\u591b\ub595\u5963\u3591\u591f\u35ac\u597b\uf5b0\u58a7\ub580\u593f\u759e\u5b07\ub5a5\u5a7b\uf5a0\u5abb\u3598\u5a9b!\u3cb8\u83dc\u3d8c\u03d5\u3dcc\uc3f7\u3ee0\u03c2\u3f3c\u83d7\u3f24\u03e6\u3e7c\u43c4\u3e94\u43e9\u3efc\u83f9\u3ef8\u43d0\u3ebc\u03db\u3f10\u43fb\u3fdc\u83f4\u3cec\u83cd\u3cc0\u83d7\u3c74\u03f6\u3d30\u0013\u3614\u437d\u37bc\u4373\u3670\uc354\u34e8\u4371\u3444\u837a\u34fc\u034d\u34e8\u837b\u348c\u034d\u34f4\u0356\u3508\f\ub358\u0b2e\ub3d0\u4b27\ub200\u4b15\ub084\u4b3f\ub1d4\u0b3f\ub0f0\u4b19\u001e\uf504\u8f4c\uf4a8\ucf47\uf564\u0f65\uf7e4\u4f41\uf744\u8f4a\uf7fc\u0f7d\uf7e8\u8f4b\uf724\u4f76\uf714\ucf72\uf750\u8f49\uf628\u8f43\uf684\ucf67\uf618\u8f7c\uf534\u8f45\uf464\u0f51\u0017\u01da\u6001v\u200a\u01ba\ue028\u033a\ua00c\u039a\u6007\u0322\ue030\u0336\u6006\u0352\ue030\u032a\u602d\u039a\u6007\u039e\u600c\u0366\u0007\u7a69\u57b5\u7b71\u97a4\u7b19\u5782\u79a9&\u24cc\u0256\u253c\u825d\u24ec\u026f\u26e0\u0242\u2698\u8243\u2620\uc264\u2644\u0247\u2798\uc26d\u26fc\uc26d\u278c\uc253\u26a8\u825d\u2708\u027e\u26b8\u4260\u2484\u425b\u25fc\uc24a\u2534\u4262\u2420\u4256\u2560\u425b\u25b8\u026f\r\u01d4\u800f\u00a4\u0004\u0174\uc035\u03d0\uc010\u03e0\u4008\u03f0\uc03f\u02fc(\u3605\u537e\u378d\u1376\u366d\ud345\u34e5\u1360\u34d5\u5369\u34ad\u134e\u34f9\u1368\u3535\u9341\u344d\u5343\u3521\u1378\u3439\u9376\u35f9\u9356\u3525\u934c\u361d\ud372\u361d\u937e\u37bd\ud34f\u36ad\u537e\u36d9\u137c\u36cd\ud35e\u35b5\ud373";
                        ** GOTO lbl7
                    }
                    case 1257798214: {
                        var11_1 = var12 ^ -616376712;
                        continue block41;
                    }
                    case 438430020: 
                }
                var10_12 ^= var11_1 ^ -534310477;
                var11_1 = var12 ^ -926468688;
            }
        }
        block42: while (true) {
            switch (var11_1) {
                default: {
                    continue block42;
                }
                case -1200970086: {
                    var4_6 = var4_6 + var6_8 + 1;
                    var11_1 = var12 ^ 6327454;
                    continue block42;
                }
                case -770433954: {
                    var2_4[var3_5] = new String(var7_9);
                    var11_1 = var12 ^ -1602985835;
                    continue block42;
                }
                case -1017541965: {
                    var7_9[var8_10] = (char)((var9_11 >>> 2 | var9_11 << (var11_1 ^ -1017541955)) & (var11_1 ^ -1017547444) ^ var5_7);
                    ** GOTO lbl20
                }
                case 1172795273: {
                    L.a = new Object[var2_4.length];
                    var11_1 = var12 ^ -813886919;
                    continue block42;
                }
                case -649469017: {
                    var10_12 ^= var11_1 ^ 1354229759;
                    var11_1 = var12 ^ 2030672294;
                    continue block42;
                }
                case 407555255: {
                    if (var8_10 < var7_9.length) ** continue;
                    var11_1 = var12 ^ 955143289;
                    continue block42;
                }
                case 371619439: {
                    ++var8_10;
                    var11_1 = var12 ^ 1215695848;
                    continue block42;
                }
                case 236858629: {
                    var10_12 ^= var11_1 ^ -52635240;
                    var11_1 = var12 ^ -1198759232;
                    continue block42;
                }
                case -1948074585: {
                    var10_12 ^= var11_1 ^ -1416420836;
                    var11_1 = var12 ^ -2071703371;
                    continue block42;
                }
                case -1309764393: {
                    var10_12 ^= var11_1 ^ 526483876;
                    var11_1 = var12 ^ 140989256;
                    continue block42;
                }
                case 2045730300: {
                    v2 = 0;
                    v8 = 0;
                    v9 = "\u00c4\u00fb\u00818\u00d8\u008e\u0012\u00c7\u0096\u00e3}M*J\u009eN)\u00f4\u00c4+".getBytes("ISO-8859-1");
                    var10_12 ^= -1163242662;
                    L.a = new int[5];
                    var10_12 ^= -1798896062;
                    ** continue;
                }
                case -1995098924: {
                    var10_12 ^= var11_1 ^ -898313263;
                    var11_1 = var12 ^ -651562101;
                    continue block42;
                }
                case -144168236: {
                    L.a = var2_4;
                    var11_1 = var12 ^ 1250001563;
                    continue block42;
                }
                case -973398104: {
                    var10_12 ^= var11_1 ^ -1739618300;
                    var11_1 = var12 ^ -683325101;
                    continue block42;
                }
                case -922456972: {
                    var7_9[var8_10] = (char)((var9_11 << 2 | var9_11 >>> (var11_1 ^ -922456966)) & (var11_1 ^ -922446965) ^ var5_7);
                    ** continue;
                }
                case 2038779146: {
                    var10_12 ^= var11_1 ^ -687187847;
                    var11_1 = var12 ^ 37401999;
                    continue block42;
                }
                case 1628921769: {
                    var10_12 ^= var11_1 ^ -313251855;
                    var11_1 = var12 ^ 1259470631;
                    continue block42;
                }
                case -108172475: {
                    var10_12 ^= var11_1 ^ -46479883;
                    var11_1 = var12 ^ 326574946;
                    continue block42;
                }
                case 739515753: {
                    var10_12 ^= var11_1 ^ -1325116043;
                    var11_1 = var12 ^ -1307141696;
                    continue block42;
                }
                case -651608287: {
                    var10_12 ^= var11_1 ^ 2044270474;
                    var11_1 = var12 ^ 906696168;
                    continue block42;
                }
                case -1056722014: {
                    var10_12 ^= var11_1 ^ -1828246690;
                    var11_1 = var12 ^ -1975622805;
                    continue block42;
                }
                case -1972191205: {
                    ++var3_5;
                    var11_1 = var12 ^ 405462171;
                    continue block42;
                }
                case 1264409687: {
                    if (var4_6 >= var1_3) ** break;
                    ** continue;
                    var11_1 = var12 ^ 407502877;
                    continue block42;
                }
                case 1937090300: 
            }
            if (var8_10 % 2 != 0) ** continue;
            var11_1 = var12 ^ -1192857034;
        }
    }

    /*
     * Exception decompiling
     */
    private static String a(int var0, int var1_1) {
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
    private L() {
        int n2 = b & 0x75316D6E ^ 0xAC48EBD2;
        int n3 = (n2 | 0x75316D6E) ^ 0x2F9A3F8E;
        n3 ^= 0x150A101E;
    }

    /*
     * Exception decompiling
     */
    public static synchronized void load(Class<?> var0, String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [161[CATCHBLOCK]], but top level block is 2[TRYBLOCK]
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
}

