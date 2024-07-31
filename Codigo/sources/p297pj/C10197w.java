package p297pj;

import dj.AbstractC6981f;
import dj.InterfaceC6984i;
import im.InterfaceC8014a;
import im.InterfaceC8015b;
import im.InterfaceC8016c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p073e2.C7099c;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p145hj.C7745c;
import p165ij.AbstractC8003a;
import p186jj.InterfaceC9076d;
import p241mj.InterfaceC9597g;
import p241mj.InterfaceC9600j;
import p426wj.EnumC12224g;
import p449xj.C12501d;
import p449xj.C12504g;
import p449xj.EnumC12506i;
import p471yj.C12727a;
import tj.C11288a;

/* renamed from: pj.w */
/* loaded from: classes3.dex */
public final class C10197w<T> extends AbstractC8003a<T> {

    /* renamed from: b */
    final AbstractC6981f<T> f25188b;

    /* renamed from: c */
    final AtomicReference<c<T>> f25189c;

    /* renamed from: d */
    final int f25190d;

    /* renamed from: e */
    final InterfaceC8014a<T> f25191e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pj.w$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements InterfaceC8014a<T> {

        /* renamed from: a */
        private final AtomicReference<c<T>> f25192a;

        /* renamed from: b */
        private final int f25193b;

        a(AtomicReference<c<T>> atomicReference, int i10) {
            this.f25192a = atomicReference;
            this.f25193b = i10;
        }

        @Override // im.InterfaceC8014a
        /* renamed from: a */
        public void mo20231a(InterfaceC8015b<? super T> interfaceC8015b) {
            c<T> cVar;
            b<T> bVar = new b<>(interfaceC8015b);
            interfaceC8015b.mo20249d(bVar);
            while (true) {
                cVar = this.f25192a.get();
                if (cVar == null || cVar.mo616h()) {
                    c<T> cVar2 = new c<>(this.f25192a, this.f25193b);
                    if (C7099c.m20926a(this.f25192a, cVar, cVar2)) {
                        cVar = cVar2;
                    } else {
                        continue;
                    }
                }
                if (cVar.m30512b(bVar)) {
                    break;
                }
            }
            if (bVar.get() == Long.MIN_VALUE) {
                cVar.m30515i(bVar);
            } else {
                bVar.f25195b = cVar;
            }
            cVar.m30514g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pj.w$b */
    /* loaded from: classes3.dex */
    public static final class b<T> extends AtomicLong implements InterfaceC8016c {
        private static final long serialVersionUID = -4453897557930727610L;

        /* renamed from: a */
        final InterfaceC8015b<? super T> f25194a;

        /* renamed from: b */
        volatile c<T> f25195b;

        /* renamed from: c */
        long f25196c;

        b(InterfaceC8015b<? super T> interfaceC8015b) {
            this.f25194a = interfaceC8015b;
        }

        @Override // im.InterfaceC8016c
        public void cancel() {
            c<T> cVar;
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (cVar = this.f25195b) == null) {
                return;
            }
            cVar.m30515i(this);
            cVar.m30514g();
        }

        @Override // im.InterfaceC8016c
        /* renamed from: i */
        public void mo24634i(long j10) {
            if (EnumC12224g.m39359p(j10)) {
                C12501d.m40929b(this, j10);
                c<T> cVar = this.f25195b;
                if (cVar != null) {
                    cVar.m30514g();
                }
            }
        }
    }

    /* renamed from: pj.w$c */
    /* loaded from: classes3.dex */
    static final class c<T> extends AtomicInteger implements InterfaceC6984i<T>, InterfaceC7578b {
        private static final long serialVersionUID = -202316842419149694L;

        /* renamed from: t */
        static final b[] f25197t = new b[0];

        /* renamed from: u */
        static final b[] f25198u = new b[0];

        /* renamed from: a */
        final AtomicReference<c<T>> f25199a;

        /* renamed from: b */
        final int f25200b;

        /* renamed from: f */
        volatile Object f25204f;

        /* renamed from: r */
        int f25205r;

        /* renamed from: s */
        volatile InterfaceC9600j<T> f25206s;

        /* renamed from: e */
        final AtomicReference<InterfaceC8016c> f25203e = new AtomicReference<>();

        /* renamed from: c */
        final AtomicReference<b<T>[]> f25201c = new AtomicReference<>(f25197t);

        /* renamed from: d */
        final AtomicBoolean f25202d = new AtomicBoolean();

        c(AtomicReference<c<T>> atomicReference, int i10) {
            this.f25199a = atomicReference;
            this.f25200b = i10;
        }

        @Override // im.InterfaceC8015b
        /* renamed from: a */
        public void mo24632a() {
            if (this.f25204f == null) {
                this.f25204f = EnumC12506i.m40941h();
                m30514g();
            }
        }

        /* renamed from: b */
        boolean m30512b(b<T> bVar) {
            b<T>[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = this.f25201c.get();
                if (bVarArr == f25198u) {
                    return false;
                }
                int length = bVarArr.length;
                bVarArr2 = new b[length + 1];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
            } while (!C7099c.m20926a(this.f25201c, bVarArr, bVarArr2));
            return true;
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(T t10) {
            if (this.f25205r != 0 || this.f25206s.offer(t10)) {
                m30514g();
            } else {
                onError(new C7745c("Prefetch queue is full?!"));
            }
        }

        @Override // dj.InterfaceC6984i, im.InterfaceC8015b
        /* renamed from: d */
        public void mo20249d(InterfaceC8016c interfaceC8016c) {
            if (EnumC12224g.m39358o(this.f25203e, interfaceC8016c)) {
                if (interfaceC8016c instanceof InterfaceC9597g) {
                    InterfaceC9597g interfaceC9597g = (InterfaceC9597g) interfaceC8016c;
                    int mo27706l = interfaceC9597g.mo27706l(3);
                    if (mo27706l == 1) {
                        this.f25205r = mo27706l;
                        this.f25206s = interfaceC9597g;
                        this.f25204f = EnumC12506i.m40941h();
                        m30514g();
                        return;
                    }
                    if (mo27706l == 2) {
                        this.f25205r = mo27706l;
                        this.f25206s = interfaceC9597g;
                        interfaceC8016c.mo24634i(this.f25200b);
                        return;
                    }
                }
                this.f25206s = new C11288a(this.f25200b);
                interfaceC8016c.mo24634i(this.f25200b);
            }
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            b<T>[] bVarArr = this.f25201c.get();
            b<T>[] bVarArr2 = f25198u;
            if (bVarArr == bVarArr2 || this.f25201c.getAndSet(bVarArr2) == bVarArr2) {
                return;
            }
            C7099c.m20926a(this.f25199a, this, null);
            EnumC12224g.m39353b(this.f25203e);
        }

        /* renamed from: e */
        boolean m30513e(Object obj, boolean z10) {
            int i10 = 0;
            if (obj != null) {
                if (!EnumC12506i.m40945n(obj)) {
                    Throwable m40943l = EnumC12506i.m40943l(obj);
                    C7099c.m20926a(this.f25199a, this, null);
                    b<T>[] andSet = this.f25201c.getAndSet(f25198u);
                    if (andSet.length != 0) {
                        int length = andSet.length;
                        while (i10 < length) {
                            andSet[i10].f25194a.onError(m40943l);
                            i10++;
                        }
                    } else {
                        C12727a.m41995q(m40943l);
                    }
                    return true;
                }
                if (z10) {
                    C7099c.m20926a(this.f25199a, this, null);
                    b<T>[] andSet2 = this.f25201c.getAndSet(f25198u);
                    int length2 = andSet2.length;
                    while (i10 < length2) {
                        andSet2[i10].f25194a.mo24632a();
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
        
            if (r25.f25205r == 1) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x012f, code lost:
        
            r25.f25203e.get().mo24634i(r12);
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
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void m30514g() {
            /*
                Method dump skipped, instructions count: 343
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p297pj.C10197w.c.m30514g():void");
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f25201c.get() == f25198u;
        }

        /* renamed from: i */
        void m30515i(b<T> bVar) {
            b<T>[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = this.f25201c.get();
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
                    bVarArr2 = f25197t;
                } else {
                    b[] bVarArr3 = new b[length - 1];
                    System.arraycopy(bVarArr, 0, bVarArr3, 0, i10);
                    System.arraycopy(bVarArr, i10 + 1, bVarArr3, i10, (length - i10) - 1);
                    bVarArr2 = bVarArr3;
                }
            } while (!C7099c.m20926a(this.f25201c, bVarArr, bVarArr2));
        }

        @Override // im.InterfaceC8015b
        public void onError(Throwable th2) {
            if (this.f25204f != null) {
                C12727a.m41995q(th2);
            } else {
                this.f25204f = EnumC12506i.m40942i(th2);
                m30514g();
            }
        }
    }

    private C10197w(InterfaceC8014a<T> interfaceC8014a, AbstractC6981f<T> abstractC6981f, AtomicReference<c<T>> atomicReference, int i10) {
        this.f25191e = interfaceC8014a;
        this.f25188b = abstractC6981f;
        this.f25189c = atomicReference;
        this.f25190d = i10;
    }

    /* renamed from: M */
    public static <T> AbstractC8003a<T> m30511M(AbstractC6981f<T> abstractC6981f, int i10) {
        AtomicReference atomicReference = new AtomicReference();
        return C12727a.m41993o(new C10197w(new a(atomicReference, i10), abstractC6981f, atomicReference, i10));
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    protected void mo20229I(InterfaceC8015b<? super T> interfaceC8015b) {
        this.f25191e.mo20231a(interfaceC8015b);
    }

    @Override // p165ij.AbstractC8003a
    /* renamed from: L */
    public void mo24581L(InterfaceC9076d<? super InterfaceC7578b> interfaceC9076d) {
        c<T> cVar;
        while (true) {
            cVar = this.f25189c.get();
            if (cVar != null && !cVar.mo616h()) {
                break;
            }
            c<T> cVar2 = new c<>(this.f25189c, this.f25190d);
            if (C7099c.m20926a(this.f25189c, cVar, cVar2)) {
                cVar = cVar2;
                break;
            }
        }
        boolean z10 = false;
        if (!cVar.f25202d.get() && cVar.f25202d.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            interfaceC9076d.accept(cVar);
            if (z10) {
                this.f25188b.m20228H(cVar);
            }
        } catch (Throwable th2) {
            C7744b.m23648b(th2);
            throw C12504g.m40936d(th2);
        }
    }
}
