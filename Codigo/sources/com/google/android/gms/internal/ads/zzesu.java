package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzesu implements zzexq {
    final zzcdl zza;
    q9.b zzb;
    private final ScheduledExecutorService zzc;
    private final zzgey zzd;
    private final Context zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzesu(Context context, zzcdl zzcdlVar, ScheduledExecutorService scheduledExecutorService, zzgey zzgeyVar) {
        if (!((Boolean) a0.c().zza(zzbgc.zzcG)).booleanValue()) {
            this.zzb = q9.a.a(context);
        }
        this.zze = context;
        this.zza = zzcdlVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        if (((Boolean) a0.c().zza(zzbgc.zzcC)).booleanValue()) {
            if (!((Boolean) a0.c().zza(zzbgc.zzcH)).booleanValue()) {
                if (!((Boolean) a0.c().zza(zzbgc.zzcD)).booleanValue()) {
                    return zzgen.zzm(zzfui.zza(this.zzb.getAppSetIdInfo(), null), new zzfws() { // from class: com.google.android.gms.internal.ads.zzesr
                        @Override // com.google.android.gms.internal.ads.zzfws
                        public final Object apply(Object obj) {
                            q9.c cVar = (q9.c) obj;
                            return new zzesv(cVar.a(), cVar.b());
                        }
                    }, zzcep.zzf);
                }
                Task<q9.c> zza = ((Boolean) a0.c().zza(zzbgc.zzcG)).booleanValue() ? zzfim.zza(this.zze) : this.zzb.getAppSetIdInfo();
                if (zza == null) {
                    return zzgen.zzh(new zzesv(null, -1));
                }
                com.google.common.util.concurrent.f zzn = zzgen.zzn(zzfui.zza(zza, null), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzess
                    @Override // com.google.android.gms.internal.ads.zzgdu
                    public final com.google.common.util.concurrent.f zza(Object obj) {
                        q9.c cVar = (q9.c) obj;
                        return cVar == null ? zzgen.zzh(new zzesv(null, -1)) : zzgen.zzh(new zzesv(cVar.a(), cVar.b()));
                    }
                }, zzcep.zzf);
                if (((Boolean) a0.c().zza(zzbgc.zzcE)).booleanValue()) {
                    zzn = zzgen.zzo(zzn, ((Long) a0.c().zza(zzbgc.zzcF)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgen.zze(zzn, Exception.class, new zzfws() { // from class: com.google.android.gms.internal.ads.zzest
                    @Override // com.google.android.gms.internal.ads.zzfws
                    public final Object apply(Object obj) {
                        zzesu.this.zza.zzw((Exception) obj, "AppSetIdInfoSignal");
                        return new zzesv(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzgen.zzh(new zzesv(null, -1));
    }
}
