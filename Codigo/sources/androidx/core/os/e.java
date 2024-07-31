package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes.dex */
    private static class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f3797a;

        a(Handler handler) {
            this.f3797a = (Handler) androidx.core.util.h.k(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f3797a.post((Runnable) androidx.core.util.h.k(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f3797a + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
