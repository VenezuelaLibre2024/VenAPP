package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class t extends n implements u {
    public static u f2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return queryLocalInterface instanceof u ? (u) queryLocalInterface : new s(iBinder);
    }
}
