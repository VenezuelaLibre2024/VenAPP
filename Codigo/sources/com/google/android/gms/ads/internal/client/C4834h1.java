package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* renamed from: com.google.android.gms.ads.internal.client.h1 */
/* loaded from: classes.dex */
public final class C4834h1 extends zzayg implements InterfaceC4848j1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4834h1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4848j1
    public final void zzb() {
        zzbm(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4848j1
    public final void zzc() {
        zzbm(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4848j1
    public final void zzd(C4801c3 c4801c3) {
        Parcel zza = zza();
        zzayi.zzd(zza, c4801c3);
        zzbm(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4848j1
    public final void zze() {
        zzbm(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4848j1
    public final void zzf() {
        zzbm(2, zza());
    }
}
