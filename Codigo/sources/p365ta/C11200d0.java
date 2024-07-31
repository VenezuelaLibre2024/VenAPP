package p365ta;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzh;
import com.google.android.gms.internal.maps.zzi;
import com.google.android.gms.maps.GoogleMapOptions;

/* renamed from: ta.d0 */
/* loaded from: classes2.dex */
public final class C11200d0 extends zza implements InterfaceC11202e0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C11200d0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // p365ta.InterfaceC11202e0
    /* renamed from: B1 */
    public final InterfaceC11197c mo35106B1(InterfaceC5312b interfaceC5312b, GoogleMapOptions googleMapOptions) {
        InterfaceC11197c c11206g0;
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5312b);
        zzc.zzd(zza, googleMapOptions);
        Parcel zzJ = zzJ(3, zza);
        IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            c11206g0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            c11206g0 = queryLocalInterface instanceof InterfaceC11197c ? (InterfaceC11197c) queryLocalInterface : new C11206g0(readStrongBinder);
        }
        zzJ.recycle();
        return c11206g0;
    }

    @Override // p365ta.InterfaceC11202e0
    /* renamed from: G0 */
    public final void mo35107G0(InterfaceC5312b interfaceC5312b, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5312b);
        zza.writeInt(i10);
        zzc(10, zza);
    }

    @Override // p365ta.InterfaceC11202e0
    public final int zzd() {
        Parcel zzJ = zzJ(9, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // p365ta.InterfaceC11202e0
    public final InterfaceC11193a zze() {
        InterfaceC11193a c11226s;
        Parcel zzJ = zzJ(4, zza());
        IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            c11226s = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            c11226s = queryLocalInterface instanceof InterfaceC11193a ? (InterfaceC11193a) queryLocalInterface : new C11226s(readStrongBinder);
        }
        zzJ.recycle();
        return c11226s;
    }

    @Override // p365ta.InterfaceC11202e0
    public final zzi zzj() {
        Parcel zzJ = zzJ(5, zza());
        zzi zzb = zzh.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // p365ta.InterfaceC11202e0
    public final void zzk(InterfaceC5312b interfaceC5312b, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5312b);
        zza.writeInt(18020000);
        zzc(6, zza);
    }

    @Override // p365ta.InterfaceC11202e0
    public final void zzm(InterfaceC5312b interfaceC5312b) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC5312b);
        zzc(11, zza);
    }
}
