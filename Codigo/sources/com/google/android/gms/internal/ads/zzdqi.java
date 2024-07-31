package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdqi {
    private final Executor zza;
    private final zzdqd zzb;

    public zzdqi(Executor executor, zzdqd zzdqdVar) {
        this.zza = executor;
        this.zzb = zzdqdVar;
    }

    public final com.google.common.util.concurrent.f zza(JSONObject jSONObject, String str) {
        String optString;
        com.google.common.util.concurrent.f zzm;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzgen.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
            zzdqh zzdqhVar = null;
            if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                String optString2 = optJSONObject.optString("type");
                if ("string".equals(optString2)) {
                    zzdqhVar = new zzdqh(optString, optJSONObject.optString("string_value"));
                } else if ("image".equals(optString2)) {
                    zzm = zzgen.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzfws() { // from class: com.google.android.gms.internal.ads.zzdqf
                        public final /* synthetic */ String zza;

                        public /* synthetic */ zzdqf(String optString3) {
                            r1 = optString3;
                        }

                        @Override // com.google.android.gms.internal.ads.zzfws
                        public final Object apply(Object obj) {
                            return new zzdqh(r1, (zzbiz) obj);
                        }
                    }, this.zza);
                    arrayList.add(zzm);
                }
            }
            zzm = zzgen.zzh(zzdqhVar);
            arrayList.add(zzm);
        }
        return zzgen.zzm(zzgen.zzd(arrayList), zzdqg.zza, this.zza);
    }
}
