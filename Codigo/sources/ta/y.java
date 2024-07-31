package ta;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;

/* loaded from: classes2.dex */
public abstract class y extends zzb implements z {
    public y() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Bitmap bitmap = (Bitmap) zzc.zza(parcel, Bitmap.CREATOR);
            zzc.zzc(parcel);
            Q0(bitmap);
        } else {
            if (i10 != 2) {
                return false;
            }
            com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
            zzc.zzc(parcel);
            zzc(f22);
        }
        parcel2.writeNoException();
        return true;
    }
}
