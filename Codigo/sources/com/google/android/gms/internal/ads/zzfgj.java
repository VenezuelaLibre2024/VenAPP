package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.y0;
import com.google.android.gms.common.internal.s;

/* loaded from: classes2.dex */
public final class zzfgj extends zzbzw {
    private final zzffz zza;
    private final zzffp zzb;
    private final zzfgz zzc;
    private zzdso zzd;
    private boolean zze = false;

    public zzfgj(zzffz zzffzVar, zzffp zzffpVar, zzfgz zzfgzVar) {
        this.zza = zzffzVar;
        this.zzb = zzffpVar;
        this.zzc = zzfgzVar;
    }

    private final synchronized boolean zzy() {
        zzdso zzdsoVar = this.zzd;
        if (zzdsoVar != null) {
            if (!zzdsoVar.zze()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final Bundle zzb() {
        s.e("getAdMetadata can only be called from the UI thread.");
        zzdso zzdsoVar = this.zzd;
        return zzdsoVar != null ? zzdsoVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized p2 zzc() {
        zzdso zzdsoVar;
        if (((Boolean) a0.c().zza(zzbgc.zzgN)).booleanValue() && (zzdsoVar = this.zzd) != null) {
            return zzdsoVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized String zzd() {
        zzdso zzdsoVar = this.zzd;
        if (zzdsoVar == null || zzdsoVar.zzl() == null) {
            return null;
        }
        return zzdsoVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zze() {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzf(com.google.android.gms.dynamic.b bVar) {
        s.e("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzg(null);
        if (this.zzd != null) {
            if (bVar != null) {
                context = (Context) com.google.android.gms.dynamic.d.g2(bVar);
            }
            this.zzd.zzm().zza(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(com.google.android.gms.internal.ads.zzbgc.zzfr)).booleanValue() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (java.util.regex.Pattern.matches(r1, r0) != false) goto L44;
     */
    @Override // com.google.android.gms.internal.ads.zzbzx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzg(com.google.android.gms.internal.ads.zzcab r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.s.e(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzbfu r1 = com.google.android.gms.internal.ads.zzbgc.zzfp     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzbga r2 = com.google.android.gms.ads.internal.client.a0.c()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L2a
            if (r0 != 0) goto L19
            goto L2a
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.RuntimeException -> L20 java.lang.Throwable -> L62
            if (r0 == 0) goto L2a
            goto L42
        L20:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.zzcdl r2 = com.google.android.gms.ads.internal.t.q()     // Catch: java.lang.Throwable -> L62
            r2.zzw(r0, r1)     // Catch: java.lang.Throwable -> L62
        L2a:
            boolean r0 = r4.zzy()     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L44
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzfr     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzbga r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L62
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L44
        L42:
            monitor-exit(r4)
            return
        L44:
            com.google.android.gms.internal.ads.zzffr r0 = new com.google.android.gms.internal.ads.zzffr     // Catch: java.lang.Throwable -> L62
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L62
            r4.zzd = r1     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzffz r1 = r4.zza     // Catch: java.lang.Throwable -> L62
            r2 = 1
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzffz r1 = r4.zza     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.ads.internal.client.u4 r2 = r5.zza     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzfgh r3 = new com.google.android.gms.internal.ads.zzfgh     // Catch: java.lang.Throwable -> L62
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L62
            r1.zzb(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r4)
            return
        L62:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfgj.zzg(com.google.android.gms.internal.ads.zzcab):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzi(com.google.android.gms.dynamic.b bVar) {
        s.e("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzb(bVar == null ? null : (Context) com.google.android.gms.dynamic.d.g2(bVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzk(com.google.android.gms.dynamic.b bVar) {
        s.e("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzc(bVar == null ? null : (Context) com.google.android.gms.dynamic.d.g2(bVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzl(y0 y0Var) {
        s.e("setAdMetadataListener can only be called from the UI thread.");
        if (y0Var == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfgi(this, y0Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzm(String str) {
        s.e("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzn(boolean z10) {
        s.e("setImmersiveMode must be called on the main UI thread.");
        this.zze = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzo(zzcaa zzcaaVar) {
        s.e("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzm(zzcaaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzp(String str) {
        s.e("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzq() {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzr(com.google.android.gms.dynamic.b bVar) {
        s.e("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (bVar != null) {
                Object g22 = com.google.android.gms.dynamic.d.g2(bVar);
                if (g22 instanceof Activity) {
                    activity = (Activity) g22;
                }
            }
            this.zzd.zzh(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final boolean zzs() {
        s.e("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final boolean zzt() {
        zzdso zzdsoVar = this.zzd;
        return zzdsoVar != null && zzdsoVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzu(zzbzv zzbzvVar) {
        s.e("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzn(zzbzvVar);
    }
}
