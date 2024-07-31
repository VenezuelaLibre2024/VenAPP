package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.u1;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbnv implements zzbng {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbng
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(FacebookMediationAdapter.KEY_ID);
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String concat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            zzbnu zzbnuVar = (zzbnu) this.zzb.remove(str);
            if (zzbnuVar == null) {
                zzcec.zzj("Received result for unexpected method invocation: " + str);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                zzbnuVar.zza(str3 + concat);
                return;
            }
            if (str5 == null) {
                zzbnuVar.zzb(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (u1.c()) {
                    u1.a("Result GMSG: " + jSONObject.toString(2));
                }
                zzbnuVar.zzb(jSONObject);
            } catch (JSONException e10) {
                zzbnuVar.zza(e10.getMessage());
            }
        }
    }

    public final com.google.common.util.concurrent.f zzb(zzbqn zzbqnVar, String str, JSONObject jSONObject) {
        zzceu zzceuVar = new zzceu();
        t.r();
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzbnt(this, zzceuVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(FacebookMediationAdapter.KEY_ID, uuid);
            jSONObject2.put("args", jSONObject);
            zzbqnVar.zzl(str, jSONObject2);
        } catch (Exception e10) {
            zzceuVar.zzd(e10);
        }
        return zzceuVar;
    }

    public final void zzc(String str, zzbnu zzbnuVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbnuVar);
        }
    }
}
