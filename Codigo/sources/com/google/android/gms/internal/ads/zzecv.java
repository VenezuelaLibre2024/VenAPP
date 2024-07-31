package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class zzecv {
    private final zzgey zza;
    private final zzgey zzb;
    private final zzedq zzc;
    private final zzhgx zzd;

    public zzecv(zzgey zzgeyVar, zzgey zzgeyVar2, zzedq zzedqVar, zzhgx zzhgxVar) {
        this.zza = zzgeyVar;
        this.zzb = zzgeyVar2;
        this.zzc = zzedqVar;
        this.zzd = zzhgxVar;
    }

    public final /* synthetic */ com.google.common.util.concurrent.f zza(zzbym zzbymVar) {
        return this.zzc.zza(zzbymVar, ((Long) a0.c().zza(zzbgc.zzkX)).longValue());
    }

    public final /* synthetic */ com.google.common.util.concurrent.f zzb(zzbym zzbymVar, int i10, zzecf zzecfVar) {
        return ((zzeew) this.zzd.zzb()).zzb(zzbymVar, i10);
    }

    public final com.google.common.util.concurrent.f zzc(zzbym zzbymVar) {
        com.google.common.util.concurrent.f zzf;
        String str = zzbymVar.zzf;
        t.r();
        if (j2.b(str)) {
            zzf = zzgen.zzg(new zzecf(1, "Ads service proxy force local"));
        } else {
            zzf = zzgen.zzf(zzgen.zzk(new zzgdt() { // from class: com.google.android.gms.internal.ads.zzecs
                public final /* synthetic */ zzbym zzb;

                public /* synthetic */ zzecs(zzbym zzbymVar2) {
                    r2 = zzbymVar2;
                }

                @Override // com.google.android.gms.internal.ads.zzgdt
                public final com.google.common.util.concurrent.f zza() {
                    return zzecv.this.zza(r2);
                }
            }, this.zza), ExecutionException.class, zzect.zza, this.zzb);
        }
        return zzgen.zzf(zzf, zzecf.class, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzecu
            public final /* synthetic */ zzbym zzb;
            public final /* synthetic */ int zzc;

            public /* synthetic */ zzecu(zzbym zzbymVar2, int i10) {
                r2 = zzbymVar2;
                r3 = i10;
            }

            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzecv.this.zzb(r2, r3, (zzecf) obj);
            }
        }, this.zzb);
    }
}
