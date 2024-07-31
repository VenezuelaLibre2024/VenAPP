package p016ak;

import dj.InterfaceC6992q;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p073e2.C7099c;
import p123gj.InterfaceC7578b;
import p224lj.C9513b;
import p449xj.C12498a;
import p449xj.C12504g;
import p449xj.EnumC12506i;
import p471yj.C12727a;

/* renamed from: ak.a */
/* loaded from: classes3.dex */
public final class C0129a<T> extends AbstractC0130b<T> {

    /* renamed from: s */
    private static final Object[] f534s = new Object[0];

    /* renamed from: t */
    static final a[] f535t = new a[0];

    /* renamed from: u */
    static final a[] f536u = new a[0];

    /* renamed from: a */
    final AtomicReference<Object> f537a;

    /* renamed from: b */
    final AtomicReference<a<T>[]> f538b;

    /* renamed from: c */
    final ReadWriteLock f539c;

    /* renamed from: d */
    final Lock f540d;

    /* renamed from: e */
    final Lock f541e;

    /* renamed from: f */
    final AtomicReference<Throwable> f542f;

    /* renamed from: r */
    long f543r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ak.a$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements InterfaceC7578b, C12498a.a<Object> {

        /* renamed from: a */
        final InterfaceC6992q<? super T> f544a;

        /* renamed from: b */
        final C0129a<T> f545b;

        /* renamed from: c */
        boolean f546c;

        /* renamed from: d */
        boolean f547d;

        /* renamed from: e */
        C12498a<Object> f548e;

        /* renamed from: f */
        boolean f549f;

        /* renamed from: r */
        volatile boolean f550r;

        /* renamed from: s */
        long f551s;

        a(InterfaceC6992q<? super T> interfaceC6992q, C0129a<T> c0129a) {
            this.f544a = interfaceC6992q;
            this.f545b = c0129a;
        }

        /* renamed from: a */
        void m613a() {
            if (this.f550r) {
                return;
            }
            synchronized (this) {
                if (this.f550r) {
                    return;
                }
                if (this.f546c) {
                    return;
                }
                C0129a<T> c0129a = this.f545b;
                Lock lock = c0129a.f540d;
                lock.lock();
                this.f551s = c0129a.f543r;
                Object obj = c0129a.f537a.get();
                lock.unlock();
                this.f547d = obj != null;
                this.f546c = true;
                if (obj == null || test(obj)) {
                    return;
                }
                m614b();
            }
        }

        /* renamed from: b */
        void m614b() {
            C12498a<Object> c12498a;
            while (!this.f550r) {
                synchronized (this) {
                    c12498a = this.f548e;
                    if (c12498a == null) {
                        this.f547d = false;
                        return;
                    }
                    this.f548e = null;
                }
                c12498a.m40922b(this);
            }
        }

        /* renamed from: c */
        void m615c(Object obj, long j10) {
            if (this.f550r) {
                return;
            }
            if (!this.f549f) {
                synchronized (this) {
                    if (this.f550r) {
                        return;
                    }
                    if (this.f551s == j10) {
                        return;
                    }
                    if (this.f547d) {
                        C12498a<Object> c12498a = this.f548e;
                        if (c12498a == null) {
                            c12498a = new C12498a<>(4);
                            this.f548e = c12498a;
                        }
                        c12498a.m40921a(obj);
                        return;
                    }
                    this.f546c = true;
                    this.f549f = true;
                }
            }
            test(obj);
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            if (this.f550r) {
                return;
            }
            this.f550r = true;
            this.f545b.m610x(this);
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f550r;
        }

        @Override // p449xj.C12498a.a, p186jj.InterfaceC9079g
        public boolean test(Object obj) {
            return this.f550r || EnumC12506i.m40940b(obj, this.f544a);
        }
    }

    C0129a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f539c = reentrantReadWriteLock;
        this.f540d = reentrantReadWriteLock.readLock();
        this.f541e = reentrantReadWriteLock.writeLock();
        this.f538b = new AtomicReference<>(f535t);
        this.f537a = new AtomicReference<>();
        this.f542f = new AtomicReference<>();
    }

    /* renamed from: w */
    public static <T> C0129a<T> m604w() {
        return new C0129a<>();
    }

    @Override // dj.InterfaceC6992q
    /* renamed from: a */
    public void mo605a() {
        if (C7099c.m20926a(this.f542f, null, C12504g.f33905a)) {
            Object m40941h = EnumC12506i.m40941h();
            for (a<T> aVar : m612z(m40941h)) {
                aVar.m615c(m40941h, this.f543r);
            }
        }
    }

    @Override // dj.InterfaceC6992q
    /* renamed from: b */
    public void mo606b(InterfaceC7578b interfaceC7578b) {
        if (this.f542f.get() != null) {
            interfaceC7578b.dispose();
        }
    }

    @Override // dj.InterfaceC6992q
    /* renamed from: c */
    public void mo607c(T t10) {
        C9513b.m28324d(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f542f.get() != null) {
            return;
        }
        Object m40946o = EnumC12506i.m40946o(t10);
        m611y(m40946o);
        for (a<T> aVar : this.f538b.get()) {
            aVar.m615c(m40946o, this.f543r);
        }
    }

    @Override // dj.InterfaceC6992q
    public void onError(Throwable th2) {
        C9513b.m28324d(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!C7099c.m20926a(this.f542f, null, th2)) {
            C12727a.m41995q(th2);
            return;
        }
        Object m40942i = EnumC12506i.m40942i(th2);
        for (a<T> aVar : m612z(m40942i)) {
            aVar.m615c(m40942i, this.f543r);
        }
    }

    @Override // dj.AbstractC6990o
    /* renamed from: s */
    protected void mo608s(InterfaceC6992q<? super T> interfaceC6992q) {
        a<T> aVar = new a<>(interfaceC6992q, this);
        interfaceC6992q.mo606b(aVar);
        if (m609v(aVar)) {
            if (aVar.f550r) {
                m610x(aVar);
                return;
            } else {
                aVar.m613a();
                return;
            }
        }
        Throwable th2 = this.f542f.get();
        if (th2 == C12504g.f33905a) {
            interfaceC6992q.mo605a();
        } else {
            interfaceC6992q.onError(th2);
        }
    }

    /* renamed from: v */
    boolean m609v(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f538b.get();
            if (aVarArr == f536u) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!C7099c.m20926a(this.f538b, aVarArr, aVarArr2));
        return true;
    }

    /* renamed from: x */
    void m610x(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f538b.get();
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
                aVarArr2 = f535t;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!C7099c.m20926a(this.f538b, aVarArr, aVarArr2));
    }

    /* renamed from: y */
    void m611y(Object obj) {
        this.f541e.lock();
        this.f543r++;
        this.f537a.lazySet(obj);
        this.f541e.unlock();
    }

    /* renamed from: z */
    a<T>[] m612z(Object obj) {
        AtomicReference<a<T>[]> atomicReference = this.f538b;
        a<T>[] aVarArr = f536u;
        a<T>[] andSet = atomicReference.getAndSet(aVarArr);
        if (andSet != aVarArr) {
            m611y(obj);
        }
        return andSet;
    }
}
