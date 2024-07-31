package p474z;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z.f */
/* loaded from: classes.dex */
public final class C12752f {

    /* renamed from: a */
    private static volatile ScheduledExecutorService f34781a;

    private C12752f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ScheduledExecutorService m42293a() {
        if (f34781a != null) {
            return f34781a;
        }
        synchronized (C12752f.class) {
            if (f34781a == null) {
                f34781a = new ScheduledExecutorServiceC12749c(new Handler(Looper.getMainLooper()));
            }
        }
        return f34781a;
    }
}
