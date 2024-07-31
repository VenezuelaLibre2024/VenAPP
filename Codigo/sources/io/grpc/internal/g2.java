package io.grpc.internal;

import io.grpc.internal.j2;
import io.grpc.internal.k1;
import java.io.Closeable;

/* loaded from: classes3.dex */
final class g2 extends k0 {

    /* renamed from: a, reason: collision with root package name */
    private final k1.b f18880a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f18881b;

    public g2(k1.b bVar) {
        this.f18880a = bVar;
    }

    @Override // io.grpc.internal.k0, io.grpc.internal.k1.b
    public void a(j2.a aVar) {
        if (!this.f18881b) {
            super.a(aVar);
        } else if (aVar instanceof Closeable) {
            q0.e((Closeable) aVar);
        }
    }

    @Override // io.grpc.internal.k0
    protected k1.b b() {
        return this.f18880a;
    }

    @Override // io.grpc.internal.k0, io.grpc.internal.k1.b
    public void d(Throwable th2) {
        this.f18881b = true;
        super.d(th2);
    }

    @Override // io.grpc.internal.k0, io.grpc.internal.k1.b
    public void e(boolean z10) {
        this.f18881b = true;
        super.e(z10);
    }
}
