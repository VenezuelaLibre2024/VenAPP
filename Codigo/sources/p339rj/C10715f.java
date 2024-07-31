package p339rj;

import dj.InterfaceC6991p;
import dj.InterfaceC6992q;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p073e2.C7099c;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p186jj.InterfaceC9077e;
import p205kj.EnumC9284b;
import p224lj.C9513b;
import p241mj.InterfaceC9595e;
import p241mj.InterfaceC9599i;
import p241mj.InterfaceC9600j;
import p449xj.C12500c;
import p449xj.C12504g;
import p471yj.C12727a;
import tj.C11288a;
import tj.C11289b;

/* renamed from: rj.f */
/* loaded from: classes3.dex */
public final class C10715f<T, U> extends AbstractC10710a<T, U> {

    /* renamed from: b */
    final InterfaceC9077e<? super T, ? extends InterfaceC6991p<? extends U>> f27088b;

    /* renamed from: c */
    final boolean f27089c;

    /* renamed from: d */
    final int f27090d;

    /* renamed from: e */
    final int f27091e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rj.f$a */
    /* loaded from: classes3.dex */
    public static final class a<T, U> extends AtomicReference<InterfaceC7578b> implements InterfaceC6992q<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: a */
        final long f27092a;

        /* renamed from: b */
        final b<T, U> f27093b;

        /* renamed from: c */
        volatile boolean f27094c;

        /* renamed from: d */
        volatile InterfaceC9600j<U> f27095d;

        /* renamed from: e */
        int f27096e;

        a(b<T, U> bVar, long j10) {
            this.f27092a = j10;
            this.f27093b = bVar;
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: a */
        public void mo605a() {
            this.f27094c = true;
            this.f27093b.m32596g();
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: b */
        public void mo606b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27697o(this, interfaceC7578b) && (interfaceC7578b instanceof InterfaceC9595e)) {
                InterfaceC9595e interfaceC9595e = (InterfaceC9595e) interfaceC7578b;
                int mo27706l = interfaceC9595e.mo27706l(7);
                if (mo27706l == 1) {
                    this.f27096e = mo27706l;
                    this.f27095d = interfaceC9595e;
                    this.f27094c = true;
                    this.f27093b.m32596g();
                    return;
                }
                if (mo27706l == 2) {
                    this.f27096e = mo27706l;
                    this.f27095d = interfaceC9595e;
                }
            }
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: c */
        public void mo607c(U u10) {
            if (this.f27096e == 0) {
                this.f27093b.m32600l(u10, this);
            } else {
                this.f27093b.m32596g();
            }
        }

        /* renamed from: d */
        public void m32592d() {
            EnumC9284b.m27692b(this);
        }

        @Override // dj.InterfaceC6992q
        public void onError(Throwable th2) {
            if (!this.f27093b.f27107s.m40926a(th2)) {
                C12727a.m41995q(th2);
                return;
            }
            b<T, U> bVar = this.f27093b;
            if (!bVar.f27102c) {
                bVar.m32595f();
            }
            this.f27094c = true;
            this.f27093b.m32596g();
        }
    }

    /* renamed from: rj.f$b */
    /* loaded from: classes3.dex */
    static final class b<T, U> extends AtomicInteger implements InterfaceC7578b, InterfaceC6992q<T> {

        /* renamed from: B */
        static final a<?, ?>[] f27097B = new a[0];

        /* renamed from: C */
        static final a<?, ?>[] f27098C = new a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: A */
        int f27099A;

        /* renamed from: a */
        final InterfaceC6992q<? super U> f27100a;

        /* renamed from: b */
        final InterfaceC9077e<? super T, ? extends InterfaceC6991p<? extends U>> f27101b;

        /* renamed from: c */
        final boolean f27102c;

        /* renamed from: d */
        final int f27103d;

        /* renamed from: e */
        final int f27104e;

        /* renamed from: f */
        volatile InterfaceC9599i<U> f27105f;

        /* renamed from: r */
        volatile boolean f27106r;

        /* renamed from: s */
        final C12500c f27107s = new C12500c();

        /* renamed from: t */
        volatile boolean f27108t;

        /* renamed from: u */
        final AtomicReference<a<?, ?>[]> f27109u;

        /* renamed from: v */
        InterfaceC7578b f27110v;

        /* renamed from: w */
        long f27111w;

        /* renamed from: x */
        long f27112x;

        /* renamed from: y */
        int f27113y;

        /* renamed from: z */
        Queue<InterfaceC6991p<? extends U>> f27114z;

        b(InterfaceC6992q<? super U> interfaceC6992q, InterfaceC9077e<? super T, ? extends InterfaceC6991p<? extends U>> interfaceC9077e, boolean z10, int i10, int i11) {
            this.f27100a = interfaceC6992q;
            this.f27101b = interfaceC9077e;
            this.f27102c = z10;
            this.f27103d = i10;
            this.f27104e = i11;
            if (i10 != Integer.MAX_VALUE) {
                this.f27114z = new ArrayDeque(i10);
            }
            this.f27109u = new AtomicReference<>(f27097B);
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: a */
        public void mo605a() {
            if (this.f27106r) {
                return;
            }
            this.f27106r = true;
            m32596g();
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: b */
        public void mo606b(InterfaceC7578b interfaceC7578b) {
            if (EnumC9284b.m27698p(this.f27110v, interfaceC7578b)) {
                this.f27110v = interfaceC7578b;
                this.f27100a.mo606b(this);
            }
        }

        @Override // dj.InterfaceC6992q
        /* renamed from: c */
        public void mo607c(T t10) {
            if (this.f27106r) {
                return;
            }
            try {
                InterfaceC6991p<? extends U> interfaceC6991p = (InterfaceC6991p) C9513b.m28324d(this.f27101b.apply(t10), "The mapper returned a null ObservableSource");
                if (this.f27103d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i10 = this.f27099A;
                        if (i10 == this.f27103d) {
                            this.f27114z.offer(interfaceC6991p);
                            return;
                        }
                        this.f27099A = i10 + 1;
                    }
                }
                m32599k(interfaceC6991p);
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                this.f27110v.dispose();
                onError(th2);
            }
        }

        /* renamed from: d */
        boolean m32593d(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.f27109u.get();
                if (aVarArr == f27098C) {
                    aVar.m32592d();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!C7099c.m20926a(this.f27109u, aVarArr, aVarArr2));
            return true;
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            Throwable m40927b;
            if (this.f27108t) {
                return;
            }
            this.f27108t = true;
            if (!m32595f() || (m40927b = this.f27107s.m40927b()) == null || m40927b == C12504g.f33905a) {
                return;
            }
            C12727a.m41995q(m40927b);
        }

        /* renamed from: e */
        boolean m32594e() {
            if (this.f27108t) {
                return true;
            }
            Throwable th2 = this.f27107s.get();
            if (this.f27102c || th2 == null) {
                return false;
            }
            m32595f();
            Throwable m40927b = this.f27107s.m40927b();
            if (m40927b != C12504g.f33905a) {
                this.f27100a.onError(m40927b);
            }
            return true;
        }

        /* renamed from: f */
        boolean m32595f() {
            a<?, ?>[] andSet;
            this.f27110v.dispose();
            a<?, ?>[] aVarArr = this.f27109u.get();
            a<?, ?>[] aVarArr2 = f27098C;
            if (aVarArr == aVarArr2 || (andSet = this.f27109u.getAndSet(aVarArr2)) == aVarArr2) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.m32592d();
            }
            return true;
        }

        /* renamed from: g */
        void m32596g() {
            if (getAndIncrement() == 0) {
                m32597i();
            }
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f27108t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00ce A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00f9 A[SYNTHETIC] */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void m32597i() {
            /*
                Method dump skipped, instructions count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p339rj.C10715f.b.m32597i():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: j */
        void m32598j(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.f27109u.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (aVarArr[i10] == aVar) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = f27097B;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!C7099c.m20926a(this.f27109u, aVarArr, aVarArr2));
        }

        /* renamed from: k */
        void m32599k(InterfaceC6991p<? extends U> interfaceC6991p) {
            boolean z10;
            while (interfaceC6991p instanceof Callable) {
                if (!m32601m((Callable) interfaceC6991p) || this.f27103d == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    interfaceC6991p = this.f27114z.poll();
                    if (interfaceC6991p == null) {
                        z10 = true;
                        this.f27099A--;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    m32596g();
                    return;
                }
            }
            long j10 = this.f27111w;
            this.f27111w = 1 + j10;
            a<T, U> aVar = new a<>(this, j10);
            if (m32593d(aVar)) {
                interfaceC6991p.mo20285d(aVar);
            }
        }

        /* renamed from: l */
        void m32600l(U u10, a<T, U> aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f27100a.mo607c(u10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                InterfaceC9600j interfaceC9600j = aVar.f27095d;
                if (interfaceC9600j == null) {
                    interfaceC9600j = new C11289b(this.f27104e);
                    aVar.f27095d = interfaceC9600j;
                }
                interfaceC9600j.offer(u10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m32597i();
        }

        /* renamed from: m */
        boolean m32601m(Callable<? extends U> callable) {
            try {
                U call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f27100a.mo607c(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    InterfaceC9599i<U> interfaceC9599i = this.f27105f;
                    if (interfaceC9599i == null) {
                        interfaceC9599i = this.f27103d == Integer.MAX_VALUE ? new C11289b<>(this.f27104e) : new C11288a<>(this.f27103d);
                        this.f27105f = interfaceC9599i;
                    }
                    if (!interfaceC9599i.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                m32597i();
                return true;
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                this.f27107s.m40926a(th2);
                m32596g();
                return true;
            }
        }

        @Override // dj.InterfaceC6992q
        public void onError(Throwable th2) {
            if (this.f27106r) {
                C12727a.m41995q(th2);
            } else if (!this.f27107s.m40926a(th2)) {
                C12727a.m41995q(th2);
            } else {
                this.f27106r = true;
                m32596g();
            }
        }
    }

    public C10715f(InterfaceC6991p<T> interfaceC6991p, InterfaceC9077e<? super T, ? extends InterfaceC6991p<? extends U>> interfaceC9077e, boolean z10, int i10, int i11) {
        super(interfaceC6991p);
        this.f27088b = interfaceC9077e;
        this.f27089c = z10;
        this.f27090d = i10;
        this.f27091e = i11;
    }

    @Override // dj.AbstractC6990o
    /* renamed from: s */
    public void mo608s(InterfaceC6992q<? super U> interfaceC6992q) {
        if (C10721l.m32608b(this.f27073a, interfaceC6992q, this.f27088b)) {
            return;
        }
        this.f27073a.mo20285d(new b(interfaceC6992q, this.f27088b, this.f27089c, this.f27090d, this.f27091e));
    }
}
