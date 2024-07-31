package p097f5;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: f5.a */
/* loaded from: classes.dex */
public interface InterfaceC7296a extends IInterface {

    /* renamed from: f5.a$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC7296a {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f5.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C13207a implements InterfaceC7296a {

            /* renamed from: b */
            public static InterfaceC7296a f16375b;

            /* renamed from: a */
            private IBinder f16376a;

            C13207a(IBinder iBinder) {
                this.f16376a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16376a;
            }

            @Override // p097f5.InterfaceC7296a
            /* renamed from: l */
            public int mo21872l(Bundle bundle) {
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
                    if (!this.f16376a.transact(1, obtain, obtain2, 0) && a.m21874g2() != null) {
                        return a.m21874g2().mo21872l(bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: f2 */
        public static InterfaceC7296a m21873f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC7296a)) ? new C13207a(iBinder) : (InterfaceC7296a) queryLocalInterface;
        }

        /* renamed from: g2 */
        public static InterfaceC7296a m21874g2() {
            return C13207a.f16375b;
        }
    }

    /* renamed from: l */
    int mo21872l(Bundle bundle);
}
