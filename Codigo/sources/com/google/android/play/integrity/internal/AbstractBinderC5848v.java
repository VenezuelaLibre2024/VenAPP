package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.play.integrity.internal.v */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC5848v extends BinderC5840n implements InterfaceC5849w {
    public AbstractBinderC5848v() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // com.google.android.play.integrity.internal.BinderC5840n
    /* renamed from: a */
    protected final boolean mo14654a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            Bundle bundle = (Bundle) C5841o.m14692a(parcel, Bundle.CREATOR);
            C5841o.m14693b(parcel);
            mo14630e(bundle);
            return true;
        }
        if (i10 == 3) {
            Bundle bundle2 = (Bundle) C5841o.m14692a(parcel, Bundle.CREATOR);
            C5841o.m14693b(parcel);
            mo14628c(bundle2);
            return true;
        }
        if (i10 == 4) {
            Bundle bundle3 = (Bundle) C5841o.m14692a(parcel, Bundle.CREATOR);
            C5841o.m14693b(parcel);
            mo14629d(bundle3);
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) C5841o.m14692a(parcel, Bundle.CREATOR);
        C5841o.m14693b(parcel);
        mo14627b(bundle4);
        return true;
    }
}
