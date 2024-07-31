package v7;

import android.net.Uri;
import t6.c2;
import t6.d4;

/* loaded from: classes.dex */
public final class y0 extends d4 {
    private static final Object D = new Object();
    private static final c2 E = new c2.c().d("SinglePeriodTimeline").g(Uri.EMPTY).a();
    private final Object A;
    private final c2 B;
    private final c2.g C;

    /* renamed from: f, reason: collision with root package name */
    private final long f28533f;

    /* renamed from: r, reason: collision with root package name */
    private final long f28534r;

    /* renamed from: s, reason: collision with root package name */
    private final long f28535s;

    /* renamed from: t, reason: collision with root package name */
    private final long f28536t;

    /* renamed from: u, reason: collision with root package name */
    private final long f28537u;

    /* renamed from: v, reason: collision with root package name */
    private final long f28538v;

    /* renamed from: w, reason: collision with root package name */
    private final long f28539w;

    /* renamed from: x, reason: collision with root package name */
    private final boolean f28540x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f28541y;

    /* renamed from: z, reason: collision with root package name */
    private final boolean f28542z;

    public y0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, c2 c2Var, c2.g gVar) {
        this.f28533f = j10;
        this.f28534r = j11;
        this.f28535s = j12;
        this.f28536t = j13;
        this.f28537u = j14;
        this.f28538v = j15;
        this.f28539w = j16;
        this.f28540x = z10;
        this.f28541y = z11;
        this.f28542z = z12;
        this.A = obj;
        this.B = (c2) t8.a.e(c2Var);
        this.C = gVar;
    }

    public y0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, c2 c2Var) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, c2Var, z12 ? c2Var.f25882d : null);
    }

    public y0(long j10, boolean z10, boolean z11, boolean z12, Object obj, c2 c2Var) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, c2Var);
    }

    @Override // t6.d4
    public int g(Object obj) {
        return D.equals(obj) ? 0 : -1;
    }

    @Override // t6.d4
    public d4.b l(int i10, d4.b bVar, boolean z10) {
        t8.a.c(i10, 0, 1);
        return bVar.v(null, z10 ? D : null, 0, this.f28536t, -this.f28538v);
    }

    @Override // t6.d4
    public int n() {
        return 1;
    }

    @Override // t6.d4
    public Object r(int i10) {
        t8.a.c(i10, 0, 1);
        return D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // t6.d4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t6.d4.d t(int r25, t6.d4.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            t8.a.c(r3, r1, r2)
            long r1 = r0.f28539w
            boolean r14 = r0.f28541y
            if (r14 == 0) goto L2e
            boolean r3 = r0.f28542z
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.f28537u
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r5
            goto L30
        L27:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = t6.d4.d.C
            t6.c2 r5 = r0.B
            java.lang.Object r6 = r0.A
            long r7 = r0.f28533f
            long r9 = r0.f28534r
            long r11 = r0.f28535s
            boolean r13 = r0.f28540x
            t6.c2$g r15 = r0.C
            long r1 = r0.f28537u
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f28538v
            r22 = r1
            r3 = r26
            t6.d4$d r1 = r3.j(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.y0.t(int, t6.d4$d, long):t6.d4$d");
    }

    @Override // t6.d4
    public int u() {
        return 1;
    }
}
