package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzc;

/* renamed from: com.google.android.gms.auth.account.e */
/* loaded from: classes.dex */
public final class C5078e extends zza implements InterfaceC5080g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5078e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.auth.account.InterfaceC5080g
    /* renamed from: T1 */
    public final void mo12839T1(InterfaceC5077d interfaceC5077d, String str) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5077d);
        zza.writeString(str);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.auth.account.InterfaceC5080g
    /* renamed from: U1 */
    public final void mo12840U1(InterfaceC5077d interfaceC5077d, Account account) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5077d);
        zzc.zzd(zza, account);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.auth.account.InterfaceC5080g
    public final void zzf(boolean z10) {
        Parcel zza = zza();
        zzc.zzc(zza, z10);
        zzc(1, zza);
    }
}
