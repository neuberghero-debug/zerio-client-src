/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint
 */
package leakestan;

import java.lang.reflect.Field;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class Boot
implements PreLaunchEntrypoint {
    public void onPreLaunch() {
        try {
            Class.forName("dev.jnic.KERseB.JNICLoader");
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        Thread thread = new Thread(Boot::brand, "CrackedByDexter");
        thread.setDaemon(true);
        thread.start();
    }

    private static void brand() {
        try {
            Class<?> clazz = Class.forName("sun.misc.Unsafe");
            Field field = clazz.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            Object object = field.get(null);
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            if (classLoader == null) {
                classLoader = Boot.class.getClassLoader();
            }
            while (true) {
                try {
                    Class<?> clazz2 = Class.forName("z.r.bw", false, classLoader);
                    Field field2 = clazz2.getDeclaredField("c");
                    Object object2 = clazz.getMethod("staticFieldBase", Field.class).invoke(object, field2);
                    long l2 = (Long)clazz.getMethod("staticFieldOffset", Field.class).invoke(object, field2);
                    Object object3 = clazz.getMethod("getObject", Object.class, Long.TYPE).invoke(object, object2, l2);
                    if (object3 != null) {
                        clazz.getMethod("putObject", Object.class, Long.TYPE, Object.class).invoke(object, object2, l2, "CrackedByDexter");
                        return;
                    }
                }
                catch (ClassNotFoundException classNotFoundException) {
                    // empty catch block
                }
                Thread.sleep(250L);
            }
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

