package ta;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes2.dex */
public final class x extends zza implements d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // ta.d
    public final ua.e0 G() {
        Parcel zzJ = zzJ(3, zza());
        ua.e0 e0Var = (ua.e0) zzc.zza(zzJ, ua.e0.CREATOR);
        zzJ.recycle();
        return e0Var;
    }

    @Override // ta.d
    public final LatLng h0(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        Parcel zzJ = zzJ(1, zza);
        LatLng latLng = (LatLng) zzc.zza(zzJ, LatLng.CREATOR);
        zzJ.recycle();
        return latLng;
    }

    @Override // ta.d
    public final com.google.android.gms.dynamic.b y(LatLng latLng) {
        Parcel zza = zza();
        zzc.zzd(zza, latLng);
        Parcel zzJ = zzJ(2, zza);
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }
}
