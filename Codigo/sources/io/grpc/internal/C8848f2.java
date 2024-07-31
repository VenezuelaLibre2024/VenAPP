package io.grpc.internal;

import io.grpc.internal.C8844e2;

/* renamed from: io.grpc.internal.f2 */
/* loaded from: classes3.dex */
public final class C8848f2<T> implements InterfaceC8883o1<T> {

    /* renamed from: a */
    private final C8844e2.d<T> f20572a;

    private C8848f2(C8844e2.d<T> dVar) {
        this.f20572a = dVar;
    }

    /* renamed from: c */
    public static <T> C8848f2<T> m25567c(C8844e2.d<T> dVar) {
        return new C8848f2<>(dVar);
    }

    @Override // io.grpc.internal.InterfaceC8883o1
    /* renamed from: a */
    public T mo25568a() {
        return (T) C8844e2.m25427d(this.f20572a);
    }

    @Override // io.grpc.internal.InterfaceC8883o1
    /* renamed from: b */
    public T mo25569b(Object obj) {
        C8844e2.m25428f(this.f20572a, obj);
        return null;
    }
}
