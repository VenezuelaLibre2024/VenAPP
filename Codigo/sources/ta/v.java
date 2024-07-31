package ta;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzaj;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;

/* loaded from: classes2.dex */
public abstract class v extends zzb implements w {
    public v() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzaj zzb = zzai.zzb(parcel.readStrongBinder());
        zzc.zzc(parcel);
        I0(zzb);
        parcel2.writeNoException();
        return true;
    }
}
