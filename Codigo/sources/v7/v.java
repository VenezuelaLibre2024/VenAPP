package v7;

import java.io.IOException;
import t6.u3;
import v7.a0;
import v7.y;

/* loaded from: classes.dex */
public final class v implements y, y.a {

    /* renamed from: a, reason: collision with root package name */
    public final a0.b f28507a;

    /* renamed from: b, reason: collision with root package name */
    private final long f28508b;

    /* renamed from: c, reason: collision with root package name */
    private final s8.b f28509c;

    /* renamed from: d, reason: collision with root package name */
    private a0 f28510d;

    /* renamed from: e, reason: collision with root package name */
    private y f28511e;

    /* renamed from: f, reason: collision with root package name */
    private y.a f28512f;

    /* renamed from: r, reason: collision with root package name */
    private a f28513r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f28514s;

    /* renamed from: t, reason: collision with root package name */
    private long f28515t = -9223372036854775807L;

    /* loaded from: classes.dex */
    public interface a {
        void a(a0.b bVar, IOException iOException);

        void b(a0.b bVar);
    }

    public v(a0.b bVar, s8.b bVar2, long j10) {
        this.f28507a = bVar;
        this.f28509c = bVar2;
        this.f28508b = j10;
    }

    private long p(long j10) {
        long j11 = this.f28515t;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // v7.y, v7.w0
    public long b() {
        return ((y) t8.r0.j(this.f28511e)).b();
    }

    @Override // v7.y
    public long c(long j10, u3 u3Var) {
        return ((y) t8.r0.j(this.f28511e)).c(j10, u3Var);
    }

    public void d(a0.b bVar) {
        long p10 = p(this.f28508b);
        y e10 = ((a0) t8.a.e(this.f28510d)).e(bVar, this.f28509c, p10);
        this.f28511e = e10;
        if (this.f28512f != null) {
            e10.k(this, p10);
        }
    }

    @Override // v7.y, v7.w0
    public boolean e(long j10) {
        y yVar = this.f28511e;
        return yVar != null && yVar.e(j10);
    }

    @Override // v7.y, v7.w0
    public long f() {
        return ((y) t8.r0.j(this.f28511e)).f();
    }

    @Override // v7.y, v7.w0
    public void g(long j10) {
        ((y) t8.r0.j(this.f28511e)).g(j10);
    }

    @Override // v7.y.a
    public void h(y yVar) {
        ((y.a) t8.r0.j(this.f28512f)).h(this);
        a aVar = this.f28513r;
        if (aVar != null) {
            aVar.b(this.f28507a);
        }
    }

    @Override // v7.y, v7.w0
    public boolean isLoading() {
        y yVar = this.f28511e;
        return yVar != null && yVar.isLoading();
    }

    @Override // v7.y
    public long j(long j10) {
        return ((y) t8.r0.j(this.f28511e)).j(j10);
    }

    @Override // v7.y
    public void k(y.a aVar, long j10) {
        this.f28512f = aVar;
        y yVar = this.f28511e;
        if (yVar != null) {
            yVar.k(this, p(this.f28508b));
        }
    }

    @Override // v7.y
    public long l() {
        return ((y) t8.r0.j(this.f28511e)).l();
    }

    public long m() {
        return this.f28515t;
    }

    public long n() {
        return this.f28508b;
    }

    @Override // v7.y
    public void o() {
        try {
            y yVar = this.f28511e;
            if (yVar != null) {
                yVar.o();
            } else {
                a0 a0Var = this.f28510d;
                if (a0Var != null) {
                    a0Var.n();
                }
            }
        } catch (IOException e10) {
            a aVar = this.f28513r;
            if (aVar == null) {
                throw e10;
            }
            if (this.f28514s) {
                return;
            }
            this.f28514s = true;
            aVar.a(this.f28507a, e10);
        }
    }

    @Override // v7.w0.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void a(y yVar) {
        ((y.a) t8.r0.j(this.f28512f)).a(this);
    }

    @Override // v7.y
    public f1 r() {
        return ((y) t8.r0.j(this.f28511e)).r();
    }

    @Override // v7.y
    public void s(long j10, boolean z10) {
        ((y) t8.r0.j(this.f28511e)).s(j10, z10);
    }

    @Override // v7.y
    public long t(q8.r[] rVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f28515t;
        if (j12 == -9223372036854775807L || j10 != this.f28508b) {
            j11 = j10;
        } else {
            this.f28515t = -9223372036854775807L;
            j11 = j12;
        }
        return ((y) t8.r0.j(this.f28511e)).t(rVarArr, zArr, v0VarArr, zArr2, j11);
    }

    public void u(long j10) {
        this.f28515t = j10;
    }

    public void v() {
        if (this.f28511e != null) {
            ((a0) t8.a.e(this.f28510d)).l(this.f28511e);
        }
    }

    public void w(a0 a0Var) {
        t8.a.g(this.f28510d == null);
        this.f28510d = a0Var;
    }
}
