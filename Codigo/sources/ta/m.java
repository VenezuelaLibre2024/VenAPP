package ta;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;

/* loaded from: classes2.dex */
public abstract class m extends zzb implements n {
    public m() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        b f0Var;
        if (i10 != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            f0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            f0Var = queryLocalInterface instanceof b ? (b) queryLocalInterface : new f0(readStrongBinder);
        }
        zzc.zzc(parcel);
        F1(f0Var);
        parcel2.writeNoException();
        return true;
    }
}
