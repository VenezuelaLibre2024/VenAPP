package p297pj;

import dj.AbstractC6981f;
import dj.InterfaceC6984i;
import im.InterfaceC8015b;
import p145hj.C7743a;
import p145hj.C7744b;
import p186jj.InterfaceC9073a;
import p186jj.InterfaceC9076d;
import p241mj.InterfaceC9591a;
import p404vj.AbstractC11960a;
import p404vj.AbstractC11961b;
import p449xj.C12504g;
import p471yj.C12727a;

/* renamed from: pj.d */
/* loaded from: classes3.dex */
public final class C10178d<T> extends AbstractC10175a<T, T> {

    /* renamed from: c */
    final InterfaceC9076d<? super T> f25028c;

    /* renamed from: d */
    final InterfaceC9076d<? super Throwable> f25029d;

    /* renamed from: e */
    final InterfaceC9073a f25030e;

    /* renamed from: f */
    final InterfaceC9073a f25031f;

    /* renamed from: pj.d$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AbstractC11960a<T, T> {

        /* renamed from: f */
        final InterfaceC9076d<? super T> f25032f;

        /* renamed from: r */
        final InterfaceC9076d<? super Throwable> f25033r;

        /* renamed from: s */
        final InterfaceC9073a f25034s;

        /* renamed from: t */
        final InterfaceC9073a f25035t;

        a(InterfaceC9591a<? super T> interfaceC9591a, InterfaceC9076d<? super T> interfaceC9076d, InterfaceC9076d<? super Throwable> interfaceC9076d2, InterfaceC9073a interfaceC9073a, InterfaceC9073a interfaceC9073a2) {
            super(interfaceC9591a);
            this.f25032f = interfaceC9076d;
            this.f25033r = interfaceC9076d2;
            this.f25034s = interfaceC9073a;
            this.f25035t = interfaceC9073a2;
        }

        @Override // p404vj.AbstractC11960a, im.InterfaceC8015b
        /* renamed from: a */
        public void mo24632a() {
            if (this.f31728d) {
                return;
            }
            try {
                this.f25034s.run();
                this.f31728d = true;
                this.f31725a.mo24632a();
                try {
                    this.f25035t.run();
                } catch (Throwable th2) {
                    C7744b.m23648b(th2);
                    C12727a.m41995q(th2);
                }
            } catch (Throwable th3) {
                m38388g(th3);
            }
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(T t10) {
            if (this.f31728d) {
                return;
            }
            if (this.f31729e != 0) {
                this.f31725a.mo24633c(null);
                return;
            }
            try {
                this.f25032f.accept(t10);
                this.f31725a.mo24633c(t10);
            } catch (Throwable th2) {
                m38388g(th2);
            }
        }

        @Override // p241mj.InterfaceC9591a
        /* renamed from: f */
        public boolean mo28586f(T t10) {
            if (this.f31728d) {
                return false;
            }
            try {
                this.f25032f.accept(t10);
                return this.f31725a.mo28586f(t10);
            } catch (Throwable th2) {
                m38388g(th2);
                return false;
            }
        }

        @Override // p241mj.InterfaceC9596f
        /* renamed from: l */
        public int mo27706l(int i10) {
            return m38389h(i10);
        }

        @Override // p404vj.AbstractC11960a, im.InterfaceC8015b
        public void onError(Throwable th2) {
            if (this.f31728d) {
                C12727a.m41995q(th2);
                return;
            }
            boolean z10 = true;
            this.f31728d = true;
            try {
                this.f25033r.accept(th2);
            } catch (Throwable th3) {
                C7744b.m23648b(th3);
                this.f31725a.onError(new C7743a(th2, th3));
                z10 = false;
            }
            if (z10) {
                this.f31725a.onError(th2);
            }
            try {
                this.f25035t.run();
            } catch (Throwable th4) {
                C7744b.m23648b(th4);
                C12727a.m41995q(th4);
            }
        }

        @Override // p241mj.InterfaceC9600j
        public T poll() {
            try {
                T poll = this.f31727c.poll();
                if (poll == null) {
                    if (this.f31729e == 1) {
                        this.f25034s.run();
                    }
                    return poll;
                }
                try {
                    this.f25032f.accept(poll);
                } catch (Throwable th2) {
                    try {
                        C7744b.m23648b(th2);
                        try {
                            this.f25033r.accept(th2);
                            throw C12504g.m40935c(th2);
                        } catch (Throwable th3) {
                            throw new C7743a(th2, th3);
                        }
                    } finally {
                        this.f25035t.run();
                    }
                }
                return poll;
            } catch (Throwable th4) {
                C7744b.m23648b(th4);
                try {
                    this.f25033r.accept(th4);
                    throw C12504g.m40935c(th4);
                } catch (Throwable th5) {
                    throw new C7743a(th4, th5);
                }
            }
        }
    }

    /* renamed from: pj.d$b */
    /* loaded from: classes3.dex */
    static final class b<T> extends AbstractC11961b<T, T> {

        /* renamed from: f */
        final InterfaceC9076d<? super T> f25036f;

        /* renamed from: r */
        final InterfaceC9076d<? super Throwable> f25037r;

        /* renamed from: s */
        final InterfaceC9073a f25038s;

        /* renamed from: t */
        final InterfaceC9073a f25039t;

        b(InterfaceC8015b<? super T> interfaceC8015b, InterfaceC9076d<? super T> interfaceC9076d, InterfaceC9076d<? super Throwable> interfaceC9076d2, InterfaceC9073a interfaceC9073a, InterfaceC9073a interfaceC9073a2) {
            super(interfaceC8015b);
            this.f25036f = interfaceC9076d;
            this.f25037r = interfaceC9076d2;
            this.f25038s = interfaceC9073a;
            this.f25039t = interfaceC9073a2;
        }

        @Override // p404vj.AbstractC11961b, im.InterfaceC8015b
        /* renamed from: a */
        public void mo24632a() {
            if (this.f31733d) {
                return;
            }
            try {
                this.f25038s.run();
                this.f31733d = true;
                this.f31730a.mo24632a();
                try {
                    this.f25039t.run();
                } catch (Throwable th2) {
                    C7744b.m23648b(th2);
                    C12727a.m41995q(th2);
                }
            } catch (Throwable th3) {
                m38392g(th3);
            }
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(T t10) {
            if (this.f31733d) {
                return;
            }
            if (this.f31734e != 0) {
                this.f31730a.mo24633c(null);
                return;
            }
            try {
                this.f25036f.accept(t10);
                this.f31730a.mo24633c(t10);
            } catch (Throwable th2) {
                m38392g(th2);
            }
        }

        @Override // p241mj.InterfaceC9596f
        /* renamed from: l */
        public int mo27706l(int i10) {
            return m38393h(i10);
        }

        @Override // p404vj.AbstractC11961b, im.InterfaceC8015b
        public void onError(Throwable th2) {
            if (this.f31733d) {
                C12727a.m41995q(th2);
                return;
            }
            boolean z10 = true;
            this.f31733d = true;
            try {
                this.f25037r.accept(th2);
            } catch (Throwable th3) {
                C7744b.m23648b(th3);
                this.f31730a.onError(new C7743a(th2, th3));
                z10 = false;
            }
            if (z10) {
                this.f31730a.onError(th2);
            }
            try {
                this.f25039t.run();
            } catch (Throwable th4) {
                C7744b.m23648b(th4);
                C12727a.m41995q(th4);
            }
        }

        @Override // p241mj.InterfaceC9600j
        public T poll() {
            try {
                T poll = this.f31732c.poll();
                if (poll == null) {
                    if (this.f31734e == 1) {
                        this.f25038s.run();
                    }
                    return poll;
                }
                try {
                    this.f25036f.accept(poll);
                } catch (Throwable th2) {
                    try {
                        C7744b.m23648b(th2);
                        try {
                            this.f25037r.accept(th2);
                            throw C12504g.m40935c(th2);
                        } catch (Throwable th3) {
                            throw new C7743a(th2, th3);
                        }
                    } finally {
                        this.f25039t.run();
                    }
                }
                return poll;
            } catch (Throwable th4) {
                C7744b.m23648b(th4);
                try {
                    this.f25037r.accept(th4);
                    throw C12504g.m40935c(th4);
                } catch (Throwable th5) {
                    throw new C7743a(th4, th5);
                }
            }
        }
    }

    public C10178d(AbstractC6981f<T> abstractC6981f, InterfaceC9076d<? super T> interfaceC9076d, InterfaceC9076d<? super Throwable> interfaceC9076d2, InterfaceC9073a interfaceC9073a, InterfaceC9073a interfaceC9073a2) {
        super(abstractC6981f);
        this.f25028c = interfaceC9076d;
        this.f25029d = interfaceC9076d2;
        this.f25030e = interfaceC9073a;
        this.f25031f = interfaceC9073a2;
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    protected void mo20229I(InterfaceC8015b<? super T> interfaceC8015b) {
        AbstractC6981f<T> abstractC6981f;
        InterfaceC6984i<? super T> bVar;
        if (interfaceC8015b instanceof InterfaceC9591a) {
            abstractC6981f = this.f24989b;
            bVar = new a<>((InterfaceC9591a) interfaceC8015b, this.f25028c, this.f25029d, this.f25030e, this.f25031f);
        } else {
            abstractC6981f = this.f24989b;
            bVar = new b<>(interfaceC8015b, this.f25028c, this.f25029d, this.f25030e, this.f25031f);
        }
        abstractC6981f.m20228H(bVar);
    }
}
