package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public final class zzbuh extends zzayg implements zzbuj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbuh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbm(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzf(c3 c3Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, c3Var);
        zzbm(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzg() {
        zzbm(2, zza());
    }
}
