package p339rj;

import dj.AbstractC6977b;
import dj.AbstractC6990o;
import dj.InterfaceC6978c;
import dj.InterfaceC6979d;
import dj.InterfaceC6991p;
import dj.InterfaceC6992q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p123gj.C7577a;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p186jj.InterfaceC9077e;
import p205kj.EnumC9284b;
import p224lj.C9513b;
import p241mj.InterfaceC9594d;
import p449xj.C12500c;
import p471yj.C12727a;

/* renamed from: rj.h */
/* loaded from: classes3.dex */
public final class C10717h<T> extends AbstractC6977b implements InterfaceC9594d<T> {

    /* renamed from: a */
    final InterfaceC6991p<T> f27125a;

    /* renamed from: b */
    final InterfaceC9077e<? super T, ? extends InterfaceC6979d> f27126b;

    /* renamed from: c */
    final boolean f27127c;

    /* renamed from: rj.h$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements InterfaceC7578b, InterfaceC6992q<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: a */
        final InterfaceC6978c f27128a;

        /* renamed from: c */
        final InterfaceC9077e<? super T, ? extends InterfaceC6979d> f27130c;

        /* renamed from: d */
        final boolean f27131d;

        /* renamed from: f */
        InterfaceC7578b f27133f;

        /* renamed from: r */
        volatile boolean f27134r;

        /* renamed from: b */
        final C12500c f27129b = new C12500c();

        /* renamed from: e */
        final C7577a f27132e = new C7577a();

        /* renamed from: rj.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C13247a extends AtomicReference<InterfaceC7578b> implements InterfaceC6978c, InterfaceC7578b {
            private static final long serialVersionUID = 8606673141535671828L;

            C13247a() {
            }

            @Override // dj.InterfaceC6978c
            /* renamed from: a */
            public void mo20210a() {
                a.this.m32604d(this);
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
                a.this.m32605e(this, th2);
            }
        }

        a(InterfaceC6978c interfaceC6978c, InterfaceC9077e<? super T, ? extends InterfaceC6979d> interfaceC9077e, boolean z10) {
            this.f27128a = interfaceC6978c;
            this.f27130c = interfaceC9077e;
            this.f27131d = z10;
            lazySet(1);
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: a */
        public void mo605a() {
            if (decrementAndGet() == 0) {
                Throwable m40927b = this.f27129b.m40927b();
                if (m40927b != null) {
                    this.f27128a.onError(m40927b);
                } else {
                    this.f27128a.mo20210a();
                }
            }
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: b */
        public void mo606b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27698p(this.f27133f, interfaceC7578b)) {
                this.f27133f = interfaceC7578b;
                this.f27128a.mo20211b(this);
            }
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: c */
        public void mo607c(T t10) {
            try {
                InterfaceC6979d interfaceC6979d = (InterfaceC6979d) C9513b.m28324d(this.f27130c.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C13247a c13247a = new C13247a();
                if (this.f27134r || !this.f27132e.mo23021b(c13247a)) {
                    return;
                }
                interfaceC6979d.mo20199a(c13247a);
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                this.f27133f.dispose();
                onError(th2);
            }
        }

        /* renamed from: d */
        void m32604d(a<T>.C13247a c13247a) {
            this.f27132e.mo23022c(c13247a);
            mo605a();
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            this.f27134r = true;
            this.f27133f.dispose();
            this.f27132e.dispose();
        }

        /* renamed from: e */
        void m32605e(a<T>.C13247a c13247a, Throwable th2) {
            this.f27132e.mo23022c(c13247a);
            onError(th2);
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f27133f.mo616h();
        }

        @Override // dj.InterfaceC6992q
        public void onError(Throwable th2) {
            if (!this.f27129b.m40926a(th2)) {
                C12727a.m41995q(th2);
                return;
            }
            if (!this.f27131d) {
                dispose();
                if (getAndSet(0) <= 0) {
                    return;
                }
            } else if (decrementAndGet() != 0) {
                return;
            }
            this.f27128a.onError(this.f27129b.m40927b());
        }
    }

    public C10717h(InterfaceC6991p<T> interfaceC6991p, InterfaceC9077e<? super T, ? extends InterfaceC6979d> interfaceC9077e, boolean z10) {
        this.f27125a = interfaceC6991p;
        this.f27126b = interfaceC9077e;
        this.f27127c = z10;
    }

    @Override // p241mj.InterfaceC9594d
    /* renamed from: b */
    public AbstractC6990o<T> mo28589b() {
        return C12727a.m41991m(new C10716g(this.f27125a, this.f27126b, this.f27127c));
    }

    @Override // dj.AbstractC6977b
    /* renamed from: p */
    protected void mo20208p(InterfaceC6978c interfaceC6978c) {
        this.f27125a.mo20285d(new a(interfaceC6978c, this.f27126b, this.f27127c));
    }
}
