package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* renamed from: com.google.android.gms.common.internal.k */
/* loaded from: classes.dex */
public interface InterfaceC5252k extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.k$a */
    /* loaded from: classes.dex */
    public static abstract class a extends zzb implements InterfaceC5252k {
        /* renamed from: f2 */
        public static InterfaceC5252k m13292f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof InterfaceC5252k ? (InterfaceC5252k) queryLocalInterface : new C5296y1(iBinder);
        }
    }

    Account zzb();
}
