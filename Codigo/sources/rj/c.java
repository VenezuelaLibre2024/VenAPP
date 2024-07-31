package rj;

import dj.o;
import dj.p;
import dj.q;
import dj.s;
import dj.t;

/* loaded from: classes3.dex */
public final class c<T> extends s<Boolean> implements mj.d<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final p<T> f24963a;

    /* renamed from: b, reason: collision with root package name */
    final jj.g<? super T> f24964b;

    /* loaded from: classes3.dex */
    static final class a<T> implements q<T>, gj.b {

        /* renamed from: a, reason: collision with root package name */
        final t<? super Boolean> f24965a;

        /* renamed from: b, reason: collision with root package name */
        final jj.g<? super T> f24966b;

        /* renamed from: c, reason: collision with root package name */
        gj.b f24967c;

        /* renamed from: d, reason: collision with root package name */
        boolean f24968d;

        a(t<? super Boolean> tVar, jj.g<? super T> gVar) {
            this.f24965a = tVar;
            this.f24966b = gVar;
        }

        @Override // dj.q
        public void a() {
            if (this.f24968d) {
                return;
            }
            this.f24968d = true;
            this.f24965a.onSuccess(Boolean.FALSE);
        }

        @Override // dj.q
        public void b(gj.b bVar) {
            if (kj.b.p(this.f24967c, bVar)) {
                this.f24967c = bVar;
                this.f24965a.b(this);
            }
        }

        @Override // dj.q
        public void c(T t10) {
            if (this.f24968d) {
                return;
            }
            try {
                if (this.f24966b.test(t10)) {
                    this.f24968d = true;
                    this.f24967c.dispose();
                    this.f24965a.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                hj.b.b(th2);
                this.f24967c.dispose();
                onError(th2);
            }
        }

        @Override // gj.b
        public void dispose() {
            this.f24967c.dispose();
        }

        @Override // gj.b
        public boolean h() {
            return this.f24967c.h();
        }

        @Override // dj.q
        public void onError(Throwable th2) {
            if (this.f24968d) {
                yj.a.q(th2);
            } else {
                this.f24968d = true;
                this.f24965a.onError(th2);
            }
        }
    }

    public c(p<T> pVar, jj.g<? super T> gVar) {
        this.f24963a = pVar;
        this.f24964b = gVar;
    }

    @Override // mj.d
    public o<Boolean> b() {
        return yj.a.m(new b(this.f24963a, this.f24964b));
    }

    @Override // dj.s
    protected void k(t<? super Boolean> tVar) {
        this.f24963a.d(new a(tVar, this.f24964b));
    }
}
