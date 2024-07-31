package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.s0;
import com.facebook.login.u;
import io.flutter.plugins.firebase.auth.Constants;

/* loaded from: classes.dex */
public class p0 extends o0 {

    /* renamed from: f */
    private s0 f7980f;

    /* renamed from: r */
    private String f7981r;

    /* renamed from: s */
    private final String f7982s;

    /* renamed from: t */
    private final i4.h f7983t;

    /* renamed from: u */
    public static final c f7979u = new c(null);
    public static final Parcelable.Creator<p0> CREATOR = new b();

    /* loaded from: classes.dex */
    public final class a extends s0.a {

        /* renamed from: h */
        private String f7984h;

        /* renamed from: i */
        private t f7985i;

        /* renamed from: j */
        private i0 f7986j;

        /* renamed from: k */
        private boolean f7987k;

        /* renamed from: l */
        private boolean f7988l;

        /* renamed from: m */
        public String f7989m;

        /* renamed from: n */
        public String f7990n;

        /* renamed from: o */
        final /* synthetic */ p0 f7991o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p0 this$0, Context context, String applicationId, Bundle parameters) {
            super(context, applicationId, Constants.SIGN_IN_METHOD_OAUTH, parameters);
            kotlin.jvm.internal.n.e(this$0, "this$0");
            kotlin.jvm.internal.n.e(context, "context");
            kotlin.jvm.internal.n.e(applicationId, "applicationId");
            kotlin.jvm.internal.n.e(parameters, "parameters");
            this.f7991o = this$0;
            this.f7984h = "fbconnect://success";
            this.f7985i = t.NATIVE_WITH_FALLBACK;
            this.f7986j = i0.FACEBOOK;
        }

        @Override // com.facebook.internal.s0.a
        public s0 a() {
            Bundle f10 = f();
            if (f10 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
            }
            f10.putString("redirect_uri", this.f7984h);
            f10.putString("client_id", c());
            f10.putString("e2e", j());
            f10.putString("response_type", this.f7986j == i0.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
            f10.putString("return_scopes", "true");
            f10.putString("auth_type", i());
            f10.putString("login_behavior", this.f7985i.name());
            if (this.f7987k) {
                f10.putString("fx_app", this.f7986j.toString());
            }
            if (this.f7988l) {
                f10.putString("skip_dedupe", "true");
            }
            s0.b bVar = s0.f7839x;
            Context d10 = d();
            if (d10 != null) {
                return bVar.d(d10, Constants.SIGN_IN_METHOD_OAUTH, f10, g(), this.f7986j, e());
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
        }

        public final String i() {
            String str = this.f7990n;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.n.p("authType");
            throw null;
        }

        public final String j() {
            String str = this.f7989m;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.n.p("e2e");
            throw null;
        }

        public final a k(String authType) {
            kotlin.jvm.internal.n.e(authType, "authType");
            l(authType);
            return this;
        }

        public final void l(String str) {
            kotlin.jvm.internal.n.e(str, "<set-?>");
            this.f7990n = str;
        }

        public final a m(String e2e) {
            kotlin.jvm.internal.n.e(e2e, "e2e");
            n(e2e);
            return this;
        }

        public final void n(String str) {
            kotlin.jvm.internal.n.e(str, "<set-?>");
            this.f7989m = str;
        }

        public final a o(boolean z10) {
            this.f7987k = z10;
            return this;
        }

        public final a p(boolean z10) {
            this.f7984h = z10 ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        public final a q(t loginBehavior) {
            kotlin.jvm.internal.n.e(loginBehavior, "loginBehavior");
            this.f7985i = loginBehavior;
            return this;
        }

        public final a r(i0 targetApp) {
            kotlin.jvm.internal.n.e(targetApp, "targetApp");
            this.f7986j = targetApp;
            return this;
        }

        public final a s(boolean z10) {
            this.f7988l = z10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<p0> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public p0 createFromParcel(Parcel source) {
            kotlin.jvm.internal.n.e(source, "source");
            return new p0(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public p0[] newArray(int i10) {
            return new p0[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements s0.d {

        /* renamed from: b */
        final /* synthetic */ u.e f7993b;

        d(u.e eVar) {
            this.f7993b = eVar;
        }

        @Override // com.facebook.internal.s0.d
        public void a(Bundle bundle, i4.r rVar) {
            p0.this.x(this.f7993b, bundle, rVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Parcel source) {
        super(source);
        kotlin.jvm.internal.n.e(source, "source");
        this.f7982s = "web_view";
        this.f7983t = i4.h.WEB_VIEW;
        this.f7981r = source.readString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(u loginClient) {
        super(loginClient);
        kotlin.jvm.internal.n.e(loginClient, "loginClient");
        this.f7982s = "web_view";
        this.f7983t = i4.h.WEB_VIEW;
    }

    @Override // com.facebook.login.f0
    public void b() {
        s0 s0Var = this.f7980f;
        if (s0Var != null) {
            if (s0Var != null) {
                s0Var.cancel();
            }
            this.f7980f = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.f0
    public String f() {
        return this.f7982s;
    }

    @Override // com.facebook.login.f0
    public boolean i() {
        return true;
    }

    @Override // com.facebook.login.f0
    public int o(u.e request) {
        kotlin.jvm.internal.n.e(request, "request");
        Bundle r10 = r(request);
        d dVar = new d(request);
        String a10 = u.f8005x.a();
        this.f7981r = a10;
        a("e2e", a10);
        androidx.fragment.app.e i10 = d().i();
        if (i10 == null) {
            return 0;
        }
        boolean X = com.facebook.internal.n0.X(i10);
        a aVar = new a(this, i10, request.a(), r10);
        String str = this.f7981r;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.f7980f = aVar.m(str).p(X).k(request.c()).q(request.j()).r(request.k()).o(request.r()).s(request.A()).h(dVar).a();
        com.facebook.internal.i iVar = new com.facebook.internal.i();
        iVar.setRetainInstance(true);
        iVar.x(this.f7980f);
        iVar.p(i10.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.o0
    public i4.h t() {
        return this.f7983t;
    }

    @Override // com.facebook.login.f0, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.e(dest, "dest");
        super.writeToParcel(dest, i10);
        dest.writeString(this.f7981r);
    }

    public final void x(u.e request, Bundle bundle, i4.r rVar) {
        kotlin.jvm.internal.n.e(request, "request");
        super.v(request, bundle, rVar);
    }
}
