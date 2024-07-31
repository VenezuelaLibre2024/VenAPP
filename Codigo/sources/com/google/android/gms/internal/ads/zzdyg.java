package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdyg implements zzgej {
    final /* synthetic */ zzdyi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyg(zzdyi zzdyiVar) {
        this.zza = zzdyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        long j10;
        zzceu zzceuVar;
        synchronized (this) {
            this.zza.zzc = true;
            zzdyi zzdyiVar = this.zza;
            long b10 = t.b().b();
            j10 = this.zza.zzd;
            zzdyiVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (b10 - j10));
            zzceuVar = this.zza.zze;
            zzceuVar.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        long j10;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdyi zzdyiVar = this.zza;
            long b10 = t.b().b();
            j10 = this.zza.zzd;
            zzdyiVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (b10 - j10));
            executor = this.zza.zzi;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyf
                @Override // java.lang.Runnable
                public final void run() {
                    zzdyi.zzj(zzdyg.this.zza, str);
                }
            });
        }
    }
}
