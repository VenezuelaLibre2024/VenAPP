package c;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: k, reason: collision with root package name */
    public static final String f6774k = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: c.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0111a extends Binder implements a {

        /* renamed from: c.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0112a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f6775a;

            C0112a(IBinder iBinder) {
                this.f6775a = iBinder;
            }

            @Override // c.a
            public void Y1(String str, int i10, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f6774k);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    b.b(obtain, notification, 0);
                    this.f6775a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6775a;
            }
        }

        public static a f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f6774k);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0112a(iBinder) : (a) queryLocalInterface;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    void Y1(String str, int i10, String str2, Notification notification);
}
