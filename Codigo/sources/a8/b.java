package a8;

import i7.h0;
import t6.u1;
import t8.n0;
import y6.y;

/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: d */
    private static final y f118d = new y();

    /* renamed from: a */
    final y6.k f119a;

    /* renamed from: b */
    private final u1 f120b;

    /* renamed from: c */
    private final n0 f121c;

    public b(y6.k kVar, u1 u1Var, n0 n0Var) {
        this.f119a = kVar;
        this.f120b = u1Var;
        this.f121c = n0Var;
    }

    @Override // a8.j
    public boolean a(y6.l lVar) {
        return this.f119a.f(lVar, f118d) == 0;
    }

    @Override // a8.j
    public void b(y6.m mVar) {
        this.f119a.b(mVar);
    }

    @Override // a8.j
    public void c() {
        this.f119a.a(0L, 0L);
    }

    @Override // a8.j
    public boolean d() {
        y6.k kVar = this.f119a;
        return (kVar instanceof h0) || (kVar instanceof g7.g);
    }

    @Override // a8.j
    public boolean e() {
        y6.k kVar = this.f119a;
        return (kVar instanceof i7.h) || (kVar instanceof i7.b) || (kVar instanceof i7.e) || (kVar instanceof f7.f);
    }

    @Override // a8.j
    public j f() {
        y6.k fVar;
        t8.a.g(!d());
        y6.k kVar = this.f119a;
        if (kVar instanceof t) {
            fVar = new t(this.f120b.f26508c, this.f121c);
        } else if (kVar instanceof i7.h) {
            fVar = new i7.h();
        } else if (kVar instanceof i7.b) {
            fVar = new i7.b();
        } else if (kVar instanceof i7.e) {
            fVar = new i7.e();
        } else {
            if (!(kVar instanceof f7.f)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f119a.getClass().getSimpleName());
            }
            fVar = new f7.f();
        }
        return new b(fVar, this.f120b, this.f121c);
    }
}
