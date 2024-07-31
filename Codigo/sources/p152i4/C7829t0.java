package p152i4;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: i4.t0 */
/* loaded from: classes.dex */
public final class C7829t0 {

    /* renamed from: b */
    public static final a f18762b = new a(null);

    /* renamed from: a */
    private final SharedPreferences f18763a;

    /* renamed from: i4.t0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C7829t0() {
        SharedPreferences sharedPreferences = C7799e0.m23860l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        C9322n.m27780d(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.f18763a = sharedPreferences;
    }

    /* renamed from: a */
    public final void m24095a() {
        this.f18763a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    /* renamed from: b */
    public final C7827s0 m24096b() {
        String string = this.f18763a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new C7827s0(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void m24097c(C7827s0 profile) {
        C9322n.m27781e(profile, "profile");
        JSONObject m24089b = profile.m24089b();
        if (m24089b != null) {
            this.f18763a.edit().putString("com.facebook.ProfileManager.CachedProfile", m24089b.toString()).apply();
        }
    }
}
