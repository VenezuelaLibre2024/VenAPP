package ta;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzac;
import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;

/* loaded from: classes2.dex */
public abstract class q extends zzb implements r {
    public q() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzad zzb = zzac.zzb(parcel.readStrongBinder());
            zzc.zzc(parcel);
            G1(zzb);
        } else if (i10 == 2) {
            zzad zzb2 = zzac.zzb(parcel.readStrongBinder());
            zzc.zzc(parcel);
            a(zzb2);
        } else {
            if (i10 != 3) {
                return false;
            }
            zzad zzb3 = zzac.zzb(parcel.readStrongBinder());
            zzc.zzc(parcel);
            B(zzb3);
        }
        parcel2.writeNoException();
        return true;
    }
}