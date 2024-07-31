package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzayh;

/* renamed from: com.google.android.gms.ads.internal.client.x0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4931x0 extends zzayh implements InterfaceC4937y0 {
    /* renamed from: f2 */
    public static InterfaceC4937y0 m12478f2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return queryLocalInterface instanceof InterfaceC4937y0 ? (InterfaceC4937y0) queryLocalInterface : new C4925w0(iBinder);
    }
}
