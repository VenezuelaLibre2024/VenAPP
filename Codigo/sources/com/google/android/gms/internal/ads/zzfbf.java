package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzfbf implements zzexq {
    private final zzcdl zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzgey zze;
    private final String zzf;
    private final zzcda zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfbf(zzcdl zzcdlVar, boolean z10, boolean z11, zzcda zzcdaVar, zzgey zzgeyVar, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzcdlVar;
        this.zzb = z10;
        this.zzc = z11;
        this.zzg = zzcdaVar;
        this.zze = zzgeyVar;
        this.zzf = str;
        this.zzd = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        if ((!((Boolean) a0.c().zza(zzbgc.zzhh)).booleanValue() || !this.zzc) && this.zzb) {
            return zzgen.zze(zzgen.zzo(zzgen.zzm(zzgen.zzh(null), new zzfws() { // from class: com.google.android.gms.internal.ads.zzfbd
                @Override // com.google.android.gms.internal.ads.zzfws
                public final Object apply(Object obj) {
                    String str = (String) obj;
                    if (str == null) {
                        return null;
                    }
                    return new zzfbg(str);
                }
            }, this.zze), ((Long) zzbio.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzfws() { // from class: com.google.android.gms.internal.ads.zzfbe
                @Override // com.google.android.gms.internal.ads.zzfws
                public final Object apply(Object obj) {
                    zzfbf.this.zzc((Exception) obj);
                    return null;
                }
            }, this.zze);
        }
        return zzgen.zzh(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfbg zzc(Exception exc) {
        this.zza.zzw(exc, "TrustlessTokenSignal");
        return null;
    }
}
