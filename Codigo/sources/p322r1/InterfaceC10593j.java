package p322r1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: r1.j */
/* loaded from: classes.dex */
public interface InterfaceC10593j extends IInterface {

    /* renamed from: r1.j$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC10593j {

        /* renamed from: r1.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C13243a implements InterfaceC10593j {

            /* renamed from: a */
            private IBinder f26694a;

            C13243a(IBinder iBinder) {
                this.f26694a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26694a;
            }

            @Override // p322r1.InterfaceC10593j
            /* renamed from: q */
            public void mo32182q(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f26694a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: f2 */
        public static InterfaceC10593j m32183f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC10593j)) ? new C13243a(iBinder) : (InterfaceC10593j) queryLocalInterface;
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
            mo32182q(parcel.createStringArray());
            return true;
        }
    }

    /* renamed from: q */
    void mo32182q(String[] strArr);
}
