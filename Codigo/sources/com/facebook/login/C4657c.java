package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC1263e;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.C4615e;
import com.facebook.internal.C4617f;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4650x;
import com.facebook.login.C4659d;
import com.facebook.login.C4689u;
import io.flutter.plugins.firebase.auth.Constants;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;
import p152i4.C7799e0;
import p152i4.C7824r;
import p152i4.C7828t;
import p152i4.EnumC7804h;

/* renamed from: com.facebook.login.c */
/* loaded from: classes.dex */
public final class C4657c extends AbstractC4682o0 {

    /* renamed from: w */
    public static boolean f8879w;

    /* renamed from: f */
    private String f8880f;

    /* renamed from: r */
    private String f8881r;

    /* renamed from: s */
    private String f8882s;

    /* renamed from: t */
    private final String f8883t;

    /* renamed from: u */
    private final EnumC7804h f8884u;

    /* renamed from: v */
    public static final b f8878v = new b(null);
    public static final Parcelable.Creator<C4657c> CREATOR = new a();

    /* renamed from: com.facebook.login.c$a */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<C4657c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4657c createFromParcel(Parcel source) {
            C9322n.m27781e(source, "source");
            return new C4657c(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4657c[] newArray(int i10) {
            return new C4657c[i10];
        }
    }

    /* renamed from: com.facebook.login.c$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4657c(Parcel source) {
        super(source);
        C9322n.m27781e(source, "source");
        this.f8883t = "custom_tab";
        this.f8884u = EnumC7804h.CHROME_CUSTOM_TAB;
        this.f8881r = source.readString();
        C4617f c4617f = C4617f.f8716a;
        this.f8882s = C4617f.m11197c(m11493z());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4657c(C4689u loginClient) {
        super(loginClient);
        C9322n.m27781e(loginClient, "loginClient");
        this.f8883t = "custom_tab";
        this.f8884u = EnumC7804h.CHROME_CUSTOM_TAB;
        this.f8881r = C4634n0.m11331t(20);
        f8879w = false;
        C4617f c4617f = C4617f.f8716a;
        this.f8882s = C4617f.m11197c(m11493z());
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m11488A(java.lang.String r7, final com.facebook.login.C4689u.e r8) {
        /*
            r6 = this;
            if (r7 == 0) goto Lcb
            java.lang.String r0 = "fbconnect://cct."
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = p450xk.C12515g.m40978E(r7, r0, r1, r2, r3)
            if (r0 != 0) goto L17
            java.lang.String r0 = super.mo11495g()
            boolean r0 = p450xk.C12515g.m40978E(r7, r0, r1, r2, r3)
            if (r0 == 0) goto Lcb
        L17:
            android.net.Uri r7 = android.net.Uri.parse(r7)
            com.facebook.internal.n0 r0 = com.facebook.internal.C4634n0.f8760a
            java.lang.String r0 = r7.getQuery()
            android.os.Bundle r0 = com.facebook.internal.C4634n0.m11324p0(r0)
            java.lang.String r7 = r7.getFragment()
            android.os.Bundle r7 = com.facebook.internal.C4634n0.m11324p0(r7)
            r0.putAll(r7)
            boolean r7 = r6.m11490C(r0)
            if (r7 != 0) goto L41
            i4.r r7 = new i4.r
            java.lang.String r0 = "Invalid state parameter"
            r7.<init>(r0)
            super.m11648v(r8, r3, r7)
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
            boolean r5 = com.facebook.internal.C4634n0.m11300d0(r7)
            if (r5 == 0) goto L9c
            boolean r5 = com.facebook.internal.C4634n0.m11300d0(r1)
            if (r5 == 0) goto L9c
            if (r2 != r4) goto L9c
            java.lang.String r7 = "access_token"
            boolean r7 = r0.containsKey(r7)
            if (r7 == 0) goto L8f
            super.m11648v(r8, r0, r3)
            return
        L8f:
            java.util.concurrent.Executor r7 = p152i4.C7799e0.m23868t()
            com.facebook.login.b r1 = new com.facebook.login.b
            r1.<init>()
            r7.execute(r1)
            goto Lcb
        L9c:
            if (r7 == 0) goto Lb4
            java.lang.String r0 = "access_denied"
            boolean r0 = kotlin.jvm.internal.C9322n.m27777a(r7, r0)
            if (r0 != 0) goto Lae
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = kotlin.jvm.internal.C9322n.m27777a(r7, r0)
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
            super.m11648v(r8, r3, r7)
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.C4657c.m11488A(java.lang.String, com.facebook.login.u$e):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m11489B(C4657c this$0, C4689u.e request, Bundle values) {
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(request, "$request");
        C9322n.m27781e(values, "$values");
        try {
            this$0.m11648v(request, this$0.m11559k(request, values), null);
        } catch (C7824r e10) {
            this$0.m11648v(request, null, e10);
        }
    }

    /* renamed from: C */
    private final boolean m11490C(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return C9322n.m27777a(new JSONObject(string).getString("7_challenge"), this.f8881r);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: y */
    private final String m11492y() {
        String str = this.f8880f;
        if (str != null) {
            return str;
        }
        String m11195a = C4617f.m11195a();
        this.f8880f = m11195a;
        return m11195a;
    }

    /* renamed from: z */
    private final String m11493z() {
        return super.mo11495g();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: f */
    public String mo11494f() {
        return this.f8883t;
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: g */
    protected String mo11495g() {
        return this.f8882s;
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: j */
    public boolean mo11496j(int i10, int i11, Intent intent) {
        if ((intent == null || !intent.getBooleanExtra(CustomTabMainActivity.f8526u, false)) && i10 == 1) {
            C4689u.e m11701o = m11555d().m11701o();
            if (m11701o == null) {
                return false;
            }
            if (i11 == -1) {
                m11488A(intent != null ? intent.getStringExtra(CustomTabMainActivity.f8523r) : null, m11701o);
                return true;
            }
            super.m11648v(m11701o, null, new C7828t());
            return false;
        }
        return super.mo11496j(i10, i11, intent);
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: l */
    public void mo11497l(JSONObject param) {
        C9322n.m27781e(param, "param");
        param.put("7_challenge", this.f8881r);
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: o */
    public int mo11498o(C4689u.e request) {
        C4659d.a aVar;
        Uri m11153a;
        C9322n.m27781e(request, "request");
        C4689u m11555d = m11555d();
        if (mo11495g().length() == 0) {
            return 0;
        }
        Bundle m11646p = m11646p(m11647r(request), request);
        if (f8879w) {
            m11646p.putString("cct_over_app_switch", "1");
        }
        if (C7799e0.f18617q) {
            if (request.m11734s()) {
                aVar = C4659d.f8889a;
                m11153a = C4650x.f8862c.m11462a(Constants.SIGN_IN_METHOD_OAUTH, m11646p);
            } else {
                aVar = C4659d.f8889a;
                m11153a = C4615e.f8703b.m11153a(Constants.SIGN_IN_METHOD_OAUTH, m11646p);
            }
            aVar.m11510c(m11153a);
        }
        ActivityC1263e m11696i = m11555d.m11696i();
        if (m11696i == null) {
            return 0;
        }
        Intent intent = new Intent(m11696i, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f8520d, Constants.SIGN_IN_METHOD_OAUTH);
        intent.putExtra(CustomTabMainActivity.f8521e, m11646p);
        intent.putExtra(CustomTabMainActivity.f8522f, m11492y());
        intent.putExtra(CustomTabMainActivity.f8524s, request.m11727k().toString());
        Fragment m11698k = m11555d.m11698k();
        if (m11698k != null) {
            m11698k.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.AbstractC4682o0
    /* renamed from: s */
    protected String mo11499s() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.AbstractC4682o0
    /* renamed from: t */
    public EnumC7804h mo11500t() {
        return this.f8884u;
    }

    @Override // com.facebook.login.AbstractC4664f0, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        C9322n.m27781e(dest, "dest");
        super.writeToParcel(dest, i10);
        dest.writeString(this.f8881r);
    }
}
