package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* renamed from: com.google.android.gms.common.internal.y1 */
/* loaded from: classes.dex */
public final class C5296y1 extends zza implements InterfaceC5252k {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5296y1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC5252k
    public final Account zzb() {
        Parcel zzB = zzB(2, zza());
        Account account = (Account) zzc.zza(zzB, Account.CREATOR);
        zzB.recycle();
        return account;
    }
}
