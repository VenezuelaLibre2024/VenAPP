package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.d1;

/* loaded from: classes2.dex */
final class zzbmu implements zzgej {
    final /* synthetic */ zzcjk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmu(zzcjk zzcjkVar) {
        this.zza = zzcjkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        t.q().zzw(th2, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcjk zzcjkVar = this.zza;
        new d1(zzcjkVar.getContext(), zzcjkVar.zzn().zza, (String) obj).zzb();
    }
}
