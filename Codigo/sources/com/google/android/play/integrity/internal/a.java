package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f10991a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10992b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(IBinder iBinder, String str) {
        this.f10991a = iBinder;
        this.f10992b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f10991a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel f2() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10992b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g2(int i10, Parcel parcel) {
        try {
            this.f10991a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
