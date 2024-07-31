package io.grpc.internal;

import io.grpc.internal.InterfaceC8863j1;
import io.grpc.internal.InterfaceC8895s;
import java.util.concurrent.Executor;
import p082eb.C7153i;
import vi.AbstractC11925k;
import vi.C11901c;
import vi.C11915g1;
import vi.C11920i0;
import vi.C11953w0;
import vi.C11955x0;

/* renamed from: io.grpc.internal.j0 */
/* loaded from: classes3.dex */
abstract class AbstractC8862j0 implements InterfaceC8904v {
    /* renamed from: a */
    protected abstract InterfaceC8904v mo25624a();

    @Override // io.grpc.internal.InterfaceC8863j1
    /* renamed from: b */
    public void mo25244b(C11915g1 c11915g1) {
        mo25624a().mo25244b(c11915g1);
    }

    @Override // io.grpc.internal.InterfaceC8895s
    /* renamed from: c */
    public InterfaceC8889q mo25245c(C11955x0<?, ?> c11955x0, C11953w0 c11953w0, C11901c c11901c, AbstractC11925k[] abstractC11925kArr) {
        return mo25624a().mo25245c(c11955x0, c11953w0, c11901c, abstractC11925kArr);
    }

    @Override // io.grpc.internal.InterfaceC8863j1
    /* renamed from: d */
    public void mo25246d(C11915g1 c11915g1) {
        mo25624a().mo25246d(c11915g1);
    }

    @Override // vi.InterfaceC11935n0
    /* renamed from: e */
    public C11920i0 mo25247e() {
        return mo25624a().mo25247e();
    }

    @Override // io.grpc.internal.InterfaceC8895s
    /* renamed from: f */
    public void mo25625f(InterfaceC8895s.a aVar, Executor executor) {
        mo25624a().mo25625f(aVar, executor);
    }

    @Override // io.grpc.internal.InterfaceC8863j1
    /* renamed from: g */
    public Runnable mo25248g(InterfaceC8863j1.a aVar) {
        return mo25624a().mo25248g(aVar);
    }

    public String toString() {
        return C7153i.m21274c(this).m21284d("delegate", mo25624a()).toString();
    }
}
