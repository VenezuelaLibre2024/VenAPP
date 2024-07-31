package vc;

import ef.b;

/* loaded from: classes.dex */
public class m implements ef.b {

    /* renamed from: a, reason: collision with root package name */
    private final x f28815a;

    /* renamed from: b, reason: collision with root package name */
    private final l f28816b;

    public m(x xVar, ad.f fVar) {
        this.f28815a = xVar;
        this.f28816b = new l(fVar);
    }

    @Override // ef.b
    public boolean a() {
        return this.f28815a.d();
    }

    @Override // ef.b
    public void b(b.C0229b c0229b) {
        sc.g.f().b("App Quality Sessions session changed: " + c0229b);
        this.f28816b.h(c0229b.a());
    }

    @Override // ef.b
    public b.a c() {
        return b.a.CRASHLYTICS;
    }

    public String d(String str) {
        return this.f28816b.c(str);
    }

    public void e(String str) {
        this.f28816b.i(str);
    }
}
