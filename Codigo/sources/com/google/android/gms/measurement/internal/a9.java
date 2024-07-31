package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f9968a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ v8 f9969b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a9(v8 v8Var, lb lbVar) {
        this.f9969b = v8Var;
        this.f9968a = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa.i iVar;
        iVar = this.f9969b.f10709d;
        if (iVar == null) {
            this.f9969b.zzj().B().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            com.google.android.gms.common.internal.s.j(this.f9968a);
            iVar.t0(this.f9968a);
        } catch (RemoteException e10) {
            this.f9969b.zzj().B().b("Failed to reset data on the service: remote exception", e10);
        }
        this.f9969b.b0();
    }
}
