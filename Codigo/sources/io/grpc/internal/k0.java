package io.grpc.internal;

import io.grpc.internal.j2;
import io.grpc.internal.k1;

/* loaded from: classes3.dex */
abstract class k0 implements k1.b {
    @Override // io.grpc.internal.k1.b
    public void a(j2.a aVar) {
        b().a(aVar);
    }

    protected abstract k1.b b();

    @Override // io.grpc.internal.k1.b
    public void c(int i10) {
        b().c(i10);
    }

    @Override // io.grpc.internal.k1.b
    public void d(Throwable th2) {
        b().d(th2);
    }

    @Override // io.grpc.internal.k1.b
    public void e(boolean z10) {
        b().e(z10);
    }
}
