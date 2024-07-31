package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class zzfwd implements ServiceConnection {
    final /* synthetic */ zzfwe zza;

    public /* synthetic */ zzfwd(zzfwe zzfweVar, zzfwc zzfwcVar) {
        this.zza = zzfweVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzfvt zzfvtVar;
        zzfvtVar = this.zza.zzc;
        zzfvtVar.zzc("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.zza.zzc().post(new zzfwa(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzfvt zzfvtVar;
        zzfvtVar = this.zza.zzc;
        zzfvtVar.zzc("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.zza.zzc().post(new zzfwb(this));
    }
}
