package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.t;

/* loaded from: classes2.dex */
public final class zzcvu implements zzdcl, zzdbr {
    private final Context zza;
    private final zzcjk zzb;
    private final zzfgm zzc;
    private final zzcei zzd;
    private zzfod zze;
    private boolean zzf;

    public zzcvu(Context context, zzcjk zzcjkVar, zzfgm zzfgmVar, zzcei zzceiVar) {
        this.zza = context;
        this.zzb = zzcjkVar;
        this.zzc = zzfgmVar;
        this.zzd = zzceiVar;
    }

    private final synchronized void zza() {
        zzeii zzeiiVar;
        zzeih zzeihVar;
        if (this.zzc.zzU && this.zzb != null) {
            if (t.a().zzj(this.zza)) {
                zzcei zzceiVar = this.zzd;
                String str = zzceiVar.zzb + "." + zzceiVar.zzc;
                zzfhk zzfhkVar = this.zzc.zzW;
                String zza = zzfhkVar.zza();
                if (zzfhkVar.zzb() == 1) {
                    zzeihVar = zzeih.VIDEO;
                    zzeiiVar = zzeii.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzfgm zzfgmVar = this.zzc;
                    zzeih zzeihVar2 = zzeih.HTML_DISPLAY;
                    zzeiiVar = zzfgmVar.zzf == 1 ? zzeii.ONE_PIXEL : zzeii.BEGIN_TO_RENDER;
                    zzeihVar = zzeihVar2;
                }
                zzfod zza2 = t.a().zza(str, this.zzb.zzG(), "", "javascript", zza, zzeiiVar, zzeihVar, this.zzc.zzam);
                this.zze = zza2;
                Object obj = this.zzb;
                if (zza2 != null) {
                    t.a().zzh(this.zze, (View) obj);
                    this.zzb.zzaq(this.zze);
                    t.a().zzi(this.zze);
                    this.zzf = true;
                    this.zzb.zzd("onSdkLoaded", new androidx.collection.a());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbr
    public final synchronized void zzq() {
        zzcjk zzcjkVar;
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzU || this.zze == null || (zzcjkVar = this.zzb) == null) {
            return;
        }
        zzcjkVar.zzd("onSdkImpression", new androidx.collection.a());
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final synchronized void zzr() {
        if (this.zzf) {
            return;
        }
        zza();
    }
}
