package y4;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import i4.e0;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.n;
import x4.c;
import x4.k;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f31645a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final int f31646b = Process.myUid();

    /* renamed from: c, reason: collision with root package name */
    private static final ScheduledExecutorService f31647c = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: d, reason: collision with root package name */
    private static String f31648d = "";

    /* renamed from: e, reason: collision with root package name */
    private static final Runnable f31649e = new Runnable() { // from class: y4.a
        @Override // java.lang.Runnable
        public final void run() {
            b.b();
        }
    };

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
        if (a5.a.d(b.class)) {
            return;
        }
        try {
            Object systemService = e0.l().getSystemService("activity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            c((ActivityManager) systemService);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            a5.a.b(th2, b.class);
        }
    }

    public static final void c(ActivityManager activityManager) {
        if (a5.a.d(b.class) || activityManager == null) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState == null) {
                return;
            }
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f31646b) {
                    Thread thread = Looper.getMainLooper().getThread();
                    n.d(thread, "getMainLooper().thread");
                    String g10 = k.g(thread);
                    if (!n.a(g10, f31648d) && k.k(thread)) {
                        f31648d = g10;
                        c.a aVar = c.a.f30394a;
                        c.a.a(processErrorStateInfo.shortMsg, g10).g();
                    }
                }
            }
        } catch (Throwable th2) {
            a5.a.b(th2, b.class);
        }
    }

    public static final void d() {
        if (a5.a.d(b.class)) {
            return;
        }
        try {
            f31647c.scheduleWithFixedDelay(f31649e, 0L, 500, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            a5.a.b(th2, b.class);
        }
    }
}
