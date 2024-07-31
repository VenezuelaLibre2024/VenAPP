package p297pj;

import dj.AbstractC6981f;
import dj.InterfaceC6984i;
import dj.InterfaceC6987l;
import dj.InterfaceC6989n;
import im.InterfaceC8015b;
import im.InterfaceC8016c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p073e2.C7099c;
import p123gj.C7577a;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p186jj.InterfaceC9077e;
import p205kj.EnumC9284b;
import p224lj.C9513b;
import p426wj.EnumC12224g;
import p449xj.C12500c;
import p449xj.C12501d;
import p471yj.C12727a;
import tj.C11289b;

/* renamed from: pj.j */
/* loaded from: classes3.dex */
public final class C10184j<T, R> extends AbstractC10175a<T, R> {

    /* renamed from: c */
    final InterfaceC9077e<? super T, ? extends InterfaceC6989n<? extends R>> f25091c;

    /* renamed from: d */
    final boolean f25092d;

    /* renamed from: e */
    final int f25093e;

    /* renamed from: pj.j$a */
    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicInteger implements InterfaceC6984i<T>, InterfaceC8016c {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: a */
        final InterfaceC8015b<? super R> f25094a;

        /* renamed from: b */
        final boolean f25095b;

        /* renamed from: c */
        final int f25096c;

        /* renamed from: s */
        final InterfaceC9077e<? super T, ? extends InterfaceC6989n<? extends R>> f25101s;

        /* renamed from: u */
        InterfaceC8016c f25103u;

        /* renamed from: v */
        volatile boolean f25104v;

        /* renamed from: d */
        final AtomicLong f25097d = new AtomicLong();

        /* renamed from: e */
        final C7577a f25098e = new C7577a();

        /* renamed from: r */
        final C12500c f25100r = new C12500c();

        /* renamed from: f */
        final AtomicInteger f25099f = new AtomicInteger(1);

        /* renamed from: t */
        final AtomicReference<C11289b<R>> f25102t = new AtomicReference<>();

        /* renamed from: pj.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C13230a extends AtomicReference<InterfaceC7578b> implements InterfaceC6987l<R>, InterfaceC7578b {
            private static final long serialVersionUID = -502562646270949838L;

            C13230a() {
            }

            @Override // dj.InterfaceC6987l
            /* renamed from: a */
            public void mo20278a() {
                a.this.m30490j(this);
            }

            @Override // dj.InterfaceC6987l
            /* renamed from: b */
            public void mo20279b(InterfaceC7578b interfaceC7578b) {
                EnumC9284b.m27697o(this, interfaceC7578b);
            }

            @Override // p123gj.InterfaceC7578b
            public void dispose() {
                EnumC9284b.m27692b(this);
            }

            @Override // p123gj.InterfaceC7578b
            /* renamed from: h */
            public boolean mo616h() {
                return EnumC9284b.m27693i(get());
            }

            @Override // dj.InterfaceC6987l
            public void onError(Throwable th2) {
                a.this.m30491k(this, th2);
            }

            @Override // dj.InterfaceC6987l
            public void onSuccess(R r10) {
                a.this.m30492l(this, r10);
            }
        }

        a(InterfaceC8015b<? super R> interfaceC8015b, InterfaceC9077e<? super T, ? extends InterfaceC6989n<? extends R>> interfaceC9077e, boolean z10, int i10) {
            this.f25094a = interfaceC8015b;
            this.f25101s = interfaceC9077e;
            this.f25095b = z10;
            this.f25096c = i10;
        }

        @Override // im.InterfaceC8015b
        /* renamed from: a */
        public void mo24632a() {
            this.f25099f.decrementAndGet();
            m30487e();
        }

        /* renamed from: b */
        void m30486b() {
            C11289b<R> c11289b = this.f25102t.get();
            if (c11289b != null) {
                c11289b.clear();
            }
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(T t10) {
            try {
                InterfaceC6989n interfaceC6989n = (InterfaceC6989n) C9513b.m28324d(this.f25101s.apply(t10), "The mapper returned a null MaybeSource");
                this.f25099f.getAndIncrement();
                C13230a c13230a = new C13230a();
                if (this.f25104v || !this.f25098e.mo23021b(c13230a)) {
                    return;
                }
                interfaceC6989n.mo20256a(c13230a);
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                this.f25103u.cancel();
                onError(th2);
            }
        }

        @Override // im.InterfaceC8016c
        public void cancel() {
            this.f25104v = true;
            this.f25103u.cancel();
            this.f25098e.dispose();
        }

        @Override // dj.InterfaceC6984i, im.InterfaceC8015b
        /* renamed from: d */
        public void mo20249d(InterfaceC8016c interfaceC8016c) {
            if (EnumC12224g.m39360q(this.f25103u, interfaceC8016c)) {
                this.f25103u = interfaceC8016c;
                this.f25094a.mo20249d(this);
                int i10 = this.f25096c;
                interfaceC8016c.mo24634i(i10 == Integer.MAX_VALUE ? Long.MAX_VALUE : i10);
            }
        }

        /* renamed from: e */
        void m30487e() {
            if (getAndIncrement() == 0) {
                m30488g();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        
            r2 = r17.f25100r.m40927b();
            m30486b();
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
        
            if (r10 != r6) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
        
            if (r17.f25104v == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
        
            if (r17.f25095b != false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
        
            if (r17.f25100r.get() == null) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0094, code lost:
        
            if (r2.get() != 0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0096, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
        
            r7 = r3.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x009f, code lost:
        
            if (r7 == null) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00a5, code lost:
        
            if (r7.isEmpty() == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00a8, code lost:
        
            if (r6 == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00aa, code lost:
        
            if (r13 == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00ac, code lost:
        
            r2 = r17.f25100r.m40927b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00b2, code lost:
        
            if (r2 == null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00b4, code lost:
        
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00b8, code lost:
        
            r1.mo24632a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00bb, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00a7, code lost:
        
            r13 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0098, code lost:
        
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x007d, code lost:
        
            m30486b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0080, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00be, code lost:
        
            if (r10 == 0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00c0, code lost:
        
            p449xj.C12501d.m40931d(r17.f25097d, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00ca, code lost:
        
            if (r17.f25096c == Integer.MAX_VALUE) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00cc, code lost:
        
            r17.f25103u.mo24634i(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00d1, code lost:
        
            r5 = addAndGet(-r5);
         */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void m30488g() {
            /*
                Method dump skipped, instructions count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p297pj.C10184j.a.m30488g():void");
        }

        /* renamed from: h */
        C11289b<R> m30489h() {
            C11289b<R> c11289b;
            do {
                C11289b<R> c11289b2 = this.f25102t.get();
                if (c11289b2 != null) {
                    return c11289b2;
                }
                c11289b = new C11289b<>(AbstractC6981f.m20213b());
            } while (!C7099c.m20926a(this.f25102t, null, c11289b));
            return c11289b;
        }

        @Override // im.InterfaceC8016c
        /* renamed from: i */
        public void mo24634i(long j10) {
            if (EnumC12224g.m39359p(j10)) {
                C12501d.m40928a(this.f25097d, j10);
                m30487e();
            }
        }

        /* renamed from: j */
        void m30490j(a<T, R>.C13230a c13230a) {
            this.f25098e.mo23022c(c13230a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z10 = this.f25099f.decrementAndGet() == 0;
                    C11289b<R> c11289b = this.f25102t.get();
                    if (z10 && (c11289b == null || c11289b.isEmpty())) {
                        Throwable m40927b = this.f25100r.m40927b();
                        if (m40927b != null) {
                            this.f25094a.onError(m40927b);
                            return;
                        } else {
                            this.f25094a.mo24632a();
                            return;
                        }
                    }
                    if (this.f25096c != Integer.MAX_VALUE) {
                        this.f25103u.mo24634i(1L);
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    m30488g();
                    return;
                }
            }
            this.f25099f.decrementAndGet();
            if (this.f25096c != Integer.MAX_VALUE) {
                this.f25103u.mo24634i(1L);
            }
            m30487e();
        }

        /* renamed from: k */
        void m30491k(a<T, R>.C13230a c13230a, Throwable th2) {
            this.f25098e.mo23022c(c13230a);
            if (!this.f25100r.m40926a(th2)) {
                C12727a.m41995q(th2);
                return;
            }
            if (!this.f25095b) {
                this.f25103u.cancel();
                this.f25098e.dispose();
            } else if (this.f25096c != Integer.MAX_VALUE) {
                this.f25103u.mo24634i(1L);
            }
            this.f25099f.decrementAndGet();
            m30487e();
        }

        /* renamed from: l */
        void m30492l(a<T, R>.C13230a c13230a, R r10) {
            this.f25098e.mo23022c(c13230a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z10 = this.f25099f.decrementAndGet() == 0;
                    if (this.f25097d.get() != 0) {
                        this.f25094a.mo24633c(r10);
                        C11289b<R> c11289b = this.f25102t.get();
                        if (z10 && (c11289b == null || c11289b.isEmpty())) {
                            Throwable m40927b = this.f25100r.m40927b();
                            if (m40927b != null) {
                                this.f25094a.onError(m40927b);
                                return;
                            } else {
                                this.f25094a.mo24632a();
                                return;
                            }
                        }
                        C12501d.m40931d(this.f25097d, 1L);
                        if (this.f25096c != Integer.MAX_VALUE) {
                            this.f25103u.mo24634i(1L);
                        }
                    } else {
                        C11289b<R> m30489h = m30489h();
                        synchronized (m30489h) {
                            m30489h.offer(r10);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    m30488g();
                }
            }
            C11289b<R> m30489h2 = m30489h();
            synchronized (m30489h2) {
                m30489h2.offer(r10);
            }
            this.f25099f.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            m30488g();
        }

        @Override // im.InterfaceC8015b
        public void onError(Throwable th2) {
            this.f25099f.decrementAndGet();
            if (!this.f25100r.m40926a(th2)) {
                C12727a.m41995q(th2);
                return;
            }
            if (!this.f25095b) {
                this.f25098e.dispose();
            }
            m30487e();
        }
    }

    public C10184j(AbstractC6981f<T> abstractC6981f, InterfaceC9077e<? super T, ? extends InterfaceC6989n<? extends R>> interfaceC9077e, boolean z10, int i10) {
        super(abstractC6981f);
        this.f25091c = interfaceC9077e;
        this.f25092d = z10;
        this.f25093e = i10;
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    protected void mo20229I(InterfaceC8015b<? super R> interfaceC8015b) {
        this.f24989b.m20228H(new a(interfaceC8015b, this.f25091c, this.f25092d, this.f25093e));
    }
}
