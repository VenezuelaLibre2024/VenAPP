package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.v2;
import x8.b0;

/* loaded from: classes2.dex */
public final class zzdsj extends b0.a {
    private final zzdna zza;

    public zzdsj(zzdna zzdnaVar) {
        this.zza = zzdnaVar;
    }

    private static v2 zza(zzdna zzdnaVar) {
        s2 zzj = zzdnaVar.zzj();
        if (zzj == null) {
            return null;
        }
        try {
            return zzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // x8.b0.a
    public final void onVideoEnd() {
        v2 zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zze();
        } catch (RemoteException e10) {
            zzcec.zzk("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // x8.b0.a
    public final void onVideoPause() {
        v2 zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzg();
        } catch (RemoteException e10) {
            zzcec.zzk("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // x8.b0.a
    public final void onVideoStart() {
        v2 zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzi();
        } catch (RemoteException e10) {
            zzcec.zzk("Unable to call onVideoEnd()", e10);
        }
    }
}
