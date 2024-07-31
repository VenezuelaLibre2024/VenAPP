package i7;

import t8.n0;
import t8.r0;
import y6.a;

/* loaded from: classes.dex */
final class e0 extends y6.a {

    /* loaded from: classes.dex */
    private static final class a implements a.f {

        /* renamed from: a, reason: collision with root package name */
        private final n0 f17230a;

        /* renamed from: b, reason: collision with root package name */
        private final t8.e0 f17231b = new t8.e0();

        /* renamed from: c, reason: collision with root package name */
        private final int f17232c;

        /* renamed from: d, reason: collision with root package name */
        private final int f17233d;

        public a(int i10, n0 n0Var, int i11) {
            this.f17232c = i10;
            this.f17230a = n0Var;
            this.f17233d = i11;
        }

        private a.e c(t8.e0 e0Var, long j10, long j11) {
            int a10;
            int a11;
            int g10 = e0Var.g();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (e0Var.a() >= 188 && (a11 = (a10 = j0.a(e0Var.e(), e0Var.f(), g10)) + 188) <= g10) {
                long c10 = j0.c(e0Var, a10, this.f17232c);
                if (c10 != -9223372036854775807L) {
                    long b10 = this.f17230a.b(c10);
                    if (b10 > j10) {
                        return j14 == -9223372036854775807L ? a.e.d(b10, j11) : a.e.e(j11 + j13);
                    }
                    if (100000 + b10 > j10) {
                        return a.e.e(j11 + a10);
                    }
                    j13 = a10;
                    j14 = b10;
                }
                e0Var.U(a11);
                j12 = a11;
            }
            return j14 != -9223372036854775807L ? a.e.f(j14, j11 + j12) : a.e.f31682d;
        }

        @Override // y6.a.f
        public a.e a(y6.l lVar, long j10) {
            long position = lVar.getPosition();
            int min = (int) Math.min(this.f17233d, lVar.getLength() - position);
            this.f17231b.Q(min);
            lVar.q(this.f17231b.e(), 0, min);
            return c(this.f17231b, j10, position);
        }

        @Override // y6.a.f
        public void b() {
            this.f17231b.R(r0.f26749f);
        }
    }

    public e0(n0 n0Var, long j10, long j11, int i10, int i11) {
        super(new a.b(), new a(i10, n0Var, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
