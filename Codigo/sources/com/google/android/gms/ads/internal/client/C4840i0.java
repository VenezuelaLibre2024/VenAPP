package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* renamed from: com.google.android.gms.ads.internal.client.i0 */
/* loaded from: classes.dex */
public final class C4840i0 extends zzayg implements InterfaceC4853k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4840i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4853k0
    public final void zzb(C4801c3 c4801c3) {
        Parcel zza = zza();
        zzayi.zzd(zza, c4801c3);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4853k0
    public final void zzc() {
        zzbm(1, zza());
    }
}
