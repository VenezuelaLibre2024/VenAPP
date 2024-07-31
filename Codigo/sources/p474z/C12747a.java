package p474z;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: z.a */
/* loaded from: classes.dex */
public final class C12747a {
    /* renamed from: a */
    public static Executor m42280a() {
        return ExecutorC12748b.m42286a();
    }

    /* renamed from: b */
    public static Executor m42281b() {
        return ExecutorC12750d.m42291a();
    }

    /* renamed from: c */
    public static Executor m42282c() {
        return ExecutorC12751e.m42292a();
    }

    /* renamed from: d */
    public static ScheduledExecutorService m42283d() {
        return C12752f.m42293a();
    }

    /* renamed from: e */
    public static ScheduledExecutorService m42284e(Handler handler) {
        return new ScheduledExecutorServiceC12749c(handler);
    }

    /* renamed from: f */
    public static Executor m42285f(Executor executor) {
        return new ExecutorC12753g(executor);
    }
}
