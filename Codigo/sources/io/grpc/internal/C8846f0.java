package io.grpc.internal;

import io.grpc.internal.InterfaceC8892r;
import p082eb.C7159o;
import vi.AbstractC11925k;
import vi.C11915g1;
import vi.C11953w0;

/* renamed from: io.grpc.internal.f0 */
/* loaded from: classes3.dex */
public final class C8846f0 extends C8879n1 {

    /* renamed from: b */
    private boolean f20414b;

    /* renamed from: c */
    private final C11915g1 f20415c;

    /* renamed from: d */
    private final InterfaceC8892r.a f20416d;

    /* renamed from: e */
    private final AbstractC11925k[] f20417e;

    public C8846f0(C11915g1 c11915g1, InterfaceC8892r.a aVar, AbstractC11925k[] abstractC11925kArr) {
        C7159o.m21302e(!c11915g1.m38145p(), "error must not be OK");
        this.f20415c = c11915g1;
        this.f20416d = aVar;
        this.f20417e = abstractC11925kArr;
    }

    public C8846f0(C11915g1 c11915g1, AbstractC11925k[] abstractC11925kArr) {
        this(c11915g1, InterfaceC8892r.a.PROCESSED, abstractC11925kArr);
    }

    @Override // io.grpc.internal.C8879n1, io.grpc.internal.InterfaceC8889q
    /* renamed from: m */
    public void mo25201m(C8908w0 c8908w0) {
        c8908w0.m25876b("error", this.f20415c).m25876b("progress", this.f20416d);
    }

    @Override // io.grpc.internal.C8879n1, io.grpc.internal.InterfaceC8889q
    /* renamed from: o */
    public void mo25203o(InterfaceC8892r interfaceC8892r) {
        C7159o.m21319v(!this.f20414b, "already started");
        this.f20414b = true;
        for (AbstractC11925k abstractC11925k : this.f20417e) {
            abstractC11925k.mo9633i(this.f20415c);
        }
        interfaceC8892r.mo25293d(this.f20415c, this.f20416d, new C11953w0());
    }
}
