package gd;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: gd.h */
/* loaded from: classes.dex */
public interface InterfaceC7552h extends IInterface {

    /* renamed from: gd.h$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC7552h {
        public a() {
            attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                mo22926R0(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? C7545a.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                mo22925N1(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? C7554j.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
            return true;
        }
    }

    /* renamed from: N1 */
    void mo22925N1(Status status, C7554j c7554j);

    /* renamed from: R0 */
    void mo22926R0(Status status, C7545a c7545a);
}
