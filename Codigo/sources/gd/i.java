package gd;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface i extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements i {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: gd.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0263a implements i {

            /* renamed from: b, reason: collision with root package name */
            public static i f16220b;

            /* renamed from: a, reason: collision with root package name */
            private IBinder f16221a;

            C0263a(IBinder iBinder) {
                this.f16221a = iBinder;
            }

            @Override // gd.i
            public void P(h hVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    obtain.writeString(str);
                    if (this.f16221a.transact(1, obtain, obtain2, 0) || a.g2() == null) {
                        obtain2.readException();
                    } else {
                        a.g2().P(hVar, str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // gd.i
            public void Y0(h hVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f16221a.transact(2, obtain, obtain2, 0) || a.g2() == null) {
                        obtain2.readException();
                    } else {
                        a.g2().Y0(hVar, bundle);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16221a;
            }
        }

        public static i f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof i)) ? new C0263a(iBinder) : (i) queryLocalInterface;
        }

        public static i g2() {
            return C0263a.f16220b;
        }
    }

    void P(h hVar, String str);

    void Y0(h hVar, Bundle bundle);
}
