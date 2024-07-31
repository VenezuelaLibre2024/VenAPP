package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0014a implements b {

            /* renamed from: b, reason: collision with root package name */
            public static b f586b;

            /* renamed from: a, reason: collision with root package name */
            private IBinder f587a;

            C0014a(IBinder iBinder) {
                this.f587a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f587a;
            }

            @Override // android.support.v4.media.session.b
            public void s0(android.support.v4.media.session.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f587a.transact(3, obtain, obtain2, 0) || a.g2() == null) {
                        obtain2.readException();
                    } else {
                        a.g2().s0(aVar);
                    }
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
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0014a(iBinder) : (b) queryLocalInterface;
        }

        public static b g2() {
            return C0014a.f586b;
        }
    }

    void s0(android.support.v4.media.session.a aVar);
}
