package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.internal.mlkit_common.zzbh;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class j extends zzbh {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f13034b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f13035a;

    public j() {
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.mlkit.common.sdkinternal.w
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return defaultThreadFactory.newThread(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.b(runnable);
                    }
                });
            }
        });
        this.f13035a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(Runnable runnable) {
        f13034b.set(new ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Deque deque, Runnable runnable) {
        com.google.android.gms.common.internal.s.j(deque);
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
        Deque deque = (Deque) f13034b.get();
        if (deque == null || deque.size() > 1) {
            this.f13035a.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.x
                @Override // java.lang.Runnable
                public final void run() {
                    j.c((Deque) j.f13034b.get(), runnable);
                }
            });
        } else {
            c(deque, runnable);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbh, com.google.android.gms.internal.mlkit_common.zzaj
    protected final /* synthetic */ Object zza() {
        return this.f13035a;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbh
    protected final ExecutorService zzb() {
        return this.f13035a;
    }
}
