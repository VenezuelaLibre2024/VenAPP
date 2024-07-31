package ta;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes2.dex */
public final class s extends zza implements a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // ta.a
    public final com.google.android.gms.dynamic.b L0(LatLng latLng) {
        Parcel zza = zza();
        zzc.zzd(zza, latLng);
        Parcel zzJ = zzJ(8, zza);
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }

    @Override // ta.a
    public final com.google.android.gms.dynamic.b U(CameraPosition cameraPosition) {
        Parcel zza = zza();
        zzc.zzd(zza, cameraPosition);
        Parcel zzJ = zzJ(7, zza);
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }

    @Override // ta.a
    public final com.google.android.gms.dynamic.b e(LatLngBounds latLngBounds, int i10) {
        Parcel zza = zza();
        zzc.zzd(zza, latLngBounds);
        zza.writeInt(i10);
        Parcel zzJ = zzJ(10, zza);
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }

    @Override // ta.a
    public final com.google.android.gms.dynamic.b f1(float f10, int i10, int i11) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zza.writeInt(i10);
        zza.writeInt(i11);
        Parcel zzJ = zzJ(6, zza);
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }

    @Override // ta.a
    public final com.google.android.gms.dynamic.b i0(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        Parcel zzJ = zzJ(4, zza);
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }

    @Override // ta.a
    public final com.google.android.gms.dynamic.b m0(LatLng latLng, float f10) {
        Parcel zza = zza();
        zzc.zzd(zza, latLng);
        zza.writeFloat(f10);
        Parcel zzJ = zzJ(9, zza);
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }

    @Override // ta.a
    public final com.google.android.gms.dynamic.b n0(float f10, float f11) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zza.writeFloat(f11);
        Parcel zzJ = zzJ(3, zza);
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }

    @Override // ta.a
    public final com.google.android.gms.dynamic.b zoomBy(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        Parcel zzJ = zzJ(5, zza);
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }

    @Override // ta.a
    public final com.google.android.gms.dynamic.b zoomIn() {
        Parcel zzJ = zzJ(1, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }

    @Override // ta.a
    public final com.google.android.gms.dynamic.b zoomOut() {
        Parcel zzJ = zzJ(2, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return f22;
    }
}
