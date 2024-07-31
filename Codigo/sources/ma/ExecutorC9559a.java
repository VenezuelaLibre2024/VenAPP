package ma;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;

/* renamed from: ma.a */
/* loaded from: classes.dex */
public class ExecutorC9559a implements Executor {

    /* renamed from: a */
    private final Handler f23261a;

    public ExecutorC9559a(Looper looper) {
        this.f23261a = new zzi(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f23261a.post(runnable);
    }
}
