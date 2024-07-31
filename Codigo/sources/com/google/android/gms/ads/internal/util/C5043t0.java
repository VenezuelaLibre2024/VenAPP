package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;
import p101f9.C7316a;

/* renamed from: com.google.android.gms.ads.internal.util.t0 */
/* loaded from: classes.dex */
public final class C5043t0 extends zzayg implements InterfaceC5049v0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5043t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5049v0
    public final void zze(InterfaceC5312b interfaceC5312b) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5049v0
    public final boolean zzf(InterfaceC5312b interfaceC5312b, String str, String str2) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zza.writeString(str);
        zza.writeString(str2);
        Parcel zzbl = zzbl(1, zza);
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5049v0
    public final boolean zzg(InterfaceC5312b interfaceC5312b, C7316a c7316a) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zzayi.zzd(zza, c7316a);
        Parcel zzbl = zzbl(3, zza);
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }
}
