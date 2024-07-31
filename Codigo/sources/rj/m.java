package rj;

import dj.p;
import dj.q;

/* loaded from: classes3.dex */
public final class m<T> extends rj.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final p<? extends T> f25031b;

    /* loaded from: classes3.dex */
    static final class a<T> implements q<T> {

        /* renamed from: a, reason: collision with root package name */
        final q<? super T> f25032a;

        /* renamed from: b, reason: collision with root package name */
        final p<? extends T> f25033b;

        /* renamed from: d, reason: collision with root package name */
        boolean f25035d = true;

        /* renamed from: c, reason: collision with root package name */
        final kj.e f25034c = new kj.e();

        a(q<? super T> qVar, p<? extends T> pVar) {
            this.f25032a = qVar;
            this.f25033b = pVar;
        }

        @Override // dj.q
        public void a() {
            if (!this.f25035d) {
                this.f25032a.a();
            } else {
                this.f25035d = false;
                this.f25033b.d(this);
            }
        }

        @Override // dj.q
        public void b(gj.b bVar) {
            this.f25034c.b(bVar);
        }

        @Override // dj.q
        public void c(T t10) {
            if (this.f25035d) {
                this.f25035d = false;
            }
            this.f25032a.c(t10);
        }

        @Override // dj.q
        public void onError(Throwable th2) {
            this.f25032a.onError(th2);
        }
    }

    public m(p<T> pVar, p<? extends T> pVar2) {
        super(pVar);
        this.f25031b = pVar2;
    }

    @Override // dj.o
    public void s(q<? super T> qVar) {
        a aVar = new a(qVar, this.f25031b);
        qVar.b(aVar.f25034c);
        this.f24957a.d(aVar);
    }
}
