package a8;

import a8.p;
import android.net.Uri;
import android.text.TextUtils;
import b8.h;
import b8.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import s8.d0;
import s8.m0;
import t6.u1;
import t6.u3;
import t8.r0;
import t8.w;
import u6.m3;
import v7.d1;
import v7.f1;
import v7.h0;
import v7.v0;
import v7.w0;
import v7.y;
import x6.u;
import x6.v;

/* loaded from: classes.dex */
public final class k implements y, l.b {
    private final m3 A;
    private y.a C;
    private int D;
    private f1 E;
    private int I;
    private w0 J;

    /* renamed from: a, reason: collision with root package name */
    private final h f176a;

    /* renamed from: b, reason: collision with root package name */
    private final b8.l f177b;

    /* renamed from: c, reason: collision with root package name */
    private final g f178c;

    /* renamed from: d, reason: collision with root package name */
    private final m0 f179d;

    /* renamed from: e, reason: collision with root package name */
    private final v f180e;

    /* renamed from: f, reason: collision with root package name */
    private final u.a f181f;

    /* renamed from: r, reason: collision with root package name */
    private final d0 f182r;

    /* renamed from: s, reason: collision with root package name */
    private final h0.a f183s;

    /* renamed from: t, reason: collision with root package name */
    private final s8.b f184t;

    /* renamed from: w, reason: collision with root package name */
    private final v7.i f187w;

    /* renamed from: x, reason: collision with root package name */
    private final boolean f188x;

    /* renamed from: y, reason: collision with root package name */
    private final int f189y;

    /* renamed from: z, reason: collision with root package name */
    private final boolean f190z;
    private final p.b B = new b();

    /* renamed from: u, reason: collision with root package name */
    private final IdentityHashMap<v0, Integer> f185u = new IdentityHashMap<>();

    /* renamed from: v, reason: collision with root package name */
    private final s f186v = new s();
    private p[] F = new p[0];
    private p[] G = new p[0];
    private int[][] H = new int[0];

    /* loaded from: classes.dex */
    private class b implements p.b {
        private b() {
        }

        @Override // v7.w0.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p pVar) {
            k.this.C.a(k.this);
        }

        @Override // a8.p.b
        public void i(Uri uri) {
            k.this.f177b.f(uri);
        }

        @Override // a8.p.b
        public void onPrepared() {
            if (k.h(k.this) > 0) {
                return;
            }
            int i10 = 0;
            for (p pVar : k.this.F) {
                i10 += pVar.r().f28314a;
            }
            d1[] d1VarArr = new d1[i10];
            int i11 = 0;
            for (p pVar2 : k.this.F) {
                int i12 = pVar2.r().f28314a;
                int i13 = 0;
                while (i13 < i12) {
                    d1VarArr[i11] = pVar2.r().c(i13);
                    i13++;
                    i11++;
                }
            }
            k.this.E = new f1(d1VarArr);
            k.this.C.h(k.this);
        }
    }

    public k(h hVar, b8.l lVar, g gVar, m0 m0Var, v vVar, u.a aVar, d0 d0Var, h0.a aVar2, s8.b bVar, v7.i iVar, boolean z10, int i10, boolean z11, m3 m3Var) {
        this.f176a = hVar;
        this.f177b = lVar;
        this.f178c = gVar;
        this.f179d = m0Var;
        this.f180e = vVar;
        this.f181f = aVar;
        this.f182r = d0Var;
        this.f183s = aVar2;
        this.f184t = bVar;
        this.f187w = iVar;
        this.f188x = z10;
        this.f189y = i10;
        this.f190z = z11;
        this.A = m3Var;
        this.J = iVar.a(new w0[0]);
    }

    static /* synthetic */ int h(k kVar) {
        int i10 = kVar.D - 1;
        kVar.D = i10;
        return i10;
    }

    private void q(long j10, List<h.a> list, List<p> list2, List<int[]> list3, Map<String, x6.m> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10).f6272d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (r0.c(str, list.get(i11).f6272d)) {
                        h.a aVar = list.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f6269a);
                        arrayList2.add(aVar.f6270b);
                        z10 &= r0.K(aVar.f6270b.f26514t, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                p w10 = w(str2, 1, (Uri[]) arrayList.toArray((Uri[]) r0.k(new Uri[0])), (u1[]) arrayList2.toArray(new u1[0]), null, Collections.emptyList(), map, j10);
                list3.add(hb.e.l(arrayList3));
                list2.add(w10);
                if (this.f188x && z10) {
                    w10.c0(new d1[]{new d1(str2, (u1[]) arrayList2.toArray(new u1[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private void u(b8.h hVar, long j10, List<p> list, List<int[]> list2, Map<String, x6.m> map) {
        boolean z10;
        boolean z11;
        int size = hVar.f6260e.size();
        int[] iArr = new int[size];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < hVar.f6260e.size(); i12++) {
            u1 u1Var = hVar.f6260e.get(i12).f6274b;
            if (u1Var.C > 0 || r0.L(u1Var.f26514t, 2) != null) {
                iArr[i12] = 2;
                i10++;
            } else if (r0.L(u1Var.f26514t, 1) != null) {
                iArr[i12] = 1;
                i11++;
            } else {
                iArr[i12] = -1;
            }
        }
        if (i10 > 0) {
            size = i10;
            z10 = true;
            z11 = false;
        } else if (i11 < size) {
            size -= i11;
            z10 = false;
            z11 = true;
        } else {
            z10 = false;
            z11 = false;
        }
        Uri[] uriArr = new Uri[size];
        u1[] u1VarArr = new u1[size];
        int[] iArr2 = new int[size];
        int i13 = 0;
        for (int i14 = 0; i14 < hVar.f6260e.size(); i14++) {
            if ((!z10 || iArr[i14] == 2) && (!z11 || iArr[i14] != 1)) {
                h.b bVar = hVar.f6260e.get(i14);
                uriArr[i13] = bVar.f6273a;
                u1VarArr[i13] = bVar.f6274b;
                iArr2[i13] = i14;
                i13++;
            }
        }
        String str = u1VarArr[0].f26514t;
        int K = r0.K(str, 2);
        int K2 = r0.K(str, 1);
        boolean z12 = (K2 == 1 || (K2 == 0 && hVar.f6262g.isEmpty())) && K <= 1 && K2 + K > 0;
        p w10 = w("main", (z10 || K2 <= 0) ? 0 : 1, uriArr, u1VarArr, hVar.f6265j, hVar.f6266k, map, j10);
        list.add(w10);
        list2.add(iArr2);
        if (this.f188x && z12) {
            ArrayList arrayList = new ArrayList();
            if (K > 0) {
                u1[] u1VarArr2 = new u1[size];
                for (int i15 = 0; i15 < size; i15++) {
                    u1VarArr2[i15] = z(u1VarArr[i15]);
                }
                arrayList.add(new d1("main", u1VarArr2));
                if (K2 > 0 && (hVar.f6265j != null || hVar.f6262g.isEmpty())) {
                    arrayList.add(new d1("main:audio", x(u1VarArr[0], hVar.f6265j, false)));
                }
                List<u1> list3 = hVar.f6266k;
                if (list3 != null) {
                    for (int i16 = 0; i16 < list3.size(); i16++) {
                        arrayList.add(new d1("main:cc:" + i16, list3.get(i16)));
                    }
                }
            } else {
                u1[] u1VarArr3 = new u1[size];
                for (int i17 = 0; i17 < size; i17++) {
                    u1VarArr3[i17] = x(u1VarArr[i17], hVar.f6265j, true);
                }
                arrayList.add(new d1("main", u1VarArr3));
            }
            d1 d1Var = new d1("main:id3", new u1.b().U("ID3").g0("application/id3").G());
            arrayList.add(d1Var);
            w10.c0((d1[]) arrayList.toArray(new d1[0]), 0, arrayList.indexOf(d1Var));
        }
    }

    private void v(long j10) {
        b8.h hVar = (b8.h) t8.a.e(this.f177b.e());
        Map<String, x6.m> y10 = this.f190z ? y(hVar.f6268m) : Collections.emptyMap();
        boolean z10 = !hVar.f6260e.isEmpty();
        List<h.a> list = hVar.f6262g;
        List<h.a> list2 = hVar.f6263h;
        this.D = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z10) {
            u(hVar, j10, arrayList, arrayList2, y10);
        }
        q(j10, list, arrayList, arrayList2, y10);
        this.I = arrayList.size();
        int i10 = 0;
        while (i10 < list2.size()) {
            h.a aVar = list2.get(i10);
            String str = "subtitle:" + i10 + ":" + aVar.f6272d;
            ArrayList arrayList3 = arrayList2;
            int i11 = i10;
            p w10 = w(str, 3, new Uri[]{aVar.f6269a}, new u1[]{aVar.f6270b}, null, Collections.emptyList(), y10, j10);
            arrayList3.add(new int[]{i11});
            arrayList.add(w10);
            w10.c0(new d1[]{new d1(str, aVar.f6270b)}, 0, new int[0]);
            i10 = i11 + 1;
            arrayList2 = arrayList3;
        }
        this.F = (p[]) arrayList.toArray(new p[0]);
        this.H = (int[][]) arrayList2.toArray(new int[0]);
        this.D = this.F.length;
        for (int i12 = 0; i12 < this.I; i12++) {
            this.F[i12].l0(true);
        }
        for (p pVar : this.F) {
            pVar.A();
        }
        this.G = this.F;
    }

    private p w(String str, int i10, Uri[] uriArr, u1[] u1VarArr, u1 u1Var, List<u1> list, Map<String, x6.m> map, long j10) {
        return new p(str, i10, this.B, new f(this.f176a, this.f177b, uriArr, u1VarArr, this.f178c, this.f179d, this.f186v, list, this.A), map, this.f184t, j10, u1Var, this.f180e, this.f181f, this.f182r, this.f183s, this.f189y);
    }

    private static u1 x(u1 u1Var, u1 u1Var2, boolean z10) {
        String L;
        l7.a aVar;
        int i10;
        String str;
        int i11;
        int i12;
        String str2;
        if (u1Var2 != null) {
            L = u1Var2.f26514t;
            aVar = u1Var2.f26515u;
            i11 = u1Var2.J;
            i10 = u1Var2.f26509d;
            i12 = u1Var2.f26510e;
            str = u1Var2.f26508c;
            str2 = u1Var2.f26507b;
        } else {
            L = r0.L(u1Var.f26514t, 1);
            aVar = u1Var.f26515u;
            if (z10) {
                i11 = u1Var.J;
                i10 = u1Var.f26509d;
                i12 = u1Var.f26510e;
                str = u1Var.f26508c;
                str2 = u1Var.f26507b;
            } else {
                i10 = 0;
                str = null;
                i11 = -1;
                i12 = 0;
                str2 = null;
            }
        }
        return new u1.b().U(u1Var.f26506a).W(str2).M(u1Var.f26516v).g0(w.g(L)).K(L).Z(aVar).I(z10 ? u1Var.f26511f : -1).b0(z10 ? u1Var.f26512r : -1).J(i11).i0(i10).e0(i12).X(str).G();
    }

    private static Map<String, x6.m> y(List<x6.m> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            x6.m mVar = list.get(i10);
            String str = mVar.f30539c;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                x6.m mVar2 = (x6.m) arrayList.get(i11);
                if (TextUtils.equals(mVar2.f30539c, str)) {
                    mVar = mVar.f(mVar2);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            hashMap.put(str, mVar);
        }
        return hashMap;
    }

    private static u1 z(u1 u1Var) {
        String L = r0.L(u1Var.f26514t, 2);
        return new u1.b().U(u1Var.f26506a).W(u1Var.f26507b).M(u1Var.f26516v).g0(w.g(L)).K(L).Z(u1Var.f26515u).I(u1Var.f26511f).b0(u1Var.f26512r).n0(u1Var.B).S(u1Var.C).R(u1Var.D).i0(u1Var.f26509d).e0(u1Var.f26510e).G();
    }

    public void A() {
        this.f177b.n(this);
        for (p pVar : this.F) {
            pVar.e0();
        }
        this.C = null;
    }

    @Override // b8.l.b
    public boolean a(Uri uri, d0.c cVar, boolean z10) {
        boolean z11 = true;
        for (p pVar : this.F) {
            z11 &= pVar.Z(uri, cVar, z10);
        }
        this.C.a(this);
        return z11;
    }

    @Override // v7.y, v7.w0
    public long b() {
        return this.J.b();
    }

    @Override // v7.y
    public long c(long j10, u3 u3Var) {
        for (p pVar : this.G) {
            if (pVar.Q()) {
                return pVar.c(j10, u3Var);
            }
        }
        return j10;
    }

    @Override // b8.l.b
    public void d() {
        for (p pVar : this.F) {
            pVar.a0();
        }
        this.C.a(this);
    }

    @Override // v7.y, v7.w0
    public boolean e(long j10) {
        if (this.E != null) {
            return this.J.e(j10);
        }
        for (p pVar : this.F) {
            pVar.A();
        }
        return false;
    }

    @Override // v7.y, v7.w0
    public long f() {
        return this.J.f();
    }

    @Override // v7.y, v7.w0
    public void g(long j10) {
        this.J.g(j10);
    }

    @Override // v7.y, v7.w0
    public boolean isLoading() {
        return this.J.isLoading();
    }

    @Override // v7.y
    public long j(long j10) {
        p[] pVarArr = this.G;
        if (pVarArr.length > 0) {
            boolean h02 = pVarArr[0].h0(j10, false);
            int i10 = 1;
            while (true) {
                p[] pVarArr2 = this.G;
                if (i10 >= pVarArr2.length) {
                    break;
                }
                pVarArr2[i10].h0(j10, h02);
                i10++;
            }
            if (h02) {
                this.f186v.b();
            }
        }
        return j10;
    }

    @Override // v7.y
    public void k(y.a aVar, long j10) {
        this.C = aVar;
        this.f177b.a(this);
        v(j10);
    }

    @Override // v7.y
    public long l() {
        return -9223372036854775807L;
    }

    @Override // v7.y
    public void o() {
        for (p pVar : this.F) {
            pVar.o();
        }
    }

    @Override // v7.y
    public f1 r() {
        return (f1) t8.a.e(this.E);
    }

    @Override // v7.y
    public void s(long j10, boolean z10) {
        for (p pVar : this.G) {
            pVar.s(j10, z10);
        }
    }

    @Override // v7.y
    public long t(q8.r[] rVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j10) {
        v0[] v0VarArr2 = v0VarArr;
        int[] iArr = new int[rVarArr.length];
        int[] iArr2 = new int[rVarArr.length];
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            v0 v0Var = v0VarArr2[i10];
            iArr[i10] = v0Var == null ? -1 : this.f185u.get(v0Var).intValue();
            iArr2[i10] = -1;
            q8.r rVar = rVarArr[i10];
            if (rVar != null) {
                d1 d10 = rVar.d();
                int i11 = 0;
                while (true) {
                    p[] pVarArr = this.F;
                    if (i11 >= pVarArr.length) {
                        break;
                    }
                    if (pVarArr[i11].r().d(d10) != -1) {
                        iArr2[i10] = i11;
                        break;
                    }
                    i11++;
                }
            }
        }
        this.f185u.clear();
        int length = rVarArr.length;
        v0[] v0VarArr3 = new v0[length];
        v0[] v0VarArr4 = new v0[rVarArr.length];
        q8.r[] rVarArr2 = new q8.r[rVarArr.length];
        p[] pVarArr2 = new p[this.F.length];
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        while (i13 < this.F.length) {
            for (int i14 = 0; i14 < rVarArr.length; i14++) {
                q8.r rVar2 = null;
                v0VarArr4[i14] = iArr[i14] == i13 ? v0VarArr2[i14] : null;
                if (iArr2[i14] == i13) {
                    rVar2 = rVarArr[i14];
                }
                rVarArr2[i14] = rVar2;
            }
            p pVar = this.F[i13];
            int i15 = i12;
            int i16 = length;
            int i17 = i13;
            q8.r[] rVarArr3 = rVarArr2;
            p[] pVarArr3 = pVarArr2;
            boolean i02 = pVar.i0(rVarArr2, zArr, v0VarArr4, zArr2, j10, z10);
            int i18 = 0;
            boolean z11 = false;
            while (true) {
                if (i18 >= rVarArr.length) {
                    break;
                }
                v0 v0Var2 = v0VarArr4[i18];
                if (iArr2[i18] == i17) {
                    t8.a.e(v0Var2);
                    v0VarArr3[i18] = v0Var2;
                    this.f185u.put(v0Var2, Integer.valueOf(i17));
                    z11 = true;
                } else if (iArr[i18] == i17) {
                    t8.a.g(v0Var2 == null);
                }
                i18++;
            }
            if (z11) {
                pVarArr3[i15] = pVar;
                i12 = i15 + 1;
                if (i15 == 0) {
                    pVar.l0(true);
                    if (!i02) {
                        p[] pVarArr4 = this.G;
                        if (pVarArr4.length != 0 && pVar == pVarArr4[0]) {
                        }
                    }
                    this.f186v.b();
                    z10 = true;
                } else {
                    pVar.l0(i17 < this.I);
                }
            } else {
                i12 = i15;
            }
            i13 = i17 + 1;
            v0VarArr2 = v0VarArr;
            pVarArr2 = pVarArr3;
            length = i16;
            rVarArr2 = rVarArr3;
        }
        System.arraycopy(v0VarArr3, 0, v0VarArr2, 0, length);
        p[] pVarArr5 = (p[]) r0.H0(pVarArr2, i12);
        this.G = pVarArr5;
        this.J = this.f187w.a(pVarArr5);
        return j10;
    }
}
