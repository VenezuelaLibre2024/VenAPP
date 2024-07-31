package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public abstract class zzedw implements c.a, c.b {
    protected final zzceu zza = new zzceu();
    protected boolean zzb = false;
    protected boolean zzc = false;
    protected zzbyh zzd;
    protected Context zze;
    protected Looper zzf;
    protected ScheduledExecutorService zzg;

    @Override // com.google.android.gms.common.internal.c.a
    public abstract /* synthetic */ void onConnected(Bundle bundle);

    @Override // com.google.android.gms.common.internal.c.b
    public final void onConnectionFailed(ca.b bVar) {
        String format = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", Integer.valueOf(bVar.u1()));
        zzcec.zze(format);
        this.zza.zzd(new zzecf(1, format));
    }

    @Override // com.google.android.gms.common.internal.c.a
    public void onConnectionSuspended(int i10) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i10));
        zzcec.zze(format);
        this.zza.zzd(new zzecf(1, format));
    }

    public final synchronized void zzb() {
        if (this.zzd == null) {
            this.zzd = new zzbyh(this.zze, this.zzf, this, this);
        }
        this.zzd.checkAvailabilityAndConnect();
    }

    public final synchronized void zzc() {
        this.zzc = true;
        zzbyh zzbyhVar = this.zzd;
        if (zzbyhVar == null) {
            return;
        }
        if (zzbyhVar.isConnected() || this.zzd.isConnecting()) {
            this.zzd.disconnect();
        }
        Binder.flushPendingCommands();
    }
}
