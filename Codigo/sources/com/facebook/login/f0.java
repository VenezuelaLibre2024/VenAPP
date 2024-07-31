package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.login.u;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class f0 implements Parcelable {

    /* renamed from: c */
    public static final a f7931c = new a(null);

    /* renamed from: a */
    private Map<String, String> f7932a;

    /* renamed from: b */
    public u f7933b;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final i4.a a(Bundle bundle, i4.h hVar, String applicationId) {
            String string;
            kotlin.jvm.internal.n.e(bundle, "bundle");
            kotlin.jvm.internal.n.e(applicationId, "applicationId");
            com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
            Date y10 = com.facebook.internal.n0.y(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date y11 = com.facebook.internal.n0.y(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string2 != null) {
                if (!(string2.length() == 0) && (string = bundle.getString("com.facebook.platform.extra.USER_ID")) != null) {
                    if (!(string.length() == 0)) {
                        return new i4.a(string2, applicationId, string, stringArrayList, null, null, hVar, y10, new Date(), y11, bundle.getString("graph_domain"));
                    }
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00fb A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final i4.a b(java.util.Collection<java.lang.String> r20, android.os.Bundle r21, i4.h r22, java.lang.String r23) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.f0.a.b(java.util.Collection, android.os.Bundle, i4.h, java.lang.String):i4.a");
        }

        public final i4.i c(Bundle bundle, String str) {
            kotlin.jvm.internal.n.e(bundle, "bundle");
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string != null) {
                if (!(string.length() == 0) && str != null) {
                    if (!(str.length() == 0)) {
                        try {
                            return new i4.i(string, str);
                        } catch (Exception e10) {
                            throw new i4.r(e10.getMessage());
                        }
                    }
                }
            }
            return null;
        }

        public final i4.i d(Bundle bundle, String str) {
            kotlin.jvm.internal.n.e(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string != null) {
                if (!(string.length() == 0) && str != null) {
                    if (!(str.length() == 0)) {
                        try {
                            return new i4.i(string, str);
                        } catch (Exception e10) {
                            throw new i4.r(e10.getMessage(), e10);
                        }
                    }
                }
            }
            return null;
        }

        public final String e(String str) {
            List u02;
            Object[] array;
            if (str != null) {
                if (!(str.length() == 0)) {
                    try {
                        u02 = xk.q.u0(str, new String[]{"."}, false, 0, 6, null);
                        array = u02.toArray(new String[0]);
                    } catch (UnsupportedEncodingException | JSONException unused) {
                    }
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr = (String[]) array;
                    if (strArr.length == 2) {
                        byte[] data = Base64.decode(strArr[1], 0);
                        kotlin.jvm.internal.n.d(data, "data");
                        String string = new JSONObject(new String(data, xk.d.f31393b)).getString("user_id");
                        kotlin.jvm.internal.n.d(string, "jsonObject.getString(\"user_id\")");
                        return string;
                    }
                    throw new i4.r("Failed to retrieve user_id from signed_request");
                }
            }
            throw new i4.r("Authorization response does not contain the signed_request");
        }
    }

    public f0(Parcel source) {
        kotlin.jvm.internal.n.e(source, "source");
        Map<String, String> u02 = com.facebook.internal.n0.u0(source);
        this.f7932a = u02 == null ? null : dk.k0.u(u02);
    }

    public f0(u loginClient) {
        kotlin.jvm.internal.n.e(loginClient, "loginClient");
        m(loginClient);
    }

    public void a(String str, Object obj) {
        if (this.f7932a == null) {
            this.f7932a = new HashMap();
        }
        Map<String, String> map = this.f7932a;
        if (map == null) {
            return;
        }
        map.put(str, obj == null ? null : obj.toString());
    }

    public void b() {
    }

    public String c(String authId) {
        kotlin.jvm.internal.n.e(authId, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", authId);
            jSONObject.put("3_method", f());
            l(jSONObject);
        } catch (JSONException e10) {
            Log.w("LoginMethodHandler", kotlin.jvm.internal.n.k("Error creating client state json: ", e10.getMessage()));
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.n.d(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    public final u d() {
        u uVar = this.f7933b;
        if (uVar != null) {
            return uVar;
        }
        kotlin.jvm.internal.n.p("loginClient");
        throw null;
    }

    public final Map<String, String> e() {
        return this.f7932a;
    }

    public abstract String f();

    public String g() {
        return "fb" + i4.e0.m() + "://authorize/";
    }

    public void h(String str) {
        u.e o10 = d().o();
        String a10 = o10 == null ? null : o10.a();
        if (a10 == null) {
            a10 = i4.e0.m();
        }
        com.facebook.appevents.h0 h0Var = new com.facebook.appevents.h0(d().i(), a10);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", a10);
        h0Var.h("fb_dialogs_web_login_dialog_complete", null, bundle);
    }

    public boolean i() {
        return false;
    }

    public boolean j(int i10, int i11, Intent intent) {
        return false;
    }

    public Bundle k(u.e request, Bundle values) {
        i4.i0 a10;
        kotlin.jvm.internal.n.e(request, "request");
        kotlin.jvm.internal.n.e(values, "values");
        String string = values.getString("code");
        if (com.facebook.internal.n0.d0(string)) {
            throw new i4.r("No code param found from the request");
        }
        if (string == null) {
            a10 = null;
        } else {
            m0 m0Var = m0.f7971a;
            String g10 = g();
            String f10 = request.f();
            if (f10 == null) {
                f10 = "";
            }
            a10 = m0.a(string, g10, f10);
        }
        if (a10 == null) {
            throw new i4.r("Failed to create code exchange request");
        }
        i4.n0 k10 = a10.k();
        i4.u b10 = k10.b();
        if (b10 != null) {
            throw new i4.g0(b10, b10.c());
        }
        try {
            JSONObject c10 = k10.c();
            String string2 = c10 != null ? c10.getString("access_token") : null;
            if (c10 == null || com.facebook.internal.n0.d0(string2)) {
                throw new i4.r("No access token found from result");
            }
            values.putString("access_token", string2);
            if (c10.has("id_token")) {
                values.putString("id_token", c10.getString("id_token"));
            }
            return values;
        } catch (JSONException e10) {
            throw new i4.r(kotlin.jvm.internal.n.k("Fail to process code exchange response: ", e10.getMessage()));
        }
    }

    public void l(JSONObject param) {
        kotlin.jvm.internal.n.e(param, "param");
    }

    public final void m(u uVar) {
        kotlin.jvm.internal.n.e(uVar, "<set-?>");
        this.f7933b = uVar;
    }

    public boolean n() {
        return false;
    }

    public abstract int o(u.e eVar);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.e(dest, "dest");
        com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
        com.facebook.internal.n0.I0(dest, this.f7932a);
    }
}
