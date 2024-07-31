package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.d5;
import com.google.android.gms.ads.internal.client.x;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdyr implements zzdba, zzdds, zzdcp {
    private final zzdzd zza;
    private final String zzb;
    private final String zzc;
    private zzdaq zzf;
    private c3 zzg;
    private JSONObject zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private int zzd = 0;
    private zzdyq zze = zzdyq.AD_REQUESTED;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyr(zzdzd zzdzdVar, zzfhh zzfhhVar, String str) {
        this.zza = zzdzdVar;
        this.zzc = str;
        this.zzb = zzfhhVar.zzf;
    }

    private static JSONObject zzh(c3 c3Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", c3Var.f8628c);
        jSONObject.put("errorCode", c3Var.f8626a);
        jSONObject.put("errorDescription", c3Var.f8627b);
        c3 c3Var2 = c3Var.f8629d;
        jSONObject.put("underlyingError", c3Var2 == null ? null : zzh(c3Var2));
        return jSONObject;
    }

    private final JSONObject zzi(zzdaq zzdaqVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzdaqVar.zzg());
        jSONObject.put("responseSecsSinceEpoch", zzdaqVar.zzc());
        jSONObject.put("responseId", zzdaqVar.zzi());
        if (((Boolean) a0.c().zza(zzbgc.zzje)).booleanValue()) {
            String zzd = zzdaqVar.zzd();
            if (!TextUtils.isEmpty(zzd)) {
                zzcec.zze("Bidding data: ".concat(String.valueOf(zzd)));
                jSONObject.put("biddingData", new JSONObject(zzd));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject.put("adResponseBody", this.zzj);
        }
        Object obj = this.zzk;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        if (((Boolean) a0.c().zza(zzbgc.zzjh)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.zzn);
        }
        JSONArray jSONArray = new JSONArray();
        for (d5 d5Var : zzdaqVar.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", d5Var.f8649a);
            jSONObject2.put("latencyMillis", d5Var.f8650b);
            if (((Boolean) a0.c().zza(zzbgc.zzjf)).booleanValue()) {
                jSONObject2.put("credentials", x.b().zzh(d5Var.f8652d));
            }
            c3 c3Var = d5Var.f8651c;
            jSONObject2.put("error", c3Var == null ? null : zzh(c3Var));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zza(zzcwh zzcwhVar) {
        if (this.zza.zzp()) {
            this.zzf = zzcwhVar.zzl();
            this.zze = zzdyq.AD_LOADED;
            if (((Boolean) a0.c().zza(zzbgc.zzjl)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzbK(c3 c3Var) {
        if (this.zza.zzp()) {
            this.zze = zzdyq.AD_LOAD_FAILED;
            this.zzg = c3Var;
            if (((Boolean) a0.c().zza(zzbgc.zzjl)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbw(zzbze zzbzeVar) {
        if (((Boolean) a0.c().zza(zzbgc.zzjl)).booleanValue() || !this.zza.zzp()) {
            return;
        }
        this.zza.zzf(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbx(zzfgy zzfgyVar) {
        if (this.zza.zzp()) {
            if (!zzfgyVar.zzb.zza.isEmpty()) {
                this.zzd = ((zzfgm) zzfgyVar.zzb.zza.get(0)).zzb;
            }
            if (!TextUtils.isEmpty(zzfgyVar.zzb.zzb.zzk)) {
                this.zzh = zzfgyVar.zzb.zzb.zzk;
            }
            if (!TextUtils.isEmpty(zzfgyVar.zzb.zzb.zzl)) {
                this.zzi = zzfgyVar.zzb.zzb.zzl;
            }
            if (((Boolean) a0.c().zza(zzbgc.zzjh)).booleanValue()) {
                if (!this.zza.zzr()) {
                    this.zzn = true;
                    return;
                }
                if (!TextUtils.isEmpty(zzfgyVar.zzb.zzb.zzm)) {
                    this.zzj = zzfgyVar.zzb.zzb.zzm;
                }
                if (zzfgyVar.zzb.zzb.zzn.length() > 0) {
                    this.zzk = zzfgyVar.zzb.zzb.zzn;
                }
                zzdzd zzdzdVar = this.zza;
                JSONObject jSONObject = this.zzk;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.zzj)) {
                    length += this.zzj.length();
                }
                zzdzdVar.zzj(length);
            }
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", this.zze);
        jSONObject2.put("format", zzfgm.zza(this.zzd));
        if (((Boolean) a0.c().zza(zzbgc.zzjl)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.zzl);
            if (this.zzl) {
                jSONObject2.put("shown", this.zzm);
            }
        }
        zzdaq zzdaqVar = this.zzf;
        if (zzdaqVar != null) {
            jSONObject = zzi(zzdaqVar);
        } else {
            c3 c3Var = this.zzg;
            JSONObject jSONObject3 = null;
            if (c3Var != null && (iBinder = c3Var.f8630e) != null) {
                zzdaq zzdaqVar2 = (zzdaq) iBinder;
                jSONObject3 = zzi(zzdaqVar2);
                if (zzdaqVar2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzh(this.zzg));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    public final void zze() {
        this.zzl = true;
    }

    public final void zzf() {
        this.zzm = true;
    }

    public final boolean zzg() {
        return this.zze != zzdyq.AD_REQUESTED;
    }
}
