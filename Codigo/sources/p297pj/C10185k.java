package p297pj;

import dj.AbstractC6981f;
import dj.InterfaceC6984i;
import im.InterfaceC8015b;
import im.InterfaceC8016c;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p145hj.C7744b;
import p145hj.C7745c;
import p186jj.InterfaceC9077e;
import p224lj.C9513b;
import p241mj.InterfaceC9597g;
import p241mj.InterfaceC9600j;
import p426wj.AbstractC12218a;
import p426wj.EnumC12221d;
import p426wj.EnumC12224g;
import p449xj.C12501d;
import p449xj.C12504g;
import p471yj.C12727a;
import tj.C11288a;

/* renamed from: pj.k */
/* loaded from: classes3.dex */
public final class C10185k<T, R> extends AbstractC10175a<T, R> {

    /* renamed from: c */
    final InterfaceC9077e<? super T, ? extends Iterable<? extends R>> f25106c;

    /* renamed from: d */
    final int f25107d;

    /* renamed from: pj.k$a */
    /* loaded from: classes3.dex */
    static final class a<T, R> extends AbstractC12218a<R> implements InterfaceC6984i<T> {
        private static final long serialVersionUID = -3096000382929934955L;

        /* renamed from: a */
        final InterfaceC8015b<? super R> f25108a;

        /* renamed from: b */
        final InterfaceC9077e<? super T, ? extends Iterable<? extends R>> f25109b;

        /* renamed from: c */
        final int f25110c;

        /* renamed from: d */
        final int f25111d;

        /* renamed from: f */
        InterfaceC8016c f25113f;

        /* renamed from: r */
        InterfaceC9600j<T> f25114r;

        /* renamed from: s */
        volatile boolean f25115s;

        /* renamed from: t */
        volatile boolean f25116t;

        /* renamed from: v */
        Iterator<? extends R> f25118v;

        /* renamed from: w */
        int f25119w;

        /* renamed from: x */
        int f25120x;

        /* renamed from: u */
        final AtomicReference<Throwable> f25117u = new AtomicReference<>();

        /* renamed from: e */
        final AtomicLong f25112e = new AtomicLong();

        a(InterfaceC8015b<? super R> interfaceC8015b, InterfaceC9077e<? super T, ? extends Iterable<? extends R>> interfaceC9077e, int i10) {
            this.f25108a = interfaceC8015b;
            this.f25109b = interfaceC9077e;
            this.f25110c = i10;
            this.f25111d = i10 - (i10 >> 2);
        }

        @Override // im.InterfaceC8015b
        /* renamed from: a */
        public void mo24632a() {
            if (this.f25115s) {
                return;
            }
            this.f25115s = true;
            m30495h();
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(T t10) {
            if (this.f25115s) {
                return;
            }
            if (this.f25120x != 0 || this.f25114r.offer(t10)) {
                m30495h();
            } else {
                onError(new C7745c("Queue is full?!"));
            }
        }

        @Override // im.InterfaceC8016c
        public void cancel() {
            if (this.f25116t) {
                return;
            }
            this.f25116t = true;
            this.f25113f.cancel();
            if (getAndIncrement() == 0) {
                this.f25114r.clear();
            }
        }

        @Override // p241mj.InterfaceC9600j
        public void clear() {
            this.f25118v = null;
            this.f25114r.clear();
        }

        @Override // dj.InterfaceC6984i, im.InterfaceC8015b
        /* renamed from: d */
        public void mo20249d(InterfaceC8016c interfaceC8016c) {
            if (EnumC12224g.m39360q(this.f25113f, interfaceC8016c)) {
                this.f25113f = interfaceC8016c;
                if (interfaceC8016c instanceof InterfaceC9597g) {
                    InterfaceC9597g interfaceC9597g = (InterfaceC9597g) interfaceC8016c;
                    int mo27706l = interfaceC9597g.mo27706l(3);
                    if (mo27706l == 1) {
                        this.f25120x = mo27706l;
                        this.f25114r = interfaceC9597g;
                        this.f25115s = true;
                        this.f25108a.mo20249d(this);
                        return;
                    }
                    if (mo27706l == 2) {
                        this.f25120x = mo27706l;
                        this.f25114r = interfaceC9597g;
                        this.f25108a.mo20249d(this);
                        interfaceC8016c.mo24634i(this.f25110c);
                        return;
                    }
                }
                this.f25114r = new C11288a(this.f25110c);
                this.f25108a.mo20249d(this);
                interfaceC8016c.mo24634i(this.f25110c);
            }
        }

        /* renamed from: e */
        boolean m30493e(boolean z10, boolean z11, InterfaceC8015b<?> interfaceC8015b, InterfaceC9600j<?> interfaceC9600j) {
            if (this.f25116t) {
                this.f25118v = null;
                interfaceC9600j.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f25117u.get() == null) {
                if (!z11) {
                    return false;
                }
                interfaceC8015b.mo24632a();
                return true;
            }
            Throwable m40934b = C12504g.m40934b(this.f25117u);
            this.f25118v = null;
            interfaceC9600j.clear();
            interfaceC8015b.onError(m40934b);
            return true;
        }

        /* renamed from: g */
        void m30494g(boolean z10) {
            if (z10) {
                int i10 = this.f25119w + 1;
                if (i10 != this.f25111d) {
                    this.f25119w = i10;
                } else {
                    this.f25119w = 0;
                    this.f25113f.mo24634i(i10);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:57:0x0103, code lost:
        
            if (r6 == null) goto L73;
         */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void m30495h() {
            /*
                Method dump skipped, instructions count: 273
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p297pj.C10185k.a.m30495h():void");
        }

        @Override // im.InterfaceC8016c
        /* renamed from: i */
        public void mo24634i(long j10) {
            if (EnumC12224g.m39359p(j10)) {
                C12501d.m40928a(this.f25112e, j10);
                m30495h();
            }
        }

        @Override // p241mj.InterfaceC9600j
        public boolean isEmpty() {
            return this.f25118v == null && this.f25114r.isEmpty();
        }

        @Override // p241mj.InterfaceC9596f
        /* renamed from: l */
        public int mo27706l(int i10) {
            return ((i10 & 1) == 0 || this.f25120x != 1) ? 0 : 1;
        }

        @Override // im.InterfaceC8015b
        public void onError(Throwable th2) {
            if (this.f25115s || !C12504g.m40933a(this.f25117u, th2)) {
                C12727a.m41995q(th2);
            } else {
                this.f25115s = true;
                m30495h();
            }
        }

        @Override // p241mj.InterfaceC9600j
        public R poll() {
            Iterator<? extends R> it = this.f25118v;
            while (true) {
                if (it == null) {
                    T poll = this.f25114r.poll();
                    if (poll != null) {
                        it = this.f25109b.apply(poll).iterator();
                        if (it.hasNext()) {
                            this.f25118v = it;
                            break;
                        }
                        it = null;
                    } else {
                        return null;
                    }
                } else {
                    break;
                }
            }
            R r10 = (R) C9513b.m28324d(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f25118v = null;
            }
            return r10;
        }
    }

    public C10185k(AbstractC6981f<T> abstractC6981f, InterfaceC9077e<? super T, ? extends Iterable<? extends R>> interfaceC9077e, int i10) {
        super(abstractC6981f);
        this.f25106c = interfaceC9077e;
        this.f25107d = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dj.AbstractC6981f
    /* renamed from: I */
    public void mo20229I(InterfaceC8015b<? super R> interfaceC8015b) {
        AbstractC6981f<T> abstractC6981f = this.f24989b;
        if (!(abstractC6981f instanceof Callable)) {
            abstractC6981f.m20228H(new a(interfaceC8015b, this.f25106c, this.f25107d));
            return;
        }
        try {
            Object call = ((Callable) abstractC6981f).call();
            if (call == null) {
                EnumC12221d.m39346b(interfaceC8015b);
                return;
            }
            try {
                C10187m.m30498K(interfaceC8015b, this.f25106c.apply(call).iterator());
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                EnumC12221d.m39347h(th2, interfaceC8015b);
            }
        } catch (Throwable th3) {
            C7744b.m23648b(th3);
            EnumC12221d.m39347h(th3, interfaceC8015b);
        }
    }
}
