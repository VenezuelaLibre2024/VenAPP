package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzed extends zzdf.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzcs zzd;
    private final /* synthetic */ zzdf zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzdf zzdfVar, String str, zzcs zzcsVar) {
        super(zzdfVar);
        this.zze = zzdfVar;
        this.zzc = str;
        this.zzd = zzcsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    final void zza() {
        zzcu zzcuVar;
        zzcuVar = this.zze.zzj;
        ((zzcu) s.j(zzcuVar)).getMaxUserProperties(this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    protected final void zzb() {
        this.zzd.zza((Bundle) null);
    }
}