package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f10312a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ v8 f10313b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j9(v8 v8Var, lb lbVar) {
        this.f10313b = v8Var;
        this.f10312a = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa.i iVar;
        iVar = this.f10313b.f10709d;
        if (iVar == null) {
            this.f10313b.zzj().B().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            com.google.android.gms.common.internal.s.j(this.f10312a);
            iVar.D0(this.f10312a);
            this.f10313b.b0();
        } catch (RemoteException e10) {
            this.f10313b.zzj().B().b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
