package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* renamed from: com.google.android.gms.ads.internal.client.f0 */
/* loaded from: classes.dex */
public final class C4819f0 extends zzayg implements InterfaceC4833h0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4819f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4833h0
    public final void zzc() {
        zzbm(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4833h0
    public final void zzd() {
        zzbm(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4833h0
    public final void zze(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4833h0
    public final void zzf(C4801c3 c4801c3) {
        Parcel zza = zza();
        zzayi.zzd(zza, c4801c3);
        zzbm(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4833h0
    public final void zzg() {
        zzbm(7, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4833h0
    public final void zzh() {
        zzbm(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4833h0
    public final void zzi() {
        zzbm(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4833h0
    public final void zzj() {
        zzbm(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4833h0
    public final void zzk() {
        zzbm(9, zza());
    }
}
