package qj;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class r<T> extends qj.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final dj.r f24107b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<gj.b> implements dj.l<T>, gj.b {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: a, reason: collision with root package name */
        final kj.e f24108a = new kj.e();

        /* renamed from: b, reason: collision with root package name */
        final dj.l<? super T> f24109b;

        a(dj.l<? super T> lVar) {
            this.f24109b = lVar;
        }

        @Override // dj.l
        public void a() {
            this.f24109b.a();
        }

        @Override // dj.l
        public void b(gj.b bVar) {
            kj.b.o(this, bVar);
        }

        @Override // gj.b
        public void dispose() {
            kj.b.b(this);
            this.f24108a.dispose();
        }

        @Override // gj.b
        public boolean h() {
            return kj.b.i(get());
        }

        @Override // dj.l
        public void onError(Throwable th2) {
            this.f24109b.onError(th2);
        }

        @Override // dj.l
        public void onSuccess(T t10) {
            this.f24109b.onSuccess(t10);
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final dj.l<? super T> f24110a;

        /* renamed from: b, reason: collision with root package name */
        final dj.n<T> f24111b;

        b(dj.l<? super T> lVar, dj.n<T> nVar) {
            this.f24110a = lVar;
            this.f24111b = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24111b.a(this.f24110a);
        }
    }

    public r(dj.n<T> nVar, dj.r rVar) {
        super(nVar);
        this.f24107b = rVar;
    }

    @Override // dj.j
    protected void u(dj.l<? super T> lVar) {
        a aVar = new a(lVar);
        lVar.b(aVar);
        aVar.f24108a.a(this.f24107b.b(new b(aVar, this.f24047a)));
    }
}
