package i4;

import android.content.SharedPreferences;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17034b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f17035a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j() {
        /*
            r3 = this;
            android.content.Context r0 = i4.e0.l()
            java.lang.String r1 = "com.facebook.AuthenticationTokenManager.SharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AuthenticationTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)"
            kotlin.jvm.internal.n.d(r0, r1)
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.j.<init>():void");
    }

    public j(SharedPreferences sharedPreferences) {
        kotlin.jvm.internal.n.e(sharedPreferences, "sharedPreferences");
        this.f17035a = sharedPreferences;
    }

    public final void a() {
        this.f17035a.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
    }

    public final void b(i authenticationToken) {
        kotlin.jvm.internal.n.e(authenticationToken, "authenticationToken");
        try {
            this.f17035a.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", authenticationToken.b().toString()).apply();
        } catch (JSONException unused) {
        }
    }
}
