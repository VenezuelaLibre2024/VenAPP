package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.t;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdqv {
    private final zzfhh zza;
    private final Executor zzb;
    private final zzdtk zzc;
    private final zzdsf zzd;
    private final Context zze;
    private final zzdwf zzf;
    private final zzflw zzg;
    private final zzfny zzh;
    private final zzehh zzi;

    public zzdqv(zzfhh zzfhhVar, Executor executor, zzdtk zzdtkVar, Context context, zzdwf zzdwfVar, zzflw zzflwVar, zzfny zzfnyVar, zzehh zzehhVar, zzdsf zzdsfVar) {
        this.zza = zzfhhVar;
        this.zzb = executor;
        this.zzc = zzdtkVar;
        this.zze = context;
        this.zzf = zzdwfVar;
        this.zzg = zzflwVar;
        this.zzh = zzfnyVar;
        this.zzi = zzehhVar;
        this.zzd = zzdsfVar;
    }

    private final void zzh(zzcjk zzcjkVar) {
        zzj(zzcjkVar);
        zzcjkVar.zzae("/video", zzbnf.zzl);
        zzcjkVar.zzae("/videoMeta", zzbnf.zzm);
        zzcjkVar.zzae("/precache", new zzchx());
        zzcjkVar.zzae("/delayPageLoaded", zzbnf.zzp);
        zzcjkVar.zzae("/instrument", zzbnf.zzn);
        zzcjkVar.zzae("/log", zzbnf.zzg);
        zzcjkVar.zzae("/click", new zzbme(null, 0 == true ? 1 : 0));
        if (this.zza.zzb != null) {
            zzcjkVar.zzN().zzE(true);
            zzcjkVar.zzae("/open", new zzbnr(null, null, null, null, null, null));
        } else {
            zzcjkVar.zzN().zzE(false);
        }
        if (t.p().zzp(zzcjkVar.getContext())) {
            zzcjkVar.zzae("/logScionEvent", new zzbnl(zzcjkVar.getContext()));
        }
    }

    private final void zzi(zzcjk zzcjkVar, zzcet zzcetVar) {
        if (this.zza.zza != null && zzcjkVar.zzq() != null) {
            zzcjkVar.zzq().zzs(this.zza.zza);
        }
        zzcetVar.zzb();
    }

    private static final void zzj(zzcjk zzcjkVar) {
        zzcjkVar.zzae("/videoClicked", zzbnf.zzh);
        zzcjkVar.zzN().zzG(true);
        if (((Boolean) a0.c().zza(zzbgc.zzdF)).booleanValue()) {
            zzcjkVar.zzae("/getNativeAdViewSignals", zzbnf.zzs);
        }
        zzcjkVar.zzae("/getNativeClickMeta", zzbnf.zzt);
    }

    public final com.google.common.util.concurrent.f zza(final JSONObject jSONObject) {
        return zzgen.zzn(zzgen.zzn(zzgen.zzh(null), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzdqm
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzdqv.this.zze(obj);
            }
        }, this.zzb), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzdql
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzdqv.this.zzc(jSONObject, (zzcjk) obj);
            }
        }, this.zzb);
    }

    public final com.google.common.util.concurrent.f zzb(final String str, final String str2, final zzfgm zzfgmVar, final zzfgp zzfgpVar, final z4 z4Var) {
        return zzgen.zzn(zzgen.zzh(null), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzdqk
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzdqv.this.zzd(z4Var, zzfgmVar, zzfgpVar, str, str2, obj);
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zzc(JSONObject jSONObject, final zzcjk zzcjkVar) {
        final zzcet zza = zzcet.zza(zzcjkVar);
        zzcjkVar.zzah(this.zza.zzb != null ? zzcla.zzd() : zzcla.zze());
        zzcjkVar.zzN().zzB(new zzckw() { // from class: com.google.android.gms.internal.ads.zzdqn
            @Override // com.google.android.gms.internal.ads.zzckw
            public final void zza(boolean z10, int i10, String str, String str2) {
                zzdqv.this.zzf(zzcjkVar, zza, z10, i10, str, str2);
            }
        });
        zzcjkVar.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zzd(z4 z4Var, zzfgm zzfgmVar, zzfgp zzfgpVar, String str, String str2, Object obj) {
        final zzcjk zza = this.zzc.zza(z4Var, zzfgmVar, zzfgpVar);
        final zzcet zza2 = zzcet.zza(zza);
        if (this.zza.zzb != null) {
            zzh(zza);
            zza.zzah(zzcla.zzd());
        } else {
            zzdsc zzb = this.zzd.zzb();
            zza.zzN().zzN(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.b(this.zze, null, null), null, null, this.zzi, this.zzh, this.zzf, this.zzg, null, zzb, null, null, null);
            zzj(zza);
        }
        zza.zzN().zzB(new zzckw() { // from class: com.google.android.gms.internal.ads.zzdqo
            @Override // com.google.android.gms.internal.ads.zzckw
            public final void zza(boolean z10, int i10, String str3, String str4) {
                zzdqv.this.zzg(zza, zza2, z10, i10, str3, str4);
            }
        });
        zza.zzac(str, str2, null);
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zze(Object obj) {
        zzcjk zza = this.zzc.zza(z4.w1(), null, null);
        final zzcet zza2 = zzcet.zza(zza);
        zzh(zza);
        zza.zzN().zzH(new zzckx() { // from class: com.google.android.gms.internal.ads.zzdqp
            @Override // com.google.android.gms.internal.ads.zzckx
            public final void zza() {
                zzcet.this.zzb();
            }
        });
        zza.loadUrl((String) a0.c().zza(zzbgc.zzdE));
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcjk zzcjkVar, zzcet zzcetVar, boolean z10, int i10, String str, String str2) {
        if (!((Boolean) a0.c().zza(zzbgc.zzdP)).booleanValue()) {
            zzi(zzcjkVar, zzcetVar);
            return;
        }
        if (z10) {
            zzi(zzcjkVar, zzcetVar);
            return;
        }
        zzcetVar.zzd(new zzeml(1, "Native Video WebView failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzcjk zzcjkVar, zzcet zzcetVar, boolean z10, int i10, String str, String str2) {
        if (z10) {
            if (this.zza.zza != null && zzcjkVar.zzq() != null) {
                zzcjkVar.zzq().zzs(this.zza.zza);
            }
            zzcetVar.zzb();
            return;
        }
        zzcetVar.zzd(new zzeml(1, "Html video Web View failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
    }
}
