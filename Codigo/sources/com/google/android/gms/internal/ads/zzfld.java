package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzfld {
    final /* synthetic */ zzfle zza;
    private final Object zzb;
    private final String zzc;
    private final com.google.common.util.concurrent.f zzd;
    private final List zze;
    private final com.google.common.util.concurrent.f zzf;

    /* JADX INFO: Access modifiers changed from: private */
    public zzfld(zzfle zzfleVar, Object obj, String str, com.google.common.util.concurrent.f fVar, List list, com.google.common.util.concurrent.f fVar2) {
        this.zza = zzfleVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = fVar;
        this.zze = list;
        this.zzf = fVar2;
    }

    public /* synthetic */ zzfld(zzfle zzfleVar, Object obj, String str, com.google.common.util.concurrent.f fVar, List list, com.google.common.util.concurrent.f fVar2, zzflc zzflcVar) {
        this(zzfleVar, obj, null, fVar, list, fVar2);
    }

    public final zzfkr zza() {
        zzflf zzflfVar;
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        zzfkr zzfkrVar = new zzfkr(obj, str, this.zzf);
        zzflfVar = this.zza.zzd;
        zzflfVar.zza(zzfkrVar);
        com.google.common.util.concurrent.f fVar = this.zzd;
        zzfla zzflaVar = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfla
            public final /* synthetic */ zzfkr zzb;

            public /* synthetic */ zzfla(zzfkr zzfkrVar2) {
                r2 = zzfkrVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzflf zzflfVar2;
                zzflfVar2 = zzfld.this.zza.zzd;
                zzflfVar2.zzc(r2);
            }
        };
        zzgey zzgeyVar = zzcep.zzf;
        fVar.addListener(zzflaVar, zzgeyVar);
        zzgen.zzr(zzfkrVar2, new zzflb(this, zzfkrVar2), zzgeyVar);
        return zzfkrVar2;
    }

    public final zzfld zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfld zzc(Class cls, zzgdu zzgduVar) {
        zzgey zzgeyVar;
        zzgeyVar = this.zza.zzb;
        return new zzfld(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgen.zzf(this.zzf, cls, zzgduVar, zzgeyVar));
    }

    public final zzfld zzd(com.google.common.util.concurrent.f fVar) {
        return zzg(new zzgdu() { // from class: com.google.android.gms.internal.ads.zzfkz
            public /* synthetic */ zzfkz() {
            }

            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return com.google.common.util.concurrent.f.this;
            }
        }, zzcep.zzf);
    }

    public final zzfld zze(zzfkp zzfkpVar) {
        return zzf(new zzgdu() { // from class: com.google.android.gms.internal.ads.zzfky
            public /* synthetic */ zzfky() {
            }

            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzgen.zzh(zzfkp.this.zza(obj));
            }
        });
    }

    public final zzfld zzf(zzgdu zzgduVar) {
        zzgey zzgeyVar;
        zzgeyVar = this.zza.zzb;
        return zzg(zzgduVar, zzgeyVar);
    }

    public final zzfld zzg(zzgdu zzgduVar, Executor executor) {
        return new zzfld(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgen.zzn(this.zzf, zzgduVar, executor));
    }

    public final zzfld zzh(String str) {
        return new zzfld(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfld zzi(long j10, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zza.zzc;
        return new zzfld(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgen.zzo(this.zzf, j10, timeUnit, scheduledExecutorService));
    }
}
