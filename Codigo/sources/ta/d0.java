package ta;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzh;
import com.google.android.gms.internal.maps.zzi;
import com.google.android.gms.maps.GoogleMapOptions;

/* loaded from: classes2.dex */
public final class d0 extends zza implements e0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // ta.e0
    public final c B1(com.google.android.gms.dynamic.b bVar, GoogleMapOptions googleMapOptions) {
        c g0Var;
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zzc.zzd(zza, googleMapOptions);
        Parcel zzJ = zzJ(3, zza);
        IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            g0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            g0Var = queryLocalInterface instanceof c ? (c) queryLocalInterface : new g0(readStrongBinder);
        }
        zzJ.recycle();
        return g0Var;
    }

    @Override // ta.e0
    public final void G0(com.google.android.gms.dynamic.b bVar, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeInt(i10);
        zzc(10, zza);
    }

    @Override // ta.e0
    public final int zzd() {
        Parcel zzJ = zzJ(9, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // ta.e0
    public final a zze() {
        a sVar;
        Parcel zzJ = zzJ(4, zza());
        IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            sVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            sVar = queryLocalInterface instanceof a ? (a) queryLocalInterface : new s(readStrongBinder);
        }
        zzJ.recycle();
        return sVar;
    }

    @Override // ta.e0
    public final zzi zzj() {
        Parcel zzJ = zzJ(5, zza());
        zzi zzb = zzh.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // ta.e0
    public final void zzk(com.google.android.gms.dynamic.b bVar, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeInt(18020000);
        zzc(6, zza);
    }

    @Override // ta.e0
    public final void zzm(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zzc(11, zza);
    }
}
