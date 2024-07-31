package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public final class zzbpw extends zzayg implements zzbpy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbpy
    public final void zze(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpy
    public final void zzf(c3 c3Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, c3Var);
        zzbm(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpy
    public final void zzg(zzbps zzbpsVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbpsVar);
        zzbm(1, zza);
    }
}
