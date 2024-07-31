package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbkt;
import com.google.android.gms.internal.ads.zzbla;

/* loaded from: classes.dex */
public final class o0 extends zzayg implements q0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.q0
    public final n0 zze() {
        n0 l0Var;
        Parcel zzbl = zzbl(1, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            l0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            l0Var = queryLocalInterface instanceof n0 ? (n0) queryLocalInterface : new l0(readStrongBinder);
        }
        zzbl.recycle();
        return l0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.q0
    public final void zzh(String str, zzbkt zzbktVar, zzbkq zzbkqVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzayi.zzf(zza, zzbktVar);
        zzayi.zzf(zza, zzbkqVar);
        zzbm(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.q0
    public final void zzk(zzbla zzblaVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzblaVar);
        zzbm(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.q0
    public final void zzl(h0 h0Var) {
        Parcel zza = zza();
        zzayi.zzf(zza, h0Var);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.q0
    public final void zzo(zzbjb zzbjbVar) {
        Parcel zza = zza();
        zzayi.zzd(zza, zzbjbVar);
        zzbm(6, zza);
    }
}
