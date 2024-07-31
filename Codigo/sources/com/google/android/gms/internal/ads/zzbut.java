package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public final class zzbut extends zzayg implements zzbuv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbut(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbm(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final void zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final void zzg(c3 c3Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, c3Var);
        zzbm(3, zza);
    }
}
