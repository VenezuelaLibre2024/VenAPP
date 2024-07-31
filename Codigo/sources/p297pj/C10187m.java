package p297pj;

import dj.AbstractC6981f;
import im.InterfaceC8015b;
import java.util.Iterator;
import p145hj.C7744b;
import p224lj.C9513b;
import p241mj.InterfaceC9591a;
import p426wj.AbstractC12219b;
import p426wj.EnumC12221d;
import p426wj.EnumC12224g;
import p449xj.C12501d;

/* renamed from: pj.m */
/* loaded from: classes3.dex */
public final class C10187m<T> extends AbstractC6981f<T> {

    /* renamed from: b */
    final Iterable<? extends T> f25127b;

    /* renamed from: pj.m$a */
    /* loaded from: classes3.dex */
    static abstract class a<T> extends AbstractC12219b<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* renamed from: a */
        Iterator<? extends T> f25128a;

        /* renamed from: b */
        volatile boolean f25129b;

        /* renamed from: c */
        boolean f25130c;

        a(Iterator<? extends T> it) {
            this.f25128a = it;
        }

        /* renamed from: a */
        abstract void mo30499a();

        /* renamed from: b */
        abstract void mo30500b(long j10);

        @Override // im.InterfaceC8016c
        public final void cancel() {
            this.f25129b = true;
        }

        @Override // p241mj.InterfaceC9600j
        public final void clear() {
            this.f25128a = null;
        }

        @Override // im.InterfaceC8016c
        /* renamed from: i */
        public final void mo24634i(long j10) {
            if (EnumC12224g.m39359p(j10) && C12501d.m40928a(this, j10) == 0) {
                if (j10 == Long.MAX_VALUE) {
                    mo30499a();
                } else {
                    mo30500b(j10);
                }
            }
        }

        @Override // p241mj.InterfaceC9600j
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f25128a;
            return it == null || !it.hasNext();
        }

        @Override // p241mj.InterfaceC9596f
        /* renamed from: l */
        public final int mo27706l(int i10) {
            return i10 & 1;
        }

        @Override // p241mj.InterfaceC9600j
        public final T poll() {
            Iterator<? extends T> it = this.f25128a;
            if (it == null) {
                return null;
            }
            if (!this.f25130c) {
                this.f25130c = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return (T) C9513b.m28324d(this.f25128a.next(), "Iterator.next() returned a null value");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pj.m$b */
    /* loaded from: classes3.dex */
    public static final class b<T> extends a<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* renamed from: d */
        final InterfaceC9591a<? super T> f25131d;

        b(InterfaceC9591a<? super T> interfaceC9591a, Iterator<? extends T> it) {
            super(it);
            this.f25131d = interfaceC9591a;
        }

        @Override // p297pj.C10187m.a
        /* renamed from: a */
        void mo30499a() {
            T next;
            Iterator<? extends T> it = this.f25128a;
            InterfaceC9591a<? super T> interfaceC9591a = this.f25131d;
            while (!this.f25129b) {
                try {
                    next = it.next();
                } catch (Throwable th2) {
                    th = th2;
                    C7744b.m23648b(th);
                }
                if (this.f25129b) {
                    return;
                }
                if (next == null) {
                    th = new NullPointerException("Iterator.next() returned a null value");
                    interfaceC9591a.onError(th);
                    return;
                }
                interfaceC9591a.mo28586f(next);
                if (this.f25129b) {
                    return;
                }
                if (!it.hasNext()) {
                    if (this.f25129b) {
                        return;
                    }
                    interfaceC9591a.mo24632a();
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // p297pj.C10187m.a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void mo30500b(long r9) {
            /*
                r8 = this;
                java.util.Iterator<? extends T> r0 = r8.f25128a
                mj.a<? super T> r1 = r8.f25131d
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L48
                boolean r6 = r8.f25129b
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L43
                boolean r7 = r8.f25129b
                if (r7 == 0) goto L19
                return
            L19:
                if (r6 != 0) goto L26
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "Iterator.next() returned a null value"
                r9.<init>(r10)
            L22:
                r1.onError(r9)
                return
            L26:
                boolean r6 = r1.mo28586f(r6)
                boolean r7 = r8.f25129b
                if (r7 == 0) goto L2f
                return
            L2f:
                boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L43
                if (r7 != 0) goto L3d
                boolean r9 = r8.f25129b
                if (r9 != 0) goto L3c
                r1.mo24632a()
            L3c:
                return
            L3d:
                if (r6 == 0) goto L7
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L43:
                r9 = move-exception
                p145hj.C7744b.m23648b(r9)
                goto L22
            L48:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p297pj.C10187m.b.mo30500b(long):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pj.m$c */
    /* loaded from: classes3.dex */
    public static final class c<T> extends a<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* renamed from: d */
        final InterfaceC8015b<? super T> f25132d;

        c(InterfaceC8015b<? super T> interfaceC8015b, Iterator<? extends T> it) {
            super(it);
            this.f25132d = interfaceC8015b;
        }

        @Override // p297pj.C10187m.a
        /* renamed from: a */
        void mo30499a() {
            T next;
            Iterator<? extends T> it = this.f25128a;
            InterfaceC8015b<? super T> interfaceC8015b = this.f25132d;
            while (!this.f25129b) {
                try {
                    next = it.next();
                } catch (Throwable th2) {
                    th = th2;
                    C7744b.m23648b(th);
                }
                if (this.f25129b) {
                    return;
                }
                if (next == null) {
                    th = new NullPointerException("Iterator.next() returned a null value");
                    interfaceC8015b.onError(th);
                    return;
                }
                interfaceC8015b.mo24633c(next);
                if (this.f25129b) {
                    return;
                }
                if (!it.hasNext()) {
                    if (this.f25129b) {
                        return;
                    }
                    interfaceC8015b.mo24632a();
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // p297pj.C10187m.a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void mo30500b(long r9) {
            /*
                r8 = this;
                java.util.Iterator<? extends T> r0 = r8.f25128a
                im.b<? super T> r1 = r8.f25132d
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L45
                boolean r6 = r8.f25129b
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L40
                boolean r7 = r8.f25129b
                if (r7 == 0) goto L19
                return
            L19:
                if (r6 != 0) goto L26
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "Iterator.next() returned a null value"
                r9.<init>(r10)
            L22:
                r1.onError(r9)
                return
            L26:
                r1.mo24633c(r6)
                boolean r6 = r8.f25129b
                if (r6 == 0) goto L2e
                return
            L2e:
                boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
                if (r6 != 0) goto L3c
                boolean r9 = r8.f25129b
                if (r9 != 0) goto L3b
                r1.mo24632a()
            L3b:
                return
            L3c:
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L40:
                r9 = move-exception
                p145hj.C7744b.m23648b(r9)
                goto L22
            L45:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p297pj.C10187m.c.mo30500b(long):void");
        }
    }

    public C10187m(Iterable<? extends T> iterable) {
        this.f25127b = iterable;
    }

    /* renamed from: K */
    public static <T> void m30498K(InterfaceC8015b<? super T> interfaceC8015b, Iterator<? extends T> it) {
        try {
            if (it.hasNext()) {
                interfaceC8015b.mo20249d(interfaceC8015b instanceof InterfaceC9591a ? new b((InterfaceC9591a) interfaceC8015b, it) : new c(interfaceC8015b, it));
            } else {
                EnumC12221d.m39346b(interfaceC8015b);
            }
        } catch (Throwable th2) {
            C7744b.m23648b(th2);
            EnumC12221d.m39347h(th2, interfaceC8015b);
        }
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    public void mo20229I(InterfaceC8015b<? super T> interfaceC8015b) {
        try {
            m30498K(interfaceC8015b, this.f25127b.iterator());
        } catch (Throwable th2) {
            C7744b.m23648b(th2);
            EnumC12221d.m39347h(th2, interfaceC8015b);
        }
    }
}
