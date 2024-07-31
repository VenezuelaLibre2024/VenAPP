package io.grpc.internal;

import io.grpc.internal.InterfaceC8892r;
import p082eb.C7159o;
import vi.AbstractC11925k;
import vi.C11901c;
import vi.C11915g1;
import vi.C11920i0;
import vi.C11953w0;
import vi.C11955x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.grpc.internal.g0 */
/* loaded from: classes3.dex */
public class C8850g0 implements InterfaceC8895s {

    /* renamed from: a */
    final C11915g1 f20582a;

    /* renamed from: b */
    private final InterfaceC8892r.a f20583b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8850g0(C11915g1 c11915g1, InterfaceC8892r.a aVar) {
        C7159o.m21302e(!c11915g1.m38145p(), "error must not be OK");
        this.f20582a = c11915g1;
        this.f20583b = aVar;
    }

    @Override // io.grpc.internal.InterfaceC8895s
    /* renamed from: c */
    public InterfaceC8889q mo25245c(C11955x0<?, ?> c11955x0, C11953w0 c11953w0, C11901c c11901c, AbstractC11925k[] abstractC11925kArr) {
        return new C8846f0(this.f20582a, this.f20583b, abstractC11925kArr);
    }

    @Override // vi.InterfaceC11935n0
    /* renamed from: e */
    public C11920i0 mo25247e() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
