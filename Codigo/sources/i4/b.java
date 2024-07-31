package i4;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final a f16921d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f16922a;

    /* renamed from: b, reason: collision with root package name */
    private final C0283b f16923b;

    /* renamed from: c, reason: collision with root package name */
    private p0 f16924c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* renamed from: i4.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0283b {
        public final p0 a() {
            return new p0(e0.l(), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b() {
        /*
            r3 = this;
            android.content.Context r0 = i4.e0.l()
            java.lang.String r1 = "com.facebook.AccessTokenManager.SharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)"
            kotlin.jvm.internal.n.d(r0, r1)
            i4.b$b r1 = new i4.b$b
            r1.<init>()
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.b.<init>():void");
    }

    public b(SharedPreferences sharedPreferences, C0283b tokenCachingStrategyFactory) {
        kotlin.jvm.internal.n.e(sharedPreferences, "sharedPreferences");
        kotlin.jvm.internal.n.e(tokenCachingStrategyFactory, "tokenCachingStrategyFactory");
        this.f16922a = sharedPreferences;
        this.f16923b = tokenCachingStrategyFactory;
    }

    private final i4.a b() {
        String string = this.f16922a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return i4.a.f16899w.b(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final i4.a c() {
        Bundle c10 = d().c();
        if (c10 == null || !p0.f17086c.g(c10)) {
            return null;
        }
        return i4.a.f16899w.c(c10);
    }

    private final p0 d() {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            if (this.f16924c == null) {
                synchronized (this) {
                    if (this.f16924c == null) {
                        this.f16924c = this.f16923b.a();
                    }
                    ck.v vVar = ck.v.f7137a;
                }
            }
            p0 p0Var = this.f16924c;
            if (p0Var != null) {
                return p0Var;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    private final boolean e() {
        return this.f16922a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    private final boolean h() {
        return e0.G();
    }

    public final void a() {
        this.f16922a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (h()) {
            d().a();
        }
    }

    public final i4.a f() {
        if (e()) {
            return b();
        }
        if (!h()) {
            return null;
        }
        i4.a c10 = c();
        if (c10 == null) {
            return c10;
        }
        g(c10);
        d().a();
        return c10;
    }

    public final void g(i4.a accessToken) {
        kotlin.jvm.internal.n.e(accessToken, "accessToken");
        try {
            this.f16922a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.p().toString()).apply();
        } catch (JSONException unused) {
        }
    }
}
