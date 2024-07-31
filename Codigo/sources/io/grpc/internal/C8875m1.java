package io.grpc.internal;

import p082eb.C7159o;
import vi.AbstractC11898b;
import vi.AbstractC11925k;
import vi.C11901c;
import vi.C11915g1;
import vi.C11942r;
import vi.C11953w0;
import vi.C11955x0;

/* renamed from: io.grpc.internal.m1 */
/* loaded from: classes3.dex */
final class C8875m1 extends AbstractC11898b.a {

    /* renamed from: a */
    private final InterfaceC8895s f20735a;

    /* renamed from: b */
    private final C11955x0<?, ?> f20736b;

    /* renamed from: c */
    private final C11953w0 f20737c;

    /* renamed from: d */
    private final C11901c f20738d;

    /* renamed from: f */
    private final a f20740f;

    /* renamed from: g */
    private final AbstractC11925k[] f20741g;

    /* renamed from: i */
    private InterfaceC8889q f20743i;

    /* renamed from: j */
    boolean f20744j;

    /* renamed from: k */
    C8830b0 f20745k;

    /* renamed from: h */
    private final Object f20742h = new Object();

    /* renamed from: e */
    private final C11942r f20739e = C11942r.m38242e();

    /* renamed from: io.grpc.internal.m1$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo25647a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8875m1(InterfaceC8895s interfaceC8895s, C11955x0<?, ?> c11955x0, C11953w0 c11953w0, C11901c c11901c, a aVar, AbstractC11925k[] abstractC11925kArr) {
        this.f20735a = interfaceC8895s;
        this.f20736b = c11955x0;
        this.f20737c = c11953w0;
        this.f20738d = c11901c;
        this.f20740f = aVar;
        this.f20741g = abstractC11925kArr;
    }

    /* renamed from: b */
    private void m25672b(InterfaceC8889q interfaceC8889q) {
        boolean z10;
        C7159o.m21319v(!this.f20744j, "already finalized");
        this.f20744j = true;
        synchronized (this.f20742h) {
            if (this.f20743i == null) {
                this.f20743i = interfaceC8889q;
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (!z10) {
            C7159o.m21319v(this.f20745k != null, "delayedStream is null");
            Runnable m25287w = this.f20745k.m25287w(interfaceC8889q);
            if (m25287w != null) {
                m25287w.run();
            }
        }
        this.f20740f.mo25647a();
    }

    /* renamed from: a */
    public void m25673a(C11915g1 c11915g1) {
        C7159o.m21302e(!c11915g1.m38145p(), "Cannot fail with OK status");
        C7159o.m21319v(!this.f20744j, "apply() or fail() already called");
        m25672b(new C8846f0(C8890q0.m25757n(c11915g1), this.f20741g));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public InterfaceC8889q m25674c() {
        synchronized (this.f20742h) {
            InterfaceC8889q interfaceC8889q = this.f20743i;
            if (interfaceC8889q != null) {
                return interfaceC8889q;
            }
            C8830b0 c8830b0 = new C8830b0();
            this.f20745k = c8830b0;
            this.f20743i = c8830b0;
            return c8830b0;
        }
    }
}
