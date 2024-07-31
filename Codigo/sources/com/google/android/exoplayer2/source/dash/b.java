package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q8.r;
import s8.d0;
import s8.f0;
import s8.m0;
import t6.u1;
import t6.u3;
import t8.r0;
import u6.m3;
import v7.d1;
import v7.f1;
import v7.h0;
import v7.v0;
import v7.w0;
import v7.y;
import x6.u;
import x6.v;
import x7.i;
import z7.f;
import z7.g;
import z7.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b implements y, w0.a<i<com.google.android.exoplayer2.source.dash.a>>, i.b<com.google.android.exoplayer2.source.dash.a> {
    private static final Pattern J = Pattern.compile("CC([1-4])=(.+)");
    private static final Pattern K = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    private final u.a A;
    private final m3 B;
    private y.a C;
    private w0 F;
    private z7.c G;
    private int H;
    private List<f> I;

    /* renamed from: a, reason: collision with root package name */
    final int f8145a;

    /* renamed from: b, reason: collision with root package name */
    private final a.InterfaceC0140a f8146b;

    /* renamed from: c, reason: collision with root package name */
    private final m0 f8147c;

    /* renamed from: d, reason: collision with root package name */
    private final v f8148d;

    /* renamed from: e, reason: collision with root package name */
    private final d0 f8149e;

    /* renamed from: f, reason: collision with root package name */
    private final y7.b f8150f;

    /* renamed from: r, reason: collision with root package name */
    private final long f8151r;

    /* renamed from: s, reason: collision with root package name */
    private final f0 f8152s;

    /* renamed from: t, reason: collision with root package name */
    private final s8.b f8153t;

    /* renamed from: u, reason: collision with root package name */
    private final f1 f8154u;

    /* renamed from: v, reason: collision with root package name */
    private final a[] f8155v;

    /* renamed from: w, reason: collision with root package name */
    private final v7.i f8156w;

    /* renamed from: x, reason: collision with root package name */
    private final e f8157x;

    /* renamed from: z, reason: collision with root package name */
    private final h0.a f8159z;
    private i<com.google.android.exoplayer2.source.dash.a>[] D = D(0);
    private d[] E = new d[0];

    /* renamed from: y, reason: collision with root package name */
    private final IdentityHashMap<i<com.google.android.exoplayer2.source.dash.a>, e.c> f8158y = new IdentityHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f8160a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8161b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8162c;

        /* renamed from: d, reason: collision with root package name */
        public final int f8163d;

        /* renamed from: e, reason: collision with root package name */
        public final int f8164e;

        /* renamed from: f, reason: collision with root package name */
        public final int f8165f;

        /* renamed from: g, reason: collision with root package name */
        public final int f8166g;

        private a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15) {
            this.f8161b = i10;
            this.f8160a = iArr;
            this.f8162c = i11;
            this.f8164e = i12;
            this.f8165f = i13;
            this.f8166g = i14;
            this.f8163d = i15;
        }

        public static a a(int[] iArr, int i10) {
            return new a(3, 1, iArr, i10, -1, -1, -1);
        }

        public static a b(int[] iArr, int i10) {
            return new a(5, 1, iArr, i10, -1, -1, -1);
        }

        public static a c(int i10) {
            return new a(5, 2, new int[0], -1, -1, -1, i10);
        }

        public static a d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1);
        }
    }

    public b(int i10, z7.c cVar, y7.b bVar, int i11, a.InterfaceC0140a interfaceC0140a, m0 m0Var, v vVar, u.a aVar, d0 d0Var, h0.a aVar2, long j10, f0 f0Var, s8.b bVar2, v7.i iVar, e.b bVar3, m3 m3Var) {
        this.f8145a = i10;
        this.G = cVar;
        this.f8150f = bVar;
        this.H = i11;
        this.f8146b = interfaceC0140a;
        this.f8147c = m0Var;
        this.f8148d = vVar;
        this.A = aVar;
        this.f8149e = d0Var;
        this.f8159z = aVar2;
        this.f8151r = j10;
        this.f8152s = f0Var;
        this.f8153t = bVar2;
        this.f8156w = iVar;
        this.B = m3Var;
        this.f8157x = new e(cVar, bVar3, bVar2);
        this.F = iVar.a(this.D);
        g d10 = cVar.d(i11);
        List<f> list = d10.f32397d;
        this.I = list;
        Pair<f1, a[]> q10 = q(vVar, d10.f32396c, list);
        this.f8154u = (f1) q10.first;
        this.f8155v = (a[]) q10.second;
    }

    private int[] A(r[] rVarArr) {
        int[] iArr = new int[rVarArr.length];
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            r rVar = rVarArr[i10];
            if (rVar != null) {
                iArr[i10] = this.f8154u.d(rVar.d());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    private static boolean B(List<z7.a> list, int[] iArr) {
        for (int i10 : iArr) {
            List<j> list2 = list.get(i10).f32351c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!list2.get(i11).f32412e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int C(int i10, List<z7.a> list, int[][] iArr, boolean[] zArr, u1[][] u1VarArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (B(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            u1[] x10 = x(list, iArr[i12]);
            u1VarArr[i12] = x10;
            if (x10.length != 0) {
                i11++;
            }
        }
        return i11;
    }

    private static i<com.google.android.exoplayer2.source.dash.a>[] D(int i10) {
        return new i[i10];
    }

    private static u1[] F(z7.e eVar, Pattern pattern, u1 u1Var) {
        String str = eVar.f32387b;
        if (str == null) {
            return new u1[]{u1Var};
        }
        String[] R0 = r0.R0(str, ";");
        u1[] u1VarArr = new u1[R0.length];
        for (int i10 = 0; i10 < R0.length; i10++) {
            Matcher matcher = pattern.matcher(R0[i10]);
            if (!matcher.matches()) {
                return new u1[]{u1Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            u1VarArr[i10] = u1Var.c().U(u1Var.f26506a + ":" + parseInt).H(parseInt).X(matcher.group(2)).G();
        }
        return u1VarArr;
    }

    private void H(r[] rVarArr, boolean[] zArr, v0[] v0VarArr) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            if (rVarArr[i10] == null || !zArr[i10]) {
                v0 v0Var = v0VarArr[i10];
                if (v0Var instanceof i) {
                    ((i) v0Var).P(this);
                } else if (v0Var instanceof i.a) {
                    ((i.a) v0Var).c();
                }
                v0VarArr[i10] = null;
            }
        }
    }

    private void I(r[] rVarArr, v0[] v0VarArr, int[] iArr) {
        boolean z10;
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            v0 v0Var = v0VarArr[i10];
            if ((v0Var instanceof v7.r) || (v0Var instanceof i.a)) {
                int z11 = z(i10, iArr);
                if (z11 == -1) {
                    z10 = v0VarArr[i10] instanceof v7.r;
                } else {
                    v0 v0Var2 = v0VarArr[i10];
                    z10 = (v0Var2 instanceof i.a) && ((i.a) v0Var2).f30627a == v0VarArr[z11];
                }
                if (!z10) {
                    v0 v0Var3 = v0VarArr[i10];
                    if (v0Var3 instanceof i.a) {
                        ((i.a) v0Var3).c();
                    }
                    v0VarArr[i10] = null;
                }
            }
        }
    }

    private void J(r[] rVarArr, v0[] v0VarArr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            r rVar = rVarArr[i10];
            if (rVar != null) {
                v0 v0Var = v0VarArr[i10];
                if (v0Var == null) {
                    zArr[i10] = true;
                    a aVar = this.f8155v[iArr[i10]];
                    int i11 = aVar.f8162c;
                    if (i11 == 0) {
                        v0VarArr[i10] = p(aVar, rVar, j10);
                    } else if (i11 == 2) {
                        v0VarArr[i10] = new d(this.I.get(aVar.f8163d), rVar.d().d(0), this.G.f32362d);
                    }
                } else if (v0Var instanceof i) {
                    ((com.google.android.exoplayer2.source.dash.a) ((i) v0Var).D()).b(rVar);
                }
            }
        }
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            if (v0VarArr[i12] == null && rVarArr[i12] != null) {
                a aVar2 = this.f8155v[iArr[i12]];
                if (aVar2.f8162c == 1) {
                    int z10 = z(i12, iArr);
                    if (z10 == -1) {
                        v0VarArr[i12] = new v7.r();
                    } else {
                        v0VarArr[i12] = ((i) v0VarArr[z10]).S(j10, aVar2.f8161b);
                    }
                }
            }
        }
    }

    private static void m(List<f> list, d1[] d1VarArr, a[] aVarArr, int i10) {
        int i11 = 0;
        while (i11 < list.size()) {
            f fVar = list.get(i11);
            d1VarArr[i10] = new d1(fVar.a() + ":" + i11, new u1.b().U(fVar.a()).g0("application/x-emsg").G());
            aVarArr[i10] = a.c(i11);
            i11++;
            i10++;
        }
    }

    private static int n(v vVar, List<z7.a> list, int[][] iArr, int i10, boolean[] zArr, u1[][] u1VarArr, d1[] d1VarArr, a[] aVarArr) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            int[] iArr2 = iArr[i13];
            ArrayList arrayList = new ArrayList();
            for (int i15 : iArr2) {
                arrayList.addAll(list.get(i15).f32351c);
            }
            int size = arrayList.size();
            u1[] u1VarArr2 = new u1[size];
            for (int i16 = 0; i16 < size; i16++) {
                u1 u1Var = ((j) arrayList.get(i16)).f32409b;
                u1VarArr2[i16] = u1Var.d(vVar.d(u1Var));
            }
            z7.a aVar = list.get(iArr2[0]);
            int i17 = aVar.f32349a;
            String num = i17 != -1 ? Integer.toString(i17) : "unset:" + i13;
            int i18 = i14 + 1;
            if (zArr[i13]) {
                i11 = i18 + 1;
            } else {
                i11 = i18;
                i18 = -1;
            }
            if (u1VarArr[i13].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            d1VarArr[i14] = new d1(num, u1VarArr2);
            aVarArr[i14] = a.d(aVar.f32350b, iArr2, i14, i18, i11);
            if (i18 != -1) {
                String str = num + ":emsg";
                d1VarArr[i18] = new d1(str, new u1.b().U(str).g0("application/x-emsg").G());
                aVarArr[i18] = a.b(iArr2, i14);
            }
            if (i11 != -1) {
                d1VarArr[i11] = new d1(num + ":cc", u1VarArr[i13]);
                aVarArr[i11] = a.a(iArr2, i14);
            }
            i13++;
            i14 = i12;
        }
        return i14;
    }

    private i<com.google.android.exoplayer2.source.dash.a> p(a aVar, r rVar, long j10) {
        int i10;
        d1 d1Var;
        d1 d1Var2;
        int i11;
        int i12 = aVar.f8165f;
        boolean z10 = i12 != -1;
        e.c cVar = null;
        if (z10) {
            d1Var = this.f8154u.c(i12);
            i10 = 1;
        } else {
            i10 = 0;
            d1Var = null;
        }
        int i13 = aVar.f8166g;
        boolean z11 = i13 != -1;
        if (z11) {
            d1Var2 = this.f8154u.c(i13);
            i10 += d1Var2.f28288a;
        } else {
            d1Var2 = null;
        }
        u1[] u1VarArr = new u1[i10];
        int[] iArr = new int[i10];
        if (z10) {
            u1VarArr[0] = d1Var.d(0);
            iArr[0] = 5;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            for (int i14 = 0; i14 < d1Var2.f28288a; i14++) {
                u1 d10 = d1Var2.d(i14);
                u1VarArr[i11] = d10;
                iArr[i11] = 3;
                arrayList.add(d10);
                i11++;
            }
        }
        if (this.G.f32362d && z10) {
            cVar = this.f8157x.k();
        }
        e.c cVar2 = cVar;
        i<com.google.android.exoplayer2.source.dash.a> iVar = new i<>(aVar.f8161b, iArr, u1VarArr, this.f8146b.a(this.f8152s, this.G, this.f8150f, this.H, aVar.f8160a, rVar, aVar.f8161b, this.f8151r, z10, arrayList, cVar2, this.f8147c, this.B), this, this.f8153t, j10, this.f8148d, this.A, this.f8149e, this.f8159z);
        synchronized (this) {
            this.f8158y.put(iVar, cVar2);
        }
        return iVar;
    }

    private static Pair<f1, a[]> q(v vVar, List<z7.a> list, List<f> list2) {
        int[][] y10 = y(list);
        int length = y10.length;
        boolean[] zArr = new boolean[length];
        u1[][] u1VarArr = new u1[length];
        int C = C(length, list, y10, zArr, u1VarArr) + length + list2.size();
        d1[] d1VarArr = new d1[C];
        a[] aVarArr = new a[C];
        m(list2, d1VarArr, aVarArr, n(vVar, list, y10, length, zArr, u1VarArr, d1VarArr, aVarArr));
        return Pair.create(new f1(d1VarArr), aVarArr);
    }

    private static z7.e u(List<z7.e> list) {
        return v(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static z7.e v(List<z7.e> list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            z7.e eVar = list.get(i10);
            if (str.equals(eVar.f32386a)) {
                return eVar;
            }
        }
        return null;
    }

    private static z7.e w(List<z7.e> list) {
        return v(list, "http://dashif.org/guidelines/trickmode");
    }

    private static u1[] x(List<z7.a> list, int[] iArr) {
        u1 G;
        Pattern pattern;
        for (int i10 : iArr) {
            z7.a aVar = list.get(i10);
            List<z7.e> list2 = list.get(i10).f32352d;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                z7.e eVar = list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f32386a)) {
                    G = new u1.b().g0("application/cea-608").U(aVar.f32349a + ":cea608").G();
                    pattern = J;
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f32386a)) {
                    G = new u1.b().g0("application/cea-708").U(aVar.f32349a + ":cea708").G();
                    pattern = K;
                }
                return F(eVar, pattern, G);
            }
        }
        return new u1[0];
    }

    private static int[][] y(List<z7.a> list) {
        int i10;
        z7.e u10;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i11 = 0; i11 < size; i11++) {
            sparseIntArray.put(list.get(i11).f32349a, i11);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i11));
            arrayList.add(arrayList2);
            sparseArray.put(i11, arrayList2);
        }
        for (int i12 = 0; i12 < size; i12++) {
            z7.a aVar = list.get(i12);
            z7.e w10 = w(aVar.f32353e);
            if (w10 == null) {
                w10 = w(aVar.f32354f);
            }
            if (w10 == null || (i10 = sparseIntArray.get(Integer.parseInt(w10.f32387b), -1)) == -1) {
                i10 = i12;
            }
            if (i10 == i12 && (u10 = u(aVar.f32354f)) != null) {
                for (String str : r0.R0(u10.f32387b, ",")) {
                    int i13 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i13 != -1) {
                        i10 = Math.min(i10, i13);
                    }
                }
            }
            if (i10 != i12) {
                List list2 = (List) sparseArray.get(i12);
                List list3 = (List) sparseArray.get(i10);
                list3.addAll(list2);
                sparseArray.put(i12, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i14 = 0; i14 < size2; i14++) {
            int[] l10 = hb.e.l((Collection) arrayList.get(i14));
            iArr[i14] = l10;
            Arrays.sort(l10);
        }
        return iArr;
    }

    private int z(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f8155v[i11].f8164e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f8155v[i14].f8162c == 0) {
                return i13;
            }
        }
        return -1;
    }

    @Override // v7.w0.a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void a(i<com.google.android.exoplayer2.source.dash.a> iVar) {
        this.C.a(this);
    }

    public void G() {
        this.f8157x.o();
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.D) {
            iVar.P(this);
        }
        this.C = null;
    }

    public void K(z7.c cVar, int i10) {
        this.G = cVar;
        this.H = i10;
        this.f8157x.q(cVar);
        i<com.google.android.exoplayer2.source.dash.a>[] iVarArr = this.D;
        if (iVarArr != null) {
            for (i<com.google.android.exoplayer2.source.dash.a> iVar : iVarArr) {
                iVar.D().e(cVar, i10);
            }
            this.C.a(this);
        }
        this.I = cVar.d(i10).f32397d;
        for (d dVar : this.E) {
            Iterator<f> it = this.I.iterator();
            while (true) {
                if (it.hasNext()) {
                    f next = it.next();
                    if (next.a().equals(dVar.b())) {
                        dVar.e(next, cVar.f32362d && i10 == cVar.e() - 1);
                    }
                }
            }
        }
    }

    @Override // v7.y, v7.w0
    public long b() {
        return this.F.b();
    }

    @Override // v7.y
    public long c(long j10, u3 u3Var) {
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.D) {
            if (iVar.f30612a == 2) {
                return iVar.c(j10, u3Var);
            }
        }
        return j10;
    }

    @Override // x7.i.b
    public synchronized void d(i<com.google.android.exoplayer2.source.dash.a> iVar) {
        e.c remove = this.f8158y.remove(iVar);
        if (remove != null) {
            remove.n();
        }
    }

    @Override // v7.y, v7.w0
    public boolean e(long j10) {
        return this.F.e(j10);
    }

    @Override // v7.y, v7.w0
    public long f() {
        return this.F.f();
    }

    @Override // v7.y, v7.w0
    public void g(long j10) {
        this.F.g(j10);
    }

    @Override // v7.y, v7.w0
    public boolean isLoading() {
        return this.F.isLoading();
    }

    @Override // v7.y
    public long j(long j10) {
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.D) {
            iVar.R(j10);
        }
        for (d dVar : this.E) {
            dVar.c(j10);
        }
        return j10;
    }

    @Override // v7.y
    public void k(y.a aVar, long j10) {
        this.C = aVar;
        aVar.h(this);
    }

    @Override // v7.y
    public long l() {
        return -9223372036854775807L;
    }

    @Override // v7.y
    public void o() {
        this.f8152s.a();
    }

    @Override // v7.y
    public f1 r() {
        return this.f8154u;
    }

    @Override // v7.y
    public void s(long j10, boolean z10) {
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.D) {
            iVar.s(j10, z10);
        }
    }

    @Override // v7.y
    public long t(r[] rVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j10) {
        int[] A = A(rVarArr);
        H(rVarArr, zArr, v0VarArr);
        I(rVarArr, v0VarArr, A);
        J(rVarArr, v0VarArr, zArr2, j10, A);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (v0 v0Var : v0VarArr) {
            if (v0Var instanceof i) {
                arrayList.add((i) v0Var);
            } else if (v0Var instanceof d) {
                arrayList2.add((d) v0Var);
            }
        }
        i<com.google.android.exoplayer2.source.dash.a>[] D = D(arrayList.size());
        this.D = D;
        arrayList.toArray(D);
        d[] dVarArr = new d[arrayList2.size()];
        this.E = dVarArr;
        arrayList2.toArray(dVarArr);
        this.F = this.f8156w.a(this.D);
        return j10;
    }
}
