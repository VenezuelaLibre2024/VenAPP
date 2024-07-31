package p365ta;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;

/* renamed from: ta.m */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC11217m extends zzb implements InterfaceC11219n {
    public AbstractBinderC11217m() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC11195b c11204f0;
        if (i10 != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c11204f0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            c11204f0 = queryLocalInterface instanceof InterfaceC11195b ? (InterfaceC11195b) queryLocalInterface : new C11204f0(readStrongBinder);
        }
        zzc.zzc(parcel);
        mo33177F1(c11204f0);
        parcel2.writeNoException();
        return true;
    }
}
