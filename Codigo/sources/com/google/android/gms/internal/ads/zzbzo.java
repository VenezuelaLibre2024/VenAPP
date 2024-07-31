package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbzo extends zzbzp {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbrn zzd;

    public zzbzo(Context context, zzbrn zzbrnVar) {
        this.zzb = context.getApplicationContext();
        this.zzd = zzbrnVar;
    }

    public static JSONObject zzc(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzcei.zza().zza);
            jSONObject.put("mf", zzbia.zza.zze());
            jSONObject.put("cl", "610756093");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", ca.k.f6983a);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", ca.k.f6983a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final com.google.common.util.concurrent.f zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (t.b().a() - this.zzc.getLong("js_last_update", 0L) < ((Long) zzbia.zzb.zze()).longValue()) {
            return zzgen.zzh(null);
        }
        return zzgen.zzm(this.zzd.zzb(zzc(this.zzb)), new zzfws() { // from class: com.google.android.gms.internal.ads.zzbzn
            public /* synthetic */ zzbzn() {
            }

            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                zzbzo.this.zzb((JSONObject) obj);
                return null;
            }
        }, zzcep.zzf);
    }

    public final /* synthetic */ Void zzb(JSONObject jSONObject) {
        zzbfu zzbfuVar = zzbgc.zza;
        a0.b();
        SharedPreferences.Editor edit = zzbfw.zza(this.zzb).edit();
        a0.a();
        zzbhm zzbhmVar = zzbhr.zza;
        a0.a().zze(edit, 1, jSONObject);
        a0.b();
        edit.commit();
        this.zzc.edit().putLong("js_last_update", t.b().a()).apply();
        return null;
    }
}
