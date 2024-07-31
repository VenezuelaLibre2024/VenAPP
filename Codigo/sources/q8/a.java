package q8;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.common.collect.e0;
import com.google.common.collect.k0;
import com.google.common.collect.l0;
import com.google.common.collect.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q8.r;
import t6.d4;
import t6.u1;
import t8.r0;
import v7.a0;
import v7.d1;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: h */
    private final s8.e f23599h;

    /* renamed from: i */
    private final long f23600i;

    /* renamed from: j */
    private final long f23601j;

    /* renamed from: k */
    private final long f23602k;

    /* renamed from: l */
    private final int f23603l;

    /* renamed from: m */
    private final int f23604m;

    /* renamed from: n */
    private final float f23605n;

    /* renamed from: o */
    private final float f23606o;

    /* renamed from: p */
    private final com.google.common.collect.w<C0391a> f23607p;

    /* renamed from: q */
    private final t8.d f23608q;

    /* renamed from: r */
    private float f23609r;

    /* renamed from: s */
    private int f23610s;

    /* renamed from: t */
    private int f23611t;

    /* renamed from: u */
    private long f23612u;

    /* renamed from: v */
    private x7.n f23613v;

    /* renamed from: q8.a$a */
    /* loaded from: classes.dex */
    public static final class C0391a {

        /* renamed from: a */
        public final long f23614a;

        /* renamed from: b */
        public final long f23615b;

        public C0391a(long j10, long j11) {
            this.f23614a = j10;
            this.f23615b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0391a)) {
                return false;
            }
            C0391a c0391a = (C0391a) obj;
            return this.f23614a == c0391a.f23614a && this.f23615b == c0391a.f23615b;
        }

        public int hashCode() {
            return (((int) this.f23614a) * 31) + ((int) this.f23615b);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements r.b {

        /* renamed from: a */
        private final int f23616a;

        /* renamed from: b */
        private final int f23617b;

        /* renamed from: c */
        private final int f23618c;

        /* renamed from: d */
        private final int f23619d;

        /* renamed from: e */
        private final int f23620e;

        /* renamed from: f */
        private final float f23621f;

        /* renamed from: g */
        private final float f23622g;

        /* renamed from: h */
        private final t8.d f23623h;

        public b() {
            this(ModuleDescriptor.MODULE_VERSION, 25000, 25000, 0.7f);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, t8.d.f26644a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, t8.d dVar) {
            this.f23616a = i10;
            this.f23617b = i11;
            this.f23618c = i12;
            this.f23619d = i13;
            this.f23620e = i14;
            this.f23621f = f10;
            this.f23622g = f11;
            this.f23623h = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q8.r.b
        public final r[] a(r.a[] aVarArr, s8.e eVar, a0.b bVar, d4 d4Var) {
            com.google.common.collect.w B = a.B(aVarArr);
            r[] rVarArr = new r[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                r.a aVar = aVarArr[i10];
                if (aVar != null) {
                    int[] iArr = aVar.f23718b;
                    if (iArr.length != 0) {
                        rVarArr[i10] = iArr.length == 1 ? new s(aVar.f23717a, iArr[0], aVar.f23719c) : b(aVar.f23717a, iArr, aVar.f23719c, eVar, (com.google.common.collect.w) B.get(i10));
                    }
                }
            }
            return rVarArr;
        }

        protected a b(d1 d1Var, int[] iArr, int i10, s8.e eVar, com.google.common.collect.w<C0391a> wVar) {
            return new a(d1Var, iArr, i10, eVar, this.f23616a, this.f23617b, this.f23618c, this.f23619d, this.f23620e, this.f23621f, this.f23622g, wVar, this.f23623h);
        }
    }

    protected a(d1 d1Var, int[] iArr, int i10, s8.e eVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List<C0391a> list, t8.d dVar) {
        super(d1Var, iArr, i10);
        s8.e eVar2;
        long j13;
        if (j12 < j10) {
            t8.s.i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            eVar2 = eVar;
            j13 = j10;
        } else {
            eVar2 = eVar;
            j13 = j12;
        }
        this.f23599h = eVar2;
        this.f23600i = j10 * 1000;
        this.f23601j = j11 * 1000;
        this.f23602k = j13 * 1000;
        this.f23603l = i11;
        this.f23604m = i12;
        this.f23605n = f10;
        this.f23606o = f11;
        this.f23607p = com.google.common.collect.w.r(list);
        this.f23608q = dVar;
        this.f23609r = 1.0f;
        this.f23611t = 0;
        this.f23612u = -9223372036854775807L;
    }

    private int A(long j10, long j11) {
        long C = C(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f23632b; i11++) {
            if (j10 == Long.MIN_VALUE || !j(i11, j10)) {
                u1 a10 = a(i11);
                if (z(a10, a10.f26513s, C)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    public static com.google.common.collect.w<com.google.common.collect.w<C0391a>> B(r.a[] aVarArr) {
        w.a aVar;
        ArrayList arrayList = new ArrayList();
        for (r.a aVar2 : aVarArr) {
            if (aVar2 == null || aVar2.f23718b.length <= 1) {
                aVar = null;
            } else {
                aVar = com.google.common.collect.w.p();
                aVar.a(new C0391a(0L, 0L));
            }
            arrayList.add(aVar);
        }
        long[][] G = G(aVarArr);
        int[] iArr = new int[G.length];
        long[] jArr = new long[G.length];
        for (int i10 = 0; i10 < G.length; i10++) {
            long[] jArr2 = G[i10];
            jArr[i10] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        y(arrayList, jArr);
        com.google.common.collect.w<Integer> H = H(G);
        for (int i11 = 0; i11 < H.size(); i11++) {
            int intValue = H.get(i11).intValue();
            int i12 = iArr[intValue] + 1;
            iArr[intValue] = i12;
            jArr[intValue] = G[intValue][i12];
            y(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        y(arrayList, jArr);
        w.a p10 = com.google.common.collect.w.p();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            w.a aVar3 = (w.a) arrayList.get(i14);
            p10.a(aVar3 == null ? com.google.common.collect.w.v() : aVar3.k());
        }
        return p10.k();
    }

    private long C(long j10) {
        long I = I(j10);
        if (this.f23607p.isEmpty()) {
            return I;
        }
        int i10 = 1;
        while (i10 < this.f23607p.size() - 1 && this.f23607p.get(i10).f23614a < I) {
            i10++;
        }
        C0391a c0391a = this.f23607p.get(i10 - 1);
        C0391a c0391a2 = this.f23607p.get(i10);
        long j11 = c0391a.f23614a;
        float f10 = ((float) (I - j11)) / ((float) (c0391a2.f23614a - j11));
        return c0391a.f23615b + (f10 * ((float) (c0391a2.f23615b - r2)));
    }

    private long D(List<? extends x7.n> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        x7.n nVar = (x7.n) e0.d(list);
        long j10 = nVar.f30607g;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = nVar.f30608h;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    private long F(x7.o[] oVarArr, List<? extends x7.n> list) {
        int i10 = this.f23610s;
        if (i10 < oVarArr.length && oVarArr[i10].next()) {
            x7.o oVar = oVarArr[this.f23610s];
            return oVar.b() - oVar.a();
        }
        for (x7.o oVar2 : oVarArr) {
            if (oVar2.next()) {
                return oVar2.b() - oVar2.a();
            }
        }
        return D(list);
    }

    private static long[][] G(r.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            r.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f23718b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f23718b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = aVar.f23717a.d(iArr[i11]).f26513s;
                    long[] jArr2 = jArr[i10];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i11] = j10;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    private static com.google.common.collect.w<Integer> H(long[][] jArr) {
        k0 e10 = l0.c().a().e();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double d10 = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        d10 = Math.log(j10);
                    }
                    dArr[i11] = d10;
                    i11++;
                }
                int i12 = length - 1;
                double d11 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d12 = dArr[i13];
                    i13++;
                    e10.put(Double.valueOf(d11 == 0.0d ? 1.0d : (((d12 + dArr[i13]) * 0.5d) - dArr[0]) / d11), Integer.valueOf(i10));
                }
            }
        }
        return com.google.common.collect.w.r(e10.values());
    }

    private long I(long j10) {
        long g10 = ((float) this.f23599h.g()) * this.f23605n;
        if (this.f23599h.b() == -9223372036854775807L || j10 == -9223372036854775807L) {
            return ((float) g10) / this.f23609r;
        }
        float f10 = (float) j10;
        return (((float) g10) * Math.max((f10 / this.f23609r) - ((float) r2), 0.0f)) / f10;
    }

    private long J(long j10, long j11) {
        if (j10 == -9223372036854775807L) {
            return this.f23600i;
        }
        if (j11 != -9223372036854775807L) {
            j10 -= j11;
        }
        return Math.min(((float) j10) * this.f23606o, this.f23600i);
    }

    private static void y(List<w.a<C0391a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            w.a<C0391a> aVar = list.get(i10);
            if (aVar != null) {
                aVar.a(new C0391a(j10, jArr[i10]));
            }
        }
    }

    protected long E() {
        return this.f23602k;
    }

    protected boolean K(long j10, List<? extends x7.n> list) {
        long j11 = this.f23612u;
        return j11 == -9223372036854775807L || j10 - j11 >= 1000 || !(list.isEmpty() || ((x7.n) e0.d(list)).equals(this.f23613v));
    }

    @Override // q8.c, q8.r
    public void f() {
        this.f23613v = null;
    }

    @Override // q8.r
    public void g(long j10, long j11, long j12, List<? extends x7.n> list, x7.o[] oVarArr) {
        long b10 = this.f23608q.b();
        long F = F(oVarArr, list);
        int i10 = this.f23611t;
        if (i10 == 0) {
            this.f23611t = 1;
            this.f23610s = A(b10, F);
            return;
        }
        int i11 = this.f23610s;
        int e10 = list.isEmpty() ? -1 : e(((x7.n) e0.d(list)).f30604d);
        if (e10 != -1) {
            i10 = ((x7.n) e0.d(list)).f30605e;
            i11 = e10;
        }
        int A = A(b10, F);
        if (!j(i11, b10)) {
            u1 a10 = a(i11);
            u1 a11 = a(A);
            long J = J(j12, F);
            int i12 = a11.f26513s;
            int i13 = a10.f26513s;
            if ((i12 > i13 && j11 < J) || (i12 < i13 && j11 >= this.f23601j)) {
                A = i11;
            }
        }
        if (A != i11) {
            i10 = 3;
        }
        this.f23611t = i10;
        this.f23610s = A;
    }

    @Override // q8.r
    public int h() {
        return this.f23610s;
    }

    @Override // q8.c, q8.r
    public void l(float f10) {
        this.f23609r = f10;
    }

    @Override // q8.r
    public Object m() {
        return null;
    }

    @Override // q8.c, q8.r
    public void p() {
        this.f23612u = -9223372036854775807L;
        this.f23613v = null;
    }

    @Override // q8.c, q8.r
    public int q(long j10, List<? extends x7.n> list) {
        int i10;
        int i11;
        long b10 = this.f23608q.b();
        if (!K(b10, list)) {
            return list.size();
        }
        this.f23612u = b10;
        this.f23613v = list.isEmpty() ? null : (x7.n) e0.d(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long f02 = r0.f0(list.get(size - 1).f30607g - j10, this.f23609r);
        long E = E();
        if (f02 < E) {
            return size;
        }
        u1 a10 = a(A(b10, D(list)));
        for (int i12 = 0; i12 < size; i12++) {
            x7.n nVar = list.get(i12);
            u1 u1Var = nVar.f30604d;
            if (r0.f0(nVar.f30607g - j10, this.f23609r) >= E && u1Var.f26513s < a10.f26513s && (i10 = u1Var.C) != -1 && i10 <= this.f23604m && (i11 = u1Var.B) != -1 && i11 <= this.f23603l && i10 < a10.C) {
                return i12;
            }
        }
        return size;
    }

    @Override // q8.r
    public int t() {
        return this.f23611t;
    }

    protected boolean z(u1 u1Var, int i10, long j10) {
        return ((long) i10) <= j10;
    }
}
