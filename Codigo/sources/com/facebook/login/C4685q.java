package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.AbstractServiceConnectionC4618f0;
import com.facebook.internal.C4634n0;
import com.facebook.login.AbstractC4664f0;
import com.facebook.login.C4689u;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;
import p152i4.C7799e0;
import p152i4.C7824r;
import p152i4.EnumC7804h;

/* renamed from: com.facebook.login.q */
/* loaded from: classes.dex */
public final class C4685q extends AbstractC4664f0 {

    /* renamed from: d */
    private C4681o f8990d;

    /* renamed from: e */
    private final String f8991e;

    /* renamed from: f */
    public static final b f8989f = new b(null);
    public static final Parcelable.Creator<C4685q> CREATOR = new a();

    /* renamed from: com.facebook.login.q$a */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<C4685q> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4685q createFromParcel(Parcel source) {
            C9322n.m27781e(source, "source");
            return new C4685q(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4685q[] newArray(int i10) {
            return new C4685q[i10];
        }
    }

    /* renamed from: com.facebook.login.q$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: com.facebook.login.q$c */
    /* loaded from: classes.dex */
    public static final class c implements C4634n0.a {

        /* renamed from: a */
        final /* synthetic */ Bundle f8992a;

        /* renamed from: b */
        final /* synthetic */ C4685q f8993b;

        /* renamed from: c */
        final /* synthetic */ C4689u.e f8994c;

        c(Bundle bundle, C4685q c4685q, C4689u.e eVar) {
            this.f8992a = bundle;
            this.f8993b = c4685q;
            this.f8994c = eVar;
        }

        @Override // com.facebook.internal.C4634n0.a
        /* renamed from: a */
        public void mo11348a(C7824r c7824r) {
            this.f8993b.m11555d().m11694f(C4689u.f.c.m11748d(C4689u.f.f9032t, this.f8993b.m11555d().m11701o(), "Caught exception", c7824r == null ? null : c7824r.getMessage(), null, 8, null));
        }

        @Override // com.facebook.internal.C4634n0.a
        /* renamed from: b */
        public void mo11349b(JSONObject jSONObject) {
            try {
                this.f8992a.putString("com.facebook.platform.extra.USER_ID", jSONObject == null ? null : jSONObject.getString(FacebookMediationAdapter.KEY_ID));
                this.f8993b.m11667t(this.f8994c, this.f8992a);
            } catch (JSONException e10) {
                this.f8993b.m11555d().m11694f(C4689u.f.c.m11748d(C4689u.f.f9032t, this.f8993b.m11555d().m11701o(), "Caught exception", e10.getMessage(), null, 8, null));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4685q(Parcel source) {
        super(source);
        C9322n.m27781e(source, "source");
        this.f8991e = "get_token";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4685q(C4689u loginClient) {
        super(loginClient);
        C9322n.m27781e(loginClient, "loginClient");
        this.f8991e = "get_token";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m11664u(C4685q this$0, C4689u.e request, Bundle bundle) {
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(request, "$request");
        this$0.m11666s(request, bundle);
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: b */
    public void mo11553b() {
        C4681o c4681o = this.f8990d;
        if (c4681o == null) {
            return;
        }
        c4681o.m11200b();
        c4681o.m11204g(null);
        this.f8990d = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: f */
    public String mo11494f() {
        return this.f8991e;
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: o */
    public int mo11498o(final C4689u.e request) {
        C9322n.m27781e(request, "request");
        Context m11696i = m11555d().m11696i();
        if (m11696i == null) {
            m11696i = C7799e0.m23860l();
        }
        C4681o c4681o = new C4681o(m11696i, request);
        this.f8990d = c4681o;
        if (C9322n.m27777a(Boolean.valueOf(c4681o.m11205h()), Boolean.FALSE)) {
            return 0;
        }
        m11555d().m11702s();
        AbstractServiceConnectionC4618f0.b bVar = new AbstractServiceConnectionC4618f0.b() { // from class: com.facebook.login.p
            @Override // com.facebook.internal.AbstractServiceConnectionC4618f0.b
            /* renamed from: a */
            public final void mo11206a(Bundle bundle) {
                C4685q.m11664u(C4685q.this, request, bundle);
            }
        };
        C4681o c4681o2 = this.f8990d;
        if (c4681o2 == null) {
            return 1;
        }
        c4681o2.m11204g(bVar);
        return 1;
    }

    /* renamed from: r */
    public final void m11665r(C4689u.e request, Bundle result) {
        C9322n.m27781e(request, "request");
        C9322n.m27781e(result, "result");
        String string = result.getString("com.facebook.platform.extra.USER_ID");
        if (!(string == null || string.length() == 0)) {
            m11667t(request, result);
            return;
        }
        m11555d().m11702s();
        String string2 = result.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        C4634n0 c4634n0 = C4634n0.f8760a;
        C4634n0.m11274H(string2, new c(result, this, request));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if ((r2 == null || r2.length() == 0) != false) goto L23;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11666s(com.facebook.login.C4689u.e r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.C9322n.m27781e(r6, r0)
            com.facebook.login.o r0 = r5.f8990d
            r1 = 0
            if (r0 != 0) goto Lb
            goto Le
        Lb:
            r0.m11204g(r1)
        Le:
            r5.f8990d = r1
            com.facebook.login.u r0 = r5.m11555d()
            r0.m11703t()
            if (r7 == 0) goto L4c
            java.lang.String r0 = "com.facebook.platform.extra.PERMISSIONS"
            java.util.ArrayList r0 = r7.getStringArrayList(r0)
            if (r0 != 0) goto L25
            java.util.List r0 = dk.C7027p.m20546j()
        L25:
            java.util.Set r1 = r6.m11730n()
            if (r1 != 0) goto L2f
            java.util.Set r1 = dk.C7026o0.m20512e()
        L2f:
            java.lang.String r2 = "com.facebook.platform.extra.ID_TOKEN"
            java.lang.String r2 = r7.getString(r2)
            java.lang.String r3 = "openid"
            boolean r3 = r1.contains(r3)
            r4 = 1
            if (r3 == 0) goto L54
            if (r2 == 0) goto L49
            int r2 = r2.length()
            if (r2 != 0) goto L47
            goto L49
        L47:
            r2 = 0
            goto L4a
        L49:
            r2 = r4
        L4a:
            if (r2 == 0) goto L54
        L4c:
            com.facebook.login.u r6 = r5.m11555d()
            r6.m11688B()
            return
        L54:
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r0.containsAll(r2)
            if (r2 == 0) goto L61
            r5.m11665r(r6, r7)
            return
        L61:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L6a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L80
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L6a
            r7.add(r2)
            goto L6a
        L80:
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ r4
            if (r0 == 0) goto L92
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r7)
            java.lang.String r1 = "new_permissions"
            r5.m11552a(r1, r0)
        L92:
            r6.m11738w(r7)
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.C4685q.m11666s(com.facebook.login.u$e, android.os.Bundle):void");
    }

    /* renamed from: t */
    public final void m11667t(C4689u.e request, Bundle result) {
        C4689u.f m11748d;
        C9322n.m27781e(request, "request");
        C9322n.m27781e(result, "result");
        try {
            AbstractC4664f0.a aVar = AbstractC4664f0.f8911c;
            m11748d = C4689u.f.f9032t.m11750b(request, aVar.m11562a(result, EnumC7804h.FACEBOOK_APPLICATION_SERVICE, request.m11717a()), aVar.m11564c(result, request.m11729m()));
        } catch (C7824r e10) {
            m11748d = C4689u.f.c.m11748d(C4689u.f.f9032t, m11555d().m11701o(), null, e10.getMessage(), null, 8, null);
        }
        m11555d().m11695g(m11748d);
    }
}
