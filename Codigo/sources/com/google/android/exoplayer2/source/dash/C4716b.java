package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.source.dash.C4719e;
import com.google.android.exoplayer2.source.dash.InterfaceC4715a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p137hb.C7690e;
import p307q8.InterfaceC10312r;
import p351s8.InterfaceC10811b;
import p351s8.InterfaceC10816d0;
import p351s8.InterfaceC10820f0;
import p351s8.InterfaceC10834m0;
import p361t6.C11108u1;
import p361t6.C11110u3;
import p363t8.C11172r0;
import p376u6.C11391m3;
import p397v7.C11694d1;
import p397v7.C11700f1;
import p397v7.C11725r;
import p397v7.InterfaceC11705h0;
import p397v7.InterfaceC11707i;
import p397v7.InterfaceC11734v0;
import p397v7.InterfaceC11736w0;
import p397v7.InterfaceC11739y;
import p436x6.InterfaceC12329u;
import p436x6.InterfaceC12330v;
import p437x7.C12343i;
import p460y7.C12638b;
import p482z7.AbstractC12818j;
import p482z7.C12809a;
import p482z7.C12811c;
import p482z7.C12813e;
import p482z7.C12814f;
import p482z7.C12815g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.source.dash.b */
/* loaded from: classes.dex */
public final class C4716b implements InterfaceC11739y, InterfaceC11736w0.a<C12343i<InterfaceC4715a>>, C12343i.b<InterfaceC4715a> {

    /* renamed from: J */
    private static final Pattern f9170J = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: K */
    private static final Pattern f9171K = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: A */
    private final InterfaceC12329u.a f9172A;

    /* renamed from: B */
    private final C11391m3 f9173B;

    /* renamed from: C */
    private InterfaceC11739y.a f9174C;

    /* renamed from: F */
    private InterfaceC11736w0 f9177F;

    /* renamed from: G */
    private C12811c f9178G;

    /* renamed from: H */
    private int f9179H;

    /* renamed from: I */
    private List<C12814f> f9180I;

    /* renamed from: a */
    final int f9181a;

    /* renamed from: b */
    private final InterfaceC4715a.a f9182b;

    /* renamed from: c */
    private final InterfaceC10834m0 f9183c;

    /* renamed from: d */
    private final InterfaceC12330v f9184d;

    /* renamed from: e */
    private final InterfaceC10816d0 f9185e;

    /* renamed from: f */
    private final C12638b f9186f;

    /* renamed from: r */
    private final long f9187r;

    /* renamed from: s */
    private final InterfaceC10820f0 f9188s;

    /* renamed from: t */
    private final InterfaceC10811b f9189t;

    /* renamed from: u */
    private final C11700f1 f9190u;

    /* renamed from: v */
    private final a[] f9191v;

    /* renamed from: w */
    private final InterfaceC11707i f9192w;

    /* renamed from: x */
    private final C4719e f9193x;

    /* renamed from: z */
    private final InterfaceC11705h0.a f9195z;

    /* renamed from: D */
    private C12343i<InterfaceC4715a>[] f9175D = m11880D(0);

    /* renamed from: E */
    private C4718d[] f9176E = new C4718d[0];

    /* renamed from: y */
    private final IdentityHashMap<C12343i<InterfaceC4715a>, C4719e.c> f9194y = new IdentityHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.dash.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int[] f9196a;

        /* renamed from: b */
        public final int f9197b;

        /* renamed from: c */
        public final int f9198c;

        /* renamed from: d */
        public final int f9199d;

        /* renamed from: e */
        public final int f9200e;

        /* renamed from: f */
        public final int f9201f;

        /* renamed from: g */
        public final int f9202g;

        private a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15) {
            this.f9197b = i10;
            this.f9196a = iArr;
            this.f9198c = i11;
            this.f9200e = i12;
            this.f9201f = i13;
            this.f9202g = i14;
            this.f9199d = i15;
        }

        /* renamed from: a */
        public static a m11899a(int[] iArr, int i10) {
            return new a(3, 1, iArr, i10, -1, -1, -1);
        }

        /* renamed from: b */
        public static a m11900b(int[] iArr, int i10) {
            return new a(5, 1, iArr, i10, -1, -1, -1);
        }

        /* renamed from: c */
        public static a m11901c(int i10) {
            return new a(5, 2, new int[0], -1, -1, -1, i10);
        }

        /* renamed from: d */
        public static a m11902d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1);
        }
    }

    public C4716b(int i10, C12811c c12811c, C12638b c12638b, int i11, InterfaceC4715a.a aVar, InterfaceC10834m0 interfaceC10834m0, InterfaceC12330v interfaceC12330v, InterfaceC12329u.a aVar2, InterfaceC10816d0 interfaceC10816d0, InterfaceC11705h0.a aVar3, long j10, InterfaceC10820f0 interfaceC10820f0, InterfaceC10811b interfaceC10811b, InterfaceC11707i interfaceC11707i, C4719e.b bVar, C11391m3 c11391m3) {
        this.f9181a = i10;
        this.f9178G = c12811c;
        this.f9186f = c12638b;
        this.f9179H = i11;
        this.f9182b = aVar;
        this.f9183c = interfaceC10834m0;
        this.f9184d = interfaceC12330v;
        this.f9172A = aVar2;
        this.f9185e = interfaceC10816d0;
        this.f9195z = aVar3;
        this.f9187r = j10;
        this.f9188s = interfaceC10820f0;
        this.f9189t = interfaceC10811b;
        this.f9192w = interfaceC11707i;
        this.f9173B = c11391m3;
        this.f9193x = new C4719e(c12811c, bVar, interfaceC10811b);
        this.f9177F = interfaceC11707i.mo36909a(this.f9175D);
        C12815g m42459d = c12811c.m42459d(i11);
        List<C12814f> list = m42459d.f34948d;
        this.f9180I = list;
        Pair<C11700f1, a[]> m11888q = m11888q(interfaceC12330v, m42459d.f34947c, list);
        this.f9190u = (C11700f1) m11888q.first;
        this.f9191v = (a[]) m11888q.second;
    }

    /* renamed from: A */
    private int[] m11877A(InterfaceC10312r[] interfaceC10312rArr) {
        int[] iArr = new int[interfaceC10312rArr.length];
        for (int i10 = 0; i10 < interfaceC10312rArr.length; i10++) {
            InterfaceC10312r interfaceC10312r = interfaceC10312rArr[i10];
            if (interfaceC10312r != null) {
                iArr[i10] = this.f9190u.m36858d(interfaceC10312r.mo30884d());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    /* renamed from: B */
    private static boolean m11878B(List<C12809a> list, int[] iArr) {
        for (int i10 : iArr) {
            List<AbstractC12818j> list2 = list.get(i10).f34902c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!list2.get(i11).f34963e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    private static int m11879C(int i10, List<C12809a> list, int[][] iArr, boolean[] zArr, C11108u1[][] c11108u1Arr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (m11878B(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            C11108u1[] m11892x = m11892x(list, iArr[i12]);
            c11108u1Arr[i12] = m11892x;
            if (m11892x.length != 0) {
                i11++;
            }
        }
        return i11;
    }

    /* renamed from: D */
    private static C12343i<InterfaceC4715a>[] m11880D(int i10) {
        return new C12343i[i10];
    }

    /* renamed from: F */
    private static C11108u1[] m11881F(C12813e c12813e, Pattern pattern, C11108u1 c11108u1) {
        String str = c12813e.f34938b;
        if (str == null) {
            return new C11108u1[]{c11108u1};
        }
        String[] m34891R0 = C11172r0.m34891R0(str, ";");
        C11108u1[] c11108u1Arr = new C11108u1[m34891R0.length];
        for (int i10 = 0; i10 < m34891R0.length; i10++) {
            Matcher matcher = pattern.matcher(m34891R0[i10]);
            if (!matcher.matches()) {
                return new C11108u1[]{c11108u1};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            c11108u1Arr[i10] = c11108u1.m34488c().m34540U(c11108u1.f28786a + ":" + parseInt).m34527H(parseInt).m34543X(matcher.group(2)).m34526G();
        }
        return c11108u1Arr;
    }

    /* renamed from: H */
    private void m11882H(InterfaceC10312r[] interfaceC10312rArr, boolean[] zArr, InterfaceC11734v0[] interfaceC11734v0Arr) {
        for (int i10 = 0; i10 < interfaceC10312rArr.length; i10++) {
            if (interfaceC10312rArr[i10] == null || !zArr[i10]) {
                InterfaceC11734v0 interfaceC11734v0 = interfaceC11734v0Arr[i10];
                if (interfaceC11734v0 instanceof C12343i) {
                    ((C12343i) interfaceC11734v0).m39928P(this);
                } else if (interfaceC11734v0 instanceof C12343i.a) {
                    ((C12343i.a) interfaceC11734v0).m39934c();
                }
                interfaceC11734v0Arr[i10] = null;
            }
        }
    }

    /* renamed from: I */
    private void m11883I(InterfaceC10312r[] interfaceC10312rArr, InterfaceC11734v0[] interfaceC11734v0Arr, int[] iArr) {
        boolean z10;
        for (int i10 = 0; i10 < interfaceC10312rArr.length; i10++) {
            InterfaceC11734v0 interfaceC11734v0 = interfaceC11734v0Arr[i10];
            if ((interfaceC11734v0 instanceof C11725r) || (interfaceC11734v0 instanceof C12343i.a)) {
                int m11894z = m11894z(i10, iArr);
                if (m11894z == -1) {
                    z10 = interfaceC11734v0Arr[i10] instanceof C11725r;
                } else {
                    InterfaceC11734v0 interfaceC11734v02 = interfaceC11734v0Arr[i10];
                    z10 = (interfaceC11734v02 instanceof C12343i.a) && ((C12343i.a) interfaceC11734v02).f33147a == interfaceC11734v0Arr[m11894z];
                }
                if (!z10) {
                    InterfaceC11734v0 interfaceC11734v03 = interfaceC11734v0Arr[i10];
                    if (interfaceC11734v03 instanceof C12343i.a) {
                        ((C12343i.a) interfaceC11734v03).m39934c();
                    }
                    interfaceC11734v0Arr[i10] = null;
                }
            }
        }
    }

    /* renamed from: J */
    private void m11884J(InterfaceC10312r[] interfaceC10312rArr, InterfaceC11734v0[] interfaceC11734v0Arr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < interfaceC10312rArr.length; i10++) {
            InterfaceC10312r interfaceC10312r = interfaceC10312rArr[i10];
            if (interfaceC10312r != null) {
                InterfaceC11734v0 interfaceC11734v0 = interfaceC11734v0Arr[i10];
                if (interfaceC11734v0 == null) {
                    zArr[i10] = true;
                    a aVar = this.f9191v[iArr[i10]];
                    int i11 = aVar.f9198c;
                    if (i11 == 0) {
                        interfaceC11734v0Arr[i10] = m11887p(aVar, interfaceC10312r, j10);
                    } else if (i11 == 2) {
                        interfaceC11734v0Arr[i10] = new C4718d(this.f9180I.get(aVar.f9199d), interfaceC10312r.mo30884d().m36849d(0), this.f9178G.f34913d);
                    }
                } else if (interfaceC11734v0 instanceof C12343i) {
                    ((InterfaceC4715a) ((C12343i) interfaceC11734v0).m39922D()).mo11874b(interfaceC10312r);
                }
            }
        }
        for (int i12 = 0; i12 < interfaceC10312rArr.length; i12++) {
            if (interfaceC11734v0Arr[i12] == null && interfaceC10312rArr[i12] != null) {
                a aVar2 = this.f9191v[iArr[i12]];
                if (aVar2.f9198c == 1) {
                    int m11894z = m11894z(i12, iArr);
                    if (m11894z == -1) {
                        interfaceC11734v0Arr[i12] = new C11725r();
                    } else {
                        interfaceC11734v0Arr[i12] = ((C12343i) interfaceC11734v0Arr[m11894z]).m39930S(j10, aVar2.f9197b);
                    }
                }
            }
        }
    }

    /* renamed from: m */
    private static void m11885m(List<C12814f> list, C11694d1[] c11694d1Arr, a[] aVarArr, int i10) {
        int i11 = 0;
        while (i11 < list.size()) {
            C12814f c12814f = list.get(i11);
            c11694d1Arr[i10] = new C11694d1(c12814f.m42537a() + ":" + i11, new C11108u1.b().m34540U(c12814f.m42537a()).m34552g0("application/x-emsg").m34526G());
            aVarArr[i10] = a.m11901c(i11);
            i11++;
            i10++;
        }
    }

    /* renamed from: n */
    private static int m11886n(InterfaceC12330v interfaceC12330v, List<C12809a> list, int[][] iArr, int i10, boolean[] zArr, C11108u1[][] c11108u1Arr, C11694d1[] c11694d1Arr, a[] aVarArr) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            int[] iArr2 = iArr[i13];
            ArrayList arrayList = new ArrayList();
            for (int i15 : iArr2) {
                arrayList.addAll(list.get(i15).f34902c);
            }
            int size = arrayList.size();
            C11108u1[] c11108u1Arr2 = new C11108u1[size];
            for (int i16 = 0; i16 < size; i16++) {
                C11108u1 c11108u1 = ((AbstractC12818j) arrayList.get(i16)).f34960b;
                c11108u1Arr2[i16] = c11108u1.m34489d(interfaceC12330v.mo39795d(c11108u1));
            }
            C12809a c12809a = list.get(iArr2[0]);
            int i17 = c12809a.f34900a;
            String num = i17 != -1 ? Integer.toString(i17) : "unset:" + i13;
            int i18 = i14 + 1;
            if (zArr[i13]) {
                i11 = i18 + 1;
            } else {
                i11 = i18;
                i18 = -1;
            }
            if (c11108u1Arr[i13].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            c11694d1Arr[i14] = new C11694d1(num, c11108u1Arr2);
            aVarArr[i14] = a.m11902d(c12809a.f34901b, iArr2, i14, i18, i11);
            if (i18 != -1) {
                String str = num + ":emsg";
                c11694d1Arr[i18] = new C11694d1(str, new C11108u1.b().m34540U(str).m34552g0("application/x-emsg").m34526G());
                aVarArr[i18] = a.m11900b(iArr2, i14);
            }
            if (i11 != -1) {
                c11694d1Arr[i11] = new C11694d1(num + ":cc", c11108u1Arr[i13]);
                aVarArr[i11] = a.m11899a(iArr2, i14);
            }
            i13++;
            i14 = i12;
        }
        return i14;
    }

    /* renamed from: p */
    private C12343i<InterfaceC4715a> m11887p(a aVar, InterfaceC10312r interfaceC10312r, long j10) {
        int i10;
        C11694d1 c11694d1;
        C11694d1 c11694d12;
        int i11;
        int i12 = aVar.f9201f;
        boolean z10 = i12 != -1;
        C4719e.c cVar = null;
        if (z10) {
            c11694d1 = this.f9190u.m36857c(i12);
            i10 = 1;
        } else {
            i10 = 0;
            c11694d1 = null;
        }
        int i13 = aVar.f9202g;
        boolean z11 = i13 != -1;
        if (z11) {
            c11694d12 = this.f9190u.m36857c(i13);
            i10 += c11694d12.f30658a;
        } else {
            c11694d12 = null;
        }
        C11108u1[] c11108u1Arr = new C11108u1[i10];
        int[] iArr = new int[i10];
        if (z10) {
            c11108u1Arr[0] = c11694d1.m36849d(0);
            iArr[0] = 5;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            for (int i14 = 0; i14 < c11694d12.f30658a; i14++) {
                C11108u1 m36849d = c11694d12.m36849d(i14);
                c11108u1Arr[i11] = m36849d;
                iArr[i11] = 3;
                arrayList.add(m36849d);
                i11++;
            }
        }
        if (this.f9178G.f34913d && z10) {
            cVar = this.f9193x.m11946k();
        }
        C4719e.c cVar2 = cVar;
        C12343i<InterfaceC4715a> c12343i = new C12343i<>(aVar.f9197b, iArr, c11108u1Arr, this.f9182b.mo11876a(this.f9188s, this.f9178G, this.f9186f, this.f9179H, aVar.f9196a, interfaceC10312r, aVar.f9197b, this.f9187r, z10, arrayList, cVar2, this.f9183c, this.f9173B), this, this.f9189t, j10, this.f9184d, this.f9172A, this.f9185e, this.f9195z);
        synchronized (this) {
            this.f9194y.put(c12343i, cVar2);
        }
        return c12343i;
    }

    /* renamed from: q */
    private static Pair<C11700f1, a[]> m11888q(InterfaceC12330v interfaceC12330v, List<C12809a> list, List<C12814f> list2) {
        int[][] m11893y = m11893y(list);
        int length = m11893y.length;
        boolean[] zArr = new boolean[length];
        C11108u1[][] c11108u1Arr = new C11108u1[length];
        int m11879C = m11879C(length, list, m11893y, zArr, c11108u1Arr) + length + list2.size();
        C11694d1[] c11694d1Arr = new C11694d1[m11879C];
        a[] aVarArr = new a[m11879C];
        m11885m(list2, c11694d1Arr, aVarArr, m11886n(interfaceC12330v, list, m11893y, length, zArr, c11108u1Arr, c11694d1Arr, aVarArr));
        return Pair.create(new C11700f1(c11694d1Arr), aVarArr);
    }

    /* renamed from: u */
    private static C12813e m11889u(List<C12813e> list) {
        return m11890v(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    /* renamed from: v */
    private static C12813e m11890v(List<C12813e> list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            C12813e c12813e = list.get(i10);
            if (str.equals(c12813e.f34937a)) {
                return c12813e;
            }
        }
        return null;
    }

    /* renamed from: w */
    private static C12813e m11891w(List<C12813e> list) {
        return m11890v(list, "http://dashif.org/guidelines/trickmode");
    }

    /* renamed from: x */
    private static C11108u1[] m11892x(List<C12809a> list, int[] iArr) {
        C11108u1 m34526G;
        Pattern pattern;
        for (int i10 : iArr) {
            C12809a c12809a = list.get(i10);
            List<C12813e> list2 = list.get(i10).f34903d;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                C12813e c12813e = list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(c12813e.f34937a)) {
                    m34526G = new C11108u1.b().m34552g0("application/cea-608").m34540U(c12809a.f34900a + ":cea608").m34526G();
                    pattern = f9170J;
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(c12813e.f34937a)) {
                    m34526G = new C11108u1.b().m34552g0("application/cea-708").m34540U(c12809a.f34900a + ":cea708").m34526G();
                    pattern = f9171K;
                }
                return m11881F(c12813e, pattern, m34526G);
            }
        }
        return new C11108u1[0];
    }

    /* renamed from: y */
    private static int[][] m11893y(List<C12809a> list) {
        int i10;
        C12813e m11889u;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i11 = 0; i11 < size; i11++) {
            sparseIntArray.put(list.get(i11).f34900a, i11);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i11));
            arrayList.add(arrayList2);
            sparseArray.put(i11, arrayList2);
        }
        for (int i12 = 0; i12 < size; i12++) {
            C12809a c12809a = list.get(i12);
            C12813e m11891w = m11891w(c12809a.f34904e);
            if (m11891w == null) {
                m11891w = m11891w(c12809a.f34905f);
            }
            if (m11891w == null || (i10 = sparseIntArray.get(Integer.parseInt(m11891w.f34938b), -1)) == -1) {
                i10 = i12;
            }
            if (i10 == i12 && (m11889u = m11889u(c12809a.f34905f)) != null) {
                for (String str : C11172r0.m34891R0(m11889u.f34938b, ",")) {
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
            int[] m23421l = C7690e.m23421l((Collection) arrayList.get(i14));
            iArr[i14] = m23421l;
            Arrays.sort(m23421l);
        }
        return iArr;
    }

    /* renamed from: z */
    private int m11894z(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f9191v[i11].f9200e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f9191v[i14].f9198c == 0) {
                return i13;
            }
        }
        return -1;
    }

    @Override // p397v7.InterfaceC11736w0.a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo258a(C12343i<InterfaceC4715a> c12343i) {
        this.f9174C.mo258a(this);
    }

    /* renamed from: G */
    public void m11896G() {
        this.f9193x.m11949o();
        for (C12343i<InterfaceC4715a> c12343i : this.f9175D) {
            c12343i.m39928P(this);
        }
        this.f9174C = null;
    }

    /* renamed from: K */
    public void m11897K(C12811c c12811c, int i10) {
        this.f9178G = c12811c;
        this.f9179H = i10;
        this.f9193x.m11950q(c12811c);
        C12343i<InterfaceC4715a>[] c12343iArr = this.f9175D;
        if (c12343iArr != null) {
            for (C12343i<InterfaceC4715a> c12343i : c12343iArr) {
                c12343i.m39922D().mo11875e(c12811c, i10);
            }
            this.f9174C.mo258a(this);
        }
        this.f9180I = c12811c.m42459d(i10).f34948d;
        for (C4718d c4718d : this.f9176E) {
            Iterator<C12814f> it = this.f9180I.iterator();
            while (true) {
                if (it.hasNext()) {
                    C12814f next = it.next();
                    if (next.m42537a().equals(c4718d.m11931b())) {
                        c4718d.m11933e(next, c12811c.f34913d && i10 == c12811c.m42460e() - 1);
                    }
                }
            }
        }
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: b */
    public long mo245b() {
        return this.f9177F.mo245b();
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: c */
    public long mo246c(long j10, C11110u3 c11110u3) {
        for (C12343i<InterfaceC4715a> c12343i : this.f9175D) {
            if (c12343i.f33132a == 2) {
                return c12343i.m39931c(j10, c11110u3);
            }
        }
        return j10;
    }

    @Override // p437x7.C12343i.b
    /* renamed from: d */
    public synchronized void mo11898d(C12343i<InterfaceC4715a> c12343i) {
        C4719e.c remove = this.f9194y.remove(c12343i);
        if (remove != null) {
            remove.m11958n();
        }
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: e */
    public boolean mo248e(long j10) {
        return this.f9177F.mo248e(j10);
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: f */
    public long mo249f() {
        return this.f9177F.mo249f();
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: g */
    public void mo250g(long j10) {
        this.f9177F.mo250g(j10);
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    public boolean isLoading() {
        return this.f9177F.isLoading();
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: j */
    public long mo251j(long j10) {
        for (C12343i<InterfaceC4715a> c12343i : this.f9175D) {
            c12343i.m39929R(j10);
        }
        for (C4718d c4718d : this.f9176E) {
            c4718d.m11932c(j10);
        }
        return j10;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: k */
    public void mo252k(InterfaceC11739y.a aVar, long j10) {
        this.f9174C = aVar;
        aVar.mo34427h(this);
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: l */
    public long mo253l() {
        return -9223372036854775807L;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: o */
    public void mo254o() {
        this.f9188s.mo11869a();
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: r */
    public C11700f1 mo255r() {
        return this.f9190u;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: s */
    public void mo256s(long j10, boolean z10) {
        for (C12343i<InterfaceC4715a> c12343i : this.f9175D) {
            c12343i.m39932s(j10, z10);
        }
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: t */
    public long mo257t(InterfaceC10312r[] interfaceC10312rArr, boolean[] zArr, InterfaceC11734v0[] interfaceC11734v0Arr, boolean[] zArr2, long j10) {
        int[] m11877A = m11877A(interfaceC10312rArr);
        m11882H(interfaceC10312rArr, zArr, interfaceC11734v0Arr);
        m11883I(interfaceC10312rArr, interfaceC11734v0Arr, m11877A);
        m11884J(interfaceC10312rArr, interfaceC11734v0Arr, zArr2, j10, m11877A);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC11734v0 interfaceC11734v0 : interfaceC11734v0Arr) {
            if (interfaceC11734v0 instanceof C12343i) {
                arrayList.add((C12343i) interfaceC11734v0);
            } else if (interfaceC11734v0 instanceof C4718d) {
                arrayList2.add((C4718d) interfaceC11734v0);
            }
        }
        C12343i<InterfaceC4715a>[] m11880D = m11880D(arrayList.size());
        this.f9175D = m11880D;
        arrayList.toArray(m11880D);
        C4718d[] c4718dArr = new C4718d[arrayList2.size()];
        this.f9176E = c4718dArr;
        arrayList2.toArray(c4718dArr);
        this.f9177F = this.f9192w.mo36909a(this.f9175D);
        return j10;
    }
}
