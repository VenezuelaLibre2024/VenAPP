package jm;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f19995a;

    /* renamed from: b, reason: collision with root package name */
    private static final Handler f19996b;

    static {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        n.d(newCachedThreadPool, "newCachedThreadPool(...)");
        f19995a = newCachedThreadPool;
        f19996b = new Handler(Looper.getMainLooper());
    }

    public static final Executor a() {
        return f19995a;
    }

    public static final Handler b() {
        return f19996b;
    }
}
