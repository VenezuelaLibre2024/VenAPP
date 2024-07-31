package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.u1;
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
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    private Context f8848a;

    /* renamed from: b */
    private long f8849b = 0;

    public final void a(Context context, zzcei zzceiVar, String str, Runnable runnable, zzfnc zzfncVar) {
        b(context, zzceiVar, true, null, str, null, runnable, zzfncVar);
    }

    final void b(Context context, zzcei zzceiVar, boolean z10, zzcdf zzcdfVar, String str, String str2, Runnable runnable, zzfnc zzfncVar) {
        PackageInfo f10;
        if (t.b().b() - this.f8849b < 5000) {
            zzcec.zzj("Not retrying to fetch app settings");
            return;
        }
        this.f8849b = t.b().b();
        if (zzcdfVar != null && !TextUtils.isEmpty(zzcdfVar.zzc())) {
            if (t.b().a() - zzcdfVar.zza() <= ((Long) a0.c().zza(zzbgc.zzdY)).longValue() && zzcdfVar.zzi()) {
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
        this.f8848a = applicationContext;
        zzfmo zza = zzfmn.zza(context, 4);
        zza.zzh();
        zzbrx zza2 = t.h().zza(this.f8848a, zzceiVar, zzfncVar);
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
            jSONObject.put("experiment_ids", TextUtils.join(",", a0.a().zza()));
            jSONObject.put("js", zzceiVar.zza);
            try {
                ApplicationInfo applicationInfo = this.f8848a.getApplicationInfo();
                if (applicationInfo != null && (f10 = na.e.a(context).f(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", f10.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                u1.a("Error fetching PackageInfo.");
            }
            com.google.common.util.concurrent.f zzb = zza3.zzb(jSONObject);
            d dVar = new zzgdu() { // from class: com.google.android.gms.ads.internal.d

                /* renamed from: b */
                public final /* synthetic */ zzfmo f8847b;

                public /* synthetic */ d(zzfmo zza4) {
                    r2 = zza4;
                }

                @Override // com.google.android.gms.internal.ads.zzgdu
                public final com.google.common.util.concurrent.f zza(Object obj) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (optBoolean) {
                        t.q().zzi().l(jSONObject2.getString("appSettingsJson"));
                    }
                    zzfmo zzfmoVar = r2;
                    zzfnc zzfncVar2 = zzfnc.this;
                    zzfmoVar.zzf(optBoolean);
                    zzfncVar2.zzb(zzfmoVar.zzl());
                    return zzgen.zzh(null);
                }
            };
            zzgey zzgeyVar = zzcep.zzf;
            com.google.common.util.concurrent.f zzn = zzgen.zzn(zzb, dVar, zzgeyVar);
            if (runnable != null) {
                zzb.addListener(runnable, zzgeyVar);
            }
            zzces.zza(zzn, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e10) {
            zzcec.zzh("Error requesting application settings", e10);
            zza4.zzg(e10);
            zza4.zzf(false);
            zzfncVar.zzb(zza4.zzl());
        }
    }

    public final void c(Context context, zzcei zzceiVar, String str, zzcdf zzcdfVar, zzfnc zzfncVar) {
        b(context, zzceiVar, false, zzcdfVar, zzcdfVar != null ? zzcdfVar.zzb() : null, str, null, zzfncVar);
    }
}
