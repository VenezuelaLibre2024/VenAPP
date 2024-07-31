package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.common.internal.z0 */
/* loaded from: classes.dex */
final class C5298z0 implements InterfaceC5261n {

    /* renamed from: a */
    private final IBinder f10793a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5298z0(IBinder iBinder) {
        this.f10793a = iBinder;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC5261n
    /* renamed from: E0 */
    public final void mo13299E0(InterfaceC5258m interfaceC5258m, C5240g c5240g) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(interfaceC5258m != null ? interfaceC5258m.asBinder() : null);
            if (c5240g != null) {
                obtain.writeInt(1);
                C5269p1.m13302a(c5240g, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f10793a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f10793a;
    }
}
