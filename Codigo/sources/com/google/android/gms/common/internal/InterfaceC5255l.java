package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* renamed from: com.google.android.gms.common.internal.l */
/* loaded from: classes.dex */
public interface InterfaceC5255l extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.l$a */
    /* loaded from: classes.dex */
    public static abstract class a extends zzb implements InterfaceC5255l {
        /* renamed from: f2 */
        public static InterfaceC5255l m13295f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return queryLocalInterface instanceof InterfaceC5255l ? (InterfaceC5255l) queryLocalInterface : new C5299z1(iBinder);
        }
    }

    void cancel();
}
