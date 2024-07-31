package p297pj;

import dj.AbstractC6981f;
import dj.InterfaceC6984i;
import im.InterfaceC8014a;
import im.InterfaceC8015b;
import im.InterfaceC8016c;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p073e2.C7099c;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p145hj.C7745c;
import p186jj.InterfaceC9077e;
import p224lj.C9513b;
import p241mj.InterfaceC9597g;
import p241mj.InterfaceC9599i;
import p241mj.InterfaceC9600j;
import p426wj.EnumC12224g;
import p449xj.C12500c;
import p449xj.C12501d;
import p449xj.C12504g;
import p471yj.C12727a;
import tj.C11288a;
import tj.C11289b;

/* renamed from: pj.i */
/* loaded from: classes3.dex */
public final class C10183i<T, U> extends AbstractC10175a<T, U> {

    /* renamed from: c */
    final InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends U>> f25060c;

    /* renamed from: d */
    final boolean f25061d;

    /* renamed from: e */
    final int f25062e;

    /* renamed from: f */
    final int f25063f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pj.i$a */
    /* loaded from: classes3.dex */
    public static final class a<T, U> extends AtomicReference<InterfaceC8016c> implements InterfaceC6984i<U>, InterfaceC7578b {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: a */
        final long f25064a;

        /* renamed from: b */
        final b<T, U> f25065b;

        /* renamed from: c */
        final int f25066c;

        /* renamed from: d */
        final int f25067d;

        /* renamed from: e */
        volatile boolean f25068e;

        /* renamed from: f */
        volatile InterfaceC9600j<U> f25069f;

        /* renamed from: r */
        long f25070r;

        /* renamed from: s */
        int f25071s;

        a(b<T, U> bVar, long j10) {
            this.f25064a = j10;
            this.f25065b = bVar;
            int i10 = bVar.f25080e;
            this.f25067d = i10;
            this.f25066c = i10 >> 2;
        }

        @Override // im.InterfaceC8015b
        /* renamed from: a */
        public void mo24632a() {
            this.f25068e = true;
            this.f25065b.m30478j();
        }

        /* renamed from: b */
        void m30473b(long j10) {
            if (this.f25071s != 1) {
                long j11 = this.f25070r + j10;
                if (j11 < this.f25066c) {
                    this.f25070r = j11;
                } else {
                    this.f25070r = 0L;
                    get().mo24634i(j11);
                }
            }
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(U u10) {
            if (this.f25071s != 2) {
                this.f25065b.m30484p(u10, this);
            } else {
                this.f25065b.m30478j();
            }
        }

        @Override // dj.InterfaceC6984i, im.InterfaceC8015b
        /* renamed from: d */
        public void mo20249d(InterfaceC8016c interfaceC8016c) {
            if (EnumC12224g.m39358o(this, interfaceC8016c)) {
                if (interfaceC8016c instanceof InterfaceC9597g) {
                    InterfaceC9597g interfaceC9597g = (InterfaceC9597g) interfaceC8016c;
                    int mo27706l = interfaceC9597g.mo27706l(7);
                    if (mo27706l == 1) {
                        this.f25071s = mo27706l;
                        this.f25069f = interfaceC9597g;
                        this.f25068e = true;
                        this.f25065b.m30478j();
                        return;
                    }
                    if (mo27706l == 2) {
                        this.f25071s = mo27706l;
                        this.f25069f = interfaceC9597g;
                    }
                }
                interfaceC8016c.mo24634i(this.f25067d);
            }
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            EnumC12224g.m39353b(this);
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return get() == EnumC12224g.CANCELLED;
        }

        @Override // im.InterfaceC8015b
        public void onError(Throwable th2) {
            lazySet(EnumC12224g.CANCELLED);
            this.f25065b.m30482n(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pj.i$b */
    /* loaded from: classes3.dex */
    public static final class b<T, U> extends AtomicInteger implements InterfaceC6984i<T>, InterfaceC8016c {

        /* renamed from: C */
        static final a<?, ?>[] f25072C = new a[0];

        /* renamed from: D */
        static final a<?, ?>[] f25073D = new a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: A */
        int f25074A;

        /* renamed from: B */
        final int f25075B;

        /* renamed from: a */
        final InterfaceC8015b<? super U> f25076a;

        /* renamed from: b */
        final InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends U>> f25077b;

        /* renamed from: c */
        final boolean f25078c;

        /* renamed from: d */
        final int f25079d;

        /* renamed from: e */
        final int f25080e;

        /* renamed from: f */
        volatile InterfaceC9599i<U> f25081f;

        /* renamed from: r */
        volatile boolean f25082r;

        /* renamed from: s */
        final C12500c f25083s = new C12500c();

        /* renamed from: t */
        volatile boolean f25084t;

        /* renamed from: u */
        final AtomicReference<a<?, ?>[]> f25085u;

        /* renamed from: v */
        final AtomicLong f25086v;

        /* renamed from: w */
        InterfaceC8016c f25087w;

        /* renamed from: x */
        long f25088x;

        /* renamed from: y */
        long f25089y;

        /* renamed from: z */
        int f25090z;

        b(InterfaceC8015b<? super U> interfaceC8015b, InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends U>> interfaceC9077e, boolean z10, int i10, int i11) {
            AtomicReference<a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.f25085u = atomicReference;
            this.f25086v = new AtomicLong();
            this.f25076a = interfaceC8015b;
            this.f25077b = interfaceC9077e;
            this.f25078c = z10;
            this.f25079d = i10;
            this.f25080e = i11;
            this.f25075B = Math.max(1, i10 >> 1);
            atomicReference.lazySet(f25072C);
        }

        @Override // im.InterfaceC8015b
        /* renamed from: a */
        public void mo24632a() {
            if (this.f25082r) {
                return;
            }
            this.f25082r = true;
            m30478j();
        }

        /* renamed from: b */
        boolean m30474b(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.f25085u.get();
                if (aVarArr == f25073D) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!C7099c.m20926a(this.f25085u, aVarArr, aVarArr2));
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(T t10) {
            if (this.f25082r) {
                return;
            }
            try {
                InterfaceC8014a interfaceC8014a = (InterfaceC8014a) C9513b.m28324d(this.f25077b.apply(t10), "The mapper returned a null Publisher");
                if (!(interfaceC8014a instanceof Callable)) {
                    long j10 = this.f25088x;
                    this.f25088x = 1 + j10;
                    a aVar = new a(this, j10);
                    if (m30474b(aVar)) {
                        interfaceC8014a.mo20231a(aVar);
                        return;
                    }
                    return;
                }
                try {
                    Object call = ((Callable) interfaceC8014a).call();
                    if (call != null) {
                        m30485q(call);
                        return;
                    }
                    if (this.f25079d == Integer.MAX_VALUE || this.f25084t) {
                        return;
                    }
                    int i10 = this.f25074A + 1;
                    this.f25074A = i10;
                    int i11 = this.f25075B;
                    if (i10 == i11) {
                        this.f25074A = 0;
                        this.f25087w.mo24634i(i11);
                    }
                } catch (Throwable th2) {
                    C7744b.m23648b(th2);
                    this.f25083s.m40926a(th2);
                    m30478j();
                }
            } catch (Throwable th3) {
                C7744b.m23648b(th3);
                this.f25087w.cancel();
                onError(th3);
            }
        }

        @Override // im.InterfaceC8016c
        public void cancel() {
            InterfaceC9599i<U> interfaceC9599i;
            if (this.f25084t) {
                return;
            }
            this.f25084t = true;
            this.f25087w.cancel();
            m30477h();
            if (getAndIncrement() != 0 || (interfaceC9599i = this.f25081f) == null) {
                return;
            }
            interfaceC9599i.clear();
        }

        @Override // dj.InterfaceC6984i, im.InterfaceC8015b
        /* renamed from: d */
        public void mo20249d(InterfaceC8016c interfaceC8016c) {
            if (EnumC12224g.m39360q(this.f25087w, interfaceC8016c)) {
                this.f25087w = interfaceC8016c;
                this.f25076a.mo20249d(this);
                if (this.f25084t) {
                    return;
                }
                int i10 = this.f25079d;
                interfaceC8016c.mo24634i(i10 == Integer.MAX_VALUE ? Long.MAX_VALUE : i10);
            }
        }

        /* renamed from: e */
        boolean m30475e() {
            if (this.f25084t) {
                m30476g();
                return true;
            }
            if (this.f25078c || this.f25083s.get() == null) {
                return false;
            }
            m30476g();
            Throwable m40927b = this.f25083s.m40927b();
            if (m40927b != C12504g.f33905a) {
                this.f25076a.onError(m40927b);
            }
            return true;
        }

        /* renamed from: g */
        void m30476g() {
            InterfaceC9599i<U> interfaceC9599i = this.f25081f;
            if (interfaceC9599i != null) {
                interfaceC9599i.clear();
            }
        }

        /* renamed from: h */
        void m30477h() {
            a<?, ?>[] andSet;
            a<?, ?>[] aVarArr = this.f25085u.get();
            a<?, ?>[] aVarArr2 = f25073D;
            if (aVarArr == aVarArr2 || (andSet = this.f25085u.getAndSet(aVarArr2)) == aVarArr2) {
                return;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.dispose();
            }
            Throwable m40927b = this.f25083s.m40927b();
            if (m40927b == null || m40927b == C12504g.f33905a) {
                return;
            }
            C12727a.m41995q(m40927b);
        }

        @Override // im.InterfaceC8016c
        /* renamed from: i */
        public void mo24634i(long j10) {
            if (EnumC12224g.m39359p(j10)) {
                C12501d.m40928a(this.f25086v, j10);
                m30478j();
            }
        }

        /* renamed from: j */
        void m30478j() {
            if (getAndIncrement() == 0) {
                m30479k();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: k */
        void m30479k() {
            long j10;
            long j11;
            boolean z10;
            int i10;
            long j12;
            Object obj;
            InterfaceC8015b<? super U> interfaceC8015b = this.f25076a;
            int i11 = 1;
            while (!m30475e()) {
                InterfaceC9599i<U> interfaceC9599i = this.f25081f;
                long j13 = this.f25086v.get();
                boolean z11 = j13 == Long.MAX_VALUE;
                long j14 = 0;
                long j15 = 0;
                if (interfaceC9599i != null) {
                    do {
                        long j16 = 0;
                        obj = null;
                        while (true) {
                            if (j13 == 0) {
                                break;
                            }
                            U poll = interfaceC9599i.poll();
                            if (m30475e()) {
                                return;
                            }
                            if (poll == null) {
                                obj = poll;
                                break;
                            }
                            interfaceC8015b.mo24633c(poll);
                            j15++;
                            j16++;
                            j13--;
                            obj = poll;
                        }
                        if (j16 != 0) {
                            j13 = z11 ? Long.MAX_VALUE : this.f25086v.addAndGet(-j16);
                        }
                        if (j13 == 0) {
                            break;
                        }
                    } while (obj != null);
                }
                boolean z12 = this.f25082r;
                InterfaceC9599i<U> interfaceC9599i2 = this.f25081f;
                a<?, ?>[] aVarArr = this.f25085u.get();
                int length = aVarArr.length;
                if (z12 && ((interfaceC9599i2 == null || interfaceC9599i2.isEmpty()) && length == 0)) {
                    Throwable m40927b = this.f25083s.m40927b();
                    if (m40927b != C12504g.f33905a) {
                        if (m40927b == null) {
                            interfaceC8015b.mo24632a();
                            return;
                        } else {
                            interfaceC8015b.onError(m40927b);
                            return;
                        }
                    }
                    return;
                }
                int i12 = i11;
                if (length != 0) {
                    long j17 = this.f25089y;
                    int i13 = this.f25090z;
                    if (length <= i13 || aVarArr[i13].f25064a != j17) {
                        if (length <= i13) {
                            i13 = 0;
                        }
                        for (int i14 = 0; i14 < length && aVarArr[i13].f25064a != j17; i14++) {
                            i13++;
                            if (i13 == length) {
                                i13 = 0;
                            }
                        }
                        this.f25090z = i13;
                        this.f25089y = aVarArr[i13].f25064a;
                    }
                    int i15 = i13;
                    boolean z13 = false;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= length) {
                            z10 = z13;
                            break;
                        }
                        if (m30475e()) {
                            return;
                        }
                        a<T, U> aVar = aVarArr[i15];
                        Object obj2 = null;
                        while (!m30475e()) {
                            InterfaceC9600j<U> interfaceC9600j = aVar.f25069f;
                            int i17 = length;
                            if (interfaceC9600j != null) {
                                Object obj3 = obj2;
                                long j18 = j14;
                                while (true) {
                                    if (j13 == j14) {
                                        break;
                                    }
                                    try {
                                        U poll2 = interfaceC9600j.poll();
                                        if (poll2 == null) {
                                            obj3 = poll2;
                                            j14 = 0;
                                            break;
                                        }
                                        interfaceC8015b.mo24633c(poll2);
                                        if (m30475e()) {
                                            return;
                                        }
                                        j13--;
                                        j18++;
                                        obj3 = poll2;
                                        j14 = 0;
                                    } catch (Throwable th2) {
                                        C7744b.m23648b(th2);
                                        aVar.dispose();
                                        this.f25083s.m40926a(th2);
                                        if (!this.f25078c) {
                                            this.f25087w.cancel();
                                        }
                                        if (m30475e()) {
                                            return;
                                        }
                                        m30483o(aVar);
                                        i16++;
                                        z13 = true;
                                        i10 = 1;
                                    }
                                }
                                if (j18 != j14) {
                                    j13 = !z11 ? this.f25086v.addAndGet(-j18) : Long.MAX_VALUE;
                                    aVar.m30473b(j18);
                                    j12 = 0;
                                } else {
                                    j12 = j14;
                                }
                                if (j13 != j12 && obj3 != null) {
                                    length = i17;
                                    obj2 = obj3;
                                    j14 = 0;
                                }
                            }
                            boolean z14 = aVar.f25068e;
                            InterfaceC9600j<U> interfaceC9600j2 = aVar.f25069f;
                            if (z14 && (interfaceC9600j2 == null || interfaceC9600j2.isEmpty())) {
                                m30483o(aVar);
                                if (m30475e()) {
                                    return;
                                }
                                j15++;
                                z13 = true;
                            }
                            if (j13 == 0) {
                                z10 = z13;
                                break;
                            }
                            i15++;
                            if (i15 == i17) {
                                i15 = 0;
                            }
                            i10 = 1;
                            i16 += i10;
                            length = i17;
                            j14 = 0;
                        }
                        return;
                    }
                    this.f25090z = i15;
                    this.f25089y = aVarArr[i15].f25064a;
                    j11 = j15;
                    j10 = 0;
                } else {
                    j10 = 0;
                    j11 = j15;
                    z10 = false;
                }
                if (j11 != j10 && !this.f25084t) {
                    this.f25087w.mo24634i(j11);
                }
                if (z10) {
                    i11 = i12;
                } else {
                    i11 = addAndGet(-i12);
                    if (i11 == 0) {
                        return;
                    }
                }
            }
        }

        /* renamed from: l */
        InterfaceC9600j<U> m30480l(a<T, U> aVar) {
            InterfaceC9600j<U> interfaceC9600j = aVar.f25069f;
            if (interfaceC9600j != null) {
                return interfaceC9600j;
            }
            C11288a c11288a = new C11288a(this.f25080e);
            aVar.f25069f = c11288a;
            return c11288a;
        }

        /* renamed from: m */
        InterfaceC9600j<U> m30481m() {
            InterfaceC9599i<U> interfaceC9599i = this.f25081f;
            if (interfaceC9599i == null) {
                interfaceC9599i = this.f25079d == Integer.MAX_VALUE ? new C11289b<>(this.f25080e) : new C11288a<>(this.f25079d);
                this.f25081f = interfaceC9599i;
            }
            return interfaceC9599i;
        }

        /* renamed from: n */
        void m30482n(a<T, U> aVar, Throwable th2) {
            if (!this.f25083s.m40926a(th2)) {
                C12727a.m41995q(th2);
                return;
            }
            aVar.f25068e = true;
            if (!this.f25078c) {
                this.f25087w.cancel();
                for (a<?, ?> aVar2 : this.f25085u.getAndSet(f25073D)) {
                    aVar2.dispose();
                }
            }
            m30478j();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: o */
        void m30483o(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.f25085u.get();
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
                    aVarArr2 = f25072C;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!C7099c.m20926a(this.f25085u, aVarArr, aVarArr2));
        }

        @Override // im.InterfaceC8015b
        public void onError(Throwable th2) {
            if (this.f25082r) {
                C12727a.m41995q(th2);
            } else if (!this.f25083s.m40926a(th2)) {
                C12727a.m41995q(th2);
            } else {
                this.f25082r = true;
                m30478j();
            }
        }

        /* renamed from: p */
        void m30484p(U u10, a<T, U> aVar) {
            C7745c c7745c;
            if (get() != 0 || !compareAndSet(0, 1)) {
                InterfaceC9600j interfaceC9600j = aVar.f25069f;
                if (interfaceC9600j == null) {
                    interfaceC9600j = new C11288a(this.f25080e);
                    aVar.f25069f = interfaceC9600j;
                }
                if (!interfaceC9600j.offer(u10)) {
                    c7745c = new C7745c("Inner queue full?!");
                    onError(c7745c);
                    return;
                } else {
                    if (getAndIncrement() != 0) {
                        return;
                    }
                    m30479k();
                }
            }
            long j10 = this.f25086v.get();
            InterfaceC9600j<U> interfaceC9600j2 = aVar.f25069f;
            if (j10 == 0 || !(interfaceC9600j2 == null || interfaceC9600j2.isEmpty())) {
                if (interfaceC9600j2 == null) {
                    interfaceC9600j2 = m30480l(aVar);
                }
                if (!interfaceC9600j2.offer(u10)) {
                    c7745c = new C7745c("Inner queue full?!");
                    onError(c7745c);
                    return;
                }
            } else {
                this.f25076a.mo24633c(u10);
                if (j10 != Long.MAX_VALUE) {
                    this.f25086v.decrementAndGet();
                }
                aVar.m30473b(1L);
            }
            if (decrementAndGet() == 0) {
                return;
            }
            m30479k();
        }

        /* renamed from: q */
        void m30485q(U u10) {
            IllegalStateException illegalStateException;
            if (get() != 0 || !compareAndSet(0, 1)) {
                if (!m30481m().offer(u10)) {
                    illegalStateException = new IllegalStateException("Scalar queue full?!");
                    onError(illegalStateException);
                    return;
                } else {
                    if (getAndIncrement() != 0) {
                        return;
                    }
                    m30479k();
                }
            }
            long j10 = this.f25086v.get();
            InterfaceC9600j<U> interfaceC9600j = this.f25081f;
            if (j10 == 0 || !(interfaceC9600j == null || interfaceC9600j.isEmpty())) {
                if (interfaceC9600j == null) {
                    interfaceC9600j = m30481m();
                }
                if (!interfaceC9600j.offer(u10)) {
                    illegalStateException = new IllegalStateException("Scalar queue full?!");
                    onError(illegalStateException);
                    return;
                }
            } else {
                this.f25076a.mo24633c(u10);
                if (j10 != Long.MAX_VALUE) {
                    this.f25086v.decrementAndGet();
                }
                if (this.f25079d != Integer.MAX_VALUE && !this.f25084t) {
                    int i10 = this.f25074A + 1;
                    this.f25074A = i10;
                    int i11 = this.f25075B;
                    if (i10 == i11) {
                        this.f25074A = 0;
                        this.f25087w.mo24634i(i11);
                    }
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
            m30479k();
        }
    }

    public C10183i(AbstractC6981f<T> abstractC6981f, InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends U>> interfaceC9077e, boolean z10, int i10, int i11) {
        super(abstractC6981f);
        this.f25060c = interfaceC9077e;
        this.f25061d = z10;
        this.f25062e = i10;
        this.f25063f = i11;
    }

    /* renamed from: K */
    public static <T, U> InterfaceC6984i<T> m30472K(InterfaceC8015b<? super U> interfaceC8015b, InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends U>> interfaceC9077e, boolean z10, int i10, int i11) {
        return new b(interfaceC8015b, interfaceC9077e, z10, i10, i11);
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    protected void mo20229I(InterfaceC8015b<? super U> interfaceC8015b) {
        if (C10198x.m30517b(this.f24989b, interfaceC8015b, this.f25060c)) {
            return;
        }
        this.f24989b.m20228H(m30472K(interfaceC8015b, this.f25060c, this.f25061d, this.f25062e, this.f25063f));
    }
}
