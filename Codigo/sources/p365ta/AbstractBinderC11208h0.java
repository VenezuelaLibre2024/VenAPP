package p365ta;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* renamed from: ta.h0 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC11208h0 extends zzb implements InterfaceC11210i0 {
    public AbstractBinderC11208h0() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}