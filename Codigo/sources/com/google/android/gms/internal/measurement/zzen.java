package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.s;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzen extends zzdf.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ boolean zzf;
    private final /* synthetic */ zzdf zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzen(zzdf zzdfVar, String str, String str2, Object obj, boolean z10) {
        super(zzdfVar);
        this.zzg = zzdfVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = obj;
        this.zzf = z10;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    final void zza() {
        zzcu zzcuVar;
        zzcuVar = this.zzg.zzj;
        ((zzcu) s.j(zzcuVar)).setUserProperty(this.zzc, this.zzd, d.h2(this.zze), this.zzf, this.zza);
    }
}
