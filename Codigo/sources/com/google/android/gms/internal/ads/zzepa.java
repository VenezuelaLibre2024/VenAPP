package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.u1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzepa {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final Map zze = new HashMap();
    private final Executor zzf;
    private JSONObject zzg;

    public zzepa(Executor executor) {
        this.zzf = executor;
    }

    private final synchronized zzgad zzh(String str) {
        HashMap hashMap;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(t.q().zzi().zzh().zzc())) {
            boolean matches = Pattern.matches((String) a0.c().zza(zzbgc.zzcW), str);
            boolean matches2 = Pattern.matches((String) a0.c().zza(zzbgc.zzcX), str);
            if (matches) {
                hashMap = new HashMap(this.zze);
            } else if (matches2) {
                hashMap = new HashMap(this.zzd);
            }
            return zzgad.zzc(hashMap);
        }
        return zzgad.zzd();
    }

    private final synchronized List zzi(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (jSONObject != null) {
            Bundle zzo = zzo(jSONObject.optJSONObject("data"));
            JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
            if (optJSONArray != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    String optString = optJSONArray.optString(i10, "");
                    if (!TextUtils.isEmpty(optString)) {
                        arrayList2.add(optString);
                    }
                }
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    String str2 = (String) arrayList2.get(i11);
                    zzg(str2);
                    if (((zzepc) this.zza.get(str2)) != null) {
                        arrayList.add(new zzepc(str2, str, zzo));
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void zzj() {
        this.zzb.clear();
        this.zza.clear();
        this.zze.clear();
        this.zzd.clear();
        zzm();
        zzn();
        zzk();
    }

    private final synchronized void zzk() {
        JSONObject zzf;
        Map map;
        if (!((Boolean) zzbig.zzb.zze()).booleanValue()) {
            if (((Boolean) a0.c().zza(zzbgc.zzbM)).booleanValue() && (zzf = t.q().zzi().zzh().zzf()) != null) {
                try {
                    JSONArray jSONArray = zzf.getJSONArray("adapter_settings");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        String optString = jSONObject.optString("adapter_class_name");
                        JSONArray optJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(optString)) {
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                                boolean optBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean optBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean optBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                String optString2 = jSONObject2.optString("platform");
                                zzepe zzepeVar = new zzepe(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                if (optString2.equals("ADMOB")) {
                                    map = this.zzd;
                                } else if (optString2.equals("AD_MANAGER")) {
                                    map = this.zze;
                                }
                                map.put(optString, zzepeVar);
                            }
                        }
                    }
                } catch (JSONException e10) {
                    u1.b("Malformed config loading JSON.", e10);
                }
            }
        }
    }

    private final synchronized void zzl(String str, String str2, List list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.zzc.get(str);
        if (map == null) {
            map = new HashMap();
        }
        this.zzc.put(str, map);
        List list2 = (List) map.get(str2);
        if (list2 == null) {
            list2 = new ArrayList();
        }
        list2.addAll(list);
        map.put(str2, list2);
    }

    private final synchronized void zzm() {
        JSONArray optJSONArray;
        JSONObject zzf = t.q().zzi().zzh().zzf();
        if (zzf != null) {
            try {
                JSONArray optJSONArray2 = zzf.optJSONArray("ad_unit_id_settings");
                this.zzg = zzf.optJSONObject("ad_unit_patterns");
                if (optJSONArray2 != null) {
                    for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i10);
                        String lowerCase = ((Boolean) a0.c().zza(zzbgc.zzkr)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                        String optString = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                arrayList.addAll(zzi(optJSONArray.getJSONObject(i11), optString));
                            }
                        }
                        zzl(optString, lowerCase, arrayList);
                    }
                }
            } catch (JSONException e10) {
                u1.b("Malformed config loading JSON.", e10);
            }
        }
    }

    private final synchronized void zzn() {
        JSONObject zzf;
        if (!((Boolean) zzbig.zzg.zze()).booleanValue()) {
            if (((Boolean) a0.c().zza(zzbgc.zzbL)).booleanValue() && (zzf = t.q().zzi().zzh().zzf()) != null) {
                try {
                    JSONArray jSONArray = zzf.getJSONArray("signal_adapters");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        Bundle zzo = zzo(jSONObject.optJSONObject("data"));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.zzb.put(optString, new zzepe(optString, optBoolean2, optBoolean, true, zzo));
                        }
                    }
                } catch (JSONException e10) {
                    u1.b("Malformed config loading JSON.", e10);
                }
            }
        }
    }

    private static final Bundle zzo(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized Map zza(String str, String str2) {
        HashMap hashMap;
        Map zzb = zzb(str, str2);
        zzgad zzh = zzh(str2);
        hashMap = new HashMap();
        for (Map.Entry entry : ((zzgad) zzb).entrySet()) {
            String str3 = (String) entry.getKey();
            if (zzh.containsKey(str3)) {
                zzepe zzepeVar = (zzepe) zzh.get(str3);
                List list = (List) entry.getValue();
                hashMap.put(str3, new zzepe(str3, zzepeVar.zzb, zzepeVar.zzc, zzepeVar.zzd, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
            }
        }
        zzgce it = zzh.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            String str4 = (String) entry2.getKey();
            if (!hashMap.containsKey(str4) && ((zzepe) entry2.getValue()).zzd) {
                hashMap.put(str4, (zzepe) entry2.getValue());
            }
        }
        return hashMap;
    }

    public final synchronized Map zzb(String str, String str2) {
        Map map;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(t.q().zzi().zzh().zzc()) && (map = (Map) this.zzc.get(str)) != null) {
            List<zzepc> list = (List) map.get(str2);
            if (list == null) {
                String zza = zzduh.zza(this.zzg, str2, str);
                if (((Boolean) a0.c().zza(zzbgc.zzkr)).booleanValue()) {
                    zza = zza.toLowerCase(Locale.ROOT);
                }
                list = (List) map.get(zza);
            }
            if (list != null) {
                HashMap hashMap = new HashMap();
                for (zzepc zzepcVar : list) {
                    String str3 = zzepcVar.zza;
                    if (!hashMap.containsKey(str3)) {
                        hashMap.put(str3, new ArrayList());
                    }
                    ((List) hashMap.get(str3)).add(zzepcVar.zzc);
                }
                return zzgad.zzc(hashMap);
            }
        }
        return zzgad.zzd();
    }

    public final synchronized Map zzc() {
        if (TextUtils.isEmpty(t.q().zzi().zzh().zzc())) {
            return zzgad.zzd();
        }
        return zzgad.zzc(this.zzb);
    }

    public final void zze() {
        t.q().zzi().a(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeoz
            public /* synthetic */ zzeoz() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzepa.this.zzf();
            }
        });
        this.zzf.execute(new zzeoy(this));
    }

    public final /* synthetic */ void zzf() {
        this.zzf.execute(new zzeoy(this));
    }

    public final synchronized void zzg(String str) {
        if (!TextUtils.isEmpty(str) && !this.zza.containsKey(str)) {
            this.zza.put(str, new zzepc(str, "", new Bundle()));
        }
    }
}
