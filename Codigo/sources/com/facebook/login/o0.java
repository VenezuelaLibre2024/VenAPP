package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.login.f0;
import com.facebook.login.u;

/* loaded from: classes.dex */
public abstract class o0 extends f0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f7975e = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private String f7976d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Parcel source) {
        super(source);
        kotlin.jvm.internal.n.e(source, "source");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(u loginClient) {
        super(loginClient);
        kotlin.jvm.internal.n.e(loginClient, "loginClient");
    }

    private final String u() {
        Context i10 = d().i();
        if (i10 == null) {
            i10 = i4.e0.l();
        }
        return i10.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    private final void w(String str) {
        Context i10 = d().i();
        if (i10 == null) {
            i10 = i4.e0.l();
        }
        i10.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Bundle p(Bundle parameters, u.e request) {
        String str;
        kotlin.jvm.internal.n.e(parameters, "parameters");
        kotlin.jvm.internal.n.e(request, "request");
        parameters.putString("redirect_uri", g());
        parameters.putString(request.s() ? "app_id" : "client_id", request.a());
        parameters.putString("e2e", u.f8005x.a());
        if (request.s()) {
            str = "token,signed_request,graph_domain,granted_scopes";
        } else {
            if (request.n().contains("openid")) {
                parameters.putString("nonce", request.m());
            }
            str = "id_token,token,signed_request,graph_domain";
        }
        parameters.putString("response_type", str);
        parameters.putString("code_challenge", request.d());
        com.facebook.login.a e10 = request.e();
        parameters.putString("code_challenge_method", e10 == null ? null : e10.name());
        parameters.putString("return_scopes", "true");
        parameters.putString("auth_type", request.c());
        parameters.putString("login_behavior", request.j().name());
        parameters.putString("sdk", kotlin.jvm.internal.n.k("android-", i4.e0.B()));
        if (s() != null) {
            parameters.putString("sso", s());
        }
        parameters.putString("cct_prefetching", i4.e0.f16964q ? "1" : "0");
        if (request.r()) {
            parameters.putString("fx_app", request.k().toString());
        }
        if (request.A()) {
            parameters.putString("skip_dedupe", "true");
        }
        if (request.l() != null) {
            parameters.putString("messenger_page_id", request.l());
            parameters.putString("reset_messenger_state", request.o() ? "1" : "0");
        }
        return parameters;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Bundle r(u.e request) {
        kotlin.jvm.internal.n.e(request, "request");
        Bundle bundle = new Bundle();
        com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
        if (!com.facebook.internal.n0.e0(request.n())) {
            String join = TextUtils.join(",", request.n());
            bundle.putString("scope", join);
            a("scope", join);
        }
        e g10 = request.g();
        if (g10 == null) {
            g10 = e.NONE;
        }
        bundle.putString("default_audience", g10.h());
        bundle.putString("state", c(request.b()));
        i4.a e10 = i4.a.f16899w.e();
        String m10 = e10 == null ? null : e10.m();
        if (m10 == null || !kotlin.jvm.internal.n.a(m10, u())) {
            androidx.fragment.app.e i10 = d().i();
            if (i10 != null) {
                com.facebook.internal.n0.i(i10);
            }
            a("access_token", "0");
        } else {
            bundle.putString("access_token", m10);
            a("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        bundle.putString("ies", i4.e0.p() ? "1" : "0");
        return bundle;
    }

    protected String s() {
        return null;
    }

    public abstract i4.h t();

    public void v(u.e request, Bundle bundle, i4.r rVar) {
        String str;
        u.f c10;
        kotlin.jvm.internal.n.e(request, "request");
        u d10 = d();
        this.f7976d = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f7976d = bundle.getString("e2e");
            }
            try {
                f0.a aVar = f0.f7931c;
                i4.a b10 = aVar.b(request.n(), bundle, t(), request.a());
                c10 = u.f.f8033t.b(d10.o(), b10, aVar.d(bundle, request.m()));
                if (d10.i() != null) {
                    try {
                        CookieSyncManager.createInstance(d10.i()).sync();
                    } catch (Exception unused) {
                    }
                    if (b10 != null) {
                        w(b10.m());
                    }
                }
            } catch (i4.r e10) {
                c10 = u.f.c.d(u.f.f8033t, d10.o(), null, e10.getMessage(), null, 8, null);
            }
        } else if (rVar instanceof i4.t) {
            c10 = u.f.f8033t.a(d10.o(), "User canceled log in.");
        } else {
            this.f7976d = null;
            String message = rVar == null ? null : rVar.getMessage();
            if (rVar instanceof i4.g0) {
                i4.u c11 = ((i4.g0) rVar).c();
                str = String.valueOf(c11.b());
                message = c11.toString();
            } else {
                str = null;
            }
            c10 = u.f.f8033t.c(d10.o(), null, message, str);
        }
        com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
        if (!com.facebook.internal.n0.d0(this.f7976d)) {
            h(this.f7976d);
        }
        d10.g(c10);
    }
}
