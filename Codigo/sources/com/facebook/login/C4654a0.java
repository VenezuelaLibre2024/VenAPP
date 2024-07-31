package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.appevents.C4578h0;
import com.facebook.login.C4689u;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;
import p007a5.C0033a;

/* renamed from: com.facebook.login.a0 */
/* loaded from: classes.dex */
public final class C4654a0 {

    /* renamed from: d */
    public static final a f8868d = new a(null);

    /* renamed from: e */
    private static final ScheduledExecutorService f8869e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a */
    private final String f8870a;

    /* renamed from: b */
    private final C4578h0 f8871b;

    /* renamed from: c */
    private String f8872c;

    /* renamed from: com.facebook.login.a0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final Bundle m11487b(String str) {
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

    public C4654a0(Context context, String applicationId) {
        PackageInfo packageInfo;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(applicationId, "applicationId");
        this.f8870a = applicationId;
        this.f8871b = new C4578h0(context, applicationId);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(FbValidationUtils.FB_PACKAGE, 0)) == null) {
                return;
            }
            this.f8872c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: g */
    private final void m11472g(String str) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            final Bundle m11487b = f8868d.m11487b(str);
            f8869e.schedule(new Runnable() { // from class: com.facebook.login.z
                @Override // java.lang.Runnable
                public final void run() {
                    C4654a0.m11473h(C4654a0.this, m11487b);
                }
            }, 5L, TimeUnit.SECONDS);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m11473h(C4654a0 this$0, Bundle bundle) {
        if (C0033a.m107d(C4654a0.class)) {
            return;
        }
        try {
            C9322n.m27781e(this$0, "this$0");
            C9322n.m27781e(bundle, "$bundle");
            this$0.f8871b.m10999g("fb_mobile_login_heartbeat", bundle);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4654a0.class);
        }
    }

    /* renamed from: o */
    public static /* synthetic */ void m11474o(C4654a0 c4654a0, String str, String str2, String str3, int i10, Object obj) {
        if (C0033a.m107d(C4654a0.class)) {
            return;
        }
        if ((i10 & 4) != 0) {
            str3 = "";
        }
        try {
            c4654a0.m11485n(str, str2, str3);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4654a0.class);
        }
    }

    /* renamed from: b */
    public final String m11475b() {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            return this.f8870a;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: c */
    public final void m11476c(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            Bundle m11487b = f8868d.m11487b(str);
            if (str3 != null) {
                m11487b.putString("2_result", str3);
            }
            if (str4 != null) {
                m11487b.putString("5_error_message", str4);
            }
            if (str5 != null) {
                m11487b.putString("4_error_code", str5);
            }
            if (map != null && (!map.isEmpty())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                m11487b.putString("6_extras", new JSONObject(linkedHashMap).toString());
            }
            m11487b.putString("3_method", str2);
            this.f8871b.m10999g(str6, m11487b);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: d */
    public final void m11477d(String str, String str2, String str3) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            Bundle m11487b = f8868d.m11487b(str);
            m11487b.putString("3_method", str2);
            this.f8871b.m10999g(str3, m11487b);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: e */
    public final void m11478e(String str, String str2, String str3) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            Bundle m11487b = f8868d.m11487b(str);
            m11487b.putString("3_method", str2);
            this.f8871b.m10999g(str3, m11487b);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: f */
    public final void m11479f(String str, Map<String, String> loggingExtras, C4689u.f.a aVar, Map<String, String> map, Exception exc, String str2) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C9322n.m27781e(loggingExtras, "loggingExtras");
            Bundle m11487b = f8868d.m11487b(str);
            if (aVar != null) {
                m11487b.putString("2_result", aVar.m11745h());
            }
            if ((exc == null ? null : exc.getMessage()) != null) {
                m11487b.putString("5_error_message", exc.getMessage());
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
                m11487b.putString("6_extras", jSONObject.toString());
            }
            this.f8871b.m10999g(str2, m11487b);
            if (aVar == C4689u.f.a.SUCCESS) {
                m11472g(str);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: i */
    public final void m11480i(String str, Exception exception) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C9322n.m27781e(exception, "exception");
            Bundle m11487b = f8868d.m11487b(str);
            m11487b.putString("2_result", C4689u.f.a.ERROR.m11745h());
            m11487b.putString("5_error_message", exception.toString());
            this.f8871b.m10999g("fb_mobile_login_status_complete", m11487b);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: j */
    public final void m11481j(String str) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            Bundle m11487b = f8868d.m11487b(str);
            m11487b.putString("2_result", "failure");
            this.f8871b.m10999g("fb_mobile_login_status_complete", m11487b);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: k */
    public final void m11482k(String str) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            this.f8871b.m10999g("fb_mobile_login_status_start", f8868d.m11487b(str));
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: l */
    public final void m11483l(String str) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            Bundle m11487b = f8868d.m11487b(str);
            m11487b.putString("2_result", C4689u.f.a.SUCCESS.m11745h());
            this.f8871b.m10999g("fb_mobile_login_status_complete", m11487b);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: m */
    public final void m11484m(C4689u.e pendingLoginRequest, String str) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C9322n.m27781e(pendingLoginRequest, "pendingLoginRequest");
            Bundle m11487b = f8868d.m11487b(pendingLoginRequest.m11718b());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("login_behavior", pendingLoginRequest.m11726j().toString());
                jSONObject.put("request_code", C4689u.f9000x.m11714b());
                jSONObject.put("permissions", TextUtils.join(",", pendingLoginRequest.m11730n()));
                jSONObject.put("default_audience", pendingLoginRequest.m11723g().toString());
                jSONObject.put("isReauthorize", pendingLoginRequest.m11735t());
                String str2 = this.f8872c;
                if (str2 != null) {
                    jSONObject.put("facebookVersion", str2);
                }
                if (pendingLoginRequest.m11727k() != null) {
                    jSONObject.put("target_app", pendingLoginRequest.m11727k().toString());
                }
                m11487b.putString("6_extras", jSONObject.toString());
            } catch (JSONException unused) {
            }
            this.f8871b.m10999g(str, m11487b);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: n */
    public final void m11485n(String str, String str2, String str3) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            Bundle m11487b = f8868d.m11487b("");
            m11487b.putString("2_result", C4689u.f.a.ERROR.m11745h());
            m11487b.putString("5_error_message", str2);
            m11487b.putString("3_method", str3);
            this.f8871b.m10999g(str, m11487b);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }
}
