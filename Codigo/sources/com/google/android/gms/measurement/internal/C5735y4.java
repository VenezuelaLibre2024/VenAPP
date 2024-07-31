package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.measurement.internal.C5737y6;
import p041c9.C1888a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.y4 */
/* loaded from: classes2.dex */
public final class C5735y4 extends AbstractC5688u6 {

    /* renamed from: z */
    static final Pair<String, Long> f12051z = new Pair<>("", 0L);

    /* renamed from: c */
    private SharedPreferences f12052c;

    /* renamed from: d */
    public C5453c5 f12053d;

    /* renamed from: e */
    public final C5466d5 f12054e;

    /* renamed from: f */
    public final C5466d5 f12055f;

    /* renamed from: g */
    public final C5479e5 f12056g;

    /* renamed from: h */
    private String f12057h;

    /* renamed from: i */
    private boolean f12058i;

    /* renamed from: j */
    private long f12059j;

    /* renamed from: k */
    public final C5466d5 f12060k;

    /* renamed from: l */
    public final C5440b5 f12061l;

    /* renamed from: m */
    public final C5479e5 f12062m;

    /* renamed from: n */
    public final C5427a5 f12063n;

    /* renamed from: o */
    public final C5440b5 f12064o;

    /* renamed from: p */
    public final C5466d5 f12065p;

    /* renamed from: q */
    public final C5466d5 f12066q;

    /* renamed from: r */
    public boolean f12067r;

    /* renamed from: s */
    public C5440b5 f12068s;

    /* renamed from: t */
    public C5440b5 f12069t;

    /* renamed from: u */
    public C5466d5 f12070u;

    /* renamed from: v */
    public final C5479e5 f12071v;

    /* renamed from: w */
    public final C5479e5 f12072w;

    /* renamed from: x */
    public final C5466d5 f12073x;

    /* renamed from: y */
    public final C5427a5 f12074y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5735y4(C5712w5 c5712w5) {
        super(c5712w5);
        this.f12060k = new C5466d5(this, "session_timeout", 1800000L);
        this.f12061l = new C5440b5(this, "start_new_session", true);
        this.f12065p = new C5466d5(this, "last_pause_time", 0L);
        this.f12066q = new C5466d5(this, "session_id", 0L);
        this.f12062m = new C5479e5(this, "non_personalized_ads", null);
        this.f12063n = new C5427a5(this, "last_received_uri_timestamps_by_source", null);
        this.f12064o = new C5440b5(this, "allow_remote_dynamite", false);
        this.f12054e = new C5466d5(this, "first_open_time", 0L);
        this.f12055f = new C5466d5(this, "app_install_time", 0L);
        this.f12056g = new C5479e5(this, "app_instance_id", null);
        this.f12068s = new C5440b5(this, "app_backgrounded", false);
        this.f12069t = new C5440b5(this, "deep_link_retrieval_complete", false);
        this.f12070u = new C5466d5(this, "deep_link_retrieval_attempts", 0L);
        this.f12071v = new C5479e5(this, "firebase_feature_rollouts", null);
        this.f12072w = new C5479e5(this, "deferred_attribution_cache", null);
        this.f12073x = new C5466d5(this, "deferred_attribution_cache_timestamp", 0L);
        this.f12074y = new C5427a5(this, "default_event_parameters", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public final SharedPreferences m14549A() {
        mo13687i();
        m14356j();
        C5276s.m13324j(this.f12052c);
        return this.f12052c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final void m14550B(String str) {
        mo13687i();
        SharedPreferences.Editor edit = m14549A().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public final SparseArray<Long> m14551C() {
        Bundle m13593a = this.f12063n.m13593a();
        if (m13593a == null) {
            return new SparseArray<>();
        }
        int[] intArray = m13593a.getIntArray("uriSources");
        long[] longArray = m13593a.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            zzj().m14182B().m14218a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray<>();
        }
        SparseArray<Long> sparseArray = new SparseArray<>();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public final C5694v m14552D() {
        mo13687i();
        return C5694v.m14365c(m14549A().getString("dma_consent_settings", null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final C5737y6 m14553E() {
        mo13687i();
        return C5737y6.m14575f(m14549A().getString("consent_settings", "G1"), m14549A().getInt("consent_source", 100));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final Boolean m14554F() {
        mo13687i();
        if (m14549A().contains("use_service")) {
            return Boolean.valueOf(m14549A().getBoolean("use_service", false));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public final Boolean m14555G() {
        mo13687i();
        if (m14549A().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(m14549A().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public final Boolean m14556H() {
        mo13687i();
        if (m14549A().contains("measurement_enabled")) {
            return Boolean.valueOf(m14549A().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public final String m14557I() {
        mo13687i();
        String string = m14549A().getString("previous_os_version", null);
        mo13675c().m14356j();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = m14549A().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final String m14558J() {
        mo13687i();
        return m14549A().getString("admob_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public final String m14559K() {
        mo13687i();
        return m14549A().getString("gmp_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public final void m14560L() {
        mo13687i();
        Boolean m14556H = m14556H();
        SharedPreferences.Editor edit = m14549A().edit();
        edit.clear();
        edit.apply();
        if (m14556H != null) {
            m14562q(m14556H);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5688u6
    /* renamed from: n */
    protected final boolean mo14040n() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5688u6
    /* renamed from: o */
    protected final void mo14042o() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f12052c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f12067r = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f12052c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f12053d = new C5453c5(this, "health_monitor", Math.max(0L, C5474e0.f11269e.m13918a(null).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final Pair<String, Boolean> m14561p(String str) {
        mo13687i();
        if (zznw.zza() && mo13672a().m13900n(C5474e0.f11242R0) && !m14553E().m14585l(C5737y6.a.AD_STORAGE)) {
            return new Pair<>("", Boolean.FALSE);
        }
        long mo28131b = zzb().mo28131b();
        if (this.f12057h != null && mo28131b < this.f12059j) {
            return new Pair<>(this.f12057h, Boolean.valueOf(this.f12058i));
        }
        this.f12059j = mo28131b + mo13672a().m13910x(str);
        C1888a.m10033d(true);
        try {
            C1888a.a m10031a = C1888a.m10031a(zza());
            this.f12057h = "";
            String m10041a = m10031a.m10041a();
            if (m10041a != null) {
                this.f12057h = m10041a;
            }
            this.f12058i = m10031a.m10042b();
        } catch (Exception e10) {
            zzj().m14181A().m14219b("Unable to get advertising id", e10);
            this.f12057h = "";
        }
        C1888a.m10033d(false);
        return new Pair<>(this.f12057h, Boolean.valueOf(this.f12058i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final void m14562q(Boolean bool) {
        mo13687i();
        SharedPreferences.Editor edit = m14549A().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final void m14563r(boolean z10) {
        mo13687i();
        SharedPreferences.Editor edit = m14549A().edit();
        edit.putBoolean("use_service", z10);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean m14564s(int i10) {
        return C5737y6.m14580k(i10, m14549A().getInt("consent_source", 100));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean m14565t(long j10) {
        return j10 - this.f12060k.m13720a() > this.f12065p.m13720a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean m14566u(C5694v c5694v) {
        mo13687i();
        if (!C5737y6.m14580k(c5694v.m14368a(), m14552D().m14368a())) {
            return false;
        }
        SharedPreferences.Editor edit = m14549A().edit();
        edit.putString("dma_consent_settings", c5694v.m14373i());
        edit.apply();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean m14567v(C5737y6 c5737y6) {
        mo13687i();
        int m14583b = c5737y6.m14583b();
        if (!m14564s(m14583b)) {
            return false;
        }
        SharedPreferences.Editor edit = m14549A().edit();
        edit.putString("consent_settings", c5737y6.m14593v());
        edit.putInt("consent_source", m14583b);
        edit.apply();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean m14568w() {
        SharedPreferences sharedPreferences = this.f12052c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final void m14569x(Boolean bool) {
        mo13687i();
        SharedPreferences.Editor edit = m14549A().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final void m14570y(String str) {
        mo13687i();
        SharedPreferences.Editor edit = m14549A().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final void m14571z(boolean z10) {
        mo13687i();
        zzj().m14186F().m14219b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = m14549A().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }
}
