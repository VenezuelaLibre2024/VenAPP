package p365ta;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.LatLng;
import ua.C11485e0;

/* renamed from: ta.x */
/* loaded from: classes2.dex */
public final class C11231x extends zza implements InterfaceC11199d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C11231x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // p365ta.InterfaceC11199d
    /* renamed from: G */
    public final C11485e0 mo35103G() {
        Parcel zzJ = zzJ(3, zza());
        C11485e0 c11485e0 = (C11485e0) zzc.zza(zzJ, C11485e0.CREATOR);
        zzJ.recycle();
        return c11485e0;
    }

    @Override // p365ta.InterfaceC11199d
    /* renamed from: h0 */
    public final LatLng mo35104h0(InterfaceC5312b interfaceC5312b) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5312b);
        Parcel zzJ = zzJ(1, zza);
        LatLng latLng = (LatLng) zzc.zza(zzJ, LatLng.CREATOR);
        zzJ.recycle();
        return latLng;
    }

    @Override // p365ta.InterfaceC11199d
    /* renamed from: y */
    public final InterfaceC5312b mo35105y(LatLng latLng) {
        Parcel zza = zza();
        zzc.zzd(zza, latLng);
        Parcel zzJ = zzJ(2, zza);
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return m13410f2;
    }
}
