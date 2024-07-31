package p152i4;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.facebook.internal.C4634n0;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONObject;
import p152i4.C7787a;
import p152i4.C7802g;
import p152i4.C7807i0;
import p152i4.C7815m0;
import p191k1.C9109a;

/* renamed from: i4.g */
/* loaded from: classes.dex */
public final class C7802g {

    /* renamed from: f */
    public static final a f18633f = new a(null);

    /* renamed from: g */
    private static C7802g f18634g;

    /* renamed from: a */
    private final C9109a f18635a;

    /* renamed from: b */
    private final C7790b f18636b;

    /* renamed from: c */
    private C7787a f18637c;

    /* renamed from: d */
    private final AtomicBoolean f18638d;

    /* renamed from: e */
    private Date f18639e;

    /* renamed from: i4.g$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final C7807i0 m23900c(C7787a c7787a, C7807i0.b bVar) {
            e m23902f = m23902f(c7787a);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", m23902f.mo23904a());
            bundle.putString("client_id", c7787a.m23761c());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            C7807i0 m24001x = C7807i0.f18658n.m24001x(c7787a, m23902f.mo23905b(), bVar);
            m24001x.m23947H(bundle);
            m24001x.m23946G(EnumC7819o0.GET);
            return m24001x;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final C7807i0 m23901d(C7787a c7787a, C7807i0.b bVar) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            C7807i0 m24001x = C7807i0.f18658n.m24001x(c7787a, "me/permissions", bVar);
            m24001x.m23947H(bundle);
            m24001x.m23946G(EnumC7819o0.GET);
            return m24001x;
        }

        /* renamed from: f */
        private final e m23902f(C7787a c7787a) {
            String m23766i = c7787a.m23766i();
            if (m23766i == null) {
                m23766i = "facebook";
            }
            return C9322n.m27777a(m23766i, "instagram") ? new c() : new b();
        }

        /* renamed from: e */
        public final C7802g m23903e() {
            C7802g c7802g;
            C7802g c7802g2 = C7802g.f18634g;
            if (c7802g2 != null) {
                return c7802g2;
            }
            synchronized (this) {
                c7802g = C7802g.f18634g;
                if (c7802g == null) {
                    C9109a m26825b = C9109a.m26825b(C7799e0.m23860l());
                    C9322n.m27780d(m26825b, "getInstance(applicationContext)");
                    C7802g c7802g3 = new C7802g(m26825b, new C7790b());
                    C7802g.f18634g = c7802g3;
                    c7802g = c7802g3;
                }
            }
            return c7802g;
        }
    }

    /* renamed from: i4.g$b */
    /* loaded from: classes.dex */
    public static final class b implements e {

        /* renamed from: a */
        private final String f18640a = "oauth/access_token";

        /* renamed from: b */
        private final String f18641b = "fb_extend_sso_token";

        @Override // p152i4.C7802g.e
        /* renamed from: a */
        public String mo23904a() {
            return this.f18641b;
        }

        @Override // p152i4.C7802g.e
        /* renamed from: b */
        public String mo23905b() {
            return this.f18640a;
        }
    }

    /* renamed from: i4.g$c */
    /* loaded from: classes.dex */
    public static final class c implements e {

        /* renamed from: a */
        private final String f18642a = "refresh_access_token";

        /* renamed from: b */
        private final String f18643b = "ig_refresh_token";

        @Override // p152i4.C7802g.e
        /* renamed from: a */
        public String mo23904a() {
            return this.f18643b;
        }

        @Override // p152i4.C7802g.e
        /* renamed from: b */
        public String mo23905b() {
            return this.f18642a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i4.g$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private String f18644a;

        /* renamed from: b */
        private int f18645b;

        /* renamed from: c */
        private int f18646c;

        /* renamed from: d */
        private Long f18647d;

        /* renamed from: e */
        private String f18648e;

        /* renamed from: a */
        public final String m23906a() {
            return this.f18644a;
        }

        /* renamed from: b */
        public final Long m23907b() {
            return this.f18647d;
        }

        /* renamed from: c */
        public final int m23908c() {
            return this.f18645b;
        }

        /* renamed from: d */
        public final int m23909d() {
            return this.f18646c;
        }

        /* renamed from: e */
        public final String m23910e() {
            return this.f18648e;
        }

        /* renamed from: f */
        public final void m23911f(String str) {
            this.f18644a = str;
        }

        /* renamed from: g */
        public final void m23912g(Long l10) {
            this.f18647d = l10;
        }

        /* renamed from: h */
        public final void m23913h(int i10) {
            this.f18645b = i10;
        }

        /* renamed from: i */
        public final void m23914i(int i10) {
            this.f18646c = i10;
        }

        /* renamed from: j */
        public final void m23915j(String str) {
            this.f18648e = str;
        }
    }

    /* renamed from: i4.g$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        String mo23904a();

        /* renamed from: b */
        String mo23905b();
    }

    public C7802g(C9109a localBroadcastManager, C7790b accessTokenCache) {
        C9322n.m27781e(localBroadcastManager, "localBroadcastManager");
        C9322n.m27781e(accessTokenCache, "accessTokenCache");
        this.f18635a = localBroadcastManager;
        this.f18636b = accessTokenCache;
        this.f18638d = new AtomicBoolean(false);
        this.f18639e = new Date(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m23883l(C7802g this$0, C7787a.a aVar) {
        C9322n.m27781e(this$0, "this$0");
        this$0.m23884m(aVar);
    }

    /* renamed from: m */
    private final void m23884m(final C7787a.a aVar) {
        final C7787a m23894i = m23894i();
        if (m23894i == null) {
            if (aVar == null) {
                return;
            }
            aVar.m23774a(new C7824r("No current access token to refresh"));
            return;
        }
        if (!this.f18638d.compareAndSet(false, true)) {
            if (aVar == null) {
                return;
            }
            aVar.m23774a(new C7824r("Refresh already in progress"));
            return;
        }
        this.f18639e = new Date();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        final HashSet hashSet3 = new HashSet();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final d dVar = new d();
        a aVar2 = f18633f;
        C7815m0 c7815m0 = new C7815m0(aVar2.m23901d(m23894i, new C7807i0.b() { // from class: i4.d
            @Override // p152i4.C7807i0.b
            /* renamed from: b */
            public final void mo9121b(C7817n0 c7817n0) {
                C7802g.m23885n(atomicBoolean, hashSet, hashSet2, hashSet3, c7817n0);
            }
        }), aVar2.m23900c(m23894i, new C7807i0.b() { // from class: i4.e
            @Override // p152i4.C7807i0.b
            /* renamed from: b */
            public final void mo9121b(C7817n0 c7817n0) {
                C7802g.m23886o(C7802g.d.this, c7817n0);
            }
        }));
        c7815m0.m24043f(new C7815m0.a(m23894i, aVar, atomicBoolean, hashSet, hashSet2, hashSet3, this) { // from class: i4.f

            /* renamed from: b */
            public final /* synthetic */ C7787a f18626b;

            /* renamed from: c */
            public final /* synthetic */ AtomicBoolean f18627c;

            /* renamed from: d */
            public final /* synthetic */ Set f18628d;

            /* renamed from: e */
            public final /* synthetic */ Set f18629e;

            /* renamed from: f */
            public final /* synthetic */ Set f18630f;

            /* renamed from: g */
            public final /* synthetic */ C7802g f18631g;

            {
                this.f18627c = atomicBoolean;
                this.f18628d = hashSet;
                this.f18629e = hashSet2;
                this.f18630f = hashSet3;
                this.f18631g = this;
            }

            @Override // p152i4.C7815m0.a
            /* renamed from: b */
            public final void mo23876b(C7815m0 c7815m02) {
                C7802g.m23887p(C7802g.d.this, this.f18626b, null, this.f18627c, this.f18628d, this.f18629e, this.f18630f, this.f18631g, c7815m02);
            }
        });
        c7815m0.m24046m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m23885n(AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set expiredPermissions, C7817n0 response) {
        JSONArray optJSONArray;
        C9322n.m27781e(permissionsCallSucceeded, "$permissionsCallSucceeded");
        C9322n.m27781e(permissions, "$permissions");
        C9322n.m27781e(declinedPermissions, "$declinedPermissions");
        C9322n.m27781e(expiredPermissions, "$expiredPermissions");
        C9322n.m27781e(response, "response");
        JSONObject m24063d = response.m24063d();
        if (m24063d == null || (optJSONArray = m24063d.optJSONArray("data")) == null) {
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
                if (!C4634n0.m11300d0(optString) && !C4634n0.m11300d0(status)) {
                    C9322n.m27780d(status, "status");
                    Locale US = Locale.US;
                    C9322n.m27780d(US, "US");
                    String status2 = status.toLowerCase(US);
                    C9322n.m27780d(status2, "(this as java.lang.String).toLowerCase(locale)");
                    C9322n.m27780d(status2, "status");
                    int hashCode = status2.hashCode();
                    if (hashCode == -1309235419) {
                        if (status2.equals("expired")) {
                            expiredPermissions.add(optString);
                        }
                        Log.w("AccessTokenManager", C9322n.m27787k("Unexpected status: ", status2));
                    } else if (hashCode != 280295099) {
                        if (hashCode == 568196142 && status2.equals("declined")) {
                            declinedPermissions.add(optString);
                        }
                        Log.w("AccessTokenManager", C9322n.m27787k("Unexpected status: ", status2));
                    } else {
                        if (status2.equals("granted")) {
                            permissions.add(optString);
                        }
                        Log.w("AccessTokenManager", C9322n.m27787k("Unexpected status: ", status2));
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m23886o(d refreshResult, C7817n0 response) {
        C9322n.m27781e(refreshResult, "$refreshResult");
        C9322n.m27781e(response, "response");
        JSONObject m24063d = response.m24063d();
        if (m24063d == null) {
            return;
        }
        refreshResult.m23911f(m24063d.optString("access_token"));
        refreshResult.m23913h(m24063d.optInt("expires_at"));
        refreshResult.m23914i(m24063d.optInt("expires_in"));
        refreshResult.m23912g(Long.valueOf(m24063d.optLong("data_access_expiration_time")));
        refreshResult.m23915j(m24063d.optString("graph_domain", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m23887p(d refreshResult, C7787a c7787a, C7787a.a aVar, AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set set, C7802g this$0, C7815m0 it) {
        C7787a c7787a2;
        C9322n.m27781e(refreshResult, "$refreshResult");
        C9322n.m27781e(permissionsCallSucceeded, "$permissionsCallSucceeded");
        C9322n.m27781e(permissions, "$permissions");
        C9322n.m27781e(declinedPermissions, "$declinedPermissions");
        Set expiredPermissions = set;
        C9322n.m27781e(expiredPermissions, "$expiredPermissions");
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(it, "it");
        String m23906a = refreshResult.m23906a();
        int m23908c = refreshResult.m23908c();
        Long m23907b = refreshResult.m23907b();
        String m23910e = refreshResult.m23910e();
        try {
            a aVar2 = f18633f;
            if (aVar2.m23903e().m23894i() != null) {
                C7787a m23894i = aVar2.m23903e().m23894i();
                if ((m23894i == null ? null : m23894i.m23771n()) == c7787a.m23771n()) {
                    if (!permissionsCallSucceeded.get() && m23906a == null && m23908c == 0) {
                        if (aVar != null) {
                            aVar.m23774a(new C7824r("Failed to refresh access token"));
                        }
                        this$0.f18638d.set(false);
                        return;
                    }
                    Date m23765h = c7787a.m23765h();
                    if (refreshResult.m23908c() != 0) {
                        m23765h = new Date(refreshResult.m23908c() * 1000);
                    } else if (refreshResult.m23909d() != 0) {
                        m23765h = new Date((refreshResult.m23909d() * 1000) + new Date().getTime());
                    }
                    Date date = m23765h;
                    if (m23906a == null) {
                        m23906a = c7787a.m23770m();
                    }
                    String str = m23906a;
                    String m23761c = c7787a.m23761c();
                    String m23771n = c7787a.m23771n();
                    Set m23768k = permissionsCallSucceeded.get() ? permissions : c7787a.m23768k();
                    Set m23763f = permissionsCallSucceeded.get() ? declinedPermissions : c7787a.m23763f();
                    if (!permissionsCallSucceeded.get()) {
                        expiredPermissions = c7787a.m23764g();
                    }
                    Set set2 = expiredPermissions;
                    EnumC7804h m23769l = c7787a.m23769l();
                    Date date2 = new Date();
                    Date date3 = m23907b != null ? new Date(m23907b.longValue() * 1000) : c7787a.m23762e();
                    if (m23910e == null) {
                        m23910e = c7787a.m23766i();
                    }
                    C7787a c7787a3 = new C7787a(str, m23761c, m23771n, m23768k, m23763f, set2, m23769l, date, date2, date3, m23910e);
                    try {
                        aVar2.m23903e().m23897r(c7787a3);
                        this$0.f18638d.set(false);
                        if (aVar != null) {
                            aVar.m23775b(c7787a3);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        c7787a2 = c7787a3;
                        this$0.f18638d.set(false);
                        if (aVar != null && c7787a2 != null) {
                            aVar.m23775b(c7787a2);
                        }
                        throw th;
                    }
                }
            }
            if (aVar != null) {
                aVar.m23774a(new C7824r("No current access token to refresh"));
            }
            this$0.f18638d.set(false);
        } catch (Throwable th3) {
            th = th3;
            c7787a2 = null;
        }
    }

    /* renamed from: q */
    private final void m23888q(C7787a c7787a, C7787a c7787a2) {
        Intent intent = new Intent(C7799e0.m23860l(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", c7787a);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", c7787a2);
        this.f18635a.m26828d(intent);
    }

    /* renamed from: s */
    private final void m23889s(C7787a c7787a, boolean z10) {
        C7787a c7787a2 = this.f18637c;
        this.f18637c = c7787a;
        this.f18638d.set(false);
        this.f18639e = new Date(0L);
        if (z10) {
            C7790b c7790b = this.f18636b;
            if (c7787a != null) {
                c7790b.m23798g(c7787a);
            } else {
                c7790b.m23796a();
                C4634n0 c4634n0 = C4634n0.f8760a;
                C4634n0.m11309i(C7799e0.m23860l());
            }
        }
        if (C4634n0.m11301e(c7787a2, c7787a)) {
            return;
        }
        m23888q(c7787a2, c7787a);
        m23890t();
    }

    /* renamed from: t */
    private final void m23890t() {
        Context m23860l = C7799e0.m23860l();
        C7787a.c cVar = C7787a.f18552w;
        C7787a m23782e = cVar.m23782e();
        AlarmManager alarmManager = (AlarmManager) m23860l.getSystemService("alarm");
        if (cVar.m23784g()) {
            if ((m23782e == null ? null : m23782e.m23765h()) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(m23860l, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, m23782e.m23765h().getTime(), PendingIntent.getBroadcast(m23860l, 0, intent, 67108864));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: u */
    private final boolean m23891u() {
        C7787a m23894i = m23894i();
        if (m23894i == null) {
            return false;
        }
        long time = new Date().getTime();
        return m23894i.m23769l().m23918h() && time - this.f18639e.getTime() > 3600000 && time - m23894i.m23767j().getTime() > 86400000;
    }

    /* renamed from: g */
    public final void m23892g() {
        m23888q(m23894i(), m23894i());
    }

    /* renamed from: h */
    public final void m23893h() {
        if (m23891u()) {
            m23896k(null);
        }
    }

    /* renamed from: i */
    public final C7787a m23894i() {
        return this.f18637c;
    }

    /* renamed from: j */
    public final boolean m23895j() {
        C7787a m23797f = this.f18636b.m23797f();
        if (m23797f == null) {
            return false;
        }
        m23889s(m23797f, false);
        return true;
    }

    /* renamed from: k */
    public final void m23896k(final C7787a.a aVar) {
        if (C9322n.m27777a(Looper.getMainLooper(), Looper.myLooper())) {
            m23884m(aVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable(aVar) { // from class: i4.c
                @Override // java.lang.Runnable
                public final void run() {
                    C7802g.m23883l(C7802g.this, null);
                }
            });
        }
    }

    /* renamed from: r */
    public final void m23897r(C7787a c7787a) {
        m23889s(c7787a, true);
    }
}
