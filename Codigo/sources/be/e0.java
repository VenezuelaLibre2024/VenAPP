package be;

import zd.r2;

/* loaded from: classes.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    private r2 f6439a;

    public e0(r2 r2Var) {
        this.f6439a = r2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(final dj.g gVar) {
        this.f6439a.a(new r2.a() { // from class: be.d0
            @Override // zd.r2.a
            public final void a(String str) {
                dj.g.this.c(str);
            }
        });
    }

    public ij.a<String> e() {
        ij.a<String> C = dj.f.e(new dj.h() { // from class: be.c0
            @Override // dj.h
            public final void a(dj.g gVar) {
                e0.this.d(gVar);
            }
        }, dj.a.BUFFER).C();
        C.K();
        return C;
    }

    public r2 f() {
        return this.f6439a;
    }
}
