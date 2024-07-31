package p457y4;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p152i4.C7799e0;
import p434x4.C12276c;
import p434x4.C12284k;

/* renamed from: y4.b */
/* loaded from: classes.dex */
public final class C12599b {

    /* renamed from: a */
    public static final C12599b f34181a = new C12599b();

    /* renamed from: b */
    private static final int f34182b = Process.myUid();

    /* renamed from: c */
    private static final ScheduledExecutorService f34183c = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: d */
    private static String f34184d = "";

    /* renamed from: e */
    private static final Runnable f34185e = new Runnable() { // from class: y4.a
        @Override // java.lang.Runnable
        public final void run() {
            C12599b.m41433b();
        }
    };

    private C12599b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m41433b() {
        if (C0033a.m107d(C12599b.class)) {
            return;
        }
        try {
            Object systemService = C7799e0.m23860l().getSystemService("activity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            m41434c((ActivityManager) systemService);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            C0033a.m105b(th2, C12599b.class);
        }
    }

    /* renamed from: c */
    public static final void m41434c(ActivityManager activityManager) {
        if (C0033a.m107d(C12599b.class) || activityManager == null) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState == null) {
                return;
            }
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f34182b) {
                    Thread thread = Looper.getMainLooper().getThread();
                    C9322n.m27780d(thread, "getMainLooper().thread");
                    String m39553g = C12284k.m39553g(thread);
                    if (!C9322n.m27777a(m39553g, f34184d) && C12284k.m39557k(thread)) {
                        f34184d = m39553g;
                        C12276c.a aVar = C12276c.a.f32906a;
                        C12276c.a.m39532a(processErrorStateInfo.shortMsg, m39553g).m39531g();
                    }
                }
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C12599b.class);
        }
    }

    /* renamed from: d */
    public static final void m41435d() {
        if (C0033a.m107d(C12599b.class)) {
            return;
        }
        try {
            f34183c.scheduleWithFixedDelay(f34185e, 0L, 500, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C12599b.class);
        }
    }
}
