package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: classes.dex */
public final class h1 extends zzayg implements j1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public h1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.j1
    public final void zzb() {
        zzbm(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.j1
    public final void zzc() {
        zzbm(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.j1
    public final void zzd(c3 c3Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, c3Var);
        zzbm(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.j1
    public final void zze() {
        zzbm(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.j1
    public final void zzf() {
        zzbm(2, zza());
    }
}
