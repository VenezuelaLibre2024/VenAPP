package w8;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: w8.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0478a extends Binder implements a {

        /* renamed from: w8.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0479a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f29736a;

            C0479a(IBinder iBinder) {
                this.f29736a = iBinder;
            }

            @Override // w8.a
            public Bundle H(Bundle bundle) {
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
                    this.f29736a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29736a;
            }
        }

        public static a f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0479a(iBinder) : (a) queryLocalInterface;
        }
    }

    Bundle H(Bundle bundle);
}
