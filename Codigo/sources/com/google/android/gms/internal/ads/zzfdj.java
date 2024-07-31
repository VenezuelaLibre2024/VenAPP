package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.u4;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzfdj implements zzfed {
    private final zzfed zza;
    private final zzfed zzb;
    private final zzfjr zzc;
    private final String zzd;
    private zzdae zze;
    private final Executor zzf;

    public zzfdj(zzfed zzfedVar, zzfed zzfedVar2, zzfjr zzfjrVar, String str, Executor executor) {
        this.zza = zzfedVar;
        this.zzb = zzfedVar2;
        this.zzc = zzfjrVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final com.google.common.util.concurrent.f zzg(zzfje zzfjeVar, zzfee zzfeeVar) {
        zzdae zzdaeVar = zzfjeVar.zza;
        this.zze = zzdaeVar;
        if (zzfjeVar.zzc != null) {
            if (zzdaeVar.zzf() != null) {
                zzfjeVar.zzc.zzo().zzl(zzfjeVar.zza.zzf());
            }
            return zzgen.zzh(zzfjeVar.zzc);
        }
        zzdaeVar.zzb().zzl(zzfjeVar.zzb);
        return ((zzfdt) this.zza).zzb(zzfeeVar, null, zzfjeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfed
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdae zzd() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zzb(zzfee zzfeeVar, zzfdi zzfdiVar, zzfec zzfecVar, zzdae zzdaeVar, zzfdo zzfdoVar) {
        if (zzfdoVar != null) {
            zzfdi zzfdiVar2 = new zzfdi(zzfdiVar.zza, zzfdiVar.zzb, zzfdiVar.zzc, zzfdiVar.zzd, zzfdiVar.zze, zzfdiVar.zzf, zzfdoVar.zza);
            if (zzfdoVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzfdiVar2);
                return zzg(zzfdoVar.zzc, zzfeeVar);
            }
            com.google.common.util.concurrent.f zza = this.zzc.zza(zzfdiVar2);
            if (zza != null) {
                this.zze = null;
                return zzgen.zzn(zza, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzfdf
                    @Override // com.google.android.gms.internal.ads.zzgdu
                    public final com.google.common.util.concurrent.f zza(Object obj) {
                        return zzfdj.this.zze((zzfjo) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzfdiVar2);
            zzfeeVar = new zzfee(zzfeeVar.zzb, zzfdoVar.zzb);
        }
        com.google.common.util.concurrent.f zzb = ((zzfdt) this.zza).zzb(zzfeeVar, zzfecVar, zzdaeVar);
        this.zze = zzdaeVar;
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfed
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.f zzc(zzfee zzfeeVar, zzfec zzfecVar, Object obj) {
        return zzf(zzfeeVar, zzfecVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zze(zzfjo zzfjoVar) {
        zzfjq zzfjqVar;
        if (zzfjoVar == null || zzfjoVar.zza == null || (zzfjqVar = zzfjoVar.zzb) == null) {
            throw new zzead(1, "Empty prefetch");
        }
        zzbce zza = zzbck.zza();
        zzbcc zza2 = zzbcd.zza();
        zza2.zzd(2);
        zza2.zzb(zzbch.zzd());
        zza.zza(zza2);
        zzfjoVar.zza.zza.zzb().zzc().zzm((zzbck) zza.zzal());
        return zzg(zzfjoVar.zza, ((zzfdi) zzfjqVar).zzb);
    }

    public final synchronized com.google.common.util.concurrent.f zzf(final zzfee zzfeeVar, final zzfec zzfecVar, zzdae zzdaeVar) {
        zzdad zza = zzfecVar.zza(zzfeeVar.zzb);
        zza.zza(new zzfdk(this.zzd));
        final zzdae zzdaeVar2 = (zzdae) zza.zzh();
        zzdaeVar2.zzg();
        zzdaeVar2.zzg();
        u4 u4Var = zzdaeVar2.zzg().zzd;
        if (u4Var.D == null && u4Var.I == null) {
            zzfhh zzg = zzdaeVar2.zzg();
            final zzfdi zzfdiVar = new zzfdi(zzfecVar, zzfeeVar, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, null);
            return zzgen.zzn(zzgee.zzu(((zzfdp) this.zzb).zzb(zzfeeVar, zzfecVar, zzdaeVar2)), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzfdg
                @Override // com.google.android.gms.internal.ads.zzgdu
                public final com.google.common.util.concurrent.f zza(Object obj) {
                    return zzfdj.this.zzb(zzfeeVar, zzfdiVar, zzfecVar, zzdaeVar2, (zzfdo) obj);
                }
            }, this.zzf);
        }
        this.zze = zzdaeVar2;
        return ((zzfdt) this.zza).zzb(zzfeeVar, zzfecVar, zzdaeVar2);
    }
}
