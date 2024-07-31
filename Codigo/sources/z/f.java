package z;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ScheduledExecutorService f32230a;

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ScheduledExecutorService a() {
        if (f32230a != null) {
            return f32230a;
        }
        synchronized (f.class) {
            if (f32230a == null) {
                f32230a = new c(new Handler(Looper.getMainLooper()));
            }
        }
        return f32230a;
    }
}
