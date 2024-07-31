package y6;

import t8.r0;
import y6.z;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected final C0530a f31663a;

    /* renamed from: b, reason: collision with root package name */
    protected final f f31664b;

    /* renamed from: c, reason: collision with root package name */
    protected c f31665c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31666d;

    /* renamed from: y6.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0530a implements z {

        /* renamed from: a, reason: collision with root package name */
        private final d f31667a;

        /* renamed from: b, reason: collision with root package name */
        private final long f31668b;

        /* renamed from: c, reason: collision with root package name */
        private final long f31669c;

        /* renamed from: d, reason: collision with root package name */
        private final long f31670d;

        /* renamed from: e, reason: collision with root package name */
        private final long f31671e;

        /* renamed from: f, reason: collision with root package name */
        private final long f31672f;

        /* renamed from: g, reason: collision with root package name */
        private final long f31673g;

        public C0530a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f31667a = dVar;
            this.f31668b = j10;
            this.f31669c = j11;
            this.f31670d = j12;
            this.f31671e = j13;
            this.f31672f = j14;
            this.f31673g = j15;
        }

        @Override // y6.z
        public z.a d(long j10) {
            return new z.a(new a0(j10, c.h(this.f31667a.a(j10), this.f31669c, this.f31670d, this.f31671e, this.f31672f, this.f31673g)));
        }

        @Override // y6.z
        public boolean h() {
            return true;
        }

        @Override // y6.z
        public long i() {
            return this.f31668b;
        }

        public long k(long j10) {
            return this.f31667a.a(j10);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements d {
        @Override // y6.a.d
        public long a(long j10) {
            return j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final long f31674a;

        /* renamed from: b, reason: collision with root package name */
        private final long f31675b;

        /* renamed from: c, reason: collision with root package name */
        private final long f31676c;

        /* renamed from: d, reason: collision with root package name */
        private long f31677d;

        /* renamed from: e, reason: collision with root package name */
        private long f31678e;

        /* renamed from: f, reason: collision with root package name */
        private long f31679f;

        /* renamed from: g, reason: collision with root package name */
        private long f31680g;

        /* renamed from: h, reason: collision with root package name */
        private long f31681h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f31674a = j10;
            this.f31675b = j11;
            this.f31677d = j12;
            this.f31678e = j13;
            this.f31679f = j14;
            this.f31680g = j15;
            this.f31676c = j16;
            this.f31681h = h(j11, j12, j13, j14, j15, j16);
        }

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
            return r0.r(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f31680g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f31679f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f31681h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f31674a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f31675b;
        }

        private void n() {
            this.f31681h = h(this.f31675b, this.f31677d, this.f31678e, this.f31679f, this.f31680g, this.f31676c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f31678e = j10;
            this.f31680g = j11;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f31677d = j10;
            this.f31679f = j11;
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public interface d {
        long a(long j10);
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f31682d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a, reason: collision with root package name */
        private final int f31683a;

        /* renamed from: b, reason: collision with root package name */
        private final long f31684b;

        /* renamed from: c, reason: collision with root package name */
        private final long f31685c;

        private e(int i10, long j10, long j11) {
            this.f31683a = i10;
            this.f31684b = j10;
            this.f31685c = j11;
        }

        public static e d(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        public static e e(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }

        public static e f(long j10, long j11) {
            return new e(-2, j10, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public interface f {
        e a(l lVar, long j10);

        default void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f31664b = fVar;
        this.f31666d = i10;
        this.f31663a = new C0530a(dVar, j10, j11, j12, j13, j14, j15);
    }

    protected c a(long j10) {
        return new c(j10, this.f31663a.k(j10), this.f31663a.f31669c, this.f31663a.f31670d, this.f31663a.f31671e, this.f31663a.f31672f, this.f31663a.f31673g);
    }

    public final z b() {
        return this.f31663a;
    }

    public int c(l lVar, y yVar) {
        while (true) {
            c cVar = (c) t8.a.i(this.f31665c);
            long j10 = cVar.j();
            long i10 = cVar.i();
            long k10 = cVar.k();
            if (i10 - j10 <= this.f31666d) {
                e(false, j10);
                return g(lVar, j10, yVar);
            }
            if (!i(lVar, k10)) {
                return g(lVar, k10, yVar);
            }
            lVar.f();
            e a10 = this.f31664b.a(lVar, cVar.m());
            int i11 = a10.f31683a;
            if (i11 == -3) {
                e(false, k10);
                return g(lVar, k10, yVar);
            }
            if (i11 == -2) {
                cVar.p(a10.f31684b, a10.f31685c);
            } else {
                if (i11 != -1) {
                    if (i11 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(lVar, a10.f31685c);
                    e(true, a10.f31685c);
                    return g(lVar, a10.f31685c, yVar);
                }
                cVar.o(a10.f31684b, a10.f31685c);
            }
        }
    }

    public final boolean d() {
        return this.f31665c != null;
    }

    protected final void e(boolean z10, long j10) {
        this.f31665c = null;
        this.f31664b.b();
        f(z10, j10);
    }

    protected void f(boolean z10, long j10) {
    }

    protected final int g(l lVar, long j10, y yVar) {
        if (j10 == lVar.getPosition()) {
            return 0;
        }
        yVar.f31795a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f31665c;
        if (cVar == null || cVar.l() != j10) {
            this.f31665c = a(j10);
        }
    }

    protected final boolean i(l lVar, long j10) {
        long position = j10 - lVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        lVar.n((int) position);
        return true;
    }
}
