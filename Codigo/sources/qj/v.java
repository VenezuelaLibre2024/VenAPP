package qj;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import qj.n;

/* loaded from: classes3.dex */
public final class v<T, R> extends dj.j<R> {

    /* renamed from: a, reason: collision with root package name */
    final dj.n<? extends T>[] f24121a;

    /* renamed from: b, reason: collision with root package name */
    final jj.e<? super Object[], ? extends R> f24122b;

    /* loaded from: classes3.dex */
    final class a implements jj.e<T, R> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // jj.e
        public R apply(T t10) {
            return (R) lj.b.d(v.this.f24122b.apply(new Object[]{t10}), "The zipper returned a null value");
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, R> extends AtomicInteger implements gj.b {
        private static final long serialVersionUID = -5556924161382950569L;

        /* renamed from: a, reason: collision with root package name */
        final dj.l<? super R> f24124a;

        /* renamed from: b, reason: collision with root package name */
        final jj.e<? super Object[], ? extends R> f24125b;

        /* renamed from: c, reason: collision with root package name */
        final c<T>[] f24126c;

        /* renamed from: d, reason: collision with root package name */
        final Object[] f24127d;

        b(dj.l<? super R> lVar, int i10, jj.e<? super Object[], ? extends R> eVar) {
            super(i10);
            this.f24124a = lVar;
            this.f24125b = eVar;
            c<T>[] cVarArr = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11] = new c<>(this, i11);
            }
            this.f24126c = cVarArr;
            this.f24127d = new Object[i10];
        }

        void a(int i10) {
            c<T>[] cVarArr = this.f24126c;
            int length = cVarArr.length;
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11].c();
            }
            while (true) {
                i10++;
                if (i10 >= length) {
                    return;
                } else {
                    cVarArr[i10].c();
                }
            }
        }

        void b(int i10) {
            if (getAndSet(0) > 0) {
                a(i10);
                this.f24124a.a();
            }
        }

        void c(Throwable th2, int i10) {
            if (getAndSet(0) <= 0) {
                yj.a.q(th2);
            } else {
                a(i10);
                this.f24124a.onError(th2);
            }
        }

        void d(T t10, int i10) {
            this.f24127d[i10] = t10;
            if (decrementAndGet() == 0) {
                try {
                    this.f24124a.onSuccess(lj.b.d(this.f24125b.apply(this.f24127d), "The zipper returned a null value"));
                } catch (Throwable th2) {
                    hj.b.b(th2);
                    this.f24124a.onError(th2);
                }
            }
        }

        @Override // gj.b
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (c<T> cVar : this.f24126c) {
                    cVar.c();
                }
            }
        }

        @Override // gj.b
        public boolean h() {
            return get() <= 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c<T> extends AtomicReference<gj.b> implements dj.l<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        /* renamed from: a, reason: collision with root package name */
        final b<T, ?> f24128a;

        /* renamed from: b, reason: collision with root package name */
        final int f24129b;

        c(b<T, ?> bVar, int i10) {
            this.f24128a = bVar;
            this.f24129b = i10;
        }

        @Override // dj.l
        public void a() {
            this.f24128a.b(this.f24129b);
        }

        @Override // dj.l
        public void b(gj.b bVar) {
            kj.b.o(this, bVar);
        }

        public void c() {
            kj.b.b(this);
        }

        @Override // dj.l
        public void onError(Throwable th2) {
            this.f24128a.c(th2, this.f24129b);
        }

        @Override // dj.l
        public void onSuccess(T t10) {
            this.f24128a.d(t10, this.f24129b);
        }
    }

    public v(dj.n<? extends T>[] nVarArr, jj.e<? super Object[], ? extends R> eVar) {
        this.f24121a = nVarArr;
        this.f24122b = eVar;
    }

    @Override // dj.j
    protected void u(dj.l<? super R> lVar) {
        dj.n<? extends T>[] nVarArr = this.f24121a;
        int length = nVarArr.length;
        if (length == 1) {
            nVarArr[0].a(new n.a(lVar, new a()));
            return;
        }
        b bVar = new b(lVar, length, this.f24122b);
        lVar.b(bVar);
        for (int i10 = 0; i10 < length && !bVar.h(); i10++) {
            dj.n<? extends T> nVar = nVarArr[i10];
            if (nVar == null) {
                bVar.c(new NullPointerException("One of the sources is null"), i10);
                return;
            }
            nVar.a(bVar.f24126c[i10]);
        }
    }
}
