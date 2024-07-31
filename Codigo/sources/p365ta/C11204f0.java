package p365ta;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
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
import ua.C11481c0;
import ua.C11488g;
import ua.C11498l;
import ua.C11502n;
import ua.C11510r;
import ua.C11514t;

/* renamed from: ta.f0 */
/* loaded from: classes2.dex */
public final class C11204f0 extends zza implements InterfaceC11195b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C11204f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: A1 */
    public final void mo35061A1(InterfaceC11218m0 interfaceC11218m0) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC11218m0);
        zzc(96, zza);
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: B0 */
    public final void mo35062B0(InterfaceC11215l interfaceC11215l) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC11215l);
        zzc(29, zza);
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: C */
    public final void mo35063C(InterfaceC11233z interfaceC11233z, InterfaceC5312b interfaceC5312b) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC11233z);
        zzc.zze(zza, interfaceC5312b);
        zzc(38, zza);
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: D1 */
    public final boolean mo35064D1() {
        Parcel zzJ = zzJ(40, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: F */
    public final void mo35065F(InterfaceC11211j interfaceC11211j) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC11211j);
        zzc(28, zza);
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: H0 */
    public final void mo35066H0(int i10, int i11, int i12, int i13) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeInt(i11);
        zza.writeInt(i12);
        zza.writeInt(i13);
        zzc(39, zza);
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: I */
    public final void mo35067I(InterfaceC11225r interfaceC11225r) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC11225r);
        zzc(31, zza);
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: L */
    public final void mo35068L(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzc(93, zza);
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: M1 */
    public final zzl mo35069M1(C11488g c11488g) {
        Parcel zza = zza();
        zzc.zzd(zza, c11488g);
        Parcel zzJ = zzJ(35, zza);
        zzl zzb = zzk.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: O0 */
    public final void mo35070O0(InterfaceC5312b interfaceC5312b) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5312b);
        zzc(4, zza);
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: O1 */
    public final void mo35071O1(InterfaceC11222o0 interfaceC11222o0) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC11222o0);
        zzc(89, zza);
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: Y */
    public final void mo35072Y(InterfaceC11207h interfaceC11207h) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC11207h);
        zzc(32, zza);
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: a2 */
    public final void mo35073a2(InterfaceC11230w interfaceC11230w) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC11230w);
        zzc(87, zza);
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: c0 */
    public final InterfaceC11199d mo35074c0() {
        InterfaceC11199d c11231x;
        Parcel zzJ = zzJ(26, zza());
        IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            c11231x = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            c11231x = queryLocalInterface instanceof InterfaceC11199d ? (InterfaceC11199d) queryLocalInterface : new C11231x(readStrongBinder);
        }
        zzJ.recycle();
        return c11231x;
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: c1 */
    public final boolean mo35075c1() {
        Parcel zzJ = zzJ(17, zza());
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: d0 */
    public final zzam mo35076d0(C11481c0 c11481c0) {
        Parcel zza = zza();
        zzc.zzd(zza, c11481c0);
        Parcel zzJ = zzJ(13, zza);
        zzam zzb = zzal.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: e1 */
    public final void mo35077e1(InterfaceC11223p interfaceC11223p) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC11223p);
        zzc(30, zza);
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: f0 */
    public final void mo35078f0(InterfaceC5312b interfaceC5312b) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5312b);
        zzc(5, zza);
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: h */
    public final zzad mo35079h(C11502n c11502n) {
        Parcel zza = zza();
        zzc.zzd(zza, c11502n);
        Parcel zzJ = zzJ(11, zza);
        zzad zzb = zzac.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: i1 */
    public final void mo35080i1(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzc(92, zza);
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: k0 */
    public final float mo35081k0() {
        Parcel zzJ = zzJ(2, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: k1 */
    public final void mo35082k1(InterfaceC11214k0 interfaceC11214k0) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC11214k0);
        zzc(97, zza);
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: l1 */
    public final boolean mo35083l1(C11498l c11498l) {
        Parcel zza = zza();
        zzc.zzd(zza, c11498l);
        Parcel zzJ = zzJ(91, zza);
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: n */
    public final void mo35084n(LatLngBounds latLngBounds) {
        Parcel zza = zza();
        zzc.zzd(zza, latLngBounds);
        zzc(95, zza);
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: o */
    public final zzaj mo35085o(C11514t c11514t) {
        Parcel zza = zza();
        zzc.zzd(zza, c11514t);
        Parcel zzJ = zzJ(9, zza);
        zzaj zzb = zzai.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: r */
    public final void mo35086r(InterfaceC11210i0 interfaceC11210i0) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC11210i0);
        zzc(99, zza);
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: s1 */
    public final void mo35087s1() {
        zzc(94, zza());
    }

    @Override // p365ta.InterfaceC11195b
    public final void setBuildingsEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(41, zza);
    }

    @Override // p365ta.InterfaceC11195b
    public final boolean setIndoorEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzJ = zzJ(20, zza);
        boolean zzf = zzc.zzf(zzJ);
        zzJ.recycle();
        return zzf;
    }

    @Override // p365ta.InterfaceC11195b
    public final void setMapType(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzc(16, zza);
    }

    @Override // p365ta.InterfaceC11195b
    public final void setMyLocationEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(22, zza);
    }

    @Override // p365ta.InterfaceC11195b
    public final void setTrafficEnabled(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(18, zza);
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: u0 */
    public final float mo35088u0() {
        Parcel zzJ = zzJ(3, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: w0 */
    public final void mo35089w0(InterfaceC11228u interfaceC11228u) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC11228u);
        zzc(85, zza);
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: y0 */
    public final zzag mo35090y0(C11510r c11510r) {
        Parcel zza = zza();
        zzc.zzd(zza, c11510r);
        Parcel zzJ = zzJ(10, zza);
        zzag zzb = zzaf.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: z */
    public final CameraPosition mo35091z() {
        Parcel zzJ = zzJ(1, zza());
        CameraPosition cameraPosition = (CameraPosition) zzc.zza(zzJ, CameraPosition.CREATOR);
        zzJ.recycle();
        return cameraPosition;
    }

    @Override // p365ta.InterfaceC11195b
    /* renamed from: z1 */
    public final InterfaceC11201e mo35092z1() {
        InterfaceC11201e c11194a0;
        Parcel zzJ = zzJ(25, zza());
        IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            c11194a0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            c11194a0 = queryLocalInterface instanceof InterfaceC11201e ? (InterfaceC11201e) queryLocalInterface : new C11194a0(readStrongBinder);
        }
        zzJ.recycle();
        return c11194a0;
    }
}
