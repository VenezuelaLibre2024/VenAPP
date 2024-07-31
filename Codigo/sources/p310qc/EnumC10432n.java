package p310qc;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: qc.n */
/* loaded from: classes.dex */
public enum EnumC10432n implements Executor {
    INSTANCE;

    private static final Handler HANDLER = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        HANDLER.post(runnable);
    }
}
