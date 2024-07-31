package com.google.protobuf;

import com.google.protobuf.C6593k0;
import com.google.protobuf.C6621t1;
import com.google.protobuf.InterfaceC6624u1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.k */
/* loaded from: classes2.dex */
public final class C6592k implements InterfaceC6624u1 {

    /* renamed from: a */
    private final AbstractC6589j f14546a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.k$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14547a;

        static {
            int[] iArr = new int[C6621t1.b.values().length];
            f14547a = iArr;
            try {
                iArr[C6621t1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14547a[C6621t1.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14547a[C6621t1.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14547a[C6621t1.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14547a[C6621t1.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14547a[C6621t1.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14547a[C6621t1.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14547a[C6621t1.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14547a[C6621t1.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14547a[C6621t1.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14547a[C6621t1.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14547a[C6621t1.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C6592k(AbstractC6589j abstractC6589j) {
        AbstractC6589j abstractC6589j2 = (AbstractC6589j) C6633z.m19348b(abstractC6589j, "output");
        this.f14546a = abstractC6589j2;
        abstractC6589j2.f14511a = this;
    }

    /* renamed from: P */
    public static C6592k m18857P(AbstractC6589j abstractC6589j) {
        C6592k c6592k = abstractC6589j.f14511a;
        return c6592k != null ? c6592k : new C6592k(abstractC6589j);
    }

    /* renamed from: Q */
    private <V> void m18858Q(int i10, boolean z10, V v10, C6593k0.a<Boolean, V> aVar) {
        this.f14546a.mo18780V0(i10, 2);
        this.f14546a.mo18782X0(C6593k0.m18905b(aVar, Boolean.valueOf(z10), v10));
        C6593k0.m18907e(this.f14546a, aVar, Boolean.valueOf(z10), v10);
    }

    /* renamed from: R */
    private <V> void m18859R(int i10, C6593k0.a<Integer, V> aVar, Map<Integer, V> map) {
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
            this.f14546a.mo18780V0(i10, 2);
            this.f14546a.mo18782X0(C6593k0.m18905b(aVar, Integer.valueOf(i13), v10));
            C6593k0.m18907e(this.f14546a, aVar, Integer.valueOf(i13), v10);
        }
    }

    /* renamed from: S */
    private <V> void m18860S(int i10, C6593k0.a<Long, V> aVar, Map<Long, V> map) {
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
            this.f14546a.mo18780V0(i10, 2);
            this.f14546a.mo18782X0(C6593k0.m18905b(aVar, Long.valueOf(j10), v10));
            C6593k0.m18907e(this.f14546a, aVar, Long.valueOf(j10), v10);
        }
    }

    /* renamed from: T */
    private <K, V> void m18861T(int i10, C6593k0.a<K, V> aVar, Map<K, V> map) {
        switch (a.f14547a[aVar.f14551a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    m18858Q(i10, false, v10, aVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    m18858Q(i10, true, v11, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m18859R(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m18860S(i10, aVar, map);
                return;
            case 12:
                m18862U(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f14551a);
        }
    }

    /* renamed from: U */
    private <V> void m18862U(int i10, C6593k0.a<String, V> aVar, Map<String, V> map) {
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
            this.f14546a.mo18780V0(i10, 2);
            this.f14546a.mo18782X0(C6593k0.m18905b(aVar, str, v10));
            C6593k0.m18907e(this.f14546a, aVar, str, v10);
        }
    }

    /* renamed from: V */
    private void m18863V(int i10, Object obj) {
        if (obj instanceof String) {
            this.f14546a.mo18778T0(i10, (String) obj);
        } else {
            this.f14546a.mo18795n0(i10, (AbstractC6580g) obj);
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: A */
    public void mo18864A(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f14546a.mo18791j0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f14546a.mo18780V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC6589j.m18734e(list.get(i13).booleanValue());
        }
        this.f14546a.mo18782X0(i12);
        while (i11 < list.size()) {
            this.f14546a.m18792k0(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: B */
    public void mo18865B(int i10, float f10) {
        this.f14546a.m18805x0(i10, f10);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    @Deprecated
    /* renamed from: C */
    public void mo18866C(int i10) {
        this.f14546a.mo18780V0(i10, 4);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: D */
    public void mo18867D(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f14546a.m18774P0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f14546a.mo18780V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC6589j.m18720P(list.get(i13).intValue());
        }
        this.f14546a.mo18782X0(i12);
        while (i11 < list.size()) {
            this.f14546a.m18775Q0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: E */
    public void mo18868E(int i10, int i11) {
        this.f14546a.m18799r0(i10, i11);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: F */
    public void mo18869F(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f14546a.m18764F0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f14546a.mo18780V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC6589j.m18757y(list.get(i13).longValue());
        }
        this.f14546a.mo18782X0(i12);
        while (i11 < list.size()) {
            this.f14546a.m18765G0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: G */
    public void mo18870G(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f14546a.m18797p0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f14546a.mo18780V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC6589j.m18742j(list.get(i13).doubleValue());
        }
        this.f14546a.mo18782X0(i12);
        while (i11 < list.size()) {
            this.f14546a.m18798q0(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: H */
    public void mo18871H(int i10, int i11) {
        this.f14546a.m18774P0(i10, i11);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: I */
    public void mo18872I(int i10, List<AbstractC6580g> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f14546a.mo18795n0(i10, list.get(i11));
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: J */
    public void mo18873J(int i10, List<?> list, InterfaceC6582g1 interfaceC6582g1) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            mo18877N(i10, list.get(i11), interfaceC6582g1);
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: K */
    public void mo18874K(int i10, Object obj, InterfaceC6582g1 interfaceC6582g1) {
        this.f14546a.m18759A0(i10, (InterfaceC6614r0) obj, interfaceC6582g1);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: L */
    public void mo18875L(int i10, AbstractC6580g abstractC6580g) {
        this.f14546a.mo18795n0(i10, abstractC6580g);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: M */
    public void mo18876M(int i10, List<?> list, InterfaceC6582g1 interfaceC6582g1) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            mo18874K(i10, list.get(i11), interfaceC6582g1);
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: N */
    public void mo18877N(int i10, Object obj, InterfaceC6582g1 interfaceC6582g1) {
        this.f14546a.mo18766H0(i10, (InterfaceC6614r0) obj, interfaceC6582g1);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: O */
    public <K, V> void mo18878O(int i10, C6593k0.a<K, V> aVar, Map<K, V> map) {
        if (this.f14546a.m18788d0()) {
            m18861T(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f14546a.mo18780V0(i10, 2);
            this.f14546a.mo18782X0(C6593k0.m18905b(aVar, entry.getKey(), entry.getValue()));
            C6593k0.m18907e(this.f14546a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: a */
    public void mo18879a(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f14546a.m18805x0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f14546a.mo18780V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC6589j.m18750r(list.get(i13).floatValue());
        }
        this.f14546a.mo18782X0(i12);
        while (i11 < list.size()) {
            this.f14546a.m18806y0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: b */
    public final void mo18880b(int i10, Object obj) {
        if (obj instanceof AbstractC6580g) {
            this.f14546a.mo18769K0(i10, (AbstractC6580g) obj);
        } else {
            this.f14546a.mo18768J0(i10, (InterfaceC6614r0) obj);
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: c */
    public void mo18881c(int i10, int i11) {
        this.f14546a.mo18801t0(i10, i11);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: d */
    public void mo18882d(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof InterfaceC6581g0)) {
            while (i11 < list.size()) {
                this.f14546a.mo18778T0(i10, list.get(i11));
                i11++;
            }
        } else {
            InterfaceC6581g0 interfaceC6581g0 = (InterfaceC6581g0) list;
            while (i11 < list.size()) {
                m18863V(i10, interfaceC6581g0.mo18461j(i11));
                i11++;
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: e */
    public void mo18883e(int i10, String str) {
        this.f14546a.mo18778T0(i10, str);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: f */
    public void mo18884f(int i10, long j10) {
        this.f14546a.mo18783Y0(i10, j10);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: g */
    public void mo18885g(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f14546a.mo18762D0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f14546a.mo18780V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC6589j.m18755w(list.get(i13).intValue());
        }
        this.f14546a.mo18782X0(i12);
        while (i11 < list.size()) {
            this.f14546a.mo18763E0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: h */
    public void mo18886h(int i10, int i11) {
        this.f14546a.mo18762D0(i10, i11);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: i */
    public void mo18887i(int i10, long j10) {
        this.f14546a.m18772N0(i10, j10);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: j */
    public void mo18888j(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f14546a.mo18801t0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f14546a.mo18780V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC6589j.m18746n(list.get(i13).intValue());
        }
        this.f14546a.mo18782X0(i12);
        while (i11 < list.size()) {
            this.f14546a.mo18802u0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: k */
    public void mo18889k(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f14546a.mo18781W0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f14546a.mo18780V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC6589j.m18727W(list.get(i13).intValue());
        }
        this.f14546a.mo18782X0(i12);
        while (i11 < list.size()) {
            this.f14546a.mo18782X0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: l */
    public void mo18890l(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f14546a.m18776R0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f14546a.mo18780V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC6589j.m18722R(list.get(i13).longValue());
        }
        this.f14546a.mo18782X0(i12);
        while (i11 < list.size()) {
            this.f14546a.m18777S0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: m */
    public void mo18891m(int i10, long j10) {
        this.f14546a.m18776R0(i10, j10);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: n */
    public void mo18892n(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f14546a.m18799r0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f14546a.mo18780V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC6589j.m18744l(list.get(i13).intValue());
        }
        this.f14546a.mo18782X0(i12);
        while (i11 < list.size()) {
            this.f14546a.m18800s0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: o */
    public void mo18893o(int i10, int i11) {
        this.f14546a.mo18781W0(i10, i11);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: p */
    public void mo18894p(int i10, double d10) {
        this.f14546a.m18797p0(i10, d10);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: q */
    public void mo18895q(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f14546a.m18772N0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f14546a.mo18780V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC6589j.m18718N(list.get(i13).longValue());
        }
        this.f14546a.mo18782X0(i12);
        while (i11 < list.size()) {
            this.f14546a.m18773O0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: r */
    public void mo18896r(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f14546a.mo18783Y0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f14546a.mo18780V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC6589j.m18729Y(list.get(i13).longValue());
        }
        this.f14546a.mo18782X0(i12);
        while (i11 < list.size()) {
            this.f14546a.mo18784Z0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: s */
    public void mo18897s(int i10, long j10) {
        this.f14546a.mo18803v0(i10, j10);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: t */
    public InterfaceC6624u1.a mo18898t() {
        return InterfaceC6624u1.a.ASCENDING;
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: u */
    public void mo18899u(int i10, long j10) {
        this.f14546a.m18764F0(i10, j10);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: v */
    public void mo18900v(int i10, boolean z10) {
        this.f14546a.mo18791j0(i10, z10);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: w */
    public void mo18901w(int i10, int i11) {
        this.f14546a.m18770L0(i10, i11);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    @Deprecated
    /* renamed from: x */
    public void mo18902x(int i10) {
        this.f14546a.mo18780V0(i10, 3);
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: y */
    public void mo18903y(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f14546a.mo18803v0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f14546a.mo18780V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC6589j.m18748p(list.get(i13).longValue());
        }
        this.f14546a.mo18782X0(i12);
        while (i11 < list.size()) {
            this.f14546a.mo18804w0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.InterfaceC6624u1
    /* renamed from: z */
    public void mo18904z(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f14546a.m18770L0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f14546a.mo18780V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC6589j.m18716L(list.get(i13).intValue());
        }
        this.f14546a.mo18782X0(i12);
        while (i11 < list.size()) {
            this.f14546a.m18771M0(list.get(i11).intValue());
            i11++;
        }
    }
}
