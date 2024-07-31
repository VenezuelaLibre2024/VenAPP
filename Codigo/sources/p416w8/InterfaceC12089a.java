package p416w8;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: w8.a */
/* loaded from: classes.dex */
public interface InterfaceC12089a extends IInterface {

    /* renamed from: w8.a$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC12089a {

        /* renamed from: w8.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C13263a implements InterfaceC12089a {

            /* renamed from: a */
            private IBinder f32201a;

            C13263a(IBinder iBinder) {
                this.f32201a = iBinder;
            }

            @Override // p416w8.InterfaceC12089a
            /* renamed from: H */
            public Bundle mo38841H(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f32201a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f32201a;
            }
        }

        /* renamed from: f2 */
        public static InterfaceC12089a m38842f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC12089a)) ? new C13263a(iBinder) : (InterfaceC12089a) queryLocalInterface;
        }
    }

    /* renamed from: H */
    Bundle mo38841H(Bundle bundle);
}
