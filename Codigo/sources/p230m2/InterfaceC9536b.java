package p230m2;

import java.util.concurrent.Executor;

/* renamed from: m2.b */
/* loaded from: classes.dex */
public interface InterfaceC9536b {
    /* renamed from: a */
    Executor mo28363a();

    /* renamed from: b */
    InterfaceExecutorC9535a mo28364b();

    /* renamed from: c */
    default void m28365c(Runnable runnable) {
        mo28364b().execute(runnable);
    }
}
