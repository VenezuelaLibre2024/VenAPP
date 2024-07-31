package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.media.session.b */
/* loaded from: classes.dex */
public interface InterfaceC0169b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC0169b {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C13152a implements InterfaceC0169b {

            /* renamed from: b */
            public static InterfaceC0169b f651b;

            /* renamed from: a */
            private IBinder f652a;

            C13152a(IBinder iBinder) {
                this.f652a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f652a;
            }

            @Override // android.support.v4.media.session.InterfaceC0169b
            /* renamed from: s0 */
            public void mo767s0(InterfaceC0168a interfaceC0168a) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(interfaceC0168a != null ? interfaceC0168a.asBinder() : null);
                    if (this.f652a.transact(3, obtain, obtain2, 0) || a.m769g2() == null) {
                        obtain2.readException();
                    } else {
                        a.m769g2().mo767s0(interfaceC0168a);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: f2 */
        public static InterfaceC0169b m768f2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0169b)) ? new C13152a(iBinder) : (InterfaceC0169b) queryLocalInterface;
        }

        /* renamed from: g2 */
        public static InterfaceC0169b m769g2() {
            return C13152a.f651b;
        }
    }

    /* renamed from: s0 */
    void mo767s0(InterfaceC0168a interfaceC0168a);
}
