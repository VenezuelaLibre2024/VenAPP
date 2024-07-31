package a8;

import t6.v1;
import v7.v0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l implements v0 {

    /* renamed from: a */
    private final int f192a;

    /* renamed from: b */
    private final p f193b;

    /* renamed from: c */
    private int f194c = -1;

    public l(p pVar, int i10) {
        this.f193b = pVar;
        this.f192a = i10;
    }

    private boolean c() {
        int i10 = this.f194c;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    @Override // v7.v0
    public void a() {
        int i10 = this.f194c;
        if (i10 == -2) {
            throw new r(this.f193b.r().c(this.f192a).d(0).f26517w);
        }
        if (i10 == -1) {
            this.f193b.T();
        } else if (i10 != -3) {
            this.f193b.U(i10);
        }
    }

    public void b() {
        t8.a.a(this.f194c == -1);
        this.f194c = this.f193b.x(this.f192a);
    }

    @Override // v7.v0
    public boolean d() {
        return this.f194c == -3 || (c() && this.f193b.P(this.f194c));
    }

    public void e() {
        if (this.f194c != -1) {
            this.f193b.o0(this.f192a);
            this.f194c = -1;
        }
    }

    @Override // v7.v0
    public int p(long j10) {
        if (c()) {
            return this.f193b.n0(this.f194c, j10);
        }
        return 0;
    }

    @Override // v7.v0
    public int q(v1 v1Var, w6.g gVar, int i10) {
        if (this.f194c == -3) {
            gVar.m(4);
            return -4;
        }
        if (c()) {
            return this.f193b.d0(this.f194c, v1Var, gVar, i10);
        }
        return -3;
    }
}
