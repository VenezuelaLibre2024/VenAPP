package ma;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f21407a;

    public a(Looper looper) {
        this.f21407a = new zzi(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f21407a.post(runnable);
    }
}
