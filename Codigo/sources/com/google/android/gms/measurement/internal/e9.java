package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ p8 f10159a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ v8 f10160b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e9(v8 v8Var, p8 p8Var) {
        this.f10160b = v8Var;
        this.f10159a = p8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa.i iVar;
        long j10;
        String str;
        String str2;
        String packageName;
        iVar = this.f10160b.f10709d;
        if (iVar == null) {
            this.f10160b.zzj().B().a("Failed to send current screen to service");
            return;
        }
        try {
            p8 p8Var = this.f10159a;
            if (p8Var == null) {
                j10 = 0;
                str = null;
                str2 = null;
                packageName = this.f10160b.zza().getPackageName();
            } else {
                j10 = p8Var.f10511c;
                str = p8Var.f10509a;
                str2 = p8Var.f10510b;
                packageName = this.f10160b.zza().getPackageName();
            }
            iVar.J(j10, str, str2, packageName);
            this.f10160b.b0();
        } catch (RemoteException e10) {
            this.f10160b.zzj().B().b("Failed to send current screen to the service", e10);
        }
    }
}
