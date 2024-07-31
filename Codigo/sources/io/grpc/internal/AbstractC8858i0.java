package io.grpc.internal;

import io.grpc.internal.InterfaceC8864j2;
import io.grpc.internal.InterfaceC8892r;
import p082eb.C7153i;
import vi.C11915g1;
import vi.C11953w0;

/* renamed from: io.grpc.internal.i0 */
/* loaded from: classes3.dex */
abstract class AbstractC8858i0 implements InterfaceC8892r {
    @Override // io.grpc.internal.InterfaceC8864j2
    /* renamed from: a */
    public void mo25290a(InterfaceC8864j2.a aVar) {
        mo25604e().mo25290a(aVar);
    }

    @Override // io.grpc.internal.InterfaceC8892r
    /* renamed from: b */
    public void mo25291b(C11953w0 c11953w0) {
        mo25604e().mo25291b(c11953w0);
    }

    @Override // io.grpc.internal.InterfaceC8864j2
    /* renamed from: c */
    public void mo25292c() {
        mo25604e().mo25292c();
    }

    @Override // io.grpc.internal.InterfaceC8892r
    /* renamed from: d */
    public void mo25293d(C11915g1 c11915g1, InterfaceC8892r.a aVar, C11953w0 c11953w0) {
        mo25604e().mo25293d(c11915g1, aVar, c11953w0);
    }

    /* renamed from: e */
    protected abstract InterfaceC8892r mo25604e();

    public String toString() {
        return C7153i.m21274c(this).m21284d("delegate", mo25604e()).toString();
    }
}
