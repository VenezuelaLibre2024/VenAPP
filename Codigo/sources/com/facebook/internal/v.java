package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.j;
import com.facebook.internal.r;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a */
    public static final v f7874a = new v();

    /* renamed from: b */
    private static final String f7875b = v.class.getSimpleName();

    /* renamed from: c */
    private static final List<String> f7876c;

    /* renamed from: d */
    private static final Map<String, r> f7877d;

    /* renamed from: e */
    private static final AtomicReference<a> f7878e;

    /* renamed from: f */
    private static final ConcurrentLinkedQueue<b> f7879f;

    /* renamed from: g */
    private static boolean f7880g;

    /* renamed from: h */
    private static JSONArray f7881h;

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

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(r rVar);
    }

    static {
        List<String> l10;
        l10 = dk.r.l("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled");
        f7876c = l10;
        f7877d = new ConcurrentHashMap();
        f7878e = new AtomicReference<>(a.NOT_LOADED);
        f7879f = new ConcurrentLinkedQueue<>();
    }

    private v() {
    }

    public static final void d(b callback) {
        kotlin.jvm.internal.n.e(callback, "callback");
        f7879f.add(callback);
        h();
    }

    private final JSONObject e(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f7876c);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        i4.i0 x10 = i4.i0.f17005n.x(null, "app", null);
        x10.E(true);
        x10.H(bundle);
        JSONObject d10 = x10.k().d();
        return d10 == null ? new JSONObject() : d10;
    }

    public static final r f(String str) {
        if (str != null) {
            return f7877d.get(str);
        }
        return null;
    }

    public static final Map<String, Boolean> g() {
        JSONObject jSONObject;
        Context l10 = i4.e0.l();
        String m10 = i4.e0.m();
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
        String format = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{m10}, 1));
        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
        String string = l10.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(format, null);
        if (!n0.d0(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                n0.j0("FacebookSDK", e10);
                jSONObject = null;
            }
            if (jSONObject != null) {
                return f7874a.l(jSONObject);
            }
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.facebook.internal.s.<init>(android.content.Context, java.lang.String, java.lang.String):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public static final void h() {
        /*
            android.content.Context r0 = i4.e0.l()
            java.lang.String r1 = i4.e0.m()
            boolean r2 = com.facebook.internal.n0.d0(r1)
            if (r2 == 0) goto L1b
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.v$a> r0 = com.facebook.internal.v.f7878e
            com.facebook.internal.v$a r1 = com.facebook.internal.v.a.ERROR
            r0.set(r1)
            com.facebook.internal.v r0 = com.facebook.internal.v.f7874a
            r0.n()
            return
        L1b:
            java.util.Map<java.lang.String, com.facebook.internal.r> r2 = com.facebook.internal.v.f7877d
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L30
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.v$a> r0 = com.facebook.internal.v.f7878e
            com.facebook.internal.v$a r1 = com.facebook.internal.v.a.SUCCESS
            r0.set(r1)
            com.facebook.internal.v r0 = com.facebook.internal.v.f7874a
            r0.n()
            return
        L30:
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.v$a> r2 = com.facebook.internal.v.f7878e
            com.facebook.internal.v$a r3 = com.facebook.internal.v.a.NOT_LOADED
            com.facebook.internal.v$a r4 = com.facebook.internal.v.a.LOADING
            boolean r3 = e2.c.a(r2, r3, r4)
            r5 = 0
            r6 = 1
            if (r3 != 0) goto L49
            com.facebook.internal.v$a r3 = com.facebook.internal.v.a.ERROR
            boolean r2 = e2.c.a(r2, r3, r4)
            if (r2 == 0) goto L47
            goto L49
        L47:
            r2 = r5
            goto L4a
        L49:
            r2 = r6
        L4a:
            if (r2 != 0) goto L52
            com.facebook.internal.v r0 = com.facebook.internal.v.f7874a
            r0.n()
            return
        L52:
            kotlin.jvm.internal.a0 r2 = kotlin.jvm.internal.a0.f20743a
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r5] = r1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            java.lang.String r3 = "com.facebook.internal.APP_SETTINGS.%s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.n.d(r2, r3)
            java.util.concurrent.Executor r3 = i4.e0.t()
            com.facebook.internal.s r4 = new com.facebook.internal.s
            r4.<init>()
            r3.execute(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.v.h():void");
    }

    public static final void i(Context context, String settingsKey, String applicationId) {
        JSONObject jSONObject;
        kotlin.jvm.internal.n.e(context, "$context");
        kotlin.jvm.internal.n.e(settingsKey, "$settingsKey");
        kotlin.jvm.internal.n.e(applicationId, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        r rVar = null;
        String string = sharedPreferences.getString(settingsKey, null);
        if (!n0.d0(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                n0.j0("FacebookSDK", e10);
                jSONObject = null;
            }
            if (jSONObject != null) {
                rVar = f7874a.j(applicationId, jSONObject);
            }
        }
        v vVar = f7874a;
        JSONObject e11 = vVar.e(applicationId);
        if (e11 != null) {
            vVar.j(applicationId, e11);
            sharedPreferences.edit().putString(settingsKey, e11.toString()).apply();
        }
        if (rVar != null) {
            String l10 = rVar.l();
            if (!f7880g && l10 != null && l10.length() > 0) {
                f7880g = true;
                Log.w(f7875b, l10);
            }
        }
        q.m(applicationId, true);
        q4.i.d();
        f7878e.set(f7877d.containsKey(applicationId) ? a.SUCCESS : a.ERROR);
        vVar.n();
    }

    private final Map<String, Map<String, r.b>> k(JSONObject jSONObject) {
        JSONArray optJSONArray;
        int length;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null && (length = optJSONArray.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                r.b.a aVar = r.b.f7830e;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                kotlin.jvm.internal.n.d(optJSONObject, "dialogConfigData.optJSONObject(i)");
                r.b a10 = aVar.a(optJSONObject);
                if (a10 != null) {
                    String a11 = a10.a();
                    Map map = (Map) hashMap.get(a11);
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(a11, map);
                    }
                    map.put(a10.b(), a10);
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashMap;
    }

    private final Map<String, Boolean> l(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                hashMap.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException e10) {
                n0.j0("FacebookSDK", e10);
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                hashMap.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException e11) {
                n0.j0("FacebookSDK", e11);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    private final JSONArray m(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.facebook.internal.u.<init>(com.facebook.internal.v$b, com.facebook.internal.r):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    private final synchronized void n() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.v$a> r0 = com.facebook.internal.v.f7878e     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L5f
            com.facebook.internal.v$a r0 = (com.facebook.internal.v.a) r0     // Catch: java.lang.Throwable -> L5f
            com.facebook.internal.v$a r1 = com.facebook.internal.v.a.NOT_LOADED     // Catch: java.lang.Throwable -> L5f
            if (r1 == r0) goto L5d
            com.facebook.internal.v$a r1 = com.facebook.internal.v.a.LOADING     // Catch: java.lang.Throwable -> L5f
            if (r1 != r0) goto L12
            goto L5d
        L12:
            java.lang.String r1 = i4.e0.m()     // Catch: java.lang.Throwable -> L5f
            java.util.Map<java.lang.String, com.facebook.internal.r> r2 = com.facebook.internal.v.f7877d     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L5f
            com.facebook.internal.r r1 = (com.facebook.internal.r) r1     // Catch: java.lang.Throwable -> L5f
            android.os.Handler r2 = new android.os.Handler     // Catch: java.lang.Throwable -> L5f
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L5f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5f
            com.facebook.internal.v$a r3 = com.facebook.internal.v.a.ERROR     // Catch: java.lang.Throwable -> L5f
            if (r3 != r0) goto L44
        L2b:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.v$b> r0 = com.facebook.internal.v.f7879f     // Catch: java.lang.Throwable -> L5f
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5f
            if (r1 != 0) goto L42
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L5f
            com.facebook.internal.v$b r0 = (com.facebook.internal.v.b) r0     // Catch: java.lang.Throwable -> L5f
            com.facebook.internal.t r1 = new com.facebook.internal.t     // Catch: java.lang.Throwable -> L5f
            r1.<init>()     // Catch: java.lang.Throwable -> L5f
            r2.post(r1)     // Catch: java.lang.Throwable -> L5f
            goto L2b
        L42:
            monitor-exit(r4)
            return
        L44:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.v$b> r0 = com.facebook.internal.v.f7879f     // Catch: java.lang.Throwable -> L5f
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5f
            if (r3 != 0) goto L5b
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L5f
            com.facebook.internal.v$b r0 = (com.facebook.internal.v.b) r0     // Catch: java.lang.Throwable -> L5f
            com.facebook.internal.u r3 = new com.facebook.internal.u     // Catch: java.lang.Throwable -> L5f
            r3.<init>()     // Catch: java.lang.Throwable -> L5f
            r2.post(r3)     // Catch: java.lang.Throwable -> L5f
            goto L44
        L5b:
            monitor-exit(r4)
            return
        L5d:
            monitor-exit(r4)
            return
        L5f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.v.n():void");
    }

    public static final void o(b bVar) {
        bVar.a();
    }

    public static final void p(b bVar, r rVar) {
        bVar.b(rVar);
    }

    public static final r q(String applicationId, boolean z10) {
        kotlin.jvm.internal.n.e(applicationId, "applicationId");
        if (!z10) {
            Map<String, r> map = f7877d;
            if (map.containsKey(applicationId)) {
                return map.get(applicationId);
            }
        }
        v vVar = f7874a;
        JSONObject e10 = vVar.e(applicationId);
        if (e10 == null) {
            return null;
        }
        r j10 = vVar.j(applicationId, e10);
        if (kotlin.jvm.internal.n.a(applicationId, i4.e0.m())) {
            f7878e.set(a.SUCCESS);
            vVar.n();
        }
        return j10;
    }

    public final r j(String applicationId, JSONObject settingsJSON) {
        kotlin.jvm.internal.n.e(applicationId, "applicationId");
        kotlin.jvm.internal.n.e(settingsJSON, "settingsJSON");
        JSONArray optJSONArray = settingsJSON.optJSONArray("android_sdk_error_categories");
        j.a aVar = j.f7760g;
        j a10 = aVar.a(optJSONArray);
        if (a10 == null) {
            a10 = aVar.b();
        }
        j jVar = a10;
        int optInt = settingsJSON.optInt("app_events_feature_bitmask", 0);
        boolean z10 = (optInt & 8) != 0;
        boolean z11 = (optInt & 16) != 0;
        boolean z12 = (optInt & 32) != 0;
        boolean z13 = (optInt & RecognitionOptions.QR_CODE) != 0;
        boolean z14 = (optInt & 16384) != 0;
        JSONArray optJSONArray2 = settingsJSON.optJSONArray("auto_event_mapping_android");
        f7881h = optJSONArray2;
        if (optJSONArray2 != null && z.b()) {
            m4.e eVar = m4.e.f21386a;
            m4.e.c(optJSONArray2 == null ? null : optJSONArray2.toString());
        }
        boolean optBoolean = settingsJSON.optBoolean("supports_implicit_sdk_logging", false);
        String optString = settingsJSON.optString("gdpv4_nux_content", "");
        kotlin.jvm.internal.n.d(optString, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        boolean optBoolean2 = settingsJSON.optBoolean("gdpv4_nux_enabled", false);
        int optInt2 = settingsJSON.optInt("app_events_session_timeout", q4.j.a());
        EnumSet<i0> a11 = i0.Companion.a(settingsJSON.optLong("seamless_login"));
        Map<String, Map<String, r.b>> k10 = k(settingsJSON.optJSONObject("android_dialog_configs"));
        String optString2 = settingsJSON.optString("smart_login_bookmark_icon_url");
        kotlin.jvm.internal.n.d(optString2, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String optString3 = settingsJSON.optString("smart_login_menu_icon_url");
        kotlin.jvm.internal.n.d(optString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String optString4 = settingsJSON.optString("sdk_update_message");
        kotlin.jvm.internal.n.d(optString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        r rVar = new r(optBoolean, optString, optBoolean2, optInt2, a11, k10, z10, jVar, optString2, optString3, z11, z12, optJSONArray2, optString4, z13, z14, settingsJSON.optString("aam_rules"), settingsJSON.optString("suggested_events_setting"), settingsJSON.optString("restrictive_data_filter_params"), m(settingsJSON.optJSONObject("protected_mode_rules"), "standard_params"), m(settingsJSON.optJSONObject("protected_mode_rules"), "maca_rules"), l(settingsJSON), m(settingsJSON.optJSONObject("protected_mode_rules"), "blocklist_events"), m(settingsJSON.optJSONObject("protected_mode_rules"), "redacted_events"), m(settingsJSON.optJSONObject("protected_mode_rules"), "sensitive_params"));
        f7877d.put(applicationId, rVar);
        return rVar;
    }
}
