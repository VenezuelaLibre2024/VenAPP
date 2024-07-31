package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.d0;

/* loaded from: classes2.dex */
public final class zzedv extends zzbyw {
    final /* synthetic */ zzedw zza;

    public zzedv(zzedw zzedwVar) {
        this.zza = zzedwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    public final void zze(d0 d0Var) {
        this.zza.zza.zzd(d0Var.u1());
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzc(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
