package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.common.internal.c;

/* loaded from: classes2.dex */
public abstract class zzebq implements c.a, c.b {
    protected final zzceu zza = new zzceu();
    protected final Object zzb = new Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected zzbze zze;
    protected zzbye zzf;

    @Override // com.google.android.gms.common.internal.c.a
    public abstract /* synthetic */ void onConnected(Bundle bundle);

    public void onConnectionFailed(ca.b bVar) {
        zzcec.zze("Disconnected from remote ad request service.");
        this.zza.zzd(new zzecf(1));
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnectionSuspended(int i10) {
        zzcec.zze("Cannot connect to remote service, fallback to local instance.");
    }

    public final void zza() {
        synchronized (this.zzb) {
            this.zzd = true;
            if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                this.zzf.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}
