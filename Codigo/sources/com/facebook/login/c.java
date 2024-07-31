package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import com.facebook.login.d;
import com.facebook.login.u;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c extends o0 {

    /* renamed from: w */
    public static boolean f7899w;

    /* renamed from: f */
    private String f7900f;

    /* renamed from: r */
    private String f7901r;

    /* renamed from: s */
    private String f7902s;

    /* renamed from: t */
    private final String f7903t;

    /* renamed from: u */
    private final i4.h f7904u;

    /* renamed from: v */
    public static final b f7898v = new b(null);
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel source) {
            kotlin.jvm.internal.n.e(source, "source");
            return new c(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Parcel source) {
        super(source);
        kotlin.jvm.internal.n.e(source, "source");
        this.f7903t = "custom_tab";
        this.f7904u = i4.h.CHROME_CUSTOM_TAB;
        this.f7901r = source.readString();
        com.facebook.internal.f fVar = com.facebook.internal.f.f7741a;
        this.f7902s = com.facebook.internal.f.c(z());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(u loginClient) {
        super(loginClient);
        kotlin.jvm.internal.n.e(loginClient, "loginClient");
        this.f7903t = "custom_tab";
        this.f7904u = i4.h.CHROME_CUSTOM_TAB;
        this.f7901r = com.facebook.internal.n0.t(20);
        f7899w = false;
        com.facebook.internal.f fVar = com.facebook.internal.f.f7741a;
        this.f7902s = com.facebook.internal.f.c(z());
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A(java.lang.String r7, com.facebook.login.u.e r8) {
        /*
            r6 = this;
            if (r7 == 0) goto Lcb
            java.lang.String r0 = "fbconnect://cct."
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = xk.g.E(r7, r0, r1, r2, r3)
            if (r0 != 0) goto L17
            java.lang.String r0 = super.g()
            boolean r0 = xk.g.E(r7, r0, r1, r2, r3)
            if (r0 == 0) goto Lcb
        L17:
            android.net.Uri r7 = android.net.Uri.parse(r7)
            com.facebook.internal.n0 r0 = com.facebook.internal.n0.f7780a
            java.lang.String r0 = r7.getQuery()
            android.os.Bundle r0 = com.facebook.internal.n0.p0(r0)
            java.lang.String r7 = r7.getFragment()
            android.os.Bundle r7 = com.facebook.internal.n0.p0(r7)
            r0.putAll(r7)
            boolean r7 = r6.C(r0)
            if (r7 != 0) goto L41
            i4.r r7 = new i4.r
            java.lang.String r0 = "Invalid state parameter"
            r7.<init>(r0)
            super.v(r8, r3, r7)
            return
        L41:
            java.lang.String r7 = "error"
            java.lang.String r7 = r0.getString(r7)
            if (r7 != 0) goto L4f
            java.lang.String r7 = "error_type"
            java.lang.String r7 = r0.getString(r7)
        L4f:
            java.lang.String r1 = "error_msg"
            java.lang.String r1 = r0.getString(r1)
            if (r1 != 0) goto L5d
            java.lang.String r1 = "error_message"
            java.lang.String r1 = r0.getString(r1)
        L5d:
            if (r1 != 0) goto L65
            java.lang.String r1 = "error_description"
            java.lang.String r1 = r0.getString(r1)
        L65:
            java.lang.String r2 = "error_code"
            java.lang.String r2 = r0.getString(r2)
            r4 = -1
            if (r2 != 0) goto L6f
            goto L74
        L6f:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L74
            goto L75
        L74:
            r2 = r4
        L75:
            boolean r5 = com.facebook.internal.n0.d0(r7)
            if (r5 == 0) goto L9c
            boolean r5 = com.facebook.internal.n0.d0(r1)
            if (r5 == 0) goto L9c
            if (r2 != r4) goto L9c
            java.lang.String r7 = "access_token"
            boolean r7 = r0.containsKey(r7)
            if (r7 == 0) goto L8f
            super.v(r8, r0, r3)
            return
        L8f:
            java.util.concurrent.Executor r7 = i4.e0.t()
            com.facebook.login.b r1 = new com.facebook.login.b
            r1.<init>()
            r7.execute(r1)
            goto Lcb
        L9c:
            if (r7 == 0) goto Lb4
            java.lang.String r0 = "access_denied"
            boolean r0 = kotlin.jvm.internal.n.a(r7, r0)
            if (r0 != 0) goto Lae
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = kotlin.jvm.internal.n.a(r7, r0)
            if (r0 == 0) goto Lb4
        Lae:
            i4.t r7 = new i4.t
            r7.<init>()
            goto Lc8
        Lb4:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r2 != r0) goto Lbe
            i4.t r7 = new i4.t
            r7.<init>()
            goto Lc8
        Lbe:
            i4.u r0 = new i4.u
            r0.<init>(r2, r7, r1)
            i4.g0 r7 = new i4.g0
            r7.<init>(r0, r1)
        Lc8:
            super.v(r8, r3, r7)
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.c.A(java.lang.String, com.facebook.login.u$e):void");
    }

    public static final void B(c this$0, u.e request, Bundle values) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(request, "$request");
        kotlin.jvm.internal.n.e(values, "$values");
        try {
            this$0.v(request, this$0.k(request, values), null);
        } catch (i4.r e10) {
            this$0.v(request, null, e10);
        }
    }

    private final boolean C(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return kotlin.jvm.internal.n.a(new JSONObject(string).getString("7_challenge"), this.f7901r);
        } catch (JSONException unused) {
            return false;
        }
    }

    private final String y() {
        String str = this.f7900f;
        if (str != null) {
            return str;
        }
        String a10 = com.facebook.internal.f.a();
        this.f7900f = a10;
        return a10;
    }

    private final String z() {
        return super.g();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.f0
    public String f() {
        return this.f7903t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.login.f0
    public String g() {
        return this.f7902s;
    }

    @Override // com.facebook.login.f0
    public boolean j(int i10, int i11, Intent intent) {
        if ((intent == null || !intent.getBooleanExtra(CustomTabMainActivity.f7552u, false)) && i10 == 1) {
            u.e o10 = d().o();
            if (o10 == null) {
                return false;
            }
            if (i11 == -1) {
                A(intent != null ? intent.getStringExtra(CustomTabMainActivity.f7549r) : null, o10);
                return true;
            }
            super.v(o10, null, new i4.t());
            return false;
        }
        return super.j(i10, i11, intent);
    }

    @Override // com.facebook.login.f0
    public void l(JSONObject param) {
        kotlin.jvm.internal.n.e(param, "param");
        param.put("7_challenge", this.f7901r);
    }

    @Override // com.facebook.login.f0
    public int o(u.e request) {
        d.a aVar;
        Uri a10;
        kotlin.jvm.internal.n.e(request, "request");
        u d10 = d();
        if (g().length() == 0) {
            return 0;
        }
        Bundle p10 = p(r(request), request);
        if (f7899w) {
            p10.putString("cct_over_app_switch", "1");
        }
        if (i4.e0.f16964q) {
            if (request.s()) {
                aVar = d.f7909a;
                a10 = com.facebook.internal.x.f7882c.a(Constants.SIGN_IN_METHOD_OAUTH, p10);
            } else {
                aVar = d.f7909a;
                a10 = com.facebook.internal.e.f7728b.a(Constants.SIGN_IN_METHOD_OAUTH, p10);
            }
            aVar.c(a10);
        }
        androidx.fragment.app.e i10 = d10.i();
        if (i10 == null) {
            return 0;
        }
        Intent intent = new Intent(i10, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f7546d, Constants.SIGN_IN_METHOD_OAUTH);
        intent.putExtra(CustomTabMainActivity.f7547e, p10);
        intent.putExtra(CustomTabMainActivity.f7548f, y());
        intent.putExtra(CustomTabMainActivity.f7550s, request.k().toString());
        Fragment k10 = d10.k();
        if (k10 != null) {
            k10.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.o0
    protected String s() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.o0
    public i4.h t() {
        return this.f7904u;
    }

    @Override // com.facebook.login.f0, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.e(dest, "dest");
        super.writeToParcel(dest, i10);
        dest.writeString(this.f7901r);
    }
}
