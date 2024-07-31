package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* renamed from: com.google.android.gms.common.internal.b1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5226b1 extends zzb implements InterfaceC5230c1 {
    /* renamed from: f2 */
    public static InterfaceC5230c1 m13227f2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof InterfaceC5230c1 ? (InterfaceC5230c1) queryLocalInterface : new C5222a1(iBinder);
    }
}
