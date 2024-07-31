package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import c9.a;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.measurement.internal.y6;

/* loaded from: classes2.dex */
public final class y4 extends u6 {

    /* renamed from: z */
    static final Pair<String, Long> f10836z = new Pair<>("", 0L);

    /* renamed from: c */
    private SharedPreferences f10837c;

    /* renamed from: d */
    public c5 f10838d;

    /* renamed from: e */
    public final d5 f10839e;

    /* renamed from: f */
    public final d5 f10840f;

    /* renamed from: g */
    public final e5 f10841g;

    /* renamed from: h */
    private String f10842h;

    /* renamed from: i */
    private boolean f10843i;

    /* renamed from: j */
    private long f10844j;

    /* renamed from: k */
    public final d5 f10845k;

    /* renamed from: l */
    public final b5 f10846l;

    /* renamed from: m */
    public final e5 f10847m;

    /* renamed from: n */
    public final a5 f10848n;

    /* renamed from: o */
    public final b5 f10849o;

    /* renamed from: p */
    public final d5 f10850p;

    /* renamed from: q */
    public final d5 f10851q;

    /* renamed from: r */
    public boolean f10852r;

    /* renamed from: s */
    public b5 f10853s;

    /* renamed from: t */
    public b5 f10854t;

    /* renamed from: u */
    public d5 f10855u;

    /* renamed from: v */
    public final e5 f10856v;

    /* renamed from: w */
    public final e5 f10857w;

    /* renamed from: x */
    public final d5 f10858x;

    /* renamed from: y */
    public final a5 f10859y;

    public y4(w5 w5Var) {
        super(w5Var);
        this.f10845k = new d5(this, "session_timeout", 1800000L);
        this.f10846l = new b5(this, "start_new_session", true);
        this.f10850p = new d5(this, "last_pause_time", 0L);
        this.f10851q = new d5(this, "session_id", 0L);
        this.f10847m = new e5(this, "non_personalized_ads", null);
        this.f10848n = new a5(this, "last_received_uri_timestamps_by_source", null);
        this.f10849o = new b5(this, "allow_remote_dynamite", false);
        this.f10839e = new d5(this, "first_open_time", 0L);
        this.f10840f = new d5(this, "app_install_time", 0L);
        this.f10841g = new e5(this, "app_instance_id", null);
        this.f10853s = new b5(this, "app_backgrounded", false);
        this.f10854t = new b5(this, "deep_link_retrieval_complete", false);
        this.f10855u = new d5(this, "deep_link_retrieval_attempts", 0L);
        this.f10856v = new e5(this, "firebase_feature_rollouts", null);
        this.f10857w = new e5(this, "deferred_attribution_cache", null);
        this.f10858x = new d5(this, "deferred_attribution_cache_timestamp", 0L);
        this.f10859y = new a5(this, "default_event_parameters", null);
    }

    public final SharedPreferences A() {
        i();
        j();
        com.google.android.gms.common.internal.s.j(this.f10837c);
        return this.f10837c;
    }

    public final void B(String str) {
        i();
        SharedPreferences.Editor edit = A().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    public final SparseArray<Long> C() {
        Bundle a10 = this.f10848n.a();
        if (a10 == null) {
            return new SparseArray<>();
        }
        int[] intArray = a10.getIntArray("uriSources");
        long[] longArray = a10.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            zzj().B().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray<>();
        }
        SparseArray<Long> sparseArray = new SparseArray<>();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    public final v D() {
        i();
        return v.c(A().getString("dma_consent_settings", null));
    }

    public final y6 E() {
        i();
        return y6.f(A().getString("consent_settings", "G1"), A().getInt("consent_source", 100));
    }

    public final Boolean F() {
        i();
        if (A().contains("use_service")) {
            return Boolean.valueOf(A().getBoolean("use_service", false));
        }
        return null;
    }

    public final Boolean G() {
        i();
        if (A().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(A().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    public final Boolean H() {
        i();
        if (A().contains("measurement_enabled")) {
            return Boolean.valueOf(A().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final String I() {
        i();
        String string = A().getString("previous_os_version", null);
        c().j();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = A().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    public final String J() {
        i();
        return A().getString("admob_app_id", null);
    }

    public final String K() {
        i();
        return A().getString("gmp_app_id", null);
    }

    public final void L() {
        i();
        Boolean H = H();
        SharedPreferences.Editor edit = A().edit();
        edit.clear();
        edit.apply();
        if (H != null) {
            q(H);
        }
    }

    @Override // com.google.android.gms.measurement.internal.u6
    protected final boolean n() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.u6
    protected final void o() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f10837c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f10852r = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f10837c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f10838d = new c5(this, "health_monitor", Math.max(0L, e0.f10097e.a(null).longValue()));
    }

    public final Pair<String, Boolean> p(String str) {
        i();
        if (zznw.zza() && a().n(e0.R0) && !E().l(y6.a.AD_STORAGE)) {
            return new Pair<>("", Boolean.FALSE);
        }
        long b10 = zzb().b();
        if (this.f10842h != null && b10 < this.f10844j) {
            return new Pair<>(this.f10842h, Boolean.valueOf(this.f10843i));
        }
        this.f10844j = b10 + a().x(str);
        c9.a.d(true);
        try {
            a.C0117a a10 = c9.a.a(zza());
            this.f10842h = "";
            String a11 = a10.a();
            if (a11 != null) {
                this.f10842h = a11;
            }
            this.f10843i = a10.b();
        } catch (Exception e10) {
            zzj().A().b("Unable to get advertising id", e10);
            this.f10842h = "";
        }
        c9.a.d(false);
        return new Pair<>(this.f10842h, Boolean.valueOf(this.f10843i));
    }

    public final void q(Boolean bool) {
        i();
        SharedPreferences.Editor edit = A().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final void r(boolean z10) {
        i();
        SharedPreferences.Editor edit = A().edit();
        edit.putBoolean("use_service", z10);
        edit.apply();
    }

    public final boolean s(int i10) {
        return y6.k(i10, A().getInt("consent_source", 100));
    }

    public final boolean t(long j10) {
        return j10 - this.f10845k.a() > this.f10850p.a();
    }

    public final boolean u(v vVar) {
        i();
        if (!y6.k(vVar.a(), D().a())) {
            return false;
        }
        SharedPreferences.Editor edit = A().edit();
        edit.putString("dma_consent_settings", vVar.i());
        edit.apply();
        return true;
    }

    public final boolean v(y6 y6Var) {
        i();
        int b10 = y6Var.b();
        if (!s(b10)) {
            return false;
        }
        SharedPreferences.Editor edit = A().edit();
        edit.putString("consent_settings", y6Var.v());
        edit.putInt("consent_source", b10);
        edit.apply();
        return true;
    }

    public final boolean w() {
        SharedPreferences sharedPreferences = this.f10837c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    public final void x(Boolean bool) {
        i();
        SharedPreferences.Editor edit = A().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    public final void y(String str) {
        i();
        SharedPreferences.Editor edit = A().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    public final void z(boolean z10) {
        i();
        zzj().F().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = A().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }
}
