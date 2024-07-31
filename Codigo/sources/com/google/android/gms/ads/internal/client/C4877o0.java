package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbkt;
import com.google.android.gms.internal.ads.zzbla;

/* renamed from: com.google.android.gms.ads.internal.client.o0 */
/* loaded from: classes.dex */
public final class C4877o0 extends zzayg implements InterfaceC4889q0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4877o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4889q0
    public final InterfaceC4871n0 zze() {
        InterfaceC4871n0 c4859l0;
        Parcel zzbl = zzbl(1, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            c4859l0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            c4859l0 = queryLocalInterface instanceof InterfaceC4871n0 ? (InterfaceC4871n0) queryLocalInterface : new C4859l0(readStrongBinder);
        }
        zzbl.recycle();
        return c4859l0;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4889q0
    public final void zzh(String str, zzbkt zzbktVar, zzbkq zzbkqVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzayi.zzf(zza, zzbktVar);
        zzayi.zzf(zza, zzbkqVar);
        zzbm(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4889q0
    public final void zzk(zzbla zzblaVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzblaVar);
        zzbm(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4889q0
    public final void zzl(InterfaceC4833h0 interfaceC4833h0) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC4833h0);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4889q0
    public final void zzo(zzbjb zzbjbVar) {
        Parcel zza = zza();
        zzayi.zzd(zza, zzbjbVar);
        zzbm(6, zza);
    }
}
