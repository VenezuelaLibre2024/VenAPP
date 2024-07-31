package p459y6;

import p363t8.C11137a;
import p363t8.C11172r0;
import p459y6.InterfaceC12636z;

/* renamed from: y6.a */
/* loaded from: classes.dex */
public abstract class AbstractC12606a {

    /* renamed from: a */
    protected final a f34199a;

    /* renamed from: b */
    protected final f f34200b;

    /* renamed from: c */
    protected c f34201c;

    /* renamed from: d */
    private final int f34202d;

    /* renamed from: y6.a$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC12636z {

        /* renamed from: a */
        private final d f34203a;

        /* renamed from: b */
        private final long f34204b;

        /* renamed from: c */
        private final long f34205c;

        /* renamed from: d */
        private final long f34206d;

        /* renamed from: e */
        private final long f34207e;

        /* renamed from: f */
        private final long f34208f;

        /* renamed from: g */
        private final long f34209g;

        public a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f34203a = dVar;
            this.f34204b = j10;
            this.f34205c = j11;
            this.f34206d = j12;
            this.f34207e = j13;
            this.f34208f = j14;
            this.f34209g = j15;
        }

        @Override // p459y6.InterfaceC12636z
        /* renamed from: d */
        public InterfaceC12636z.a mo125d(long j10) {
            return new InterfaceC12636z.a(new C12607a0(j10, c.m41493h(this.f34203a.mo9150a(j10), this.f34205c, this.f34206d, this.f34207e, this.f34208f, this.f34209g)));
        }

        @Override // p459y6.InterfaceC12636z
        /* renamed from: h */
        public boolean mo126h() {
            return true;
        }

        @Override // p459y6.InterfaceC12636z
        /* renamed from: i */
        public long mo127i() {
            return this.f34204b;
        }

        /* renamed from: k */
        public long m41485k(long j10) {
            return this.f34203a.mo9150a(j10);
        }
    }

    /* renamed from: y6.a$b */
    /* loaded from: classes.dex */
    public static final class b implements d {
        @Override // p459y6.AbstractC12606a.d
        /* renamed from: a */
        public long mo9150a(long j10) {
            return j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y6.a$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private final long f34210a;

        /* renamed from: b */
        private final long f34211b;

        /* renamed from: c */
        private final long f34212c;

        /* renamed from: d */
        private long f34213d;

        /* renamed from: e */
        private long f34214e;

        /* renamed from: f */
        private long f34215f;

        /* renamed from: g */
        private long f34216g;

        /* renamed from: h */
        private long f34217h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f34210a = j10;
            this.f34211b = j11;
            this.f34213d = j12;
            this.f34214e = j13;
            this.f34215f = j14;
            this.f34216g = j15;
            this.f34212c = j16;
            this.f34217h = m41493h(j11, j12, j13, j14, j15, j16);
        }

        /* renamed from: h */
        protected static long m41493h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
            return C11172r0.m34944r(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public long m41494i() {
            return this.f34216g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public long m41495j() {
            return this.f34215f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public long m41496k() {
            return this.f34217h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public long m41497l() {
            return this.f34210a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public long m41498m() {
            return this.f34211b;
        }

        /* renamed from: n */
        private void m41499n() {
            this.f34217h = m41493h(this.f34211b, this.f34213d, this.f34214e, this.f34215f, this.f34216g, this.f34212c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public void m41500o(long j10, long j11) {
            this.f34214e = j10;
            this.f34216g = j11;
            m41499n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public void m41501p(long j10, long j11) {
            this.f34213d = j10;
            this.f34215f = j11;
            m41499n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y6.a$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        long mo9150a(long j10);
    }

    /* renamed from: y6.a$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d */
        public static final e f34218d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a */
        private final int f34219a;

        /* renamed from: b */
        private final long f34220b;

        /* renamed from: c */
        private final long f34221c;

        private e(int i10, long j10, long j11) {
            this.f34219a = i10;
            this.f34220b = j10;
            this.f34221c = j11;
        }

        /* renamed from: d */
        public static e m41505d(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        /* renamed from: e */
        public static e m41506e(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }

        /* renamed from: f */
        public static e m41507f(long j10, long j11) {
            return new e(-2, j10, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y6.a$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        e mo9152a(InterfaceC12622l interfaceC12622l, long j10);

        /* renamed from: b */
        default void mo24199b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12606a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f34200b = fVar;
        this.f34202d = i10;
        this.f34199a = new a(dVar, j10, j11, j12, j13, j14, j15);
    }

    /* renamed from: a */
    protected c m41471a(long j10) {
        return new c(j10, this.f34199a.m41485k(j10), this.f34199a.f34205c, this.f34199a.f34206d, this.f34199a.f34207e, this.f34199a.f34208f, this.f34199a.f34209g);
    }

    /* renamed from: b */
    public final InterfaceC12636z m41472b() {
        return this.f34199a;
    }

    /* renamed from: c */
    public int m41473c(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        while (true) {
            c cVar = (c) C11137a.m34607i(this.f34201c);
            long m41495j = cVar.m41495j();
            long m41494i = cVar.m41494i();
            long m41496k = cVar.m41496k();
            if (m41494i - m41495j <= this.f34202d) {
                m41475e(false, m41495j);
                return m41477g(interfaceC12622l, m41495j, c12635y);
            }
            if (!m41479i(interfaceC12622l, m41496k)) {
                return m41477g(interfaceC12622l, m41496k, c12635y);
            }
            interfaceC12622l.mo41534f();
            e mo9152a = this.f34200b.mo9152a(interfaceC12622l, cVar.m41498m());
            int i10 = mo9152a.f34219a;
            if (i10 == -3) {
                m41475e(false, m41496k);
                return m41477g(interfaceC12622l, m41496k, c12635y);
            }
            if (i10 == -2) {
                cVar.m41501p(mo9152a.f34220b, mo9152a.f34221c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    m41479i(interfaceC12622l, mo9152a.f34221c);
                    m41475e(true, mo9152a.f34221c);
                    return m41477g(interfaceC12622l, mo9152a.f34221c, c12635y);
                }
                cVar.m41500o(mo9152a.f34220b, mo9152a.f34221c);
            }
        }
    }

    /* renamed from: d */
    public final boolean m41474d() {
        return this.f34201c != null;
    }

    /* renamed from: e */
    protected final void m41475e(boolean z10, long j10) {
        this.f34201c = null;
        this.f34200b.mo24199b();
        m41476f(z10, j10);
    }

    /* renamed from: f */
    protected void m41476f(boolean z10, long j10) {
    }

    /* renamed from: g */
    protected final int m41477g(InterfaceC12622l interfaceC12622l, long j10, C12635y c12635y) {
        if (j10 == interfaceC12622l.getPosition()) {
            return 0;
        }
        c12635y.f34331a = j10;
        return 1;
    }

    /* renamed from: h */
    public final void m41478h(long j10) {
        c cVar = this.f34201c;
        if (cVar == null || cVar.m41497l() != j10) {
            this.f34201c = m41471a(j10);
        }
    }

    /* renamed from: i */
    protected final boolean m41479i(InterfaceC12622l interfaceC12622l, long j10) {
        long position = j10 - interfaceC12622l.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        interfaceC12622l.mo41538n((int) position);
        return true;
    }
}
