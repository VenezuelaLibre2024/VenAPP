package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class z0 implements n {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f9678a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z0(IBinder iBinder) {
        this.f9678a = iBinder;
    }

    @Override // com.google.android.gms.common.internal.n
    public final void E0(m mVar, g gVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
            if (gVar != null) {
                obtain.writeInt(1);
                p1.a(gVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f9678a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9678a;
    }
}
