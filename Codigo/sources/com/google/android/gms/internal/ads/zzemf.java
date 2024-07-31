package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzemf implements zzgej {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfgp zzb;
    final /* synthetic */ zzfgm zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfnu zze;
    final /* synthetic */ zzfgy zzf;
    final /* synthetic */ zzemh zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzemf(zzemh zzemhVar, long j10, zzfgp zzfgpVar, zzfgm zzfgmVar, String str, zzfnu zzfnuVar, zzfgy zzfgyVar) {
        this.zza = j10;
        this.zzb = zzfgpVar;
        this.zzc = zzfgmVar;
        this.zzd = str;
        this.zze = zzfnuVar;
        this.zzf = zzfgyVar;
        this.zzg = zzemhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgej
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.Throwable r17) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzemf.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zzb(Object obj) {
        la.f fVar;
        boolean z10;
        boolean z11;
        boolean zzq;
        LinkedHashMap linkedHashMap;
        zzeis zzeisVar;
        LinkedHashMap linkedHashMap2;
        zzemj zzemjVar;
        fVar = this.zzg.zza;
        long b10 = fVar.b() - this.zza;
        synchronized (this.zzg) {
            zzemh zzemhVar = this.zzg;
            z10 = zzemhVar.zze;
            if (z10) {
                zzemjVar = zzemhVar.zzb;
                zzemjVar.zza(this.zzb, this.zzc, 0, null, b10);
            }
            zzemh zzemhVar2 = this.zzg;
            z11 = zzemhVar2.zzg;
            if (z11) {
                return;
            }
            zzq = zzemhVar2.zzq(this.zzc);
            if (zzq) {
                linkedHashMap2 = this.zzg.zzd;
                ((zzemg) linkedHashMap2.get(this.zzc)).zzd = b10;
            } else {
                linkedHashMap = this.zzg.zzd;
                zzfgm zzfgmVar = this.zzc;
                linkedHashMap.put(zzfgmVar, new zzemg(this.zzd, zzfgmVar.zzag, 0, b10, null));
            }
            zzeisVar = this.zzg.zzf;
            zzeisVar.zzg(this.zzc, b10, null);
        }
    }
}
