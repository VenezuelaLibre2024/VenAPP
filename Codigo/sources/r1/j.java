package r1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface j extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements j {

        /* renamed from: r1.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0409a implements j {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f24580a;

            C0409a(IBinder iBinder) {
                this.f24580a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f24580a;
            }

            @Override // r1.j
            public void q(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f24580a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static j f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof j)) ? new C0409a(iBinder) : (j) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            q(parcel.createStringArray());
            return true;
        }
    }

    void q(String[] strArr);
}
