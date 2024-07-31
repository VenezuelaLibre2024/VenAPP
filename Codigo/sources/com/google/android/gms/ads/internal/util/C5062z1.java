package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.internal.ads.zzazp;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzcdf;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzcep;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import la.C9471p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.util.z1 */
/* loaded from: classes.dex */
public final class C5062z1 implements InterfaceC5053w1 {

    /* renamed from: b */
    private boolean f10200b;

    /* renamed from: d */
    private InterfaceFutureC5920f f10202d;

    /* renamed from: f */
    private SharedPreferences f10204f;

    /* renamed from: g */
    private SharedPreferences.Editor f10205g;

    /* renamed from: i */
    private String f10207i;

    /* renamed from: j */
    private String f10208j;

    /* renamed from: a */
    private final Object f10199a = new Object();

    /* renamed from: c */
    private final List f10201c = new ArrayList();

    /* renamed from: e */
    private zzazp f10203e = null;

    /* renamed from: h */
    private boolean f10206h = true;

    /* renamed from: k */
    private boolean f10209k = true;

    /* renamed from: l */
    private String f10210l = "-1";

    /* renamed from: m */
    private String f10211m = "-1";

    /* renamed from: n */
    private String f10212n = "-1";

    /* renamed from: o */
    private int f10213o = -1;

    /* renamed from: p */
    private zzcdf f10214p = new zzcdf("", 0);

    /* renamed from: q */
    private long f10215q = 0;

    /* renamed from: r */
    private long f10216r = 0;

    /* renamed from: s */
    private int f10217s = -1;

    /* renamed from: t */
    private int f10218t = 0;

    /* renamed from: u */
    private Set f10219u = Collections.emptySet();

    /* renamed from: v */
    private JSONObject f10220v = new JSONObject();

    /* renamed from: w */
    private boolean f10221w = true;

    /* renamed from: x */
    private boolean f10222x = true;

    /* renamed from: y */
    private String f10223y = null;

    /* renamed from: z */
    private String f10224z = "";

    /* renamed from: A */
    private boolean f10194A = false;

    /* renamed from: B */
    private String f10195B = "";

    /* renamed from: C */
    private int f10196C = -1;

    /* renamed from: D */
    private int f10197D = -1;

    /* renamed from: E */
    private long f10198E = 0;

    /* renamed from: r */
    private final void m12798r() {
        InterfaceFutureC5920f interfaceFutureC5920f = this.f10202d;
        if (interfaceFutureC5920f == null || interfaceFutureC5920f.isDone()) {
            return;
        }
        try {
            this.f10202d.get(1L, TimeUnit.SECONDS);
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

    /* renamed from: s */
    private final void m12799s() {
        zzcep.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.x1
            @Override // java.lang.Runnable
            public final void run() {
                C5062z1.this.zzg();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    /* renamed from: a */
    public final void mo12750a(Runnable runnable) {
        this.f10201c.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    /* renamed from: b */
    public final void mo12751b(long j10) {
        m12798r();
        synchronized (this.f10199a) {
            if (this.f10215q == j10) {
                return;
            }
            this.f10215q = j10;
            SharedPreferences.Editor editor = this.f10205g;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j10);
                this.f10205g.apply();
            }
            m12799s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    /* renamed from: c */
    public final void mo12752c(String str, String str2) {
        char c10;
        m12798r();
        synchronized (this.f10199a) {
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
                this.f10210l = str2;
            } else if (c10 == 1) {
                this.f10211m = str2;
            } else if (c10 != 2) {
                return;
            } else {
                this.f10212n = str2;
            }
            if (this.f10205g != null) {
                if (str2.equals("-1")) {
                    this.f10205g.remove(str);
                } else {
                    this.f10205g.putString(str, str2);
                }
                this.f10205g.apply();
            }
            m12799s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    /* renamed from: d */
    public final void mo12753d(long j10) {
        m12798r();
        synchronized (this.f10199a) {
            if (this.f10216r == j10) {
                return;
            }
            this.f10216r = j10;
            SharedPreferences.Editor editor = this.f10205g;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j10);
                this.f10205g.apply();
            }
            m12799s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    /* renamed from: e */
    public final void mo12754e(int i10) {
        m12798r();
        synchronized (this.f10199a) {
            this.f10213o = i10;
            SharedPreferences.Editor editor = this.f10205g;
            if (editor != null) {
                if (i10 == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i10);
                }
                this.f10205g.apply();
            }
            m12799s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    /* renamed from: f */
    public final void mo12755f(int i10) {
        m12798r();
        synchronized (this.f10199a) {
            if (this.f10217s == i10) {
                return;
            }
            this.f10217s = i10;
            SharedPreferences.Editor editor = this.f10205g;
            if (editor != null) {
                editor.putInt("request_in_session_count", i10);
                this.f10205g.apply();
            }
            m12799s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    /* renamed from: g */
    public final void mo12756g(int i10) {
        m12798r();
        synchronized (this.f10199a) {
            if (this.f10197D == i10) {
                return;
            }
            this.f10197D = i10;
            SharedPreferences.Editor editor = this.f10205g;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i10);
                this.f10205g.apply();
            }
            m12799s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    /* renamed from: h */
    public final void mo12757h(boolean z10) {
        m12798r();
        synchronized (this.f10199a) {
            if (z10 == this.f10209k) {
                return;
            }
            this.f10209k = z10;
            SharedPreferences.Editor editor = this.f10205g;
            if (editor != null) {
                editor.putBoolean("gad_idless", z10);
                this.f10205g.apply();
            }
            m12799s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    /* renamed from: i */
    public final void mo12758i(String str) {
        m12798r();
        synchronized (this.f10199a) {
            if (TextUtils.equals(this.f10223y, str)) {
                return;
            }
            this.f10223y = str;
            SharedPreferences.Editor editor = this.f10205g;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.f10205g.apply();
            }
            m12799s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    /* renamed from: j */
    public final void mo12759j(String str) {
        m12798r();
        synchronized (this.f10199a) {
            if (str.equals(this.f10207i)) {
                return;
            }
            this.f10207i = str;
            SharedPreferences.Editor editor = this.f10205g;
            if (editor != null) {
                editor.putString("content_url_hashes", str);
                this.f10205g.apply();
            }
            m12799s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    /* renamed from: k */
    public final void mo12760k(boolean z10) {
        m12798r();
        synchronized (this.f10199a) {
            long currentTimeMillis = System.currentTimeMillis() + ((Long) C4784a0.m12365c().zza(zzbgc.zzjW)).longValue();
            SharedPreferences.Editor editor = this.f10205g;
            if (editor != null) {
                editor.putBoolean("is_topics_ad_personalization_allowed", z10);
                this.f10205g.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                this.f10205g.apply();
            }
            m12799s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    /* renamed from: l */
    public final void mo12761l(String str) {
        m12798r();
        synchronized (this.f10199a) {
            long mo28130a = C4965t.m12565b().mo28130a();
            if (str != null && !str.equals(this.f10214p.zzc())) {
                this.f10214p = new zzcdf(str, mo28130a);
                SharedPreferences.Editor editor = this.f10205g;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.f10205g.putLong("app_settings_last_update_ms", mo28130a);
                    this.f10205g.apply();
                }
                m12799s();
                Iterator it = this.f10201c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                return;
            }
            this.f10214p.zzg(mo28130a);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    /* renamed from: m */
    public final void mo12762m(final Context context) {
        synchronized (this.f10199a) {
            if (this.f10204f != null) {
                return;
            }
            final String str = "admob";
            this.f10202d = zzcep.zza.zza(new Runnable(context, str) { // from class: com.google.android.gms.ads.internal.util.y1

                /* renamed from: b */
                public final /* synthetic */ Context f10181b;

                /* renamed from: c */
                public final /* synthetic */ String f10182c = "admob";

                @Override // java.lang.Runnable
                public final void run() {
                    C5062z1.this.m12800q(this.f10181b, this.f10182c);
                }
            });
            this.f10200b = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    /* renamed from: n */
    public final void mo12763n(long j10) {
        m12798r();
        synchronized (this.f10199a) {
            if (this.f10198E == j10) {
                return;
            }
            this.f10198E = j10;
            SharedPreferences.Editor editor = this.f10205g;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j10);
                this.f10205g.apply();
            }
            m12799s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    /* renamed from: o */
    public final void mo12764o(String str) {
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zziN)).booleanValue()) {
            m12798r();
            synchronized (this.f10199a) {
                if (this.f10224z.equals(str)) {
                    return;
                }
                this.f10224z = str;
                SharedPreferences.Editor editor = this.f10205g;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.f10205g.apply();
                }
                m12799s();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    /* renamed from: p */
    public final void mo12765p(String str, String str2, boolean z10) {
        m12798r();
        synchronized (this.f10199a) {
            JSONArray optJSONArray = this.f10220v.optJSONArray(str);
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
                jSONObject.put("timestamp_ms", C4965t.m12565b().mo28130a());
                optJSONArray.put(length, jSONObject);
                this.f10220v.put(str, optJSONArray);
            } catch (JSONException e10) {
                zzcec.zzk("Could not update native advanced settings", e10);
            }
            SharedPreferences.Editor editor = this.f10205g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.f10220v.toString());
                this.f10205g.apply();
            }
            m12799s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void m12800q(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.f10199a) {
            this.f10204f = sharedPreferences;
            this.f10205g = edit;
            if (C9471p.m28170g()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.f10206h = this.f10204f.getBoolean("use_https", this.f10206h);
            this.f10221w = this.f10204f.getBoolean("content_url_opted_out", this.f10221w);
            this.f10207i = this.f10204f.getString("content_url_hashes", this.f10207i);
            this.f10209k = this.f10204f.getBoolean("gad_idless", this.f10209k);
            this.f10222x = this.f10204f.getBoolean("content_vertical_opted_out", this.f10222x);
            this.f10208j = this.f10204f.getString("content_vertical_hashes", this.f10208j);
            this.f10218t = this.f10204f.getInt("version_code", this.f10218t);
            this.f10214p = new zzcdf(this.f10204f.getString("app_settings_json", this.f10214p.zzc()), this.f10204f.getLong("app_settings_last_update_ms", this.f10214p.zza()));
            this.f10215q = this.f10204f.getLong("app_last_background_time_ms", this.f10215q);
            this.f10217s = this.f10204f.getInt("request_in_session_count", this.f10217s);
            this.f10216r = this.f10204f.getLong("first_ad_req_time_ms", this.f10216r);
            this.f10219u = this.f10204f.getStringSet("never_pool_slots", this.f10219u);
            this.f10223y = this.f10204f.getString("display_cutout", this.f10223y);
            this.f10196C = this.f10204f.getInt("app_measurement_npa", this.f10196C);
            this.f10197D = this.f10204f.getInt("sd_app_measure_npa", this.f10197D);
            this.f10198E = this.f10204f.getLong("sd_app_measure_npa_ts", this.f10198E);
            this.f10224z = this.f10204f.getString("inspector_info", this.f10224z);
            this.f10194A = this.f10204f.getBoolean("linked_device", this.f10194A);
            this.f10195B = this.f10204f.getString("linked_ad_unit", this.f10195B);
            this.f10210l = this.f10204f.getString("IABTCF_gdprApplies", this.f10210l);
            this.f10212n = this.f10204f.getString("IABTCF_PurposeConsents", this.f10212n);
            this.f10211m = this.f10204f.getString("IABTCF_TCString", this.f10211m);
            this.f10213o = this.f10204f.getInt("gad_has_consent_for_cookies", this.f10213o);
            try {
                this.f10220v = new JSONObject(this.f10204f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e10) {
                zzcec.zzk("Could not convert native advanced settings to json object", e10);
            }
            m12799s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final void zzA(String str) {
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzjc)).booleanValue()) {
            m12798r();
            synchronized (this.f10199a) {
                if (this.f10195B.equals(str)) {
                    return;
                }
                this.f10195B = str;
                SharedPreferences.Editor editor = this.f10205g;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.f10205g.apply();
                }
                m12799s();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final void zzB(boolean z10) {
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzjc)).booleanValue()) {
            m12798r();
            synchronized (this.f10199a) {
                if (this.f10194A == z10) {
                    return;
                }
                this.f10194A = z10;
                SharedPreferences.Editor editor = this.f10205g;
                if (editor != null) {
                    editor.putBoolean("linked_device", z10);
                    this.f10205g.apply();
                }
                m12799s();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final boolean zzN() {
        boolean z10;
        m12798r();
        synchronized (this.f10199a) {
            z10 = this.f10221w;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final boolean zzO() {
        boolean z10;
        m12798r();
        synchronized (this.f10199a) {
            z10 = this.f10222x;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final boolean zzP() {
        boolean z10;
        m12798r();
        synchronized (this.f10199a) {
            z10 = this.f10194A;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final boolean zzQ() {
        boolean z10;
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzau)).booleanValue()) {
            return false;
        }
        m12798r();
        synchronized (this.f10199a) {
            z10 = this.f10209k;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final boolean zzR() {
        m12798r();
        synchronized (this.f10199a) {
            SharedPreferences sharedPreferences = this.f10204f;
            boolean z10 = false;
            if (sharedPreferences == null) {
                return false;
            }
            if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                return false;
            }
            if (this.f10204f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.f10209k) {
                z10 = true;
            }
            return z10;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final int zza() {
        int i10;
        m12798r();
        synchronized (this.f10199a) {
            i10 = this.f10218t;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final int zzb() {
        int i10;
        m12798r();
        synchronized (this.f10199a) {
            i10 = this.f10213o;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final int zzc() {
        int i10;
        m12798r();
        synchronized (this.f10199a) {
            i10 = this.f10217s;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final long zzd() {
        long j10;
        m12798r();
        synchronized (this.f10199a) {
            j10 = this.f10215q;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final long zze() {
        long j10;
        m12798r();
        synchronized (this.f10199a) {
            j10 = this.f10216r;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final long zzf() {
        long j10;
        m12798r();
        synchronized (this.f10199a) {
            j10 = this.f10198E;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final zzazp zzg() {
        if (!this.f10200b) {
            return null;
        }
        if ((zzN() && zzO()) || !((Boolean) zzbhs.zzb.zze()).booleanValue()) {
            return null;
        }
        synchronized (this.f10199a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f10203e == null) {
                this.f10203e = new zzazp();
            }
            this.f10203e.zze();
            zzcec.zzi("start fetching content...");
            return this.f10203e;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final zzcdf zzh() {
        zzcdf zzcdfVar;
        m12798r();
        synchronized (this.f10199a) {
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzle)).booleanValue() && this.f10214p.zzj()) {
                Iterator it = this.f10201c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
            zzcdfVar = this.f10214p;
        }
        return zzcdfVar;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final zzcdf zzi() {
        zzcdf zzcdfVar;
        synchronized (this.f10199a) {
            zzcdfVar = this.f10214p;
        }
        return zzcdfVar;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final String zzj() {
        String str;
        m12798r();
        synchronized (this.f10199a) {
            str = this.f10207i;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final String zzk() {
        String str;
        m12798r();
        synchronized (this.f10199a) {
            str = this.f10208j;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final String zzl() {
        String str;
        m12798r();
        synchronized (this.f10199a) {
            str = this.f10195B;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final String zzm() {
        String str;
        m12798r();
        synchronized (this.f10199a) {
            str = this.f10223y;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final String zzn(String str) {
        char c10;
        m12798r();
        synchronized (this.f10199a) {
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
                return this.f10210l;
            }
            if (c10 == 1) {
                return this.f10211m;
            }
            if (c10 != 2) {
                return null;
            }
            return this.f10212n;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final String zzo() {
        String str;
        m12798r();
        synchronized (this.f10199a) {
            str = this.f10224z;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final JSONObject zzp() {
        JSONObject jSONObject;
        m12798r();
        synchronized (this.f10199a) {
            jSONObject = this.f10220v;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final void zzs() {
        m12798r();
        synchronized (this.f10199a) {
            this.f10220v = new JSONObject();
            SharedPreferences.Editor editor = this.f10205g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f10205g.apply();
            }
            m12799s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final void zzv(int i10) {
        m12798r();
        synchronized (this.f10199a) {
            if (this.f10218t == i10) {
                return;
            }
            this.f10218t = i10;
            SharedPreferences.Editor editor = this.f10205g;
            if (editor != null) {
                editor.putInt("version_code", i10);
                this.f10205g.apply();
            }
            m12799s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final void zzx(boolean z10) {
        m12798r();
        synchronized (this.f10199a) {
            if (this.f10221w == z10) {
                return;
            }
            this.f10221w = z10;
            SharedPreferences.Editor editor = this.f10205g;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z10);
                this.f10205g.apply();
            }
            m12799s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final void zzy(String str) {
        m12798r();
        synchronized (this.f10199a) {
            if (str.equals(this.f10208j)) {
                return;
            }
            this.f10208j = str;
            SharedPreferences.Editor editor = this.f10205g;
            if (editor != null) {
                editor.putString("content_vertical_hashes", str);
                this.f10205g.apply();
            }
            m12799s();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC5053w1
    public final void zzz(boolean z10) {
        m12798r();
        synchronized (this.f10199a) {
            if (this.f10222x == z10) {
                return;
            }
            this.f10222x = z10;
            SharedPreferences.Editor editor = this.f10205g;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z10);
                this.f10205g.apply();
            }
            m12799s();
        }
    }
}
