package ta;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzac;
import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.internal.maps.zzaf;
import com.google.android.gms.internal.maps.zzag;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzaj;
import com.google.android.gms.internal.maps.zzal;
import com.google.android.gms.internal.maps.zzam;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzk;
import com.google.android.gms.internal.maps.zzl;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes2.dex */
public final class f0 extends zza implements b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // ta.b
    public final void A1(m0 m0Var) {
        Parcel zza = zza();
        zzc.zze(zza, m0Var);
        zzc(96, zza);
    }

    @Override // ta.b
    public final void B0(l lVar) {
        Parcel zza = zza();
        zzc.zze(zza, lVar);
        zzc(29, zza);
    }

    @Override // ta.b
    public final void C(z zVar, com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzc.zze(zza, zVar);
        zzc.zze(zza, bVar);
        zzc(38, zza);
    }

    @Override // ta.b
    public final boolean D1() {
        Parcel zzJ = zzJ(40, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // ta.b
    public final void F(j jVar) {
        Parcel zza = zza();
        zzc.zze(zza, jVar);
        zzc(28, zza);
    }

    @Override // ta.b
    public final void H0(int i10, int i11, int i12, int i13) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeInt(i11);
        zza.writeInt(i12);
        zza.writeInt(i13);
        zzc(39, zza);
    }

    @Override // ta.b
    public final void I(r rVar) {
        Parcel zza = zza();
        zzc.zze(zza, rVar);
        zzc(31, zza);
    }

    @Override // ta.b
    public final void L(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzc(93, zza);
    }

    @Override // ta.b
    public final zzl M1(ua.g gVar) {
        Parcel zza = zza();
        zzc.zzd(zza, gVar);
        Parcel zzJ = zzJ(35, zza);
        zzl zzb = zzk.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // ta.b
    public final void O0(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zzc(4, zza);
    }

    @Override // ta.b
    public final void O1(o0 o0Var) {
        Parcel zza = zza();
        zzc.zze(zza, o0Var);
        zzc(89, zza);
    }

    @Override // ta.b
    public final void Y(h hVar) {
        Parcel zza = zza();
        zzc.zze(zza, hVar);
        zzc(32, zza);
    }

    @Override // ta.b
    public final void a2(w wVar) {
        Parcel zza = zza();
        zzc.zze(zza, wVar);
        zzc(87, zza);
    }

    @Override // ta.b
    public final d c0() {
        d xVar;
        Parcel zzJ = zzJ(26, zza());
        IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            xVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            xVar = queryLocalInterface instanceof d ? (d) queryLocalInterface : new x(readStrongBinder);
        }
        zzJ.recycle();
        return xVar;
    }

    @Override // ta.b
    public final boolean c1() {
        Parcel zzJ = zzJ(17, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // ta.b
    public final zzam d0(ua.c0 c0Var) {
        Parcel zza = zza();
        zzc.zzd(zza, c0Var);
        Parcel zzJ = zzJ(13, zza);
        zzam zzb = zzal.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // ta.b
    public final void e1(p pVar) {
        Parcel zza = zza();
        zzc.zze(zza, pVar);
        zzc(30, zza);
    }

    @Override // ta.b
    public final void f0(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zzc(5, zza);
    }

    @Override // ta.b
    public final zzad h(ua.n nVar) {
        Parcel zza = zza();
        zzc.zzd(zza, nVar);
        Parcel zzJ = zzJ(11, zza);
        zzad zzb = zzac.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // ta.b
    public final void i1(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzc(92, zza);
    }

    @Override // ta.b
    public final float k0() {
        Parcel zzJ = zzJ(2, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // ta.b
    public final void k1(k0 k0Var) {
        Parcel zza = zza();
        zzc.zze(zza, k0Var);
        zzc(97, zza);
    }

    @Override // ta.b
    public final boolean l1(ua.l lVar) {
        Parcel zza = zza();
        zzc.zzd(zza, lVar);
        Parcel zzJ = zzJ(91, zza);
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // ta.b
    public final void n(LatLngBounds latLngBounds) {
        Parcel zza = zza();
        zzc.zzd(zza, latLngBounds);
        zzc(95, zza);
    }

    @Override // ta.b
    public final zzaj o(ua.t tVar) {
        Parcel zza = zza();
        zzc.zzd(zza, tVar);
        Parcel zzJ = zzJ(9, zza);
        zzaj zzb = zzai.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // ta.b
    public final void r(i0 i0Var) {
        Parcel zza = zza();
        zzc.zze(zza, i0Var);
        zzc(99, zza);
    }

    @Override // ta.b
    public final void s1() {
        zzc(94, zza());
    }

    @Override // ta.b
    public final void setBuildingsEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(41, zza);
    }

    @Override // ta.b
    public final boolean setIndoorEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzJ = zzJ(20, zza);
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // ta.b
    public final void setMapType(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzc(16, zza);
    }

    @Override // ta.b
    public final void setMyLocationEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(22, zza);
    }

    @Override // ta.b
    public final void setTrafficEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(18, zza);
    }

    @Override // ta.b
    public final float u0() {
        Parcel zzJ = zzJ(3, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // ta.b
    public final void w0(u uVar) {
        Parcel zza = zza();
        zzc.zze(zza, uVar);
        zzc(85, zza);
    }

    @Override // ta.b
    public final zzag y0(ua.r rVar) {
        Parcel zza = zza();
        zzc.zzd(zza, rVar);
        Parcel zzJ = zzJ(10, zza);
        zzag zzb = zzaf.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // ta.b
    public final CameraPosition z() {
        Parcel zzJ = zzJ(1, zza());
        CameraPosition cameraPosition = (CameraPosition) zzc.zza(zzJ, CameraPosition.CREATOR);
        zzJ.recycle();
        return cameraPosition;
    }

    @Override // ta.b
    public final e z1() {
        e a0Var;
        Parcel zzJ = zzJ(25, zza());
        IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            a0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            a0Var = queryLocalInterface instanceof e ? (e) queryLocalInterface : new a0(readStrongBinder);
        }
        zzJ.recycle();
        return a0Var;
    }
}
