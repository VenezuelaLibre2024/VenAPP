package io.grpc.internal;

import io.flutter.plugins.firebase.crashlytics.Constants;
import io.grpc.internal.C8845f;
import io.grpc.internal.C8867k1;
import io.grpc.internal.InterfaceC8864j2;
import java.io.InputStream;
import p044cj.C2013b;
import p044cj.C2014c;
import p082eb.C7159o;
import vi.InterfaceC11928l;
import vi.InterfaceC11934n;
import vi.InterfaceC11948u;

/* renamed from: io.grpc.internal.d */
/* loaded from: classes3.dex */
public abstract class AbstractC8837d implements InterfaceC8860i2 {

    /* renamed from: io.grpc.internal.d$a */
    /* loaded from: classes3.dex */
    public static abstract class a implements C8845f.h, C8867k1.b {

        /* renamed from: a */
        private InterfaceC8913y f20366a;

        /* renamed from: b */
        private final Object f20367b = new Object();

        /* renamed from: c */
        private final C8856h2 f20368c;

        /* renamed from: d */
        private final C8880n2 f20369d;

        /* renamed from: e */
        private final C8867k1 f20370e;

        /* renamed from: f */
        private int f20371f;

        /* renamed from: g */
        private boolean f20372g;

        /* renamed from: h */
        private boolean f20373h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.grpc.internal.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC13214a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2013b f20374a;

            /* renamed from: b */
            final /* synthetic */ int f20375b;

            RunnableC13214a(C2013b c2013b, int i10) {
                this.f20374a = c2013b;
                this.f20375b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2014c.m10322f("AbstractStream.request");
                C2014c.m10320d(this.f20374a);
                try {
                    a.this.f20366a.mo25436b(this.f20375b);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a(int i10, C8856h2 c8856h2, C8880n2 c8880n2) {
            this.f20368c = (C8856h2) C7159o.m21313p(c8856h2, "statsTraceCtx");
            this.f20369d = (C8880n2) C7159o.m21313p(c8880n2, "transportTracer");
            C8867k1 c8867k1 = new C8867k1(this, InterfaceC11928l.b.f31595a, i10, c8856h2, c8880n2);
            this.f20370e = c8867k1;
            this.f20366a = c8867k1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public boolean m25370n() {
            boolean z10;
            synchronized (this.f20367b) {
                z10 = this.f20372g && this.f20371f < 32768 && !this.f20373h;
            }
            return z10;
        }

        /* renamed from: p */
        private void m25371p() {
            boolean m25370n;
            synchronized (this.f20367b) {
                m25370n = m25370n();
            }
            if (m25370n) {
                mo25234o().mo25292c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public void m25372q(int i10) {
            synchronized (this.f20367b) {
                this.f20371f += i10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public void m25373u(int i10) {
            mo25574f(new RunnableC13214a(C2014c.m10321e(), i10));
        }

        @Override // io.grpc.internal.C8867k1.b
        /* renamed from: a */
        public void mo25374a(InterfaceC8864j2.a aVar) {
            mo25234o().mo25290a(aVar);
        }

        /* renamed from: b */
        public final void m25375b(int i10) {
            boolean z10;
            synchronized (this.f20367b) {
                C7159o.m21319v(this.f20372g, "onStreamAllocated was not called, but it seems the stream is active");
                int i11 = this.f20371f;
                z10 = true;
                boolean z11 = i11 < 32768;
                int i12 = i11 - i10;
                this.f20371f = i12;
                boolean z12 = i12 < 32768;
                if (z11 || !z12) {
                    z10 = false;
                }
            }
            if (z10) {
                m25371p();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: k */
        public final void m25376k(boolean z10) {
            if (z10) {
                this.f20366a.close();
            } else {
                this.f20366a.mo25440i();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: l */
        public final void m25377l(InterfaceC8903u1 interfaceC8903u1) {
            try {
                this.f20366a.mo25438f(interfaceC8903u1);
            } catch (Throwable th2) {
                mo25572d(th2);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: m */
        public C8880n2 m25378m() {
            return this.f20369d;
        }

        /* renamed from: o */
        protected abstract InterfaceC8864j2 mo25234o();

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: r */
        public void mo25379r() {
            C7159o.m21318u(mo25234o() != null);
            synchronized (this.f20367b) {
                C7159o.m21319v(this.f20372g ? false : true, "Already allocated");
                this.f20372g = true;
            }
            m25371p();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: s */
        public final void m25380s() {
            synchronized (this.f20367b) {
                this.f20373h = true;
            }
        }

        /* renamed from: t */
        final void m25381t() {
            this.f20370e.m25635E(this);
            this.f20366a = this.f20370e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: v */
        public final void m25382v(InterfaceC11948u interfaceC11948u) {
            this.f20366a.mo25439g(interfaceC11948u);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: w */
        public void m25383w(C8893r0 c8893r0) {
            this.f20370e.m25634B(c8893r0);
            this.f20366a = new C8845f(this, this, this.f20370e);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x */
        public final void m25384x(int i10) {
            this.f20366a.mo25437e(i10);
        }
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: a */
    public final void mo25282a(InterfaceC11934n interfaceC11934n) {
        mo25205r().mo25211a((InterfaceC11934n) C7159o.m21313p(interfaceC11934n, "compressor"));
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: b */
    public final void mo25283b(int i10) {
        mo25206t().m25373u(i10);
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: d */
    public boolean mo25195d() {
        return mo25206t().m25370n();
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    public final void flush() {
        if (mo25205r().isClosed()) {
            return;
        }
        mo25205r().flush();
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: h */
    public final void mo25284h(InputStream inputStream) {
        C7159o.m21313p(inputStream, Constants.MESSAGE);
        try {
            if (!mo25205r().isClosed()) {
                mo25205r().mo25212b(inputStream);
            }
        } finally {
            C8890q0.m25748e(inputStream);
        }
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: i */
    public void mo25285i() {
        mo25206t().m25381t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public final void m25364q() {
        mo25205r().close();
    }

    /* renamed from: r */
    protected abstract InterfaceC8882o0 mo25205r();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final void m25365s(int i10) {
        mo25206t().m25372q(i10);
    }

    /* renamed from: t */
    protected abstract a mo25206t();
}
