package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.appevents.C4578h0;
import com.facebook.internal.C4634n0;
import com.facebook.login.C4689u;
import dk.C7018k0;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;
import p152i4.C7787a;
import p152i4.C7799e0;
import p152i4.C7803g0;
import p152i4.C7806i;
import p152i4.C7807i0;
import p152i4.C7817n0;
import p152i4.C7824r;
import p152i4.C7830u;
import p152i4.EnumC7804h;
import p450xk.C12512d;
import p450xk.C12525q;

/* renamed from: com.facebook.login.f0 */
/* loaded from: classes.dex */
public abstract class AbstractC4664f0 implements Parcelable {

    /* renamed from: c */
    public static final a f8911c = new a(null);

    /* renamed from: a */
    private Map<String, String> f8912a;

    /* renamed from: b */
    public C4689u f8913b;

    /* renamed from: com.facebook.login.f0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C7787a m11562a(Bundle bundle, EnumC7804h enumC7804h, String applicationId) {
            String string;
            C9322n.m27781e(bundle, "bundle");
            C9322n.m27781e(applicationId, "applicationId");
            C4634n0 c4634n0 = C4634n0.f8760a;
            Date m11340y = C4634n0.m11340y(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date m11340y2 = C4634n0.m11340y(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string2 != null) {
                if (!(string2.length() == 0) && (string = bundle.getString("com.facebook.platform.extra.USER_ID")) != null) {
                    if (!(string.length() == 0)) {
                        return new C7787a(string2, applicationId, string, stringArrayList, null, null, enumC7804h, m11340y, new Date(), m11340y2, bundle.getString("graph_domain"));
                    }
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00fb A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p152i4.C7787a m11563b(java.util.Collection<java.lang.String> r20, android.os.Bundle r21, p152i4.EnumC7804h r22, java.lang.String r23) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.AbstractC4664f0.a.m11563b(java.util.Collection, android.os.Bundle, i4.h, java.lang.String):i4.a");
        }

        /* renamed from: c */
        public final C7806i m11564c(Bundle bundle, String str) {
            C9322n.m27781e(bundle, "bundle");
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string != null) {
                if (!(string.length() == 0) && str != null) {
                    if (!(str.length() == 0)) {
                        try {
                            return new C7806i(string, str);
                        } catch (Exception e10) {
                            throw new C7824r(e10.getMessage());
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: d */
        public final C7806i m11565d(Bundle bundle, String str) {
            C9322n.m27781e(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string != null) {
                if (!(string.length() == 0) && str != null) {
                    if (!(str.length() == 0)) {
                        try {
                            return new C7806i(string, str);
                        } catch (Exception e10) {
                            throw new C7824r(e10.getMessage(), e10);
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: e */
        public final String m11566e(String str) {
            List m41098u0;
            Object[] array;
            if (str != null) {
                if (!(str.length() == 0)) {
                    try {
                        m41098u0 = C12525q.m41098u0(str, new String[]{"."}, false, 0, 6, null);
                        array = m41098u0.toArray(new String[0]);
                    } catch (UnsupportedEncodingException | JSONException unused) {
                    }
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr = (String[]) array;
                    if (strArr.length == 2) {
                        byte[] data = Base64.decode(strArr[1], 0);
                        C9322n.m27780d(data, "data");
                        String string = new JSONObject(new String(data, C12512d.f33913b)).getString("user_id");
                        C9322n.m27780d(string, "jsonObject.getString(\"user_id\")");
                        return string;
                    }
                    throw new C7824r("Failed to retrieve user_id from signed_request");
                }
            }
            throw new C7824r("Authorization response does not contain the signed_request");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4664f0(Parcel source) {
        C9322n.m27781e(source, "source");
        Map<String, String> m11334u0 = C4634n0.m11334u0(source);
        this.f8912a = m11334u0 == null ? null : C7018k0.m20434u(m11334u0);
    }

    public AbstractC4664f0(C4689u loginClient) {
        C9322n.m27781e(loginClient, "loginClient");
        m11560m(loginClient);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m11552a(String str, Object obj) {
        if (this.f8912a == null) {
            this.f8912a = new HashMap();
        }
        Map<String, String> map = this.f8912a;
        if (map == null) {
            return;
        }
        map.put(str, obj == null ? null : obj.toString());
    }

    /* renamed from: b */
    public void mo11553b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public String m11554c(String authId) {
        C9322n.m27781e(authId, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", authId);
            jSONObject.put("3_method", mo11494f());
            mo11497l(jSONObject);
        } catch (JSONException e10) {
            Log.w("LoginMethodHandler", C9322n.m27787k("Error creating client state json: ", e10.getMessage()));
        }
        String jSONObject2 = jSONObject.toString();
        C9322n.m27780d(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    /* renamed from: d */
    public final C4689u m11555d() {
        C4689u c4689u = this.f8913b;
        if (c4689u != null) {
            return c4689u;
        }
        C9322n.m27792p("loginClient");
        throw null;
    }

    /* renamed from: e */
    public final Map<String, String> m11556e() {
        return this.f8912a;
    }

    /* renamed from: f */
    public abstract String mo11494f();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public String mo11495g() {
        return "fb" + C7799e0.m23861m() + "://authorize/";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void m11557h(String str) {
        C4689u.e m11701o = m11555d().m11701o();
        String m11717a = m11701o == null ? null : m11701o.m11717a();
        if (m11717a == null) {
            m11717a = C7799e0.m23861m();
        }
        C4578h0 c4578h0 = new C4578h0(m11555d().m11696i(), m11717a);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", m11717a);
        c4578h0.m11000h("fb_dialogs_web_login_dialog_complete", null, bundle);
    }

    /* renamed from: i */
    public boolean mo11558i() {
        return false;
    }

    /* renamed from: j */
    public boolean mo11496j(int i10, int i11, Intent intent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public Bundle m11559k(C4689u.e request, Bundle values) {
        C7807i0 m11630a;
        C9322n.m27781e(request, "request");
        C9322n.m27781e(values, "values");
        String string = values.getString("code");
        if (C4634n0.m11300d0(string)) {
            throw new C7824r("No code param found from the request");
        }
        if (string == null) {
            m11630a = null;
        } else {
            C4678m0 c4678m0 = C4678m0.f8966a;
            String mo11495g = mo11495g();
            String m11722f = request.m11722f();
            if (m11722f == null) {
                m11722f = "";
            }
            m11630a = C4678m0.m11630a(string, mo11495g, m11722f);
        }
        if (m11630a == null) {
            throw new C7824r("Failed to create code exchange request");
        }
        C7817n0 m23949k = m11630a.m23949k();
        C7830u m24061b = m23949k.m24061b();
        if (m24061b != null) {
            throw new C7803g0(m24061b, m24061b.m24100c());
        }
        try {
            JSONObject m24062c = m23949k.m24062c();
            String string2 = m24062c != null ? m24062c.getString("access_token") : null;
            if (m24062c == null || C4634n0.m11300d0(string2)) {
                throw new C7824r("No access token found from result");
            }
            values.putString("access_token", string2);
            if (m24062c.has("id_token")) {
                values.putString("id_token", m24062c.getString("id_token"));
            }
            return values;
        } catch (JSONException e10) {
            throw new C7824r(C9322n.m27787k("Fail to process code exchange response: ", e10.getMessage()));
        }
    }

    /* renamed from: l */
    public void mo11497l(JSONObject param) {
        C9322n.m27781e(param, "param");
    }

    /* renamed from: m */
    public final void m11560m(C4689u c4689u) {
        C9322n.m27781e(c4689u, "<set-?>");
        this.f8913b = c4689u;
    }

    /* renamed from: n */
    public boolean mo11561n() {
        return false;
    }

    /* renamed from: o */
    public abstract int mo11498o(C4689u.e eVar);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        C9322n.m27781e(dest, "dest");
        C4634n0 c4634n0 = C4634n0.f8760a;
        C4634n0.m11277I0(dest, this.f8912a);
    }
}
