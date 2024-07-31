package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.y0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdne extends zzdnf {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final JSONObject zzh;

    public zzdne(zzfgm zzfgmVar, JSONObject jSONObject) {
        super(zzfgmVar);
        this.zzb = y0.g(jSONObject, "tracking_urls_and_actions", "active_view");
        this.zzc = y0.k(false, jSONObject, "allow_pub_owned_ad_view");
        this.zzd = y0.k(false, jSONObject, "attribution", "allow_pub_rendering");
        this.zze = y0.k(false, jSONObject, "enable_omid");
        this.zzg = y0.b("", jSONObject, "watermark_overlay_png_base64");
        this.zzf = jSONObject.optJSONObject("overlay") != null;
        this.zzh = ((Boolean) a0.c().zza(zzbgc.zzeY)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // com.google.android.gms.internal.ads.zzdnf
    public final zzfhk zza() {
        JSONObject jSONObject = this.zzh;
        return jSONObject != null ? new zzfhk(jSONObject) : this.zza.zzW;
    }

    @Override // com.google.android.gms.internal.ads.zzdnf
    public final String zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzdnf
    public final JSONObject zzc() {
        JSONObject jSONObject = this.zzb;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zza.zzA);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnf
    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdnf
    public final boolean zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdnf
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdnf
    public final boolean zzg() {
        return this.zzf;
    }
}
