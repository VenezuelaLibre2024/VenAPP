package p365ta;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;

/* renamed from: ta.g0 */
/* loaded from: classes2.dex */
public final class C11206g0 extends zza implements InterfaceC11197c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C11206g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // p365ta.InterfaceC11197c
    /* renamed from: T0 */
    public final void mo35097T0(InterfaceC11219n interfaceC11219n) {
        Parcel zza = zza();
        zzc.zze(zza, interfaceC11219n);
        zzc(9, zza);
    }

    @Override // p365ta.InterfaceC11197c
    public final InterfaceC5312b getView() {
        Parcel zzJ = zzJ(8, zza());
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzJ.readStrongBinder());
        zzJ.recycle();
        return m13410f2;
    }

    @Override // p365ta.InterfaceC11197c
    public final void onCreate(Bundle bundle) {
        Parcel zza = zza();
        zzc.zzd(zza, bundle);
        zzc(2, zza);
    }

    @Override // p365ta.InterfaceC11197c
    public final void onDestroy() {
        zzc(5, zza());
    }

    @Override // p365ta.InterfaceC11197c
    public final void onResume() {
        zzc(3, zza());
    }

    @Override // p365ta.InterfaceC11197c
    public final void onSaveInstanceState(Bundle bundle) {
        Parcel zza = zza();
        zzc.zzd(zza, bundle);
        Parcel zzJ = zzJ(7, zza);
        if (zzJ.readInt() != 0) {
            bundle.readFromParcel(zzJ);
        }
        zzJ.recycle();
    }

    @Override // p365ta.InterfaceC11197c
    public final void onStart() {
        zzc(12, zza());
    }

    @Override // p365ta.InterfaceC11197c
    public final void onStop() {
        zzc(13, zza());
    }
}
