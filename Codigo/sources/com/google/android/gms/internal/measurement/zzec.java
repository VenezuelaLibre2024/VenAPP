package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.s;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzec extends zzdf.zza {
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ zzdf zzh;
    private final /* synthetic */ int zzc = 5;
    private final /* synthetic */ Object zzf = null;
    private final /* synthetic */ Object zzg = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(zzdf zzdfVar, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.zzh = zzdfVar;
        this.zzd = str;
        this.zze = obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    final void zza() {
        zzcu zzcuVar;
        zzcuVar = this.zzh.zzj;
        ((zzcu) s.j(zzcuVar)).logHealthData(this.zzc, this.zzd, d.h2(this.zze), d.h2(null), d.h2(null));
    }
}
