package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.InterfaceC5252k;

/* renamed from: com.google.android.gms.common.internal.a */
/* loaded from: classes.dex */
public class BinderC5220a extends InterfaceC5252k.a {
    /* renamed from: g2 */
    public static Account m13222g2(InterfaceC5252k interfaceC5252k) {
        Account account = null;
        if (interfaceC5252k != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    account = interfaceC5252k.zzb();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }
}
