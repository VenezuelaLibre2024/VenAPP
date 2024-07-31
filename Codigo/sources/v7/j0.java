package v7;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import t6.c2;
import t6.d4;
import v7.a0;

/* loaded from: classes.dex */
public final class j0 extends g<Integer> {
    private static final c2 G = new c2.c().d("MergingMediaSource").a();
    private final i A;
    private final Map<Object, Long> B;
    private final com.google.common.collect.k0<Object, d> C;
    private int D;
    private long[][] E;
    private b F;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f28357v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f28358w;

    /* renamed from: x, reason: collision with root package name */
    private final a0[] f28359x;

    /* renamed from: y, reason: collision with root package name */
    private final d4[] f28360y;

    /* renamed from: z, reason: collision with root package name */
    private final ArrayList<a0> f28361z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends s {

        /* renamed from: r, reason: collision with root package name */
        private final long[] f28362r;

        /* renamed from: s, reason: collision with root package name */
        private final long[] f28363s;

        public a(d4 d4Var, Map<Object, Long> map) {
            super(d4Var);
            int u10 = d4Var.u();
            this.f28363s = new long[d4Var.u()];
            d4.d dVar = new d4.d();
            for (int i10 = 0; i10 < u10; i10++) {
                this.f28363s[i10] = d4Var.s(i10, dVar).f26079y;
            }
            int n10 = d4Var.n();
            this.f28362r = new long[n10];
            d4.b bVar = new d4.b();
            for (int i11 = 0; i11 < n10; i11++) {
                d4Var.l(i11, bVar, true);
                long longValue = ((Long) t8.a.e(map.get(bVar.f26056b))).longValue();
                long[] jArr = this.f28362r;
                longValue = longValue == Long.MIN_VALUE ? bVar.f26058d : longValue;
                jArr[i11] = longValue;
                long j10 = bVar.f26058d;
                if (j10 != -9223372036854775807L) {
                    long[] jArr2 = this.f28363s;
                    int i12 = bVar.f26057c;
                    jArr2[i12] = jArr2[i12] - (j10 - longValue);
                }
            }
        }

        @Override // v7.s, t6.d4
        public d4.b l(int i10, d4.b bVar, boolean z10) {
            super.l(i10, bVar, z10);
            bVar.f26058d = this.f28362r[i10];
            return bVar;
        }

        @Override // v7.s, t6.d4
        public d4.d t(int i10, d4.d dVar, long j10) {
            long j11;
            super.t(i10, dVar, j10);
            long j12 = this.f28363s[i10];
            dVar.f26079y = j12;
            if (j12 != -9223372036854775807L) {
                long j13 = dVar.f26078x;
                if (j13 != -9223372036854775807L) {
                    j11 = Math.min(j13, j12);
                    dVar.f26078x = j11;
                    return dVar;
                }
            }
            j11 = dVar.f26078x;
            dVar.f26078x = j11;
            return dVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f28364a;

        public b(int i10) {
            this.f28364a = i10;
        }
    }

    public j0(boolean z10, boolean z11, i iVar, a0... a0VarArr) {
        this.f28357v = z10;
        this.f28358w = z11;
        this.f28359x = a0VarArr;
        this.A = iVar;
        this.f28361z = new ArrayList<>(Arrays.asList(a0VarArr));
        this.D = -1;
        this.f28360y = new d4[a0VarArr.length];
        this.E = new long[0];
        this.B = new HashMap();
        this.C = com.google.common.collect.l0.a().a().e();
    }

    public j0(boolean z10, boolean z11, a0... a0VarArr) {
        this(z10, z11, new j(), a0VarArr);
    }

    public j0(boolean z10, a0... a0VarArr) {
        this(z10, false, a0VarArr);
    }

    public j0(a0... a0VarArr) {
        this(false, a0VarArr);
    }

    private void M() {
        d4.b bVar = new d4.b();
        for (int i10 = 0; i10 < this.D; i10++) {
            long j10 = -this.f28360y[0].k(i10, bVar).r();
            int i11 = 1;
            while (true) {
                d4[] d4VarArr = this.f28360y;
                if (i11 < d4VarArr.length) {
                    this.E[i10][i11] = j10 - (-d4VarArr[i11].k(i10, bVar).r());
                    i11++;
                }
            }
        }
    }

    private void P() {
        d4[] d4VarArr;
        d4.b bVar = new d4.b();
        for (int i10 = 0; i10 < this.D; i10++) {
            int i11 = 0;
            long j10 = Long.MIN_VALUE;
            while (true) {
                d4VarArr = this.f28360y;
                if (i11 >= d4VarArr.length) {
                    break;
                }
                long n10 = d4VarArr[i11].k(i10, bVar).n();
                if (n10 != -9223372036854775807L) {
                    long j11 = n10 + this.E[i10][i11];
                    if (j10 == Long.MIN_VALUE || j11 < j10) {
                        j10 = j11;
                    }
                }
                i11++;
            }
            Object r10 = d4VarArr[0].r(i10);
            this.B.put(r10, Long.valueOf(j10));
            Iterator<d> it = this.C.p(r10).iterator();
            while (it.hasNext()) {
                it.next().u(0L, j10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v7.g, v7.a
    public void C(s8.m0 m0Var) {
        super.C(m0Var);
        for (int i10 = 0; i10 < this.f28359x.length; i10++) {
            L(Integer.valueOf(i10), this.f28359x[i10]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v7.g, v7.a
    public void E() {
        super.E();
        Arrays.fill(this.f28360y, (Object) null);
        this.D = -1;
        this.F = null;
        this.f28361z.clear();
        Collections.addAll(this.f28361z, this.f28359x);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v7.g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public a0.b G(Integer num, a0.b bVar) {
        if (num.intValue() == 0) {
            return bVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v7.g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void J(Integer num, a0 a0Var, d4 d4Var) {
        if (this.F != null) {
            return;
        }
        if (this.D == -1) {
            this.D = d4Var.n();
        } else if (d4Var.n() != this.D) {
            this.F = new b(0);
            return;
        }
        if (this.E.length == 0) {
            this.E = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.D, this.f28360y.length);
        }
        this.f28361z.remove(a0Var);
        this.f28360y[num.intValue()] = d4Var;
        if (this.f28361z.isEmpty()) {
            if (this.f28357v) {
                M();
            }
            d4 d4Var2 = this.f28360y[0];
            if (this.f28358w) {
                P();
                d4Var2 = new a(d4Var2, this.B);
            }
            D(d4Var2);
        }
    }

    @Override // v7.a0
    public c2 d() {
        a0[] a0VarArr = this.f28359x;
        return a0VarArr.length > 0 ? a0VarArr[0].d() : G;
    }

    @Override // v7.a0
    public y e(a0.b bVar, s8.b bVar2, long j10) {
        int length = this.f28359x.length;
        y[] yVarArr = new y[length];
        int g10 = this.f28360y[0].g(bVar.f28543a);
        for (int i10 = 0; i10 < length; i10++) {
            yVarArr[i10] = this.f28359x[i10].e(bVar.c(this.f28360y[i10].r(g10)), bVar2, j10 - this.E[g10][i10]);
        }
        i0 i0Var = new i0(this.A, this.E[g10], yVarArr);
        if (!this.f28358w) {
            return i0Var;
        }
        d dVar = new d(i0Var, true, 0L, ((Long) t8.a.e(this.B.get(bVar.f28543a))).longValue());
        this.C.put(bVar.f28543a, dVar);
        return dVar;
    }

    @Override // v7.a0
    public void l(y yVar) {
        if (this.f28358w) {
            d dVar = (d) yVar;
            Iterator<Map.Entry<Object, d>> it = this.C.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, d> next = it.next();
                if (next.getValue().equals(dVar)) {
                    this.C.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            yVar = dVar.f28269a;
        }
        i0 i0Var = (i0) yVar;
        int i10 = 0;
        while (true) {
            a0[] a0VarArr = this.f28359x;
            if (i10 >= a0VarArr.length) {
                return;
            }
            a0VarArr[i10].l(i0Var.d(i10));
            i10++;
        }
    }

    @Override // v7.g, v7.a0
    public void n() {
        b bVar = this.F;
        if (bVar != null) {
            throw bVar;
        }
        super.n();
    }
}
