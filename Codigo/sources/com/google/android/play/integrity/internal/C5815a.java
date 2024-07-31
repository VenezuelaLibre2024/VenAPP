package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.play.integrity.internal.a */
/* loaded from: classes2.dex */
public class C5815a implements IInterface {

    /* renamed from: a */
    private final IBinder f12206a;

    /* renamed from: b */
    private final String f12207b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C5815a(IBinder iBinder, String str) {
        this.f12206a = iBinder;
        this.f12207b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12206a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f2 */
    public final Parcel m14652f2() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f12207b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g2 */
    public final void m14653g2(int i10, Parcel parcel) {
        try {
            this.f12206a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
