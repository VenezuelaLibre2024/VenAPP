package f5;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: f5.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0238a extends Binder implements a {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f5.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0239a implements a {

            /* renamed from: b, reason: collision with root package name */
            public static a f14952b;

            /* renamed from: a, reason: collision with root package name */
            private IBinder f14953a;

            C0239a(IBinder iBinder) {
                this.f14953a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14953a;
            }

            @Override // f5.a
            public int l(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f14953a.transact(1, obtain, obtain2, 0) && AbstractBinderC0238a.g2() != null) {
                        return AbstractBinderC0238a.g2().l(bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static a f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0239a(iBinder) : (a) queryLocalInterface;
        }

        public static a g2() {
            return C0239a.f14952b;
        }
    }

    int l(Bundle bundle);
}
