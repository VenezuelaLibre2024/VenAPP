package p010a8;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import p010a8.C0058p;
import p026b8.C1678h;
import p026b8.InterfaceC1682l;
import p137hb.C7690e;
import p216l7.C9400a;
import p307q8.InterfaceC10312r;
import p351s8.InterfaceC10811b;
import p351s8.InterfaceC10816d0;
import p351s8.InterfaceC10834m0;
import p361t6.C11108u1;
import p361t6.C11110u3;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11178w;
import p376u6.C11391m3;
import p397v7.C11694d1;
import p397v7.C11700f1;
import p397v7.InterfaceC11705h0;
import p397v7.InterfaceC11707i;
import p397v7.InterfaceC11734v0;
import p397v7.InterfaceC11736w0;
import p397v7.InterfaceC11739y;
import p436x6.C12318m;
import p436x6.InterfaceC12329u;
import p436x6.InterfaceC12330v;

/* renamed from: a8.k */
/* loaded from: classes.dex */
public final class C0053k implements InterfaceC11739y, InterfaceC1682l.b {

    /* renamed from: A */
    private final C11391m3 f189A;

    /* renamed from: C */
    private InterfaceC11739y.a f191C;

    /* renamed from: D */
    private int f192D;

    /* renamed from: E */
    private C11700f1 f193E;

    /* renamed from: I */
    private int f197I;

    /* renamed from: J */
    private InterfaceC11736w0 f198J;

    /* renamed from: a */
    private final InterfaceC0050h f199a;

    /* renamed from: b */
    private final InterfaceC1682l f200b;

    /* renamed from: c */
    private final InterfaceC0049g f201c;

    /* renamed from: d */
    private final InterfaceC10834m0 f202d;

    /* renamed from: e */
    private final InterfaceC12330v f203e;

    /* renamed from: f */
    private final InterfaceC12329u.a f204f;

    /* renamed from: r */
    private final InterfaceC10816d0 f205r;

    /* renamed from: s */
    private final InterfaceC11705h0.a f206s;

    /* renamed from: t */
    private final InterfaceC10811b f207t;

    /* renamed from: w */
    private final InterfaceC11707i f210w;

    /* renamed from: x */
    private final boolean f211x;

    /* renamed from: y */
    private final int f212y;

    /* renamed from: z */
    private final boolean f213z;

    /* renamed from: B */
    private final C0058p.b f190B = new b();

    /* renamed from: u */
    private final IdentityHashMap<InterfaceC11734v0, Integer> f208u = new IdentityHashMap<>();

    /* renamed from: v */
    private final C0061s f209v = new C0061s();

    /* renamed from: F */
    private C0058p[] f194F = new C0058p[0];

    /* renamed from: G */
    private C0058p[] f195G = new C0058p[0];

    /* renamed from: H */
    private int[][] f196H = new int[0];

    /* renamed from: a8.k$b */
    /* loaded from: classes.dex */
    private class b implements C0058p.b {
        private b() {
        }

        @Override // p397v7.InterfaceC11736w0.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo258a(C0058p c0058p) {
            C0053k.this.f191C.mo258a(C0053k.this);
        }

        @Override // p010a8.C0058p.b
        /* renamed from: i */
        public void mo260i(Uri uri) {
            C0053k.this.f200b.mo9202f(uri);
        }

        @Override // p010a8.C0058p.b
        public void onPrepared() {
            if (C0053k.m231h(C0053k.this) > 0) {
                return;
            }
            int i10 = 0;
            for (C0058p c0058p : C0053k.this.f194F) {
                i10 += c0058p.m325r().f30692a;
            }
            C11694d1[] c11694d1Arr = new C11694d1[i10];
            int i11 = 0;
            for (C0058p c0058p2 : C0053k.this.f194F) {
                int i12 = c0058p2.m325r().f30692a;
                int i13 = 0;
                while (i13 < i12) {
                    c11694d1Arr[i11] = c0058p2.m325r().m36857c(i13);
                    i13++;
                    i11++;
                }
            }
            C0053k.this.f193E = new C11700f1(c11694d1Arr);
            C0053k.this.f191C.mo34427h(C0053k.this);
        }
    }

    public C0053k(InterfaceC0050h interfaceC0050h, InterfaceC1682l interfaceC1682l, InterfaceC0049g interfaceC0049g, InterfaceC10834m0 interfaceC10834m0, InterfaceC12330v interfaceC12330v, InterfaceC12329u.a aVar, InterfaceC10816d0 interfaceC10816d0, InterfaceC11705h0.a aVar2, InterfaceC10811b interfaceC10811b, InterfaceC11707i interfaceC11707i, boolean z10, int i10, boolean z11, C11391m3 c11391m3) {
        this.f199a = interfaceC0050h;
        this.f200b = interfaceC1682l;
        this.f201c = interfaceC0049g;
        this.f202d = interfaceC10834m0;
        this.f203e = interfaceC12330v;
        this.f204f = aVar;
        this.f205r = interfaceC10816d0;
        this.f206s = aVar2;
        this.f207t = interfaceC10811b;
        this.f210w = interfaceC11707i;
        this.f211x = z10;
        this.f212y = i10;
        this.f213z = z11;
        this.f189A = c11391m3;
        this.f198J = interfaceC11707i.mo36909a(new InterfaceC11736w0[0]);
    }

    /* renamed from: h */
    static /* synthetic */ int m231h(C0053k c0053k) {
        int i10 = c0053k.f192D - 1;
        c0053k.f192D = i10;
        return i10;
    }

    /* renamed from: q */
    private void m236q(long j10, List<C1678h.a> list, List<C0058p> list2, List<int[]> list3, Map<String, C12318m> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10).f7168d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (C11172r0.m34914c(str, list.get(i11).f7168d)) {
                        C1678h.a aVar = list.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f7165a);
                        arrayList2.add(aVar.f7166b);
                        z10 &= C11172r0.m34876K(aVar.f7166b.f28794t, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                C0058p m239w = m239w(str2, 1, (Uri[]) arrayList.toArray((Uri[]) C11172r0.m34930k(new Uri[0])), (C11108u1[]) arrayList2.toArray(new C11108u1[0]), null, Collections.emptyList(), map, j10);
                list3.add(C7690e.m23421l(arrayList3));
                list2.add(m239w);
                if (this.f211x && z10) {
                    m239w.m307c0(new C11694d1[]{new C11694d1(str2, (C11108u1[]) arrayList2.toArray(new C11108u1[0]))}, 0, new int[0]);
                }
            }
        }
    }

    /* renamed from: u */
    private void m237u(C1678h c1678h, long j10, List<C0058p> list, List<int[]> list2, Map<String, C12318m> map) {
        boolean z10;
        boolean z11;
        int size = c1678h.f7156e.size();
        int[] iArr = new int[size];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < c1678h.f7156e.size(); i12++) {
            C11108u1 c11108u1 = c1678h.f7156e.get(i12).f7170b;
            if (c11108u1.f28769C > 0 || C11172r0.m34878L(c11108u1.f28794t, 2) != null) {
                iArr[i12] = 2;
                i10++;
            } else if (C11172r0.m34878L(c11108u1.f28794t, 1) != null) {
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
        C11108u1[] c11108u1Arr = new C11108u1[size];
        int[] iArr2 = new int[size];
        int i13 = 0;
        for (int i14 = 0; i14 < c1678h.f7156e.size(); i14++) {
            if ((!z10 || iArr[i14] == 2) && (!z11 || iArr[i14] != 1)) {
                C1678h.b bVar = c1678h.f7156e.get(i14);
                uriArr[i13] = bVar.f7169a;
                c11108u1Arr[i13] = bVar.f7170b;
                iArr2[i13] = i14;
                i13++;
            }
        }
        String str = c11108u1Arr[0].f28794t;
        int m34876K = C11172r0.m34876K(str, 2);
        int m34876K2 = C11172r0.m34876K(str, 1);
        boolean z12 = (m34876K2 == 1 || (m34876K2 == 0 && c1678h.f7158g.isEmpty())) && m34876K <= 1 && m34876K2 + m34876K > 0;
        C0058p m239w = m239w("main", (z10 || m34876K2 <= 0) ? 0 : 1, uriArr, c11108u1Arr, c1678h.f7161j, c1678h.f7162k, map, j10);
        list.add(m239w);
        list2.add(iArr2);
        if (this.f211x && z12) {
            ArrayList arrayList = new ArrayList();
            if (m34876K > 0) {
                C11108u1[] c11108u1Arr2 = new C11108u1[size];
                for (int i15 = 0; i15 < size; i15++) {
                    c11108u1Arr2[i15] = m242z(c11108u1Arr[i15]);
                }
                arrayList.add(new C11694d1("main", c11108u1Arr2));
                if (m34876K2 > 0 && (c1678h.f7161j != null || c1678h.f7158g.isEmpty())) {
                    arrayList.add(new C11694d1("main:audio", m240x(c11108u1Arr[0], c1678h.f7161j, false)));
                }
                List<C11108u1> list3 = c1678h.f7162k;
                if (list3 != null) {
                    for (int i16 = 0; i16 < list3.size(); i16++) {
                        arrayList.add(new C11694d1("main:cc:" + i16, list3.get(i16)));
                    }
                }
            } else {
                C11108u1[] c11108u1Arr3 = new C11108u1[size];
                for (int i17 = 0; i17 < size; i17++) {
                    c11108u1Arr3[i17] = m240x(c11108u1Arr[i17], c1678h.f7161j, true);
                }
                arrayList.add(new C11694d1("main", c11108u1Arr3));
            }
            C11694d1 c11694d1 = new C11694d1("main:id3", new C11108u1.b().m34540U("ID3").m34552g0("application/id3").m34526G());
            arrayList.add(c11694d1);
            m239w.m307c0((C11694d1[]) arrayList.toArray(new C11694d1[0]), 0, arrayList.indexOf(c11694d1));
        }
    }

    /* renamed from: v */
    private void m238v(long j10) {
        C1678h c1678h = (C1678h) C11137a.m34603e(this.f200b.mo9201e());
        Map<String, C12318m> m241y = this.f213z ? m241y(c1678h.f7164m) : Collections.emptyMap();
        boolean z10 = !c1678h.f7156e.isEmpty();
        List<C1678h.a> list = c1678h.f7158g;
        List<C1678h.a> list2 = c1678h.f7159h;
        this.f192D = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z10) {
            m237u(c1678h, j10, arrayList, arrayList2, m241y);
        }
        m236q(j10, list, arrayList, arrayList2, m241y);
        this.f197I = arrayList.size();
        int i10 = 0;
        while (i10 < list2.size()) {
            C1678h.a aVar = list2.get(i10);
            String str = "subtitle:" + i10 + ":" + aVar.f7168d;
            ArrayList arrayList3 = arrayList2;
            int i11 = i10;
            C0058p m239w = m239w(str, 3, new Uri[]{aVar.f7165a}, new C11108u1[]{aVar.f7166b}, null, Collections.emptyList(), m241y, j10);
            arrayList3.add(new int[]{i11});
            arrayList.add(m239w);
            m239w.m307c0(new C11694d1[]{new C11694d1(str, aVar.f7166b)}, 0, new int[0]);
            i10 = i11 + 1;
            arrayList2 = arrayList3;
        }
        this.f194F = (C0058p[]) arrayList.toArray(new C0058p[0]);
        this.f196H = (int[][]) arrayList2.toArray(new int[0]);
        this.f192D = this.f194F.length;
        for (int i12 = 0; i12 < this.f197I; i12++) {
            this.f194F[i12].m316l0(true);
        }
        for (C0058p c0058p : this.f194F) {
            c0058p.m294A();
        }
        this.f195G = this.f194F;
    }

    /* renamed from: w */
    private C0058p m239w(String str, int i10, Uri[] uriArr, C11108u1[] c11108u1Arr, C11108u1 c11108u1, List<C11108u1> list, Map<String, C12318m> map, long j10) {
        return new C0058p(str, i10, this.f190B, new C0048f(this.f199a, this.f200b, uriArr, c11108u1Arr, this.f201c, this.f202d, this.f209v, list, this.f189A), map, this.f207t, j10, c11108u1, this.f203e, this.f204f, this.f205r, this.f206s, this.f212y);
    }

    /* renamed from: x */
    private static C11108u1 m240x(C11108u1 c11108u1, C11108u1 c11108u12, boolean z10) {
        String m34878L;
        C9400a c9400a;
        int i10;
        String str;
        int i11;
        int i12;
        String str2;
        if (c11108u12 != null) {
            m34878L = c11108u12.f28794t;
            c9400a = c11108u12.f28795u;
            i11 = c11108u12.f28776J;
            i10 = c11108u12.f28789d;
            i12 = c11108u12.f28790e;
            str = c11108u12.f28788c;
            str2 = c11108u12.f28787b;
        } else {
            m34878L = C11172r0.m34878L(c11108u1.f28794t, 1);
            c9400a = c11108u1.f28795u;
            if (z10) {
                i11 = c11108u1.f28776J;
                i10 = c11108u1.f28789d;
                i12 = c11108u1.f28790e;
                str = c11108u1.f28788c;
                str2 = c11108u1.f28787b;
            } else {
                i10 = 0;
                str = null;
                i11 = -1;
                i12 = 0;
                str2 = null;
            }
        }
        return new C11108u1.b().m34540U(c11108u1.f28786a).m34542W(str2).m34532M(c11108u1.f28796v).m34552g0(C11178w.m34999g(m34878L)).m34530K(m34878L).m34545Z(c9400a).m34528I(z10 ? c11108u1.f28791f : -1).m34547b0(z10 ? c11108u1.f28792r : -1).m34529J(i11).m34554i0(i10).m34550e0(i12).m34543X(str).m34526G();
    }

    /* renamed from: y */
    private static Map<String, C12318m> m241y(List<C12318m> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            C12318m c12318m = list.get(i10);
            String str = c12318m.f33051c;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                C12318m c12318m2 = (C12318m) arrayList.get(i11);
                if (TextUtils.equals(c12318m2.f33051c, str)) {
                    c12318m = c12318m.m39841f(c12318m2);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            hashMap.put(str, c12318m);
        }
        return hashMap;
    }

    /* renamed from: z */
    private static C11108u1 m242z(C11108u1 c11108u1) {
        String m34878L = C11172r0.m34878L(c11108u1.f28794t, 2);
        return new C11108u1.b().m34540U(c11108u1.f28786a).m34542W(c11108u1.f28787b).m34532M(c11108u1.f28796v).m34552g0(C11178w.m34999g(m34878L)).m34530K(m34878L).m34545Z(c11108u1.f28795u).m34528I(c11108u1.f28791f).m34547b0(c11108u1.f28792r).m34559n0(c11108u1.f28768B).m34538S(c11108u1.f28769C).m34537R(c11108u1.f28770D).m34554i0(c11108u1.f28789d).m34550e0(c11108u1.f28790e).m34526G();
    }

    /* renamed from: A */
    public void m243A() {
        this.f200b.mo9207n(this);
        for (C0058p c0058p : this.f194F) {
            c0058p.m310e0();
        }
        this.f191C = null;
    }

    @Override // p026b8.InterfaceC1682l.b
    /* renamed from: a */
    public boolean mo244a(Uri uri, InterfaceC10816d0.c cVar, boolean z10) {
        boolean z11 = true;
        for (C0058p c0058p : this.f194F) {
            z11 &= c0058p.m303Z(uri, cVar, z10);
        }
        this.f191C.mo258a(this);
        return z11;
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: b */
    public long mo245b() {
        return this.f198J.mo245b();
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: c */
    public long mo246c(long j10, C11110u3 c11110u3) {
        for (C0058p c0058p : this.f195G) {
            if (c0058p.m296Q()) {
                return c0058p.m306c(j10, c11110u3);
            }
        }
        return j10;
    }

    @Override // p026b8.InterfaceC1682l.b
    /* renamed from: d */
    public void mo247d() {
        for (C0058p c0058p : this.f194F) {
            c0058p.m305a0();
        }
        this.f191C.mo258a(this);
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: e */
    public boolean mo248e(long j10) {
        if (this.f193E != null) {
            return this.f198J.mo248e(j10);
        }
        for (C0058p c0058p : this.f194F) {
            c0058p.m294A();
        }
        return false;
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: f */
    public long mo249f() {
        return this.f198J.mo249f();
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: g */
    public void mo250g(long j10) {
        this.f198J.mo250g(j10);
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    public boolean isLoading() {
        return this.f198J.isLoading();
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: j */
    public long mo251j(long j10) {
        C0058p[] c0058pArr = this.f195G;
        if (c0058pArr.length > 0) {
            boolean m312h0 = c0058pArr[0].m312h0(j10, false);
            int i10 = 1;
            while (true) {
                C0058p[] c0058pArr2 = this.f195G;
                if (i10 >= c0058pArr2.length) {
                    break;
                }
                c0058pArr2[i10].m312h0(j10, m312h0);
                i10++;
            }
            if (m312h0) {
                this.f209v.m344b();
            }
        }
        return j10;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: k */
    public void mo252k(InterfaceC11739y.a aVar, long j10) {
        this.f191C = aVar;
        this.f200b.mo9197a(this);
        m238v(j10);
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: l */
    public long mo253l() {
        return -9223372036854775807L;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: o */
    public void mo254o() {
        for (C0058p c0058p : this.f194F) {
            c0058p.m321o();
        }
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: r */
    public C11700f1 mo255r() {
        return (C11700f1) C11137a.m34603e(this.f193E);
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: s */
    public void mo256s(long j10, boolean z10) {
        for (C0058p c0058p : this.f195G) {
            c0058p.m326s(j10, z10);
        }
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: t */
    public long mo257t(InterfaceC10312r[] interfaceC10312rArr, boolean[] zArr, InterfaceC11734v0[] interfaceC11734v0Arr, boolean[] zArr2, long j10) {
        InterfaceC11734v0[] interfaceC11734v0Arr2 = interfaceC11734v0Arr;
        int[] iArr = new int[interfaceC10312rArr.length];
        int[] iArr2 = new int[interfaceC10312rArr.length];
        for (int i10 = 0; i10 < interfaceC10312rArr.length; i10++) {
            InterfaceC11734v0 interfaceC11734v0 = interfaceC11734v0Arr2[i10];
            iArr[i10] = interfaceC11734v0 == null ? -1 : this.f208u.get(interfaceC11734v0).intValue();
            iArr2[i10] = -1;
            InterfaceC10312r interfaceC10312r = interfaceC10312rArr[i10];
            if (interfaceC10312r != null) {
                C11694d1 mo30884d = interfaceC10312r.mo30884d();
                int i11 = 0;
                while (true) {
                    C0058p[] c0058pArr = this.f194F;
                    if (i11 >= c0058pArr.length) {
                        break;
                    }
                    if (c0058pArr[i11].m325r().m36858d(mo30884d) != -1) {
                        iArr2[i10] = i11;
                        break;
                    }
                    i11++;
                }
            }
        }
        this.f208u.clear();
        int length = interfaceC10312rArr.length;
        InterfaceC11734v0[] interfaceC11734v0Arr3 = new InterfaceC11734v0[length];
        InterfaceC11734v0[] interfaceC11734v0Arr4 = new InterfaceC11734v0[interfaceC10312rArr.length];
        InterfaceC10312r[] interfaceC10312rArr2 = new InterfaceC10312r[interfaceC10312rArr.length];
        C0058p[] c0058pArr2 = new C0058p[this.f194F.length];
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        while (i13 < this.f194F.length) {
            for (int i14 = 0; i14 < interfaceC10312rArr.length; i14++) {
                InterfaceC10312r interfaceC10312r2 = null;
                interfaceC11734v0Arr4[i14] = iArr[i14] == i13 ? interfaceC11734v0Arr2[i14] : null;
                if (iArr2[i14] == i13) {
                    interfaceC10312r2 = interfaceC10312rArr[i14];
                }
                interfaceC10312rArr2[i14] = interfaceC10312r2;
            }
            C0058p c0058p = this.f194F[i13];
            int i15 = i12;
            int i16 = length;
            int i17 = i13;
            InterfaceC10312r[] interfaceC10312rArr3 = interfaceC10312rArr2;
            C0058p[] c0058pArr3 = c0058pArr2;
            boolean m314i0 = c0058p.m314i0(interfaceC10312rArr2, zArr, interfaceC11734v0Arr4, zArr2, j10, z10);
            int i18 = 0;
            boolean z11 = false;
            while (true) {
                if (i18 >= interfaceC10312rArr.length) {
                    break;
                }
                InterfaceC11734v0 interfaceC11734v02 = interfaceC11734v0Arr4[i18];
                if (iArr2[i18] == i17) {
                    C11137a.m34603e(interfaceC11734v02);
                    interfaceC11734v0Arr3[i18] = interfaceC11734v02;
                    this.f208u.put(interfaceC11734v02, Integer.valueOf(i17));
                    z11 = true;
                } else if (iArr[i18] == i17) {
                    C11137a.m34605g(interfaceC11734v02 == null);
                }
                i18++;
            }
            if (z11) {
                c0058pArr3[i15] = c0058p;
                i12 = i15 + 1;
                if (i15 == 0) {
                    c0058p.m316l0(true);
                    if (!m314i0) {
                        C0058p[] c0058pArr4 = this.f195G;
                        if (c0058pArr4.length != 0 && c0058p == c0058pArr4[0]) {
                        }
                    }
                    this.f209v.m344b();
                    z10 = true;
                } else {
                    c0058p.m316l0(i17 < this.f197I);
                }
            } else {
                i12 = i15;
            }
            i13 = i17 + 1;
            interfaceC11734v0Arr2 = interfaceC11734v0Arr;
            c0058pArr2 = c0058pArr3;
            length = i16;
            interfaceC10312rArr2 = interfaceC10312rArr3;
        }
        System.arraycopy(interfaceC11734v0Arr3, 0, interfaceC11734v0Arr2, 0, length);
        C0058p[] c0058pArr5 = (C0058p[]) C11172r0.m34871H0(c0058pArr2, i12);
        this.f195G = c0058pArr5;
        this.f198J = this.f210w.mo36909a(c0058pArr5);
        return j10;
    }
}
