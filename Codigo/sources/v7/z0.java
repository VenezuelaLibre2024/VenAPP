package v7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import s8.d0;
import s8.e0;
import s8.j;
import t6.u1;
import t6.u3;
import t6.v1;
import v7.h0;
import v7.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z0 implements y, e0.b<c> {

    /* renamed from: a, reason: collision with root package name */
    private final s8.n f28548a;

    /* renamed from: b, reason: collision with root package name */
    private final j.a f28549b;

    /* renamed from: c, reason: collision with root package name */
    private final s8.m0 f28550c;

    /* renamed from: d, reason: collision with root package name */
    private final s8.d0 f28551d;

    /* renamed from: e, reason: collision with root package name */
    private final h0.a f28552e;

    /* renamed from: f, reason: collision with root package name */
    private final f1 f28553f;

    /* renamed from: s, reason: collision with root package name */
    private final long f28555s;

    /* renamed from: u, reason: collision with root package name */
    final u1 f28557u;

    /* renamed from: v, reason: collision with root package name */
    final boolean f28558v;

    /* renamed from: w, reason: collision with root package name */
    boolean f28559w;

    /* renamed from: x, reason: collision with root package name */
    byte[] f28560x;

    /* renamed from: y, reason: collision with root package name */
    int f28561y;

    /* renamed from: r, reason: collision with root package name */
    private final ArrayList<b> f28554r = new ArrayList<>();

    /* renamed from: t, reason: collision with root package name */
    final s8.e0 f28556t = new s8.e0("SingleSampleMediaPeriod");

    /* loaded from: classes.dex */
    private final class b implements v0 {

        /* renamed from: a, reason: collision with root package name */
        private int f28562a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f28563b;

        private b() {
        }

        private void b() {
            if (this.f28563b) {
                return;
            }
            z0.this.f28552e.i(t8.w.k(z0.this.f28557u.f26517w), z0.this.f28557u, 0, null, 0L);
            this.f28563b = true;
        }

        @Override // v7.v0
        public void a() {
            z0 z0Var = z0.this;
            if (z0Var.f28558v) {
                return;
            }
            z0Var.f28556t.a();
        }

        public void c() {
            if (this.f28562a == 2) {
                this.f28562a = 1;
            }
        }

        @Override // v7.v0
        public boolean d() {
            return z0.this.f28559w;
        }

        @Override // v7.v0
        public int p(long j10) {
            b();
            if (j10 <= 0 || this.f28562a == 2) {
                return 0;
            }
            this.f28562a = 2;
            return 1;
        }

        @Override // v7.v0
        public int q(v1 v1Var, w6.g gVar, int i10) {
            b();
            z0 z0Var = z0.this;
            boolean z10 = z0Var.f28559w;
            if (z10 && z0Var.f28560x == null) {
                this.f28562a = 2;
            }
            int i11 = this.f28562a;
            if (i11 == 2) {
                gVar.m(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                v1Var.f26567b = z0Var.f28557u;
                this.f28562a = 1;
                return -5;
            }
            if (!z10) {
                return -3;
            }
            t8.a.e(z0Var.f28560x);
            gVar.m(1);
            gVar.f29681e = 0L;
            if ((i10 & 4) == 0) {
                gVar.y(z0.this.f28561y);
                ByteBuffer byteBuffer = gVar.f29679c;
                z0 z0Var2 = z0.this;
                byteBuffer.put(z0Var2.f28560x, 0, z0Var2.f28561y);
            }
            if ((i10 & 1) == 0) {
                this.f28562a = 2;
            }
            return -4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c implements e0.e {

        /* renamed from: a, reason: collision with root package name */
        public final long f28565a = u.a();

        /* renamed from: b, reason: collision with root package name */
        public final s8.n f28566b;

        /* renamed from: c, reason: collision with root package name */
        private final s8.l0 f28567c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f28568d;

        public c(s8.n nVar, s8.j jVar) {
            this.f28566b = nVar;
            this.f28567c = new s8.l0(jVar);
        }

        @Override // s8.e0.e
        public void b() {
            this.f28567c.t();
            try {
                this.f28567c.o(this.f28566b);
                int i10 = 0;
                while (i10 != -1) {
                    int h10 = (int) this.f28567c.h();
                    byte[] bArr = this.f28568d;
                    if (bArr == null) {
                        this.f28568d = new byte[RecognitionOptions.UPC_E];
                    } else if (h10 == bArr.length) {
                        this.f28568d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    s8.l0 l0Var = this.f28567c;
                    byte[] bArr2 = this.f28568d;
                    i10 = l0Var.read(bArr2, h10, bArr2.length - h10);
                }
            } finally {
                s8.m.a(this.f28567c);
            }
        }

        @Override // s8.e0.e
        public void c() {
        }
    }

    public z0(s8.n nVar, j.a aVar, s8.m0 m0Var, u1 u1Var, long j10, s8.d0 d0Var, h0.a aVar2, boolean z10) {
        this.f28548a = nVar;
        this.f28549b = aVar;
        this.f28550c = m0Var;
        this.f28557u = u1Var;
        this.f28555s = j10;
        this.f28551d = d0Var;
        this.f28552e = aVar2;
        this.f28558v = z10;
        this.f28553f = new f1(new d1(u1Var));
    }

    @Override // v7.y, v7.w0
    public long b() {
        return (this.f28559w || this.f28556t.j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // v7.y
    public long c(long j10, u3 u3Var) {
        return j10;
    }

    @Override // s8.e0.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void i(c cVar, long j10, long j11, boolean z10) {
        s8.l0 l0Var = cVar.f28567c;
        u uVar = new u(cVar.f28565a, cVar.f28566b, l0Var.r(), l0Var.s(), j10, j11, l0Var.h());
        this.f28551d.c(cVar.f28565a);
        this.f28552e.r(uVar, 1, -1, null, 0, null, 0L, this.f28555s);
    }

    @Override // v7.y, v7.w0
    public boolean e(long j10) {
        if (this.f28559w || this.f28556t.j() || this.f28556t.i()) {
            return false;
        }
        s8.j a10 = this.f28549b.a();
        s8.m0 m0Var = this.f28550c;
        if (m0Var != null) {
            a10.l(m0Var);
        }
        c cVar = new c(this.f28548a, a10);
        this.f28552e.A(new u(cVar.f28565a, this.f28548a, this.f28556t.n(cVar, this, this.f28551d.a(1))), 1, -1, this.f28557u, 0, null, 0L, this.f28555s);
        return true;
    }

    @Override // v7.y, v7.w0
    public long f() {
        return this.f28559w ? Long.MIN_VALUE : 0L;
    }

    @Override // v7.y, v7.w0
    public void g(long j10) {
    }

    @Override // v7.y, v7.w0
    public boolean isLoading() {
        return this.f28556t.j();
    }

    @Override // v7.y
    public long j(long j10) {
        for (int i10 = 0; i10 < this.f28554r.size(); i10++) {
            this.f28554r.get(i10).c();
        }
        return j10;
    }

    @Override // v7.y
    public void k(y.a aVar, long j10) {
        aVar.h(this);
    }

    @Override // v7.y
    public long l() {
        return -9223372036854775807L;
    }

    @Override // s8.e0.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m(c cVar, long j10, long j11) {
        this.f28561y = (int) cVar.f28567c.h();
        this.f28560x = (byte[]) t8.a.e(cVar.f28568d);
        this.f28559w = true;
        s8.l0 l0Var = cVar.f28567c;
        u uVar = new u(cVar.f28565a, cVar.f28566b, l0Var.r(), l0Var.s(), j10, j11, this.f28561y);
        this.f28551d.c(cVar.f28565a);
        this.f28552e.u(uVar, 1, -1, this.f28557u, 0, null, 0L, this.f28555s);
    }

    @Override // v7.y
    public void o() {
    }

    @Override // s8.e0.b
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public e0.c h(c cVar, long j10, long j11, IOException iOException, int i10) {
        e0.c h10;
        s8.l0 l0Var = cVar.f28567c;
        u uVar = new u(cVar.f28565a, cVar.f28566b, l0Var.r(), l0Var.s(), j10, j11, l0Var.h());
        long d10 = this.f28551d.d(new d0.c(uVar, new x(1, -1, this.f28557u, 0, null, 0L, t8.r0.a1(this.f28555s)), iOException, i10));
        boolean z10 = d10 == -9223372036854775807L || i10 >= this.f28551d.a(1);
        if (this.f28558v && z10) {
            t8.s.j("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f28559w = true;
            h10 = s8.e0.f25220f;
        } else {
            h10 = d10 != -9223372036854775807L ? s8.e0.h(false, d10) : s8.e0.f25221g;
        }
        e0.c cVar2 = h10;
        boolean z11 = !cVar2.c();
        this.f28552e.w(uVar, 1, -1, this.f28557u, 0, null, 0L, this.f28555s, iOException, z11);
        if (z11) {
            this.f28551d.c(cVar.f28565a);
        }
        return cVar2;
    }

    public void q() {
        this.f28556t.l();
    }

    @Override // v7.y
    public f1 r() {
        return this.f28553f;
    }

    @Override // v7.y
    public void s(long j10, boolean z10) {
    }

    @Override // v7.y
    public long t(q8.r[] rVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            v0 v0Var = v0VarArr[i10];
            if (v0Var != null && (rVarArr[i10] == null || !zArr[i10])) {
                this.f28554r.remove(v0Var);
                v0VarArr[i10] = null;
            }
            if (v0VarArr[i10] == null && rVarArr[i10] != null) {
                b bVar = new b();
                this.f28554r.add(bVar);
                v0VarArr[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }
}
