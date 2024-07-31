package p365ta;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;

/* renamed from: ta.a0 */
/* loaded from: classes2.dex */
public final class C11194a0 extends zza implements InterfaceC11201e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C11194a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override // p365ta.InterfaceC11201e
    /* renamed from: E */
    public final boolean mo35053E() {
        Parcel zzJ = zzJ(11, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p365ta.InterfaceC11201e
    /* renamed from: J0 */
    public final boolean mo35054J0() {
        Parcel zzJ = zzJ(14, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p365ta.InterfaceC11201e
    /* renamed from: K0 */
    public final boolean mo35055K0() {
        Parcel zzJ = zzJ(13, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p365ta.InterfaceC11201e
    /* renamed from: Q1 */
    public final boolean mo35056Q1() {
        Parcel zzJ = zzJ(12, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p365ta.InterfaceC11201e
    /* renamed from: X0 */
    public final boolean mo35057X0() {
        Parcel zzJ = zzJ(10, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p365ta.InterfaceC11201e
    /* renamed from: m1 */
    public final boolean mo35058m1() {
        Parcel zzJ = zzJ(19, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p365ta.InterfaceC11201e
    /* renamed from: p0 */
    public final boolean mo35059p0() {
        Parcel zzJ = zzJ(9, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p365ta.InterfaceC11201e
    public final void setCompassEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(2, zza);
    }

    @Override // p365ta.InterfaceC11201e
    public final void setMapToolbarEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(18, zza);
    }

    @Override // p365ta.InterfaceC11201e
    public final void setMyLocationButtonEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(3, zza);
    }

    @Override // p365ta.InterfaceC11201e
    public final void setRotateGesturesEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(7, zza);
    }

    @Override // p365ta.InterfaceC11201e
    public final void setScrollGesturesEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(4, zza);
    }

    @Override // p365ta.InterfaceC11201e
    public final void setTiltGesturesEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(6, zza);
    }

    @Override // p365ta.InterfaceC11201e
    public final void setZoomControlsEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(1, zza);
    }

    @Override // p365ta.InterfaceC11201e
    public final void setZoomGesturesEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(5, zza);
    }

    @Override // p365ta.InterfaceC11201e
    /* renamed from: z0 */
    public final boolean mo35060z0() {
        Parcel zzJ = zzJ(15, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }
}
