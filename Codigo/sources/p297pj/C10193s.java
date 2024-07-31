package p297pj;

import dj.AbstractC6981f;
import dj.InterfaceC6984i;
import im.InterfaceC8015b;
import im.InterfaceC8016c;
import java.util.concurrent.atomic.AtomicLong;
import p145hj.C7744b;
import p145hj.C7745c;
import p186jj.InterfaceC9073a;
import p241mj.InterfaceC9599i;
import p426wj.AbstractC12218a;
import p426wj.EnumC12224g;
import p449xj.C12501d;
import tj.C11288a;
import tj.C11289b;

/* renamed from: pj.s */
/* loaded from: classes3.dex */
public final class C10193s<T> extends AbstractC10175a<T, T> {

    /* renamed from: c */
    final int f25159c;

    /* renamed from: d */
    final boolean f25160d;

    /* renamed from: e */
    final boolean f25161e;

    /* renamed from: f */
    final InterfaceC9073a f25162f;

    /* renamed from: pj.s$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AbstractC12218a<T> implements InterfaceC6984i<T> {
        private static final long serialVersionUID = -2514538129242366402L;

        /* renamed from: a */
        final InterfaceC8015b<? super T> f25163a;

        /* renamed from: b */
        final InterfaceC9599i<T> f25164b;

        /* renamed from: c */
        final boolean f25165c;

        /* renamed from: d */
        final InterfaceC9073a f25166d;

        /* renamed from: e */
        InterfaceC8016c f25167e;

        /* renamed from: f */
        volatile boolean f25168f;

        /* renamed from: r */
        volatile boolean f25169r;

        /* renamed from: s */
        Throwable f25170s;

        /* renamed from: t */
        final AtomicLong f25171t = new AtomicLong();

        /* renamed from: u */
        boolean f25172u;

        a(InterfaceC8015b<? super T> interfaceC8015b, int i10, boolean z10, boolean z11, InterfaceC9073a interfaceC9073a) {
            this.f25163a = interfaceC8015b;
            this.f25166d = interfaceC9073a;
            this.f25165c = z11;
            this.f25164b = z10 ? new C11289b<>(i10) : new C11288a<>(i10);
        }

        @Override // im.InterfaceC8015b
        /* renamed from: a */
        public void mo24632a() {
            this.f25169r = true;
            if (this.f25172u) {
                this.f25163a.mo24632a();
            } else {
                m30508g();
            }
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(T t10) {
            if (this.f25164b.offer(t10)) {
                if (this.f25172u) {
                    this.f25163a.mo24633c(null);
                    return;
                } else {
                    m30508g();
                    return;
                }
            }
            this.f25167e.cancel();
            C7745c c7745c = new C7745c("Buffer is full");
            try {
                this.f25166d.run();
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                c7745c.initCause(th2);
            }
            onError(c7745c);
        }

        @Override // im.InterfaceC8016c
        public void cancel() {
            if (this.f25168f) {
                return;
            }
            this.f25168f = true;
            this.f25167e.cancel();
            if (getAndIncrement() == 0) {
                this.f25164b.clear();
            }
        }

        @Override // p241mj.InterfaceC9600j
        public void clear() {
            this.f25164b.clear();
        }

        @Override // dj.InterfaceC6984i, im.InterfaceC8015b
        /* renamed from: d */
        public void mo20249d(InterfaceC8016c interfaceC8016c) {
            if (EnumC12224g.m39360q(this.f25167e, interfaceC8016c)) {
                this.f25167e = interfaceC8016c;
                this.f25163a.mo20249d(this);
                interfaceC8016c.mo24634i(Long.MAX_VALUE);
            }
        }

        /* renamed from: e */
        boolean m30507e(boolean z10, boolean z11, InterfaceC8015b<? super T> interfaceC8015b) {
            if (this.f25168f) {
                this.f25164b.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f25165c) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.f25170s;
                if (th2 != null) {
                    interfaceC8015b.onError(th2);
                } else {
                    interfaceC8015b.mo24632a();
                }
                return true;
            }
            Throwable th3 = this.f25170s;
            if (th3 != null) {
                this.f25164b.clear();
                interfaceC8015b.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            interfaceC8015b.mo24632a();
            return true;
        }

        /* renamed from: g */
        void m30508g() {
            if (getAndIncrement() == 0) {
                InterfaceC9599i<T> interfaceC9599i = this.f25164b;
                InterfaceC8015b<? super T> interfaceC8015b = this.f25163a;
                int i10 = 1;
                while (!m30507e(this.f25169r, interfaceC9599i.isEmpty(), interfaceC8015b)) {
                    long j10 = this.f25171t.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        boolean z10 = this.f25169r;
                        T poll = interfaceC9599i.poll();
                        boolean z11 = poll == null;
                        if (m30507e(z10, z11, interfaceC8015b)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        interfaceC8015b.mo24633c(poll);
                        j11++;
                    }
                    if (j11 == j10 && m30507e(this.f25169r, interfaceC9599i.isEmpty(), interfaceC8015b)) {
                        return;
                    }
                    if (j11 != 0 && j10 != Long.MAX_VALUE) {
                        this.f25171t.addAndGet(-j11);
                    }
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // im.InterfaceC8016c
        /* renamed from: i */
        public void mo24634i(long j10) {
            if (this.f25172u || !EnumC12224g.m39359p(j10)) {
                return;
            }
            C12501d.m40928a(this.f25171t, j10);
            m30508g();
        }

        @Override // p241mj.InterfaceC9600j
        public boolean isEmpty() {
            return this.f25164b.isEmpty();
        }

        @Override // p241mj.InterfaceC9596f
        /* renamed from: l */
        public int mo27706l(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f25172u = true;
            return 2;
        }

        @Override // im.InterfaceC8015b
        public void onError(Throwable th2) {
            this.f25170s = th2;
            this.f25169r = true;
            if (this.f25172u) {
                this.f25163a.onError(th2);
            } else {
                m30508g();
            }
        }

        @Override // p241mj.InterfaceC9600j
        public T poll() {
            return this.f25164b.poll();
        }
    }

    public C10193s(AbstractC6981f<T> abstractC6981f, int i10, boolean z10, boolean z11, InterfaceC9073a interfaceC9073a) {
        super(abstractC6981f);
        this.f25159c = i10;
        this.f25160d = z10;
        this.f25161e = z11;
        this.f25162f = interfaceC9073a;
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    protected void mo20229I(InterfaceC8015b<? super T> interfaceC8015b) {
        this.f24989b.m20228H(new a(interfaceC8015b, this.f25159c, this.f25160d, this.f25161e, this.f25162f));
    }
}
