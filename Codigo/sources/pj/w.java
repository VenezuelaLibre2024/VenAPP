package pj;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class w<T> extends ij.a<T> {

    /* renamed from: b, reason: collision with root package name */
    final dj.f<T> f23251b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<c<T>> f23252c;

    /* renamed from: d, reason: collision with root package name */
    final int f23253d;

    /* renamed from: e, reason: collision with root package name */
    final im.a<T> f23254e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> implements im.a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicReference<c<T>> f23255a;

        /* renamed from: b, reason: collision with root package name */
        private final int f23256b;

        a(AtomicReference<c<T>> atomicReference, int i10) {
            this.f23255a = atomicReference;
            this.f23256b = i10;
        }

        @Override // im.a
        public void a(im.b<? super T> bVar) {
            c<T> cVar;
            b<T> bVar2 = new b<>(bVar);
            bVar.d(bVar2);
            while (true) {
                cVar = this.f23255a.get();
                if (cVar == null || cVar.h()) {
                    c<T> cVar2 = new c<>(this.f23255a, this.f23256b);
                    if (e2.c.a(this.f23255a, cVar, cVar2)) {
                        cVar = cVar2;
                    } else {
                        continue;
                    }
                }
                if (cVar.b(bVar2)) {
                    break;
                }
            }
            if (bVar2.get() == Long.MIN_VALUE) {
                cVar.i(bVar2);
            } else {
                bVar2.f23258b = cVar;
            }
            cVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> extends AtomicLong implements im.c {
        private static final long serialVersionUID = -4453897557930727610L;

        /* renamed from: a, reason: collision with root package name */
        final im.b<? super T> f23257a;

        /* renamed from: b, reason: collision with root package name */
        volatile c<T> f23258b;

        /* renamed from: c, reason: collision with root package name */
        long f23259c;

        b(im.b<? super T> bVar) {
            this.f23257a = bVar;
        }

        @Override // im.c
        public void cancel() {
            c<T> cVar;
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (cVar = this.f23258b) == null) {
                return;
            }
            cVar.i(this);
            cVar.g();
        }

        @Override // im.c
        public void i(long j10) {
            if (wj.g.p(j10)) {
                xj.d.b(this, j10);
                c<T> cVar = this.f23258b;
                if (cVar != null) {
                    cVar.g();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class c<T> extends AtomicInteger implements dj.i<T>, gj.b {
        private static final long serialVersionUID = -202316842419149694L;

        /* renamed from: t, reason: collision with root package name */
        static final b[] f23260t = new b[0];

        /* renamed from: u, reason: collision with root package name */
        static final b[] f23261u = new b[0];

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference<c<T>> f23262a;

        /* renamed from: b, reason: collision with root package name */
        final int f23263b;

        /* renamed from: f, reason: collision with root package name */
        volatile Object f23267f;

        /* renamed from: r, reason: collision with root package name */
        int f23268r;

        /* renamed from: s, reason: collision with root package name */
        volatile mj.j<T> f23269s;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<im.c> f23266e = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<b<T>[]> f23264c = new AtomicReference<>(f23260t);

        /* renamed from: d, reason: collision with root package name */
        final AtomicBoolean f23265d = new AtomicBoolean();

        c(AtomicReference<c<T>> atomicReference, int i10) {
            this.f23262a = atomicReference;
            this.f23263b = i10;
        }

        @Override // im.b
        public void a() {
            if (this.f23267f == null) {
                this.f23267f = xj.i.h();
                g();
            }
        }

        boolean b(b<T> bVar) {
            b<T>[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = this.f23264c.get();
                if (bVarArr == f23261u) {
                    return false;
                }
                int length = bVarArr.length;
                bVarArr2 = new b[length + 1];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
            } while (!e2.c.a(this.f23264c, bVarArr, bVarArr2));
            return true;
        }

        @Override // im.b
        public void c(T t10) {
            if (this.f23268r != 0 || this.f23269s.offer(t10)) {
                g();
            } else {
                onError(new hj.c("Prefetch queue is full?!"));
            }
        }

        @Override // dj.i, im.b
        public void d(im.c cVar) {
            if (wj.g.o(this.f23266e, cVar)) {
                if (cVar instanceof mj.g) {
                    mj.g gVar = (mj.g) cVar;
                    int l10 = gVar.l(3);
                    if (l10 == 1) {
                        this.f23268r = l10;
                        this.f23269s = gVar;
                        this.f23267f = xj.i.h();
                        g();
                        return;
                    }
                    if (l10 == 2) {
                        this.f23268r = l10;
                        this.f23269s = gVar;
                        cVar.i(this.f23263b);
                        return;
                    }
                }
                this.f23269s = new tj.a(this.f23263b);
                cVar.i(this.f23263b);
            }
        }

        @Override // gj.b
        public void dispose() {
            b<T>[] bVarArr = this.f23264c.get();
            b<T>[] bVarArr2 = f23261u;
            if (bVarArr == bVarArr2 || this.f23264c.getAndSet(bVarArr2) == bVarArr2) {
                return;
            }
            e2.c.a(this.f23262a, this, null);
            wj.g.b(this.f23266e);
        }

        boolean e(Object obj, boolean z10) {
            int i10 = 0;
            if (obj != null) {
                if (!xj.i.n(obj)) {
                    Throwable l10 = xj.i.l(obj);
                    e2.c.a(this.f23262a, this, null);
                    b<T>[] andSet = this.f23264c.getAndSet(f23261u);
                    if (andSet.length != 0) {
                        int length = andSet.length;
                        while (i10 < length) {
                            andSet[i10].f23257a.onError(l10);
                            i10++;
                        }
                    } else {
                        yj.a.q(l10);
                    }
                    return true;
                }
                if (z10) {
                    e2.c.a(this.f23262a, this, null);
                    b<T>[] andSet2 = this.f23264c.getAndSet(f23261u);
                    int length2 = andSet2.length;
                    while (i10 < length2) {
                        andSet2[i10].f23257a.a();
                        i10++;
                    }
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:58:0x0124, code lost:
        
            r4 = r0;
            r3 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0128, code lost:
        
            if (r11 <= 0) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x012a, code lost:
        
            r3 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x012d, code lost:
        
            if (r25.f23268r == 1) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x012f, code lost:
        
            r25.f23266e.get().i(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0140, code lost:
        
            if (r14 == 0) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0142, code lost:
        
            if (r8 != false) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0014, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x013b, code lost:
        
            r3 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void g() {
            /*
                Method dump skipped, instructions count: 343
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pj.w.c.g():void");
        }

        @Override // gj.b
        public boolean h() {
            return this.f23264c.get() == f23261u;
        }

        void i(b<T> bVar) {
            b<T>[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = this.f23264c.get();
                int length = bVarArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (bVarArr[i10].equals(bVar)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    bVarArr2 = f23260t;
                } else {
                    b[] bVarArr3 = new b[length - 1];
                    System.arraycopy(bVarArr, 0, bVarArr3, 0, i10);
                    System.arraycopy(bVarArr, i10 + 1, bVarArr3, i10, (length - i10) - 1);
                    bVarArr2 = bVarArr3;
                }
            } while (!e2.c.a(this.f23264c, bVarArr, bVarArr2));
        }

        @Override // im.b
        public void onError(Throwable th2) {
            if (this.f23267f != null) {
                yj.a.q(th2);
            } else {
                this.f23267f = xj.i.i(th2);
                g();
            }
        }
    }

    private w(im.a<T> aVar, dj.f<T> fVar, AtomicReference<c<T>> atomicReference, int i10) {
        this.f23254e = aVar;
        this.f23251b = fVar;
        this.f23252c = atomicReference;
        this.f23253d = i10;
    }

    public static <T> ij.a<T> M(dj.f<T> fVar, int i10) {
        AtomicReference atomicReference = new AtomicReference();
        return yj.a.o(new w(new a(atomicReference, i10), fVar, atomicReference, i10));
    }

    @Override // dj.f
    protected void I(im.b<? super T> bVar) {
        this.f23254e.a(bVar);
    }

    @Override // ij.a
    public void L(jj.d<? super gj.b> dVar) {
        c<T> cVar;
        while (true) {
            cVar = this.f23252c.get();
            if (cVar != null && !cVar.h()) {
                break;
            }
            c<T> cVar2 = new c<>(this.f23252c, this.f23253d);
            if (e2.c.a(this.f23252c, cVar, cVar2)) {
                cVar = cVar2;
                break;
            }
        }
        boolean z10 = false;
        if (!cVar.f23265d.get() && cVar.f23265d.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            dVar.accept(cVar);
            if (z10) {
                this.f23251b.H(cVar);
            }
        } catch (Throwable th2) {
            hj.b.b(th2);
            throw xj.g.d(th2);
        }
    }
}
