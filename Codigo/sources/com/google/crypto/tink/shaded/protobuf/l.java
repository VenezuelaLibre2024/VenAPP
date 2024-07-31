package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.k0;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.google.crypto.tink.shaded.protobuf.u1;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class l implements u1 {

    /* renamed from: a, reason: collision with root package name */
    private final k f11462a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11463a;

        static {
            int[] iArr = new int[t1.b.values().length];
            f11463a = iArr;
            try {
                iArr[t1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11463a[t1.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11463a[t1.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11463a[t1.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11463a[t1.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11463a[t1.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11463a[t1.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11463a[t1.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11463a[t1.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11463a[t1.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11463a[t1.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11463a[t1.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private l(k kVar) {
        k kVar2 = (k) a0.b(kVar, "output");
        this.f11462a = kVar2;
        kVar2.f11451a = this;
    }

    public static l P(k kVar) {
        l lVar = kVar.f11451a;
        return lVar != null ? lVar : new l(kVar);
    }

    private <K, V> void Q(int i10, k0.a<K, V> aVar, Map<K, V> map) {
        int[] iArr = a.f11463a;
        throw null;
    }

    private void R(int i10, Object obj) {
        if (obj instanceof String) {
            this.f11462a.K0(i10, (String) obj);
        } else {
            this.f11462a.i0(i10, (h) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void A(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f11462a.g0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f11462a.L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.e(list.get(i13).booleanValue());
        }
        this.f11462a.N0(i12);
        while (i11 < list.size()) {
            this.f11462a.h0(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void B(int i10, float f10) {
        this.f11462a.r0(i10, f10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    @Deprecated
    public void C(int i10) {
        this.f11462a.L0(i10, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void D(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f11462a.G0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f11462a.L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.O(list.get(i13).intValue());
        }
        this.f11462a.N0(i12);
        while (i11 < list.size()) {
            this.f11462a.H0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void E(int i10, int i11) {
        this.f11462a.l0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void F(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f11462a.x0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f11462a.L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.y(list.get(i13).longValue());
        }
        this.f11462a.N0(i12);
        while (i11 < list.size()) {
            this.f11462a.y0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void G(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f11462a.j0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f11462a.L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.j(list.get(i13).doubleValue());
        }
        this.f11462a.N0(i12);
        while (i11 < list.size()) {
            this.f11462a.k0(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void H(int i10, int i11) {
        this.f11462a.G0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void I(int i10, List<h> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f11462a.i0(i10, list.get(i11));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public <K, V> void J(int i10, k0.a<K, V> aVar, Map<K, V> map) {
        if (this.f11462a.b0()) {
            Q(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f11462a.L0(i10, 2);
            this.f11462a.N0(k0.b(aVar, entry.getKey(), entry.getValue()));
            k0.d(this.f11462a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void K(int i10, Object obj, g1 g1Var) {
        this.f11462a.t0(i10, (r0) obj, g1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void L(int i10, List<?> list, g1 g1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            N(i10, list.get(i11), g1Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void M(int i10, h hVar) {
        this.f11462a.i0(i10, hVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void N(int i10, Object obj, g1 g1Var) {
        this.f11462a.z0(i10, (r0) obj, g1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void O(int i10, List<?> list, g1 g1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            K(i10, list.get(i11), g1Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void a(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f11462a.r0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f11462a.L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.r(list.get(i13).floatValue());
        }
        this.f11462a.N0(i12);
        while (i11 < list.size()) {
            this.f11462a.s0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public final void b(int i10, Object obj) {
        if (obj instanceof h) {
            this.f11462a.B0(i10, (h) obj);
        } else {
            this.f11462a.A0(i10, (r0) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void c(int i10, int i11) {
        this.f11462a.n0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void d(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof g0)) {
            while (i11 < list.size()) {
                this.f11462a.K0(i10, list.get(i11));
                i11++;
            }
        } else {
            g0 g0Var = (g0) list;
            while (i11 < list.size()) {
                R(i10, g0Var.j(i11));
                i11++;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void e(int i10, String str) {
        this.f11462a.K0(i10, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void f(int i10, long j10) {
        this.f11462a.O0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void g(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f11462a.v0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f11462a.L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.w(list.get(i13).intValue());
        }
        this.f11462a.N0(i12);
        while (i11 < list.size()) {
            this.f11462a.w0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void h(int i10, int i11) {
        this.f11462a.v0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void i(int i10, long j10) {
        this.f11462a.E0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void j(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f11462a.n0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f11462a.L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.n(list.get(i13).intValue());
        }
        this.f11462a.N0(i12);
        while (i11 < list.size()) {
            this.f11462a.o0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void k(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f11462a.M0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f11462a.L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.V(list.get(i13).intValue());
        }
        this.f11462a.N0(i12);
        while (i11 < list.size()) {
            this.f11462a.N0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void l(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f11462a.I0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f11462a.L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.Q(list.get(i13).longValue());
        }
        this.f11462a.N0(i12);
        while (i11 < list.size()) {
            this.f11462a.J0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void m(int i10, long j10) {
        this.f11462a.I0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void n(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f11462a.l0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f11462a.L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.l(list.get(i13).intValue());
        }
        this.f11462a.N0(i12);
        while (i11 < list.size()) {
            this.f11462a.m0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void o(int i10, int i11) {
        this.f11462a.M0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void p(int i10, double d10) {
        this.f11462a.j0(i10, d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void q(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f11462a.E0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f11462a.L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.M(list.get(i13).longValue());
        }
        this.f11462a.N0(i12);
        while (i11 < list.size()) {
            this.f11462a.F0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void r(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f11462a.O0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f11462a.L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.X(list.get(i13).longValue());
        }
        this.f11462a.N0(i12);
        while (i11 < list.size()) {
            this.f11462a.P0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void s(int i10, long j10) {
        this.f11462a.p0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public u1.a t() {
        return u1.a.ASCENDING;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void u(int i10, long j10) {
        this.f11462a.x0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void v(int i10, boolean z10) {
        this.f11462a.g0(i10, z10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void w(int i10, int i11) {
        this.f11462a.C0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    @Deprecated
    public void x(int i10) {
        this.f11462a.L0(i10, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void y(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f11462a.p0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f11462a.L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.p(list.get(i13).longValue());
        }
        this.f11462a.N0(i12);
        while (i11 < list.size()) {
            this.f11462a.q0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void z(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f11462a.C0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f11462a.L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += k.K(list.get(i13).intValue());
        }
        this.f11462a.N0(i12);
        while (i11 < list.size()) {
            this.f11462a.D0(list.get(i11).intValue());
            i11++;
        }
    }
}
