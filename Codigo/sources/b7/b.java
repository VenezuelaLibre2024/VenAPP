package b7;

import java.util.Objects;
import y6.a;
import y6.l;
import y6.q;
import y6.t;

/* loaded from: classes.dex */
final class b extends y6.a {

    /* renamed from: b7.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0106b implements a.f {

        /* renamed from: a, reason: collision with root package name */
        private final t f6167a;

        /* renamed from: b, reason: collision with root package name */
        private final int f6168b;

        /* renamed from: c, reason: collision with root package name */
        private final q.a f6169c;

        private C0106b(t tVar, int i10) {
            this.f6167a = tVar;
            this.f6168b = i10;
            this.f6169c = new q.a();
        }

        private long c(l lVar) {
            while (lVar.i() < lVar.getLength() - 6 && !q.h(lVar, this.f6167a, this.f6168b, this.f6169c)) {
                lVar.k(1);
            }
            if (lVar.i() < lVar.getLength() - 6) {
                return this.f6169c.f31768a;
            }
            lVar.k((int) (lVar.getLength() - lVar.i()));
            return this.f6167a.f31781j;
        }

        @Override // y6.a.f
        public a.e a(l lVar, long j10) {
            long position = lVar.getPosition();
            long c10 = c(lVar);
            long i10 = lVar.i();
            lVar.k(Math.max(6, this.f6167a.f31774c));
            long c11 = c(lVar);
            return (c10 > j10 || c11 <= j10) ? c11 <= j10 ? a.e.f(c11, lVar.i()) : a.e.d(c10, position) : a.e.e(i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final t tVar, int i10, long j10, long j11) {
        super(new a.d() { // from class: b7.a
            @Override // y6.a.d
            public final long a(long j12) {
                return t.this.i(j12);
            }
        }, new C0106b(tVar, i10), tVar.f(), 0L, tVar.f31781j, j10, j11, tVar.d(), Math.max(6, tVar.f31774c));
        Objects.requireNonNull(tVar);
    }
}
