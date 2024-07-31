package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.play.integrity.internal.a0 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC5816a0 extends BinderC5840n implements InterfaceC5818b0 {
    public AbstractBinderC5816a0() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // com.google.android.play.integrity.internal.BinderC5840n
    /* renamed from: a */
    protected final boolean mo14654a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) C5841o.m14692a(parcel, Bundle.CREATOR);
        C5841o.m14693b(parcel);
        mo14618b(bundle);
        return true;
    }
}
