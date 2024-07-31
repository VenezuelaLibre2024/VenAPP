package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzayh;

/* loaded from: classes.dex */
public abstract class x0 extends zzayh implements y0 {
    public static y0 f2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return queryLocalInterface instanceof y0 ? (y0) queryLocalInterface : new w0(iBinder);
    }
}
