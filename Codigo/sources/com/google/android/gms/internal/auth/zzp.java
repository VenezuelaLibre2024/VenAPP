package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.h;
import r9.b;

/* loaded from: classes2.dex */
public final class zzp extends zza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void zzd(h hVar, zzbw zzbwVar) {
        Parcel zza = zza();
        zzc.zze(zza, hVar);
        zzc.zzd(zza, zzbwVar);
        zzc(2, zza);
    }

    public final void zze(zzm zzmVar, b bVar) {
        Parcel zza = zza();
        zzc.zze(zza, zzmVar);
        zzc.zzd(zza, bVar);
        zzc(4, zza);
    }

    public final void zzf(zzo zzoVar, Account account, String str, Bundle bundle) {
        Parcel zza = zza();
        zzc.zze(zza, zzoVar);
        zzc.zzd(zza, account);
        zza.writeString(str);
        zzc.zzd(zza, bundle);
        zzc(1, zza);
    }

    public final void zzg(zzk zzkVar, Account account) {
        Parcel zza = zza();
        zzc.zze(zza, zzkVar);
        zzc.zzd(zza, account);
        zzc(6, zza);
    }

    public final void zzh(zzk zzkVar, String str) {
        Parcel zza = zza();
        zzc.zze(zza, zzkVar);
        zza.writeString(str);
        zzc(3, zza);
    }
}
