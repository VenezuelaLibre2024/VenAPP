package io.grpc.internal;

import p082eb.C7159o;

/* renamed from: io.grpc.internal.n2 */
/* loaded from: classes3.dex */
public final class C8880n2 {

    /* renamed from: l */
    private static final b f20751l = new b(InterfaceC8868k2.f20692a);

    /* renamed from: a */
    private final InterfaceC8868k2 f20752a;

    /* renamed from: b */
    private long f20753b;

    /* renamed from: c */
    private long f20754c;

    /* renamed from: d */
    private long f20755d;

    /* renamed from: e */
    private long f20756e;

    /* renamed from: f */
    private long f20757f;

    /* renamed from: g */
    private c f20758g;

    /* renamed from: h */
    private long f20759h;

    /* renamed from: i */
    private long f20760i;

    /* renamed from: j */
    private final InterfaceC8839d1 f20761j;

    /* renamed from: k */
    private volatile long f20762k;

    /* renamed from: io.grpc.internal.n2$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final InterfaceC8868k2 f20763a;

        public b(InterfaceC8868k2 interfaceC8868k2) {
            this.f20763a = interfaceC8868k2;
        }

        /* renamed from: a */
        public C8880n2 m25696a() {
            return new C8880n2(this.f20763a);
        }
    }

    /* renamed from: io.grpc.internal.n2$c */
    /* loaded from: classes3.dex */
    public interface c {
    }

    public C8880n2() {
        this.f20761j = C8843e1.m25423a();
        this.f20752a = InterfaceC8868k2.f20692a;
    }

    private C8880n2(InterfaceC8868k2 interfaceC8868k2) {
        this.f20761j = C8843e1.m25423a();
        this.f20752a = interfaceC8868k2;
    }

    /* renamed from: a */
    public static b m25689a() {
        return f20751l;
    }

    /* renamed from: b */
    public void m25690b() {
        this.f20757f++;
    }

    /* renamed from: c */
    public void m25691c() {
        this.f20753b++;
        this.f20754c = this.f20752a.mo25639a();
    }

    /* renamed from: d */
    public void m25692d() {
        this.f20761j.add(1L);
        this.f20762k = this.f20752a.mo25639a();
    }

    /* renamed from: e */
    public void m25693e(int i10) {
        if (i10 == 0) {
            return;
        }
        this.f20759h += i10;
        this.f20760i = this.f20752a.mo25639a();
    }

    /* renamed from: f */
    public void m25694f(boolean z10) {
        if (z10) {
            this.f20755d++;
        } else {
            this.f20756e++;
        }
    }

    /* renamed from: g */
    public void m25695g(c cVar) {
        this.f20758g = (c) C7159o.m21312o(cVar);
    }
}
