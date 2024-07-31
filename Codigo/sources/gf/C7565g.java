package gf;

import com.google.android.gms.common.internal.C5276s;
import com.google.firebase.storage.C6385g0;
import java.util.concurrent.Executor;

/* renamed from: gf.g */
/* loaded from: classes2.dex */
public class C7565g {

    /* renamed from: b */
    static boolean f17884b = false;

    /* renamed from: a */
    private final Executor f17885a;

    public C7565g(Executor executor) {
        this.f17885a = executor == null ? !f17884b ? C6385g0.m17878b().m17881c() : null : executor;
    }

    /* renamed from: a */
    public void m22965a(Runnable runnable) {
        C5276s.m13324j(runnable);
        Executor executor = this.f17885a;
        if (executor != null) {
            executor.execute(runnable);
        } else {
            C6385g0.m17878b().m17882e(runnable);
        }
    }
}
