package i7;

import i7.i0;
import t8.n0;

/* loaded from: classes.dex */
public final class w implements i0 {

    /* renamed from: a, reason: collision with root package name */
    private final m f17522a;

    /* renamed from: b, reason: collision with root package name */
    private final t8.d0 f17523b = new t8.d0(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    private int f17524c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f17525d;

    /* renamed from: e, reason: collision with root package name */
    private n0 f17526e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17527f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17528g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17529h;

    /* renamed from: i, reason: collision with root package name */
    private int f17530i;

    /* renamed from: j, reason: collision with root package name */
    private int f17531j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17532k;

    /* renamed from: l, reason: collision with root package name */
    private long f17533l;

    public w(m mVar) {
        this.f17522a = mVar;
    }

    private boolean d(t8.e0 e0Var, byte[] bArr, int i10) {
        int min = Math.min(e0Var.a(), i10 - this.f17525d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            e0Var.V(min);
        } else {
            e0Var.l(bArr, this.f17525d, min);
        }
        int i11 = this.f17525d + min;
        this.f17525d = i11;
        return i11 == i10;
    }

    private boolean e() {
        this.f17523b.p(0);
        int h10 = this.f17523b.h(24);
        if (h10 != 1) {
            t8.s.i("PesReader", "Unexpected start code prefix: " + h10);
            this.f17531j = -1;
            return false;
        }
        this.f17523b.r(8);
        int h11 = this.f17523b.h(16);
        this.f17523b.r(5);
        this.f17532k = this.f17523b.g();
        this.f17523b.r(2);
        this.f17527f = this.f17523b.g();
        this.f17528g = this.f17523b.g();
        this.f17523b.r(6);
        int h12 = this.f17523b.h(8);
        this.f17530i = h12;
        if (h11 != 0) {
            int i10 = ((h11 + 6) - 9) - h12;
            this.f17531j = i10;
            if (i10 < 0) {
                t8.s.i("PesReader", "Found negative packet payload size: " + this.f17531j);
            }
            return true;
        }
        this.f17531j = -1;
        return true;
    }

    private void f() {
        this.f17523b.p(0);
        this.f17533l = -9223372036854775807L;
        if (this.f17527f) {
            this.f17523b.r(4);
            this.f17523b.r(1);
            this.f17523b.r(1);
            long h10 = (this.f17523b.h(3) << 30) | (this.f17523b.h(15) << 15) | this.f17523b.h(15);
            this.f17523b.r(1);
            if (!this.f17529h && this.f17528g) {
                this.f17523b.r(4);
                this.f17523b.r(1);
                this.f17523b.r(1);
                this.f17523b.r(1);
                this.f17526e.b((this.f17523b.h(3) << 30) | (this.f17523b.h(15) << 15) | this.f17523b.h(15));
                this.f17529h = true;
            }
            this.f17533l = this.f17526e.b(h10);
        }
    }

    private void g(int i10) {
        this.f17524c = i10;
        this.f17525d = 0;
    }

    @Override // i7.i0
    public void a(n0 n0Var, y6.m mVar, i0.d dVar) {
        this.f17526e = n0Var;
        this.f17522a.d(mVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007a -> B:12:0x007c). Please report as a decompilation issue!!! */
    @Override // i7.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(t8.e0 r8, int r9) {
        /*
            r7 = this;
            t8.n0 r0 = r7.f17526e
            t8.a.i(r0)
            r0 = r9 & 1
            r1 = -1
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L47
            int r0 = r7.f17524c
            if (r0 == 0) goto L44
            if (r0 == r4) goto L44
            java.lang.String r5 = "PesReader"
            if (r0 == r3) goto L3f
            if (r0 != r2) goto L39
            int r0 = r7.f17531j
            if (r0 == r1) goto L7c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Unexpected start indicator: expected "
            r0.append(r6)
            int r6 = r7.f17531j
            r0.append(r6)
            java.lang.String r6 = " more bytes"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            t8.s.i(r5, r0)
            goto L7c
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L3f:
            java.lang.String r0 = "Unexpected start indicator reading extended header"
            t8.s.i(r5, r0)
        L44:
            r7.g(r4)
        L47:
            int r0 = r8.a()
            if (r0 <= 0) goto Ld8
            int r0 = r7.f17524c
            if (r0 == 0) goto Lcf
            r5 = 0
            if (r0 == r4) goto Lb7
            if (r0 == r3) goto L88
            if (r0 != r2) goto L82
            int r0 = r8.a()
            int r6 = r7.f17531j
            if (r6 != r1) goto L61
            goto L63
        L61:
            int r5 = r0 - r6
        L63:
            if (r5 <= 0) goto L6e
            int r0 = r0 - r5
            int r5 = r8.f()
            int r5 = r5 + r0
            r8.T(r5)
        L6e:
            i7.m r5 = r7.f17522a
            r5.b(r8)
            int r5 = r7.f17531j
            if (r5 == r1) goto L47
            int r5 = r5 - r0
            r7.f17531j = r5
            if (r5 != 0) goto L47
        L7c:
            i7.m r0 = r7.f17522a
            r0.e()
            goto L44
        L82:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L88:
            r0 = 10
            int r6 = r7.f17530i
            int r0 = java.lang.Math.min(r0, r6)
            t8.d0 r6 = r7.f17523b
            byte[] r6 = r6.f26645a
            boolean r0 = r7.d(r8, r6, r0)
            if (r0 == 0) goto L47
            r0 = 0
            int r6 = r7.f17530i
            boolean r0 = r7.d(r8, r0, r6)
            if (r0 == 0) goto L47
            r7.f()
            boolean r0 = r7.f17532k
            if (r0 == 0) goto Lab
            r5 = 4
        Lab:
            r9 = r9 | r5
            i7.m r0 = r7.f17522a
            long r5 = r7.f17533l
            r0.f(r5, r9)
            r7.g(r2)
            goto L47
        Lb7:
            t8.d0 r0 = r7.f17523b
            byte[] r0 = r0.f26645a
            r6 = 9
            boolean r0 = r7.d(r8, r0, r6)
            if (r0 == 0) goto L47
            boolean r0 = r7.e()
            if (r0 == 0) goto Lca
            r5 = r3
        Lca:
            r7.g(r5)
            goto L47
        Lcf:
            int r0 = r8.a()
            r8.V(r0)
            goto L47
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.w.b(t8.e0, int):void");
    }

    @Override // i7.i0
    public final void c() {
        this.f17524c = 0;
        this.f17525d = 0;
        this.f17529h = false;
        this.f17522a.c();
    }
}
