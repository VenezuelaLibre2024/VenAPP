package b7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import t8.e0;
import t8.r0;
import y6.b0;
import y6.k;
import y6.l;
import y6.m;
import y6.p;
import y6.q;
import y6.r;
import y6.s;
import y6.t;
import y6.y;
import y6.z;

/* loaded from: classes.dex */
public final class d implements k {

    /* renamed from: o, reason: collision with root package name */
    public static final p f6170o = new p() { // from class: b7.c
        @Override // y6.p
        public final k[] c() {
            k[] j10;
            j10 = d.j();
            return j10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f6171a;

    /* renamed from: b, reason: collision with root package name */
    private final e0 f6172b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6173c;

    /* renamed from: d, reason: collision with root package name */
    private final q.a f6174d;

    /* renamed from: e, reason: collision with root package name */
    private m f6175e;

    /* renamed from: f, reason: collision with root package name */
    private b0 f6176f;

    /* renamed from: g, reason: collision with root package name */
    private int f6177g;

    /* renamed from: h, reason: collision with root package name */
    private l7.a f6178h;

    /* renamed from: i, reason: collision with root package name */
    private t f6179i;

    /* renamed from: j, reason: collision with root package name */
    private int f6180j;

    /* renamed from: k, reason: collision with root package name */
    private int f6181k;

    /* renamed from: l, reason: collision with root package name */
    private b f6182l;

    /* renamed from: m, reason: collision with root package name */
    private int f6183m;

    /* renamed from: n, reason: collision with root package name */
    private long f6184n;

    public d() {
        this(0);
    }

    public d(int i10) {
        this.f6171a = new byte[42];
        this.f6172b = new e0(new byte[RecognitionOptions.TEZ_CODE], 0);
        this.f6173c = (i10 & 1) != 0;
        this.f6174d = new q.a();
        this.f6177g = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r5.U(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        return r4.f6174d.f31768a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long d(t8.e0 r5, boolean r6) {
        /*
            r4 = this;
            y6.t r0 = r4.f6179i
            t8.a.e(r0)
            int r0 = r5.f()
        L9:
            int r1 = r5.g()
            int r1 = r1 + (-16)
            if (r0 > r1) goto L2b
            r5.U(r0)
            y6.t r1 = r4.f6179i
            int r2 = r4.f6181k
            y6.q$a r3 = r4.f6174d
            boolean r1 = y6.q.d(r5, r1, r2, r3)
            if (r1 == 0) goto L28
        L20:
            r5.U(r0)
            y6.q$a r5 = r4.f6174d
            long r5 = r5.f31768a
            return r5
        L28:
            int r0 = r0 + 1
            goto L9
        L2b:
            if (r6 == 0) goto L60
        L2d:
            int r6 = r5.g()
            int r1 = r4.f6180j
            int r6 = r6 - r1
            if (r0 > r6) goto L58
            r5.U(r0)
            r6 = 0
            y6.t r1 = r4.f6179i     // Catch: java.lang.IndexOutOfBoundsException -> L45
            int r2 = r4.f6181k     // Catch: java.lang.IndexOutOfBoundsException -> L45
            y6.q$a r3 = r4.f6174d     // Catch: java.lang.IndexOutOfBoundsException -> L45
            boolean r1 = y6.q.d(r5, r1, r2, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L45
            goto L46
        L45:
            r1 = r6
        L46:
            int r2 = r5.f()
            int r3 = r5.g()
            if (r2 <= r3) goto L51
            goto L52
        L51:
            r6 = r1
        L52:
            if (r6 == 0) goto L55
            goto L20
        L55:
            int r0 = r0 + 1
            goto L2d
        L58:
            int r6 = r5.g()
            r5.U(r6)
            goto L63
        L60:
            r5.U(r0)
        L63:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.d.d(t8.e0, boolean):long");
    }

    private void g(l lVar) {
        this.f6181k = r.b(lVar);
        ((m) r0.j(this.f6175e)).p(h(lVar.getPosition(), lVar.getLength()));
        this.f6177g = 5;
    }

    private z h(long j10, long j11) {
        t8.a.e(this.f6179i);
        t tVar = this.f6179i;
        if (tVar.f31782k != null) {
            return new s(tVar, j10);
        }
        if (j11 == -1 || tVar.f31781j <= 0) {
            return new z.b(tVar.f());
        }
        b bVar = new b(tVar, this.f6181k, j10, j11);
        this.f6182l = bVar;
        return bVar.b();
    }

    private void i(l lVar) {
        byte[] bArr = this.f6171a;
        lVar.q(bArr, 0, bArr.length);
        lVar.f();
        this.f6177g = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k[] j() {
        return new k[]{new d()};
    }

    private void k() {
        ((b0) r0.j(this.f6176f)).b((this.f6184n * 1000000) / ((t) r0.j(this.f6179i)).f31776e, 1, this.f6183m, 0, null);
    }

    private int l(l lVar, y yVar) {
        boolean z10;
        t8.a.e(this.f6176f);
        t8.a.e(this.f6179i);
        b bVar = this.f6182l;
        if (bVar != null && bVar.d()) {
            return this.f6182l.c(lVar, yVar);
        }
        if (this.f6184n == -1) {
            this.f6184n = q.i(lVar, this.f6179i);
            return 0;
        }
        int g10 = this.f6172b.g();
        if (g10 < 32768) {
            int read = lVar.read(this.f6172b.e(), g10, RecognitionOptions.TEZ_CODE - g10);
            z10 = read == -1;
            if (!z10) {
                this.f6172b.T(g10 + read);
            } else if (this.f6172b.a() == 0) {
                k();
                return -1;
            }
        } else {
            z10 = false;
        }
        int f10 = this.f6172b.f();
        int i10 = this.f6183m;
        int i11 = this.f6180j;
        if (i10 < i11) {
            e0 e0Var = this.f6172b;
            e0Var.V(Math.min(i11 - i10, e0Var.a()));
        }
        long d10 = d(this.f6172b, z10);
        int f11 = this.f6172b.f() - f10;
        this.f6172b.U(f10);
        this.f6176f.a(this.f6172b, f11);
        this.f6183m += f11;
        if (d10 != -1) {
            k();
            this.f6183m = 0;
            this.f6184n = d10;
        }
        if (this.f6172b.a() < 16) {
            int a10 = this.f6172b.a();
            System.arraycopy(this.f6172b.e(), this.f6172b.f(), this.f6172b.e(), 0, a10);
            this.f6172b.U(0);
            this.f6172b.T(a10);
        }
        return 0;
    }

    private void m(l lVar) {
        this.f6178h = r.d(lVar, !this.f6173c);
        this.f6177g = 1;
    }

    private void n(l lVar) {
        r.a aVar = new r.a(this.f6179i);
        boolean z10 = false;
        while (!z10) {
            z10 = r.e(lVar, aVar);
            this.f6179i = (t) r0.j(aVar.f31769a);
        }
        t8.a.e(this.f6179i);
        this.f6180j = Math.max(this.f6179i.f31774c, 6);
        ((b0) r0.j(this.f6176f)).c(this.f6179i.g(this.f6171a, this.f6178h));
        this.f6177g = 4;
    }

    private void o(l lVar) {
        r.i(lVar);
        this.f6177g = 3;
    }

    @Override // y6.k
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f6177g = 0;
        } else {
            b bVar = this.f6182l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        this.f6184n = j11 != 0 ? -1L : 0L;
        this.f6183m = 0;
        this.f6172b.Q(0);
    }

    @Override // y6.k
    public void b(m mVar) {
        this.f6175e = mVar;
        this.f6176f = mVar.d(0, 1);
        mVar.q();
    }

    @Override // y6.k
    public boolean e(l lVar) {
        r.c(lVar, false);
        return r.a(lVar);
    }

    @Override // y6.k
    public int f(l lVar, y yVar) {
        int i10 = this.f6177g;
        if (i10 == 0) {
            m(lVar);
            return 0;
        }
        if (i10 == 1) {
            i(lVar);
            return 0;
        }
        if (i10 == 2) {
            o(lVar);
            return 0;
        }
        if (i10 == 3) {
            n(lVar);
            return 0;
        }
        if (i10 == 4) {
            g(lVar);
            return 0;
        }
        if (i10 == 5) {
            return l(lVar, yVar);
        }
        throw new IllegalStateException();
    }

    @Override // y6.k
    public void release() {
    }
}
