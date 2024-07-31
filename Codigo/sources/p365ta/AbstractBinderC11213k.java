package p365ta;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: ta.k */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC11213k extends zzb implements InterfaceC11215l {
    public AbstractBinderC11213k() {
        super("com.google.android.gms.maps.internal.IOnMapLongClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        LatLng latLng = (LatLng) zzc.zza(parcel, LatLng.CREATOR);
        zzc.zzc(parcel);
        mo33176b(latLng);
        parcel2.writeNoException();
        return true;
    }
}
