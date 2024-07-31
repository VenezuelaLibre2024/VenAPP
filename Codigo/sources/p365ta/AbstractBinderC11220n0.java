package p365ta;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzk;
import com.google.android.gms.internal.maps.zzl;

/* renamed from: ta.n0 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC11220n0 extends zzb implements InterfaceC11222o0 {
    public AbstractBinderC11220n0() {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzl zzb = zzk.zzb(parcel.readStrongBinder());
        zzc.zzc(parcel);
        mo33185K1(zzb);
        parcel2.writeNoException();
        return true;
    }
}
