package ma;

import com.google.android.gms.common.internal.C5276s;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: ma.b */
/* loaded from: classes.dex */
public class ThreadFactoryC9560b implements ThreadFactory {

    /* renamed from: a */
    private final String f23262a;

    /* renamed from: b */
    private final ThreadFactory f23263b = Executors.defaultThreadFactory();

    public ThreadFactoryC9560b(String str) {
        C5276s.m13325k(str, "Name must not be null");
        this.f23262a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f23263b.newThread(new RunnableC9562d(runnable, 0));
        newThread.setName(this.f23262a);
        return newThread;
    }
}
