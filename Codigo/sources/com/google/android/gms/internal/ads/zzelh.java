package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import la.p;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzelh implements zzelb {
    private final zzdlk zza;
    private final zzgey zzb;
    private final zzdpq zzc;
    private final zzfig zzd;
    private final zzdsf zze;

    public zzelh(zzdlk zzdlkVar, zzgey zzgeyVar, zzdpq zzdpqVar, zzfig zzfigVar, zzdsf zzdsfVar) {
        this.zza = zzdlkVar;
        this.zzb = zzgeyVar;
        this.zzc = zzdpqVar;
        this.zzd = zzfigVar;
        this.zze = zzdsfVar;
    }

    private final com.google.common.util.concurrent.f zzg(final zzfgy zzfgyVar, final zzfgm zzfgmVar, final JSONObject jSONObject) {
        zzdpq zzdpqVar = this.zzc;
        final com.google.common.util.concurrent.f zza = this.zzd.zza();
        final com.google.common.util.concurrent.f zza2 = zzdpqVar.zza(zzfgyVar, zzfgmVar, jSONObject);
        return zzgen.zzc(zza, zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzelc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzelh.this.zzc(zza2, zza, zzfgyVar, zzfgmVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzein
    public final com.google.common.util.concurrent.f zza(final zzfgy zzfgyVar, final zzfgm zzfgmVar) {
        return zzgen.zzn(zzgen.zzn(this.zzd.zza(), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzele
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzelh.this.zze(zzfgmVar, (zzdrz) obj);
            }
        }, this.zzb), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzelf
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzelh.this.zzf(zzfgyVar, zzfgmVar, (JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzein
    public final boolean zzb(zzfgy zzfgyVar, zzfgm zzfgmVar) {
        zzfgr zzfgrVar = zzfgmVar.zzt;
        return (zzfgrVar == null || zzfgrVar.zzc == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzdmv zzc(com.google.common.util.concurrent.f fVar, com.google.common.util.concurrent.f fVar2, zzfgy zzfgyVar, zzfgm zzfgmVar, JSONObject jSONObject) {
        zzdna zzdnaVar = (zzdna) fVar.get();
        zzdrz zzdrzVar = (zzdrz) fVar2.get();
        zzdnb zzd = this.zza.zzd(new zzcwx(zzfgyVar, zzfgmVar, null), new zzdnm(zzdnaVar), new zzdlz(jSONObject, zzdrzVar));
        zzd.zzh().zzb();
        zzd.zzk().zza(zzdrzVar);
        zzd.zzg().zza(zzdnaVar.zzs());
        zzd.zzl().zza(this.zze);
        return zzd.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zzd(zzdrz zzdrzVar, JSONObject jSONObject) {
        this.zzd.zzb(zzgen.zzh(zzdrzVar));
        if (jSONObject.optBoolean("success")) {
            return zzgen.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbrm("process json failed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zze(zzfgm zzfgmVar, final zzdrz zzdrzVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) a0.c().zza(zzbgc.zziw)).booleanValue() && p.l()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfgmVar.zzt.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgen.zzn(zzdrzVar.zzd("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzeld
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzelh.this.zzd(zzdrzVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zzf(zzfgy zzfgyVar, zzfgm zzfgmVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzgen.zzg(new zzead(3));
        }
        int i10 = 0;
        if (zzfgyVar.zza.zza.zzk <= 1) {
            return zzgen.zzm(zzg(zzfgyVar, zzfgmVar, jSONArray.getJSONObject(0)), new zzfws() { // from class: com.google.android.gms.internal.ads.zzelg
                @Override // com.google.android.gms.internal.ads.zzfws
                public final Object apply(Object obj) {
                    return Collections.singletonList(zzgen.zzh((zzdmv) obj));
                }
            }, this.zzb);
        }
        int length = jSONArray.length();
        this.zzd.zzc(Math.min(length, zzfgyVar.zza.zza.zzk));
        ArrayList arrayList = new ArrayList(zzfgyVar.zza.zza.zzk);
        while (i10 < zzfgyVar.zza.zza.zzk) {
            arrayList.add(i10 < length ? zzg(zzfgyVar, zzfgmVar, jSONArray.getJSONObject(i10)) : zzgen.zzg(new zzead(3)));
            i10++;
        }
        return zzgen.zzh(arrayList);
    }
}
