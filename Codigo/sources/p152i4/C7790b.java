package p152i4;

import android.content.SharedPreferences;
import android.os.Bundle;
import ck.C2037v;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;
import p007a5.C0033a;

/* renamed from: i4.b */
/* loaded from: classes.dex */
public final class C7790b {

    /* renamed from: d */
    public static final a f18574d = new a(null);

    /* renamed from: a */
    private final SharedPreferences f18575a;

    /* renamed from: b */
    private final b f18576b;

    /* renamed from: c */
    private C7821p0 f18577c;

    /* renamed from: i4.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: i4.b$b */
    /* loaded from: classes.dex */
    public static final class b {
        /* renamed from: a */
        public final C7821p0 m23799a() {
            return new C7821p0(C7799e0.m23860l(), null, 2, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7790b() {
        /*
            r3 = this;
            android.content.Context r0 = p152i4.C7799e0.m23860l()
            java.lang.String r1 = "com.facebook.AccessTokenManager.SharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)"
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            i4.b$b r1 = new i4.b$b
            r1.<init>()
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p152i4.C7790b.<init>():void");
    }

    public C7790b(SharedPreferences sharedPreferences, b tokenCachingStrategyFactory) {
        C9322n.m27781e(sharedPreferences, "sharedPreferences");
        C9322n.m27781e(tokenCachingStrategyFactory, "tokenCachingStrategyFactory");
        this.f18575a = sharedPreferences;
        this.f18576b = tokenCachingStrategyFactory;
    }

    /* renamed from: b */
    private final C7787a m23791b() {
        String string = this.f18575a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return C7787a.f18552w.m23779b(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private final C7787a m23792c() {
        Bundle m24074c = m23793d().m24074c();
        if (m24074c == null || !C7821p0.f18745c.m24081g(m24074c)) {
            return null;
        }
        return C7787a.f18552w.m23780c(m24074c);
    }

    /* renamed from: d */
    private final C7821p0 m23793d() {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            if (this.f18577c == null) {
                synchronized (this) {
                    if (this.f18577c == null) {
                        this.f18577c = this.f18576b.m23799a();
                    }
                    C2037v c2037v = C2037v.f8089a;
                }
            }
            C7821p0 c7821p0 = this.f18577c;
            if (c7821p0 != null) {
                return c7821p0;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: e */
    private final boolean m23794e() {
        return this.f18575a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    /* renamed from: h */
    private final boolean m23795h() {
        return C7799e0.m23834G();
    }

    /* renamed from: a */
    public final void m23796a() {
        this.f18575a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m23795h()) {
            m23793d().m24073a();
        }
    }

    /* renamed from: f */
    public final C7787a m23797f() {
        if (m23794e()) {
            return m23791b();
        }
        if (!m23795h()) {
            return null;
        }
        C7787a m23792c = m23792c();
        if (m23792c == null) {
            return m23792c;
        }
        m23798g(m23792c);
        m23793d().m24073a();
        return m23792c;
    }

    /* renamed from: g */
    public final void m23798g(C7787a accessToken) {
        C9322n.m27781e(accessToken, "accessToken");
        try {
            this.f18575a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.m23773p().toString()).apply();
        } catch (JSONException unused) {
        }
    }
}
