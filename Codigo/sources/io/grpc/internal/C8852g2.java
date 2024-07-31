package io.grpc.internal;

import io.grpc.internal.C8867k1;
import io.grpc.internal.InterfaceC8864j2;
import java.io.Closeable;

/* renamed from: io.grpc.internal.g2 */
/* loaded from: classes3.dex */
final class C8852g2 extends AbstractC8866k0 {

    /* renamed from: a */
    private final C8867k1.b f20623a;

    /* renamed from: b */
    private boolean f20624b;

    public C8852g2(C8867k1.b bVar) {
        this.f20623a = bVar;
    }

    @Override // io.grpc.internal.AbstractC8866k0, io.grpc.internal.C8867k1.b
    /* renamed from: a */
    public void mo25374a(InterfaceC8864j2.a aVar) {
        if (!this.f20624b) {
            super.mo25374a(aVar);
        } else if (aVar instanceof Closeable) {
            C8890q0.m25748e((Closeable) aVar);
        }
    }

    @Override // io.grpc.internal.AbstractC8866k0
    /* renamed from: b */
    protected C8867k1.b mo25579b() {
        return this.f20623a;
    }

    @Override // io.grpc.internal.AbstractC8866k0, io.grpc.internal.C8867k1.b
    /* renamed from: d */
    public void mo25572d(Throwable th2) {
        this.f20624b = true;
        super.mo25572d(th2);
    }

    @Override // io.grpc.internal.AbstractC8866k0, io.grpc.internal.C8867k1.b
    /* renamed from: e */
    public void mo25233e(boolean z10) {
        this.f20624b = true;
        super.mo25233e(z10);
    }
}
