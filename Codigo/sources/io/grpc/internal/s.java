package io.grpc.internal;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public interface s extends vi.h0<Object> {

    /* loaded from: classes3.dex */
    public interface a {
        void a(Throwable th2);

        void b(long j10);
    }

    q c(vi.x0<?, ?> x0Var, vi.w0 w0Var, vi.c cVar, vi.k[] kVarArr);

    void f(a aVar, Executor executor);
}
