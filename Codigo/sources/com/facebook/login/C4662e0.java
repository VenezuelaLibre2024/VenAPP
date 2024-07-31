package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.InterfaceC0211d;
import androidx.browser.customtabs.C0393c;
import ck.C2037v;
import com.facebook.FacebookActivity;
import com.facebook.internal.AbstractServiceConnectionC4618f0;
import com.facebook.internal.C4613d;
import com.facebook.internal.C4617f;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4636o0;
import com.facebook.login.C4689u;
import dk.C7030q0;
import dk.C7042z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p152i4.C7787a;
import p152i4.C7799e0;
import p152i4.C7806i;
import p152i4.C7816n;
import p152i4.C7824r;
import p152i4.C7827s0;
import p152i4.InterfaceC7814m;
import p152i4.InterfaceC7818o;
import p152i4.InterfaceC7825r0;
import p450xk.C12524p;

/* renamed from: com.facebook.login.e0 */
/* loaded from: classes.dex */
public class C4662e0 {

    /* renamed from: j */
    public static final b f8894j;

    /* renamed from: k */
    private static final Set<String> f8895k;

    /* renamed from: l */
    private static final String f8896l;

    /* renamed from: m */
    private static volatile C4662e0 f8897m;

    /* renamed from: c */
    private final SharedPreferences f8900c;

    /* renamed from: e */
    private String f8902e;

    /* renamed from: f */
    private boolean f8903f;

    /* renamed from: h */
    private boolean f8905h;

    /* renamed from: i */
    private boolean f8906i;

    /* renamed from: a */
    private EnumC4688t f8898a = EnumC4688t.NATIVE_WITH_FALLBACK;

    /* renamed from: b */
    private EnumC4661e f8899b = EnumC4661e.FRIENDS;

    /* renamed from: d */
    private String f8901d = "rerequest";

    /* renamed from: g */
    private EnumC4670i0 f8904g = EnumC4670i0.FACEBOOK;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.login.e0$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC4680n0 {

        /* renamed from: a */
        private final Activity f8907a;

        public a(Activity activity) {
            C9322n.m27781e(activity, "activity");
            this.f8907a = activity;
        }

        @Override // com.facebook.login.InterfaceC4680n0
        /* renamed from: a */
        public Activity mo11543a() {
            return this.f8907a;
        }

        @Override // com.facebook.login.InterfaceC4680n0
        public void startActivityForResult(Intent intent, int i10) {
            C9322n.m27781e(intent, "intent");
            mo11543a().startActivityForResult(intent, i10);
        }
    }

    /* renamed from: com.facebook.login.e0$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final Set<String> m11546e() {
            Set<String> m20577i;
            m20577i = C7030q0.m20577i("ads_management", "create_event", "rsvp_event");
            return m20577i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public final void m11547f(String str, String str2, String str3, C4654a0 c4654a0, InterfaceC7825r0 interfaceC7825r0) {
            C7824r c7824r = new C7824r(str + ": " + ((Object) str2));
            c4654a0.m11480i(str3, c7824r);
            interfaceC7825r0.mo24087c(c7824r);
        }

        /* renamed from: c */
        public final C4666g0 m11548c(C4689u.e request, C7787a newToken, C7806i c7806i) {
            List m20602D;
            Set m20633i0;
            List m20602D2;
            Set m20633i02;
            C9322n.m27781e(request, "request");
            C9322n.m27781e(newToken, "newToken");
            Set<String> m11730n = request.m11730n();
            m20602D = C7042z.m20602D(newToken.m23768k());
            m20633i0 = C7042z.m20633i0(m20602D);
            if (request.m11735t()) {
                m20633i0.retainAll(m11730n);
            }
            m20602D2 = C7042z.m20602D(m11730n);
            m20633i02 = C7042z.m20633i0(m20602D2);
            m20633i02.removeAll(m20633i0);
            return new C4666g0(newToken, c7806i, m20633i0, m20633i02);
        }

        /* renamed from: d */
        public C4662e0 m11549d() {
            if (C4662e0.f8897m == null) {
                synchronized (this) {
                    C4662e0.f8897m = new C4662e0();
                    C2037v c2037v = C2037v.f8089a;
                }
            }
            C4662e0 c4662e0 = C4662e0.f8897m;
            if (c4662e0 != null) {
                return c4662e0;
            }
            C9322n.m27792p("instance");
            throw null;
        }

        /* renamed from: g */
        public final boolean m11550g(String str) {
            boolean m41031E;
            boolean m41031E2;
            if (str == null) {
                return false;
            }
            m41031E = C12524p.m41031E(str, "publish", false, 2, null);
            if (!m41031E) {
                m41031E2 = C12524p.m41031E(str, "manage", false, 2, null);
                if (!m41031E2 && !C4662e0.f8895k.contains(str)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.login.e0$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f8908a = new c();

        /* renamed from: b */
        private static C4654a0 f8909b;

        private c() {
        }

        /* renamed from: a */
        public final synchronized C4654a0 m11551a(Context context) {
            if (context == null) {
                context = C7799e0.m23860l();
            }
            if (context == null) {
                return null;
            }
            if (f8909b == null) {
                f8909b = new C4654a0(context, C7799e0.m23861m());
            }
            return f8909b;
        }
    }

    static {
        b bVar = new b(null);
        f8894j = bVar;
        f8895k = bVar.m11546e();
        String cls = C4662e0.class.toString();
        C9322n.m27780d(cls, "LoginManager::class.java.toString()");
        f8896l = cls;
    }

    public C4662e0() {
        C4636o0.m11361l();
        SharedPreferences sharedPreferences = C7799e0.m23860l().getSharedPreferences("com.facebook.loginManager", 0);
        C9322n.m27780d(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.f8900c = sharedPreferences;
        if (!C7799e0.f18617q || C4617f.m11195a() == null) {
            return;
        }
        C0393c.m2091a(C7799e0.m23860l(), "com.android.chrome", new C4659d());
        C0393c.m2092b(C7799e0.m23860l(), C7799e0.m23860l().getPackageName());
    }

    /* renamed from: B */
    private final void m11513B(InterfaceC4680n0 interfaceC4680n0, C4689u.e eVar) {
        m11526p(interfaceC4680n0.mo11543a(), eVar);
        C4613d.f8700b.m11148c(C4613d.c.Login.m11150h(), new C4613d.a() { // from class: com.facebook.login.d0
            @Override // com.facebook.internal.C4613d.a
            /* renamed from: a */
            public final boolean mo11144a(int i10, Intent intent) {
                boolean m11514C;
                m11514C = C4662e0.m11514C(C4662e0.this, i10, intent);
                return m11514C;
            }
        });
        if (m11515D(interfaceC4680n0, eVar)) {
            return;
        }
        C7824r c7824r = new C7824r("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        m11525l(interfaceC4680n0.mo11543a(), C4689u.f.a.ERROR, null, c7824r, false, eVar);
        throw c7824r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final boolean m11514C(C4662e0 this$0, int i10, Intent intent) {
        C9322n.m27781e(this$0, "this$0");
        return m11527r(this$0, i10, intent, null, 4, null);
    }

    /* renamed from: D */
    private final boolean m11515D(InterfaceC4680n0 interfaceC4680n0, C4689u.e eVar) {
        Intent m11535i = m11535i(eVar);
        if (!m11529u(m11535i)) {
            return false;
        }
        try {
            interfaceC4680n0.startActivityForResult(m11535i, C4689u.f9000x.m11714b());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: h */
    private final void m11522h(C7787a c7787a, C7806i c7806i, C4689u.e eVar, C7824r c7824r, boolean z10, InterfaceC7818o<C4666g0> interfaceC7818o) {
        if (c7787a != null) {
            C7787a.f18552w.m23785h(c7787a);
            C7827s0.f18752s.m24092a();
        }
        if (c7806i != null) {
            C7806i.f18652f.m23923a(c7806i);
        }
        if (interfaceC7818o != null) {
            C4666g0 m11548c = (c7787a == null || eVar == null) ? null : f8894j.m11548c(eVar, c7787a, c7806i);
            if (z10 || (m11548c != null && m11548c.m11568b().isEmpty())) {
                interfaceC7818o.onCancel();
                return;
            }
            if (c7824r != null) {
                interfaceC7818o.mo24070a(c7824r);
            } else {
                if (c7787a == null || m11548c == null) {
                    return;
                }
                m11532z(true);
                interfaceC7818o.onSuccess(m11548c);
            }
        }
    }

    /* renamed from: j */
    public static C4662e0 m11523j() {
        return f8894j.m11549d();
    }

    /* renamed from: k */
    private final boolean m11524k() {
        return this.f8900c.getBoolean("express_login_allowed", true);
    }

    /* renamed from: l */
    private final void m11525l(Context context, C4689u.f.a aVar, Map<String, String> map, Exception exc, boolean z10, C4689u.e eVar) {
        C4654a0 m11551a = c.f8908a.m11551a(context);
        if (m11551a == null) {
            return;
        }
        if (eVar == null) {
            C4654a0.m11474o(m11551a, "fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("try_login_activity", z10 ? "1" : "0");
        m11551a.m11479f(eVar.m11718b(), hashMap, aVar, map, exc, eVar.m11733r() ? "foa_mobile_login_complete" : "fb_mobile_login_complete");
    }

    /* renamed from: p */
    private final void m11526p(Context context, C4689u.e eVar) {
        C4654a0 m11551a = c.f8908a.m11551a(context);
        if (m11551a == null || eVar == null) {
            return;
        }
        m11551a.m11484m(eVar, eVar.m11733r() ? "foa_mobile_login_start" : "fb_mobile_login_start");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public static /* synthetic */ boolean m11527r(C4662e0 c4662e0, int i10, Intent intent, InterfaceC7818o interfaceC7818o, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
        }
        if ((i11 & 4) != 0) {
            interfaceC7818o = null;
        }
        return c4662e0.m11539q(i10, intent, interfaceC7818o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final boolean m11528t(C4662e0 this$0, InterfaceC7818o interfaceC7818o, int i10, Intent intent) {
        C9322n.m27781e(this$0, "this$0");
        return this$0.m11539q(i10, intent, interfaceC7818o);
    }

    /* renamed from: u */
    private final boolean m11529u(Intent intent) {
        return C7799e0.m23860l().getPackageManager().resolveActivity(intent, 0) != null;
    }

    /* renamed from: x */
    private final void m11530x(Context context, final InterfaceC7825r0 interfaceC7825r0, long j10) {
        final String m23861m = C7799e0.m23861m();
        final String uuid = UUID.randomUUID().toString();
        C9322n.m27780d(uuid, "randomUUID().toString()");
        final C4654a0 c4654a0 = new C4654a0(context == null ? C7799e0.m23860l() : context, m23861m);
        if (!m11524k()) {
            c4654a0.m11481j(uuid);
            interfaceC7825r0.mo24085a();
            return;
        }
        C4668h0 m11569a = C4668h0.f8920y.m11569a(context, m23861m, uuid, C7799e0.m23871w(), j10, null);
        m11569a.m11204g(new AbstractServiceConnectionC4618f0.b() { // from class: com.facebook.login.c0
            @Override // com.facebook.internal.AbstractServiceConnectionC4618f0.b
            /* renamed from: a */
            public final void mo11206a(Bundle bundle) {
                C4662e0.m11531y(uuid, c4654a0, interfaceC7825r0, m23861m, bundle);
            }
        });
        c4654a0.m11482k(uuid);
        if (m11569a.m11205h()) {
            return;
        }
        c4654a0.m11481j(uuid);
        interfaceC7825r0.mo24085a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m11531y(String loggerRef, C4654a0 logger, InterfaceC7825r0 responseCallback, String applicationId, Bundle bundle) {
        C9322n.m27781e(loggerRef, "$loggerRef");
        C9322n.m27781e(logger, "$logger");
        C9322n.m27781e(responseCallback, "$responseCallback");
        C9322n.m27781e(applicationId, "$applicationId");
        if (bundle != null) {
            String string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            String string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            if (string != null) {
                f8894j.m11547f(string, string2, loggerRef, logger, responseCallback);
                return;
            }
            String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            C4634n0 c4634n0 = C4634n0.f8760a;
            Date m11340y = C4634n0.m11340y(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string4 = bundle.getString("signed request");
            String string5 = bundle.getString("graph_domain");
            Date m11340y2 = C4634n0.m11340y(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            String m11566e = !(string4 == null || string4.length() == 0) ? AbstractC4664f0.f8911c.m11566e(string4) : null;
            if (!(string3 == null || string3.length() == 0)) {
                if (!(stringArrayList == null || stringArrayList.isEmpty())) {
                    if (!(m11566e == null || m11566e.length() == 0)) {
                        C7787a c7787a = new C7787a(string3, applicationId, m11566e, stringArrayList, null, null, null, m11340y, null, m11340y2, string5);
                        C7787a.f18552w.m23785h(c7787a);
                        C7827s0.f18752s.m24092a();
                        logger.m11483l(loggerRef);
                        responseCallback.mo24086b(c7787a);
                        return;
                    }
                }
            }
        }
        logger.m11481j(loggerRef);
        responseCallback.mo24085a();
    }

    /* renamed from: z */
    private final void m11532z(boolean z10) {
        SharedPreferences.Editor edit = this.f8900c.edit();
        edit.putBoolean("express_login_allowed", z10);
        edit.apply();
    }

    /* renamed from: A */
    public final C4662e0 m11533A(EnumC4688t loginBehavior) {
        C9322n.m27781e(loginBehavior, "loginBehavior");
        this.f8898a = loginBehavior;
        return this;
    }

    /* renamed from: g */
    protected C4689u.e m11534g(C4690v loginConfig) {
        String m11753a;
        Set m20634j0;
        C9322n.m27781e(loginConfig, "loginConfig");
        EnumC4653a enumC4653a = EnumC4653a.S256;
        try {
            C4678m0 c4678m0 = C4678m0.f8966a;
            m11753a = C4678m0.m11631b(loginConfig.m11753a(), enumC4653a);
        } catch (C7824r unused) {
            enumC4653a = EnumC4653a.PLAIN;
            m11753a = loginConfig.m11753a();
        }
        EnumC4688t enumC4688t = this.f8898a;
        m20634j0 = C7042z.m20634j0(loginConfig.m11755c());
        EnumC4661e enumC4661e = this.f8899b;
        String str = this.f8901d;
        String m23861m = C7799e0.m23861m();
        String uuid = UUID.randomUUID().toString();
        C9322n.m27780d(uuid, "randomUUID().toString()");
        EnumC4670i0 enumC4670i0 = this.f8904g;
        String m11754b = loginConfig.m11754b();
        String m11753a2 = loginConfig.m11753a();
        C4689u.e eVar = new C4689u.e(enumC4688t, m20634j0, enumC4661e, str, m23861m, uuid, enumC4670i0, m11754b, m11753a2, m11753a, enumC4653a);
        eVar.m11739x(C7787a.f18552w.m23784g());
        eVar.m11737v(this.f8902e);
        eVar.m11740y(this.f8903f);
        eVar.m11736u(this.f8905h);
        eVar.m11741z(this.f8906i);
        return eVar;
    }

    /* renamed from: i */
    protected Intent m11535i(C4689u.e request) {
        C9322n.m27781e(request, "request");
        Intent intent = new Intent();
        intent.setClass(C7799e0.m23860l(), FacebookActivity.class);
        intent.setAction(request.m11726j().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    /* renamed from: m */
    public final void m11536m(Activity activity, C4690v loginConfig) {
        C9322n.m27781e(activity, "activity");
        C9322n.m27781e(loginConfig, "loginConfig");
        if (activity instanceof InterfaceC0211d) {
            Log.w(f8896l, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        m11513B(new a(activity), m11534g(loginConfig));
    }

    /* renamed from: n */
    public final void m11537n(Activity activity, Collection<String> collection) {
        C9322n.m27781e(activity, "activity");
        m11536m(activity, new C4690v(collection, null, 2, null));
    }

    /* renamed from: o */
    public void m11538o() {
        C7787a.f18552w.m23785h(null);
        C7806i.f18652f.m23923a(null);
        C7827s0.f18752s.m24094c(null);
        m11532z(false);
    }

    /* renamed from: q */
    public boolean m11539q(int i10, Intent intent, InterfaceC7818o<C4666g0> interfaceC7818o) {
        C4689u.f.a aVar;
        boolean z10;
        C7787a c7787a;
        C7806i c7806i;
        C4689u.e eVar;
        Map<String, String> map;
        C7806i c7806i2;
        C4689u.f.a aVar2 = C4689u.f.a.ERROR;
        C7824r c7824r = null;
        if (intent != null) {
            intent.setExtrasClassLoader(C4689u.f.class.getClassLoader());
            C4689u.f fVar = (C4689u.f) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (fVar != null) {
                eVar = fVar.f9038f;
                C4689u.f.a aVar3 = fVar.f9033a;
                if (i10 != -1) {
                    r5 = i10 == 0;
                    c7787a = null;
                    c7806i2 = null;
                } else if (aVar3 == C4689u.f.a.SUCCESS) {
                    c7787a = fVar.f9034b;
                    c7806i2 = fVar.f9035c;
                } else {
                    c7806i2 = null;
                    c7824r = new C7816n(fVar.f9036d);
                    c7787a = null;
                }
                map = fVar.f9039r;
                z10 = r5;
                c7806i = c7806i2;
                aVar = aVar3;
            }
            aVar = aVar2;
            c7787a = null;
            c7806i = null;
            eVar = null;
            map = null;
            z10 = false;
        } else {
            if (i10 == 0) {
                aVar = C4689u.f.a.CANCEL;
                z10 = true;
                c7787a = null;
                c7806i = null;
                eVar = null;
                map = null;
            }
            aVar = aVar2;
            c7787a = null;
            c7806i = null;
            eVar = null;
            map = null;
            z10 = false;
        }
        if (c7824r == null && c7787a == null && !z10) {
            c7824r = new C7824r("Unexpected call to LoginManager.onActivityResult");
        }
        C7824r c7824r2 = c7824r;
        C4689u.e eVar2 = eVar;
        m11525l(null, aVar, map, c7824r2, true, eVar2);
        m11522h(c7787a, c7806i, eVar2, c7824r2, z10, interfaceC7818o);
        return true;
    }

    /* renamed from: s */
    public final void m11540s(InterfaceC7814m interfaceC7814m, final InterfaceC7818o<C4666g0> interfaceC7818o) {
        if (!(interfaceC7814m instanceof C4613d)) {
            throw new C7824r("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((C4613d) interfaceC7814m).m11143b(C4613d.c.Login.m11150h(), new C4613d.a() { // from class: com.facebook.login.b0
            @Override // com.facebook.internal.C4613d.a
            /* renamed from: a */
            public final boolean mo11144a(int i10, Intent intent) {
                boolean m11528t;
                m11528t = C4662e0.m11528t(C4662e0.this, interfaceC7818o, i10, intent);
                return m11528t;
            }
        });
    }

    /* renamed from: v */
    public final void m11541v(Context context, long j10, InterfaceC7825r0 responseCallback) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(responseCallback, "responseCallback");
        m11530x(context, responseCallback, j10);
    }

    /* renamed from: w */
    public final void m11542w(Context context, InterfaceC7825r0 responseCallback) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(responseCallback, "responseCallback");
        m11541v(context, 5000L, responseCallback);
    }
}
