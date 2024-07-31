package ta;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;

/* loaded from: classes2.dex */
public final class g0 extends zza implements c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // ta.c
    public final void T0(n nVar) {
        Parcel zza = zza();
        zzc.zze(zza, nVar);
        zzc(9, zza);
    }

    @Override // ta.c
    public final com.google.android.gms.dynamic.b getView() {
        Parcel zzJ = zzJ(8, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }

    @Override // ta.c
    public final void onCreate(Bundle bundle) {
        Parcel zza = zza();
        zzc.zzd(zza, bundle);
        zzc(2, zza);
    }

    @Override // ta.c
    public final void onDestroy() {
        zzc(5, zza());
    }

    @Override // ta.c
    public final void onResume() {
        zzc(3, zza());
    }

    @Override // ta.c
    public final void onSaveInstanceState(Bundle bundle) {
        Parcel zza = zza();
        zzc.zzd(zza, bundle);
        Parcel zzJ = zzJ(7, zza);
        if (zzJ.readInt() != 0) {
            bundle.readFromParcel(zzJ);
        }
        zzJ.recycle();
    }

    @Override // ta.c
    public final void onStart() {
        zzc(12, zza());
    }

    @Override // ta.c
    public final void onStop() {
        zzc(13, zza());
    }
}
