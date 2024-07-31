package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzc;

/* loaded from: classes.dex */
public final class e extends zza implements g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.auth.account.g
    public final void T1(d dVar, String str) {
        Parcel zza = zza();
        zzc.zze(zza, dVar);
        zza.writeString(str);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.auth.account.g
    public final void U1(d dVar, Account account) {
        Parcel zza = zza();
        zzc.zze(zza, dVar);
        zzc.zzd(zza, account);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.auth.account.g
    public final void zzf(boolean z10) {
        Parcel zza = zza();
        zzc.zzc(zza, z10);
        zzc(1, zza);
    }
}
