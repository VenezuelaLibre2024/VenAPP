package p297pj;

import dj.AbstractC6981f;
import dj.AbstractC6993r;
import dj.InterfaceC6984i;
import im.InterfaceC8015b;
import im.InterfaceC8016c;
import java.util.concurrent.atomic.AtomicLong;
import p145hj.C7744b;
import p145hj.C7745c;
import p241mj.InterfaceC9591a;
import p241mj.InterfaceC9597g;
import p241mj.InterfaceC9600j;
import p426wj.AbstractC12218a;
import p426wj.EnumC12224g;
import p449xj.C12501d;
import p471yj.C12727a;
import tj.C11288a;

/* renamed from: pj.r */
/* loaded from: classes3.dex */
public final class C10192r<T> extends AbstractC10175a<T, T> {

    /* renamed from: c */
    final AbstractC6993r f25140c;

    /* renamed from: d */
    final boolean f25141d;

    /* renamed from: e */
    final int f25142e;

    /* renamed from: pj.r$a */
    /* loaded from: classes3.dex */
    static abstract class a<T> extends AbstractC12218a<T> implements InterfaceC6984i<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;

        /* renamed from: a */
        final AbstractC6993r.b f25143a;

        /* renamed from: b */
        final boolean f25144b;

        /* renamed from: c */
        final int f25145c;

        /* renamed from: d */
        final int f25146d;

        /* renamed from: e */
        final AtomicLong f25147e = new AtomicLong();

        /* renamed from: f */
        InterfaceC8016c f25148f;

        /* renamed from: r */
        InterfaceC9600j<T> f25149r;

        /* renamed from: s */
        volatile boolean f25150s;

        /* renamed from: t */
        volatile boolean f25151t;

        /* renamed from: u */
        Throwable f25152u;

        /* renamed from: v */
        int f25153v;

        /* renamed from: w */
        long f25154w;

        /* renamed from: x */
        boolean f25155x;

        a(AbstractC6993r.b bVar, boolean z10, int i10) {
            this.f25143a = bVar;
            this.f25144b = z10;
            this.f25145c = i10;
            this.f25146d = i10 - (i10 >> 2);
        }

        @Override // im.InterfaceC8015b
        /* renamed from: a */
        public final void mo24632a() {
            if (this.f25151t) {
                return;
            }
            this.f25151t = true;
            m30506k();
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public final void mo24633c(T t10) {
            if (this.f25151t) {
                return;
            }
            if (this.f25153v == 2) {
                m30506k();
                return;
            }
            if (!this.f25149r.offer(t10)) {
                this.f25148f.cancel();
                this.f25152u = new C7745c("Queue is full?!");
                this.f25151t = true;
            }
            m30506k();
        }

        @Override // im.InterfaceC8016c
        public final void cancel() {
            if (this.f25150s) {
                return;
            }
            this.f25150s = true;
            this.f25148f.cancel();
            this.f25143a.dispose();
            if (getAndIncrement() == 0) {
                this.f25149r.clear();
            }
        }

        @Override // p241mj.InterfaceC9600j
        public final void clear() {
            this.f25149r.clear();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        
            if (r3 != null) goto L18;
         */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final boolean m30502e(boolean r3, boolean r4, im.InterfaceC8015b<?> r5) {
            /*
                r2 = this;
                boolean r0 = r2.f25150s
                r1 = 1
                if (r0 == 0) goto L9
                r2.clear()
                return r1
            L9:
                if (r3 == 0) goto L2d
                boolean r3 = r2.f25144b
                if (r3 == 0) goto L1c
                if (r4 == 0) goto L2d
                java.lang.Throwable r3 = r2.f25152u
                if (r3 == 0) goto L29
                goto L23
            L16:
                dj.r$b r3 = r2.f25143a
                r3.dispose()
                return r1
            L1c:
                java.lang.Throwable r3 = r2.f25152u
                if (r3 == 0) goto L27
                r2.clear()
            L23:
                r5.onError(r3)
                goto L16
            L27:
                if (r4 == 0) goto L2d
            L29:
                r5.mo24632a()
                goto L16
            L2d:
                r3 = 0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p297pj.C10192r.a.m30502e(boolean, boolean, im.b):boolean");
        }

        /* renamed from: g */
        abstract void mo30503g();

        /* renamed from: h */
        abstract void mo30504h();

        @Override // im.InterfaceC8016c
        /* renamed from: i */
        public final void mo24634i(long j10) {
            if (EnumC12224g.m39359p(j10)) {
                C12501d.m40928a(this.f25147e, j10);
                m30506k();
            }
        }

        @Override // p241mj.InterfaceC9600j
        public final boolean isEmpty() {
            return this.f25149r.isEmpty();
        }

        /* renamed from: j */
        abstract void mo30505j();

        /* renamed from: k */
        final void m30506k() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f25143a.mo20302b(this);
        }

        @Override // p241mj.InterfaceC9596f
        /* renamed from: l */
        public final int mo27706l(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f25155x = true;
            return 2;
        }

        @Override // im.InterfaceC8015b
        public final void onError(Throwable th2) {
            if (this.f25151t) {
                C12727a.m41995q(th2);
                return;
            }
            this.f25152u = th2;
            this.f25151t = true;
            m30506k();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f25155x) {
                mo30504h();
            } else if (this.f25153v == 1) {
                mo30505j();
            } else {
                mo30503g();
            }
        }
    }

    /* renamed from: pj.r$b */
    /* loaded from: classes3.dex */
    static final class b<T> extends a<T> {
        private static final long serialVersionUID = 644624475404284533L;

        /* renamed from: y */
        final InterfaceC9591a<? super T> f25156y;

        /* renamed from: z */
        long f25157z;

        b(InterfaceC9591a<? super T> interfaceC9591a, AbstractC6993r.b bVar, boolean z10, int i10) {
            super(bVar, z10, i10);
            this.f25156y = interfaceC9591a;
        }

        @Override // dj.InterfaceC6984i, im.InterfaceC8015b
        /* renamed from: d */
        public void mo20249d(InterfaceC8016c interfaceC8016c) {
            if (EnumC12224g.m39360q(this.f25148f, interfaceC8016c)) {
                this.f25148f = interfaceC8016c;
                if (interfaceC8016c instanceof InterfaceC9597g) {
                    InterfaceC9597g interfaceC9597g = (InterfaceC9597g) interfaceC8016c;
                    int mo27706l = interfaceC9597g.mo27706l(7);
                    if (mo27706l == 1) {
                        this.f25153v = 1;
                        this.f25149r = interfaceC9597g;
                        this.f25151t = true;
                        this.f25156y.mo20249d(this);
                        return;
                    }
                    if (mo27706l == 2) {
                        this.f25153v = 2;
                        this.f25149r = interfaceC9597g;
                        this.f25156y.mo20249d(this);
                        interfaceC8016c.mo24634i(this.f25145c);
                        return;
                    }
                }
                this.f25149r = new C11288a(this.f25145c);
                this.f25156y.mo20249d(this);
                interfaceC8016c.mo24634i(this.f25145c);
            }
        }

        @Override // p297pj.C10192r.a
        /* renamed from: g */
        void mo30503g() {
            InterfaceC9591a<? super T> interfaceC9591a = this.f25156y;
            InterfaceC9600j<T> interfaceC9600j = this.f25149r;
            long j10 = this.f25154w;
            long j11 = this.f25157z;
            int i10 = 1;
            while (true) {
                long j12 = this.f25147e.get();
                while (j10 != j12) {
                    boolean z10 = this.f25151t;
                    try {
                        T poll = interfaceC9600j.poll();
                        boolean z11 = poll == null;
                        if (m30502e(z10, z11, interfaceC9591a)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        if (interfaceC9591a.mo28586f(poll)) {
                            j10++;
                        }
                        j11++;
                        if (j11 == this.f25146d) {
                            this.f25148f.mo24634i(j11);
                            j11 = 0;
                        }
                    } catch (Throwable th2) {
                        C7744b.m23648b(th2);
                        this.f25148f.cancel();
                        interfaceC9600j.clear();
                        interfaceC9591a.onError(th2);
                        this.f25143a.dispose();
                        return;
                    }
                }
                if (j10 == j12 && m30502e(this.f25151t, interfaceC9600j.isEmpty(), interfaceC9591a)) {
                    return;
                }
                int i11 = get();
                if (i10 == i11) {
                    this.f25154w = j10;
                    this.f25157z = j11;
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else {
                    i10 = i11;
                }
            }
        }

        @Override // p297pj.C10192r.a
        /* renamed from: h */
        void mo30504h() {
            int i10 = 1;
            while (!this.f25150s) {
                boolean z10 = this.f25151t;
                this.f25156y.mo24633c(null);
                if (z10) {
                    Throwable th2 = this.f25152u;
                    if (th2 != null) {
                        this.f25156y.onError(th2);
                    } else {
                        this.f25156y.mo24632a();
                    }
                    this.f25143a.dispose();
                    return;
                }
                i10 = addAndGet(-i10);
                if (i10 == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x001c, code lost:
        
            r0.mo24632a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x003e, code lost:
        
            if (r9.f25150s == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
        
            if (r1.isEmpty() == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
        
            r5 = get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
        
            if (r4 != r5) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            r4 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x004e, code lost:
        
            r9.f25154w = r2;
            r4 = addAndGet(-r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0055, code lost:
        
            if (r4 != 0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0057, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0040, code lost:
        
            return;
         */
        @Override // p297pj.C10192r.a
        /* renamed from: j */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void mo30505j() {
            /*
                r9 = this;
                mj.a<? super T> r0 = r9.f25156y
                mj.j<T> r1 = r9.f25149r
                long r2 = r9.f25154w
                r4 = 1
            L7:
                java.util.concurrent.atomic.AtomicLong r5 = r9.f25147e
                long r5 = r5.get()
            Ld:
                int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r7 == 0) goto L3c
                java.lang.Object r7 = r1.poll()     // Catch: java.lang.Throwable -> L2f
                boolean r8 = r9.f25150s
                if (r8 == 0) goto L1a
                return
            L1a:
                if (r7 != 0) goto L25
            L1c:
                r0.mo24632a()
            L1f:
                dj.r$b r0 = r9.f25143a
                r0.dispose()
                return
            L25:
                boolean r7 = r0.mo28586f(r7)
                if (r7 == 0) goto Ld
                r7 = 1
                long r2 = r2 + r7
                goto Ld
            L2f:
                r1 = move-exception
                p145hj.C7744b.m23648b(r1)
                im.c r2 = r9.f25148f
                r2.cancel()
                r0.onError(r1)
                goto L1f
            L3c:
                boolean r5 = r9.f25150s
                if (r5 == 0) goto L41
                return
            L41:
                boolean r5 = r1.isEmpty()
                if (r5 == 0) goto L48
                goto L1c
            L48:
                int r5 = r9.get()
                if (r4 != r5) goto L58
                r9.f25154w = r2
                int r4 = -r4
                int r4 = r9.addAndGet(r4)
                if (r4 != 0) goto L7
                return
            L58:
                r4 = r5
                goto L7
            */
            throw new UnsupportedOperationException("Method not decompiled: p297pj.C10192r.b.mo30505j():void");
        }

        @Override // p241mj.InterfaceC9600j
        public T poll() {
            T poll = this.f25149r.poll();
            if (poll != null && this.f25153v != 1) {
                long j10 = this.f25157z + 1;
                if (j10 == this.f25146d) {
                    this.f25157z = 0L;
                    this.f25148f.mo24634i(j10);
                } else {
                    this.f25157z = j10;
                }
            }
            return poll;
        }
    }

    /* renamed from: pj.r$c */
    /* loaded from: classes3.dex */
    static final class c<T> extends a<T> {
        private static final long serialVersionUID = -4547113800637756442L;

        /* renamed from: y */
        final InterfaceC8015b<? super T> f25158y;

        c(InterfaceC8015b<? super T> interfaceC8015b, AbstractC6993r.b bVar, boolean z10, int i10) {
            super(bVar, z10, i10);
            this.f25158y = interfaceC8015b;
        }

        @Override // dj.InterfaceC6984i, im.InterfaceC8015b
        /* renamed from: d */
        public void mo20249d(InterfaceC8016c interfaceC8016c) {
            if (EnumC12224g.m39360q(this.f25148f, interfaceC8016c)) {
                this.f25148f = interfaceC8016c;
                if (interfaceC8016c instanceof InterfaceC9597g) {
                    InterfaceC9597g interfaceC9597g = (InterfaceC9597g) interfaceC8016c;
                    int mo27706l = interfaceC9597g.mo27706l(7);
                    if (mo27706l == 1) {
                        this.f25153v = 1;
                        this.f25149r = interfaceC9597g;
                        this.f25151t = true;
                        this.f25158y.mo20249d(this);
                        return;
                    }
                    if (mo27706l == 2) {
                        this.f25153v = 2;
                        this.f25149r = interfaceC9597g;
                        this.f25158y.mo20249d(this);
                        interfaceC8016c.mo24634i(this.f25145c);
                        return;
                    }
                }
                this.f25149r = new C11288a(this.f25145c);
                this.f25158y.mo20249d(this);
                interfaceC8016c.mo24634i(this.f25145c);
            }
        }

        @Override // p297pj.C10192r.a
        /* renamed from: g */
        void mo30503g() {
            InterfaceC8015b<? super T> interfaceC8015b = this.f25158y;
            InterfaceC9600j<T> interfaceC9600j = this.f25149r;
            long j10 = this.f25154w;
            int i10 = 1;
            while (true) {
                long j11 = this.f25147e.get();
                while (j10 != j11) {
                    boolean z10 = this.f25151t;
                    try {
                        T poll = interfaceC9600j.poll();
                        boolean z11 = poll == null;
                        if (m30502e(z10, z11, interfaceC8015b)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        interfaceC8015b.mo24633c(poll);
                        j10++;
                        if (j10 == this.f25146d) {
                            if (j11 != Long.MAX_VALUE) {
                                j11 = this.f25147e.addAndGet(-j10);
                            }
                            this.f25148f.mo24634i(j10);
                            j10 = 0;
                        }
                    } catch (Throwable th2) {
                        C7744b.m23648b(th2);
                        this.f25148f.cancel();
                        interfaceC9600j.clear();
                        interfaceC8015b.onError(th2);
                        this.f25143a.dispose();
                        return;
                    }
                }
                if (j10 == j11 && m30502e(this.f25151t, interfaceC9600j.isEmpty(), interfaceC8015b)) {
                    return;
                }
                int i11 = get();
                if (i10 == i11) {
                    this.f25154w = j10;
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else {
                    i10 = i11;
                }
            }
        }

        @Override // p297pj.C10192r.a
        /* renamed from: h */
        void mo30504h() {
            int i10 = 1;
            while (!this.f25150s) {
                boolean z10 = this.f25151t;
                this.f25158y.mo24633c(null);
                if (z10) {
                    Throwable th2 = this.f25152u;
                    if (th2 != null) {
                        this.f25158y.onError(th2);
                    } else {
                        this.f25158y.mo24632a();
                    }
                    this.f25143a.dispose();
                    return;
                }
                i10 = addAndGet(-i10);
                if (i10 == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
        
            r0.mo24632a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
        
            if (r9.f25150s == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
        
            if (r1.isEmpty() == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
        
            r5 = get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
        
            if (r4 != r5) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        
            r4 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x004b, code lost:
        
            r9.f25154w = r2;
            r4 = addAndGet(-r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
        
            if (r4 != 0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x003d, code lost:
        
            return;
         */
        @Override // p297pj.C10192r.a
        /* renamed from: j */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void mo30505j() {
            /*
                r9 = this;
                im.b<? super T> r0 = r9.f25158y
                mj.j<T> r1 = r9.f25149r
                long r2 = r9.f25154w
                r4 = 1
            L7:
                java.util.concurrent.atomic.AtomicLong r5 = r9.f25147e
                long r5 = r5.get()
            Ld:
                int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r7 == 0) goto L39
                java.lang.Object r7 = r1.poll()     // Catch: java.lang.Throwable -> L2c
                boolean r8 = r9.f25150s
                if (r8 == 0) goto L1a
                return
            L1a:
                if (r7 != 0) goto L25
            L1c:
                r0.mo24632a()
            L1f:
                dj.r$b r0 = r9.f25143a
                r0.dispose()
                return
            L25:
                r0.mo24633c(r7)
                r7 = 1
                long r2 = r2 + r7
                goto Ld
            L2c:
                r1 = move-exception
                p145hj.C7744b.m23648b(r1)
                im.c r2 = r9.f25148f
                r2.cancel()
                r0.onError(r1)
                goto L1f
            L39:
                boolean r5 = r9.f25150s
                if (r5 == 0) goto L3e
                return
            L3e:
                boolean r5 = r1.isEmpty()
                if (r5 == 0) goto L45
                goto L1c
            L45:
                int r5 = r9.get()
                if (r4 != r5) goto L55
                r9.f25154w = r2
                int r4 = -r4
                int r4 = r9.addAndGet(r4)
                if (r4 != 0) goto L7
                return
            L55:
                r4 = r5
                goto L7
            */
            throw new UnsupportedOperationException("Method not decompiled: p297pj.C10192r.c.mo30505j():void");
        }

        @Override // p241mj.InterfaceC9600j
        public T poll() {
            T poll = this.f25149r.poll();
            if (poll != null && this.f25153v != 1) {
                long j10 = this.f25154w + 1;
                if (j10 == this.f25146d) {
                    this.f25154w = 0L;
                    this.f25148f.mo24634i(j10);
                } else {
                    this.f25154w = j10;
                }
            }
            return poll;
        }
    }

    public C10192r(AbstractC6981f<T> abstractC6981f, AbstractC6993r abstractC6993r, boolean z10, int i10) {
        super(abstractC6981f);
        this.f25140c = abstractC6993r;
        this.f25141d = z10;
        this.f25142e = i10;
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    public void mo20229I(InterfaceC8015b<? super T> interfaceC8015b) {
        AbstractC6981f<T> abstractC6981f;
        InterfaceC6984i<? super T> cVar;
        AbstractC6993r.b mo20298a = this.f25140c.mo20298a();
        if (interfaceC8015b instanceof InterfaceC9591a) {
            abstractC6981f = this.f24989b;
            cVar = new b<>((InterfaceC9591a) interfaceC8015b, mo20298a, this.f25141d, this.f25142e);
        } else {
            abstractC6981f = this.f24989b;
            cVar = new c<>(interfaceC8015b, mo20298a, this.f25141d, this.f25142e);
        }
        abstractC6981f.m20228H(cVar);
    }
}
