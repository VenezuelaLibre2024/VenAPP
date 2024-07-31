package com.google.protobuf;

import com.google.protobuf.k0;
import com.google.protobuf.t1;
import com.google.protobuf.u1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class k implements u1 {

    /* renamed from: a, reason: collision with root package name */
    private final j f13272a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13273a;

        static {
            int[] iArr = new int[t1.b.values().length];
            f13273a = iArr;
            try {
                iArr[t1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13273a[t1.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13273a[t1.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13273a[t1.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13273a[t1.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13273a[t1.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13273a[t1.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13273a[t1.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13273a[t1.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13273a[t1.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13273a[t1.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13273a[t1.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private k(j jVar) {
        j jVar2 = (j) z.b(jVar, "output");
        this.f13272a = jVar2;
        jVar2.f13237a = this;
    }

    public static k P(j jVar) {
        k kVar = jVar.f13237a;
        return kVar != null ? kVar : new k(jVar);
    }

    private <V> void Q(int i10, boolean z10, V v10, k0.a<Boolean, V> aVar) {
        this.f13272a.V0(i10, 2);
        this.f13272a.X0(k0.b(aVar, Boolean.valueOf(z10), v10));
        k0.e(this.f13272a, aVar, Boolean.valueOf(z10), v10);
    }

    private <V> void R(int i10, k0.a<Integer, V> aVar, Map<Integer, V> map) {
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
            this.f13272a.V0(i10, 2);
            this.f13272a.X0(k0.b(aVar, Integer.valueOf(i13), v10));
            k0.e(this.f13272a, aVar, Integer.valueOf(i13), v10);
        }
    }

    private <V> void S(int i10, k0.a<Long, V> aVar, Map<Long, V> map) {
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
            this.f13272a.V0(i10, 2);
            this.f13272a.X0(k0.b(aVar, Long.valueOf(j10), v10));
            k0.e(this.f13272a, aVar, Long.valueOf(j10), v10);
        }
    }

    private <K, V> void T(int i10, k0.a<K, V> aVar, Map<K, V> map) {
        switch (a.f13273a[aVar.f13277a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    Q(i10, false, v10, aVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    Q(i10, true, v11, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i10, aVar, map);
                return;
            case 12:
                U(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f13277a);
        }
    }

    private <V> void U(int i10, k0.a<String, V> aVar, Map<String, V> map) {
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
            this.f13272a.V0(i10, 2);
            this.f13272a.X0(k0.b(aVar, str, v10));
            k0.e(this.f13272a, aVar, str, v10);
        }
    }

    private void V(int i10, Object obj) {
        if (obj instanceof String) {
            this.f13272a.T0(i10, (String) obj);
        } else {
            this.f13272a.n0(i10, (g) obj);
        }
    }

    @Override // com.google.protobuf.u1
    public void A(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f13272a.j0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f13272a.V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.e(list.get(i13).booleanValue());
        }
        this.f13272a.X0(i12);
        while (i11 < list.size()) {
            this.f13272a.k0(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.u1
    public void B(int i10, float f10) {
        this.f13272a.x0(i10, f10);
    }

    @Override // com.google.protobuf.u1
    @Deprecated
    public void C(int i10) {
        this.f13272a.V0(i10, 4);
    }

    @Override // com.google.protobuf.u1
    public void D(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f13272a.P0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f13272a.V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.P(list.get(i13).intValue());
        }
        this.f13272a.X0(i12);
        while (i11 < list.size()) {
            this.f13272a.Q0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.u1
    public void E(int i10, int i11) {
        this.f13272a.r0(i10, i11);
    }

    @Override // com.google.protobuf.u1
    public void F(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f13272a.F0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f13272a.V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.y(list.get(i13).longValue());
        }
        this.f13272a.X0(i12);
        while (i11 < list.size()) {
            this.f13272a.G0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.u1
    public void G(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f13272a.p0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f13272a.V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.j(list.get(i13).doubleValue());
        }
        this.f13272a.X0(i12);
        while (i11 < list.size()) {
            this.f13272a.q0(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.u1
    public void H(int i10, int i11) {
        this.f13272a.P0(i10, i11);
    }

    @Override // com.google.protobuf.u1
    public void I(int i10, List<g> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f13272a.n0(i10, list.get(i11));
        }
    }

    @Override // com.google.protobuf.u1
    public void J(int i10, List<?> list, g1 g1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            N(i10, list.get(i11), g1Var);
        }
    }

    @Override // com.google.protobuf.u1
    public void K(int i10, Object obj, g1 g1Var) {
        this.f13272a.A0(i10, (r0) obj, g1Var);
    }

    @Override // com.google.protobuf.u1
    public void L(int i10, g gVar) {
        this.f13272a.n0(i10, gVar);
    }

    @Override // com.google.protobuf.u1
    public void M(int i10, List<?> list, g1 g1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            K(i10, list.get(i11), g1Var);
        }
    }

    @Override // com.google.protobuf.u1
    public void N(int i10, Object obj, g1 g1Var) {
        this.f13272a.H0(i10, (r0) obj, g1Var);
    }

    @Override // com.google.protobuf.u1
    public <K, V> void O(int i10, k0.a<K, V> aVar, Map<K, V> map) {
        if (this.f13272a.d0()) {
            T(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f13272a.V0(i10, 2);
            this.f13272a.X0(k0.b(aVar, entry.getKey(), entry.getValue()));
            k0.e(this.f13272a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.u1
    public void a(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f13272a.x0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f13272a.V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.r(list.get(i13).floatValue());
        }
        this.f13272a.X0(i12);
        while (i11 < list.size()) {
            this.f13272a.y0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.u1
    public final void b(int i10, Object obj) {
        if (obj instanceof g) {
            this.f13272a.K0(i10, (g) obj);
        } else {
            this.f13272a.J0(i10, (r0) obj);
        }
    }

    @Override // com.google.protobuf.u1
    public void c(int i10, int i11) {
        this.f13272a.t0(i10, i11);
    }

    @Override // com.google.protobuf.u1
    public void d(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof g0)) {
            while (i11 < list.size()) {
                this.f13272a.T0(i10, list.get(i11));
                i11++;
            }
        } else {
            g0 g0Var = (g0) list;
            while (i11 < list.size()) {
                V(i10, g0Var.j(i11));
                i11++;
            }
        }
    }

    @Override // com.google.protobuf.u1
    public void e(int i10, String str) {
        this.f13272a.T0(i10, str);
    }

    @Override // com.google.protobuf.u1
    public void f(int i10, long j10) {
        this.f13272a.Y0(i10, j10);
    }

    @Override // com.google.protobuf.u1
    public void g(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f13272a.D0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f13272a.V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.w(list.get(i13).intValue());
        }
        this.f13272a.X0(i12);
        while (i11 < list.size()) {
            this.f13272a.E0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.u1
    public void h(int i10, int i11) {
        this.f13272a.D0(i10, i11);
    }

    @Override // com.google.protobuf.u1
    public void i(int i10, long j10) {
        this.f13272a.N0(i10, j10);
    }

    @Override // com.google.protobuf.u1
    public void j(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f13272a.t0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f13272a.V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.n(list.get(i13).intValue());
        }
        this.f13272a.X0(i12);
        while (i11 < list.size()) {
            this.f13272a.u0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.u1
    public void k(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f13272a.W0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f13272a.V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.W(list.get(i13).intValue());
        }
        this.f13272a.X0(i12);
        while (i11 < list.size()) {
            this.f13272a.X0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.u1
    public void l(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f13272a.R0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f13272a.V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.R(list.get(i13).longValue());
        }
        this.f13272a.X0(i12);
        while (i11 < list.size()) {
            this.f13272a.S0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.u1
    public void m(int i10, long j10) {
        this.f13272a.R0(i10, j10);
    }

    @Override // com.google.protobuf.u1
    public void n(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f13272a.r0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f13272a.V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.l(list.get(i13).intValue());
        }
        this.f13272a.X0(i12);
        while (i11 < list.size()) {
            this.f13272a.s0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.u1
    public void o(int i10, int i11) {
        this.f13272a.W0(i10, i11);
    }

    @Override // com.google.protobuf.u1
    public void p(int i10, double d10) {
        this.f13272a.p0(i10, d10);
    }

    @Override // com.google.protobuf.u1
    public void q(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f13272a.N0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f13272a.V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.N(list.get(i13).longValue());
        }
        this.f13272a.X0(i12);
        while (i11 < list.size()) {
            this.f13272a.O0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.u1
    public void r(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f13272a.Y0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f13272a.V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.Y(list.get(i13).longValue());
        }
        this.f13272a.X0(i12);
        while (i11 < list.size()) {
            this.f13272a.Z0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.u1
    public void s(int i10, long j10) {
        this.f13272a.v0(i10, j10);
    }

    @Override // com.google.protobuf.u1
    public u1.a t() {
        return u1.a.ASCENDING;
    }

    @Override // com.google.protobuf.u1
    public void u(int i10, long j10) {
        this.f13272a.F0(i10, j10);
    }

    @Override // com.google.protobuf.u1
    public void v(int i10, boolean z10) {
        this.f13272a.j0(i10, z10);
    }

    @Override // com.google.protobuf.u1
    public void w(int i10, int i11) {
        this.f13272a.L0(i10, i11);
    }

    @Override // com.google.protobuf.u1
    @Deprecated
    public void x(int i10) {
        this.f13272a.V0(i10, 3);
    }

    @Override // com.google.protobuf.u1
    public void y(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f13272a.v0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f13272a.V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.p(list.get(i13).longValue());
        }
        this.f13272a.X0(i12);
        while (i11 < list.size()) {
            this.f13272a.w0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.u1
    public void z(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f13272a.L0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f13272a.V0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.L(list.get(i13).intValue());
        }
        this.f13272a.X0(i12);
        while (i11 < list.size()) {
            this.f13272a.M0(list.get(i11).intValue());
            i11++;
        }
    }
}
