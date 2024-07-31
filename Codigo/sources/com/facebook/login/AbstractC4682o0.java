package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.ActivityC1263e;
import com.facebook.internal.C4634n0;
import com.facebook.login.AbstractC4664f0;
import com.facebook.login.C4689u;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p152i4.C7787a;
import p152i4.C7799e0;
import p152i4.C7803g0;
import p152i4.C7824r;
import p152i4.C7828t;
import p152i4.C7830u;
import p152i4.EnumC7804h;

/* renamed from: com.facebook.login.o0 */
/* loaded from: classes.dex */
public abstract class AbstractC4682o0 extends AbstractC4664f0 {

    /* renamed from: e */
    public static final a f8970e = new a(null);

    /* renamed from: d */
    private String f8971d;

    /* renamed from: com.facebook.login.o0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4682o0(Parcel source) {
        super(source);
        C9322n.m27781e(source, "source");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4682o0(C4689u loginClient) {
        super(loginClient);
        C9322n.m27781e(loginClient, "loginClient");
    }

    /* renamed from: u */
    private final String m11644u() {
        Context m11696i = m11555d().m11696i();
        if (m11696i == null) {
            m11696i = C7799e0.m23860l();
        }
        return m11696i.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    /* renamed from: w */
    private final void m11645w(String str) {
        Context m11696i = m11555d().m11696i();
        if (m11696i == null) {
            m11696i = C7799e0.m23860l();
        }
        m11696i.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public Bundle m11646p(Bundle parameters, C4689u.e request) {
        String str;
        C9322n.m27781e(parameters, "parameters");
        C9322n.m27781e(request, "request");
        parameters.putString("redirect_uri", mo11495g());
        parameters.putString(request.m11734s() ? "app_id" : "client_id", request.m11717a());
        parameters.putString("e2e", C4689u.f9000x.m11713a());
        if (request.m11734s()) {
            str = "token,signed_request,graph_domain,granted_scopes";
        } else {
            if (request.m11730n().contains("openid")) {
                parameters.putString("nonce", request.m11729m());
            }
            str = "id_token,token,signed_request,graph_domain";
        }
        parameters.putString("response_type", str);
        parameters.putString("code_challenge", request.m11720d());
        EnumC4653a m11721e = request.m11721e();
        parameters.putString("code_challenge_method", m11721e == null ? null : m11721e.name());
        parameters.putString("return_scopes", "true");
        parameters.putString("auth_type", request.m11719c());
        parameters.putString("login_behavior", request.m11726j().name());
        parameters.putString("sdk", C9322n.m27787k("android-", C7799e0.m23829B()));
        if (mo11499s() != null) {
            parameters.putString("sso", mo11499s());
        }
        parameters.putString("cct_prefetching", C7799e0.f18617q ? "1" : "0");
        if (request.m11733r()) {
            parameters.putString("fx_app", request.m11727k().toString());
        }
        if (request.m11716A()) {
            parameters.putString("skip_dedupe", "true");
        }
        if (request.m11728l() != null) {
            parameters.putString("messenger_page_id", request.m11728l());
            parameters.putString("reset_messenger_state", request.m11731o() ? "1" : "0");
        }
        return parameters;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public Bundle m11647r(C4689u.e request) {
        C9322n.m27781e(request, "request");
        Bundle bundle = new Bundle();
        C4634n0 c4634n0 = C4634n0.f8760a;
        if (!C4634n0.m11302e0(request.m11730n())) {
            String join = TextUtils.join(",", request.m11730n());
            bundle.putString("scope", join);
            m11552a("scope", join);
        }
        EnumC4661e m11723g = request.m11723g();
        if (m11723g == null) {
            m11723g = EnumC4661e.NONE;
        }
        bundle.putString("default_audience", m11723g.m11512h());
        bundle.putString("state", m11554c(request.m11718b()));
        C7787a m23782e = C7787a.f18552w.m23782e();
        String m23770m = m23782e == null ? null : m23782e.m23770m();
        if (m23770m == null || !C9322n.m27777a(m23770m, m11644u())) {
            ActivityC1263e m11696i = m11555d().m11696i();
            if (m11696i != null) {
                C4634n0.m11309i(m11696i);
            }
            m11552a("access_token", "0");
        } else {
            bundle.putString("access_token", m23770m);
            m11552a("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        bundle.putString("ies", C7799e0.m23864p() ? "1" : "0");
        return bundle;
    }

    /* renamed from: s */
    protected String mo11499s() {
        return null;
    }

    /* renamed from: t */
    public abstract EnumC7804h mo11500t();

    /* renamed from: v */
    public void m11648v(C4689u.e request, Bundle bundle, C7824r c7824r) {
        String str;
        C4689u.f m11751c;
        C9322n.m27781e(request, "request");
        C4689u m11555d = m11555d();
        this.f8971d = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f8971d = bundle.getString("e2e");
            }
            try {
                AbstractC4664f0.a aVar = AbstractC4664f0.f8911c;
                C7787a m11563b = aVar.m11563b(request.m11730n(), bundle, mo11500t(), request.m11717a());
                m11751c = C4689u.f.f9032t.m11750b(m11555d.m11701o(), m11563b, aVar.m11565d(bundle, request.m11729m()));
                if (m11555d.m11696i() != null) {
                    try {
                        CookieSyncManager.createInstance(m11555d.m11696i()).sync();
                    } catch (Exception unused) {
                    }
                    if (m11563b != null) {
                        m11645w(m11563b.m23770m());
                    }
                }
            } catch (C7824r e10) {
                m11751c = C4689u.f.c.m11748d(C4689u.f.f9032t, m11555d.m11701o(), null, e10.getMessage(), null, 8, null);
            }
        } else if (c7824r instanceof C7828t) {
            m11751c = C4689u.f.f9032t.m11749a(m11555d.m11701o(), "User canceled log in.");
        } else {
            this.f8971d = null;
            String message = c7824r == null ? null : c7824r.getMessage();
            if (c7824r instanceof C7803g0) {
                C7830u m23916c = ((C7803g0) c7824r).m23916c();
                str = String.valueOf(m23916c.m24099b());
                message = m23916c.toString();
            } else {
                str = null;
            }
            m11751c = C4689u.f.f9032t.m11751c(m11555d.m11701o(), null, message, str);
        }
        C4634n0 c4634n0 = C4634n0.f8760a;
        if (!C4634n0.m11300d0(this.f8971d)) {
            m11557h(this.f8971d);
        }
        m11555d.m11695g(m11751c);
    }
}
