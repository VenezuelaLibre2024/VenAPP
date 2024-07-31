package p073e2;

import androidx.webkit.internal.C1488t0;
import java.util.concurrent.Executor;

/* renamed from: e2.e */
/* loaded from: classes.dex */
public abstract class AbstractC7101e {

    /* renamed from: e2.e$a */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a */
        static final AbstractC7101e f15812a = new C1488t0();
    }

    /* renamed from: b */
    public static AbstractC7101e m20943b() {
        if (C7116t.m21006a("PROXY_OVERRIDE")) {
            return a.f15812a;
        }
        throw new UnsupportedOperationException("Proxy override not supported");
    }

    /* renamed from: a */
    public abstract void mo8435a(Executor executor, Runnable runnable);

    /* renamed from: c */
    public abstract void mo8436c(C7100d c7100d, Executor executor, Runnable runnable);
}
