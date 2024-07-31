package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC1263e;
import com.facebook.internal.C4623i;
import com.facebook.internal.C4634n0;
import com.facebook.internal.DialogC4644s0;
import com.facebook.login.C4689u;
import io.flutter.plugins.firebase.auth.Constants;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p152i4.C7824r;
import p152i4.EnumC7804h;

/* renamed from: com.facebook.login.p0 */
/* loaded from: classes.dex */
public class C4684p0 extends AbstractC4682o0 {

    /* renamed from: f */
    private DialogC4644s0 f8975f;

    /* renamed from: r */
    private String f8976r;

    /* renamed from: s */
    private final String f8977s;

    /* renamed from: t */
    private final EnumC7804h f8978t;

    /* renamed from: u */
    public static final c f8974u = new c(null);
    public static final Parcelable.Creator<C4684p0> CREATOR = new b();

    /* renamed from: com.facebook.login.p0$a */
    /* loaded from: classes.dex */
    public final class a extends DialogC4644s0.a {

        /* renamed from: h */
        private String f8979h;

        /* renamed from: i */
        private EnumC4688t f8980i;

        /* renamed from: j */
        private EnumC4670i0 f8981j;

        /* renamed from: k */
        private boolean f8982k;

        /* renamed from: l */
        private boolean f8983l;

        /* renamed from: m */
        public String f8984m;

        /* renamed from: n */
        public String f8985n;

        /* renamed from: o */
        final /* synthetic */ C4684p0 f8986o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4684p0 this$0, Context context, String applicationId, Bundle parameters) {
            super(context, applicationId, Constants.SIGN_IN_METHOD_OAUTH, parameters);
            C9322n.m27781e(this$0, "this$0");
            C9322n.m27781e(context, "context");
            C9322n.m27781e(applicationId, "applicationId");
            C9322n.m27781e(parameters, "parameters");
            this.f8986o = this$0;
            this.f8979h = "fbconnect://success";
            this.f8980i = EnumC4688t.NATIVE_WITH_FALLBACK;
            this.f8981j = EnumC4670i0.FACEBOOK;
        }

        @Override // com.facebook.internal.DialogC4644s0.a
        /* renamed from: a */
        public DialogC4644s0 mo11426a() {
            Bundle m11430f = m11430f();
            if (m11430f == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
            }
            m11430f.putString("redirect_uri", this.f8979h);
            m11430f.putString("client_id", m11427c());
            m11430f.putString("e2e", m11651j());
            m11430f.putString("response_type", this.f8981j == EnumC4670i0.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
            m11430f.putString("return_scopes", "true");
            m11430f.putString("auth_type", m11650i());
            m11430f.putString("login_behavior", this.f8980i.name());
            if (this.f8982k) {
                m11430f.putString("fx_app", this.f8981j.toString());
            }
            if (this.f8983l) {
                m11430f.putString("skip_dedupe", "true");
            }
            DialogC4644s0.b bVar = DialogC4644s0.f8819x;
            Context m11428d = m11428d();
            if (m11428d != null) {
                return bVar.m11436d(m11428d, Constants.SIGN_IN_METHOD_OAUTH, m11430f, m11431g(), this.f8981j, m11429e());
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
        }

        /* renamed from: i */
        public final String m11650i() {
            String str = this.f8985n;
            if (str != null) {
                return str;
            }
            C9322n.m27792p("authType");
            throw null;
        }

        /* renamed from: j */
        public final String m11651j() {
            String str = this.f8984m;
            if (str != null) {
                return str;
            }
            C9322n.m27792p("e2e");
            throw null;
        }

        /* renamed from: k */
        public final a m11652k(String authType) {
            C9322n.m27781e(authType, "authType");
            m11653l(authType);
            return this;
        }

        /* renamed from: l */
        public final void m11653l(String str) {
            C9322n.m27781e(str, "<set-?>");
            this.f8985n = str;
        }

        /* renamed from: m */
        public final a m11654m(String e2e) {
            C9322n.m27781e(e2e, "e2e");
            m11655n(e2e);
            return this;
        }

        /* renamed from: n */
        public final void m11655n(String str) {
            C9322n.m27781e(str, "<set-?>");
            this.f8984m = str;
        }

        /* renamed from: o */
        public final a m11656o(boolean z10) {
            this.f8982k = z10;
            return this;
        }

        /* renamed from: p */
        public final a m11657p(boolean z10) {
            this.f8979h = z10 ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        /* renamed from: q */
        public final a m11658q(EnumC4688t loginBehavior) {
            C9322n.m27781e(loginBehavior, "loginBehavior");
            this.f8980i = loginBehavior;
            return this;
        }

        /* renamed from: r */
        public final a m11659r(EnumC4670i0 targetApp) {
            C9322n.m27781e(targetApp, "targetApp");
            this.f8981j = targetApp;
            return this;
        }

        /* renamed from: s */
        public final a m11660s(boolean z10) {
            this.f8983l = z10;
            return this;
        }
    }

    /* renamed from: com.facebook.login.p0$b */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<C4684p0> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4684p0 createFromParcel(Parcel source) {
            C9322n.m27781e(source, "source");
            return new C4684p0(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4684p0[] newArray(int i10) {
            return new C4684p0[i10];
        }
    }

    /* renamed from: com.facebook.login.p0$c */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: com.facebook.login.p0$d */
    /* loaded from: classes.dex */
    public static final class d implements DialogC4644s0.d {

        /* renamed from: b */
        final /* synthetic */ C4689u.e f8988b;

        d(C4689u.e eVar) {
            this.f8988b = eVar;
        }

        @Override // com.facebook.internal.DialogC4644s0.d
        /* renamed from: a */
        public void mo11207a(Bundle bundle, C7824r c7824r) {
            C4684p0.this.m11649x(this.f8988b, bundle, c7824r);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4684p0(Parcel source) {
        super(source);
        C9322n.m27781e(source, "source");
        this.f8977s = "web_view";
        this.f8978t = EnumC7804h.WEB_VIEW;
        this.f8976r = source.readString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4684p0(C4689u loginClient) {
        super(loginClient);
        C9322n.m27781e(loginClient, "loginClient");
        this.f8977s = "web_view";
        this.f8978t = EnumC7804h.WEB_VIEW;
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: b */
    public void mo11553b() {
        DialogC4644s0 dialogC4644s0 = this.f8975f;
        if (dialogC4644s0 != null) {
            if (dialogC4644s0 != null) {
                dialogC4644s0.cancel();
            }
            this.f8975f = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: f */
    public String mo11494f() {
        return this.f8977s;
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: i */
    public boolean mo11558i() {
        return true;
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: o */
    public int mo11498o(C4689u.e request) {
        C9322n.m27781e(request, "request");
        Bundle m11647r = m11647r(request);
        d dVar = new d(request);
        String m11713a = C4689u.f9000x.m11713a();
        this.f8976r = m11713a;
        m11552a("e2e", m11713a);
        ActivityC1263e m11696i = m11555d().m11696i();
        if (m11696i == null) {
            return 0;
        }
        boolean m11290X = C4634n0.m11290X(m11696i);
        a aVar = new a(this, m11696i, request.m11717a(), m11647r);
        String str = this.f8976r;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.f8975f = aVar.m11654m(str).m11657p(m11290X).m11652k(request.m11719c()).m11658q(request.m11726j()).m11659r(request.m11727k()).m11656o(request.m11733r()).m11660s(request.m11716A()).m11432h(dVar).mo11426a();
        C4623i c4623i = new C4623i();
        c4623i.setRetainInstance(true);
        c4623i.m11228x(this.f8975f);
        c4623i.mo6926p(m11696i.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.AbstractC4682o0
    /* renamed from: t */
    public EnumC7804h mo11500t() {
        return this.f8978t;
    }

    @Override // com.facebook.login.AbstractC4664f0, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        C9322n.m27781e(dest, "dest");
        super.writeToParcel(dest, i10);
        dest.writeString(this.f8976r);
    }

    /* renamed from: x */
    public final void m11649x(C4689u.e request, Bundle bundle, C7824r c7824r) {
        C9322n.m27781e(request, "request");
        super.m11648v(request, bundle, c7824r);
    }
}
