package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.ads.zzcak;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcau;
import com.google.android.gms.internal.ads.zzcav;
import com.google.android.gms.internal.ads.zzcbb;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzcec;

/* renamed from: com.google.android.gms.ads.internal.client.f4 */
/* loaded from: classes.dex */
public final class BinderC4823f4 extends zzcam {
    /* renamed from: f2 */
    private static void m12401f2(final zzcau zzcauVar) {
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
    public final InterfaceC4885p2 zzc() {
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
    public final void zzf(C4917u4 c4917u4, zzcau zzcauVar) {
        m12401f2(zzcauVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzg(C4917u4 c4917u4, zzcau zzcauVar) {
        m12401f2(zzcauVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzh(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzi(InterfaceC4821f2 interfaceC4821f2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzj(InterfaceC4842i2 interfaceC4842i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzk(zzcaq zzcaqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzl(zzcbb zzcbbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzm(InterfaceC5312b interfaceC5312b) {
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzn(InterfaceC5312b interfaceC5312b, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final boolean zzo() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzp(zzcav zzcavVar) {
    }
}
