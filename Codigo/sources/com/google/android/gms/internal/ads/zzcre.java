package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzcre implements zzcqv {
    private final zzeil zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcre(zzeil zzeilVar) {
        this.zza = zzeilVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final void zza(Map map) {
        if (((Boolean) a0.c().zza(zzbgc.zzjU)).booleanValue()) {
            zzgen.zzf(zzgee.zzu(this.zza.zza(true)), Throwable.class, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzcrd
                @Override // com.google.android.gms.internal.ads.zzgdu
                public final com.google.common.util.concurrent.f zza(Object obj) {
                    t.q().zzw((Throwable) obj, "GetTopicsApiWithRecordObservationActionHandler");
                    return zzgen.zzh(new androidx.privacysandbox.ads.adservices.topics.b(zzgaa.zzl()));
                }
            }, zzcep.zza);
        }
    }
}
