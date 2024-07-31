package com.google.android.gms.auth.account;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.auth.zzb;

/* renamed from: com.google.android.gms.auth.account.f */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5079f extends zzb implements InterfaceC5080g {
    /* renamed from: f2 */
    public static InterfaceC5080g m12841f2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return queryLocalInterface instanceof InterfaceC5080g ? (InterfaceC5080g) queryLocalInterface : new C5078e(iBinder);
    }
}
