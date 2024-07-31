package ma;

import com.google.android.gms.common.internal.C5276s;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ma.c */
/* loaded from: classes.dex */
public class ThreadFactoryC9561c implements ThreadFactory {

    /* renamed from: a */
    private final String f23264a;

    /* renamed from: b */
    private final AtomicInteger f23265b = new AtomicInteger();

    /* renamed from: c */
    private final ThreadFactory f23266c = Executors.defaultThreadFactory();

    public ThreadFactoryC9561c(String str) {
        C5276s.m13325k(str, "Name must not be null");
        this.f23264a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f23266c.newThread(new RunnableC9562d(runnable, 0));
        newThread.setName(this.f23264a + "[" + this.f23265b.getAndIncrement() + "]");
        return newThread;
    }
}
