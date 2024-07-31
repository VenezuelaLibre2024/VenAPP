package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfhs implements zzgej {
    final /* synthetic */ zzfht zza;
    final /* synthetic */ int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhs(zzfht zzfhtVar, int i10) {
        this.zzb = i10;
        this.zza = zzfhtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        t.q().zzw(th2, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i10 = this.zzb;
        this.zza.zzb((String) obj, i10);
    }
}
