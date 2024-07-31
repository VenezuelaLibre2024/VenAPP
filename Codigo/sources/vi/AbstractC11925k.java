package vi;

import p082eb.C7153i;
import p082eb.C7159o;

/* renamed from: vi.k */
/* loaded from: classes3.dex */
public abstract class AbstractC11925k extends AbstractC11924j1 {

    /* renamed from: vi.k$a */
    /* loaded from: classes3.dex */
    public static abstract class a {
        /* renamed from: a */
        public AbstractC11925k mo9634a(b bVar, C11953w0 c11953w0) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* renamed from: vi.k$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final C11901c f31572a;

        /* renamed from: b */
        private final int f31573b;

        /* renamed from: c */
        private final boolean f31574c;

        /* renamed from: vi.k$b$a */
        /* loaded from: classes3.dex */
        public static final class a {

            /* renamed from: a */
            private C11901c f31575a = C11901c.f31481k;

            /* renamed from: b */
            private int f31576b;

            /* renamed from: c */
            private boolean f31577c;

            a() {
            }

            /* renamed from: a */
            public b m38184a() {
                return new b(this.f31575a, this.f31576b, this.f31577c);
            }

            /* renamed from: b */
            public a m38185b(C11901c c11901c) {
                this.f31575a = (C11901c) C7159o.m21313p(c11901c, "callOptions cannot be null");
                return this;
            }

            /* renamed from: c */
            public a m38186c(boolean z10) {
                this.f31577c = z10;
                return this;
            }

            /* renamed from: d */
            public a m38187d(int i10) {
                this.f31576b = i10;
                return this;
            }
        }

        b(C11901c c11901c, int i10, boolean z10) {
            this.f31572a = (C11901c) C7159o.m21313p(c11901c, "callOptions");
            this.f31573b = i10;
            this.f31574c = z10;
        }

        /* renamed from: a */
        public static a m38183a() {
            return new a();
        }

        public String toString() {
            return C7153i.m21274c(this).m21284d("callOptions", this.f31572a).m21282b("previousAttempts", this.f31573b).m21285e("isTransparentRetry", this.f31574c).toString();
        }
    }

    /* renamed from: j */
    public void m38179j() {
    }

    /* renamed from: k */
    public void m38180k(C11953w0 c11953w0) {
    }

    /* renamed from: l */
    public void m38181l() {
    }

    /* renamed from: m */
    public void m38182m(C11895a c11895a, C11953w0 c11953w0) {
    }
}
