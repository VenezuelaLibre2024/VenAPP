package p365ta;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzaf;
import com.google.android.gms.internal.maps.zzag;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;

/* renamed from: ta.t */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC11227t extends zzb implements InterfaceC11228u {
    public AbstractBinderC11227t() {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzag zzb = zzaf.zzb(parcel.readStrongBinder());
        zzc.zzc(parcel);
        mo33186w1(zzb);
        parcel2.writeNoException();
        return true;
    }
}
