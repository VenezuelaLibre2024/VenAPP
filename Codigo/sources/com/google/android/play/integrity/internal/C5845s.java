package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.play.integrity.internal.s */
/* loaded from: classes2.dex */
public final class C5845s extends C5815a implements InterfaceC5847u {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5845s(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC5847u
    /* renamed from: E1 */
    public final void mo14700E1(Bundle bundle, InterfaceC5849w interfaceC5849w) {
        Parcel m14652f2 = m14652f2();
        C5841o.m14694c(m14652f2, bundle);
        m14652f2.writeStrongBinder(interfaceC5849w);
        m14653g2(2, m14652f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC5847u
    /* renamed from: L1 */
    public final void mo14701L1(Bundle bundle, InterfaceC5849w interfaceC5849w) {
        Parcel m14652f2 = m14652f2();
        C5841o.m14694c(m14652f2, bundle);
        m14652f2.writeStrongBinder(interfaceC5849w);
        m14653g2(3, m14652f2);
    }
}
