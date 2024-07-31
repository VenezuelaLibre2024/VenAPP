package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class o9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f10478a = true;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ lb f10479b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f10480c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ d f10481d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ d f10482e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ v8 f10483f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o9(v8 v8Var, boolean z10, lb lbVar, boolean z11, d dVar, d dVar2) {
        this.f10483f = v8Var;
        this.f10479b = lbVar;
        this.f10480c = z11;
        this.f10481d = dVar;
        this.f10482e = dVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa.i iVar;
        iVar = this.f10483f.f10709d;
        if (iVar == null) {
            this.f10483f.zzj().B().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f10478a) {
            com.google.android.gms.common.internal.s.j(this.f10479b);
            this.f10483f.O(iVar, this.f10480c ? null : this.f10481d, this.f10479b);
        } else {
            try {
                if (TextUtils.isEmpty(this.f10482e.f10043a)) {
                    com.google.android.gms.common.internal.s.j(this.f10479b);
                    iVar.b2(this.f10481d, this.f10479b);
                } else {
                    iVar.T(this.f10481d);
                }
            } catch (RemoteException e10) {
                this.f10483f.zzj().B().b("Failed to send conditional user property to the service", e10);
            }
        }
        this.f10483f.b0();
    }
}
