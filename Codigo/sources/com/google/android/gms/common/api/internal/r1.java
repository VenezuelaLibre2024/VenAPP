package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class r1 extends u0 {

    /* renamed from: b, reason: collision with root package name */
    protected final TaskCompletionSource f9462b;

    public r1(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.f9462b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.y1
    public final void a(Status status) {
        this.f9462b.trySetException(new com.google.android.gms.common.api.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.y1
    public final void b(Exception exc) {
        this.f9462b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.y1
    public final void c(l0 l0Var) {
        try {
            h(l0Var);
        } catch (DeadObjectException e10) {
            a(y1.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(y1.e(e11));
        } catch (RuntimeException e12) {
            this.f9462b.trySetException(e12);
        }
    }

    protected abstract void h(l0 l0Var);
}
