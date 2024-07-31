package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzfdp implements zzfed {
    private final zzfiv zza;
    private final Executor zzb;
    private final zzgej zzc = new zzfdn(this);

    public zzfdp(zzfiv zzfivVar, Executor executor) {
        this.zza = zzfivVar;
        this.zzb = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zza(zzdae zzdaeVar, zzfdy zzfdyVar) {
        zzfiv zzfivVar = this.zza;
        zzfjf zzfjfVar = zzfdyVar.zzb;
        zzbze zzbzeVar = zzfdyVar.zza;
        zzfje zzb = zzfivVar.zzb(zzfjfVar);
        if (zzb != null && zzbzeVar != null) {
            zzgen.zzr(zzdaeVar.zzb().zzh(zzbzeVar), this.zzc, this.zzb);
        }
        return zzgen.zzh(new zzfdo(zzfjfVar, zzbzeVar, zzb));
    }

    public final com.google.common.util.concurrent.f zzb(zzfee zzfeeVar, zzfec zzfecVar, final zzdae zzdaeVar) {
        return zzgen.zze(zzgen.zzn(zzgee.zzu(new zzfdz(this.zza, zzdaeVar, this.zzb).zzc()), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzfdl
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzfdp.this.zza(zzdaeVar, (zzfdy) obj);
            }
        }, this.zzb), Exception.class, new zzfdm(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfed
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.f zzc(zzfee zzfeeVar, zzfec zzfecVar, Object obj) {
        return zzb(zzfeeVar, zzfecVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfed
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
