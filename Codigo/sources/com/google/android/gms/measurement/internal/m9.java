package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f10412a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ v8 f10413b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m9(v8 v8Var, lb lbVar) {
        this.f10413b = v8Var;
        this.f10412a = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa.i iVar;
        iVar = this.f10413b.f10709d;
        if (iVar == null) {
            this.f10413b.zzj().B().a("Failed to send consent settings to service");
            return;
        }
        try {
            com.google.android.gms.common.internal.s.j(this.f10412a);
            iVar.A0(this.f10412a);
            this.f10413b.b0();
        } catch (RemoteException e10) {
            this.f10413b.zzj().B().b("Failed to send consent settings to the service", e10);
        }
    }
}
