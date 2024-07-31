package pj;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class m<T> extends dj.f<T> {

    /* renamed from: b, reason: collision with root package name */
    final Iterable<? extends T> f23190b;

    /* loaded from: classes3.dex */
    static abstract class a<T> extends wj.b<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* renamed from: a, reason: collision with root package name */
        Iterator<? extends T> f23191a;

        /* renamed from: b, reason: collision with root package name */
        volatile boolean f23192b;

        /* renamed from: c, reason: collision with root package name */
        boolean f23193c;

        a(Iterator<? extends T> it) {
            this.f23191a = it;
        }

        abstract void a();

        abstract void b(long j10);

        @Override // im.c
        public final void cancel() {
            this.f23192b = true;
        }

        @Override // mj.j
        public final void clear() {
            this.f23191a = null;
        }

        @Override // im.c
        public final void i(long j10) {
            if (wj.g.p(j10) && xj.d.a(this, j10) == 0) {
                if (j10 == Long.MAX_VALUE) {
                    a();
                } else {
                    b(j10);
                }
            }
        }

        @Override // mj.j
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f23191a;
            return it == null || !it.hasNext();
        }

        @Override // mj.f
        public final int l(int i10) {
            return i10 & 1;
        }

        @Override // mj.j
        public final T poll() {
            Iterator<? extends T> it = this.f23191a;
            if (it == null) {
                return null;
            }
            if (!this.f23193c) {
                this.f23193c = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return (T) lj.b.d(this.f23191a.next(), "Iterator.next() returned a null value");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> extends a<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* renamed from: d, reason: collision with root package name */
        final mj.a<? super T> f23194d;

        b(mj.a<? super T> aVar, Iterator<? extends T> it) {
            super(it);
            this.f23194d = aVar;
        }

        @Override // pj.m.a
        void a() {
            T next;
            Iterator<? extends T> it = this.f23191a;
            mj.a<? super T> aVar = this.f23194d;
            while (!this.f23192b) {
                try {
                    next = it.next();
                } catch (Throwable th2) {
                    th = th2;
                    hj.b.b(th);
                }
                if (this.f23192b) {
                    return;
                }
                if (next == null) {
                    th = new NullPointerException("Iterator.next() returned a null value");
                    aVar.onError(th);
                    return;
                }
                aVar.f(next);
                if (this.f23192b) {
                    return;
                }
                if (!it.hasNext()) {
                    if (this.f23192b) {
                        return;
                    }
                    aVar.a();
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // pj.m.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void b(long r9) {
            /*
                r8 = this;
                java.util.Iterator<? extends T> r0 = r8.f23191a
                mj.a<? super T> r1 = r8.f23194d
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L48
                boolean r6 = r8.f23192b
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L43
                boolean r7 = r8.f23192b
                if (r7 == 0) goto L19
                return
            L19:
                if (r6 != 0) goto L26
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "Iterator.next() returned a null value"
                r9.<init>(r10)
            L22:
                r1.onError(r9)
                return
            L26:
                boolean r6 = r1.f(r6)
                boolean r7 = r8.f23192b
                if (r7 == 0) goto L2f
                return
            L2f:
                boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L43
                if (r7 != 0) goto L3d
                boolean r9 = r8.f23192b
                if (r9 != 0) goto L3c
                r1.a()
            L3c:
                return
            L3d:
                if (r6 == 0) goto L7
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L43:
                r9 = move-exception
                hj.b.b(r9)
                goto L22
            L48:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pj.m.b.b(long):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c<T> extends a<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* renamed from: d, reason: collision with root package name */
        final im.b<? super T> f23195d;

        c(im.b<? super T> bVar, Iterator<? extends T> it) {
            super(it);
            this.f23195d = bVar;
        }

        @Override // pj.m.a
        void a() {
            T next;
            Iterator<? extends T> it = this.f23191a;
            im.b<? super T> bVar = this.f23195d;
            while (!this.f23192b) {
                try {
                    next = it.next();
                } catch (Throwable th2) {
                    th = th2;
                    hj.b.b(th);
                }
                if (this.f23192b) {
                    return;
                }
                if (next == null) {
                    th = new NullPointerException("Iterator.next() returned a null value");
                    bVar.onError(th);
                    return;
                }
                bVar.c(next);
                if (this.f23192b) {
                    return;
                }
                if (!it.hasNext()) {
                    if (this.f23192b) {
                        return;
                    }
                    bVar.a();
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // pj.m.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void b(long r9) {
            /*
                r8 = this;
                java.util.Iterator<? extends T> r0 = r8.f23191a
                im.b<? super T> r1 = r8.f23195d
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L45
                boolean r6 = r8.f23192b
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L40
                boolean r7 = r8.f23192b
                if (r7 == 0) goto L19
                return
            L19:
                if (r6 != 0) goto L26
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "Iterator.next() returned a null value"
                r9.<init>(r10)
            L22:
                r1.onError(r9)
                return
            L26:
                r1.c(r6)
                boolean r6 = r8.f23192b
                if (r6 == 0) goto L2e
                return
            L2e:
                boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
                if (r6 != 0) goto L3c
                boolean r9 = r8.f23192b
                if (r9 != 0) goto L3b
                r1.a()
            L3b:
                return
            L3c:
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L40:
                r9 = move-exception
                hj.b.b(r9)
                goto L22
            L45:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pj.m.c.b(long):void");
        }
    }

    public m(Iterable<? extends T> iterable) {
        this.f23190b = iterable;
    }

    public static <T> void K(im.b<? super T> bVar, Iterator<? extends T> it) {
        try {
            if (it.hasNext()) {
                bVar.d(bVar instanceof mj.a ? new b((mj.a) bVar, it) : new c(bVar, it));
            } else {
                wj.d.b(bVar);
            }
        } catch (Throwable th2) {
            hj.b.b(th2);
            wj.d.h(th2, bVar);
        }
    }

    @Override // dj.f
    public void I(im.b<? super T> bVar) {
        try {
            K(bVar, this.f23190b.iterator());
        } catch (Throwable th2) {
            hj.b.b(th2);
            wj.d.h(th2, bVar);
        }
    }
}
