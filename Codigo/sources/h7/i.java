package h7;

import t6.u1;
import t8.e0;
import t8.r0;
import y6.b0;
import y6.l;
import y6.m;
import y6.y;
import y6.z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    private b0 f16513b;

    /* renamed from: c, reason: collision with root package name */
    private m f16514c;

    /* renamed from: d, reason: collision with root package name */
    private g f16515d;

    /* renamed from: e, reason: collision with root package name */
    private long f16516e;

    /* renamed from: f, reason: collision with root package name */
    private long f16517f;

    /* renamed from: g, reason: collision with root package name */
    private long f16518g;

    /* renamed from: h, reason: collision with root package name */
    private int f16519h;

    /* renamed from: i, reason: collision with root package name */
    private int f16520i;

    /* renamed from: k, reason: collision with root package name */
    private long f16522k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16523l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16524m;

    /* renamed from: a, reason: collision with root package name */
    private final e f16512a = new e();

    /* renamed from: j, reason: collision with root package name */
    private b f16521j = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        u1 f16525a;

        /* renamed from: b, reason: collision with root package name */
        g f16526b;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements g {
        private c() {
        }

        @Override // h7.g
        public long a(l lVar) {
            return -1L;
        }

        @Override // h7.g
        public z b() {
            return new z.b(-9223372036854775807L);
        }

        @Override // h7.g
        public void c(long j10) {
        }
    }

    private void a() {
        t8.a.i(this.f16513b);
        r0.j(this.f16514c);
    }

    private boolean i(l lVar) {
        while (this.f16512a.d(lVar)) {
            this.f16522k = lVar.getPosition() - this.f16517f;
            if (!h(this.f16512a.c(), this.f16517f, this.f16521j)) {
                return true;
            }
            this.f16517f = lVar.getPosition();
        }
        this.f16519h = 3;
        return false;
    }

    private int j(l lVar) {
        if (!i(lVar)) {
            return -1;
        }
        u1 u1Var = this.f16521j.f16525a;
        this.f16520i = u1Var.K;
        if (!this.f16524m) {
            this.f16513b.c(u1Var);
            this.f16524m = true;
        }
        g gVar = this.f16521j.f16526b;
        if (gVar == null) {
            if (lVar.getLength() != -1) {
                f b10 = this.f16512a.b();
                this.f16515d = new h7.a(this, this.f16517f, lVar.getLength(), b10.f16505h + b10.f16506i, b10.f16500c, (b10.f16499b & 4) != 0);
                this.f16519h = 2;
                this.f16512a.f();
                return 0;
            }
            gVar = new c();
        }
        this.f16515d = gVar;
        this.f16519h = 2;
        this.f16512a.f();
        return 0;
    }

    private int k(l lVar, y yVar) {
        long a10 = this.f16515d.a(lVar);
        if (a10 >= 0) {
            yVar.f31795a = a10;
            return 1;
        }
        if (a10 < -1) {
            e(-(a10 + 2));
        }
        if (!this.f16523l) {
            this.f16514c.p((z) t8.a.i(this.f16515d.b()));
            this.f16523l = true;
        }
        if (this.f16522k <= 0 && !this.f16512a.d(lVar)) {
            this.f16519h = 3;
            return -1;
        }
        this.f16522k = 0L;
        e0 c10 = this.f16512a.c();
        long f10 = f(c10);
        if (f10 >= 0) {
            long j10 = this.f16518g;
            if (j10 + f10 >= this.f16516e) {
                long b10 = b(j10);
                this.f16513b.a(c10, c10.g());
                this.f16513b.b(b10, 1, c10.g(), 0, null);
                this.f16516e = -1L;
            }
        }
        this.f16518g += f10;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long b(long j10) {
        return (j10 * 1000000) / this.f16520i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long c(long j10) {
        return (this.f16520i * j10) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(m mVar, b0 b0Var) {
        this.f16514c = mVar;
        this.f16513b = b0Var;
        l(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(long j10) {
        this.f16518g = j10;
    }

    protected abstract long f(e0 e0Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int g(l lVar, y yVar) {
        a();
        int i10 = this.f16519h;
        if (i10 == 0) {
            return j(lVar);
        }
        if (i10 == 1) {
            lVar.n((int) this.f16517f);
            this.f16519h = 2;
            return 0;
        }
        if (i10 == 2) {
            r0.j(this.f16515d);
            return k(lVar, yVar);
        }
        if (i10 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    protected abstract boolean h(e0 e0Var, long j10, b bVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(boolean z10) {
        int i10;
        if (z10) {
            this.f16521j = new b();
            this.f16517f = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f16519h = i10;
        this.f16516e = -1L;
        this.f16518g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(long j10, long j11) {
        this.f16512a.e();
        if (j10 == 0) {
            l(!this.f16523l);
        } else if (this.f16519h != 0) {
            this.f16516e = c(j11);
            ((g) r0.j(this.f16515d)).c(this.f16516e);
            this.f16519h = 2;
        }
    }
}
