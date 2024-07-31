package v6;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f28074a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f28074a.post(runnable);
    }
}
