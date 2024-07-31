package p365ta;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: ta.s */
/* loaded from: classes2.dex */
public final class C11226s extends zza implements InterfaceC11193a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C11226s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // p365ta.InterfaceC11193a
    /* renamed from: L0 */
    public final InterfaceC5312b mo35046L0(LatLng latLng) {
        Parcel zza = zza();
        zzc.zzd(zza, latLng);
        Parcel zzJ = zzJ(8, zza);
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return m13410f2;
    }

    @Override // p365ta.InterfaceC11193a
    /* renamed from: U */
    public final InterfaceC5312b mo35047U(CameraPosition cameraPosition) {
        Parcel zza = zza();
        zzc.zzd(zza, cameraPosition);
        Parcel zzJ = zzJ(7, zza);
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return m13410f2;
    }

    @Override // p365ta.InterfaceC11193a
    /* renamed from: e */
    public final InterfaceC5312b mo35048e(LatLngBounds latLngBounds, int i10) {
        Parcel zza = zza();
        zzc.zzd(zza, latLngBounds);
        zza.writeInt(i10);
        Parcel zzJ = zzJ(10, zza);
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return m13410f2;
    }

    @Override // p365ta.InterfaceC11193a
    /* renamed from: f1 */
    public final InterfaceC5312b mo35049f1(float f10, int i10, int i11) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zza.writeInt(i10);
        zza.writeInt(i11);
        Parcel zzJ = zzJ(6, zza);
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return m13410f2;
    }

    @Override // p365ta.InterfaceC11193a
    /* renamed from: i0 */
    public final InterfaceC5312b mo35050i0(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        Parcel zzJ = zzJ(4, zza);
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return m13410f2;
    }

    @Override // p365ta.InterfaceC11193a
    /* renamed from: m0 */
    public final InterfaceC5312b mo35051m0(LatLng latLng, float f10) {
        Parcel zza = zza();
        zzc.zzd(zza, latLng);
        zza.writeFloat(f10);
        Parcel zzJ = zzJ(9, zza);
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return m13410f2;
    }

    @Override // p365ta.InterfaceC11193a
    /* renamed from: n0 */
    public final InterfaceC5312b mo35052n0(float f10, float f11) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zza.writeFloat(f11);
        Parcel zzJ = zzJ(3, zza);
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return m13410f2;
    }

    @Override // p365ta.InterfaceC11193a
    public final InterfaceC5312b zoomBy(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        Parcel zzJ = zzJ(5, zza);
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return m13410f2;
    }

    @Override // p365ta.InterfaceC11193a
    public final InterfaceC5312b zoomIn() {
        Parcel zzJ = zzJ(1, zza());
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return m13410f2;
    }

    @Override // p365ta.InterfaceC11193a
    public final InterfaceC5312b zoomOut() {
        Parcel zzJ = zzJ(2, zza());
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return m13410f2;
    }
}
