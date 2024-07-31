package pj;

/* loaded from: classes3.dex */
public final class l<T> extends dj.f<T> {

    /* renamed from: b, reason: collision with root package name */
    final T[] f23184b;

    /* loaded from: classes3.dex */
    static final class a<T> extends c<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: d, reason: collision with root package name */
        final mj.a<? super T> f23185d;

        a(mj.a<? super T> aVar, T[] tArr) {
            super(tArr);
            this.f23185d = aVar;
        }

        @Override // pj.l.c
        void a() {
            T[] tArr = this.f23187a;
            int length = tArr.length;
            mj.a<? super T> aVar = this.f23185d;
            for (int i10 = this.f23188b; i10 != length; i10++) {
                if (this.f23189c) {
                    return;
                }
                T t10 = tArr[i10];
                if (t10 == null) {
                    aVar.onError(new NullPointerException("array element is null"));
                    return;
                }
                aVar.f(t10);
            }
            if (this.f23189c) {
                return;
            }
            aVar.a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
        
            r10.f23188b = r2;
            r11 = addAndGet(-r6);
         */
        @Override // pj.l.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void b(long r11) {
            /*
                r10 = this;
                T[] r0 = r10.f23187a
                int r1 = r0.length
                int r2 = r10.f23188b
                mj.a<? super T> r3 = r10.f23185d
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 == 0) goto L30
                if (r2 == r1) goto L30
                boolean r8 = r10.f23189c
                if (r8 == 0) goto L15
                return
            L15:
                r8 = r0[r2]
                if (r8 != 0) goto L24
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.String r12 = "array element is null"
                r11.<init>(r12)
                r3.onError(r11)
                return
            L24:
                boolean r8 = r3.f(r8)
                if (r8 == 0) goto L2d
                r8 = 1
                long r6 = r6 + r8
            L2d:
                int r2 = r2 + 1
                goto La
            L30:
                if (r2 != r1) goto L3a
                boolean r11 = r10.f23189c
                if (r11 != 0) goto L39
                r3.a()
            L39:
                return
            L3a:
                long r11 = r10.get()
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto La
                r10.f23188b = r2
                long r11 = -r6
                long r11 = r10.addAndGet(r11)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pj.l.a.b(long):void");
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends c<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: d, reason: collision with root package name */
        final im.b<? super T> f23186d;

        b(im.b<? super T> bVar, T[] tArr) {
            super(tArr);
            this.f23186d = bVar;
        }

        @Override // pj.l.c
        void a() {
            T[] tArr = this.f23187a;
            int length = tArr.length;
            im.b<? super T> bVar = this.f23186d;
            for (int i10 = this.f23188b; i10 != length; i10++) {
                if (this.f23189c) {
                    return;
                }
                T t10 = tArr[i10];
                if (t10 == null) {
                    bVar.onError(new NullPointerException("array element is null"));
                    return;
                }
                bVar.c(t10);
            }
            if (this.f23189c) {
                return;
            }
            bVar.a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
        
            r10.f23188b = r2;
            r11 = addAndGet(-r6);
         */
        @Override // pj.l.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void b(long r11) {
            /*
                r10 = this;
                T[] r0 = r10.f23187a
                int r1 = r0.length
                int r2 = r10.f23188b
                im.b<? super T> r3 = r10.f23186d
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 == 0) goto L2d
                if (r2 == r1) goto L2d
                boolean r8 = r10.f23189c
                if (r8 == 0) goto L15
                return
            L15:
                r8 = r0[r2]
                if (r8 != 0) goto L24
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.String r12 = "array element is null"
                r11.<init>(r12)
                r3.onError(r11)
                return
            L24:
                r3.c(r8)
                r8 = 1
                long r6 = r6 + r8
                int r2 = r2 + 1
                goto La
            L2d:
                if (r2 != r1) goto L37
                boolean r11 = r10.f23189c
                if (r11 != 0) goto L36
                r3.a()
            L36:
                return
            L37:
                long r11 = r10.get()
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto La
                r10.f23188b = r2
                long r11 = -r6
                long r11 = r10.addAndGet(r11)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pj.l.b.b(long):void");
        }
    }

    /* loaded from: classes3.dex */
    static abstract class c<T> extends wj.b<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* renamed from: a, reason: collision with root package name */
        final T[] f23187a;

        /* renamed from: b, reason: collision with root package name */
        int f23188b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f23189c;

        c(T[] tArr) {
            this.f23187a = tArr;
        }

        abstract void a();

        abstract void b(long j10);

        @Override // im.c
        public final void cancel() {
            this.f23189c = true;
        }

        @Override // mj.j
        public final void clear() {
            this.f23188b = this.f23187a.length;
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
            return this.f23188b == this.f23187a.length;
        }

        @Override // mj.f
        public final int l(int i10) {
            return i10 & 1;
        }

        @Override // mj.j
        public final T poll() {
            int i10 = this.f23188b;
            T[] tArr = this.f23187a;
            if (i10 == tArr.length) {
                return null;
            }
            this.f23188b = i10 + 1;
            return (T) lj.b.d(tArr[i10], "array element is null");
        }
    }

    public l(T[] tArr) {
        this.f23184b = tArr;
    }

    @Override // dj.f
    public void I(im.b<? super T> bVar) {
        bVar.d(bVar instanceof mj.a ? new a((mj.a) bVar, this.f23184b) : new b(bVar, this.f23184b));
    }
}
