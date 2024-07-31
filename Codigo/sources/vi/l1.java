package vi;

import java.util.logging.Level;
import java.util.logging.Logger;
import vi.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class l1 extends r.c {

    /* renamed from: a */
    private static final Logger f29161a = Logger.getLogger(l1.class.getName());

    /* renamed from: b */
    static final ThreadLocal<r> f29162b = new ThreadLocal<>();

    @Override // vi.r.c
    public r b() {
        r rVar = f29162b.get();
        return rVar == null ? r.f29197c : rVar;
    }

    @Override // vi.r.c
    public void c(r rVar, r rVar2) {
        ThreadLocal<r> threadLocal;
        if (b() != rVar) {
            f29161a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (rVar2 != r.f29197c) {
            threadLocal = f29162b;
        } else {
            threadLocal = f29162b;
            rVar2 = null;
        }
        threadLocal.set(rVar2);
    }

    @Override // vi.r.c
    public r d(r rVar) {
        r b10 = b();
        f29162b.set(rVar);
        return b10;
    }
}
