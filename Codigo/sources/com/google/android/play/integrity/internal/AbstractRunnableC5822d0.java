package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.play.integrity.internal.d0 */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC5822d0 implements Runnable {

    /* renamed from: a */
    private final TaskCompletionSource f12225a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractRunnableC5822d0() {
        this.f12225a = null;
    }

    public AbstractRunnableC5822d0(TaskCompletionSource taskCompletionSource) {
        this.f12225a = taskCompletionSource;
    }

    /* renamed from: a */
    public void mo14616a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f12225a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    /* renamed from: b */
    protected abstract void mo14617b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final TaskCompletionSource m14684c() {
        return this.f12225a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo14617b();
        } catch (Exception e10) {
            mo14616a(e10);
        }
    }
}
