package q8;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.ads.AdError;
import com.google.android.gms.common.api.a;
import com.google.common.collect.r0;
import com.google.common.collect.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import q8.a;
import q8.m;
import q8.r;
import q8.t;
import q8.y;
import t6.d4;
import t6.o;
import t6.r3;
import t6.s3;
import t6.u1;
import v6.n0;
import v7.a0;
import v7.d1;
import v7.f1;

/* loaded from: classes.dex */
public class m extends t {

    /* renamed from: k, reason: collision with root package name */
    private static final r0<Integer> f23646k = r0.a(new Comparator() { // from class: q8.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int M;
            M = m.M((Integer) obj, (Integer) obj2);
            return M;
        }
    });

    /* renamed from: l, reason: collision with root package name */
    private static final r0<Integer> f23647l = r0.a(new Comparator() { // from class: q8.g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int N;
            N = m.N((Integer) obj, (Integer) obj2);
            return N;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    private final Object f23648d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f23649e;

    /* renamed from: f, reason: collision with root package name */
    private final r.b f23650f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f23651g;

    /* renamed from: h, reason: collision with root package name */
    private d f23652h;

    /* renamed from: i, reason: collision with root package name */
    private f f23653i;

    /* renamed from: j, reason: collision with root package name */
    private v6.e f23654j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends h<b> implements Comparable<b> {
        private final boolean A;
        private final int B;
        private final int C;
        private final int D;
        private final int E;
        private final boolean F;
        private final boolean G;

        /* renamed from: e, reason: collision with root package name */
        private final int f23655e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f23656f;

        /* renamed from: r, reason: collision with root package name */
        private final String f23657r;

        /* renamed from: s, reason: collision with root package name */
        private final d f23658s;

        /* renamed from: t, reason: collision with root package name */
        private final boolean f23659t;

        /* renamed from: u, reason: collision with root package name */
        private final int f23660u;

        /* renamed from: v, reason: collision with root package name */
        private final int f23661v;

        /* renamed from: w, reason: collision with root package name */
        private final int f23662w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f23663x;

        /* renamed from: y, reason: collision with root package name */
        private final int f23664y;

        /* renamed from: z, reason: collision with root package name */
        private final int f23665z;

        public b(int i10, d1 d1Var, int i11, d dVar, int i12, boolean z10, eb.p<u1> pVar) {
            super(i10, d1Var, i11);
            int i13;
            int i14;
            int i15;
            this.f23658s = dVar;
            this.f23657r = m.Q(this.f23705d.f26508c);
            this.f23659t = m.I(i12, false);
            int i16 = 0;
            while (true) {
                int size = dVar.f23762y.size();
                i13 = a.e.API_PRIORITY_OTHER;
                if (i16 >= size) {
                    i14 = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                } else {
                    i14 = m.B(this.f23705d, dVar.f23762y.get(i16), false);
                    if (i14 > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f23661v = i16;
            this.f23660u = i14;
            this.f23662w = m.E(this.f23705d.f26510e, dVar.f23763z);
            u1 u1Var = this.f23705d;
            int i17 = u1Var.f26510e;
            this.f23663x = i17 == 0 || (i17 & 1) != 0;
            this.A = (u1Var.f26509d & 1) != 0;
            int i18 = u1Var.J;
            this.B = i18;
            this.C = u1Var.K;
            int i19 = u1Var.f26513s;
            this.D = i19;
            this.f23656f = (i19 == -1 || i19 <= dVar.B) && (i18 == -1 || i18 <= dVar.A) && pVar.apply(u1Var);
            String[] h02 = t8.r0.h0();
            int i20 = 0;
            while (true) {
                if (i20 >= h02.length) {
                    i15 = 0;
                    i20 = Integer.MAX_VALUE;
                    break;
                } else {
                    i15 = m.B(this.f23705d, h02[i20], false);
                    if (i15 > 0) {
                        break;
                    } else {
                        i20++;
                    }
                }
            }
            this.f23664y = i20;
            this.f23665z = i15;
            int i21 = 0;
            while (true) {
                if (i21 < dVar.C.size()) {
                    String str = this.f23705d.f26517w;
                    if (str != null && str.equals(dVar.C.get(i21))) {
                        i13 = i21;
                        break;
                    }
                    i21++;
                } else {
                    break;
                }
            }
            this.E = i13;
            this.F = r3.j(i12) == 128;
            this.G = r3.t(i12) == 64;
            this.f23655e = n(i12, z10);
        }

        public static int i(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static com.google.common.collect.w<b> m(int i10, d1 d1Var, d dVar, int[] iArr, boolean z10, eb.p<u1> pVar) {
            w.a p10 = com.google.common.collect.w.p();
            for (int i11 = 0; i11 < d1Var.f28288a; i11++) {
                p10.a(new b(i10, d1Var, i11, dVar, iArr[i11], z10, pVar));
            }
            return p10.k();
        }

        private int n(int i10, boolean z10) {
            if (!m.I(i10, this.f23658s.f23678y0)) {
                return 0;
            }
            if (!this.f23656f && !this.f23658s.f23672s0) {
                return 0;
            }
            if (m.I(i10, false) && this.f23656f && this.f23705d.f26513s != -1) {
                d dVar = this.f23658s;
                if (!dVar.I && !dVar.H && (dVar.A0 || !z10)) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // q8.m.h
        public int b() {
            return this.f23655e;
        }

        @Override // java.lang.Comparable
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            r0 f10 = (this.f23656f && this.f23659t) ? m.f23646k : m.f23646k.f();
            com.google.common.collect.o f11 = com.google.common.collect.o.j().g(this.f23659t, bVar.f23659t).f(Integer.valueOf(this.f23661v), Integer.valueOf(bVar.f23661v), r0.c().f()).d(this.f23660u, bVar.f23660u).d(this.f23662w, bVar.f23662w).g(this.A, bVar.A).g(this.f23663x, bVar.f23663x).f(Integer.valueOf(this.f23664y), Integer.valueOf(bVar.f23664y), r0.c().f()).d(this.f23665z, bVar.f23665z).g(this.f23656f, bVar.f23656f).f(Integer.valueOf(this.E), Integer.valueOf(bVar.E), r0.c().f()).f(Integer.valueOf(this.D), Integer.valueOf(bVar.D), this.f23658s.H ? m.f23646k.f() : m.f23647l).g(this.F, bVar.F).g(this.G, bVar.G).f(Integer.valueOf(this.B), Integer.valueOf(bVar.B), f10).f(Integer.valueOf(this.C), Integer.valueOf(bVar.C), f10);
            Integer valueOf = Integer.valueOf(this.D);
            Integer valueOf2 = Integer.valueOf(bVar.D);
            if (!t8.r0.c(this.f23657r, bVar.f23657r)) {
                f10 = m.f23647l;
            }
            return f11.f(valueOf, valueOf2, f10).i();
        }

        @Override // q8.m.h
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean h(b bVar) {
            int i10;
            String str;
            int i11;
            d dVar = this.f23658s;
            if ((dVar.f23675v0 || ((i11 = this.f23705d.J) != -1 && i11 == bVar.f23705d.J)) && (dVar.f23673t0 || ((str = this.f23705d.f26517w) != null && TextUtils.equals(str, bVar.f23705d.f26517w)))) {
                d dVar2 = this.f23658s;
                if ((dVar2.f23674u0 || ((i10 = this.f23705d.K) != -1 && i10 == bVar.f23705d.K)) && (dVar2.f23676w0 || (this.F == bVar.F && this.G == bVar.G))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f23666a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f23667b;

        public c(u1 u1Var, int i10) {
            this.f23666a = (u1Var.f26509d & 1) != 0;
            this.f23667b = m.I(i10, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return com.google.common.collect.o.j().g(this.f23667b, cVar.f23667b).g(this.f23666a, cVar.f23666a).i();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends y {
        public static final d D0;

        @Deprecated
        public static final d E0;
        private static final String F0;
        private static final String G0;
        private static final String H0;
        private static final String I0;
        private static final String J0;
        private static final String K0;
        private static final String L0;
        private static final String M0;
        private static final String N0;
        private static final String O0;
        private static final String P0;
        private static final String Q0;
        private static final String R0;
        private static final String S0;
        private static final String T0;
        private static final String U0;
        private static final String V0;
        public static final o.a<d> W0;
        public final boolean A0;
        private final SparseArray<Map<f1, e>> B0;
        private final SparseBooleanArray C0;

        /* renamed from: o0, reason: collision with root package name */
        public final boolean f23668o0;

        /* renamed from: p0, reason: collision with root package name */
        public final boolean f23669p0;

        /* renamed from: q0, reason: collision with root package name */
        public final boolean f23670q0;

        /* renamed from: r0, reason: collision with root package name */
        public final boolean f23671r0;

        /* renamed from: s0, reason: collision with root package name */
        public final boolean f23672s0;

        /* renamed from: t0, reason: collision with root package name */
        public final boolean f23673t0;

        /* renamed from: u0, reason: collision with root package name */
        public final boolean f23674u0;

        /* renamed from: v0, reason: collision with root package name */
        public final boolean f23675v0;

        /* renamed from: w0, reason: collision with root package name */
        public final boolean f23676w0;

        /* renamed from: x0, reason: collision with root package name */
        public final boolean f23677x0;

        /* renamed from: y0, reason: collision with root package name */
        public final boolean f23678y0;

        /* renamed from: z0, reason: collision with root package name */
        public final boolean f23679z0;

        /* loaded from: classes.dex */
        public static final class a extends y.a {
            private boolean A;
            private boolean B;
            private boolean C;
            private boolean D;
            private boolean E;
            private boolean F;
            private boolean G;
            private boolean H;
            private boolean I;
            private boolean J;
            private boolean K;
            private boolean L;
            private boolean M;
            private final SparseArray<Map<f1, e>> N;
            private final SparseBooleanArray O;

            @Deprecated
            public a() {
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                Z();
            }

            public a(Context context) {
                super(context);
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                Z();
            }

            private a(Bundle bundle) {
                super(bundle);
                Z();
                d dVar = d.D0;
                n0(bundle.getBoolean(d.F0, dVar.f23668o0));
                i0(bundle.getBoolean(d.G0, dVar.f23669p0));
                j0(bundle.getBoolean(d.H0, dVar.f23670q0));
                h0(bundle.getBoolean(d.T0, dVar.f23671r0));
                l0(bundle.getBoolean(d.I0, dVar.f23672s0));
                e0(bundle.getBoolean(d.J0, dVar.f23673t0));
                f0(bundle.getBoolean(d.K0, dVar.f23674u0));
                c0(bundle.getBoolean(d.L0, dVar.f23675v0));
                d0(bundle.getBoolean(d.U0, dVar.f23676w0));
                k0(bundle.getBoolean(d.V0, dVar.f23677x0));
                m0(bundle.getBoolean(d.M0, dVar.f23678y0));
                r0(bundle.getBoolean(d.N0, dVar.f23679z0));
                g0(bundle.getBoolean(d.O0, dVar.A0));
                this.N = new SparseArray<>();
                q0(bundle);
                this.O = a0(bundle.getIntArray(d.S0));
            }

            private a(d dVar) {
                super(dVar);
                this.A = dVar.f23668o0;
                this.B = dVar.f23669p0;
                this.C = dVar.f23670q0;
                this.D = dVar.f23671r0;
                this.E = dVar.f23672s0;
                this.F = dVar.f23673t0;
                this.G = dVar.f23674u0;
                this.H = dVar.f23675v0;
                this.I = dVar.f23676w0;
                this.J = dVar.f23677x0;
                this.K = dVar.f23678y0;
                this.L = dVar.f23679z0;
                this.M = dVar.A0;
                this.N = Y(dVar.B0);
                this.O = dVar.C0.clone();
            }

            private static SparseArray<Map<f1, e>> Y(SparseArray<Map<f1, e>> sparseArray) {
                SparseArray<Map<f1, e>> sparseArray2 = new SparseArray<>();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            private void Z() {
                this.A = true;
                this.B = false;
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = false;
                this.H = false;
                this.I = false;
                this.J = true;
                this.K = true;
                this.L = false;
                this.M = true;
            }

            private SparseBooleanArray a0(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i10 : iArr) {
                    sparseBooleanArray.append(i10, true);
                }
                return sparseBooleanArray;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void q0(Bundle bundle) {
                int[] intArray = bundle.getIntArray(d.P0);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(d.Q0);
                com.google.common.collect.w v10 = parcelableArrayList == null ? com.google.common.collect.w.v() : t8.c.b(f1.f28313f, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(d.R0);
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : t8.c.c(e.f23683s, sparseParcelableArray);
                if (intArray == null || intArray.length != v10.size()) {
                    return;
                }
                for (int i10 = 0; i10 < intArray.length; i10++) {
                    p0(intArray[i10], (f1) v10.get(i10), (e) sparseArray.get(i10));
                }
            }

            @Override // q8.y.a
            /* renamed from: X, reason: merged with bridge method [inline-methods] */
            public d A() {
                return new d(this);
            }

            protected a b0(y yVar) {
                super.D(yVar);
                return this;
            }

            public a c0(boolean z10) {
                this.H = z10;
                return this;
            }

            public a d0(boolean z10) {
                this.I = z10;
                return this;
            }

            public a e0(boolean z10) {
                this.F = z10;
                return this;
            }

            public a f0(boolean z10) {
                this.G = z10;
                return this;
            }

            public a g0(boolean z10) {
                this.M = z10;
                return this;
            }

            public a h0(boolean z10) {
                this.D = z10;
                return this;
            }

            public a i0(boolean z10) {
                this.B = z10;
                return this;
            }

            public a j0(boolean z10) {
                this.C = z10;
                return this;
            }

            public a k0(boolean z10) {
                this.J = z10;
                return this;
            }

            public a l0(boolean z10) {
                this.E = z10;
                return this;
            }

            public a m0(boolean z10) {
                this.K = z10;
                return this;
            }

            public a n0(boolean z10) {
                this.A = z10;
                return this;
            }

            @Override // q8.y.a
            /* renamed from: o0, reason: merged with bridge method [inline-methods] */
            public a E(Context context) {
                super.E(context);
                return this;
            }

            @Deprecated
            public a p0(int i10, f1 f1Var, e eVar) {
                Map<f1, e> map = this.N.get(i10);
                if (map == null) {
                    map = new HashMap<>();
                    this.N.put(i10, map);
                }
                if (map.containsKey(f1Var) && t8.r0.c(map.get(f1Var), eVar)) {
                    return this;
                }
                map.put(f1Var, eVar);
                return this;
            }

            public a r0(boolean z10) {
                this.L = z10;
                return this;
            }

            @Override // q8.y.a
            /* renamed from: s0, reason: merged with bridge method [inline-methods] */
            public a G(int i10, int i11, boolean z10) {
                super.G(i10, i11, z10);
                return this;
            }

            @Override // q8.y.a
            /* renamed from: t0, reason: merged with bridge method [inline-methods] */
            public a H(Context context, boolean z10) {
                super.H(context, z10);
                return this;
            }
        }

        static {
            d A = new a().A();
            D0 = A;
            E0 = A;
            F0 = t8.r0.r0(AdError.NETWORK_ERROR_CODE);
            G0 = t8.r0.r0(AdError.NO_FILL_ERROR_CODE);
            H0 = t8.r0.r0(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);
            I0 = t8.r0.r0(1003);
            J0 = t8.r0.r0(1004);
            K0 = t8.r0.r0(1005);
            L0 = t8.r0.r0(1006);
            M0 = t8.r0.r0(1007);
            N0 = t8.r0.r0(1008);
            O0 = t8.r0.r0(1009);
            P0 = t8.r0.r0(1010);
            Q0 = t8.r0.r0(1011);
            R0 = t8.r0.r0(1012);
            S0 = t8.r0.r0(1013);
            T0 = t8.r0.r0(1014);
            U0 = t8.r0.r0(1015);
            V0 = t8.r0.r0(1016);
            W0 = new o.a() { // from class: q8.n
                @Override // t6.o.a
                public final t6.o a(Bundle bundle) {
                    m.d O;
                    O = m.d.O(bundle);
                    return O;
                }
            };
        }

        private d(a aVar) {
            super(aVar);
            this.f23668o0 = aVar.A;
            this.f23669p0 = aVar.B;
            this.f23670q0 = aVar.C;
            this.f23671r0 = aVar.D;
            this.f23672s0 = aVar.E;
            this.f23673t0 = aVar.F;
            this.f23674u0 = aVar.G;
            this.f23675v0 = aVar.H;
            this.f23676w0 = aVar.I;
            this.f23677x0 = aVar.J;
            this.f23678y0 = aVar.K;
            this.f23679z0 = aVar.L;
            this.A0 = aVar.M;
            this.B0 = aVar.N;
            this.C0 = aVar.O;
        }

        private static boolean F(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean G(SparseArray<Map<f1, e>> sparseArray, SparseArray<Map<f1, e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !H(sparseArray.valueAt(i10), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean H(Map<f1, e> map, Map<f1, e> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<f1, e> entry : map.entrySet()) {
                f1 key = entry.getKey();
                if (!map2.containsKey(key) || !t8.r0.c(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public static d J(Context context) {
            return new a(context).A();
        }

        private static int[] K(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
                iArr[i10] = sparseBooleanArray.keyAt(i10);
            }
            return iArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ d O(Bundle bundle) {
            return new a(bundle).A();
        }

        private static void P(Bundle bundle, SparseArray<Map<f1, e>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                int keyAt = sparseArray.keyAt(i10);
                for (Map.Entry<f1, e> entry : sparseArray.valueAt(i10).entrySet()) {
                    e value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(keyAt));
                }
                bundle.putIntArray(P0, hb.e.l(arrayList));
                bundle.putParcelableArrayList(Q0, t8.c.d(arrayList2));
                bundle.putSparseParcelableArray(R0, t8.c.e(sparseArray2));
            }
        }

        public a I() {
            return new a();
        }

        public boolean L(int i10) {
            return this.C0.get(i10);
        }

        @Deprecated
        public e M(int i10, f1 f1Var) {
            Map<f1, e> map = this.B0.get(i10);
            if (map != null) {
                return map.get(f1Var);
            }
            return null;
        }

        @Deprecated
        public boolean N(int i10, f1 f1Var) {
            Map<f1, e> map = this.B0.get(i10);
            return map != null && map.containsKey(f1Var);
        }

        @Override // q8.y, t6.o
        public Bundle a() {
            Bundle a10 = super.a();
            a10.putBoolean(F0, this.f23668o0);
            a10.putBoolean(G0, this.f23669p0);
            a10.putBoolean(H0, this.f23670q0);
            a10.putBoolean(T0, this.f23671r0);
            a10.putBoolean(I0, this.f23672s0);
            a10.putBoolean(J0, this.f23673t0);
            a10.putBoolean(K0, this.f23674u0);
            a10.putBoolean(L0, this.f23675v0);
            a10.putBoolean(U0, this.f23676w0);
            a10.putBoolean(V0, this.f23677x0);
            a10.putBoolean(M0, this.f23678y0);
            a10.putBoolean(N0, this.f23679z0);
            a10.putBoolean(O0, this.A0);
            P(a10, this.B0);
            a10.putIntArray(S0, K(this.C0));
            return a10;
        }

        @Override // q8.y
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return super.equals(dVar) && this.f23668o0 == dVar.f23668o0 && this.f23669p0 == dVar.f23669p0 && this.f23670q0 == dVar.f23670q0 && this.f23671r0 == dVar.f23671r0 && this.f23672s0 == dVar.f23672s0 && this.f23673t0 == dVar.f23673t0 && this.f23674u0 == dVar.f23674u0 && this.f23675v0 == dVar.f23675v0 && this.f23676w0 == dVar.f23676w0 && this.f23677x0 == dVar.f23677x0 && this.f23678y0 == dVar.f23678y0 && this.f23679z0 == dVar.f23679z0 && this.A0 == dVar.A0 && F(this.C0, dVar.C0) && G(this.B0, dVar.B0);
        }

        @Override // q8.y
        public int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f23668o0 ? 1 : 0)) * 31) + (this.f23669p0 ? 1 : 0)) * 31) + (this.f23670q0 ? 1 : 0)) * 31) + (this.f23671r0 ? 1 : 0)) * 31) + (this.f23672s0 ? 1 : 0)) * 31) + (this.f23673t0 ? 1 : 0)) * 31) + (this.f23674u0 ? 1 : 0)) * 31) + (this.f23675v0 ? 1 : 0)) * 31) + (this.f23676w0 ? 1 : 0)) * 31) + (this.f23677x0 ? 1 : 0)) * 31) + (this.f23678y0 ? 1 : 0)) * 31) + (this.f23679z0 ? 1 : 0)) * 31) + (this.A0 ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements t6.o {

        /* renamed from: e, reason: collision with root package name */
        private static final String f23680e = t8.r0.r0(0);

        /* renamed from: f, reason: collision with root package name */
        private static final String f23681f = t8.r0.r0(1);

        /* renamed from: r, reason: collision with root package name */
        private static final String f23682r = t8.r0.r0(2);

        /* renamed from: s, reason: collision with root package name */
        public static final o.a<e> f23683s = new o.a() { // from class: q8.o
            @Override // t6.o.a
            public final t6.o a(Bundle bundle) {
                m.e d10;
                d10 = m.e.d(bundle);
                return d10;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final int f23684a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f23685b;

        /* renamed from: c, reason: collision with root package name */
        public final int f23686c;

        /* renamed from: d, reason: collision with root package name */
        public final int f23687d;

        public e(int i10, int... iArr) {
            this(i10, iArr, 0);
        }

        public e(int i10, int[] iArr, int i11) {
            this.f23684a = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f23685b = copyOf;
            this.f23686c = iArr.length;
            this.f23687d = i11;
            Arrays.sort(copyOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ e d(Bundle bundle) {
            int i10 = bundle.getInt(f23680e, -1);
            int[] intArray = bundle.getIntArray(f23681f);
            int i11 = bundle.getInt(f23682r, -1);
            t8.a.a(i10 >= 0 && i11 >= 0);
            t8.a.e(intArray);
            return new e(i10, intArray, i11);
        }

        @Override // t6.o
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt(f23680e, this.f23684a);
            bundle.putIntArray(f23681f, this.f23685b);
            bundle.putInt(f23682r, this.f23687d);
            return bundle;
        }

        public boolean c(int i10) {
            for (int i11 : this.f23685b) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f23684a == eVar.f23684a && Arrays.equals(this.f23685b, eVar.f23685b) && this.f23687d == eVar.f23687d;
        }

        public int hashCode() {
            return (((this.f23684a * 31) + Arrays.hashCode(this.f23685b)) * 31) + this.f23687d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private final Spatializer f23688a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f23689b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f23690c;

        /* renamed from: d, reason: collision with root package name */
        private Spatializer.OnSpatializerStateChangedListener f23691d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Spatializer.OnSpatializerStateChangedListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ m f23692a;

            a(f fVar, m mVar) {
                this.f23692a = mVar;
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f23692a.P();
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f23692a.P();
            }
        }

        private f(Spatializer spatializer) {
            this.f23688a = spatializer;
            this.f23689b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public static f g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new f(audioManager.getSpatializer());
        }

        public boolean a(v6.e eVar, u1 u1Var) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(t8.r0.G(("audio/eac3-joc".equals(u1Var.f26517w) && u1Var.J == 16) ? 12 : u1Var.J));
            int i10 = u1Var.K;
            if (i10 != -1) {
                channelMask.setSampleRate(i10);
            }
            return this.f23688a.canBeSpatialized(eVar.c().f27977a, channelMask.build());
        }

        public void b(m mVar, Looper looper) {
            if (this.f23691d == null && this.f23690c == null) {
                this.f23691d = new a(this, mVar);
                Handler handler = new Handler(looper);
                this.f23690c = handler;
                Spatializer spatializer = this.f23688a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new n0(handler), this.f23691d);
            }
        }

        public boolean c() {
            return this.f23688a.isAvailable();
        }

        public boolean d() {
            return this.f23688a.isEnabled();
        }

        public boolean e() {
            return this.f23689b;
        }

        public void f() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f23691d;
            if (onSpatializerStateChangedListener == null || this.f23690c == null) {
                return;
            }
            this.f23688a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            ((Handler) t8.r0.j(this.f23690c)).removeCallbacksAndMessages(null);
            this.f23690c = null;
            this.f23691d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g extends h<g> implements Comparable<g> {

        /* renamed from: e, reason: collision with root package name */
        private final int f23693e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f23694f;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f23695r;

        /* renamed from: s, reason: collision with root package name */
        private final boolean f23696s;

        /* renamed from: t, reason: collision with root package name */
        private final int f23697t;

        /* renamed from: u, reason: collision with root package name */
        private final int f23698u;

        /* renamed from: v, reason: collision with root package name */
        private final int f23699v;

        /* renamed from: w, reason: collision with root package name */
        private final int f23700w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f23701x;

        public g(int i10, d1 d1Var, int i11, d dVar, int i12, String str) {
            super(i10, d1Var, i11);
            int i13;
            int i14 = 0;
            this.f23694f = m.I(i12, false);
            int i15 = this.f23705d.f26509d & (~dVar.F);
            this.f23695r = (i15 & 1) != 0;
            this.f23696s = (i15 & 2) != 0;
            com.google.common.collect.w<String> w10 = dVar.D.isEmpty() ? com.google.common.collect.w.w("") : dVar.D;
            int i16 = 0;
            while (true) {
                if (i16 >= w10.size()) {
                    i16 = a.e.API_PRIORITY_OTHER;
                    i13 = 0;
                    break;
                } else {
                    i13 = m.B(this.f23705d, w10.get(i16), dVar.G);
                    if (i13 > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f23697t = i16;
            this.f23698u = i13;
            int E = m.E(this.f23705d.f26510e, dVar.E);
            this.f23699v = E;
            this.f23701x = (this.f23705d.f26510e & 1088) != 0;
            int B = m.B(this.f23705d, str, m.Q(str) == null);
            this.f23700w = B;
            boolean z10 = i13 > 0 || (dVar.D.isEmpty() && E > 0) || this.f23695r || (this.f23696s && B > 0);
            if (m.I(i12, dVar.f23678y0) && z10) {
                i14 = 1;
            }
            this.f23693e = i14;
        }

        public static int i(List<g> list, List<g> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static com.google.common.collect.w<g> m(int i10, d1 d1Var, d dVar, int[] iArr, String str) {
            w.a p10 = com.google.common.collect.w.p();
            for (int i11 = 0; i11 < d1Var.f28288a; i11++) {
                p10.a(new g(i10, d1Var, i11, dVar, iArr[i11], str));
            }
            return p10.k();
        }

        @Override // q8.m.h
        public int b() {
            return this.f23693e;
        }

        @Override // java.lang.Comparable
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            com.google.common.collect.o d10 = com.google.common.collect.o.j().g(this.f23694f, gVar.f23694f).f(Integer.valueOf(this.f23697t), Integer.valueOf(gVar.f23697t), r0.c().f()).d(this.f23698u, gVar.f23698u).d(this.f23699v, gVar.f23699v).g(this.f23695r, gVar.f23695r).f(Boolean.valueOf(this.f23696s), Boolean.valueOf(gVar.f23696s), this.f23698u == 0 ? r0.c() : r0.c().f()).d(this.f23700w, gVar.f23700w);
            if (this.f23699v == 0) {
                d10 = d10.h(this.f23701x, gVar.f23701x);
            }
            return d10.i();
        }

        @Override // q8.m.h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean h(g gVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class h<T extends h<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f23702a;

        /* renamed from: b, reason: collision with root package name */
        public final d1 f23703b;

        /* renamed from: c, reason: collision with root package name */
        public final int f23704c;

        /* renamed from: d, reason: collision with root package name */
        public final u1 f23705d;

        /* loaded from: classes.dex */
        public interface a<T extends h<T>> {
            List<T> a(int i10, d1 d1Var, int[] iArr);
        }

        public h(int i10, d1 d1Var, int i11) {
            this.f23702a = i10;
            this.f23703b = d1Var;
            this.f23704c = i11;
            this.f23705d = d1Var.d(i11);
        }

        public abstract int b();

        public abstract boolean h(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class i extends h<i> {
        private final boolean A;
        private final boolean B;
        private final int C;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f23706e;

        /* renamed from: f, reason: collision with root package name */
        private final d f23707f;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f23708r;

        /* renamed from: s, reason: collision with root package name */
        private final boolean f23709s;

        /* renamed from: t, reason: collision with root package name */
        private final int f23710t;

        /* renamed from: u, reason: collision with root package name */
        private final int f23711u;

        /* renamed from: v, reason: collision with root package name */
        private final int f23712v;

        /* renamed from: w, reason: collision with root package name */
        private final int f23713w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f23714x;

        /* renamed from: y, reason: collision with root package name */
        private final boolean f23715y;

        /* renamed from: z, reason: collision with root package name */
        private final int f23716z;

        /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x00c8 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public i(int r5, v7.d1 r6, int r7, q8.m.d r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 247
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: q8.m.i.<init>(int, v7.d1, int, q8.m$d, int, int, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int m(i iVar, i iVar2) {
            com.google.common.collect.o g10 = com.google.common.collect.o.j().g(iVar.f23709s, iVar2.f23709s).d(iVar.f23713w, iVar2.f23713w).g(iVar.f23714x, iVar2.f23714x).g(iVar.f23706e, iVar2.f23706e).g(iVar.f23708r, iVar2.f23708r).f(Integer.valueOf(iVar.f23712v), Integer.valueOf(iVar2.f23712v), r0.c().f()).g(iVar.A, iVar2.A).g(iVar.B, iVar2.B);
            if (iVar.A && iVar.B) {
                g10 = g10.d(iVar.C, iVar2.C);
            }
            return g10.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int n(i iVar, i iVar2) {
            r0 f10 = (iVar.f23706e && iVar.f23709s) ? m.f23646k : m.f23646k.f();
            return com.google.common.collect.o.j().f(Integer.valueOf(iVar.f23710t), Integer.valueOf(iVar2.f23710t), iVar.f23707f.H ? m.f23646k.f() : m.f23647l).f(Integer.valueOf(iVar.f23711u), Integer.valueOf(iVar2.f23711u), f10).f(Integer.valueOf(iVar.f23710t), Integer.valueOf(iVar2.f23710t), f10).i();
        }

        public static int o(List<i> list, List<i> list2) {
            return com.google.common.collect.o.j().f((i) Collections.max(list, new Comparator() { // from class: q8.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m10;
                    m10 = m.i.m((m.i) obj, (m.i) obj2);
                    return m10;
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: q8.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m10;
                    m10 = m.i.m((m.i) obj, (m.i) obj2);
                    return m10;
                }
            }), new Comparator() { // from class: q8.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m10;
                    m10 = m.i.m((m.i) obj, (m.i) obj2);
                    return m10;
                }
            }).d(list.size(), list2.size()).f((i) Collections.max(list, new Comparator() { // from class: q8.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int n10;
                    n10 = m.i.n((m.i) obj, (m.i) obj2);
                    return n10;
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: q8.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int n10;
                    n10 = m.i.n((m.i) obj, (m.i) obj2);
                    return n10;
                }
            }), new Comparator() { // from class: q8.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int n10;
                    n10 = m.i.n((m.i) obj, (m.i) obj2);
                    return n10;
                }
            }).i();
        }

        public static com.google.common.collect.w<i> p(int i10, d1 d1Var, d dVar, int[] iArr, int i11) {
            int C = m.C(d1Var, dVar.f23757t, dVar.f23758u, dVar.f23759v);
            w.a p10 = com.google.common.collect.w.p();
            for (int i12 = 0; i12 < d1Var.f28288a; i12++) {
                int g10 = d1Var.d(i12).g();
                p10.a(new i(i10, d1Var, i12, dVar, iArr[i12], i11, C == Integer.MAX_VALUE || (g10 != -1 && g10 <= C)));
            }
            return p10.k();
        }

        private int q(int i10, int i11) {
            if ((this.f23705d.f26510e & 16384) != 0 || !m.I(i10, this.f23707f.f23678y0)) {
                return 0;
            }
            if (!this.f23706e && !this.f23707f.f23668o0) {
                return 0;
            }
            if (m.I(i10, false) && this.f23708r && this.f23706e && this.f23705d.f26513s != -1) {
                d dVar = this.f23707f;
                if (!dVar.I && !dVar.H && (i10 & i11) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // q8.m.h
        public int b() {
            return this.f23716z;
        }

        @Override // q8.m.h
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public boolean h(i iVar) {
            return (this.f23715y || t8.r0.c(this.f23705d.f26517w, iVar.f23705d.f26517w)) && (this.f23707f.f23671r0 || (this.A == iVar.A && this.B == iVar.B));
        }
    }

    public m(Context context) {
        this(context, new a.b());
    }

    public m(Context context, r.b bVar) {
        this(context, d.J(context), bVar);
    }

    public m(Context context, y yVar, r.b bVar) {
        this(yVar, bVar, context);
    }

    private m(y yVar, r.b bVar, Context context) {
        d A;
        this.f23648d = new Object();
        this.f23649e = context != null ? context.getApplicationContext() : null;
        this.f23650f = bVar;
        if (yVar instanceof d) {
            A = (d) yVar;
        } else {
            A = (context == null ? d.D0 : d.J(context)).I().b0(yVar).A();
        }
        this.f23652h = A;
        this.f23654j = v6.e.f27964r;
        boolean z10 = context != null && t8.r0.x0(context);
        this.f23651g = z10;
        if (!z10 && context != null && t8.r0.f26744a >= 32) {
            this.f23653i = f.g(context);
        }
        if (this.f23652h.f23677x0 && context == null) {
            t8.s.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    private static void A(f1 f1Var, y yVar, Map<Integer, w> map) {
        w wVar;
        for (int i10 = 0; i10 < f1Var.f28314a; i10++) {
            w wVar2 = yVar.J.get(f1Var.c(i10));
            if (wVar2 != null && ((wVar = map.get(Integer.valueOf(wVar2.c()))) == null || (wVar.f23734b.isEmpty() && !wVar2.f23734b.isEmpty()))) {
                map.put(Integer.valueOf(wVar2.c()), wVar2);
            }
        }
    }

    protected static int B(u1 u1Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(u1Var.f26508c)) {
            return 4;
        }
        String Q = Q(str);
        String Q2 = Q(u1Var.f26508c);
        if (Q2 == null || Q == null) {
            return (z10 && Q2 == null) ? 1 : 0;
        }
        if (Q2.startsWith(Q) || Q.startsWith(Q2)) {
            return 3;
        }
        return t8.r0.S0(Q2, "-")[0].equals(t8.r0.S0(Q, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int C(d1 d1Var, int i10, int i11, boolean z10) {
        int i12;
        int i13 = a.e.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i14 = 0; i14 < d1Var.f28288a; i14++) {
                u1 d10 = d1Var.d(i14);
                int i15 = d10.B;
                if (i15 > 0 && (i12 = d10.C) > 0) {
                    Point D = D(z10, i10, i11, i15, i12);
                    int i16 = d10.B;
                    int i17 = d10.C;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (D.x * 0.98f)) && i17 >= ((int) (D.y * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
    
        if ((r6 > r7) != (r4 > r5)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point D(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = r3
            goto L9
        L8:
            r1 = r0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = t8.r0.l(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = t8.r0.l(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.m.D(boolean, int, int, int, int):android.graphics.Point");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int E(int i10, int i11) {
        return (i10 == 0 || i10 != i11) ? Integer.bitCount(i10 & i11) : a.e.API_PRIORITY_OTHER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int F(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G(u1 u1Var) {
        boolean z10;
        f fVar;
        f fVar2;
        synchronized (this.f23648d) {
            z10 = !this.f23652h.f23677x0 || this.f23651g || u1Var.J <= 2 || (H(u1Var) && (t8.r0.f26744a < 32 || (fVar2 = this.f23653i) == null || !fVar2.e())) || (t8.r0.f26744a >= 32 && (fVar = this.f23653i) != null && fVar.e() && this.f23653i.c() && this.f23653i.d() && this.f23653i.a(this.f23654j, u1Var));
        }
        return z10;
    }

    private static boolean H(u1 u1Var) {
        String str = u1Var.f26517w;
        if (str == null) {
            return false;
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    protected static boolean I(int i10, boolean z10) {
        int F = r3.F(i10);
        return F == 4 || (z10 && F == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List J(d dVar, boolean z10, int i10, d1 d1Var, int[] iArr) {
        return b.m(i10, d1Var, dVar, iArr, z10, new eb.p() { // from class: q8.l
            @Override // eb.p
            public final boolean apply(Object obj) {
                boolean G;
                G = m.this.G((u1) obj);
                return G;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List K(d dVar, String str, int i10, d1 d1Var, int[] iArr) {
        return g.m(i10, d1Var, dVar, iArr, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List L(d dVar, int[] iArr, int i10, d1 d1Var, int[] iArr2) {
        return i.p(i10, d1Var, dVar, iArr2, iArr[i10]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int M(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int N(Integer num, Integer num2) {
        return 0;
    }

    private static void O(t.a aVar, int[][][] iArr, s3[] s3VarArr, r[] rVarArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int e10 = aVar.e(i12);
            r rVar = rVarArr[i12];
            if ((e10 == 1 || e10 == 2) && rVar != null && R(iArr[i12], aVar.f(i12), rVar)) {
                if (e10 == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else {
                    if (i10 != -1) {
                        z10 = false;
                        break;
                    }
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (i11 != -1 && i10 != -1) {
            z11 = true;
        }
        if (z10 && z11) {
            s3 s3Var = new s3(true);
            s3VarArr[i11] = s3Var;
            s3VarArr[i10] = s3Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        boolean z10;
        f fVar;
        synchronized (this.f23648d) {
            z10 = this.f23652h.f23677x0 && !this.f23651g && t8.r0.f26744a >= 32 && (fVar = this.f23653i) != null && fVar.e();
        }
        if (z10) {
            c();
        }
    }

    protected static String Q(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static boolean R(int[][] iArr, f1 f1Var, r rVar) {
        if (rVar == null) {
            return false;
        }
        int d10 = f1Var.d(rVar.d());
        for (int i10 = 0; i10 < rVar.length(); i10++) {
            if (r3.m(iArr[d10][rVar.b(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private <T extends h<T>> Pair<r.a, Integer> W(int i10, t.a aVar, int[][][] iArr, h.a<T> aVar2, Comparator<List<T>> comparator) {
        int i11;
        RandomAccess randomAccess;
        t.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int d10 = aVar.d();
        int i12 = 0;
        while (i12 < d10) {
            if (i10 == aVar3.e(i12)) {
                f1 f10 = aVar3.f(i12);
                for (int i13 = 0; i13 < f10.f28314a; i13++) {
                    d1 c10 = f10.c(i13);
                    List<T> a10 = aVar2.a(i12, c10, iArr[i12][i13]);
                    boolean[] zArr = new boolean[c10.f28288a];
                    int i14 = 0;
                    while (i14 < c10.f28288a) {
                        T t10 = a10.get(i14);
                        int b10 = t10.b();
                        if (zArr[i14] || b10 == 0) {
                            i11 = d10;
                        } else {
                            if (b10 == 1) {
                                randomAccess = com.google.common.collect.w.w(t10);
                                i11 = d10;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t10);
                                int i15 = i14 + 1;
                                while (i15 < c10.f28288a) {
                                    T t11 = a10.get(i15);
                                    int i16 = d10;
                                    if (t11.b() == 2 && t10.h(t11)) {
                                        arrayList2.add(t11);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    d10 = i16;
                                }
                                i11 = d10;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i14++;
                        d10 = i11;
                    }
                }
            }
            i12++;
            aVar3 = aVar;
            d10 = d10;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((h) list.get(i17)).f23704c;
        }
        h hVar = (h) list.get(0);
        return Pair.create(new r.a(hVar.f23703b, iArr2), Integer.valueOf(hVar.f23702a));
    }

    private static void y(t.a aVar, d dVar, r.a[] aVarArr) {
        int d10 = aVar.d();
        for (int i10 = 0; i10 < d10; i10++) {
            f1 f10 = aVar.f(i10);
            if (dVar.N(i10, f10)) {
                e M = dVar.M(i10, f10);
                aVarArr[i10] = (M == null || M.f23685b.length == 0) ? null : new r.a(f10.c(M.f23684a), M.f23685b, M.f23687d);
            }
        }
    }

    private static void z(t.a aVar, y yVar, r.a[] aVarArr) {
        int d10 = aVar.d();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < d10; i10++) {
            A(aVar.f(i10), yVar, hashMap);
        }
        A(aVar.h(), yVar, hashMap);
        for (int i11 = 0; i11 < d10; i11++) {
            w wVar = (w) hashMap.get(Integer.valueOf(aVar.e(i11)));
            if (wVar != null) {
                aVarArr[i11] = (wVar.f23734b.isEmpty() || aVar.f(i11).d(wVar.f23733a) == -1) ? null : new r.a(wVar.f23733a, hb.e.l(wVar.f23734b));
            }
        }
    }

    protected r.a[] S(t.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        String str;
        int d10 = aVar.d();
        r.a[] aVarArr = new r.a[d10];
        Pair<r.a, Integer> X = X(aVar, iArr, iArr2, dVar);
        if (X != null) {
            aVarArr[((Integer) X.second).intValue()] = (r.a) X.first;
        }
        Pair<r.a, Integer> T = T(aVar, iArr, iArr2, dVar);
        if (T != null) {
            aVarArr[((Integer) T.second).intValue()] = (r.a) T.first;
        }
        if (T == null) {
            str = null;
        } else {
            Object obj = T.first;
            str = ((r.a) obj).f23717a.d(((r.a) obj).f23718b[0]).f26508c;
        }
        Pair<r.a, Integer> V = V(aVar, iArr, dVar, str);
        if (V != null) {
            aVarArr[((Integer) V.second).intValue()] = (r.a) V.first;
        }
        for (int i10 = 0; i10 < d10; i10++) {
            int e10 = aVar.e(i10);
            if (e10 != 2 && e10 != 1 && e10 != 3) {
                aVarArr[i10] = U(e10, aVar.f(i10), iArr[i10], dVar);
            }
        }
        return aVarArr;
    }

    protected Pair<r.a, Integer> T(t.a aVar, int[][][] iArr, int[] iArr2, final d dVar) {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.d()) {
                if (2 == aVar.e(i10) && aVar.f(i10).f28314a > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return W(1, aVar, iArr, new h.a() { // from class: q8.j
            @Override // q8.m.h.a
            public final List a(int i11, d1 d1Var, int[] iArr3) {
                List J;
                J = m.this.J(dVar, z10, i11, d1Var, iArr3);
                return J;
            }
        }, new Comparator() { // from class: q8.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.b.i((List) obj, (List) obj2);
            }
        });
    }

    protected r.a U(int i10, f1 f1Var, int[][] iArr, d dVar) {
        d1 d1Var = null;
        c cVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < f1Var.f28314a; i12++) {
            d1 c10 = f1Var.c(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < c10.f28288a; i13++) {
                if (I(iArr2[i13], dVar.f23678y0)) {
                    c cVar2 = new c(c10.d(i13), iArr2[i13]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        d1Var = c10;
                        i11 = i13;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (d1Var == null) {
            return null;
        }
        return new r.a(d1Var, i11);
    }

    protected Pair<r.a, Integer> V(t.a aVar, int[][][] iArr, final d dVar, final String str) {
        return W(3, aVar, iArr, new h.a() { // from class: q8.d
            @Override // q8.m.h.a
            public final List a(int i10, d1 d1Var, int[] iArr2) {
                List K;
                K = m.K(m.d.this, str, i10, d1Var, iArr2);
                return K;
            }
        }, new Comparator() { // from class: q8.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.g.i((List) obj, (List) obj2);
            }
        });
    }

    protected Pair<r.a, Integer> X(t.a aVar, int[][][] iArr, final int[] iArr2, final d dVar) {
        return W(2, aVar, iArr, new h.a() { // from class: q8.h
            @Override // q8.m.h.a
            public final List a(int i10, d1 d1Var, int[] iArr3) {
                List L;
                L = m.L(m.d.this, iArr2, i10, d1Var, iArr3);
                return L;
            }
        }, new Comparator() { // from class: q8.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.i.o((List) obj, (List) obj2);
            }
        });
    }

    @Override // q8.a0
    public boolean d() {
        return true;
    }

    @Override // q8.a0
    public void f() {
        f fVar;
        synchronized (this.f23648d) {
            if (t8.r0.f26744a >= 32 && (fVar = this.f23653i) != null) {
                fVar.f();
            }
        }
        super.f();
    }

    @Override // q8.a0
    public void h(v6.e eVar) {
        boolean z10;
        synchronized (this.f23648d) {
            z10 = !this.f23654j.equals(eVar);
            this.f23654j = eVar;
        }
        if (z10) {
            P();
        }
    }

    @Override // q8.t
    protected final Pair<s3[], r[]> l(t.a aVar, int[][][] iArr, int[] iArr2, a0.b bVar, d4 d4Var) {
        d dVar;
        f fVar;
        synchronized (this.f23648d) {
            dVar = this.f23652h;
            if (dVar.f23677x0 && t8.r0.f26744a >= 32 && (fVar = this.f23653i) != null) {
                fVar.b(this, (Looper) t8.a.i(Looper.myLooper()));
            }
        }
        int d10 = aVar.d();
        r.a[] S = S(aVar, iArr, iArr2, dVar);
        z(aVar, dVar, S);
        y(aVar, dVar, S);
        for (int i10 = 0; i10 < d10; i10++) {
            int e10 = aVar.e(i10);
            if (dVar.L(i10) || dVar.K.contains(Integer.valueOf(e10))) {
                S[i10] = null;
            }
        }
        r[] a10 = this.f23650f.a(S, a(), bVar, d4Var);
        s3[] s3VarArr = new s3[d10];
        for (int i11 = 0; i11 < d10; i11++) {
            boolean z10 = true;
            if ((dVar.L(i11) || dVar.K.contains(Integer.valueOf(aVar.e(i11)))) || (aVar.e(i11) != -2 && a10[i11] == null)) {
                z10 = false;
            }
            s3VarArr[i11] = z10 ? s3.f26462b : null;
        }
        if (dVar.f23679z0) {
            O(aVar, iArr, s3VarArr, a10);
        }
        return Pair.create(s3VarArr, a10);
    }
}
