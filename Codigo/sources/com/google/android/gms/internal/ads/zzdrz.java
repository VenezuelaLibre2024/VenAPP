package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.t;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdrz {
    private final com.google.android.gms.ads.internal.a zzb;
    private final zzcjx zzc;
    private final Context zzd;
    private final zzdwf zze;
    private final zzflw zzf;
    private final Executor zzg;
    private final zzavi zzh;
    private final zzcei zzi;
    private final zzehh zzk;
    private final zzfny zzl;
    private final zzehs zzm;
    private final zzfhl zzn;
    private com.google.common.util.concurrent.f zzo;
    private final zzdrm zza = new zzdrm();
    private final zzbnv zzj = new zzbnv();

    public zzdrz(zzdrw zzdrwVar) {
        Context context;
        Executor executor;
        zzavi zzaviVar;
        zzcei zzceiVar;
        com.google.android.gms.ads.internal.a aVar;
        zzcjx zzcjxVar;
        zzehh zzehhVar;
        zzfny zzfnyVar;
        zzdwf zzdwfVar;
        zzflw zzflwVar;
        zzehs zzehsVar;
        zzfhl zzfhlVar;
        context = zzdrwVar.zzc;
        this.zzd = context;
        executor = zzdrwVar.zzg;
        this.zzg = executor;
        zzaviVar = zzdrwVar.zzh;
        this.zzh = zzaviVar;
        zzceiVar = zzdrwVar.zzi;
        this.zzi = zzceiVar;
        aVar = zzdrwVar.zza;
        this.zzb = aVar;
        this.zza = new zzdrm();
        zzcjxVar = zzdrwVar.zzb;
        this.zzc = zzcjxVar;
        this.zzj = new zzbnv();
        zzehhVar = zzdrwVar.zzf;
        this.zzk = zzehhVar;
        zzfnyVar = zzdrwVar.zzj;
        this.zzl = zzfnyVar;
        zzdwfVar = zzdrwVar.zzd;
        this.zze = zzdwfVar;
        zzflwVar = zzdrwVar.zze;
        this.zzf = zzflwVar;
        zzehsVar = zzdrwVar.zzk;
        this.zzm = zzehsVar;
        zzfhlVar = zzdrwVar.zzl;
        this.zzn = zzfhlVar;
    }

    public final /* synthetic */ zzcjk zza(zzcjk zzcjkVar) {
        zzcjkVar.zzae("/result", this.zzj);
        zzcky zzN = zzcjkVar.zzN();
        com.google.android.gms.ads.internal.b bVar = new com.google.android.gms.ads.internal.b(this.zzd, null, null);
        zzehh zzehhVar = this.zzk;
        zzfny zzfnyVar = this.zzl;
        zzdwf zzdwfVar = this.zze;
        zzflw zzflwVar = this.zzf;
        zzdrm zzdrmVar = this.zza;
        zzN.zzN(null, zzdrmVar, zzdrmVar, zzdrmVar, zzdrmVar, false, null, bVar, null, null, zzehhVar, zzfnyVar, zzdwfVar, zzflwVar, null, null, null, null, null);
        return zzcjkVar;
    }

    public final /* synthetic */ com.google.common.util.concurrent.f zzc(String str, JSONObject jSONObject, zzcjk zzcjkVar) {
        return this.zzj.zzb(zzcjkVar, str, jSONObject);
    }

    public final synchronized com.google.common.util.concurrent.f zzd(String str, JSONObject jSONObject) {
        com.google.common.util.concurrent.f fVar = this.zzo;
        if (fVar == null) {
            return zzgen.zzh(null);
        }
        return zzgen.zzn(fVar, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzdrn
            public final /* synthetic */ String zzb;
            public final /* synthetic */ JSONObject zzc;

            public /* synthetic */ zzdrn(String str2, JSONObject jSONObject2) {
                r2 = str2;
                r3 = jSONObject2;
            }

            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzdrz.this.zzc(r2, r3, (zzcjk) obj);
            }
        }, this.zzg);
    }

    public final synchronized void zze(zzfgm zzfgmVar, zzfgp zzfgpVar) {
        com.google.common.util.concurrent.f fVar = this.zzo;
        if (fVar == null) {
            return;
        }
        zzgen.zzr(fVar, new zzdrt(this, zzfgmVar, zzfgpVar), this.zzg);
    }

    public final synchronized void zzf() {
        com.google.common.util.concurrent.f fVar = this.zzo;
        if (fVar == null) {
            return;
        }
        zzgen.zzr(fVar, new zzdrp(this), this.zzg);
        this.zzo = null;
    }

    public final synchronized void zzg(String str, Map map) {
        com.google.common.util.concurrent.f fVar = this.zzo;
        if (fVar == null) {
            return;
        }
        zzgen.zzr(fVar, new zzdrs(this, "sendMessageToNativeJs", map), this.zzg);
    }

    public final synchronized void zzh() {
        com.google.common.util.concurrent.f zzm = zzgen.zzm(zzgen.zzk(new zzgdt() { // from class: com.google.android.gms.internal.ads.zzcjv
            public final /* synthetic */ Context zza;
            public final /* synthetic */ zzavi zzb;
            public final /* synthetic */ zzcei zzc;
            public final /* synthetic */ com.google.android.gms.ads.internal.a zzd;
            public final /* synthetic */ zzehs zze;
            public final /* synthetic */ zzfhl zzf;
            public final /* synthetic */ String zzg;

            public /* synthetic */ zzcjv(Context context, zzavi zzaviVar, zzcei zzceiVar, com.google.android.gms.ads.internal.a aVar, zzehs zzehsVar, zzfhl zzfhlVar, String str) {
                r1 = context;
                r2 = zzaviVar;
                r3 = zzceiVar;
                r4 = aVar;
                r5 = zzehsVar;
                r6 = zzfhlVar;
                r7 = str;
            }

            @Override // com.google.android.gms.internal.ads.zzgdt
            public final com.google.common.util.concurrent.f zza() {
                t.B();
                Context context = r1;
                zzcla zza = zzcla.zza();
                zzavi zzaviVar = r2;
                zzehs zzehsVar = r5;
                com.google.android.gms.ads.internal.a aVar = r4;
                zzcjk zza2 = zzcjx.zza(context, zza, "", false, false, zzaviVar, null, r3, null, null, aVar, zzbbp.zza(), null, null, zzehsVar, r6);
                zzcet zza3 = zzcet.zza(zza2);
                zza2.zzN().zzB(new zzckw() { // from class: com.google.android.gms.internal.ads.zzcju
                    public /* synthetic */ zzcju() {
                    }

                    @Override // com.google.android.gms.internal.ads.zzckw
                    public final void zza(boolean z10, int i10, String str, String str2) {
                        zzcet.this.zzb();
                    }
                });
                zza2.loadUrl(r7);
                return zza3;
            }
        }, zzcep.zze), new zzfws() { // from class: com.google.android.gms.internal.ads.zzdro
            public /* synthetic */ zzdro() {
            }

            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                zzcjk zzcjkVar = (zzcjk) obj;
                zzdrz.this.zza(zzcjkVar);
                return zzcjkVar;
            }
        }, this.zzg);
        this.zzo = zzm;
        zzces.zza(zzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzi(String str, zzbng zzbngVar) {
        com.google.common.util.concurrent.f fVar = this.zzo;
        if (fVar == null) {
            return;
        }
        zzgen.zzr(fVar, new zzdrq(this, str, zzbngVar), this.zzg);
    }

    public final void zzj(WeakReference weakReference, String str, zzbng zzbngVar) {
        zzi(str, new zzdry(this, weakReference, str, zzbngVar, null));
    }

    public final synchronized void zzk(String str, zzbng zzbngVar) {
        com.google.common.util.concurrent.f fVar = this.zzo;
        if (fVar == null) {
            return;
        }
        zzgen.zzr(fVar, new zzdrr(this, str, zzbngVar), this.zzg);
    }
}
