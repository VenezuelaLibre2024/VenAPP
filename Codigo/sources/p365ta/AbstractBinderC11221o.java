package p365ta;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzac;
import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;

/* renamed from: ta.o */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC11221o extends zzb implements InterfaceC11223p {
    public AbstractBinderC11221o() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzad zzb = zzac.zzb(parcel.readStrongBinder());
        zzc.zzc(parcel);
        boolean mo33175a = mo33175a(zzb);
        parcel2.writeNoException();
        parcel2.writeInt(mo33175a ? 1 : 0);
        return true;
    }
}
