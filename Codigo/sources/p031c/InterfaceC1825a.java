package p031c;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.a */
/* loaded from: classes.dex */
public interface InterfaceC1825a extends IInterface {

    /* renamed from: k */
    public static final String f7723k = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: c.a$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC1825a {

        /* renamed from: c.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C13176a implements InterfaceC1825a {

            /* renamed from: a */
            private IBinder f7724a;

            C13176a(IBinder iBinder) {
                this.f7724a = iBinder;
            }

            @Override // p031c.InterfaceC1825a
            /* renamed from: Y1 */
            public void mo9824Y1(String str, int i10, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC1825a.f7723k);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    b.m9827b(obtain, notification, 0);
                    this.f7724a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7724a;
            }
        }

        /* renamed from: f2 */
        public static InterfaceC1825a m9825f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC1825a.f7723k);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC1825a)) ? new C13176a(iBinder) : (InterfaceC1825a) queryLocalInterface;
        }
    }

    /* renamed from: c.a$b */
    /* loaded from: classes.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static <T extends Parcelable> void m9827b(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    /* renamed from: Y1 */
    void mo9824Y1(String str, int i10, String str2, Notification notification);
}
