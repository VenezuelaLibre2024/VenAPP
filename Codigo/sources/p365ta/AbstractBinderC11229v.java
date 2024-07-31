package p365ta;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzaj;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;

/* renamed from: ta.v */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC11229v extends zzb implements InterfaceC11230w {
    public AbstractBinderC11229v() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzaj zzb = zzai.zzb(parcel.readStrongBinder());
        zzc.zzc(parcel);
        mo33187I0(zzb);
        parcel2.writeNoException();
        return true;
    }
}
