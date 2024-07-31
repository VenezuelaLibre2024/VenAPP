package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.z4;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l9.o;
import l9.z;

/* loaded from: classes2.dex */
public final class zzewx implements zzexq {
    private final String zza;
    private final zzgey zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzfhh zze;
    private final zzclg zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzewx(zzgey zzgeyVar, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzfhh zzfhhVar, zzclg zzclgVar) {
        this.zzb = zzgeyVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = context;
        this.zze = zzfhhVar;
        this.zzf = zzclgVar;
    }

    public static /* synthetic */ com.google.common.util.concurrent.f zzc(zzewx zzewxVar) {
        z zzo = zzewxVar.zzf.zzo();
        zzdaf zzdafVar = new zzdaf();
        zzdafVar.zze(zzewxVar.zzd);
        zzfhf zzfhfVar = new zzfhf();
        zzfhfVar.zzs("adUnitId");
        zzfhfVar.zzE(zzewxVar.zze.zzd);
        zzfhfVar.zzr(new z4());
        zzfhfVar.zzx(true);
        zzdafVar.zzi(zzfhfVar.zzG());
        zzo.zza(zzdafVar.zzj());
        l9.e eVar = new l9.e();
        eVar.a(zzewxVar.zza);
        zzo.zzb(eVar.b());
        new zzdgm();
        return zzgen.zze(zzgen.zzm((zzgee) zzgen.zzo(zzgee.zzu(zzo.zzc().zzc()), ((Long) a0.c().zza(zzbgc.zzhg)).longValue(), TimeUnit.MILLISECONDS, zzewxVar.zzc), new zzfws() { // from class: com.google.android.gms.internal.ads.zzewu
            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                o oVar = (o) obj;
                return oVar != null ? new zzewy(oVar.f21105a) : new zzewy(null);
            }
        }, zzewxVar.zzb), Exception.class, new zzfws() { // from class: com.google.android.gms.internal.ads.zzewv
            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                zzcec.zzh("", (Exception) obj);
                return new zzewy(null);
            }
        }, zzewxVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 33;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return (!((Boolean) a0.c().zza(zzbgc.zzhf)).booleanValue() || this.zze.zzq) ? zzgen.zzh(new zzewy(null)) : zzgen.zzk(new zzgdt() { // from class: com.google.android.gms.internal.ads.zzeww
            @Override // com.google.android.gms.internal.ads.zzgdt
            public final com.google.common.util.concurrent.f zza() {
                return zzewx.zzc(zzewx.this);
            }
        }, this.zzb);
    }
}
