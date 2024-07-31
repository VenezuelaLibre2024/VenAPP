package oj;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class a extends dj.b {

    /* renamed from: a, reason: collision with root package name */
    final dj.d[] f22659a;

    /* renamed from: oj.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0373a extends AtomicInteger implements dj.c {
        private static final long serialVersionUID = -7965400327305809232L;

        /* renamed from: a, reason: collision with root package name */
        final dj.c f22660a;

        /* renamed from: b, reason: collision with root package name */
        final dj.d[] f22661b;

        /* renamed from: c, reason: collision with root package name */
        int f22662c;

        /* renamed from: d, reason: collision with root package name */
        final kj.e f22663d = new kj.e();

        C0373a(dj.c cVar, dj.d[] dVarArr) {
            this.f22660a = cVar;
            this.f22661b = dVarArr;
        }

        @Override // dj.c
        public void a() {
            c();
        }

        @Override // dj.c
        public void b(gj.b bVar) {
            this.f22663d.a(bVar);
        }

        void c() {
            if (!this.f22663d.h() && getAndIncrement() == 0) {
                dj.d[] dVarArr = this.f22661b;
                while (!this.f22663d.h()) {
                    int i10 = this.f22662c;
                    this.f22662c = i10 + 1;
                    if (i10 == dVarArr.length) {
                        this.f22660a.a();
                        return;
                    } else {
                        dVarArr[i10].a(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // dj.c
        public void onError(Throwable th2) {
            this.f22660a.onError(th2);
        }
    }

    public a(dj.d[] dVarArr) {
        this.f22659a = dVarArr;
    }

    @Override // dj.b
    public void p(dj.c cVar) {
        C0373a c0373a = new C0373a(cVar, this.f22659a);
        cVar.b(c0373a.f22663d);
        c0373a.c();
    }
}
