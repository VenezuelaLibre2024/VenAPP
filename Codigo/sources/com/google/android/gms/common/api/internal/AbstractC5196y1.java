package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.y1 */
/* loaded from: classes.dex */
public abstract class AbstractC5196y1 {

    /* renamed from: a */
    public final int f10615a;

    public AbstractC5196y1(int i10) {
        this.f10615a = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* bridge */ /* synthetic */ Status m13206e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo13166a(Status status);

    /* renamed from: b */
    public abstract void mo13167b(Exception exc);

    /* renamed from: c */
    public abstract void mo13168c(C5156l0 c5156l0);

    /* renamed from: d */
    public abstract void mo13189d(C5116b0 c5116b0, boolean z10);
}
