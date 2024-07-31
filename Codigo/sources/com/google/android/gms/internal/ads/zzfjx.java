package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfjx {
    private final zzfjq zza;
    private final com.google.common.util.concurrent.f zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfjx(final zzfiv zzfivVar, final zzfjp zzfjpVar, final zzfjq zzfjqVar) {
        this.zza = zzfjqVar;
        this.zzb = zzgen.zzf(zzgen.zzn(zzfjpVar.zza(zzfjqVar), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzfjv
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzfjx.this.zzb(zzfjpVar, zzfivVar, zzfjqVar, (zzfje) obj);
            }
        }, zzfjqVar.zzb()), Exception.class, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzfjw
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzfjx.this.zzc(zzfjpVar, (Exception) obj);
            }
        }, zzfjqVar.zzb());
    }

    public final synchronized com.google.common.util.concurrent.f zza(zzfjq zzfjqVar) {
        if (!this.zzd && !this.zzc && this.zza.zza() != null && zzfjqVar.zza() != null && this.zza.zza().equals(zzfjqVar.zza())) {
            this.zzc = true;
            return this.zzb;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zzb(zzfjp zzfjpVar, zzfiv zzfivVar, zzfjq zzfjqVar, zzfje zzfjeVar) {
        synchronized (this) {
            this.zzd = true;
            zzfjpVar.zzb(zzfjeVar);
            if (this.zzc) {
                return zzgen.zzh(new zzfjo(zzfjeVar, zzfjqVar));
            }
            zzfivVar.zzd(zzfjqVar.zza(), zzfjeVar);
            return zzgen.zzh(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zzc(zzfjp zzfjpVar, Exception exc) {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzgej zzgejVar) {
        zzgen.zzr(zzgen.zzn(this.zzb, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzfju
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzgen.zzi();
            }
        }, this.zza.zzb()), zzgejVar, this.zza.zzb());
    }
}
