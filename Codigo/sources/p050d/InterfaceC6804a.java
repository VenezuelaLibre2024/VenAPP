package p050d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d.a */
/* loaded from: classes.dex */
public interface InterfaceC6804a extends IInterface {

    /* renamed from: m */
    public static final String f15027m = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: d.a$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC6804a {

        /* renamed from: d.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C13199a implements InterfaceC6804a {

            /* renamed from: a */
            private IBinder f15028a;

            C13199a(IBinder iBinder) {
                this.f15028a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15028a;
            }
        }

        public a() {
            attachInterface(this, InterfaceC6804a.f15027m);
        }

        /* renamed from: f2 */
        public static InterfaceC6804a m19685f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC6804a.f15027m);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC6804a)) ? new C13199a(iBinder) : (InterfaceC6804a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = InterfaceC6804a.f15027m;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            mo19684q0(parcel.readInt(), (Bundle) b.m19687b(parcel, Bundle.CREATOR));
            return true;
        }
    }

    /* renamed from: d.a$b */
    /* loaded from: classes.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static <T> T m19687b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    /* renamed from: q0 */
    void mo19684q0(int i10, Bundle bundle);
}
