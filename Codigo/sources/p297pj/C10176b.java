package p297pj;

import dj.AbstractC6981f;
import dj.InterfaceC6984i;
import im.InterfaceC8014a;
import im.InterfaceC8015b;
import im.InterfaceC8016c;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p145hj.C7744b;
import p186jj.InterfaceC9077e;
import p224lj.C9513b;
import p241mj.InterfaceC9597g;
import p241mj.InterfaceC9600j;
import p426wj.C12223f;
import p426wj.EnumC12224g;
import p449xj.C12500c;
import p449xj.EnumC12503f;
import p471yj.C12727a;
import tj.C11288a;

/* renamed from: pj.b */
/* loaded from: classes3.dex */
public final class C10176b<T, R> extends AbstractC10175a<T, R> {

    /* renamed from: c */
    final InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends R>> f24990c;

    /* renamed from: d */
    final int f24991d;

    /* renamed from: e */
    final EnumC12503f f24992e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pj.b$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24993a;

        static {
            int[] iArr = new int[EnumC12503f.values().length];
            f24993a = iArr;
            try {
                iArr[EnumC12503f.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24993a[EnumC12503f.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pj.b$b */
    /* loaded from: classes3.dex */
    public static abstract class b<T, R> extends AtomicInteger implements InterfaceC6984i<T>, f<R>, InterfaceC8016c {
        private static final long serialVersionUID = -3511336836796789179L;

        /* renamed from: b */
        final InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends R>> f24995b;

        /* renamed from: c */
        final int f24996c;

        /* renamed from: d */
        final int f24997d;

        /* renamed from: e */
        InterfaceC8016c f24998e;

        /* renamed from: f */
        int f24999f;

        /* renamed from: r */
        InterfaceC9600j<T> f25000r;

        /* renamed from: s */
        volatile boolean f25001s;

        /* renamed from: t */
        volatile boolean f25002t;

        /* renamed from: v */
        volatile boolean f25004v;

        /* renamed from: w */
        int f25005w;

        /* renamed from: a */
        final e<R> f24994a = new e<>(this);

        /* renamed from: u */
        final C12500c f25003u = new C12500c();

        b(InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends R>> interfaceC9077e, int i10) {
            this.f24995b = interfaceC9077e;
            this.f24996c = i10;
            this.f24997d = i10 - (i10 >> 2);
        }

        @Override // im.InterfaceC8015b
        /* renamed from: a */
        public final void mo24632a() {
            this.f25001s = true;
            mo30458h();
        }

        @Override // p297pj.C10176b.f
        /* renamed from: b */
        public final void mo30457b() {
            this.f25004v = false;
            mo30458h();
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public final void mo24633c(T t10) {
            if (this.f25005w == 2 || this.f25000r.offer(t10)) {
                mo30458h();
            } else {
                this.f24998e.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // dj.InterfaceC6984i, im.InterfaceC8015b
        /* renamed from: d */
        public final void mo20249d(InterfaceC8016c interfaceC8016c) {
            if (EnumC12224g.m39360q(this.f24998e, interfaceC8016c)) {
                this.f24998e = interfaceC8016c;
                if (interfaceC8016c instanceof InterfaceC9597g) {
                    InterfaceC9597g interfaceC9597g = (InterfaceC9597g) interfaceC8016c;
                    int mo27706l = interfaceC9597g.mo27706l(3);
                    if (mo27706l == 1) {
                        this.f25005w = mo27706l;
                        this.f25000r = interfaceC9597g;
                        this.f25001s = true;
                        mo30459j();
                        mo30458h();
                        return;
                    }
                    if (mo27706l == 2) {
                        this.f25005w = mo27706l;
                        this.f25000r = interfaceC9597g;
                        mo30459j();
                        interfaceC8016c.mo24634i(this.f24996c);
                        return;
                    }
                }
                this.f25000r = new C11288a(this.f24996c);
                mo30459j();
                interfaceC8016c.mo24634i(this.f24996c);
            }
        }

        /* renamed from: h */
        abstract void mo30458h();

        /* renamed from: j */
        abstract void mo30459j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pj.b$c */
    /* loaded from: classes3.dex */
    public static final class c<T, R> extends b<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;

        /* renamed from: x */
        final InterfaceC8015b<? super R> f25006x;

        /* renamed from: y */
        final boolean f25007y;

        c(InterfaceC8015b<? super R> interfaceC8015b, InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends R>> interfaceC9077e, int i10, boolean z10) {
            super(interfaceC9077e, i10);
            this.f25006x = interfaceC8015b;
            this.f25007y = z10;
        }

        @Override // im.InterfaceC8016c
        public void cancel() {
            if (this.f25002t) {
                return;
            }
            this.f25002t = true;
            this.f24994a.cancel();
            this.f24998e.cancel();
        }

        @Override // p297pj.C10176b.f
        /* renamed from: e */
        public void mo30460e(Throwable th2) {
            if (!this.f25003u.m40926a(th2)) {
                C12727a.m41995q(th2);
                return;
            }
            if (!this.f25007y) {
                this.f24998e.cancel();
                this.f25001s = true;
            }
            this.f25004v = false;
            mo30458h();
        }

        @Override // p297pj.C10176b.f
        /* renamed from: g */
        public void mo30461g(R r10) {
            this.f25006x.mo24633c(r10);
        }

        @Override // p297pj.C10176b.b
        /* renamed from: h */
        void mo30458h() {
            if (getAndIncrement() == 0) {
                while (!this.f25002t) {
                    if (!this.f25004v) {
                        boolean z10 = this.f25001s;
                        if (!z10 || this.f25007y || this.f25003u.get() == null) {
                            try {
                                T poll = this.f25000r.poll();
                                boolean z11 = poll == null;
                                if (z10 && z11) {
                                    Throwable m40927b = this.f25003u.m40927b();
                                    if (m40927b != null) {
                                        this.f25006x.onError(m40927b);
                                        return;
                                    } else {
                                        this.f25006x.mo24632a();
                                        return;
                                    }
                                }
                                if (!z11) {
                                    InterfaceC8014a interfaceC8014a = (InterfaceC8014a) C9513b.m28324d(this.f24995b.apply(poll), "The mapper returned a null Publisher");
                                    if (this.f25005w != 1) {
                                        int i10 = this.f24999f + 1;
                                        if (i10 == this.f24997d) {
                                            this.f24999f = 0;
                                            this.f24998e.mo24634i(i10);
                                        } else {
                                            this.f24999f = i10;
                                        }
                                    }
                                    if (interfaceC8014a instanceof Callable) {
                                        Object call = ((Callable) interfaceC8014a).call();
                                        if (call == null) {
                                            continue;
                                        } else if (this.f24994a.m39350g()) {
                                            this.f25006x.mo24633c(call);
                                        } else {
                                            this.f25004v = true;
                                            e<R> eVar = this.f24994a;
                                            eVar.m39352j(new g(call, eVar));
                                        }
                                    } else {
                                        this.f25004v = true;
                                        interfaceC8014a.mo20231a(this.f24994a);
                                    }
                                }
                            } catch (Throwable th2) {
                                C7744b.m23648b(th2);
                                this.f24998e.cancel();
                                this.f25003u.m40926a(th2);
                            }
                        }
                        this.f25006x.onError(this.f25003u.m40927b());
                        return;
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // im.InterfaceC8016c
        /* renamed from: i */
        public void mo24634i(long j10) {
            this.f24994a.mo24634i(j10);
        }

        @Override // p297pj.C10176b.b
        /* renamed from: j */
        void mo30459j() {
            this.f25006x.mo20249d(this);
        }

        @Override // im.InterfaceC8015b
        public void onError(Throwable th2) {
            if (!this.f25003u.m40926a(th2)) {
                C12727a.m41995q(th2);
            } else {
                this.f25001s = true;
                mo30458h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pj.b$d */
    /* loaded from: classes3.dex */
    public static final class d<T, R> extends b<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;

        /* renamed from: x */
        final InterfaceC8015b<? super R> f25008x;

        /* renamed from: y */
        final AtomicInteger f25009y;

        d(InterfaceC8015b<? super R> interfaceC8015b, InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends R>> interfaceC9077e, int i10) {
            super(interfaceC9077e, i10);
            this.f25008x = interfaceC8015b;
            this.f25009y = new AtomicInteger();
        }

        @Override // im.InterfaceC8016c
        public void cancel() {
            if (this.f25002t) {
                return;
            }
            this.f25002t = true;
            this.f24994a.cancel();
            this.f24998e.cancel();
        }

        @Override // p297pj.C10176b.f
        /* renamed from: e */
        public void mo30460e(Throwable th2) {
            if (!this.f25003u.m40926a(th2)) {
                C12727a.m41995q(th2);
                return;
            }
            this.f24998e.cancel();
            if (getAndIncrement() == 0) {
                this.f25008x.onError(this.f25003u.m40927b());
            }
        }

        @Override // p297pj.C10176b.f
        /* renamed from: g */
        public void mo30461g(R r10) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f25008x.mo24633c(r10);
                if (compareAndSet(1, 0)) {
                    return;
                }
                this.f25008x.onError(this.f25003u.m40927b());
            }
        }

        @Override // p297pj.C10176b.b
        /* renamed from: h */
        void mo30458h() {
            if (this.f25009y.getAndIncrement() == 0) {
                while (!this.f25002t) {
                    if (!this.f25004v) {
                        boolean z10 = this.f25001s;
                        try {
                            T poll = this.f25000r.poll();
                            boolean z11 = poll == null;
                            if (z10 && z11) {
                                this.f25008x.mo24632a();
                                return;
                            }
                            if (!z11) {
                                try {
                                    InterfaceC8014a interfaceC8014a = (InterfaceC8014a) C9513b.m28324d(this.f24995b.apply(poll), "The mapper returned a null Publisher");
                                    if (this.f25005w != 1) {
                                        int i10 = this.f24999f + 1;
                                        if (i10 == this.f24997d) {
                                            this.f24999f = 0;
                                            this.f24998e.mo24634i(i10);
                                        } else {
                                            this.f24999f = i10;
                                        }
                                    }
                                    if (interfaceC8014a instanceof Callable) {
                                        try {
                                            Object call = ((Callable) interfaceC8014a).call();
                                            if (call == null) {
                                                continue;
                                            } else if (!this.f24994a.m39350g()) {
                                                this.f25004v = true;
                                                e<R> eVar = this.f24994a;
                                                eVar.m39352j(new g(call, eVar));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.f25008x.mo24633c(call);
                                                if (!compareAndSet(1, 0)) {
                                                    this.f25008x.onError(this.f25003u.m40927b());
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            C7744b.m23648b(th2);
                                            this.f24998e.cancel();
                                            this.f25003u.m40926a(th2);
                                            this.f25008x.onError(this.f25003u.m40927b());
                                            return;
                                        }
                                    } else {
                                        this.f25004v = true;
                                        interfaceC8014a.mo20231a(this.f24994a);
                                    }
                                } catch (Throwable th3) {
                                    C7744b.m23648b(th3);
                                    this.f24998e.cancel();
                                    this.f25003u.m40926a(th3);
                                    this.f25008x.onError(this.f25003u.m40927b());
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            C7744b.m23648b(th4);
                            this.f24998e.cancel();
                            this.f25003u.m40926a(th4);
                            this.f25008x.onError(this.f25003u.m40927b());
                            return;
                        }
                    }
                    if (this.f25009y.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // im.InterfaceC8016c
        /* renamed from: i */
        public void mo24634i(long j10) {
            this.f24994a.mo24634i(j10);
        }

        @Override // p297pj.C10176b.b
        /* renamed from: j */
        void mo30459j() {
            this.f25008x.mo20249d(this);
        }

        @Override // im.InterfaceC8015b
        public void onError(Throwable th2) {
            if (!this.f25003u.m40926a(th2)) {
                C12727a.m41995q(th2);
                return;
            }
            this.f24994a.cancel();
            if (getAndIncrement() == 0) {
                this.f25008x.onError(this.f25003u.m40927b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pj.b$e */
    /* loaded from: classes3.dex */
    public static final class e<R> extends C12223f implements InterfaceC6984i<R> {
        private static final long serialVersionUID = 897683679971470653L;

        /* renamed from: s */
        final f<R> f25010s;

        /* renamed from: t */
        long f25011t;

        e(f<R> fVar) {
            this.f25010s = fVar;
        }

        @Override // im.InterfaceC8015b
        /* renamed from: a */
        public void mo24632a() {
            long j10 = this.f25011t;
            if (j10 != 0) {
                this.f25011t = 0L;
                m39351h(j10);
            }
            this.f25010s.mo30457b();
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(R r10) {
            this.f25011t++;
            this.f25010s.mo30461g(r10);
        }

        @Override // dj.InterfaceC6984i, im.InterfaceC8015b
        /* renamed from: d */
        public void mo20249d(InterfaceC8016c interfaceC8016c) {
            m39352j(interfaceC8016c);
        }

        @Override // im.InterfaceC8015b
        public void onError(Throwable th2) {
            long j10 = this.f25011t;
            if (j10 != 0) {
                this.f25011t = 0L;
                m39351h(j10);
            }
            this.f25010s.mo30460e(th2);
        }
    }

    /* renamed from: pj.b$f */
    /* loaded from: classes3.dex */
    interface f<T> {
        /* renamed from: b */
        void mo30457b();

        /* renamed from: e */
        void mo30460e(Throwable th2);

        /* renamed from: g */
        void mo30461g(T t10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pj.b$g */
    /* loaded from: classes3.dex */
    public static final class g<T> implements InterfaceC8016c {

        /* renamed from: a */
        final InterfaceC8015b<? super T> f25012a;

        /* renamed from: b */
        final T f25013b;

        /* renamed from: c */
        boolean f25014c;

        g(T t10, InterfaceC8015b<? super T> interfaceC8015b) {
            this.f25013b = t10;
            this.f25012a = interfaceC8015b;
        }

        @Override // im.InterfaceC8016c
        public void cancel() {
        }

        @Override // im.InterfaceC8016c
        /* renamed from: i */
        public void mo24634i(long j10) {
            if (j10 <= 0 || this.f25014c) {
                return;
            }
            this.f25014c = true;
            InterfaceC8015b<? super T> interfaceC8015b = this.f25012a;
            interfaceC8015b.mo24633c(this.f25013b);
            interfaceC8015b.mo24632a();
        }
    }

    public C10176b(AbstractC6981f<T> abstractC6981f, InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends R>> interfaceC9077e, int i10, EnumC12503f enumC12503f) {
        super(abstractC6981f);
        this.f24990c = interfaceC9077e;
        this.f24991d = i10;
        this.f24992e = enumC12503f;
    }

    /* renamed from: K */
    public static <T, R> InterfaceC8015b<T> m30456K(InterfaceC8015b<? super R> interfaceC8015b, InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends R>> interfaceC9077e, int i10, EnumC12503f enumC12503f) {
        int i11 = a.f24993a[enumC12503f.ordinal()];
        return i11 != 1 ? i11 != 2 ? new d(interfaceC8015b, interfaceC9077e, i10) : new c(interfaceC8015b, interfaceC9077e, i10, true) : new c(interfaceC8015b, interfaceC9077e, i10, false);
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    protected void mo20229I(InterfaceC8015b<? super R> interfaceC8015b) {
        if (C10198x.m30517b(this.f24989b, interfaceC8015b, this.f24990c)) {
            return;
        }
        this.f24989b.mo20231a(m30456K(interfaceC8015b, this.f24990c, this.f24991d, this.f24992e));
    }
}
