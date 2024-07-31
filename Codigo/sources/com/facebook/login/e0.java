package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookActivity;
import com.facebook.internal.d;
import com.facebook.internal.f0;
import com.facebook.login.u;
import dk.q0;
import i4.r0;
import i4.s0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public class e0 {

    /* renamed from: j */
    public static final b f7914j;

    /* renamed from: k */
    private static final Set<String> f7915k;

    /* renamed from: l */
    private static final String f7916l;

    /* renamed from: m */
    private static volatile e0 f7917m;

    /* renamed from: c */
    private final SharedPreferences f7920c;

    /* renamed from: e */
    private String f7922e;

    /* renamed from: f */
    private boolean f7923f;

    /* renamed from: h */
    private boolean f7925h;

    /* renamed from: i */
    private boolean f7926i;

    /* renamed from: a */
    private t f7918a = t.NATIVE_WITH_FALLBACK;

    /* renamed from: b */
    private e f7919b = e.FRIENDS;

    /* renamed from: d */
    private String f7921d = "rerequest";

    /* renamed from: g */
    private i0 f7924g = i0.FACEBOOK;

    /* loaded from: classes.dex */
    public static final class a implements n0 {

        /* renamed from: a */
        private final Activity f7927a;

        public a(Activity activity) {
            kotlin.jvm.internal.n.e(activity, "activity");
            this.f7927a = activity;
        }

        @Override // com.facebook.login.n0
        public Activity a() {
            return this.f7927a;
        }

        @Override // com.facebook.login.n0
        public void startActivityForResult(Intent intent, int i10) {
            kotlin.jvm.internal.n.e(intent, "intent");
            a().startActivityForResult(intent, i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Set<String> e() {
            Set<String> i10;
            i10 = q0.i("ads_management", "create_event", "rsvp_event");
            return i10;
        }

        public final void f(String str, String str2, String str3, a0 a0Var, r0 r0Var) {
            i4.r rVar = new i4.r(str + ": " + ((Object) str2));
            a0Var.i(str3, rVar);
            r0Var.c(rVar);
        }

        public final g0 c(u.e request, i4.a newToken, i4.i iVar) {
            List D;
            Set i02;
            List D2;
            Set i03;
            kotlin.jvm.internal.n.e(request, "request");
            kotlin.jvm.internal.n.e(newToken, "newToken");
            Set<String> n10 = request.n();
            D = dk.z.D(newToken.k());
            i02 = dk.z.i0(D);
            if (request.t()) {
                i02.retainAll(n10);
            }
            D2 = dk.z.D(n10);
            i03 = dk.z.i0(D2);
            i03.removeAll(i02);
            return new g0(newToken, iVar, i02, i03);
        }

        public e0 d() {
            if (e0.f7917m == null) {
                synchronized (this) {
                    e0.f7917m = new e0();
                    ck.v vVar = ck.v.f7137a;
                }
            }
            e0 e0Var = e0.f7917m;
            if (e0Var != null) {
                return e0Var;
            }
            kotlin.jvm.internal.n.p("instance");
            throw null;
        }

        public final boolean g(String str) {
            boolean E;
            boolean E2;
            if (str == null) {
                return false;
            }
            E = xk.p.E(str, "publish", false, 2, null);
            if (!E) {
                E2 = xk.p.E(str, "manage", false, 2, null);
                if (!E2 && !e0.f7915k.contains(str)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f7928a = new c();

        /* renamed from: b */
        private static a0 f7929b;

        private c() {
        }

        public final synchronized a0 a(Context context) {
            if (context == null) {
                context = i4.e0.l();
            }
            if (context == null) {
                return null;
            }
            if (f7929b == null) {
                f7929b = new a0(context, i4.e0.m());
            }
            return f7929b;
        }
    }

    static {
        b bVar = new b(null);
        f7914j = bVar;
        f7915k = bVar.e();
        String cls = e0.class.toString();
        kotlin.jvm.internal.n.d(cls, "LoginManager::class.java.toString()");
        f7916l = cls;
    }

    public e0() {
        com.facebook.internal.o0.l();
        SharedPreferences sharedPreferences = i4.e0.l().getSharedPreferences("com.facebook.loginManager", 0);
        kotlin.jvm.internal.n.d(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.f7920c = sharedPreferences;
        if (!i4.e0.f16964q || com.facebook.internal.f.a() == null) {
            return;
        }
        androidx.browser.customtabs.c.a(i4.e0.l(), "com.android.chrome", new d());
        androidx.browser.customtabs.c.b(i4.e0.l(), i4.e0.l().getPackageName());
    }

    private final void B(n0 n0Var, u.e eVar) {
        p(n0Var.a(), eVar);
        com.facebook.internal.d.f7725b.c(d.c.Login.h(), new d.a() { // from class: com.facebook.login.d0
            public /* synthetic */ d0() {
            }

            @Override // com.facebook.internal.d.a
            public final boolean a(int i10, Intent intent) {
                boolean C;
                C = e0.C(e0.this, i10, intent);
                return C;
            }
        });
        if (D(n0Var, eVar)) {
            return;
        }
        i4.r rVar = new i4.r("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        l(n0Var.a(), u.f.a.ERROR, null, rVar, false, eVar);
        throw rVar;
    }

    public static final boolean C(e0 this$0, int i10, Intent intent) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        return r(this$0, i10, intent, null, 4, null);
    }

    private final boolean D(n0 n0Var, u.e eVar) {
        Intent i10 = i(eVar);
        if (!u(i10)) {
            return false;
        }
        try {
            n0Var.startActivityForResult(i10, u.f8005x.b());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private final void h(i4.a aVar, i4.i iVar, u.e eVar, i4.r rVar, boolean z10, i4.o<g0> oVar) {
        if (aVar != null) {
            i4.a.f16899w.h(aVar);
            s0.f17093s.a();
        }
        if (iVar != null) {
            i4.i.f16999f.a(iVar);
        }
        if (oVar != null) {
            g0 c10 = (aVar == null || eVar == null) ? null : f7914j.c(eVar, aVar, iVar);
            if (z10 || (c10 != null && c10.b().isEmpty())) {
                oVar.onCancel();
                return;
            }
            if (rVar != null) {
                oVar.a(rVar);
            } else {
                if (aVar == null || c10 == null) {
                    return;
                }
                z(true);
                oVar.onSuccess(c10);
            }
        }
    }

    public static e0 j() {
        return f7914j.d();
    }

    private final boolean k() {
        return this.f7920c.getBoolean("express_login_allowed", true);
    }

    private final void l(Context context, u.f.a aVar, Map<String, String> map, Exception exc, boolean z10, u.e eVar) {
        a0 a10 = c.f7928a.a(context);
        if (a10 == null) {
            return;
        }
        if (eVar == null) {
            a0.o(a10, "fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("try_login_activity", z10 ? "1" : "0");
        a10.f(eVar.b(), hashMap, aVar, map, exc, eVar.r() ? "foa_mobile_login_complete" : "fb_mobile_login_complete");
    }

    private final void p(Context context, u.e eVar) {
        a0 a10 = c.f7928a.a(context);
        if (a10 == null || eVar == null) {
            return;
        }
        a10.m(eVar, eVar.r() ? "foa_mobile_login_start" : "fb_mobile_login_start");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean r(e0 e0Var, int i10, Intent intent, i4.o oVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
        }
        if ((i11 & 4) != 0) {
            oVar = null;
        }
        return e0Var.q(i10, intent, oVar);
    }

    public static final boolean t(e0 this$0, i4.o oVar, int i10, Intent intent) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        return this$0.q(i10, intent, oVar);
    }

    private final boolean u(Intent intent) {
        return i4.e0.l().getPackageManager().resolveActivity(intent, 0) != null;
    }

    private final void x(Context context, r0 r0Var, long j10) {
        String m10 = i4.e0.m();
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.n.d(uuid, "randomUUID().toString()");
        a0 a0Var = new a0(context == null ? i4.e0.l() : context, m10);
        if (!k()) {
            a0Var.j(uuid);
            r0Var.a();
            return;
        }
        h0 a10 = h0.f7940y.a(context, m10, uuid, i4.e0.w(), j10, null);
        a10.g(new f0.b() { // from class: com.facebook.login.c0

            /* renamed from: a */
            public final /* synthetic */ String f7905a;

            /* renamed from: b */
            public final /* synthetic */ a0 f7906b;

            /* renamed from: c */
            public final /* synthetic */ r0 f7907c;

            /* renamed from: d */
            public final /* synthetic */ String f7908d;

            public /* synthetic */ c0(String uuid2, a0 a0Var2, r0 r0Var2, String m102) {
                r1 = uuid2;
                r2 = a0Var2;
                r3 = r0Var2;
                r4 = m102;
            }

            @Override // com.facebook.internal.f0.b
            public final void a(Bundle bundle) {
                e0.y(r1, r2, r3, r4, bundle);
            }
        });
        a0Var2.k(uuid2);
        if (a10.h()) {
            return;
        }
        a0Var2.j(uuid2);
        r0Var2.a();
    }

    public static final void y(String loggerRef, a0 logger, r0 responseCallback, String applicationId, Bundle bundle) {
        kotlin.jvm.internal.n.e(loggerRef, "$loggerRef");
        kotlin.jvm.internal.n.e(logger, "$logger");
        kotlin.jvm.internal.n.e(responseCallback, "$responseCallback");
        kotlin.jvm.internal.n.e(applicationId, "$applicationId");
        if (bundle != null) {
            String string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            String string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            if (string != null) {
                f7914j.f(string, string2, loggerRef, logger, responseCallback);
                return;
            }
            String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
            Date y10 = com.facebook.internal.n0.y(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string4 = bundle.getString("signed request");
            String string5 = bundle.getString("graph_domain");
            Date y11 = com.facebook.internal.n0.y(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            String e10 = !(string4 == null || string4.length() == 0) ? f0.f7931c.e(string4) : null;
            if (!(string3 == null || string3.length() == 0)) {
                if (!(stringArrayList == null || stringArrayList.isEmpty())) {
                    if (!(e10 == null || e10.length() == 0)) {
                        i4.a aVar = new i4.a(string3, applicationId, e10, stringArrayList, null, null, null, y10, null, y11, string5);
                        i4.a.f16899w.h(aVar);
                        s0.f17093s.a();
                        logger.l(loggerRef);
                        responseCallback.b(aVar);
                        return;
                    }
                }
            }
        }
        logger.j(loggerRef);
        responseCallback.a();
    }

    private final void z(boolean z10) {
        SharedPreferences.Editor edit = this.f7920c.edit();
        edit.putBoolean("express_login_allowed", z10);
        edit.apply();
    }

    public final e0 A(t loginBehavior) {
        kotlin.jvm.internal.n.e(loginBehavior, "loginBehavior");
        this.f7918a = loginBehavior;
        return this;
    }

    protected u.e g(v loginConfig) {
        String a10;
        Set j02;
        kotlin.jvm.internal.n.e(loginConfig, "loginConfig");
        com.facebook.login.a aVar = com.facebook.login.a.S256;
        try {
            m0 m0Var = m0.f7971a;
            a10 = m0.b(loginConfig.a(), aVar);
        } catch (i4.r unused) {
            aVar = com.facebook.login.a.PLAIN;
            a10 = loginConfig.a();
        }
        t tVar = this.f7918a;
        j02 = dk.z.j0(loginConfig.c());
        e eVar = this.f7919b;
        String str = this.f7921d;
        String m10 = i4.e0.m();
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.n.d(uuid, "randomUUID().toString()");
        i0 i0Var = this.f7924g;
        String b10 = loginConfig.b();
        String a11 = loginConfig.a();
        u.e eVar2 = new u.e(tVar, j02, eVar, str, m10, uuid, i0Var, b10, a11, a10, aVar);
        eVar2.x(i4.a.f16899w.g());
        eVar2.v(this.f7922e);
        eVar2.y(this.f7923f);
        eVar2.u(this.f7925h);
        eVar2.z(this.f7926i);
        return eVar2;
    }

    protected Intent i(u.e request) {
        kotlin.jvm.internal.n.e(request, "request");
        Intent intent = new Intent();
        intent.setClass(i4.e0.l(), FacebookActivity.class);
        intent.setAction(request.j().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    public final void m(Activity activity, v loginConfig) {
        kotlin.jvm.internal.n.e(activity, "activity");
        kotlin.jvm.internal.n.e(loginConfig, "loginConfig");
        if (activity instanceof androidx.activity.result.d) {
            Log.w(f7916l, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        B(new a(activity), g(loginConfig));
    }

    public final void n(Activity activity, Collection<String> collection) {
        kotlin.jvm.internal.n.e(activity, "activity");
        m(activity, new v(collection, null, 2, null));
    }

    public void o() {
        i4.a.f16899w.h(null);
        i4.i.f16999f.a(null);
        s0.f17093s.c(null);
        z(false);
    }

    public boolean q(int i10, Intent intent, i4.o<g0> oVar) {
        u.f.a aVar;
        boolean z10;
        i4.a aVar2;
        i4.i iVar;
        u.e eVar;
        Map<String, String> map;
        i4.i iVar2;
        u.f.a aVar3 = u.f.a.ERROR;
        i4.r rVar = null;
        if (intent != null) {
            intent.setExtrasClassLoader(u.f.class.getClassLoader());
            u.f fVar = (u.f) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (fVar != null) {
                eVar = fVar.f8039f;
                u.f.a aVar4 = fVar.f8034a;
                if (i10 != -1) {
                    r5 = i10 == 0;
                    aVar2 = null;
                    iVar2 = null;
                } else if (aVar4 == u.f.a.SUCCESS) {
                    aVar2 = fVar.f8035b;
                    iVar2 = fVar.f8036c;
                } else {
                    iVar2 = null;
                    rVar = new i4.n(fVar.f8037d);
                    aVar2 = null;
                }
                map = fVar.f8040r;
                z10 = r5;
                iVar = iVar2;
                aVar = aVar4;
            }
            aVar = aVar3;
            aVar2 = null;
            iVar = null;
            eVar = null;
            map = null;
            z10 = false;
        } else {
            if (i10 == 0) {
                aVar = u.f.a.CANCEL;
                z10 = true;
                aVar2 = null;
                iVar = null;
                eVar = null;
                map = null;
            }
            aVar = aVar3;
            aVar2 = null;
            iVar = null;
            eVar = null;
            map = null;
            z10 = false;
        }
        if (rVar == null && aVar2 == null && !z10) {
            rVar = new i4.r("Unexpected call to LoginManager.onActivityResult");
        }
        i4.r rVar2 = rVar;
        u.e eVar2 = eVar;
        l(null, aVar, map, rVar2, true, eVar2);
        h(aVar2, iVar, eVar2, rVar2, z10, oVar);
        return true;
    }

    public final void s(i4.m mVar, i4.o<g0> oVar) {
        if (!(mVar instanceof com.facebook.internal.d)) {
            throw new i4.r("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((com.facebook.internal.d) mVar).b(d.c.Login.h(), new d.a() { // from class: com.facebook.login.b0

            /* renamed from: b */
            public final /* synthetic */ i4.o f7897b;

            public /* synthetic */ b0(i4.o oVar2) {
                r2 = oVar2;
            }

            @Override // com.facebook.internal.d.a
            public final boolean a(int i10, Intent intent) {
                boolean t10;
                t10 = e0.t(e0.this, r2, i10, intent);
                return t10;
            }
        });
    }

    public final void v(Context context, long j10, r0 responseCallback) {
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(responseCallback, "responseCallback");
        x(context, responseCallback, j10);
    }

    public final void w(Context context, r0 responseCallback) {
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(responseCallback, "responseCallback");
        v(context, 5000L, responseCallback);
    }
}
