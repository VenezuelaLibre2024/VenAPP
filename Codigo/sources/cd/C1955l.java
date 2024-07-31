package cd;

import cd.C1947d;
import org.json.JSONObject;
import vc.InterfaceC11867w;

/* renamed from: cd.l */
/* loaded from: classes.dex */
class C1955l implements InterfaceC1951h {
    /* renamed from: b */
    private static C1947d.a m10195b(JSONObject jSONObject) {
        return new C1947d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    /* renamed from: c */
    private static C1947d.b m10196c(JSONObject jSONObject) {
        return new C1947d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* renamed from: d */
    private static long m10197d(InterfaceC11867w interfaceC11867w, long j10, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : interfaceC11867w.mo37894a() + (j10 * 1000);
    }

    @Override // cd.InterfaceC1951h
    /* renamed from: a */
    public C1947d mo10164a(InterfaceC11867w interfaceC11867w, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new C1947d(m10197d(interfaceC11867w, optInt2, jSONObject), m10196c(jSONObject.has("session") ? jSONObject.getJSONObject("session") : new JSONObject()), m10195b(jSONObject.getJSONObject("features")), optInt, optInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
