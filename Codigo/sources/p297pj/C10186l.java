package p297pj;

import dj.AbstractC6981f;
import im.InterfaceC8015b;
import p224lj.C9513b;
import p241mj.InterfaceC9591a;
import p426wj.AbstractC12219b;
import p426wj.EnumC12224g;
import p449xj.C12501d;

/* renamed from: pj.l */
/* loaded from: classes3.dex */
public final class C10186l<T> extends AbstractC6981f<T> {

    /* renamed from: b */
    final T[] f25121b;

    /* renamed from: pj.l$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends c<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: d */
        final InterfaceC9591a<? super T> f25122d;

        a(InterfaceC9591a<? super T> interfaceC9591a, T[] tArr) {
            super(tArr);
            this.f25122d = interfaceC9591a;
        }

        @Override // p297pj.C10186l.c
        /* renamed from: a */
        void mo30496a() {
            T[] tArr = this.f25124a;
            int length = tArr.length;
            InterfaceC9591a<? super T> interfaceC9591a = this.f25122d;
            for (int i10 = this.f25125b; i10 != length; i10++) {
                if (this.f25126c) {
                    return;
                }
                T t10 = tArr[i10];
                if (t10 == null) {
                    interfaceC9591a.onError(new NullPointerException("array element is null"));
                    return;
                }
                interfaceC9591a.mo28586f(t10);
            }
            if (this.f25126c) {
                return;
            }
            interfaceC9591a.mo24632a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
        
            r10.f25125b = r2;
            r11 = addAndGet(-r6);
         */
        @Override // p297pj.C10186l.c
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void mo30497b(long r11) {
            /*
                r10 = this;
                T[] r0 = r10.f25124a
                int r1 = r0.length
                int r2 = r10.f25125b
                mj.a<? super T> r3 = r10.f25122d
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 == 0) goto L30
                if (r2 == r1) goto L30
                boolean r8 = r10.f25126c
                if (r8 == 0) goto L15
                return
            L15:
                r8 = r0[r2]
                if (r8 != 0) goto L24
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.String r12 = "array element is null"
                r11.<init>(r12)
                r3.onError(r11)
                return
            L24:
                boolean r8 = r3.mo28586f(r8)
                if (r8 == 0) goto L2d
                r8 = 1
                long r6 = r6 + r8
            L2d:
                int r2 = r2 + 1
                goto La
            L30:
                if (r2 != r1) goto L3a
                boolean r11 = r10.f25126c
                if (r11 != 0) goto L39
                r3.mo24632a()
            L39:
                return
            L3a:
                long r11 = r10.get()
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto La
                r10.f25125b = r2
                long r11 = -r6
                long r11 = r10.addAndGet(r11)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p297pj.C10186l.a.mo30497b(long):void");
        }
    }

    /* renamed from: pj.l$b */
    /* loaded from: classes3.dex */
    static final class b<T> extends c<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: d */
        final InterfaceC8015b<? super T> f25123d;

        b(InterfaceC8015b<? super T> interfaceC8015b, T[] tArr) {
            super(tArr);
            this.f25123d = interfaceC8015b;
        }

        @Override // p297pj.C10186l.c
        /* renamed from: a */
        void mo30496a() {
            T[] tArr = this.f25124a;
            int length = tArr.length;
            InterfaceC8015b<? super T> interfaceC8015b = this.f25123d;
            for (int i10 = this.f25125b; i10 != length; i10++) {
                if (this.f25126c) {
                    return;
                }
                T t10 = tArr[i10];
                if (t10 == null) {
                    interfaceC8015b.onError(new NullPointerException("array element is null"));
                    return;
                }
                interfaceC8015b.mo24633c(t10);
            }
            if (this.f25126c) {
                return;
            }
            interfaceC8015b.mo24632a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
        
            r10.f25125b = r2;
            r11 = addAndGet(-r6);
         */
        @Override // p297pj.C10186l.c
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void mo30497b(long r11) {
            /*
                r10 = this;
                T[] r0 = r10.f25124a
                int r1 = r0.length
                int r2 = r10.f25125b
                im.b<? super T> r3 = r10.f25123d
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 == 0) goto L2d
                if (r2 == r1) goto L2d
                boolean r8 = r10.f25126c
                if (r8 == 0) goto L15
                return
            L15:
                r8 = r0[r2]
                if (r8 != 0) goto L24
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.String r12 = "array element is null"
                r11.<init>(r12)
                r3.onError(r11)
                return
            L24:
                r3.mo24633c(r8)
                r8 = 1
                long r6 = r6 + r8
                int r2 = r2 + 1
                goto La
            L2d:
                if (r2 != r1) goto L37
                boolean r11 = r10.f25126c
                if (r11 != 0) goto L36
                r3.mo24632a()
            L36:
                return
            L37:
                long r11 = r10.get()
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto La
                r10.f25125b = r2
                long r11 = -r6
                long r11 = r10.addAndGet(r11)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p297pj.C10186l.b.mo30497b(long):void");
        }
    }

    /* renamed from: pj.l$c */
    /* loaded from: classes3.dex */
    static abstract class c<T> extends AbstractC12219b<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* renamed from: a */
        final T[] f25124a;

        /* renamed from: b */
        int f25125b;

        /* renamed from: c */
        volatile boolean f25126c;

        c(T[] tArr) {
            this.f25124a = tArr;
        }

        /* renamed from: a */
        abstract void mo30496a();

        /* renamed from: b */
        abstract void mo30497b(long j10);

        @Override // im.InterfaceC8016c
        public final void cancel() {
            this.f25126c = true;
        }

        @Override // p241mj.InterfaceC9600j
        public final void clear() {
            this.f25125b = this.f25124a.length;
        }

        @Override // im.InterfaceC8016c
        /* renamed from: i */
        public final void mo24634i(long j10) {
            if (EnumC12224g.m39359p(j10) && C12501d.m40928a(this, j10) == 0) {
                if (j10 == Long.MAX_VALUE) {
                    mo30496a();
                } else {
                    mo30497b(j10);
                }
            }
        }

        @Override // p241mj.InterfaceC9600j
        public final boolean isEmpty() {
            return this.f25125b == this.f25124a.length;
        }

        @Override // p241mj.InterfaceC9596f
        /* renamed from: l */
        public final int mo27706l(int i10) {
            return i10 & 1;
        }

        @Override // p241mj.InterfaceC9600j
        public final T poll() {
            int i10 = this.f25125b;
            T[] tArr = this.f25124a;
            if (i10 == tArr.length) {
                return null;
            }
            this.f25125b = i10 + 1;
            return (T) C9513b.m28324d(tArr[i10], "array element is null");
        }
    }

    public C10186l(T[] tArr) {
        this.f25121b = tArr;
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    public void mo20229I(InterfaceC8015b<? super T> interfaceC8015b) {
        interfaceC8015b.mo20249d(interfaceC8015b instanceof InterfaceC9591a ? new a((InterfaceC9591a) interfaceC8015b, this.f25121b) : new b(interfaceC8015b, this.f25121b));
    }
}
