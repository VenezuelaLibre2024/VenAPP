package com.google.android.gms.internal.ads;

import g9.f0;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbnp implements f0 {
    boolean zza = false;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.client.a zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ Map zze;

    public zzbnp(zzbnr zzbnrVar, boolean z10, com.google.android.gms.ads.internal.client.a aVar, Map map, Map map2) {
        this.zzb = z10;
        this.zzc = aVar;
        this.zzd = map;
        this.zze = map2;
    }

    @Override // g9.f0
    public final void zza(boolean z10) {
        if (this.zza) {
            return;
        }
        if (z10 && this.zzb) {
            ((zzdiu) this.zzc).zzs();
        }
        this.zza = true;
        this.zzd.put((String) this.zze.get("event_id"), Boolean.valueOf(z10));
        ((zzbqa) this.zzc).zzd("openIntentAsync", this.zzd);
    }

    @Override // g9.f0
    public final void zzb(int i10) {
    }
}
