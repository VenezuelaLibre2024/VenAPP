package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.h7 */
/* loaded from: classes2.dex */
public final class ExecutorC5520h7 implements Executor {

    /* renamed from: a */
    private final /* synthetic */ C5442b7 f11399a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorC5520h7(C5442b7 c5442b7) {
        this.f11399a = c5442b7;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f11399a.zzl().m14248y(runnable);
    }
}
