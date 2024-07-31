package gd;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: gd.i */
/* loaded from: classes.dex */
public interface InterfaceC7553i extends IInterface {

    /* renamed from: gd.i$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC7553i {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: gd.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C13209a implements InterfaceC7553i {

            /* renamed from: b */
            public static InterfaceC7553i f17857b;

            /* renamed from: a */
            private IBinder f17858a;

            C13209a(IBinder iBinder) {
                this.f17858a = iBinder;
            }

            @Override // gd.InterfaceC7553i
            /* renamed from: P */
            public void mo22929P(InterfaceC7552h interfaceC7552h, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    obtain.writeStrongBinder(interfaceC7552h != null ? interfaceC7552h.asBinder() : null);
                    obtain.writeString(str);
                    if (this.f17858a.transact(1, obtain, obtain2, 0) || a.m22932g2() == null) {
                        obtain2.readException();
                    } else {
                        a.m22932g2().mo22929P(interfaceC7552h, str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // gd.InterfaceC7553i
            /* renamed from: Y0 */
            public void mo22930Y0(InterfaceC7552h interfaceC7552h, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    obtain.writeStrongBinder(interfaceC7552h != null ? interfaceC7552h.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f17858a.transact(2, obtain, obtain2, 0) || a.m22932g2() == null) {
                        obtain2.readException();
                    } else {
                        a.m22932g2().mo22930Y0(interfaceC7552h, bundle);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17858a;
            }
        }

        /* renamed from: f2 */
        public static InterfaceC7553i m22931f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC7553i)) ? new C13209a(iBinder) : (InterfaceC7553i) queryLocalInterface;
        }

        /* renamed from: g2 */
        public static InterfaceC7553i m22932g2() {
            return C13209a.f17857b;
        }
    }

    /* renamed from: P */
    void mo22929P(InterfaceC7552h interfaceC7552h, String str);

    /* renamed from: Y0 */
    void mo22930Y0(InterfaceC7552h interfaceC7552h, Bundle bundle);
}
