package p297pj;

import dj.AbstractC6981f;
import dj.EnumC6976a;
import dj.InterfaceC6982g;
import dj.InterfaceC6983h;
import im.InterfaceC8015b;
import im.InterfaceC8016c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p145hj.C7744b;
import p145hj.C7745c;
import p205kj.C9287e;
import p426wj.EnumC12224g;
import p449xj.C12501d;
import p471yj.C12727a;
import tj.C11289b;

/* renamed from: pj.c */
/* loaded from: classes3.dex */
public final class C10177c<T> extends AbstractC6981f<T> {

    /* renamed from: b */
    final InterfaceC6983h<T> f25015b;

    /* renamed from: c */
    final EnumC6976a f25016c;

    /* renamed from: pj.c$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25017a;

        static {
            int[] iArr = new int[EnumC6976a.values().length];
            f25017a = iArr;
            try {
                iArr[EnumC6976a.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25017a[EnumC6976a.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25017a[EnumC6976a.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25017a[EnumC6976a.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pj.c$b */
    /* loaded from: classes3.dex */
    public static abstract class b<T> extends AtomicLong implements InterfaceC6982g<T>, InterfaceC8016c {
        private static final long serialVersionUID = 7326289992464377023L;

        /* renamed from: a */
        final InterfaceC8015b<? super T> f25018a;

        /* renamed from: b */
        final C9287e f25019b = new C9287e();

        b(InterfaceC8015b<? super T> interfaceC8015b) {
            this.f25018a = interfaceC8015b;
        }

        /* renamed from: a */
        protected void m30462a() {
            if (m30464d()) {
                return;
            }
            try {
                this.f25018a.mo24632a();
            } finally {
                this.f25019b.dispose();
            }
        }

        /* renamed from: b */
        protected boolean m30463b(Throwable th2) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (m30464d()) {
                return false;
            }
            try {
                this.f25018a.onError(th2);
                this.f25019b.dispose();
                return true;
            } catch (Throwable th3) {
                this.f25019b.dispose();
                throw th3;
            }
        }

        @Override // im.InterfaceC8016c
        public final void cancel() {
            this.f25019b.dispose();
            mo30467g();
        }

        /* renamed from: d */
        public final boolean m30464d() {
            return this.f25019b.mo616h();
        }

        /* renamed from: e */
        public final void m30465e(Throwable th2) {
            if (mo30468h(th2)) {
                return;
            }
            C12727a.m41995q(th2);
        }

        /* renamed from: f */
        void mo30466f() {
        }

        /* renamed from: g */
        void mo30467g() {
        }

        /* renamed from: h */
        public boolean mo30468h(Throwable th2) {
            return m30463b(th2);
        }

        @Override // im.InterfaceC8016c
        /* renamed from: i */
        public final void mo24634i(long j10) {
            if (EnumC12224g.m39359p(j10)) {
                C12501d.m40928a(this, j10);
                mo30466f();
            }
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    /* renamed from: pj.c$c */
    /* loaded from: classes3.dex */
    static final class c<T> extends b<T> {
        private static final long serialVersionUID = 2427151001689639875L;

        /* renamed from: c */
        final C11289b<T> f25020c;

        /* renamed from: d */
        Throwable f25021d;

        /* renamed from: e */
        volatile boolean f25022e;

        /* renamed from: f */
        final AtomicInteger f25023f;

        c(InterfaceC8015b<? super T> interfaceC8015b, int i10) {
            super(interfaceC8015b);
            this.f25020c = new C11289b<>(i10);
            this.f25023f = new AtomicInteger();
        }

        @Override // dj.InterfaceC6980e
        /* renamed from: c */
        public void mo20212c(T t10) {
            if (this.f25022e || m30464d()) {
                return;
            }
            if (t10 == null) {
                m30465e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f25020c.offer(t10);
                m30469j();
            }
        }

        @Override // p297pj.C10177c.b
        /* renamed from: f */
        void mo30466f() {
            m30469j();
        }

        @Override // p297pj.C10177c.b
        /* renamed from: g */
        void mo30467g() {
            if (this.f25023f.getAndIncrement() == 0) {
                this.f25020c.clear();
            }
        }

        @Override // p297pj.C10177c.b
        /* renamed from: h */
        public boolean mo30468h(Throwable th2) {
            if (this.f25022e || m30464d()) {
                return false;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f25021d = th2;
            this.f25022e = true;
            m30469j();
            return true;
        }

        /* renamed from: j */
        void m30469j() {
            if (this.f25023f.getAndIncrement() != 0) {
                return;
            }
            InterfaceC8015b<? super T> interfaceC8015b = this.f25018a;
            C11289b<T> c11289b = this.f25020c;
            int i10 = 1;
            do {
                long j10 = get();
                long j11 = 0;
                while (j11 != j10) {
                    if (m30464d()) {
                        c11289b.clear();
                        return;
                    }
                    boolean z10 = this.f25022e;
                    T poll = c11289b.poll();
                    boolean z11 = poll == null;
                    if (z10 && z11) {
                        Throwable th2 = this.f25021d;
                        if (th2 != null) {
                            m30463b(th2);
                            return;
                        } else {
                            m30462a();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    interfaceC8015b.mo24633c(poll);
                    j11++;
                }
                if (j11 == j10) {
                    if (m30464d()) {
                        c11289b.clear();
                        return;
                    }
                    boolean z12 = this.f25022e;
                    boolean isEmpty = c11289b.isEmpty();
                    if (z12 && isEmpty) {
                        Throwable th3 = this.f25021d;
                        if (th3 != null) {
                            m30463b(th3);
                            return;
                        } else {
                            m30462a();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    C12501d.m40931d(this, j11);
                }
                i10 = this.f25023f.addAndGet(-i10);
            } while (i10 != 0);
        }
    }

    /* renamed from: pj.c$d */
    /* loaded from: classes3.dex */
    static final class d<T> extends h<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        d(InterfaceC8015b<? super T> interfaceC8015b) {
            super(interfaceC8015b);
        }

        @Override // p297pj.C10177c.h
        /* renamed from: j */
        void mo30470j() {
        }
    }

    /* renamed from: pj.c$e */
    /* loaded from: classes3.dex */
    static final class e<T> extends h<T> {
        private static final long serialVersionUID = 338953216916120960L;

        e(InterfaceC8015b<? super T> interfaceC8015b) {
            super(interfaceC8015b);
        }

        @Override // p297pj.C10177c.h
        /* renamed from: j */
        void mo30470j() {
            m30465e(new C7745c("create: could not emit value due to lack of requests"));
        }
    }

    /* renamed from: pj.c$f */
    /* loaded from: classes3.dex */
    static final class f<T> extends b<T> {
        private static final long serialVersionUID = 4023437720691792495L;

        /* renamed from: c */
        final AtomicReference<T> f25024c;

        /* renamed from: d */
        Throwable f25025d;

        /* renamed from: e */
        volatile boolean f25026e;

        /* renamed from: f */
        final AtomicInteger f25027f;

        f(InterfaceC8015b<? super T> interfaceC8015b) {
            super(interfaceC8015b);
            this.f25024c = new AtomicReference<>();
            this.f25027f = new AtomicInteger();
        }

        @Override // dj.InterfaceC6980e
        /* renamed from: c */
        public void mo20212c(T t10) {
            if (this.f25026e || m30464d()) {
                return;
            }
            if (t10 == null) {
                m30465e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f25024c.set(t10);
                m30471j();
            }
        }

        @Override // p297pj.C10177c.b
        /* renamed from: f */
        void mo30466f() {
            m30471j();
        }

        @Override // p297pj.C10177c.b
        /* renamed from: g */
        void mo30467g() {
            if (this.f25027f.getAndIncrement() == 0) {
                this.f25024c.lazySet(null);
            }
        }

        @Override // p297pj.C10177c.b
        /* renamed from: h */
        public boolean mo30468h(Throwable th2) {
            if (this.f25026e || m30464d()) {
                return false;
            }
            if (th2 == null) {
                m30465e(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.f25025d = th2;
            this.f25026e = true;
            m30471j();
            return true;
        }

        /* renamed from: j */
        void m30471j() {
            if (this.f25027f.getAndIncrement() != 0) {
                return;
            }
            InterfaceC8015b<? super T> interfaceC8015b = this.f25018a;
            AtomicReference<T> atomicReference = this.f25024c;
            int i10 = 1;
            do {
                long j10 = get();
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        break;
                    }
                    if (m30464d()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z10 = this.f25026e;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z11 = andSet == null;
                    if (z10 && z11) {
                        Throwable th2 = this.f25025d;
                        if (th2 != null) {
                            m30463b(th2);
                            return;
                        } else {
                            m30462a();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    interfaceC8015b.mo24633c(andSet);
                    j11++;
                }
                if (j11 == j10) {
                    if (m30464d()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z12 = this.f25026e;
                    boolean z13 = atomicReference.get() == null;
                    if (z12 && z13) {
                        Throwable th3 = this.f25025d;
                        if (th3 != null) {
                            m30463b(th3);
                            return;
                        } else {
                            m30462a();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    C12501d.m40931d(this, j11);
                }
                i10 = this.f25027f.addAndGet(-i10);
            } while (i10 != 0);
        }
    }

    /* renamed from: pj.c$g */
    /* loaded from: classes3.dex */
    static final class g<T> extends b<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        g(InterfaceC8015b<? super T> interfaceC8015b) {
            super(interfaceC8015b);
        }

        @Override // dj.InterfaceC6980e
        /* renamed from: c */
        public void mo20212c(T t10) {
            long j10;
            if (m30464d()) {
                return;
            }
            if (t10 == null) {
                m30465e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            this.f25018a.mo24633c(t10);
            do {
                j10 = get();
                if (j10 == 0) {
                    return;
                }
            } while (!compareAndSet(j10, j10 - 1));
        }
    }

    /* renamed from: pj.c$h */
    /* loaded from: classes3.dex */
    static abstract class h<T> extends b<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        h(InterfaceC8015b<? super T> interfaceC8015b) {
            super(interfaceC8015b);
        }

        @Override // dj.InterfaceC6980e
        /* renamed from: c */
        public final void mo20212c(T t10) {
            if (m30464d()) {
                return;
            }
            if (t10 == null) {
                m30465e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() == 0) {
                mo30470j();
            } else {
                this.f25018a.mo24633c(t10);
                C12501d.m40931d(this, 1L);
            }
        }

        /* renamed from: j */
        abstract void mo30470j();
    }

    public C10177c(InterfaceC6983h<T> interfaceC6983h, EnumC6976a enumC6976a) {
        this.f25015b = interfaceC6983h;
        this.f25016c = enumC6976a;
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    public void mo20229I(InterfaceC8015b<? super T> interfaceC8015b) {
        int i10 = a.f25017a[this.f25016c.ordinal()];
        b cVar = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new c(interfaceC8015b, AbstractC6981f.m20213b()) : new f(interfaceC8015b) : new d(interfaceC8015b) : new e(interfaceC8015b) : new g(interfaceC8015b);
        interfaceC8015b.mo20249d(cVar);
        try {
            this.f25015b.mo9367a(cVar);
        } catch (Throwable th2) {
            C7744b.m23648b(th2);
            cVar.m30465e(th2);
        }
    }
}
