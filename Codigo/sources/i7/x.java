package i7;

import com.facebook.ads.AdError;
import t8.n0;
import t8.r0;
import y6.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x extends y6.a {

    /* loaded from: classes.dex */
    private static final class b implements a.f {

        /* renamed from: a, reason: collision with root package name */
        private final n0 f17534a;

        /* renamed from: b, reason: collision with root package name */
        private final t8.e0 f17535b;

        private b(n0 n0Var) {
            this.f17534a = n0Var;
            this.f17535b = new t8.e0();
        }

        private a.e c(t8.e0 e0Var, long j10, long j11) {
            int i10 = -1;
            int i11 = -1;
            long j12 = -9223372036854775807L;
            while (e0Var.a() >= 4) {
                if (x.k(e0Var.e(), e0Var.f()) != 442) {
                    e0Var.V(1);
                } else {
                    e0Var.V(4);
                    long l10 = y.l(e0Var);
                    if (l10 != -9223372036854775807L) {
                        long b10 = this.f17534a.b(l10);
                        if (b10 > j10) {
                            return j12 == -9223372036854775807L ? a.e.d(b10, j11) : a.e.e(j11 + i11);
                        }
                        if (100000 + b10 > j10) {
                            return a.e.e(j11 + e0Var.f());
                        }
                        i11 = e0Var.f();
                        j12 = b10;
                    }
                    d(e0Var);
                    i10 = e0Var.f();
                }
            }
            return j12 != -9223372036854775807L ? a.e.f(j12, j11 + i10) : a.e.f31682d;
        }

        private static void d(t8.e0 e0Var) {
            int k10;
            int g10 = e0Var.g();
            if (e0Var.a() < 10) {
                e0Var.U(g10);
                return;
            }
            e0Var.V(9);
            int H = e0Var.H() & 7;
            if (e0Var.a() < H) {
                e0Var.U(g10);
                return;
            }
            e0Var.V(H);
            if (e0Var.a() < 4) {
                e0Var.U(g10);
                return;
            }
            if (x.k(e0Var.e(), e0Var.f()) == 443) {
                e0Var.V(4);
                int N = e0Var.N();
                if (e0Var.a() < N) {
                    e0Var.U(g10);
                    return;
                }
                e0Var.V(N);
            }
            while (e0Var.a() >= 4 && (k10 = x.k(e0Var.e(), e0Var.f())) != 442 && k10 != 441 && (k10 >>> 8) == 1) {
                e0Var.V(4);
                if (e0Var.a() < 2) {
                    e0Var.U(g10);
                    return;
                }
                e0Var.U(Math.min(e0Var.g(), e0Var.f() + e0Var.N()));
            }
        }

        @Override // y6.a.f
        public a.e a(y6.l lVar, long j10) {
            long position = lVar.getPosition();
            int min = (int) Math.min(20000L, lVar.getLength() - position);
            this.f17535b.Q(min);
            lVar.q(this.f17535b.e(), 0, min);
            return c(this.f17535b, j10, position);
        }

        @Override // y6.a.f
        public void b() {
            this.f17535b.R(r0.f26749f);
        }
    }

    public x(n0 n0Var, long j10, long j11) {
        super(new a.b(), new b(n0Var), j10, 0L, j10 + 1, 0L, j11, 188L, AdError.NETWORK_ERROR_CODE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
