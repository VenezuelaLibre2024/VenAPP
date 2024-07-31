package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1177k0;
import androidx.datastore.preferences.protobuf.C1205t1;
import androidx.datastore.preferences.protobuf.InterfaceC1208u1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.datastore.preferences.protobuf.l */
/* loaded from: classes.dex */
public final class C1179l implements InterfaceC1208u1 {

    /* renamed from: a */
    private final AbstractC1176k f4929a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.l$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4930a;

        static {
            int[] iArr = new int[C1205t1.b.values().length];
            f4930a = iArr;
            try {
                iArr[C1205t1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4930a[C1205t1.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4930a[C1205t1.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4930a[C1205t1.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4930a[C1205t1.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4930a[C1205t1.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4930a[C1205t1.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4930a[C1205t1.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4930a[C1205t1.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4930a[C1205t1.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4930a[C1205t1.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4930a[C1205t1.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C1179l(AbstractC1176k abstractC1176k) {
        AbstractC1176k abstractC1176k2 = (AbstractC1176k) C1147a0.m5644b(abstractC1176k, "output");
        this.f4929a = abstractC1176k2;
        abstractC1176k2.f4906a = this;
    }

    /* renamed from: P */
    public static C1179l m6143P(AbstractC1176k abstractC1176k) {
        C1179l c1179l = abstractC1176k.f4906a;
        return c1179l != null ? c1179l : new C1179l(abstractC1176k);
    }

    /* renamed from: Q */
    private <V> void m6144Q(int i10, boolean z10, V v10, C1177k0.a<Boolean, V> aVar) {
        this.f4929a.mo6095W0(i10, 2);
        this.f4929a.mo6097Y0(C1177k0.m6136b(aVar, Boolean.valueOf(z10), v10));
        C1177k0.m6138e(this.f4929a, aVar, Boolean.valueOf(z10), v10);
    }

    /* renamed from: R */
    private <V> void m6145R(int i10, C1177k0.a<Integer, V> aVar, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = it.next().intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            V v10 = map.get(Integer.valueOf(i13));
            this.f4929a.mo6095W0(i10, 2);
            this.f4929a.mo6097Y0(C1177k0.m6136b(aVar, Integer.valueOf(i13), v10));
            C1177k0.m6138e(this.f4929a, aVar, Integer.valueOf(i13), v10);
        }
    }

    /* renamed from: S */
    private <V> void m6146S(int i10, C1177k0.a<Long, V> aVar, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = it.next().longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            V v10 = map.get(Long.valueOf(j10));
            this.f4929a.mo6095W0(i10, 2);
            this.f4929a.mo6097Y0(C1177k0.m6136b(aVar, Long.valueOf(j10), v10));
            C1177k0.m6138e(this.f4929a, aVar, Long.valueOf(j10), v10);
        }
    }

    /* renamed from: T */
    private <K, V> void m6147T(int i10, C1177k0.a<K, V> aVar, Map<K, V> map) {
        switch (a.f4930a[aVar.f4920a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    m6144Q(i10, false, v10, aVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    m6144Q(i10, true, v11, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m6145R(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m6146S(i10, aVar, map);
                return;
            case 12:
                m6148U(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f4920a);
        }
    }

    /* renamed from: U */
    private <V> void m6148U(int i10, C1177k0.a<String, V> aVar, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            V v10 = map.get(str);
            this.f4929a.mo6095W0(i10, 2);
            this.f4929a.mo6097Y0(C1177k0.m6136b(aVar, str, v10));
            C1177k0.m6138e(this.f4929a, aVar, str, v10);
        }
    }

    /* renamed from: V */
    private void m6149V(int i10, Object obj) {
        if (obj instanceof String) {
            this.f4929a.mo6093U0(i10, (String) obj);
        } else {
            this.f4929a.mo6110o0(i10, (AbstractC1167h) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: A */
    public void mo6150A(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4929a.mo6106k0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f4929a.mo6095W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1176k.m6048e(list.get(i13).booleanValue());
        }
        this.f4929a.mo6097Y0(i12);
        while (i11 < list.size()) {
            this.f4929a.m6107l0(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: B */
    public void mo6151B(int i10, float f10) {
        this.f4929a.m6120y0(i10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: C */
    public void mo6152C(int i10) {
        this.f4929a.mo6095W0(i10, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: D */
    public void mo6153D(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4929a.m6089Q0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f4929a.mo6095W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1176k.m6034Q(list.get(i13).intValue());
        }
        this.f4929a.mo6097Y0(i12);
        while (i11 < list.size()) {
            this.f4929a.m6090R0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: E */
    public void mo6154E(int i10, int i11) {
        this.f4929a.m6114s0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: F */
    public void mo6155F(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4929a.m6079G0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f4929a.mo6095W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1176k.m6071y(list.get(i13).longValue());
        }
        this.f4929a.mo6097Y0(i12);
        while (i11 < list.size()) {
            this.f4929a.m6080H0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: G */
    public void mo6156G(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4929a.m6112q0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f4929a.mo6095W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1176k.m6056j(list.get(i13).doubleValue());
        }
        this.f4929a.mo6097Y0(i12);
        while (i11 < list.size()) {
            this.f4929a.m6113r0(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: H */
    public void mo6157H(int i10, int i11) {
        this.f4929a.m6089Q0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: I */
    public void mo6158I(int i10, List<AbstractC1167h> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f4929a.mo6110o0(i10, list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: J */
    public void mo6159J(int i10, List<?> list, InterfaceC1166g1 interfaceC1166g1) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            mo6163N(i10, list.get(i11), interfaceC1166g1);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: K */
    public void mo6160K(int i10, AbstractC1167h abstractC1167h) {
        this.f4929a.mo6110o0(i10, abstractC1167h);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: L */
    public void mo6161L(int i10, Object obj, InterfaceC1166g1 interfaceC1166g1) {
        this.f4929a.mo6081I0(i10, (InterfaceC1198r0) obj, interfaceC1166g1);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: M */
    public <K, V> void mo6162M(int i10, C1177k0.a<K, V> aVar, Map<K, V> map) {
        if (this.f4929a.m6103e0()) {
            m6147T(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f4929a.mo6095W0(i10, 2);
            this.f4929a.mo6097Y0(C1177k0.m6136b(aVar, entry.getKey(), entry.getValue()));
            C1177k0.m6138e(this.f4929a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: N */
    public void mo6163N(int i10, Object obj, InterfaceC1166g1 interfaceC1166g1) {
        this.f4929a.m6074B0(i10, (InterfaceC1198r0) obj, interfaceC1166g1);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: O */
    public void mo6164O(int i10, List<?> list, InterfaceC1166g1 interfaceC1166g1) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            mo6161L(i10, list.get(i11), interfaceC1166g1);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: a */
    public void mo6165a(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4929a.m6120y0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f4929a.mo6095W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1176k.m6064r(list.get(i13).floatValue());
        }
        this.f4929a.mo6097Y0(i12);
        while (i11 < list.size()) {
            this.f4929a.m6121z0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: b */
    public final void mo6166b(int i10, Object obj) {
        if (obj instanceof AbstractC1167h) {
            this.f4929a.mo6084L0(i10, (AbstractC1167h) obj);
        } else {
            this.f4929a.mo6083K0(i10, (InterfaceC1198r0) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: c */
    public void mo6167c(int i10, int i11) {
        this.f4929a.mo6116u0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: d */
    public void mo6168d(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof InterfaceC1165g0)) {
            while (i11 < list.size()) {
                this.f4929a.mo6093U0(i10, list.get(i11));
                i11++;
            }
        } else {
            InterfaceC1165g0 interfaceC1165g0 = (InterfaceC1165g0) list;
            while (i11 < list.size()) {
                m6149V(i10, interfaceC1165g0.mo5787j(i11));
                i11++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: e */
    public void mo6169e(int i10, String str) {
        this.f4929a.mo6093U0(i10, str);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: f */
    public void mo6170f(int i10, long j10) {
        this.f4929a.mo6098Z0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: g */
    public void mo6171g(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4929a.mo6077E0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f4929a.mo6095W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1176k.m6069w(list.get(i13).intValue());
        }
        this.f4929a.mo6097Y0(i12);
        while (i11 < list.size()) {
            this.f4929a.mo6078F0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: h */
    public void mo6172h(int i10, int i11) {
        this.f4929a.mo6077E0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: i */
    public void mo6173i(int i10, long j10) {
        this.f4929a.m6087O0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: j */
    public void mo6174j(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4929a.mo6116u0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f4929a.mo6095W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1176k.m6060n(list.get(i13).intValue());
        }
        this.f4929a.mo6097Y0(i12);
        while (i11 < list.size()) {
            this.f4929a.mo6117v0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: k */
    public void mo6175k(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4929a.mo6096X0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f4929a.mo6095W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1176k.m6041X(list.get(i13).intValue());
        }
        this.f4929a.mo6097Y0(i12);
        while (i11 < list.size()) {
            this.f4929a.mo6097Y0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: l */
    public void mo6176l(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4929a.m6091S0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f4929a.mo6095W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1176k.m6036S(list.get(i13).longValue());
        }
        this.f4929a.mo6097Y0(i12);
        while (i11 < list.size()) {
            this.f4929a.m6092T0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: m */
    public void mo6177m(int i10, long j10) {
        this.f4929a.m6091S0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: n */
    public void mo6178n(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4929a.m6114s0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f4929a.mo6095W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1176k.m6058l(list.get(i13).intValue());
        }
        this.f4929a.mo6097Y0(i12);
        while (i11 < list.size()) {
            this.f4929a.m6115t0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: o */
    public void mo6179o(int i10, int i11) {
        this.f4929a.mo6096X0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: p */
    public void mo6180p(int i10, double d10) {
        this.f4929a.m6112q0(i10, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: q */
    public void mo6181q(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4929a.m6087O0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f4929a.mo6095W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1176k.m6032O(list.get(i13).longValue());
        }
        this.f4929a.mo6097Y0(i12);
        while (i11 < list.size()) {
            this.f4929a.m6088P0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: r */
    public void mo6182r(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4929a.mo6098Z0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f4929a.mo6095W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1176k.m6043Z(list.get(i13).longValue());
        }
        this.f4929a.mo6097Y0(i12);
        while (i11 < list.size()) {
            this.f4929a.mo6099a1(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: s */
    public void mo6183s(int i10, long j10) {
        this.f4929a.mo6118w0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: t */
    public InterfaceC1208u1.a mo6184t() {
        return InterfaceC1208u1.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: u */
    public void mo6185u(int i10, long j10) {
        this.f4929a.m6079G0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: v */
    public void mo6186v(int i10, boolean z10) {
        this.f4929a.mo6106k0(i10, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: w */
    public void mo6187w(int i10, int i11) {
        this.f4929a.m6085M0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: x */
    public void mo6188x(int i10) {
        this.f4929a.mo6095W0(i10, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: y */
    public void mo6189y(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4929a.mo6118w0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f4929a.mo6095W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1176k.m6062p(list.get(i13).longValue());
        }
        this.f4929a.mo6097Y0(i12);
        while (i11 < list.size()) {
            this.f4929a.mo6119x0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1208u1
    /* renamed from: z */
    public void mo6190z(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4929a.m6085M0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f4929a.mo6095W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1176k.m6030M(list.get(i13).intValue());
        }
        this.f4929a.mo6097Y0(i12);
        while (i11 < list.size()) {
            this.f4929a.m6086N0(list.get(i11).intValue());
            i11++;
        }
    }
}
