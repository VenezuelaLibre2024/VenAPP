package rj;

import dj.p;
import dj.q;

/* loaded from: classes3.dex */
public final class b<T> extends rj.a<T, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final jj.g<? super T> f24958b;

    /* loaded from: classes3.dex */
    static final class a<T> implements q<T>, gj.b {

        /* renamed from: a, reason: collision with root package name */
        final q<? super Boolean> f24959a;

        /* renamed from: b, reason: collision with root package name */
        final jj.g<? super T> f24960b;

        /* renamed from: c, reason: collision with root package name */
        gj.b f24961c;

        /* renamed from: d, reason: collision with root package name */
        boolean f24962d;

        a(q<? super Boolean> qVar, jj.g<? super T> gVar) {
            this.f24959a = qVar;
            this.f24960b = gVar;
        }

        @Override // dj.q
        public void a() {
            if (this.f24962d) {
                return;
            }
            this.f24962d = true;
            this.f24959a.c(Boolean.FALSE);
            this.f24959a.a();
        }

        @Override // dj.q
        public void b(gj.b bVar) {
            if (kj.b.p(this.f24961c, bVar)) {
                this.f24961c = bVar;
                this.f24959a.b(this);
            }
        }

        @Override // dj.q
        public void c(T t10) {
            if (this.f24962d) {
                return;
            }
            try {
                if (this.f24960b.test(t10)) {
                    this.f24962d = true;
                    this.f24961c.dispose();
                    this.f24959a.c(Boolean.TRUE);
                    this.f24959a.a();
                }
            } catch (Throwable th2) {
                hj.b.b(th2);
                this.f24961c.dispose();
                onError(th2);
            }
        }

        @Override // gj.b
        public void dispose() {
            this.f24961c.dispose();
        }

        @Override // gj.b
        public boolean h() {
            return this.f24961c.h();
        }

        @Override // dj.q
        public void onError(Throwable th2) {
            if (this.f24962d) {
                yj.a.q(th2);
            } else {
                this.f24962d = true;
                this.f24959a.onError(th2);
            }
        }
    }

    public b(p<T> pVar, jj.g<? super T> gVar) {
        super(pVar);
        this.f24958b = gVar;
    }

    @Override // dj.o
    protected void s(q<? super Boolean> qVar) {
        this.f24957a.d(new a(qVar, this.f24958b));
    }
}
