package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class g9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f10204a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ v8 f10205b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g9(v8 v8Var, lb lbVar) {
        this.f10205b = v8Var;
        this.f10204a = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa.i iVar;
        iVar = this.f10205b.f10709d;
        if (iVar == null) {
            this.f10205b.zzj().B().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            com.google.android.gms.common.internal.s.j(this.f10204a);
            iVar.d1(this.f10204a);
            this.f10205b.l().E();
            this.f10205b.O(iVar, null, this.f10204a);
            this.f10205b.b0();
        } catch (RemoteException e10) {
            this.f10205b.zzj().B().b("Failed to send app launch to the service", e10);
        }
    }
}
