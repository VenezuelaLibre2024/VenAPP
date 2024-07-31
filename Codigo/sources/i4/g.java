package i4;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import i4.a;
import i4.g;
import i4.i0;
import i4.m0;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: f */
    public static final a f16980f = new a(null);

    /* renamed from: g */
    private static g f16981g;

    /* renamed from: a */
    private final k1.a f16982a;

    /* renamed from: b */
    private final i4.b f16983b;

    /* renamed from: c */
    private i4.a f16984c;

    /* renamed from: d */
    private final AtomicBoolean f16985d;

    /* renamed from: e */
    private Date f16986e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final i0 c(i4.a aVar, i0.b bVar) {
            e f10 = f(aVar);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", f10.a());
            bundle.putString("client_id", aVar.c());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            i0 x10 = i0.f17005n.x(aVar, f10.b(), bVar);
            x10.H(bundle);
            x10.G(o0.GET);
            return x10;
        }

        public final i0 d(i4.a aVar, i0.b bVar) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            i0 x10 = i0.f17005n.x(aVar, "me/permissions", bVar);
            x10.H(bundle);
            x10.G(o0.GET);
            return x10;
        }

        private final e f(i4.a aVar) {
            String i10 = aVar.i();
            if (i10 == null) {
                i10 = "facebook";
            }
            return kotlin.jvm.internal.n.a(i10, "instagram") ? new c() : new b();
        }

        public final g e() {
            g gVar;
            g gVar2 = g.f16981g;
            if (gVar2 != null) {
                return gVar2;
            }
            synchronized (this) {
                gVar = g.f16981g;
                if (gVar == null) {
                    k1.a b10 = k1.a.b(e0.l());
                    kotlin.jvm.internal.n.d(b10, "getInstance(applicationContext)");
                    g gVar3 = new g(b10, new i4.b());
                    g.f16981g = gVar3;
                    gVar = gVar3;
                }
            }
            return gVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements e {

        /* renamed from: a */
        private final String f16987a = "oauth/access_token";

        /* renamed from: b */
        private final String f16988b = "fb_extend_sso_token";

        @Override // i4.g.e
        public String a() {
            return this.f16988b;
        }

        @Override // i4.g.e
        public String b() {
            return this.f16987a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements e {

        /* renamed from: a */
        private final String f16989a = "refresh_access_token";

        /* renamed from: b */
        private final String f16990b = "ig_refresh_token";

        @Override // i4.g.e
        public String a() {
            return this.f16990b;
        }

        @Override // i4.g.e
        public String b() {
            return this.f16989a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private String f16991a;

        /* renamed from: b */
        private int f16992b;

        /* renamed from: c */
        private int f16993c;

        /* renamed from: d */
        private Long f16994d;

        /* renamed from: e */
        private String f16995e;

        public final String a() {
            return this.f16991a;
        }

        public final Long b() {
            return this.f16994d;
        }

        public final int c() {
            return this.f16992b;
        }

        public final int d() {
            return this.f16993c;
        }

        public final String e() {
            return this.f16995e;
        }

        public final void f(String str) {
            this.f16991a = str;
        }

        public final void g(Long l10) {
            this.f16994d = l10;
        }

        public final void h(int i10) {
            this.f16992b = i10;
        }

        public final void i(int i10) {
            this.f16993c = i10;
        }

        public final void j(String str) {
            this.f16995e = str;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        String a();

        String b();
    }

    public g(k1.a localBroadcastManager, i4.b accessTokenCache) {
        kotlin.jvm.internal.n.e(localBroadcastManager, "localBroadcastManager");
        kotlin.jvm.internal.n.e(accessTokenCache, "accessTokenCache");
        this.f16982a = localBroadcastManager;
        this.f16983b = accessTokenCache;
        this.f16985d = new AtomicBoolean(false);
        this.f16986e = new Date(0L);
    }

    public static final void l(g this$0, a.InterfaceC0282a interfaceC0282a) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        this$0.m(interfaceC0282a);
    }

    private final void m(a.InterfaceC0282a interfaceC0282a) {
        i4.a i10 = i();
        if (i10 == null) {
            if (interfaceC0282a == null) {
                return;
            }
            interfaceC0282a.a(new r("No current access token to refresh"));
            return;
        }
        if (!this.f16985d.compareAndSet(false, true)) {
            if (interfaceC0282a == null) {
                return;
            }
            interfaceC0282a.a(new r("Refresh already in progress"));
            return;
        }
        this.f16986e = new Date();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        d dVar = new d();
        a aVar = f16980f;
        m0 m0Var = new m0(aVar.d(i10, new i0.b() { // from class: i4.d

            /* renamed from: a */
            public final /* synthetic */ AtomicBoolean f16941a;

            /* renamed from: b */
            public final /* synthetic */ Set f16942b;

            /* renamed from: c */
            public final /* synthetic */ Set f16943c;

            /* renamed from: d */
            public final /* synthetic */ Set f16944d;

            public /* synthetic */ d(AtomicBoolean atomicBoolean2, Set hashSet4, Set hashSet22, Set hashSet32) {
                r1 = atomicBoolean2;
                r2 = hashSet4;
                r3 = hashSet22;
                r4 = hashSet32;
            }

            @Override // i4.i0.b
            public final void b(n0 n0Var) {
                g.n(r1, r2, r3, r4, n0Var);
            }
        }), aVar.c(i10, new i0.b() { // from class: i4.e
            public /* synthetic */ e() {
            }

            @Override // i4.i0.b
            public final void b(n0 n0Var) {
                g.o(g.d.this, n0Var);
            }
        }));
        m0Var.f(new m0.a(i10, interfaceC0282a, atomicBoolean2, hashSet4, hashSet22, hashSet32, this) { // from class: i4.f

            /* renamed from: b */
            public final /* synthetic */ a f16973b;

            /* renamed from: c */
            public final /* synthetic */ AtomicBoolean f16974c;

            /* renamed from: d */
            public final /* synthetic */ Set f16975d;

            /* renamed from: e */
            public final /* synthetic */ Set f16976e;

            /* renamed from: f */
            public final /* synthetic */ Set f16977f;

            /* renamed from: g */
            public final /* synthetic */ g f16978g;

            public /* synthetic */ f(a i102, a.InterfaceC0282a interfaceC0282a2, AtomicBoolean atomicBoolean2, Set hashSet4, Set hashSet22, Set hashSet32, g this) {
                this.f16973b = i102;
                this.f16974c = atomicBoolean2;
                this.f16975d = hashSet4;
                this.f16976e = hashSet22;
                this.f16977f = hashSet32;
                this.f16978g = this;
            }

            @Override // i4.m0.a
            public final void b(m0 m0Var2) {
                g.p(g.d.this, this.f16973b, null, this.f16974c, this.f16975d, this.f16976e, this.f16977f, this.f16978g, m0Var2);
            }
        });
        m0Var.m();
    }

    public static final void n(AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set expiredPermissions, n0 response) {
        JSONArray optJSONArray;
        kotlin.jvm.internal.n.e(permissionsCallSucceeded, "$permissionsCallSucceeded");
        kotlin.jvm.internal.n.e(permissions, "$permissions");
        kotlin.jvm.internal.n.e(declinedPermissions, "$declinedPermissions");
        kotlin.jvm.internal.n.e(expiredPermissions, "$expiredPermissions");
        kotlin.jvm.internal.n.e(response, "response");
        JSONObject d10 = response.d();
        if (d10 == null || (optJSONArray = d10.optJSONArray("data")) == null) {
            return;
        }
        permissionsCallSucceeded.set(true);
        int length = optJSONArray.length();
        if (length <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("permission");
                String status = optJSONObject.optString("status");
                if (!com.facebook.internal.n0.d0(optString) && !com.facebook.internal.n0.d0(status)) {
                    kotlin.jvm.internal.n.d(status, "status");
                    Locale US = Locale.US;
                    kotlin.jvm.internal.n.d(US, "US");
                    String status2 = status.toLowerCase(US);
                    kotlin.jvm.internal.n.d(status2, "(this as java.lang.String).toLowerCase(locale)");
                    kotlin.jvm.internal.n.d(status2, "status");
                    int hashCode = status2.hashCode();
                    if (hashCode == -1309235419) {
                        if (status2.equals("expired")) {
                            expiredPermissions.add(optString);
                        }
                        Log.w("AccessTokenManager", kotlin.jvm.internal.n.k("Unexpected status: ", status2));
                    } else if (hashCode != 280295099) {
                        if (hashCode == 568196142 && status2.equals("declined")) {
                            declinedPermissions.add(optString);
                        }
                        Log.w("AccessTokenManager", kotlin.jvm.internal.n.k("Unexpected status: ", status2));
                    } else {
                        if (status2.equals("granted")) {
                            permissions.add(optString);
                        }
                        Log.w("AccessTokenManager", kotlin.jvm.internal.n.k("Unexpected status: ", status2));
                    }
                }
            }
            if (i11 >= length) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    public static final void o(d refreshResult, n0 response) {
        kotlin.jvm.internal.n.e(refreshResult, "$refreshResult");
        kotlin.jvm.internal.n.e(response, "response");
        JSONObject d10 = response.d();
        if (d10 == null) {
            return;
        }
        refreshResult.f(d10.optString("access_token"));
        refreshResult.h(d10.optInt("expires_at"));
        refreshResult.i(d10.optInt("expires_in"));
        refreshResult.g(Long.valueOf(d10.optLong("data_access_expiration_time")));
        refreshResult.j(d10.optString("graph_domain", null));
    }

    public static final void p(d refreshResult, i4.a aVar, a.InterfaceC0282a interfaceC0282a, AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set set, g this$0, m0 it) {
        i4.a aVar2;
        kotlin.jvm.internal.n.e(refreshResult, "$refreshResult");
        kotlin.jvm.internal.n.e(permissionsCallSucceeded, "$permissionsCallSucceeded");
        kotlin.jvm.internal.n.e(permissions, "$permissions");
        kotlin.jvm.internal.n.e(declinedPermissions, "$declinedPermissions");
        Set expiredPermissions = set;
        kotlin.jvm.internal.n.e(expiredPermissions, "$expiredPermissions");
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(it, "it");
        String a10 = refreshResult.a();
        int c10 = refreshResult.c();
        Long b10 = refreshResult.b();
        String e10 = refreshResult.e();
        try {
            a aVar3 = f16980f;
            if (aVar3.e().i() != null) {
                i4.a i10 = aVar3.e().i();
                if ((i10 == null ? null : i10.n()) == aVar.n()) {
                    if (!permissionsCallSucceeded.get() && a10 == null && c10 == 0) {
                        if (interfaceC0282a != null) {
                            interfaceC0282a.a(new r("Failed to refresh access token"));
                        }
                        this$0.f16985d.set(false);
                        return;
                    }
                    Date h10 = aVar.h();
                    if (refreshResult.c() != 0) {
                        h10 = new Date(refreshResult.c() * 1000);
                    } else if (refreshResult.d() != 0) {
                        h10 = new Date((refreshResult.d() * 1000) + new Date().getTime());
                    }
                    Date date = h10;
                    if (a10 == null) {
                        a10 = aVar.m();
                    }
                    String str = a10;
                    String c11 = aVar.c();
                    String n10 = aVar.n();
                    Set k10 = permissionsCallSucceeded.get() ? permissions : aVar.k();
                    Set f10 = permissionsCallSucceeded.get() ? declinedPermissions : aVar.f();
                    if (!permissionsCallSucceeded.get()) {
                        expiredPermissions = aVar.g();
                    }
                    Set set2 = expiredPermissions;
                    h l10 = aVar.l();
                    Date date2 = new Date();
                    Date date3 = b10 != null ? new Date(b10.longValue() * 1000) : aVar.e();
                    if (e10 == null) {
                        e10 = aVar.i();
                    }
                    i4.a aVar4 = new i4.a(str, c11, n10, k10, f10, set2, l10, date, date2, date3, e10);
                    try {
                        aVar3.e().r(aVar4);
                        this$0.f16985d.set(false);
                        if (interfaceC0282a != null) {
                            interfaceC0282a.b(aVar4);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar4;
                        this$0.f16985d.set(false);
                        if (interfaceC0282a != null && aVar2 != null) {
                            interfaceC0282a.b(aVar2);
                        }
                        throw th;
                    }
                }
            }
            if (interfaceC0282a != null) {
                interfaceC0282a.a(new r("No current access token to refresh"));
            }
            this$0.f16985d.set(false);
        } catch (Throwable th3) {
            th = th3;
            aVar2 = null;
        }
    }

    private final void q(i4.a aVar, i4.a aVar2) {
        Intent intent = new Intent(e0.l(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", aVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", aVar2);
        this.f16982a.d(intent);
    }

    private final void s(i4.a aVar, boolean z10) {
        i4.a aVar2 = this.f16984c;
        this.f16984c = aVar;
        this.f16985d.set(false);
        this.f16986e = new Date(0L);
        if (z10) {
            i4.b bVar = this.f16983b;
            if (aVar != null) {
                bVar.g(aVar);
            } else {
                bVar.a();
                com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
                com.facebook.internal.n0.i(e0.l());
            }
        }
        if (com.facebook.internal.n0.e(aVar2, aVar)) {
            return;
        }
        q(aVar2, aVar);
        t();
    }

    private final void t() {
        Context l10 = e0.l();
        a.c cVar = i4.a.f16899w;
        i4.a e10 = cVar.e();
        AlarmManager alarmManager = (AlarmManager) l10.getSystemService("alarm");
        if (cVar.g()) {
            if ((e10 == null ? null : e10.h()) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(l10, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, e10.h().getTime(), PendingIntent.getBroadcast(l10, 0, intent, 67108864));
            } catch (Exception unused) {
            }
        }
    }

    private final boolean u() {
        i4.a i10 = i();
        if (i10 == null) {
            return false;
        }
        long time = new Date().getTime();
        return i10.l().h() && time - this.f16986e.getTime() > 3600000 && time - i10.j().getTime() > 86400000;
    }

    public final void g() {
        q(i(), i());
    }

    public final void h() {
        if (u()) {
            k(null);
        }
    }

    public final i4.a i() {
        return this.f16984c;
    }

    public final boolean j() {
        i4.a f10 = this.f16983b.f();
        if (f10 == null) {
            return false;
        }
        s(f10, false);
        return true;
    }

    public final void k(a.InterfaceC0282a interfaceC0282a) {
        if (kotlin.jvm.internal.n.a(Looper.getMainLooper(), Looper.myLooper())) {
            m(interfaceC0282a);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable(interfaceC0282a) { // from class: i4.c
                public /* synthetic */ c(a.InterfaceC0282a interfaceC0282a2) {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    g.l(g.this, null);
                }
            });
        }
    }

    public final void r(i4.a aVar) {
        s(aVar, true);
    }
}
