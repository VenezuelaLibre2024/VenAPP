package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdxj {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    public /* synthetic */ zzdxj(String str, zzdxi zzdxiVar) {
        this.zzb = str;
    }

    public static /* bridge */ /* synthetic */ String zza(zzdxj zzdxjVar) {
        String str = (String) a0.c().zza(zzbgc.zzjI);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdxjVar.zza);
            jSONObject.put("eventCategory", zzdxjVar.zzb);
            jSONObject.putOpt("event", zzdxjVar.zzc);
            jSONObject.putOpt("errorCode", zzdxjVar.zzd);
            jSONObject.putOpt("rewardType", zzdxjVar.zze);
            jSONObject.putOpt("rewardAmount", zzdxjVar.zzf);
        } catch (JSONException unused) {
            zzcec.zzj("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
