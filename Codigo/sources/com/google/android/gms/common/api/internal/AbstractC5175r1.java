package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C5102b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.r1 */
/* loaded from: classes.dex */
public abstract class AbstractC5175r1 extends AbstractC5183u0 {

    /* renamed from: b */
    protected final TaskCompletionSource f10576b;

    public AbstractC5175r1(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.f10576b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5196y1
    /* renamed from: a */
    public final void mo13166a(Status status) {
        this.f10576b.trySetException(new C5102b(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5196y1
    /* renamed from: b */
    public final void mo13167b(Exception exc) {
        this.f10576b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5196y1
    /* renamed from: c */
    public final void mo13168c(C5156l0 c5156l0) {
        try {
            mo13169h(c5156l0);
        } catch (DeadObjectException e10) {
            mo13166a(AbstractC5196y1.m13206e(e10));
            throw e10;
        } catch (RemoteException e11) {
            mo13166a(AbstractC5196y1.m13206e(e11));
        } catch (RuntimeException e12) {
            this.f10576b.trySetException(e12);
        }
    }

    /* renamed from: h */
    protected abstract void mo13169h(C5156l0 c5156l0);
}
