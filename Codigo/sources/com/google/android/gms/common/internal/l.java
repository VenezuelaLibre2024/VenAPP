package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* loaded from: classes.dex */
public interface l extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends zzb implements l {
        public static l f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return queryLocalInterface instanceof l ? (l) queryLocalInterface : new z1(iBinder);
        }
    }

    void cancel();
}
