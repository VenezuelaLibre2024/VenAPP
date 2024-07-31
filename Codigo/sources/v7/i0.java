package v7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import t6.u1;
import t6.u3;
import t6.v1;
import v7.y;

/* loaded from: classes.dex */
final class i0 implements y, y.a {

    /* renamed from: a, reason: collision with root package name */
    private final y[] f28341a;

    /* renamed from: c, reason: collision with root package name */
    private final i f28343c;

    /* renamed from: f, reason: collision with root package name */
    private y.a f28346f;

    /* renamed from: r, reason: collision with root package name */
    private f1 f28347r;

    /* renamed from: t, reason: collision with root package name */
    private w0 f28349t;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<y> f28344d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<d1, d1> f28345e = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final IdentityHashMap<v0, Integer> f28342b = new IdentityHashMap<>();

    /* renamed from: s, reason: collision with root package name */
    private y[] f28348s = new y[0];

    /* loaded from: classes.dex */
    private static final class a implements q8.r {

        /* renamed from: a, reason: collision with root package name */
        private final q8.r f28350a;

        /* renamed from: b, reason: collision with root package name */
        private final d1 f28351b;

        public a(q8.r rVar, d1 d1Var) {
            this.f28350a = rVar;
            this.f28351b = d1Var;
        }

        @Override // q8.u
        public u1 a(int i10) {
            return this.f28350a.a(i10);
        }

        @Override // q8.u
        public int b(int i10) {
            return this.f28350a.b(i10);
        }

        @Override // q8.u
        public int c(int i10) {
            return this.f28350a.c(i10);
        }

        @Override // q8.u
        public d1 d() {
            return this.f28351b;
        }

        @Override // q8.u
        public int e(u1 u1Var) {
            return this.f28350a.e(u1Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f28350a.equals(aVar.f28350a) && this.f28351b.equals(aVar.f28351b);
        }

        @Override // q8.r
        public void f() {
            this.f28350a.f();
        }

        @Override // q8.r
        public void g(long j10, long j11, long j12, List<? extends x7.n> list, x7.o[] oVarArr) {
            this.f28350a.g(j10, j11, j12, list, oVarArr);
        }

        @Override // q8.r
        public int h() {
            return this.f28350a.h();
        }

        public int hashCode() {
            return ((527 + this.f28351b.hashCode()) * 31) + this.f28350a.hashCode();
        }

        @Override // q8.r
        public boolean i(int i10, long j10) {
            return this.f28350a.i(i10, j10);
        }

        @Override // q8.r
        public boolean j(int i10, long j10) {
            return this.f28350a.j(i10, j10);
        }

        @Override // q8.r
        public boolean k(long j10, x7.f fVar, List<? extends x7.n> list) {
            return this.f28350a.k(j10, fVar, list);
        }

        @Override // q8.r
        public void l(float f10) {
            this.f28350a.l(f10);
        }

        @Override // q8.u
        public int length() {
            return this.f28350a.length();
        }

        @Override // q8.r
        public Object m() {
            return this.f28350a.m();
        }

        @Override // q8.r
        public void n() {
            this.f28350a.n();
        }

        @Override // q8.r
        public void o(boolean z10) {
            this.f28350a.o(z10);
        }

        @Override // q8.r
        public void p() {
            this.f28350a.p();
        }

        @Override // q8.r
        public int q(long j10, List<? extends x7.n> list) {
            return this.f28350a.q(j10, list);
        }

        @Override // q8.r
        public int r() {
            return this.f28350a.r();
        }

        @Override // q8.r
        public u1 s() {
            return this.f28350a.s();
        }

        @Override // q8.r
        public int t() {
            return this.f28350a.t();
        }

        @Override // q8.r
        public void u() {
            this.f28350a.u();
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements y, y.a {

        /* renamed from: a, reason: collision with root package name */
        private final y f28352a;

        /* renamed from: b, reason: collision with root package name */
        private final long f28353b;

        /* renamed from: c, reason: collision with root package name */
        private y.a f28354c;

        public b(y yVar, long j10) {
            this.f28352a = yVar;
            this.f28353b = j10;
        }

        @Override // v7.y, v7.w0
        public long b() {
            long b10 = this.f28352a.b();
            if (b10 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f28353b + b10;
        }

        @Override // v7.y
        public long c(long j10, u3 u3Var) {
            return this.f28352a.c(j10 - this.f28353b, u3Var) + this.f28353b;
        }

        @Override // v7.y, v7.w0
        public boolean e(long j10) {
            return this.f28352a.e(j10 - this.f28353b);
        }

        @Override // v7.y, v7.w0
        public long f() {
            long f10 = this.f28352a.f();
            if (f10 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f28353b + f10;
        }

        @Override // v7.y, v7.w0
        public void g(long j10) {
            this.f28352a.g(j10 - this.f28353b);
        }

        @Override // v7.y.a
        public void h(y yVar) {
            ((y.a) t8.a.e(this.f28354c)).h(this);
        }

        @Override // v7.y, v7.w0
        public boolean isLoading() {
            return this.f28352a.isLoading();
        }

        @Override // v7.y
        public long j(long j10) {
            return this.f28352a.j(j10 - this.f28353b) + this.f28353b;
        }

        @Override // v7.y
        public void k(y.a aVar, long j10) {
            this.f28354c = aVar;
            this.f28352a.k(this, j10 - this.f28353b);
        }

        @Override // v7.y
        public long l() {
            long l10 = this.f28352a.l();
            if (l10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f28353b + l10;
        }

        @Override // v7.w0.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void a(y yVar) {
            ((y.a) t8.a.e(this.f28354c)).a(this);
        }

        @Override // v7.y
        public void o() {
            this.f28352a.o();
        }

        @Override // v7.y
        public f1 r() {
            return this.f28352a.r();
        }

        @Override // v7.y
        public void s(long j10, boolean z10) {
            this.f28352a.s(j10 - this.f28353b, z10);
        }

        @Override // v7.y
        public long t(q8.r[] rVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j10) {
            v0[] v0VarArr2 = new v0[v0VarArr.length];
            int i10 = 0;
            while (true) {
                v0 v0Var = null;
                if (i10 >= v0VarArr.length) {
                    break;
                }
                c cVar = (c) v0VarArr[i10];
                if (cVar != null) {
                    v0Var = cVar.b();
                }
                v0VarArr2[i10] = v0Var;
                i10++;
            }
            long t10 = this.f28352a.t(rVarArr, zArr, v0VarArr2, zArr2, j10 - this.f28353b);
            for (int i11 = 0; i11 < v0VarArr.length; i11++) {
                v0 v0Var2 = v0VarArr2[i11];
                if (v0Var2 == null) {
                    v0VarArr[i11] = null;
                } else {
                    v0 v0Var3 = v0VarArr[i11];
                    if (v0Var3 == null || ((c) v0Var3).b() != v0Var2) {
                        v0VarArr[i11] = new c(v0Var2, this.f28353b);
                    }
                }
            }
            return t10 + this.f28353b;
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements v0 {

        /* renamed from: a, reason: collision with root package name */
        private final v0 f28355a;

        /* renamed from: b, reason: collision with root package name */
        private final long f28356b;

        public c(v0 v0Var, long j10) {
            this.f28355a = v0Var;
            this.f28356b = j10;
        }

        @Override // v7.v0
        public void a() {
            this.f28355a.a();
        }

        public v0 b() {
            return this.f28355a;
        }

        @Override // v7.v0
        public boolean d() {
            return this.f28355a.d();
        }

        @Override // v7.v0
        public int p(long j10) {
            return this.f28355a.p(j10 - this.f28356b);
        }

        @Override // v7.v0
        public int q(v1 v1Var, w6.g gVar, int i10) {
            int q10 = this.f28355a.q(v1Var, gVar, i10);
            if (q10 == -4) {
                gVar.f29681e = Math.max(0L, gVar.f29681e + this.f28356b);
            }
            return q10;
        }
    }

    public i0(i iVar, long[] jArr, y... yVarArr) {
        this.f28343c = iVar;
        this.f28341a = yVarArr;
        this.f28349t = iVar.a(new w0[0]);
        for (int i10 = 0; i10 < yVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f28341a[i10] = new b(yVarArr[i10], j10);
            }
        }
    }

    @Override // v7.y, v7.w0
    public long b() {
        return this.f28349t.b();
    }

    @Override // v7.y
    public long c(long j10, u3 u3Var) {
        y[] yVarArr = this.f28348s;
        return (yVarArr.length > 0 ? yVarArr[0] : this.f28341a[0]).c(j10, u3Var);
    }

    public y d(int i10) {
        y yVar = this.f28341a[i10];
        return yVar instanceof b ? ((b) yVar).f28352a : yVar;
    }

    @Override // v7.y, v7.w0
    public boolean e(long j10) {
        if (this.f28344d.isEmpty()) {
            return this.f28349t.e(j10);
        }
        int size = this.f28344d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f28344d.get(i10).e(j10);
        }
        return false;
    }

    @Override // v7.y, v7.w0
    public long f() {
        return this.f28349t.f();
    }

    @Override // v7.y, v7.w0
    public void g(long j10) {
        this.f28349t.g(j10);
    }

    @Override // v7.y.a
    public void h(y yVar) {
        this.f28344d.remove(yVar);
        if (!this.f28344d.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (y yVar2 : this.f28341a) {
            i10 += yVar2.r().f28314a;
        }
        d1[] d1VarArr = new d1[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            y[] yVarArr = this.f28341a;
            if (i11 >= yVarArr.length) {
                this.f28347r = new f1(d1VarArr);
                ((y.a) t8.a.e(this.f28346f)).h(this);
                return;
            }
            f1 r10 = yVarArr[i11].r();
            int i13 = r10.f28314a;
            int i14 = 0;
            while (i14 < i13) {
                d1 c10 = r10.c(i14);
                d1 c11 = c10.c(i11 + ":" + c10.f28289b);
                this.f28345e.put(c11, c10);
                d1VarArr[i12] = c11;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    @Override // v7.y, v7.w0
    public boolean isLoading() {
        return this.f28349t.isLoading();
    }

    @Override // v7.y
    public long j(long j10) {
        long j11 = this.f28348s[0].j(j10);
        int i10 = 1;
        while (true) {
            y[] yVarArr = this.f28348s;
            if (i10 >= yVarArr.length) {
                return j11;
            }
            if (yVarArr[i10].j(j11) != j11) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // v7.y
    public void k(y.a aVar, long j10) {
        this.f28346f = aVar;
        Collections.addAll(this.f28344d, this.f28341a);
        for (y yVar : this.f28341a) {
            yVar.k(this, j10);
        }
    }

    @Override // v7.y
    public long l() {
        long j10 = -9223372036854775807L;
        for (y yVar : this.f28348s) {
            long l10 = yVar.l();
            if (l10 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (y yVar2 : this.f28348s) {
                        if (yVar2 == yVar) {
                            break;
                        }
                        if (yVar2.j(l10) != l10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = l10;
                } else if (l10 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && yVar.j(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override // v7.w0.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void a(y yVar) {
        ((y.a) t8.a.e(this.f28346f)).a(this);
    }

    @Override // v7.y
    public void o() {
        for (y yVar : this.f28341a) {
            yVar.o();
        }
    }

    @Override // v7.y
    public f1 r() {
        return (f1) t8.a.e(this.f28347r);
    }

    @Override // v7.y
    public void s(long j10, boolean z10) {
        for (y yVar : this.f28348s) {
            yVar.s(j10, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // v7.y
    public long t(q8.r[] rVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j10) {
        v0 v0Var;
        int[] iArr = new int[rVarArr.length];
        int[] iArr2 = new int[rVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            v0Var = null;
            if (i11 >= rVarArr.length) {
                break;
            }
            v0 v0Var2 = v0VarArr[i11];
            Integer num = v0Var2 != null ? this.f28342b.get(v0Var2) : null;
            iArr[i11] = num == null ? -1 : num.intValue();
            q8.r rVar = rVarArr[i11];
            if (rVar != null) {
                String str = rVar.d().f28289b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        this.f28342b.clear();
        int length = rVarArr.length;
        v0[] v0VarArr2 = new v0[length];
        v0[] v0VarArr3 = new v0[rVarArr.length];
        q8.r[] rVarArr2 = new q8.r[rVarArr.length];
        ArrayList arrayList = new ArrayList(this.f28341a.length);
        long j11 = j10;
        int i12 = 0;
        q8.r[] rVarArr3 = rVarArr2;
        while (i12 < this.f28341a.length) {
            for (int i13 = i10; i13 < rVarArr.length; i13++) {
                v0VarArr3[i13] = iArr[i13] == i12 ? v0VarArr[i13] : v0Var;
                if (iArr2[i13] == i12) {
                    q8.r rVar2 = (q8.r) t8.a.e(rVarArr[i13]);
                    rVarArr3[i13] = new a(rVar2, (d1) t8.a.e(this.f28345e.get(rVar2.d())));
                } else {
                    rVarArr3[i13] = v0Var;
                }
            }
            int i14 = i12;
            ArrayList arrayList2 = arrayList;
            q8.r[] rVarArr4 = rVarArr3;
            long t10 = this.f28341a[i12].t(rVarArr3, zArr, v0VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = t10;
            } else if (t10 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < rVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    v0 v0Var3 = (v0) t8.a.e(v0VarArr3[i15]);
                    v0VarArr2[i15] = v0VarArr3[i15];
                    this.f28342b.put(v0Var3, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    t8.a.g(v0VarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList2.add(this.f28341a[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            rVarArr3 = rVarArr4;
            i10 = 0;
            v0Var = null;
        }
        int i16 = i10;
        System.arraycopy(v0VarArr2, i16, v0VarArr, i16, length);
        y[] yVarArr = (y[]) arrayList.toArray(new y[i16]);
        this.f28348s = yVarArr;
        this.f28349t = this.f28343c.a(yVarArr);
        return j11;
    }
}
