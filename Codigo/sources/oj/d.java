package oj;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class d extends dj.b {

    /* renamed from: a, reason: collision with root package name */
    final Callable<?> f22666a;

    public d(Callable<?> callable) {
        this.f22666a = callable;
    }

    @Override // dj.b
    protected void p(dj.c cVar) {
        gj.b b10 = gj.c.b();
        cVar.b(b10);
        try {
            this.f22666a.call();
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
