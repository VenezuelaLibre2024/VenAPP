package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcww {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final com.google.common.util.concurrent.f zzc;
    private volatile boolean zzd = true;

    public zzcww(Executor executor, ScheduledExecutorService scheduledExecutorService, com.google.common.util.concurrent.f fVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(final zzcww zzcwwVar, List list, final zzgej zzgejVar) {
        if (list == null || list.isEmpty()) {
            zzcwwVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcwr
                @Override // java.lang.Runnable
                public final void run() {
                    zzgej.this.zza(new zzead(3));
                }
            });
            return;
        }
        com.google.common.util.concurrent.f zzh = zzgen.zzh(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final com.google.common.util.concurrent.f fVar = (com.google.common.util.concurrent.f) it.next();
            zzh = zzgen.zzn(zzgen.zzf(zzh, Throwable.class, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzcws
                @Override // com.google.android.gms.internal.ads.zzgdu
                public final com.google.common.util.concurrent.f zza(Object obj) {
                    zzgej.this.zza((Throwable) obj);
                    return zzgen.zzh(null);
                }
            }, zzcwwVar.zza), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzcwt
                @Override // com.google.android.gms.internal.ads.zzgdu
                public final com.google.common.util.concurrent.f zza(Object obj) {
                    return zzcww.this.zza(zzgejVar, fVar, (zzcwh) obj);
                }
            }, zzcwwVar.zza);
        }
        zzgen.zzr(zzh, new zzcwv(zzcwwVar, zzgejVar), zzcwwVar.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zza(zzgej zzgejVar, com.google.common.util.concurrent.f fVar, zzcwh zzcwhVar) {
        if (zzcwhVar != null) {
            zzgejVar.zzb(zzcwhVar);
        }
        return zzgen.zzo(fVar, ((Long) zzbin.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzgej zzgejVar) {
        zzgen.zzr(this.zzc, new zzcwu(this, zzgejVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
