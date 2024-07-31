package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.o2;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.u0;

/* loaded from: classes2.dex */
public final class zzbah extends zzayg implements zzbaj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbaj
    public final u0 zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbaj
    public final p2 zzf() {
        Parcel zzbl = zzbl(5, zza());
        p2 zzb = o2.zzb(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbaj
    public final void zzg(boolean z10) {
        Parcel zza = zza();
        int i10 = zzayi.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbm(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbaj
    public final void zzh(i2 i2Var) {
        Parcel zza = zza();
        zzayi.zzf(zza, i2Var);
        zzbm(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbaj
    public final void zzi(com.google.android.gms.dynamic.b bVar, zzbaq zzbaqVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbaqVar);
        zzbm(4, zza);
    }
}
