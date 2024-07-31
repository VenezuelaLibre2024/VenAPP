package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.u4;

/* loaded from: classes2.dex */
public final class zzeqp {
    private final zzequ zza;
    private final String zzb;
    private p2 zzc;

    public zzeqp(zzequ zzequVar, String str) {
        this.zza = zzequVar;
        this.zzb = str;
    }

    public final synchronized String zza() {
        p2 p2Var;
        try {
            p2Var = this.zzc;
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return p2Var != null ? p2Var.zzg() : null;
    }

    public final synchronized String zzb() {
        p2 p2Var;
        try {
            p2Var = this.zzc;
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return p2Var != null ? p2Var.zzg() : null;
    }

    public final synchronized void zzd(u4 u4Var, int i10) {
        this.zzc = null;
        zzeqv zzeqvVar = new zzeqv(i10);
        zzeqo zzeqoVar = new zzeqo(this);
        this.zza.zzb(u4Var, this.zzb, zzeqvVar, zzeqoVar);
    }

    public final synchronized boolean zze() {
        return this.zza.zza();
    }
}
