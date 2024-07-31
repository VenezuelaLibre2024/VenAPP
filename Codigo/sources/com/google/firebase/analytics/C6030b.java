package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzcl;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.analytics.b */
/* loaded from: classes.dex */
public final class C6030b extends ThreadPoolExecutor {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C6030b(FirebaseAnalytics firebaseAnalytics, int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, blockingQueue);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        super.execute(zzcl.zza().zza(runnable));
    }
}
