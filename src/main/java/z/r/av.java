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
import java.util.concurrent.CompletableFuture;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import z.r.dr;
import z.r.ho;

@Environment(value=EnvType.CLIENT)
public interface av {
    public static final int a = mK.a(MethodHandles.lookup().lookupClass(), -1218035940);

    public String label();

    public boolean isRemote();

    public CompletableFuture<List<dr>> browse();

    public CompletableFuture<List<dr>> mine();

    public CompletableFuture<ho> download(String var1);

    public CompletableFuture<dr> publish(String var1, String var2, String var3);

    public CompletableFuture<dr> share(String var1, String var2, String var3);

    public CompletableFuture<dr> save(String var1, String var2, String var3, String var4, String var5, String var6, boolean var7);

    public CompletableFuture<dr> importCode(String var1);

    public CompletableFuture<dr> setAutoLoad(String var1, boolean var2);

    public CompletableFuture<Void> delete(String var1);
}

