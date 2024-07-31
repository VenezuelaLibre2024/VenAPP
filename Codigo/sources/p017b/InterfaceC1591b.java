package p017b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: b.b */
/* loaded from: classes.dex */
public interface InterfaceC1591b extends IInterface {

    /* renamed from: i */
    public static final String f6822i = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* renamed from: b.b$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC1591b {

        /* renamed from: b.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C13173a implements InterfaceC1591b {

            /* renamed from: a */
            private IBinder f6823a;

            C13173a(IBinder iBinder) {
                this.f6823a = iBinder;
            }

            @Override // p017b.InterfaceC1591b
            /* renamed from: C1 */
            public boolean mo8833C1(InterfaceC1590a interfaceC1590a, int i10, Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC1591b.f6822i);
                    obtain.writeStrongInterface(interfaceC1590a);
                    obtain.writeInt(i10);
                    b.m8848d(obtain, uri, 0);
                    b.m8848d(obtain, bundle, 0);
                    this.f6823a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p017b.InterfaceC1591b
            /* renamed from: M */
            public boolean mo8834M(InterfaceC1590a interfaceC1590a, IBinder iBinder, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC1591b.f6822i);
                    obtain.writeStrongInterface(interfaceC1590a);
                    obtain.writeStrongBinder(iBinder);
                    b.m8848d(obtain, bundle, 0);
                    this.f6823a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p017b.InterfaceC1591b
            /* renamed from: U0 */
            public boolean mo8835U0(InterfaceC1590a interfaceC1590a, Uri uri, Bundle bundle, List<Bundle> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC1591b.f6822i);
                    obtain.writeStrongInterface(interfaceC1590a);
                    b.m8848d(obtain, uri, 0);
                    b.m8848d(obtain, bundle, 0);
                    b.m8847c(obtain, list, 0);
                    this.f6823a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p017b.InterfaceC1591b
            /* renamed from: W */
            public boolean mo8836W(InterfaceC1590a interfaceC1590a, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC1591b.f6822i);
                    obtain.writeStrongInterface(interfaceC1590a);
                    b.m8848d(obtain, bundle, 0);
                    this.f6823a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p017b.InterfaceC1591b
            /* renamed from: Z */
            public boolean mo8837Z(InterfaceC1590a interfaceC1590a, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC1591b.f6822i);
                    obtain.writeStrongInterface(interfaceC1590a);
                    b.m8848d(obtain, bundle, 0);
                    this.f6823a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6823a;
            }

            @Override // p017b.InterfaceC1591b
            /* renamed from: b1 */
            public boolean mo8838b1(long j10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC1591b.f6822i);
                    obtain.writeLong(j10);
                    this.f6823a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p017b.InterfaceC1591b
            /* renamed from: h1 */
            public boolean mo8839h1(InterfaceC1590a interfaceC1590a) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC1591b.f6822i);
                    obtain.writeStrongInterface(interfaceC1590a);
                    this.f6823a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p017b.InterfaceC1591b
            /* renamed from: j */
            public boolean mo8840j(InterfaceC1590a interfaceC1590a, Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC1591b.f6822i);
                    obtain.writeStrongInterface(interfaceC1590a);
                    b.m8848d(obtain, uri, 0);
                    b.m8848d(obtain, bundle, 0);
                    this.f6823a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p017b.InterfaceC1591b
            /* renamed from: m */
            public int mo8841m(InterfaceC1590a interfaceC1590a, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC1591b.f6822i);
                    obtain.writeStrongInterface(interfaceC1590a);
                    obtain.writeString(str);
                    b.m8848d(obtain, bundle, 0);
                    this.f6823a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p017b.InterfaceC1591b
            /* renamed from: q1 */
            public boolean mo8842q1(InterfaceC1590a interfaceC1590a, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC1591b.f6822i);
                    obtain.writeStrongInterface(interfaceC1590a);
                    b.m8848d(obtain, uri, 0);
                    this.f6823a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p017b.InterfaceC1591b
            /* renamed from: y1 */
            public boolean mo8843y1(InterfaceC1590a interfaceC1590a, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC1591b.f6822i);
                    obtain.writeStrongInterface(interfaceC1590a);
                    b.m8848d(obtain, bundle, 0);
                    this.f6823a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: f2 */
        public static InterfaceC1591b m8844f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC1591b.f6822i);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC1591b)) ? new C13173a(iBinder) : (InterfaceC1591b) queryLocalInterface;
        }
    }

    /* renamed from: b.b$b */
    /* loaded from: classes.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static <T extends Parcelable> void m8847c(Parcel parcel, List<T> list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                m8848d(parcel, list.get(i11), i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static <T extends Parcelable> void m8848d(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    /* renamed from: C1 */
    boolean mo8833C1(InterfaceC1590a interfaceC1590a, int i10, Uri uri, Bundle bundle);

    /* renamed from: M */
    boolean mo8834M(InterfaceC1590a interfaceC1590a, IBinder iBinder, Bundle bundle);

    /* renamed from: U0 */
    boolean mo8835U0(InterfaceC1590a interfaceC1590a, Uri uri, Bundle bundle, List<Bundle> list);

    /* renamed from: W */
    boolean mo8836W(InterfaceC1590a interfaceC1590a, Bundle bundle);

    /* renamed from: Z */
    boolean mo8837Z(InterfaceC1590a interfaceC1590a, Bundle bundle);

    /* renamed from: b1 */
    boolean mo8838b1(long j10);

    /* renamed from: h1 */
    boolean mo8839h1(InterfaceC1590a interfaceC1590a);

    /* renamed from: j */
    boolean mo8840j(InterfaceC1590a interfaceC1590a, Uri uri, Bundle bundle);

    /* renamed from: m */
    int mo8841m(InterfaceC1590a interfaceC1590a, String str, Bundle bundle);

    /* renamed from: q1 */
    boolean mo8842q1(InterfaceC1590a interfaceC1590a, Uri uri);

    /* renamed from: y1 */
    boolean mo8843y1(InterfaceC1590a interfaceC1590a, Bundle bundle);
}
