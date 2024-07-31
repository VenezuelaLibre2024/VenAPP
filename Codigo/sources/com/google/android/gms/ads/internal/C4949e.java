package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.ads.internal.util.C5047u1;
import com.google.android.gms.internal.ads.zzbfu;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbrn;
import com.google.android.gms.internal.ads.zzbrr;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzbrx;
import com.google.android.gms.internal.ads.zzcdf;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcep;
import com.google.android.gms.internal.ads.zzces;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmo;
import com.google.android.gms.internal.ads.zzfnc;
import com.google.android.gms.internal.ads.zzgdu;
import com.google.android.gms.internal.ads.zzgen;
import com.google.android.gms.internal.ads.zzgey;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import na.C9696e;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.e */
/* loaded from: classes.dex */
public final class C4949e {

    /* renamed from: a */
    private Context f9935a;

    /* renamed from: b */
    private long f9936b = 0;

    /* renamed from: a */
    public final void m12532a(Context context, zzcei zzceiVar, String str, Runnable runnable, zzfnc zzfncVar) {
        m12533b(context, zzceiVar, true, null, str, null, runnable, zzfncVar);
    }

    /* renamed from: b */
    final void m12533b(Context context, zzcei zzceiVar, boolean z10, zzcdf zzcdfVar, String str, String str2, Runnable runnable, final zzfnc zzfncVar) {
        PackageInfo m29077f;
        if (C4965t.m12565b().mo28131b() - this.f9936b < 5000) {
            zzcec.zzj("Not retrying to fetch app settings");
            return;
        }
        this.f9936b = C4965t.m12565b().mo28131b();
        if (zzcdfVar != null && !TextUtils.isEmpty(zzcdfVar.zzc())) {
            if (C4965t.m12565b().mo28130a() - zzcdfVar.zza() <= ((Long) C4784a0.m12365c().zza(zzbgc.zzdY)).longValue() && zzcdfVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            zzcec.zzj("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            zzcec.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f9935a = applicationContext;
        final zzfmo zza = zzfmn.zza(context, 4);
        zza.zzh();
        zzbrx zza2 = C4965t.m12571h().zza(this.f9935a, zzceiVar, zzfncVar);
        zzbrr zzbrrVar = zzbru.zza;
        zzbrn zza3 = zza2.zza("google.afma.config.fetchAppSettings", zzbrrVar, zzbrrVar);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z10);
            jSONObject.put("pn", context.getPackageName());
            zzbfu zzbfuVar = zzbgc.zza;
            jSONObject.put("experiment_ids", TextUtils.join(",", C4784a0.m12363a().zza()));
            jSONObject.put("js", zzceiVar.zza);
            try {
                ApplicationInfo applicationInfo = this.f9935a.getApplicationInfo();
                if (applicationInfo != null && (m29077f = C9696e.m29080a(context).m29077f(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", m29077f.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                C5047u1.m12726a("Error fetching PackageInfo.");
            }
            InterfaceFutureC5920f zzb = zza3.zzb(jSONObject);
            zzgdu zzgduVar = new zzgdu() { // from class: com.google.android.gms.ads.internal.d
                @Override // com.google.android.gms.internal.ads.zzgdu
                public final InterfaceFutureC5920f zza(Object obj) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (optBoolean) {
                        C4965t.m12580q().zzi().mo12761l(jSONObject2.getString("appSettingsJson"));
                    }
                    zzfmo zzfmoVar = zza;
                    zzfnc zzfncVar2 = zzfnc.this;
                    zzfmoVar.zzf(optBoolean);
                    zzfncVar2.zzb(zzfmoVar.zzl());
                    return zzgen.zzh(null);
                }
            };
            zzgey zzgeyVar = zzcep.zzf;
            InterfaceFutureC5920f zzn = zzgen.zzn(zzb, zzgduVar, zzgeyVar);
            if (runnable != null) {
                zzb.addListener(runnable, zzgeyVar);
            }
            zzces.zza(zzn, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e10) {
            zzcec.zzh("Error requesting application settings", e10);
            zza.zzg(e10);
            zza.zzf(false);
            zzfncVar.zzb(zza.zzl());
        }
    }

    /* renamed from: c */
    public final void m12534c(Context context, zzcei zzceiVar, String str, zzcdf zzcdfVar, zzfnc zzfncVar) {
        m12533b(context, zzceiVar, false, zzcdfVar, zzcdfVar != null ? zzcdfVar.zzb() : null, str, null, zzfncVar);
    }
}
