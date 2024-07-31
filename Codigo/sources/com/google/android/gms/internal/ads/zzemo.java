package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzemo implements zzgdu {
    private final zzflm zza;
    private final zzdaz zzb;
    private final zzfnu zzc;
    private final zzfny zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcwk zzg;
    private final zzemh zzh;
    private final zzeis zzi;
    private final Context zzj;
    private final zzfmz zzk;
    private final zzelr zzl;

    public zzemo(Context context, zzflm zzflmVar, zzemh zzemhVar, zzdaz zzdazVar, zzfnu zzfnuVar, zzfny zzfnyVar, zzcwk zzcwkVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzeis zzeisVar, zzfmz zzfmzVar, zzelr zzelrVar) {
        this.zzj = context;
        this.zza = zzflmVar;
        this.zzh = zzemhVar;
        this.zzb = zzdazVar;
        this.zzc = zzfnuVar;
        this.zzd = zzfnyVar;
        this.zzg = zzcwkVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzeisVar;
        this.zzk = zzfmzVar;
        this.zzl = zzelrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(com.google.android.gms.internal.ads.zzbgc.zzft)).booleanValue() == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String zzc(com.google.android.gms.internal.ads.zzfgy r5) {
        /*
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzfu
            com.google.android.gms.internal.ads.zzbga r1 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r1
        L19:
            com.google.android.gms.internal.ads.zzfgx r2 = r5.zzb
            com.google.android.gms.internal.ads.zzfgp r2 = r2.zzb
            int r2 = r2.zze
            if (r2 == 0) goto L57
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            com.google.android.gms.internal.ads.zzbfu r2 = com.google.android.gms.internal.ads.zzbgc.zzft
            com.google.android.gms.internal.ads.zzbga r3 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L57
            goto L58
        L3c:
            if (r2 < r4) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L45
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L58
        L45:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Received error HTTP response code: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            goto L58
        L57:
            r1 = r0
        L58:
            com.google.android.gms.internal.ads.zzfgx r5 = r5.zzb
            com.google.android.gms.internal.ads.zzfgp r5 = r5.zzb
            com.google.android.gms.internal.ads.zzfgo r5 = r5.zzi
            if (r5 == 0) goto L65
            java.lang.String r5 = r5.zza()
            return r5
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzemo.zzc(com.google.android.gms.internal.ads.zzfgy):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cf  */
    @Override // com.google.android.gms.internal.ads.zzgdu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.common.util.concurrent.f zza(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzemo.zza(java.lang.Object):com.google.common.util.concurrent.f");
    }

    public final /* synthetic */ com.google.common.util.concurrent.f zzb(zzfgm zzfgmVar, zzfgy zzfgyVar, zzein zzeinVar, Throwable th2) {
        zzfmo zza = zzfmn.zza(this.zzj, 12);
        zza.zzd(zzfgmVar.zzF);
        zza.zzh();
        com.google.common.util.concurrent.f zzo = zzgen.zzo(zzeinVar.zza(zzfgyVar, zzfgmVar), zzfgmVar.zzS, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zzf(zzfgyVar, zzfgmVar, zzo, this.zzc);
        zzfmy.zza(zzo, this.zzk, zza);
        return zzo;
    }
}
