package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.n4;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.util.v;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzejo implements zzein {
    private final zzcvc zza;
    private final Context zzb;
    private final zzdtk zzc;
    private final zzfhh zzd;
    private final Executor zze;
    private final zzfws zzf;

    public zzejo(zzcvc zzcvcVar, Context context, Executor executor, zzdtk zzdtkVar, zzfhh zzfhhVar, zzfws zzfwsVar) {
        this.zzb = context;
        this.zza = zzcvcVar;
        this.zze = executor;
        this.zzc = zzdtkVar;
        this.zzd = zzfhhVar;
        this.zzf = zzfwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzein
    public final com.google.common.util.concurrent.f zza(final zzfgy zzfgyVar, final zzfgm zzfgmVar) {
        return zzgen.zzn(zzgen.zzh(null), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzejn
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzejo.this.zzc(zzfgyVar, zzfgmVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzein
    public final boolean zzb(zzfgy zzfgyVar, zzfgm zzfgmVar) {
        zzfgr zzfgrVar = zzfgmVar.zzt;
        return (zzfgrVar == null || zzfgrVar.zza == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ com.google.common.util.concurrent.f zzc(zzfgy zzfgyVar, zzfgm zzfgmVar, Object obj) {
        View zzdtnVar;
        z4 zza = zzfhn.zza(this.zzb, zzfgmVar.zzv);
        final zzcjk zza2 = this.zzc.zza(zza, zzfgmVar, zzfgyVar.zzb.zzb);
        zza2.zzaa(zzfgmVar.zzX);
        if (((Boolean) a0.c().zza(zzbgc.zzhI)).booleanValue() && zzfgmVar.zzah) {
            zzdtnVar = zzcvt.zza(this.zzb, (View) zza2, zzfgmVar);
        } else {
            zzdtnVar = new zzdtn(this.zzb, (View) zza2, (v) this.zzf.apply(zzfgmVar));
        }
        final zzcug zza3 = this.zza.zza(new zzcwx(zzfgyVar, zzfgmVar, null), new zzcum(zzdtnVar, zza2, new zzcwf() { // from class: com.google.android.gms.internal.ads.zzeji
            @Override // com.google.android.gms.internal.ads.zzcwf
            public final s2 zza() {
                return zzcjk.this.zzq();
            }
        }, zzfhn.zzb(zza)));
        zza3.zzh().zzi(zza2, false, null);
        zzdbp zzc = zza3.zzc();
        zzdbr zzdbrVar = new zzdbr() { // from class: com.google.android.gms.internal.ads.zzejj
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zzq() {
                zzcjk zzcjkVar = zzcjk.this;
                if (zzcjkVar.zzN() != null) {
                    zzcjkVar.zzN().zzr();
                }
            }
        };
        zzgey zzgeyVar = zzcep.zzf;
        zzc.zzo(zzdbrVar, zzgeyVar);
        zza3.zzh();
        zzfgr zzfgrVar = zzfgmVar.zzt;
        com.google.common.util.concurrent.f zzj = zzdtj.zzj(zza2, zzfgrVar.zzb, zzfgrVar.zza);
        if (zzfgmVar.zzN) {
            zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejk
                @Override // java.lang.Runnable
                public final void run() {
                    zzcjk.this.zzaf();
                }
            }, this.zze);
        }
        zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejl
            @Override // java.lang.Runnable
            public final void run() {
                zzejo.this.zzd(zza2);
            }
        }, this.zze);
        return zzgen.zzm(zzj, new zzfws() { // from class: com.google.android.gms.internal.ads.zzejm
            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj2) {
                return zzcug.this.zza();
            }
        }, zzgeyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzcjk zzcjkVar) {
        zzcjkVar.zzZ();
        zzcki zzq = zzcjkVar.zzq();
        n4 n4Var = this.zzd.zza;
        if (n4Var != null && zzq != null) {
            zzq.zzs(n4Var);
        }
        if (!((Boolean) a0.c().zza(zzbgc.zzbi)).booleanValue() || zzcjkVar.isAttachedToWindow()) {
            return;
        }
        zzcjkVar.onPause();
        zzcjkVar.zzas(true);
    }
}
