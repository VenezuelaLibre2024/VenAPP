package e2;

import androidx.webkit.internal.t0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        static final e f14440a = new t0();
    }

    public static e b() {
        if (t.a("PROXY_OVERRIDE")) {
            return a.f14440a;
        }
        throw new UnsupportedOperationException("Proxy override not supported");
    }

    public abstract void a(Executor executor, Runnable runnable);

    public abstract void c(d dVar, Executor executor, Runnable runnable);
}
