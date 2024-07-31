package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcak;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcau;
import com.google.android.gms.internal.ads.zzcav;
import com.google.android.gms.internal.ads.zzcbb;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzcec;

/* loaded from: classes.dex */
public final class f4 extends zzcam {
    private static void f2(final zzcau zzcauVar) {
        zzcec.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcdv.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.e4
            @Override // java.lang.Runnable
            public final void run() {
                zzcau zzcauVar2 = zzcau.this;
                if (zzcauVar2 != null) {
                    try {
                        zzcauVar2.zze(1);
                    } catch (RemoteException e10) {
                        zzcec.zzl("#007 Could not call remote method.", e10);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final Bundle zzb() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final p2 zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final zzcak zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final String zze() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzf(u4 u4Var, zzcau zzcauVar) {
        f2(zzcauVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzg(u4 u4Var, zzcau zzcauVar) {
        f2(zzcauVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzh(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzi(f2 f2Var) {
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzj(i2 i2Var) {
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzk(zzcaq zzcaqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzl(zzcbb zzcbbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzm(com.google.android.gms.dynamic.b bVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzn(com.google.android.gms.dynamic.b bVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final boolean zzo() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzp(zzcav zzcavVar) {
    }
}
