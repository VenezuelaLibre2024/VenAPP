package oj;

/* loaded from: classes3.dex */
public final class c extends dj.b {

    /* renamed from: a, reason: collision with root package name */
    final jj.a f22665a;

    public c(jj.a aVar) {
        this.f22665a = aVar;
    }

    @Override // dj.b
    protected void p(dj.c cVar) {
        gj.b b10 = gj.c.b();
        cVar.b(b10);
        try {
            this.f22665a.run();
            if (b10.h()) {
                return;
            }
            cVar.a();
        } catch (Throwable th2) {
            hj.b.b(th2);
            if (b10.h()) {
                return;
            }
            cVar.onError(th2);
        }
    }
}
