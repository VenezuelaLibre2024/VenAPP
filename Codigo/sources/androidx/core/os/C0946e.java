package androidx.core.os;

import android.os.Handler;
import androidx.core.util.C0984h;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: androidx.core.os.e */
/* loaded from: classes.dex */
public final class C0946e {

    /* renamed from: androidx.core.os.e$a */
    /* loaded from: classes.dex */
    private static class a implements Executor {

        /* renamed from: a */
        private final Handler f4469a;

        a(Handler handler) {
            this.f4469a = (Handler) C0984h.m4833k(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f4469a.post((Runnable) C0984h.m4833k(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f4469a + " is shutting down");
        }
    }

    /* renamed from: a */
    public static Executor m4710a(Handler handler) {
        return new a(handler);
    }
}
