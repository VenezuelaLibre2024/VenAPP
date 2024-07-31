package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.measurement.zzdf;

/* loaded from: classes2.dex */
final class zzeq extends zzdf.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzdf.zzd zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeq(zzdf.zzd zzdVar, Activity activity) {
        super(zzdf.this);
        this.zzd = zzdVar;
        this.zzc = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    final void zza() {
        zzcu zzcuVar;
        zzcuVar = zzdf.this.zzj;
        ((zzcu) s.j(zzcuVar)).onActivityStarted(d.h2(this.zzc), this.zzb);
    }
}
