package ma;

import com.google.android.gms.common.internal.s;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f21410a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f21411b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    private final ThreadFactory f21412c = Executors.defaultThreadFactory();

    public c(String str) {
        s.k(str, "Name must not be null");
        this.f21410a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f21412c.newThread(new d(runnable, 0));
        newThread.setName(this.f21410a + "[" + this.f21411b.getAndIncrement() + "]");
        return newThread;
    }
}
