package p307q8;

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
import com.google.android.gms.common.api.C5101a;
import com.google.common.collect.AbstractC5891o;
import com.google.common.collect.AbstractC5898r0;
import com.google.common.collect.AbstractC5907w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import p082eb.InterfaceC7160p;
import p137hb.C7690e;
import p307q8.AbstractC10314t;
import p307q8.C10293a;
import p307q8.C10307m;
import p307q8.C10319y;
import p307q8.InterfaceC10312r;
import p361t6.AbstractC11018d4;
import p361t6.C11100s3;
import p361t6.C11108u1;
import p361t6.InterfaceC11076o;
import p361t6.InterfaceC11095r3;
import p363t8.C11137a;
import p363t8.C11141c;
import p363t8.C11172r0;
import p363t8.C11173s;
import p396v6.C11639e;
import p396v6.ExecutorC11658n0;
import p397v7.C11694d1;
import p397v7.C11700f1;
import p397v7.InterfaceC11684a0;

/* renamed from: q8.m */
/* loaded from: classes.dex */
public class C10307m extends AbstractC10314t {

    /* renamed from: k */
    private static final AbstractC5898r0<Integer> f25614k = AbstractC5898r0.m15039a(new Comparator() { // from class: q8.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m30903M;
            m30903M = C10307m.m30903M((Integer) obj, (Integer) obj2);
            return m30903M;
        }
    });

    /* renamed from: l */
    private static final AbstractC5898r0<Integer> f25615l = AbstractC5898r0.m15039a(new Comparator() { // from class: q8.g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m30904N;
            m30904N = C10307m.m30904N((Integer) obj, (Integer) obj2);
            return m30904N;
        }
    });

    /* renamed from: d */
    private final Object f25616d;

    /* renamed from: e */
    public final Context f25617e;

    /* renamed from: f */
    private final InterfaceC10312r.b f25618f;

    /* renamed from: g */
    private final boolean f25619g;

    /* renamed from: h */
    private d f25620h;

    /* renamed from: i */
    private f f25621i;

    /* renamed from: j */
    private C11639e f25622j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q8.m$b */
    /* loaded from: classes.dex */
    public static final class b extends h<b> implements Comparable<b> {

        /* renamed from: A */
        private final boolean f25623A;

        /* renamed from: B */
        private final int f25624B;

        /* renamed from: C */
        private final int f25625C;

        /* renamed from: D */
        private final int f25626D;

        /* renamed from: E */
        private final int f25627E;

        /* renamed from: F */
        private final boolean f25628F;

        /* renamed from: G */
        private final boolean f25629G;

        /* renamed from: e */
        private final int f25630e;

        /* renamed from: f */
        private final boolean f25631f;

        /* renamed from: r */
        private final String f25632r;

        /* renamed from: s */
        private final d f25633s;

        /* renamed from: t */
        private final boolean f25634t;

        /* renamed from: u */
        private final int f25635u;

        /* renamed from: v */
        private final int f25636v;

        /* renamed from: w */
        private final int f25637w;

        /* renamed from: x */
        private final boolean f25638x;

        /* renamed from: y */
        private final int f25639y;

        /* renamed from: z */
        private final int f25640z;

        public b(int i10, C11694d1 c11694d1, int i11, d dVar, int i12, boolean z10, InterfaceC7160p<C11108u1> interfaceC7160p) {
            super(i10, c11694d1, i11);
            int i13;
            int i14;
            int i15;
            this.f25633s = dVar;
            this.f25632r = C10307m.m30907Q(this.f25718d.f28788c);
            this.f25634t = C10307m.m30899I(i12, false);
            int i16 = 0;
            while (true) {
                int size = dVar.f25804y.size();
                i13 = C5101a.e.API_PRIORITY_OTHER;
                if (i16 >= size) {
                    i14 = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                } else {
                    i14 = C10307m.m30892B(this.f25718d, dVar.f25804y.get(i16), false);
                    if (i14 > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f25636v = i16;
            this.f25635u = i14;
            this.f25637w = C10307m.m30895E(this.f25718d.f28790e, dVar.f25805z);
            C11108u1 c11108u1 = this.f25718d;
            int i17 = c11108u1.f28790e;
            this.f25638x = i17 == 0 || (i17 & 1) != 0;
            this.f25623A = (c11108u1.f28789d & 1) != 0;
            int i18 = c11108u1.f28776J;
            this.f25624B = i18;
            this.f25625C = c11108u1.f28777K;
            int i19 = c11108u1.f28793s;
            this.f25626D = i19;
            this.f25631f = (i19 == -1 || i19 <= dVar.f25781B) && (i18 == -1 || i18 <= dVar.f25780A) && interfaceC7160p.apply(c11108u1);
            String[] m34925h0 = C11172r0.m34925h0();
            int i20 = 0;
            while (true) {
                if (i20 >= m34925h0.length) {
                    i15 = 0;
                    i20 = Integer.MAX_VALUE;
                    break;
                } else {
                    i15 = C10307m.m30892B(this.f25718d, m34925h0[i20], false);
                    if (i15 > 0) {
                        break;
                    } else {
                        i20++;
                    }
                }
            }
            this.f25639y = i20;
            this.f25640z = i15;
            int i21 = 0;
            while (true) {
                if (i21 < dVar.f25782C.size()) {
                    String str = this.f25718d.f28797w;
                    if (str != null && str.equals(dVar.f25782C.get(i21))) {
                        i13 = i21;
                        break;
                    }
                    i21++;
                } else {
                    break;
                }
            }
            this.f25627E = i13;
            this.f25628F = InterfaceC11095r3.m34455j(i12) == 128;
            this.f25629G = InterfaceC11095r3.m34460t(i12) == 64;
            this.f25630e = m30932n(i12, z10);
        }

        /* renamed from: i */
        public static int m30930i(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        /* renamed from: m */
        public static AbstractC5907w<b> m30931m(int i10, C11694d1 c11694d1, d dVar, int[] iArr, boolean z10, InterfaceC7160p<C11108u1> interfaceC7160p) {
            AbstractC5907w.a m15077p = AbstractC5907w.m15077p();
            for (int i11 = 0; i11 < c11694d1.f30658a; i11++) {
                m15077p.mo14724a(new b(i10, c11694d1, i11, dVar, iArr[i11], z10, interfaceC7160p));
            }
            return m15077p.m15094k();
        }

        /* renamed from: n */
        private int m30932n(int i10, boolean z10) {
            if (!C10307m.m30899I(i10, this.f25633s.f25676y0)) {
                return 0;
            }
            if (!this.f25631f && !this.f25633s.f25670s0) {
                return 0;
            }
            if (C10307m.m30899I(i10, false) && this.f25631f && this.f25718d.f28793s != -1) {
                d dVar = this.f25633s;
                if (!dVar.f25788I && !dVar.f25787H && (dVar.f25663A0 || !z10)) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // p307q8.C10307m.h
        /* renamed from: b */
        public int mo30933b() {
            return this.f25630e;
        }

        @Override // java.lang.Comparable
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            AbstractC5898r0 mo15026f = (this.f25631f && this.f25634t) ? C10307m.f25614k : C10307m.f25614k.mo15026f();
            AbstractC5891o mo15021f = AbstractC5891o.m15018j().mo15022g(this.f25634t, bVar.f25634t).mo15021f(Integer.valueOf(this.f25636v), Integer.valueOf(bVar.f25636v), AbstractC5898r0.m15040c().mo15026f()).mo15019d(this.f25635u, bVar.f25635u).mo15019d(this.f25637w, bVar.f25637w).mo15022g(this.f25623A, bVar.f25623A).mo15022g(this.f25638x, bVar.f25638x).mo15021f(Integer.valueOf(this.f25639y), Integer.valueOf(bVar.f25639y), AbstractC5898r0.m15040c().mo15026f()).mo15019d(this.f25640z, bVar.f25640z).mo15022g(this.f25631f, bVar.f25631f).mo15021f(Integer.valueOf(this.f25627E), Integer.valueOf(bVar.f25627E), AbstractC5898r0.m15040c().mo15026f()).mo15021f(Integer.valueOf(this.f25626D), Integer.valueOf(bVar.f25626D), this.f25633s.f25787H ? C10307m.f25614k.mo15026f() : C10307m.f25615l).mo15022g(this.f25628F, bVar.f25628F).mo15022g(this.f25629G, bVar.f25629G).mo15021f(Integer.valueOf(this.f25624B), Integer.valueOf(bVar.f25624B), mo15026f).mo15021f(Integer.valueOf(this.f25625C), Integer.valueOf(bVar.f25625C), mo15026f);
            Integer valueOf = Integer.valueOf(this.f25626D);
            Integer valueOf2 = Integer.valueOf(bVar.f25626D);
            if (!C11172r0.m34914c(this.f25632r, bVar.f25632r)) {
                mo15026f = C10307m.f25615l;
            }
            return mo15021f.mo15021f(valueOf, valueOf2, mo15026f).mo15024i();
        }

        @Override // p307q8.C10307m.h
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean mo30934h(b bVar) {
            int i10;
            String str;
            int i11;
            d dVar = this.f25633s;
            if ((dVar.f25673v0 || ((i11 = this.f25718d.f28776J) != -1 && i11 == bVar.f25718d.f28776J)) && (dVar.f25671t0 || ((str = this.f25718d.f28797w) != null && TextUtils.equals(str, bVar.f25718d.f28797w)))) {
                d dVar2 = this.f25633s;
                if ((dVar2.f25672u0 || ((i10 = this.f25718d.f28777K) != -1 && i10 == bVar.f25718d.f28777K)) && (dVar2.f25674w0 || (this.f25628F == bVar.f25628F && this.f25629G == bVar.f25629G))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q8.m$c */
    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: a */
        private final boolean f25641a;

        /* renamed from: b */
        private final boolean f25642b;

        public c(C11108u1 c11108u1, int i10) {
            this.f25641a = (c11108u1.f28789d & 1) != 0;
            this.f25642b = C10307m.m30899I(i10, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return AbstractC5891o.m15018j().mo15022g(this.f25642b, cVar.f25642b).mo15022g(this.f25641a, cVar.f25641a).mo15024i();
        }
    }

    /* renamed from: q8.m$d */
    /* loaded from: classes.dex */
    public static final class d extends C10319y {

        /* renamed from: D0 */
        public static final d f25643D0;

        /* renamed from: E0 */
        @Deprecated
        public static final d f25644E0;

        /* renamed from: F0 */
        private static final String f25645F0;

        /* renamed from: G0 */
        private static final String f25646G0;

        /* renamed from: H0 */
        private static final String f25647H0;

        /* renamed from: I0 */
        private static final String f25648I0;

        /* renamed from: J0 */
        private static final String f25649J0;

        /* renamed from: K0 */
        private static final String f25650K0;

        /* renamed from: L0 */
        private static final String f25651L0;

        /* renamed from: M0 */
        private static final String f25652M0;

        /* renamed from: N0 */
        private static final String f25653N0;

        /* renamed from: O0 */
        private static final String f25654O0;

        /* renamed from: P0 */
        private static final String f25655P0;

        /* renamed from: Q0 */
        private static final String f25656Q0;

        /* renamed from: R0 */
        private static final String f25657R0;

        /* renamed from: S0 */
        private static final String f25658S0;

        /* renamed from: T0 */
        private static final String f25659T0;

        /* renamed from: U0 */
        private static final String f25660U0;

        /* renamed from: V0 */
        private static final String f25661V0;

        /* renamed from: W0 */
        public static final InterfaceC11076o.a<d> f25662W0;

        /* renamed from: A0 */
        public final boolean f25663A0;

        /* renamed from: B0 */
        private final SparseArray<Map<C11700f1, e>> f25664B0;

        /* renamed from: C0 */
        private final SparseBooleanArray f25665C0;

        /* renamed from: o0 */
        public final boolean f25666o0;

        /* renamed from: p0 */
        public final boolean f25667p0;

        /* renamed from: q0 */
        public final boolean f25668q0;

        /* renamed from: r0 */
        public final boolean f25669r0;

        /* renamed from: s0 */
        public final boolean f25670s0;

        /* renamed from: t0 */
        public final boolean f25671t0;

        /* renamed from: u0 */
        public final boolean f25672u0;

        /* renamed from: v0 */
        public final boolean f25673v0;

        /* renamed from: w0 */
        public final boolean f25674w0;

        /* renamed from: x0 */
        public final boolean f25675x0;

        /* renamed from: y0 */
        public final boolean f25676y0;

        /* renamed from: z0 */
        public final boolean f25677z0;

        /* renamed from: q8.m$d$a */
        /* loaded from: classes.dex */
        public static final class a extends C10319y.a {

            /* renamed from: A */
            private boolean f25678A;

            /* renamed from: B */
            private boolean f25679B;

            /* renamed from: C */
            private boolean f25680C;

            /* renamed from: D */
            private boolean f25681D;

            /* renamed from: E */
            private boolean f25682E;

            /* renamed from: F */
            private boolean f25683F;

            /* renamed from: G */
            private boolean f25684G;

            /* renamed from: H */
            private boolean f25685H;

            /* renamed from: I */
            private boolean f25686I;

            /* renamed from: J */
            private boolean f25687J;

            /* renamed from: K */
            private boolean f25688K;

            /* renamed from: L */
            private boolean f25689L;

            /* renamed from: M */
            private boolean f25690M;

            /* renamed from: N */
            private final SparseArray<Map<C11700f1, e>> f25691N;

            /* renamed from: O */
            private final SparseBooleanArray f25692O;

            @Deprecated
            public a() {
                this.f25691N = new SparseArray<>();
                this.f25692O = new SparseBooleanArray();
                m30985Z();
            }

            public a(Context context) {
                super(context);
                this.f25691N = new SparseArray<>();
                this.f25692O = new SparseBooleanArray();
                m30985Z();
            }

            private a(Bundle bundle) {
                super(bundle);
                m30985Z();
                d dVar = d.f25643D0;
                m31005n0(bundle.getBoolean(d.f25645F0, dVar.f25666o0));
                m31000i0(bundle.getBoolean(d.f25646G0, dVar.f25667p0));
                m31001j0(bundle.getBoolean(d.f25647H0, dVar.f25668q0));
                m30999h0(bundle.getBoolean(d.f25659T0, dVar.f25669r0));
                m31003l0(bundle.getBoolean(d.f25648I0, dVar.f25670s0));
                m30996e0(bundle.getBoolean(d.f25649J0, dVar.f25671t0));
                m30997f0(bundle.getBoolean(d.f25650K0, dVar.f25672u0));
                m30994c0(bundle.getBoolean(d.f25651L0, dVar.f25673v0));
                m30995d0(bundle.getBoolean(d.f25660U0, dVar.f25674w0));
                m31002k0(bundle.getBoolean(d.f25661V0, dVar.f25675x0));
                m31004m0(bundle.getBoolean(d.f25652M0, dVar.f25676y0));
                m31008r0(bundle.getBoolean(d.f25653N0, dVar.f25677z0));
                m30998g0(bundle.getBoolean(d.f25654O0, dVar.f25663A0));
                this.f25691N = new SparseArray<>();
                m30987q0(bundle);
                this.f25692O = m30986a0(bundle.getIntArray(d.f25658S0));
            }

            private a(d dVar) {
                super(dVar);
                this.f25678A = dVar.f25666o0;
                this.f25679B = dVar.f25667p0;
                this.f25680C = dVar.f25668q0;
                this.f25681D = dVar.f25669r0;
                this.f25682E = dVar.f25670s0;
                this.f25683F = dVar.f25671t0;
                this.f25684G = dVar.f25672u0;
                this.f25685H = dVar.f25673v0;
                this.f25686I = dVar.f25674w0;
                this.f25687J = dVar.f25675x0;
                this.f25688K = dVar.f25676y0;
                this.f25689L = dVar.f25677z0;
                this.f25690M = dVar.f25663A0;
                this.f25691N = m30984Y(dVar.f25664B0);
                this.f25692O = dVar.f25665C0.clone();
            }

            /* renamed from: Y */
            private static SparseArray<Map<C11700f1, e>> m30984Y(SparseArray<Map<C11700f1, e>> sparseArray) {
                SparseArray<Map<C11700f1, e>> sparseArray2 = new SparseArray<>();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            /* renamed from: Z */
            private void m30985Z() {
                this.f25678A = true;
                this.f25679B = false;
                this.f25680C = true;
                this.f25681D = false;
                this.f25682E = true;
                this.f25683F = false;
                this.f25684G = false;
                this.f25685H = false;
                this.f25686I = false;
                this.f25687J = true;
                this.f25688K = true;
                this.f25689L = false;
                this.f25690M = true;
            }

            /* renamed from: a0 */
            private SparseBooleanArray m30986a0(int[] iArr) {
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
            /* renamed from: q0 */
            private void m30987q0(Bundle bundle) {
                int[] intArray = bundle.getIntArray(d.f25655P0);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(d.f25656Q0);
                AbstractC5907w m15081v = parcelableArrayList == null ? AbstractC5907w.m15081v() : C11141c.m34616b(C11700f1.f30691f, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(d.f25657R0);
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : C11141c.m34617c(e.f25696s, sparseParcelableArray);
                if (intArray == null || intArray.length != m15081v.size()) {
                    return;
                }
                for (int i10 = 0; i10 < intArray.length; i10++) {
                    m31007p0(intArray[i10], (C11700f1) m15081v.get(i10), (e) sparseArray.get(i10));
                }
            }

            @Override // p307q8.C10319y.a
            /* renamed from: X, reason: merged with bridge method [inline-methods] */
            public d mo30988A() {
                return new d(this);
            }

            /* renamed from: b0 */
            protected a m30993b0(C10319y c10319y) {
                super.m31107D(c10319y);
                return this;
            }

            /* renamed from: c0 */
            public a m30994c0(boolean z10) {
                this.f25685H = z10;
                return this;
            }

            /* renamed from: d0 */
            public a m30995d0(boolean z10) {
                this.f25686I = z10;
                return this;
            }

            /* renamed from: e0 */
            public a m30996e0(boolean z10) {
                this.f25683F = z10;
                return this;
            }

            /* renamed from: f0 */
            public a m30997f0(boolean z10) {
                this.f25684G = z10;
                return this;
            }

            /* renamed from: g0 */
            public a m30998g0(boolean z10) {
                this.f25690M = z10;
                return this;
            }

            /* renamed from: h0 */
            public a m30999h0(boolean z10) {
                this.f25681D = z10;
                return this;
            }

            /* renamed from: i0 */
            public a m31000i0(boolean z10) {
                this.f25679B = z10;
                return this;
            }

            /* renamed from: j0 */
            public a m31001j0(boolean z10) {
                this.f25680C = z10;
                return this;
            }

            /* renamed from: k0 */
            public a m31002k0(boolean z10) {
                this.f25687J = z10;
                return this;
            }

            /* renamed from: l0 */
            public a m31003l0(boolean z10) {
                this.f25682E = z10;
                return this;
            }

            /* renamed from: m0 */
            public a m31004m0(boolean z10) {
                this.f25688K = z10;
                return this;
            }

            /* renamed from: n0 */
            public a m31005n0(boolean z10) {
                this.f25678A = z10;
                return this;
            }

            @Override // p307q8.C10319y.a
            /* renamed from: o0, reason: merged with bridge method [inline-methods] */
            public a mo30989E(Context context) {
                super.mo30989E(context);
                return this;
            }

            @Deprecated
            /* renamed from: p0 */
            public a m31007p0(int i10, C11700f1 c11700f1, e eVar) {
                Map<C11700f1, e> map = this.f25691N.get(i10);
                if (map == null) {
                    map = new HashMap<>();
                    this.f25691N.put(i10, map);
                }
                if (map.containsKey(c11700f1) && C11172r0.m34914c(map.get(c11700f1), eVar)) {
                    return this;
                }
                map.put(c11700f1, eVar);
                return this;
            }

            /* renamed from: r0 */
            public a m31008r0(boolean z10) {
                this.f25689L = z10;
                return this;
            }

            @Override // p307q8.C10319y.a
            /* renamed from: s0, reason: merged with bridge method [inline-methods] */
            public a mo30990G(int i10, int i11, boolean z10) {
                super.mo30990G(i10, i11, z10);
                return this;
            }

            @Override // p307q8.C10319y.a
            /* renamed from: t0, reason: merged with bridge method [inline-methods] */
            public a mo30991H(Context context, boolean z10) {
                super.mo30991H(context, z10);
                return this;
            }
        }

        static {
            d mo30988A = new a().mo30988A();
            f25643D0 = mo30988A;
            f25644E0 = mo30988A;
            f25645F0 = C11172r0.m34945r0(AdError.NETWORK_ERROR_CODE);
            f25646G0 = C11172r0.m34945r0(AdError.NO_FILL_ERROR_CODE);
            f25647H0 = C11172r0.m34945r0(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);
            f25648I0 = C11172r0.m34945r0(1003);
            f25649J0 = C11172r0.m34945r0(1004);
            f25650K0 = C11172r0.m34945r0(1005);
            f25651L0 = C11172r0.m34945r0(1006);
            f25652M0 = C11172r0.m34945r0(1007);
            f25653N0 = C11172r0.m34945r0(1008);
            f25654O0 = C11172r0.m34945r0(1009);
            f25655P0 = C11172r0.m34945r0(1010);
            f25656Q0 = C11172r0.m34945r0(1011);
            f25657R0 = C11172r0.m34945r0(1012);
            f25658S0 = C11172r0.m34945r0(1013);
            f25659T0 = C11172r0.m34945r0(1014);
            f25660U0 = C11172r0.m34945r0(1015);
            f25661V0 = C11172r0.m34945r0(1016);
            f25662W0 = new InterfaceC11076o.a() { // from class: q8.n
                @Override // p361t6.InterfaceC11076o.a
                /* renamed from: a */
                public final InterfaceC11076o mo22759a(Bundle bundle) {
                    C10307m.d m30947O;
                    m30947O = C10307m.d.m30947O(bundle);
                    return m30947O;
                }
            };
        }

        private d(a aVar) {
            super(aVar);
            this.f25666o0 = aVar.f25678A;
            this.f25667p0 = aVar.f25679B;
            this.f25668q0 = aVar.f25680C;
            this.f25669r0 = aVar.f25681D;
            this.f25670s0 = aVar.f25682E;
            this.f25671t0 = aVar.f25683F;
            this.f25672u0 = aVar.f25684G;
            this.f25673v0 = aVar.f25685H;
            this.f25674w0 = aVar.f25686I;
            this.f25675x0 = aVar.f25687J;
            this.f25676y0 = aVar.f25688K;
            this.f25677z0 = aVar.f25689L;
            this.f25663A0 = aVar.f25690M;
            this.f25664B0 = aVar.f25691N;
            this.f25665C0 = aVar.f25692O;
        }

        /* renamed from: F */
        private static boolean m30942F(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
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

        /* renamed from: G */
        private static boolean m30943G(SparseArray<Map<C11700f1, e>> sparseArray, SparseArray<Map<C11700f1, e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !m30944H(sparseArray.valueAt(i10), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: H */
        private static boolean m30944H(Map<C11700f1, e> map, Map<C11700f1, e> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<C11700f1, e> entry : map.entrySet()) {
                C11700f1 key = entry.getKey();
                if (!map2.containsKey(key) || !C11172r0.m34914c(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: J */
        public static d m30945J(Context context) {
            return new a(context).mo30988A();
        }

        /* renamed from: K */
        private static int[] m30946K(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
                iArr[i10] = sparseBooleanArray.keyAt(i10);
            }
            return iArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: O */
        public static /* synthetic */ d m30947O(Bundle bundle) {
            return new a(bundle).mo30988A();
        }

        /* renamed from: P */
        private static void m30948P(Bundle bundle, SparseArray<Map<C11700f1, e>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                int keyAt = sparseArray.keyAt(i10);
                for (Map.Entry<C11700f1, e> entry : sparseArray.valueAt(i10).entrySet()) {
                    e value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(keyAt));
                }
                bundle.putIntArray(f25655P0, C7690e.m23421l(arrayList));
                bundle.putParcelableArrayList(f25656Q0, C11141c.m34618d(arrayList2));
                bundle.putSparseParcelableArray(f25657R0, C11141c.m34619e(sparseArray2));
            }
        }

        /* renamed from: I */
        public a m30965I() {
            return new a();
        }

        /* renamed from: L */
        public boolean m30966L(int i10) {
            return this.f25665C0.get(i10);
        }

        @Deprecated
        /* renamed from: M */
        public e m30967M(int i10, C11700f1 c11700f1) {
            Map<C11700f1, e> map = this.f25664B0.get(i10);
            if (map != null) {
                return map.get(c11700f1);
            }
            return null;
        }

        @Deprecated
        /* renamed from: N */
        public boolean m30968N(int i10, C11700f1 c11700f1) {
            Map<C11700f1, e> map = this.f25664B0.get(i10);
            return map != null && map.containsKey(c11700f1);
        }

        @Override // p307q8.C10319y, p361t6.InterfaceC11076o
        /* renamed from: a */
        public Bundle mo22762a() {
            Bundle mo22762a = super.mo22762a();
            mo22762a.putBoolean(f25645F0, this.f25666o0);
            mo22762a.putBoolean(f25646G0, this.f25667p0);
            mo22762a.putBoolean(f25647H0, this.f25668q0);
            mo22762a.putBoolean(f25659T0, this.f25669r0);
            mo22762a.putBoolean(f25648I0, this.f25670s0);
            mo22762a.putBoolean(f25649J0, this.f25671t0);
            mo22762a.putBoolean(f25650K0, this.f25672u0);
            mo22762a.putBoolean(f25651L0, this.f25673v0);
            mo22762a.putBoolean(f25660U0, this.f25674w0);
            mo22762a.putBoolean(f25661V0, this.f25675x0);
            mo22762a.putBoolean(f25652M0, this.f25676y0);
            mo22762a.putBoolean(f25653N0, this.f25677z0);
            mo22762a.putBoolean(f25654O0, this.f25663A0);
            m30948P(mo22762a, this.f25664B0);
            mo22762a.putIntArray(f25658S0, m30946K(this.f25665C0));
            return mo22762a;
        }

        @Override // p307q8.C10319y
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return super.equals(dVar) && this.f25666o0 == dVar.f25666o0 && this.f25667p0 == dVar.f25667p0 && this.f25668q0 == dVar.f25668q0 && this.f25669r0 == dVar.f25669r0 && this.f25670s0 == dVar.f25670s0 && this.f25671t0 == dVar.f25671t0 && this.f25672u0 == dVar.f25672u0 && this.f25673v0 == dVar.f25673v0 && this.f25674w0 == dVar.f25674w0 && this.f25675x0 == dVar.f25675x0 && this.f25676y0 == dVar.f25676y0 && this.f25677z0 == dVar.f25677z0 && this.f25663A0 == dVar.f25663A0 && m30942F(this.f25665C0, dVar.f25665C0) && m30943G(this.f25664B0, dVar.f25664B0);
        }

        @Override // p307q8.C10319y
        public int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f25666o0 ? 1 : 0)) * 31) + (this.f25667p0 ? 1 : 0)) * 31) + (this.f25668q0 ? 1 : 0)) * 31) + (this.f25669r0 ? 1 : 0)) * 31) + (this.f25670s0 ? 1 : 0)) * 31) + (this.f25671t0 ? 1 : 0)) * 31) + (this.f25672u0 ? 1 : 0)) * 31) + (this.f25673v0 ? 1 : 0)) * 31) + (this.f25674w0 ? 1 : 0)) * 31) + (this.f25675x0 ? 1 : 0)) * 31) + (this.f25676y0 ? 1 : 0)) * 31) + (this.f25677z0 ? 1 : 0)) * 31) + (this.f25663A0 ? 1 : 0);
        }
    }

    /* renamed from: q8.m$e */
    /* loaded from: classes.dex */
    public static final class e implements InterfaceC11076o {

        /* renamed from: e */
        private static final String f25693e = C11172r0.m34945r0(0);

        /* renamed from: f */
        private static final String f25694f = C11172r0.m34945r0(1);

        /* renamed from: r */
        private static final String f25695r = C11172r0.m34945r0(2);

        /* renamed from: s */
        public static final InterfaceC11076o.a<e> f25696s = new InterfaceC11076o.a() { // from class: q8.o
            @Override // p361t6.InterfaceC11076o.a
            /* renamed from: a */
            public final InterfaceC11076o mo22759a(Bundle bundle) {
                C10307m.e m31012d;
                m31012d = C10307m.e.m31012d(bundle);
                return m31012d;
            }
        };

        /* renamed from: a */
        public final int f25697a;

        /* renamed from: b */
        public final int[] f25698b;

        /* renamed from: c */
        public final int f25699c;

        /* renamed from: d */
        public final int f25700d;

        public e(int i10, int... iArr) {
            this(i10, iArr, 0);
        }

        public e(int i10, int[] iArr, int i11) {
            this.f25697a = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f25698b = copyOf;
            this.f25699c = iArr.length;
            this.f25700d = i11;
            Arrays.sort(copyOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ e m31012d(Bundle bundle) {
            int i10 = bundle.getInt(f25693e, -1);
            int[] intArray = bundle.getIntArray(f25694f);
            int i11 = bundle.getInt(f25695r, -1);
            C11137a.m34599a(i10 >= 0 && i11 >= 0);
            C11137a.m34603e(intArray);
            return new e(i10, intArray, i11);
        }

        @Override // p361t6.InterfaceC11076o
        /* renamed from: a */
        public Bundle mo22762a() {
            Bundle bundle = new Bundle();
            bundle.putInt(f25693e, this.f25697a);
            bundle.putIntArray(f25694f, this.f25698b);
            bundle.putInt(f25695r, this.f25700d);
            return bundle;
        }

        /* renamed from: c */
        public boolean m31013c(int i10) {
            for (int i11 : this.f25698b) {
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
            return this.f25697a == eVar.f25697a && Arrays.equals(this.f25698b, eVar.f25698b) && this.f25700d == eVar.f25700d;
        }

        public int hashCode() {
            return (((this.f25697a * 31) + Arrays.hashCode(this.f25698b)) * 31) + this.f25700d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q8.m$f */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        private final Spatializer f25701a;

        /* renamed from: b */
        private final boolean f25702b;

        /* renamed from: c */
        private Handler f25703c;

        /* renamed from: d */
        private Spatializer.OnSpatializerStateChangedListener f25704d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q8.m$f$a */
        /* loaded from: classes.dex */
        public class a implements Spatializer.OnSpatializerStateChangedListener {

            /* renamed from: a */
            final /* synthetic */ C10307m f25705a;

            a(f fVar, C10307m c10307m) {
                this.f25705a = c10307m;
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f25705a.m30906P();
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f25705a.m30906P();
            }
        }

        private f(Spatializer spatializer) {
            this.f25701a = spatializer;
            this.f25702b = spatializer.getImmersiveAudioLevel() != 0;
        }

        /* renamed from: g */
        public static f m31014g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new f(audioManager.getSpatializer());
        }

        /* renamed from: a */
        public boolean m31015a(C11639e c11639e, C11108u1 c11108u1) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(C11172r0.m34868G(("audio/eac3-joc".equals(c11108u1.f28797w) && c11108u1.f28776J == 16) ? 12 : c11108u1.f28776J));
            int i10 = c11108u1.f28777K;
            if (i10 != -1) {
                channelMask.setSampleRate(i10);
            }
            return this.f25701a.canBeSpatialized(c11639e.m36490c().f30301a, channelMask.build());
        }

        /* renamed from: b */
        public void m31016b(C10307m c10307m, Looper looper) {
            if (this.f25704d == null && this.f25703c == null) {
                this.f25704d = new a(this, c10307m);
                Handler handler = new Handler(looper);
                this.f25703c = handler;
                Spatializer spatializer = this.f25701a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new ExecutorC11658n0(handler), this.f25704d);
            }
        }

        /* renamed from: c */
        public boolean m31017c() {
            return this.f25701a.isAvailable();
        }

        /* renamed from: d */
        public boolean m31018d() {
            return this.f25701a.isEnabled();
        }

        /* renamed from: e */
        public boolean m31019e() {
            return this.f25702b;
        }

        /* renamed from: f */
        public void m31020f() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f25704d;
            if (onSpatializerStateChangedListener == null || this.f25703c == null) {
                return;
            }
            this.f25701a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            ((Handler) C11172r0.m34928j(this.f25703c)).removeCallbacksAndMessages(null);
            this.f25703c = null;
            this.f25704d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q8.m$g */
    /* loaded from: classes.dex */
    public static final class g extends h<g> implements Comparable<g> {

        /* renamed from: e */
        private final int f25706e;

        /* renamed from: f */
        private final boolean f25707f;

        /* renamed from: r */
        private final boolean f25708r;

        /* renamed from: s */
        private final boolean f25709s;

        /* renamed from: t */
        private final int f25710t;

        /* renamed from: u */
        private final int f25711u;

        /* renamed from: v */
        private final int f25712v;

        /* renamed from: w */
        private final int f25713w;

        /* renamed from: x */
        private final boolean f25714x;

        public g(int i10, C11694d1 c11694d1, int i11, d dVar, int i12, String str) {
            super(i10, c11694d1, i11);
            int i13;
            int i14 = 0;
            this.f25707f = C10307m.m30899I(i12, false);
            int i15 = this.f25718d.f28789d & (~dVar.f25785F);
            this.f25708r = (i15 & 1) != 0;
            this.f25709s = (i15 & 2) != 0;
            AbstractC5907w<String> m15082w = dVar.f25783D.isEmpty() ? AbstractC5907w.m15082w("") : dVar.f25783D;
            int i16 = 0;
            while (true) {
                if (i16 >= m15082w.size()) {
                    i16 = C5101a.e.API_PRIORITY_OTHER;
                    i13 = 0;
                    break;
                } else {
                    i13 = C10307m.m30892B(this.f25718d, m15082w.get(i16), dVar.f25786G);
                    if (i13 > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f25710t = i16;
            this.f25711u = i13;
            int m30895E = C10307m.m30895E(this.f25718d.f28790e, dVar.f25784E);
            this.f25712v = m30895E;
            this.f25714x = (this.f25718d.f28790e & 1088) != 0;
            int m30892B = C10307m.m30892B(this.f25718d, str, C10307m.m30907Q(str) == null);
            this.f25713w = m30892B;
            boolean z10 = i13 > 0 || (dVar.f25783D.isEmpty() && m30895E > 0) || this.f25708r || (this.f25709s && m30892B > 0);
            if (C10307m.m30899I(i12, dVar.f25676y0) && z10) {
                i14 = 1;
            }
            this.f25706e = i14;
        }

        /* renamed from: i */
        public static int m31021i(List<g> list, List<g> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        /* renamed from: m */
        public static AbstractC5907w<g> m31022m(int i10, C11694d1 c11694d1, d dVar, int[] iArr, String str) {
            AbstractC5907w.a m15077p = AbstractC5907w.m15077p();
            for (int i11 = 0; i11 < c11694d1.f30658a; i11++) {
                m15077p.mo14724a(new g(i10, c11694d1, i11, dVar, iArr[i11], str));
            }
            return m15077p.m15094k();
        }

        @Override // p307q8.C10307m.h
        /* renamed from: b */
        public int mo30933b() {
            return this.f25706e;
        }

        @Override // java.lang.Comparable
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            AbstractC5891o mo15019d = AbstractC5891o.m15018j().mo15022g(this.f25707f, gVar.f25707f).mo15021f(Integer.valueOf(this.f25710t), Integer.valueOf(gVar.f25710t), AbstractC5898r0.m15040c().mo15026f()).mo15019d(this.f25711u, gVar.f25711u).mo15019d(this.f25712v, gVar.f25712v).mo15022g(this.f25708r, gVar.f25708r).mo15021f(Boolean.valueOf(this.f25709s), Boolean.valueOf(gVar.f25709s), this.f25711u == 0 ? AbstractC5898r0.m15040c() : AbstractC5898r0.m15040c().mo15026f()).mo15019d(this.f25713w, gVar.f25713w);
            if (this.f25712v == 0) {
                mo15019d = mo15019d.mo15023h(this.f25714x, gVar.f25714x);
            }
            return mo15019d.mo15024i();
        }

        @Override // p307q8.C10307m.h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean mo30934h(g gVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q8.m$h */
    /* loaded from: classes.dex */
    public static abstract class h<T extends h<T>> {

        /* renamed from: a */
        public final int f25715a;

        /* renamed from: b */
        public final C11694d1 f25716b;

        /* renamed from: c */
        public final int f25717c;

        /* renamed from: d */
        public final C11108u1 f25718d;

        /* renamed from: q8.m$h$a */
        /* loaded from: classes.dex */
        public interface a<T extends h<T>> {
            /* renamed from: a */
            List<T> mo30890a(int i10, C11694d1 c11694d1, int[] iArr);
        }

        public h(int i10, C11694d1 c11694d1, int i11) {
            this.f25715a = i10;
            this.f25716b = c11694d1;
            this.f25717c = i11;
            this.f25718d = c11694d1.m36849d(i11);
        }

        /* renamed from: b */
        public abstract int mo30933b();

        /* renamed from: h */
        public abstract boolean mo30934h(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q8.m$i */
    /* loaded from: classes.dex */
    public static final class i extends h<i> {

        /* renamed from: A */
        private final boolean f25719A;

        /* renamed from: B */
        private final boolean f25720B;

        /* renamed from: C */
        private final int f25721C;

        /* renamed from: e */
        private final boolean f25722e;

        /* renamed from: f */
        private final d f25723f;

        /* renamed from: r */
        private final boolean f25724r;

        /* renamed from: s */
        private final boolean f25725s;

        /* renamed from: t */
        private final int f25726t;

        /* renamed from: u */
        private final int f25727u;

        /* renamed from: v */
        private final int f25728v;

        /* renamed from: w */
        private final int f25729w;

        /* renamed from: x */
        private final boolean f25730x;

        /* renamed from: y */
        private final boolean f25731y;

        /* renamed from: z */
        private final int f25732z;

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
        public i(int r5, p397v7.C11694d1 r6, int r7, p307q8.C10307m.d r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 247
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p307q8.C10307m.i.<init>(int, v7.d1, int, q8.m$d, int, int, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public static int m31027m(i iVar, i iVar2) {
            AbstractC5891o mo15022g = AbstractC5891o.m15018j().mo15022g(iVar.f25725s, iVar2.f25725s).mo15019d(iVar.f25729w, iVar2.f25729w).mo15022g(iVar.f25730x, iVar2.f25730x).mo15022g(iVar.f25722e, iVar2.f25722e).mo15022g(iVar.f25724r, iVar2.f25724r).mo15021f(Integer.valueOf(iVar.f25728v), Integer.valueOf(iVar2.f25728v), AbstractC5898r0.m15040c().mo15026f()).mo15022g(iVar.f25719A, iVar2.f25719A).mo15022g(iVar.f25720B, iVar2.f25720B);
            if (iVar.f25719A && iVar.f25720B) {
                mo15022g = mo15022g.mo15019d(iVar.f25721C, iVar2.f25721C);
            }
            return mo15022g.mo15024i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public static int m31028n(i iVar, i iVar2) {
            AbstractC5898r0 mo15026f = (iVar.f25722e && iVar.f25725s) ? C10307m.f25614k : C10307m.f25614k.mo15026f();
            return AbstractC5891o.m15018j().mo15021f(Integer.valueOf(iVar.f25726t), Integer.valueOf(iVar2.f25726t), iVar.f25723f.f25787H ? C10307m.f25614k.mo15026f() : C10307m.f25615l).mo15021f(Integer.valueOf(iVar.f25727u), Integer.valueOf(iVar2.f25727u), mo15026f).mo15021f(Integer.valueOf(iVar.f25726t), Integer.valueOf(iVar2.f25726t), mo15026f).mo15024i();
        }

        /* renamed from: o */
        public static int m31029o(List<i> list, List<i> list2) {
            return AbstractC5891o.m15018j().mo15021f((i) Collections.max(list, new Comparator() { // from class: q8.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m31027m;
                    m31027m = C10307m.i.m31027m((C10307m.i) obj, (C10307m.i) obj2);
                    return m31027m;
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: q8.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m31027m;
                    m31027m = C10307m.i.m31027m((C10307m.i) obj, (C10307m.i) obj2);
                    return m31027m;
                }
            }), new Comparator() { // from class: q8.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m31027m;
                    m31027m = C10307m.i.m31027m((C10307m.i) obj, (C10307m.i) obj2);
                    return m31027m;
                }
            }).mo15019d(list.size(), list2.size()).mo15021f((i) Collections.max(list, new Comparator() { // from class: q8.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m31028n;
                    m31028n = C10307m.i.m31028n((C10307m.i) obj, (C10307m.i) obj2);
                    return m31028n;
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: q8.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m31028n;
                    m31028n = C10307m.i.m31028n((C10307m.i) obj, (C10307m.i) obj2);
                    return m31028n;
                }
            }), new Comparator() { // from class: q8.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m31028n;
                    m31028n = C10307m.i.m31028n((C10307m.i) obj, (C10307m.i) obj2);
                    return m31028n;
                }
            }).mo15024i();
        }

        /* renamed from: p */
        public static AbstractC5907w<i> m31030p(int i10, C11694d1 c11694d1, d dVar, int[] iArr, int i11) {
            int m30893C = C10307m.m30893C(c11694d1, dVar.f25799t, dVar.f25800u, dVar.f25801v);
            AbstractC5907w.a m15077p = AbstractC5907w.m15077p();
            for (int i12 = 0; i12 < c11694d1.f30658a; i12++) {
                int m34490g = c11694d1.m36849d(i12).m34490g();
                m15077p.mo14724a(new i(i10, c11694d1, i12, dVar, iArr[i12], i11, m30893C == Integer.MAX_VALUE || (m34490g != -1 && m34490g <= m30893C)));
            }
            return m15077p.m15094k();
        }

        /* renamed from: q */
        private int m31031q(int i10, int i11) {
            if ((this.f25718d.f28790e & 16384) != 0 || !C10307m.m30899I(i10, this.f25723f.f25676y0)) {
                return 0;
            }
            if (!this.f25722e && !this.f25723f.f25666o0) {
                return 0;
            }
            if (C10307m.m30899I(i10, false) && this.f25724r && this.f25722e && this.f25718d.f28793s != -1) {
                d dVar = this.f25723f;
                if (!dVar.f25788I && !dVar.f25787H && (i10 & i11) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // p307q8.C10307m.h
        /* renamed from: b */
        public int mo30933b() {
            return this.f25732z;
        }

        @Override // p307q8.C10307m.h
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public boolean mo30934h(i iVar) {
            return (this.f25731y || C11172r0.m34914c(this.f25718d.f28797w, iVar.f25718d.f28797w)) && (this.f25723f.f25669r0 || (this.f25719A == iVar.f25719A && this.f25720B == iVar.f25720B));
        }
    }

    public C10307m(Context context) {
        this(context, new C10293a.b());
    }

    public C10307m(Context context, InterfaceC10312r.b bVar) {
        this(context, d.m30945J(context), bVar);
    }

    public C10307m(Context context, C10319y c10319y, InterfaceC10312r.b bVar) {
        this(c10319y, bVar, context);
    }

    private C10307m(C10319y c10319y, InterfaceC10312r.b bVar, Context context) {
        d mo30988A;
        this.f25616d = new Object();
        this.f25617e = context != null ? context.getApplicationContext() : null;
        this.f25618f = bVar;
        if (c10319y instanceof d) {
            mo30988A = (d) c10319y;
        } else {
            mo30988A = (context == null ? d.f25643D0 : d.m30945J(context)).m30965I().m30993b0(c10319y).mo30988A();
        }
        this.f25620h = mo30988A;
        this.f25622j = C11639e.f30288r;
        boolean z10 = context != null && C11172r0.m34957x0(context);
        this.f25619g = z10;
        if (!z10 && context != null && C11172r0.f29040a >= 32) {
            this.f25621i = f.m31014g(context);
        }
        if (this.f25620h.f25675x0 && context == null) {
            C11173s.m34970i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* renamed from: A */
    private static void m30891A(C11700f1 c11700f1, C10319y c10319y, Map<Integer, C10317w> map) {
        C10317w c10317w;
        for (int i10 = 0; i10 < c11700f1.f30692a; i10++) {
            C10317w c10317w2 = c10319y.f25789J.get(c11700f1.m36857c(i10));
            if (c10317w2 != null && ((c10317w = map.get(Integer.valueOf(c10317w2.m31050c()))) == null || (c10317w.f25750b.isEmpty() && !c10317w2.f25750b.isEmpty()))) {
                map.put(Integer.valueOf(c10317w2.m31050c()), c10317w2);
            }
        }
    }

    /* renamed from: B */
    protected static int m30892B(C11108u1 c11108u1, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(c11108u1.f28788c)) {
            return 4;
        }
        String m30907Q = m30907Q(str);
        String m30907Q2 = m30907Q(c11108u1.f28788c);
        if (m30907Q2 == null || m30907Q == null) {
            return (z10 && m30907Q2 == null) ? 1 : 0;
        }
        if (m30907Q2.startsWith(m30907Q) || m30907Q.startsWith(m30907Q2)) {
            return 3;
        }
        return C11172r0.m34893S0(m30907Q2, "-")[0].equals(C11172r0.m34893S0(m30907Q, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static int m30893C(C11694d1 c11694d1, int i10, int i11, boolean z10) {
        int i12;
        int i13 = C5101a.e.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i14 = 0; i14 < c11694d1.f30658a; i14++) {
                C11108u1 m36849d = c11694d1.m36849d(i14);
                int i15 = m36849d.f28768B;
                if (i15 > 0 && (i12 = m36849d.f28769C) > 0) {
                    Point m30894D = m30894D(z10, i10, i11, i15, i12);
                    int i16 = m36849d.f28768B;
                    int i17 = m36849d.f28769C;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (m30894D.x * 0.98f)) && i17 >= ((int) (m30894D.y * 0.98f)) && i18 < i13) {
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
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point m30894D(boolean r3, int r4, int r5, int r6, int r7) {
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
            int r4 = p363t8.C11172r0.m34932l(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = p363t8.C11172r0.m34932l(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p307q8.C10307m.m30894D(boolean, int, int, int, int):android.graphics.Point");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static int m30895E(int i10, int i11) {
        return (i10 == 0 || i10 != i11) ? Integer.bitCount(i10 & i11) : C5101a.e.API_PRIORITY_OTHER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static int m30896F(String str) {
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
    /* renamed from: G */
    public boolean m30897G(C11108u1 c11108u1) {
        boolean z10;
        f fVar;
        f fVar2;
        synchronized (this.f25616d) {
            z10 = !this.f25620h.f25675x0 || this.f25619g || c11108u1.f28776J <= 2 || (m30898H(c11108u1) && (C11172r0.f29040a < 32 || (fVar2 = this.f25621i) == null || !fVar2.m31019e())) || (C11172r0.f29040a >= 32 && (fVar = this.f25621i) != null && fVar.m31019e() && this.f25621i.m31017c() && this.f25621i.m31018d() && this.f25621i.m31015a(this.f25622j, c11108u1));
        }
        return z10;
    }

    /* renamed from: H */
    private static boolean m30898H(C11108u1 c11108u1) {
        String str = c11108u1.f28797w;
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

    /* renamed from: I */
    protected static boolean m30899I(int i10, boolean z10) {
        int m34454F = InterfaceC11095r3.m34454F(i10);
        return m34454F == 4 || (z10 && m34454F == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ List m30900J(d dVar, boolean z10, int i10, C11694d1 c11694d1, int[] iArr) {
        return b.m30931m(i10, c11694d1, dVar, iArr, z10, new InterfaceC7160p() { // from class: q8.l
            @Override // p082eb.InterfaceC7160p
            public final boolean apply(Object obj) {
                boolean m30897G;
                m30897G = C10307m.this.m30897G((C11108u1) obj);
                return m30897G;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static /* synthetic */ List m30901K(d dVar, String str, int i10, C11694d1 c11694d1, int[] iArr) {
        return g.m31022m(i10, c11694d1, dVar, iArr, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static /* synthetic */ List m30902L(d dVar, int[] iArr, int i10, C11694d1 c11694d1, int[] iArr2) {
        return i.m31030p(i10, c11694d1, dVar, iArr2, iArr[i10]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static /* synthetic */ int m30903M(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static /* synthetic */ int m30904N(Integer num, Integer num2) {
        return 0;
    }

    /* renamed from: O */
    private static void m30905O(AbstractC10314t.a aVar, int[][][] iArr, C11100s3[] c11100s3Arr, InterfaceC10312r[] interfaceC10312rArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < aVar.m31043d(); i12++) {
            int m31044e = aVar.m31044e(i12);
            InterfaceC10312r interfaceC10312r = interfaceC10312rArr[i12];
            if ((m31044e == 1 || m31044e == 2) && interfaceC10312r != null && m30908R(iArr[i12], aVar.m31045f(i12), interfaceC10312r)) {
                if (m31044e == 1) {
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
            C11100s3 c11100s3 = new C11100s3(true);
            c11100s3Arr[i11] = c11100s3;
            c11100s3Arr[i10] = c11100s3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public void m30906P() {
        boolean z10;
        f fVar;
        synchronized (this.f25616d) {
            z10 = this.f25620h.f25675x0 && !this.f25619g && C11172r0.f29040a >= 32 && (fVar = this.f25621i) != null && fVar.m31019e();
        }
        if (z10) {
            m30869c();
        }
    }

    /* renamed from: Q */
    protected static String m30907Q(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: R */
    private static boolean m30908R(int[][] iArr, C11700f1 c11700f1, InterfaceC10312r interfaceC10312r) {
        if (interfaceC10312r == null) {
            return false;
        }
        int m36858d = c11700f1.m36858d(interfaceC10312r.mo30884d());
        for (int i10 = 0; i10 < interfaceC10312r.length(); i10++) {
            if (InterfaceC11095r3.m34457m(iArr[m36858d][interfaceC10312r.mo30882b(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: W */
    private <T extends h<T>> Pair<InterfaceC10312r.a, Integer> m30909W(int i10, AbstractC10314t.a aVar, int[][][] iArr, h.a<T> aVar2, Comparator<List<T>> comparator) {
        int i11;
        RandomAccess randomAccess;
        AbstractC10314t.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int m31043d = aVar.m31043d();
        int i12 = 0;
        while (i12 < m31043d) {
            if (i10 == aVar3.m31044e(i12)) {
                C11700f1 m31045f = aVar3.m31045f(i12);
                for (int i13 = 0; i13 < m31045f.f30692a; i13++) {
                    C11694d1 m36857c = m31045f.m36857c(i13);
                    List<T> mo30890a = aVar2.mo30890a(i12, m36857c, iArr[i12][i13]);
                    boolean[] zArr = new boolean[m36857c.f30658a];
                    int i14 = 0;
                    while (i14 < m36857c.f30658a) {
                        T t10 = mo30890a.get(i14);
                        int mo30933b = t10.mo30933b();
                        if (zArr[i14] || mo30933b == 0) {
                            i11 = m31043d;
                        } else {
                            if (mo30933b == 1) {
                                randomAccess = AbstractC5907w.m15082w(t10);
                                i11 = m31043d;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t10);
                                int i15 = i14 + 1;
                                while (i15 < m36857c.f30658a) {
                                    T t11 = mo30890a.get(i15);
                                    int i16 = m31043d;
                                    if (t11.mo30933b() == 2 && t10.mo30934h(t11)) {
                                        arrayList2.add(t11);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    m31043d = i16;
                                }
                                i11 = m31043d;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i14++;
                        m31043d = i11;
                    }
                }
            }
            i12++;
            aVar3 = aVar;
            m31043d = m31043d;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((h) list.get(i17)).f25717c;
        }
        h hVar = (h) list.get(0);
        return Pair.create(new InterfaceC10312r.a(hVar.f25716b, iArr2), Integer.valueOf(hVar.f25715a));
    }

    /* renamed from: y */
    private static void m30922y(AbstractC10314t.a aVar, d dVar, InterfaceC10312r.a[] aVarArr) {
        int m31043d = aVar.m31043d();
        for (int i10 = 0; i10 < m31043d; i10++) {
            C11700f1 m31045f = aVar.m31045f(i10);
            if (dVar.m30968N(i10, m31045f)) {
                e m30967M = dVar.m30967M(i10, m31045f);
                aVarArr[i10] = (m30967M == null || m30967M.f25698b.length == 0) ? null : new InterfaceC10312r.a(m31045f.m36857c(m30967M.f25697a), m30967M.f25698b, m30967M.f25700d);
            }
        }
    }

    /* renamed from: z */
    private static void m30923z(AbstractC10314t.a aVar, C10319y c10319y, InterfaceC10312r.a[] aVarArr) {
        int m31043d = aVar.m31043d();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < m31043d; i10++) {
            m30891A(aVar.m31045f(i10), c10319y, hashMap);
        }
        m30891A(aVar.m31047h(), c10319y, hashMap);
        for (int i11 = 0; i11 < m31043d; i11++) {
            C10317w c10317w = (C10317w) hashMap.get(Integer.valueOf(aVar.m31044e(i11)));
            if (c10317w != null) {
                aVarArr[i11] = (c10317w.f25750b.isEmpty() || aVar.m31045f(i11).m36858d(c10317w.f25749a) == -1) ? null : new InterfaceC10312r.a(c10317w.f25749a, C7690e.m23421l(c10317w.f25750b));
            }
        }
    }

    /* renamed from: S */
    protected InterfaceC10312r.a[] m30924S(AbstractC10314t.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        String str;
        int m31043d = aVar.m31043d();
        InterfaceC10312r.a[] aVarArr = new InterfaceC10312r.a[m31043d];
        Pair<InterfaceC10312r.a, Integer> m30928X = m30928X(aVar, iArr, iArr2, dVar);
        if (m30928X != null) {
            aVarArr[((Integer) m30928X.second).intValue()] = (InterfaceC10312r.a) m30928X.first;
        }
        Pair<InterfaceC10312r.a, Integer> m30925T = m30925T(aVar, iArr, iArr2, dVar);
        if (m30925T != null) {
            aVarArr[((Integer) m30925T.second).intValue()] = (InterfaceC10312r.a) m30925T.first;
        }
        if (m30925T == null) {
            str = null;
        } else {
            Object obj = m30925T.first;
            str = ((InterfaceC10312r.a) obj).f25733a.m36849d(((InterfaceC10312r.a) obj).f25734b[0]).f28788c;
        }
        Pair<InterfaceC10312r.a, Integer> m30927V = m30927V(aVar, iArr, dVar, str);
        if (m30927V != null) {
            aVarArr[((Integer) m30927V.second).intValue()] = (InterfaceC10312r.a) m30927V.first;
        }
        for (int i10 = 0; i10 < m31043d; i10++) {
            int m31044e = aVar.m31044e(i10);
            if (m31044e != 2 && m31044e != 1 && m31044e != 3) {
                aVarArr[i10] = m30926U(m31044e, aVar.m31045f(i10), iArr[i10], dVar);
            }
        }
        return aVarArr;
    }

    /* renamed from: T */
    protected Pair<InterfaceC10312r.a, Integer> m30925T(AbstractC10314t.a aVar, int[][][] iArr, int[] iArr2, final d dVar) {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.m31043d()) {
                if (2 == aVar.m31044e(i10) && aVar.m31045f(i10).f30692a > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return m30909W(1, aVar, iArr, new h.a() { // from class: q8.j
            @Override // p307q8.C10307m.h.a
            /* renamed from: a */
            public final List mo30890a(int i11, C11694d1 c11694d1, int[] iArr3) {
                List m30900J;
                m30900J = C10307m.this.m30900J(dVar, z10, i11, c11694d1, iArr3);
                return m30900J;
            }
        }, new Comparator() { // from class: q8.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C10307m.b.m30930i((List) obj, (List) obj2);
            }
        });
    }

    /* renamed from: U */
    protected InterfaceC10312r.a m30926U(int i10, C11700f1 c11700f1, int[][] iArr, d dVar) {
        C11694d1 c11694d1 = null;
        c cVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < c11700f1.f30692a; i12++) {
            C11694d1 m36857c = c11700f1.m36857c(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < m36857c.f30658a; i13++) {
                if (m30899I(iArr2[i13], dVar.f25676y0)) {
                    c cVar2 = new c(m36857c.m36849d(i13), iArr2[i13]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        c11694d1 = m36857c;
                        i11 = i13;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (c11694d1 == null) {
            return null;
        }
        return new InterfaceC10312r.a(c11694d1, i11);
    }

    /* renamed from: V */
    protected Pair<InterfaceC10312r.a, Integer> m30927V(AbstractC10314t.a aVar, int[][][] iArr, final d dVar, final String str) {
        return m30909W(3, aVar, iArr, new h.a() { // from class: q8.d
            @Override // p307q8.C10307m.h.a
            /* renamed from: a */
            public final List mo30890a(int i10, C11694d1 c11694d1, int[] iArr2) {
                List m30901K;
                m30901K = C10307m.m30901K(C10307m.d.this, str, i10, c11694d1, iArr2);
                return m30901K;
            }
        }, new Comparator() { // from class: q8.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C10307m.g.m31021i((List) obj, (List) obj2);
            }
        });
    }

    /* renamed from: X */
    protected Pair<InterfaceC10312r.a, Integer> m30928X(AbstractC10314t.a aVar, int[][][] iArr, final int[] iArr2, final d dVar) {
        return m30909W(2, aVar, iArr, new h.a() { // from class: q8.h
            @Override // p307q8.C10307m.h.a
            /* renamed from: a */
            public final List mo30890a(int i10, C11694d1 c11694d1, int[] iArr3) {
                List m30902L;
                m30902L = C10307m.m30902L(C10307m.d.this, iArr2, i10, c11694d1, iArr3);
                return m30902L;
            }
        }, new Comparator() { // from class: q8.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C10307m.i.m31029o((List) obj, (List) obj2);
            }
        });
    }

    @Override // p307q8.AbstractC10294a0
    /* renamed from: d */
    public boolean mo30870d() {
        return true;
    }

    @Override // p307q8.AbstractC10294a0
    /* renamed from: f */
    public void mo30872f() {
        f fVar;
        synchronized (this.f25616d) {
            if (C11172r0.f29040a >= 32 && (fVar = this.f25621i) != null) {
                fVar.m31020f();
            }
        }
        super.mo30872f();
    }

    @Override // p307q8.AbstractC10294a0
    /* renamed from: h */
    public void mo30874h(C11639e c11639e) {
        boolean z10;
        synchronized (this.f25616d) {
            z10 = !this.f25622j.equals(c11639e);
            this.f25622j = c11639e;
        }
        if (z10) {
            m30906P();
        }
    }

    @Override // p307q8.AbstractC10314t
    /* renamed from: l */
    protected final Pair<C11100s3[], InterfaceC10312r[]> mo30929l(AbstractC10314t.a aVar, int[][][] iArr, int[] iArr2, InterfaceC11684a0.b bVar, AbstractC11018d4 abstractC11018d4) {
        d dVar;
        f fVar;
        synchronized (this.f25616d) {
            dVar = this.f25620h;
            if (dVar.f25675x0 && C11172r0.f29040a >= 32 && (fVar = this.f25621i) != null) {
                fVar.m31016b(this, (Looper) C11137a.m34607i(Looper.myLooper()));
            }
        }
        int m31043d = aVar.m31043d();
        InterfaceC10312r.a[] m30924S = m30924S(aVar, iArr, iArr2, dVar);
        m30923z(aVar, dVar, m30924S);
        m30922y(aVar, dVar, m30924S);
        for (int i10 = 0; i10 < m31043d; i10++) {
            int m31044e = aVar.m31044e(i10);
            if (dVar.m30966L(i10) || dVar.f25790K.contains(Integer.valueOf(m31044e))) {
                m30924S[i10] = null;
            }
        }
        InterfaceC10312r[] mo30865a = this.f25618f.mo30865a(m30924S, m30867a(), bVar, abstractC11018d4);
        C11100s3[] c11100s3Arr = new C11100s3[m31043d];
        for (int i11 = 0; i11 < m31043d; i11++) {
            boolean z10 = true;
            if ((dVar.m30966L(i11) || dVar.f25790K.contains(Integer.valueOf(aVar.m31044e(i11)))) || (aVar.m31044e(i11) != -2 && mo30865a[i11] == null)) {
                z10 = false;
            }
            c11100s3Arr[i11] = z10 ? C11100s3.f28715b : null;
        }
        if (dVar.f25677z0) {
            m30905O(aVar, iArr, c11100s3Arr, mo30865a);
        }
        return Pair.create(c11100s3Arr, mo30865a);
    }
}
