package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.f0;
import com.facebook.internal.n0;
import com.facebook.login.f0;
import com.facebook.login.u;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q extends f0 {

    /* renamed from: d, reason: collision with root package name */
    private o f7995d;

    /* renamed from: e, reason: collision with root package name */
    private final String f7996e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f7994f = new b(null);
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<q> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q createFromParcel(Parcel source) {
            kotlin.jvm.internal.n.e(source, "source");
            return new q(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q[] newArray(int i10) {
            return new q[i10];
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

    /* loaded from: classes.dex */
    public static final class c implements n0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f7997a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f7998b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u.e f7999c;

        c(Bundle bundle, q qVar, u.e eVar) {
            this.f7997a = bundle;
            this.f7998b = qVar;
            this.f7999c = eVar;
        }

        @Override // com.facebook.internal.n0.a
        public void a(i4.r rVar) {
            this.f7998b.d().f(u.f.c.d(u.f.f8033t, this.f7998b.d().o(), "Caught exception", rVar == null ? null : rVar.getMessage(), null, 8, null));
        }

        @Override // com.facebook.internal.n0.a
        public void b(JSONObject jSONObject) {
            try {
                this.f7997a.putString("com.facebook.platform.extra.USER_ID", jSONObject == null ? null : jSONObject.getString(FacebookMediationAdapter.KEY_ID));
                this.f7998b.t(this.f7999c, this.f7997a);
            } catch (JSONException e10) {
                this.f7998b.d().f(u.f.c.d(u.f.f8033t, this.f7998b.d().o(), "Caught exception", e10.getMessage(), null, 8, null));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Parcel source) {
        super(source);
        kotlin.jvm.internal.n.e(source, "source");
        this.f7996e = "get_token";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u loginClient) {
        super(loginClient);
        kotlin.jvm.internal.n.e(loginClient, "loginClient");
        this.f7996e = "get_token";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(q this$0, u.e request, Bundle bundle) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(request, "$request");
        this$0.s(request, bundle);
    }

    @Override // com.facebook.login.f0
    public void b() {
        o oVar = this.f7995d;
        if (oVar == null) {
            return;
        }
        oVar.b();
        oVar.g(null);
        this.f7995d = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.f0
    public String f() {
        return this.f7996e;
    }

    @Override // com.facebook.login.f0
    public int o(final u.e request) {
        kotlin.jvm.internal.n.e(request, "request");
        Context i10 = d().i();
        if (i10 == null) {
            i10 = i4.e0.l();
        }
        o oVar = new o(i10, request);
        this.f7995d = oVar;
        if (kotlin.jvm.internal.n.a(Boolean.valueOf(oVar.h()), Boolean.FALSE)) {
            return 0;
        }
        d().s();
        f0.b bVar = new f0.b() { // from class: com.facebook.login.p
            @Override // com.facebook.internal.f0.b
            public final void a(Bundle bundle) {
                q.u(q.this, request, bundle);
            }
        };
        o oVar2 = this.f7995d;
        if (oVar2 == null) {
            return 1;
        }
        oVar2.g(bVar);
        return 1;
    }

    public final void r(u.e request, Bundle result) {
        kotlin.jvm.internal.n.e(request, "request");
        kotlin.jvm.internal.n.e(result, "result");
        String string = result.getString("com.facebook.platform.extra.USER_ID");
        if (!(string == null || string.length() == 0)) {
            t(request, result);
            return;
        }
        d().s();
        String string2 = result.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
        com.facebook.internal.n0.H(string2, new c(result, this, request));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if ((r2 == null || r2.length() == 0) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(com.facebook.login.u.e r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.n.e(r6, r0)
            com.facebook.login.o r0 = r5.f7995d
            r1 = 0
            if (r0 != 0) goto Lb
            goto Le
        Lb:
            r0.g(r1)
        Le:
            r5.f7995d = r1
            com.facebook.login.u r0 = r5.d()
            r0.t()
            if (r7 == 0) goto L4c
            java.lang.String r0 = "com.facebook.platform.extra.PERMISSIONS"
            java.util.ArrayList r0 = r7.getStringArrayList(r0)
            if (r0 != 0) goto L25
            java.util.List r0 = dk.p.j()
        L25:
            java.util.Set r1 = r6.n()
            if (r1 != 0) goto L2f
            java.util.Set r1 = dk.o0.e()
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
            com.facebook.login.u r6 = r5.d()
            r6.B()
            return
        L54:
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r0.containsAll(r2)
            if (r2 == 0) goto L61
            r5.r(r6, r7)
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
            r5.a(r1, r0)
        L92:
            r6.w(r7)
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.q.s(com.facebook.login.u$e, android.os.Bundle):void");
    }

    public final void t(u.e request, Bundle result) {
        u.f d10;
        kotlin.jvm.internal.n.e(request, "request");
        kotlin.jvm.internal.n.e(result, "result");
        try {
            f0.a aVar = f0.f7931c;
            d10 = u.f.f8033t.b(request, aVar.a(result, i4.h.FACEBOOK_APPLICATION_SERVICE, request.a()), aVar.c(result, request.m()));
        } catch (i4.r e10) {
            d10 = u.f.c.d(u.f.f8033t, d().o(), null, e10.getMessage(), null, 8, null);
        }
        d().g(d10);
    }
}
