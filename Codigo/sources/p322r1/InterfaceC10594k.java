package p322r1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p322r1.InterfaceC10593j;

/* renamed from: r1.k */
/* loaded from: classes.dex */
public interface InterfaceC10594k extends IInterface {

    /* renamed from: r1.k$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC10594k {

        /* renamed from: r1.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C13244a implements InterfaceC10594k {

            /* renamed from: a */
            private IBinder f26695a;

            C13244a(IBinder iBinder) {
                this.f26695a = iBinder;
            }

            @Override // p322r1.InterfaceC10594k
            /* renamed from: M0 */
            public int mo8108M0(InterfaceC10593j interfaceC10593j, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongInterface(interfaceC10593j);
                    obtain.writeString(str);
                    this.f26695a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26695a;
            }

            @Override // p322r1.InterfaceC10594k
            /* renamed from: o0 */
            public void mo8110o0(int i10, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i10);
                    obtain.writeStringArray(strArr);
                    this.f26695a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        /* renamed from: f2 */
        public static InterfaceC10594k m32184f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC10594k)) ? new C13244a(iBinder) : (InterfaceC10594k) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
            if (i10 == 1) {
                int mo8108M0 = mo8108M0(InterfaceC10593j.a.m32183f2(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(mo8108M0);
            } else if (i10 == 2) {
                mo8109g0(InterfaceC10593j.a.m32183f2(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                mo8110o0(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    /* renamed from: M0 */
    int mo8108M0(InterfaceC10593j interfaceC10593j, String str);

    /* renamed from: g0 */
    void mo8109g0(InterfaceC10593j interfaceC10593j, int i10);

    /* renamed from: o0 */
    void mo8110o0(int i10, String[] strArr);
}
