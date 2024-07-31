package oj;

/* loaded from: classes3.dex */
public final class h extends dj.b {

    /* renamed from: a, reason: collision with root package name */
    final dj.d f22682a;

    /* renamed from: b, reason: collision with root package name */
    final jj.e<? super Throwable, ? extends dj.d> f22683b;

    /* loaded from: classes3.dex */
    final class a implements dj.c {

        /* renamed from: a, reason: collision with root package name */
        final dj.c f22684a;

        /* renamed from: b, reason: collision with root package name */
        final kj.e f22685b;

        /* renamed from: oj.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0374a implements dj.c {
            C0374a() {
            }

            @Override // dj.c
            public void a() {
                a.this.f22684a.a();
            }

            @Override // dj.c
            public void b(gj.b bVar) {
                a.this.f22685b.b(bVar);
            }

            @Override // dj.c
            public void onError(Throwable th2) {
                a.this.f22684a.onError(th2);
            }
        }

        a(dj.c cVar, kj.e eVar) {
            this.f22684a = cVar;
            this.f22685b = eVar;
        }

        @Override // dj.c
        public void a() {
            this.f22684a.a();
        }

        @Override // dj.c
        public void b(gj.b bVar) {
            this.f22685b.b(bVar);
        }

        @Override // dj.c
        public void onError(Throwable th2) {
            try {
                dj.d apply = h.this.f22683b.apply(th2);
                if (apply != null) {
                    apply.a(new C0374a());
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("The CompletableConsumable returned is null");
                nullPointerException.initCause(th2);
                this.f22684a.onError(nullPointerException);
            } catch (Throwable th3) {
                hj.b.b(th3);
                this.f22684a.onError(new hj.a(th3, th2));
            }
        }
    }

    public h(dj.d dVar, jj.e<? super Throwable, ? extends dj.d> eVar) {
        this.f22682a = dVar;
        this.f22683b = eVar;
    }

    @Override // dj.b
    protected void p(dj.c cVar) {
        kj.e eVar = new kj.e();
        cVar.b(eVar);
        this.f22682a.a(new a(cVar, eVar));
    }
}
