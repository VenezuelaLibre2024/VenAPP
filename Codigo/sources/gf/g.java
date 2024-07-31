package gf;

import com.google.android.gms.common.internal.s;
import com.google.firebase.storage.g0;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    static boolean f16247b = false;

    /* renamed from: a, reason: collision with root package name */
    private final Executor f16248a;

    public g(Executor executor) {
        this.f16248a = executor == null ? !f16247b ? g0.b().c() : null : executor;
    }

    public void a(Runnable runnable) {
        s.j(runnable);
        Executor executor = this.f16248a;
        if (executor != null) {
            executor.execute(runnable);
        } else {
            g0.b().e(runnable);
        }
    }
}
