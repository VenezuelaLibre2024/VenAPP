package p365ta;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: ta.i */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC11209i extends zzb implements InterfaceC11211j {
    public AbstractBinderC11209i() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        LatLng latLng = (LatLng) zzc.zza(parcel, LatLng.CREATOR);
        zzc.zzc(parcel);
        mo33189b(latLng);
        parcel2.writeNoException();
        return true;
    }
}
