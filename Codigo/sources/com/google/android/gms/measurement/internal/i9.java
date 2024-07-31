package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f10289a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f10290b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ v8 f10291c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i9(v8 v8Var, lb lbVar, Bundle bundle) {
        this.f10291c = v8Var;
        this.f10289a = lbVar;
        this.f10290b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa.i iVar;
        iVar = this.f10291c.f10709d;
        if (iVar == null) {
            this.f10291c.zzj().B().a("Failed to send default event parameters to service");
            return;
        }
        try {
            com.google.android.gms.common.internal.s.j(this.f10289a);
            iVar.C0(this.f10290b, this.f10289a);
        } catch (RemoteException e10) {
            this.f10291c.zzj().B().b("Failed to send default event parameters to service", e10);
        }
    }
}
