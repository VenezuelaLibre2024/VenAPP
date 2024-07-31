package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C5980k0;
import com.google.crypto.tink.shaded.protobuf.C6008t1;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.crypto.tink.shaded.protobuf.l */
/* loaded from: classes2.dex */
public final class C5982l implements InterfaceC6011u1 {

    /* renamed from: a */
    private final AbstractC5979k f12677a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.l$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12678a;

        static {
            int[] iArr = new int[C6008t1.b.values().length];
            f12678a = iArr;
            try {
                iArr[C6008t1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12678a[C6008t1.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12678a[C6008t1.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12678a[C6008t1.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12678a[C6008t1.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12678a[C6008t1.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12678a[C6008t1.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12678a[C6008t1.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12678a[C6008t1.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12678a[C6008t1.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12678a[C6008t1.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12678a[C6008t1.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C5982l(AbstractC5979k abstractC5979k) {
        AbstractC5979k abstractC5979k2 = (AbstractC5979k) C5950a0.m15303b(abstractC5979k, "output");
        this.f12677a = abstractC5979k2;
        abstractC5979k2.f12666a = this;
    }

    /* renamed from: P */
    public static C5982l m15806P(AbstractC5979k abstractC5979k) {
        C5982l c5982l = abstractC5979k.f12666a;
        return c5982l != null ? c5982l : new C5982l(abstractC5979k);
    }

    /* renamed from: Q */
    private <K, V> void m15807Q(int i10, C5980k0.a<K, V> aVar, Map<K, V> map) {
        int[] iArr = a.f12678a;
        throw null;
    }

    /* renamed from: R */
    private void m15808R(int i10, Object obj) {
        if (obj instanceof String) {
            this.f12677a.mo15764K0(i10, (String) obj);
        } else {
            this.f12677a.mo15777i0(i10, (AbstractC5970h) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: A */
    public void mo15809A(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12677a.mo15775g0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f12677a.mo15765L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5979k.m15732e(list.get(i13).booleanValue());
        }
        this.f12677a.mo15767N0(i12);
        while (i11 < list.size()) {
            this.f12677a.m15776h0(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: B */
    public void mo15810B(int i10, float f10) {
        this.f12677a.m15786r0(i10, f10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    @Deprecated
    /* renamed from: C */
    public void mo15811C(int i10) {
        this.f12677a.mo15765L0(i10, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: D */
    public void mo15812D(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12677a.m15760G0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f12677a.mo15765L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5979k.m15716O(list.get(i13).intValue());
        }
        this.f12677a.mo15767N0(i12);
        while (i11 < list.size()) {
            this.f12677a.m15761H0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: E */
    public void mo15813E(int i10, int i11) {
        this.f12677a.m15780l0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: F */
    public void mo15814F(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12677a.m15792x0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f12677a.mo15765L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5979k.m15752y(list.get(i13).longValue());
        }
        this.f12677a.mo15767N0(i12);
        while (i11 < list.size()) {
            this.f12677a.m15793y0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: G */
    public void mo15815G(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12677a.m15778j0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f12677a.mo15765L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5979k.m15737j(list.get(i13).doubleValue());
        }
        this.f12677a.mo15767N0(i12);
        while (i11 < list.size()) {
            this.f12677a.m15779k0(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: H */
    public void mo15816H(int i10, int i11) {
        this.f12677a.m15760G0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: I */
    public void mo15817I(int i10, List<AbstractC5970h> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f12677a.mo15777i0(i10, list.get(i11));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: J */
    public <K, V> void mo15818J(int i10, C5980k0.a<K, V> aVar, Map<K, V> map) {
        if (this.f12677a.m15771b0()) {
            m15807Q(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f12677a.mo15765L0(i10, 2);
            this.f12677a.mo15767N0(C5980k0.m15800b(aVar, entry.getKey(), entry.getValue()));
            C5980k0.m15801d(this.f12677a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: K */
    public void mo15819K(int i10, Object obj, InterfaceC5969g1 interfaceC5969g1) {
        this.f12677a.m15788t0(i10, (InterfaceC6001r0) obj, interfaceC5969g1);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: L */
    public void mo15820L(int i10, List<?> list, InterfaceC5969g1 interfaceC5969g1) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            mo15822N(i10, list.get(i11), interfaceC5969g1);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: M */
    public void mo15821M(int i10, AbstractC5970h abstractC5970h) {
        this.f12677a.mo15777i0(i10, abstractC5970h);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: N */
    public void mo15822N(int i10, Object obj, InterfaceC5969g1 interfaceC5969g1) {
        this.f12677a.mo15794z0(i10, (InterfaceC6001r0) obj, interfaceC5969g1);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: O */
    public void mo15823O(int i10, List<?> list, InterfaceC5969g1 interfaceC5969g1) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            mo15819K(i10, list.get(i11), interfaceC5969g1);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: a */
    public void mo15824a(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12677a.m15786r0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f12677a.mo15765L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5979k.m15745r(list.get(i13).floatValue());
        }
        this.f12677a.mo15767N0(i12);
        while (i11 < list.size()) {
            this.f12677a.m15787s0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: b */
    public final void mo15825b(int i10, Object obj) {
        if (obj instanceof AbstractC5970h) {
            this.f12677a.mo15755B0(i10, (AbstractC5970h) obj);
        } else {
            this.f12677a.mo15754A0(i10, (InterfaceC6001r0) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: c */
    public void mo15826c(int i10, int i11) {
        this.f12677a.mo15782n0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: d */
    public void mo15827d(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof InterfaceC5968g0)) {
            while (i11 < list.size()) {
                this.f12677a.mo15764K0(i10, list.get(i11));
                i11++;
            }
        } else {
            InterfaceC5968g0 interfaceC5968g0 = (InterfaceC5968g0) list;
            while (i11 < list.size()) {
                m15808R(i10, interfaceC5968g0.mo15422j(i11));
                i11++;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: e */
    public void mo15828e(int i10, String str) {
        this.f12677a.mo15764K0(i10, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: f */
    public void mo15829f(int i10, long j10) {
        this.f12677a.mo15768O0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: g */
    public void mo15830g(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12677a.mo15790v0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f12677a.mo15765L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5979k.m15750w(list.get(i13).intValue());
        }
        this.f12677a.mo15767N0(i12);
        while (i11 < list.size()) {
            this.f12677a.mo15791w0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: h */
    public void mo15831h(int i10, int i11) {
        this.f12677a.mo15790v0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: i */
    public void mo15832i(int i10, long j10) {
        this.f12677a.m15758E0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: j */
    public void mo15833j(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12677a.mo15782n0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f12677a.mo15765L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5979k.m15741n(list.get(i13).intValue());
        }
        this.f12677a.mo15767N0(i12);
        while (i11 < list.size()) {
            this.f12677a.mo15783o0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: k */
    public void mo15834k(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12677a.mo15766M0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f12677a.mo15765L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5979k.m15723V(list.get(i13).intValue());
        }
        this.f12677a.mo15767N0(i12);
        while (i11 < list.size()) {
            this.f12677a.mo15767N0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: l */
    public void mo15835l(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12677a.m15762I0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f12677a.mo15765L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5979k.m15718Q(list.get(i13).longValue());
        }
        this.f12677a.mo15767N0(i12);
        while (i11 < list.size()) {
            this.f12677a.m15763J0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: m */
    public void mo15836m(int i10, long j10) {
        this.f12677a.m15762I0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: n */
    public void mo15837n(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12677a.m15780l0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f12677a.mo15765L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5979k.m15739l(list.get(i13).intValue());
        }
        this.f12677a.mo15767N0(i12);
        while (i11 < list.size()) {
            this.f12677a.m15781m0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: o */
    public void mo15838o(int i10, int i11) {
        this.f12677a.mo15766M0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: p */
    public void mo15839p(int i10, double d10) {
        this.f12677a.m15778j0(i10, d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: q */
    public void mo15840q(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12677a.m15758E0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f12677a.mo15765L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5979k.m15714M(list.get(i13).longValue());
        }
        this.f12677a.mo15767N0(i12);
        while (i11 < list.size()) {
            this.f12677a.m15759F0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: r */
    public void mo15841r(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12677a.mo15768O0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f12677a.mo15765L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5979k.m15725X(list.get(i13).longValue());
        }
        this.f12677a.mo15767N0(i12);
        while (i11 < list.size()) {
            this.f12677a.mo15769P0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: s */
    public void mo15842s(int i10, long j10) {
        this.f12677a.mo15784p0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: t */
    public InterfaceC6011u1.a mo15843t() {
        return InterfaceC6011u1.a.ASCENDING;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: u */
    public void mo15844u(int i10, long j10) {
        this.f12677a.m15792x0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: v */
    public void mo15845v(int i10, boolean z10) {
        this.f12677a.mo15775g0(i10, z10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: w */
    public void mo15846w(int i10, int i11) {
        this.f12677a.m15756C0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    @Deprecated
    /* renamed from: x */
    public void mo15847x(int i10) {
        this.f12677a.mo15765L0(i10, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: y */
    public void mo15848y(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12677a.mo15784p0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f12677a.mo15765L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5979k.m15743p(list.get(i13).longValue());
        }
        this.f12677a.mo15767N0(i12);
        while (i11 < list.size()) {
            this.f12677a.mo15785q0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1
    /* renamed from: z */
    public void mo15849z(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12677a.m15756C0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f12677a.mo15765L0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5979k.m15712K(list.get(i13).intValue());
        }
        this.f12677a.mo15767N0(i12);
        while (i11 < list.size()) {
            this.f12677a.m15757D0(list.get(i11).intValue());
            i11++;
        }
    }
}
