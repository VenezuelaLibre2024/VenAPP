package p339rj;

import dj.InterfaceC6978c;
import dj.InterfaceC6979d;
import dj.InterfaceC6991p;
import dj.InterfaceC6992q;
import java.util.concurrent.atomic.AtomicReference;
import p123gj.C7577a;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p186jj.InterfaceC9077e;
import p205kj.EnumC9284b;
import p224lj.C9513b;
import p256nj.AbstractC9723b;
import p449xj.C12500c;
import p471yj.C12727a;

/* renamed from: rj.g */
/* loaded from: classes3.dex */
public final class C10716g<T> extends AbstractC10710a<T, T> {

    /* renamed from: b */
    final InterfaceC9077e<? super T, ? extends InterfaceC6979d> f27115b;

    /* renamed from: c */
    final boolean f27116c;

    /* renamed from: rj.g$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AbstractC9723b<T> implements InterfaceC6992q<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: a */
        final InterfaceC6992q<? super T> f27117a;

        /* renamed from: c */
        final InterfaceC9077e<? super T, ? extends InterfaceC6979d> f27119c;

        /* renamed from: d */
        final boolean f27120d;

        /* renamed from: f */
        InterfaceC7578b f27122f;

        /* renamed from: r */
        volatile boolean f27123r;

        /* renamed from: b */
        final C12500c f27118b = new C12500c();

        /* renamed from: e */
        final C7577a f27121e = new C7577a();

        /* renamed from: rj.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C13246a extends AtomicReference<InterfaceC7578b> implements InterfaceC6978c, InterfaceC7578b {
            private static final long serialVersionUID = 8606673141535671828L;

            C13246a() {
            }

            @Override // dj.InterfaceC6978c
            /* renamed from: a */
            public void mo20210a() {
                a.this.m32602d(this);
            }

            @Override // dj.InterfaceC6978c
            /* renamed from: b */
            public void mo20211b(InterfaceC7578b interfaceC7578b) {
                EnumC9284b.m27697o(this, interfaceC7578b);
            }

            @Override // p123gj.InterfaceC7578b
            public void dispose() {
                EnumC9284b.m27692b(this);
            }

            @Override // p123gj.InterfaceC7578b
            /* renamed from: h */
            public boolean mo616h() {
                return EnumC9284b.m27693i(get());
            }

            @Override // dj.InterfaceC6978c
            public void onError(Throwable th2) {
                a.this.m32603e(this, th2);
            }
        }

        a(InterfaceC6992q<? super T> interfaceC6992q, InterfaceC9077e<? super T, ? extends InterfaceC6979d> interfaceC9077e, boolean z10) {
            this.f27117a = interfaceC6992q;
            this.f27119c = interfaceC9077e;
            this.f27120d = z10;
            lazySet(1);
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: a */
        public void mo605a() {
            if (decrementAndGet() == 0) {
                Throwable m40927b = this.f27118b.m40927b();
                if (m40927b != null) {
                    this.f27117a.onError(m40927b);
                } else {
                    this.f27117a.mo605a();
                }
            }
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: b */
        public void mo606b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27698p(this.f27122f, interfaceC7578b)) {
                this.f27122f = interfaceC7578b;
                this.f27117a.mo606b(this);
            }
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: c */
        public void mo607c(T t10) {
            try {
                InterfaceC6979d interfaceC6979d = (InterfaceC6979d) C9513b.m28324d(this.f27119c.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C13246a c13246a = new C13246a();
                if (this.f27123r || !this.f27121e.mo23021b(c13246a)) {
                    return;
                }
                interfaceC6979d.mo20199a(c13246a);
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                this.f27122f.dispose();
                onError(th2);
            }
        }

        @Override // p241mj.InterfaceC9600j
        public void clear() {
        }

        /* renamed from: d */
        void m32602d(a<T>.C13246a c13246a) {
            this.f27121e.mo23022c(c13246a);
            mo605a();
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            this.f27123r = true;
            this.f27122f.dispose();
            this.f27121e.dispose();
        }

        /* renamed from: e */
        void m32603e(a<T>.C13246a c13246a, Throwable th2) {
            this.f27121e.mo23022c(c13246a);
            onError(th2);
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f27122f.mo616h();
        }

        @Override // p241mj.InterfaceC9600j
        public boolean isEmpty() {
            return true;
        }

        @Override // p241mj.InterfaceC9596f
        /* renamed from: l */
        public int mo27706l(int i10) {
            return i10 & 2;
        }

        @Override // dj.InterfaceC6992q
        public void onError(Throwable th2) {
            if (!this.f27118b.m40926a(th2)) {
                C12727a.m41995q(th2);
                return;
            }
            if (!this.f27120d) {
                dispose();
                if (getAndSet(0) <= 0) {
                    return;
                }
            } else if (decrementAndGet() != 0) {
                return;
            }
            this.f27117a.onError(this.f27118b.m40927b());
        }

        @Override // p241mj.InterfaceC9600j
        public T poll() {
            return null;
        }
    }

    public C10716g(InterfaceC6991p<T> interfaceC6991p, InterfaceC9077e<? super T, ? extends InterfaceC6979d> interfaceC9077e, boolean z10) {
        super(interfaceC6991p);
        this.f27115b = interfaceC9077e;
        this.f27116c = z10;
    }

    @Override // dj.AbstractC6990o
    /* renamed from: s */
    protected void mo608s(InterfaceC6992q<? super T> interfaceC6992q) {
        this.f27073a.mo20285d(new a(interfaceC6992q, this.f27115b, this.f27116c));
    }
}
