package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import g9.w;

/* loaded from: classes2.dex */
public final class zzdkx implements zzdcl, w, zzdbr {
    zzfod zza;
    private final Context zzb;
    private final zzcjk zzc;
    private final zzfgm zzd;
    private final zzcei zze;
    private final zzbbz zzf;

    public zzdkx(Context context, zzcjk zzcjkVar, zzfgm zzfgmVar, zzcei zzceiVar, zzbbz zzbbzVar) {
        this.zzb = context;
        this.zzc = zzcjkVar;
        this.zzd = zzfgmVar;
        this.zze = zzceiVar;
        this.zzf = zzbbzVar;
    }

    @Override // g9.w
    public final void zzbA() {
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) a0.c().zza(zzbgc.zzeZ)).booleanValue()) {
            return;
        }
        this.zzc.zzd("onSdkImpression", new androidx.collection.a());
    }

    @Override // g9.w
    public final void zzbC() {
    }

    @Override // g9.w
    public final void zzbD(int i10) {
        this.zza = null;
    }

    @Override // g9.w
    public final void zzbP() {
    }

    @Override // g9.w
    public final void zzbt() {
    }

    @Override // g9.w
    public final void zzbz() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbr
    public final void zzq() {
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) a0.c().zza(zzbgc.zzeZ)).booleanValue()) {
            this.zzc.zzd("onSdkImpression", new androidx.collection.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zzr() {
        zzeii zzeiiVar;
        zzeih zzeihVar;
        zzbbz zzbbzVar = this.zzf;
        if ((zzbbzVar == zzbbz.REWARD_BASED_VIDEO_AD || zzbbzVar == zzbbz.INTERSTITIAL || zzbbzVar == zzbbz.APP_OPEN) && this.zzd.zzU && this.zzc != null) {
            if (t.a().zzj(this.zzb)) {
                zzcei zzceiVar = this.zze;
                String str = zzceiVar.zzb + "." + zzceiVar.zzc;
                zzfhk zzfhkVar = this.zzd.zzW;
                String zza = zzfhkVar.zza();
                if (zzfhkVar.zzb() == 1) {
                    zzeihVar = zzeih.VIDEO;
                    zzeiiVar = zzeii.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzeiiVar = this.zzd.zzZ == 2 ? zzeii.UNSPECIFIED : zzeii.BEGIN_TO_RENDER;
                    zzeihVar = zzeih.HTML_DISPLAY;
                }
                zzfod zza2 = t.a().zza(str, this.zzc.zzG(), "", "javascript", zza, zzeiiVar, zzeihVar, this.zzd.zzam);
                this.zza = zza2;
                if (zza2 != null) {
                    t.a().zzh(this.zza, (View) this.zzc);
                    this.zzc.zzaq(this.zza);
                    t.a().zzi(this.zza);
                    this.zzc.zzd("onSdkLoaded", new androidx.collection.a());
                }
            }
        }
    }
}
