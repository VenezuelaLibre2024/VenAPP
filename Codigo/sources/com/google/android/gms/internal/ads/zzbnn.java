package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzbnn implements zzgej {
    final /* synthetic */ com.google.android.gms.ads.internal.client.a zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbnr zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnn(zzbnr zzbnrVar, com.google.android.gms.ads.internal.client.a aVar, Map map, String str) {
        this.zza = aVar;
        this.zzb = map;
        this.zzc = str;
        this.zzd = zzbnrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        t.q().zzw(th2, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        com.google.android.gms.ads.internal.client.a aVar = this.zza;
        Map map = this.zzb;
        String str = this.zzc;
        this.zzd.zzh((String) obj, aVar, map, str);
    }
}
