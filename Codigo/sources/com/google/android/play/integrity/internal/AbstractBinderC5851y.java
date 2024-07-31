package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.integrity.internal.y */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC5851y extends BinderC5840n implements InterfaceC5852z {
    /* renamed from: f2 */
    public static InterfaceC5852z m14704f2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return queryLocalInterface instanceof InterfaceC5852z ? (InterfaceC5852z) queryLocalInterface : new C5850x(iBinder);
    }
}
