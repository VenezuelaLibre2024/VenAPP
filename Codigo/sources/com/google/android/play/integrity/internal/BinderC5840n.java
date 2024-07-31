package com.google.android.play.integrity.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.play.integrity.internal.n */
/* loaded from: classes2.dex */
public class BinderC5840n extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public BinderC5840n(String str) {
        attachInterface(this, str);
    }

    /* renamed from: a */
    protected boolean mo14654a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return mo14654a(i10, parcel, parcel2, i11);
    }
}
