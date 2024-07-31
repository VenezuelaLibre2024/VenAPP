package t6;

import com.google.common.collect.w;
import t6.d4;
import v7.a0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    private final d4.b f26297a = new d4.b();

    /* renamed from: b, reason: collision with root package name */
    private final d4.d f26298b = new d4.d();

    /* renamed from: c, reason: collision with root package name */
    private final u6.a f26299c;

    /* renamed from: d, reason: collision with root package name */
    private final t8.o f26300d;

    /* renamed from: e, reason: collision with root package name */
    private long f26301e;

    /* renamed from: f, reason: collision with root package name */
    private int f26302f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f26303g;

    /* renamed from: h, reason: collision with root package name */
    private i2 f26304h;

    /* renamed from: i, reason: collision with root package name */
    private i2 f26305i;

    /* renamed from: j, reason: collision with root package name */
    private i2 f26306j;

    /* renamed from: k, reason: collision with root package name */
    private int f26307k;

    /* renamed from: l, reason: collision with root package name */
    private Object f26308l;

    /* renamed from: m, reason: collision with root package name */
    private long f26309m;

    public l2(u6.a aVar, t8.o oVar) {
        this.f26299c = aVar;
        this.f26300d = oVar;
    }

    private static a0.b A(d4 d4Var, Object obj, long j10, long j11, d4.d dVar, d4.b bVar) {
        d4Var.m(obj, bVar);
        d4Var.s(bVar.f26057c, dVar);
        int g10 = d4Var.g(obj);
        Object obj2 = obj;
        while (bVar.f26058d == 0 && bVar.g() > 0 && bVar.u(bVar.s()) && bVar.i(0L) == -1) {
            int i10 = g10 + 1;
            if (g10 >= dVar.A) {
                break;
            }
            d4Var.l(i10, bVar, true);
            obj2 = t8.a.e(bVar.f26056b);
            g10 = i10;
        }
        d4Var.m(obj2, bVar);
        int i11 = bVar.i(j10);
        return i11 == -1 ? new a0.b(obj2, j11, bVar.h(j10)) : new a0.b(obj2, i11, bVar.o(i11), j11);
    }

    private long C(d4 d4Var, Object obj) {
        int g10;
        int i10 = d4Var.m(obj, this.f26297a).f26057c;
        Object obj2 = this.f26308l;
        if (obj2 != null && (g10 = d4Var.g(obj2)) != -1 && d4Var.k(g10, this.f26297a).f26057c == i10) {
            return this.f26309m;
        }
        i2 i2Var = this.f26304h;
        while (true) {
            if (i2Var == null) {
                i2Var = this.f26304h;
                while (i2Var != null) {
                    int g11 = d4Var.g(i2Var.f26186b);
                    if (g11 == -1 || d4Var.k(g11, this.f26297a).f26057c != i10) {
                        i2Var = i2Var.j();
                    }
                }
                long j10 = this.f26301e;
                this.f26301e = 1 + j10;
                if (this.f26304h == null) {
                    this.f26308l = obj;
                    this.f26309m = j10;
                }
                return j10;
            }
            if (i2Var.f26186b.equals(obj)) {
                break;
            }
            i2Var = i2Var.j();
        }
        return i2Var.f26190f.f26237a.f28546d;
    }

    private boolean E(d4 d4Var) {
        i2 i2Var = this.f26304h;
        if (i2Var == null) {
            return true;
        }
        int g10 = d4Var.g(i2Var.f26186b);
        while (true) {
            g10 = d4Var.i(g10, this.f26297a, this.f26298b, this.f26302f, this.f26303g);
            while (i2Var.j() != null && !i2Var.f26190f.f26243g) {
                i2Var = i2Var.j();
            }
            i2 j10 = i2Var.j();
            if (g10 == -1 || j10 == null || d4Var.g(j10.f26186b) != g10) {
                break;
            }
            i2Var = j10;
        }
        boolean z10 = z(i2Var);
        i2Var.f26190f = r(d4Var, i2Var.f26190f);
        return !z10;
    }

    private boolean d(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private boolean e(j2 j2Var, j2 j2Var2) {
        return j2Var.f26238b == j2Var2.f26238b && j2Var.f26237a.equals(j2Var2.f26237a);
    }

    private j2 h(g3 g3Var) {
        return k(g3Var.f26095a, g3Var.f26096b, g3Var.f26097c, g3Var.f26112r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cc, code lost:
    
        if (r0.u(r0.s()) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private t6.j2 i(t6.d4 r20, t6.i2 r21, long r22) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.l2.i(t6.d4, t6.i2, long):t6.j2");
    }

    private j2 k(d4 d4Var, a0.b bVar, long j10, long j11) {
        d4Var.m(bVar.f28543a, this.f26297a);
        boolean b10 = bVar.b();
        Object obj = bVar.f28543a;
        return b10 ? l(d4Var, obj, bVar.f28544b, bVar.f28545c, j10, bVar.f28546d) : m(d4Var, obj, j11, j10, bVar.f28546d);
    }

    private j2 l(d4 d4Var, Object obj, int i10, int i11, long j10, long j11) {
        a0.b bVar = new a0.b(obj, i10, i11, j11);
        long f10 = d4Var.m(bVar.f28543a, this.f26297a).f(bVar.f28544b, bVar.f28545c);
        long k10 = i11 == this.f26297a.o(i10) ? this.f26297a.k() : 0L;
        return new j2(bVar, (f10 == -9223372036854775807L || k10 < f10) ? k10 : Math.max(0L, f10 - 1), j10, -9223372036854775807L, f10, this.f26297a.u(bVar.f28544b), false, false, false);
    }

    private j2 m(d4 d4Var, Object obj, long j10, long j11, long j12) {
        boolean z10;
        long j13;
        long j14;
        long j15;
        long j16 = j10;
        d4Var.m(obj, this.f26297a);
        int h10 = this.f26297a.h(j16);
        int i10 = 1;
        d4.b bVar = this.f26297a;
        if (h10 == -1) {
            if (bVar.g() > 0) {
                d4.b bVar2 = this.f26297a;
                if (bVar2.u(bVar2.s())) {
                    z10 = true;
                }
            }
            z10 = false;
        } else {
            if (bVar.u(h10)) {
                long j17 = this.f26297a.j(h10);
                d4.b bVar3 = this.f26297a;
                if (j17 == bVar3.f26058d && bVar3.t(h10)) {
                    z10 = true;
                    h10 = -1;
                }
            }
            z10 = false;
        }
        a0.b bVar4 = new a0.b(obj, j12, h10);
        boolean s10 = s(bVar4);
        boolean u10 = u(d4Var, bVar4);
        boolean t10 = t(d4Var, bVar4, s10);
        boolean z11 = h10 != -1 && this.f26297a.u(h10);
        if (h10 != -1) {
            j14 = this.f26297a.j(h10);
        } else {
            if (!z10) {
                j13 = -9223372036854775807L;
                j15 = (j13 != -9223372036854775807L || j13 == Long.MIN_VALUE) ? this.f26297a.f26058d : j13;
                if (j15 != -9223372036854775807L && j16 >= j15) {
                    if (!t10 && z10) {
                        i10 = 0;
                    }
                    j16 = Math.max(0L, j15 - i10);
                }
                return new j2(bVar4, j16, j11, j13, j15, z11, s10, u10, t10);
            }
            j14 = this.f26297a.f26058d;
        }
        j13 = j14;
        if (j13 != -9223372036854775807L) {
        }
        if (j15 != -9223372036854775807L) {
            if (!t10) {
                i10 = 0;
            }
            j16 = Math.max(0L, j15 - i10);
        }
        return new j2(bVar4, j16, j11, j13, j15, z11, s10, u10, t10);
    }

    private long n(d4 d4Var, Object obj, int i10) {
        d4Var.m(obj, this.f26297a);
        long j10 = this.f26297a.j(i10);
        return j10 == Long.MIN_VALUE ? this.f26297a.f26058d : j10 + this.f26297a.m(i10);
    }

    private boolean s(a0.b bVar) {
        return !bVar.b() && bVar.f28547e == -1;
    }

    private boolean t(d4 d4Var, a0.b bVar, boolean z10) {
        int g10 = d4Var.g(bVar.f28543a);
        return !d4Var.s(d4Var.k(g10, this.f26297a).f26057c, this.f26298b).f26074t && d4Var.w(g10, this.f26297a, this.f26298b, this.f26302f, this.f26303g) && z10;
    }

    private boolean u(d4 d4Var, a0.b bVar) {
        if (s(bVar)) {
            return d4Var.s(d4Var.m(bVar.f28543a, this.f26297a).f26057c, this.f26298b).A == d4Var.g(bVar.f28543a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(w.a aVar, a0.b bVar) {
        this.f26299c.H(aVar.k(), bVar);
    }

    private void x() {
        final w.a p10 = com.google.common.collect.w.p();
        for (i2 i2Var = this.f26304h; i2Var != null; i2Var = i2Var.j()) {
            p10.a(i2Var.f26190f.f26237a);
        }
        i2 i2Var2 = this.f26305i;
        final a0.b bVar = i2Var2 == null ? null : i2Var2.f26190f.f26237a;
        this.f26300d.h(new Runnable() { // from class: t6.k2
            @Override // java.lang.Runnable
            public final void run() {
                l2.this.w(p10, bVar);
            }
        });
    }

    public a0.b B(d4 d4Var, Object obj, long j10) {
        long C = C(d4Var, obj);
        d4Var.m(obj, this.f26297a);
        d4Var.s(this.f26297a.f26057c, this.f26298b);
        boolean z10 = false;
        for (int g10 = d4Var.g(obj); g10 >= this.f26298b.f26080z; g10--) {
            d4Var.l(g10, this.f26297a, true);
            boolean z11 = this.f26297a.g() > 0;
            z10 |= z11;
            d4.b bVar = this.f26297a;
            if (bVar.i(bVar.f26058d) != -1) {
                obj = t8.a.e(this.f26297a.f26056b);
            }
            if (z10 && (!z11 || this.f26297a.f26058d != 0)) {
                break;
            }
        }
        return A(d4Var, obj, j10, C, this.f26298b, this.f26297a);
    }

    public boolean D() {
        i2 i2Var = this.f26306j;
        return i2Var == null || (!i2Var.f26190f.f26245i && i2Var.q() && this.f26306j.f26190f.f26241e != -9223372036854775807L && this.f26307k < 100);
    }

    public boolean F(d4 d4Var, long j10, long j11) {
        j2 j2Var;
        i2 i2Var = this.f26304h;
        i2 i2Var2 = null;
        while (i2Var != null) {
            j2 j2Var2 = i2Var.f26190f;
            if (i2Var2 != null) {
                j2 i10 = i(d4Var, i2Var2, j10);
                if (i10 != null && e(j2Var2, i10)) {
                    j2Var = i10;
                }
                return !z(i2Var2);
            }
            j2Var = r(d4Var, j2Var2);
            i2Var.f26190f = j2Var.a(j2Var2.f26239c);
            if (!d(j2Var2.f26241e, j2Var.f26241e)) {
                i2Var.A();
                long j12 = j2Var.f26241e;
                return (z(i2Var) || (i2Var == this.f26305i && !i2Var.f26190f.f26242f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : i2Var.z(j12)) ? 1 : (j11 == ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : i2Var.z(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            i2Var2 = i2Var;
            i2Var = i2Var.j();
        }
        return true;
    }

    public boolean G(d4 d4Var, int i10) {
        this.f26302f = i10;
        return E(d4Var);
    }

    public boolean H(d4 d4Var, boolean z10) {
        this.f26303g = z10;
        return E(d4Var);
    }

    public i2 b() {
        i2 i2Var = this.f26304h;
        if (i2Var == null) {
            return null;
        }
        if (i2Var == this.f26305i) {
            this.f26305i = i2Var.j();
        }
        this.f26304h.t();
        int i10 = this.f26307k - 1;
        this.f26307k = i10;
        if (i10 == 0) {
            this.f26306j = null;
            i2 i2Var2 = this.f26304h;
            this.f26308l = i2Var2.f26186b;
            this.f26309m = i2Var2.f26190f.f26237a.f28546d;
        }
        this.f26304h = this.f26304h.j();
        x();
        return this.f26304h;
    }

    public i2 c() {
        i2 i2Var = this.f26305i;
        t8.a.g((i2Var == null || i2Var.j() == null) ? false : true);
        this.f26305i = this.f26305i.j();
        x();
        return this.f26305i;
    }

    public void f() {
        if (this.f26307k == 0) {
            return;
        }
        i2 i2Var = (i2) t8.a.i(this.f26304h);
        this.f26308l = i2Var.f26186b;
        this.f26309m = i2Var.f26190f.f26237a.f28546d;
        while (i2Var != null) {
            i2Var.t();
            i2Var = i2Var.j();
        }
        this.f26304h = null;
        this.f26306j = null;
        this.f26305i = null;
        this.f26307k = 0;
        x();
    }

    public i2 g(r3[] r3VarArr, q8.a0 a0Var, s8.b bVar, a3 a3Var, j2 j2Var, q8.b0 b0Var) {
        i2 i2Var = this.f26306j;
        i2 i2Var2 = new i2(r3VarArr, i2Var == null ? 1000000000000L : (i2Var.l() + this.f26306j.f26190f.f26241e) - j2Var.f26238b, a0Var, bVar, a3Var, j2Var, b0Var);
        i2 i2Var3 = this.f26306j;
        if (i2Var3 != null) {
            i2Var3.w(i2Var2);
        } else {
            this.f26304h = i2Var2;
            this.f26305i = i2Var2;
        }
        this.f26308l = null;
        this.f26306j = i2Var2;
        this.f26307k++;
        x();
        return i2Var2;
    }

    public i2 j() {
        return this.f26306j;
    }

    public j2 o(long j10, g3 g3Var) {
        i2 i2Var = this.f26306j;
        return i2Var == null ? h(g3Var) : i(g3Var.f26095a, i2Var, j10);
    }

    public i2 p() {
        return this.f26304h;
    }

    public i2 q() {
        return this.f26305i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t6.j2 r(t6.d4 r19, t6.j2 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            v7.a0$b r3 = r2.f26237a
            boolean r12 = r0.s(r3)
            boolean r13 = r0.u(r1, r3)
            boolean r14 = r0.t(r1, r3, r12)
            v7.a0$b r4 = r2.f26237a
            java.lang.Object r4 = r4.f28543a
            t6.d4$b r5 = r0.f26297a
            r1.m(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L35
            int r1 = r3.f28547e
            if (r1 != r4) goto L2e
            goto L35
        L2e:
            t6.d4$b r7 = r0.f26297a
            long r7 = r7.j(r1)
            goto L36
        L35:
            r7 = r5
        L36:
            boolean r1 = r3.b()
            if (r1 == 0) goto L48
            t6.d4$b r1 = r0.f26297a
            int r5 = r3.f28544b
            int r6 = r3.f28545c
            long r5 = r1.f(r5, r6)
        L46:
            r9 = r5
            goto L5c
        L48:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            t6.d4$b r1 = r0.f26297a
            long r5 = r1.n()
            goto L46
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L6c
            t6.d4$b r1 = r0.f26297a
            int r4 = r3.f28544b
            boolean r1 = r1.u(r4)
        L6a:
            r11 = r1
            goto L7c
        L6c:
            int r1 = r3.f28547e
            if (r1 == r4) goto L7a
            t6.d4$b r4 = r0.f26297a
            boolean r1 = r4.u(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            t6.j2 r15 = new t6.j2
            long r4 = r2.f26238b
            long r1 = r2.f26239c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.l2.r(t6.d4, t6.j2):t6.j2");
    }

    public boolean v(v7.y yVar) {
        i2 i2Var = this.f26306j;
        return i2Var != null && i2Var.f26185a == yVar;
    }

    public void y(long j10) {
        i2 i2Var = this.f26306j;
        if (i2Var != null) {
            i2Var.s(j10);
        }
    }

    public boolean z(i2 i2Var) {
        boolean z10 = false;
        t8.a.g(i2Var != null);
        if (i2Var.equals(this.f26306j)) {
            return false;
        }
        this.f26306j = i2Var;
        while (i2Var.j() != null) {
            i2Var = i2Var.j();
            if (i2Var == this.f26305i) {
                this.f26305i = this.f26304h;
                z10 = true;
            }
            i2Var.t();
            this.f26307k--;
        }
        this.f26306j.w(null);
        x();
        return z10;
    }
}
