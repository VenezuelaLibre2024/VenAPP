package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.integrity.internal.t */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC5846t extends BinderC5840n implements InterfaceC5847u {
    /* renamed from: f2 */
    public static InterfaceC5847u m14702f2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return queryLocalInterface instanceof InterfaceC5847u ? (InterfaceC5847u) queryLocalInterface : new C5845s(iBinder);
    }
}
