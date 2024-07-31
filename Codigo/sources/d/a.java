package d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: m, reason: collision with root package name */
    public static final String f13673m = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: d.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0201a extends Binder implements a {

        /* renamed from: d.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0202a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f13674a;

            C0202a(IBinder iBinder) {
                this.f13674a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13674a;
            }
        }

        public AbstractBinderC0201a() {
            attachInterface(this, a.f13673m);
        }

        public static a f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f13673m);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0202a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = a.f13673m;
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
            q0(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void q0(int i10, Bundle bundle);
}
