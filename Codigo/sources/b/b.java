package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* renamed from: i, reason: collision with root package name */
    public static final String f5967i = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: b.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0100a implements b {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f5968a;

            C0100a(IBinder iBinder) {
                this.f5968a = iBinder;
            }

            @Override // b.b
            public boolean C1(b.a aVar, int i10, Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5967i);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeInt(i10);
                    C0101b.d(obtain, uri, 0);
                    C0101b.d(obtain, bundle, 0);
                    this.f5968a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean M(b.a aVar, IBinder iBinder, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5967i);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeStrongBinder(iBinder);
                    C0101b.d(obtain, bundle, 0);
                    this.f5968a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean U0(b.a aVar, Uri uri, Bundle bundle, List<Bundle> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5967i);
                    obtain.writeStrongInterface(aVar);
                    C0101b.d(obtain, uri, 0);
                    C0101b.d(obtain, bundle, 0);
                    C0101b.c(obtain, list, 0);
                    this.f5968a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean W(b.a aVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5967i);
                    obtain.writeStrongInterface(aVar);
                    C0101b.d(obtain, bundle, 0);
                    this.f5968a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean Z(b.a aVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5967i);
                    obtain.writeStrongInterface(aVar);
                    C0101b.d(obtain, bundle, 0);
                    this.f5968a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5968a;
            }

            @Override // b.b
            public boolean b1(long j10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5967i);
                    obtain.writeLong(j10);
                    this.f5968a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean h1(b.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5967i);
                    obtain.writeStrongInterface(aVar);
                    this.f5968a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean j(b.a aVar, Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5967i);
                    obtain.writeStrongInterface(aVar);
                    C0101b.d(obtain, uri, 0);
                    C0101b.d(obtain, bundle, 0);
                    this.f5968a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public int m(b.a aVar, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5967i);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeString(str);
                    C0101b.d(obtain, bundle, 0);
                    this.f5968a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean q1(b.a aVar, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5967i);
                    obtain.writeStrongInterface(aVar);
                    C0101b.d(obtain, uri, 0);
                    this.f5968a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean y1(b.a aVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5967i);
                    obtain.writeStrongInterface(aVar);
                    C0101b.d(obtain, bundle, 0);
                    this.f5968a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static b f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(b.f5967i);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0100a(iBinder) : (b) queryLocalInterface;
        }
    }

    /* renamed from: b.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0101b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void c(Parcel parcel, List<T> list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                d(parcel, list.get(i11), i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    boolean C1(b.a aVar, int i10, Uri uri, Bundle bundle);

    boolean M(b.a aVar, IBinder iBinder, Bundle bundle);

    boolean U0(b.a aVar, Uri uri, Bundle bundle, List<Bundle> list);

    boolean W(b.a aVar, Bundle bundle);

    boolean Z(b.a aVar, Bundle bundle);

    boolean b1(long j10);

    boolean h1(b.a aVar);

    boolean j(b.a aVar, Uri uri, Bundle bundle);

    int m(b.a aVar, String str, Bundle bundle);

    boolean q1(b.a aVar, Uri uri);

    boolean y1(b.a aVar, Bundle bundle);
}
