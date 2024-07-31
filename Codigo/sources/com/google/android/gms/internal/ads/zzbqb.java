package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.x;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzbqb {
    public static void zza(zzbqc zzbqcVar, String str, Map map) {
        try {
            zzbqcVar.zze(str, x.b().zzi(map));
        } catch (JSONException unused) {
            zzcec.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbqc zzbqcVar, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("',");
        sb2.append(jSONObject2);
        sb2.append(");");
        zzcec.zze("Dispatching AFMA event: ".concat(sb2.toString()));
        zzbqcVar.zza(sb2.toString());
    }

    public static void zzc(zzbqc zzbqcVar, String str, String str2) {
        zzbqcVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbqc zzbqcVar, String str, JSONObject jSONObject) {
        zzbqcVar.zzb(str, jSONObject.toString());
    }
}
