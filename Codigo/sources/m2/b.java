package m2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface b {
    Executor a();

    a b();

    default void c(Runnable runnable) {
        b().execute(runnable);
    }
}
