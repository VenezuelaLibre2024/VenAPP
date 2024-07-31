package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzazp;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzcdf;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzcep;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z1 implements w1 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f9096b;

    /* renamed from: d, reason: collision with root package name */
    private com.google.common.util.concurrent.f f9098d;

    /* renamed from: f, reason: collision with root package name */
    private SharedPreferences f9100f;

    /* renamed from: g, reason: collision with root package name */
    private SharedPreferences.Editor f9101g;

    /* renamed from: i, reason: collision with root package name */
    private String f9103i;

    /* renamed from: j, reason: collision with root package name */
    private String f9104j;

    /* renamed from: a, reason: collision with root package name */
    private final Object f9095a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List f9097c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private zzazp f9099e = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9102h = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f9105k = true;

    /* renamed from: l, reason: collision with root package name */
    private String f9106l = "-1";

    /* renamed from: m, reason: collision with root package name */
    private String f9107m = "-1";

    /* renamed from: n, reason: collision with root package name */
    private String f9108n = "-1";

    /* renamed from: o, reason: collision with root package name */
    private int f9109o = -1;

    /* renamed from: p, reason: collision with root package name */
    private zzcdf f9110p = new zzcdf("", 0);

    /* renamed from: q, reason: collision with root package name */
    private long f9111q = 0;

    /* renamed from: r, reason: collision with root package name */
    private long f9112r = 0;

    /* renamed from: s, reason: collision with root package name */
    private int f9113s = -1;

    /* renamed from: t, reason: collision with root package name */
    private int f9114t = 0;

    /* renamed from: u, reason: collision with root package name */
    private Set f9115u = Collections.emptySet();

    /* renamed from: v, reason: collision with root package name */
    private JSONObject f9116v = new JSONObject();

    /* renamed from: w, reason: collision with root package name */
    private boolean f9117w = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f9118x = true;

    /* renamed from: y, reason: collision with root package name */
    private String f9119y = null;

    /* renamed from: z, reason: collision with root package name */
    private String f9120z = "";
    private boolean A = false;
    private String B = "";
    private int C = -1;
    private int D = -1;
    private long E = 0;

    private final void r() {
        com.google.common.util.concurrent.f fVar = this.f9098d;
        if (fVar == null || fVar.isDone()) {
            return;
        }
        try {
            this.f9098d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            zzcec.zzk("Interrupted while waiting for preferences loaded.", e10);
        } catch (CancellationException e11) {
            e = e11;
            zzcec.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e12) {
            e = e12;
            zzcec.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e13) {
            e = e13;
            zzcec.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void s() {
        zzcep.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.x1
            @Override // java.lang.Runnable
            public final void run() {
                z1.this.zzg();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void a(Runnable runnable) {
        this.f9097c.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void b(long j10) {
        r();
        synchronized (this.f9095a) {
            if (this.f9111q == j10) {
                return;
            }
            this.f9111q = j10;
            SharedPreferences.Editor editor = this.f9101g;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j10);
                this.f9101g.apply();
            }
            s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void c(String str, String str2) {
        char c10;
        r();
        synchronized (this.f9095a) {
            int hashCode = str.hashCode();
            if (hashCode == -2004976699) {
                if (str.equals("IABTCF_PurposeConsents")) {
                    c10 = 2;
                }
                c10 = 65535;
            } else if (hashCode != 83641339) {
                if (hashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                    c10 = 1;
                }
                c10 = 65535;
            } else {
                if (str.equals("IABTCF_gdprApplies")) {
                    c10 = 0;
                }
                c10 = 65535;
            }
            if (c10 == 0) {
                this.f9106l = str2;
            } else if (c10 == 1) {
                this.f9107m = str2;
            } else if (c10 != 2) {
                return;
            } else {
                this.f9108n = str2;
            }
            if (this.f9101g != null) {
                if (str2.equals("-1")) {
                    this.f9101g.remove(str);
                } else {
                    this.f9101g.putString(str, str2);
                }
                this.f9101g.apply();
            }
            s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void d(long j10) {
        r();
        synchronized (this.f9095a) {
            if (this.f9112r == j10) {
                return;
            }
            this.f9112r = j10;
            SharedPreferences.Editor editor = this.f9101g;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j10);
                this.f9101g.apply();
            }
            s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void e(int i10) {
        r();
        synchronized (this.f9095a) {
            this.f9109o = i10;
            SharedPreferences.Editor editor = this.f9101g;
            if (editor != null) {
                if (i10 == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i10);
                }
                this.f9101g.apply();
            }
            s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void f(int i10) {
        r();
        synchronized (this.f9095a) {
            if (this.f9113s == i10) {
                return;
            }
            this.f9113s = i10;
            SharedPreferences.Editor editor = this.f9101g;
            if (editor != null) {
                editor.putInt("request_in_session_count", i10);
                this.f9101g.apply();
            }
            s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void g(int i10) {
        r();
        synchronized (this.f9095a) {
            if (this.D == i10) {
                return;
            }
            this.D = i10;
            SharedPreferences.Editor editor = this.f9101g;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i10);
                this.f9101g.apply();
            }
            s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void h(boolean z10) {
        r();
        synchronized (this.f9095a) {
            if (z10 == this.f9105k) {
                return;
            }
            this.f9105k = z10;
            SharedPreferences.Editor editor = this.f9101g;
            if (editor != null) {
                editor.putBoolean("gad_idless", z10);
                this.f9101g.apply();
            }
            s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void i(String str) {
        r();
        synchronized (this.f9095a) {
            if (TextUtils.equals(this.f9119y, str)) {
                return;
            }
            this.f9119y = str;
            SharedPreferences.Editor editor = this.f9101g;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.f9101g.apply();
            }
            s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void j(String str) {
        r();
        synchronized (this.f9095a) {
            if (str.equals(this.f9103i)) {
                return;
            }
            this.f9103i = str;
            SharedPreferences.Editor editor = this.f9101g;
            if (editor != null) {
                editor.putString("content_url_hashes", str);
                this.f9101g.apply();
            }
            s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void k(boolean z10) {
        r();
        synchronized (this.f9095a) {
            long currentTimeMillis = System.currentTimeMillis() + ((Long) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjW)).longValue();
            SharedPreferences.Editor editor = this.f9101g;
            if (editor != null) {
                editor.putBoolean("is_topics_ad_personalization_allowed", z10);
                this.f9101g.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                this.f9101g.apply();
            }
            s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void l(String str) {
        r();
        synchronized (this.f9095a) {
            long a10 = com.google.android.gms.ads.internal.t.b().a();
            if (str != null && !str.equals(this.f9110p.zzc())) {
                this.f9110p = new zzcdf(str, a10);
                SharedPreferences.Editor editor = this.f9101g;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.f9101g.putLong("app_settings_last_update_ms", a10);
                    this.f9101g.apply();
                }
                s();
                Iterator it = this.f9097c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                return;
            }
            this.f9110p.zzg(a10);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void m(final Context context) {
        synchronized (this.f9095a) {
            if (this.f9100f != null) {
                return;
            }
            final String str = "admob";
            this.f9098d = zzcep.zza.zza(new Runnable(context, str) { // from class: com.google.android.gms.ads.internal.util.y1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Context f9082b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f9083c = "admob";

                @Override // java.lang.Runnable
                public final void run() {
                    z1.this.q(this.f9082b, this.f9083c);
                }
            });
            this.f9096b = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void n(long j10) {
        r();
        synchronized (this.f9095a) {
            if (this.E == j10) {
                return;
            }
            this.E = j10;
            SharedPreferences.Editor editor = this.f9101g;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j10);
                this.f9101g.apply();
            }
            s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void o(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zziN)).booleanValue()) {
            r();
            synchronized (this.f9095a) {
                if (this.f9120z.equals(str)) {
                    return;
                }
                this.f9120z = str;
                SharedPreferences.Editor editor = this.f9101g;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.f9101g.apply();
                }
                s();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void p(String str, String str2, boolean z10) {
        r();
        synchronized (this.f9095a) {
            JSONArray optJSONArray = this.f9116v.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject == null) {
                    return;
                }
                if (str2.equals(optJSONObject.optString("template_id"))) {
                    if (z10 && optJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    } else {
                        length = i10;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z10);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.t.b().a());
                optJSONArray.put(length, jSONObject);
                this.f9116v.put(str, optJSONArray);
            } catch (JSONException e10) {
                zzcec.zzk("Could not update native advanced settings", e10);
            }
            SharedPreferences.Editor editor = this.f9101g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.f9116v.toString());
                this.f9101g.apply();
            }
            s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void q(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.f9095a) {
            this.f9100f = sharedPreferences;
            this.f9101g = edit;
            if (la.p.g()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.f9102h = this.f9100f.getBoolean("use_https", this.f9102h);
            this.f9117w = this.f9100f.getBoolean("content_url_opted_out", this.f9117w);
            this.f9103i = this.f9100f.getString("content_url_hashes", this.f9103i);
            this.f9105k = this.f9100f.getBoolean("gad_idless", this.f9105k);
            this.f9118x = this.f9100f.getBoolean("content_vertical_opted_out", this.f9118x);
            this.f9104j = this.f9100f.getString("content_vertical_hashes", this.f9104j);
            this.f9114t = this.f9100f.getInt("version_code", this.f9114t);
            this.f9110p = new zzcdf(this.f9100f.getString("app_settings_json", this.f9110p.zzc()), this.f9100f.getLong("app_settings_last_update_ms", this.f9110p.zza()));
            this.f9111q = this.f9100f.getLong("app_last_background_time_ms", this.f9111q);
            this.f9113s = this.f9100f.getInt("request_in_session_count", this.f9113s);
            this.f9112r = this.f9100f.getLong("first_ad_req_time_ms", this.f9112r);
            this.f9115u = this.f9100f.getStringSet("never_pool_slots", this.f9115u);
            this.f9119y = this.f9100f.getString("display_cutout", this.f9119y);
            this.C = this.f9100f.getInt("app_measurement_npa", this.C);
            this.D = this.f9100f.getInt("sd_app_measure_npa", this.D);
            this.E = this.f9100f.getLong("sd_app_measure_npa_ts", this.E);
            this.f9120z = this.f9100f.getString("inspector_info", this.f9120z);
            this.A = this.f9100f.getBoolean("linked_device", this.A);
            this.B = this.f9100f.getString("linked_ad_unit", this.B);
            this.f9106l = this.f9100f.getString("IABTCF_gdprApplies", this.f9106l);
            this.f9108n = this.f9100f.getString("IABTCF_PurposeConsents", this.f9108n);
            this.f9107m = this.f9100f.getString("IABTCF_TCString", this.f9107m);
            this.f9109o = this.f9100f.getInt("gad_has_consent_for_cookies", this.f9109o);
            try {
                this.f9116v = new JSONObject(this.f9100f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e10) {
                zzcec.zzk("Could not convert native advanced settings to json object", e10);
            }
            s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void zzA(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjc)).booleanValue()) {
            r();
            synchronized (this.f9095a) {
                if (this.B.equals(str)) {
                    return;
                }
                this.B = str;
                SharedPreferences.Editor editor = this.f9101g;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.f9101g.apply();
                }
                s();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void zzB(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjc)).booleanValue()) {
            r();
            synchronized (this.f9095a) {
                if (this.A == z10) {
                    return;
                }
                this.A = z10;
                SharedPreferences.Editor editor = this.f9101g;
                if (editor != null) {
                    editor.putBoolean("linked_device", z10);
                    this.f9101g.apply();
                }
                s();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final boolean zzN() {
        boolean z10;
        r();
        synchronized (this.f9095a) {
            z10 = this.f9117w;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final boolean zzO() {
        boolean z10;
        r();
        synchronized (this.f9095a) {
            z10 = this.f9118x;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final boolean zzP() {
        boolean z10;
        r();
        synchronized (this.f9095a) {
            z10 = this.A;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final boolean zzQ() {
        boolean z10;
        if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzau)).booleanValue()) {
            return false;
        }
        r();
        synchronized (this.f9095a) {
            z10 = this.f9105k;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final boolean zzR() {
        r();
        synchronized (this.f9095a) {
            SharedPreferences sharedPreferences = this.f9100f;
            boolean z10 = false;
            if (sharedPreferences == null) {
                return false;
            }
            if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                return false;
            }
            if (this.f9100f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.f9105k) {
                z10 = true;
            }
            return z10;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final int zza() {
        int i10;
        r();
        synchronized (this.f9095a) {
            i10 = this.f9114t;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final int zzb() {
        int i10;
        r();
        synchronized (this.f9095a) {
            i10 = this.f9109o;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final int zzc() {
        int i10;
        r();
        synchronized (this.f9095a) {
            i10 = this.f9113s;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final long zzd() {
        long j10;
        r();
        synchronized (this.f9095a) {
            j10 = this.f9111q;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final long zze() {
        long j10;
        r();
        synchronized (this.f9095a) {
            j10 = this.f9112r;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final long zzf() {
        long j10;
        r();
        synchronized (this.f9095a) {
            j10 = this.E;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final zzazp zzg() {
        if (!this.f9096b) {
            return null;
        }
        if ((zzN() && zzO()) || !((Boolean) zzbhs.zzb.zze()).booleanValue()) {
            return null;
        }
        synchronized (this.f9095a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f9099e == null) {
                this.f9099e = new zzazp();
            }
            this.f9099e.zze();
            zzcec.zzi("start fetching content...");
            return this.f9099e;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final zzcdf zzh() {
        zzcdf zzcdfVar;
        r();
        synchronized (this.f9095a) {
            if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzle)).booleanValue() && this.f9110p.zzj()) {
                Iterator it = this.f9097c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
            zzcdfVar = this.f9110p;
        }
        return zzcdfVar;
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final zzcdf zzi() {
        zzcdf zzcdfVar;
        synchronized (this.f9095a) {
            zzcdfVar = this.f9110p;
        }
        return zzcdfVar;
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final String zzj() {
        String str;
        r();
        synchronized (this.f9095a) {
            str = this.f9103i;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final String zzk() {
        String str;
        r();
        synchronized (this.f9095a) {
            str = this.f9104j;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final String zzl() {
        String str;
        r();
        synchronized (this.f9095a) {
            str = this.B;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final String zzm() {
        String str;
        r();
        synchronized (this.f9095a) {
            str = this.f9119y;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final String zzn(String str) {
        char c10;
        r();
        synchronized (this.f9095a) {
            int hashCode = str.hashCode();
            if (hashCode == -2004976699) {
                if (str.equals("IABTCF_PurposeConsents")) {
                    c10 = 2;
                }
                c10 = 65535;
            } else if (hashCode != 83641339) {
                if (hashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                    c10 = 1;
                }
                c10 = 65535;
            } else {
                if (str.equals("IABTCF_gdprApplies")) {
                    c10 = 0;
                }
                c10 = 65535;
            }
            if (c10 == 0) {
                return this.f9106l;
            }
            if (c10 == 1) {
                return this.f9107m;
            }
            if (c10 != 2) {
                return null;
            }
            return this.f9108n;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final String zzo() {
        String str;
        r();
        synchronized (this.f9095a) {
            str = this.f9120z;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final JSONObject zzp() {
        JSONObject jSONObject;
        r();
        synchronized (this.f9095a) {
            jSONObject = this.f9116v;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void zzs() {
        r();
        synchronized (this.f9095a) {
            this.f9116v = new JSONObject();
            SharedPreferences.Editor editor = this.f9101g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f9101g.apply();
            }
            s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void zzv(int i10) {
        r();
        synchronized (this.f9095a) {
            if (this.f9114t == i10) {
                return;
            }
            this.f9114t = i10;
            SharedPreferences.Editor editor = this.f9101g;
            if (editor != null) {
                editor.putInt("version_code", i10);
                this.f9101g.apply();
            }
            s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void zzx(boolean z10) {
        r();
        synchronized (this.f9095a) {
            if (this.f9117w == z10) {
                return;
            }
            this.f9117w = z10;
            SharedPreferences.Editor editor = this.f9101g;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z10);
                this.f9101g.apply();
            }
            s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void zzy(String str) {
        r();
        synchronized (this.f9095a) {
            if (str.equals(this.f9104j)) {
                return;
            }
            this.f9104j = str;
            SharedPreferences.Editor editor = this.f9101g;
            if (editor != null) {
                editor.putString("content_vertical_hashes", str);
                this.f9101g.apply();
            }
            s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.w1
    public final void zzz(boolean z10) {
        r();
        synchronized (this.f9095a) {
            if (this.f9118x == z10) {
                return;
            }
            this.f9118x = z10;
            SharedPreferences.Editor editor = this.f9101g;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z10);
                this.f9101g.apply();
            }
            s();
        }
    }
}
