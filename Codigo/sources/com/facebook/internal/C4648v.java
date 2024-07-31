package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.C4625j;
import com.facebook.internal.C4641r;
import com.facebook.internal.C4648v;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dk.C7031r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p073e2.C7099c;
import p152i4.C7799e0;
import p152i4.C7807i0;
import p232m4.C9544e;
import p303q4.C10269i;
import p303q4.C10270j;

/* renamed from: com.facebook.internal.v */
/* loaded from: classes.dex */
public final class C4648v {

    /* renamed from: a */
    public static final C4648v f8854a = new C4648v();

    /* renamed from: b */
    private static final String f8855b = C4648v.class.getSimpleName();

    /* renamed from: c */
    private static final List<String> f8856c;

    /* renamed from: d */
    private static final Map<String, C4641r> f8857d;

    /* renamed from: e */
    private static final AtomicReference<a> f8858e;

    /* renamed from: f */
    private static final ConcurrentLinkedQueue<b> f8859f;

    /* renamed from: g */
    private static boolean f8860g;

    /* renamed from: h */
    private static JSONArray f8861h;

    /* renamed from: com.facebook.internal.v$a */
    /* loaded from: classes.dex */
    public enum a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* renamed from: com.facebook.internal.v$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo10977a();

        /* renamed from: b */
        void mo10978b(C4641r c4641r);
    }

    static {
        List<String> m20584l;
        m20584l = C7031r.m20584l("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled");
        f8856c = m20584l;
        f8857d = new ConcurrentHashMap();
        f8858e = new AtomicReference<>(a.NOT_LOADED);
        f8859f = new ConcurrentLinkedQueue<>();
    }

    private C4648v() {
    }

    /* renamed from: d */
    public static final void m11445d(b callback) {
        C9322n.m27781e(callback, "callback");
        f8859f.add(callback);
        m11449h();
    }

    /* renamed from: e */
    private final JSONObject m11446e(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f8856c);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        C7807i0 m24001x = C7807i0.f18658n.m24001x(null, "app", null);
        m24001x.m23944E(true);
        m24001x.m23947H(bundle);
        JSONObject m24063d = m24001x.m23949k().m24063d();
        return m24063d == null ? new JSONObject() : m24063d;
    }

    /* renamed from: f */
    public static final C4641r m11447f(String str) {
        if (str != null) {
            return f8857d.get(str);
        }
        return null;
    }

    /* renamed from: g */
    public static final Map<String, Boolean> m11448g() {
        JSONObject jSONObject;
        Context m23860l = C7799e0.m23860l();
        String m23861m = C7799e0.m23861m();
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{m23861m}, 1));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        String string = m23860l.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(format, null);
        if (!C4634n0.m11300d0(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                C4634n0.m11312j0("FacebookSDK", e10);
                jSONObject = null;
            }
            if (jSONObject != null) {
                return f8854a.m11452l(jSONObject);
            }
        }
        return null;
    }

    /* renamed from: h */
    public static final void m11449h() {
        final Context m23860l = C7799e0.m23860l();
        final String m23861m = C7799e0.m23861m();
        if (C4634n0.m11300d0(m23861m)) {
            f8858e.set(a.ERROR);
            f8854a.m11454n();
            return;
        }
        if (f8857d.containsKey(m23861m)) {
            f8858e.set(a.SUCCESS);
            f8854a.m11454n();
            return;
        }
        AtomicReference<a> atomicReference = f8858e;
        a aVar = a.NOT_LOADED;
        a aVar2 = a.LOADING;
        if (!(C7099c.m20926a(atomicReference, aVar, aVar2) || C7099c.m20926a(atomicReference, a.ERROR, aVar2))) {
            f8854a.m11454n();
            return;
        }
        C9308a0 c9308a0 = C9308a0.f22565a;
        final String format = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{m23861m}, 1));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        C7799e0.m23868t().execute(new Runnable() { // from class: com.facebook.internal.s
            @Override // java.lang.Runnable
            public final void run() {
                C4648v.m11450i(m23860l, format, m23861m);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m11450i(Context context, String settingsKey, String applicationId) {
        JSONObject jSONObject;
        C9322n.m27781e(context, "$context");
        C9322n.m27781e(settingsKey, "$settingsKey");
        C9322n.m27781e(applicationId, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        C4641r c4641r = null;
        String string = sharedPreferences.getString(settingsKey, null);
        if (!C4634n0.m11300d0(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                C4634n0.m11312j0("FacebookSDK", e10);
                jSONObject = null;
            }
            if (jSONObject != null) {
                c4641r = f8854a.m11458j(applicationId, jSONObject);
            }
        }
        C4648v c4648v = f8854a;
        JSONObject m11446e = c4648v.m11446e(applicationId);
        if (m11446e != null) {
            c4648v.m11458j(applicationId, m11446e);
            sharedPreferences.edit().putString(settingsKey, m11446e.toString()).apply();
        }
        if (c4641r != null) {
            String m11386l = c4641r.m11386l();
            if (!f8860g && m11386l != null && m11386l.length() > 0) {
                f8860g = true;
                Log.w(f8855b, m11386l);
            }
        }
        C4639q.m11372m(applicationId, true);
        C10269i.m30756d();
        f8858e.set(f8857d.containsKey(applicationId) ? a.SUCCESS : a.ERROR);
        c4648v.m11454n();
    }

    /* renamed from: k */
    private final Map<String, Map<String, C4641r.b>> m11451k(JSONObject jSONObject) {
        JSONArray optJSONArray;
        int length;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null && (length = optJSONArray.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                C4641r.b.a aVar = C4641r.b.f8810e;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                C9322n.m27780d(optJSONObject, "dialogConfigData.optJSONObject(i)");
                C4641r.b m11395a = aVar.m11395a(optJSONObject);
                if (m11395a != null) {
                    String m11392a = m11395a.m11392a();
                    Map map = (Map) hashMap.get(m11392a);
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(m11392a, map);
                    }
                    map.put(m11395a.m11393b(), m11395a);
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashMap;
    }

    /* renamed from: l */
    private final Map<String, Boolean> m11452l(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                hashMap.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException e10) {
                C4634n0.m11312j0("FacebookSDK", e10);
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                hashMap.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException e11) {
                C4634n0.m11312j0("FacebookSDK", e11);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    /* renamed from: m */
    private final JSONArray m11453m(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    /* renamed from: n */
    private final synchronized void m11454n() {
        a aVar = f8858e.get();
        if (a.NOT_LOADED != aVar && a.LOADING != aVar) {
            final C4641r c4641r = f8857d.get(C7799e0.m23861m());
            Handler handler = new Handler(Looper.getMainLooper());
            if (a.ERROR == aVar) {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue = f8859f;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    final b poll = concurrentLinkedQueue.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4648v.m11455o(C4648v.b.this);
                        }
                    });
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue2 = f8859f;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    final b poll2 = concurrentLinkedQueue2.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4648v.m11456p(C4648v.b.this, c4641r);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m11455o(b bVar) {
        bVar.mo10977a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m11456p(b bVar, C4641r c4641r) {
        bVar.mo10978b(c4641r);
    }

    /* renamed from: q */
    public static final C4641r m11457q(String applicationId, boolean z10) {
        C9322n.m27781e(applicationId, "applicationId");
        if (!z10) {
            Map<String, C4641r> map = f8857d;
            if (map.containsKey(applicationId)) {
                return map.get(applicationId);
            }
        }
        C4648v c4648v = f8854a;
        JSONObject m11446e = c4648v.m11446e(applicationId);
        if (m11446e == null) {
            return null;
        }
        C4641r m11458j = c4648v.m11458j(applicationId, m11446e);
        if (C9322n.m27777a(applicationId, C7799e0.m23861m())) {
            f8858e.set(a.SUCCESS);
            c4648v.m11454n();
        }
        return m11458j;
    }

    /* renamed from: j */
    public final C4641r m11458j(String applicationId, JSONObject settingsJSON) {
        C9322n.m27781e(applicationId, "applicationId");
        C9322n.m27781e(settingsJSON, "settingsJSON");
        JSONArray optJSONArray = settingsJSON.optJSONArray("android_sdk_error_categories");
        C4625j.a aVar = C4625j.f8737g;
        C4625j m11239a = aVar.m11239a(optJSONArray);
        if (m11239a == null) {
            m11239a = aVar.m11240b();
        }
        C4625j c4625j = m11239a;
        int optInt = settingsJSON.optInt("app_events_feature_bitmask", 0);
        boolean z10 = (optInt & 8) != 0;
        boolean z11 = (optInt & 16) != 0;
        boolean z12 = (optInt & 32) != 0;
        boolean z13 = (optInt & RecognitionOptions.QR_CODE) != 0;
        boolean z14 = (optInt & 16384) != 0;
        JSONArray optJSONArray2 = settingsJSON.optJSONArray("auto_event_mapping_android");
        f8861h = optJSONArray2;
        if (optJSONArray2 != null && C4652z.m11469b()) {
            C9544e c9544e = C9544e.f23240a;
            C9544e.m28412c(optJSONArray2 == null ? null : optJSONArray2.toString());
        }
        boolean optBoolean = settingsJSON.optBoolean("supports_implicit_sdk_logging", false);
        String optString = settingsJSON.optString("gdpv4_nux_content", "");
        C9322n.m27780d(optString, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        boolean optBoolean2 = settingsJSON.optBoolean("gdpv4_nux_enabled", false);
        int optInt2 = settingsJSON.optInt("app_events_session_timeout", C10270j.m30762a());
        EnumSet<EnumC4624i0> m11232a = EnumC4624i0.Companion.m11232a(settingsJSON.optLong("seamless_login"));
        Map<String, Map<String, C4641r.b>> m11451k = m11451k(settingsJSON.optJSONObject("android_dialog_configs"));
        String optString2 = settingsJSON.optString("smart_login_bookmark_icon_url");
        C9322n.m27780d(optString2, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String optString3 = settingsJSON.optString("smart_login_menu_icon_url");
        C9322n.m27780d(optString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String optString4 = settingsJSON.optString("sdk_update_message");
        C9322n.m27780d(optString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        C4641r c4641r = new C4641r(optBoolean, optString, optBoolean2, optInt2, m11232a, m11451k, z10, c4625j, optString2, optString3, z11, z12, optJSONArray2, optString4, z13, z14, settingsJSON.optString("aam_rules"), settingsJSON.optString("suggested_events_setting"), settingsJSON.optString("restrictive_data_filter_params"), m11453m(settingsJSON.optJSONObject("protected_mode_rules"), "standard_params"), m11453m(settingsJSON.optJSONObject("protected_mode_rules"), "maca_rules"), m11452l(settingsJSON), m11453m(settingsJSON.optJSONObject("protected_mode_rules"), "blocklist_events"), m11453m(settingsJSON.optJSONObject("protected_mode_rules"), "redacted_events"), m11453m(settingsJSON.optJSONObject("protected_mode_rules"), "sensitive_params"));
        f8857d.put(applicationId, c4641r);
        return c4641r;
    }
}
