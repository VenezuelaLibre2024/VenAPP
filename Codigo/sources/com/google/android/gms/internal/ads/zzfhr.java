package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.t;

/* loaded from: classes2.dex */
final class zzfhr implements zzgej {
    final /* synthetic */ zzcjk zza;
    final /* synthetic */ zzcse zzb;
    final /* synthetic */ zzfny zzc;
    final /* synthetic */ zzehh zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhr(zzcjk zzcjkVar, zzcse zzcseVar, zzfny zzfnyVar, zzehh zzehhVar) {
        this.zza = zzcjkVar;
        this.zzb = zzcseVar;
        this.zzc = zzfnyVar;
        this.zzd = zzehhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (!this.zza.zzD().zzaj) {
            if (((Boolean) a0.c().zza(zzbgc.zzjL)).booleanValue() && this.zzb != null && zzcse.zzh(str)) {
                this.zzb.zzg(str, this.zzc, x.e());
                return;
            } else {
                this.zzc.zzc(str, null);
                return;
            }
        }
        long a10 = t.b().a();
        String str2 = this.zza.zzP().zzb;
        int i10 = 2;
        if (!t.q().zzz(this.zza.getContext())) {
            if (!((Boolean) a0.c().zza(zzbgc.zzgo)).booleanValue() || !this.zza.zzD().zzT) {
                i10 = 1;
            }
        }
        this.zzd.zzd(new zzehj(a10, str2, str, i10));
    }
}
