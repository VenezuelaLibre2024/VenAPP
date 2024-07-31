package io.grpc.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.grpc.internal.m */
/* loaded from: classes3.dex */
public final class C8873m {

    /* renamed from: f */
    static final b f20728f = new a();

    /* renamed from: a */
    private final InterfaceC8868k2 f20729a;

    /* renamed from: b */
    private final InterfaceC8839d1 f20730b = C8843e1.m25423a();

    /* renamed from: c */
    private final InterfaceC8839d1 f20731c = C8843e1.m25423a();

    /* renamed from: d */
    private final InterfaceC8839d1 f20732d = C8843e1.m25423a();

    /* renamed from: e */
    private volatile long f20733e;

    /* renamed from: io.grpc.internal.m$a */
    /* loaded from: classes3.dex */
    class a implements b {
        a() {
        }

        @Override // io.grpc.internal.C8873m.b
        /* renamed from: a */
        public C8873m mo25521a() {
            return new C8873m(InterfaceC8868k2.f20692a);
        }
    }

    /* renamed from: io.grpc.internal.m$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        C8873m mo25521a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8873m(InterfaceC8868k2 interfaceC8868k2) {
        this.f20729a = interfaceC8868k2;
    }

    /* renamed from: a */
    public void m25669a(boolean z10) {
        (z10 ? this.f20731c : this.f20732d).add(1L);
    }

    /* renamed from: b */
    public void m25670b() {
        this.f20730b.add(1L);
        this.f20733e = this.f20729a.mo25639a();
    }
}
