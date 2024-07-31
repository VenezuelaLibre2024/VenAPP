package ma;

import com.google.android.gms.common.internal.s;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f21408a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadFactory f21409b = Executors.defaultThreadFactory();

    public b(String str) {
        s.k(str, "Name must not be null");
        this.f21408a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f21409b.newThread(new d(runnable, 0));
        newThread.setName(this.f21408a);
        return newThread;
    }
}
