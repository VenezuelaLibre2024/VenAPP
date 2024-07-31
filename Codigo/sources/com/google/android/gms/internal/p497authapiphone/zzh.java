package com.google.android.gms.internal.p497authapiphone;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.InterfaceC5139h;

/* loaded from: classes2.dex */
public final class zzh extends zza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void zzc(zze zzeVar) {
        Parcel zza = zza();
        zzc.zzb(zza, zzeVar);
        zzb(4, zza);
    }

    public final void zzd(String str, zzg zzgVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzb(zza, zzgVar);
        zzb(5, zza);
    }

    public final void zze(InterfaceC5139h interfaceC5139h) {
        Parcel zza = zza();
        zzc.zzb(zza, interfaceC5139h);
        zzb(3, zza);
    }

    public final void zzf(InterfaceC5139h interfaceC5139h) {
        Parcel zza = zza();
        zzc.zzb(zza, interfaceC5139h);
        zzb(6, zza);
    }

    public final void zzg(zzj zzjVar) {
        Parcel zza = zza();
        zzc.zzb(zza, zzjVar);
        zzb(1, zza);
    }

    public final void zzh(String str, zzj zzjVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzb(zza, zzjVar);
        zzb(2, zza);
    }
}
