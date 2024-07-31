package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.t;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzbmv implements zzbng {
    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        float floatValue;
        zzcjk zzcjkVar = (zzcjk) obj;
        try {
            JSONObject jSONObject = new JSONObject((String) map.get("args"));
            Iterator<String> keys = jSONObject.keys();
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(zzcjkVar.getContext()).edit();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj2 = jSONObject.get(next);
                if (obj2 instanceof Integer) {
                    edit.putInt(next, ((Integer) obj2).intValue());
                } else if (obj2 instanceof Long) {
                    edit.putLong(next, ((Long) obj2).longValue());
                } else {
                    if (obj2 instanceof Double) {
                        floatValue = ((Double) obj2).floatValue();
                    } else if (obj2 instanceof Float) {
                        floatValue = ((Float) obj2).floatValue();
                    } else if (obj2 instanceof Boolean) {
                        edit.putBoolean(next, ((Boolean) obj2).booleanValue());
                    } else if (obj2 instanceof String) {
                        edit.putString(next, (String) obj2);
                    }
                    edit.putFloat(next, floatValue);
                }
            }
            edit.apply();
        } catch (JSONException e10) {
            t.q().zzw(e10, "GMSG write local storage KV pairs handler");
        }
    }
}
