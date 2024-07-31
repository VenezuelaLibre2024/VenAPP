package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbsg {
    private final zzbrj zza;
    private com.google.common.util.concurrent.f zzb;

    public zzbsg(zzbrj zzbrjVar) {
        this.zza = zzbrjVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            zzceu zzceuVar = new zzceu();
            this.zzb = zzceuVar;
            this.zza.zzb(null).zzi(new zzcey() { // from class: com.google.android.gms.internal.ads.zzbsd
                public /* synthetic */ zzbsd() {
                }

                @Override // com.google.android.gms.internal.ads.zzcey
                public final void zza(Object obj) {
                    zzceu.this.zzc((zzbrk) obj);
                }
            }, new zzcew() { // from class: com.google.android.gms.internal.ads.zzbse
                public /* synthetic */ zzbse() {
                }

                @Override // com.google.android.gms.internal.ads.zzcew
                public final void zza() {
                    zzceu.this.zzd(new zzbrm("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbsj zza(String str, zzbrq zzbrqVar, zzbrp zzbrpVar) {
        zzd();
        return new zzbsj(this.zzb, "google.afma.activeView.handleUpdate", zzbrqVar, zzbrpVar);
    }

    public final void zzb(String str, zzbng zzbngVar) {
        zzd();
        this.zzb = zzgen.zzn(this.zzb, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzbsf
            public final /* synthetic */ String zza;
            public final /* synthetic */ zzbng zzb;

            public /* synthetic */ zzbsf(String str2, zzbng zzbngVar2) {
                r1 = str2;
                r2 = zzbngVar2;
            }

            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                zzbrk zzbrkVar = (zzbrk) obj;
                zzbrkVar.zzq(r1, r2);
                return zzgen.zzh(zzbrkVar);
            }
        }, zzcep.zzf);
    }

    public final void zzc(String str, zzbng zzbngVar) {
        this.zzb = zzgen.zzm(this.zzb, new zzfws() { // from class: com.google.android.gms.internal.ads.zzbsc
            public final /* synthetic */ String zza;
            public final /* synthetic */ zzbng zzb;

            public /* synthetic */ zzbsc(String str2, zzbng zzbngVar2) {
                r1 = str2;
                r2 = zzbngVar2;
            }

            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                zzbrk zzbrkVar = (zzbrk) obj;
                zzbrkVar.zzr(r1, r2);
                return zzbrkVar;
            }
        }, zzcep.zzf);
    }
}
