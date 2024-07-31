package ta;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzk;
import com.google.android.gms.internal.maps.zzl;

/* loaded from: classes2.dex */
public abstract class n0 extends zzb implements o0 {
    public n0() {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzl zzb = zzk.zzb(parcel.readStrongBinder());
        zzc.zzc(parcel);
        K1(zzb);
        parcel2.writeNoException();
        return true;
    }
}
