package i4;

import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17103b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f17104a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public t0() {
        SharedPreferences sharedPreferences = e0.l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        kotlin.jvm.internal.n.d(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.f17104a = sharedPreferences;
    }

    public final void a() {
        this.f17104a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    public final s0 b() {
        String string = this.f17104a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new s0(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(s0 profile) {
        kotlin.jvm.internal.n.e(profile, "profile");
        JSONObject b10 = profile.b();
        if (b10 != null) {
            this.f17104a.edit().putString("com.facebook.ProfileManager.CachedProfile", b10.toString()).apply();
        }
    }
}
