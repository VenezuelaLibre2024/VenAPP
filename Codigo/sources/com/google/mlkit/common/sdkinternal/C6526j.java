package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.mlkit_common.zzbh;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.mlkit.common.sdkinternal.j */
/* loaded from: classes2.dex */
public class C6526j extends zzbh {

    /* renamed from: b */
    private static final ThreadLocal f14308b = new ThreadLocal();

    /* renamed from: a */
    private final ThreadPoolExecutor f14309a;

    public C6526j() {
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.mlkit.common.sdkinternal.w
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return defaultThreadFactory.newThread(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6526j.m18318b(runnable);
                    }
                });
            }
        });
        this.f14309a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m18318b(Runnable runnable) {
        f14308b.set(new ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m18319c(Deque deque, Runnable runnable) {
        C5276s.m13324j(deque);
        deque.add(runnable);
        if (deque.size() > 1) {
            return;
        }
        do {
            runnable.run();
            deque.removeFirst();
            runnable = (Runnable) deque.peekFirst();
        } while (runnable != null);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbh, java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) f14308b.get();
        if (deque == null || deque.size() > 1) {
            this.f14309a.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.x
                @Override // java.lang.Runnable
                public final void run() {
                    C6526j.m18319c((Deque) C6526j.f14308b.get(), runnable);
                }
            });
        } else {
            m18319c(deque, runnable);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbh, com.google.android.gms.internal.mlkit_common.zzaj
    protected final /* synthetic */ Object zza() {
        return this.f14309a;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbh
    protected final ExecutorService zzb() {
        return this.f14309a;
    }
}
