package vi;

import java.util.logging.Level;
import java.util.logging.Logger;
import vi.C11942r;

/* renamed from: vi.l1 */
/* loaded from: classes3.dex */
final class C11930l1 extends C11942r.c {

    /* renamed from: a */
    private static final Logger f31596a = Logger.getLogger(C11930l1.class.getName());

    /* renamed from: b */
    static final ThreadLocal<C11942r> f31597b = new ThreadLocal<>();

    @Override // vi.C11942r.c
    /* renamed from: b */
    public C11942r mo38203b() {
        C11942r c11942r = f31597b.get();
        return c11942r == null ? C11942r.f31632c : c11942r;
    }

    @Override // vi.C11942r.c
    /* renamed from: c */
    public void mo38204c(C11942r c11942r, C11942r c11942r2) {
        ThreadLocal<C11942r> threadLocal;
        if (mo38203b() != c11942r) {
            f31596a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (c11942r2 != C11942r.f31632c) {
            threadLocal = f31597b;
        } else {
            threadLocal = f31597b;
            c11942r2 = null;
        }
        threadLocal.set(c11942r2);
    }

    @Override // vi.C11942r.c
    /* renamed from: d */
    public C11942r mo38205d(C11942r c11942r) {
        C11942r mo38203b = mo38203b();
        f31597b.set(c11942r);
        return mo38203b;
    }
}
