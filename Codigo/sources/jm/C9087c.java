package jm;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.C9322n;

/* renamed from: jm.c */
/* loaded from: classes3.dex */
public final class C9087c {

    /* renamed from: a */
    private static final Executor f21774a;

    /* renamed from: b */
    private static final Handler f21775b;

    static {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        C9322n.m27780d(newCachedThreadPool, "newCachedThreadPool(...)");
        f21774a = newCachedThreadPool;
        f21775b = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public static final Executor m26697a() {
        return f21774a;
    }

    /* renamed from: b */
    public static final Handler m26698b() {
        return f21775b;
    }
}
