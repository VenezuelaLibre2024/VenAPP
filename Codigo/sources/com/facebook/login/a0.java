package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.login.u;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: d */
    public static final a f7888d = new a(null);

    /* renamed from: e */
    private static final ScheduledExecutorService f7889e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a */
    private final String f7890a;

    /* renamed from: b */
    private final com.facebook.appevents.h0 f7891b;

    /* renamed from: c */
    private String f7892c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Bundle b(String str) {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        }
    }

    public a0(Context context, String applicationId) {
        PackageInfo packageInfo;
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(applicationId, "applicationId");
        this.f7890a = applicationId;
        this.f7891b = new com.facebook.appevents.h0(context, applicationId);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(FbValidationUtils.FB_PACKAGE, 0)) == null) {
                return;
            }
            this.f7892c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private final void g(String str) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            f7889e.schedule(new Runnable() { // from class: com.facebook.login.z

                /* renamed from: b */
                public final /* synthetic */ Bundle f8058b;

                public /* synthetic */ z(Bundle bundle) {
                    r2 = bundle;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a0.h(a0.this, r2);
                }
            }, 5L, TimeUnit.SECONDS);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public static final void h(a0 this$0, Bundle bundle) {
        if (a5.a.d(a0.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.n.e(this$0, "this$0");
            kotlin.jvm.internal.n.e(bundle, "$bundle");
            this$0.f7891b.g("fb_mobile_login_heartbeat", bundle);
        } catch (Throwable th2) {
            a5.a.b(th2, a0.class);
        }
    }

    public static /* synthetic */ void o(a0 a0Var, String str, String str2, String str3, int i10, Object obj) {
        if (a5.a.d(a0.class)) {
            return;
        }
        if ((i10 & 4) != 0) {
            str3 = "";
        }
        try {
            a0Var.n(str, str2, str3);
        } catch (Throwable th2) {
            a5.a.b(th2, a0.class);
        }
    }

    public final String b() {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            return this.f7890a;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public final void c(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            Bundle b10 = f7888d.b(str);
            if (str3 != null) {
                b10.putString("2_result", str3);
            }
            if (str4 != null) {
                b10.putString("5_error_message", str4);
            }
            if (str5 != null) {
                b10.putString("4_error_code", str5);
            }
            if (map != null && (!map.isEmpty())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                b10.putString("6_extras", new JSONObject(linkedHashMap).toString());
            }
            b10.putString("3_method", str2);
            this.f7891b.g(str6, b10);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void d(String str, String str2, String str3) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            Bundle b10 = f7888d.b(str);
            b10.putString("3_method", str2);
            this.f7891b.g(str3, b10);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void e(String str, String str2, String str3) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            Bundle b10 = f7888d.b(str);
            b10.putString("3_method", str2);
            this.f7891b.g(str3, b10);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void f(String str, Map<String, String> loggingExtras, u.f.a aVar, Map<String, String> map, Exception exc, String str2) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.n.e(loggingExtras, "loggingExtras");
            Bundle b10 = f7888d.b(str);
            if (aVar != null) {
                b10.putString("2_result", aVar.h());
            }
            if ((exc == null ? null : exc.getMessage()) != null) {
                b10.putString("5_error_message", exc.getMessage());
            }
            JSONObject jSONObject = loggingExtras.isEmpty() ^ true ? new JSONObject(loggingExtras) : null;
            if (map != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (key != null) {
                            jSONObject.put(key, value);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                b10.putString("6_extras", jSONObject.toString());
            }
            this.f7891b.g(str2, b10);
            if (aVar == u.f.a.SUCCESS) {
                g(str);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void i(String str, Exception exception) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.n.e(exception, "exception");
            Bundle b10 = f7888d.b(str);
            b10.putString("2_result", u.f.a.ERROR.h());
            b10.putString("5_error_message", exception.toString());
            this.f7891b.g("fb_mobile_login_status_complete", b10);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void j(String str) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            Bundle b10 = f7888d.b(str);
            b10.putString("2_result", "failure");
            this.f7891b.g("fb_mobile_login_status_complete", b10);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void k(String str) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            this.f7891b.g("fb_mobile_login_status_start", f7888d.b(str));
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void l(String str) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            Bundle b10 = f7888d.b(str);
            b10.putString("2_result", u.f.a.SUCCESS.h());
            this.f7891b.g("fb_mobile_login_status_complete", b10);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void m(u.e pendingLoginRequest, String str) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.n.e(pendingLoginRequest, "pendingLoginRequest");
            Bundle b10 = f7888d.b(pendingLoginRequest.b());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("login_behavior", pendingLoginRequest.j().toString());
                jSONObject.put("request_code", u.f8005x.b());
                jSONObject.put("permissions", TextUtils.join(",", pendingLoginRequest.n()));
                jSONObject.put("default_audience", pendingLoginRequest.g().toString());
                jSONObject.put("isReauthorize", pendingLoginRequest.t());
                String str2 = this.f7892c;
                if (str2 != null) {
                    jSONObject.put("facebookVersion", str2);
                }
                if (pendingLoginRequest.k() != null) {
                    jSONObject.put("target_app", pendingLoginRequest.k().toString());
                }
                b10.putString("6_extras", jSONObject.toString());
            } catch (JSONException unused) {
            }
            this.f7891b.g(str, b10);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void n(String str, String str2, String str3) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            Bundle b10 = f7888d.b("");
            b10.putString("2_result", u.f.a.ERROR.h());
            b10.putString("5_error_message", str2);
            b10.putString("3_method", str3);
            this.f7891b.g(str, b10);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }
}
