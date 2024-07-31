package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.play.integrity.internal.x */
/* loaded from: classes2.dex */
public final class C5850x extends C5815a implements InterfaceC5852z {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5850x(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC5852z
    /* renamed from: w */
    public final void mo14703w(Bundle bundle, InterfaceC5818b0 interfaceC5818b0) {
        Parcel m14652f2 = m14652f2();
        C5841o.m14694c(m14652f2, bundle);
        m14652f2.writeStrongBinder(interfaceC5818b0);
        m14653g2(2, m14652f2);
    }
}
